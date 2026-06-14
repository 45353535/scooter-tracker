package com.mbridge.msdk.playercommon;

import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: loaded from: classes10.dex */
public class DefaultVideoPlayerStatusListener implements VideoPlayerStatusListener {
    protected static final String TAG = "DefaultVideoPlayerStatusListener";

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onBufferingEnd() {
        q0.a(TAG, "OnBufferingEnd");
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onBufferingStart(String str) {
        q0.a(TAG, "OnBufferingStart:" + str);
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onBufferingTimeOut(String str) {
        q0.a(TAG, "onBufferingTimeOut:" + str);
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayCompleted() {
        q0.a(TAG, "onPlayCompleted");
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayError(String str) {
        q0.a(TAG, "onPlayError:" + str);
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayProgress(int i10, int i11) {
        q0.a(TAG, "onPlayProgress:" + i10 + ",allDuration:" + i11);
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayProgressMS(int i10, int i11) {
        q0.a(TAG, "onPlayProgressMS:");
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlaySetDataSourceError(String str) {
        q0.a(TAG, "onPlaySetDataSourceError:" + str);
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayStarted(int i10) {
        q0.a(TAG, "onPlayStarted:" + i10);
    }
}
