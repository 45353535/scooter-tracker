package io.sentry.android.core;

import android.app.Application;
import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import io.sentry.ILogger;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import io.sentry.g7;
import io.sentry.j4;
import io.sentry.k5;
import io.sentry.k8;
import io.sentry.o3;
import io.sentry.v7;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f82404a = SystemClock.uptimeMillis();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final io.sentry.util.a f82405b = new io.sentry.util.a();

    public static /* synthetic */ void a(AtomicBoolean atomicBoolean, io.sentry.y0 y0Var) {
        k8 session = y0Var.getSession();
        if (session == null || session.k() == null) {
            return;
        }
        atomicBoolean.set(true);
    }

    public static /* synthetic */ void b(ILogger iLogger, Context context, k5.a aVar, SentryAndroidOptions sentryAndroidOptions) {
        boolean z10;
        io.sentry.util.t tVar = new io.sentry.util.t();
        boolean zD = tVar.d("timber.log.Timber", sentryAndroidOptions);
        boolean z11 = true;
        if (tVar.d("androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks", sentryAndroidOptions) && tVar.d("io.sentry.android.fragment.FragmentLifecycleIntegration", sentryAndroidOptions)) {
            z10 = true;
        } else {
            z10 = true;
            z11 = false;
        }
        boolean z12 = (zD && tVar.d("io.sentry.android.timber.SentryTimberIntegration", sentryAndroidOptions)) ? z10 : false;
        boolean zD2 = tVar.d("io.sentry.android.replay.ReplayIntegration", sentryAndroidOptions);
        boolean zD3 = tVar.d("io.sentry.android.distribution.DistributionIntegration", sentryAndroidOptions);
        w0 w0Var = new w0(iLogger);
        io.sentry.util.t tVar2 = new io.sentry.util.t();
        i iVar = new i(tVar2, sentryAndroidOptions);
        g0.j(sentryAndroidOptions, context, iLogger, w0Var);
        g0.i(context, sentryAndroidOptions, w0Var, tVar2, iVar, z11, z12, zD2, zD3);
        boolean z13 = z12;
        boolean z14 = z11;
        try {
            aVar.a(sentryAndroidOptions);
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().a(g7.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", th2);
        }
        io.sentry.android.core.performance.h hVarP = io.sentry.android.core.performance.h.p();
        if (sentryAndroidOptions.isEnablePerformanceV2() && w0Var.d() >= 24) {
            io.sentry.android.core.performance.i iVarK = hVarP.k();
            if (iVarK.k()) {
                iVarK.p(Process.getStartUptimeMillis());
            }
        }
        if (context.getApplicationContext() instanceof Application) {
            hVarP.t((Application) context.getApplicationContext());
        }
        io.sentry.android.core.performance.i iVarQ = hVarP.q();
        if (iVarQ.k()) {
            iVarQ.p(f82404a);
        }
        g0.h(sentryAndroidOptions, context, w0Var, tVar2, iVar, zD2);
        c(sentryAndroidOptions, z14, z13);
    }

    private static void c(v7 v7Var, boolean z10, boolean z11) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (io.sentry.r1 r1Var : v7Var.getIntegrations()) {
            if (z10 && (r1Var instanceof FragmentLifecycleIntegration)) {
                arrayList2.add(r1Var);
            }
            if (z11 && (r1Var instanceof SentryTimberIntegration)) {
                arrayList.add(r1Var);
            }
            if (r1Var instanceof SystemEventsBreadcrumbsIntegration) {
                arrayList3.add(r1Var);
            }
        }
        if (arrayList2.size() > 1) {
            for (int i10 = 0; i10 < arrayList2.size() - 1; i10++) {
                v7Var.getIntegrations().remove((io.sentry.r1) arrayList2.get(i10));
            }
        }
        if (arrayList.size() > 1) {
            for (int i11 = 0; i11 < arrayList.size() - 1; i11++) {
                v7Var.getIntegrations().remove((io.sentry.r1) arrayList.get(i11));
            }
        }
        if (arrayList3.size() > 1) {
            for (int i12 = 0; i12 < arrayList3.size() - 1; i12++) {
                v7Var.getIntegrations().remove((io.sentry.r1) arrayList3.get(i12));
            }
        }
    }

    public static void d(final Context context, final ILogger iLogger, final k5.a aVar) {
        try {
            io.sentry.g1 g1VarD = f82405b.d();
            try {
                k5.x(o3.a(SentryAndroidOptions.class), new k5.a() { // from class: io.sentry.android.core.c2
                    @Override // io.sentry.k5.a
                    public final void a(v7 v7Var) {
                        e2.b(iLogger, context, aVar, (SentryAndroidOptions) v7Var);
                    }
                }, true);
                io.sentry.b1 b1VarT = k5.t();
                if (c1.r()) {
                    if (b1VarT.getOptions().isEnableAutoSessionTracking()) {
                        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                        b1VarT.x(new j4() { // from class: io.sentry.android.core.d2
                            @Override // io.sentry.j4
                            public final void a(io.sentry.y0 y0Var) {
                                e2.a(atomicBoolean, y0Var);
                            }
                        });
                        if (!atomicBoolean.get()) {
                            b1VarT.d();
                        }
                    }
                    b1VarT.getOptions().getReplayController().start();
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
        } catch (IllegalAccessException e10) {
            iLogger.a(g7.FATAL, "Fatal error during SentryAndroid.init(...)", e10);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e10);
        } catch (InstantiationException e11) {
            iLogger.a(g7.FATAL, "Fatal error during SentryAndroid.init(...)", e11);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e11);
        } catch (NoSuchMethodException e12) {
            iLogger.a(g7.FATAL, "Fatal error during SentryAndroid.init(...)", e12);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e12);
        } catch (InvocationTargetException e13) {
            iLogger.a(g7.FATAL, "Fatal error during SentryAndroid.init(...)", e13);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e13);
        }
    }

    public static void e(Context context, k5.a aVar) {
        d(context, new z(), aVar);
    }
}
