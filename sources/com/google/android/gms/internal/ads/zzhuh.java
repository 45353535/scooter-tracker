package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhuh {
    private static final BigInteger zzg;
    private static final BigInteger zzh;
    private Integer zza = null;
    private BigInteger zzb = zzhuk.zza;
    private zzhui zzc = null;
    private zzhui zzd = null;
    private Integer zze = null;
    private zzhuj zzf = zzhuj.zzd;

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        zzg = bigIntegerValueOf;
        zzh = bigIntegerValueOf.pow(256);
    }

    private zzhuh() {
    }

    public final zzhuh zza(int i10) {
        this.zza = Integer.valueOf(i10);
        return this;
    }

    public final zzhuh zzb(BigInteger bigInteger) {
        this.zzb = bigInteger;
        return this;
    }

    public final zzhuh zzc(zzhuj zzhujVar) {
        this.zzf = zzhujVar;
        return this;
    }

    public final zzhuh zzd(zzhui zzhuiVar) {
        this.zzc = zzhuiVar;
        return this;
    }

    public final zzhuh zze(zzhui zzhuiVar) {
        this.zzd = zzhuiVar;
        return this;
    }

    public final zzhuh zzf(int i10) throws GeneralSecurityException {
        if (i10 < 0) {
            throw new GeneralSecurityException(String.format("Invalid salt length in bytes %d; salt length must be positive", Integer.valueOf(i10)));
        }
        this.zze = Integer.valueOf(i10);
        return this;
    }

    public final zzhuk zzg() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("publicExponent is not set");
        }
        if (this.zzc == null) {
            throw new GeneralSecurityException("signature hash type is not set");
        }
        if (this.zzd == null) {
            throw new GeneralSecurityException("mgf1 hash type is not set");
        }
        if (this.zzf == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (this.zze == null) {
            throw new GeneralSecurityException("salt length is not set");
        }
        if (num.intValue() < 2048) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least %d bits", this.zza, 2048));
        }
        if (this.zzc != this.zzd) {
            throw new GeneralSecurityException("MGF1 hash is different from signature hash");
        }
        BigInteger bigInteger = this.zzb;
        int iCompareTo = bigInteger.compareTo(zzhuk.zza);
        if (iCompareTo != 0) {
            if (iCompareTo < 0) {
                throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
            }
            if (bigInteger.mod(zzg).equals(BigInteger.ZERO)) {
                throw new InvalidAlgorithmParameterException("Invalid public exponent");
            }
            if (bigInteger.compareTo(zzh) > 0) {
                throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
            }
        }
        return new zzhuk(this.zza.intValue(), this.zzb, this.zzf, this.zzc, this.zzd, this.zze.intValue(), null);
    }

    /* synthetic */ zzhuh(byte[] bArr) {
    }
}
