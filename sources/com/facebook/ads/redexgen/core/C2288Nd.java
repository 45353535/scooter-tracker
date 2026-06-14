package com.facebook.ads.redexgen.core;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAdListener;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2288Nd implements InterstitialAdListener {
    public final /* synthetic */ AbstractC3095hy A00;
    public final /* synthetic */ C3045h4 A01;

    public C2288Nd(C3045h4 c3045h4, AbstractC3095hy abstractC3095hy) {
        this.A01 = c3045h4;
        this.A00 = abstractC3095hy;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(Ad ad2) {
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad2) {
        this.A01.A00.A07.onAdLoaded(this.A01.A00.A08.A6c());
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad2, AdError adError) {
        this.A01.A00.A01 = null;
        this.A00.A2A(false);
        this.A01.A00.A07.onAdLoaded(this.A01.A00.A08.A6c());
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDismissed(Ad ad2) {
        this.A01.A00.A04 = false;
        if (this.A01.A00.A03 != null) {
            this.A01.A00.A03.A0S(new C3047h6(this));
            this.A01.A00.A03.A0N();
            this.A01.A00.A03.A0K();
            this.A01.A00.A03 = null;
        }
        this.A01.A00.A07.onInterstitialDismissed(this.A01.A00.A08.A6c());
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDisplayed(Ad ad2) {
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(Ad ad2) {
    }
}
