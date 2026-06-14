package io.sentry;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes3.dex */
public final class e7 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile e7 f83435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final io.sentry.util.a f83436d = new io.sentry.util.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile Boolean f83437e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final io.sentry.util.a f83438f = new io.sentry.util.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f83439a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f83440b = new CopyOnWriteArraySet();

    private e7() {
    }

    public static e7 d() {
        if (f83435c == null) {
            g1 g1VarD = f83436d.d();
            try {
                if (f83435c == null) {
                    f83435c = new e7();
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
        return f83435c;
    }

    public void a(String str) {
        io.sentry.util.w.c(str, "integration is required.");
        this.f83439a.add(str);
    }

    public void b(String str, String str2) {
        io.sentry.util.w.c(str, "name is required.");
        io.sentry.util.w.c(str2, "version is required.");
        this.f83440b.add(new io.sentry.protocol.y(str, str2));
        g1 g1VarD = f83438f.d();
        try {
            f83437e = null;
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

    public boolean c(ILogger iLogger) {
        Boolean bool = f83437e;
        if (bool != null) {
            return bool.booleanValue();
        }
        g1 g1VarD = f83438f.d();
        try {
            boolean z10 = false;
            for (io.sentry.protocol.y yVar : this.f83440b) {
                if (yVar.a().startsWith("maven:io.sentry:") && !"8.26.0".equalsIgnoreCase(yVar.b())) {
                    iLogger.c(g7.ERROR, "The Sentry SDK has been configured with mixed versions. Expected %s to match core SDK version %s but was %s", yVar.a(), "8.26.0", yVar.b());
                    z10 = true;
                }
            }
            if (z10) {
                g7 g7Var = g7.ERROR;
                iLogger.c(g7Var, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
                iLogger.c(g7Var, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
                iLogger.c(g7Var, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
                iLogger.c(g7Var, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
            }
            f83437e = Boolean.valueOf(z10);
            if (g1VarD != null) {
                g1VarD.close();
            }
            return z10;
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

    public Set e() {
        return this.f83439a;
    }

    public Set f() {
        return this.f83440b;
    }
}
