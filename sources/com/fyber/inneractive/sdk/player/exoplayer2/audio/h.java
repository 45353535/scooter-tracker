package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import com.fyber.inneractive.sdk.player.exoplayer2.audio.AudioRendererEventListener;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DecoderCounters f21599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f21600b;

    public h(AudioRendererEventListener.EventDispatcher eventDispatcher, DecoderCounters decoderCounters) {
        this.f21600b = eventDispatcher;
        this.f21599a = decoderCounters;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f21599a.ensureUpdated();
        this.f21600b.listener.onAudioDisabled(this.f21599a);
    }
}
