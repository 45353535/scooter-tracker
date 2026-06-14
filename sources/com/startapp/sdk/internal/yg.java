package com.startapp.sdk.internal;

import android.content.pm.PackageInfo;
import java.util.Comparator;

/* JADX INFO: loaded from: classes11.dex */
public final class yg implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        long j10 = ((PackageInfo) obj).firstInstallTime;
        long j11 = ((PackageInfo) obj2).firstInstallTime;
        if (j10 > j11) {
            return -1;
        }
        return j10 == j11 ? 0 : 1;
    }
}
