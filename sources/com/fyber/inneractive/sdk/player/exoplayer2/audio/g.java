package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import com.fyber.inneractive.sdk.player.exoplayer2.audio.AudioRendererEventListener;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f21596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f21597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f21598d;

    public g(AudioRendererEventListener.EventDispatcher eventDispatcher, int i10, long j10, long j11) {
        this.f21598d = eventDispatcher;
        this.f21595a = i10;
        this.f21596b = j10;
        this.f21597c = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f21598d.listener.onAudioTrackUnderrun(this.f21595a, this.f21596b, this.f21597c);
    }
}
