package com.mbridge.msdk.tracker;

import android.util.Log;
import com.mbridge.msdk.tracker.network.b0;
import com.mbridge.msdk.tracker.network.t;
import com.mbridge.msdk.tracker.network.v;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private r f51996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f51997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p f51998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w f51999d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f52000e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.tracker.network.u f52001f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Executor f52002g;

    class a implements ThreadFactory {
        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "MBridgeReportResponseThread");
        }
    }

    private static final class b implements v.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final r f52004a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final t f52005b;

        public b(r rVar, t tVar) {
            this.f52004a = rVar;
            this.f52005b = tVar;
        }

        @Override // com.mbridge.msdk.tracker.network.v.a
        public void a(b0 b0Var) {
            int iD;
            int iG;
            String message;
            if (y.a(this.f52004a)) {
                if (b0Var != null) {
                    try {
                        iD = b0Var.d();
                        iG = b0Var.g();
                        message = b0Var.getMessage();
                    } catch (Exception e10) {
                        if (com.mbridge.msdk.tracker.a.f51797a) {
                            Log.e("TrackManager", "onErrorResponse error", e10);
                            return;
                        }
                        return;
                    }
                } else {
                    iG = 0;
                    message = "";
                    iD = 0;
                }
                this.f52004a.a(this.f52005b, 0, String.format("volleyError:%s,responseCode:%s,errorMessage:%s", Integer.valueOf(iD), Integer.valueOf(iG), message));
            }
        }
    }

    private static final class c implements v.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final r f52006a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final t f52007b;

        public c(r rVar, t tVar) {
            this.f52006a = rVar;
            this.f52007b = tVar;
        }

        @Override // com.mbridge.msdk.tracker.network.v.b
        public void a(Object obj) {
            if (y.a(this.f52006a)) {
                try {
                    this.f52006a.a(this.f52007b);
                } catch (Exception e10) {
                    if (com.mbridge.msdk.tracker.a.f51797a) {
                        Log.e("TrackManager", "onResponse error", e10);
                    }
                }
            }
        }
    }

    public o(int i10, p pVar, w wVar, int i11) {
        this.f51997b = i10;
        this.f51998c = pVar;
        this.f51999d = wVar;
        this.f52000e = i11;
        this.f52002g = new ThreadPoolExecutor(i10, i10, 20L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a(), new ThreadPoolExecutor.DiscardPolicy());
    }

    public void a(r rVar) {
        this.f51996a = rVar;
    }

    public void b(t tVar, Map<String, String> map, boolean z10) {
        if (y.b(map)) {
            r rVar = this.f51996a;
            if (rVar != null) {
                try {
                    rVar.a(tVar, 0, "params is null");
                    return;
                } catch (Exception e10) {
                    if (com.mbridge.msdk.tracker.a.f51797a) {
                        Log.e("TrackManager", "send error", e10);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        try {
            a();
            this.f52001f.a(a(tVar, map, z10));
        } catch (Exception e11) {
            if (com.mbridge.msdk.tracker.a.f51797a) {
                Log.e("TrackManager", "send error", e11);
            }
            if (y.a(this.f51996a)) {
                this.f51996a.a(tVar, 0, e11.getMessage());
            }
        }
    }

    private v<Object> a(t tVar, Map<String, String> map, boolean z10) {
        v<Object> vVar = this.f52000e == 1 ? new v<>(this.f51998c.c(), 1, this.f51998c.a()) : new v<>(this.f51998c.c(), 1);
        vVar.a(map);
        vVar.a(false);
        vVar.c(true);
        vVar.b(true);
        vVar.a(this.f51999d);
        vVar.a(z10 ? t.a.HIGH : t.a.NORMAL);
        vVar.a((v.b<Object>) new c(this.f51996a, tVar));
        vVar.a((v.a) new b(this.f51996a, tVar));
        return vVar;
    }

    private void a() {
        if (y.a(this.f52001f)) {
            return;
        }
        com.mbridge.msdk.tracker.network.u uVarA = com.mbridge.msdk.tracker.network.toolbox.o.a(new com.mbridge.msdk.tracker.network.toolbox.b(this.f51998c.b()), new com.mbridge.msdk.tracker.network.f(this.f52002g), this.f51997b, null);
        this.f52001f = uVarA;
        uVarA.b();
    }
}
