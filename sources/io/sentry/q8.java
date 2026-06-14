package io.sentry;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q8 {
    public static k1 a(io.sentry.util.t tVar, ILogger iLogger) {
        Class clsG;
        if (io.sentry.util.y.c() && tVar.c("io.sentry.opentelemetry.OtelSpanFactory", iLogger) && (clsG = tVar.g("io.sentry.opentelemetry.OtelSpanFactory", iLogger)) != null) {
            try {
                Object objNewInstance = clsG.getDeclaredConstructor(null).newInstance(null);
                if (objNewInstance != null && (objNewInstance instanceof k1)) {
                    return (k1) objNewInstance;
                }
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        return new p();
    }
}
