package io.sentry;

import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes3.dex */
public final class a9 implements ILogger {
    private String e(Throwable th2) {
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @Override // io.sentry.ILogger
    public void a(g7 g7Var, String str, Throwable th2) {
        if (th2 == null) {
            c(g7Var, str, new Object[0]);
        } else {
            System.out.println(String.format("%s: %s\n%s", g7Var, String.format(str, th2.toString()), e(th2)));
        }
    }

    @Override // io.sentry.ILogger
    public void b(g7 g7Var, Throwable th2, String str, Object... objArr) {
        if (th2 == null) {
            c(g7Var, str, objArr);
        } else {
            System.out.println(String.format("%s: %s \n %s\n%s", g7Var, String.format(str, objArr), th2.toString(), e(th2)));
        }
    }

    @Override // io.sentry.ILogger
    public void c(g7 g7Var, String str, Object... objArr) {
        System.out.println(String.format("%s: %s", g7Var, String.format(str, objArr)));
    }

    @Override // io.sentry.ILogger
    public boolean d(g7 g7Var) {
        return true;
    }
}
