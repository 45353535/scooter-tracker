package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPublicKeySpec;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhvf implements zzhbs {
    static final zzhiu zza;
    static final zzhiu zzb;
    static final zzhiu zzc;
    public static final /* synthetic */ int zzd = 0;
    private static final byte[] zze = new byte[0];
    private static final byte[] zzf = {0};
    private final ECPublicKey zzg;
    private final String zzh;
    private final zzhwx zzi;
    private final byte[] zzj;
    private final byte[] zzk;
    private final Provider zzl;

    static {
        zzhit zzhitVarZza = zzhiu.zza();
        zzhitVarZza.zza(zzhxn.SHA256, zzhsd.zza);
        zzhitVarZza.zza(zzhxn.SHA384, zzhsd.zzb);
        zzhitVarZza.zza(zzhxn.SHA512, zzhsd.zzc);
        zza = zzhitVarZza.zzb();
        zzhit zzhitVarZza2 = zzhiu.zza();
        zzhitVarZza2.zza(zzhwx.IEEE_P1363, zzhse.zza);
        zzhitVarZza2.zza(zzhwx.DER, zzhse.zzb);
        zzb = zzhitVarZza2.zzb();
        zzhit zzhitVarZza3 = zzhiu.zza();
        zzhitVarZza3.zza(zzhww.NIST_P256, zzhsc.zza);
        zzhitVarZza3.zza(zzhww.NIST_P384, zzhsc.zzb);
        zzhitVarZza3.zza(zzhww.NIST_P521, zzhsc.zzc);
        zzc = zzhitVarZza3.zzb();
    }

    private zzhvf(ECPublicKey eCPublicKey, zzhxn zzhxnVar, zzhwx zzhwxVar, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!zzhid.zza(2)) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
        }
        this.zzh = zzhyb.zza(zzhxnVar);
        this.zzg = eCPublicKey;
        this.zzi = zzhwxVar;
        this.zzj = bArr;
        this.zzk = bArr2;
        this.zzl = provider;
    }

    public static zzhbs zzb(zzhsk zzhskVar, Provider provider) throws GeneralSecurityException {
        return new zzhvf((ECPublicKey) (provider != null ? KeyFactory.getInstance("EC", provider) : (KeyFactory) zzhxe.zzf.zzb("EC")).generatePublic(new ECPublicKeySpec(zzhskVar.zzd(), zzhwy.zzb((zzhww) zzc.zzb(zzhskVar.zzf().zzd())))), (zzhxn) zza.zzb(zzhskVar.zzf().zze()), (zzhwx) zzb.zzb(zzhskVar.zzf().zzc()), zzhskVar.zze().zzc(), zzhskVar.zzf().zzf().equals(zzhsf.zzc) ? zzf : zze, provider);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d1 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzc(byte[] r12, byte[] r13) throws java.security.GeneralSecurityException {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhvf.zzc(byte[], byte[]):void");
    }

    @Override // com.google.android.gms.internal.ads.zzhbs
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzj;
        int length = bArr3.length;
        if (length == 0) {
            zzc(bArr, bArr2);
        } else {
            if (!zzhln.zze(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            zzc(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
    }
}
