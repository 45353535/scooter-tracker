package io.sentry.util;

import io.sentry.ILogger;
import io.sentry.g7;
import io.sentry.util.q;
import io.sentry.v7;

/* JADX INFO: loaded from: classes3.dex */
public class t {
    public boolean c(String str, ILogger iLogger) {
        return g(str, iLogger) != null;
    }

    public boolean d(String str, v7 v7Var) {
        return c(str, v7Var != null ? v7Var.getLogger() : null);
    }

    public q e(final String str, final ILogger iLogger) {
        return new q(new q.a() { // from class: io.sentry.util.s
            @Override // io.sentry.util.q.a
            public final Object a() {
                return Boolean.valueOf(this.f84312a.c(str, iLogger));
            }
        });
    }

    public q f(final String str, final v7 v7Var) {
        return new q(new q.a() { // from class: io.sentry.util.r
            @Override // io.sentry.util.q.a
            public final Object a() {
                return Boolean.valueOf(this.f84309a.d(str, v7Var));
            }
        });
    }

    public Class g(String str, ILogger iLogger) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            if (iLogger == null) {
                return null;
            }
            iLogger.c(g7.INFO, "Class not available: " + str, new Object[0]);
            return null;
        } catch (UnsatisfiedLinkError e10) {
            if (iLogger == null) {
                return null;
            }
            iLogger.a(g7.ERROR, "Failed to load (UnsatisfiedLinkError) " + str, e10);
            return null;
        } catch (Throwable th2) {
            if (iLogger == null) {
                return null;
            }
            iLogger.a(g7.ERROR, "Failed to initialize " + str, th2);
            return null;
        }
    }
}
