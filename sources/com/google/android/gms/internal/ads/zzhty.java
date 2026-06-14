package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhty extends zzhuu {
    public static final BigInteger zza = BigInteger.valueOf(65537);
    private final int zzb;
    private final BigInteger zzc;
    private final zzhtx zzd;
    private final zzhtw zze;

    /* synthetic */ zzhty(int i10, BigInteger bigInteger, zzhtx zzhtxVar, zzhtw zzhtwVar, byte[] bArr) {
        this.zzb = i10;
        this.zzc = bigInteger;
        this.zzd = zzhtxVar;
        this.zze = zzhtwVar;
    }

    public static zzhtv zzb() {
        return new zzhtv(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhty)) {
            return false;
        }
        zzhty zzhtyVar = (zzhty) obj;
        return zzhtyVar.zzb == this.zzb && Objects.equals(zzhtyVar.zzc, this.zzc) && zzhtyVar.zzd == this.zzd && zzhtyVar.zze == this.zze;
    }

    public final int hashCode() {
        return Objects.hash(zzhty.class, Integer.valueOf(this.zzb), this.zzc, this.zzd, this.zze);
    }

    public final String toString() {
        BigInteger bigInteger = this.zzc;
        zzhtw zzhtwVar = this.zze;
        String strValueOf = String.valueOf(this.zzd);
        String strValueOf2 = String.valueOf(zzhtwVar);
        String strValueOf3 = String.valueOf(bigInteger);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int length3 = strValueOf3.length();
        int i10 = this.zzb;
        StringBuilder sb2 = new StringBuilder(length + 47 + length2 + 18 + length3 + 6 + String.valueOf(i10).length() + 13);
        sb2.append("RSA SSA PKCS1 Parameters (variant: ");
        sb2.append(strValueOf);
        sb2.append(", hashType: ");
        sb2.append(strValueOf2);
        sb2.append(", publicExponent: ");
        sb2.append(strValueOf3);
        sb2.append(", and ");
        sb2.append(i10);
        sb2.append("-bit modulus)");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final boolean zza() {
        return this.zzd != zzhtx.zzd;
    }

    public final int zzc() {
        return this.zzb;
    }

    public final BigInteger zzd() {
        return this.zzc;
    }

    public final zzhtx zze() {
        return this.zzd;
    }

    public final zzhtw zzf() {
        return this.zze;
    }
}
