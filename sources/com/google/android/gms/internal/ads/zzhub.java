package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhub {
    private zzhty zza = null;
    private BigInteger zzb = null;
    private Integer zzc = null;

    private zzhub() {
    }

    public final zzhub zza(zzhty zzhtyVar) {
        this.zza = zzhtyVar;
        return this;
    }

    public final zzhub zzb(BigInteger bigInteger) {
        this.zzb = bigInteger;
        return this;
    }

    public final zzhub zzc(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzhuc zzd() throws GeneralSecurityException {
        zzhye zzhyeVarZza;
        if (this.zza == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        BigInteger bigInteger = this.zzb;
        if (bigInteger == null) {
            throw new GeneralSecurityException("Cannot build without modulus");
        }
        int iBitLength = bigInteger.bitLength();
        int iZzc = this.zza.zzc();
        if (iBitLength != iZzc) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(iBitLength).length() + 56 + String.valueOf(iZzc).length());
            sb2.append("Got modulus size ");
            sb2.append(iBitLength);
            sb2.append(", but parameters requires modulus size ");
            sb2.append(iZzc);
            throw new GeneralSecurityException(sb2.toString());
        }
        if (this.zza.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zze() == zzhtx.zzd) {
            zzhyeVarZza = zzhkh.zza;
        } else if (this.zza.zze() == zzhtx.zzc || this.zza.zze() == zzhtx.zzb) {
            zzhyeVarZza = zzhkh.zza(this.zzc.intValue());
        } else {
            if (this.zza.zze() != zzhtx.zza) {
                throw new IllegalStateException("Unknown RsaSsaPkcs1Parameters.Variant: ".concat(String.valueOf(this.zza.zze())));
            }
            zzhyeVarZza = zzhkh.zzb(this.zzc.intValue());
        }
        return new zzhuc(this.zza, this.zzb, zzhyeVarZza, this.zzc, null);
    }

    /* synthetic */ zzhub(byte[] bArr) {
    }
}
