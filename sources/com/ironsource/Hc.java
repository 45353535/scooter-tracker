package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public interface Hc extends Ec {
    void onInterstitialAdRewarded(String str, int i10);

    void onInterstitialClick();

    void onInterstitialClose();

    void onInterstitialEventNotificationReceived(String str, JSONObject jSONObject);

    void onInterstitialInitFailed(String str);

    void onInterstitialInitSuccess();

    void onInterstitialLoadFailed(String str);

    void onInterstitialLoadSuccess(L9 l92);

    void onInterstitialOpen();

    void onInterstitialShowFailed(String str);

    void onInterstitialShowSuccess();
}
