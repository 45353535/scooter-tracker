package b3;

import com.facebook.internal.e;
import com.facebook.s;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f5824a = new g();

    private g() {
    }

    public static final void d() {
        if (s.q()) {
            com.facebook.internal.e.a(e.b.CrashReport, new e.a() { // from class: b3.d
                @Override // com.facebook.internal.e.a
                public final void a(boolean z10) {
                    g.e(z10);
                }
            });
            com.facebook.internal.e.a(e.b.ErrorReport, new e.a() { // from class: b3.e
                @Override // com.facebook.internal.e.a
                public final void a(boolean z10) {
                    g.f(z10);
                }
            });
            com.facebook.internal.e.a(e.b.AnrReport, new e.a() { // from class: b3.f
                @Override // com.facebook.internal.e.a
                public final void a(boolean z10) {
                    g.g(z10);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(boolean z10) {
        if (z10) {
            d3.c.f68423c.c();
            if (com.facebook.internal.e.g(e.b.CrashShield)) {
                b.b();
                e3.a.a();
            }
            if (com.facebook.internal.e.g(e.b.ThreadCheck)) {
                g3.a.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(boolean z10) {
        if (z10) {
            f3.e.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(boolean z10) {
        if (z10) {
            c3.e.c();
        }
    }
}
