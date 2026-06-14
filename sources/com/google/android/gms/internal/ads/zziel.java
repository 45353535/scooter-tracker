package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes8.dex */
abstract class zziel {
    final Unsafe zza;

    zziel(Unsafe unsafe) {
        this.zza = unsafe;
    }

    public abstract void zza(Object obj, long j10, byte b10);

    public abstract boolean zzb(Object obj, long j10);

    public abstract void zzc(Object obj, long j10, boolean z10);

    public abstract float zzd(Object obj, long j10);

    public abstract void zze(Object obj, long j10, float f10);

    public abstract double zzf(Object obj, long j10);

    public abstract void zzg(Object obj, long j10, double d10);

    public abstract byte zzh(long j10);
}
