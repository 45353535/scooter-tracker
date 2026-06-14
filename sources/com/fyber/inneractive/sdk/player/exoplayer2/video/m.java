package com.fyber.inneractive.sdk.player.exoplayer2.video;

import com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f23237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f23238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f23239e;

    public m(VideoRendererEventListener.EventDispatcher eventDispatcher, int i10, int i11, int i12, float f10) {
        this.f23239e = eventDispatcher;
        this.f23235a = i10;
        this.f23236b = i11;
        this.f23237c = i12;
        this.f23238d = f10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f23239e.listener.onVideoSizeChanged(this.f23235a, this.f23236b, this.f23237c, this.f23238d);
    }
}
