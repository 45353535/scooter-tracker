package io.bidmachine.ads.networks.gam;

import android.os.Build;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.bidmachine.ads.networks.gam.versions.VersionWrapper;
import io.bidmachine.ads.networks.gam.versions.v21_0_0.VersionWrapperImpl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class VersionManager {

    @NonNull
    @VisibleForTesting
    static final List<Pair<ge.b, VersionWrapper>> VERSION_WRAPPER_LIST = new ArrayList();

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VersionWrapperImpl());
        arrayList.add(new io.bidmachine.ads.networks.gam.versions.v22_0_0.VersionWrapperImpl());
        arrayList.add(new io.bidmachine.ads.networks.gam.versions.v23_0_0.VersionWrapperImpl());
        Collections.sort(arrayList, new Comparator() { // from class: io.bidmachine.ads.networks.gam.s
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((VersionWrapper) obj).getVersionForWhichCompiled().compareTo(((VersionWrapper) obj2).getVersionForWhichCompiled());
            }
        });
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            VersionWrapper versionWrapper = (VersionWrapper) arrayList.get(i10);
            ge.a versionForWhichCompiled = null;
            VersionWrapper versionWrapper2 = i10 < size + (-1) ? (VersionWrapper) arrayList.get(i10 + 1) : null;
            ge.a versionForWhichCompiled2 = versionWrapper.getVersionForWhichCompiled();
            if (versionWrapper2 != null) {
                versionForWhichCompiled = versionWrapper2.getVersionForWhichCompiled();
            }
            VERSION_WRAPPER_LIST.add(new Pair<>(new ge.b(versionForWhichCompiled2, versionForWhichCompiled, true, false), versionWrapper));
            i10++;
        }
    }

    @Nullable
    @VisibleForTesting
    static ge.a findVersion() {
        ge.a aVarSafeGetVersion;
        Iterator<Pair<ge.b, VersionWrapper>> it = VERSION_WRAPPER_LIST.iterator();
        while (it.hasNext()) {
            VersionWrapper versionWrapper = (VersionWrapper) it.next().second;
            if (Build.VERSION.SDK_INT >= versionWrapper.getMinDeviceApiVersion() && (aVarSafeGetVersion = safeGetVersion(versionWrapper)) != null) {
                return aVarSafeGetVersion;
            }
        }
        return null;
    }

    @Nullable
    public static VersionWrapper findVersionWrapper(@NonNull String str) {
        ge.a aVarFindVersion;
        ge.b bVarD = ge.b.d(str);
        if (bVarD == null || (aVarFindVersion = findVersion()) == null || !bVarD.a(aVarFindVersion)) {
            return null;
        }
        for (Pair<ge.b, VersionWrapper> pair : VERSION_WRAPPER_LIST) {
            if (((ge.b) pair.first).a(aVarFindVersion)) {
                return (VersionWrapper) pair.second;
            }
        }
        return null;
    }

    @Nullable
    @VisibleForTesting
    static ge.a safeGetVersion(@NonNull VersionWrapper versionWrapper) {
        try {
            return versionWrapper.getVersion();
        } catch (Throwable unused) {
            return null;
        }
    }
}
