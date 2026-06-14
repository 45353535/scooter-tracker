package com.mbridge.msdk.config.component.nori.monitor;

import com.ironsource.C4240b4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public class a {
    private static boolean H = MBridgeConstans.DEBUG;
    private static final AtomicInteger I = new AtomicInteger(0);
    private static final AtomicInteger J = new AtomicInteger(0);
    private Map<String, Object> F;
    private Map<String, Integer> G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f47180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f47181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f47182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f47183d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f47184e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f47185f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f47186g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f47187h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f47188i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f47189j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f47190k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f47191l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f47192m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f47193n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f47194o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f47195p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f47196q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f47197r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f47198s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f47199t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f47200u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f47201v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f47202w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f47203x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f47204y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f47205z = 0;
    private long A = 0;
    private long B = 0;
    private long C = 0;
    private long D = 0;
    private long E = 0;

    public void a(int i10, int i11, int i12) {
        if (this.f47180a) {
            return;
        }
        HashMap map = new HashMap();
        this.G = map;
        map.put("threadPoolSize", Integer.valueOf(i10));
        this.G.put("activeThreads", Integer.valueOf(i11));
        this.G.put("queuedTasks", Integer.valueOf(i12));
    }

    public void b() {
        if (this.f47180a) {
            return;
        }
        l();
    }

    public void c() {
        if (this.f47180a) {
            return;
        }
        this.f47186g = (System.nanoTime() - this.f47196q) / 1000000;
    }

    public void d() {
    }

    public void e() {
        if (this.f47180a) {
            return;
        }
        this.f47196q = System.nanoTime();
    }

    public void f() {
    }

    public void g() {
    }

    public void h() {
        if (this.f47180a) {
            return;
        }
        this.f47185f = (System.nanoTime() - this.f47194o) / 1000000;
    }

    public void i() {
        if (this.f47180a) {
            return;
        }
        this.f47194o = System.nanoTime();
    }

    public Map<String, Object> j() {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map2.put("isRetry", Boolean.valueOf(this.f47180a));
        map2.put("retryCount", Integer.valueOf(this.f47181b));
        map2.put("requestBodySize", Long.valueOf(this.f47182c));
        map2.put("responseBodySize", Long.valueOf(this.f47183d));
        map.put("basicInfo", map2);
        HashMap map3 = new HashMap();
        map3.put("totalTime", Long.valueOf(this.f47184e));
        map3.put("dnsTime", Long.valueOf(this.f47185f));
        map3.put("connectionTime", Long.valueOf(this.f47186g));
        map3.put("requestTime", Long.valueOf(this.f47187h));
        map3.put("serverTime", Long.valueOf(this.f47188i));
        map3.put("responseTime", Long.valueOf(this.f47189j));
        map3.put("queueTime", Long.valueOf(this.f47190k));
        map3.put("parsingTime", Long.valueOf(this.f47191l));
        map.put("timingInfo", map3);
        map.put(C4240b4.j.f42681h0, this.F);
        map.put("threadPoolInfo", this.G);
        return map;
    }

    public void k() {
        if (this.f47180a) {
            return;
        }
        this.f47184e = (System.nanoTime() - this.f47192m) / 1000000;
    }

    public void l() {
        if (this.f47180a) {
            return;
        }
        this.f47190k = (System.nanoTime() - this.f47192m) / 1000000;
    }

    public void m() {
        if (this.f47180a) {
            return;
        }
        this.f47192m = System.nanoTime();
    }

    public void n() {
        if (this.f47180a) {
            return;
        }
        this.f47202w = System.nanoTime();
    }

    public void o() {
        if (this.f47180a) {
            return;
        }
        this.f47201v = System.nanoTime();
    }

    public void p() {
        if (this.f47180a) {
            return;
        }
        this.f47200u = System.nanoTime();
    }

    public void q() {
        if (this.f47180a) {
            return;
        }
        this.A = System.nanoTime();
    }

    public void r() {
        if (this.f47180a) {
            return;
        }
        this.f47205z = System.nanoTime();
    }

    public void s() {
        if (this.f47180a) {
            return;
        }
        long jNanoTime = System.nanoTime();
        this.f47204y = jNanoTime;
        this.f47188i = (jNanoTime - this.f47203x) / 1000000;
    }

    public void t() {
        if (this.f47180a) {
            return;
        }
        this.f47198s = System.nanoTime();
    }

    public void u() {
        if (this.f47180a) {
            return;
        }
        this.f47197r = System.nanoTime();
    }

    public void b(long j10) {
        if (this.f47180a) {
            return;
        }
        this.f47189j = (System.nanoTime() - this.f47204y) / 1000000;
        this.f47183d = j10;
    }

    public void a(boolean z10) {
        this.f47180a = z10;
        if (z10) {
            this.f47181b++;
        }
    }

    public void a(long j10) {
        if (this.f47180a) {
            return;
        }
        this.f47187h = (System.nanoTime() - this.f47200u) / 1000000;
        this.f47182c = j10;
    }

    public void a() {
        if (this.f47180a) {
            return;
        }
        k();
    }

    public void a(IOException iOException) {
        if (this.f47180a) {
            return;
        }
        k();
    }

    public void a(String str) {
        if (H) {
            try {
                int iH = m0.h();
                int iV = m0.v();
                HashMap map = new HashMap();
                map.put("reason", str);
                map.put("timestamp", Long.valueOf(System.currentTimeMillis()));
                map.put("available_memory_mb", Integer.valueOf(iH));
                map.put("total_memory_mb", Integer.valueOf(iV));
                j().put("task_rejection", map);
            } catch (Exception e10) {
                q0.b("NetworkRequestMonitor", "Failed to record task rejection: " + e10.getMessage());
            }
        }
    }
}
