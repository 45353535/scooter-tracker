package net.pubnative.lite.sdk.vpaid.helpers;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
public abstract class TimerWithPause {
    private static final int MSG = 1;
    private final long mCountdownInterval;
    private long mMillisInFuture;
    private long mPauseTimeRemaining;
    private long mStopTimeInFuture;
    private final long mTotalCountdown;

    @SuppressLint({"HandlerLeak"})
    private final Handler mHandler = new Handler(Looper.myLooper()) { // from class: net.pubnative.lite.sdk.vpaid.helpers.TimerWithPause.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            TimerWithPause.this.handleTimerMessage();
        }
    };
    private final boolean mRunAtStart = true;

    protected TimerWithPause(long j10, long j11) {
        this.mMillisInFuture = j10;
        this.mTotalCountdown = j10;
        this.mCountdownInterval = j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void handleTimerMessage() {
        long jTimeLeft = timeLeft();
        if (jTimeLeft <= 0) {
            cancel();
            onFinish();
            return;
        }
        if (jTimeLeft < this.mCountdownInterval) {
            Handler handler = this.mHandler;
            handler.sendMessageDelayed(handler.obtainMessage(1), jTimeLeft);
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        onTick(jTimeLeft);
        long jElapsedRealtime2 = this.mCountdownInterval - (SystemClock.elapsedRealtime() - jElapsedRealtime);
        while (jElapsedRealtime2 < 0) {
            jElapsedRealtime2 += this.mCountdownInterval;
        }
        Handler handler2 = this.mHandler;
        handler2.sendMessageDelayed(handler2.obtainMessage(1), jElapsedRealtime2);
    }

    public final void cancel() {
        this.mHandler.removeMessages(1);
    }

    public final synchronized TimerWithPause create() {
        try {
            long j10 = this.mMillisInFuture;
            if (j10 <= 0) {
                onFinish();
            } else {
                this.mPauseTimeRemaining = j10;
            }
            if (!this.mRunAtStart) {
                return this;
            }
            resume();
            return this;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public boolean hasBeenStarted() {
        return this.mPauseTimeRemaining <= this.mMillisInFuture;
    }

    public boolean isPaused() {
        return this.mPauseTimeRemaining > 0;
    }

    public boolean isRunning() {
        return !isPaused();
    }

    public abstract void onFinish();

    public abstract void onTick(long j10);

    public void pause() {
        if (isRunning()) {
            this.mPauseTimeRemaining = timeLeft();
            cancel();
        }
    }

    public void resume() {
        if (isPaused()) {
            this.mMillisInFuture = this.mPauseTimeRemaining;
            this.mStopTimeInFuture = SystemClock.elapsedRealtime() + this.mMillisInFuture;
            Handler handler = this.mHandler;
            handler.sendMessage(handler.obtainMessage(1));
            this.mPauseTimeRemaining = 0L;
        }
    }

    public long timeLeft() {
        if (isPaused()) {
            return this.mPauseTimeRemaining;
        }
        long jElapsedRealtime = this.mStopTimeInFuture - SystemClock.elapsedRealtime();
        if (jElapsedRealtime < 0) {
            return 0L;
        }
        return jElapsedRealtime;
    }

    public long timePassed() {
        return this.mTotalCountdown - timeLeft();
    }

    public long totalCountdown() {
        return this.mTotalCountdown;
    }
}
