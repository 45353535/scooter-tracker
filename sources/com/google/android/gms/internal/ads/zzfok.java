package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
final class zzfok implements zzgzl {
    final /* synthetic */ zzfoo zza;
    final /* synthetic */ zzfoe zzb;
    final /* synthetic */ boolean zzc;

    zzfok(zzfoo zzfooVar, zzfoe zzfoeVar, boolean z10) {
        this.zza = zzfooVar;
        this.zzb = zzfoeVar;
        this.zzc = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th2) {
        zzfoe zzfoeVar = this.zzb;
        if (zzfoeVar.zzb()) {
            zzfoo zzfooVar = this.zza;
            zzfoeVar.zzj(th2);
            zzfoeVar.zzd(false);
            zzfooVar.zza(zzfoeVar);
            if (this.zzc) {
                zzfooVar.zzh();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zzb(Object obj) {
        zzfoe zzfoeVar = this.zzb;
        zzfoeVar.zzd(true);
        zzfoo zzfooVar = this.zza;
        zzfooVar.zza(zzfoeVar);
        if (this.zzc) {
            zzfooVar.zzh();
        }
    }
}
