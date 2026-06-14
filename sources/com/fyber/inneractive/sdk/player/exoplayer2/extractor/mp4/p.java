package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.collection.SieveCacheKt;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.io.EOFException;
import java.util.Stack;

/* JADX INFO: loaded from: classes7.dex */
public final class p implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.i, com.fyber.inneractive.sdk.player.exoplayer2.extractor.q {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f22242p = z.a("qt  ");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22247e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f22248f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f22249g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f22250h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.util.n f22251i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f22252j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f22253k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.j f22254l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public o[] f22255m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f22256n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f22257o;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f22245c = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(16);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Stack f22246d = new Stack();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f22243a = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(com.fyber.inneractive.sdk.player.exoplayer2.util.l.f23126a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f22244b = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(4);

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final boolean a() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long c() {
        return this.f22256n;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        return r.a(bVar, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:406:0x0993, code lost:
    
        r2 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x0997, code lost:
    
        if (r2.f22247e == 2) goto L456;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x0999, code lost:
    
        r2.f22247e = 0;
        r2.f22250h = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x099e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:?, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(long r85) throws com.fyber.inneractive.sdk.player.exoplayer2.r {
        /*
            Method dump skipped, instruction units count: 2463
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.p.c(long):void");
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar) {
        this.f22254l = jVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j10, long j11) {
        int i10;
        this.f22246d.clear();
        this.f22250h = 0;
        this.f22252j = 0;
        this.f22253k = 0;
        if (j10 == 0) {
            this.f22247e = 0;
            this.f22250h = 0;
            return;
        }
        o[] oVarArr = this.f22255m;
        if (oVarArr != null) {
            for (o oVar : oVarArr) {
                v vVar = oVar.f22239b;
                int iA = z.a(vVar.f22294e, j11, false);
                while (true) {
                    i10 = -1;
                    if (iA < 0) {
                        iA = -1;
                        break;
                    } else if ((vVar.f22295f[iA] & 1) != 0) {
                        break;
                    } else {
                        iA--;
                    }
                }
                if (iA != -1) {
                    i10 = iA;
                    break;
                    break;
                }
                iA = z.a(vVar.f22294e, j11, true, false);
                while (iA < vVar.f22294e.length) {
                    if ((vVar.f22295f[iA] & 1) != 0) {
                        i10 = iA;
                        break;
                    }
                    iA++;
                }
                oVar.f22241d = i10;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o oVar) throws InterruptedException, com.fyber.inneractive.sdk.player.exoplayer2.r, EOFException {
        o[] oVarArr;
        boolean z10;
        while (true) {
            int i10 = this.f22247e;
            boolean z11 = false;
            if (i10 == 0) {
                if (this.f22250h == 0) {
                    if (!bVar.b(this.f22245c.f23134a, 0, 8, true)) {
                        return -1;
                    }
                    this.f22250h = 8;
                    this.f22245c.e(0);
                    this.f22249g = this.f22245c.k();
                    this.f22248f = this.f22245c.b();
                }
                if (this.f22249g == 1) {
                    bVar.b(this.f22245c.f23134a, 8, 8, false);
                    this.f22250h += 8;
                    this.f22249g = this.f22245c.n();
                }
                int i11 = this.f22248f;
                if (i11 != c.C && i11 != c.E && i11 != c.F && i11 != c.G && i11 != c.H && i11 != c.Q) {
                    if (i11 != c.S && i11 != c.D && i11 != c.T && i11 != c.U && i11 != c.f22116m0 && i11 != c.f22118n0 && i11 != c.f22120o0 && i11 != c.R && i11 != c.f22122p0 && i11 != c.f22124q0 && i11 != c.f22126r0 && i11 != c.f22128s0 && i11 != c.f22130t0 && i11 != c.P && i11 != c.f22093b && i11 != c.A0) {
                        this.f22251i = null;
                        this.f22247e = 1;
                    } else if (this.f22250h == 8) {
                        long j10 = this.f22249g;
                        if (j10 <= SieveCacheKt.NodeLinkMask) {
                            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.n((int) j10);
                            this.f22251i = nVar;
                            System.arraycopy(this.f22245c.f23134a, 0, nVar.f23134a, 0, 8);
                            this.f22247e = 1;
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    long j11 = (bVar.f21741c + this.f22249g) - ((long) this.f22250h);
                    this.f22246d.add(new a(this.f22248f, j11));
                    if (this.f22249g == this.f22250h) {
                        c(j11);
                    } else {
                        this.f22247e = 0;
                        this.f22250h = 0;
                    }
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException();
                    }
                    long j12 = Long.MAX_VALUE;
                    int i12 = -1;
                    int i13 = 0;
                    while (true) {
                        oVarArr = this.f22255m;
                        if (i13 >= oVarArr.length) {
                            break;
                        }
                        o oVar2 = oVarArr[i13];
                        int i14 = oVar2.f22241d;
                        v vVar = oVar2.f22239b;
                        if (i14 != vVar.f22290a) {
                            long j13 = vVar.f22291b[i14];
                            if (j13 < j12) {
                                i12 = i13;
                                j12 = j13;
                            }
                        }
                        i13++;
                    }
                    if (i12 == -1) {
                        return -1;
                    }
                    o oVar3 = oVarArr[i12];
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar = oVar3.f22240c;
                    int i15 = oVar3.f22241d;
                    v vVar2 = oVar3.f22239b;
                    long j14 = vVar2.f22291b[i15];
                    int i16 = vVar2.f22292c[i15];
                    if (oVar3.f22238a.f22265g == 1) {
                        j14 += 8;
                        i16 -= 8;
                    }
                    long j15 = (j14 - bVar.f21741c) + ((long) this.f22252j);
                    if (j15 >= 0 && j15 < PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                        bVar.a((int) j15);
                        int i17 = oVar3.f22238a.f22269k;
                        if (i17 == 0) {
                            while (true) {
                                int i18 = this.f22252j;
                                if (i18 >= i16) {
                                    break;
                                }
                                int iA = rVar.a(bVar, i16 - i18, false);
                                this.f22252j += iA;
                                this.f22253k -= iA;
                            }
                        } else {
                            byte[] bArr = this.f22244b.f23134a;
                            bArr[0] = 0;
                            bArr[1] = 0;
                            bArr[2] = 0;
                            int i19 = 4 - i17;
                            while (this.f22252j < i16) {
                                int i20 = this.f22253k;
                                if (i20 == 0) {
                                    bVar.b(this.f22244b.f23134a, i19, i17, false);
                                    this.f22244b.e(0);
                                    this.f22253k = this.f22244b.m();
                                    this.f22243a.e(0);
                                    rVar.a(4, this.f22243a);
                                    this.f22252j += 4;
                                    i16 += i19;
                                } else {
                                    int iA2 = rVar.a(bVar, i20, false);
                                    this.f22252j += iA2;
                                    this.f22253k -= iA2;
                                }
                            }
                        }
                        int i21 = i16;
                        v vVar3 = oVar3.f22239b;
                        rVar.a(vVar3.f22294e[i15], vVar3.f22295f[i15], i21, 0, null);
                        oVar3.f22241d++;
                        this.f22252j = 0;
                        this.f22253k = 0;
                        return 0;
                    }
                    oVar.f22310a = j14;
                    return 1;
                }
                long j16 = this.f22249g;
                int i22 = this.f22250h;
                long j17 = j16 - ((long) i22);
                long j18 = bVar.f21741c + j17;
                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = this.f22251i;
                if (nVar2 != null) {
                    bVar.b(nVar2.f23134a, i22, (int) j17, false);
                    if (this.f22248f == c.f22093b) {
                        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar3 = this.f22251i;
                        nVar3.e(8);
                        if (nVar3.b() != f22242p) {
                            nVar3.e(nVar3.f23135b + 4);
                            while (nVar3.f23136c - nVar3.f23135b > 0) {
                                if (nVar3.b() == f22242p) {
                                    z10 = true;
                                    break;
                                }
                            }
                            z10 = false;
                            this.f22257o = z10;
                        } else {
                            z10 = true;
                            this.f22257o = z10;
                        }
                    } else if (!this.f22246d.isEmpty()) {
                        ((a) this.f22246d.peek()).Q0.add(new b(this.f22248f, this.f22251i));
                    }
                } else if (j17 < PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                    bVar.a((int) j17);
                } else {
                    oVar.f22310a = j18;
                    z11 = true;
                }
                c(j18);
                if (z11 && this.f22247e != 2) {
                    return 1;
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long a(long j10) {
        int i10;
        long j11 = Long.MAX_VALUE;
        for (o oVar : this.f22255m) {
            v vVar = oVar.f22239b;
            int iA = z.a(vVar.f22294e, j10, false);
            while (true) {
                i10 = -1;
                if (iA < 0) {
                    iA = -1;
                    break;
                }
                if ((vVar.f22295f[iA] & 1) != 0) {
                    break;
                }
                iA--;
            }
            if (iA != -1) {
                i10 = iA;
                break;
            }
            iA = z.a(vVar.f22294e, j10, true, false);
            while (iA < vVar.f22294e.length) {
                if ((vVar.f22295f[iA] & 1) != 0) {
                    i10 = iA;
                    break;
                }
                iA++;
            }
            long j12 = vVar.f22291b[i10];
            if (j12 < j11) {
                j11 = j12;
            }
        }
        return j11;
    }
}
