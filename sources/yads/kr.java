package yads;

import android.os.Process;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* JADX INFO: loaded from: classes4.dex */
public final class kr extends Thread {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f112808h = rj3.f115467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BlockingQueue f112809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BlockingQueue f112810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dr f112811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final wn2 f112812e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f112813f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final kk3 f112814g;

    public kr(PriorityBlockingQueue priorityBlockingQueue, PriorityBlockingQueue priorityBlockingQueue2, dr drVar, wn2 wn2Var) {
        this.f112809b = priorityBlockingQueue;
        this.f112810c = priorityBlockingQueue2;
        this.f112811d = drVar;
        this.f112812e = wn2Var;
        this.f112814g = new kk3(this, priorityBlockingQueue2, wn2Var);
    }

    private void a() throws InterruptedException {
        km2 km2Var = (km2) this.f112809b.take();
        km2Var.a("cache-queue-take");
        km2Var.a(1);
        try {
            if (km2Var.i()) {
                km2Var.c("cache-discard-canceled");
            } else {
                cr crVar = this.f112811d.get(km2Var.c());
                if (crVar == null) {
                    km2Var.a("cache-miss");
                    if (!this.f112814g.a(km2Var)) {
                        this.f112810c.put(km2Var);
                    }
                } else {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (crVar.f109527e < jCurrentTimeMillis) {
                        km2Var.a("cache-hit-expired");
                        km2Var.f112776p = crVar;
                        if (!this.f112814g.a(km2Var)) {
                            this.f112810c.put(km2Var);
                        }
                    } else {
                        km2Var.a("cache-hit");
                        byte[] bArr = crVar.f109523a;
                        Map map = crVar.f109529g;
                        qn2 qn2VarA = km2Var.a(new r62(200, bArr, map, r62.a(map), false));
                        km2Var.a("cache-hit-parsed");
                        if (qn2VarA.f115102c != null) {
                            km2Var.a("cache-parsing-failed");
                            this.f112811d.a(km2Var.c());
                            km2Var.f112776p = null;
                            if (!this.f112814g.a(km2Var)) {
                                this.f112810c.put(km2Var);
                            }
                        } else if (crVar.f109528f < jCurrentTimeMillis) {
                            km2Var.a("cache-hit-refresh-needed");
                            km2Var.f112776p = crVar;
                            qn2VarA.f115103d = true;
                            if (this.f112814g.a(km2Var)) {
                                ((cm0) this.f112812e).a(km2Var, qn2VarA, null);
                            } else {
                                ((cm0) this.f112812e).a(km2Var, qn2VarA, new jr(this, km2Var));
                            }
                        } else {
                            ((cm0) this.f112812e).a(km2Var, qn2VarA, null);
                        }
                    }
                }
            }
            km2Var.a(2);
        } catch (Throwable th2) {
            km2Var.a(2);
            throw th2;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (f112808h) {
            boolean z10 = lb1.f113032a;
        }
        Process.setThreadPriority(10);
        this.f112811d.a();
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f112813f) {
                    Thread.currentThread().interrupt();
                    return;
                }
                boolean z11 = lb1.f113032a;
            } catch (Throwable unused2) {
                boolean z12 = lb1.f113032a;
                return;
            }
        }
    }
}
