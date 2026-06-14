package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhel extends zzhch {
    private final String zza;
    private final zzhek zzb;

    private zzhel(String str, zzhek zzhekVar) {
        this.zza = str;
        this.zzb = zzhekVar;
    }

    public static zzhel zzb(String str, zzhek zzhekVar) {
        return new zzhel(str, zzhekVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhel)) {
            return false;
        }
        zzhel zzhelVar = (zzhel) obj;
        return zzhelVar.zza.equals(this.zza) && zzhelVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(zzhel.class, this.zza, this.zzb);
    }

    public final String toString() {
        String string = this.zzb.toString();
        String str = this.zza;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 45 + string.length() + 1);
        sb2.append("LegacyKmsAead Parameters (keyUri: ");
        sb2.append(str);
        sb2.append(", variant: ");
        sb2.append(string);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final boolean zza() {
        return this.zzb != zzhek.zzb;
    }

    public final String zzc() {
        return this.zza;
    }

    public final zzhek zzd() {
        return this.zzb;
    }
}
