package ga;

import ga.b1;
import io.bidmachine.media3.common.DrmInitData;
import j$.util.Objects;
import oa.s0;
import z9.n;
import z9.u;
import z9.w;

/* JADX INFO: loaded from: classes12.dex */
public class b1 implements oa.s0 {
    private io.bidmachine.media3.common.a A;
    private io.bidmachine.media3.common.a B;
    private long C;
    private boolean E;
    private long F;
    private boolean G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z0 f72198a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final z9.w f72201d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final u.a f72202e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private d f72203f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private io.bidmachine.media3.common.a f72204g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private z9.n f72205h;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f72213p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f72214q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f72215r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f72216s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f72220w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f72223z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f72199b = new b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f72206i = 1000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long[] f72207j = new long[1000];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long[] f72208k = new long[1000];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long[] f72211n = new long[1000];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int[] f72210m = new int[1000];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int[] f72209l = new int[1000];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private s0.a[] f72212o = new s0.a[1000];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i1 f72200c = new i1(new q9.l() { // from class: ga.a1
        @Override // q9.l
        public final void accept(Object obj) {
            ((b1.c) obj).f72228b.release();
        }
    });

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f72217t = Long.MIN_VALUE;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f72218u = Long.MIN_VALUE;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f72219v = Long.MIN_VALUE;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f72222y = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f72221x = true;
    private boolean D = true;

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f72224a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f72225b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public s0.a f72226c;

        b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final io.bidmachine.media3.common.a f72227a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final w.b f72228b;

