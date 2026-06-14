package com.appodeal.ads.adapters.vungle;

import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedViewAdCallback;
import com.vungle.ads.BannerAd;
import com.vungle.ads.BannerView;
import com.vungle.ads.BaseAd;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class e extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UnifiedViewAdCallback f12601b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(UnifiedViewAdCallback callback) {
        super(callback);
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f12601b = callback;
    }

    public abstract void a(BannerView bannerView);

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdEnd(BaseAd baseAd) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdImpression(BaseAd baseAd) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdLoaded(BaseAd baseAd) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        if (baseAd.canPlayAd().booleanValue()) {
            BannerAd bannerAd = baseAd instanceof BannerAd ? (BannerAd) baseAd : null;
            BannerView bannerView = bannerAd != null ? bannerAd.getBannerView() : null;
            if (bannerView != null) {
                a(bannerView);
                return;
            } else {
                this.f12601b.onAdLoadFailed(LoadingError.InternalError);
                return;
            }
        }
        this.f12601b.printError("Placement can't be played (Vungle.canPlayAd(" + baseAd.getPlacementId() + ") is false).", null);
        this.f12601b.onAdLoadFailed(LoadingError.NoFill);
    }
}
