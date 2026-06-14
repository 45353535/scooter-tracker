package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes8.dex */
final class zzheq {
    public static final /* synthetic */ int zza = 0;
    private static final zzhye zzb;
    private static final zzhkn zzc;
    private static final zzhkk zzd;
    private static final zzhji zze;
    private static final zzhjf zzf;

    static {
        zzhye zzhyeVarZza = zzhln.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        zzb = zzhyeVarZza;
        zzc = zzhkn.zzd(zzhep.zza, zzhel.class, zzhlc.class);
        zzd = zzhkk.zzd(zzhem.zza, zzhyeVarZza, zzhlc.class);
        zze = zzhji.zzd(zzhen.zza, zzhej.class, zzhlb.class);
        zzf = zzhjf.zzd(zzheo.zza, zzhyeVarZza, zzhlb.class);
    }

    public static void zza(zzhkg zzhkgVar) throws GeneralSecurityException {
        zzhkgVar.zzd(zzc);
        zzhkgVar.zze(zzd);
        zzhkgVar.zzb(zze);
        zzhkgVar.zzc(zzf);
    }

    static /* synthetic */ zzhlc zzb(zzhel zzhelVar) {
        zzhqe zzhqeVarZze = zzhqf.zze();
        zzhqeVarZze.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        zzhqs zzhqsVarZzc = zzhqt.zzc();
        zzhqsVarZzc.zza(zzhelVar.zzc());
        zzhqeVarZze.zzb(((zzhqt) zzhqsVarZzc.zzbu()).zzaM());
        zzhqeVarZze.zzc(zzf(zzhelVar.zzd()));
        return zzhlc.zza((zzhqf) zzhqeVarZze.zzbu());
    }

    static /* synthetic */ zzhel zzc(zzhlc zzhlcVar) throws GeneralSecurityException {
        if (!zzhlcVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzhlcVar.zzc().zza())));
        }
        try {
            return zzhel.zzb(zzhqt.zzb(zzhlcVar.zzc().zzb(), zzibb.zza()).zza(), zzg(zzhlcVar.zzc().zzc()));
        } catch (zzicg e10) {
            throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e10);
        }
    }

    static /* synthetic */ zzhlb zzd(zzhej zzhejVar, zzhbt zzhbtVar) {
        zzhqq zzhqqVarZzd = zzhqr.zzd();
        zzhqs zzhqsVarZzc = zzhqt.zzc();
        zzhqsVarZzc.zza(zzhejVar.zze().zzc());
        zzhqqVarZzd.zza((zzhqt) zzhqsVarZzc.zzbu());
        return zzhlb.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((zzhqr) zzhqqVarZzd.zzbu()).zzaM(), zzhqb.REMOTE, zzf(zzhejVar.zze().zzd()), zzhejVar.zzb());
    }

    static /* synthetic */ zzhej zze(zzhlb zzhlbVar, zzhbt zzhbtVar) throws GeneralSecurityException {
        if (!zzhlbVar.zzg().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
        }
        try {
            zzhqr zzhqrVarZzc = zzhqr.zzc(zzhlbVar.zzb(), zzibb.zza());
            if (zzhqrVarZzc.zza() == 0) {
                return zzhej.zzd(zzhel.zzb(zzhqrVarZzc.zzb().zza(), zzg(zzhlbVar.zzd())), zzhlbVar.zze());
            }
            String strValueOf = String.valueOf(zzhqrVarZzc);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 49);
            sb2.append("KmsAeadKey are only accepted with version 0, got ");
            sb2.append(strValueOf);
            throw new GeneralSecurityException(sb2.toString());
        } catch (zzicg e10) {
            throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e10);
        }
    }

    private static zzhqy zzf(zzhek zzhekVar) throws GeneralSecurityException {
        if (zzhek.zza.equals(zzhekVar)) {
            return zzhqy.TINK;
        }
        if (zzhek.zzb.equals(zzhekVar)) {
            return zzhqy.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzhekVar.toString()));
    }

    private static zzhek zzg(zzhqy zzhqyVar) throws GeneralSecurityException {
        int iOrdinal = zzhqyVar.ordinal();
        if (iOrdinal == 1) {
            return zzhek.zza;
        }
        if (iOrdinal == 3) {
            return zzhek.zzb;
        }
        int iZza = zzhqyVar.zza();
        StringBuilder sb2 = new StringBuilder(String.valueOf(iZza).length() + 34);
        sb2.append("Unable to parse OutputPrefixType: ");
        sb2.append(iZza);
        throw new GeneralSecurityException(sb2.toString());
    }
}
