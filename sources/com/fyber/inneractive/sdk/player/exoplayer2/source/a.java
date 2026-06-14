package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.controller.b0;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f22819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f22820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f22821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f22822d;

    public a(f fVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar, int i10, int i11, com.fyber.inneractive.sdk.player.exoplayer2.o oVar, int i12, Object obj, long j10, long j11, long j12) {
        this.f22822d = fVar;
        this.f22819a = obj;
        this.f22820b = j10;
        this.f22821c = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b0 b0Var = this.f22822d.f22849b;
        com.fyber.inneractive.sdk.player.exoplayer2.b.a(this.f22820b);
        f.a(this.f22822d, this.f22821c);
        IAlog.a("%s AdaptiveMediaSourceEventListener onLoadStarted called.", b0Var.a());
    }
}
