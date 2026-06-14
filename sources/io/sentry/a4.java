package io.sentry;

/* JADX INFO: loaded from: classes3.dex */
public final class a4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private io.sentry.protocol.x f82223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private u8 f82224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private u8 f82225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Boolean f82226d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d f82227e;

    public a4() {
        this(new io.sentry.protocol.x(), new u8(), null, null, null);
    }

    public d a() {
        return this.f82227e;
    }

    public u8 b() {
        return this.f82225c;
    }

    public Double c() {
        Double dI = this.f82227e.i();
        return Double.valueOf(dI == null ? 0.0d : dI.doubleValue());
    }

    public u8 d() {
        return this.f82224b;
    }

    public io.sentry.protocol.x e() {
        return this.f82223a;
    }

    public Boolean f() {
        return this.f82226d;
    }

    public p8 g() {
        p8 p8Var = new p8(this.f82223a, this.f82224b, "default", null, null);
        p8Var.t("auto");
        return p8Var;
    }

    public b9 h() {
        return this.f82227e.J();
    }

    public a4(a4 a4Var) {
        this(a4Var.e(), a4Var.d(), a4Var.b(), a4Var.a(), a4Var.f());
    }

    public a4(io.sentry.protocol.x xVar, u8 u8Var, u8 u8Var2, d dVar, Boolean bool) {
        this.f82223a = xVar;
        this.f82224b = u8Var;
        this.f82225c = u8Var2;
        this.f82227e = io.sentry.util.h0.e(dVar, bool, null, null);
        this.f82226d = bool;
    }
}
