package com.mbridge.msdk.out.strategy;

import com.mbridge.msdk.newinterstitial.out.NewInterstitialListener;
import com.mbridge.msdk.video.bt.module.orglistener.g;

/* JADX INFO: loaded from: classes10.dex */
public interface IVideoAdStrategy extends IBaseVideoAdStrategy {
    void clearBitmapCache();

    boolean isReady();

    void load();

    @Override // com.mbridge.msdk.out.strategy.IBaseVideoAdStrategy
    void loadFormSelfFilling();

    void setIVRewardEnable(int i10, double d10);

    void setIVRewardEnable(int i10, int i11);

    void setInterstitialVideoListener(NewInterstitialListener newInterstitialListener);

    @Override // com.mbridge.msdk.out.strategy.IBaseVideoAdStrategy
    void setRewardPlus(boolean z10);

    void setRewardVideoListener(g gVar);

    void show();

    void show(String str);

    void show(String str, String str2);
}
