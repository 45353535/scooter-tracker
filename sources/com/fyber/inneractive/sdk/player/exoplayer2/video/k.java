package com.fyber.inneractive.sdk.player.exoplayer2.video;

import com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.player.exoplayer2.o f23230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f23231b;

    public k(VideoRendererEventListener.EventDispatcher eventDispatcher, com.fyber.inneractive.sdk.player.exoplayer2.o oVar) {
        this.f23231b = eventDispatcher;
        this.f23230a = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f23231b.listener.onVideoInputFormatChanged(this.f23230a);
    }
}
