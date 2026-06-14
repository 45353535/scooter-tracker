package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class s63 implements ju2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v92 f115714a = new v92(new byte[4]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u63 f115715b;

    public s63(u63 u63Var) {
        this.f115715b = u63Var;
    }

    @Override // yads.ju2
    public final void a(l43 l43Var, ap0 ap0Var, y63 y63Var) {
    }

    @Override // yads.ju2
    public final void a(w92 w92Var) {
        if (w92Var.m() == 0 && (w92Var.m() & 128) != 0) {
            w92Var.e(w92Var.f117357b + 6);
            int i10 = (w92Var.f117358c - w92Var.f117357b) / 4;
            for (int i11 = 0; i11 < i10; i11++) {
                v92 v92Var = this.f115714a;
                w92Var.a(v92Var.f116906a, 0, 4);
                v92Var.b(0);
                int iA = this.f115714a.a(16);
                this.f115714a.c(3);
                if (iA == 0) {
                    this.f115714a.c(13);
                } else {
                    int iA2 = this.f115714a.a(13);
                    if (this.f115715b.f116543g.get(iA2) == null) {
                        u63 u63Var = this.f115715b;
                        u63Var.f116543g.put(iA2, new ku2(new t63(u63Var, iA2)));
                        this.f115715b.f116549m++;
                    }
                }
            }
            u63 u63Var2 = this.f115715b;
            if (u63Var2.f116537a != 2) {
                u63Var2.f116543g.remove(0);
            }
        }
    }
}
