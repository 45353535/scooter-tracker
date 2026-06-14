package io.sentry.android.core;

import android.content.Context;
import android.os.Build;
import com.adjust.sdk.Constants;
import io.sentry.ILogger;
import io.sentry.android.core.i0;
import io.sentry.g7;
import io.sentry.t4;
import io.sentry.v7;
import io.sentry.y3;
import io.sentry.z3;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
final class l0 implements io.sentry.m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f82631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ILogger f82632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f82633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f82634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f82635e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final io.sentry.f1 f82636f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final w0 f82637g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f82638h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f82639i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final io.sentry.android.core.internal.util.f0 f82640j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile z3 f82641k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private volatile i0 f82642l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f82643m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f82644n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Date f82645o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final io.sentry.util.a f82646p;

    public l0(Context context, SentryAndroidOptions sentryAndroidOptions, w0 w0Var, io.sentry.android.core.internal.util.f0 f0Var) {
        this(context, w0Var, f0Var, sentryAndroidOptions.getLogger(), sentryAndroidOptions.getProfilingTracesDirPath(), sentryAndroidOptions.isProfilingEnabled(), sentryAndroidOptions.getProfilingTracesHz(), sentryAndroidOptions.getExecutorService());
    }

    private void d() {
        if (this.f82638h) {
            return;
        }
        this.f82638h = true;
        if (!this.f82634d) {
            this.f82632b.c(g7.INFO, "Profiling is disabled in options.", new Object[0]);
            return;
        }
        String str = this.f82633c;
        if (str == null) {
            this.f82632b.c(g7.WARNING, "Disabling profiling because no profiling traces dir path is defined in options.", new Object[0]);
            return;
        }
        int i10 = this.f82635e;
        if (i10 <= 0) {
            this.f82632b.c(g7.WARNING, "Disabling profiling because trace rate is set to %d", Integer.valueOf(i10));
        } else {
            this.f82642l = new i0(str, ((int) TimeUnit.SECONDS.toMicros(1L)) / this.f82635e, this.f82640j, this.f82636f, this.f82632b);
        }
    }

    private boolean e() {
        i0.c cVarJ;
        if (this.f82642l == null || (cVarJ = this.f82642l.j()) == null) {
            return false;
        }
        this.f82643m = cVarJ.f82460a;
        this.f82644n = cVarJ.f82461b;
        this.f82645o = cVarJ.f82462c;
        return true;
    }

    private y3 f(String str, String str2, String str3, boolean z10, List list, v7 v7Var) {
        if (this.f82637g.d() < 22 || this.f82642l == null) {
            return null;
        }
        io.sentry.g1 g1VarD = this.f82646p.d();
        try {
            z3 z3Var = this.f82641k;
            if (z3Var == null || !z3Var.h().equals(str2)) {
                this.f82632b.c(g7.INFO, "Transaction %s (%s) finished, but was not currently being profiled. Skipping", str, str3);
                if (g1VarD != null) {
                    g1VarD.close();
                }
                return null;
            }
            this.f82641k = null;
            if (g1VarD != null) {
                g1VarD.close();
            }
            this.f82632b.c(g7.DEBUG, "Transaction %s (%s) finished.", str, str3);
            i0.b bVarG = this.f82642l.g(false, list);
            this.f82639i.set(false);
            if (bVarG == null) {
                return null;
            }
            long j10 = bVarG.f82455a - this.f82643m;
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(z3Var);
            z3Var.k(Long.valueOf(bVarG.f82455a), Long.valueOf(this.f82643m), Long.valueOf(bVarG.f82456b), Long.valueOf(this.f82644n));
            Long lS = v7Var instanceof SentryAndroidOptions ? l1.k(this.f82631a, (SentryAndroidOptions) v7Var).s() : null;
            String string = lS != null ? Long.toString(lS.longValue()) : "0";
            String[] strArr = Build.SUPPORTED_ABIS;
            return new y3(bVarG.f82457c, this.f82645o, arrayList, str, str2, str3, Long.toString(j10), this.f82637g.d(), (strArr == null || strArr.length <= 0) ? "" : strArr[0], new Callable() { // from class: io.sentry.android.core.k0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return io.sentry.android.core.internal.util.n.a().c();
                }
            }, this.f82637g.b(), this.f82637g.c(), this.f82637g.e(), this.f82637g.f(), string, v7Var.getProguardUuid(), v7Var.getRelease(), v7Var.getEnvironment(), (bVarG.f82459e || z10) ? "timeout" : Constants.NORMAL, bVarG.f82458d);
        } finally {
        }
    }

    @Override // io.sentry.m1
    public void a(io.sentry.l1 l1Var) {
        if (this.f82639i.get() && this.f82641k == null) {
            io.sentry.g1 g1VarD = this.f82646p.d();
            try {
                if (this.f82639i.get() && this.f82641k == null) {
                    this.f82641k = new z3(l1Var, Long.valueOf(this.f82643m), Long.valueOf(this.f82644n));
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
    }

    @Override // io.sentry.m1
    public y3 b(io.sentry.l1 l1Var, List list, v7 v7Var) {
        return f(l1Var.getName(), l1Var.getEventId().toString(), l1Var.e().p().toString(), false, list, v7Var);
    }

    @Override // io.sentry.m1
    public void close() {
        l0 l0Var;
        z3 z3Var = this.f82641k;
        if (z3Var != null) {
            l0Var = this;
            l0Var.f(z3Var.i(), z3Var.h(), z3Var.j(), true, null, t4.g().getOptions());
        } else {
            l0Var = this;
        }
        l0Var.f82639i.set(false);
        if (l0Var.f82642l != null) {
            l0Var.f82642l.f();
        }
    }

    @Override // io.sentry.m1
    public boolean isRunning() {
        return this.f82639i.get();
    }

    @Override // io.sentry.m1
    public void start() {
        if (this.f82637g.d() >= 22 && !this.f82639i.getAndSet(true)) {
            d();
            if (e()) {
                this.f82632b.c(g7.DEBUG, "Profiler started.", new Object[0]);
                return;
            }
            if (this.f82642l != null && this.f82642l.h()) {
                this.f82632b.c(g7.WARNING, "A profile is already running. This profile will be ignored.", new Object[0]);
                return;
            }
            io.sentry.g1 g1VarD = this.f82646p.d();
            try {
                this.f82641k = null;
                if (g1VarD != null) {
                    g1VarD.close();
                }
                this.f82639i.set(false);
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
    }

    public l0(Context context, w0 w0Var, io.sentry.android.core.internal.util.f0 f0Var, ILogger iLogger, String str, boolean z10, int i10, io.sentry.f1 f1Var) {
        this.f82638h = false;
        this.f82639i = new AtomicBoolean(false);
        this.f82642l = null;
        this.f82646p = new io.sentry.util.a();
        this.f82631a = (Context) io.sentry.util.w.c(c1.f(context), "The application context is required");
        this.f82632b = (ILogger) io.sentry.util.w.c(iLogger, "ILogger is required");
        this.f82640j = (io.sentry.android.core.internal.util.f0) io.sentry.util.w.c(f0Var, "SentryFrameMetricsCollector is required");
        this.f82637g = (w0) io.sentry.util.w.c(w0Var, "The BuildInfoProvider is required.");
        this.f82633c = str;
        this.f82634d = z10;
        this.f82635e = i10;
        this.f82636f = (io.sentry.f1) io.sentry.util.w.c(f1Var, "The ISentryExecutorService is required.");
        this.f82645o = io.sentry.l.d();
    }
}
