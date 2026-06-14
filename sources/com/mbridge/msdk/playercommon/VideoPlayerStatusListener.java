package com.mbridge.msdk.playercommon;

/* JADX INFO: loaded from: classes10.dex */
public interface VideoPlayerStatusListener {
    void onBufferingEnd();

    void onBufferingStart(String str);

    void onBufferingTimeOut(String str);

    void onPlayCompleted();

    void onPlayError(String str);

    void onPlayProgress(int i10, int i11);

    void onPlayProgressMS(int i10, int i11);

    void onPlaySetDataSourceError(String str);

    void onPlayStarted(int i10);
}
