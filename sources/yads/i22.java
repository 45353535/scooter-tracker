package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class i22 implements mw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oh2 f111843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ja2 f111844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nh2 f111845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u2 f111846d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vb0 f111847e;

    public i22(m32 m32Var, ja2 ja2Var, nh2 nh2Var, u2 u2Var, vb0 vb0Var) {
        this.f111843a = m32Var;
        this.f111844b = ja2Var;
        this.f111845c = nh2Var;
        this.f111846d = u2Var;
        this.f111847e = vb0Var;
    }

    @Override // yads.mw0
    public final void invalidate() {
        ((ma2) this.f111844b).a();
    }

    @Override // yads.mw0
    public final void pause() {
        ((ma2) this.f111844b).b();
    }

    @Override // yads.mw0
    public final void resume() {
        ((ma2) this.f111844b).d();
    }

    @Override // yads.mw0
    public final void start() {
        h22 h22Var = new h22(this);
        ((ma2) this.f111844b).a(this.f111847e.a(), h22Var);
        ((ma2) this.f111844b).f113361e = h22Var;
    }
}
