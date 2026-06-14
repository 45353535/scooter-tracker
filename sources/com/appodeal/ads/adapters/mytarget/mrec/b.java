package com.appodeal.ads.adapters.mytarget.mrec;

import com.appodeal.ads.unified.UnifiedMrecCallback;
import com.my.target.ads.MyTargetView;
import com.my.target.common.models.IAdLoadingError;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements MyTargetView.MyTargetViewListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnifiedMrecCallback f12548a;

    public b(UnifiedMrecCallback unifiedMrecCallback) {
        this.f12548a = unifiedMrecCallback;
    }

    @Override // com.my.target.ads.MyTargetView.MyTargetViewListener
    public final void onClick(MyTargetView myTargetView) {
        this.f12548a.onAdClicked();
    }

    @Override // com.my.target.ads.MyTargetView.MyTargetViewListener
    public final void onLoad(MyTargetView myTargetView) {
        this.f12548a.onAdLoaded(myTargetView);
    }

    @Override // com.my.target.ads.MyTargetView.MyTargetViewListener
    public final void onNoAd(IAdLoadingError iAdLoadingError, MyTargetView myTargetView) {
        this.f12548a.printError(iAdLoadingError.getMessage(), Integer.valueOf(iAdLoadingError.getCode()));
        this.f12548a.onAdLoadFailed(null);
    }

    @Override // com.my.target.ads.MyTargetView.MyTargetViewListener
    public final void onShow(MyTargetView myTargetView) {
    }
}
