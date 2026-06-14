package com.appodeal.ads.adapters.mintegral.banner;

import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedBannerCallback;
import com.mbridge.msdk.out.BannerAdListener;
import com.mbridge.msdk.out.BannerSize;
import com.mbridge.msdk.out.MBBannerView;
import com.mbridge.msdk.out.MBridgeIds;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements BannerAdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnifiedBannerCallback f12497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MBBannerView f12498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BannerSize f12499c;

    public a(UnifiedBannerCallback callback, MBBannerView bannerAd, BannerSize bannerSize) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(bannerAd, "bannerAd");
        Intrinsics.checkNotNullParameter(bannerSize, "bannerSize");
        this.f12497a = callback;
        this.f12498b = bannerAd;
        this.f12499c = bannerSize;
    }

    @Override // com.mbridge.msdk.out.BannerAdListener
    public final void closeFullScreen(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.out.BannerAdListener
    public final void onClick(MBridgeIds mBridgeIds) {
        this.f12497a.onAdClicked();
    }

    @Override // com.mbridge.msdk.out.BannerAdListener
    public final void onCloseBanner(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.out.BannerAdListener
    public final void onLeaveApp(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.out.BannerAdListener
    public final void onLoadFailed(MBridgeIds mBridgeIds, String str) {
        this.f12497a.printError(str, null);
        this.f12497a.onAdLoadFailed(LoadingError.NoFill);
    }

    @Override // com.mbridge.msdk.out.BannerAdListener
    public final void onLoadSuccessed(MBridgeIds mBridgeIds) {
        this.f12497a.onAdLoaded(this.f12498b, this.f12499c.getHeight());
    }

    @Override // com.mbridge.msdk.out.BannerAdListener
    public final void onLogImpression(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.out.BannerAdListener
    public final void showFullScreen(MBridgeIds mBridgeIds) {
    }
}
