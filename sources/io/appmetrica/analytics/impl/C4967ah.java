package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageInfo;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.ArrayList;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ah, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C4967ah extends Wg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SafePackageManager f76844b;

    public C4967ah(C5058e5 c5058e5) {
        this(c5058e5, new SafePackageManager());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004d A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:15:0x0043, B:17:0x004d, B:18:0x005d, B:19:0x0066, B:21:0x006c, B:23:0x008f, B:24:0x0094, B:25:0x0098), top: B:29:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:15:0x0043, B:17:0x004d, B:18:0x005d, B:19:0x0066, B:21:0x006c, B:23:0x008f, B:24:0x0094, B:25:0x0098), top: B:29:0x0043 }] */
    @Override // io.appmetrica.analytics.impl.Wg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(@androidx.annotation.NonNull io.appmetrica.analytics.impl.W5 r10) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C4967ah.a(io.appmetrica.analytics.impl.W5):boolean");
    }

    public final ArrayList b() {
        FeatureInfo[] featureInfoArr;
        try {
            C5058e5 c5058e5 = this.f76636a;
            SafePackageManager safePackageManager = this.f76844b;
            Context context = c5058e5.f77062a;
            PackageInfo packageInfo = safePackageManager.getPackageInfo(context, context.getPackageName(), 16384);
            ArrayList arrayList = new ArrayList();
            X9 v92 = AndroidUtils.isApiAchieved(24) ? new V9() : new W9();
            if (packageInfo != null && (featureInfoArr = packageInfo.reqFeatures) != null) {
                for (FeatureInfo featureInfo : featureInfoArr) {
                    arrayList.add(v92.a(featureInfo));
                }
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    @VisibleForTesting
    public C4967ah(C5058e5 c5058e5, @NonNull SafePackageManager safePackageManager) {
        super(c5058e5);
        this.f76844b = safePackageManager;
    }
}
