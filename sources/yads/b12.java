package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class b12 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ze3 f108887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r22 f108888b;

    public b12(ze3 ze3Var, r22 r22Var) {
        this.f108887a = ze3Var;
        this.f108888b = r22Var;
    }

    public final c12 a() {
        q42 q42Var = this.f108888b.f115285a;
        if (q42Var != null) {
            return new c12(q42Var, this.f108887a);
        }
        return null;
    }
}
