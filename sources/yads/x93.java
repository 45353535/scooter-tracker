package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class x93 implements ed3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xb3 f117745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eh3 f117746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oc3 f117747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lh3 f117748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f117749e;

    public x93(xb3 xb3Var, fh3 fh3Var, oc3 oc3Var, lh3 lh3Var) {
        this.f117745a = xb3Var;
        this.f117746b = fh3Var;
        this.f117747c = oc3Var;
        this.f117748d = lh3Var;
    }

    @Override // yads.ed3
    public final void a(long j10, long j11) {
        if (this.f117749e || j11 <= 0 || !this.f117748d.a()) {
            return;
        }
        this.f117749e = true;
        this.f117746b.h();
        this.f117747c.f(this.f117745a);
    }

    public /* synthetic */ x93(xb3 xb3Var, kh3 kh3Var, fh3 fh3Var, oc3 oc3Var) {
        this(xb3Var, fh3Var, oc3Var, new lh3(kh3Var));
    }
}
