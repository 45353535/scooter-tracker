package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class g82 implements pn2, on2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f111107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final za3 f111108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h82 f111109c;

    public g82(h82 h82Var, String str, j82 j82Var) {
        this.f111109c = h82Var;
        this.f111107a = str;
        this.f111108b = j82Var;
    }

    @Override // yads.on2
    public final void a(oj3 oj3Var) {
        this.f111108b.a();
    }

    @Override // yads.pn2
    public final void a(Object obj) {
        ((ff1) this.f111109c.f111514b.f113000a).a("YmadOmSdkJs", (String) obj);
        l82 l82Var = this.f111109c.f111514b;
        ((ff1) l82Var.f113000a).a("YmadOmSdkJsUrl", this.f111107a);
        this.f111108b.a();
    }
}
