package com.fyber.inneractive.sdk.dv.rewarded;

import com.google.android.gms.ads.FullScreenContentCallback;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends FullScreenContentCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f20549a;

    public b(d dVar) {
        this.f20549a = dVar;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdDismissedFullScreenContent() {
        com.fyber.inneractive.sdk.dv.interstitial.a aVar = this.f20549a.f20109j;
        if (aVar != null) {
            aVar.h();
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdImpression() {
        com.fyber.inneractive.sdk.dv.interstitial.a aVar = this.f20549a.f20109j;
        if (aVar != null) {
            aVar.w();
        }
    }
}
