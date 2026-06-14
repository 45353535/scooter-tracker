package vb;

import com.google.android.material.internal.ViewUtils;
import io.bidmachine.media3.common.a;
import java.util.Arrays;
import java.util.Collections;
import oa.a;
import oa.s0;
import q9.o0;
import vb.l0;

/* JADX INFO: loaded from: classes12.dex */
public final class i implements m {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final byte[] f106147x = {73, 68, 51};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f106148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q9.c0 f106149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q9.d0 f106150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f106151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f106152e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f106153f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f106154g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private s0 f106155h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private s0 f106156i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f106157j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f106158k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f106159l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f106160m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f106161n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f106162o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f106163p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f106164q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f106165r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f106166s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f106167t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f106168u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private s0 f106169v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f106170w;

    public i(boolean z10, String str) {
        this(z10, null, 0, str);
    }

    private void c() {
        q9.a.e(this.f106155h);
        o0.i(this.f106169v);
        o0.i(this.f106156i);
    }

    private void d(q9.d0 d0Var) {
        if (d0Var.a() == 0) {
            return;
        }
        this.f106149b.f98765a[0] = d0Var.e()[d0Var.f()];
        this.f106149b.p(2);
        int iH = this.f106149b.h(4);
        int i10 = this.f106163p;
        if (i10 != -1 && iH != i10) {
            n();
            return;
        }
        if (!this.f106161n) {
            this.f106161n = true;
            this.f106162o = this.f106164q;
            this.f106163p = iH;
        }
        q();
    }

    private boolean e(q9.d0 d0Var, int i10) {
        d0Var.W(i10 + 1);
        if (!t(d0Var, this.f106149b.f98765a, 1)) {
            return false;
        }
        this.f106149b.p(4);
        int iH = this.f106149b.h(1);
        int i11 = this.f106162o;
        if (i11 != -1 && iH != i11) {
            return false;
        }
        if (this.f106163p != -1) {
            if (!t(d0Var, this.f106149b.f98765a, 1)) {
                return true;
            }
            this.f106149b.p(2);
            if (this.f106149b.h(4) != this.f106163p) {
                return false;
            }
            d0Var.W(i10 + 2);
        }
        if (!t(d0Var, this.f106149b.f98765a, 4)) {
            return true;
        }
        this.f106149b.p(14);
        int iH2 = this.f106149b.h(13);
        if (iH2 < 7) {
            return false;
        }
        byte[] bArrE = d0Var.e();
        int iG = d0Var.g();
        int i12 = i10 + iH2;
        if (i12 >= iG) {
            return true;
        }
        byte b10 = bArrE[i12];
        if (b10 == -1) {
            int i13 = i12 + 1;
            if (i13 == iG) {
                return true;
            }
            return i((byte) -1, bArrE[i13]) && ((bArrE[i13] & 8) >> 3) == iH;
        }
        if (b10 != 73) {
            return false;
        }
        int i14 = i12 + 1;
        if (i14 == iG) {
            return true;
        }
        if (bArrE[i14] != 68) {
            return false;
        }
        int i15 = i12 + 2;
        return i15 == iG || bArrE[i15] == 51;
    }

    private boolean f(q9.d0 d0Var, byte[] bArr, int i10) {
        int iMin = Math.min(d0Var.a(), i10 - this.f106158k);
        d0Var.l(bArr, this.f106158k, iMin);
        int i11 = this.f106158k + iMin;
        this.f106158k = i11;
        return i11 == i10;
    }

    private void g(q9.d0 d0Var) {
        byte[] bArrE = d0Var.e();
        int iF = d0Var.f();
        int iG = d0Var.g();
        while (iF < iG) {
            int i10 = iF + 1;
            byte b10 = bArrE[iF];
            int i11 = b10 & 255;
            if (this.f106159l == 512 && i((byte) -1, (byte) i11) && (this.f106161n || e(d0Var, iF - 1))) {
                this.f106164q = (b10 & 8) >> 3;
                this.f106160m = (b10 & 1) == 0;
                if (this.f106161n) {
                    q();
                } else {
                    o();
                }
                d0Var.W(i10);
                return;
            }
            int i12 = this.f106159l;
            int i13 = i11 | i12;
            if (i13 == 329) {
                this.f106159l = ViewUtils.EDGE_TO_EDGE_FLAGS;
            } else if (i13 == 511) {
                this.f106159l = 512;
            } else if (i13 == 836) {
                this.f106159l = 1024;
            } else if (i13 == 1075) {
                r();
                d0Var.W(i10);
                return;
            } else if (i12 != 256) {
                this.f106159l = 256;
            }
            iF = i10;
        }
        d0Var.W(iF);
    }

    private boolean i(byte b10, byte b11) {
        return j(((b10 & 255) << 8) | (b11 & 255));
    }

    public static boolean j(int i10) {
        return (i10 & 65526) == 65520;
    }

