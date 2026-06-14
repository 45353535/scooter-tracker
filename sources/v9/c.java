package v9;

import android.util.SparseArray;
import ga.f0;
import j$.util.Objects;
import java.io.IOException;
import java.util.List;
import n9.a0;
import w9.s;

/* JADX INFO: loaded from: classes12.dex */
public interface c {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f105848a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final n9.e0 f105849b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f105850c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final f0.b f105851d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f105852e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final n9.e0 f105853f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f105854g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final f0.b f105855h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f105856i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f105857j;

        public a(long j10, n9.e0 e0Var, int i10, f0.b bVar, long j11, n9.e0 e0Var2, int i11, f0.b bVar2, long j12, long j13) {
            this.f105848a = j10;
            this.f105849b = e0Var;
            this.f105850c = i10;
            this.f105851d = bVar;
            this.f105852e = j11;
            this.f105853f = e0Var2;
            this.f105854g = i11;
            this.f105855h = bVar2;
            this.f105856i = j12;
            this.f105857j = j13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f105848a == aVar.f105848a && this.f105850c == aVar.f105850c && this.f105852e == aVar.f105852e && this.f105854g == aVar.f105854g && this.f105856i == aVar.f105856i && this.f105857j == aVar.f105857j && Objects.equals(this.f105849b, aVar.f105849b) && Objects.equals(this.f105851d, aVar.f105851d) && Objects.equals(this.f105853f, aVar.f105853f) && Objects.equals(this.f105855h, aVar.f105855h)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Long.valueOf(this.f105848a), this.f105849b, Integer.valueOf(this.f105850c), this.f105851d, Long.valueOf(this.f105852e), this.f105853f, Integer.valueOf(this.f105854g), this.f105855h, Long.valueOf(this.f105856i), Long.valueOf(this.f105857j));
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final n9.n f105858a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SparseArray f105859b;

        public b(n9.n nVar, SparseArray sparseArray) {
            this.f105858a = nVar;
            SparseArray sparseArray2 = new SparseArray(nVar.d());
            for (int i10 = 0; i10 < nVar.d(); i10++) {
                int iC = nVar.c(i10);
                sparseArray2.append(iC, (a) q9.a.e((a) sparseArray.get(iC)));
            }
            this.f105859b = sparseArray2;
        }

        public boolean a(int i10) {
            return this.f105858a.a(i10);
        }

        public int b(int i10) {
            return this.f105858a.c(i10);
        }

        public a c(int i10) {
            return (a) q9.a.e((a) this.f105859b.get(i10));
        }

        public int d() {
            return this.f105858a.d();
        }
    }

    void A(a aVar, Object obj, long j10);

    void B(a aVar, ga.y yVar, ga.b0 b0Var);

    void C(a aVar);

    void D(a aVar, boolean z10);

    void E(a aVar, List list);

    void F(a aVar, io.bidmachine.media3.common.a aVar2, u9.c cVar);

    void G(n9.a0 a0Var, b bVar);

    void H(a aVar, String str, long j10);

    void I(a aVar, String str, long j10, long j11);

    void J(a aVar);

    void K(a aVar, int i10, long j10, long j11);

    void L(a aVar, boolean z10, int i10);

    void M(a aVar, int i10, int i11, boolean z10);

    void N(a aVar, a0.e eVar, a0.e eVar2, int i10);

    void O(a aVar, long j10, int i10);

    void P(a aVar, u9.b bVar);

    void Q(a aVar, u9.b bVar);

    void R(a aVar, boolean z10);

    void S(a aVar, boolean z10);

    void T(a aVar, String str, long j10);

    void U(a aVar, int i10);

    void V(a aVar, n9.n0 n0Var);

    void W(a aVar, long j10);

    void X(a aVar, n9.i0 i0Var);

    void Y(a aVar);

    void Z(a aVar, u9.b bVar);

    void a(a aVar, n9.v vVar);

    void a0(a aVar, String str);

    void b(a aVar, int i10);

    void b0(a aVar, Exception exc);

    void c(a aVar, n9.r rVar, int i10);

    void c0(a aVar, float f10);

    void d0(a aVar, String str, long j10, long j11);

    void e(a aVar, ga.b0 b0Var);

    void e0(a aVar, p9.b bVar);

    void f(a aVar, s.a aVar2);

    void f0(a aVar, int i10);

    void g(a aVar, s.a aVar2);

    void g0(a aVar, String str);

    void h(a aVar, int i10, int i11);

    void h0(a aVar, int i10, boolean z10);

    void i0(a aVar);

    void j(a aVar, int i10, long j10, long j11);

    void j0(a aVar);

    void k(a aVar, Exception exc);

    void k0(a aVar, u9.b bVar);

    void l(a aVar, io.bidmachine.media3.common.a aVar2, u9.c cVar);

    void l0(a aVar, a0.b bVar);

    void m(a aVar, int i10);

    void m0(a aVar, ga.y yVar, ga.b0 b0Var, IOException iOException, boolean z10);

    void n(a aVar, Exception exc);

    void o(a aVar);

    void o0(a aVar, int i10, int i11, int i12, float f10);

    void p(a aVar, Exception exc);

    void p0(a aVar);

    void q(a aVar, int i10);

    void q0(a aVar, int i10);

    void r(a aVar, boolean z10);

    void r0(a aVar, n9.z zVar);

    void s(a aVar, n9.k kVar);

    void s0(a aVar, ga.y yVar, ga.b0 b0Var);

    void t(a aVar, int i10);

    void t0(a aVar, n9.y yVar);

    void u(a aVar, boolean z10);

    void v(a aVar, ga.b0 b0Var);

    void v0(a aVar, n9.h0 h0Var);

    void w(a aVar, n9.t tVar);

    void w0(a aVar, int i10, long j10);

    void x(a aVar, ga.y yVar, ga.b0 b0Var, int i10);

    void x0(a aVar, boolean z10, int i10);

    void y(a aVar, n9.y yVar);

    void z(a aVar, ga.y yVar, ga.b0 b0Var);
}
