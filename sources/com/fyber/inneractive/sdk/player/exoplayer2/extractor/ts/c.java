package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import java.io.EOFException;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f22420e = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("ID3");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f22422b = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(200);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f22423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f22424d;

    public c(long j10) {
        this.f22421a = j10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) throws InterruptedException, EOFException {
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(10);
        com.fyber.inneractive.sdk.player.exoplayer2.util.m mVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.m(nVar.f23134a);
        int i10 = 0;
        while (true) {
            bVar.a(nVar.f23134a, 0, 10, false);
            nVar.e(0);
            if (nVar.l() != f22420e) {
                break;
            }
            nVar.e(nVar.f23135b + 3);
            int i11 = nVar.i();
            i10 += i11 + 10;
            bVar.a(i11, false);
        }
        bVar.f21743e = 0;
        bVar.a(i10, false);
        int i12 = 0;
        int i13 = 0;
        int i14 = i10;
        while (true) {
            bVar.a(nVar.f23134a, 0, 2, false);
            nVar.e(0);
            if ((nVar.o() & 65526) != 65520) {
                bVar.f21743e = 0;
                i14++;
                if (i14 - i10 >= 8192) {
                    return false;
                }
                bVar.a(i14, false);
                i12 = 0;
                i13 = 0;
            } else {
                i12++;
                if (i12 >= 4 && i13 > 188) {
                    return true;
                }
                bVar.a(nVar.f23134a, 0, 4, false);
                mVar.b(14);
                int iA = mVar.a(13);
                if (iA <= 6) {
                    return false;
                }
                bVar.a(iA - 6, false);
                i13 += iA;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar) {
        d dVar = new d(true, null);
        this.f22423c = dVar;
        dVar.a(jVar, new e0(Integer.MIN_VALUE, 0, 1));
        jVar.b();
        jVar.a(new com.fyber.inneractive.sdk.player.exoplayer2.extractor.p(-9223372036854775807L));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j10, long j11) {
        this.f22424d = false;
        d dVar = this.f22423c;
        dVar.f22435h = 0;
        dVar.f22436i = 0;
        dVar.f22437j = 256;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o oVar) throws InterruptedException, EOFException {
        int iMin;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar2;
        byte[] bArr = this.f22422b.f23134a;
        int i10 = bVar.f21744f;
        if (i10 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i10, 200);
            System.arraycopy(bVar.f21742d, 0, bArr, 0, iMin);
            bVar.b(iMin);
        }
        if (iMin == 0) {
            bVar2 = bVar;
            iMin = bVar2.a(bArr, 0, 200, 0, true);
        } else {
            bVar2 = bVar;
        }
        if (iMin != -1) {
            bVar2.f21741c += (long) iMin;
        }
        if (iMin == -1) {
            return -1;
        }
        this.f22422b.e(0);
        this.f22422b.d(iMin);
        if (!this.f22424d) {
            this.f22423c.f22442o = this.f22421a;
            this.f22424d = true;
        }
        this.f22423c.a(this.f22422b);
        return 0;
    }
}
