package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhgo {
    public static final /* synthetic */ int zza = 0;
    private static final zzhye zzb;
    private static final zzhkn zzc;
    private static final zzhkk zzd;
    private static final zzhji zze;
    private static final zzhjf zzf;

    static {
        zzhye zzhyeVarZza = zzhln.zza("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zzb = zzhyeVarZza;
        zzc = zzhkn.zzd(zzhgn.zza, zzhdm.class, zzhlc.class);
        zzd = zzhkk.zzd(zzhgk.zza, zzhyeVarZza, zzhlc.class);
        zze = zzhji.zzd(zzhgl.zza, zzhdf.class, zzhlb.class);
        zzf = zzhjf.zzd(zzhgm.zza, zzhyeVarZza, zzhlb.class);
    }

    public static void zza(zzhkg zzhkgVar) throws GeneralSecurityException {
        zzhkgVar.zzd(zzc);
        zzhkgVar.zze(zzd);
        zzhkgVar.zzb(zze);
        zzhkgVar.zzc(zzf);
    }

    static /* synthetic */ zzhlc zzb(zzhdm zzhdmVar) {
        zzhqe zzhqeVarZze = zzhqf.zze();
        zzhqeVarZze.zza("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zzhot zzhotVarZzd = zzhou.zzd();
        zzhotVarZzd.zza(zzhdmVar.zzc());
        zzhqeVarZze.zzb(((zzhou) zzhotVarZzd.zzbu()).zzaM());
        zzhqeVarZze.zzc(zzf(zzhdmVar.zzd()));
        return zzhlc.zza((zzhqf) zzhqeVarZze.zzbu());
    }

    static /* synthetic */ zzhdm zzc(zzhlc zzhlcVar) throws GeneralSecurityException {
        if (!zzhlcVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(zzhlcVar.zzc().zza())));
        }
        try {
            zzhou zzhouVarZzc = zzhou.zzc(zzhlcVar.zzc().zzb(), zzibb.zza());
            if (zzhouVarZzc.zzb() != 0) {
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            }
            zzhdk zzhdkVarZzb = zzhdm.zzb();
            zzhdkVarZzb.zza(zzhouVarZzc.zza());
            zzhdkVarZzb.zzb(12);
            zzhdkVarZzb.zzc(16);
            zzhdkVarZzb.zzd(zzg(zzhlcVar.zzc().zzc()));
            return zzhdkVarZzb.zze();
        } catch (zzicg e10) {
            throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e10);
        }
    }

    static /* synthetic */ zzhlb zzd(zzhdf zzhdfVar, zzhbt zzhbtVar) {
        zzhor zzhorVarZzd = zzhos.zzd();
        byte[] bArrZzc = zzhdfVar.zze().zzc(zzhbtVar);
        zzhorVarZzd.zza(zzian.zzs(bArrZzc, 0, bArrZzc.length));
        return zzhlb.zza("type.googleapis.com/google.crypto.tink.AesGcmKey", ((zzhos) zzhorVarZzd.zzbu()).zzaM(), zzhqb.SYMMETRIC, zzf(zzhdfVar.zzf().zzd()), zzhdfVar.zzb());
    }

    static /* synthetic */ zzhdf zze(zzhlb zzhlbVar, zzhbt zzhbtVar) throws GeneralSecurityException {
        if (!zzhlbVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
        }
        try {
            zzhos zzhosVarZzc = zzhos.zzc(zzhlbVar.zzb(), zzibb.zza());
            if (zzhosVarZzc.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhdk zzhdkVarZzb = zzhdm.zzb();
            zzhdkVarZzb.zza(zzhosVarZzc.zzb().zzc());
            zzhdkVarZzb.zzb(12);
            zzhdkVarZzb.zzc(16);
            zzhdkVarZzb.zzd(zzg(zzhlbVar.zzd()));
            zzhdm zzhdmVarZze = zzhdkVarZzb.zze();
            zzhde zzhdeVarZzd = zzhdf.zzd();
            zzhdeVarZzd.zza(zzhdmVarZze);
            zzhdeVarZzd.zzb(zzhyg.zza(zzhosVarZzc.zzb().zzy(), zzhbtVar));
            zzhdeVarZzd.zzc(zzhlbVar.zze());
            return zzhdeVarZzd.zzd();
        } catch (zzicg unused) {
            throw new GeneralSecurityException("Parsing AesGcmKey failed");
        }
    }

    private static zzhqy zzf(zzhdl zzhdlVar) throws GeneralSecurityException {
        if (zzhdl.zza.equals(zzhdlVar)) {
            return zzhqy.TINK;
        }
        if (zzhdl.zzb.equals(zzhdlVar)) {
            return zzhqy.CRUNCHY;
        }
        if (zzhdl.zzc.equals(zzhdlVar)) {
            return zzhqy.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzhdlVar)));
    }

    private static zzhdl zzg(zzhqy zzhqyVar) throws GeneralSecurityException {
        int iOrdinal = zzhqyVar.ordinal();
        if (iOrdinal == 1) {
            return zzhdl.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzhdl.zzc;
            }
            if (iOrdinal != 4) {
                int iZza = zzhqyVar.zza();
                StringBuilder sb2 = new StringBuilder(String.valueOf(iZza).length() + 34);
                sb2.append("Unable to parse OutputPrefixType: ");
                sb2.append(iZza);
                throw new GeneralSecurityException(sb2.toString());
            }
        }
        return zzhdl.zzb;
    }
}
