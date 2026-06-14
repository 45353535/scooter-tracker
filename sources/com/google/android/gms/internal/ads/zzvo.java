package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzvo implements zzwi, zzwh {
    public final zzwi zza;
    long zzb;

    @Nullable
    private zzwh zzc;
    private zzvn[] zzd = new zzvn[0];
    private long zze = 0;

    public zzvo(zzwi zzwiVar, boolean z10, long j10, long j11) {
        this.zza = zzwiVar;
        this.zzb = j11;
    }

    private static long zzq(long j10, long j11, long j12) {
        long jMax = Math.max(j10, j11);
        return j12 != Long.MIN_VALUE ? Math.min(jMax, j12) : jMax;
    }

    public final void zza(long j10, long j11) {
        this.zzb = j11;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final void zzb(zzwh zzwhVar, long j10) {
        this.zzc = zzwhVar;
        this.zza.zzb(this, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final void zzc() throws IOException {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final zzyn zzd() {
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zze(zzaac[] zzaacVarArr, boolean[] zArr, zzyc[] zzycVarArr, boolean[] zArr2, long j10) {
        int length = zzycVarArr.length;
        this.zzd = new zzvn[length];
        zzyc[] zzycVarArr2 = new zzyc[length];
        int i10 = 0;
        while (true) {
            zzyc zzycVar = null;
            if (i10 >= zzycVarArr.length) {
                break;
            }
            zzvn[] zzvnVarArr = this.zzd;
            zzvn zzvnVar = (zzvn) zzycVarArr[i10];
            zzvnVarArr[i10] = zzvnVar;
            if (zzvnVar != null) {
                zzycVar = zzvnVar.zza;
            }
            zzycVarArr2[i10] = zzycVar;
            i10++;
        }
        long jZze = this.zza.zze(zzaacVarArr, zArr, zzycVarArr2, zArr2, j10);
        long jZzq = zzq(jZze, j10, this.zzb);
        long j11 = -9223372036854775807L;
        if (zzo()) {
            if (jZze < j10) {
                j11 = jZzq;
                break;
            }
            if (jZze != 0) {
                for (zzaac zzaacVar : zzaacVarArr) {
                    if (zzaacVar != null) {
                        zzv zzvVarZzc = zzaacVar.zzc();
                        if (!zzas.zzd(zzvVarZzc.zzo, zzvVarZzc.zzk)) {
                            j11 = jZzq;
                            break;
                        }
                    }
                }
            }
        }
        this.zze = j11;
        for (int i11 = 0; i11 < zzycVarArr.length; i11++) {
            zzyc zzycVar2 = zzycVarArr2[i11];
            if (zzycVar2 == null) {
                this.zzd[i11] = null;
            } else {
                zzvn[] zzvnVarArr2 = this.zzd;
                zzvn zzvnVar2 = zzvnVarArr2[i11];
                if (zzvnVar2 == null || zzvnVar2.zza != zzycVar2) {
                    zzvnVarArr2[i11] = new zzvn(this, zzycVar2);
                }
            }
            zzycVarArr[i11] = this.zzd[i11];
        }
        return jZzq;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final void zzf(long j10, boolean z10) {
        this.zza.zzf(j10, false);
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final void zzg(long j10) {
        this.zza.zzg(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zzh() {
        if (zzo()) {
            long j10 = this.zze;
            this.zze = -9223372036854775807L;
            long jZzh = zzh();
            return jZzh != -9223372036854775807L ? jZzh : j10;
        }
        long jZzh2 = this.zza.zzh();
        if (jZzh2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return zzq(jZzh2, 0L, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final long zzi() {
        long jZzi = this.zza.zzi();
        if (jZzi != Long.MIN_VALUE) {
            long j10 = this.zzb;
            if (j10 == Long.MIN_VALUE || jZzi < j10) {
                return jZzi;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zzj(long j10) {
        this.zze = -9223372036854775807L;
        for (zzvn zzvnVar : this.zzd) {
            if (zzvnVar != null) {
                zzvnVar.zza();
            }
        }
        return zzq(this.zza.zzj(j10), 0L, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zzk(long j10, zzmt zzmtVar) {
        if (j10 == 0) {
            return 0L;
        }
        long j11 = zzmtVar.zzd;
        String str = zzfj.zza;
        long jMax = Math.max(0L, Math.min(j11, j10));
        long j12 = zzmtVar.zze;
        long j13 = this.zzb;
        long jMax2 = Math.max(0L, Math.min(j12, j13 == Long.MIN_VALUE ? Long.MAX_VALUE : j13 - j10));
        if (jMax != j11 || jMax2 != j12) {
            zzmtVar = new zzmt(jMax, jMax2);
        }
        return this.zza.zzk(j10, zzmtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final long zzl() {
        long jZzl = this.zza.zzl();
        if (jZzl != Long.MIN_VALUE) {
            long j10 = this.zzb;
            if (j10 == Long.MIN_VALUE || jZzl < j10) {
                return jZzl;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final boolean zzm(zzll zzllVar) {
        return this.zza.zzm(zzllVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final boolean zzn() {
        return this.zza.zzn();
    }

    final boolean zzo() {
        return this.zze != -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final void zzp(zzwi zzwiVar) {
        zzwh zzwhVar = this.zzc;
        zzwhVar.getClass();
        zzwhVar.zzp(this);
    }

    @Override // com.google.android.gms.internal.ads.zzyd
    public final /* bridge */ /* synthetic */ void zzs(zzye zzyeVar) {
        zzwh zzwhVar = this.zzc;
        zzwhVar.getClass();
        zzwhVar.zzs(this);
    }
}
