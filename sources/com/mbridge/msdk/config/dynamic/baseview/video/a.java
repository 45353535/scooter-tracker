package com.mbridge.msdk.config.dynamic.baseview.video;

/* JADX INFO: loaded from: classes10.dex */
public interface a {
    void a(long j10);

    void a(long j10, long j11);

    void onBufferingEnd();

    void onBufferingStart();

    void onBufferingTimeOut(String str);

    void onPlayCompleted();

    void onPlayError(String str);
}
