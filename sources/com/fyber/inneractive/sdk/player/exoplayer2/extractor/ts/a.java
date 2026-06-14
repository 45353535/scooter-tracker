package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import com.applovin.shadow.okio.Utf8;
import java.io.EOFException;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f22384e = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("ID3");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f22386b = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(2786);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f22387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f22388d;

    public a(long j10) {
        this.f22385a = j10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) throws InterruptedException, EOFException {
        int iA;
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(10);
        int i10 = 0;
        while (true) {
            bVar.a(nVar.f23134a, 0, 10, false);
            nVar.e(0);
            if (nVar.l() != f22384e) {
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
        int i13 = i10;
        while (true) {
            bVar.a(nVar.f23134a, 0, 5, false);
            nVar.e(0);
            if (nVar.o() != 2935) {
                bVar.f21743e = 0;
                i13++;
                if (i13 - i10 >= 8192) {
                    return false;
                }
                bVar.a(i13, false);
                i12 = 0;
            } else {
                i12++;
                if (i12 >= 4) {
                    return true;
                }
                byte[] bArr = nVar.f23134a;
                if (bArr.length < 5) {
                    iA = -1;
                } else {
                    byte b10 = bArr[4];
                    iA = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.a((b10 & 192) >> 6, b10 & Utf8.REPLACEMENT_BYTE);
                }
                if (iA == -1) {
                    return false;
                }
                bVar.a(iA - 5, false);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar) {
        b bVar = new b(null);
        this.f22387c = bVar;
        bVar.f22397d = "0";
        bVar.f22398e = jVar.a(0, 1);
        jVar.b();
        jVar.a(new com.fyber.inneractive.sdk.player.exoplayer2.extractor.p(-9223372036854775807L));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j10, long j11) {
        this.f22388d = false;
        this.f22387c.a();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o oVar) throws InterruptedException, EOFException {
        int iMin;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar2;
        byte[] bArr = this.f22386b.f23134a;
        int i10 = bVar.f21744f;
        if (i10 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i10, 2786);
            System.arraycopy(bVar.f21742d, 0, bArr, 0, iMin);
            bVar.b(iMin);
        }
        if (iMin == 0) {
            bVar2 = bVar;
            iMin = bVar2.a(bArr, 0, 2786, 0, true);
        } else {
            bVar2 = bVar;
        }
        if (iMin != -1) {
            bVar2.f21741c += (long) iMin;
        }
        if (iMin == -1) {
            return -1;
        }
        this.f22386b.e(0);
        this.f22386b.d(iMin);
        if (!this.f22388d) {
            this.f22387c.f22405l = this.f22385a;
            this.f22388d = true;
        }
        this.f22387c.a(this.f22386b);
        return 0;
    }
}
