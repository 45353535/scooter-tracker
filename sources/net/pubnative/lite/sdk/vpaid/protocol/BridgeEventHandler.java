package net.pubnative.lite.sdk.vpaid.protocol;

/* JADX INFO: loaded from: classes3.dex */
public interface BridgeEventHandler {
    void callJsMethod(String str);

    void onAdImpression();

    void onAdLinearChange();

    void onAdSkipped();

    void onAdStopped();

    void onAdVolumeChange();

    void onDurationChanged();

    void onPrepared();

    void openUrl(String str);

    void postEvent(String str, int i10, boolean z10);

    void postEvent(String str, boolean z10);

    void runOnUiThread(Runnable runnable);

    void setSkippableState(boolean z10);

    void trackError(String str);
}
