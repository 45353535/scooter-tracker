package com.google.android.gms.ads.internal.overlay;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
final class zzq implements Callable {
    private final long zza;

    zzq(long j10) {
        this.zza = j10;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (AdOverlayInfoParcel.zzz.remove(Long.valueOf(this.zza)) == null) {
            return null;
        }
        com.google.android.gms.ads.internal.zzt.zzh().zzg(new Exception("Key was non-null in AdOverlayObjectsCleanupTask"), "AdOverlayObjectsCleanupTask");
        return null;
    }
}
