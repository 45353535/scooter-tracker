package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.util.DisplayMetrics;
import com.ironsource.C4240b4;
import io.sentry.android.core.c1;
import io.sentry.g7;
import io.sentry.n5;
import io.sentry.p8;
import io.sentry.protocol.DebugImage;
import io.sentry.util.runtime.a;
import io.sentry.v7;
import io.sentry.w6;
import io.sentry.w7;
import io.sentry.x6;
import io.sentry.z7;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class r0 implements io.sentry.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f82736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SentryAndroidOptions f82737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w0 f82738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final x6 f82739e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final io.sentry.cache.q f82740f;

    public r0(Context context, SentryAndroidOptions sentryAndroidOptions, w0 w0Var) {
        this.f82736b = c1.f(context);
        this.f82737c = sentryAndroidOptions;
        this.f82738d = w0Var;
        this.f82740f = sentryAndroidOptions.findPersistingScopeObserver();
        this.f82739e = new x6(new z7(sentryAndroidOptions));
    }

    private void A(n5 n5Var) {
        Map map = (Map) io.sentry.cache.h.i(this.f82737c, "tags.json", Map.class);
        if (map == null) {
            return;
        }
        if (n5Var.N() == null) {
            n5Var.g0(new HashMap(map));
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!n5Var.N().containsKey(entry.getKey())) {
                n5Var.f0((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    private void B(n5 n5Var) {
        if (n5Var.I() == null) {
            n5Var.a0("java");
        }
    }

    private void C(n5 n5Var) {
        if (n5Var.J() == null) {
            n5Var.b0((String) io.sentry.cache.h.i(this.f82737c, "release.json", String.class));
        }
    }

    private void D(w6 w6Var) {
        String str = (String) n(this.f82737c, "replay.json", String.class);
        if (!new File(this.f82737c.getCacheDirPath(), "replay_" + str).exists()) {
            if (!o(w6Var)) {
                return;
            }
            File[] fileArrListFiles = new File(this.f82737c.getCacheDirPath()).listFiles();
            String strSubstring = null;
            if (fileArrListFiles != null) {
                long jLastModified = Long.MIN_VALUE;
                for (File file : fileArrListFiles) {
                    if (file.isDirectory() && file.getName().startsWith("replay_") && file.lastModified() > jLastModified && file.lastModified() <= w6Var.x0().getTime()) {
                        jLastModified = file.lastModified();
                        strSubstring = file.getName().substring(7);
                    }
                }
            }
            str = strSubstring;
        }
        if (str == null) {
            return;
        }
        io.sentry.cache.q.u(this.f82737c, str, "replay.json");
        w6Var.C().l("replay_id", str);
    }

    private void E(n5 n5Var) {
        if (n5Var.K() == null) {
            n5Var.c0((io.sentry.protocol.o) n(this.f82737c, "request.json", io.sentry.protocol.o.class));
        }
    }

    private void F(n5 n5Var) {
        Map map = (Map) n(this.f82737c, "tags.json", Map.class);
        if (map == null) {
            return;
        }
        if (n5Var.N() == null) {
            n5Var.g0(new HashMap(map));
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!n5Var.N().containsKey(entry.getKey())) {
                n5Var.f0((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    private void G(n5 n5Var) {
        if (n5Var.L() == null) {
            n5Var.d0((io.sentry.protocol.r) io.sentry.cache.h.i(this.f82737c, "sdk-version.json", io.sentry.protocol.r.class));
        }
    }

    private void H(n5 n5Var) {
        try {
            c1.a aVarN = l1.k(this.f82736b, this.f82737c).n();
            if (aVarN != null) {
                for (Map.Entry entry : aVarN.a().entrySet()) {
                    n5Var.f0((String) entry.getKey(), (String) entry.getValue());
                }
            }
        } catch (Throwable th2) {
            this.f82737c.getLogger().a(g7.ERROR, "Error getting side loaded info.", th2);
        }
    }

    private void I(w6 w6Var) {
        m(w6Var);
        H(w6Var);
    }

    private void J(w6 w6Var) {
        p8 p8Var = (p8) n(this.f82737c, "trace.json", p8.class);
        if (w6Var.C().j() != null || p8Var == null || p8Var.m() == null || p8Var.p() == null) {
            return;
        }
        w6Var.C().z(p8Var);
    }

    private void K(w6 w6Var) {
        String str = (String) n(this.f82737c, "transaction.json", String.class);
        if (w6Var.y0() == null) {
            w6Var.J0(str);
        }
    }

    private void L(n5 n5Var) {
        if (n5Var.Q() == null) {
            n5Var.h0((io.sentry.protocol.i0) n(this.f82737c, "user.json", io.sentry.protocol.i0.class));
        }
    }

    private void b(w6 w6Var, Object obj) {
        C(w6Var);
        v(w6Var);
        u(w6Var);
        s(w6Var);
        G(w6Var);
        p(w6Var, obj);
        A(w6Var);
    }

    private void f(w6 w6Var, Object obj) {
        E(w6Var);
        L(w6Var);
        F(w6Var);
        q(w6Var);
        x(w6Var);
        r(w6Var);
        K(w6Var);
        y(w6Var, obj);
        z(w6Var);
        J(w6Var);
        D(w6Var);
    }

    private io.sentry.protocol.d0 g(List list) {
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            io.sentry.protocol.d0 d0Var = (io.sentry.protocol.d0) it.next();
            String strM = d0Var.m();
            if (strM != null && strM.equals(C4240b4.i.Z)) {
                return d0Var;
            }
        }
        return null;
    }

    private io.sentry.protocol.e h() {
        io.sentry.protocol.e eVar = new io.sentry.protocol.e();
        eVar.f0(Build.MANUFACTURER);
        eVar.T(Build.BRAND);
        eVar.Z(c1.k(this.f82737c.getLogger()));
        eVar.h0(Build.MODEL);
        eVar.i0(Build.ID);
        eVar.P(c1.i());
        ActivityManager.MemoryInfo memoryInfoM = c1.m(this.f82736b, this.f82737c.getLogger());
        if (memoryInfoM != null) {
            eVar.g0(j(memoryInfoM));
        }
        eVar.r0(this.f82738d.f());
        DisplayMetrics displayMetricsJ = c1.j(this.f82736b, this.f82737c.getLogger());
        if (displayMetricsJ != null) {
            eVar.q0(Integer.valueOf(displayMetricsJ.widthPixels));
            eVar.p0(Integer.valueOf(displayMetricsJ.heightPixels));
            eVar.n0(Float.valueOf(displayMetricsJ.density));
            eVar.o0(Integer.valueOf(displayMetricsJ.densityDpi));
        }
        if (eVar.L() == null) {
            eVar.c0(i());
        }
        List listC = io.sentry.android.core.internal.util.n.a().c();
        if (!listC.isEmpty()) {
            eVar.m0(Double.valueOf(((Integer) Collections.max(listC)).doubleValue()));
            eVar.l0(Integer.valueOf(listC.size()));
        }
        return eVar;
    }

    private String i() {
        try {
            return (String) this.f82737c.getRuntimeManager().a(new a.InterfaceC1016a() { // from class: io.sentry.android.core.q0
                @Override // io.sentry.util.runtime.a.InterfaceC1016a
                public final Object run() {
                    return p1.a(this.f82733a.f82736b);
                }
            });
        } catch (Throwable th2) {
            this.f82737c.getLogger().a(g7.ERROR, "Error getting installationId.", th2);
            return null;
        }
    }

    private Long j(ActivityManager.MemoryInfo memoryInfo) {
        return Long.valueOf(memoryInfo.totalMem);
    }

    private boolean k(Object obj) {
        if (obj instanceof io.sentry.hints.a) {
            return "anr_background".equals(((io.sentry.hints.a) obj).d());
        }
        return false;
    }

    private void l(n5 n5Var) {
        String str;
        io.sentry.protocol.n nVarH = n5Var.C().h();
        n5Var.C().u(l1.k(this.f82736b, this.f82737c).l());
        if (nVarH != null) {
            String strG = nVarH.g();
            if (strG == null || strG.isEmpty()) {
                str = "os_1";
            } else {
                str = "os_" + strG.trim().toLowerCase(Locale.ROOT);
            }
            n5Var.C().l(str, nVarH);
        }
    }

    private void m(n5 n5Var) {
        io.sentry.protocol.i0 i0VarQ = n5Var.Q();
        if (i0VarQ == null) {
            i0VarQ = new io.sentry.protocol.i0();
            n5Var.h0(i0VarQ);
        }
        if (i0VarQ.h() == null) {
            i0VarQ.j(i());
        }
        if (i0VarQ.i() == null && this.f82737c.isSendDefaultPii()) {
            i0VarQ.k("{{auto}}");
        }
    }

    private Object n(v7 v7Var, String str, Class cls) {
        io.sentry.cache.q qVar = this.f82740f;
        if (qVar == null) {
            return null;
        }
        return qVar.r(v7Var, str, cls);
    }

    private boolean o(w6 w6Var) {
        String str = (String) io.sentry.cache.h.i(this.f82737c, "replay-error-sample-rate.json", String.class);
        if (str == null) {
            return false;
        }
        try {
            if (Double.parseDouble(str) >= io.sentry.util.b0.a().h()) {
                return true;
            }
            this.f82737c.getLogger().c(g7.DEBUG, "Not capturing replay for ANR %s due to not being sampled.", w6Var.G());
            return false;
        } catch (Throwable th2) {
            this.f82737c.getLogger().a(g7.ERROR, "Error parsing replay sample rate.", th2);
            return false;
        }
    }

    private void p(n5 n5Var, Object obj) {
        io.sentry.protocol.a aVarD = n5Var.C().d();
        if (aVarD == null) {
            aVarD = new io.sentry.protocol.a();
        }
        aVarD.o(c1.h(this.f82736b));
        aVarD.r(Boolean.valueOf(!k(obj)));
        PackageInfo packageInfoO = c1.o(this.f82736b, this.f82738d);
        if (packageInfoO != null) {
            aVarD.n(packageInfoO.packageName);
        }
        String strJ = n5Var.J() != null ? n5Var.J() : (String) io.sentry.cache.h.i(this.f82737c, "release.json", String.class);
        if (strJ != null) {
            try {
                String strSubstring = strJ.substring(strJ.indexOf(64) + 1, strJ.indexOf(43));
                String strSubstring2 = strJ.substring(strJ.indexOf(43) + 1);
                aVarD.q(strSubstring);
                aVarD.m(strSubstring2);
            } catch (Throwable unused) {
                this.f82737c.getLogger().c(g7.WARNING, "Failed to parse release from scope cache: %s", strJ);
            }
        }
        try {
            c1.b bVarO = l1.k(this.f82736b, this.f82737c).o();
            if (bVarO != null) {
                aVarD.t(Boolean.valueOf(bVarO.b()));
                if (bVarO.a() != null) {
                    aVarD.u(Arrays.asList(bVarO.a()));
                }
            }
        } catch (Throwable th2) {
            this.f82737c.getLogger().a(g7.ERROR, "Error getting split apks info.", th2);
        }
        n5Var.C().o(aVarD);
    }

    private void q(n5 n5Var) {
        List list = (List) n(this.f82737c, "breadcrumbs.json", List.class);
        if (list == null) {
            return;
        }
        if (n5Var.B() == null) {
            n5Var.T(list);
        } else {
            n5Var.B().addAll(list);
        }
    }

    private void r(n5 n5Var) {
        io.sentry.protocol.c cVar = (io.sentry.protocol.c) n(this.f82737c, "contexts.json", io.sentry.protocol.c.class);
        if (cVar == null) {
            return;
        }
        io.sentry.protocol.c cVarC = n5Var.C();
        for (Map.Entry entry : new io.sentry.protocol.c(cVar).b()) {
            Object value = entry.getValue();
            if (!"trace".equals(entry.getKey()) || !(value instanceof p8)) {
                if (!cVarC.a(entry.getKey())) {
                    cVarC.l((String) entry.getKey(), value);
                }
            }
        }
    }

    private void s(n5 n5Var) {
        io.sentry.protocol.d dVarD = n5Var.D();
        if (dVarD == null) {
            dVarD = new io.sentry.protocol.d();
        }
        if (dVarD.d() == null) {
            dVarD.e(new ArrayList());
        }
        List listD = dVarD.d();
        if (listD != null) {
            String str = (String) io.sentry.cache.h.i(this.f82737c, "proguard-uuid.json", String.class);
            if (str != null) {
                DebugImage debugImage = new DebugImage();
                debugImage.setType(DebugImage.PROGUARD);
                debugImage.setUuid(str);
                listD.add(debugImage);
            }
            n5Var.U(dVarD);
        }
    }

    private void t(n5 n5Var) {
        if (n5Var.C().e() == null) {
            n5Var.C().q(h());
        }
    }

    private void u(n5 n5Var) {
        String str;
        if (n5Var.E() == null) {
            n5Var.V((String) io.sentry.cache.h.i(this.f82737c, "dist.json", String.class));
        }
        if (n5Var.E() != null || (str = (String) io.sentry.cache.h.i(this.f82737c, "release.json", String.class)) == null) {
            return;
        }
        try {
            n5Var.V(str.substring(str.indexOf(43) + 1));
        } catch (Throwable unused) {
            this.f82737c.getLogger().c(g7.WARNING, "Failed to parse release from scope cache: %s", str);
        }
    }

    private void v(n5 n5Var) {
        if (n5Var.F() == null) {
            String environment = (String) io.sentry.cache.h.i(this.f82737c, "environment.json", String.class);
            if (environment == null) {
                environment = this.f82737c.getEnvironment();
            }
            n5Var.W(environment);
        }
    }

    private void w(w6 w6Var, Object obj) {
        io.sentry.protocol.l lVar = new io.sentry.protocol.l();
        if (((io.sentry.hints.c) obj).e()) {
            lVar.q("AppExitInfo");
        } else {
            lVar.q("HistoricalAppExitInfo");
        }
        String str = "ANR";
        if (k(obj)) {
            str = "Background ANR";
        }
        ApplicationNotResponding applicationNotResponding = new ApplicationNotResponding(str, Thread.currentThread());
        io.sentry.protocol.d0 d0VarG = g(w6Var.w0());
        if (d0VarG == null) {
            d0VarG = new io.sentry.protocol.d0();
            d0VarG.y(new io.sentry.protocol.c0());
        }
        w6Var.C0(this.f82739e.f(d0VarG, lVar, applicationNotResponding));
    }

    private void x(n5 n5Var) {
        Map map = (Map) n(this.f82737c, "extras.json", Map.class);
        if (map == null) {
            return;
        }
        if (n5Var.H() == null) {
            n5Var.Z(new HashMap(map));
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!n5Var.H().containsKey(entry.getKey())) {
                n5Var.H().put((String) entry.getKey(), entry.getValue());
            }
        }
    }

    private void y(w6 w6Var, Object obj) {
        List list = (List) n(this.f82737c, "fingerprint.json", List.class);
        if (w6Var.s0() == null) {
            w6Var.D0(list);
        }
        boolean zK = k(obj);
        if (w6Var.s0() == null) {
            w6Var.D0(Arrays.asList("{{ default }}", zK ? "background-anr" : "foreground-anr"));
        }
    }

    private void z(w6 w6Var) {
        g7 g7Var = (g7) n(this.f82737c, "level.json", g7.class);
        if (w6Var.t0() == null) {
            w6Var.E0(g7Var);
        }
    }

    @Override // io.sentry.d0
    public /* synthetic */ w7 c(w7 w7Var, io.sentry.i0 i0Var) {
        return io.sentry.c0.a(this, w7Var, i0Var);
    }

    @Override // io.sentry.d0
    public w6 d(w6 w6Var, io.sentry.i0 i0Var) {
        Object objG = io.sentry.util.m.g(i0Var);
        if (!(objG instanceof io.sentry.hints.c)) {
            this.f82737c.getLogger().c(g7.WARNING, "The event is not Backfillable, but has been passed to BackfillingEventProcessor, skipping.", new Object[0]);
            return w6Var;
        }
        w(w6Var, objG);
        B(w6Var);
        l(w6Var);
        t(w6Var);
        if (!((io.sentry.hints.c) objG).e()) {
            this.f82737c.getLogger().c(g7.DEBUG, "The event is Backfillable, but should not be enriched, skipping.", new Object[0]);
            return w6Var;
        }
        f(w6Var, objG);
        b(w6Var, objG);
        I(w6Var);
        return w6Var;
    }

    @Override // io.sentry.d0
    public io.sentry.protocol.e0 e(io.sentry.protocol.e0 e0Var, io.sentry.i0 i0Var) {
        return e0Var;
    }
}
