package io.sentry;

/* JADX INFO: loaded from: classes3.dex */
public final class p2 implements ILogger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p2 f83795a = new p2();

    private p2() {
    }

    public static p2 e() {
        return f83795a;
    }

    @Override // io.sentry.ILogger
    public void a(g7 g7Var, String str, Throwable th2) {
    }

    @Override // io.sentry.ILogger
    public void b(g7 g7Var, Throwable th2, String str, Object... objArr) {
    }

    @Override // io.sentry.ILogger
    public void c(g7 g7Var, String str, Object... objArr) {
    }

    @Override // io.sentry.ILogger
    public boolean d(g7 g7Var) {
        return false;
    }
}
