package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class y extends Handler implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f23091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f23092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f23094d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public IOException f23095e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23096f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile Thread f23097g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f23098h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b0 f23099i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(b0 b0Var, Looper looper, z zVar, x xVar, int i10, long j10) {
        super(looper);
        this.f23099i = b0Var;
        this.f23091a = zVar;
        this.f23092b = xVar;
        this.f23093c = i10;
        this.f23094d = j10;
    }

    public final void a(boolean z10) {
        this.f23098h = z10;
        this.f23095e = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z10) {
                sendEmptyMessage(1);
            }
        } else {
            this.f23091a.b();
            if (this.f23097g != null) {
                this.f23097g.interrupt();
            }
        }
        if (z10) {
            this.f23099i.f22944b = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f23092b.a(this.f23091a, jElapsedRealtime, jElapsedRealtime - this.f23094d, true);
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f23098h) {
            return;
        }
        int i10 = message.what;
        if (i10 == 0) {
            this.f23095e = null;
            b0 b0Var = this.f23099i;
            b0Var.f22943a.execute(b0Var.f22944b);
            return;
        }
        if (i10 == 4) {
            throw ((Error) message.obj);
        }
        this.f23099i.f22944b = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = jElapsedRealtime - this.f23094d;
        if (this.f23091a.a()) {
            this.f23092b.a(this.f23091a, jElapsedRealtime, j10, false);
            return;
        }
        int i11 = message.what;
        if (i11 == 1) {
            this.f23092b.a(this.f23091a, jElapsedRealtime, j10, false);
            return;
        }
        if (i11 == 2) {
            this.f23092b.a(this.f23091a, jElapsedRealtime, j10);
            return;
        }
        if (i11 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f23095e = iOException;
        int iA = this.f23092b.a(this.f23091a, jElapsedRealtime, j10, iOException);
        if (iA == 3) {
            this.f23099i.f22945c = this.f23095e;
            return;
        }
        if (iA != 2) {
            int i12 = iA == 1 ? 1 : this.f23096f + 1;
            this.f23096f = i12;
            long jMin = Math.min((i12 - 1) * 1000, 5000);
            b0 b0Var2 = this.f23099i;
            if (b0Var2.f22944b != null) {
                throw new IllegalStateException();
            }
            b0Var2.f22944b = this;
            if (jMin > 0) {
                sendEmptyMessageDelayed(0, jMin);
            } else {
                this.f23095e = null;
                b0Var2.f22943a.execute(this);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f23097g = Thread.currentThread();
            if (!this.f23091a.a()) {
                com.fyber.inneractive.sdk.player.exoplayer2.util.w.a("load:".concat(this.f23091a.getClass().getSimpleName()));
                try {
                    this.f23091a.load();
                    com.fyber.inneractive.sdk.player.exoplayer2.util.w.a();
                } catch (Throwable th2) {
                    com.fyber.inneractive.sdk.player.exoplayer2.util.w.a();
                    throw th2;
                }
            }
            if (this.f23098h) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e10) {
            if (this.f23098h) {
                return;
            }
            obtainMessage(3, e10).sendToTarget();
        } catch (Exception e11) {
            Log.e("LoadTask", "Unexpected exception loading stream", e11);
            if (this.f23098h) {
                return;
            }
            obtainMessage(3, new a0(e11)).sendToTarget();
        } catch (OutOfMemoryError e12) {
            Log.e("LoadTask", "OutOfMemory error loading stream", e12);
            if (this.f23098h) {
                return;
            }
            obtainMessage(3, new a0(e12)).sendToTarget();
        } catch (Error e13) {
            Log.e("LoadTask", "Unexpected error loading stream", e13);
            if (!this.f23098h) {
                obtainMessage(4, e13).sendToTarget();
            }
            throw e13;
        } catch (InterruptedException unused) {
            if (!this.f23091a.a()) {
                throw new IllegalStateException();
            }
            if (this.f23098h) {
                return;
            }
            sendEmptyMessage(2);
        }
    }
}
