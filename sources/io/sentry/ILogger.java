package io.sentry;

/* JADX INFO: loaded from: classes3.dex */
public interface ILogger {
    void a(g7 g7Var, String str, Throwable th2);

    void b(g7 g7Var, Throwable th2, String str, Object... objArr);

    void c(g7 g7Var, String str, Object... objArr);

    boolean d(g7 g7Var);
}
