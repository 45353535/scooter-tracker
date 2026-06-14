package io.sentry.android.core;

import com.ironsource.C4240b4;
import io.sentry.android.core.performance.h;
import io.sentry.h2;
import io.sentry.p8;
import io.sentry.u8;
import io.sentry.w6;
import io.sentry.w7;
import io.sentry.w8;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class y1 implements io.sentry.d0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i f82811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SentryAndroidOptions f82812d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f82810b = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final io.sentry.util.a f82813e = new io.sentry.util.a();

    y1(SentryAndroidOptions sentryAndroidOptions, i iVar) {
        this.f82812d = (SentryAndroidOptions) io.sentry.util.w.c(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f82811c = (i) io.sentry.util.w.c(iVar, "ActivityFramesTracker is required");
    }

    private void a(io.sentry.android.core.performance.h hVar, io.sentry.protocol.e0 e0Var) {
        p8 p8VarJ;
        u8 u8VarE;
        if (hVar.m() == h.a.COLD && (p8VarJ = e0Var.C().j()) != null) {
            io.sentry.protocol.x xVarP = p8VarJ.p();
            Iterator it = e0Var.q0().iterator();
            while (true) {
                if (!it.hasNext()) {
                    u8VarE = null;
                    break;
                }
                io.sentry.protocol.a0 a0Var = (io.sentry.protocol.a0) it.next();
                if (a0Var.d().contentEquals("app.start.cold")) {
                    u8VarE = a0Var.e();
                    break;
                }
            }
            io.sentry.android.core.performance.i iVarG = hVar.g();
            if (iVarG.m() && Math.abs(iVarG.c()) <= 10000) {
                e0Var.q0().add(h(iVarG, u8VarE, xVarP, "process.load"));
            }
            List listO = hVar.o();
            if (!listO.isEmpty()) {
                Iterator it2 = listO.iterator();
                while (it2.hasNext()) {
                    e0Var.q0().add(h((io.sentry.android.core.performance.i) it2.next(), u8VarE, xVarP, "contentprovider.load"));
                }
            }
            io.sentry.android.core.performance.i iVarN = hVar.n();
            if (iVarN.n()) {
                e0Var.q0().add(h(iVarN, u8VarE, xVarP, "application.load"));
            }
        }
    }

    private boolean b(io.sentry.protocol.e0 e0Var) {
        for (io.sentry.protocol.a0 a0Var : e0Var.q0()) {
            if (a0Var.d().contentEquals("app.start.cold") || a0Var.d().contentEquals("app.start.warm")) {
                return true;
            }
        }
        p8 p8VarJ = e0Var.C().j();
        if (p8VarJ != null) {
            return p8VarJ.f().equals("app.start.cold") || p8VarJ.f().equals("app.start.warm");
        }
        return false;
    }

    private static boolean f(double d10, io.sentry.protocol.a0 a0Var) {
        if (d10 >= a0Var.f().doubleValue()) {
            return a0Var.g() == null || d10 <= a0Var.g().doubleValue();
        }
        return false;
    }

    private void g(io.sentry.protocol.e0 e0Var) {
        Object obj;
        io.sentry.protocol.a0 a0Var = null;
        io.sentry.protocol.a0 a0Var2 = null;
        for (io.sentry.protocol.a0 a0Var3 : e0Var.q0()) {
            if ("ui.load.initial_display".equals(a0Var3.d())) {
                a0Var = a0Var3;
            } else if ("ui.load.full_display".equals(a0Var3.d())) {
                a0Var2 = a0Var3;
            }
            if (a0Var != null && a0Var2 != null) {
                break;
            }
        }
        if (a0Var == null && a0Var2 == null) {
            return;
        }
        for (io.sentry.protocol.a0 a0Var4 : e0Var.q0()) {
            if (a0Var4 != a0Var && a0Var4 != a0Var2) {
                Map mapB = a0Var4.b();
                boolean z10 = false;
                boolean z11 = a0Var != null && f(a0Var4.f().doubleValue(), a0Var) && (mapB == null || (obj = mapB.get("thread.name")) == null || C4240b4.i.Z.equals(obj));
                if (a0Var2 != null && f(a0Var4.f().doubleValue(), a0Var2)) {
                    z10 = true;
                }
                if (z11 || z10) {
                    Map mapB2 = a0Var4.b();
                    if (mapB2 == null) {
                        mapB2 = new ConcurrentHashMap();
                        a0Var4.h(mapB2);
                    }
                    if (z11) {
                        mapB2.put("ui.contributes_to_ttid", Boolean.TRUE);
                    }
                    if (z10) {
                        mapB2.put("ui.contributes_to_ttfd", Boolean.TRUE);
                    }
                }
            }
        }
    }

    private static io.sentry.protocol.a0 h(io.sentry.android.core.performance.i iVar, u8 u8Var, io.sentry.protocol.x xVar, String str) {
        HashMap map = new HashMap(2);
        map.put("thread.id", Long.valueOf(io.sentry.android.core.internal.util.l.f82584b));
        map.put("thread.name", C4240b4.i.Z);
        Boolean bool = Boolean.TRUE;
        map.put("ui.contributes_to_ttid", bool);
        map.put("ui.contributes_to_ttfd", bool);
        return new io.sentry.protocol.a0(Double.valueOf(iVar.i()), Double.valueOf(iVar.f()), xVar, new u8(), u8Var, str, iVar.getDescription(), w8.OK, "auto.ui", new ConcurrentHashMap(), new ConcurrentHashMap(), map);
    }

    @Override // io.sentry.d0
    public /* synthetic */ w7 c(w7 w7Var, io.sentry.i0 i0Var) {
        return io.sentry.c0.a(this, w7Var, i0Var);
    }

    @Override // io.sentry.d0
    public w6 d(w6 w6Var, io.sentry.i0 i0Var) {
        return w6Var;
    }

    @Override // io.sentry.d0
    public io.sentry.protocol.e0 e(io.sentry.protocol.e0 e0Var, io.sentry.i0 i0Var) {
        Map mapN;
        io.sentry.g1 g1VarD = this.f82813e.d();
        try {
            if (!this.f82812d.isTracingEnabled()) {
                if (g1VarD != null) {
                    g1VarD.close();
                }
                return e0Var;
            }
            io.sentry.android.core.performance.h hVarP = io.sentry.android.core.performance.h.p();
            if (b(e0Var)) {
                if (hVarP.x()) {
                    long jC = hVarP.l(this.f82812d).c();
                    if (jC != 0) {
                        e0Var.o0().put(hVarP.m() == h.a.COLD ? "app_start_cold" : "app_start_warm", new io.sentry.protocol.k(Float.valueOf(jC), h2.a.MILLISECOND.apiName()));
                        a(hVarP, e0Var);
                        hVarP.r();
                    }
                }
                io.sentry.protocol.a aVarD = e0Var.C().d();
                if (aVarD == null) {
                    aVarD = new io.sentry.protocol.a();
                    e0Var.C().o(aVarD);
                }
                aVarD.v(hVarP.m() == h.a.COLD ? "cold" : "warm");
            }
            g(e0Var);
            io.sentry.protocol.x xVarG = e0Var.G();
            p8 p8VarJ = e0Var.C().j();
            if (xVarG != null && p8VarJ != null && p8VarJ.f().contentEquals("ui.load") && (mapN = this.f82811c.n(xVarG)) != null) {
                e0Var.o0().putAll(mapN);
            }
            if (g1VarD != null) {
                g1VarD.close();
            }
            return e0Var;
        } catch (Throwable th2) {
            if (g1VarD != null) {
                try {
                    g1VarD.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }
}
