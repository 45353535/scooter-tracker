package com.google.android.gms.internal.consent_sdk;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes8.dex */
final class zzsu extends zzsv {
    zzsu(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsv
    public final double zza(Object obj, long j10) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsv
    public final float zzb(Object obj, long j10) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j10));
    }

    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.consent_sdk.zzsw.zzi(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.consent_sdk.zzsw.zzj(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to replace arg (r3v0 'z' boolean A[IMMUTABLE_TYPE, METHOD_ARGUMENT]) for method inline: com.google.android.gms.internal.consent_sdk.zzsw.zzi(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 boolean)' in method call: com.google.android.gms.internal.consent_sdk.zzsw.zzj(java.lang.Object, long, boolean):void */
    @Override // com.google.android.gms.internal.consent_sdk.zzsv
    public final void zzc(Object obj, long j10, boolean z10) {
        if (zzsw.zzb) {
            zzsw.zzi(obj, j10, z10);
        } else {
            zzsw.zzj(obj, j10, z10);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsv
    public final void zzd(Object obj, long j10, byte b10) {
        if (zzsw.zzb) {
            zzsw.zzD(obj, j10, b10);
        } else {
            zzsw.zzE(obj, j10, b10);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsv
    public final void zze(Object obj, long j10, double d10) {
        this.zza.putLong(obj, j10, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsv
    public final void zzf(Object obj, long j10, float f10) {
        this.zza.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsv
    public final boolean zzg(Object obj, long j10) {
        return zzsw.zzb ? zzsw.zzt(obj, j10) : zzsw.zzu(obj, j10);
    }
}
