package com.fyber.inneractive.sdk.dv.interstitial;

import com.google.android.gms.ads.AdListener;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends AdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f20543a;

    public f(g gVar) {
        this.f20543a = gVar;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        a aVar = this.f20543a.f20109j;
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        a aVar = this.f20543a.f20109j;
        if (aVar != null) {
            aVar.h();
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        a aVar = this.f20543a.f20109j;
        if (aVar != null) {
            aVar.w();
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        a aVar = this.f20543a.f20109j;
        if (aVar != null) {
            aVar.w();
        }
    }
}
