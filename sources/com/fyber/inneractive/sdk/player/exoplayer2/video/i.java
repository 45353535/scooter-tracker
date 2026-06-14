package com.fyber.inneractive.sdk.player.exoplayer2.video;

import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;
import com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DecoderCounters f23224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f23225b;

    public i(VideoRendererEventListener.EventDispatcher eventDispatcher, DecoderCounters decoderCounters) {
        this.f23225b = eventDispatcher;
        this.f23224a = decoderCounters;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f23225b.listener.onVideoEnabled(this.f23224a);
    }
}
