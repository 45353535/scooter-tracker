package io.sentry.util;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g {
    public static Throwable a(Throwable th2) {
        w.c(th2, "throwable cannot be null");
        while (th2.getCause() != null && th2.getCause() != th2) {
            th2 = th2.getCause();
        }
        return th2;
    }

    public static boolean b(Set set, Throwable th2) {
        return set.contains(th2.getClass());
    }
}
