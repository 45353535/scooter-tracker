package com.appodeal.ads.adapters.mintegral.mrec;

import android.app.Activity;
import com.appodeal.ads.AdUnitParams;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedMrec;
import com.appodeal.ads.unified.UnifiedMrecCallback;
import com.appodeal.ads.unified.UnifiedMrecParams;
import com.mbridge.msdk.out.BannerSize;
import com.mbridge.msdk.out.MBBannerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends UnifiedMrec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MBBannerView f12505a;

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, AdUnitParams adUnitParams, UnifiedAdCallback unifiedAdCallback) {
        UnifiedMrecParams adTypeParams = (UnifiedMrecParams) unifiedAdParams;
        com.appodeal.ads.adapters.mintegral.a adUnitParams2 = (com.appodeal.ads.adapters.mintegral.a) adUnitParams;
        UnifiedMrecCallback callback = (UnifiedMrecCallback) unifiedAdCallback;
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(adTypeParams, "adTypeParams");
        Intrinsics.checkNotNullParameter(adUnitParams2, "adUnitParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Activity resumedActivity = contextProvider.getResumedActivity();
        if (resumedActivity == null) {
            callback.onAdLoadFailed(LoadingError.InternalError);
            return;
        }
        BannerSize bannerSize = new BannerSize(2, 300, 250);
        MBBannerView mBBannerView = new MBBannerView(resumedActivity);
        mBBannerView.init(bannerSize, adUnitParams2.f12492b, adUnitParams2.f12491a);
        mBBannerView.setAllowShowCloseBtn(false);
        mBBannerView.setRefreshTime(0);
        mBBannerView.setBannerAdListener(new a(callback, mBBannerView));
        mBBannerView.load();
        this.f12505a = mBBannerView;
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onDestroy() {
        MBBannerView mBBannerView = this.f12505a;
        if (mBBannerView != null) {
            mBBannerView.release();
        }
        this.f12505a = null;
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onHide() {
        super.onHide();
        MBBannerView mBBannerView = this.f12505a;
        if (mBBannerView != null) {
            mBBannerView.onPause();
        }
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onPrepareToShow(Activity activity, UnifiedAdParams unifiedAdParams) {
        UnifiedMrecParams adTypeParams = (UnifiedMrecParams) unifiedAdParams;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(adTypeParams, "adTypeParams");
        super.onPrepareToShow(activity, adTypeParams);
        MBBannerView mBBannerView = this.f12505a;
        if (mBBannerView != null) {
            mBBannerView.onResume();
        }
    }
}
