package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzfse extends zzcbf {
    final /* synthetic */ zzhah zza;
    final /* synthetic */ zzcaz zzb;
    final /* synthetic */ zzfsf zzc;

    zzfse(zzfsf zzfsfVar, zzhah zzhahVar, zzcaz zzcazVar) {
        this.zza = zzhahVar;
        this.zzb = zzcazVar;
        Objects.requireNonNull(zzfsfVar);
        this.zzc = zzfsfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zze() {
        Objects.requireNonNull(this.zzc);
        zzfqt.zza(this.zzb, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzf(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) {
        String string = zzeVar.zzb().toString();
        zzfsf zzfsfVar = this.zzc;
        String str = zzfsfVar.zze.zza;
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 51 + String.valueOf(str).length());
        sb2.append("Failed to load rewarded ad with error: ");
        sb2.append(string);
        sb2.append(", adUnitId: ");
        sb2.append(str);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2.toString());
        zzfsfVar.zzD(zzeVar);
    }
}
