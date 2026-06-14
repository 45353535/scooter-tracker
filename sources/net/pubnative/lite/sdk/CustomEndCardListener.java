package net.pubnative.lite.sdk;

/* JADX INFO: loaded from: classes3.dex */
public interface CustomEndCardListener {
    void onCustomEndCardClick();

    void onCustomEndCardShow();

    void onDefaultEndCardClick();

    void onDefaultEndCardShow();

    void onEndCardLoadFailure(boolean z10);

    void onEndCardLoadSuccess(boolean z10);

    void onPlayableSkipButtonClicked();
}
