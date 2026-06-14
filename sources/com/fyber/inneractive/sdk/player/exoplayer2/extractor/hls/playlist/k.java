package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.o;
import com.fyber.inneractive.sdk.player.exoplayer2.r;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.b0;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.d0;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.x;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.b f21979a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.j f21984f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.source.f f21987i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f21988j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public a f21989k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public d f21990l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f21991m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21981c = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f21985g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b0 f21986h = new b0("HlsPlaylistTracker:MasterPlaylist");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f21980b = new g();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IdentityHashMap f21982d = new IdentityHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f21983e = new Handler();

    public k(Uri uri, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.b bVar, com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.j jVar) {
        this.f21979a = bVar;
        this.f21987i = fVar;
        this.f21984f = jVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final void a(z zVar, long j10, long j11, boolean z10) {
        d0 d0Var = (d0) zVar;
        com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar = this.f21987i;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = d0Var.f23014a;
        long j12 = d0Var.f23019f;
        if (fVar.f22849b != null) {
            fVar.f22848a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.c(fVar, kVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j10, j11, j12));
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final void a(z zVar, long j10, long j11) {
        b bVar;
        d0 d0Var = (d0) zVar;
        e eVar = d0Var.f23017d;
        boolean z10 = eVar instanceof d;
        if (z10) {
            List listSingletonList = Collections.singletonList(new a(eVar.f21942a, new o("0", "application/x-mpegURL", null, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, null, null)));
            List list = Collections.EMPTY_LIST;
            bVar = new b(null, listSingletonList, list, list, null, null);
        } else {
            bVar = (b) eVar;
        }
        this.f21988j = bVar;
        this.f21989k = (a) bVar.f21914b.get(0);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(bVar.f21914b);
        arrayList.addAll(bVar.f21915c);
        arrayList.addAll(bVar.f21916d);
        int size = arrayList.size();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = (a) arrayList.get(i10);
            this.f21982d.put(aVar, new h(this, aVar, jElapsedRealtime));
        }
        h hVar = (h) this.f21982d.get(this.f21989k);
        if (z10) {
            hVar.a((d) eVar);
        } else {
            hVar.b();
        }
        com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar = this.f21987i;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = d0Var.f23014a;
        long j12 = d0Var.f23019f;
        if (fVar.f22849b != null) {
            fVar.f22848a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.b(fVar, kVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j10, j11, j12));
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final int a(z zVar, long j10, long j11, IOException iOException) {
        d0 d0Var = (d0) zVar;
        boolean z10 = iOException instanceof r;
        com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar = this.f21987i;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = d0Var.f23014a;
        long j12 = d0Var.f23019f;
        if (fVar.f22849b != null) {
            fVar.f22848a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.d(fVar, kVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j10, j11, j12, iOException, z10));
        }
        return z10 ? 3 : 0;
    }

    public final d a(a aVar) {
        d dVar;
        h hVar = (h) this.f21982d.get(aVar);
        hVar.getClass();
        hVar.f21974g = SystemClock.elapsedRealtime();
        d dVar2 = hVar.f21971d;
        if (dVar2 != null && this.f21988j.f21914b.contains(aVar) && (((dVar = this.f21990l) == null || !dVar.f21936j) && ((h) this.f21982d.get(this.f21989k)).f21974g - SystemClock.elapsedRealtime() > 15000)) {
            this.f21989k = aVar;
            ((h) this.f21982d.get(aVar)).b();
        }
        return dVar2;
    }
}
