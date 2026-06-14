package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import android.util.Log;
import android.util.Pair;
import com.google.android.material.internal.ViewUtils;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements h {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final byte[] f22427r = {73, 68, 51};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f22428a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f22431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f22432e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f22433f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f22434g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f22438k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f22439l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f22440m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f22441n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f22442o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f22443p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f22444q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.m f22429b = new com.fyber.inneractive.sdk.player.exoplayer2.util.m(new byte[7]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f22430c = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(Arrays.copyOf(f22427r, 10));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f22435h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f22436i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f22437j = 256;

    public d(boolean z10, String str) {
        this.f22428a = z10;
        this.f22431d = str;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        int i10 = 7;
        while (true) {
            int i11 = nVar.f23136c;
            int i12 = nVar.f23135b;
            int i13 = i11 - i12;
            if (i13 <= 0) {
                return;
            }
            int i14 = this.f22435h;
            if (i14 == 0) {
                byte[] bArr = nVar.f23134a;
                while (true) {
                    if (i12 >= i11) {
                        nVar.e(i12);
                        break;
                    }
                    int i15 = i12 + 1;
                    byte b10 = bArr[i12];
                    int i16 = b10 & 255;
                    int i17 = this.f22437j;
                    if (i17 != 512 || i16 < 240 || i16 == 255) {
                        int i18 = i17 | i16;
                        if (i18 == 329) {
                            this.f22437j = ViewUtils.EDGE_TO_EDGE_FLAGS;
                        } else if (i18 == 511) {
                            this.f22437j = 512;
                        } else if (i18 == 836) {
                            this.f22437j = 1024;
                        } else {
                            if (i18 == 1075) {
                                this.f22435h = 1;
                                this.f22436i = 3;
                                this.f22441n = 0;
                                this.f22430c.e(0);
                                nVar.e(i15);
                                break;
                            }
                            if (i17 != 256) {
                                this.f22437j = 256;
                            }
                        }
                        i12 = i15;
                    } else {
                        this.f22438k = (b10 & 1) == 0;
                        this.f22435h = 2;
                        this.f22436i = 0;
                        nVar.e(i15);
                    }
                }
                i10 = 7;
            } else if (i14 == 1) {
                byte[] bArr2 = this.f22430c.f23134a;
                int iMin = Math.min(i13, 10 - this.f22436i);
                nVar.a(bArr2, this.f22436i, iMin);
                int i19 = this.f22436i + iMin;
                this.f22436i = i19;
                if (i19 == 10) {
                    this.f22434g.a(10, this.f22430c);
                    this.f22430c.e(6);
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar = this.f22434g;
                    int i20 = this.f22430c.i() + 10;
                    this.f22435h = 3;
                    this.f22436i = 10;
                    this.f22443p = rVar;
                    this.f22444q = 0L;
                    this.f22441n = i20;
                }
            } else if (i14 == 2) {
                int i21 = this.f22438k ? i10 : 5;
                byte[] bArr3 = this.f22429b.f23130a;
                int iMin2 = Math.min(i13, i21 - this.f22436i);
                nVar.a(bArr3, this.f22436i, iMin2);
                int i22 = this.f22436i + iMin2;
                this.f22436i = i22;
                if (i22 == i21) {
                    this.f22429b.b(0);
                    if (this.f22439l) {
                        this.f22429b.c(10);
                    } else {
                        int iA = this.f22429b.a(2) + 1;
                        if (iA != 2) {
                            Log.w("AdtsReader", "Detected audio object type: " + iA + ", but assuming AAC LC.");
                            iA = 2;
                        }
                        int iA2 = this.f22429b.a(4);
                        this.f22429b.c(1);
                        byte[] bArr4 = {(byte) (((iA << 3) & 248) | ((iA2 >> 1) & i10)), (byte) (((iA2 << i10) & 128) | ((this.f22429b.a(3) << 3) & 120))};
                        Pair pairA = com.fyber.inneractive.sdk.player.exoplayer2.util.d.a(bArr4);
                        com.fyber.inneractive.sdk.player.exoplayer2.o oVarA = com.fyber.inneractive.sdk.player.exoplayer2.o.a(this.f22432e, "audio/mp4a-latm", -1, -1, ((Integer) pairA.second).intValue(), ((Integer) pairA.first).intValue(), Collections.singletonList(bArr4), null, this.f22431d);
                        this.f22440m = 1024000000 / ((long) oVarA.f22806s);
                        this.f22433f.a(oVarA);
                        this.f22439l = true;
                    }
                    this.f22429b.c(4);
                    int iA3 = this.f22429b.a(13);
                    int i23 = iA3 - 7;
                    if (this.f22438k) {
                        i23 = iA3 - 9;
                    }
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar2 = this.f22433f;
                    long j10 = this.f22440m;
                    this.f22435h = 3;
                    this.f22436i = 0;
                    this.f22443p = rVar2;
                    this.f22444q = j10;
                    this.f22441n = i23;
                }
            } else if (i14 == 3) {
                int iMin3 = Math.min(i13, this.f22441n - this.f22436i);
                this.f22443p.a(iMin3, nVar);
                int i24 = this.f22436i + iMin3;
                this.f22436i = i24;
                int i25 = this.f22441n;
                if (i24 == i25) {
                    this.f22443p.a(this.f22442o, 1, i25, 0, null);
                    this.f22442o += this.f22444q;
                    this.f22435h = 0;
                    this.f22436i = 0;
                    this.f22437j = 256;
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void b() {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        this.f22432e = e0Var.f22454e;
        e0Var.b();
        this.f22433f = jVar.a(e0Var.f22453d, 1);
        if (this.f22428a) {
            e0Var.a();
            e0Var.b();
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA = jVar.a(e0Var.f22453d, 4);
            this.f22434g = gVarA;
            e0Var.b();
            gVarA.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(e0Var.f22454e, "application/id3", (com.fyber.inneractive.sdk.player.exoplayer2.drm.d) null));
            return;
        }
        this.f22434g = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.h();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(boolean z10, long j10) {
        this.f22442o = j10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a() {
        this.f22435h = 0;
        this.f22436i = 0;
        this.f22437j = 256;
    }
}
