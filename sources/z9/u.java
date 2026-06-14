package z9;

import android.os.Handler;
import ga.f0;
import java.util.concurrent.CopyOnWriteArrayList;
import z9.u;

/* JADX INFO: loaded from: classes12.dex */
public interface u {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f119317a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f0.b f119318b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final CopyOnWriteArrayList f119319c;

        /* JADX INFO: renamed from: z9.u$a$a, reason: collision with other inner class name */
        private static final class C1340a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Handler f119320a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public u f119321b;

            public C1340a(Handler handler, u uVar) {
                this.f119320a = handler;
                this.f119321b = uVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public void g(Handler handler, u uVar) {
            q9.a.e(handler);
            q9.a.e(uVar);
            this.f119319c.add(new C1340a(handler, uVar));
        }

        public void h() {
            for (C1340a c1340a : this.f119319c) {
                final u uVar = c1340a.f119321b;
                q9.o0.Z0(c1340a.f119320a, new Runnable() { // from class: z9.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        u.a aVar = this.f119313b;
                        uVar.w(aVar.f119317a, aVar.f119318b);
                    }
                });
            }
        }

        public void i() {
            for (C1340a c1340a : this.f119319c) {
                final u uVar = c1340a.f119321b;
                q9.o0.Z0(c1340a.f119320a, new Runnable() { // from class: z9.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        u.a aVar = this.f119315b;
                        uVar.J(aVar.f119317a, aVar.f119318b);
                    }
                });
            }
        }

        public void j() {
            for (C1340a c1340a : this.f119319c) {
                final u uVar = c1340a.f119321b;
                q9.o0.Z0(c1340a.f119320a, new Runnable() { // from class: z9.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        u.a aVar = this.f119311b;
                        uVar.v(aVar.f119317a, aVar.f119318b);
                    }
                });
            }
        }

        public void k(final int i10) {
            for (C1340a c1340a : this.f119319c) {
                final u uVar = c1340a.f119321b;
                q9.o0.Z0(c1340a.f119320a, new Runnable() { // from class: z9.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        u.a aVar = this.f119305b;
                        uVar.G(aVar.f119317a, aVar.f119318b, i10);
                    }
                });
            }
        }

        public void l(final Exception exc) {
            for (C1340a c1340a : this.f119319c) {
                final u uVar = c1340a.f119321b;
                q9.o0.Z0(c1340a.f119320a, new Runnable() { // from class: z9.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        u.a aVar = this.f119298b;
                        uVar.z(aVar.f119317a, aVar.f119318b, exc);
                    }
                });
            }
        }

        public void m() {
            for (C1340a c1340a : this.f119319c) {
                final u uVar = c1340a.f119321b;
                q9.o0.Z0(c1340a.f119320a, new Runnable() { // from class: z9.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        u.a aVar = this.f119309b;
                        uVar.L(aVar.f119317a, aVar.f119318b);
                    }
                });
            }
        }

        public void n(u uVar) {
            for (C1340a c1340a : this.f119319c) {
                if (c1340a.f119321b == uVar) {
                    this.f119319c.remove(c1340a);
                }
            }
        }

        public a o(int i10, f0.b bVar) {
            return new a(this.f119319c, i10, bVar);
        }

        private a(CopyOnWriteArrayList copyOnWriteArrayList, int i10, f0.b bVar) {
            this.f119319c = copyOnWriteArrayList;
            this.f119317a = i10;
            this.f119318b = bVar;
        }
    }

    void G(int i10, f0.b bVar, int i11);

    void J(int i10, f0.b bVar);

    void L(int i10, f0.b bVar);

    void v(int i10, f0.b bVar);

    void w(int i10, f0.b bVar);

    void z(int i10, f0.b bVar, Exception exc);
}
