package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class zzafr {
    public int zza;

    @Nullable
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;

    public zzafr() {
    }

    public final boolean zza(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        if (!zzafs.zzl(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return false;
        }
        int i15 = i13 - 1;
        this.zza = i11;
        this.zzb = zzafs.zza[3 - i12];
        int i16 = zzafs.zzb[i14];
        this.zzd = i16;
        if (i11 == 2) {
            i16 /= 2;
            this.zzd = i16;
        } else if (i11 == 0) {
            i16 /= 4;
            this.zzd = i16;
        }
        int i17 = (i10 >>> 9) & 1;
        this.zzg = zzafs.zzm(i11, i12);
        if (i12 == 3) {
            int i18 = i11 == 3 ? zzafs.zzc[i15] : zzafs.zzd[i15];
            this.zzf = i18;
            this.zzc = (((i18 * 12) / i16) + i17) * 4;
        } else {
            if (i11 == 3) {
                int i19 = i12 == 2 ? zzafs.zze[i15] : zzafs.zzf[i15];
                this.zzf = i19;
                this.zzc = ((i19 * 144) / i16) + i17;
            } else {
                int i20 = zzafs.zzg[i15];
                this.zzf = i20;
                this.zzc = (((i12 == 1 ? 72 : 144) * i20) / i16) + i17;
            }
        }
        this.zze = ((i10 >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }

    public zzafr(zzafr zzafrVar) {
        this.zza = zzafrVar.zza;
        this.zzb = zzafrVar.zzb;
        this.zzc = zzafrVar.zzc;
        this.zzd = zzafrVar.zzd;
        this.zze = zzafrVar.zze;
        this.zzf = zzafrVar.zzf;
        this.zzg = zzafrVar.zzg;
    }
}
