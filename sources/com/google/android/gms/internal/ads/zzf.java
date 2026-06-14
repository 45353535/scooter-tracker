package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzf implements zzbb {
    protected final zzbe zza = new zzbe();

    protected zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final boolean zza() {
        return zzh() == 3 && zzk() && zzi() == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzb(long j10) {
        zzc(zzs(), j10, 5, false);
    }

    protected abstract void zzc(int i10, long j10, int i11, boolean z10);
}
