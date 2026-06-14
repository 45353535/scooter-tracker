package com.appodeal.ads.adapters.mintegral.mrec;

import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedMrecCallback;
import com.mbridge.msdk.out.BannerAdListener;
import com.mbridge.msdk.out.MBBannerView;
import com.mbridge.msdk.out.MBridgeIds;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements BannerAdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnifiedMrecCallback f12503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MBBannerView f12504b;

    public a(UnifiedMrecCallback callback, MBBannerView mrecAd) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(mrecAd, "mrecAd");
        this.f12503a = callback;
        this.f12504b = mrecAd;
    }

    @Override // com.mbridge.msdk.out.BannerAdListener
    public final void closeFullScreen(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.out.BannerAdListener
    public final void onClick(MBridgeIds mBridgeIds) {
        this.f12503a.onAdClicked();
    }

    @Override // com.mbridge.msdk.out.BannerAdListener
    public final void onCloseBanner(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.out.BannerAdListener
    public final void onLeaveApp(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.out.BannerAdListener
    public final void onLoadFailed(MBridgeIds mBridgeIds, String str) {
        this.f12503a.printError(str, null);
        this.f12503a.onAdLoadFailed(LoadingError.NoFill);
    }

    @Override // com.mbridge.msdk.out.BannerAdListener
    public final void onLoadSuccessed(MBridgeIds mBridgeIds) {
        this.f12503a.onAdLoaded(this.f12504b);
    }

    @Override // com.mbridge.msdk.out.BannerAdListener
    public final void onLogImpression(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.out.BannerAdListener
    public final void showFullScreen(MBridgeIds mBridgeIds) {
    }
}
