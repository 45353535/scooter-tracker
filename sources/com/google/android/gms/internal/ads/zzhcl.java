package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhcl implements zzhla {
    private static final zzhcl zza = new zzhcl();
    private static final zzhku zzb = zzhku.zzd(zzhcj.zza, zzhjo.class, zzhas.class);

    zzhcl() {
    }

    public static void zzc() throws GeneralSecurityException {
        zzhkd.zza().zzc(zza);
        zzhkd.zza().zzb(zzb);
    }

    public static void zzd(zzhkv zzhkvVar) throws GeneralSecurityException {
        zzhkvVar.zzb(zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhla
    public final Class zza() {
        return zzhas.class;
    }

    @Override // com.google.android.gms.internal.ads.zzhla
    public final Class zzb() {
        return zzhas.class;
    }

    @Override // com.google.android.gms.internal.ads.zzhla
    public final /* bridge */ /* synthetic */ Object zze(zzhjj zzhjjVar, zzhjr zzhjrVar, zzhkz zzhkzVar) throws GeneralSecurityException {
        zzhjs zzhjsVar;
        zzhjs zzhjsVarZza;
        zzhye zzhyeVarZzd;
        zzhkp zzhkpVar = new zzhkp();
        for (int i10 = 0; i10 < zzhjjVar.zzd(); i10++) {
            zzhbi zzhbiVarZze = ((zzhbk) zzhjjVar).zze(i10);
            if (zzhbiVarZze.zzb().equals(zzhbb.zza)) {
                zzhaz zzhazVarZza = zzhbiVarZze.zza();
                if (zzhazVarZza instanceof zzhcg) {
                    zzhyeVarZzd = ((zzhcg) zzhazVarZza).zzc();
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
                zzhkpVar.zza(zzhyeVarZzd, new zzhci((zzhas) zzhkzVar.zza(zzhbiVarZze), zzhbiVarZze.zzc()));
            }
        }
        if (zzhjrVar.zza()) {
            zzhjsVar = zzhjv.zza;
            zzhjsVarZza = zzhjsVar;
        } else {
            zzhjt zzhjtVarZzb = zzhkb.zza().zzb();
            zzhjs zzhjsVarZza2 = zzhjtVarZzb.zza(zzhjjVar, zzhjrVar, "aead", "encrypt");
            zzhjsVarZza = zzhjtVarZzb.zza(zzhjjVar, zzhjrVar, "aead", "decrypt");
            zzhjsVar = zzhjsVarZza2;
        }
        zzhbk zzhbkVar = (zzhbk) zzhjjVar;
        return new zzhck(new zzhci((zzhas) zzhkzVar.zza(zzhbkVar.zzc()), zzhbkVar.zzc().zzc()), zzhkpVar.zzb(), zzhjsVar, zzhjsVarZza, null);
    }
}
