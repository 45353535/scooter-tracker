package io.sentry;

import j$.util.concurrent.ConcurrentHashMap;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final Integer f83391i = 8192;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final Integer f83392j = 64;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final c f83393k = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap f83394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.util.a f83395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Double f83396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Double f83397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f83398e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f83399f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f83400g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final ILogger f83401h;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final List f83402a = Arrays.asList("sentry-trace_id", "sentry-public_key", "sentry-release", "sentry-user_id", "sentry-environment", "sentry-transaction", "sentry-sample_rate", "sentry-sample_rand", "sentry-sampled", "sentry-replay_id");
    }

    private static class c extends ThreadLocal {
        private c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DecimalFormat initialValue() {
            return new DecimalFormat("#.################", DecimalFormatSymbols.getInstance(Locale.ROOT));
        }
    }

    public d(ILogger iLogger) {
        this(new ConcurrentHashMap(), null, null, null, true, false, iLogger);
    }

    public static d c(n5 n5Var, String str, v7 v7Var) {
        d dVar = new d(v7Var.getLogger());
        p8 p8VarJ = n5Var.C().j();
        dVar.E(p8VarJ != null ? p8VarJ.p().toString() : null);
        dVar.y(v7Var.retrieveParsedDsn().a());
        dVar.z(n5Var.J());
        dVar.x(n5Var.F());
        dVar.F(str);
        dVar.C(null);
        dVar.D(null);
        dVar.B(null);
        Object objC = n5Var.C().c("replay_id");
        if (objC != null && !objC.toString().equals(io.sentry.protocol.x.f84062c.toString())) {
            dVar.A(objC.toString());
            n5Var.C().n("replay_id");
        }
        dVar.b();
        return dVar;
    }

    private static boolean p(io.sentry.protocol.h0 h0Var) {
        return (h0Var == null || io.sentry.protocol.h0.URL.equals(h0Var)) ? false : true;
    }

    private static Double s(d9 d9Var) {
        if (d9Var == null) {
            return null;
        }
        return d9Var.c();
    }

    private static Double t(d9 d9Var) {
        if (d9Var == null) {
            return null;
        }
        return d9Var.d();
    }

    private static String u(Double d10) {
        if (io.sentry.util.a0.h(d10, false)) {
            return ((DecimalFormat) f83393k.get()).format(d10);
        }
        return null;
    }

    private static Boolean v(d9 d9Var) {
        if (d9Var == null) {
            return null;
        }
        return d9Var.e();
    }

    public void A(String str) {
        w("sentry-replay_id", str);
    }

    public void B(Double d10) {
        if (q()) {
            this.f83397d = d10;
        }
    }

    public void C(Double d10) {
        if (q()) {
            this.f83396c = d10;
        }
    }

    public void D(String str) {
        w("sentry-sampled", str);
    }

    public void E(String str) {
        w("sentry-trace_id", str);
    }

    public void F(String str) {
        w("sentry-transaction", str);
    }

    public void G(d9 d9Var) {
        if (d9Var == null) {
            return;
        }
        D(io.sentry.util.d0.g(v(d9Var)));
        if (d9Var.c() != null) {
            B(s(d9Var));
        }
        if (d9Var.d() != null) {
            a(t(d9Var));
        }
    }

    public void H(y0 y0Var, v7 v7Var) {
        a4 a4VarB = y0Var.B();
        io.sentry.protocol.x xVarP = y0Var.p();
        E(a4VarB.e().toString());
        y(v7Var.retrieveParsedDsn().a());
        z(v7Var.getRelease());
        x(v7Var.getEnvironment());
        if (!io.sentry.protocol.x.f84062c.equals(xVarP)) {
            A(xVarP.toString());
        }
        F(null);
        C(null);
        D(null);
    }

    public void I(io.sentry.protocol.x xVar, io.sentry.protocol.x xVar2, v7 v7Var, d9 d9Var, String str, io.sentry.protocol.h0 h0Var) {
        E(xVar.toString());
        y(v7Var.retrieveParsedDsn().a());
        z(v7Var.getRelease());
        x(v7Var.getEnvironment());
        if (!p(h0Var)) {
            str = null;
        }
        F(str);
        if (xVar2 != null && !io.sentry.protocol.x.f84062c.equals(xVar2)) {
            A(xVar2.toString());
        }
        C(t(d9Var));
        D(io.sentry.util.d0.g(v(d9Var)));
        B(s(d9Var));
    }

    public b9 J() {
        String strL = l();
        String strH = h();
        String strF = f();
        if (strL == null || strF == null) {
            return null;
        }
        io.sentry.protocol.x xVar = new io.sentry.protocol.x(strL);
        io.sentry.protocol.x xVar2 = null;
        String strG = g();
        String strE = e();
        String strO = o();
        String strM = m();
        String strU = u(j());
        String strK = k();
        if (strH != null) {
            xVar2 = new io.sentry.protocol.x(strH);
        }
        b9 b9Var = new b9(xVar, strF, strG, strE, strO, strM, strU, strK, xVar2, u(i()));
        b9Var.c(n());
        return b9Var;
    }

    public void a(Double d10) {
        this.f83396c = d10;
    }

    public void b() {
        this.f83399f = false;
    }

    public String d(String str) {
        if (str == null) {
            return null;
        }
        return (String) this.f83394a.get(str);
    }

    public String e() {
        return d("sentry-environment");
    }

    public String f() {
        return d("sentry-public_key");
    }

    public String g() {
        return d("sentry-release");
    }

    public String h() {
        return d("sentry-replay_id");
    }

    public Double i() {
        return this.f83397d;
    }

    public Double j() {
        return this.f83396c;
    }

    public String k() {
        return d("sentry-sampled");
    }

    public String l() {
        return d("sentry-trace_id");
    }

    public String m() {
        return d("sentry-transaction");
    }

    public Map n() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        g1 g1VarD = this.f83395b.d();
        try {
            for (Map.Entry entry : this.f83394a.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (!b.f83402a.contains(str) && str2 != null) {
                    concurrentHashMap.put(str.replaceFirst("sentry-", ""), str2);
                }
            }
            if (g1VarD != null) {
                g1VarD.close();
            }
            return concurrentHashMap;
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

    public String o() {
        return d("sentry-user_id");
    }

    public boolean q() {
        return this.f83399f;
    }

    public boolean r() {
        return this.f83400g;
    }

    public void w(String str, String str2) {
        if (this.f83399f) {
            if (str2 == null) {
                this.f83394a.remove(str);
            } else {
                this.f83394a.put(str, str2);
            }
        }
    }

    public void x(String str) {
        w("sentry-environment", str);
    }

    public void y(String str) {
        w("sentry-public_key", str);
    }

    public void z(String str) {
        w("sentry-release", str);
    }

    public d(ConcurrentHashMap concurrentHashMap, Double d10, Double d11, String str, boolean z10, boolean z11, ILogger iLogger) {
        this.f83395b = new io.sentry.util.a();
        this.f83394a = concurrentHashMap;
        this.f83396c = d10;
        this.f83397d = d11;
        this.f83401h = iLogger;
        this.f83398e = str;
        this.f83399f = z10;
        this.f83400g = z11;
    }
}
