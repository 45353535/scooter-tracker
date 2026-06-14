package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzqg {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;
    private int zzd = 0;

    public final zzqg zza(boolean z10) {
        this.zza = z10;
        return this;
    }

    public final zzqg zzb(boolean z10) {
        this.zzb = z10;
        return this;
    }

    public final zzqg zzc(boolean z10) {
        this.zzc = z10;
        return this;
    }

    public final zzqg zzd(int i10) {
        this.zzd = i10;
        return this;
    }

    public final zzqh zze() {
        if (this.zza || !(this.zzb || this.zzc)) {
            return new zzqh(this, null);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
    }

    final /* synthetic */ boolean zzf() {
        return this.zza;
    }

    final /* synthetic */ boolean zzg() {
        return this.zzb;
    }

    final /* synthetic */ boolean zzh() {
        return this.zzc;
    }

    final /* synthetic */ int zzi() {
        return this.zzd;
    }
}
