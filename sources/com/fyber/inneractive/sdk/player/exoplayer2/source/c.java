package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.controller.b0;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f22827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f22828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f22829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f22830d;

    public c(f fVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar, int i10, int i11, com.fyber.inneractive.sdk.player.exoplayer2.o oVar, int i12, Object obj, long j10, long j11, long j12, long j13, long j14) {
        this.f22830d = fVar;
        this.f22827a = obj;
        this.f22828b = j10;
        this.f22829c = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b0 b0Var = this.f22830d.f22849b;
        com.fyber.inneractive.sdk.player.exoplayer2.b.a(this.f22828b);
        f.a(this.f22830d, this.f22829c);
        IAlog.a("%s AdaptiveMediaSourceEventListener onLoadCanceled called.", b0Var.a());
    }
}
