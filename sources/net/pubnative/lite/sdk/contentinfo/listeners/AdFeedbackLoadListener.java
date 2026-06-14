package net.pubnative.lite.sdk.contentinfo.listeners;

/* JADX INFO: loaded from: classes3.dex */
public interface AdFeedbackLoadListener {
    void onFormClosed();

    void onLoad(String str);

    void onLoadFailed(Throwable th2);

    void onLoadFinished();
}
