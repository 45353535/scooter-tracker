package io.sentry.android.core;

import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import io.sentry.ILogger;
import io.sentry.android.core.internal.util.f0;
import io.sentry.g7;
import io.sentry.i8;
import io.sentry.n7;
import io.sentry.s3;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class i0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f82439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f82440c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f82443f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final io.sentry.android.core.internal.util.f0 f82444g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final io.sentry.f1 f82449l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ILogger f82450m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f82438a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Future f82441d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private File f82442e = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ArrayDeque f82445h = new ArrayDeque();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ArrayDeque f82446i = new ArrayDeque();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ArrayDeque f82447j = new ArrayDeque();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Map f82448k = new HashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile boolean f82451n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected final io.sentry.util.a f82452o = new io.sentry.util.a();

    class a implements f0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f82453a = 0.0f;

        a() {
        }

        @Override // io.sentry.android.core.internal.util.f0.b
        public void e(long j10, long j11, long j12, long j13, boolean z10, boolean z11, float f10) {
            long jG = new n7().g();
            long jNanoTime = ((j11 - System.nanoTime()) + SystemClock.elapsedRealtimeNanos()) - i0.this.f82438a;
            if (jNanoTime < 0) {
                return;
            }
            if (z11) {
                i0.this.f82447j.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(jNanoTime), Long.valueOf(j12), jG));
            } else if (z10) {
                i0.this.f82446i.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(jNanoTime), Long.valueOf(j12), jG));
            }
            if (f10 != this.f82453a) {
                this.f82453a = f10;
                i0.this.f82445h.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(jNanoTime), Float.valueOf(f10), jG));
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f82455a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f82456b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final File f82457c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Map f82458d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f82459e;

        public b(long j10, long j11, boolean z10, File file, Map map) {
            this.f82455a = j10;
            this.f82457c = file;
            this.f82456b = j11;
            this.f82458d = map;
            this.f82459e = z10;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f82460a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f82461b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Date f82462c;

        public c(long j10, long j11, Date date) {
            this.f82460a = j10;
            this.f82461b = j11;
            this.f82462c = date;
        }
    }

    public i0(String str, int i10, io.sentry.android.core.internal.util.f0 f0Var, io.sentry.f1 f1Var, ILogger iLogger) {
        this.f82439b = new File((String) io.sentry.util.w.c(str, "TracesFilesDirPath is required"));
        this.f82440c = i10;
        this.f82450m = (ILogger) io.sentry.util.w.c(iLogger, "Logger is required");
        this.f82449l = f1Var;
        this.f82444g = (io.sentry.android.core.internal.util.f0) io.sentry.util.w.c(f0Var, "SentryFrameMetricsCollector is required");
    }

    private void i(List list) {
        long jElapsedRealtimeNanos = (SystemClock.elapsedRealtimeNanos() - this.f82438a) - TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        if (list != null) {
            ArrayDeque arrayDeque = new ArrayDeque(list.size());
            ArrayDeque arrayDeque2 = new ArrayDeque(list.size());
            ArrayDeque arrayDeque3 = new ArrayDeque(list.size());
            synchronized (list) {
                try {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        s3 s3Var = (s3) it.next();
                        long jB = s3Var.b();
                        long j10 = jB + jElapsedRealtimeNanos;
                        Double dA = s3Var.a();
                        Long lC = s3Var.c();
                        Long lD = s3Var.d();
                        if (dA != null) {
                            arrayDeque3.add(new io.sentry.profilemeasurements.b(Long.valueOf(j10), dA, jB));
                        }
                        if (lC != null) {
                            arrayDeque.add(new io.sentry.profilemeasurements.b(Long.valueOf(j10), lC, jB));
                        }
                        if (lD != null) {
                            arrayDeque2.add(new io.sentry.profilemeasurements.b(Long.valueOf(j10), lD, jB));
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (!arrayDeque3.isEmpty()) {
                this.f82448k.put("cpu_usage", new io.sentry.profilemeasurements.a("percent", arrayDeque3));
            }
            if (!arrayDeque.isEmpty()) {
                this.f82448k.put("memory_footprint", new io.sentry.profilemeasurements.a("byte", arrayDeque));
            }
            if (arrayDeque2.isEmpty()) {
                return;
            }
            this.f82448k.put("memory_native_footprint", new io.sentry.profilemeasurements.a("byte", arrayDeque2));
        }
    }

    public void f() {
        io.sentry.g1 g1VarD = this.f82452o.d();
        try {
            Future future = this.f82441d;
            if (future != null) {
                future.cancel(true);
                this.f82441d = null;
            }
            if (this.f82451n) {
                g(true, null);
            }
            if (g1VarD != null) {
                g1VarD.close();
            }
        } catch (Throwable th2) {
            if (g1VarD != null) {
                try {
                    g1VarD.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public b g(boolean z10, List list) {
        io.sentry.g1 g1VarD = this.f82452o.d();
        try {
            if (!this.f82451n) {
                this.f82450m.c(g7.WARNING, "Profiler not running", new Object[0]);
                if (g1VarD != null) {
                    g1VarD.close();
                }
                return null;
            }
            try {
                Debug.stopMethodTracing();
            } finally {
                try {
                } catch (Throwable th2) {
                }
            }
            this.f82451n = false;
            this.f82444g.m(this.f82443f);
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long elapsedCpuTime = Process.getElapsedCpuTime();
            if (this.f82442e == null) {
                this.f82450m.c(g7.ERROR, "Trace file does not exists", new Object[0]);
                if (g1VarD != null) {
                    g1VarD.close();
                }
                return null;
            }
            if (!this.f82446i.isEmpty()) {
                this.f82448k.put("slow_frame_renders", new io.sentry.profilemeasurements.a("nanosecond", this.f82446i));
            }
            if (!this.f82447j.isEmpty()) {
                this.f82448k.put("frozen_frame_renders", new io.sentry.profilemeasurements.a("nanosecond", this.f82447j));
            }
            if (!this.f82445h.isEmpty()) {
                this.f82448k.put("screen_frame_rates", new io.sentry.profilemeasurements.a("hz", this.f82445h));
            }
            i(list);
            Future future = this.f82441d;
            if (future != null) {
                future.cancel(true);
                this.f82441d = null;
            }
            b bVar = new b(jElapsedRealtimeNanos, elapsedCpuTime, z10, this.f82442e, this.f82448k);
            if (g1VarD != null) {
                g1VarD.close();
            }
            return bVar;
        } finally {
        }
    }

    boolean h() {
        return this.f82451n;
    }

    public c j() {
        io.sentry.g1 g1VarD = this.f82452o.d();
        try {
            int i10 = this.f82440c;
            if (i10 == 0) {
                this.f82450m.c(g7.WARNING, "Disabling profiling because intervaUs is set to %d", Integer.valueOf(i10));
                if (g1VarD != null) {
                    g1VarD.close();
                }
                return null;
            }
            if (this.f82451n) {
                this.f82450m.c(g7.WARNING, "Profiling has already started...", new Object[0]);
                if (g1VarD != null) {
                    g1VarD.close();
                }
                return null;
            }
            this.f82442e = new File(this.f82439b, i8.a() + ".trace");
            this.f82448k.clear();
            this.f82445h.clear();
            this.f82446i.clear();
            this.f82447j.clear();
            this.f82443f = this.f82444g.l(new a());
            try {
                io.sentry.f1 f1Var = this.f82449l;
                if (f1Var != null) {
                    this.f82441d = f1Var.schedule(new Runnable() { // from class: io.sentry.android.core.h0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f82422b.g(true, null);
                        }
                    }, 30000L);
                }
            } catch (RejectedExecutionException e10) {
                this.f82450m.a(g7.ERROR, "Failed to call the executor. Profiling will not be automatically finished. Did you call Sentry.close()?", e10);
            }
            this.f82438a = SystemClock.elapsedRealtimeNanos();
            Date dateD = io.sentry.l.d();
            long elapsedCpuTime = Process.getElapsedCpuTime();
            try {
                Debug.startMethodTracingSampling(this.f82442e.getPath(), 3000000, this.f82440c);
                this.f82451n = true;
                c cVar = new c(this.f82438a, elapsedCpuTime, dateD);
                if (g1VarD != null) {
                    g1VarD.close();
                }
                return cVar;
            } catch (Throwable th2) {
                g(false, null);
                this.f82450m.a(g7.ERROR, "Unable to start a profile: ", th2);
                this.f82451n = false;
                if (g1VarD != null) {
                    g1VarD.close();
                }
                return null;
            }
        } finally {
        }
    }
}
