package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhwm implements zzhas {
    private static final ThreadLocal zza = new zzhwl();
    private final byte[] zzb;
    private final zzhnp zzc;
    private final SecretKeySpec zzd;
    private final int zze;

    private zzhwm(byte[] bArr, int i10, byte[] bArr2) throws GeneralSecurityException {
        if (!zzhid.zza(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i10 != 12 && i10 != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.zze = i10;
        int length = bArr.length;
        zzhyc.zza(length);
        this.zzd = new SecretKeySpec(bArr, "AES");
        this.zzc = zzhxr.zzb(zzhnn.zzc(zzhno.zzb(length), zzhyg.zza(bArr, zzhax.zza())));
        this.zzb = bArr2;
    }

    public static zzhas zzb(zzhcx zzhcxVar) throws GeneralSecurityException {
        if (!zzhid.zza(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        zzhcxVar.zzf();
        return new zzhwm(zzhcxVar.zze().zzc(zzhax.zza()), zzhcxVar.zzf().zzd(), zzhcxVar.zzc().zzc());
    }

    private final byte[] zzc(int i10, byte[] bArr, int i11, int i12) throws GeneralSecurityException {
        byte[] bArr2 = new byte[i12 + 16];
        bArr2[15] = (byte) i10;
        System.arraycopy(bArr, i11, bArr2, 16, i12);
        return this.zzc.zza(bArr2, 16);
    }

    @Override // com.google.android.gms.internal.ads.zzhas
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzb;
        int length = bArr.length;
        int length2 = bArr3.length;
        int i10 = this.zze;
        int i11 = ((length - length2) - i10) - 16;
        if (i11 < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!zzhln.zze(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArrZzc = zzc(0, bArr, length2, i10);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArrZzc2 = zzc(1, bArr2, 0, bArr2.length);
        byte[] bArrZzc3 = zzc(2, bArr, length2 + i10, i11);
        int i12 = length - 16;
        byte b10 = 0;
        for (int i13 = 0; i13 < 16; i13++) {
            b10 = (byte) (b10 | (((bArr[i12 + i13] ^ bArrZzc2[i13]) ^ bArrZzc[i13]) ^ bArrZzc3[i13]));
        }
        if (b10 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher = (Cipher) zza.get();
        cipher.init(1, this.zzd, new IvParameterSpec(bArrZzc));
        return cipher.doFinal(bArr, bArr3.length + i10, i11);
    }
}
