package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
final class zzbnl implements zzgzl {
    final /* synthetic */ zzcjl zza;

    zzbnl(zzcjl zzcjlVar) {
        this.zza = zzcjlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th2) {
        com.google.android.gms.ads.internal.zzt.zzh().zzg(th2, "DefaultGmsgHandlers.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = (String) obj;
        zzcjl zzcjlVar = this.zza;
        new com.google.android.gms.ads.internal.util.zzbt(zzcjlVar.getContext(), zzcjlVar.zzs().afmaVersion, str, null, zzcjlVar.zzC() != null ? zzcjlVar.zzC().zzax : null).zzb();
    }
}
