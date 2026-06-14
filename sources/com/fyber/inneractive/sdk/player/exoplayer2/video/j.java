package com.fyber.inneractive.sdk.player.exoplayer2.video;

import com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f23226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f23227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f23228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f23229d;

    public j(VideoRendererEventListener.EventDispatcher eventDispatcher, String str, long j10, long j11) {
        this.f23229d = eventDispatcher;
        this.f23226a = str;
        this.f23227b = j10;
        this.f23228c = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f23229d.listener.onVideoDecoderInitialized(this.f23226a, this.f23227b, this.f23228c);
    }
}
