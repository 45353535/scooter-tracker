package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.LoadAdError;
import j$.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
final class zzel extends zzbc {
    final /* synthetic */ zzen zza;

    zzel(zzen zzenVar) {
        Objects.requireNonNull(zzenVar);
        this.zza = zzenVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbc, com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        zzen zzenVar = this.zza;
        zzenVar.zzE().zza(zzenVar.zzz());
        super.onAdFailedToLoad(loadAdError);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbc, com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        zzen zzenVar = this.zza;
        zzenVar.zzE().zza(zzenVar.zzz());
        super.onAdLoaded();
    }
}
