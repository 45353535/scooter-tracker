package io.sentry;

import com.google.android.gms.common.Scopes;
import io.sentry.util.runtime.a;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile c1 f83660a = y2.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile b1 f83661b = w2.h();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final y0 f83662c = new h4(v7.empty());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile boolean f83663d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Charset f83664e = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f83665f = System.currentTimeMillis();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final io.sentry.util.a f83666g = new io.sentry.util.a();

    public interface a {
        void a(v7 v7Var);
    }

    private static void A(v7 v7Var) {
        if (v7Var.getFatalLogger() instanceof p2) {
            v7Var.setFatalLogger(new a9());
        }
    }

    private static void B(v7 v7Var) {
        io.sentry.opentelemetry.a.c(v7Var, new io.sentry.util.t());
        if (p7.OFF == v7Var.getOpenTelemetryMode()) {
            v7Var.setSpanFactory(new p());
        }
        E(v7Var);
        io.sentry.opentelemetry.a.a(v7Var);
    }

    private static void C(v7 v7Var) {
        io.sentry.util.n.c(v7Var);
        io.sentry.util.n.b(v7Var);
    }

    private static void D(v7 v7Var) {
        if (v7Var.isDebug() && (v7Var.getLogger() instanceof p2)) {
            v7Var.setLogger(new a9());
        }
    }

    private static void E(v7 v7Var) {
        v().close();
        if (p7.OFF == v7Var.getOpenTelemetryMode()) {
            f83660a = new o();
        } else {
            f83660a = u4.a(new io.sentry.util.t(), p2.e());
        }
    }

    public static boolean F() {
        return t().isEnabled();
    }

    public static boolean G() {
        return t().u();
    }

    private static void H(v7 v7Var) {
        try {
            v7Var.getExecutorService().submit(new i2(v7Var));
        } catch (Throwable th2) {
            v7Var.getLogger().a(g7.DEBUG, "Failed to move previous session.", th2);
        }
    }

    private static void I(final v7 v7Var) {
        try {
            v7Var.getExecutorService().submit(new Runnable() { // from class: io.sentry.j5
                @Override // java.lang.Runnable
                public final void run() {
                    k5.d(v7Var);
                }
            });
        } catch (Throwable th2) {
            v7Var.getLogger().a(g7.DEBUG, "Failed to notify options observers.", th2);
        }
    }

    private static boolean J(v7 v7Var) {
        if (v7Var.isEnableExternalConfiguration()) {
            v7Var.merge(f0.g(io.sentry.config.h.a(), v7Var.getLogger()));
        }
        String dsn = v7Var.getDsn();
        if (!v7Var.isEnabled() || (dsn != null && dsn.isEmpty())) {
            n();
            return false;
        }
        if (dsn == null) {
            throw new IllegalArgumentException("DSN is required. Use empty string or set enabled to false in SentryOptions to disable SDK.");
        }
        v7Var.retrieveParsedDsn();
        return true;
    }

    private static d9 K(v7 v7Var) {
        e9 e9Var = new e9("app.launch", Scopes.PROFILE);
        e9Var.B(true);
        return v7Var.getInternalTracesSampler().a(new g4(e9Var, null, Double.valueOf(io.sentry.util.b0.a().h()), null));
    }

    public static void L() {
        t().d();
    }

    public static l1 M(e9 e9Var, g9 g9Var) {
        return t().A(e9Var, g9Var);
    }

    public static /* synthetic */ void a(v7 v7Var) {
        String cacheDirPathWithoutDsn = v7Var.getCacheDirPathWithoutDsn();
        if (cacheDirPathWithoutDsn != null) {
            File file = new File(cacheDirPathWithoutDsn, "app_start_profiling_config");
            try {
                io.sentry.util.h.a(file);
                if (v7Var.isEnableAppStartProfiling() || v7Var.isStartProfilerOnAppStart()) {
                    if (!v7Var.isStartProfilerOnAppStart() && !v7Var.isTracingEnabled()) {
                        v7Var.getLogger().c(g7.INFO, "Tracing is disabled and app start profiling will not start.", new Object[0]);
                        return;
                    }
                    if (file.createNewFile()) {
                        l5 l5Var = new l5(v7Var, v7Var.isEnableAppStartProfiling() ? K(v7Var) : new d9(Boolean.FALSE));
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, f83664e));
                            try {
                                v7Var.getSerializer().a(l5Var, bufferedWriter);
                                bufferedWriter.close();
                                fileOutputStream.close();
                            } finally {
                            }
                        } finally {
                        }
                    }
                }
            } catch (Throwable th2) {
                v7Var.getLogger().a(g7.ERROR, "Unable to create app start profiling config file. ", th2);
            }
        }
    }

    public static /* synthetic */ void d(v7 v7Var) {
        for (t0 t0Var : v7Var.getOptionsObservers()) {
            t0Var.g(v7Var.getRelease());
            t0Var.d(v7Var.getProguardUuid());
            t0Var.e(v7Var.getSdkVersion());
            t0Var.b(v7Var.getDist());
            t0Var.c(v7Var.getEnvironment());
            t0Var.a(v7Var.getTags());
            t0Var.f(v7Var.getSessionReplay().g());
        }
        io.sentry.cache.q qVarFindPersistingScopeObserver = v7Var.findPersistingScopeObserver();
        if (qVarFindPersistingScopeObserver != null) {
            qVarFindPersistingScopeObserver.s();
        }
    }

    public static /* synthetic */ void f(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.lastModified() < f83665f - TimeUnit.MINUTES.toMillis(5L)) {
                io.sentry.util.h.a(file2);
            }
        }
    }

    public static void h(e eVar) {
        t().e(eVar);
    }

    public static void i(e eVar, i0 i0Var) {
        t().a(eVar, i0Var);
    }

    private static void j(a aVar, v7 v7Var) {
        try {
            aVar.a(v7Var);
        } catch (Throwable th2) {
            v7Var.getLogger().a(g7.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", th2);
        }
    }

    public static io.sentry.protocol.x k(w6 w6Var, i0 i0Var) {
        return t().I(w6Var, i0Var);
    }

    public static io.sentry.protocol.x l(Throwable th2) {
        return t().B(th2);
    }

    public static io.sentry.protocol.x m(Throwable th2, i0 i0Var) {
        return t().J(th2, i0Var);
    }

    public static void n() {
        g1 g1VarD = f83666g.d();
        try {
            b1 b1VarT = t();
            f83661b = w2.h();
            v().close();
            b1VarT.b(false);
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

    public static void o(l4 l4Var, j4 j4Var) {
        t().F(l4Var, j4Var);
    }

    public static void p() {
        t().f();
    }

    private static void q(v7 v7Var, b1 b1Var) {
        try {
            v7Var.getExecutorService().submit(new t3(v7Var, b1Var));
        } catch (Throwable th2) {
            v7Var.getLogger().a(g7.DEBUG, "Failed to finalize previous session.", th2);
        }
    }

    public static void r(long j10) {
        t().j(j10);
    }

    public static b1 s(String str) {
        return t().K(str);
    }

    public static b1 t() {
        if (f83663d) {
            return f83661b;
        }
        b1 b1Var = v().get();
        if (b1Var != null && !b1Var.E()) {
            return b1Var;
        }
        b1 b1VarK = f83661b.K("getCurrentScopes");
        v().a(b1VarK);
        return b1VarK;
    }

    public static y0 u() {
        return f83662c;
    }

    private static c1 v() {
        return f83660a;
    }

    private static void w(final v7 v7Var, f1 f1Var) {
        try {
            f1Var.submit(new Runnable() { // from class: io.sentry.e5
                @Override // java.lang.Runnable
                public final void run() {
                    k5.a(v7Var);
                }
            });
        } catch (Throwable th2) {
            v7Var.getLogger().a(g7.ERROR, "Failed to call the executor. App start profiling config will not be changed. Did you call Sentry.close()?", th2);
        }
    }

    public static void x(o3 o3Var, a aVar, boolean z10) {
        v7 v7Var = (v7) o3Var.b();
        j(aVar, v7Var);
        y(v7Var, z10);
    }

    private static void y(final v7 v7Var, boolean z10) {
        g1 g1VarD = f83666g.d();
        try {
            if (!v7Var.getClass().getName().equals("io.sentry.android.core.SentryAndroidOptions") && io.sentry.util.y.a()) {
                throw new IllegalArgumentException("You are running Android. Please, use SentryAndroid.init. " + v7Var.getClass().getName());
            }
            if (!J(v7Var)) {
                if (g1VarD != null) {
                    g1VarD.close();
                    return;
                }
                return;
            }
            Boolean boolIsGlobalHubMode = v7Var.isGlobalHubMode();
            if (boolIsGlobalHubMode != null) {
                z10 = boolIsGlobalHubMode.booleanValue();
            }
            v7Var.getLogger().c(g7.INFO, "GlobalHubMode: '%s'", String.valueOf(z10));
            f83663d = z10;
            A(v7Var);
            y0 y0Var = f83662c;
            if (io.sentry.util.n.d(y0Var.getOptions(), v7Var, F())) {
                if (F()) {
                    v7Var.getLogger().c(g7.WARNING, "Sentry has been already initialized. Previous configuration will be overwritten.", new Object[0]);
                }
                t().b(true);
                y0Var.v(v7Var);
                f83661b = new s4(new h4(v7Var), new h4(v7Var), y0Var, "Sentry.init");
                D(v7Var);
                B(v7Var);
                v().a(f83661b);
                z(v7Var);
                y0Var.o(new q5(v7Var));
                if (v7Var.getExecutorService().isClosed()) {
                    v7Var.setExecutorService(new a7(v7Var));
                    v7Var.getExecutorService().a();
                }
                try {
                    v7Var.getExecutorService().submit(new Runnable() { // from class: io.sentry.d5
                        @Override // java.lang.Runnable
                        public final void run() {
                            v7Var.loadLazyFields();
                        }
                    });
                } catch (RejectedExecutionException e10) {
                    v7Var.getLogger().a(g7.DEBUG, "Failed to call the executor. Lazy fields will not be loaded. Did you call Sentry.close()?", e10);
                }
                H(v7Var);
                for (r1 r1Var : v7Var.getIntegrations()) {
                    try {
                        r1Var.c(t4.g(), v7Var);
                    } catch (Throwable th2) {
                        v7Var.getLogger().a(g7.WARNING, "Failed to register the integration " + r1Var.getClass().getName(), th2);
                    }
                }
                I(v7Var);
                q(v7Var, t4.g());
                w(v7Var, v7Var.getExecutorService());
                ILogger logger = v7Var.getLogger();
                g7 g7Var = g7.DEBUG;
                logger.c(g7Var, "Using openTelemetryMode %s", v7Var.getOpenTelemetryMode());
                v7Var.getLogger().c(g7Var, "Using span factory %s", v7Var.getSpanFactory().getClass().getName());
                v7Var.getLogger().c(g7Var, "Using scopes storage %s", f83660a.getClass().getName());
            } else {
                v7Var.getLogger().c(g7.WARNING, "This init call has been ignored due to priority being too low.", new Object[0]);
            }
            if (g1VarD != null) {
                g1VarD.close();
            }
        } catch (Throwable th3) {
            if (g1VarD != null) {
                try {
                    g1VarD.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    private static void z(v7 v7Var) {
        ILogger logger = v7Var.getLogger();
        g7 g7Var = g7.INFO;
        logger.c(g7Var, "Initializing SDK with DSN: '%s'", v7Var.getDsn());
        String outboxPath = v7Var.getOutboxPath();
        if (outboxPath != null) {
            final File file = new File(outboxPath);
            v7Var.getRuntimeManager().a(new a.InterfaceC1016a() { // from class: io.sentry.f5
                @Override // io.sentry.util.runtime.a.InterfaceC1016a
                public final Object run() {
                    return Boolean.valueOf(file.mkdirs());
                }
            });
        } else {
            logger.c(g7Var, "No outbox dir path is defined in options.", new Object[0]);
        }
        String cacheDirPath = v7Var.getCacheDirPath();
        if (cacheDirPath != null) {
            final File file2 = new File(cacheDirPath);
            v7Var.getRuntimeManager().a(new a.InterfaceC1016a() { // from class: io.sentry.g5
                @Override // io.sentry.util.runtime.a.InterfaceC1016a
                public final Object run() {
                    return Boolean.valueOf(file2.mkdirs());
                }
            });
            if (v7Var.getEnvelopeDiskCache() instanceof io.sentry.transport.t) {
                v7Var.setEnvelopeDiskCache(io.sentry.cache.f.t(v7Var));
            }
        }
        String profilingTracesDirPath = v7Var.getProfilingTracesDirPath();
        if ((v7Var.isProfilingEnabled() || v7Var.isContinuousProfilingEnabled()) && profilingTracesDirPath != null) {
            final File file3 = new File(profilingTracesDirPath);
            v7Var.getRuntimeManager().a(new a.InterfaceC1016a() { // from class: io.sentry.h5
                @Override // io.sentry.util.runtime.a.InterfaceC1016a
                public final Object run() {
                    return Boolean.valueOf(file3.mkdirs());
                }
            });
            try {
                v7Var.getExecutorService().submit(new Runnable() { // from class: io.sentry.i5
                    @Override // java.lang.Runnable
                    public final void run() {
                        k5.f(file3);
                    }
                });
            } catch (RejectedExecutionException e10) {
                v7Var.getLogger().a(g7.ERROR, "Failed to call the executor. Old profiles will not be deleted. Did you call Sentry.close()?", e10);
            }
        }
        io.sentry.internal.modules.b modulesLoader = v7Var.getModulesLoader();
        if (!v7Var.isSendModules()) {
            v7Var.setModulesLoader(io.sentry.internal.modules.e.b());
        } else if (modulesLoader instanceof io.sentry.internal.modules.e) {
            v7Var.setModulesLoader(new io.sentry.internal.modules.a(Arrays.asList(new io.sentry.internal.modules.c(v7Var.getLogger()), new io.sentry.internal.modules.f(v7Var.getLogger())), v7Var.getLogger()));
        }
        if (v7Var.getDebugMetaLoader() instanceof io.sentry.internal.debugmeta.b) {
            v7Var.setDebugMetaLoader(new io.sentry.internal.debugmeta.c(v7Var.getLogger()));
        }
        io.sentry.util.d.a(v7Var, v7Var.getDebugMetaLoader().a());
        if (v7Var.getThreadChecker() instanceof io.sentry.util.thread.b) {
            v7Var.setThreadChecker(io.sentry.util.thread.c.d());
        }
        if (v7Var.getPerformanceCollectors().isEmpty()) {
            v7Var.addPerformanceCollector(new s1());
        }
        if (v7Var.isEnableBackpressureHandling() && io.sentry.util.y.c()) {
            if (v7Var.getBackpressureMonitor() instanceof io.sentry.backpressure.c) {
                v7Var.setBackpressureMonitor(new io.sentry.backpressure.a(v7Var, t4.g()));
            }
            v7Var.getBackpressureMonitor().start();
        }
        C(v7Var);
        v7Var.getLogger().c(g7.INFO, "Continuous profiler is enabled %s mode: %s", Boolean.valueOf(v7Var.isContinuousProfilingEnabled()), v7Var.getProfileLifecycle());
    }
}
