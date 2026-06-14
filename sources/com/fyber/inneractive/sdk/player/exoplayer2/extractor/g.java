package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.b f21793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f21795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedBlockingDeque f21796d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f21797e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f21798f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicInteger f21799g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f21800h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.o f21801i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f21802j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.upstream.a f21803k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f21804l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f21805m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public f f21806n;

    public g(com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar) {
        this.f21793a = bVar;
        ((com.fyber.inneractive.sdk.player.exoplayer2.upstream.l) bVar).getClass();
        this.f21794b = 65536;
        this.f21795c = new e();
        this.f21796d = new LinkedBlockingDeque();
        this.f21797e = new d();
        this.f21798f = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(32);
        this.f21799g = new AtomicInteger();
        this.f21804l = 65536;
    }

    public final void a(boolean z10) {
        int andSet = this.f21799g.getAndSet(z10 ? 0 : 2);
        a();
        e eVar = this.f21795c;
        eVar.f21762m = Long.MIN_VALUE;
        eVar.f21763n = Long.MIN_VALUE;
        if (andSet == 2) {
            this.f21801i = null;
        }
    }

    public final void b() {
        if (this.f21799g.getAndSet(2) == 0) {
            a();
        }
    }

    public final void c() {
        if (this.f21799g.compareAndSet(1, 0)) {
            return;
        }
        a();
    }

    public final long d() {
        long jMax;
        e eVar = this.f21795c;
        synchronized (eVar) {
            jMax = Math.max(eVar.f21762m, eVar.f21763n);
        }
        return jMax;
    }

    public final com.fyber.inneractive.sdk.player.exoplayer2.o e() {
        com.fyber.inneractive.sdk.player.exoplayer2.o oVar;
        e eVar = this.f21795c;
        synchronized (eVar) {
            oVar = eVar.f21765p ? null : eVar.f21766q;
        }
        return oVar;
    }

    public final void f() {
        long j10;
        e eVar = this.f21795c;
        synchronized (eVar) {
            int i10 = eVar.f21758i;
            if (i10 == 0) {
                j10 = -1;
            } else {
                int i11 = eVar.f21760k + i10;
                int i12 = eVar.f21750a;
                int i13 = (i11 - 1) % i12;
                eVar.f21760k = i11 % i12;
                eVar.f21759j += i10;
                eVar.f21758i = 0;
                j10 = eVar.f21752c[i13] + ((long) eVar.f21753d[i13]);
            }
        }
        if (j10 != -1) {
            a(j10);
        }
    }

    public final boolean a(boolean z10, long j10) {
        long j11;
        e eVar = this.f21795c;
        synchronized (eVar) {
            if (eVar.f21758i != 0) {
                long[] jArr = eVar.f21755f;
                int i10 = eVar.f21760k;
                if (j10 < jArr[i10]) {
                    j11 = -1;
                } else {
                    if (j10 <= eVar.f21763n || z10) {
                        int i11 = -1;
                        int i12 = 0;
                        while (i10 != eVar.f21761l && eVar.f21755f[i10] <= j10) {
                            if ((eVar.f21754e[i10] & 1) != 0) {
                                i11 = i12;
                            }
                            i10 = (i10 + 1) % eVar.f21750a;
                            i12++;
                        }
                        if (i11 != -1) {
                            int i13 = (eVar.f21760k + i11) % eVar.f21750a;
                            eVar.f21760k = i13;
                            eVar.f21759j += i11;
                            eVar.f21758i -= i11;
                            j11 = eVar.f21752c[i13];
                        }
                    }
                    j11 = -1;
                }
            } else {
                j11 = -1;
            }
        }
        if (j11 == -1) {
            return false;
        }
        a(j11);
        return true;
    }

    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.p pVar, com.fyber.inneractive.sdk.player.exoplayer2.decoder.c cVar, boolean z10, boolean z11, long j10) {
        int iO;
        long j11;
        byte b10;
        e eVar = this.f21795c;
        com.fyber.inneractive.sdk.player.exoplayer2.o oVar = this.f21801i;
        d dVar = this.f21797e;
        synchronized (eVar) {
            iO = 1;
            if (eVar.f21758i != 0) {
                if (!z10) {
                    com.fyber.inneractive.sdk.player.exoplayer2.o[] oVarArr = eVar.f21757h;
                    int i10 = eVar.f21760k;
                    if (oVarArr[i10] == oVar) {
                        if (cVar.f21721c == null && cVar.f21723e == 0) {
                            b10 = -3;
                        } else {
                            long j12 = eVar.f21755f[i10];
                            cVar.f21722d = j12;
                            cVar.f21719a = eVar.f21754e[i10];
                            dVar.f21746a = eVar.f21753d[i10];
                            dVar.f21747b = eVar.f21752c[i10];
                            dVar.f21749d = eVar.f21756g[i10];
                            eVar.f21762m = Math.max(eVar.f21762m, j12);
                            int i11 = eVar.f21758i - 1;
                            eVar.f21758i = i11;
                            int i12 = eVar.f21760k + 1;
                            eVar.f21760k = i12;
                            eVar.f21759j++;
                            if (i12 == eVar.f21750a) {
                                eVar.f21760k = 0;
                            }
                            if (i11 > 0) {
                                j11 = eVar.f21752c[eVar.f21760k];
                            } else {
                                j11 = dVar.f21747b + ((long) dVar.f21746a);
                            }
                            dVar.f21748c = j11;
                            b10 = -4;
                        }
                    }
                }
                pVar.f22814a = eVar.f21757h[eVar.f21760k];
                b10 = -5;
            } else if (z11) {
                cVar.f21719a = 4;
                b10 = -4;
            } else {
                com.fyber.inneractive.sdk.player.exoplayer2.o oVar2 = eVar.f21766q;
                if (oVar2 == null || (!z10 && oVar2 == oVar)) {
                    b10 = -3;
                } else {
                    pVar.f22814a = oVar2;
                    b10 = -5;
                }
            }
        }
        if (b10 == -5) {
            this.f21801i = pVar.f22814a;
            return -5;
        }
        if (b10 != -4) {
            if (b10 == -3) {
                return -3;
            }
            throw new IllegalStateException();
        }
        if (!cVar.b(4)) {
            if (cVar.f21722d < j10) {
                cVar.f21719a = Integer.MIN_VALUE | cVar.f21719a;
            }
            if (cVar.b(1073741824)) {
                d dVar2 = this.f21797e;
                long j13 = dVar2.f21747b;
                this.f21798f.c(1);
                a(j13, this.f21798f.f23134a, 1);
                long j14 = j13 + 1;
                byte b11 = this.f21798f.f23134a[0];
                boolean z12 = (b11 & UnsignedBytes.MAX_POWER_OF_TWO) != 0;
                int i13 = b11 & Ascii.DEL;
                com.fyber.inneractive.sdk.player.exoplayer2.decoder.b bVar = cVar.f21720b;
                if (bVar.f21714a == null) {
                    bVar.f21714a = new byte[16];
                }
                a(j14, bVar.f21714a, i13);
                long j15 = j14 + ((long) i13);
                if (z12) {
                    this.f21798f.c(2);
                    a(j15, this.f21798f.f23134a, 2);
                    j15 += 2;
                    iO = this.f21798f.o();
                }
                int i14 = iO;
                com.fyber.inneractive.sdk.player.exoplayer2.decoder.b bVar2 = cVar.f21720b;
                int[] iArr = bVar2.f21715b;
                if (iArr == null || iArr.length < i14) {
                    iArr = new int[i14];
                }
                int[] iArr2 = iArr;
                int[] iArr3 = bVar2.f21716c;
                if (iArr3 == null || iArr3.length < i14) {
                    iArr3 = new int[i14];
                }
                int[] iArr4 = iArr3;
                if (z12) {
                    int i15 = i14 * 6;
                    this.f21798f.c(i15);
                    a(j15, this.f21798f.f23134a, i15);
                    j15 += (long) i15;
                    this.f21798f.e(0);
                    for (int i16 = 0; i16 < i14; i16++) {
                        iArr2[i16] = this.f21798f.o();
                        iArr4[i16] = this.f21798f.m();
                    }
                } else {
                    iArr2[0] = 0;
                    iArr4[0] = dVar2.f21746a - ((int) (j15 - dVar2.f21747b));
                }
                com.fyber.inneractive.sdk.player.exoplayer2.decoder.b bVar3 = cVar.f21720b;
                bVar3.a(i14, iArr2, iArr4, dVar2.f21749d, bVar3.f21714a);
                long j16 = dVar2.f21747b;
                int i17 = (int) (j15 - j16);
                dVar2.f21747b = j16 + ((long) i17);
                dVar2.f21746a -= i17;
            }
            int i18 = this.f21797e.f21746a;
            ByteBuffer byteBuffer = cVar.f21721c;
            if (byteBuffer == null) {
                cVar.f21721c = cVar.a(i18);
            } else {
                int iCapacity = byteBuffer.capacity();
                int iPosition = cVar.f21721c.position();
                int i19 = i18 + iPosition;
                if (iCapacity < i19) {
                    ByteBuffer byteBufferA = cVar.a(i19);
                    if (iPosition > 0) {
                        cVar.f21721c.position(0);
                        cVar.f21721c.limit(iPosition);
                        byteBufferA.put(cVar.f21721c);
                    }
                    cVar.f21721c = byteBufferA;
                }
            }
            d dVar3 = this.f21797e;
            long j17 = dVar3.f21747b;
            ByteBuffer byteBuffer2 = cVar.f21721c;
            int i20 = dVar3.f21746a;
            while (i20 > 0) {
                a(j17);
                int i21 = (int) (j17 - this.f21800h);
                int iMin = Math.min(i20, this.f21794b - i21);
                com.fyber.inneractive.sdk.player.exoplayer2.upstream.a aVar = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.a) this.f21796d.peek();
                byteBuffer2.put(aVar.f22941a, aVar.f22942b + i21, iMin);
                j17 += (long) iMin;
                i20 -= iMin;
            }
            a(this.f21797e.f21748c);
        }
        return -4;
    }

    public final void a(long j10, byte[] bArr, int i10) {
        int i11 = 0;
        while (i11 < i10) {
            a(j10);
            int i12 = (int) (j10 - this.f21800h);
            int iMin = Math.min(i10 - i11, this.f21794b - i12);
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.a aVar = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.a) this.f21796d.peek();
            System.arraycopy(aVar.f22941a, aVar.f22942b + i12, bArr, i11, iMin);
            j10 += (long) iMin;
            i11 += iMin;
        }
    }

    public final void a(long j10) {
        int i10 = ((int) (j10 - this.f21800h)) / this.f21794b;
        for (int i11 = 0; i11 < i10; i11++) {
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar = this.f21793a;
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.a aVar = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.a) this.f21796d.remove();
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.l lVar = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.l) bVar;
            synchronized (lVar) {
                com.fyber.inneractive.sdk.player.exoplayer2.upstream.a[] aVarArr = lVar.f23042a;
                aVarArr[0] = aVar;
                lVar.a(aVarArr);
            }
            this.f21800h += (long) this.f21794b;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.r
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.o oVar) {
        boolean z10;
        if (oVar == null) {
            oVar = null;
        }
        e eVar = this.f21795c;
        synchronized (eVar) {
            z10 = true;
            if (oVar == null) {
                eVar.f21765p = true;
            } else {
                eVar.f21765p = false;
                com.fyber.inneractive.sdk.player.exoplayer2.o oVar2 = eVar.f21766q;
                int i10 = z.f23162a;
                if (!oVar.equals(oVar2)) {
                    eVar.f21766q = oVar;
                }
            }
            z10 = false;
        }
        f fVar = this.f21806n;
        if (fVar == null || !z10) {
            return;
        }
        fVar.e();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.r
    public final int a(b bVar, int i10, boolean z10) throws InterruptedException, EOFException {
        b bVar2;
        int iA = 0;
        if (!this.f21799g.compareAndSet(0, 1)) {
            int iMin = Math.min(bVar.f21744f, i10);
            bVar.b(iMin);
            if (iMin == 0) {
                iMin = bVar.a(b.f21738g, 0, Math.min(i10, 4096), 0, true);
            }
            if (iMin != -1) {
                bVar.f21741c += (long) iMin;
            }
            if (iMin != -1) {
                return iMin;
            }
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        try {
            int iA2 = a(i10);
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.a aVar = this.f21803k;
            byte[] bArr = aVar.f22941a;
            int i11 = aVar.f22942b + this.f21804l;
            int i12 = bVar.f21744f;
            if (i12 != 0) {
                int iMin2 = Math.min(i12, iA2);
                System.arraycopy(bVar.f21742d, 0, bArr, i11, iMin2);
                bVar.b(iMin2);
                iA = iMin2;
            }
            if (iA == 0) {
                bVar2 = bVar;
                iA = bVar.a(bArr, i11, iA2, 0, true);
            } else {
                bVar2 = bVar;
            }
            if (iA != -1) {
                bVar2.f21741c += (long) iA;
            }
            if (iA == -1) {
                if (z10) {
                    c();
                    return -1;
                }
                throw new EOFException();
            }
            this.f21804l += iA;
            this.f21802j += (long) iA;
            c();
            return iA;
        } catch (Throwable th2) {
            c();
            throw th2;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.r
    public final void a(int i10, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        if (!this.f21799g.compareAndSet(0, 1)) {
            nVar.e(nVar.f23135b + i10);
            return;
        }
        while (i10 > 0) {
            int iA = a(i10);
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.a aVar = this.f21803k;
            nVar.a(aVar.f22941a, aVar.f22942b + this.f21804l, iA);
            this.f21804l += iA;
            this.f21802j += (long) iA;
            i10 -= iA;
        }
        c();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.r
    public final void a(long j10, int i10, int i11, int i12, byte[] bArr) {
        if (!this.f21799g.compareAndSet(0, 1)) {
            e eVar = this.f21795c;
            synchronized (eVar) {
                eVar.f21763n = Math.max(eVar.f21763n, j10);
            }
            return;
        }
        try {
            if (this.f21805m) {
                if ((i10 & 1) != 0 && this.f21795c.a(j10)) {
                    this.f21805m = false;
                }
                return;
            }
            this.f21795c.a(j10, i10, (this.f21802j - ((long) i11)) - ((long) i12), i11, bArr);
        } finally {
            c();
        }
    }

    public final void a() {
        e eVar = this.f21795c;
        eVar.f21759j = 0;
        eVar.f21760k = 0;
        eVar.f21761l = 0;
        eVar.f21758i = 0;
        eVar.f21764o = true;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar = this.f21793a;
        LinkedBlockingDeque linkedBlockingDeque = this.f21796d;
        ((com.fyber.inneractive.sdk.player.exoplayer2.upstream.l) bVar).a((com.fyber.inneractive.sdk.player.exoplayer2.upstream.a[]) linkedBlockingDeque.toArray(new com.fyber.inneractive.sdk.player.exoplayer2.upstream.a[linkedBlockingDeque.size()]));
        this.f21796d.clear();
        ((com.fyber.inneractive.sdk.player.exoplayer2.upstream.l) this.f21793a).a();
        this.f21800h = 0L;
        this.f21802j = 0L;
        this.f21803k = null;
        this.f21804l = this.f21794b;
    }

    public final int a(int i10) {
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.a aVar;
        if (this.f21804l == this.f21794b) {
            this.f21804l = 0;
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.l lVar = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.l) this.f21793a;
            synchronized (lVar) {
                try {
                    lVar.f23044c++;
                    int i11 = lVar.f23045d;
                    if (i11 > 0) {
                        com.fyber.inneractive.sdk.player.exoplayer2.upstream.a[] aVarArr = lVar.f23046e;
                        int i12 = i11 - 1;
                        lVar.f23045d = i12;
                        aVar = aVarArr[i12];
                        aVarArr[i12] = null;
                    } else {
                        aVar = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.a(0, new byte[65536]);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f21803k = aVar;
            this.f21796d.add(aVar);
        }
        return Math.min(i10, this.f21794b - this.f21804l);
    }
}
