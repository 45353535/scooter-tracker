package n9;

import android.net.Uri;
import android.util.Pair;
import com.vungle.ads.internal.protos.Sdk;
import j$.util.Objects;
import n9.b;
import n9.r;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public abstract class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f95245a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f95246b = o0.C0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f95247c = o0.C0(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f95248d = o0.C0(2);

    class a extends e0 {
        a() {
        }

        @Override // n9.e0
        public int b(Object obj) {
            return -1;
        }

        @Override // n9.e0
        public b g(int i10, b bVar, boolean z10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // n9.e0
        public int i() {
            return 0;
        }

        @Override // n9.e0
        public Object m(int i10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // n9.e0
        public c o(int i10, c cVar, long j10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // n9.e0
        public int p() {
            return 0;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final String f95249h = o0.C0(0);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final String f95250i = o0.C0(1);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f95251j = o0.C0(2);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f95252k = o0.C0(3);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f95253l = o0.C0(4);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f95254a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f95255b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f95256c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f95257d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f95258e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f95259f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public n9.b f95260g = n9.b.f95190g;

        public int a(int i10) {
            return this.f95260g.a(i10).f95214b;
        }

        public long b(int i10, int i11) {
            b.a aVarA = this.f95260g.a(i10);
            if (aVarA.f95214b != -1) {
                return aVarA.f95219g[i11];
            }
            return -9223372036854775807L;
        }

        public int c() {
            return this.f95260g.f95197b;
        }

        public int d(long j10) {
            return this.f95260g.b(j10, this.f95257d);
        }

        public int e(long j10) {
            return this.f95260g.c(j10, this.f95257d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class.equals(obj.getClass())) {
                b bVar = (b) obj;
                if (Objects.equals(this.f95254a, bVar.f95254a) && Objects.equals(this.f95255b, bVar.f95255b) && this.f95256c == bVar.f95256c && this.f95257d == bVar.f95257d && this.f95258e == bVar.f95258e && this.f95259f == bVar.f95259f && Objects.equals(this.f95260g, bVar.f95260g)) {
                    return true;
                }
            }
            return false;
        }

        public long f(int i10) {
            return this.f95260g.a(i10).f95213a;
        }

        public long g() {
            return this.f95260g.f95198c;
        }

        public int h(int i10, int i11) {
            b.a aVarA = this.f95260g.a(i10);
            if (aVarA.f95214b != -1) {
                return aVarA.f95218f[i11];
            }
            return 0;
        }

        public int hashCode() {
            Object obj = this.f95254a;
            int iHashCode = (Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f95255b;
            int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f95256c) * 31;
            long j10 = this.f95257d;
            int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f95258e;
            return ((((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f95259f ? 1 : 0)) * 31) + this.f95260g.hashCode();
        }

        public long i(int i10) {
            return this.f95260g.a(i10).f95221i;
        }

        public long j() {
            return this.f95257d;
        }

        public int k(int i10) {
            return this.f95260g.a(i10).c();
        }

        public int l(int i10, int i11) {
            return this.f95260g.a(i10).d(i11);
        }

        public long m() {
            return o0.q1(this.f95258e);
        }

        public long n() {
            return this.f95258e;
        }

        public int o() {
            return this.f95260g.f95200e;
        }

        public boolean p(int i10) {
            return !this.f95260g.a(i10).e();
        }

        public boolean q(int i10) {
            return i10 == c() - 1 && this.f95260g.d(i10);
        }

        public boolean r(int i10) {
            return this.f95260g.a(i10).f95222j;
        }

        public b s(Object obj, Object obj2, int i10, long j10, long j11) {
            return t(obj, obj2, i10, j10, j11, n9.b.f95190g, false);
        }

        public b t(Object obj, Object obj2, int i10, long j10, long j11, n9.b bVar, boolean z10) {
            this.f95254a = obj;
            this.f95255b = obj2;
            this.f95256c = i10;
            this.f95257d = j10;
            this.f95258e = j11;
            this.f95260g = bVar;
            this.f95259f = z10;
            return this;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f95272b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f95274d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f95275e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f95276f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f95277g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f95278h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f95279i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public r.g f95280j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f95281k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f95282l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public long f95283m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f95284n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f95285o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public long f95286p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final Object f95261q = new Object();

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final Object f95262r = new Object();

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final r f95263s = new r.c().c("io.bidmachine.media3.common.Timeline").f(Uri.EMPTY).a();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final String f95264t = o0.C0(1);

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private static final String f95265u = o0.C0(2);

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private static final String f95266v = o0.C0(3);

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private static final String f95267w = o0.C0(4);

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private static final String f95268x = o0.C0(5);

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private static final String f95269y = o0.C0(6);

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private static final String f95270z = o0.C0(7);
        private static final String A = o0.C0(8);
        private static final String B = o0.C0(9);
        private static final String C = o0.C0(10);
        private static final String D = o0.C0(11);
        private static final String E = o0.C0(12);
        private static final String F = o0.C0(13);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f95271a = f95261q;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public r f95273c = f95263s;

        public long a() {
            return o0.h0(this.f95277g);
        }

        public long b() {
            return o0.q1(this.f95282l);
        }

        public long c() {
            return this.f95282l;
        }

        public long d() {
            return o0.q1(this.f95283m);
        }

        public long e() {
            return this.f95286p;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && c.class.equals(obj.getClass())) {
                c cVar = (c) obj;
                if (Objects.equals(this.f95271a, cVar.f95271a) && Objects.equals(this.f95273c, cVar.f95273c) && Objects.equals(this.f95274d, cVar.f95274d) && Objects.equals(this.f95280j, cVar.f95280j) && this.f95275e == cVar.f95275e && this.f95276f == cVar.f95276f && this.f95277g == cVar.f95277g && this.f95278h == cVar.f95278h && this.f95279i == cVar.f95279i && this.f95281k == cVar.f95281k && this.f95282l == cVar.f95282l && this.f95283m == cVar.f95283m && this.f95284n == cVar.f95284n && this.f95285o == cVar.f95285o && this.f95286p == cVar.f95286p) {
                    return true;
                }
            }
            return false;
        }

        public boolean f() {
            return this.f95280j != null;
        }

        public c g(Object obj, r rVar, Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, r.g gVar, long j13, long j14, int i10, int i11, long j15) {
            r.h hVar;
            this.f95271a = obj;
            this.f95273c = rVar != null ? rVar : f95263s;
            this.f95272b = (rVar == null || (hVar = rVar.f95455b) == null) ? null : hVar.f95554h;
            this.f95274d = obj2;
            this.f95275e = j10;
            this.f95276f = j11;
            this.f95277g = j12;
            this.f95278h = z10;
            this.f95279i = z11;
            this.f95280j = gVar;
            this.f95282l = j13;
            this.f95283m = j14;
            this.f95284n = i10;
            this.f95285o = i11;
            this.f95286p = j15;
            this.f95281k = false;
            return this;
        }

        public int hashCode() {
            int iHashCode = (((Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE + this.f95271a.hashCode()) * 31) + this.f95273c.hashCode()) * 31;
            Object obj = this.f95274d;
            int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            r.g gVar = this.f95280j;
            int iHashCode3 = (iHashCode2 + (gVar != null ? gVar.hashCode() : 0)) * 31;
            long j10 = this.f95275e;
            int i10 = (iHashCode3 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f95276f;
            int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f95277g;
            int i12 = (((((((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f95278h ? 1 : 0)) * 31) + (this.f95279i ? 1 : 0)) * 31) + (this.f95281k ? 1 : 0)) * 31;
            long j13 = this.f95282l;
            int i13 = (i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
            long j14 = this.f95283m;
            int i14 = (((((i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.f95284n) * 31) + this.f95285o) * 31;
            long j15 = this.f95286p;
            return i14 + ((int) (j15 ^ (j15 >>> 32)));
        }
    }

    protected e0() {
    }

    public int a(boolean z10) {
        return q() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z10) {
        if (q()) {
            return -1;
        }
        return p() - 1;
    }

    public final int d(int i10, b bVar, c cVar, int i11, boolean z10) {
        int i12 = f(i10, bVar).f95256c;
        if (n(i12, cVar).f95285o != i10) {
            return i10 + 1;
        }
        int iE = e(i12, i11, z10);
        if (iE == -1) {
            return -1;
        }
        return n(iE, cVar).f95284n;
    }

    public int e(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == c(z10)) {
                return -1;
            }
            return i10 + 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == c(z10) ? a(z10) : i10 + 1;
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        int iC;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        if (e0Var.p() != p() || e0Var.i() != i()) {
            return false;
        }
        c cVar = new c();
        b bVar = new b();
        c cVar2 = new c();
        b bVar2 = new b();
        for (int i10 = 0; i10 < p(); i10++) {
            if (!n(i10, cVar).equals(e0Var.n(i10, cVar2))) {
                return false;
            }
        }
        for (int i11 = 0; i11 < i(); i11++) {
            if (!g(i11, bVar, true).equals(e0Var.g(i11, bVar2, true))) {
                return false;
            }
        }
        int iA = a(true);
        if (iA != e0Var.a(true) || (iC = c(true)) != e0Var.c(true)) {
            return false;
        }
        while (iA != iC) {
            int iE = e(iA, 0, true);
            if (iE != e0Var.e(iA, 0, true)) {
                return false;
            }
            iA = iE;
        }
        return true;
    }

    public final b f(int i10, b bVar) {
        return g(i10, bVar, false);
    }

    public abstract b g(int i10, b bVar, boolean z10);

    public b h(Object obj, b bVar) {
        return g(b(obj), bVar, true);
    }

    public int hashCode() {
        c cVar = new c();
        b bVar = new b();
        int iP = Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE + p();
        for (int i10 = 0; i10 < p(); i10++) {
            iP = (iP * 31) + n(i10, cVar).hashCode();
        }
        int i11 = (iP * 31) + i();
        for (int i12 = 0; i12 < i(); i12++) {
            i11 = (i11 * 31) + g(i12, bVar, true).hashCode();
        }
        int iA = a(true);
        while (iA != -1) {
            i11 = (i11 * 31) + iA;
            iA = e(iA, 0, true);
        }
        return i11;
    }

    public abstract int i();

    public final Pair j(c cVar, b bVar, int i10, long j10) {
        return (Pair) q9.a.e(k(cVar, bVar, i10, j10, 0L));
    }

    public final Pair k(c cVar, b bVar, int i10, long j10, long j11) {
        q9.a.c(i10, 0, p());
        o(i10, cVar, j11);
        if (j10 == -9223372036854775807L) {
            j10 = cVar.c();
            if (j10 == -9223372036854775807L) {
                return null;
            }
        }
        int i11 = cVar.f95284n;
        f(i11, bVar);
        while (i11 < cVar.f95285o && bVar.f95258e != j10) {
            int i12 = i11 + 1;
            if (f(i12, bVar).f95258e > j10) {
                break;
            }
            i11 = i12;
        }
        g(i11, bVar, true);
        long jMin = j10 - bVar.f95258e;
        long j12 = bVar.f95257d;
        if (j12 != -9223372036854775807L) {
            jMin = Math.min(jMin, j12 - 1);
        }
        return Pair.create(q9.a.e(bVar.f95255b), Long.valueOf(Math.max(0L, jMin)));
    }

    public int l(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == a(z10)) {
                return -1;
            }
            return i10 - 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == a(z10) ? c(z10) : i10 - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object m(int i10);

    public final c n(int i10, c cVar) {
        return o(i10, cVar, 0L);
    }

    public abstract c o(int i10, c cVar, long j10);

    public abstract int p();

    public final boolean q() {
        return p() == 0;
    }

    public final boolean r(int i10, b bVar, c cVar, int i11, boolean z10) {
        return d(i10, bVar, cVar, i11, z10) == -1;
    }
}
