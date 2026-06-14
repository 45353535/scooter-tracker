package com.appodeal.ads.adapters.mytarget.banner;

import com.appodeal.ads.unified.UnifiedBannerCallback;
import com.my.target.ads.MyTargetView;
import com.my.target.common.models.IAdLoadingError;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements MyTargetView.MyTargetViewListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnifiedBannerCallback f12543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12544b;

    public b(UnifiedBannerCallback unifiedBannerCallback, int i10) {
        this.f12543a = unifiedBannerCallback;
        this.f12544b = i10;
    }

    @Override // com.my.target.ads.MyTargetView.MyTargetViewListener
    public final void onClick(MyTargetView myTargetView) {
        this.f12543a.onAdClicked();
    }

    @Override // com.my.target.ads.MyTargetView.MyTargetViewListener
    public final void onLoad(MyTargetView myTargetView) {
        this.f12543a.onAdLoaded(myTargetView, this.f12544b);
    }

    @Override // com.my.target.ads.MyTargetView.MyTargetViewListener
    public final void onNoAd(IAdLoadingError iAdLoadingError, MyTargetView myTargetView) {
        this.f12543a.printError(iAdLoadingError.getMessage(), Integer.valueOf(iAdLoadingError.getCode()));
        this.f12543a.onAdLoadFailed(null);
    }

    @Override // com.my.target.ads.MyTargetView.MyTargetViewListener
    public final void onShow(MyTargetView myTargetView) {
    }
}
