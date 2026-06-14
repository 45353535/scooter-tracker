package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
final class zzajs implements zzajr {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final long zzd;
    private final int zze;

    private zzajs(long[] jArr, long[] jArr2, long j10, long j11, long j12, int i10) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j10;
        this.zzd = j12;
        this.zze = i10;
    }

    @Nullable
    public static zzajs zzd(long j10, long j11, zzafr zzafrVar, zzer zzerVar) {
        int iZzs;
        zzer zzerVar2 = zzerVar;
        zzerVar2.zzk(6);
        int iZzB = zzerVar2.zzB();
        long j12 = zzafrVar.zzc;
        long j13 = iZzB;
        if (zzerVar2.zzB() <= 0) {
            return null;
        }
        long jZzr = zzfj.zzr((((long) r4) * ((long) zzafrVar.zzg)) - 1, zzafrVar.zzd);
        int iZzt = zzerVar2.zzt();
        int iZzt2 = zzerVar2.zzt();
        int iZzt3 = zzerVar2.zzt();
        zzerVar2.zzk(2);
        long[] jArr = new long[iZzt];
        long[] jArr2 = new long[iZzt];
        int i10 = 0;
        long j14 = j11 + ((long) zzafrVar.zzc);
        while (i10 < iZzt) {
            long j15 = j12;
            jArr[i10] = (((long) i10) * jZzr) / ((long) iZzt);
            jArr2[i10] = j14;
            if (iZzt3 == 1) {
                iZzs = zzerVar2.zzs();
            } else if (iZzt3 == 2) {
                iZzs = zzerVar2.zzt();
            } else if (iZzt3 == 3) {
                iZzs = zzerVar2.zzx();
            } else {
                if (iZzt3 != 4) {
                    return null;
                }
                iZzs = zzerVar2.zzH();
            }
            j14 += ((long) iZzs) * ((long) iZzt2);
            i10++;
            zzerVar2 = zzerVar;
            iZzt = iZzt;
            j12 = j15;
        }
        long j16 = j11 + j12;
        long jMax = j16 + j13;
        if (j10 != -1 && j10 != jMax) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 27 + String.valueOf(jMax).length());
            sb2.append("VBRI data size mismatch: ");
            sb2.append(j10);
            sb2.append(", ");
            sb2.append(jMax);
            zzee.zzc("VbriSeeker", sb2.toString());
        }
        if (jMax != j14) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(jMax).length() + 43 + String.valueOf(j14).length() + 28);
            sb3.append("VBRI bytes and ToC mismatch (using max): ");
            sb3.append(jMax);
            sb3.append(", ");
            sb3.append(j14);
            sb3.append("\nSeeking will be inaccurate.");
            zzee.zzc("VbriSeeker", sb3.toString());
            jMax = Math.max(jMax, j14);
        }
        return new zzajs(jArr, jArr2, jZzr, j16, jMax, zzafrVar.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final zzafw zzc(long j10) {
        long[] jArr = this.zza;
        int iZzm = zzfj.zzm(jArr, j10, true, true);
        long j11 = jArr[iZzm];
        long[] jArr2 = this.zzb;
        zzafz zzafzVar = new zzafz(j11, jArr2[iZzm]);
        if (zzafzVar.zzb >= j10 || iZzm == jArr.length - 1) {
            return new zzafw(zzafzVar, zzafzVar);
        }
        int i10 = iZzm + 1;
        return new zzafw(zzafzVar, new zzafz(jArr[i10], jArr2[i10]));
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final long zze(long j10) {
        return this.zza[zzfj.zzm(this.zzb, j10, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final long zzf() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final int zzg() {
        return this.zze;
    }
}
