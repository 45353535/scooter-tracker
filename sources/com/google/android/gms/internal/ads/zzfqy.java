package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzfqy extends zzbez {
    final /* synthetic */ zzhah zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzft zzb;
    final /* synthetic */ zzfqz zzc;

    zzfqy(zzfqz zzfqzVar, zzhah zzhahVar, com.google.android.gms.ads.internal.client.zzft zzftVar) {
        this.zza = zzhahVar;
        this.zzb = zzftVar;
        Objects.requireNonNull(zzfqzVar);
        this.zzc = zzfqzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final void zzb(zzbex zzbexVar) {
        Objects.requireNonNull(this.zzc);
        zzfqt.zza(zzbexVar, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final void zzc(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final void zzd(com.google.android.gms.ads.internal.client.zze zzeVar) {
        String string = zzeVar.zzb().toString();
        String str = this.zzb.zza;
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 60 + String.valueOf(str).length());
        sb2.append("Failed to load app open ad with error parcel: ");
        sb2.append(string);
        sb2.append(" for ad unit: ");
        sb2.append(str);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2.toString());
        zzfqz zzfqzVar = this.zzc;
        Objects.requireNonNull(zzfqzVar);
        zzfqzVar.zzD(zzeVar);
    }
}
