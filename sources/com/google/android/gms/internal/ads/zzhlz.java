package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhlz implements zzhla {
    private static final zzhlz zza = new zzhlz();

    private zzhlz() {
    }

    static void zzc() throws GeneralSecurityException {
        zzhkd.zza().zzc(zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhla
    public final Class zza() {
        return zzhlx.class;
    }

    @Override // com.google.android.gms.internal.ads.zzhla
    public final Class zzb() {
        return zzhlx.class;
    }

    @Override // com.google.android.gms.internal.ads.zzhla
    public final /* bridge */ /* synthetic */ Object zze(zzhjj zzhjjVar, zzhjr zzhjrVar, zzhkz zzhkzVar) throws GeneralSecurityException {
        zzhye zzhyeVarZzd;
        zzhbi zzhbiVarZzc = ((zzhbk) zzhjjVar).zzc();
        zzhkp zzhkpVar = new zzhkp();
        for (int i10 = 0; i10 < zzhjjVar.zzd(); i10++) {
            zzhbi zzhbiVarZze = ((zzhbk) zzhjjVar).zze(i10);
            if (zzhbiVarZze.zzb().equals(zzhbb.zza)) {
                zzhlx zzhlxVar = (zzhlx) zzhkzVar.zza(zzhbiVarZze);
                zzhaz zzhazVarZza = zzhbiVarZze.zza();
                if (zzhazVarZza instanceof zzhmm) {
                    zzhyeVarZzd = ((zzhmm) zzhazVarZza).zze();
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
                zzhkpVar.zza(zzhyeVarZzd, zzhlxVar);
            }
        }
        return new zzhly(zzhkpVar.zzb(), (zzhlx) zzhkzVar.zza(zzhbiVarZzc), null);
    }
}
