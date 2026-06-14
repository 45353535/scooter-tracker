package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzwc implements zzwi, zzwh {
    public final zzwk zza;
    private final long zzb;
    private final zzaan zzc;
    private zzwm zzd;
    private zzwi zze;

    @Nullable
    private zzwh zzf;
    private long zzg = -9223372036854775807L;

    public zzwc(zzwk zzwkVar, zzaan zzaanVar, long j10) {
        this.zza = zzwkVar;
        this.zzc = zzaanVar;
        this.zzb = j10;
    }

    private final long zzv(long j10) {
        long j11 = this.zzg;
        return j11 != -9223372036854775807L ? j11 : j10;
    }

    public final long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final void zzb(zzwh zzwhVar, long j10) {
        this.zzf = zzwhVar;
        zzwi zzwiVar = this.zze;
        if (zzwiVar != null) {
            zzwiVar.zzb(this, zzv(this.zzb));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final void zzc() throws IOException {
        zzwi zzwiVar = this.zze;
        if (zzwiVar != null) {
            zzwiVar.zzc();
            return;
        }
        zzwm zzwmVar = this.zzd;
        if (zzwmVar != null) {
            zzwmVar.zzt();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final zzyn zzd() {
        zzwi zzwiVar = this.zze;
        String str = zzfj.zza;
        return zzwiVar.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zze(zzaac[] zzaacVarArr, boolean[] zArr, zzyc[] zzycVarArr, boolean[] zArr2, long j10) {
        long j11 = this.zzg;
        long j12 = (j11 == -9223372036854775807L || j10 != this.zzb) ? j10 : j11;
        this.zzg = -9223372036854775807L;
        zzwi zzwiVar = this.zze;
        String str = zzfj.zza;
        return zzwiVar.zze(zzaacVarArr, zArr, zzycVarArr, zArr2, j12);
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final void zzf(long j10, boolean z10) {
        zzwi zzwiVar = this.zze;
        String str = zzfj.zza;
        zzwiVar.zzf(j10, false);
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final void zzg(long j10) {
        zzwi zzwiVar = this.zze;
        String str = zzfj.zza;
        zzwiVar.zzg(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zzh() {
        zzwi zzwiVar = this.zze;
        String str = zzfj.zza;
        return zzwiVar.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final long zzi() {
        zzwi zzwiVar = this.zze;
        String str = zzfj.zza;
        return zzwiVar.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zzj(long j10) {
        zzwi zzwiVar = this.zze;
        String str = zzfj.zza;
        return zzwiVar.zzj(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zzk(long j10, zzmt zzmtVar) {
        zzwi zzwiVar = this.zze;
        String str = zzfj.zza;
        return zzwiVar.zzk(j10, zzmtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final long zzl() {
        zzwi zzwiVar = this.zze;
        String str = zzfj.zza;
        return zzwiVar.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final boolean zzm(zzll zzllVar) {
        zzwi zzwiVar = this.zze;
        return zzwiVar != null && zzwiVar.zzm(zzllVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final boolean zzn() {
        zzwi zzwiVar = this.zze;
        return zzwiVar != null && zzwiVar.zzn();
    }

    public final void zzo(long j10) {
        this.zzg = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final void zzp(zzwi zzwiVar) {
        zzwh zzwhVar = this.zzf;
        String str = zzfj.zza;
        zzwhVar.zzp(this);
    }

    public final long zzq() {
        return this.zzg;
    }

    public final void zzr(zzwm zzwmVar) {
        zzgrc.zzi(this.zzd == null);
        this.zzd = zzwmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzyd
    public final /* bridge */ /* synthetic */ void zzs(zzye zzyeVar) {
        zzwh zzwhVar = this.zzf;
        String str = zzfj.zza;
        zzwhVar.zzs(this);
    }

    public final void zzt(zzwk zzwkVar) {
        long jZzv = zzv(this.zzb);
        zzwm zzwmVar = this.zzd;
        zzwmVar.getClass();
        zzwi zzwiVarZzG = zzwmVar.zzG(zzwkVar, this.zzc, jZzv);
        this.zze = zzwiVarZzG;
        if (this.zzf != null) {
            zzwiVarZzG.zzb(this, jZzv);
        }
    }

    public final void zzu() {
        zzwi zzwiVar = this.zze;
        if (zzwiVar != null) {
            zzwm zzwmVar = this.zzd;
            zzwmVar.getClass();
            zzwmVar.zzD(zzwiVar);
        }
    }
}
