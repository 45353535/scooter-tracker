package com.facebook.ads;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes7.dex */
@Keep
public interface RewardedAdListener {
    void onRewardedAdCompleted();

    void onRewardedAdServerFailed();

    void onRewardedAdServerSucceeded();
}
