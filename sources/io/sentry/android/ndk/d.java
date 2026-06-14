package io.sentry.android.ndk;

import io.sentry.g7;
import io.sentry.k4;
import io.sentry.l;
import io.sentry.ndk.NativeScope;
import io.sentry.p8;
import io.sentry.util.w;
import io.sentry.v7;
import io.sentry.y0;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends k4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v7 f82825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.ndk.a f82826b;

    public d(v7 v7Var) {
        this(v7Var, new NativeScope());
    }

    public static /* synthetic */ void a(d dVar, io.sentry.e eVar) {
        dVar.getClass();
        String strF = null;
        String lowerCase = eVar.n() != null ? eVar.n().name().toLowerCase(Locale.ROOT) : null;
        String strH = l.h(eVar.p());
        try {
            Map mapM = eVar.m();
            if (!mapM.isEmpty()) {
                strF = dVar.f82825a.getSerializer().f(mapM);
            }
        } catch (Throwable th2) {
            dVar.f82825a.getLogger().b(g7.ERROR, th2, "Breadcrumb data is not serializable.", new Object[0]);
        }
        dVar.f82826b.b(lowerCase, eVar.o(), eVar.k(), eVar.q(), strH, strF);
    }

    @Override // io.sentry.z0
    public void e(final io.sentry.e eVar) {
        try {
            this.f82825a.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.ndk.b
                @Override // java.lang.Runnable
                public final void run() {
                    d.a(this.f82821b, eVar);
                }
            });
        } catch (Throwable th2) {
            this.f82825a.getLogger().b(g7.ERROR, th2, "Scope sync addBreadcrumb has an error.", new Object[0]);
        }
    }

    @Override // io.sentry.z0
    public void i(final p8 p8Var, y0 y0Var) {
        if (p8Var == null) {
            return;
        }
        try {
            this.f82825a.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.ndk.c
                @Override // java.lang.Runnable
                public final void run() {
                    d dVar = this.f82823b;
                    p8 p8Var2 = p8Var;
                    dVar.f82826b.a(p8Var2.p().toString(), p8Var2.m().toString());
                }
            });
        } catch (Throwable th2) {
            this.f82825a.getLogger().b(g7.ERROR, th2, "Scope sync setTrace failed.", new Object[0]);
        }
    }

    d(v7 v7Var, io.sentry.ndk.a aVar) {
        this.f82825a = (v7) w.c(v7Var, "The SentryOptions object is required.");
        this.f82826b = (io.sentry.ndk.a) w.c(aVar, "The NativeScope object is required.");
    }
}
