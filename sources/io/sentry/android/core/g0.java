package io.sentry.android.core;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import io.sentry.ILogger;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.distribution.DistributionIntegration;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import io.sentry.b5;
import io.sentry.c5;
import io.sentry.compose.gestures.ComposeGestureTargetLocator;
import io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter;
import io.sentry.e3;
import io.sentry.g7;
import io.sentry.i3;
import io.sentry.k3;
import io.sentry.l4;
import io.sentry.p7;
import io.sentry.r2;
import io.sentry.util.q;
import io.sentry.util.runtime.a;
import io.sentry.x4;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
abstract class g0 {
    static File f(Context context) {
        return new File(context.getCacheDir(), "sentry");
    }

    private static String g(PackageInfo packageInfo, String str) {
        return packageInfo.packageName + "@" + packageInfo.versionName + "+" + str;
    }

    static void h(SentryAndroidOptions sentryAndroidOptions, Context context, w0 w0Var, io.sentry.util.t tVar, i iVar, boolean z10) {
        if (sentryAndroidOptions.getCacheDirPath() != null && (sentryAndroidOptions.getEnvelopeDiskCache() instanceof io.sentry.transport.t)) {
            sentryAndroidOptions.setEnvelopeDiskCache(new io.sentry.android.core.cache.d(sentryAndroidOptions));
        }
        if (sentryAndroidOptions.getConnectionStatusProvider() instanceof io.sentry.k2) {
            sentryAndroidOptions.setConnectionStatusProvider(new io.sentry.android.core.internal.util.g(context, sentryAndroidOptions, w0Var, io.sentry.android.core.internal.util.h.a()));
        }
        if (sentryAndroidOptions.getCacheDirPath() != null) {
            sentryAndroidOptions.addScopeObserver(new io.sentry.cache.q(sentryAndroidOptions));
            sentryAndroidOptions.addOptionsObserver(new io.sentry.cache.h(sentryAndroidOptions));
        }
        sentryAndroidOptions.addEventProcessor(new io.sentry.m(sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new h1(context, w0Var, sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new y1(sentryAndroidOptions, iVar));
        sentryAndroidOptions.addEventProcessor(new ScreenshotEventProcessor(sentryAndroidOptions, w0Var));
        sentryAndroidOptions.addEventProcessor(new ViewHierarchyEventProcessor(sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new r0(context, sentryAndroidOptions, w0Var));
        if (sentryAndroidOptions.getTransportGate() instanceof io.sentry.transport.v) {
            sentryAndroidOptions.setTransportGate(new m0(sentryAndroidOptions));
        }
        io.sentry.android.core.performance.h hVarP = io.sentry.android.core.performance.h.p();
        if (sentryAndroidOptions.getModulesLoader() instanceof io.sentry.internal.modules.e) {
            sentryAndroidOptions.setModulesLoader(new io.sentry.android.core.internal.modules.b(context, sentryAndroidOptions.getLogger()));
        }
        if (sentryAndroidOptions.getDebugMetaLoader() instanceof io.sentry.internal.debugmeta.b) {
            sentryAndroidOptions.setDebugMetaLoader(new io.sentry.android.core.internal.debugmeta.a(context, sentryAndroidOptions.getLogger()));
        }
        if (sentryAndroidOptions.getVersionDetector() instanceof k3) {
            sentryAndroidOptions.setVersionDetector(new io.sentry.q(sentryAndroidOptions));
        }
        io.sentry.util.q qVarF = tVar.f("androidx.core.view.ScrollingView", sentryAndroidOptions);
        boolean zD = tVar.d("androidx.compose.ui.node.Owner", sentryAndroidOptions);
        if (sentryAndroidOptions.getGestureTargetLocators().isEmpty()) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(new io.sentry.android.core.internal.gestures.a(qVarF));
            if (zD && tVar.d("io.sentry.compose.gestures.ComposeGestureTargetLocator", sentryAndroidOptions)) {
                arrayList.add(new ComposeGestureTargetLocator(sentryAndroidOptions.getLogger()));
            }
            sentryAndroidOptions.setGestureTargetLocators(arrayList);
        }
        if (sentryAndroidOptions.getViewHierarchyExporters().isEmpty() && zD && tVar.d("io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter", sentryAndroidOptions)) {
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(new ComposeViewHierarchyExporter(sentryAndroidOptions.getLogger()));
            sentryAndroidOptions.setViewHierarchyExporters(arrayList2);
        }
        if (sentryAndroidOptions.getThreadChecker() instanceof io.sentry.util.thread.b) {
            sentryAndroidOptions.setThreadChecker(io.sentry.android.core.internal.util.l.e());
        }
        if (sentryAndroidOptions.getSocketTagger() instanceof e3) {
            sentryAndroidOptions.setSocketTagger(j0.c());
        }
        if (sentryAndroidOptions.getPerformanceCollectors().isEmpty()) {
            sentryAndroidOptions.addPerformanceCollector(new a0());
            sentryAndroidOptions.addPerformanceCollector(new w(sentryAndroidOptions.getLogger()));
            if (sentryAndroidOptions.isEnablePerformanceV2()) {
                sentryAndroidOptions.addPerformanceCollector(new i2(sentryAndroidOptions, (io.sentry.android.core.internal.util.f0) io.sentry.util.w.c(sentryAndroidOptions.getFrameMetricsCollector(), "options.getFrameMetricsCollector is required")));
            }
        }
        if (sentryAndroidOptions.getCompositePerformanceCollector() instanceof io.sentry.j2) {
            sentryAndroidOptions.setCompositePerformanceCollector(new io.sentry.n(sentryAndroidOptions));
        }
        if (z10 && (sentryAndroidOptions.getReplayController().getReplayBreadcrumbConverter() instanceof r2)) {
            sentryAndroidOptions.getReplayController().e(new io.sentry.android.replay.a(sentryAndroidOptions));
        }
        io.sentry.g1 g1VarD = io.sentry.android.core.performance.h.f82710r.d();
        try {
            io.sentry.m1 m1VarI = hVarP.i();
            io.sentry.o0 o0VarH = hVarP.h();
            hVarP.v(null);
            hVarP.u(null);
            if (g1VarD != null) {
                g1VarD.close();
            }
            l(sentryAndroidOptions, context, w0Var, m1VarI, o0VarH, sentryAndroidOptions.getCompositePerformanceCollector());
        } finally {
        }
    }

    static void i(Context context, final SentryAndroidOptions sentryAndroidOptions, w0 w0Var, io.sentry.util.t tVar, i iVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        io.sentry.util.q qVar = new io.sentry.util.q(new q.a() { // from class: io.sentry.android.core.c0
            @Override // io.sentry.util.q.a
            public final Object a() {
                return Boolean.valueOf(io.sentry.android.core.cache.d.J(sentryAndroidOptions));
            }
        });
        sentryAndroidOptions.addIntegration(new SendCachedEnvelopeIntegration(new b5(new x4() { // from class: io.sentry.android.core.d0
            @Override // io.sentry.x4
            public final String a() {
                return sentryAndroidOptions.getCacheDirPath();
            }
        }), qVar));
        sentryAndroidOptions.addIntegration(new NdkIntegration(tVar.g("io.sentry.android.ndk.SentryNdk", sentryAndroidOptions.getLogger())));
        sentryAndroidOptions.addIntegration(EnvelopeFileObserverIntegration.m());
        sentryAndroidOptions.addIntegration(new SendCachedEnvelopeIntegration(new c5(new x4() { // from class: io.sentry.android.core.e0
            @Override // io.sentry.x4
            public final String a() {
                return sentryAndroidOptions.getOutboxPath();
            }
        }), qVar));
        sentryAndroidOptions.addIntegration(new AppLifecycleIntegration());
        sentryAndroidOptions.addIntegration(p0.a(context, w0Var));
        if (context instanceof Application) {
            Application application = (Application) context;
            sentryAndroidOptions.addIntegration(new ActivityLifecycleIntegration(application, w0Var, iVar));
            sentryAndroidOptions.addIntegration(new ActivityBreadcrumbsIntegration(application));
            sentryAndroidOptions.addIntegration(new UserInteractionIntegration(application, tVar));
            if (z10) {
                sentryAndroidOptions.addIntegration(new FragmentLifecycleIntegration(application, true, true));
            }
        } else {
            sentryAndroidOptions.getLogger().c(g7.WARNING, "ActivityLifecycle, FragmentLifecycle and UserInteraction Integrations need an Application class to be installed.", new Object[0]);
        }
        if (z11) {
            sentryAndroidOptions.addIntegration(new SentryTimberIntegration());
        }
        sentryAndroidOptions.addIntegration(new AppComponentsBreadcrumbsIntegration(context));
        sentryAndroidOptions.addIntegration(new SystemEventsBreadcrumbsIntegration(context));
        sentryAndroidOptions.addIntegration(new NetworkBreadcrumbsIntegration(context, w0Var));
        if (z12) {
            ReplayIntegration replayIntegration = new ReplayIntegration(context, io.sentry.transport.n.a());
            sentryAndroidOptions.addIntegration(replayIntegration);
            sentryAndroidOptions.setReplayController(replayIntegration);
        }
        if (z13) {
            DistributionIntegration distributionIntegration = new DistributionIntegration(context);
            sentryAndroidOptions.setDistributionController(distributionIntegration);
            sentryAndroidOptions.addIntegration(distributionIntegration);
        }
        sentryAndroidOptions.getFeedbackOptions().g(new SentryAndroidOptions.a());
    }

    static void j(SentryAndroidOptions sentryAndroidOptions, Context context, ILogger iLogger, w0 w0Var) {
        io.sentry.util.w.c(context, "The context is required.");
        final Context contextF = c1.f(context);
        io.sentry.util.w.c(sentryAndroidOptions, "The options object is required.");
        io.sentry.util.w.c(iLogger, "The ILogger object is required.");
        sentryAndroidOptions.setLogger(iLogger);
        sentryAndroidOptions.setFatalLogger(new y());
        sentryAndroidOptions.setDefaultScopeType(l4.CURRENT);
        sentryAndroidOptions.setOpenTelemetryMode(p7.OFF);
        sentryAndroidOptions.setDateProvider(new f2());
        sentryAndroidOptions.setRuntimeManager(new io.sentry.android.core.internal.util.j());
        sentryAndroidOptions.setFlushTimeoutMillis(4000L);
        sentryAndroidOptions.setFrameMetricsCollector(new io.sentry.android.core.internal.util.f0(contextF, iLogger, w0Var));
        u1.a(contextF, sentryAndroidOptions, w0Var);
        sentryAndroidOptions.setCacheDirPath((String) sentryAndroidOptions.getRuntimeManager().a(new a.InterfaceC1016a() { // from class: io.sentry.android.core.b0
            @Override // io.sentry.util.runtime.a.InterfaceC1016a
            public final Object run() {
                return g0.f(contextF).getAbsolutePath();
            }
        }));
        k(sentryAndroidOptions, contextF, w0Var);
        AppState.n().p(sentryAndroidOptions);
    }

    private static void k(SentryAndroidOptions sentryAndroidOptions, final Context context, w0 w0Var) {
        PackageInfo packageInfoO = c1.o(context, w0Var);
        if (packageInfoO != null) {
            if (sentryAndroidOptions.getRelease() == null) {
                sentryAndroidOptions.setRelease(g(packageInfoO, c1.p(packageInfoO, w0Var)));
            }
            String str = packageInfoO.packageName;
            if (str != null && !str.startsWith("android.")) {
                sentryAndroidOptions.addInAppInclude(str);
            }
        }
        if (sentryAndroidOptions.getDistinctId() == null) {
            try {
                sentryAndroidOptions.setDistinctId((String) sentryAndroidOptions.getRuntimeManager().a(new a.InterfaceC1016a() { // from class: io.sentry.android.core.f0
                    @Override // io.sentry.util.runtime.a.InterfaceC1016a
                    public final Object run() {
                        return p1.a(context);
                    }
                }));
            } catch (RuntimeException e10) {
                sentryAndroidOptions.getLogger().a(g7.ERROR, "Could not generate distinct Id.", e10);
            }
        }
    }

    private static void l(SentryAndroidOptions sentryAndroidOptions, Context context, w0 w0Var, io.sentry.m1 m1Var, io.sentry.o0 o0Var, io.sentry.i iVar) {
        if (sentryAndroidOptions.isProfilingEnabled() || sentryAndroidOptions.getProfilesSampleRate() != null) {
            sentryAndroidOptions.setContinuousProfiler(io.sentry.l2.a());
            if (o0Var != null) {
                o0Var.b(true);
            }
            if (m1Var != null) {
                sentryAndroidOptions.setTransactionProfiler(m1Var);
                return;
            } else {
                sentryAndroidOptions.setTransactionProfiler(new l0(context, sentryAndroidOptions, w0Var, (io.sentry.android.core.internal.util.f0) io.sentry.util.w.c(sentryAndroidOptions.getFrameMetricsCollector(), "options.getFrameMetricsCollector is required")));
                return;
            }
        }
        sentryAndroidOptions.setTransactionProfiler(i3.c());
        if (m1Var != null) {
            m1Var.close();
        }
        if (o0Var == null) {
            sentryAndroidOptions.setContinuousProfiler(new v(w0Var, (io.sentry.android.core.internal.util.f0) io.sentry.util.w.c(sentryAndroidOptions.getFrameMetricsCollector(), "options.getFrameMetricsCollector is required"), sentryAndroidOptions.getLogger(), sentryAndroidOptions.getProfilingTracesDirPath(), sentryAndroidOptions.getProfilingTracesHz(), sentryAndroidOptions.getExecutorService()));
            return;
        }
        sentryAndroidOptions.setContinuousProfiler(o0Var);
        io.sentry.protocol.x xVarE = o0Var.e();
        if (!o0Var.isRunning() || xVarE.equals(io.sentry.protocol.x.f84062c)) {
            return;
        }
        iVar.f(xVarE.toString());
    }
}
