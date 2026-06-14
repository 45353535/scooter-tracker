package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhgc {
    public static final /* synthetic */ int zza = 0;
    private static final zzhye zzb;
    private static final zzhkn zzc;
    private static final zzhkk zzd;
    private static final zzhji zze;
    private static final zzhjf zzf;

    static {
        zzhye zzhyeVarZza = zzhln.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzb = zzhyeVarZza;
        zzc = zzhkn.zzd(zzhgb.zza, zzhcv.class, zzhlc.class);
        zzd = zzhkk.zzd(zzhfy.zza, zzhyeVarZza, zzhlc.class);
        zze = zzhji.zzd(zzhfz.zza, zzhcn.class, zzhlb.class);
        zzf = zzhjf.zzd(zzhga.zza, zzhyeVarZza, zzhlb.class);
    }

    public static void zza(zzhkg zzhkgVar) throws GeneralSecurityException {
        zzhkgVar.zzd(zzc);
        zzhkgVar.zze(zzd);
        zzhkgVar.zzb(zze);
        zzhkgVar.zzc(zzf);
    }

    static /* synthetic */ zzhlc zzb(zzhcv zzhcvVar) {
        zzhqe zzhqeVarZze = zzhqf.zze();
        zzhqeVarZze.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzhod zzhodVarZzd = zzhoe.zzd();
        zzhoh zzhohVarZzc = zzhoi.zzc();
        zzhoj zzhojVarZzb = zzhok.zzb();
        zzhojVarZzb.zza(zzhcvVar.zzf());
        zzhohVarZzc.zza((zzhok) zzhojVarZzb.zzbu());
        zzhohVarZzc.zzb(zzhcvVar.zzc());
        zzhodVarZzd.zza((zzhoi) zzhohVarZzc.zzbu());
        zzhpw zzhpwVarZze = zzhpx.zze();
        zzhpwVarZze.zza(zzi(zzhcvVar));
        zzhpwVarZze.zzb(zzhcvVar.zzd());
        zzhodVarZzd.zzb((zzhpx) zzhpwVarZze.zzbu());
        zzhqeVarZze.zzb(((zzhoe) zzhodVarZzd.zzbu()).zzaM());
        zzhqeVarZze.zzc(zzf(zzhcvVar.zzg()));
        return zzhlc.zza((zzhqf) zzhqeVarZze.zzbu());
    }

    static /* synthetic */ zzhcv zzc(zzhlc zzhlcVar) throws GeneralSecurityException {
        if (!zzhlcVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzhlcVar.zzc().zza())));
        }
        try {
            zzhoe zzhoeVarZzc = zzhoe.zzc(zzhlcVar.zzc().zzb(), zzibb.zza());
            if (zzhoeVarZzc.zzb().zzc() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhcs zzhcsVarZzb = zzhcv.zzb();
            zzhcsVarZzb.zza(zzhoeVarZzc.zza().zzb());
            zzhcsVarZzb.zzb(zzhoeVarZzc.zzb().zzb());
            zzhcsVarZzb.zzc(zzhoeVarZzc.zza().zza().zza());
            zzhcsVarZzb.zzd(zzhoeVarZzc.zzb().zza().zzb());
            zzhcsVarZzb.zzf(zzh(zzhoeVarZzc.zzb().zza().zza()));
            zzhcsVarZzb.zze(zzg(zzhlcVar.zzc().zzc()));
            return zzhcsVarZzb.zzg();
        } catch (zzicg e10) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e10);
        }
    }

    static /* synthetic */ zzhlb zzd(zzhcn zzhcnVar, zzhbt zzhbtVar) {
        zzhob zzhobVarZze = zzhoc.zze();
        zzhof zzhofVarZzd = zzhog.zzd();
        zzhoj zzhojVarZzb = zzhok.zzb();
        zzhojVarZzb.zza(zzhcnVar.zzg().zzf());
        zzhofVarZzd.zza((zzhok) zzhojVarZzb.zzbu());
        byte[] bArrZzc = zzhcnVar.zze().zzc(zzhbtVar);
        zzhofVarZzd.zzb(zzian.zzs(bArrZzc, 0, bArrZzc.length));
        zzhobVarZze.zza((zzhog) zzhofVarZzd.zzbu());
        zzhpu zzhpuVarZze = zzhpv.zze();
        zzhpuVarZze.zza(zzi(zzhcnVar.zzg()));
        byte[] bArrZzc2 = zzhcnVar.zzf().zzc(zzhbtVar);
        zzhpuVarZze.zzb(zzian.zzs(bArrZzc2, 0, bArrZzc2.length));
        zzhobVarZze.zzb((zzhpv) zzhpuVarZze.zzbu());
        return zzhlb.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((zzhoc) zzhobVarZze.zzbu()).zzaM(), zzhqb.SYMMETRIC, zzf(zzhcnVar.zzg().zzg()), zzhcnVar.zzb());
    }

    static /* synthetic */ zzhcn zze(zzhlb zzhlbVar, zzhbt zzhbtVar) throws GeneralSecurityException {
        if (!zzhlbVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
        }
        try {
            zzhoc zzhocVarZzd = zzhoc.zzd(zzhlbVar.zzb(), zzibb.zza());
            if (zzhocVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (zzhocVarZzd.zzb().zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
            }
            if (zzhocVarZzd.zzc().zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
            }
            zzhcs zzhcsVarZzb = zzhcv.zzb();
            zzhcsVarZzb.zza(zzhocVarZzd.zzb().zzc().zzc());
            zzhcsVarZzb.zzb(zzhocVarZzd.zzc().zzc().zzc());
            zzhcsVarZzb.zzc(zzhocVarZzd.zzb().zzb().zza());
            zzhcsVarZzb.zzd(zzhocVarZzd.zzc().zzb().zzb());
            zzhcsVarZzb.zzf(zzh(zzhocVarZzd.zzc().zzb().zza()));
            zzhcsVarZzb.zze(zzg(zzhlbVar.zzd()));
            zzhcv zzhcvVarZzg = zzhcsVarZzb.zzg();
            zzhcm zzhcmVarZzd = zzhcn.zzd();
            zzhcmVarZzd.zza(zzhcvVarZzg);
            zzhcmVarZzd.zzb(zzhyg.zza(zzhocVarZzd.zzb().zzc().zzy(), zzhbtVar));
            zzhcmVarZzd.zzc(zzhyg.zza(zzhocVarZzd.zzc().zzc().zzy(), zzhbtVar));
            zzhcmVarZzd.zzd(zzhlbVar.zze());
            return zzhcmVarZzd.zze();
        } catch (zzicg unused) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
        }
    }

    private static zzhqy zzf(zzhcu zzhcuVar) throws GeneralSecurityException {
        if (zzhcu.zza.equals(zzhcuVar)) {
            return zzhqy.TINK;
        }
        if (zzhcu.zzb.equals(zzhcuVar)) {
            return zzhqy.CRUNCHY;
        }
        if (zzhcu.zzc.equals(zzhcuVar)) {
            return zzhqy.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzhcuVar)));
    }

    private static zzhcu zzg(zzhqy zzhqyVar) throws GeneralSecurityException {
        int iOrdinal = zzhqyVar.ordinal();
        if (iOrdinal == 1) {
            return zzhcu.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzhcu.zzc;
            }
            if (iOrdinal != 4) {
                int iZza = zzhqyVar.zza();
                StringBuilder sb2 = new StringBuilder(String.valueOf(iZza).length() + 34);
                sb2.append("Unable to parse OutputPrefixType: ");
                sb2.append(iZza);
                throw new GeneralSecurityException(sb2.toString());
            }
        }
        return zzhcu.zzb;
    }

    private static zzhct zzh(zzhpt zzhptVar) throws GeneralSecurityException {
        int iOrdinal = zzhptVar.ordinal();
        if (iOrdinal == 1) {
            return zzhct.zza;
        }
        if (iOrdinal == 2) {
            return zzhct.zzd;
        }
        if (iOrdinal == 3) {
            return zzhct.zzc;
        }
        if (iOrdinal == 4) {
            return zzhct.zze;
        }
        if (iOrdinal == 5) {
            return zzhct.zzb;
        }
        int iZza = zzhptVar.zza();
        StringBuilder sb2 = new StringBuilder(String.valueOf(iZza).length() + 26);
        sb2.append("Unable to parse HashType: ");
        sb2.append(iZza);
        throw new GeneralSecurityException(sb2.toString());
    }

    private static zzhpz zzi(zzhcv zzhcvVar) throws GeneralSecurityException {
        zzhpt zzhptVar;
        zzhpy zzhpyVarZzc = zzhpz.zzc();
        zzhpyVarZzc.zzb(zzhcvVar.zze());
        zzhct zzhctVarZzh = zzhcvVar.zzh();
        if (zzhct.zza.equals(zzhctVarZzh)) {
            zzhptVar = zzhpt.SHA1;
        } else if (zzhct.zzb.equals(zzhctVarZzh)) {
            zzhptVar = zzhpt.SHA224;
        } else if (zzhct.zzc.equals(zzhctVarZzh)) {
            zzhptVar = zzhpt.SHA256;
        } else if (zzhct.zzd.equals(zzhctVarZzh)) {
            zzhptVar = zzhpt.SHA384;
        } else {
            if (!zzhct.zze.equals(zzhctVarZzh)) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(zzhctVarZzh)));
            }
            zzhptVar = zzhpt.SHA512;
        }
        zzhpyVarZzc.zza(zzhptVar);
        return (zzhpz) zzhpyVarZzc.zzbu();
    }
}
