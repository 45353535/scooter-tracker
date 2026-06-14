package com.pubmatic.sdk.common.utility;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public abstract class POBCountdownTimer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f62541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f62542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f62543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f62544d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Handler f62545e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b f62546f = b.DEFAULT;

    private class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            synchronized (POBCountdownTimer.this) {
                try {
                    if (POBCountdownTimer.this.f62546f != b.PAUSE) {
                        long j10 = POBCountdownTimer.this.f62543c;
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        long seconds = j10 - timeUnit.toSeconds(SystemClock.elapsedRealtime());
                        if (seconds <= 0) {
                            b bVar = POBCountdownTimer.this.f62546f;
                            b bVar2 = b.FINISH;
                            if (bVar != bVar2) {
                                POBCountdownTimer.this.onFinish();
                                POBCountdownTimer.this.f62546f = bVar2;
                            }
                        } else if (seconds < POBCountdownTimer.this.f62542b) {
                            sendMessageDelayed(obtainMessage(1), TimeUnit.SECONDS.toMillis(seconds));
                        } else {
                            long seconds2 = timeUnit.toSeconds(SystemClock.elapsedRealtime());
                            POBCountdownTimer.this.onTick(seconds);
                            long seconds3 = (seconds2 + POBCountdownTimer.this.f62542b) - timeUnit.toSeconds(SystemClock.elapsedRealtime());
                            while (seconds3 < 0) {
                                seconds3 += POBCountdownTimer.this.f62542b;
                            }
                            if (POBCountdownTimer.this.f62546f != b.CANCEL && POBCountdownTimer.this.f62546f != b.FINISH) {
                                sendMessageDelayed(obtainMessage(1), TimeUnit.SECONDS.toMillis(seconds3));
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private enum b {
        DEFAULT,
        START,
        PAUSE,
        CANCEL,
        FINISH
    }

    public POBCountdownTimer(long j10, long j11, @NonNull Looper looper) {
        this.f62541a = j10;
        this.f62542b = j11;
        this.f62545e = new a(looper);
    }

    public final void cancel() {
        this.f62545e.removeMessages(1);
        this.f62546f = b.CANCEL;
    }

    public abstract void onFinish();

    public abstract void onTick(long j10);

    public long pause() {
        if (this.f62546f == b.START) {
            this.f62544d = this.f62543c - TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime());
            this.f62546f = b.PAUSE;
        }
        return this.f62544d;
    }

    public long resume() {
        if (this.f62546f == b.PAUSE) {
            this.f62543c = this.f62544d + TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime());
            this.f62546f = b.START;
            Handler handler = this.f62545e;
            handler.sendMessage(handler.obtainMessage(1));
        }
        return this.f62544d;
    }

    public final synchronized POBCountdownTimer start() {
        if (this.f62541a <= 0) {
            onFinish();
            this.f62546f = b.FINISH;
            return this;
        }
        this.f62543c = TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime()) + this.f62541a;
        this.f62544d = 0L;
        Handler handler = this.f62545e;
        handler.sendMessage(handler.obtainMessage(1));
        this.f62546f = b.START;
        return this;
    }
}
