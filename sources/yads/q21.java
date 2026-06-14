package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class q21 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v21 f114860b;

    public q21(v21 v21Var) {
        this.f114860b = v21Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (r21 r21Var : this.f114860b.f116845d.values()) {
            for (t21 t21Var : r21Var.f115284d) {
                u21 u21Var = t21Var.f116035b;
                if (u21Var != null) {
                    oj3 oj3Var = r21Var.f115283c;
                    if (oj3Var == null) {
                        t21Var.f116034a = r21Var.f115282b;
                        u21Var.a(t21Var, false);
                    } else {
                        u21Var.a(oj3Var);
                    }
                }
            }
        }
        this.f114860b.f116845d.clear();
        this.f114860b.f116847f = null;
    }
}
