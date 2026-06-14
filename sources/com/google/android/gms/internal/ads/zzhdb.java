package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhdb {
    private Integer zza = null;
    private Integer zzb = null;
    private Integer zzc = null;
    private zzhdc zzd = zzhdc.zzc;

    private zzhdb() {
    }

    public final zzhdb zza(int i10) throws GeneralSecurityException {
        if (i10 != 16 && i10 != 24 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
        }
        this.zza = Integer.valueOf(i10);
        return this;
    }

    public final zzhdb zzb(int i10) throws GeneralSecurityException {
        if (i10 != 12 && i10 != 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i10)));
        }
        this.zzb = Integer.valueOf(i10);
        return this;
    }

    public final zzhdb zzc(int i10) throws GeneralSecurityException {
        this.zzc = 16;
        return this;
    }

    public final zzhdb zzd(zzhdc zzhdcVar) {
        this.zzd = zzhdcVar;
        return this;
    }

    public final zzhdd zze() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (this.zzd == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        if (this.zzc == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int iIntValue = num.intValue();
        int iIntValue2 = this.zzb.intValue();
        this.zzc.getClass();
        return new zzhdd(iIntValue, iIntValue2, 16, this.zzd, null);
    }

    /* synthetic */ zzhdb(byte[] bArr) {
    }
}
