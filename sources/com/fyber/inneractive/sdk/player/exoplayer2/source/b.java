package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.controller.b0;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f22823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f22824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f22825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f22826d;

    public b(f fVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar, int i10, int i11, com.fyber.inneractive.sdk.player.exoplayer2.o oVar, int i12, Object obj, long j10, long j11, long j12, long j13, long j14) {
        this.f22826d = fVar;
        this.f22823a = obj;
        this.f22824b = j10;
        this.f22825c = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b0 b0Var = this.f22826d.f22849b;
        com.fyber.inneractive.sdk.player.exoplayer2.b.a(this.f22824b);
        f.a(this.f22826d, this.f22825c);
        IAlog.a("%s AdaptiveMediaSourceEventListener onLoadCompleted called.", b0Var.a());
    }
}
