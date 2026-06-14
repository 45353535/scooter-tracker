package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhnl {
    public static final /* synthetic */ int zza = 0;
    private static final zzhye zzb;
    private static final zzhiu zzc;
    private static final zzhiu zzd;
    private static final zzhkn zze;
    private static final zzhkk zzf;
    private static final zzhji zzg;
    private static final zzhjf zzh;

    static {
        zzhye zzhyeVarZza = zzhln.zza("type.googleapis.com/google.crypto.tink.HmacKey");
        zzb = zzhyeVarZza;
        zzhit zzhitVarZza = zzhiu.zza();
        zzhitVarZza.zza(zzhqy.RAW, zzhmj.zzd);
        zzhitVarZza.zza(zzhqy.TINK, zzhmj.zza);
        zzhitVarZza.zza(zzhqy.LEGACY, zzhmj.zzc);
        zzhitVarZza.zza(zzhqy.CRUNCHY, zzhmj.zzb);
        zzc = zzhitVarZza.zzb();
        zzhit zzhitVarZza2 = zzhiu.zza();
        zzhitVarZza2.zza(zzhpt.SHA1, zzhmi.zza);
        zzhitVarZza2.zza(zzhpt.SHA224, zzhmi.zzb);
        zzhitVarZza2.zza(zzhpt.SHA256, zzhmi.zzc);
        zzhitVarZza2.zza(zzhpt.SHA384, zzhmi.zzd);
        zzhitVarZza2.zza(zzhpt.SHA512, zzhmi.zze);
        zzd = zzhitVarZza2.zzb();
        zze = zzhkn.zzd(zzhnk.zza, zzhmk.class, zzhlc.class);
        zzf = zzhkk.zzd(zzhnh.zza, zzhyeVarZza, zzhlc.class);
        zzg = zzhji.zzd(zzhni.zza, zzhmb.class, zzhlb.class);
        zzh = zzhjf.zzd(zzhnj.zza, zzhyeVarZza, zzhlb.class);
    }

    public static void zza(zzhkg zzhkgVar) throws GeneralSecurityException {
        zzhkgVar.zzd(zze);
        zzhkgVar.zze(zzf);
        zzhkgVar.zzb(zzg);
        zzhkgVar.zzc(zzh);
    }

    static /* synthetic */ zzhlc zzb(zzhmk zzhmkVar) {
        zzhqe zzhqeVarZze = zzhqf.zze();
        zzhqeVarZze.zza("type.googleapis.com/google.crypto.tink.HmacKey");
        zzhpw zzhpwVarZze = zzhpx.zze();
        zzhpwVarZze.zza(zzf(zzhmkVar));
        zzhpwVarZze.zzb(zzhmkVar.zzc());
        zzhqeVarZze.zzb(((zzhpx) zzhpwVarZze.zzbu()).zzaM());
        zzhqeVarZze.zzc((zzhqy) zzc.zzb(zzhmkVar.zzf()));
        return zzhlc.zza((zzhqf) zzhqeVarZze.zzbu());
    }

    static /* synthetic */ zzhmk zzc(zzhlc zzhlcVar) throws GeneralSecurityException {
        if (!zzhlcVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: ".concat(String.valueOf(zzhlcVar.zzc().zza())));
        }
        try {
            zzhpx zzhpxVarZzd = zzhpx.zzd(zzhlcVar.zzc().zzb(), zzibb.zza());
            if (zzhpxVarZzd.zzc() != 0) {
                int iZzc = zzhpxVarZzd.zzc();
                StringBuilder sb2 = new StringBuilder(String.valueOf(iZzc).length() + 47);
                sb2.append("Parsing HmacParameters failed: unknown Version ");
                sb2.append(iZzc);
                throw new GeneralSecurityException(sb2.toString());
            }
            zzhmh zzhmhVarZzb = zzhmk.zzb();
            zzhmhVarZzb.zza(zzhpxVarZzd.zzb());
            zzhmhVarZzb.zzb(zzhpxVarZzd.zza().zzb());
            zzhmhVarZzb.zzd((zzhmi) zzd.zzc(zzhpxVarZzd.zza().zza()));
            zzhmhVarZzb.zzc((zzhmj) zzc.zzc(zzhlcVar.zzc().zzc()));
            return zzhmhVarZzb.zze();
        } catch (zzicg e10) {
            throw new GeneralSecurityException("Parsing HmacParameters failed: ", e10);
        }
    }

    static /* synthetic */ zzhlb zzd(zzhmb zzhmbVar, zzhbt zzhbtVar) {
        zzhpu zzhpuVarZze = zzhpv.zze();
        zzhpuVarZze.zza(zzf(zzhmbVar.zzf()));
        byte[] bArrZzc = zzhmbVar.zzd().zzc(zzhbtVar);
        zzhpuVarZze.zzb(zzian.zzs(bArrZzc, 0, bArrZzc.length));
        return zzhlb.zza("type.googleapis.com/google.crypto.tink.HmacKey", ((zzhpv) zzhpuVarZze.zzbu()).zzaM(), zzhqb.SYMMETRIC, (zzhqy) zzc.zzb(zzhmbVar.zzf().zzf()), zzhmbVar.zzb());
    }

    static /* synthetic */ zzhmb zze(zzhlb zzhlbVar, zzhbt zzhbtVar) throws GeneralSecurityException {
        if (!zzhlbVar.zzg().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            zzhpv zzhpvVarZzd = zzhpv.zzd(zzhlbVar.zzb(), zzibb.zza());
            if (zzhpvVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhmh zzhmhVarZzb = zzhmk.zzb();
            zzhmhVarZzb.zza(zzhpvVarZzd.zzc().zzc());
            zzhmhVarZzb.zzb(zzhpvVarZzd.zzb().zzb());
            zzhmhVarZzb.zzd((zzhmi) zzd.zzc(zzhpvVarZzd.zzb().zza()));
            zzhmhVarZzb.zzc((zzhmj) zzc.zzc(zzhlbVar.zzd()));
            zzhmk zzhmkVarZze = zzhmhVarZzb.zze();
            zzhma zzhmaVarZzc = zzhmb.zzc();
            zzhmaVarZzc.zza(zzhmkVarZze);
            zzhmaVarZzc.zzb(zzhyg.zza(zzhpvVarZzd.zzc().zzy(), zzhbtVar));
            zzhmaVarZzc.zzc(zzhlbVar.zze());
            return zzhmaVarZzc.zzd();
        } catch (zzicg | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing HmacKey failed");
        }
    }

    private static zzhpz zzf(zzhmk zzhmkVar) throws GeneralSecurityException {
        zzhpy zzhpyVarZzc = zzhpz.zzc();
        zzhpyVarZzc.zzb(zzhmkVar.zzd());
        zzhpyVarZzc.zza((zzhpt) zzd.zzb(zzhmkVar.zzg()));
        return (zzhpz) zzhpyVarZzc.zzbu();
    }
}
