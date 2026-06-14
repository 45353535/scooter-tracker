package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
final class zzgty {
    static int zza(int i10) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i10) * (-862048943)), 15)) * 461845907);
    }

    static int zzb(Object obj) {
        return zza(obj == null ? 0 : obj.hashCode());
    }
}
