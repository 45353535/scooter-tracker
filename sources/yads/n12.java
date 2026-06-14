package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class n12 implements mw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gp2 f113695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vv f113696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f113697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ja2 f113698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m12 f113699e;

    public /* synthetic */ n12(t9 t9Var, gp2 gp2Var, w33 w33Var) {
        this(gp2Var, w33Var.b(), o12.a(t9Var), ia2.a(false));
    }

    @Override // yads.mw0
    public final void invalidate() {
        ((ma2) this.f113698d).a();
    }

    @Override // yads.mw0
    public final void pause() {
        ((ma2) this.f113698d).b();
    }

    @Override // yads.mw0
    public final void resume() {
        ((ma2) this.f113698d).d();
    }

    @Override // yads.mw0
    public final void start() {
        long jMax = Math.max(0L, this.f113697c - this.f113696b.f117208a);
        ma2 ma2Var = (ma2) this.f113698d;
        ma2Var.f113361e = this.f113696b;
        ma2Var.a(jMax, this.f113699e);
    }

    public n12(gp2 gp2Var, vv vvVar, long j10, ja2 ja2Var) {
        this.f113695a = gp2Var;
        this.f113696b = vvVar;
        this.f113697c = j10;
        this.f113698d = ja2Var;
        this.f113699e = new m12(this);
    }
}
