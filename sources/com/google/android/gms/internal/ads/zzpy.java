package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzpy {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;

    public final zzpy zza(boolean z10) {
        this.zza = z10;
        return this;
    }

    public final zzpy zzb(boolean z10) {
        this.zzb = z10;
        return this;
    }

    public final zzpy zzc(boolean z10) {
        this.zzc = z10;
        return this;
    }

    public final zzpz zzd() {
        if (this.zza || !(this.zzb || this.zzc)) {
            return new zzpz(this, null);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }

    final /* synthetic */ boolean zze() {
        return this.zza;
    }

    final /* synthetic */ boolean zzf() {
        return this.zzb;
    }

    final /* synthetic */ boolean zzg() {
        return this.zzc;
    }
}
