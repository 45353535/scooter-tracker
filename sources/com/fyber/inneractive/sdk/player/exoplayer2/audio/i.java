package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import com.fyber.inneractive.sdk.player.exoplayer2.audio.AudioRendererEventListener;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f21602b;

    public i(AudioRendererEventListener.EventDispatcher eventDispatcher, int i10) {
        this.f21602b = eventDispatcher;
        this.f21601a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f21602b.listener.onAudioSessionId(this.f21601a);
    }
}
