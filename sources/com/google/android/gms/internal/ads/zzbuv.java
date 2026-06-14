package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbuv extends zzbub {
    private final MediationInterscrollerAd zza;

    public zzbuv(MediationInterscrollerAd mediationInterscrollerAd) {
        this.zza = mediationInterscrollerAd;
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final IObjectWrapper zze() {
        return ObjectWrapper.wrap(this.zza.getView());
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final boolean zzf() {
        return this.zza.shouldDelegateInterscrollerEffect();
    }
}
