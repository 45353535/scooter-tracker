package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import com.fyber.inneractive.sdk.player.exoplayer2.audio.AudioRendererEventListener;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f21589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f21590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f21591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f21592d;

    public e(AudioRendererEventListener.EventDispatcher eventDispatcher, String str, long j10, long j11) {
        this.f21592d = eventDispatcher;
        this.f21589a = str;
        this.f21590b = j10;
        this.f21591c = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f21592d.listener.onAudioDecoderInitialized(this.f21589a, this.f21590b, this.f21591c);
    }
}
