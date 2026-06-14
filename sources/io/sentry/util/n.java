package io.sentry.util;

import io.sentry.g2;
import io.sentry.g7;
import io.sentry.k3;
import io.sentry.l2;
import io.sentry.o0;
import io.sentry.q2;
import io.sentry.v7;
import io.sentry.x0;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n {
    private static String a(v7 v7Var) {
        String profilingTracesDirPath = v7Var.getProfilingTracesDirPath();
        if (profilingTracesDirPath != null) {
            return profilingTracesDirPath;
        }
        File file = new File(System.getProperty("java.io.tmpdir"), "sentry_profiling_traces");
        if (file.mkdirs() || file.exists()) {
            String absolutePath = file.getAbsolutePath();
            v7Var.setProfilingTracesDirPath(absolutePath);
            return absolutePath;
        }
        throw new IllegalArgumentException("Creating a fallback directory for profiling failed in " + file.getAbsolutePath());
    }

    public static x0 b(v7 v7Var) {
        if (!e(v7Var)) {
            return v7Var.getProfilerConverter();
        }
        x0 x0VarB = io.sentry.profiling.c.b();
        if (x0VarB instanceof q2) {
            v7Var.getLogger().c(g7.WARNING, "Could not load profile converter. If you are using Spring or Spring Boot with the OTEL Agent, profile converter init will be retried.", new Object[0]);
        } else {
            v7Var.setProfilerConverter(x0VarB);
            v7Var.getLogger().c(g7.INFO, "Successfully loaded profile converter", new Object[0]);
        }
        return v7Var.getProfilerConverter();
    }

    public static o0 c(v7 v7Var) {
        if (!f(v7Var)) {
            return v7Var.getContinuousProfiler();
        }
        try {
            o0 o0VarA = io.sentry.profiling.c.a(v7Var.getLogger(), a(v7Var), v7Var.getProfilingTracesHz(), v7Var.getExecutorService());
            if (o0VarA instanceof l2) {
                v7Var.getLogger().c(g7.WARNING, "Could not load profiler, profiling will be disabled. If you are using Spring or Spring Boot with the OTEL Agent profiler init will be retried.", new Object[0]);
            } else {
                v7Var.setContinuousProfiler(o0VarA);
                v7Var.getLogger().c(g7.INFO, "Successfully loaded profiler", new Object[0]);
            }
        } catch (Exception e10) {
            v7Var.getLogger().a(g7.ERROR, "Failed to create default profiling traces directory", e10);
        }
        return v7Var.getContinuousProfiler();
    }

    public static boolean d(v7 v7Var, v7 v7Var2, boolean z10) {
        if (y.c() && (v7Var2.getVersionDetector() instanceof k3)) {
            v7Var2.setVersionDetector(new g2(v7Var2));
        }
        if (!v7Var2.getVersionDetector().a()) {
            return !z10 || v7Var == null || v7Var2.isForceInit() || v7Var.getInitPriority().ordinal() <= v7Var2.getInitPriority().ordinal();
        }
        v7Var2.getLogger().c(g7.ERROR, "Not initializing Sentry because mixed SDK versions have been detected.", new Object[0]);
        throw new IllegalStateException("Sentry SDK has detected a mix of versions. This is not supported and likely leads to crashes. Please always use the same version of all SDK modules (dependencies). See " + (y.a() ? "https://docs.sentry.io/platforms/android/troubleshooting/mixed-versions" : "https://docs.sentry.io/platforms/java/troubleshooting/mixed-versions") + " for more details.");
    }

    private static boolean e(v7 v7Var) {
        return v7Var.isContinuousProfilingEnabled() && (v7Var.getProfilerConverter() instanceof q2);
    }

    private static boolean f(v7 v7Var) {
        return v7Var.isContinuousProfilingEnabled() && (v7Var.getContinuousProfiler() instanceof l2);
    }
}
