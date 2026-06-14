package io.sentry.android.core;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.sentry.ILogger;
import io.sentry.b7;
import io.sentry.e7;
import io.sentry.g7;
import io.sentry.v4;
import io.sentry.w3;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
abstract class u1 {
    static void a(Context context, SentryAndroidOptions sentryAndroidOptions, w0 w0Var) {
        io.sentry.util.w.c(context, "The application context is required.");
        io.sentry.util.w.c(sentryAndroidOptions, "The options object is required.");
        try {
            Bundle bundleB = b(context, sentryAndroidOptions.getLogger(), w0Var);
            ILogger logger = sentryAndroidOptions.getLogger();
            if (bundleB != null) {
                sentryAndroidOptions.setDebug(c(bundleB, logger, "io.sentry.debug", sentryAndroidOptions.isDebug()));
                if (sentryAndroidOptions.isDebug()) {
                    String strName = sentryAndroidOptions.getDiagnosticLevel().name();
                    Locale locale = Locale.ROOT;
                    String strG = g(bundleB, logger, "io.sentry.debug.level", strName.toLowerCase(locale));
                    if (strG != null) {
                        sentryAndroidOptions.setDiagnosticLevel(g7.valueOf(strG.toUpperCase(locale)));
                    }
                }
                sentryAndroidOptions.setAnrEnabled(c(bundleB, logger, "io.sentry.anr.enable", sentryAndroidOptions.isAnrEnabled()));
                sentryAndroidOptions.setEnableAutoSessionTracking(c(bundleB, logger, "io.sentry.auto-session-tracking.enable", sentryAndroidOptions.isEnableAutoSessionTracking()));
                if (sentryAndroidOptions.getSampleRate() == null) {
                    double d10 = d(bundleB, logger, "io.sentry.sample-rate");
                    if (d10 != -1.0d) {
                        sentryAndroidOptions.setSampleRate(Double.valueOf(d10));
                    }
                }
                sentryAndroidOptions.setAnrReportInDebug(c(bundleB, logger, "io.sentry.anr.report-debug", sentryAndroidOptions.isAnrReportInDebug()));
                sentryAndroidOptions.setAnrTimeoutIntervalMillis(f(bundleB, logger, "io.sentry.anr.timeout-interval-millis", sentryAndroidOptions.getAnrTimeoutIntervalMillis()));
                sentryAndroidOptions.setAttachAnrThreadDump(c(bundleB, logger, "io.sentry.anr.attach-thread-dumps", sentryAndroidOptions.isAttachAnrThreadDump()));
                String strG2 = g(bundleB, logger, "io.sentry.dsn", sentryAndroidOptions.getDsn());
                boolean zC = c(bundleB, logger, "io.sentry.enabled", sentryAndroidOptions.isEnabled());
                if (!zC || (strG2 != null && strG2.isEmpty())) {
                    sentryAndroidOptions.getLogger().c(g7.DEBUG, "Sentry enabled flag set to false or DSN is empty: disabling sentry-android", new Object[0]);
                } else if (strG2 == null) {
                    sentryAndroidOptions.getLogger().c(g7.FATAL, "DSN is required. Use empty string to disable SDK.", new Object[0]);
                }
                sentryAndroidOptions.setEnabled(zC);
                sentryAndroidOptions.setDsn(strG2);
                sentryAndroidOptions.setEnableNdk(c(bundleB, logger, "io.sentry.ndk.enable", sentryAndroidOptions.isEnableNdk()));
                sentryAndroidOptions.setEnableScopeSync(c(bundleB, logger, "io.sentry.ndk.scope-sync.enable", sentryAndroidOptions.isEnableScopeSync()));
                sentryAndroidOptions.setRelease(g(bundleB, logger, "io.sentry.release", sentryAndroidOptions.getRelease()));
                sentryAndroidOptions.setEnvironment(g(bundleB, logger, "io.sentry.environment", sentryAndroidOptions.getEnvironment()));
                sentryAndroidOptions.setSessionTrackingIntervalMillis(f(bundleB, logger, "io.sentry.session-tracking.timeout-interval-millis", sentryAndroidOptions.getSessionTrackingIntervalMillis()));
                sentryAndroidOptions.setMaxBreadcrumbs((int) f(bundleB, logger, "io.sentry.max-breadcrumbs", sentryAndroidOptions.getMaxBreadcrumbs()));
                sentryAndroidOptions.setEnableActivityLifecycleBreadcrumbs(c(bundleB, logger, "io.sentry.breadcrumbs.activity-lifecycle", sentryAndroidOptions.isEnableActivityLifecycleBreadcrumbs()));
                sentryAndroidOptions.setEnableAppLifecycleBreadcrumbs(c(bundleB, logger, "io.sentry.breadcrumbs.app-lifecycle", sentryAndroidOptions.isEnableAppLifecycleBreadcrumbs()));
                sentryAndroidOptions.setEnableSystemEventBreadcrumbs(c(bundleB, logger, "io.sentry.breadcrumbs.system-events", sentryAndroidOptions.isEnableSystemEventBreadcrumbs()));
                sentryAndroidOptions.setEnableAppComponentBreadcrumbs(c(bundleB, logger, "io.sentry.breadcrumbs.app-components", sentryAndroidOptions.isEnableAppComponentBreadcrumbs()));
                sentryAndroidOptions.setEnableUserInteractionBreadcrumbs(c(bundleB, logger, "io.sentry.breadcrumbs.user-interaction", sentryAndroidOptions.isEnableUserInteractionBreadcrumbs()));
                sentryAndroidOptions.setEnableNetworkEventBreadcrumbs(c(bundleB, logger, "io.sentry.breadcrumbs.network-events", sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()));
                sentryAndroidOptions.setEnableUncaughtExceptionHandler(c(bundleB, logger, "io.sentry.uncaught-exception-handler.enable", sentryAndroidOptions.isEnableUncaughtExceptionHandler()));
                sentryAndroidOptions.setAttachThreads(c(bundleB, logger, "io.sentry.attach-threads", sentryAndroidOptions.isAttachThreads()));
                sentryAndroidOptions.setAttachScreenshot(c(bundleB, logger, "io.sentry.attach-screenshot", sentryAndroidOptions.isAttachScreenshot()));
                sentryAndroidOptions.setAttachViewHierarchy(c(bundleB, logger, "io.sentry.attach-view-hierarchy", sentryAndroidOptions.isAttachViewHierarchy()));
                sentryAndroidOptions.setSendClientReports(c(bundleB, logger, "io.sentry.send-client-reports", sentryAndroidOptions.isSendClientReports()));
                if (c(bundleB, logger, "io.sentry.auto-init", true)) {
                    sentryAndroidOptions.setInitPriority(io.sentry.p1.LOW);
                }
                sentryAndroidOptions.setForceInit(c(bundleB, logger, "io.sentry.force-init", sentryAndroidOptions.isForceInit()));
                sentryAndroidOptions.setCollectAdditionalContext(c(bundleB, logger, "io.sentry.additional-context", sentryAndroidOptions.isCollectAdditionalContext()));
                if (sentryAndroidOptions.getTracesSampleRate() == null) {
                    double d11 = d(bundleB, logger, "io.sentry.traces.sample-rate");
                    if (d11 != -1.0d) {
                        sentryAndroidOptions.setTracesSampleRate(Double.valueOf(d11));
                    }
                }
                sentryAndroidOptions.setTraceSampling(c(bundleB, logger, "io.sentry.traces.trace-sampling", sentryAndroidOptions.isTraceSampling()));
                sentryAndroidOptions.setEnableAutoActivityLifecycleTracing(c(bundleB, logger, "io.sentry.traces.activity.enable", sentryAndroidOptions.isEnableAutoActivityLifecycleTracing()));
                sentryAndroidOptions.setEnableActivityLifecycleTracingAutoFinish(c(bundleB, logger, "io.sentry.traces.activity.auto-finish.enable", sentryAndroidOptions.isEnableActivityLifecycleTracingAutoFinish()));
                if (sentryAndroidOptions.getProfilesSampleRate() == null) {
                    double d12 = d(bundleB, logger, "io.sentry.traces.profiling.sample-rate");
                    if (d12 != -1.0d) {
                        sentryAndroidOptions.setProfilesSampleRate(Double.valueOf(d12));
                    }
                }
                if (sentryAndroidOptions.getProfileSessionSampleRate() == null) {
                    double d13 = d(bundleB, logger, "io.sentry.traces.profiling.session-sample-rate");
                    if (d13 != -1.0d) {
                        sentryAndroidOptions.setProfileSessionSampleRate(Double.valueOf(d13));
                    }
                }
                String strName2 = sentryAndroidOptions.getProfileLifecycle().name();
                Locale locale2 = Locale.ROOT;
                String strG3 = g(bundleB, logger, "io.sentry.traces.profiling.lifecycle", strName2.toLowerCase(locale2));
                if (strG3 != null) {
                    sentryAndroidOptions.setProfileLifecycle(w3.valueOf(strG3.toUpperCase(locale2)));
                }
                sentryAndroidOptions.setStartProfilerOnAppStart(c(bundleB, logger, "io.sentry.traces.profiling.start-on-app-start", sentryAndroidOptions.isStartProfilerOnAppStart()));
                sentryAndroidOptions.setEnableUserInteractionTracing(c(bundleB, logger, "io.sentry.traces.user-interaction.enable", sentryAndroidOptions.isEnableUserInteractionTracing()));
                sentryAndroidOptions.setEnableTimeToFullDisplayTracing(c(bundleB, logger, "io.sentry.traces.time-to-full-display.enable", sentryAndroidOptions.isEnableTimeToFullDisplayTracing()));
                long jF = f(bundleB, logger, "io.sentry.traces.idle-timeout", -1L);
                if (jF != -1) {
                    sentryAndroidOptions.setIdleTimeout(Long.valueOf(jF));
                }
                List<String> listE = e(bundleB, logger, "io.sentry.traces.trace-propagation-targets");
                if (bundleB.containsKey("io.sentry.traces.trace-propagation-targets") && listE == null) {
                    sentryAndroidOptions.setTracePropagationTargets(Collections.EMPTY_LIST);
                } else if (listE != null) {
                    sentryAndroidOptions.setTracePropagationTargets(listE);
                }
                sentryAndroidOptions.setEnableFramesTracking(c(bundleB, logger, "io.sentry.traces.frames-tracking", true));
                sentryAndroidOptions.setProguardUuid(g(bundleB, logger, "io.sentry.proguard-uuid", sentryAndroidOptions.getProguardUuid()));
                io.sentry.protocol.r sdkVersion = sentryAndroidOptions.getSdkVersion();
                if (sdkVersion == null) {
                    sdkVersion = new io.sentry.protocol.r("", "");
                }
                sdkVersion.h(h(bundleB, logger, "io.sentry.sdk.name", sdkVersion.e()));
                sdkVersion.j(h(bundleB, logger, "io.sentry.sdk.version", sdkVersion.g()));
                sentryAndroidOptions.setSdkVersion(sdkVersion);
                sentryAndroidOptions.setSendDefaultPii(c(bundleB, logger, "io.sentry.send-default-pii", sentryAndroidOptions.isSendDefaultPii()));
                List listE2 = e(bundleB, logger, "io.sentry.gradle-plugin-integrations");
                if (listE2 != null) {
                    Iterator it = listE2.iterator();
                    while (it.hasNext()) {
                        e7.d().a((String) it.next());
                    }
                }
                sentryAndroidOptions.setEnableRootCheck(c(bundleB, logger, "io.sentry.enable-root-check", sentryAndroidOptions.isEnableRootCheck()));
                sentryAndroidOptions.setSendModules(c(bundleB, logger, "io.sentry.send-modules", sentryAndroidOptions.isSendModules()));
                sentryAndroidOptions.setEnablePerformanceV2(c(bundleB, logger, "io.sentry.performance-v2.enable", sentryAndroidOptions.isEnablePerformanceV2()));
                sentryAndroidOptions.setEnableAppStartProfiling(c(bundleB, logger, "io.sentry.profiling.enable-app-start", sentryAndroidOptions.isEnableAppStartProfiling()));
                sentryAndroidOptions.setEnableScopePersistence(c(bundleB, logger, "io.sentry.enable-scope-persistence", sentryAndroidOptions.isEnableScopePersistence()));
                sentryAndroidOptions.setEnableAutoTraceIdGeneration(c(bundleB, logger, "io.sentry.traces.enable-auto-id-generation", sentryAndroidOptions.isEnableAutoTraceIdGeneration()));
                sentryAndroidOptions.setDeadlineTimeout(f(bundleB, logger, "io.sentry.traces.deadline-timeout", sentryAndroidOptions.getDeadlineTimeout()));
                if (sentryAndroidOptions.getSessionReplay().l() == null) {
                    double d14 = d(bundleB, logger, "io.sentry.session-replay.session-sample-rate");
                    if (d14 != -1.0d) {
                        sentryAndroidOptions.getSessionReplay().z(Double.valueOf(d14));
                    }
                }
                if (sentryAndroidOptions.getSessionReplay().g() == null) {
                    double d15 = d(bundleB, logger, "io.sentry.session-replay.on-error-sample-rate");
                    if (d15 != -1.0d) {
                        sentryAndroidOptions.getSessionReplay().w(Double.valueOf(d15));
                    }
                }
                sentryAndroidOptions.getSessionReplay().v(c(bundleB, logger, "io.sentry.session-replay.mask-all-text", true));
                sentryAndroidOptions.getSessionReplay().u(c(bundleB, logger, "io.sentry.session-replay.mask-all-images", true));
                sentryAndroidOptions.getSessionReplay().t(c(bundleB, logger, "io.sentry.session-replay.debug", false));
                String strG4 = g(bundleB, logger, "io.sentry.session-replay.screenshot-strategy", null);
                if (strG4 != null) {
                    if ("canvas".equals(strG4.toLowerCase(Locale.ROOT))) {
                        sentryAndroidOptions.getSessionReplay().x(v4.CANVAS);
                    } else {
                        sentryAndroidOptions.getSessionReplay().x(v4.PIXEL_COPY);
                    }
                }
                sentryAndroidOptions.setIgnoredErrors(e(bundleB, logger, "io.sentry.ignored-errors"));
                List listE3 = e(bundleB, logger, "io.sentry.in-app-includes");
                if (listE3 != null && !listE3.isEmpty()) {
                    Iterator it2 = listE3.iterator();
                    while (it2.hasNext()) {
                        sentryAndroidOptions.addInAppInclude((String) it2.next());
                    }
                }
                List listE4 = e(bundleB, logger, "io.sentry.in-app-excludes");
                if (listE4 != null && !listE4.isEmpty()) {
                    Iterator it3 = listE4.iterator();
                    while (it3.hasNext()) {
                        sentryAndroidOptions.addInAppExclude((String) it3.next());
                    }
                }
                sentryAndroidOptions.getLogs().b(c(bundleB, logger, "io.sentry.logs.enabled", sentryAndroidOptions.getLogs().a()));
                b7 feedbackOptions = sentryAndroidOptions.getFeedbackOptions();
                feedbackOptions.i(c(bundleB, logger, "io.sentry.feedback.is-name-required", feedbackOptions.b()));
                feedbackOptions.l(c(bundleB, logger, "io.sentry.feedback.show-name", feedbackOptions.e()));
                feedbackOptions.h(c(bundleB, logger, "io.sentry.feedback.is-email-required", feedbackOptions.a()));
                feedbackOptions.k(c(bundleB, logger, "io.sentry.feedback.show-email", feedbackOptions.d()));
                feedbackOptions.m(c(bundleB, logger, "io.sentry.feedback.use-sentry-user", feedbackOptions.f()));
                feedbackOptions.j(c(bundleB, logger, "io.sentry.feedback.show-branding", feedbackOptions.c()));
            }
            sentryAndroidOptions.getLogger().c(g7.INFO, "Retrieving configuration from AndroidManifest.xml", new Object[0]);
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().a(g7.ERROR, "Failed to read configuration from android manifest metadata.", th2);
        }
    }

