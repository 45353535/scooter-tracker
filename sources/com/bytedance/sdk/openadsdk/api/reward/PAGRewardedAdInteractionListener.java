package com.bytedance.sdk.openadsdk.api.reward;

import com.bytedance.sdk.openadsdk.api.PAGAdListener;

/* JADX INFO: loaded from: classes6.dex */
public interface PAGRewardedAdInteractionListener extends PAGAdListener {
    void onUserEarnedReward(PAGRewardItem pAGRewardItem);

    void onUserEarnedRewardFail(int i10, String str);
}
