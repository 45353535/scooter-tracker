package com.google.android.gms.internal.ads;

import android.view.Surface;
import androidx.annotation.Nullable;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes8.dex */
final class zzabt implements zzadr {
    private final zzacs zza;
    private final zzact zzb;
    private final zzada zzc;
    private final Queue zzd;

    @Nullable
    private Surface zze;
    private zzv zzf;
    private long zzg;
    private zzado zzh;
    private Executor zzi;
    private zzacp zzj;

    public zzabt(zzacs zzacsVar, zzact zzactVar, zzdn zzdnVar) {
        this.zza = zzacsVar;
        this.zzb = zzactVar;
        zzacsVar.zzg(zzdnVar);
        this.zzc = new zzada(new zzabs(this, null), zzacsVar, zzactVar);
        this.zzd = new ArrayDeque();
        this.zzf = new zzt().zzM();
        this.zzg = -9223372036854775807L;
        this.zzh = zzado.zzb;
        this.zzi = zzabo.zza;
        this.zzj = zzabm.zza;
    }

    final /* synthetic */ Surface zzA() {
        return this.zze;
    }

    final /* synthetic */ zzado zzB() {
        return this.zzh;
    }

    final /* synthetic */ Executor zzC() {
        return this.zzi;
    }

    final /* synthetic */ zzacp zzD() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zza() {
        this.zzb.zzd();
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzb() {
        this.zzb.zzd();
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzc(zzado zzadoVar, Executor executor) {
        this.zzh = zzadoVar;
        this.zzi = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final boolean zzd(zzv zzvVar) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final boolean zze() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzf() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzg(boolean z10) {
        if (z10) {
            this.zza.zzl();
        }
        this.zzb.zzd();
        this.zzc.zza();
        this.zzd.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final boolean zzh(boolean z10) {
        return this.zza.zzi(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzi() {
        this.zzc.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final boolean zzj() {
        return this.zzc.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final Surface zzk() {
        Surface surface = this.zze;
        surface.getClass();
        return surface;
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzl(zzacp zzacpVar) {
        this.zzj = zzacpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzm(float f10) {
        this.zza.zzn(f10);
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzn(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzo(long j10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzp(Surface surface, zzes zzesVar) {
        this.zze = surface;
        this.zza.zzd(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzq() {
        this.zze = null;
        this.zza.zzd(null);
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzr(int i10) {
        this.zza.zzm(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzs(int i10, zzv zzvVar, long j10, int i11, List list) {
        zzgrc.zzi(list.isEmpty());
        int i12 = zzvVar.zzv;
        zzv zzvVar2 = this.zzf;
        if (i12 != zzvVar2.zzv || zzvVar.zzw != zzvVar2.zzw) {
            this.zzc.zzc(i12, zzvVar.zzw);
        }
        float f10 = zzvVar.zzz;
        if (f10 != this.zzf.zzz) {
            this.zza.zze(f10);
        }
        this.zzf = zzvVar;
        if (j10 != this.zzg) {
            this.zzc.zzd(i11, j10);
            this.zzg = j10;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzt() {
        this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final boolean zzu(long j10, zzadp zzadpVar) {
        this.zzd.add(zzadpVar);
        this.zzc.zze(j10);
        this.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzy();
            }
        });
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzv(long j10, long j11) throws zzadq {
        try {
            this.zzc.zzb(j10, j11);
        } catch (zziw e10) {
            throw new zzadq(e10, this.zzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzw(boolean z10) {
        this.zza.zzj(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzx() {
    }

    final /* synthetic */ void zzy() {
        this.zzh.zza();
    }

    final /* synthetic */ Queue zzz() {
        return this.zzd;
    }
}
