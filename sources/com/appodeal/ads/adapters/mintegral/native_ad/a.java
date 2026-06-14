package com.appodeal.ads.adapters.mintegral.native_ad;

import com.appodeal.ads.ImageData;
import com.appodeal.ads.MediaAssets;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedNativeCallback;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.MBNativeHandler;
import com.mbridge.msdk.out.NativeListener;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements NativeListener.NativeAdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnifiedNativeCallback f12506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MBNativeHandler f12507b;

    public a(UnifiedNativeCallback callback, MBNativeHandler nativeAd) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        this.f12506a = callback;
        this.f12507b = nativeAd;
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public final void onAdClick(Campaign campaign) {
        Intrinsics.checkNotNullParameter(campaign, "campaign");
        this.f12506a.onAdClicked();
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public final void onAdFramesLoaded(List list) {
        Intrinsics.checkNotNullParameter(list, "list");
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public final void onAdLoadError(String str) {
        this.f12506a.printError(str, null);
        this.f12506a.onAdLoadFailed(LoadingError.NoFill);
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public final void onAdLoaded(List campaigns, int i10) {
        Intrinsics.checkNotNullParameter(campaigns, "campaigns");
        Iterator it = campaigns.iterator();
        while (it.hasNext()) {
            Campaign campaign = (Campaign) it.next();
            UnifiedNativeCallback callback = this.f12506a;
            MBNativeHandler mBNativeHandler = this.f12507b;
            Intrinsics.checkNotNullParameter(mBNativeHandler, "<this>");
            Intrinsics.checkNotNullParameter(campaign, "campaign");
            Intrinsics.checkNotNullParameter(callback, "callback");
            String appName = campaign.getAppName();
            String appDesc = campaign.getAppDesc();
            String adCall = campaign.getAdCall();
            String iconUrl = campaign.getIconUrl();
            Intrinsics.checkNotNullExpressionValue(iconUrl, "getIconUrl(...)");
            callback.onAdLoaded(new d(campaign, callback, mBNativeHandler, appName, appDesc, adCall, new MediaAssets(new ImageData.Remote(iconUrl), null, null, 6, null), campaign.getRating() == 0.0d ? null : Float.valueOf((float) campaign.getRating())));
        }
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public final void onLoggingImpression(int i10) {
    }
}
