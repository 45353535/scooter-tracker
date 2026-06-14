package com.fyber.inneractive.sdk.player.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import com.fyber.inneractive.sdk.player.controller.b0;

/* JADX INFO: loaded from: classes7.dex */
public final class q implements u, t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f22898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.g f22899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.k f22900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f22901d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f22902e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b0 f22903f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.v f22904g = new com.fyber.inneractive.sdk.player.exoplayer2.v();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public t f22905h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f22906i;

    public q(Uri uri, com.fyber.inneractive.sdk.player.exoplayer2.upstream.g gVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.c cVar, int i10, Handler handler, b0 b0Var) {
        this.f22898a = uri;
        this.f22899b = gVar;
        this.f22900c = cVar;
        this.f22901d = i10;
        this.f22902e = handler;
        this.f22903f = b0Var;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.u
    public final void a() {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.u
    public final void b() {
        this.f22905h = null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.u
    public final void a(t tVar) {
        this.f22905h = tVar;
        tVar.a(new x(-9223372036854775807L, -9223372036854775807L, 0L, 0L, false, false), null);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.u
    public final s a(int i10, com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar, long j10) {
        if (i10 == 0) {
            return new p(this.f22898a, this.f22899b.a(), this.f22900c.a(), this.f22901d, this.f22902e, this.f22903f, this, bVar);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.u
    public final void a(s sVar) {
        p pVar = (p) sVar;
        pVar.f22880i.a(new k(pVar, pVar.f22881j));
        pVar.f22885n.removeCallbacksAndMessages(null);
        pVar.G = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.t
    public final void a(x xVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.g gVar) {
        boolean z10 = xVar.a(0, this.f22904g, false).f23173d != -9223372036854775807L;
        if (!this.f22906i || z10) {
            this.f22906i = z10;
            this.f22905h.a(xVar, null);
        }
    }
}
