package io.sentry;

/* JADX INFO: loaded from: classes3.dex */
public final class c5 implements a5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x4 f83306a;

    public c5(x4 x4Var) {
        this.f83306a = (x4) io.sentry.util.w.c(x4Var, "SendFireAndForgetDirPath is required");
    }

    @Override // io.sentry.a5
    public /* synthetic */ boolean a(String str, ILogger iLogger) {
        return z4.a(this, str, iLogger);
    }

    @Override // io.sentry.a5
    public w4 b(b1 b1Var, v7 v7Var) {
        io.sentry.util.w.c(b1Var, "Scopes are required");
        io.sentry.util.w.c(v7Var, "SentryOptions is required");
        String strA = this.f83306a.a();
        if (strA != null && a(strA, v7Var.getLogger())) {
            return c(new r3(b1Var, v7Var.getEnvelopeReader(), v7Var.getSerializer(), v7Var.getLogger(), v7Var.getFlushTimeoutMillis(), v7Var.getMaxQueueSize()), strA, v7Var.getLogger());
        }
        v7Var.getLogger().c(g7.ERROR, "No outbox dir path is defined in options.", new Object[0]);
        return null;
    }

    public /* synthetic */ w4 c(t tVar, String str, ILogger iLogger) {
        return z4.b(this, tVar, str, iLogger);
    }
}
