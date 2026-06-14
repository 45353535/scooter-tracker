package com.mbridge.msdk.out.strategy;

import com.mbridge.msdk.newinterstitial.out.NewInterstitialListener;
import com.mbridge.msdk.video.bt.module.orglistener.g;

/* JADX INFO: loaded from: classes10.dex */
public interface IBidVideoAdStrategy extends IBaseVideoAdStrategy {
    void clearBitmapCache();

    boolean isBidReady();

    void loadFromBid(String str);

    void setIVRewardEnable(int i10, double d10);

    void setIVRewardEnable(int i10, int i11);

    void setInterstitialVideoListener(NewInterstitialListener newInterstitialListener);

    @Override // com.mbridge.msdk.out.strategy.IBaseVideoAdStrategy
    void setRewardPlus(boolean z10);

    void setRewardVideoListener(g gVar);

    void showFromBid();

    void showFromBid(String str);

    void showFromBid(String str, String str2);
}
