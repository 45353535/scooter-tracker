package ga;

import ga.f0;

/* JADX INFO: loaded from: classes12.dex */
public abstract class o1 extends h {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Void f72394l = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected final f0 f72395k;

    protected o1(f0 f0Var) {
        this.f72395k = f0Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ga.h
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public final f0.b z(Void r12, f0.b bVar) {
        return E(bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ga.h
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final long A(Void r12, long j10, f0.b bVar) {
        return G(j10, bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ga.h
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public final int B(Void r12, int i10) {
        return I(i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ga.h
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public final void C(Void r12, f0 f0Var, n9.e0 e0Var) {
        L(e0Var);
    }

    protected abstract void L(n9.e0 e0Var);

    protected final void M() {
        D(f72394l, this.f72395k);
    }

    protected void N() {
        M();
    }

    @Override // ga.a, ga.f0
    public n9.e0 getInitialTimeline() {
        return this.f72395k.getInitialTimeline();
    }

    @Override // ga.f0
    public n9.r getMediaItem() {
        return this.f72395k.getMediaItem();
    }

    @Override // ga.a, ga.f0
    public void h(n9.r rVar) {
        this.f72395k.h(rVar);
    }

    @Override // ga.a, ga.f0
    public boolean isSingleWindow() {
        return this.f72395k.isSingleWindow();
    }

    @Override // ga.h, ga.a
    protected final void v(s9.y yVar) {
        super.v(yVar);
        N();
    }

    protected f0.b E(f0.b bVar) {
        return bVar;
    }

    protected int I(int i10) {
        return i10;
    }

    protected long G(long j10, f0.b bVar) {
        return j10;
    }
}
