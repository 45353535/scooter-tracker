package io.sentry.android.core;

import io.sentry.ILogger;
import io.sentry.android.core.i0;
import io.sentry.c9;
import io.sentry.g7;
import io.sentry.k5;
import io.sentry.n0;
import io.sentry.n7;
import io.sentry.s5;
import io.sentry.transport.b0;
import io.sentry.u3;
import io.sentry.v7;
import io.sentry.w2;
import io.sentry.w3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public class v implements io.sentry.o0, b0.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ILogger f82770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f82771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f82772d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final io.sentry.f1 f82773e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w0 f82774f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final io.sentry.android.core.internal.util.f0 f82776h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private io.sentry.b1 f82779k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Future f82780l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private io.sentry.i f82781m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private io.sentry.protocol.x f82783o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private io.sentry.protocol.x f82784p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final AtomicBoolean f82785q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private s5 f82786r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private volatile boolean f82787s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f82788t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f82789u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f82790v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final io.sentry.util.a f82791w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final io.sentry.util.a f82792x;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f82775g = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private i0 f82777i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f82778j = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f82782n = new ArrayList();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f82793a;

        static {
            int[] iArr = new int[w3.values().length];
            f82793a = iArr;
            try {
                iArr[w3.TRACE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f82793a[w3.MANUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public v(w0 w0Var, io.sentry.android.core.internal.util.f0 f0Var, ILogger iLogger, String str, int i10, io.sentry.f1 f1Var) {
        io.sentry.protocol.x xVar = io.sentry.protocol.x.f84062c;
        this.f82783o = xVar;
        this.f82784p = xVar;
        this.f82785q = new AtomicBoolean(false);
        this.f82786r = new n7();
        this.f82787s = true;
        this.f82788t = false;
        this.f82789u = false;
        this.f82790v = 0;
        this.f82791w = new io.sentry.util.a();
        this.f82792x = new io.sentry.util.a();
        this.f82770b = iLogger;
        this.f82776h = f0Var;
        this.f82774f = w0Var;
        this.f82771c = str;
        this.f82772d = i10;
        this.f82773e = f1Var;
    }

    public static /* synthetic */ void h(v vVar, v7 v7Var, io.sentry.b1 b1Var) {
        if (vVar.f82785q.get()) {
            return;
        }
        ArrayList arrayList = new ArrayList(vVar.f82782n.size());
        io.sentry.g1 g1VarD = vVar.f82792x.d();
        try {
            Iterator it = vVar.f82782n.iterator();
            while (it.hasNext()) {
                arrayList.add(((u3.a) it.next()).a(v7Var));
            }
            vVar.f82782n.clear();
            if (g1VarD != null) {
                g1VarD.close();
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                b1Var.H((u3) it2.next());
            }
        } catch (Throwable th2) {
            if (g1VarD != null) {
                try {
                    g1VarD.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    private void i() {
        if (this.f82775g) {
            return;
        }
        this.f82775g = true;
        String str = this.f82771c;
        if (str == null) {
            this.f82770b.c(g7.WARNING, "Disabling profiling because no profiling traces dir path is defined in options.", new Object[0]);
            return;
        }
        int i10 = this.f82772d;
        if (i10 <= 0) {
            this.f82770b.c(g7.WARNING, "Disabling profiling because trace rate is set to %d", Integer.valueOf(i10));
        } else {
            this.f82777i = new i0(str, ((int) TimeUnit.SECONDS.toMicros(1L)) / this.f82772d, this.f82776h, null, this.f82770b);
        }
    }

    private void j() {
        io.sentry.b1 b1Var = this.f82779k;
        if ((b1Var == null || b1Var == w2.h()) && k5.t() != w2.h()) {
            this.f82779k = k5.t();
            this.f82781m = k5.t().getOptions().getCompositePerformanceCollector();
            io.sentry.transport.b0 b0VarV = this.f82779k.v();
            if (b0VarV != null) {
                b0VarV.h(this);
            }
        }
    }

    private void k(final io.sentry.b1 b1Var, final v7 v7Var) {
        try {
            v7Var.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.u
                @Override // java.lang.Runnable
                public final void run() {
                    v.h(this.f82763b, v7Var, b1Var);
                }
            });
        } catch (Throwable th2) {
            v7Var.getLogger().a(g7.DEBUG, "Failed to send profile chunks.", th2);
        }
    }

    private void l() {
        j();
        if (this.f82774f.d() < 22) {
            return;
        }
        i();
        if (this.f82777i == null) {
            return;
        }
        io.sentry.b1 b1Var = this.f82779k;
        if (b1Var != null) {
            io.sentry.transport.b0 b0VarV = b1Var.v();
            if (b0VarV != null && (b0VarV.p(io.sentry.k.All) || b0VarV.p(io.sentry.k.ProfileChunkUi))) {
                this.f82770b.c(g7.WARNING, "SDK is rate limited. Stopping profiler.", new Object[0]);
                m(false);
                return;
            } else {
                if (this.f82779k.getOptions().getConnectionStatusProvider().A() == n0.a.DISCONNECTED) {
                    this.f82770b.c(g7.WARNING, "Device is offline. Stopping profiler.", new Object[0]);
                    m(false);
                    return;
                }
                this.f82786r = this.f82779k.getOptions().getDateProvider().a();
            }
        } else {
            this.f82786r = new n7();
        }
        if (this.f82777i.j() == null) {
            return;
        }
        this.f82778j = true;
        io.sentry.protocol.x xVar = this.f82783o;
        io.sentry.protocol.x xVar2 = io.sentry.protocol.x.f84062c;
        if (xVar.equals(xVar2)) {
            this.f82783o = new io.sentry.protocol.x();
        }
        if (this.f82784p.equals(xVar2)) {
            this.f82784p = new io.sentry.protocol.x();
        }
        io.sentry.i iVar = this.f82781m;
        if (iVar != null) {
            iVar.f(this.f82784p.toString());
        }
        try {
            this.f82780l = this.f82773e.schedule(new Runnable() { // from class: io.sentry.android.core.t
                @Override // java.lang.Runnable
                public final void run() {
                    this.f82758b.m(true);
                }
            }, 60000L);
        } catch (RejectedExecutionException e10) {
            this.f82770b.a(g7.ERROR, "Failed to schedule profiling chunk finish. Did you call Sentry.close()?", e10);
            this.f82788t = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(boolean z10) {
        j();
        io.sentry.g1 g1VarD = this.f82791w.d();
        try {
            Future future = this.f82780l;
            if (future != null) {
                future.cancel(true);
            }
            if (this.f82777i != null && this.f82778j) {
                if (this.f82774f.d() < 22) {
                    if (g1VarD != null) {
                        g1VarD.close();
                        return;
                    }
                    return;
                }
                io.sentry.i iVar = this.f82781m;
                i0.b bVarG = this.f82777i.g(false, iVar != null ? iVar.e(this.f82784p.toString()) : null);
                if (bVarG == null) {
                    this.f82770b.c(g7.ERROR, "An error occurred while collecting a profile chunk, and it won't be sent.", new Object[0]);
                } else {
                    g1VarD = this.f82792x.d();
                    try {
                        this.f82782n.add(new u3.a(this.f82783o, this.f82784p, bVarG.f82458d, bVarG.f82457c, this.f82786r, "android"));
                        if (g1VarD != null) {
                            g1VarD.close();
                        }
                    } finally {
                        if (g1VarD == null) {
                            throw th;
                        }
                        try {
                            g1VarD.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                }
                this.f82778j = false;
                io.sentry.protocol.x xVar = io.sentry.protocol.x.f84062c;
                this.f82784p = xVar;
                io.sentry.b1 b1Var = this.f82779k;
                if (b1Var != null) {
                    k(b1Var, b1Var.getOptions());
                }
                if (!z10 || this.f82788t) {
                    this.f82783o = xVar;
                    this.f82770b.c(g7.DEBUG, "Profile chunk finished.", new Object[0]);
                } else {
                    this.f82770b.c(g7.DEBUG, "Profile chunk finished. Starting a new one.", new Object[0]);
                    l();
                }
                if (g1VarD != null) {
                    g1VarD.close();
                    return;
                }
                return;
            }
            io.sentry.protocol.x xVar2 = io.sentry.protocol.x.f84062c;
            this.f82783o = xVar2;
            this.f82784p = xVar2;
            if (g1VarD != null) {
                g1VarD.close();
            }
        } finally {
        }
    }

    @Override // io.sentry.o0
    public void b(boolean z10) {
        io.sentry.g1 g1VarD = this.f82791w.d();
        try {
            this.f82790v = 0;
            this.f82788t = true;
            if (z10) {
                m(false);
                this.f82785q.set(true);
            }
            if (g1VarD != null) {
                g1VarD.close();
            }
        } catch (Throwable th2) {
            if (g1VarD != null) {
                try {
                    g1VarD.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // io.sentry.o0
    public void c(w3 w3Var, c9 c9Var) {
        io.sentry.g1 g1VarD = this.f82791w.d();
        try {
            if (this.f82787s) {
                this.f82789u = c9Var.c(io.sentry.util.b0.a().h());
                this.f82787s = false;
            }
            if (!this.f82789u) {
                this.f82770b.c(g7.DEBUG, "Profiler was not started due to sampling decision.", new Object[0]);
                if (g1VarD != null) {
                    g1VarD.close();
                    return;
                }
                return;
            }
            int i10 = a.f82793a[w3Var.ordinal()];
            if (i10 == 1) {
                if (this.f82790v < 0) {
                    this.f82790v = 0;
                }
                this.f82790v++;
            } else if (i10 == 2 && isRunning()) {
                this.f82770b.c(g7.DEBUG, "Profiler is already running.", new Object[0]);
                if (g1VarD != null) {
                    g1VarD.close();
                    return;
                }
                return;
            }
            if (!isRunning()) {
                this.f82770b.c(g7.DEBUG, "Started Profiler.", new Object[0]);
                l();
            }
            if (g1VarD != null) {
                g1VarD.close();
            }
        } catch (Throwable th2) {
            if (g1VarD != null) {
                try {
                    g1VarD.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // io.sentry.o0
    public void d() {
        this.f82787s = true;
    }

    @Override // io.sentry.o0
    public io.sentry.protocol.x e() {
        return this.f82784p;
    }

    @Override // io.sentry.o0
    public io.sentry.protocol.x f() {
        return this.f82783o;
    }

    @Override // io.sentry.o0
    public void g(w3 w3Var) {
        io.sentry.g1 g1VarD = this.f82791w.d();
        try {
            int i10 = a.f82793a[w3Var.ordinal()];
            if (i10 == 1) {
                int i11 = this.f82790v - 1;
                this.f82790v = i11;
                if (i11 > 0) {
                    if (g1VarD != null) {
                        g1VarD.close();
                        return;
                    }
                    return;
                } else {
                    if (i11 < 0) {
                        this.f82790v = 0;
                    }
                    this.f82788t = true;
                }
            } else if (i10 == 2) {
                this.f82788t = true;
            }
            if (g1VarD != null) {
                g1VarD.close();
            }
        } catch (Throwable th2) {
            if (g1VarD != null) {
                try {
                    g1VarD.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // io.sentry.o0
    public boolean isRunning() {
        return this.f82778j;
    }

    @Override // io.sentry.transport.b0.b
    public void o(io.sentry.transport.b0 b0Var) {
        if (b0Var.p(io.sentry.k.All) || b0Var.p(io.sentry.k.ProfileChunkUi)) {
            this.f82770b.c(g7.WARNING, "SDK is rate limited. Stopping profiler.", new Object[0]);
            m(false);
        }
    }
}
