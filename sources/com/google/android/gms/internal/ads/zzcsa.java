package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzcsa implements zzgzl {
    final /* synthetic */ zzcsh zza;

    zzcsa(zzcsh zzcshVar) {
        Objects.requireNonNull(zzcshVar);
        this.zza = zzcshVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th2) {
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcsh zzcshVar = this.zza;
        zzcshVar.zzu().zzb(zzcshVar.zzt().zzb(zzcshVar.zzr(), zzcshVar.zzs(), false, "", (String) obj, zzcshVar.zzs().zzc, null, null), true == com.google.android.gms.ads.internal.zzt.zzh().zzs(zzcshVar.zzq()) ? 2 : 1);
    }
}
