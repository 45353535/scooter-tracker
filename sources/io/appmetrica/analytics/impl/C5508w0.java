package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5508w0 implements InterfaceC4961ab {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile C5508w0 f78473e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile boolean f78474f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile boolean f78475g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f78476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5383r0 f78477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FutureTask f78478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ia f78479d;

    @AnyThread
    public C5508w0(@NonNull Context context) {
        this.f78476a = context;
        C5383r0 c5383r0C = C5186j4.l().c();
        this.f78477b = c5383r0C;
        this.f78479d = c5383r0C.a(context, C5186j4.l().g());
        this.f78478c = new FutureTask(new Callable() { // from class: io.appmetrica.analytics.impl.zq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f78668b.p();
            }
        });
    }

    @NonNull
    @AnyThread
    public static C5508w0 a(@NonNull Context context) {
        C5508w0 c5508w0;
        C5508w0 c5508w02 = f78473e;
        if (c5508w02 != null) {
            return c5508w02;
        }
        synchronized (C5508w0.class) {
            try {
                c5508w0 = f78473e;
                if (c5508w0 == null) {
                    c5508w0 = new C5508w0(context);
                    c5508w0.j();
                    C5186j4.l().f77467c.a().execute(new RunnableC5483v0(c5508w0));
                    f78473e = c5508w0;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c5508w0;
    }

    @WorkerThread
    public static void b(boolean z10) {
        c().a(z10, true);
    }

    @WorkerThread
    public static void clearAppEnvironment() {
        c().clearAppEnvironment();
    }

    @AnyThread
    public static synchronized boolean k() {
        return f78474f;
    }

    @AnyThread
    public static boolean l() {
        return f78475g;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001d  */
    @androidx.annotation.AnyThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized boolean m() {
        /*
            java.lang.Class<io.appmetrica.analytics.impl.w0> r0 = io.appmetrica.analytics.impl.C5508w0.class
            monitor-enter(r0)
            io.appmetrica.analytics.impl.w0 r1 = io.appmetrica.analytics.impl.C5508w0.f78473e     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L1d
            java.util.concurrent.FutureTask r2 = r1.f78478c     // Catch: java.lang.Throwable -> L1b
            boolean r2 = r2.isDone()     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L1d
            io.appmetrica.analytics.impl.Ja r1 = r1.f()     // Catch: java.lang.Throwable -> L1b
            io.appmetrica.analytics.impl.qc r1 = r1.i()     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L1d
            r1 = 1
            goto L1e
        L1b:
            r1 = move-exception
            goto L20
        L1d:
            r1 = 0
        L1e:
            monitor-exit(r0)
            return r1
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C5508w0.m():boolean");
    }

    @VisibleForTesting(otherwise = 5)
    public static synchronized void n() {
        f78473e = null;
        f78474f = false;
        f78475g = false;
    }

    @WorkerThread
    public static void putAppEnvironmentValue(String str, String str2) {
        c().putAppEnvironmentValue(str, str2);
    }

    @AnyThread
    public static synchronized void q() {
        f78474f = true;
    }

    @AnyThread
    public static void r() {
        f78475g = true;
    }

    @Nullable
    @AnyThread
    public static C5508w0 s() {
        return f78473e;
    }

    @WorkerThread
    public static void setDataSendingEnabled(boolean z10) {
        c().setDataSendingEnabled(z10);
    }

    @WorkerThread
    public static void setUserProfileID(@Nullable String str) {
        c().setUserProfileID(str);
    }

    @AnyThread
    public final void c(@Nullable AppMetricaConfig appMetricaConfig) {
        this.f78479d.a(appMetricaConfig, this);
    }

    @WorkerThread
    public final void d(@NonNull AppMetricaConfig appMetricaConfig) {
        f().b(appMetricaConfig);
        C5186j4.l().f77467c.a().execute(new RunnableC5484v1(this.f78476a));
    }

    @Nullable
    @AnyThread
    public final String e() {
        return f().e();
    }

    public final Ja f() {
        try {
            return (Ja) this.f78478c.get();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    @Nullable
    @AnyThread
    public final Map<String, String> g() {
        return f().g();
    }

    @NonNull
    @AnyThread
    public final AdvIdentifiersResult h() {
        return f().h();
    }

    @Nullable
    @WorkerThread
    public final C5371qc i() {
        return f().i();
    }

    public final void j() {
        Z3 z32 = C5186j4.l().f77467c;
        Runnable runnable = new Runnable() { // from class: io.appmetrica.analytics.impl.yq
            @Override // java.lang.Runnable
            public final void run() {
                this.f78597b.o();
            }
        };
        z32.f76733a.getClass();
        new InterruptionSafeThread(runnable, "IAA-INIT_CORE" + TokenBuilder.TOKEN_DELIMITER + Gd.f75819a.incrementAndGet()).start();
    }

    public final void o() {
        C5186j4.l().f77482r.a(this.f78476a);
        new C5032d4(this.f78476a).a(this.f78476a);
        C5186j4.l().a(this.f78476a).a();
        this.f78478c.run();
    }

    public final Ja p() {
        Ja ja2;
        C5383r0 c5383r0 = this.f78477b;
        Context context = this.f78476a;
        Ia ia2 = this.f78479d;
        synchronized (c5383r0) {
            try {
                if (c5383r0.f78106d == null) {
                    if (c5383r0.a(context)) {
                        c5383r0.f78106d = new C0();
                    } else {
                        c5383r0.f78106d = new A0(context, ia2);
                    }
                }
                ja2 = c5383r0.f78106d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return ja2;
    }

    @WorkerThread
    public final void b(@NonNull AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        f().a(appMetricaLibraryAdapterConfig);
        C5186j4.l().f77467c.a().execute(new RunnableC5484v1(this.f78476a));
    }

    @NonNull
    @WorkerThread
    public final Ya c(@NonNull ReporterConfig reporterConfig) {
        return f().c(reporterConfig);
    }

    public static Oc c() {
        if (m()) {
            return f78473e.f();
        }
        return C5186j4.l().f77466b;
    }

    @NonNull
    @AnyThread
    public final C5063ea d() {
        return f().d();
    }

    @NonNull
    @AnyThread
    public final C5238l4 b() {
        return this.f78479d.a();
    }

    @WorkerThread
    public static void a(@Nullable Location location) {
        c().a(location);
    }

    @WorkerThread
    public static void a(boolean z10) {
        c().a(z10);
    }

    @WorkerThread
    public static void a(String str, String str2) {
        c().a(str, str2);
    }

    @WorkerThread
    public static void a(@NonNull String str) {
        c().a(str);
    }

    @WorkerThread
    public final void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        f().a(deferredDeeplinkParametersListener);
    }

    @WorkerThread
    public final void a(DeferredDeeplinkListener deferredDeeplinkListener) {
        f().a(deferredDeeplinkListener);
    }

    @WorkerThread
    public final void a(@NonNull ReporterConfig reporterConfig) {
        f().a(reporterConfig);
    }

    @WorkerThread
    public final void a(@NonNull StartupParamsCallback startupParamsCallback, @NonNull List<String> list) {
        f().a(startupParamsCallback, list);
    }

    @VisibleForTesting(otherwise = 5)
    public static synchronized void a(@Nullable C5508w0 c5508w0) {
        f78473e = c5508w0;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4961ab
    @NonNull
    public final Za a() {
        return f().a();
    }
}
