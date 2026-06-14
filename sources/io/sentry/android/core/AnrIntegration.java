package io.sentry.android.core;

import android.content.Context;
import io.sentry.ILogger;
import io.sentry.android.core.c;
import io.sentry.g7;
import io.sentry.v7;
import io.sentry.w6;
import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public final class AnrIntegration implements io.sentry.r1, Closeable, AutoCloseable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static c f82260f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected static final io.sentry.util.a f82261g = new io.sentry.util.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f82262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f82263c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io.sentry.util.a f82264d = new io.sentry.util.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private v7 f82265e;

    static final class a implements io.sentry.hints.a, io.sentry.hints.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f82266a;

        a(boolean z10) {
            this.f82266a = z10;
        }

        @Override // io.sentry.hints.a
        public Long b() {
            return null;
        }

        @Override // io.sentry.hints.a
        public boolean c() {
            return true;
        }

        @Override // io.sentry.hints.a
        public String d() {
            return this.f82266a ? "anr_background" : "anr_foreground";
        }
    }

    public AnrIntegration(Context context) {
        this.f82262b = c1.f(context);
    }

    public static /* synthetic */ void d(AnrIntegration anrIntegration, io.sentry.b1 b1Var, SentryAndroidOptions sentryAndroidOptions) {
        io.sentry.g1 g1VarD = anrIntegration.f82264d.d();
        try {
            if (!anrIntegration.f82263c) {
                anrIntegration.n(b1Var, sentryAndroidOptions);
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

    private Throwable f(boolean z10, SentryAndroidOptions sentryAndroidOptions, ApplicationNotResponding applicationNotResponding) {
        String str = "ANR for at least " + sentryAndroidOptions.getAnrTimeoutIntervalMillis() + " ms.";
        if (z10) {
            str = "Background " + str;
        }
        ApplicationNotResponding applicationNotResponding2 = new ApplicationNotResponding(str, applicationNotResponding.d());
        io.sentry.protocol.l lVar = new io.sentry.protocol.l();
        lVar.q("ANR");
        return new io.sentry.exception.a(lVar, applicationNotResponding2, applicationNotResponding2.d(), true);
    }

    private void h(final io.sentry.b1 b1Var, final SentryAndroidOptions sentryAndroidOptions) {
        sentryAndroidOptions.getLogger().c(g7.DEBUG, "AnrIntegration enabled: %s", Boolean.valueOf(sentryAndroidOptions.isAnrEnabled()));
        if (sentryAndroidOptions.isAnrEnabled()) {
            io.sentry.util.o.a("Anr");
            try {
                sentryAndroidOptions.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.n0
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnrIntegration.d(this.f82679b, b1Var, sentryAndroidOptions);
                    }
                });
            } catch (Throwable th2) {
                sentryAndroidOptions.getLogger().a(g7.DEBUG, "Failed to start AnrIntegration on executor thread.", th2);
            }
        }
    }

    private void n(final io.sentry.b1 b1Var, final SentryAndroidOptions sentryAndroidOptions) {
        io.sentry.g1 g1VarD = f82261g.d();
        try {
            if (f82260f == null) {
                ILogger logger = sentryAndroidOptions.getLogger();
                g7 g7Var = g7.DEBUG;
                logger.c(g7Var, "ANR timeout in milliseconds: %d", Long.valueOf(sentryAndroidOptions.getAnrTimeoutIntervalMillis()));
                c cVar = new c(sentryAndroidOptions.getAnrTimeoutIntervalMillis(), sentryAndroidOptions.isAnrReportInDebug(), new c.a() { // from class: io.sentry.android.core.o0
                    @Override // io.sentry.android.core.c.a
                    public final void a(ApplicationNotResponding applicationNotResponding) {
                        this.f82688a.m(b1Var, sentryAndroidOptions, applicationNotResponding);
                    }
                }, sentryAndroidOptions.getLogger(), this.f82262b);
                f82260f = cVar;
                cVar.start();
                sentryAndroidOptions.getLogger().c(g7Var, "AnrIntegration installed.", new Object[0]);
            }
            if (g1VarD != null) {
                g1VarD.close();
            }
        } catch (Throwable th2) {
            if (g1VarD == null) {
                throw th2;
            }
            try {
                g1VarD.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    @Override // io.sentry.r1
    public final void c(io.sentry.b1 b1Var, v7 v7Var) {
        this.f82265e = (v7) io.sentry.util.w.c(v7Var, "SentryOptions is required");
        h(b1Var, (SentryAndroidOptions) v7Var);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        io.sentry.g1 g1VarD = this.f82264d.d();
        try {
            this.f82263c = true;
            if (g1VarD != null) {
                g1VarD.close();
            }
            g1VarD = f82261g.d();
            try {
                c cVar = f82260f;
                if (cVar != null) {
                    cVar.interrupt();
                    f82260f = null;
                    v7 v7Var = this.f82265e;
                    if (v7Var != null) {
                        v7Var.getLogger().c(g7.DEBUG, "AnrIntegration removed.", new Object[0]);
                    }
                }
                if (g1VarD != null) {
                    g1VarD.close();
                }
            } finally {
            }
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(io.sentry.b1 b1Var, SentryAndroidOptions sentryAndroidOptions, ApplicationNotResponding applicationNotResponding) {
        sentryAndroidOptions.getLogger().c(g7.INFO, "ANR triggered with message: %s", applicationNotResponding.getMessage());
        boolean zEquals = Boolean.TRUE.equals(AppState.n().o());
        w6 w6Var = new w6(f(zEquals, sentryAndroidOptions, applicationNotResponding));
        w6Var.E0(g7.ERROR);
        b1Var.I(w6Var, io.sentry.util.m.e(new a(zEquals)));
    }
}
