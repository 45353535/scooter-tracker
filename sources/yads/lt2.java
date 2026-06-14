package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class lt2 implements k12 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final es2 f113223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c4 f113224b;

    public lt2(es2 es2Var, c4 c4Var) {
        this.f113223a = es2Var;
        this.f113224b = c4Var;
    }

    @Override // yads.k12
    public final j12 a(zy1 zy1Var) {
        return new kt2(zy1Var, this.f113224b, new et2(this.f113223a));
    }
}
