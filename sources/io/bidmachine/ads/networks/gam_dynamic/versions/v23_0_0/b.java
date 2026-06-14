package io.bidmachine.ads.networks.gam_dynamic.versions.v23_0_0;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import io.bidmachine.ads.networks.gam_dynamic.InternalFullscreenAdPresentListener;

/* JADX INFO: loaded from: classes12.dex */
class b extends FullScreenContentCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InternalFullscreenAdPresentListener f79386a;

    b(InternalFullscreenAdPresentListener internalFullscreenAdPresentListener) {
        this.f79386a = internalFullscreenAdPresentListener;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdClicked() {
        this.f79386a.onAdClicked();
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdDismissedFullScreenContent() {
        this.f79386a.onAdComplete();
        this.f79386a.onAdClosed();
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdFailedToShowFullScreenContent(AdError adError) {
        this.f79386a.onAdShowFailed(e.a(ae.a.f4248r, adError));
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdImpression() {
        this.f79386a.onAdShown();
    }
}
