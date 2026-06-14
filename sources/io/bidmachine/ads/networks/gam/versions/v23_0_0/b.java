package io.bidmachine.ads.networks.gam.versions.v23_0_0;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import io.bidmachine.ads.networks.gam.InternalGAMFullscreenAdPresentListener;

/* JADX INFO: loaded from: classes12.dex */
class b extends FullScreenContentCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InternalGAMFullscreenAdPresentListener f79263a;

    b(InternalGAMFullscreenAdPresentListener internalGAMFullscreenAdPresentListener) {
        this.f79263a = internalGAMFullscreenAdPresentListener;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdClicked() {
        this.f79263a.onAdClicked();
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdDismissedFullScreenContent() {
        this.f79263a.onAdComplete();
        this.f79263a.onAdClosed();
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdFailedToShowFullScreenContent(AdError adError) {
        this.f79263a.onAdShowFailed(new ae.a(ae.a.f4248r, adError.getCode(), adError.getMessage()));
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdImpression() {
        this.f79263a.onAdShown();
    }
}