    private static Bundle b(Context context, ILogger iLogger, w0 w0Var) {
        if (w0Var == null) {
            w0Var = new w0(iLogger);
        }
        ApplicationInfo applicationInfoG = c1.g(context, w0Var);
        if (applicationInfoG != null) {
            return applicationInfoG.metaData;
        }
        return null;
    }

    private static boolean c(Bundle bundle, ILogger iLogger, String str, boolean z10) {
        boolean z11 = bundle.getBoolean(str, z10);
        iLogger.c(g7.DEBUG, str + " read: " + z11, new Object[0]);
        return z11;
    }

    private static double d(Bundle bundle, ILogger iLogger, String str) {
        double dDoubleValue = Float.valueOf(bundle.getFloat(str, -1.0f)).doubleValue();
        if (dDoubleValue == -1.0d) {
            dDoubleValue = Integer.valueOf(bundle.getInt(str, -1)).doubleValue();
        }
        iLogger.c(g7.DEBUG, str + " read: " + dDoubleValue, new Object[0]);
        return dDoubleValue;
    }

    private static List e(Bundle bundle, ILogger iLogger, String str) {
        String string = bundle.getString(str);
        iLogger.c(g7.DEBUG, str + " read: " + string, new Object[0]);
        if (string != null) {
            return Arrays.asList(string.split(StringUtils.COMMA, -1));
        }
        return null;
    }

    private static long f(Bundle bundle, ILogger iLogger, String str, long j10) {
        long j11 = bundle.getInt(str, (int) j10);
        iLogger.c(g7.DEBUG, str + " read: " + j11, new Object[0]);
        return j11;
    }

    private static String g(Bundle bundle, ILogger iLogger, String str, String str2) {
        String string = bundle.getString(str, str2);
        iLogger.c(g7.DEBUG, str + " read: " + string, new Object[0]);
        return string;
    }

    private static String h(Bundle bundle, ILogger iLogger, String str, String str2) {
        String string = bundle.getString(str, str2);
        iLogger.c(g7.DEBUG, str + " read: " + string, new Object[0]);
        return string;
    }
}
