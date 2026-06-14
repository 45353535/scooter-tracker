package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes8.dex */
final class zzon extends zzoo {
    zzon(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.measurement.zzoo
    public final void zza(Object obj, long j10, byte b10) {
        if (zzop.zzb) {
            zzop.zzD(obj, j10, b10);
        } else {
            zzop.zzE(obj, j10, b10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoo
    public final boolean zzb(Object obj, long j10) {
        return zzop.zzb ? zzop.zzu(obj, j10) : zzop.zzv(obj, j10);
    }

    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.measurement.zzop.zzw(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.measurement.zzop.zzx(java.lang.Object, long, boolean):void */
    /* JADX WARN: Method inline failed with exception
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList.removeIf(Unknown Source)
     */
    /* JADX WARN: Unknown register number '(r5v0 'z' boolean)' in method call: com.google.android.gms.internal.measurement.zzop.zzx(java.lang.Object, long, boolean):void */
    @Override // com.google.android.gms.internal.measurement.zzoo
    public final void zzc(Object obj, long j10, boolean z10) {
        if (zzop.zzb) {
            zzop.zzw(obj, j10, z10);
        } else {
            zzop.zzx(obj, j10, z10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoo
    public final float zzd(Object obj, long j10) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j10));
    }

    @Override // com.google.android.gms.internal.measurement.zzoo
    public final void zze(Object obj, long j10, float f10) {
        this.zza.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.measurement.zzoo
    public final double zzf(Object obj, long j10) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.measurement.zzoo
    public final void zzg(Object obj, long j10, double d10) {
        this.zza.putLong(obj, j10, Double.doubleToLongBits(d10));
    }
}
