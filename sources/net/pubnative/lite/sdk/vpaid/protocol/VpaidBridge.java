package net.pubnative.lite.sdk.vpaid.protocol;

/* JADX INFO: loaded from: classes3.dex */
public interface VpaidBridge {
    void getAdSkippableState();

    void pauseAd();

    void prepare();

    void resumeAd();

    void startAd();

    void stopAd();
}
