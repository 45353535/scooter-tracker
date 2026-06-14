package com.mbridge.msdk.dycreator.baseview.videoview.listener;

/* JADX INFO: loaded from: classes10.dex */
public interface VideoViewEventListener {
    void onBufferingEnd();

    void onBufferingFail(String str);

    void onBufferingStart();

    void onPlayCompleted();

    void onPlayProgress(int i10, int i11);

    void onPlayStart(String str);

    void onPlayerError(int i10, String str);
}
