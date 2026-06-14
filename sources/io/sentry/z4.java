package io.sentry;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class z4 {
    public static boolean a(a5 a5Var, String str, ILogger iLogger) {
        if (str != null && !str.isEmpty()) {
            return true;
        }
        iLogger.c(g7.INFO, "No cached dir path is defined in options.", new Object[0]);
        return false;
    }

    public static w4 b(a5 a5Var, final t tVar, final String str, final ILogger iLogger) {
        final File file = new File(str);
        return new w4() { // from class: io.sentry.y4
            @Override // io.sentry.w4
            public final void a() {
                z4.c(iLogger, str, tVar, file);
            }
        };
    }

    public static /* synthetic */ void c(ILogger iLogger, String str, t tVar, File file) {
        g7 g7Var = g7.DEBUG;
        iLogger.c(g7Var, "Started processing cached files from %s", str);
        tVar.d(file);
        iLogger.c(g7Var, "Finished processing cached files from %s", str);
    }
}
