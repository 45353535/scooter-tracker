package com.fyber.inneractive.sdk.player.exoplayer2.video;

import com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener;

/* JADX INFO: loaded from: classes7.dex */
public final class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f23233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f23234c;

    public l(VideoRendererEventListener.EventDispatcher eventDispatcher, int i10, long j10) {
        this.f23234c = eventDispatcher;
        this.f23232a = i10;
        this.f23233b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f23234c.listener.onDroppedFrames(this.f23232a, this.f23233b);
    }
}
