package io.sentry.profiling;

import io.sentry.ILogger;
import io.sentry.f1;
import io.sentry.g7;
import io.sentry.l2;
import io.sentry.o0;
import io.sentry.q2;
import io.sentry.t4;
import io.sentry.x0;
import java.util.Iterator;
import java.util.ServiceLoader;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static o0 a(ILogger iLogger, String str, int i10, f1 f1Var) {
        try {
            androidx.privacysandbox.ads.adservices.topics.a.a(c(a.class));
            iLogger.c(g7.DEBUG, "No continuous profiler provider found, using NoOpContinuousProfiler", new Object[0]);
            return l2.a();
        } catch (Throwable th2) {
            iLogger.a(g7.ERROR, "Failed to load continuous profiler provider, using NoOpContinuousProfiler", th2);
            return l2.a();
        }
    }

    public static x0 b() {
        ILogger logger = t4.g().G().getOptions().getLogger();
        try {
            androidx.privacysandbox.ads.adservices.topics.a.a(c(b.class));
            logger.c(g7.DEBUG, "No profile converter provider found, using NoOpProfileConverter", new Object[0]);
            return q2.b();
        } catch (Throwable th2) {
            logger.a(g7.ERROR, "Failed to load profile converter provider, using NoOpProfileConverter", th2);
            return q2.b();
        }
    }

    private static Object c(Class cls) {
        Iterator it = ServiceLoader.load(cls).iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }
}
