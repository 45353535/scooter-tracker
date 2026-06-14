package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
final class zzzq extends zzzs implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final boolean zzn;

    public zzzq(int i10, zzbg zzbgVar, int i11, zzzl zzzlVar, int i12, @Nullable String str, @Nullable String str2) {
        int iZzj;
        super(i10, zzbgVar, i11);
        int i13 = 0;
        this.zzf = p1.c(i12, false);
        int i14 = this.zzd.zze;
        int i15 = zzzlVar.zzC;
        this.zzg = 1 == (i14 & 1);
        this.zzh = (i14 & 2) != 0;
        zzguf zzgufVarZzj = str2 != null ? zzguf.zzj(str2) : zzzlVar.zzy.isEmpty() ? zzguf.zzj("") : zzzlVar.zzy;
        int i16 = 0;
        while (true) {
            if (i16 >= zzgufVarZzj.size()) {
                iZzj = 0;
                i16 = Integer.MAX_VALUE;
                break;
            } else {
                iZzj = zzaaa.zzj(this.zzd, (String) zzgufVarZzj.get(i16), false);
                if (iZzj > 0) {
                    break;
                } else {
                    i16++;
                }
            }
        }
        this.zzi = i16;
        this.zzj = iZzj;
        int iZzm = zzaaa.zzm(this.zzd.zzf, str2 != null ? 1088 : 0);
        this.zzk = iZzm;
        zzv zzvVar = this.zzd;
        this.zzn = (1088 & zzvVar.zzf) != 0;
        int iZzn = zzaaa.zzn(zzvVar, zzzlVar.zzz);
        this.zzl = iZzn;
        int iZzj2 = zzaaa.zzj(this.zzd, str, zzaaa.zzi(str) == null);
        this.zzm = iZzj2;
        boolean z10 = iZzj > 0 || (zzzlVar.zzy.isEmpty() && iZzm > 0) || ((zzzlVar.zzy.isEmpty() && iZzn != Integer.MAX_VALUE) || this.zzg || (this.zzh && iZzj2 > 0));
        if (p1.c(i12, zzzlVar.zzV) && z10) {
            i13 = 1;
        }
        this.zze = i13;
    }

    @Override // com.google.android.gms.internal.ads.zzzs
    public final int zza() {
        return this.zze;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzzq zzzqVar) {
        zzgts zzgtsVarZza = zzgts.zzg().zzd(this.zzf, zzzqVar.zzf).zza(Integer.valueOf(this.zzi), Integer.valueOf(zzzqVar.zzi), zzgvz.zzb().zza());
        int i10 = this.zzj;
        zzgts zzgtsVarZzb = zzgtsVarZza.zzb(i10, zzzqVar.zzj);
        int i11 = this.zzk;
        zzgts zzgtsVarZzb2 = zzgtsVarZzb.zzb(i11, zzzqVar.zzk).zza(Integer.valueOf(this.zzl), Integer.valueOf(zzzqVar.zzl), zzgvz.zzb().zza()).zzd(this.zzg, zzzqVar.zzg).zza(Boolean.valueOf(this.zzh), Boolean.valueOf(zzzqVar.zzh), i10 == 0 ? zzgvz.zzb() : zzgvz.zzb().zza()).zzb(this.zzm, zzzqVar.zzm);
        if (i11 == 0) {
            zzgtsVarZzb2 = zzgtsVarZzb2.zzc(this.zzn, zzzqVar.zzn);
        }
        return zzgtsVarZzb2.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzzs
    public final /* bridge */ /* synthetic */ boolean zzc(zzzs zzzsVar) {
        return false;
    }
}
