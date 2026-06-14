package io.sentry;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u4 {
    public static c1 a(io.sentry.util.t tVar, ILogger iLogger) {
        c1 c1VarB = b(tVar, iLogger);
        c1VarB.init();
        return c1VarB;
    }

    private static c1 b(io.sentry.util.t tVar, ILogger iLogger) {
        Class clsG;
        if (io.sentry.util.y.c() && tVar.c("io.sentry.opentelemetry.OtelContextScopesStorage", iLogger) && (clsG = tVar.g("io.sentry.opentelemetry.OtelContextScopesStorage", iLogger)) != null) {
            try {
                Object objNewInstance = clsG.getDeclaredConstructor(null).newInstance(null);
                if (objNewInstance != null && (objNewInstance instanceof c1)) {
                    return (c1) objNewInstance;
                }
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        return new o();
    }
}
