package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzlc {
    public zzmd zza;
    public int zzb;
    public boolean zzc;
    public int zzd;
    private boolean zze;

    public zzlc(zzmd zzmdVar) {
        this.zza = zzmdVar;
    }

    public final void zza(int i10) {
        this.zze = 1 == ((this.zze ? 1 : 0) | i10);
        this.zzb += i10;
    }

    public final void zzb(zzmd zzmdVar) {
        this.zze |= this.zza != zzmdVar;
        this.zza = zzmdVar;
    }

    public final void zzc(int i10) {
        if (this.zzc && this.zzd != 5) {
            zzgrc.zza(i10 == 5);
            return;
        }
        this.zze = true;
        this.zzc = true;
        this.zzd = i10;
    }

    final /* synthetic */ boolean zzd() {
        return this.zze;
    }
}
