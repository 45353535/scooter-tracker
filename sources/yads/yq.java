package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class yq extends km2 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final pn2 f118324s;

    public yq(String str, vu0 vu0Var, wu0 wu0Var) {
        super(0, str, wu0Var);
        this.f118324s = vu0Var;
    }

    @Override // yads.km2
    public final void a(Object obj) {
        this.f118324s.a((byte[]) obj);
    }

    @Override // yads.km2
    public final qn2 a(r62 r62Var) {
        try {
            return new qn2(r62Var.f115341b, g01.a(r62Var));
        } catch (Exception e10) {
            return new qn2(new oj3(e10));
        }
    }
}
