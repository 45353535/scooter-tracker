package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class r12 implements mw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ja2 f115271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vb0 f115272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public y3 f115273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public oh2 f115274d;

    public r12(y3 y3Var, oh2 oh2Var, ja2 ja2Var, vb0 vb0Var) {
        this.f115271a = ja2Var;
        this.f115272b = vb0Var;
        this.f115273c = y3Var;
        this.f115274d = oh2Var;
    }

    @Override // yads.mw0
    public final void invalidate() {
        ((ma2) this.f115271a).a();
        ((ma2) this.f115271a).f113361e = null;
        this.f115273c = null;
        this.f115274d = null;
    }

    @Override // yads.mw0
    public final void pause() {
        ((ma2) this.f115271a).b();
    }

    @Override // yads.mw0
    public final void resume() {
        ((ma2) this.f115271a).d();
    }

    @Override // yads.mw0
    public final void start() {
        p12 p12Var = new p12(this);
        long jA = this.f115272b.a();
        q12 q12Var = new q12(this, jA);
        ma2 ma2Var = (ma2) this.f115271a;
        ma2Var.f113361e = q12Var;
        ma2Var.a(jA, p12Var);
    }

    public /* synthetic */ r12(y3 y3Var, w33 w33Var, oh2 oh2Var) {
        this(y3Var, oh2Var, ia2.a(false), w33Var.c());
    }
}
