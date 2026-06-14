package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.controller.b0;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f22840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f22841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f22842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ IOException f22843d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f22844e;

    public d(f fVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar, int i10, int i11, com.fyber.inneractive.sdk.player.exoplayer2.o oVar, int i12, Object obj, long j10, long j11, long j12, long j13, long j14, IOException iOException, boolean z10) {
        this.f22844e = fVar;
        this.f22840a = obj;
        this.f22841b = j10;
        this.f22842c = j11;
        this.f22843d = iOException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b0 b0Var = this.f22844e.f22849b;
        com.fyber.inneractive.sdk.player.exoplayer2.b.a(this.f22841b);
        f.a(this.f22844e, this.f22842c);
        IAlog.a("%s AdaptiveMediaSourceEventListener onLoadError called. with exception %s", b0Var.a(), this.f22843d);
    }
}
