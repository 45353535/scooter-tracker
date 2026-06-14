package io.bidmachine.ads.networks.gam_dynamic;

import android.os.Build;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.bidmachine.ads.networks.gam_dynamic.versions.VersionWrapper;
import io.bidmachine.ads.networks.gam_dynamic.versions.v21_0_0.VersionWrapperImpl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
class VersionManager {
    VersionManager() {
    }

    @Nullable
    @VisibleForTesting
    static ge.a findVersion(@NonNull List<Pair<ge.b, VersionWrapper>> list) {
        ge.a aVarSafeGetVersion;
        Iterator<Pair<ge.b, VersionWrapper>> it = list.iterator();
        while (it.hasNext()) {
            VersionWrapper versionWrapper = (VersionWrapper) it.next().second;
            if (Build.VERSION.SDK_INT >= versionWrapper.getMinDeviceApiVersion() && (aVarSafeGetVersion = safeGetVersion(versionWrapper)) != null) {
                return aVarSafeGetVersion;
            }
        }
        return null;
    }

    @Nullable
    static VersionWrapper findVersionWrapper(@NonNull String str) {
        List<Pair<ge.b, VersionWrapper>> listInitializeVersionWrapperList;
        ge.a aVarFindVersion;
        ge.b bVarD = ge.b.d(str);
        if (bVarD == null || (aVarFindVersion = findVersion((listInitializeVersionWrapperList = initializeVersionWrapperList()))) == null || !bVarD.a(aVarFindVersion)) {
            return null;
        }
        for (Pair<ge.b, VersionWrapper> pair : listInitializeVersionWrapperList) {
            if (((ge.b) pair.first).a(aVarFindVersion)) {
                return (VersionWrapper) pair.second;
            }
        }
        return null;
    }

    @NonNull
    @VisibleForTesting
    static List<Pair<ge.b, VersionWrapper>> initializeVersionWrapperList() {
        ArrayList arrayList = new ArrayList();
        ArrayList<VersionWrapper> arrayList2 = new ArrayList<VersionWrapper>() { // from class: io.bidmachine.ads.networks.gam_dynamic.VersionManager.1
            {
                add(new VersionWrapperImpl());
                add(new io.bidmachine.ads.networks.gam_dynamic.versions.v22_0_0.VersionWrapperImpl());
                add(new io.bidmachine.ads.networks.gam_dynamic.versions.v23_0_0.VersionWrapperImpl());
            }
        };
        Collections.sort(arrayList2, new Comparator() { // from class: io.bidmachine.ads.networks.gam_dynamic.t
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((VersionWrapper) obj).getVersionForWhichCompiled().compareTo(((VersionWrapper) obj2).getVersionForWhichCompiled());
            }
        });
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            VersionWrapper versionWrapper = arrayList2.get(i10);
            ge.a versionForWhichCompiled = null;
            VersionWrapper versionWrapper2 = i10 < size + (-1) ? arrayList2.get(i10 + 1) : null;
            ge.a versionForWhichCompiled2 = versionWrapper.getVersionForWhichCompiled();
            if (versionWrapper2 != null) {
                versionForWhichCompiled = versionWrapper2.getVersionForWhichCompiled();
            }
            arrayList.add(new Pair(new ge.b(versionForWhichCompiled2, versionForWhichCompiled, true, false), versionWrapper));
            i10++;
        }
        return arrayList;
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
