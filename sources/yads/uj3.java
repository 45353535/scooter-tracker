package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class uj3 implements go {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final om2 f116674a = null;

    @Override // yads.on2
    public final void a(oj3 oj3Var) {
        pb3 pb3Var;
        if (oj3Var.f114340b == null) {
            String message = oj3Var.getMessage();
            if (message == null) {
                message = "Ad request failed with network error";
            }
            pb3Var = new pb3(message);
        } else {
            pb3Var = new pb3("Ping error");
        }
        om2 om2Var = this.f116674a;
        if (om2Var != null) {
            om2Var.a(pb3Var);
        }
    }

    @Override // yads.pn2
    public final void a(Object obj) {
        r62 r62Var = (r62) obj;
        om2 om2Var = this.f116674a;
        if (om2Var != null) {
            om2Var.a(r62Var);
        }
    }
}
