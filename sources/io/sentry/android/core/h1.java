package io.sentry.android.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import io.sentry.android.core.c1;
import io.sentry.g7;
import io.sentry.n5;
import io.sentry.p2;
import io.sentry.util.q;
import io.sentry.util.runtime.a;
import io.sentry.w6;
import io.sentry.w7;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes3.dex */
final class h1 implements io.sentry.d0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Context f82423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w0 f82424c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SentryAndroidOptions f82425d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Future f82426e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final io.sentry.util.q f82427f = new io.sentry.util.q(new q.a() { // from class: io.sentry.android.core.e1
        @Override // io.sentry.util.q.a
        public final Object a() {
            return c1.k(p2.e());
        }
    });

    public h1(Context context, w0 w0Var, final SentryAndroidOptions sentryAndroidOptions) {
        Future futureSubmit;
        this.f82423b = (Context) io.sentry.util.w.c(c1.f(context), "The application context is required.");
        this.f82424c = (w0) io.sentry.util.w.c(w0Var, "The BuildInfoProvider is required.");
        this.f82425d = (SentryAndroidOptions) io.sentry.util.w.c(sentryAndroidOptions, "The options object is required.");
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        try {
            futureSubmit = executorServiceNewSingleThreadExecutor.submit(new Callable() { // from class: io.sentry.android.core.f1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return l1.k(this.f82408b.f82423b, sentryAndroidOptions);
                }
            });
        } catch (RejectedExecutionException e10) {
            sentryAndroidOptions.getLogger().a(g7.WARNING, "Device info caching task rejected.", e10);
            futureSubmit = null;
        }
        this.f82426e = futureSubmit;
        executorServiceNewSingleThreadExecutor.shutdown();
    }

    private static void g(w6 w6Var) {
        io.sentry.protocol.c0 c0VarI;
        List listD;
        List listR0 = w6Var.r0();
        if (listR0 == null || listR0.size() <= 1) {
            return;
        }
        io.sentry.protocol.s sVar = (io.sentry.protocol.s) listR0.get(listR0.size() - 1);
        if (!"java.lang".equals(sVar.h()) || (c0VarI = sVar.i()) == null || (listD = c0VarI.d()) == null) {
            return;
        }
        Iterator it = listD.iterator();
        while (it.hasNext()) {
            if ("com.android.internal.os.RuntimeInit$MethodAndArgsCaller".equals(((io.sentry.protocol.b0) it.next()).v())) {
                Collections.reverse(listR0);
                return;
            }
        }
    }

    private void h(n5 n5Var) {
        String str;
        io.sentry.protocol.n nVarH = n5Var.C().h();
        Future future = this.f82426e;
        if (future != null) {
            try {
                n5Var.C().u(((l1) future.get()).l());
            } catch (Throwable th2) {
                this.f82425d.getLogger().a(g7.ERROR, "Failed to retrieve os system", th2);
            }
        } else {
            this.f82425d.getLogger().c(g7.ERROR, "Failed to retrieve device info", new Object[0]);
        }
        if (nVarH != null) {
            String strG = nVarH.g();
            if (strG == null || strG.isEmpty()) {
                str = "os_1";
            } else {
                str = "os_" + strG.trim().toLowerCase(Locale.ROOT);
            }
            n5Var.C().l(str, nVarH);
        }
    }

    private void i(n5 n5Var) {
        io.sentry.protocol.i0 i0VarQ = n5Var.Q();
        if (i0VarQ == null) {
            i0VarQ = new io.sentry.protocol.i0();
            n5Var.h0(i0VarQ);
        }
        if (i0VarQ.h() == null) {
            i0VarQ.j((String) this.f82425d.getRuntimeManager().a(new a.InterfaceC1016a() { // from class: io.sentry.android.core.g1
                @Override // io.sentry.util.runtime.a.InterfaceC1016a
                public final Object run() {
                    return p1.a(this.f82414a.f82423b);
                }
            }));
        }
        if (i0VarQ.i() == null && this.f82425d.isSendDefaultPii()) {
            i0VarQ.k("{{auto}}");
        }
    }

    private void j(n5 n5Var, io.sentry.i0 i0Var) {
        io.sentry.protocol.a aVarD = n5Var.C().d();
        if (aVarD == null) {
            aVarD = new io.sentry.protocol.a();
        }
        k(aVarD, i0Var);
        o(n5Var, aVarD);
        n5Var.C().o(aVarD);
    }

    private void k(io.sentry.protocol.a aVar, io.sentry.i0 i0Var) {
        Boolean boolO;
        aVar.o(c1.h(this.f82423b));
        io.sentry.android.core.performance.i iVarL = io.sentry.android.core.performance.h.p().l(this.f82425d);
        if (iVarL.m()) {
            aVar.p(io.sentry.l.o(iVarL.g()));
        }
        if (io.sentry.util.m.i(i0Var) || aVar.l() != null || (boolO = AppState.n().o()) == null) {
            return;
        }
        aVar.r(Boolean.valueOf(!boolO.booleanValue()));
    }

    private void l(n5 n5Var, boolean z10, boolean z11) {
        i(n5Var);
        m(n5Var, z10, z11);
        p(n5Var);
    }

    private void m(n5 n5Var, boolean z10, boolean z11) {
        if (n5Var.C().e() == null) {
            if (this.f82426e != null) {
                try {
                    n5Var.C().q(((l1) this.f82426e.get()).c(z10, z11));
                } catch (Throwable th2) {
                    this.f82425d.getLogger().a(g7.ERROR, "Failed to retrieve device info", th2);
                }
            } else {
                this.f82425d.getLogger().c(g7.ERROR, "Failed to retrieve device info", new Object[0]);
            }
            h(n5Var);
        }
    }

    private void n(n5 n5Var, String str) {
        if (n5Var.E() == null) {
            n5Var.V(str);
        }
    }

    private void o(n5 n5Var, io.sentry.protocol.a aVar) {
        l1 l1Var;
        PackageInfo packageInfoN = c1.n(this.f82423b, 4096, this.f82425d.getLogger(), this.f82424c);
        if (packageInfoN != null) {
            n(n5Var, c1.p(packageInfoN, this.f82424c));
            Future future = this.f82426e;
            if (future != null) {
                try {
                    l1Var = (l1) future.get();
                } catch (Throwable th2) {
                    this.f82425d.getLogger().a(g7.ERROR, "Failed to retrieve device info", th2);
                    l1Var = null;
                }
                c1.w(packageInfoN, this.f82424c, l1Var, aVar);
            }
            this.f82425d.getLogger().c(g7.ERROR, "Failed to retrieve device info", new Object[0]);
            l1Var = null;
            c1.w(packageInfoN, this.f82424c, l1Var, aVar);
        }
    }

    private void p(n5 n5Var) {
        Future future = this.f82426e;
        if (future == null) {
            this.f82425d.getLogger().c(g7.ERROR, "Failed to retrieve device info", new Object[0]);
            return;
        }
        try {
            c1.a aVarN = ((l1) future.get()).n();
            if (aVarN != null) {
                for (Map.Entry entry : aVarN.a().entrySet()) {
                    n5Var.f0((String) entry.getKey(), (String) entry.getValue());
                }
            }
        } catch (Throwable th2) {
            this.f82425d.getLogger().a(g7.ERROR, "Error getting side loaded info.", th2);
        }
    }

    private void q(w6 w6Var, io.sentry.i0 i0Var) {
        if (w6Var.w0() != null) {
            boolean zI = io.sentry.util.m.i(i0Var);
            for (io.sentry.protocol.d0 d0Var : w6Var.w0()) {
                boolean zG = io.sentry.android.core.internal.util.l.e().g(d0Var);
                if (d0Var.o() == null) {
                    d0Var.r(Boolean.valueOf(zG));
                }
                if (!zI && d0Var.p() == null) {
                    d0Var.v(Boolean.valueOf(zG));
                }
            }
        }
    }

    private boolean r(n5 n5Var, io.sentry.i0 i0Var) {
        if (io.sentry.util.m.q(i0Var)) {
            return true;
        }
        this.f82425d.getLogger().c(g7.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", n5Var.G());
        return false;
    }

    @Override // io.sentry.d0
    public w7 c(w7 w7Var, io.sentry.i0 i0Var) {
        boolean zR = r(w7Var, i0Var);
        if (zR) {
            j(w7Var, i0Var);
        }
        l(w7Var, false, zR);
        return w7Var;
    }

    @Override // io.sentry.d0
    public w6 d(w6 w6Var, io.sentry.i0 i0Var) {
        boolean zR = r(w6Var, i0Var);
        if (zR) {
            j(w6Var, i0Var);
            q(w6Var, i0Var);
        }
        l(w6Var, true, zR);
        g(w6Var);
        return w6Var;
    }

    @Override // io.sentry.d0
    public io.sentry.protocol.e0 e(io.sentry.protocol.e0 e0Var, io.sentry.i0 i0Var) {
        boolean zR = r(e0Var, i0Var);
        if (zR) {
            j(e0Var, i0Var);
        }
        l(e0Var, false, zR);
        return e0Var;
    }
}
