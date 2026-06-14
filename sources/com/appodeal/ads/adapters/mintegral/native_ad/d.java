package com.appodeal.ads.adapters.mintegral.native_ad;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.appodeal.ads.MediaAssets;
import com.appodeal.ads.nativead.NativeAdView;
import com.appodeal.ads.unified.UnifiedNativeAd;
import com.appodeal.ads.unified.UnifiedNativeCallback;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.nativex.view.MBMediaView;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.MBNativeHandler;
import com.mbridge.msdk.widget.MBAdChoice;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends UnifiedNativeAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Campaign f12509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UnifiedNativeCallback f12510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MBNativeHandler f12511c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Campaign campaign, UnifiedNativeCallback unifiedNativeCallback, MBNativeHandler mBNativeHandler, String str, String str2, String str3, MediaAssets mediaAssets, Float f10) {
        super(str, str2, str3, mediaAssets, f10);
        this.f12509a = campaign;
        this.f12510b = unifiedNativeCallback;
        this.f12511c = mBNativeHandler;
        Intrinsics.checkNotNull(str);
        Intrinsics.checkNotNull(str3);
    }

    @Override // com.appodeal.ads.unified.AdNetworkConnector
    public final boolean containsVideo() {
        Campaign campaign = this.f12509a;
        CampaignEx campaignEx = campaign instanceof CampaignEx ? (CampaignEx) campaign : null;
        String videoUrlEncode = campaignEx != null ? campaignEx.getVideoUrlEncode() : null;
        return true ^ (videoUrlEncode == null || videoUrlEncode.length() == 0);
    }

    @Override // com.appodeal.ads.unified.AdNetworkConnector
    public final View obtainAdChoice(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        MBAdChoice mBAdChoice = new MBAdChoice(context);
        mBAdChoice.setCampaign(this.f12509a);
        return mBAdChoice;
    }

    @Override // com.appodeal.ads.unified.AdNetworkConnector
    public final View obtainIconView(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new ImageView(context);
    }

    @Override // com.appodeal.ads.unified.AdNetworkConnector
    public final View obtainMediaView(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        MBMediaView mBMediaView = new MBMediaView(context);
        Campaign campaign = this.f12509a;
        UnifiedNativeCallback unifiedNativeCallback = this.f12510b;
        mBMediaView.setIsAllowFullScreen(true);
        mBMediaView.setNativeAd(campaign);
        mBMediaView.setOnMediaViewListener(new c(unifiedNativeCallback));
        return mBMediaView;
    }

    @Override // com.appodeal.ads.unified.AdNetworkConnector
    public final void onDestroy() {
        this.f12511c.release();
    }

    @Override // com.appodeal.ads.unified.UnifiedNativeAd, com.appodeal.ads.unified.AdNetworkConnector
    public final void onRegisterForInteraction(NativeAdView nativeAdView) {
        Intrinsics.checkNotNullParameter(nativeAdView, "nativeAdView");
        super.onRegisterForInteraction(nativeAdView);
        this.f12511c.registerView(nativeAdView, this.f12509a);
    }

    @Override // com.appodeal.ads.unified.UnifiedNativeAd, com.appodeal.ads.unified.AdNetworkConnector
    public final void onUnregisterForInteraction(NativeAdView nativeAdView) {
        Intrinsics.checkNotNullParameter(nativeAdView, "nativeAdView");
        super.onUnregisterForInteraction(nativeAdView);
        this.f12511c.unregisterView(nativeAdView, this.f12509a);
    }
}