        private c(io.bidmachine.media3.common.a aVar, w.b bVar) {
            this.f72227a = aVar;
            this.f72228b = bVar;
        }
    }

    public interface d {
        void d(io.bidmachine.media3.common.a aVar);
    }

    protected b1(ka.b bVar, z9.w wVar, u.a aVar) {
        this.f72201d = wVar;
        this.f72202e = aVar;
        this.f72198a = new z0(bVar);
    }

    private long E(int i10) {
        long jMax = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int iG = G(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            jMax = Math.max(jMax, this.f72211n[iG]);
            if ((this.f72210m[iG] & 1) != 0) {
                return jMax;
            }
            iG--;
            if (iG == -1) {
                iG = this.f72206i - 1;
            }
        }
        return jMax;
    }

    private int G(int i10) {
        int i11 = this.f72215r + i10;
        int i12 = this.f72206i;
        return i11 < i12 ? i11 : i11 - i12;
    }

    private boolean K() {
        return this.f72216s != this.f72213p;
    }

    private boolean O(int i10) {
        z9.n nVar = this.f72205h;
        if (nVar == null || nVar.getState() == 4) {
            return true;
        }
        return (this.f72210m[i10] & 1073741824) == 0 && this.f72205h.playClearSamplesWithoutKeys();
    }

    private void Q(io.bidmachine.media3.common.a aVar, u9.d0 d0Var) {
        io.bidmachine.media3.common.a aVar2 = this.f72204g;
        boolean z10 = aVar2 == null;
        DrmInitData drmInitData = aVar2 == null ? null : aVar2.f80565s;
        this.f72204g = aVar;
        DrmInitData drmInitData2 = aVar.f80565s;
        z9.w wVar = this.f72201d;
        d0Var.f105308b = wVar != null ? aVar.c(wVar.d(aVar)) : aVar;
        d0Var.f105307a = this.f72205h;
        if (this.f72201d == null) {
            return;
        }
        if (z10 || !Objects.equals(drmInitData, drmInitData2)) {
            z9.n nVar = this.f72205h;
            z9.n nVarA = this.f72201d.a(this.f72202e, aVar);
            this.f72205h = nVarA;
            d0Var.f105307a = nVarA;
            if (nVar != null) {
                nVar.b(this.f72202e);
            }
        }
    }

    private synchronized int R(u9.d0 d0Var, t9.f fVar, boolean z10, boolean z11, b bVar) {
        try {
            fVar.f104989f = false;
            if (!K()) {
                if (!z11 && !this.f72220w) {
                    io.bidmachine.media3.common.a aVar = this.B;
                    if (aVar == null || (!z10 && aVar == this.f72204g)) {
                        return -3;
                    }
                    Q((io.bidmachine.media3.common.a) q9.a.e(aVar), d0Var);
                    return -5;
                }
                fVar.k(4);
                fVar.f104990g = Long.MIN_VALUE;
                return -4;
            }
            io.bidmachine.media3.common.a aVar2 = ((c) this.f72200c.e(F())).f72227a;
            if (!z10 && aVar2 == this.f72204g) {
                int iG = G(this.f72216s);
                if (!O(iG)) {
                    fVar.f104989f = true;
                    return -3;
                }
                fVar.k(this.f72210m[iG]);
                if (this.f72216s == this.f72213p - 1 && (z11 || this.f72220w)) {
                    fVar.a(536870912);
                }
                fVar.f104990g = this.f72211n[iG];
                bVar.f72224a = this.f72209l[iG];
                bVar.f72225b = this.f72208k[iG];
                bVar.f72226c = this.f72212o[iG];
                return -4;
            }
            Q(aVar2, d0Var);
            return -5;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void W() {
        z9.n nVar = this.f72205h;
        if (nVar != null) {
            nVar.b(this.f72202e);
            this.f72205h = null;
            this.f72204g = null;
        }
    }

    private synchronized void Z() {
        this.f72216s = 0;
        this.f72198a.o();
    }

    private synchronized boolean e0(io.bidmachine.media3.common.a aVar) {
        try {
            this.f72222y = false;
            if (Objects.equals(aVar, this.B)) {
                return false;
            }
            if (this.f72200c.g() || !((c) this.f72200c.f()).f72227a.equals(aVar)) {
                this.B = aVar;
            } else {
                this.B = ((c) this.f72200c.f()).f72227a;
            }
            boolean z10 = this.D;
            io.bidmachine.media3.common.a aVar2 = this.B;
            this.D = z10 & n9.w.a(aVar2.f80561o, aVar2.f80557k);
            this.E = false;
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private synchronized boolean i(long j10) {
        if (this.f72213p == 0) {
            return j10 > this.f72218u;
        }
        if (D() >= j10) {
            return false;
        }
        v(this.f72214q + k(j10));
        return true;
    }

    private synchronized void j(long j10, int i10, long j11, int i11, s0.a aVar) {
        try {
            int i12 = this.f72213p;
            if (i12 > 0) {
                int iG = G(i12 - 1);
                q9.a.a(this.f72208k[iG] + ((long) this.f72209l[iG]) <= j11);
            }
            this.f72220w = (536870912 & i10) != 0;
            this.f72219v = Math.max(this.f72219v, j10);
            int iG2 = G(this.f72213p);
            this.f72211n[iG2] = j10;
            this.f72208k[iG2] = j11;
            this.f72209l[iG2] = i11;
            this.f72210m[iG2] = i10;
            this.f72212o[iG2] = aVar;
            this.f72207j[iG2] = this.C;
            if (this.f72200c.g() || !((c) this.f72200c.f()).f72227a.equals(this.B)) {
                io.bidmachine.media3.common.a aVar2 = (io.bidmachine.media3.common.a) q9.a.e(this.B);
                z9.w wVar = this.f72201d;
                this.f72200c.a(J(), new c(aVar2, wVar != null ? wVar.b(this.f72202e, aVar2) : w.b.f119323a));
            }
            int i13 = this.f72213p + 1;
            this.f72213p = i13;
            int i14 = this.f72206i;
            if (i13 == i14) {
                int i15 = i14 + 1000;
                long[] jArr = new long[i15];
                long[] jArr2 = new long[i15];
                long[] jArr3 = new long[i15];
                int[] iArr = new int[i15];
                int[] iArr2 = new int[i15];
                s0.a[] aVarArr = new s0.a[i15];
                int i16 = this.f72215r;
                int i17 = i14 - i16;
                System.arraycopy(this.f72208k, i16, jArr2, 0, i17);
                System.arraycopy(this.f72211n, this.f72215r, jArr3, 0, i17);
                System.arraycopy(this.f72210m, this.f72215r, iArr, 0, i17);
                System.arraycopy(this.f72209l, this.f72215r, iArr2, 0, i17);
                System.arraycopy(this.f72212o, this.f72215r, aVarArr, 0, i17);
                System.arraycopy(this.f72207j, this.f72215r, jArr, 0, i17);
                int i18 = this.f72215r;
                System.arraycopy(this.f72208k, 0, jArr2, i17, i18);
                System.arraycopy(this.f72211n, 0, jArr3, i17, i18);
                System.arraycopy(this.f72210m, 0, iArr, i17, i18);
                System.arraycopy(this.f72209l, 0, iArr2, i17, i18);
                System.arraycopy(this.f72212o, 0, aVarArr, i17, i18);
                System.arraycopy(this.f72207j, 0, jArr, i17, i18);
                this.f72208k = jArr2;
                this.f72211n = jArr3;
                this.f72210m = iArr;
                this.f72209l = iArr2;
                this.f72212o = aVarArr;
                this.f72207j = jArr;
                this.f72215r = 0;
                this.f72206i = i15;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private int k(long j10) {
        int i10 = this.f72213p;
        int iG = G(i10 - 1);
        while (i10 > this.f72216s && this.f72211n[iG] >= j10) {
            i10--;
            iG--;
            if (iG == -1) {
                iG = this.f72206i - 1;
            }
        }
        return i10;
    }

    public static b1 l(ka.b bVar, z9.w wVar, u.a aVar) {
        return new b1(bVar, (z9.w) q9.a.e(wVar), (u.a) q9.a.e(aVar));
    }

    public static b1 m(ka.b bVar) {
        return new b1(bVar, null, null);
    }

    private synchronized long n(long j10, boolean z10, boolean z11) throws Throwable {
        Throwable th2;
        try {
            try {
                int i10 = this.f72213p;
                if (i10 != 0) {
                    long[] jArr = this.f72211n;
                    int i11 = this.f72215r;
                    if (j10 >= jArr[i11]) {
                        if (z11) {
                            try {
                                int i12 = this.f72216s;
                                if (i12 != i10) {
                                    i10 = i12 + 1;
                                }
                            } catch (Throwable th3) {
                                th2 = th3;
                                throw th2;
                            }
                        }
                        int iY = y(i11, i10, j10, z10);
                        if (iY == -1) {
                            return -1L;
                        }
                        return q(iY);
                    }
                }
                return -1L;
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
    }

    private synchronized long o() {
        int i10 = this.f72213p;
        if (i10 == 0) {
            return -1L;
        }
        return q(i10);
    }

    private long q(int i10) {
        this.f72218u = Math.max(this.f72218u, E(i10));
        this.f72213p -= i10;
        int i11 = this.f72214q + i10;
        this.f72214q = i11;
        int i12 = this.f72215r + i10;
        this.f72215r = i12;
        int i13 = this.f72206i;
        if (i12 >= i13) {
            this.f72215r = i12 - i13;
        }
        int i14 = this.f72216s - i10;
        this.f72216s = i14;
        if (i14 < 0) {
            this.f72216s = 0;
        }
        this.f72200c.d(i11);
        if (this.f72213p != 0) {
            return this.f72208k[this.f72215r];
        }
        int i15 = this.f72215r;
        if (i15 == 0) {
            i15 = this.f72206i;
        }
        int i16 = i15 - 1;
        return this.f72208k[i16] + ((long) this.f72209l[i16]);
    }

    private long v(int i10) {
        int iJ = J() - i10;
        boolean z10 = false;
        q9.a.a(iJ >= 0 && iJ <= this.f72213p - this.f72216s);
        int i11 = this.f72213p - iJ;
        this.f72213p = i11;
        this.f72219v = Math.max(this.f72218u, E(i11));
        if (iJ == 0 && this.f72220w) {
            z10 = true;
        }
        this.f72220w = z10;
        this.f72200c.c(i10);
        int i12 = this.f72213p;
        if (i12 == 0) {
            return 0L;
        }
        int iG = G(i12 - 1);
        return this.f72208k[iG] + ((long) this.f72209l[iG]);
    }

    private int x(int i10, int i11, long j10, boolean z10) {
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f72211n[i10] >= j10) {
                return i12;
            }
            i10++;
            if (i10 == this.f72206i) {
                i10 = 0;
            }
        }
        if (z10) {
            return i11;
        }
        return -1;
    }

    private int y(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long j11 = this.f72211n[i10];
            if (j11 > j10) {
                break;
            }
            if (!z10 || (this.f72210m[i10] & 1) != 0) {
                if (j11 == j10) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.f72206i) {
                i10 = 0;
            }
        }
        return i12;
    }

    public final int A() {
        return this.f72214q;
    }

    public final synchronized long B() {
        return this.f72213p == 0 ? Long.MIN_VALUE : this.f72211n[this.f72215r];
    }

    public final synchronized long C() {
        return this.f72219v;
    }

    public final synchronized long D() {
        return Math.max(this.f72218u, E(this.f72216s));
    }

    public final int F() {
        return this.f72214q + this.f72216s;
    }

    public final synchronized int H(long j10, boolean z10) throws Throwable {
        Throwable th2;
        try {
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            int iG = G(this.f72216s);
            if (!K() || j10 < this.f72211n[iG]) {
                return 0;
            }
            if (j10 <= this.f72219v || !z10) {
                int iY = y(iG, this.f72213p - this.f72216s, j10, true);
                if (iY == -1) {
                    return 0;
                }
                return iY;
            }
            try {
                return this.f72213p - this.f72216s;
            } catch (Throwable th4) {
                th2 = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
        }
        throw th2;
    }

    public final synchronized io.bidmachine.media3.common.a I() {
        return this.f72222y ? null : this.B;
    }

    public final int J() {
        return this.f72214q + this.f72213p;
    }

    protected final void L() {
        this.f72223z = true;
    }

    public final synchronized boolean M() {
        return this.f72220w;
    }

    public synchronized boolean N(boolean z10) {
        io.bidmachine.media3.common.a aVar;
        boolean z11 = true;
        if (K()) {
            if (((c) this.f72200c.e(F())).f72227a != this.f72204g) {
                return true;
            }
            return O(G(this.f72216s));
        }
        if (!z10 && !this.f72220w && ((aVar = this.B) == null || aVar == this.f72204g)) {
            z11 = false;
        }
        return z11;
    }

    public void P() throws n.a {
        z9.n nVar = this.f72205h;
        if (nVar != null && nVar.getState() == 1) {
            throw ((n.a) q9.a.e(this.f72205h.getError()));
        }
    }

    public final synchronized long S() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return K() ? this.f72207j[G(this.f72216s)] : this.C;
    }

    public void T() {
        s();
        W();
    }

    public int U(u9.d0 d0Var, t9.f fVar, int i10, boolean z10) {
        int iR = R(d0Var, fVar, (i10 & 2) != 0, z10, this.f72199b);
        if (iR == -4 && !fVar.f()) {
            boolean z11 = (i10 & 1) != 0;
            if ((i10 & 4) == 0) {
                if (z11) {
                    this.f72198a.f(fVar, this.f72199b);
                } else {
                    this.f72198a.m(fVar, this.f72199b);
                }
            }
            if (!z11) {
                this.f72216s++;
            }
        }
        return iR;
    }

    public void V() {
        Y(true);
        W();
    }

    public final void X() {
        Y(false);
    }

    public void Y(boolean z10) {
        this.f72198a.n();
        this.f72213p = 0;
        this.f72214q = 0;
        this.f72215r = 0;
        this.f72216s = 0;
        this.f72221x = true;
        this.f72217t = Long.MIN_VALUE;
        this.f72218u = Long.MIN_VALUE;
        this.f72219v = Long.MIN_VALUE;
        this.f72220w = false;
        this.f72200c.b();
        if (z10) {
            this.A = null;
            this.B = null;
            this.f72222y = true;
            this.D = true;
        }
    }

    @Override // oa.s0
    public final void a(q9.d0 d0Var, int i10, int i11) {
        this.f72198a.q(d0Var, i10);
    }

    public final synchronized boolean a0(int i10) {
        Z();
        int i11 = this.f72214q;
        if (i10 >= i11 && i10 <= this.f72213p + i11) {
            this.f72217t = Long.MIN_VALUE;
            this.f72216s = i10 - i11;
            return true;
        }
        return false;
    }

    @Override // oa.s0
    public /* synthetic */ int b(n9.h hVar, int i10, boolean z10) {
        return oa.r0.b(this, hVar, i10, z10);
    }

    public final synchronized boolean b0(long j10, boolean z10) throws Throwable {
        b1 b1Var;
        long j11;
        int iY;
        try {
            try {
                Z();
                int iG = G(this.f72216s);
                if (!K() || j10 < this.f72211n[iG] || (j10 > this.f72219v && !z10)) {
                    return false;
                }
                if (this.D) {
                    b1Var = this;
                    j11 = j10;
                    iY = b1Var.x(iG, this.f72213p - this.f72216s, j11, z10);
                } else {
                    b1Var = this;
                    j11 = j10;
                    iY = b1Var.y(iG, b1Var.f72213p - b1Var.f72216s, j11, true);
                }
                if (iY == -1) {
                    return false;
                }
                b1Var.f72217t = j11;
                b1Var.f72216s += iY;
                return true;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        throw th;
    }

    @Override // oa.s0
    public /* synthetic */ void c(q9.d0 d0Var, int i10) {
        oa.r0.c(this, d0Var, i10);
    }

    public final void c0(long j10) {
        if (this.F != j10) {
            this.F = j10;
            L();
        }
    }

    @Override // oa.s0
    public /* synthetic */ void d(long j10) {
        oa.r0.a(this, j10);
    }

    public final void d0(long j10) {
        this.f72217t = j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    @Override // oa.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(long r12, int r14, int r15, int r16, oa.s0.a r17) {
        /*
            r11 = this;
            boolean r1 = r11.f72223z
            if (r1 == 0) goto Lf
            io.bidmachine.media3.common.a r1 = r11.A
            java.lang.Object r1 = q9.a.i(r1)
            io.bidmachine.media3.common.a r1 = (io.bidmachine.media3.common.a) r1
            r11.f(r1)
        Lf:
            r1 = r14 & 1
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L17
            r4 = r3
            goto L18
        L17:
            r4 = r2
        L18:
            boolean r5 = r11.f72221x
            if (r5 == 0) goto L21
            if (r4 != 0) goto L1f
            goto L64
        L1f:
            r11.f72221x = r2
        L21:
            long r5 = r11.F
            long r5 = r5 + r12
            boolean r7 = r11.D
            if (r7 == 0) goto L53
            long r7 = r11.f72217t
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 >= 0) goto L2f
            goto L64
        L2f:
            if (r1 != 0) goto L53
            boolean r1 = r11.E
            if (r1 != 0) goto L4f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r7 = "Overriding unexpected non-sync sample for format: "
            r1.append(r7)
            io.bidmachine.media3.common.a r7 = r11.B
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            java.lang.String r7 = "SampleQueue"
            q9.u.h(r7, r1)
            r11.E = r3
        L4f:
            r1 = r14 | 1
            r3 = r1
            goto L54
        L53:
            r3 = r14
        L54:
            boolean r1 = r11.G
            if (r1 == 0) goto L65
            if (r4 == 0) goto L64
            boolean r1 = r11.i(r5)
            if (r1 != 0) goto L61
            goto L64
        L61:
            r11.G = r2
            goto L65
        L64:
            return
        L65:
            ga.z0 r1 = r11.f72198a
            long r1 = r1.e()
            long r7 = (long) r15
            long r1 = r1 - r7
            r7 = r16
            long r7 = (long) r7
            long r1 = r1 - r7
            r9 = r5
            r4 = r1
            r1 = r9
            r0 = r11
            r6 = r15
            r7 = r17
            r0.j(r1, r3, r4, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ga.b1.e(long, int, int, int, oa.s0$a):void");
    }

    @Override // oa.s0
    public final void f(io.bidmachine.media3.common.a aVar) {
        io.bidmachine.media3.common.a aVarZ = z(aVar);
        this.f72223z = false;
        this.A = aVar;
        boolean zE0 = e0(aVarZ);
        d dVar = this.f72203f;
        if (dVar == null || !zE0) {
            return;
        }
        dVar.d(aVarZ);
    }

    public final void f0(d dVar) {
        this.f72203f = dVar;
    }

    @Override // oa.s0
    public final int g(n9.h hVar, int i10, boolean z10, int i11) {
        return this.f72198a.p(hVar, i10, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void g0(int r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 < 0) goto Le
            int r0 = r2.f72216s     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            int r1 = r2.f72213p     // Catch: java.lang.Throwable -> Lc
            if (r0 > r1) goto Le
            r0 = 1
            goto Lf
        Lc:
            r3 = move-exception
            goto L19
        Le:
            r0 = 0
        Lf:
            q9.a.a(r0)     // Catch: java.lang.Throwable -> Lc
            int r0 = r2.f72216s     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            r2.f72216s = r0     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ga.b1.g0(int):void");
    }

    public final void h0(long j10) {
        this.C = j10;
    }

    public final void i0() {
        this.G = true;
    }

    public synchronized long p() {
        int i10 = this.f72216s;
        if (i10 == 0) {
            return -1L;
        }
        return q(i10);
    }

    public final void r(long j10, boolean z10, boolean z11) {
        this.f72198a.b(n(j10, z10, z11));
    }

    public final void s() {
        this.f72198a.b(o());
    }

    public final void t() {
        this.f72198a.b(p());
    }

    public final void u(long j10) {
        if (this.f72213p == 0) {
            return;
        }
        q9.a.a(j10 > D());
        w(this.f72214q + k(j10));
    }

    public final void w(int i10) {
        this.f72198a.c(v(i10));
    }

    protected io.bidmachine.media3.common.a z(io.bidmachine.media3.common.a aVar) {
        return (this.F == 0 || aVar.f80566t == Long.MAX_VALUE) ? aVar : aVar.b().y0(aVar.f80566t + this.F).N();
    }
}
