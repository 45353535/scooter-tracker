package io.sentry;

import io.sentry.h4;
import java.io.Closeable;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes3.dex */
public final class s4 implements b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y0 f84170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y0 f84171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final y0 f84172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final s4 f84173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f84174e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final i f84175f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final h f84176g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final io.sentry.logger.a f84177h;

    public s4(y0 y0Var, y0 y0Var2, y0 y0Var3, String str) {
        this(y0Var, y0Var2, y0Var3, null, str);
    }

    private Double L(e9 e9Var) {
        Double dI;
        d dVarB = e9Var.b();
        return (dVarB == null || (dI = dVarB.i()) == null) ? t().B().c() : dI;
    }

    private void N(io.sentry.protocol.x xVar) {
        t().F(xVar);
    }

    private static void O(v7 v7Var) {
        io.sentry.util.w.c(v7Var, "SentryOptions is required.");
        if (v7Var.getDsn() == null || v7Var.getDsn().isEmpty()) {
            throw new IllegalArgumentException("Scopes requires a DSN to be instantiated. Considering using the NoOpScopes if no DSN is available.");
        }
    }

    private void n(w6 w6Var) {
        t().s(w6Var);
    }

    private y0 o(y0 y0Var, j4 j4Var) {
        if (j4Var != null) {
            try {
                y0 y0VarM7812clone = y0Var.m7812clone();
                j4Var.a(y0VarM7812clone);
                return y0VarM7812clone;
            } catch (Throwable th2) {
                getOptions().getLogger().a(g7.ERROR, "Error in the 'ScopeCallback' callback.", th2);
            }
        }
        return y0Var;
    }

    private io.sentry.protocol.x p(w6 w6Var, i0 i0Var, j4 j4Var) {
        io.sentry.protocol.x xVarG = io.sentry.protocol.x.f84062c;
        if (!isEnabled()) {
            getOptions().getLogger().c(g7.WARNING, "Instance is disabled and this 'captureEvent' call is a no-op.", new Object[0]);
            return xVarG;
        }
        if (w6Var == null) {
            getOptions().getLogger().c(g7.WARNING, "captureEvent called with null parameter.", new Object[0]);
            return xVarG;
        }
        try {
            n(w6Var);
            xVarG = s().g(w6Var, o(t(), j4Var), i0Var);
            N(xVarG);
            return xVarG;
        } catch (Throwable th2) {
            getOptions().getLogger().a(g7.ERROR, "Error while capturing event with id: " + w6Var.G(), th2);
            return xVarG;
        }
    }

    private io.sentry.protocol.x q(Throwable th2, i0 i0Var, j4 j4Var) {
        io.sentry.protocol.x xVarG = io.sentry.protocol.x.f84062c;
        if (!isEnabled()) {
            getOptions().getLogger().c(g7.WARNING, "Instance is disabled and this 'captureException' call is a no-op.", new Object[0]);
        } else if (th2 == null) {
            getOptions().getLogger().c(g7.WARNING, "captureException called with null parameter.", new Object[0]);
        } else {
            try {
                w6 w6Var = new w6(th2);
                n(w6Var);
                xVarG = s().g(w6Var, o(t(), j4Var), i0Var);
            } catch (Throwable th3) {
                getOptions().getLogger().a(g7.ERROR, "Error while capturing exception: " + th2.getMessage(), th3);
            }
        }
        N(xVarG);
        return xVarG;
    }

    private l1 r(e9 e9Var, g9 g9Var) {
        l1 l1VarA;
        io.sentry.util.w.c(e9Var, "transactionContext is required");
        e9Var.t(g9Var.a());
        if (!isEnabled()) {
            getOptions().getLogger().c(g7.WARNING, "Instance is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
            l1VarA = h3.s();
        } else if (io.sentry.util.c0.b(getOptions().getIgnoredSpanOrigins(), e9Var.g())) {
            getOptions().getLogger().c(g7.DEBUG, "Returning no-op for span origin %s as the SDK has been configured to ignore it", e9Var.g());
            l1VarA = h3.s();
        } else if (!getOptions().getInstrumenter().equals(e9Var.e())) {
            getOptions().getLogger().c(g7.DEBUG, "Returning no-op for instrumenter %s as the SDK has been configured to use instrumenter %s", e9Var.e(), getOptions().getInstrumenter());
            l1VarA = h3.s();
        } else if (getOptions().isTracingEnabled()) {
            Double dL = L(e9Var);
            g9Var.j();
            d9 d9VarA = getOptions().getInternalTracesSampler().a(new g4(e9Var, null, dL, null));
            e9Var.u(d9VarA);
            k1 k1VarM = g9Var.m();
            if (k1VarM == null) {
                k1VarM = getOptions().getSpanFactory();
            }
            if (d9VarA.e().booleanValue() && getOptions().isContinuousProfilingEnabled()) {
                w3 profileLifecycle = getOptions().getProfileLifecycle();
                w3 w3Var = w3.TRACE;
                if (profileLifecycle == w3Var && e9Var.j().equals(io.sentry.protocol.x.f84062c)) {
                    getOptions().getContinuousProfiler().c(w3Var, getOptions().getInternalTracesSampler());
                }
            }
            l1VarA = k1VarM.a(e9Var, this, g9Var, this.f84175f);
            if (d9VarA.e().booleanValue() && d9VarA.b().booleanValue()) {
                m1 transactionProfiler = getOptions().getTransactionProfiler();
                if (!transactionProfiler.isRunning()) {
                    transactionProfiler.start();
                    transactionProfiler.a(l1VarA);
                } else if (g9Var.o()) {
                    transactionProfiler.a(l1VarA);
                }
            }
        } else {
            getOptions().getLogger().c(g7.INFO, "Tracing is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
            l1VarA = h3.s();
        }
        if (g9Var.p()) {
            l1VarA.n();
        }
        return l1VarA;
    }

    @Override // io.sentry.b1
    public l1 A(e9 e9Var, g9 g9Var) {
        return r(e9Var, g9Var);
    }

    @Override // io.sentry.b1
    public /* synthetic */ io.sentry.protocol.x B(Throwable th2) {
        return a1.b(this, th2);
    }

    @Override // io.sentry.b1
    public io.sentry.protocol.x C(io.sentry.protocol.e0 e0Var, b9 b9Var, i0 i0Var, y3 y3Var) {
        io.sentry.protocol.e0 e0Var2;
        io.sentry.util.w.c(e0Var, "transaction is required");
        io.sentry.protocol.x xVar = io.sentry.protocol.x.f84062c;
        if (!isEnabled()) {
            getOptions().getLogger().c(g7.WARNING, "Instance is disabled and this 'captureTransaction' call is a no-op.", new Object[0]);
        } else if (!e0Var.s0()) {
            getOptions().getLogger().c(g7.WARNING, "Transaction: %s is not finished and this 'captureTransaction' call is a no-op.", e0Var.G());
        } else {
            if (Boolean.TRUE.equals(Boolean.valueOf(e0Var.t0()))) {
                try {
                    e0Var2 = e0Var;
                } catch (Throwable th2) {
                    th = th2;
                    e0Var2 = e0Var;
                }
                try {
                    return s().d(e0Var2, b9Var, t(), i0Var, y3Var);
                } catch (Throwable th3) {
                    th = th3;
                    Throwable th4 = th;
                    getOptions().getLogger().a(g7.ERROR, "Error while capturing transaction with id: " + e0Var2.G(), th4);
                    return xVar;
                }
            }
            getOptions().getLogger().c(g7.DEBUG, "Transaction %s was dropped due to sampling decision.", e0Var.G());
            if (getOptions().getBackpressureMonitor().a() > 0) {
                io.sentry.clientreport.h clientReportRecorder = getOptions().getClientReportRecorder();
                io.sentry.clientreport.f fVar = io.sentry.clientreport.f.BACKPRESSURE;
                clientReportRecorder.a(fVar, k.Transaction);
                getOptions().getClientReportRecorder().b(fVar, k.Span, e0Var.q0().size() + 1);
            } else {
                io.sentry.clientreport.h clientReportRecorder2 = getOptions().getClientReportRecorder();
                io.sentry.clientreport.f fVar2 = io.sentry.clientreport.f.SAMPLE_RATE;
                clientReportRecorder2.a(fVar2, k.Transaction);
                getOptions().getClientReportRecorder().b(fVar2, k.Span, e0Var.q0().size() + 1);
            }
        }
        return xVar;
    }

    @Override // io.sentry.b1
    public /* synthetic */ io.sentry.protocol.x D(io.sentry.protocol.e0 e0Var, b9 b9Var, i0 i0Var) {
        return a1.c(this, e0Var, b9Var, i0Var);
    }

    @Override // io.sentry.b1
    public /* synthetic */ boolean E() {
        return a1.e(this);
    }

    @Override // io.sentry.b1
    public void F(l4 l4Var, j4 j4Var) {
        if (!isEnabled()) {
            getOptions().getLogger().c(g7.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            return;
        }
        try {
            j4Var.a(this.f84176g.e(l4Var));
        } catch (Throwable th2) {
            getOptions().getLogger().a(g7.ERROR, "Error in the 'configureScope' callback.", th2);
        }
    }

    @Override // io.sentry.b1
    public y0 G() {
        return this.f84172c;
    }

    @Override // io.sentry.b1
    public io.sentry.protocol.x H(u3 u3Var) {
        io.sentry.util.w.c(u3Var, "profilingContinuousData is required");
        io.sentry.protocol.x xVar = io.sentry.protocol.x.f84062c;
        if (isEnabled()) {
            try {
                return s().a(u3Var, M());
            } catch (Throwable th2) {
                getOptions().getLogger().a(g7.ERROR, "Error while capturing profile chunk with id: " + u3Var.n(), th2);
            }
        } else {
            getOptions().getLogger().c(g7.WARNING, "Instance is disabled and this 'captureTransaction' call is a no-op.", new Object[0]);
        }
        return xVar;
    }

    @Override // io.sentry.b1
    public io.sentry.protocol.x I(w6 w6Var, i0 i0Var) {
        return p(w6Var, i0Var, null);
    }

    @Override // io.sentry.b1
    public io.sentry.protocol.x J(Throwable th2, i0 i0Var) {
        return q(th2, i0Var, null);
    }

    @Override // io.sentry.b1
    public b1 K(String str) {
        return new s4(this.f84170a.m7812clone(), this.f84171b.m7812clone(), this.f84172c, this, str);
    }

    public y0 M() {
        return this.f84170a;
    }

    @Override // io.sentry.b1
    public void a(e eVar, i0 i0Var) {
        if (!isEnabled()) {
            getOptions().getLogger().c(g7.WARNING, "Instance is disabled and this 'addBreadcrumb' call is a no-op.", new Object[0]);
        } else if (eVar == null) {
            getOptions().getLogger().c(g7.WARNING, "addBreadcrumb called with null parameter.", new Object[0]);
        } else {
            t().a(eVar, i0Var);
        }
    }

    @Override // io.sentry.b1
    public void b(final boolean z10) {
        if (!isEnabled()) {
            getOptions().getLogger().c(g7.WARNING, "Instance is disabled and this 'close' call is a no-op.", new Object[0]);
            return;
        }
        try {
            for (r1 r1Var : getOptions().getIntegrations()) {
                if (r1Var instanceof Closeable) {
                    try {
                        ((Closeable) r1Var).close();
                    } catch (Throwable th2) {
                        getOptions().getLogger().c(g7.WARNING, "Failed to close the integration {}.", r1Var, th2);
                    }
                }
            }
            x(new j4() { // from class: io.sentry.m4
                @Override // io.sentry.j4
                public final void a(y0 y0Var) {
                    y0Var.clear();
                }
            });
            F(l4.ISOLATION, new j4() { // from class: io.sentry.n4
                @Override // io.sentry.j4
                public final void a(y0 y0Var) {
                    y0Var.clear();
                }
            });
            getOptions().getBackpressureMonitor().close();
            getOptions().getTransactionProfiler().close();
            getOptions().getContinuousProfiler().b(true);
            getOptions().getCompositePerformanceCollector().close();
            getOptions().getConnectionStatusProvider().close();
            final f1 executorService = getOptions().getExecutorService();
            if (z10) {
                try {
                    executorService.submit(new Runnable() { // from class: io.sentry.o4
                        @Override // java.lang.Runnable
                        public final void run() {
                            executorService.b(this.f83779b.getOptions().getShutdownTimeoutMillis());
                        }
                    });
                } catch (RejectedExecutionException e10) {
                    getOptions().getLogger().a(g7.WARNING, "Failed to submit executor service shutdown task during restart. Shutting down synchronously.", e10);
                    executorService.b(getOptions().getShutdownTimeoutMillis());
                }
            } else {
                executorService.b(getOptions().getShutdownTimeoutMillis());
            }
            F(l4.CURRENT, new j4() { // from class: io.sentry.p4
                @Override // io.sentry.j4
                public final void a(y0 y0Var) {
                    y0Var.r().b(z10);
                }
            });
            F(l4.ISOLATION, new j4() { // from class: io.sentry.q4
                @Override // io.sentry.j4
                public final void a(y0 y0Var) {
                    y0Var.r().b(z10);
                }
            });
            F(l4.GLOBAL, new j4() { // from class: io.sentry.r4
                @Override // io.sentry.j4
                public final void a(y0 y0Var) {
                    y0Var.r().b(z10);
                }
            });
        } catch (Throwable th3) {
            getOptions().getLogger().a(g7.ERROR, "Error while closing the Scopes.", th3);
        }
    }

    @Override // io.sentry.b1
    public void c(Throwable th2, j1 j1Var, String str) {
        t().c(th2, j1Var, str);
    }

    @Override // io.sentry.b1
    public void d() {
        if (!isEnabled()) {
            getOptions().getLogger().c(g7.WARNING, "Instance is disabled and this 'startSession' call is a no-op.", new Object[0]);
            return;
        }
        h4.d dVarD = t().d();
        if (dVarD == null) {
            getOptions().getLogger().c(g7.WARNING, "Session could not be started.", new Object[0]);
            return;
        }
        if (dVarD.b() != null) {
            s().e(dVarD.b(), io.sentry.util.m.e(new io.sentry.hints.m()));
        }
        s().e(dVarD.a(), io.sentry.util.m.e(new io.sentry.hints.o()));
    }

    @Override // io.sentry.b1
    public void e(e eVar) {
        a(eVar, new i0());
    }

    @Override // io.sentry.b1
    public void f() {
        if (!isEnabled()) {
            getOptions().getLogger().c(g7.WARNING, "Instance is disabled and this 'endSession' call is a no-op.", new Object[0]);
            return;
        }
        k8 k8VarF = t().f();
        if (k8VarF != null) {
            s().e(k8VarF, io.sentry.util.m.e(new io.sentry.hints.m()));
        }
    }

    @Override // io.sentry.b1
    public v7 getOptions() {
        return this.f84176g.getOptions();
    }

    @Override // io.sentry.b1
    public l1 getTransaction() {
        if (isEnabled()) {
            return t().getTransaction();
        }
        getOptions().getLogger().c(g7.WARNING, "Instance is disabled and this 'getTransaction' call is a no-op.", new Object[0]);
        return null;
    }

    @Override // io.sentry.b1
    public boolean isEnabled() {
        return s().isEnabled();
    }

    @Override // io.sentry.b1
    public void j(long j10) {
        if (!isEnabled()) {
            getOptions().getLogger().c(g7.WARNING, "Instance is disabled and this 'flush' call is a no-op.", new Object[0]);
            return;
        }
        try {
            s().j(j10);
        } catch (Throwable th2) {
            getOptions().getLogger().a(g7.ERROR, "Error in the 'client.flush'.", th2);
        }
    }

    public e1 s() {
        return t().r();
    }

    public y0 t() {
        return this.f84176g;
    }

    @Override // io.sentry.b1
    public boolean u() {
        return s().u();
    }

    @Override // io.sentry.b1
    public io.sentry.transport.b0 v() {
        return s().v();
    }

    @Override // io.sentry.b1
    public io.sentry.protocol.x w(u5 u5Var, i0 i0Var) {
        io.sentry.util.w.c(u5Var, "SentryEnvelope is required.");
        io.sentry.protocol.x xVar = io.sentry.protocol.x.f84062c;
        if (isEnabled()) {
            try {
                io.sentry.protocol.x xVarW = s().w(u5Var, i0Var);
                if (xVarW != null) {
                    return xVarW;
                }
            } catch (Throwable th2) {
                getOptions().getLogger().a(g7.ERROR, "Error while capturing envelope.", th2);
            }
        } else {
            getOptions().getLogger().c(g7.WARNING, "Instance is disabled and this 'captureEnvelope' call is a no-op.", new Object[0]);
        }
        return xVar;
    }

    @Override // io.sentry.b1
    public /* synthetic */ void x(j4 j4Var) {
        a1.d(this, j4Var);
    }

    @Override // io.sentry.b1
    public io.sentry.protocol.x y(w7 w7Var, i0 i0Var) {
        io.sentry.protocol.x xVar = io.sentry.protocol.x.f84062c;
        if (isEnabled()) {
            try {
                return s().c(w7Var, t(), i0Var);
            } catch (Throwable th2) {
                getOptions().getLogger().a(g7.ERROR, "Error while capturing replay", th2);
            }
        } else {
            getOptions().getLogger().c(g7.WARNING, "Instance is disabled and this 'captureReplay' call is a no-op.", new Object[0]);
        }
        return xVar;
    }

    @Override // io.sentry.b1
    public /* synthetic */ io.sentry.protocol.x z(u5 u5Var) {
        return a1.a(this, u5Var);
    }

    private s4(y0 y0Var, y0 y0Var2, y0 y0Var3, s4 s4Var, String str) {
        this.f84176g = new h(y0Var3, y0Var2, y0Var);
        this.f84170a = y0Var;
        this.f84171b = y0Var2;
        this.f84172c = y0Var3;
        this.f84173d = s4Var;
        this.f84174e = str;
        v7 options = getOptions();
        O(options);
        this.f84175f = options.getCompositePerformanceCollector();
        this.f84177h = new io.sentry.logger.c(this);
    }

    @Override // io.sentry.b1
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public s0 m7816clone() {
        if (!isEnabled()) {
            getOptions().getLogger().c(g7.WARNING, "Disabled Scopes cloned.", new Object[0]);
        }
        return new m0(K("scopes clone"));
    }
}
