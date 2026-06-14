package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class p21 implements on2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f114539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v21 f114540b;

    public p21(v21 v21Var, String str) {
        this.f114540b = v21Var;
        this.f114539a = str;
    }

    @Override // yads.on2
    public final void a(oj3 oj3Var) {
        v21 v21Var = this.f114540b;
        String str = this.f114539a;
        r21 r21Var = (r21) v21Var.f116844c.remove(str);
        if (r21Var != null) {
            r21Var.f115283c = oj3Var;
            v21Var.f116845d.put(str, r21Var);
            if (v21Var.f116847f == null) {
                q21 q21Var = new q21(v21Var);
                v21Var.f116847f = q21Var;
                v21Var.f116846e.postDelayed(q21Var, 100);
            }
        }
    }
}
