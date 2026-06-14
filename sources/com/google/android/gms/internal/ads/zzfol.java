package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
final class zzfol implements zzgzl {
    final /* synthetic */ zzfoo zza;
    final /* synthetic */ zzfoe zzb;

    zzfol(zzfoo zzfooVar, zzfoe zzfoeVar) {
        this.zza = zzfooVar;
        this.zzb = zzfoeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th2) {
        zzfoe zzfoeVar = this.zzb;
        zzfoeVar.zzj(th2);
        zzfoeVar.zzd(false);
        this.zza.zza(zzfoeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zzb(Object obj) {
    }
}
