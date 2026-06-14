package io.sentry;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements ILogger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v7 f84084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ILogger f84085b;

    public r(v7 v7Var, ILogger iLogger) {
        this.f84084a = (v7) io.sentry.util.w.c(v7Var, "SentryOptions is required.");
        this.f84085b = iLogger;
    }

    @Override // io.sentry.ILogger
    public void a(g7 g7Var, String str, Throwable th2) {
        if (this.f84085b == null || !d(g7Var)) {
            return;
        }
        this.f84085b.a(g7Var, str, th2);
    }

    @Override // io.sentry.ILogger
    public void b(g7 g7Var, Throwable th2, String str, Object... objArr) {
        if (this.f84085b == null || !d(g7Var)) {
            return;
        }
        this.f84085b.b(g7Var, th2, str, objArr);
    }

    @Override // io.sentry.ILogger
    public void c(g7 g7Var, String str, Object... objArr) {
        if (this.f84085b == null || !d(g7Var)) {
            return;
        }
        this.f84085b.c(g7Var, str, objArr);
    }

    @Override // io.sentry.ILogger
    public boolean d(g7 g7Var) {
        return g7Var != null && this.f84084a.isDebug() && g7Var.ordinal() >= this.f84084a.getDiagnosticLevel().ordinal();
    }
}
