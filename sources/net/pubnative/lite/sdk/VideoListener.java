package net.pubnative.lite.sdk;

/* JADX INFO: loaded from: classes3.dex */
public interface VideoListener {
    void onVideoDismissed(int i10);

    void onVideoError(int i10);

    void onVideoFinished();

    void onVideoSkipped();

    void onVideoStarted();
}
