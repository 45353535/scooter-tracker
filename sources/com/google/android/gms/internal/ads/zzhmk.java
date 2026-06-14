package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhmk extends zzhmn {
    private final int zza;
    private final int zzb;
    private final zzhmj zzc;
    private final zzhmi zzd;

    /* synthetic */ zzhmk(int i10, int i11, zzhmj zzhmjVar, zzhmi zzhmiVar, byte[] bArr) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = zzhmjVar;
        this.zzd = zzhmiVar;
    }

    public static zzhmh zzb() {
        return new zzhmh(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhmk)) {
            return false;
        }
        zzhmk zzhmkVar = (zzhmk) obj;
        return zzhmkVar.zza == this.zza && zzhmkVar.zze() == zze() && zzhmkVar.zzc == this.zzc && zzhmkVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzhmk.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final String toString() {
        zzhmi zzhmiVar = this.zzd;
        String strValueOf = String.valueOf(this.zzc);
        String strValueOf2 = String.valueOf(zzhmiVar);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int i10 = this.zzb;
        int length3 = String.valueOf(i10).length();
        int i11 = this.zza;
        StringBuilder sb2 = new StringBuilder(length + 38 + length2 + 2 + length3 + 16 + String.valueOf(i11).length() + 10);
        sb2.append("HMAC Parameters (variant: ");
        sb2.append(strValueOf);
        sb2.append(", hashType: ");
        sb2.append(strValueOf2);
        sb2.append(", ");
        sb2.append(i10);
        sb2.append("-byte tags, and ");
        sb2.append(i11);
        sb2.append("-byte key)");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final boolean zza() {
        return this.zzc != zzhmj.zzd;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final int zze() {
        zzhmj zzhmjVar = this.zzc;
        if (zzhmjVar == zzhmj.zzd) {
            return this.zzb;
        }
        if (zzhmjVar == zzhmj.zza || zzhmjVar == zzhmj.zzb || zzhmjVar == zzhmj.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzhmj zzf() {
        return this.zzc;
    }

    public final zzhmi zzg() {
        return this.zzd;
    }
}
