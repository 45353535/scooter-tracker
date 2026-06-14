package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.controller.b0;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f22845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f22846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f22847c;

    public e(f fVar, int i10, com.fyber.inneractive.sdk.player.exoplayer2.o oVar, int i11, Object obj, long j10) {
        this.f22847c = fVar;
        this.f22845a = obj;
        this.f22846b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b0 b0Var = this.f22847c.f22849b;
        com.fyber.inneractive.sdk.player.exoplayer2.b.a(this.f22846b);
        IAlog.a("%s AdaptiveMediaSourceEventListener onDownstreamFormatChanged called.", b0Var.a());
    }
}
