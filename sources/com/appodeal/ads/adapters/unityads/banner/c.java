package com.appodeal.ads.adapters.unityads.banner;

import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedBannerCallback;
import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.BannerView;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements BannerView.IListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnifiedBannerCallback f12561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f12562b = new AtomicBoolean(false);

    public c(UnifiedBannerCallback unifiedBannerCallback) {
        this.f12561a = unifiedBannerCallback;
    }

    @Override // com.unity3d.services.banners.BannerView.IListener
    public final void onBannerClick(BannerView bannerView) {
        this.f12561a.onAdClicked();
    }

    @Override // com.unity3d.services.banners.BannerView.IListener
    public final void onBannerFailedToLoad(BannerView bannerView, BannerErrorInfo bannerErrorInfo) {
        if (this.f12562b.getAndSet(true)) {
            return;
        }
        if (bannerErrorInfo == null) {
            this.f12561a.onAdLoadFailed(LoadingError.NoFill);
            return;
        }
        this.f12561a.printError(bannerErrorInfo.errorMessage, bannerErrorInfo.errorCode);
        int i10 = b.f12560a[bannerErrorInfo.errorCode.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            this.f12561a.onAdLoadFailed(LoadingError.InternalError);
        } else {
            if (i10 != 4) {
                return;
            }
            this.f12561a.onAdLoadFailed(LoadingError.NoFill);
        }
    }

    @Override // com.unity3d.services.banners.BannerView.IListener
    public final void onBannerLeftApplication(BannerView bannerView) {
    }

    @Override // com.unity3d.services.banners.BannerView.IListener
    public final void onBannerLoaded(BannerView bannerView) {
        try {
            if (this.f12562b.getAndSet(true)) {
                return;
            }
            this.f12561a.onAdLoaded(bannerView, bannerView.getSize().getHeight());
        } catch (Throwable th2) {
            th2.printStackTrace();
            this.f12561a.onAdLoadFailed(LoadingError.InternalError);
        }
    }

    @Override // com.unity3d.services.banners.BannerView.IListener
    public final void onBannerShown(BannerView bannerView) {
    }
}
