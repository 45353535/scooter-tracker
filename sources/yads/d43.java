package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class d43 extends f43 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y31 f109756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y31 f109757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f109758e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f109759f;

    public d43(nk2 nk2Var, nk2 nk2Var2, int[] iArr) {
        fi.a(nk2Var.size() == iArr.length);
        this.f109756c = nk2Var;
        this.f109757d = nk2Var2;
        this.f109758e = iArr;
        this.f109759f = new int[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            this.f109759f[iArr[i10]] = i10;
        }
    }

    @Override // yads.f43
    public final int a(boolean z10) {
        if (c()) {
            return -1;
        }
        if (z10) {
            return this.f109758e[0];
        }
        return 0;
    }

    @Override // yads.f43
    public final int b(boolean z10) {
        if (c()) {
            return -1;
        }
        return z10 ? this.f109758e[this.f109756c.size() - 1] : this.f109756c.size() - 1;
    }

    @Override // yads.f43
    public final int a(int i10, int i11, boolean z10) {
        if (i11 == 1) {
            return i10;
        }
        if (i10 != b(z10)) {
            return z10 ? this.f109758e[this.f109759f[i10] + 1] : i10 + 1;
        }
        if (i11 == 2) {
            return a(z10);
        }
        return -1;
    }

    @Override // yads.f43
    public final c43 a(int i10, c43 c43Var, boolean z10) {
        c43 c43Var2 = (c43) this.f109757d.get(i10);
        c43Var.a(c43Var2.f109214b, c43Var2.f109215c, c43Var2.f109216d, c43Var2.f109217e, c43Var2.f109218f, c43Var2.f109220h, c43Var2.f109219g);
        return c43Var;
    }

    @Override // yads.f43
    public final int b(int i10, int i11, boolean z10) {
        if (i11 == 1) {
            return i10;
        }
        if (i10 != a(z10)) {
            return z10 ? this.f109758e[this.f109759f[i10] - 1] : i10 - 1;
        }
        if (i11 == 2) {
            return b(z10);
        }
        return -1;
    }

    @Override // yads.f43
    public final int a() {
        return this.f109757d.size();
    }

    @Override // yads.f43
    public final e43 a(int i10, e43 e43Var, long j10) {
        e43 e43Var2 = (e43) this.f109756c.get(i10);
        e43Var.a(e43Var2.f110187b, e43Var2.f110189d, e43Var2.f110190e, e43Var2.f110191f, e43Var2.f110192g, e43Var2.f110193h, e43Var2.f110194i, e43Var2.f110195j, e43Var2.f110197l, e43Var2.f110199n, e43Var2.f110200o, e43Var2.f110201p, e43Var2.f110202q, e43Var2.f110203r);
        e43Var.f110198m = e43Var2.f110198m;
        return e43Var;
    }

    @Override // yads.f43
    public final int b() {
        return this.f109756c.size();
    }

    @Override // yads.f43
    public final int a(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // yads.f43
    public final Object a(int i10) {
        throw new UnsupportedOperationException();
    }
}
