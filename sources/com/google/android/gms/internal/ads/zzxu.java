package com.google.android.gms.internal.ads;

import android.os.Looper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class zzxu extends zzvj implements zzxi {
    private final zzha zza;
    private final zzxc zzb;
    private final zzto zzc;
    private final int zzd;
    private boolean zze = true;
    private long zzf = -9223372036854775807L;
    private boolean zzg;
    private boolean zzh;

    @Nullable
    private zzhz zzi;

    @GuardedBy("this")
    private zzak zzj;
    private final zzaaw zzk;

    /* synthetic */ zzxu(zzak zzakVar, zzha zzhaVar, zzxc zzxcVar, zzto zztoVar, zzaaw zzaawVar, int i10, boolean z10, int i11, zzv zzvVar, zzgru zzgruVar, byte[] bArr) {
        this.zzj = zzakVar;
        this.zza = zzhaVar;
        this.zzb = zzxcVar;
        this.zzc = zztoVar;
        this.zzk = zzaawVar;
        this.zzd = i10;
    }

    private final void zzu() {
        long j10 = this.zzf;
        boolean z10 = this.zzg;
        boolean z11 = this.zzh;
        zzak zzakVarZzJ = zzJ();
        zzbf zzygVar = new zzyg(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j10, j10, 0L, 0L, z10, false, false, null, zzakVarZzJ, z11 ? zzakVarZzJ.zzc : null);
        if (this.zze) {
            zzygVar = new zzxr(this, zzygVar);
        }
        zze(zzygVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvj, com.google.android.gms.internal.ads.zzwm
    public final synchronized void zzA(zzak zzakVar) {
        this.zzj = zzakVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final void zzD(zzwi zzwiVar) {
        ((zzxq) zzwiVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final zzwi zzG(zzwk zzwkVar, zzaan zzaanVar, long j10) {
        zzhb zzhbVarZza = this.zza.zza();
        zzhz zzhzVar = this.zzi;
        if (zzhzVar != null) {
            zzhbVarZza.zze(zzhzVar);
        }
        zzag zzagVar = zzJ().zzb;
        zzagVar.getClass();
        return new zzxq(zzagVar.zza, zzhbVarZza, this.zzb.zza(zzk()), this.zzc, zzh(zzwkVar), this.zzk, zzf(zzwkVar), this, zzaanVar, null, this.zzd, false, 0, null, zzfj.zzq(-9223372036854775807L), null);
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final synchronized zzak zzJ() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    protected final void zza(@Nullable zzhz zzhzVar) {
        this.zzi = zzhzVar;
        Looper.myLooper().getClass();
        zzk();
        zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final void zzb(long j10, zzafy zzafyVar, boolean z10) {
        if (j10 == -9223372036854775807L) {
            j10 = this.zzf;
        }
        boolean zZzb = zzafyVar.zzb();
        if (!this.zze && this.zzf == j10 && this.zzg == zZzb && this.zzh == z10) {
            return;
        }
        this.zzf = j10;
        this.zzg = zZzb;
        this.zzh = z10;
        this.zze = false;
        zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    protected final void zzd() {
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final void zzt() {
    }
}
