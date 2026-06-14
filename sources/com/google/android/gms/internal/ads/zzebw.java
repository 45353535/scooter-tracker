package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzebw extends AdListener {
    final /* synthetic */ zzecc zza;

    zzebw(zzecc zzeccVar) {
        Objects.requireNonNull(zzeccVar);
        this.zza = zzeccVar;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.zza.zzg(zzecc.zzm(loadAdError));
    }
}
