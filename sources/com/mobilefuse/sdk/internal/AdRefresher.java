package com.mobilefuse.sdk.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.mobilefuse.sdk.MobileFuse;
import com.mobilefuse.sdk.StabilityHelper;

/* JADX INFO: loaded from: classes10.dex */
public class AdRefresher {
    private boolean active;
    private boolean completed;
    private Context context;
    private Listener listener;
    private boolean paused;
    private long pausedTimestamp;
    private long refreshDelayInSeconds;
    private long startedTimestamp;
    private Handler handler = new Handler(Looper.getMainLooper());
    private boolean enabled = false;
    private Runnable refreshTask = new Runnable() { // from class: com.mobilefuse.sdk.internal.a
        @Override // java.lang.Runnable
        public final void run() {
            AdRefresher.a(this.f53382b);
        }
    };

    public interface Listener {
        void onAdRefresh() throws Throwable;
    }

    public AdRefresher(Context context, long j10, Listener listener) throws Throwable {
        this.context = context;
        this.refreshDelayInSeconds = j10;
        this.listener = listener;
    }

    public static /* synthetic */ void a(AdRefresher adRefresher) {
        adRefresher.getClass();
        try {
            Listener listener = adRefresher.listener;
            if (listener != null) {
                adRefresher.active = false;
                adRefresher.completed = true;
                adRefresher.startedTimestamp = 0L;
                listener.onAdRefresh();
            }
        } catch (Throwable th2) {
            StabilityHelper.logException(adRefresher, th2);
        }
    }

    public long getRefreshDelay() {
        return this.refreshDelayInSeconds;
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

    public void pause() throws Throwable {
        if (this.enabled && this.active) {
            this.paused = true;
            this.active = false;
            this.pausedTimestamp = System.currentTimeMillis();
            this.handler.removeCallbacks(this.refreshTask);
        }
    }

    public void reset() throws Throwable {
        this.completed = false;
        this.active = false;
        this.paused = false;
        this.startedTimestamp = 0L;
        this.pausedTimestamp = 0L;
        this.handler.removeCallbacks(this.refreshTask);
    }

    public void setEnabled(boolean z10) throws Throwable {
        this.enabled = z10;
        if (z10) {
            return;
        }
        reset();
    }

    public void setRefreshDelay(long j10) throws Throwable {
        this.refreshDelayInSeconds = j10;
        if (this.active) {
            reset();
            start();
        }
    }

    public void start() throws Throwable {
        if (!this.enabled || this.active) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = this.refreshDelayInSeconds * 1000;
        long j11 = this.startedTimestamp;
        if (j11 != 0 || this.paused) {
            j10 -= this.pausedTimestamp - j11;
        } else {
            this.startedTimestamp = jCurrentTimeMillis;
        }
        this.pausedTimestamp = 0L;
        this.active = true;
        this.paused = false;
        MobileFuse.logDebug("started refresher with delay: " + j10);
        this.handler.postDelayed(this.refreshTask, j10);
    }
}
