package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhcv extends zzhch {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final zzhcu zze;
    private final zzhct zzf;

    /* synthetic */ zzhcv(int i10, int i11, int i12, int i13, zzhcu zzhcuVar, zzhct zzhctVar, byte[] bArr) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = i13;
        this.zze = zzhcuVar;
        this.zzf = zzhctVar;
    }

    public static zzhcs zzb() {
        return new zzhcs(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhcv)) {
            return false;
        }
        zzhcv zzhcvVar = (zzhcv) obj;
        return zzhcvVar.zza == this.zza && zzhcvVar.zzb == this.zzb && zzhcvVar.zzc == this.zzc && zzhcvVar.zzd == this.zzd && zzhcvVar.zze == this.zze && zzhcvVar.zzf == this.zzf;
    }

    public final int hashCode() {
        return Objects.hash(zzhcv.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd), this.zze, this.zzf);
    }

    public final String toString() {
        zzhct zzhctVar = this.zzf;
        String strValueOf = String.valueOf(this.zze);
        String strValueOf2 = String.valueOf(zzhctVar);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int i10 = this.zzc;
        int length3 = String.valueOf(i10).length();
        int i11 = this.zzd;
        int length4 = String.valueOf(i11).length();
        int i12 = this.zza;
        int length5 = String.valueOf(i12).length();
        int i13 = this.zzb;
        StringBuilder sb2 = new StringBuilder(length + 48 + length2 + 2 + length3 + 14 + length4 + 16 + length5 + 19 + String.valueOf(i13).length() + 15);
        sb2.append("AesCtrHmacAead Parameters (variant: ");
        sb2.append(strValueOf);
        sb2.append(", hashType: ");
        sb2.append(strValueOf2);
        sb2.append(", ");
        sb2.append(i10);
        sb2.append("-byte IV, and ");
        sb2.append(i11);
        sb2.append("-byte tags, and ");
        sb2.append(i12);
        sb2.append("-byte AES key, and ");
        sb2.append(i13);
        sb2.append("-byte HMAC key)");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final boolean zza() {
        return this.zze != zzhcu.zzc;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final int zze() {
        return this.zzd;
    }

    public final int zzf() {
        return this.zzc;
    }

    public final zzhcu zzg() {
        return this.zze;
    }

    public final zzhct zzh() {
        return this.zzf;
    }
}
