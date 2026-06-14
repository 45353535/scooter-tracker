package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
final class zzyk implements zzwi, zzwh {
    private final zzwi zza;
    private final long zzb;
    private zzwh zzc;

    public zzyk(zzwi zzwiVar, long j10) {
        this.zza = zzwiVar;
        this.zzb = j10;
    }

    public final zzwi zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final void zzb(zzwh zzwhVar, long j10) {
        this.zzc = zzwhVar;
        this.zza.zzb(this, j10 - this.zzb);
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
        zzyc[] zzycVarArr2 = new zzyc[zzycVarArr.length];
        int i10 = 0;
        while (true) {
            zzyc zzycVarZza = null;
            if (i10 >= zzycVarArr.length) {
                break;
            }
            zzyj zzyjVar = (zzyj) zzycVarArr[i10];
            if (zzyjVar != null) {
                zzycVarZza = zzyjVar.zza();
            }
            zzycVarArr2[i10] = zzycVarZza;
            i10++;
        }
        zzwi zzwiVar = this.zza;
        long j11 = this.zzb;
        long jZze = zzwiVar.zze(zzaacVarArr, zArr, zzycVarArr2, zArr2, j10 - j11);
        for (int i11 = 0; i11 < zzycVarArr.length; i11++) {
            zzyc zzycVar = zzycVarArr2[i11];
            if (zzycVar == null) {
                zzycVarArr[i11] = null;
            } else {
                zzyc zzycVar2 = zzycVarArr[i11];
                if (zzycVar2 == null || ((zzyj) zzycVar2).zza() != zzycVar) {
                    zzycVarArr[i11] = new zzyj(zzycVar, j11);
                }
            }
        }
        return jZze + j11;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final void zzf(long j10, boolean z10) {
        this.zza.zzf(j10 - this.zzb, false);
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final void zzg(long j10) {
        this.zza.zzg(j10 - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zzh() {
        long jZzh = this.zza.zzh();
        if (jZzh == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jZzh + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final long zzi() {
        long jZzi = this.zza.zzi();
        if (jZzi == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzi + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zzj(long j10) {
        long j11 = this.zzb;
        return this.zza.zzj(j10 - j11) + j11;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zzk(long j10, zzmt zzmtVar) {
        long j11 = this.zzb;
        return this.zza.zzk(j10 - j11, zzmtVar) + j11;
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final long zzl() {
        long jZzl = this.zza.zzl();
        if (jZzl == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzl + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final boolean zzm(zzll zzllVar) {
        long j10 = zzllVar.zza;
        long j11 = this.zzb;
        zzlk zzlkVarZza = zzllVar.zza();
        zzlkVarZza.zza(j10 - j11);
        return this.zza.zzm(zzlkVarZza.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final boolean zzn() {
        return this.zza.zzn();
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
