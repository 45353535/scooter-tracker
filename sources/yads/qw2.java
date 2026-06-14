package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class qw2 extends j23 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rw2 f115187f;

    public qw2(rw2 rw2Var) {
        this.f115187f = rw2Var;
    }

    @Override // yads.ha0
    public final void b() {
        rw2 rw2Var = this.f115187f;
        synchronized (rw2Var.f113631b) {
            this.f112430b = 0;
            this.f112227d = null;
            ha0[] ha0VarArr = rw2Var.f113635f;
            int i10 = rw2Var.f113637h;
            rw2Var.f113637h = i10 + 1;
            ha0VarArr[i10] = this;
            rw2Var.f();
        }
    }
}
