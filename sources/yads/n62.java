package yads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* JADX INFO: loaded from: classes4.dex */
public final class n62 extends Thread {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BlockingQueue f113737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final po f113738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dr f113739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final wn2 f113740e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f113741f = false;

    public n62(PriorityBlockingQueue priorityBlockingQueue, po poVar, dr drVar, wn2 wn2Var) {
        this.f113737b = priorityBlockingQueue;
        this.f113738c = poVar;
        this.f113739d = drVar;
        this.f113740e = wn2Var;
    }

    private void a() throws InterruptedException {
        km2 km2Var = (km2) this.f113737b.take();
        SystemClock.elapsedRealtime();
        km2Var.a(3);
        try {
            try {
                try {
                    km2Var.a("network-queue-take");
                    if (km2Var.i()) {
                        km2Var.c("network-discard-cancelled");
                        km2Var.j();
                    } else {
                        TrafficStats.setThreadStatsTag(km2Var.f112765e);
                        r62 r62VarA = this.f113738c.a(km2Var);
                        km2Var.a("network-http-complete");
                        if (r62VarA.f115344e && km2Var.h()) {
                            km2Var.c("not-modified");
                            km2Var.j();
                        } else {
                            qn2 qn2VarA = km2Var.a(r62VarA);
                            km2Var.a("network-parse-complete");
                            if (km2Var.f112770j && qn2VarA.f115101b != null) {
                                this.f113739d.a(km2Var.c(), qn2VarA.f115101b);
                                km2Var.a("network-cache-written");
                            }
                            synchronized (km2Var.f112766f) {
                                km2Var.f112772l = true;
                            }
                            ((cm0) this.f113740e).a(km2Var, qn2VarA, null);
                            km2Var.a(qn2VarA);
                        }
                    }
                } catch (oj3 e10) {
                    SystemClock.elapsedRealtime();
                    oj3 oj3VarA = km2Var.a(e10);
                    cm0 cm0Var = (cm0) this.f113740e;
                    cm0Var.getClass();
                    km2Var.a("post-error");
                    qn2 qn2Var = new qn2(oj3VarA);
                    am0 am0Var = cm0Var.f109461a;
                    am0Var.f108718a.post(new bm0(km2Var, qn2Var, null));
                    km2Var.j();
                }
            } catch (Exception e11) {
                boolean z10 = rj3.f115467a;
                boolean z11 = lb1.f113032a;
                oj3 oj3Var = new oj3(e11);
                SystemClock.elapsedRealtime();
                cm0 cm0Var2 = (cm0) this.f113740e;
                cm0Var2.getClass();
                km2Var.a("post-error");
                qn2 qn2Var2 = new qn2(oj3Var);
                am0 am0Var2 = cm0Var2.f109461a;
                am0Var2.f108718a.post(new bm0(km2Var, qn2Var2, null));
                km2Var.j();
            }
            km2Var.a(4);
        } catch (Throwable th2) {
            km2Var.a(4);
            throw th2;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f113741f) {
                    Thread.currentThread().interrupt();
                    return;
                } else {
                    boolean z10 = rj3.f115467a;
                    boolean z11 = lb1.f113032a;
                }
            } catch (Throwable unused2) {
                boolean z12 = rj3.f115467a;
                boolean z13 = lb1.f113032a;
                return;
            }
        }
    }
}
