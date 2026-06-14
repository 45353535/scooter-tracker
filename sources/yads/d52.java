package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class d52 implements sc3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f52 f109770a;

    public d52(f52 f52Var) {
        this.f109770a = f52Var;
    }

    public static final void a(f52 f52Var) {
        f52Var.a(f52Var.f110608g);
    }

    @Override // yads.sc3
    public final void b() {
        final f52 f52Var = this.f109770a;
        f52Var.f110613l = null;
        zv2 zv2Var = f52Var.f110604c;
        if (zv2Var == null || !zv2Var.f118850d) {
            f52Var.f110610i.a();
        } else {
            bg1 bg1Var = f52Var.f110612k;
            bg1Var.f108997a.post(new Runnable() { // from class: yads.k5
                @Override // java.lang.Runnable
                public final void run() {
                    d52.a(f52Var);
                }
            });
        }
        this.f109770a.f110603b.b();
    }

    @Override // yads.sc3
    public final void c() {
        r52 r52Var = (r52) this.f109770a.f110602a.b();
        if (r52Var != null) {
            r52Var.setClickable(true);
        }
    }

    @Override // yads.sc3
    public final void a() {
        this.f109770a.f110603b.a();
    }
}
