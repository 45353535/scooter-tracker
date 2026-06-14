package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class s22 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ui f115672a;

    public s22(ui uiVar) {
        this.f115672a = uiVar;
    }

    public final r22 a() {
        b62 b62Var;
        Object obj = this.f115672a.f116656a.get("media");
        q42 q42Var = null;
        am1 am1Var = obj instanceof am1 ? (am1) obj : null;
        if (am1Var != null) {
            q42 q42Var2 = am1Var.f108720b != null ? new q42() : null;
            b62Var = am1Var.f108719a != null ? new b62() : null;
            q42Var = q42Var2;
        } else {
            b62Var = null;
        }
        return new r22(q42Var, b62Var);
    }
}
