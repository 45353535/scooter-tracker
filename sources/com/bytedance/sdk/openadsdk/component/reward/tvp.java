package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardItem;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class tvp implements com.bytedance.sdk.openadsdk.qdl.mzz.qdl {
    private final AtomicBoolean lnr;
    private final AtomicBoolean mml;
    private final AtomicBoolean mzz;
    private final PAGRewardedAdInteractionListener qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final PAGRewardedAdInteractionCallback f17111ud;

    public tvp(PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener) {
        this.lnr = new AtomicBoolean(false);
        this.mml = new AtomicBoolean(false);
        this.mzz = new AtomicBoolean(false);
        this.qdl = pAGRewardedAdInteractionListener;
        this.f17111ud = null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.qdl;
        if (pAGRewardedAdInteractionListener != null) {
            pAGRewardedAdInteractionListener.onAdClicked();
            return;
        }
        PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.f17111ud;
        if (pAGRewardedAdInteractionCallback != null) {
            pAGRewardedAdInteractionCallback.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.qdl.mzz.qdl
    public void qdl() {
        this.lnr.get();
        if (this.lnr.compareAndSet(false, true)) {
            aaj.qdl("BVA", "reward video onAdShow");
            PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.qdl;
            if (pAGRewardedAdInteractionListener != null) {
                pAGRewardedAdInteractionListener.onAdShowed();
                return;
            }
            PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.f17111ud;
            if (pAGRewardedAdInteractionCallback != null) {
                pAGRewardedAdInteractionCallback.onAdShowed();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.qdl.mzz.qdl
    public void ud() {
        this.mml.get();
        if (this.mml.compareAndSet(false, true)) {
            aaj.qdl("BVA", "reward video onAdClose");
            PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.qdl;
            if (pAGRewardedAdInteractionListener != null) {
                pAGRewardedAdInteractionListener.onAdDismissed();
                return;
            }
            PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.f17111ud;
            if (pAGRewardedAdInteractionCallback != null) {
                pAGRewardedAdInteractionCallback.onAdDismissed();
            }
        }
    }

    public tvp(PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback) {
        this.lnr = new AtomicBoolean(false);
        this.mml = new AtomicBoolean(false);
        this.mzz = new AtomicBoolean(false);
        this.f17111ud = pAGRewardedAdInteractionCallback;
        this.qdl = null;
    }

    @Override // com.bytedance.sdk.openadsdk.qdl.mzz.qdl
    public void qdl(boolean z10, int i10, String str, int i11, String str2) {
        if (this.mzz.compareAndSet(false, true)) {
            aaj.qdl("BVA", "reward video onRewardVerify");
            PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.qdl;
            if (pAGRewardedAdInteractionListener != null) {
                if (z10) {
                    pAGRewardedAdInteractionListener.onUserEarnedReward(new PAGRewardItem(i10, str));
                    return;
                } else {
                    pAGRewardedAdInteractionListener.onUserEarnedRewardFail(i11, str2);
                    return;
                }
            }
            PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.f17111ud;
            if (pAGRewardedAdInteractionCallback != null) {
                if (z10) {
                    pAGRewardedAdInteractionCallback.onUserEarnedReward(new PAGRewardItem(i10, str));
                } else {
                    pAGRewardedAdInteractionCallback.onUserEarnedRewardFail(new PAGErrorModel(i11, str2));
                }
            }
        }
    }
}
