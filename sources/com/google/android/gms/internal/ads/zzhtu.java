package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhtu implements zzhla {
    private static final zzhtu zza = new zzhtu();
    private static final zzhku zzb = zzhku.zzd(zzhtr.zza, zzhjo.class, zzhbs.class);

    static void zzc() throws GeneralSecurityException {
        zzhkd.zza().zzc(zza);
        zzhkd.zza().zzb(zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzhla
    public final Class zza() {
        return zzhbs.class;
    }

    @Override // com.google.android.gms.internal.ads.zzhla
    public final Class zzb() {
        return zzhbs.class;
    }

    @Override // com.google.android.gms.internal.ads.zzhla
    public final /* bridge */ /* synthetic */ Object zze(zzhjj zzhjjVar, zzhjr zzhjrVar, zzhkz zzhkzVar) throws GeneralSecurityException {
        zzhye zzhyeVarZzd;
        zzhkp zzhkpVar = new zzhkp();
        for (int i10 = 0; i10 < zzhjjVar.zzd(); i10++) {
            zzhbi zzhbiVarZze = ((zzhbk) zzhjjVar).zze(i10);
            if (zzhbiVarZze.zzb().equals(zzhbb.zza)) {
                zzhbs zzhbsVar = (zzhbs) zzhkzVar.zza(zzhbiVarZze);
                zzhaz zzhazVarZza = zzhbiVarZze.zza();
                if (zzhazVarZza instanceof zzhuw) {
                    zzhyeVarZzd = ((zzhuw) zzhazVarZza).zze();
                } else {
                    if (!(zzhazVarZza instanceof zzhjo)) {
                        String name = zzhazVarZza.getClass().getName();
                        String strValueOf = String.valueOf(zzhazVarZza.zza());
                        StringBuilder sb2 = new StringBuilder(name.length() + 59 + strValueOf.length());
                        sb2.append("Cannot get output prefix for key of class ");
                        sb2.append(name);
                        sb2.append(" with parameters ");
                        sb2.append(strValueOf);
                        throw new GeneralSecurityException(sb2.toString());
                    }
                    zzhyeVarZzd = ((zzhjo) zzhazVarZza).zzd();
                }
                zzhkpVar.zza(zzhyeVarZzd, new zzhts(zzhbsVar, zzhbiVarZze.zzc()));
            }
        }
        return new zzhtt(zzhkpVar.zzb(), !zzhjrVar.zza() ? zzhkb.zza().zzb().zza(zzhjjVar, zzhjrVar, "public_key_verify", "verify") : zzhjv.zza);
    }
}
