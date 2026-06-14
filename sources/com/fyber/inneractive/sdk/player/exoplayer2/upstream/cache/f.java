package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import com.fyber.inneractive.sdk.player.exoplayer2.upstream.o;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.t;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements com.fyber.inneractive.sdk.player.exoplayer2.upstream.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f22974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.g f22975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.g f22976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f22977d;

    public f(l lVar, o oVar) {
        t tVar = new t();
        d dVar = new d(lVar);
        this.f22974a = lVar;
        this.f22975b = oVar;
        this.f22976c = tVar;
        this.f22977d = dVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.h a() {
        l lVar = this.f22974a;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVarA = this.f22975b.a();
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVarA2 = this.f22976c.a();
        d dVar = this.f22977d;
        return new e(lVar, hVarA, hVarA2, dVar != null ? new c(dVar.f22956a) : null);
    }
}
