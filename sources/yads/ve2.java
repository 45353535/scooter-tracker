package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class ve2 implements k83 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vu f116989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a33 f116990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zf1 f116991c;

    public ve2(vu vuVar, a33 a33Var, zf1 zf1Var) {
        this.f116989a = vuVar;
        this.f116990b = a33Var;
        this.f116991c = zf1Var;
    }

    @Override // yads.k83
    public final void a(String str) {
        String strA = this.f116991c.a(str);
        if (strA.length() == 0) {
            boolean z10 = lb1.f113032a;
        } else {
            this.f116990b.a(this.f116989a, strA);
        }
    }
}
