package yads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class le1 extends Handler implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f113070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final me1 f113071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f113072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public je1 f113073e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public IOException f113074f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f113075g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Thread f113076h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f113077i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f113078j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ qe1 f113079k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public le1(qe1 qe1Var, Looper looper, me1 me1Var, je1 je1Var, int i10, long j10) {
        super(looper);
        this.f113079k = qe1Var;
        this.f113071c = me1Var;
        this.f113073e = je1Var;
        this.f113070b = i10;
        this.f113072d = j10;
    }

    public final void a(boolean z10) {
        this.f113078j = z10;
        this.f113074f = null;
        if (hasMessages(0)) {
            this.f113077i = true;
            removeMessages(0);
            if (!z10) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                try {
                    this.f113077i = true;
                    this.f113071c.b();
                    Thread thread = this.f113076h;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (z10) {
            this.f113079k.f114975b = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            je1 je1Var = this.f113073e;
            je1Var.getClass();
            je1Var.a(this.f113071c, jElapsedRealtime, jElapsedRealtime - this.f113072d, true);
            this.f113073e = null;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f113078j) {
            return;
        }
        int i10 = message.what;
        if (i10 == 0) {
            this.f113074f = null;
            qe1 qe1Var = this.f113079k;
            ExecutorService executorService = qe1Var.f114974a;
            le1 le1Var = qe1Var.f114975b;
            le1Var.getClass();
            executorService.execute(le1Var);
            return;
        }
        if (i10 == 3) {
            throw ((Error) message.obj);
        }
        this.f113079k.f114975b = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = jElapsedRealtime - this.f113072d;
        je1 je1Var = this.f113073e;
        je1Var.getClass();
        if (this.f113077i) {
            je1Var.a(this.f113071c, jElapsedRealtime, j10, false);
            return;
        }
        int i11 = message.what;
        if (i11 == 1) {
            try {
                je1Var.a(this.f113071c, jElapsedRealtime, j10);
                return;
            } catch (RuntimeException e10) {
                uf1.b("LoadTask", uf1.a("Unexpected exception handling load completed", e10));
                this.f113079k.f114976c = new pe1(e10);
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f113074f = iOException;
        int i12 = this.f113075g + 1;
        this.f113075g = i12;
        ke1 ke1VarA = je1Var.a(this.f113071c, jElapsedRealtime, j10, iOException, i12);
        int i13 = ke1VarA.f112694a;
        if (i13 == 3) {
            this.f113079k.f114976c = this.f113074f;
            return;
        }
        if (i13 != 2) {
            if (i13 == 1) {
                this.f113075g = 1;
            }
            long jMin = ke1VarA.f112695b;
            if (jMin == -9223372036854775807L) {
                jMin = Math.min((this.f113075g - 1) * 1000, 5000);
            }
            qe1 qe1Var2 = this.f113079k;
            if (qe1Var2.f114975b != null) {
                throw new IllegalStateException();
            }
            qe1Var2.f114975b = this;
            if (jMin > 0) {
                sendEmptyMessageDelayed(0, jMin);
            } else {
                this.f113074f = null;
                qe1Var2.f114974a.execute(this);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        try {
            synchronized (this) {
                z10 = this.f113077i;
                this.f113076h = Thread.currentThread();
            }
            if (!z10) {
                q43.a("load:".concat(this.f113071c.getClass().getSimpleName()));
                try {
                    this.f113071c.a();
                    q43.a();
                } catch (Throwable th2) {
                    q43.a();
                    throw th2;
                }
            }
            synchronized (this) {
                this.f113076h = null;
                Thread.interrupted();
            }
            if (this.f113078j) {
                return;
            }
            sendEmptyMessage(1);
        } catch (IOException e10) {
            if (this.f113078j) {
                return;
            }
            obtainMessage(2, e10).sendToTarget();
        } catch (Exception e11) {
            if (this.f113078j) {
                return;
            }
            uf1.b("LoadTask", uf1.a("Unexpected exception loading stream", e11));
            obtainMessage(2, new pe1(e11)).sendToTarget();
        } catch (OutOfMemoryError e12) {
            if (this.f113078j) {
                return;
            }
            uf1.b("LoadTask", uf1.a("OutOfMemory error loading stream", e12));
            obtainMessage(2, new pe1(e12)).sendToTarget();
        } catch (Error e13) {
            if (!this.f113078j) {
                uf1.b("LoadTask", uf1.a("Unexpected error loading stream", e13));
                obtainMessage(3, e13).sendToTarget();
            }
            throw e13;
        }
    }
}
