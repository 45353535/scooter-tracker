package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzfrb extends com.google.android.gms.ads.internal.client.zzbm {
    final /* synthetic */ zzhah zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzbx zzb;
    final /* synthetic */ zzfrc zzc;

    zzfrb(zzfrc zzfrcVar, zzhah zzhahVar, com.google.android.gms.ads.internal.client.zzbx zzbxVar) {
        this.zza = zzhahVar;
        this.zzb = zzbxVar;
        Objects.requireNonNull(zzfrcVar);
        this.zzc = zzfrcVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zzb() {
        Objects.requireNonNull(this.zzc);
        zzfqt.zza(this.zzb, this.zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        String string = zzeVar.zzb().toString();
        zzfrc zzfrcVar = this.zzc;
        String str = zzfrcVar.zze.zza;
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 57 + String.valueOf(str).length());
        sb2.append("Failed to load interstitial ad with error: ");
        sb2.append(string);
        sb2.append(" for ad unit: ");
        sb2.append(str);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2.toString());
        zzfrcVar.zzD(zzeVar);
    }
}
