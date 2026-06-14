package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhgv {
    public static final /* synthetic */ int zza = 0;
    private static final zzhye zzb;
    private static final zzhkn zzc;
    private static final zzhkk zzd;
    private static final zzhji zze;
    private static final zzhjf zzf;

    static {
        zzhye zzhyeVarZza = zzhln.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zzb = zzhyeVarZza;
        zzc = zzhkn.zzd(zzhgu.zza, zzhdv.class, zzhlc.class);
        zzd = zzhkk.zzd(zzhgr.zza, zzhyeVarZza, zzhlc.class);
        zze = zzhji.zzd(zzhgs.zza, zzhdo.class, zzhlb.class);
        zzf = zzhjf.zzd(zzhgt.zza, zzhyeVarZza, zzhlb.class);
    }

    public static void zza(zzhkg zzhkgVar) throws GeneralSecurityException {
        zzhkgVar.zzd(zzc);
        zzhkgVar.zze(zzd);
        zzhkgVar.zzb(zze);
        zzhkgVar.zzc(zzf);
    }

    static /* synthetic */ zzhlc zzb(zzhdv zzhdvVar) {
        zzhqe zzhqeVarZze = zzhqf.zze();
        zzhqeVarZze.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zzhox zzhoxVarZzd = zzhoy.zzd();
        zzhoxVarZzd.zza(zzhdvVar.zzc());
        zzhqeVarZze.zzb(((zzhoy) zzhoxVarZzd.zzbu()).zzaM());
        zzhqeVarZze.zzc(zzf(zzhdvVar.zzd()));
        return zzhlc.zza((zzhqf) zzhqeVarZze.zzbu());
    }

    static /* synthetic */ zzhdv zzc(zzhlc zzhlcVar) throws GeneralSecurityException {
        if (!zzhlcVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ".concat(String.valueOf(zzhlcVar.zzc().zza())));
        }
        try {
            zzhoy zzhoyVarZzc = zzhoy.zzc(zzhlcVar.zzc().zzb(), zzibb.zza());
            if (zzhoyVarZzc.zzb() != 0) {
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            }
            zzhdt zzhdtVarZzb = zzhdv.zzb();
            zzhdtVarZzb.zza(zzhoyVarZzc.zza());
            zzhdtVarZzb.zzb(zzg(zzhlcVar.zzc().zzc()));
            return zzhdtVarZzb.zzc();
        } catch (zzicg e10) {
            throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e10);
        }
    }

    static /* synthetic */ zzhlb zzd(zzhdo zzhdoVar, zzhbt zzhbtVar) {
        zzhov zzhovVarZzd = zzhow.zzd();
        byte[] bArrZzc = zzhdoVar.zze().zzc(zzhbtVar);
        zzhovVarZzd.zza(zzian.zzs(bArrZzc, 0, bArrZzc.length));
        return zzhlb.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((zzhow) zzhovVarZzd.zzbu()).zzaM(), zzhqb.SYMMETRIC, zzf(zzhdoVar.zzf().zzd()), zzhdoVar.zzb());
    }

    static /* synthetic */ zzhdo zze(zzhlb zzhlbVar, zzhbt zzhbtVar) throws GeneralSecurityException {
        if (!zzhlbVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
        }
        try {
            zzhow zzhowVarZzc = zzhow.zzc(zzhlbVar.zzb(), zzibb.zza());
            if (zzhowVarZzc.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhdt zzhdtVarZzb = zzhdv.zzb();
            zzhdtVarZzb.zza(zzhowVarZzc.zzb().zzc());
            zzhdtVarZzb.zzb(zzg(zzhlbVar.zzd()));
            zzhdv zzhdvVarZzc = zzhdtVarZzb.zzc();
            zzhdn zzhdnVarZzd = zzhdo.zzd();
            zzhdnVarZzd.zza(zzhdvVarZzc);
            zzhdnVarZzd.zzb(zzhyg.zza(zzhowVarZzc.zzb().zzy(), zzhbtVar));
            zzhdnVarZzd.zzc(zzhlbVar.zze());
            return zzhdnVarZzd.zzd();
        } catch (zzicg unused) {
            throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
        }
    }

    private static zzhqy zzf(zzhdu zzhduVar) throws GeneralSecurityException {
        if (zzhdu.zza.equals(zzhduVar)) {
            return zzhqy.TINK;
        }
        if (zzhdu.zzb.equals(zzhduVar)) {
            return zzhqy.CRUNCHY;
        }
        if (zzhdu.zzc.equals(zzhduVar)) {
            return zzhqy.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzhduVar)));
    }

    private static zzhdu zzg(zzhqy zzhqyVar) throws GeneralSecurityException {
        int iOrdinal = zzhqyVar.ordinal();
        if (iOrdinal == 1) {
            return zzhdu.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzhdu.zzc;
            }
            if (iOrdinal != 4) {
                int iZza = zzhqyVar.zza();
                StringBuilder sb2 = new StringBuilder(String.valueOf(iZza).length() + 34);
                sb2.append("Unable to parse OutputPrefixType: ");
                sb2.append(iZza);
                throw new GeneralSecurityException(sb2.toString());
            }
        }
        return zzhdu.zzb;
    }
}
