package io.sentry.util;

import io.sentry.a4;
import io.sentry.b1;
import io.sentry.d9;
import io.sentry.h4;
import io.sentry.j4;
import io.sentry.p2;
import io.sentry.v7;
import io.sentry.y0;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h0 {
    public static /* synthetic */ void b(y0 y0Var, v7 v7Var, a4 a4Var) {
        io.sentry.d dVarA = a4Var.a();
        if (dVarA.q()) {
            dVarA.H(y0Var, v7Var);
            dVarA.b();
        }
    }

    public static io.sentry.d d(io.sentry.d dVar, d9 d9Var) {
        return e(dVar, d9Var == null ? null : d9Var.e(), d9Var == null ? null : d9Var.d(), d9Var != null ? d9Var.c() : null);
    }

    public static io.sentry.d e(io.sentry.d dVar, Boolean bool, Double d10, Double d11) {
        if (dVar == null) {
            dVar = new io.sentry.d(p2.e());
        }
        if (dVar.i() == null) {
            Double dJ = dVar.j();
            if (dJ != null) {
                d10 = dJ;
            }
            dVar.B(a0.b(d11, d10, bool));
        }
        if (dVar.q() && dVar.r()) {
            dVar.b();
        }
        return dVar;
    }

    public static boolean f(List list, String str) {
        if (str != null && list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((io.sentry.g0) it.next()).a().equalsIgnoreCase(str)) {
                    return true;
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (((io.sentry.g0) it2.next()).b(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static a4 g(final y0 y0Var, final v7 v7Var) {
        return y0Var.D(new h4.a() { // from class: io.sentry.util.e0
            @Override // io.sentry.h4.a
            public final void a(a4 a4Var) {
                h0.b(y0Var, v7Var, a4Var);
            }
        });
    }

    public static void h(b1 b1Var) {
        b1Var.x(new j4() { // from class: io.sentry.util.f0
            @Override // io.sentry.j4
            public final void a(y0 y0Var) {
                y0Var.D(new h4.a() { // from class: io.sentry.util.g0
                    @Override // io.sentry.h4.a
                    public final void a(a4 a4Var) {
                        y0Var.u(new a4());
                    }
                });
            }
        });
    }
}
