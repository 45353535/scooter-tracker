package com.fyber.inneractive.sdk.player.exoplayer2.source;

import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class o implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f22871b;

    public o(p pVar, int i10) {
        this.f22871b = pVar;
        this.f22870a = i10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.v
    public final void a() throws IOException {
        this.f22871b.f22880i.b();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.v
    public final boolean isReady() {
        boolean z10;
        p pVar = this.f22871b;
        int i10 = this.f22870a;
        if (!pVar.F) {
            if (pVar.D == -9223372036854775807L) {
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.e eVar = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) pVar.f22886o.valueAt(i10)).f21795c;
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
        p pVar2 = this.f22871b;
        int i10 = this.f22870a;
        if (pVar2.f22892u || pVar2.D != -9223372036854775807L) {
            return -3;
        }
        return ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) pVar2.f22886o.valueAt(i10)).a(pVar, cVar, z10, pVar2.F, pVar2.C);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.v
    public final void a(long j10) {
        p pVar = this.f22871b;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) pVar.f22886o.valueAt(this.f22870a);
        if (pVar.F && j10 > gVar.d()) {
            gVar.f();
        } else {
            gVar.a(true, j10);
        }
    }
}
