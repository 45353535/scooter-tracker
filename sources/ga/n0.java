package ga;

import android.os.Handler;
import ga.f0;
import ga.n0;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes12.dex */
public interface n0 {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f72385a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f0.b f72386b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final CopyOnWriteArrayList f72387c;

        /* JADX INFO: renamed from: ga.n0$a$a, reason: collision with other inner class name */
        private static final class C0887a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Handler f72388a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public n0 f72389b;

            public C0887a(Handler handler, n0 n0Var) {
                this.f72388a = handler;
                this.f72389b = n0Var;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public a A(int i10, f0.b bVar) {
            return new a(this.f72387c, i10, bVar);
        }

        public void h(Handler handler, n0 n0Var) {
            q9.a.e(handler);
            q9.a.e(n0Var);
            this.f72387c.add(new C0887a(handler, n0Var));
        }

        public void i(final q9.l lVar) {
            for (C0887a c0887a : this.f72387c) {
                final n0 n0Var = c0887a.f72389b;
                q9.o0.Z0(c0887a.f72388a, new Runnable() { // from class: ga.m0
                    @Override // java.lang.Runnable
                    public final void run() {
                        lVar.accept(n0Var);
                    }
                });
            }
        }

        public void j(int i10, io.bidmachine.media3.common.a aVar, int i11, Object obj, long j10) {
            k(new b0(1, i10, aVar, i11, obj, q9.o0.q1(j10), -9223372036854775807L));
        }

        public void k(final b0 b0Var) {
            i(new q9.l() { // from class: ga.j0
                @Override // q9.l
                public final void accept(Object obj) {
                    n0.a aVar = this.f72358a;
                    ((n0) obj).K(aVar.f72385a, aVar.f72386b, b0Var);
                }
            });
        }

        public void l(y yVar, int i10) {
            m(yVar, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void m(y yVar, int i10, int i11, io.bidmachine.media3.common.a aVar, int i12, Object obj, long j10, long j11) {
            n(yVar, new b0(i10, i11, aVar, i12, obj, q9.o0.q1(j10), q9.o0.q1(j11)));
        }

        public void n(final y yVar, final b0 b0Var) {
            i(new q9.l() { // from class: ga.k0
                @Override // q9.l
                public final void accept(Object obj) {
                    n0.a aVar = this.f72365a;
                    ((n0) obj).E(aVar.f72385a, aVar.f72386b, yVar, b0Var);
                }
            });
        }

        public void o(y yVar, int i10) {
            p(yVar, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void p(y yVar, int i10, int i11, io.bidmachine.media3.common.a aVar, int i12, Object obj, long j10, long j11) {
            q(yVar, new b0(i10, i11, aVar, i12, obj, q9.o0.q1(j10), q9.o0.q1(j11)));
        }

        public void q(final y yVar, final b0 b0Var) {
            i(new q9.l() { // from class: ga.i0
                @Override // q9.l
                public final void accept(Object obj) {
                    n0.a aVar = this.f72352a;
                    ((n0) obj).s(aVar.f72385a, aVar.f72386b, yVar, b0Var);
                }
            });
        }

        public void r(y yVar, int i10, int i11, io.bidmachine.media3.common.a aVar, int i12, Object obj, long j10, long j11, IOException iOException, boolean z10) {
            t(yVar, new b0(i10, i11, aVar, i12, obj, q9.o0.q1(j10), q9.o0.q1(j11)), iOException, z10);
        }

        public void s(y yVar, int i10, IOException iOException, boolean z10) {
            r(yVar, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z10);
        }

        public void t(final y yVar, final b0 b0Var, final IOException iOException, final boolean z10) {
            i(new q9.l() { // from class: ga.g0
                @Override // q9.l
                public final void accept(Object obj) {
                    n0.a aVar = this.f72292a;
                    ((n0) obj).p(aVar.f72385a, aVar.f72386b, yVar, b0Var, iOException, z10);
                }
            });
        }

        public void u(y yVar, int i10, int i11) {
            v(yVar, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i11);
        }

        public void v(y yVar, int i10, int i11, io.bidmachine.media3.common.a aVar, int i12, Object obj, long j10, long j11, int i13) {
            w(yVar, new b0(i10, i11, aVar, i12, obj, q9.o0.q1(j10), q9.o0.q1(j11)), i13);
        }

        public void w(final y yVar, final b0 b0Var, final int i10) {
            i(new q9.l() { // from class: ga.h0
                @Override // q9.l
                public final void accept(Object obj) {
                    n0.a aVar = this.f72328a;
                    ((n0) obj).I(aVar.f72385a, aVar.f72386b, yVar, b0Var, i10);
                }
            });
        }

        public void x(n0 n0Var) {
            for (C0887a c0887a : this.f72387c) {
                if (c0887a.f72389b == n0Var) {
                    this.f72387c.remove(c0887a);
                }
            }
        }

        public void y(int i10, long j10, long j11) {
            z(new b0(1, i10, null, 3, null, q9.o0.q1(j10), q9.o0.q1(j11)));
        }

        public void z(final b0 b0Var) {
            final f0.b bVar = (f0.b) q9.a.e(this.f72386b);
            i(new q9.l() { // from class: ga.l0
                @Override // q9.l
                public final void accept(Object obj) {
                    n0 n0Var = (n0) obj;
                    n0Var.B(this.f72371a.f72385a, bVar, b0Var);
                }
            });
        }

        private a(CopyOnWriteArrayList copyOnWriteArrayList, int i10, f0.b bVar) {
            this.f72387c = copyOnWriteArrayList;
            this.f72385a = i10;
            this.f72386b = bVar;
        }
    }

    void B(int i10, f0.b bVar, b0 b0Var);

    void E(int i10, f0.b bVar, y yVar, b0 b0Var);

    void I(int i10, f0.b bVar, y yVar, b0 b0Var, int i11);

    void K(int i10, f0.b bVar, b0 b0Var);

    void p(int i10, f0.b bVar, y yVar, b0 b0Var, IOException iOException, boolean z10);

    void s(int i10, f0.b bVar, y yVar, b0 b0Var);
}
