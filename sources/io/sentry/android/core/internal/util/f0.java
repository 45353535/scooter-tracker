package io.sentry.android.core.internal.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Choreographer;
import android.view.FrameMetrics;
import android.view.Window;
import android.view.Window$OnFrameMetricsAvailableListener;
import io.sentry.ILogger;
import io.sentry.android.core.c1;
import io.sentry.android.core.w0;
import io.sentry.g7;
import io.sentry.i8;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f82547o = TimeUnit.SECONDS.toNanos(1);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final long f82548p = TimeUnit.MILLISECONDS.toNanos(700);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w0 f82549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f82550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ILogger f82551d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Handler f82552e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private WeakReference f82553f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f82554g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f82555h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final c f82556i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Window$OnFrameMetricsAvailableListener f82557j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Choreographer f82558k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Field f82559l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f82560m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f82561n;

    class a implements c {
        a() {
        }

        @Override // io.sentry.android.core.internal.util.f0.c
        public /* synthetic */ void a(Window window, Window$OnFrameMetricsAvailableListener window$OnFrameMetricsAvailableListener, Handler handler) {
            i0.a(this, window, window$OnFrameMetricsAvailableListener, handler);
        }

        @Override // io.sentry.android.core.internal.util.f0.c
        public /* synthetic */ void b(Window window, Window$OnFrameMetricsAvailableListener window$OnFrameMetricsAvailableListener) {
            i0.b(this, window, window$OnFrameMetricsAvailableListener);
        }
    }

    public interface b {
        void e(long j10, long j11, long j12, long j13, boolean z10, boolean z11, float f10);
    }

    public interface c {
        void a(Window window, Window$OnFrameMetricsAvailableListener window$OnFrameMetricsAvailableListener, Handler handler);

        void b(Window window, Window$OnFrameMetricsAvailableListener window$OnFrameMetricsAvailableListener);
    }

    public f0(Context context, ILogger iLogger, w0 w0Var) {
        this(context, iLogger, w0Var, new a());
    }

    public static /* synthetic */ void a(f0 f0Var, ILogger iLogger) {
        f0Var.getClass();
        try {
            f0Var.f82558k = Choreographer.getInstance();
        } catch (Throwable th2) {
            iLogger.a(g7.ERROR, "Error retrieving Choreographer instance. Slow and frozen frames will not be reported.", th2);
        }
    }

    public static /* synthetic */ void b(f0 f0Var, Window window) {
        if (f0Var.f82550c.add(window)) {
            try {
                f0Var.f82556i.a(window, f0Var.f82557j, f0Var.f82552e);
            } catch (Throwable th2) {
                f0Var.f82551d.a(g7.ERROR, "Failed to add frameMetricsAvailableListener", th2);
            }
        }
    }

    public static /* synthetic */ void c(f0 f0Var, Window window) {
        f0Var.getClass();
        try {
            if (f0Var.f82550c.remove(window)) {
                f0Var.f82556i.b(window, f0Var.f82557j);
            }
        } catch (Throwable th2) {
            f0Var.f82551d.a(g7.ERROR, "Failed to remove frameMetricsAvailableListener", th2);
        }
    }

    public static /* synthetic */ void e(f0 f0Var, w0 w0Var, Window window, FrameMetrics frameMetrics, int i10) {
        f0Var.getClass();
        long jNanoTime = System.nanoTime();
        float refreshRate = w0Var.d() >= 30 ? window.getContext().getDisplay().getRefreshRate() : window.getWindowManager().getDefaultDisplay().getRefreshRate();
        float f10 = f82547o;
        long jF = f0Var.f(frameMetrics);
        long jMax = Math.max(0L, jF - ((long) (f10 / refreshRate)));
        long jG = f0Var.g(frameMetrics);
        if (jG < 0) {
            jG = jNanoTime - jF;
        }
        long jMax2 = Math.max(jG, f0Var.f82561n);
        if (jMax2 == f0Var.f82560m) {
            return;
        }
        f0Var.f82560m = jMax2;
        f0Var.f82561n = jMax2 + jF;
        boolean zJ = j(jF, (long) (f10 / (refreshRate - 1.0f)));
        boolean z10 = zJ && i(jF);
        Iterator it = f0Var.f82554g.values().iterator();
        while (it.hasNext()) {
            ((b) it.next()).e(jMax2, f0Var.f82561n, jF, jMax, zJ, z10, refreshRate);
        }
    }

    private long f(FrameMetrics frameMetrics) {
        return frameMetrics.getMetric(0) + frameMetrics.getMetric(1) + frameMetrics.getMetric(2) + frameMetrics.getMetric(3) + frameMetrics.getMetric(4) + frameMetrics.getMetric(5);
    }

    private long g(FrameMetrics frameMetrics) {
        return this.f82549b.d() >= 26 ? frameMetrics.getMetric(10) : h();
    }

    public static boolean i(long j10) {
        return j10 > f82548p;
    }

    public static boolean j(long j10, long j11) {
        return j10 > j11;
    }

    private void k(Window window) {
        WeakReference weakReference = this.f82553f;
        if (weakReference == null || weakReference.get() != window) {
            this.f82553f = new WeakReference(window);
            o();
        }
    }

    private void n(final Window window) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.internal.util.b0
            @Override // java.lang.Runnable
            public final void run() {
                f0.c(this.f82537b, window);
            }
        });
    }

    private void o() {
        WeakReference weakReference = this.f82553f;
        final Window window = weakReference != null ? (Window) weakReference.get() : null;
        if (window == null || !this.f82555h || this.f82554g.isEmpty() || this.f82552e == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.internal.util.a0
            @Override // java.lang.Runnable
            public final void run() {
                f0.b(this.f82534b, window);
            }
        });
    }

    public long h() {
        Field field;
        Choreographer choreographer = this.f82558k;
        if (choreographer == null || (field = this.f82559l) == null) {
            return -1L;
        }
        try {
            Long l10 = (Long) field.get(choreographer);
            if (l10 != null) {
                return l10.longValue();
            }
            return -1L;
        } catch (IllegalAccessException unused) {
            return -1L;
        }
    }

    public String l(b bVar) {
        if (!this.f82555h) {
            return null;
        }
        String strA = i8.a();
        this.f82554g.put(strA, bVar);
        o();
        return strA;
    }

    public void m(String str) {
        if (this.f82555h) {
            if (str != null) {
                this.f82554g.remove(str);
            }
            WeakReference weakReference = this.f82553f;
            Window window = weakReference != null ? (Window) weakReference.get() : null;
            if (window == null || !this.f82554g.isEmpty()) {
                return;
            }
            n(window);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        k(activity.getWindow());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        n(activity.getWindow());
        WeakReference weakReference = this.f82553f;
        if (weakReference == null || weakReference.get() != activity.getWindow()) {
            return;
        }
        this.f82553f = null;
    }

    public f0(Context context, final ILogger iLogger, final w0 w0Var, c cVar) {
        this.f82550c = new CopyOnWriteArraySet();
        this.f82554g = new ConcurrentHashMap();
        this.f82555h = false;
        this.f82560m = 0L;
        this.f82561n = 0L;
        Context context2 = (Context) io.sentry.util.w.c(c1.f(context), "The context is required");
        this.f82551d = (ILogger) io.sentry.util.w.c(iLogger, "Logger is required");
        this.f82549b = (w0) io.sentry.util.w.c(w0Var, "BuildInfoProvider is required");
        this.f82556i = (c) io.sentry.util.w.c(cVar, "WindowFrameMetricsManager is required");
        if ((context2 instanceof Application) && w0Var.d() >= 24) {
            this.f82555h = true;
            HandlerThread handlerThread = new HandlerThread("io.sentry.android.core.internal.util.SentryFrameMetricsCollector");
            handlerThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: io.sentry.android.core.internal.util.c0
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th2) {
                    iLogger.a(g7.ERROR, "Error during frames measurements.", th2);
                }
            });
            handlerThread.start();
            this.f82552e = new Handler(handlerThread.getLooper());
            ((Application) context2).registerActivityLifecycleCallbacks(this);
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.internal.util.d0
                @Override // java.lang.Runnable
                public final void run() {
                    f0.a(this.f82542b, iLogger);
                }
            });
            try {
                Field declaredField = Choreographer.class.getDeclaredField("mLastFrameTimeNanos");
                this.f82559l = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                iLogger.a(g7.ERROR, "Unable to get the frame timestamp from the choreographer: ", e10);
            }
            this.f82557j = new Window$OnFrameMetricsAvailableListener() { // from class: io.sentry.android.core.internal.util.e0
                public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i10) {
                    f0.e(this.f82545a, w0Var, window, frameMetrics, i10);
                }
            };
        }
    }
}
