package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzyx extends zzzs implements Comparable {
    private final int zze;
    private final boolean zzf;

    @Nullable
    private final String zzg;
    private final zzzl zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final boolean zzn;
    private final int zzo;
    private final int zzp;
    private final boolean zzq;
    private final int zzr;
    private final int zzs;
    private final int zzt;
    private final int zzu;
    private final boolean zzv;
    private final boolean zzw;
    private final boolean zzx;

    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b5 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzyx(int r14, com.google.android.gms.internal.ads.zzbg r15, int r16, com.google.android.gms.internal.ads.zzzl r17, int r18, boolean r19, com.google.android.gms.internal.ads.zzgrd r20, int r21) {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyx.<init>(int, com.google.android.gms.internal.ads.zzbg, int, com.google.android.gms.internal.ads.zzzl, int, boolean, com.google.android.gms.internal.ads.zzgrd, int):void");
    }

    @Override // com.google.android.gms.internal.ads.zzzs
    public final int zza() {
        return this.zze;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzyx zzyxVar) {
        boolean z10 = this.zzf;
        zzgvz zzgvzVarZza = (z10 && this.zzi) ? zzaaa.zzc : zzaaa.zzc.zza();
        zzgts zzgtsVarZza = zzgts.zzg().zzd(this.zzi, zzyxVar.zzi).zza(Integer.valueOf(this.zzk), Integer.valueOf(zzyxVar.zzk), zzgvz.zzb().zza()).zzb(this.zzj, zzyxVar.zzj).zzb(this.zzl, zzyxVar.zzl).zza(Integer.valueOf(this.zzm), Integer.valueOf(zzyxVar.zzm), zzgvz.zzb().zza()).zzd(this.zzq, zzyxVar.zzq).zzd(this.zzn, zzyxVar.zzn).zza(Integer.valueOf(this.zzo), Integer.valueOf(zzyxVar.zzo), zzgvz.zzb().zza()).zzb(this.zzp, zzyxVar.zzp).zzd(z10, zzyxVar.zzf).zza(Integer.valueOf(this.zzu), Integer.valueOf(zzyxVar.zzu), zzgvz.zzb().zza());
        boolean z11 = this.zzh.zzF;
        zzgts zzgtsVarZza2 = zzgtsVarZza.zzd(this.zzv, zzyxVar.zzv).zzd(this.zzw, zzyxVar.zzw).zzd(this.zzx, zzyxVar.zzx).zza(Integer.valueOf(this.zzr), Integer.valueOf(zzyxVar.zzr), zzgvzVarZza).zza(Integer.valueOf(this.zzs), Integer.valueOf(zzyxVar.zzs), zzgvzVarZza);
        if (Objects.equals(this.zzg, zzyxVar.zzg)) {
            zzgtsVarZza2 = zzgtsVarZza2.zza(Integer.valueOf(this.zzt), Integer.valueOf(zzyxVar.zzt), zzgvzVarZza);
        }
        return zzgtsVarZza2.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzzs
    public final /* bridge */ /* synthetic */ boolean zzc(zzzs zzzsVar) {
        String str;
        int i10;
        zzyx zzyxVar = (zzyx) zzzsVar;
        boolean z10 = this.zzh.zzR;
        zzv zzvVar = this.zzd;
        int i11 = zzvVar.zzG;
        if (i11 == -1) {
            return false;
        }
        zzv zzvVar2 = zzyxVar.zzd;
        return i11 == zzvVar2.zzG && (str = zzvVar.zzo) != null && TextUtils.equals(str, zzvVar2.zzo) && (i10 = zzvVar.zzH) != -1 && i10 == zzvVar2.zzH && this.zzv == zzyxVar.zzv && this.zzw == zzyxVar.zzw;
    }
}
