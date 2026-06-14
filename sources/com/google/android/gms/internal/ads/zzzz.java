package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzzz extends zzzs {
    private final boolean zze;
    private final zzzl zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final int zzn;
    private final int zzo;
    private final int zzp;
    private final boolean zzq;
    private final int zzr;
    private final int zzs;
    private final boolean zzt;
    private final boolean zzu;
    private final int zzv;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:120:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzzz(int r5, com.google.android.gms.internal.ads.zzbg r6, int r7, com.google.android.gms.internal.ads.zzzl r8, int r9, @androidx.annotation.Nullable java.lang.String r10, int r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzzz.<init>(int, com.google.android.gms.internal.ads.zzbg, int, com.google.android.gms.internal.ads.zzzl, int, java.lang.String, int, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzi(zzzz zzzzVar, zzzz zzzzVar2) {
        zzgts zzgtsVarZza = zzgts.zzg().zzd(zzzzVar.zzh, zzzzVar2.zzh).zza(Integer.valueOf(zzzzVar.zzm), Integer.valueOf(zzzzVar2.zzm), zzgvz.zzb().zza()).zzb(zzzzVar.zzn, zzzzVar2.zzn).zzb(zzzzVar.zzo, zzzzVar2.zzo).zza(Integer.valueOf(zzzzVar.zzp), Integer.valueOf(zzzzVar2.zzp), zzgvz.zzb().zza()).zzd(zzzzVar.zzq, zzzzVar2.zzq).zzb(zzzzVar.zzr, zzzzVar2.zzr).zzd(zzzzVar.zzi, zzzzVar2.zzi).zzd(zzzzVar.zze, zzzzVar2.zze).zzd(zzzzVar.zzg, zzzzVar2.zzg).zza(Integer.valueOf(zzzzVar.zzl), Integer.valueOf(zzzzVar2.zzl), zzgvz.zzb().zza());
        boolean z10 = zzzzVar.zzt;
        zzgts zzgtsVarZzd = zzgtsVarZza.zzd(z10, zzzzVar2.zzt);
        boolean z11 = zzzzVar.zzu;
        zzgts zzgtsVarZzd2 = zzgtsVarZzd.zzd(z11, zzzzVar2.zzu);
        if (z10 && z11) {
            zzgtsVarZzd2 = zzgtsVarZzd2.zzb(zzzzVar.zzv, zzzzVar2.zzv);
        }
        return zzgtsVarZzd2.zze();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzj(zzzz zzzzVar, zzzz zzzzVar2) {
        zzgvz zzgvzVarZza = (zzzzVar.zze && zzzzVar.zzh) ? zzaaa.zzc : zzaaa.zzc.zza();
        zzgts zzgtsVarZzg = zzgts.zzg();
        boolean z10 = zzzzVar.zzf.zzF;
        return zzgtsVarZzg.zza(Integer.valueOf(zzzzVar.zzk), Integer.valueOf(zzzzVar2.zzk), zzgvzVarZza).zza(Integer.valueOf(zzzzVar.zzj), Integer.valueOf(zzzzVar2.zzj), zzgvzVarZza).zze();
    }

    @Override // com.google.android.gms.internal.ads.zzzs
    public final int zza() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzzs
    public final /* bridge */ /* synthetic */ boolean zzc(zzzs zzzsVar) {
        zzzz zzzzVar = (zzzz) zzzsVar;
        if (!Objects.equals(this.zzd.zzo, zzzzVar.zzd.zzo)) {
            return false;
        }
        boolean z10 = this.zzf.zzN;
        return this.zzt == zzzzVar.zzt && this.zzu == zzzzVar.zzu;
    }
}
