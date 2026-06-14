package com.fyber.inneractive.sdk.player.exoplayer2.video;

import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;
import com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener;

/* JADX INFO: loaded from: classes7.dex */
public final class o implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DecoderCounters f23242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f23243b;

    public o(VideoRendererEventListener.EventDispatcher eventDispatcher, DecoderCounters decoderCounters) {
        this.f23243b = eventDispatcher;
        this.f23242a = decoderCounters;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f23242a.ensureUpdated();
        this.f23243b.listener.onVideoDisabled(this.f23242a);
    }
}
