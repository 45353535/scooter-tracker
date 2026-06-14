package com.fyber.inneractive.sdk.player.exoplayer2.video;

import android.view.Surface;
import com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener;

/* JADX INFO: loaded from: classes7.dex */
public final class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Surface f23240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f23241b;

    public n(VideoRendererEventListener.EventDispatcher eventDispatcher, Surface surface) {
        this.f23241b = eventDispatcher;
        this.f23240a = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f23241b.listener.onRenderedFirstFrame(this.f23240a);
    }
}
