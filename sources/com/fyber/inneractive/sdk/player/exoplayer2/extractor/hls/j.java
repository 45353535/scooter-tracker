package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.controller.b0;
import com.fyber.inneractive.sdk.player.exoplayer2.source.s;
import com.fyber.inneractive.sdk.player.exoplayer2.source.t;
import com.fyber.inneractive.sdk.player.exoplayer2.source.u;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.d0;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.y;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f21870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f21871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.source.f f21872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.k f21873d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public t f21874e;

    public j(Uri uri, com.fyber.inneractive.sdk.player.exoplayer2.upstream.g gVar, Handler handler, b0 b0Var) {
        b bVar = new b(gVar);
        this.f21870a = uri;
        this.f21871b = bVar;
        this.f21872c = new com.fyber.inneractive.sdk.player.exoplayer2.source.f(handler, b0Var);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.u
    public final void a(t tVar) {
        if (this.f21873d != null) {
            throw new IllegalStateException();
        }
        Uri uri = this.f21870a;
        b bVar = this.f21871b;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.k kVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.k(uri, bVar, this.f21872c, this);
        this.f21873d = kVar;
        this.f21874e = tVar;
        d0 d0Var = new d0(bVar.f21811a.a(), uri, kVar.f21980b);
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.b0 b0Var = kVar.f21986h;
        b0Var.getClass();
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            throw new IllegalStateException();
        }
        y yVar = new y(b0Var, looperMyLooper, d0Var, kVar, 3, SystemClock.elapsedRealtime());
        if (b0Var.f22944b != null) {
            throw new IllegalStateException();
        }
        b0Var.f22944b = yVar;
        yVar.f23095e = null;
        b0Var.f22943a.execute(yVar);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.u
    public final void b() {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.k kVar = this.f21873d;
        if (kVar != null) {
            kVar.f21986h.a(null);
            Iterator it = kVar.f21982d.values().iterator();
            while (it.hasNext()) {
                ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h) it.next()).f21969b.a(null);
            }
            kVar.f21983e.removeCallbacksAndMessages(null);
            kVar.f21982d.clear();
            this.f21873d = null;
        }
        this.f21874e = null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.u
    public final void a() throws IOException {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.k kVar = this.f21873d;
        kVar.f21986h.b();
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar = kVar.f21989k;
        if (aVar != null) {
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h hVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h) kVar.f21982d.get(aVar);
            hVar.f21969b.b();
            IOException iOException = hVar.f21977j;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.u
    public final s a(int i10, com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar, long j10) {
        if (i10 == 0) {
            return new i(this.f21873d, this.f21871b, this.f21872c, bVar, j10);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.u
    public final void a(s sVar) {
        i iVar = (i) sVar;
        iVar.f21854a.f21985g.remove(iVar);
        iVar.f21861h.removeCallbacksAndMessages(null);
        n[] nVarArr = iVar.f21867n;
        if (nVarArr != null) {
            for (n nVar : nVarArr) {
                int size = nVar.f21887j.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) nVar.f21887j.valueAt(i10)).b();
                }
                nVar.f21884g.a(null);
                nVar.f21890m.removeCallbacksAndMessages(null);
                nVar.f21896s = true;
            }
        }
    }
}
