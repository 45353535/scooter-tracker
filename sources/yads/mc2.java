package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class mc2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ou0 f113426a = new ou0();

    public final mc2 a(int i10) {
        this.f113426a.a(i10);
        return this;
    }

    public final mc2 a(nc2 nc2Var) {
        ou0 ou0Var = this.f113426a;
        pu0 pu0Var = nc2Var.f113809b;
        ou0Var.getClass();
        for (int i10 = 0; i10 < pu0Var.f114786a.size(); i10++) {
            ou0Var.a(pu0Var.a(i10));
        }
        return this;
    }

    public final mc2 a(int... iArr) {
        ou0 ou0Var = this.f113426a;
        ou0Var.getClass();
        for (int i10 : iArr) {
            ou0Var.a(i10);
        }
        return this;
    }

    public final mc2 a(boolean z10, int i10) {
        ou0 ou0Var = this.f113426a;
        if (z10) {
            ou0Var.a(i10);
            return this;
        }
        ou0Var.getClass();
        return this;
    }

    public final nc2 a() {
        return new nc2(this.f113426a.a());
    }
}
