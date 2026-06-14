package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import com.google.common.base.Ascii;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.m f22394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f22395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f22397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f22398e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f22399f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f22400g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f22401h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f22402i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.o f22403j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f22404k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f22405l;

    public b(String str) {
        byte[] bArr = new byte[8];
        this.f22394a = new com.fyber.inneractive.sdk.player.exoplayer2.util.m(bArr);
        this.f22395b = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(bArr);
        this.f22396c = str;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a() {
        this.f22399f = 0;
        this.f22400g = 0;
        this.f22401h = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void b() {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        this.f22397d = e0Var.f22454e;
        e0Var.b();
        this.f22398e = jVar.a(e0Var.f22453d, 1);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(boolean z10, long j10) {
        this.f22405l = j10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        int iA;
        int i10;
        String str;
        int iA2;
        int i11;
        while (true) {
            int i12 = nVar.f23136c - nVar.f23135b;
            if (i12 <= 0) {
                return;
            }
            int i13 = this.f22399f;
            if (i13 == 0) {
                while (true) {
                    if (nVar.f23136c - nVar.f23135b <= 0) {
                        break;
                    }
                    if (!this.f22401h) {
                        this.f22401h = nVar.j() == 11;
                    } else {
                        int iJ = nVar.j();
                        if (iJ == 119) {
                            this.f22401h = false;
                            this.f22399f = 1;
                            byte[] bArr = this.f22395b.f23134a;
                            bArr[0] = Ascii.VT;
                            bArr[1] = 119;
                            this.f22400g = 2;
                            break;
                        }
                        this.f22401h = iJ == 11;
                    }
                }
            } else if (i13 == 1) {
                byte[] bArr2 = this.f22395b.f23134a;
                int iMin = Math.min(i12, 8 - this.f22400g);
                nVar.a(bArr2, this.f22400g, iMin);
                int i14 = this.f22400g + iMin;
                this.f22400g = i14;
                if (i14 == 8) {
                    this.f22394a.b(0);
                    com.fyber.inneractive.sdk.player.exoplayer2.util.m mVar = this.f22394a;
                    int i15 = (mVar.f23131b * 8) + mVar.f23132c;
                    mVar.c(40);
                    byte b10 = mVar.a(5) == 16;
                    mVar.b(i15);
                    int i16 = 6;
                    if (b10 != false) {
                        mVar.c(21);
                        iA2 = (mVar.a(11) + 1) * 2;
                        int iA3 = mVar.a(2);
                        if (iA3 == 3) {
                            i10 = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.f21582c[mVar.a(2)];
                        } else {
                            i16 = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.f21580a[mVar.a(2)];
                            i10 = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.f21581b[iA3];
                        }
                        i11 = i16 * 256;
                        iA = mVar.a(3);
                        str = "audio/eac3";
                    } else {
                        mVar.c(32);
                        int iA4 = mVar.a(2);
                        int iA5 = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.a(iA4, mVar.a(6));
                        mVar.c(8);
                        iA = mVar.a(3);
                        if ((iA & 1) != 0 && iA != 1) {
                            mVar.c(2);
                        }
                        if ((iA & 4) != 0) {
                            mVar.c(2);
                        }
                        if (iA == 2) {
                            mVar.c(2);
                        }
                        i10 = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.f21581b[iA4];
                        str = "audio/ac3";
                        iA2 = iA5;
                        i11 = 1536;
                    }
                    int i17 = i10;
                    String str2 = str;
                    int i18 = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.f21583d[iA] + (mVar.b() ? 1 : 0);
                    com.fyber.inneractive.sdk.player.exoplayer2.o oVar = this.f22403j;
                    if (oVar == null || i18 != oVar.f22805r || i17 != oVar.f22806s || str2 != oVar.f22793f) {
                        com.fyber.inneractive.sdk.player.exoplayer2.o oVarA = com.fyber.inneractive.sdk.player.exoplayer2.o.a(this.f22397d, str2, -1, -1, i18, i17, null, null, this.f22396c);
                        this.f22403j = oVarA;
                        this.f22398e.a(oVarA);
                    }
                    this.f22404k = iA2;
                    this.f22402i = (((long) i11) * 1000000) / ((long) this.f22403j.f22806s);
                    this.f22395b.e(0);
                    this.f22398e.a(8, this.f22395b);
                    this.f22399f = 2;
                }
            } else if (i13 == 2) {
                int iMin2 = Math.min(i12, this.f22404k - this.f22400g);
                this.f22398e.a(iMin2, nVar);
                int i19 = this.f22400g + iMin2;
                this.f22400g = i19;
                int i20 = this.f22404k;
                if (i19 == i20) {
                    this.f22398e.a(this.f22405l, 1, i20, 0, null);
                    this.f22405l += this.f22402i;
                    this.f22399f = 0;
                }
            }
        }
    }
}
