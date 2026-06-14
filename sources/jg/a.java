package jg;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Method f85860a;

    static {
        Method method;
        try {
            method = ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", Boolean.TYPE);
        } catch (Throwable unused) {
            method = null;
        }
        f85860a = method;
    }

    public static final boolean a(Executor executor) {
        Method method;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor == null || (method = f85860a) == null) {
                return false;
            }
            method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
