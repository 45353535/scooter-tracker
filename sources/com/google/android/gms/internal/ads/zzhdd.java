package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhdd extends zzhch {
    private final int zza;
    private final int zzb;
    private final int zzc = 16;
    private final zzhdc zzd;

    /* synthetic */ zzhdd(int i10, int i11, int i12, zzhdc zzhdcVar, byte[] bArr) {
        this.zza = i10;
        this.zzb = i11;
        this.zzd = zzhdcVar;
    }

    public static zzhdb zzb() {
        return new zzhdb(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhdd)) {
            return false;
        }
        zzhdd zzhddVar = (zzhdd) obj;
        return zzhddVar.zza == this.zza && zzhddVar.zzb == this.zzb && zzhddVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzhdd.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), 16, this.zzd);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzd);
        int length = strValueOf.length();
        int i10 = this.zzb;
        int length2 = String.valueOf(i10).length();
        int length3 = String.valueOf(16).length();
        int i11 = this.zza;
        StringBuilder sb2 = new StringBuilder(length + 30 + length2 + 10 + length3 + 15 + String.valueOf(i11).length() + 10);
        sb2.append("AesEax Parameters (variant: ");
        sb2.append(strValueOf);
        sb2.append(", ");
        sb2.append(i10);
        sb2.append("-byte IV, ");
        sb2.append(16);
        sb2.append("-byte tag, and ");
        sb2.append(i11);
        sb2.append("-byte key)");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final boolean zza() {
        return this.zzd != zzhdc.zzc;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final zzhdc zze() {
        return this.zzd;
    }
}
