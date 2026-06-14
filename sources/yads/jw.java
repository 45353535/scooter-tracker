package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class jw implements hw, cf1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f112475j = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g63 f112476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g63 f112477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f112478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f112479e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f112480f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f112481g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f112482h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f112483i;

    public jw(kw kwVar, lw lwVar, df1 df1Var) {
        this.f112476b = kwVar;
        this.f112477c = lwVar;
        for (cw cwVar : cw.values()) {
            a(df1Var, cwVar);
        }
        ((ff1) df1Var).a(this);
    }

    public final boolean a() {
        boolean z10;
        synchronized (f112475j) {
            z10 = this.f112480f;
        }
        return z10;
    }

    public final String b() {
        String str;
        synchronized (f112475j) {
            str = this.f112478d;
        }
        return str;
    }

    public final String c() {
        String str;
        synchronized (f112475j) {
            str = this.f112479e;
        }
        return str;
    }

    public final String d() {
        String str;
        synchronized (f112475j) {
            str = this.f112481g;
        }
        return str;
    }

    public final String e() {
        String str;
        synchronized (f112475j) {
            str = this.f112482h;
        }
        return str;
    }

    public final void a(df1 df1Var, cw cwVar) {
        sw swVarA = this.f112477c.a(df1Var, cwVar);
        if (swVarA == null) {
            swVarA = this.f112476b.a(df1Var, cwVar);
        }
        a(swVarA);
    }

    public final void a(sw swVar) {
        if (swVar instanceof nw) {
            this.f112480f = ((nw) swVar).f114062a;
            return;
        }
        if (swVar instanceof ow) {
            this.f112478d = ((ow) swVar).f114424a;
            return;
        }
        if (swVar instanceof pw) {
            this.f112479e = ((pw) swVar).f114799a;
            return;
        }
        if (swVar instanceof qw) {
            this.f112481g = ((qw) swVar).f115182a;
        } else if (swVar instanceof rw) {
            this.f112482h = ((rw) swVar).f115620a;
        } else if (swVar instanceof mw) {
            this.f112483i = ((mw) swVar).f113622a;
        }
    }
}
