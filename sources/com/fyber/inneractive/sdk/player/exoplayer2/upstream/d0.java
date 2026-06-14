package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;

/* JADX INFO: loaded from: classes7.dex */
public final class d0 implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f23014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f23015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f23016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e f23017d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f23018e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile long f23019f;

    public d0(h hVar, Uri uri, c0 c0Var) {
        this.f23015b = hVar;
        this.f23014a = new k(uri, 0L, 0L, -1L, null, 1);
        this.f23016c = c0Var;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final boolean a() {
        return this.f23018e;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final void b() {
        this.f23018e = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final void load() {
        j jVar = new j(this.f23015b, this.f23014a);
        try {
            jVar.f23030a.a(jVar.f23031b);
            jVar.f23033d = true;
            this.f23017d = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.g) this.f23016c).a(this.f23015b.a(), jVar);
        } finally {
            this.f23019f = jVar.f23035f;
            com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(jVar);
        }
    }
}
