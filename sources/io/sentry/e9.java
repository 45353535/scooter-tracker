package io.sentry;

/* JADX INFO: loaded from: classes3.dex */
public final class e9 extends p8 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final io.sentry.protocol.h0 f83442u = io.sentry.protocol.h0.CUSTOM;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f83443q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private io.sentry.protocol.h0 f83444r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private d9 f83445s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f83446t;

    public e9(String str, String str2) {
        this(str, str2, (d9) null);
    }

    public static e9 x(a4 a4Var) {
        Boolean boolF = a4Var.f();
        d dVarA = a4Var.a();
        return new e9(a4Var.e(), a4Var.d(), a4Var.b(), boolF == null ? null : new d9(boolF, dVarA.j(), a4Var.c()), dVarA);
    }

    public io.sentry.protocol.h0 A() {
        return this.f83444r;
    }

    public void B(boolean z10) {
        this.f83446t = z10;
    }

    public String y() {
        return this.f83443q;
    }

    public d9 z() {
        return this.f83445s;
    }

    public e9(String str, io.sentry.protocol.h0 h0Var, String str2) {
        this(str, h0Var, str2, null);
    }

    public e9(String str, String str2, d9 d9Var) {
        this(str, io.sentry.protocol.h0.CUSTOM, str2, d9Var);
    }

    public e9(String str, io.sentry.protocol.h0 h0Var, String str2, d9 d9Var) {
        super(str2);
        this.f83446t = false;
        this.f83443q = (String) io.sentry.util.w.c(str, "name is required");
        this.f83444r = h0Var;
        u(d9Var);
        this.f83815n = io.sentry.util.h0.d(null, d9Var);
    }

    public e9(io.sentry.protocol.x xVar, u8 u8Var, u8 u8Var2, d9 d9Var, d dVar) {
        super(xVar, u8Var, "default", u8Var2, null);
        this.f83446t = false;
        this.f83443q = "<unlabeled transaction>";
        this.f83445s = d9Var;
        this.f83444r = f83442u;
        this.f83815n = io.sentry.util.h0.d(dVar, d9Var);
    }
}
