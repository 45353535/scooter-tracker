package com.mobilefuse.sdk.internal;

import android.os.Handler;
import androidx.annotation.NonNull;
import com.mobilefuse.sdk.AppLifecycleHelper;
import com.mobilefuse.sdk.MobileFuse;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.Utils;
import com.mobilefuse.sdk.internal.IntervalTaskRunner;

/* JADX INFO: loaded from: classes10.dex */
public class IntervalTaskRunner {
    private boolean active;
    private AppLifecycleHelper.ActivityLifecycleObserver activityLifecycleObserver;
    private boolean completed;
    private Listener listener;
    private boolean loop;
    private boolean paused;
    private long refreshDelayMilli;
    private long startedTimestamp;

    @NonNull
    private final Handler handler = Utils.getHandler();
    private boolean enabled = true;
    private boolean runInBackground = false;
    private Runnable intervalTask = new Runnable() { // from class: com.mobilefuse.sdk.internal.b
        @Override // java.lang.Runnable
        public final void run() {
            IntervalTaskRunner.a(this.f53383b);
        }
    };

    /* JADX INFO: renamed from: com.mobilefuse.sdk.internal.IntervalTaskRunner$1, reason: invalid class name */
    class AnonymousClass1 extends AppLifecycleHelper.ActivityLifecycleObserver {
        AnonymousClass1() {
        }

        public static /* synthetic */ void a(AnonymousClass1 anonymousClass1) {
            anonymousClass1.getClass();
            try {
                MobileFuse.logDebug("IntervalTaskRunner started due to entering foreground");
                IntervalTaskRunner.this.start();
            } catch (Throwable th2) {
                StabilityHelper.logException(anonymousClass1, th2);
            }
        }

        public static /* synthetic */ void b(AnonymousClass1 anonymousClass1) {
            anonymousClass1.getClass();
            try {
                MobileFuse.logDebug("IntervalTaskRunner stopped due to entering background");
                IntervalTaskRunner.this.pause();
            } catch (Throwable th2) {
                StabilityHelper.logException(anonymousClass1, th2);
            }
        }

        @Override // com.mobilefuse.sdk.AppLifecycleHelper.ActivityLifecycleObserver
        public void onApplicationInBackground() {
            IntervalTaskRunner.this.handler.post(new Runnable() { // from class: com.mobilefuse.sdk.internal.d
                @Override // java.lang.Runnable
                public final void run() {
                    IntervalTaskRunner.AnonymousClass1.b(this.f53385b);
                }
            });
        }

        @Override // com.mobilefuse.sdk.AppLifecycleHelper.ActivityLifecycleObserver
        public void onApplicationInForeground() {
            IntervalTaskRunner.this.handler.post(new Runnable() { // from class: com.mobilefuse.sdk.internal.c
                @Override // java.lang.Runnable
                public final void run() {
                    IntervalTaskRunner.AnonymousClass1.a(this.f53384b);
                }
            });
        }
    }

    public interface Listener {
        void onTaskRun() throws Throwable;
    }

    public IntervalTaskRunner(long j10, boolean z10, Listener listener) throws Throwable {
        this.refreshDelayMilli = j10;
        this.listener = listener;
        this.loop = z10;
    }

    public static /* synthetic */ void a(IntervalTaskRunner intervalTaskRunner) {
        intervalTaskRunner.getClass();
        try {
            intervalTaskRunner.active = false;
            intervalTaskRunner.completed = true;
            intervalTaskRunner.startedTimestamp = 0L;
            Listener listener = intervalTaskRunner.listener;
            if (listener != null) {
                listener.onTaskRun();
            }
            intervalTaskRunner.reset();
            if (intervalTaskRunner.loop) {
                intervalTaskRunner.start();
            }
        } catch (Throwable th2) {
            StabilityHelper.logException(intervalTaskRunner, th2);
        }
    }

    private void startActivityLifecycleChecking() throws Throwable {
        if (this.activityLifecycleObserver != null) {
            return;
        }
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        this.activityLifecycleObserver = anonymousClass1;
        AppLifecycleHelper.addActivityLifecycleObserver(anonymousClass1);
    }

    private void stopActivityLifecycleChecking() throws Throwable {
        AppLifecycleHelper.ActivityLifecycleObserver activityLifecycleObserver = this.activityLifecycleObserver;
        if (activityLifecycleObserver == null) {
            return;
        }
        AppLifecycleHelper.removeActivityLifecycleObserver(activityLifecycleObserver);
        this.activityLifecycleObserver = null;
    }

    public long getRefreshDelay() {
        return this.refreshDelayMilli;
    }

    public boolean isActive() {
        return this.active;
    }

    public boolean isCompleted() {
        return this.completed;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public boolean isRunInBackground() {
        return this.runInBackground;
    }

    public void pause() throws Throwable {
        if (this.enabled && this.active) {
            this.paused = true;
            this.active = false;
            this.handler.removeCallbacks(this.intervalTask);
        }
    }

    public void reset() throws Throwable {
        this.completed = false;
        this.active = false;
        this.paused = false;
        this.startedTimestamp = 0L;
        this.handler.removeCallbacks(this.intervalTask);
        stopActivityLifecycleChecking();
    }

    public void setEnabled(boolean z10) throws Throwable {
        this.enabled = z10;
        if (z10) {
            return;
        }
        reset();
    }

    public void setRefreshDelay(long j10) throws Throwable {
        this.refreshDelayMilli = j10;
        if (this.active) {
            reset();
            start();
        }
    }

    public void setRunInBackground(boolean z10) throws Throwable {
        this.runInBackground = z10;
        if (z10) {
            stopActivityLifecycleChecking();
        } else {
            startActivityLifecycleChecking();
        }
    }

    public void start() throws Throwable {
        if (!this.enabled || this.active) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jMax = this.refreshDelayMilli;
        if (this.paused) {
            jMax = Math.max(0L, jMax - (jCurrentTimeMillis - this.startedTimestamp));
        } else {
            this.startedTimestamp = jCurrentTimeMillis;
        }
        this.active = true;
        this.paused = false;
        if (jMax <= 0) {
            this.intervalTask.run();
            return;
        }
        this.handler.postDelayed(this.intervalTask, jMax);
        if (this.runInBackground) {
            return;
        }
        startActivityLifecycleChecking();
    }
}
