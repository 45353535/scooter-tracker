package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class v02 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c4 f116822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f116823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t9 f116824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qz1 f116825d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g12 f116826e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d12 f116827f;

    public v02(c4 c4Var, String str, t9 t9Var, qz1 qz1Var, g12 g12Var, d12 d12Var) {
        this.f116822a = c4Var;
        this.f116823b = str;
        this.f116824c = t9Var;
        this.f116825d = qz1Var;
        this.f116826e = g12Var;
        this.f116827f = d12Var;
    }

    public final am2 a() {
        am2 am2VarA = this.f116826e.a(this.f116824c, this.f116822a, this.f116825d);
        d12 d12Var = this.f116827f;
        if (d12Var != null) {
            am2VarA.b(d12Var.f109695b, "bind_type");
        }
        am2VarA.a(this.f116823b, "native_ad_type");
        mx2 mx2Var = this.f116822a.f109197d.f114071a;
        if (mx2Var != null) {
            am2VarA.b(mx2Var.a().f113267b, "size_type");
            am2VarA.b(Integer.valueOf(mx2Var.getWidth()), "width");
            am2VarA.b(Integer.valueOf(mx2Var.getHeight()), "height");
        }
        am2VarA.f108723b = this.f116824c.f116116i;
        return am2VarA;
    }
}
