package com.google.firebase.crashlytics.internal.send;

import android.annotation.SuppressLint;
import android.os.SystemClock;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.runtime.ForcedSender;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.common.OnDemandCounter;
import com.google.firebase.crashlytics.internal.common.Utils;
import com.google.firebase.crashlytics.internal.settings.Settings;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
final class ReportQueue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f32677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f32678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f32679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f32680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f32681e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final BlockingQueue f32682f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ThreadPoolExecutor f32683g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Transport f32684h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final OnDemandCounter f32685i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f32686j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f32687k;

    private final class ReportRunnable implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final CrashlyticsReportWithSessionId f32688b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final TaskCompletionSource f32689c;

        @Override // java.lang.Runnable
        public void run() {
            ReportQueue.this.m(this.f32688b, this.f32689c);
            ReportQueue.this.f32685i.resetDroppedOnDemandExceptions();
            double dG = ReportQueue.this.g();
            Logger.getLogger().d("Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(dG / 1000.0d)) + " s for report: " + this.f32688b.getSessionId());
            ReportQueue.n(dG);
        }

        private ReportRunnable(CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, TaskCompletionSource taskCompletionSource) {
            this.f32688b = crashlyticsReportWithSessionId;
            this.f32689c = taskCompletionSource;
        }
    }

    ReportQueue(Transport transport, Settings settings, OnDemandCounter onDemandCounter) {
        this(settings.onDemandUploadRatePerMinute, settings.onDemandBackoffBase, ((long) settings.onDemandBackoffStepDurationSeconds) * 1000, transport, onDemandCounter);
    }

    public static /* synthetic */ void a(ReportQueue reportQueue, TaskCompletionSource taskCompletionSource, boolean z10, CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, Exception exc) {
        reportQueue.getClass();
        if (exc != null) {
            taskCompletionSource.trySetException(exc);
            return;
        }
        if (z10) {
            reportQueue.flushScheduledReportsIfAble();
        }
        taskCompletionSource.trySetResult(crashlyticsReportWithSessionId);
    }

    public static /* synthetic */ void b(ReportQueue reportQueue, CountDownLatch countDownLatch) {
        reportQueue.getClass();
        try {
            ForcedSender.sendBlocking(reportQueue.f32684h, Priority.HIGHEST);
        } catch (Exception unused) {
        }
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public double g() {
        return Math.min(3600000.0d, (60000.0d / this.f32677a) * Math.pow(this.f32678b, h()));
    }

    private int h() {
        if (this.f32687k == 0) {
            this.f32687k = l();
        }
        int iL = (int) ((l() - this.f32687k) / this.f32679c);
        int iMin = k() ? Math.min(100, this.f32686j + iL) : Math.max(0, this.f32686j - iL);
        if (this.f32686j != iMin) {
            this.f32686j = iMin;
            this.f32687k = l();
        }
        return iMin;
    }

    private boolean j() {
        return this.f32682f.size() < this.f32681e;
    }

    private boolean k() {
        return this.f32682f.size() == this.f32681e;
    }

    private long l() {
        return System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(final CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, final TaskCompletionSource taskCompletionSource) {
        Logger.getLogger().d("Sending report through Google DataTransport: " + crashlyticsReportWithSessionId.getSessionId());
        final boolean z10 = SystemClock.elapsedRealtime() - this.f32680d < 2000;
        this.f32684h.schedule(Event.ofUrgent(crashlyticsReportWithSessionId.getReport()), new TransportScheduleCallback() { // from class: com.google.firebase.crashlytics.internal.send.c
            @Override // com.google.android.datatransport.TransportScheduleCallback
            public final void onSchedule(Exception exc) {
                ReportQueue.a(this.f32693a, taskCompletionSource, z10, crashlyticsReportWithSessionId, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void n(double d10) {
        try {
            Thread.sleep((long) d10);
        } catch (InterruptedException unused) {
        }
    }

    @SuppressLint({"DiscouragedApi", "ThreadPoolCreation"})
    public void flushScheduledReportsIfAble() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new Runnable() { // from class: com.google.firebase.crashlytics.internal.send.b
            @Override // java.lang.Runnable
            public final void run() {
                ReportQueue.b(this.f32691b, countDownLatch);
            }
        }).start();
        Utils.awaitUninterruptibly(countDownLatch, 2L, TimeUnit.SECONDS);
    }

    TaskCompletionSource i(CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, boolean z10) {
        synchronized (this.f32682f) {
            try {
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                if (!z10) {
                    m(crashlyticsReportWithSessionId, taskCompletionSource);
                    return taskCompletionSource;
                }
                this.f32685i.incrementRecordedOnDemandExceptions();
                if (!j()) {
                    h();
                    Logger.getLogger().d("Dropping report due to queue being full: " + crashlyticsReportWithSessionId.getSessionId());
                    this.f32685i.incrementDroppedOnDemandExceptions();
                    taskCompletionSource.trySetResult(crashlyticsReportWithSessionId);
                    return taskCompletionSource;
                }
                Logger.getLogger().d("Enqueueing report: " + crashlyticsReportWithSessionId.getSessionId());
                Logger.getLogger().d("Queue size: " + this.f32682f.size());
                this.f32683g.execute(new ReportRunnable(crashlyticsReportWithSessionId, taskCompletionSource));
                Logger.getLogger().d("Closing task for report: " + crashlyticsReportWithSessionId.getSessionId());
                taskCompletionSource.trySetResult(crashlyticsReportWithSessionId);
                return taskCompletionSource;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    ReportQueue(double d10, double d11, long j10, Transport transport, OnDemandCounter onDemandCounter) {
        this.f32677a = d10;
        this.f32678b = d11;
        this.f32679c = j10;
        this.f32684h = transport;
        this.f32685i = onDemandCounter;
        this.f32680d = SystemClock.elapsedRealtime();
        int i10 = (int) d10;
        this.f32681e = i10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i10);
        this.f32682f = arrayBlockingQueue;
        this.f32683g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f32686j = 0;
        this.f32687k = 0L;
    }
}
