package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes8.dex */
final class zzig extends zzih {
    zzig(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.play_billing.zzih
    public final double zza(Object obj, long j10) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.play_billing.zzih
    public final float zzb(Object obj, long j10) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j10));
    }

    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.play_billing.zzii.zzi(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.play_billing.zzii.zzj(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 boolean)' in method call: com.google.android.gms.internal.play_billing.zzii.zzi(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 boolean)' in method call: com.google.android.gms.internal.play_billing.zzii.zzj(java.lang.Object, long, boolean):void */
    @Override // com.google.android.gms.internal.play_billing.zzih
    public final void zzc(Object obj, long j10, boolean z10) {
        if (zzii.zzb) {
            zzii.zzi(obj, j10, z10);
        } else {
            zzii.zzj(obj, j10, z10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzih
    public final void zzd(Object obj, long j10, byte b10) {
        if (zzii.zzb) {
            zzii.zzD(obj, j10, b10);
        } else {
            zzii.zzE(obj, j10, b10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzih
    public final void zze(Object obj, long j10, double d10) {
        this.zza.putLong(obj, j10, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.play_billing.zzih
    public final void zzf(Object obj, long j10, float f10) {
        this.zza.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.play_billing.zzih
    public final boolean zzg(Object obj, long j10) {
        return zzii.zzb ? zzii.zzt(obj, j10) : zzii.zzu(obj, j10);
    }
}
