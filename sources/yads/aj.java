package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class aj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qz f108696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f108697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r2 f108698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w9 f108699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public v02 f108700e;

    public /* synthetic */ aj(n5 n5Var, qz qzVar, String str) {
        this(qzVar, str, n5Var.a(), n5Var.b());
    }

    public final am2 a() {
        am2 am2VarA = this.f108699d.a();
        am2VarA.b(this.f108696a.f115230b, "ad_type");
        am2VarA.a(this.f108697b, "ad_id");
        am2VarA.f108722a.putAll(this.f108698c.a());
        v02 v02Var = this.f108700e;
        return v02Var != null ? bm2.a(am2VarA, v02Var.a()) : am2VarA;
    }

    public aj(qz qzVar, String str, r2 r2Var, w9 w9Var) {
        this.f108696a = qzVar;
        this.f108697b = str;
        this.f108698c = r2Var;
        this.f108699d = w9Var;
    }
}
