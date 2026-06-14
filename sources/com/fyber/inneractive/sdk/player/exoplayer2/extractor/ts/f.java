package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f22455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f22457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f22458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22459e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f22460f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f22461g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f22462h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.o f22463i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f22464j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f22465k;

    public f(String str) {
        byte[] bArr = new byte[15];
        this.f22455a = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(bArr);
        bArr[0] = Ascii.DEL;
        bArr[1] = -2;
        bArr[2] = UnsignedBytes.MAX_POWER_OF_TWO;
        bArr[3] = 1;
        this.f22459e = 0;
        this.f22456b = str;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a() {
        this.f22459e = 0;
        this.f22460f = 0;
        this.f22461g = 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void b() {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        this.f22457c = e0Var.f22454e;
        e0Var.b();
        this.f22458d = jVar.a(e0Var.f22453d, 1);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(boolean z10, long j10) {
        this.f22465k = j10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        char c10;
        while (true) {
            int i10 = nVar.f23136c - nVar.f23135b;
            if (i10 <= 0) {
                return;
            }
            int i11 = this.f22459e;
            if (i11 == 0) {
                while (true) {
                    if (nVar.f23136c - nVar.f23135b > 0) {
                        int i12 = this.f22461g << 8;
                        this.f22461g = i12;
                        int iJ = i12 | nVar.j();
                        this.f22461g = iJ;
                        if (iJ == 2147385345) {
                            this.f22461g = 0;
                            this.f22460f = 4;
                            this.f22459e = 1;
                            break;
                        }
                    }
                }
            } else if (i11 == 1) {
                byte[] bArr = this.f22455a.f23134a;
                int iMin = Math.min(i10, 15 - this.f22460f);
                nVar.a(bArr, this.f22460f, iMin);
                int i13 = this.f22460f + iMin;
                this.f22460f = i13;
                if (i13 == 15) {
                    byte[] bArr2 = this.f22455a.f23134a;
                    if (this.f22463i == null) {
                        String str = this.f22457c;
                        String str2 = this.f22456b;
                        com.fyber.inneractive.sdk.player.exoplayer2.util.m mVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.m(bArr2);
                        mVar.c(60);
                        int i14 = com.fyber.inneractive.sdk.player.exoplayer2.audio.t.f21658a[mVar.a(6)];
                        int i15 = com.fyber.inneractive.sdk.player.exoplayer2.audio.t.f21659b[mVar.a(4)];
                        int iA = mVar.a(5);
                        c10 = 5;
                        int i16 = iA >= 29 ? -1 : (com.fyber.inneractive.sdk.player.exoplayer2.audio.t.f21660c[iA] * 1000) / 2;
                        mVar.c(10);
                        com.fyber.inneractive.sdk.player.exoplayer2.o oVarA = com.fyber.inneractive.sdk.player.exoplayer2.o.a(str, "audio/vnd.dts", i16, -1, i14 + (mVar.a(2) > 0 ? 1 : 0), i15, null, null, str2);
                        this.f22463i = oVarA;
                        this.f22458d.a(oVarA);
                    } else {
                        c10 = 5;
                    }
                    this.f22464j = (((bArr2[c10] & 2) << 12) | ((bArr2[6] & 255) << 4) | ((bArr2[7] & 240) >> 4)) + 1;
                    this.f22462h = (int) ((((long) (((((bArr2[4] & 1) << 6) | ((r3 & 252) >> 2)) + 1) * 32)) * 1000000) / ((long) this.f22463i.f22806s));
                    this.f22455a.e(0);
                    this.f22458d.a(15, this.f22455a);
                    this.f22459e = 2;
                }
            } else if (i11 == 2) {
                int iMin2 = Math.min(i10, this.f22464j - this.f22460f);
                this.f22458d.a(iMin2, nVar);
                int i17 = this.f22460f + iMin2;
                this.f22460f = i17;
                int i18 = this.f22464j;
                if (i17 == i18) {
                    this.f22458d.a(this.f22465k, 1, i18, 0, null);
                    this.f22465k += this.f22462h;
                    this.f22459e = 0;
                }
            }
        }
    }
}
