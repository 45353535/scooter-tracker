package net.pubnative.lite.sdk.vpaid.helpers;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CountDownTimer {
    private static final int MSG = 1;
    private final long mCountdownInterval;
    private final long mMillisInFuture;
    private long mPauseTime;
    private long mStopTimeInFuture;
    private boolean mCancelled = false;
    private boolean mPaused = false;
    private Handler mHandler = new Handler() { // from class: net.pubnative.lite.sdk.vpaid.helpers.CountDownTimer.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            synchronized (CountDownTimer.this) {
                try {
                    CountDownTimer countDownTimer = CountDownTimer.this;
                    if (!countDownTimer.mPaused) {
                        long jElapsedRealtime = countDownTimer.mStopTimeInFuture - SystemClock.elapsedRealtime();
                        if (jElapsedRealtime <= 0) {
                            CountDownTimer.this.onFinish();
                        } else if (jElapsedRealtime < CountDownTimer.this.mCountdownInterval) {
                            sendMessageDelayed(obtainMessage(1), jElapsedRealtime);
                        } else {
                            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                            CountDownTimer.this.onTick(jElapsedRealtime);
                            long jElapsedRealtime3 = (jElapsedRealtime2 + CountDownTimer.this.mCountdownInterval) - SystemClock.elapsedRealtime();
                            while (jElapsedRealtime3 < 0) {
                                jElapsedRealtime3 += CountDownTimer.this.mCountdownInterval;
                            }
                            if (!CountDownTimer.this.mCancelled) {
                                sendMessageDelayed(obtainMessage(1), jElapsedRealtime3);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    };

    protected CountDownTimer(long j10, long j11) {
        this.mMillisInFuture = j10;
        this.mCountdownInterval = j11;
    }

    public final void cancel() {
        this.mHandler.removeMessages(1);
        this.mCancelled = true;
    }

    public abstract void onFinish();

    public abstract void onTick(long j10);

    public long pause() {
        if (!this.mPaused) {
            this.mPauseTime = this.mStopTimeInFuture - SystemClock.elapsedRealtime();
            this.mPaused = true;
        }
        return this.mPauseTime;
    }

    public long resume() {
        if (this.mPaused) {
            this.mStopTimeInFuture = this.mPauseTime + SystemClock.elapsedRealtime();
            this.mPaused = false;
            Handler handler = this.mHandler;
            handler.sendMessage(handler.obtainMessage(1));
        }
        return this.mPauseTime;
    }

    public final synchronized CountDownTimer start() {
        if (this.mMillisInFuture <= 0) {
            onFinish();
            return this;
        }
        this.mStopTimeInFuture = SystemClock.elapsedRealtime() + this.mMillisInFuture;
        Handler handler = this.mHandler;
        handler.sendMessage(handler.obtainMessage(1));
        this.mCancelled = false;
        this.mPaused = false;
        return this;
    }
}
