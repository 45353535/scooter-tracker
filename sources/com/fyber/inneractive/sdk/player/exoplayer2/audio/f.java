package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import com.fyber.inneractive.sdk.player.exoplayer2.audio.AudioRendererEventListener;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.player.exoplayer2.o f21593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f21594b;

    public f(AudioRendererEventListener.EventDispatcher eventDispatcher, com.fyber.inneractive.sdk.player.exoplayer2.o oVar) {
        this.f21594b = eventDispatcher;
        this.f21593a = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f21594b.listener.onAudioInputFormatChanged(this.f21593a);
    }
}
