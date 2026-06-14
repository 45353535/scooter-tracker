package io.bidmachine.ads.networks.pangle;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardItem;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedRequest;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.RendererConfiguration;
import od.h;
import od.i;
import od.j;
import od.k;

/* JADX INFO: loaded from: classes12.dex */
class PangleRewardedAd extends h {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    @Nullable
    private LoadListener loadListener;

    @Nullable
    private PAGRewardedAd pagRewardedAd;

    private static final class LoadListener extends PangleBaseLoadListener<i, PAGRewardedAd> implements PAGRewardedAdLoadListener {

        @NonNull
        private final PangleRewardedAd pangleRewardedAd;

        LoadListener(@NonNull PangleRewardedAd pangleRewardedAd, @NonNull i iVar) {
            super(iVar);
            this.pangleRewardedAd = pangleRewardedAd;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // io.bidmachine.ads.networks.pangle.PangleBaseLoadListener
        public void onAdLoadComplete(PAGRewardedAd pAGRewardedAd) {
            this.pangleRewardedAd.setPAGRewardedAd(pAGRewardedAd);
            getCallback().onAdLoaded();
        }
    }

    private static final class ShowListener extends PangleBaseShowAdListener<i> implements PAGRewardedAdInteractionListener {
        ShowListener(@NonNull i iVar) {
            super(iVar);
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdDismissed() {
            i callback = getCallback();
            callback.onAdFinished();
            callback.onAdClosed();
        }

        @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener
        public void onUserEarnedReward(PAGRewardItem pAGRewardItem) {
        }

        @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener
        public void onUserEarnedRewardFail(int i10, String str) {
        }
    }

    PangleRewardedAd() {
    }

    @Override // od.b
    public void onDestroy() {
        LoadListener loadListener = this.loadListener;
        if (loadListener != null) {
            loadListener.destroy();
            this.loadListener = null;
        }
        PAGRewardedAd pAGRewardedAd = this.pagRewardedAd;
        if (pAGRewardedAd != null) {
            pAGRewardedAd.setAdInteractionListener(null);
            this.pagRewardedAd = null;
        }
    }

    void setPAGRewardedAd(@Nullable PAGRewardedAd pAGRewardedAd) {
        this.pagRewardedAd = pAGRewardedAd;
    }

    @Override // od.h
    public void show(@NonNull ContextProvider contextProvider, @NonNull i iVar, @Nullable RendererConfiguration rendererConfiguration) throws Throwable {
        Activity activity = contextProvider.getActivity();
        if (activity == null) {
            iVar.onAdShowFailed(ae.a.i(LogConstants.MSG_ACTIVITY_IS_NULL));
            return;
        }
        PAGRewardedAd pAGRewardedAd = this.pagRewardedAd;
        if (pAGRewardedAd == null) {
            iVar.onAdShowFailed(ae.a.i("Pangle rewarded object is null"));
        } else {
            pAGRewardedAd.setAdInteractionListener(new ShowListener(iVar));
            this.pagRewardedAd.show(activity);
        }
    }

    @Override // od.b
    public void load(@NonNull ContextProvider contextProvider, @NonNull i iVar, @NonNull j jVar, @NonNull k kVar, @NonNull NetworkAdUnit networkAdUnit) throws Throwable {
        PangleParams pangleParams = new PangleParams(kVar);
        if (pangleParams.isValid(iVar)) {
            PAGRewardedRequest pAGRewardedRequest = new PAGRewardedRequest();
            pAGRewardedRequest.setAdString(pangleParams.bidPayload);
            LoadListener loadListener = new LoadListener(this, iVar);
            this.loadListener = loadListener;
            PAGRewardedAd.loadAd(pangleParams.slotId, pAGRewardedRequest, loadListener);
        }
    }
}
