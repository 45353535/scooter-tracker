package com.fyber.inneractive.sdk.network;

import android.util.Log;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public abstract class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f21374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0 f21375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f21376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p0 f21377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l f21378e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile i1 f21379f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f21380g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.global.r f21381h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f21382i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f21383j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f21384k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f21385l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f21386m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f21387n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f21388o;

    public t0(f0 f0Var, h hVar, com.fyber.inneractive.sdk.config.global.r rVar) {
        this.f21374a = false;
        this.f21379f = i1.INITIAL;
        this.f21382i = 0L;
        this.f21383j = 0L;
        this.f21384k = 0;
        this.f21385l = false;
        this.f21386m = false;
        this.f21387n = new Object();
        this.f21388o = false;
        this.f21375b = f0Var;
        this.f21376c = hVar;
        this.f21380g = UUID.randomUUID().toString();
        this.f21381h = rVar;
    }

    public abstract o0 a(l lVar, Map map, int i10);

    public void a(o0 o0Var, String str, String str2) {
    }

    public void b(long j10) {
        synchronized (this.f21387n) {
            try {
                if (this.f21386m) {
                    this.f21384k = (int) ((j10 - this.f21382i) + ((long) this.f21384k));
                    this.f21386m = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void c() {
        this.f21374a = true;
    }

    public void d() {
        boolean z10;
        synchronized (this.f21387n) {
            z10 = this.f21385l;
        }
        if (z10) {
            a(System.currentTimeMillis());
        } else if (t()) {
            b(System.currentTimeMillis());
        }
    }

    public void e() {
        try {
            l lVar = this.f21378e;
            if (lVar != null) {
                lVar.a();
            }
            this.f21376c.getClass();
        } catch (Exception unused) {
        }
    }

    public byte[] f() {
        return null;
    }

    public abstract int g();

    public String h() {
        return null;
    }

    public a i() {
        return null;
    }

    public int j() {
        return this.f21384k;
    }

    public com.fyber.inneractive.sdk.config.global.r k() {
        return this.f21381h;
    }

    public Map l() {
        return null;
    }

    public abstract m0 m();

    public String n() {
        return "application/json; charset=utf-8";
    }

    public abstract g1 o();

    public l1 p() {
        IAConfigManager iAConfigManager = IAConfigManager.O;
        return new l1(iAConfigManager.f20315u.f20484b.a("connect_timeout", 5000, 1), iAConfigManager.f20315u.f20484b.a("read_timeout", 5000, 1));
    }

    public int q() {
        int i10;
        synchronized (this.f21387n) {
            i10 = this.f21384k;
        }
        return i10;
    }

    public abstract String r();

    public int s() {
        Integer numA;
        com.fyber.inneractive.sdk.config.global.r rVar = this.f21381h;
        if (rVar == null || (numA = ((com.fyber.inneractive.sdk.config.global.features.k) rVar.a(com.fyber.inneractive.sdk.config.global.features.k.class)).a("watchdog_buffer_time_ms")) == null) {
            return 500;
        }
        return numA.intValue();
    }

    public final boolean t() {
        boolean z10;
        synchronized (this.f21387n) {
            z10 = this.f21386m;
        }
        return z10;
    }

    public abstract boolean u();

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean v() {
        /*
            r4 = this;
            boolean r0 = r4.f21388o
            r1 = 0
            if (r0 == 0) goto L39
            com.fyber.inneractive.sdk.config.IAConfigManager r0 = com.fyber.inneractive.sdk.config.IAConfigManager.O
            com.fyber.inneractive.sdk.config.global.r r0 = r0.M
            java.lang.Class<com.fyber.inneractive.sdk.config.global.features.k> r2 = com.fyber.inneractive.sdk.config.global.features.k.class
            com.fyber.inneractive.sdk.config.global.features.h r0 = r0.a(r2)
            com.fyber.inneractive.sdk.config.global.features.k r0 = (com.fyber.inneractive.sdk.config.global.features.k) r0
            java.lang.String r2 = "should_add_request_watchdog"
            java.lang.Boolean r2 = r0.c(r2)
            if (r2 == 0) goto L1e
            boolean r2 = r2.booleanValue()
            goto L1f
        L1e:
            r2 = r1
        L1f:
            r3 = 1
            if (r2 != 0) goto L35
            java.lang.String r2 = "should_report_request_watchdog"
            java.lang.Boolean r0 = r0.c(r2)
            if (r0 == 0) goto L2f
            boolean r0 = r0.booleanValue()
            goto L30
        L2f:
            r0 = r1
        L30:
            if (r0 == 0) goto L33
            goto L35
        L33:
            r0 = r1
            goto L36
        L35:
            r0 = r3
        L36:
            if (r0 == 0) goto L39
            return r3
        L39:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.network.t0.v():boolean");
    }

    public l a(String str) throws Exception {
        try {
            p0 p0Var = this.f21377d;
            if (p0Var != null) {
                p0Var.a("sdkInitNetworkRequest");
            }
            this.f21378e = this.f21376c.a(this, com.fyber.inneractive.sdk.util.o.h(), str);
            p0 p0Var2 = this.f21377d;
            if (p0Var2 != null) {
                p0Var2.a("sdkGotServerResponse");
            }
            return this.f21378e;
        } catch (b e10) {
            IAlog.a("failed start network request for url: %s msg: %s", r(), e10.getMessage());
            throw e10;
        } catch (q1 e11) {
            IAlog.a("failed read network response for url: %s msg: %s", r(), e11.getMessage());
            throw e11;
        } catch (Exception e12) {
            IAlog.a("failed start network request for url: %s msg: %s", r(), e12.getMessage());
            throw e12;
        }
    }

    public void c(long j10) {
        synchronized (this.f21387n) {
            try {
                if (!this.f21385l) {
                    this.f21385l = true;
                    this.f21383j = j10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void d(long j10) {
        synchronized (this.f21387n) {
            try {
                if (!this.f21386m) {
                    this.f21386m = true;
                    this.f21382i = j10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public t0(t0 t0Var) {
        this.f21374a = false;
        this.f21379f = i1.INITIAL;
        this.f21382i = 0L;
        this.f21383j = 0L;
        this.f21384k = 0;
        this.f21385l = false;
        this.f21386m = false;
        this.f21387n = new Object();
        this.f21388o = false;
        this.f21375b = t0Var.f21375b;
        this.f21376c = t0Var.f21376c;
        this.f21380g = UUID.randomUUID().toString();
        this.f21381h = t0Var.f21381h;
        this.f21384k = t0Var.f21384k;
        this.f21382i = t0Var.f21382i;
        this.f21383j = t0Var.f21383j;
    }

    public final void a(Object obj, Exception exc, boolean z10) {
        p0 p0Var;
        if (!z10) {
            i1 i1Var = i1.RESOLVED;
            this.f21379f = i1Var;
            if (i1Var == i1.QUEUED_FOR_RETRY && (p0Var = this.f21377d) != null) {
                p0Var.a("sdkRequestEndedButWillBeRetried");
            }
        }
        com.fyber.inneractive.sdk.util.r.f23896b.post(new s0(this, obj, exc, z10));
    }

    public final com.fyber.inneractive.sdk.response.e a(int i10, o oVar, com.fyber.inneractive.sdk.response.j jVar, com.fyber.inneractive.sdk.dv.j jVar2) throws n0 {
        try {
            com.fyber.inneractive.sdk.response.a aVarA = com.fyber.inneractive.sdk.response.a.a(i10);
            if (aVarA == null) {
                aVarA = com.fyber.inneractive.sdk.response.a.RETURNED_ADTYPE_MRAID;
            }
            com.fyber.inneractive.sdk.factories.f fVar = com.fyber.inneractive.sdk.factories.d.f20613a;
            com.fyber.inneractive.sdk.factories.e eVar = (com.fyber.inneractive.sdk.factories.e) fVar.f20614a.get(aVarA);
            com.fyber.inneractive.sdk.response.b bVarB = eVar != null ? eVar.b() : null;
            if (bVarB == null) {
                IAlog.f("Received ad type %s does not have an appropriate parser!", Integer.valueOf(i10));
                if (fVar.f20614a.size() == 0) {
                    Log.e("Inneractive_error", "Critical error raised while fetching an ad - please make sure you have added all the required fyber libraries (ia-mraid-kit, ia-video-kit) to your project");
                }
                throw new n0("Could not find parser for ad type " + i10);
            }
            IAlog.a("Received ad type %s - Got parser! %s", Integer.valueOf(i10), bVarB);
            if (jVar != null) {
                bVarB.f23712c = jVar;
            }
            bVarB.f23710a = bVarB.a();
            if (oVar != null) {
                bVarB.f23712c = new com.fyber.inneractive.sdk.response.k(oVar);
            }
            com.fyber.inneractive.sdk.response.e eVarA = bVarB.a(null);
            eVarA.K = j();
            if (jVar2 != null) {
                eVarA.f23741u = jVar2;
            }
            p0 p0Var = this.f21377d;
            if (p0Var != null) {
                p0Var.a("sdkParsedResponse");
            }
            return eVarA;
        } catch (Exception e10) {
            IAlog.a("failed parse ad network request url: %s msg: %s", r(), e10.getMessage());
            throw new n0(e10);
        }
    }

    public static int a(Map map) {
        List list = map != null ? (List) map.get("Content-Length") : null;
        if (list != null) {
            return com.fyber.inneractive.sdk.util.v.a((String) list.get(0), -1);
        }
        return -1;
    }

    public void a(long j10) {
        synchronized (this.f21387n) {
            try {
                if (this.f21385l) {
                    this.f21384k = (int) ((j10 - this.f21383j) + ((long) this.f21384k));
                    this.f21385l = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
