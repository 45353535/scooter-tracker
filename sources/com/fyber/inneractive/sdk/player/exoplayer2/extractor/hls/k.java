package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import com.fyber.inneractive.sdk.player.exoplayer2.source.v;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f21876b;

    public k(n nVar, int i10) {
        this.f21876b = nVar;
        this.f21875a = i10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.v
    public final void a() throws IOException {
        n nVar = this.f21876b;
        nVar.f21884g.b();
        f fVar = nVar.f21880c;
        com.fyber.inneractive.sdk.player.exoplayer2.source.g gVar = fVar.f21830j;
        if (gVar != null) {
            throw gVar;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar = fVar.f21831k;
        if (aVar != null) {
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h hVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h) fVar.f21825e.f21982d.get(aVar);
            hVar.f21969b.b();
            IOException iOException = hVar.f21977j;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.v
    public final boolean isReady() {
        boolean z10;
        n nVar = this.f21876b;
        int i10 = this.f21875a;
        if (!nVar.f21902y) {
            if (nVar.f21901x == -9223372036854775807L) {
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.e eVar = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) nVar.f21887j.valueAt(i10)).f21795c;
                synchronized (eVar) {
                    z10 = eVar.f21758i == 0;
                }
                if (!z10) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.v
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.p pVar, com.fyber.inneractive.sdk.player.exoplayer2.decoder.c cVar, boolean z10) {
        n nVar = this.f21876b;
        int i10 = this.f21875a;
        if (nVar.f21901x != -9223372036854775807L) {
            return -3;
        }
        loop0: while (nVar.f21888k.size() > 1) {
            int i11 = ((h) nVar.f21888k.getFirst()).f21837j;
            for (int i12 = 0; i12 < nVar.f21887j.size(); i12++) {
                if (nVar.f21899v[i12]) {
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.e eVar = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) nVar.f21887j.valueAt(i12)).f21795c;
                    if ((eVar.f21758i == 0 ? eVar.f21767r : eVar.f21751b[eVar.f21760k]) == i11) {
                        break loop0;
                    }
                }
            }
            nVar.f21888k.removeFirst();
        }
        h hVar = (h) nVar.f21888k.getFirst();
        com.fyber.inneractive.sdk.player.exoplayer2.o oVar = hVar.f22833c;
        if (!oVar.equals(nVar.f21894q)) {
            com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar = nVar.f21885h;
            int i13 = nVar.f21878a;
            int i14 = hVar.f22834d;
            Object obj = hVar.f22835e;
            long j10 = hVar.f22836f;
            if (fVar.f22849b != null) {
                fVar.f22848a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.e(fVar, i13, oVar, i14, obj, j10));
            }
        }
        nVar.f21894q = oVar;
        return ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) nVar.f21887j.valueAt(i10)).a(pVar, cVar, z10, nVar.f21902y, nVar.f21900w);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.v
    public final void a(long j10) {
        n nVar = this.f21876b;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) nVar.f21887j.valueAt(this.f21875a);
        if (nVar.f21902y && j10 > gVar.d()) {
            gVar.f();
        } else {
            gVar.a(true, j10);
        }
    }
}
