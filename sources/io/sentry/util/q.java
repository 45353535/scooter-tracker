package io.sentry.util;

import io.sentry.g1;

/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f84307b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Object f84306a = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.sentry.util.a f84308c = new io.sentry.util.a();

    public interface a {
        Object a();
    }

    public q(a aVar) {
        this.f84307b = aVar;
    }

    public Object a() {
        if (this.f84306a == null) {
            g1 g1VarD = this.f84308c.d();
            try {
                if (this.f84306a == null) {
                    this.f84306a = this.f84307b.a();
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
        return this.f84306a;
    }

    public void b() {
        g1 g1VarD = this.f84308c.d();
        try {
            this.f84306a = null;
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

    public void c(Object obj) {
        g1 g1VarD = this.f84308c.d();
        try {
            this.f84306a = obj;
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
