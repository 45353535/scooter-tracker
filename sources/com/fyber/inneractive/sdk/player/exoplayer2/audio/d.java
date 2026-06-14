package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import com.fyber.inneractive.sdk.player.exoplayer2.audio.AudioRendererEventListener;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DecoderCounters f21587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f21588b;

    public d(AudioRendererEventListener.EventDispatcher eventDispatcher, DecoderCounters decoderCounters) {
        this.f21588b = eventDispatcher;
        this.f21587a = decoderCounters;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f21588b.listener.onAudioEnabled(this.f21587a);
    }
}
