package com.mbridge.msdk.video.signal;

/* JADX INFO: loaded from: classes10.dex */
public interface f {
    void configurationChanged(int i10, int i11, int i12);

    boolean endCardShowing();

    void hideAlertWebview();

    void ivRewardAdsWithoutVideo(String str);

    boolean miniCardShowing();

    void readyStatus(int i10);

    void resizeMiniCard(int i10, int i11, int i12);

    boolean showAlertWebView();

    void showEndcard(int i10);

    void showMiniCard(int i10, int i11, int i12, int i13, int i14);

    void showVideoClickView(int i10);

    void showVideoEndCover();
}
