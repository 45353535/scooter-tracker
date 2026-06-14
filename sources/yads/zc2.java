package yads;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes4.dex */
public final class zc2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yc2 f118613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xc2 f118614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hv f118615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f118616d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f118617e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Looper f118618f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f118619g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f118620h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f118621i;

    public zc2(cn0 cn0Var, yc2 yc2Var, f43 f43Var, int i10, hv hvVar, Looper looper) {
        this.f118614b = cn0Var;
        this.f118613a = yc2Var;
        this.f118618f = looper;
        this.f118615c = hvVar;
    }

    public final synchronized void a(long j10) {
        boolean z10;
        if (!this.f118619g) {
            throw new IllegalStateException();
        }
        if (this.f118618f.getThread() == Thread.currentThread()) {
            throw new IllegalStateException();
        }
        ((r23) this.f118615c).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j10;
        while (true) {
            z10 = this.f118621i;
            if (z10 || j10 <= 0) {
                break;
            }
            this.f118615c.getClass();
            wait(j10);
            ((r23) this.f118615c).getClass();
            j10 = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (!z10) {
            throw new TimeoutException("Message delivery timed out.");
        }
    }

    public final synchronized void a(boolean z10) {
        this.f118620h = z10 | this.f118620h;
        this.f118621i = true;
        notifyAll();
    }

    public final zc2 a() {
        if (!this.f118619g) {
            this.f118619g = true;
            cn0 cn0Var = (cn0) this.f118614b;
            synchronized (cn0Var) {
                if (!cn0Var.A && cn0Var.f109472j.isAlive()) {
                    cn0Var.f109471i.a(14, this).b();
                    return this;
                }
                uf1.d("ExoPlayerImplInternal", "Ignoring messages sent after release.");
                a(false);
                return this;
            }
        }
        throw new IllegalStateException();
    }
}
