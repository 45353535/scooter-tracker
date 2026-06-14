package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhwz implements zzhas {
    private final zzhxp zza;
    private final zzhbo zzb;
    private final int zzc;
    private final byte[] zzd;

    private zzhwz(zzhxp zzhxpVar, zzhbo zzhboVar, int i10, byte[] bArr) {
        this.zza = zzhxpVar;
        this.zzb = zzhboVar;
        this.zzc = i10;
        this.zzd = bArr;
    }

    public static zzhas zzb(zzhcn zzhcnVar) throws GeneralSecurityException {
        zzhwk zzhwkVar = new zzhwk(zzhcnVar.zze().zzc(zzhax.zza()), zzhcnVar.zzg().zzf());
        String strValueOf = String.valueOf(zzhcnVar.zzg().zzh());
        return new zzhwz(zzhwkVar, new zzhxu(new zzhxt("HMAC".concat(strValueOf), new SecretKeySpec(zzhcnVar.zzf().zzc(zzhax.zza()), "HMAC")), zzhcnVar.zzg().zze()), zzhcnVar.zzg().zze(), zzhcnVar.zzc().zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzhas
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzd;
        int length = bArr.length;
        int i10 = this.zzc;
        int length2 = bArr3.length;
        if (length < i10 + length2) {
            throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
        }
        if (!zzhln.zze(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        int i11 = length - i10;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, length2, i11);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, i11, length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        if (MessageDigest.isEqual(((zzhxu) this.zzb).zzc(zzhwr.zza(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8))), bArrCopyOfRange2)) {
            return this.zza.zza(bArrCopyOfRange);
        }
        throw new GeneralSecurityException("invalid MAC");
    }
}
