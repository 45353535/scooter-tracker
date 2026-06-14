package io.sentry;

import com.adjust.sdk.purchase.ADJPConstants;
import io.sentry.v7;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 {
    private Boolean A;
    private Boolean B;
    private String C;
    private List D;
    private List E;
    private Boolean F;
    private Boolean G;
    private Boolean H;
    private Boolean I;
    private Boolean J;
    private Boolean K;
    private Double L;
    private String M;
    private w3 N;
    private v7.f O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f83460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f83461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f83462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f83463d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f83464e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Boolean f83465f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Boolean f83466g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Boolean f83467h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Double f83468i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Double f83469j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private v7.l f83470k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private v7.k f83472m;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f83477r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Long f83478s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private List f83480u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Boolean f83481v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Boolean f83482w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Boolean f83484y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Boolean f83485z;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Map f83471l = new ConcurrentHashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f83473n = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final List f83474o = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private List f83475p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final List f83476q = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Set f83479t = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Set f83483x = new CopyOnWriteArraySet();

    public static f0 g(io.sentry.config.g gVar, ILogger iLogger) {
        f0 f0Var = new f0();
        f0Var.a0(gVar.h("dsn"));
        f0Var.i0(gVar.h(ADJPConstants.KEY_ENVIRONMENT));
        f0Var.x0(gVar.h("release"));
        f0Var.Z(gVar.h("dist"));
        f0Var.B0(gVar.h("servername"));
        f0Var.g0(gVar.c("uncaught.handler.enabled"));
        f0Var.q0(gVar.c("uncaught.handler.print-stacktrace"));
        f0Var.E0(gVar.a("traces-sample-rate"));
        f0Var.t0(gVar.a("profiles-sample-rate"));
        f0Var.Y(gVar.c("debug"));
        f0Var.c0(gVar.c("enable-deduplication"));
        f0Var.y0(gVar.c("send-client-reports"));
        f0Var.j0(gVar.c("force-init"));
        String strH = gVar.h("max-request-body-size");
        if (strH != null) {
            f0Var.p0(v7.l.valueOf(strH.toUpperCase(Locale.ROOT)));
        }
        for (Map.Entry entry : gVar.e("tags").entrySet()) {
            f0Var.D0((String) entry.getKey(), (String) entry.getValue());
        }
        String strH2 = gVar.h("proxy.host");
        String strH3 = gVar.h("proxy.user");
        String strH4 = gVar.h("proxy.pass");
        String strG = gVar.g("proxy.port", "80");
        if (strH2 != null) {
            f0Var.w0(new v7.k(strH2, strG, strH3, strH4));
        }
        Iterator it = gVar.b("in-app-includes").iterator();
        while (it.hasNext()) {
            f0Var.e((String) it.next());
        }
        Iterator it2 = gVar.b("in-app-excludes").iterator();
        while (it2.hasNext()) {
            f0Var.d((String) it2.next());
        }
        List listB = gVar.h("trace-propagation-targets") != null ? gVar.b("trace-propagation-targets") : null;
        if (listB == null && gVar.h("tracing-origins") != null) {
            listB = gVar.b("tracing-origins");
        }
        if (listB != null) {
            Iterator it3 = listB.iterator();
            while (it3.hasNext()) {
                f0Var.f((String) it3.next());
            }
        }
        Iterator it4 = gVar.b("context-tags").iterator();
        while (it4.hasNext()) {
            f0Var.b((String) it4.next());
        }
        f0Var.v0(gVar.h("proguard-uuid"));
        Iterator it5 = gVar.b("bundle-ids").iterator();
        while (it5.hasNext()) {
            f0Var.a((String) it5.next());
        }
        f0Var.l0(gVar.f("idle-timeout"));
        f0Var.n0(gVar.d("ignored-errors"));
        f0Var.h0(gVar.c("enabled"));
        f0Var.e0(gVar.c("enable-pretty-serialization-output"));
        f0Var.A0(gVar.c("send-modules"));
        f0Var.z0(gVar.c("send-default-pii"));
        f0Var.m0(gVar.d("ignored-checkins"));
        f0Var.o0(gVar.d("ignored-transactions"));
        f0Var.b0(gVar.c("enable-backpressure-handling"));
        f0Var.k0(gVar.c("global-hub-mode"));
        f0Var.W(gVar.c("capture-open-telemetry-events"));
        f0Var.d0(gVar.c("logs.enabled"));
        for (String str : gVar.b("ignored-exceptions-for-type")) {
            try {
                Class<?> cls = Class.forName(str);
                if (Throwable.class.isAssignableFrom(cls)) {
                    f0Var.c(cls);
                } else {
                    iLogger.c(g7.WARNING, "Skipping setting %s as ignored-exception-for-type. Reason: %s does not extend Throwable", str, str);
                }
            } catch (ClassNotFoundException unused) {
                iLogger.c(g7.WARNING, "Skipping setting %s as ignored-exception-for-type. Reason: %s class is not found", str, str);
            }
        }
        Long lF = gVar.f("cron.default-checkin-margin");
        Long lF2 = gVar.f("cron.default-max-runtime");
        String strH5 = gVar.h("cron.default-timezone");
        Long lF3 = gVar.f("cron.default-failure-issue-threshold");
        Long lF4 = gVar.f("cron.default-recovery-threshold");
        if (lF != null || lF2 != null || strH5 != null || lF3 != null || lF4 != null) {
            v7.f fVar = new v7.f();
            fVar.f(lF);
            fVar.h(lF2);
            fVar.j(strH5);
            fVar.g(lF3);
            fVar.i(lF4);
            f0Var.X(fVar);
        }
        f0Var.f0(gVar.c("enable-spotlight"));
        f0Var.C0(gVar.h("spotlight-connection-url"));
        f0Var.s0(gVar.a("profile-session-sample-rate"));
        f0Var.u0(gVar.h("profiling-traces-dir-path"));
        String strH6 = gVar.h("profile-lifecycle");
        if (strH6 != null && !strH6.isEmpty()) {
            f0Var.r0(w3.valueOf(strH6.toUpperCase()));
        }
        return f0Var;
    }

    public Double A() {
        return this.L;
    }

    public void A0(Boolean bool) {
        this.F = bool;
    }

    public Double B() {
        return this.f83469j;
    }

    public void B0(String str) {
        this.f83464e = str;
    }

    public String C() {
        return this.M;
    }

    public void C0(String str) {
        this.C = str;
    }

    public String D() {
        return this.f83477r;
    }

    public void D0(String str, String str2) {
        this.f83471l.put(str, str2);
    }

    public v7.k E() {
        return this.f83472m;
    }

    public void E0(Double d10) {
        this.f83468i = d10;
    }

    public String F() {
        return this.f83462c;
    }

    public Boolean G() {
        return this.f83482w;
    }

    public String H() {
        return this.f83464e;
    }

    public String I() {
        return this.C;
    }

    public Map J() {
        return this.f83471l;
    }

    public List K() {
        return this.f83475p;
    }

    public Double L() {
        return this.f83468i;
    }

    public Boolean M() {
        return this.K;
    }

    public Boolean N() {
        return this.H;
    }

    public Boolean O() {
        return this.B;
    }

    public Boolean P() {
        return this.f83485z;
    }

    public Boolean Q() {
        return this.A;
    }

    public Boolean R() {
        return this.f83484y;
    }

    public Boolean S() {
        return this.J;
    }

    public Boolean T() {
        return this.I;
    }

    public Boolean U() {
        return this.G;
    }

    public Boolean V() {
        return this.F;
    }

    public void W(Boolean bool) {
        this.K = bool;
    }

    public void X(v7.f fVar) {
        this.O = fVar;
    }

    public void Y(Boolean bool) {
        this.f83466g = bool;
    }

    public void Z(String str) {
        this.f83463d = str;
    }

    public void a(String str) {
        this.f83483x.add(str);
    }

    public void a0(String str) {
        this.f83460a = str;
    }

    public void b(String str) {
        this.f83476q.add(str);
    }

    public void b0(Boolean bool) {
        this.H = bool;
    }

    public void c(Class cls) {
        this.f83479t.add(cls);
    }

    public void c0(Boolean bool) {
        this.f83467h = bool;
    }

    public void d(String str) {
        this.f83473n.add(str);
    }

    public void d0(Boolean bool) {
        this.B = bool;
    }

    public void e(String str) {
        this.f83474o.add(str);
    }

    public void e0(Boolean bool) {
        this.f83485z = bool;
    }

    public void f(String str) {
        if (this.f83475p == null) {
            this.f83475p = new CopyOnWriteArrayList();
        }
        if (str.isEmpty()) {
            return;
        }
        this.f83475p.add(str);
    }

    public void f0(Boolean bool) {
        this.A = bool;
    }

    public void g0(Boolean bool) {
        this.f83465f = bool;
    }

    public Set h() {
        return this.f83483x;
    }

    public void h0(Boolean bool) {
        this.f83484y = bool;
    }

    public List i() {
        return this.f83476q;
    }

    public void i0(String str) {
        this.f83461b = str;
    }

    public v7.f j() {
        return this.O;
    }

    public void j0(Boolean bool) {
        this.J = bool;
    }

    public Boolean k() {
        return this.f83466g;
    }

    public void k0(Boolean bool) {
        this.I = bool;
    }

    public String l() {
        return this.f83463d;
    }

    public void l0(Long l10) {
        this.f83478s = l10;
    }

    public String m() {
        return this.f83460a;
    }

    public void m0(List list) {
        this.D = list;
    }

    public Boolean n() {
        return this.f83467h;
    }

    public void n0(List list) {
        this.f83480u = list;
    }

    public Boolean o() {
        return this.f83465f;
    }

    public void o0(List list) {
        this.E = list;
    }

    public String p() {
        return this.f83461b;
    }

    public void p0(v7.l lVar) {
        this.f83470k = lVar;
    }

    public Long q() {
        return this.f83478s;
    }

    public void q0(Boolean bool) {
        this.f83481v = bool;
    }

    public List r() {
        return this.D;
    }

    public void r0(w3 w3Var) {
        this.N = w3Var;
    }

    public List s() {
        return this.f83480u;
    }

    public void s0(Double d10) {
        this.L = d10;
    }

    public Set t() {
        return this.f83479t;
    }

    public void t0(Double d10) {
        this.f83469j = d10;
    }

    public List u() {
        return this.E;
    }

    public void u0(String str) {
        this.M = str;
    }

    public List v() {
        return this.f83473n;
    }

    public void v0(String str) {
        this.f83477r = str;
    }

    public List w() {
        return this.f83474o;
    }

    public void w0(v7.k kVar) {
        this.f83472m = kVar;
    }

    public v7.l x() {
        return this.f83470k;
    }

    public void x0(String str) {
        this.f83462c = str;
    }

    public Boolean y() {
        return this.f83481v;
    }

    public void y0(Boolean bool) {
        this.f83482w = bool;
    }

    public w3 z() {
        return this.N;
    }

    public void z0(Boolean bool) {
        this.G = bool;
    }
}