    private void k() {
        this.f106149b.p(0);
        if (this.f106165r) {
            this.f106149b.r(10);
        } else {
            int i10 = 2;
            int iH = this.f106149b.h(2) + 1;
            if (iH != 2) {
                q9.u.h("AdtsReader", "Detected audio object type: " + iH + ", but assuming AAC LC.");
            } else {
                i10 = iH;
            }
            this.f106149b.r(5);
            byte[] bArrA = oa.a.a(i10, this.f106163p, this.f106149b.h(3));
            a.b bVarE = oa.a.e(bArrA);
            io.bidmachine.media3.common.a aVarN = new a.b().f0(this.f106154g).U(this.f106153f).u0("audio/mp4a-latm").S(bVarE.f96448c).R(bVarE.f96447b).v0(bVarE.f96446a).g0(Collections.singletonList(bArrA)).j0(this.f106151d).s0(this.f106152e).N();
            this.f106166s = 1024000000 / ((long) aVarN.F);
            this.f106155h.f(aVarN);
            this.f106165r = true;
        }
        this.f106149b.r(4);
        int iH2 = this.f106149b.h(13);
        int i11 = iH2 - 7;
        if (this.f106160m) {
            i11 = iH2 - 9;
        }
        s(this.f106155h, this.f106166s, 0, i11);
    }

    private void l() {
        this.f106156i.c(this.f106150c, 10);
        this.f106150c.W(6);
        s(this.f106156i, 0L, 10, this.f106150c.G() + 10);
    }

    private void m(q9.d0 d0Var) {
        int iMin = Math.min(d0Var.a(), this.f106167t - this.f106158k);
        this.f106169v.c(d0Var, iMin);
        int i10 = this.f106158k + iMin;
        this.f106158k = i10;
        if (i10 == this.f106167t) {
            q9.a.g(this.f106168u != -9223372036854775807L);
            this.f106169v.e(this.f106168u, 1, this.f106167t, 0, null);
            this.f106168u += this.f106170w;
            p();
        }
    }

    private void n() {
        this.f106161n = false;
        p();
    }

    private void o() {
        this.f106157j = 1;
        this.f106158k = 0;
    }

    private void p() {
        this.f106157j = 0;
        this.f106158k = 0;
        this.f106159l = 256;
    }

    private void q() {
        this.f106157j = 3;
        this.f106158k = 0;
    }

    private void r() {
        this.f106157j = 2;
        this.f106158k = f106147x.length;
        this.f106167t = 0;
        this.f106150c.W(0);
    }

    private void s(s0 s0Var, long j10, int i10, int i11) {
        this.f106157j = 4;
        this.f106158k = i10;
        this.f106169v = s0Var;
        this.f106170w = j10;
        this.f106167t = i11;
    }

    private boolean t(q9.d0 d0Var, byte[] bArr, int i10) {
        if (d0Var.a() < i10) {
            return false;
        }
        d0Var.l(bArr, 0, i10);
        return true;
    }

    @Override // vb.m
    public void a(q9.d0 d0Var) {
        c();
        while (d0Var.a() > 0) {
            int i10 = this.f106157j;
            if (i10 == 0) {
                g(d0Var);
            } else if (i10 == 1) {
                d(d0Var);
            } else if (i10 != 2) {
                if (i10 == 3) {
                    if (f(d0Var, this.f106149b.f98765a, this.f106160m ? 7 : 5)) {
                        k();
                    }
                } else {
                    if (i10 != 4) {
                        throw new IllegalStateException();
                    }
                    m(d0Var);
                }
            } else if (f(d0Var, this.f106150c.e(), 10)) {
                l();
            }
        }
    }

    @Override // vb.m
    public void b(oa.t tVar, l0.d dVar) {
        dVar.a();
        this.f106154g = dVar.b();
        s0 s0VarTrack = tVar.track(dVar.c(), 1);
        this.f106155h = s0VarTrack;
        this.f106169v = s0VarTrack;
        if (!this.f106148a) {
            this.f106156i = new oa.n();
            return;
        }
        dVar.a();
        s0 s0VarTrack2 = tVar.track(dVar.c(), 5);
        this.f106156i = s0VarTrack2;
        s0VarTrack2.f(new a.b().f0(dVar.b()).U(this.f106153f).u0("application/id3").N());
    }

    public long h() {
        return this.f106166s;
    }

    @Override // vb.m
    public void packetStarted(long j10, int i10) {
        this.f106168u = j10;
    }

    @Override // vb.m
    public void seek() {
        this.f106168u = -9223372036854775807L;
        n();
    }

    public i(boolean z10, String str, int i10, String str2) {
        this.f106149b = new q9.c0(new byte[7]);
        this.f106150c = new q9.d0(Arrays.copyOf(f106147x, 10));
        this.f106162o = -1;
        this.f106163p = -1;
        this.f106166s = -9223372036854775807L;
        this.f106168u = -9223372036854775807L;
        this.f106148a = z10;
        this.f106151d = str;
        this.f106152e = i10;
        this.f106153f = str2;
        p();
    }

    @Override // vb.m
    public void packetFinished(boolean z10) {
    }
}
