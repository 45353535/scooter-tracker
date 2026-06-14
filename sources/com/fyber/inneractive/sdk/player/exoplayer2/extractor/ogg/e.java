package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import java.io.EOFException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l f22331a;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        boolean zA;
        boolean zEquals;
        try {
            g gVar = new g();
            if (gVar.a(bVar, true) && (gVar.f22338a & 2) == 2) {
                int iMin = Math.min(gVar.f22342e, 8);
                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(iMin);
                bVar.a(nVar.f23134a, 0, iMin, false);
                nVar.e(0);
                if (nVar.f23136c - nVar.f23135b >= 5 && nVar.j() == 127 && nVar.k() == 1179402563) {
                    this.f22331a = new d();
                } else {
                    nVar.e(0);
                    try {
                        zA = s.a(1, nVar, true);
                    } catch (com.fyber.inneractive.sdk.player.exoplayer2.r unused) {
                        zA = false;
                    }
                    if (zA) {
                        this.f22331a = new o();
                    } else {
                        nVar.e(0);
                        int i10 = i.f22345o;
                        int i11 = nVar.f23136c - nVar.f23135b;
                        byte[] bArr = i.f22346p;
                        if (i11 < bArr.length) {
                            zEquals = false;
                        } else {
                            byte[] bArr2 = new byte[bArr.length];
                            nVar.a(bArr2, 0, bArr.length);
                            zEquals = Arrays.equals(bArr2, bArr);
                        }
                        if (zEquals) {
                            this.f22331a = new i();
                        }
                    }
                }
                return true;
            }
        } catch (com.fyber.inneractive.sdk.player.exoplayer2.r unused2) {
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA = jVar.a(0, 1);
        jVar.b();
        l lVar = this.f22331a;
        lVar.f22352c = jVar;
        lVar.f22351b = gVarA;
        lVar.f22350a = new f();
        lVar.a(true);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j10, long j11) {
        l lVar = this.f22331a;
        f fVar = lVar.f22350a;
        g gVar = fVar.f22332a;
        gVar.f22338a = 0;
        gVar.f22339b = 0L;
        gVar.f22340c = 0;
        gVar.f22341d = 0;
        gVar.f22342e = 0;
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = fVar.f22333b;
        nVar.f23135b = 0;
        nVar.f23136c = 0;
        fVar.f22334c = -1;
        fVar.f22336e = false;
        if (j10 == 0) {
            lVar.a(!lVar.f22361l);
        } else if (lVar.f22357h != 0) {
            lVar.f22354e = lVar.f22353d.c(j11);
            lVar.f22357h = 2;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o oVar) throws InterruptedException, EOFException {
        l lVar = this.f22331a;
        int i10 = lVar.f22357h;
        if (i10 == 0) {
            boolean zA = true;
            while (zA) {
                if (!lVar.f22350a.a(bVar)) {
                    lVar.f22357h = 3;
                    return -1;
                }
                long j10 = bVar.f21741c;
                long j11 = lVar.f22355f;
                lVar.f22360k = j10 - j11;
                zA = lVar.a(lVar.f22350a.f22333b, j11, lVar.f22359j);
                if (zA) {
                    lVar.f22355f = bVar.f21741c;
                }
            }
            com.fyber.inneractive.sdk.player.exoplayer2.o oVar2 = lVar.f22359j.f22348a;
            lVar.f22358i = oVar2.f22806s;
            if (!lVar.f22362m) {
                lVar.f22351b.a(oVar2);
                lVar.f22362m = true;
            }
            c cVar = lVar.f22359j.f22349b;
            if (cVar != null) {
                lVar.f22353d = cVar;
            } else {
                long j12 = bVar.f21740b;
                if (j12 == -1) {
                    lVar.f22353d = new k();
                } else {
                    g gVar = lVar.f22350a.f22332a;
                    lVar.f22353d = new b(lVar.f22355f, j12, lVar, gVar.f22341d + gVar.f22342e, gVar.f22339b);
                }
            }
            lVar.f22359j = null;
            lVar.f22357h = 2;
            lVar.f22350a.a();
            return 0;
        }
        if (i10 == 1) {
            bVar.a((int) lVar.f22355f);
            lVar.f22357h = 2;
            return 0;
        }
        if (i10 == 2) {
            long jA = lVar.f22353d.a(bVar);
            if (jA >= 0) {
                oVar.f22310a = jA;
                return 1;
            }
            if (jA < -1) {
                lVar.a(-(jA + 2));
            }
            if (!lVar.f22361l) {
                lVar.f22352c.a(lVar.f22353d.b());
                lVar.f22361l = true;
            }
            if (lVar.f22360k <= 0 && !lVar.f22350a.a(bVar)) {
                lVar.f22357h = 3;
                return -1;
            }
            lVar.f22360k = 0L;
            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = lVar.f22350a.f22333b;
            long jA2 = lVar.a(nVar);
            if (jA2 >= 0) {
                long j13 = lVar.f22356g;
                if (j13 + jA2 >= lVar.f22354e) {
                    long j14 = (j13 * 1000000) / ((long) lVar.f22358i);
                    lVar.f22351b.a(nVar.f23136c, nVar);
                    lVar.f22351b.a(j14, 1, nVar.f23136c, 0, null);
                    lVar.f22354e = -1L;
                }
            }
            lVar.f22356g += jA2;
            return 0;
        }
        throw new IllegalStateException();
    }
}
