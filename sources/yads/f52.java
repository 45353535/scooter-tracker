package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class f52 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jh3 f110602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z42 f110603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zv2 f110604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g42 f110605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final bh2 f110606e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s52 f110607f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final cc2 f110608g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final cc2 f110609h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ol2 f110610i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d52 f110611j = new d52(this);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final bg1 f110612k = new bg1();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public cc2 f110613l;

    public f52(Context context, t9 t9Var, es2 es2Var, f42 f42Var, gb3 gb3Var, lf3 lf3Var, jh3 jh3Var, tc3 tc3Var, fh3 fh3Var, jf3 jf3Var, z42 z42Var, hg2 hg2Var, zv2 zv2Var) {
        this.f110602a = jh3Var;
        this.f110603b = z42Var;
        this.f110604c = zv2Var;
        this.f110610i = new ol2(jh3Var, new e52(this));
        v52 v52Var = new v52(jh3Var);
        this.f110605d = new g42(f42Var);
        this.f110607f = new s52(f42Var);
        fd3 fd3Var = new fd3();
        new k42(jh3Var, f42Var, v52Var, z42Var).a(fd3Var);
        y42 y42Var = new y42(context, t9Var, es2Var, f42Var, gb3Var.a(), v52Var, tc3Var, fh3Var, fd3Var, jf3Var);
        vl2 vl2Var = new vl2(f42Var, gb3Var.a(), fd3Var);
        t52 t52Var = new t52(f42Var, lf3Var);
        bh2 bh2Var = new bh2(gb3Var, new h21(context, new g22(t9Var), hg2Var));
        this.f110606e = bh2Var;
        this.f110609h = new cc2(jh3Var, y42Var, t52Var, bh2Var);
        this.f110608g = new cc2(jh3Var, vl2Var, t52Var, bh2Var);
    }

    public final void a(cc2 cc2Var) {
        this.f110613l = cc2Var;
        if (cc2Var != null) {
            cc2Var.f109346e.f108967a = this.f110611j;
        }
        if (cc2Var != null) {
            cc2Var.f109343b.a(cc2Var.f109346e);
            cc2Var.f109343b.play();
        }
    }
}
