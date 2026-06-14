package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class z52 implements mw0, c62 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b62 f118552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gp2 f118553b;

    public z52(b62 b62Var, gp2 gp2Var) {
        this.f118552a = b62Var;
        this.f118553b = gp2Var;
    }

    @Override // yads.c62
    public final void a() {
    }

    @Override // yads.mw0
    public final void invalidate() {
        this.f118552a.f108914a.remove(this);
    }

    @Override // yads.mw0
    public final void pause() {
    }

    @Override // yads.mw0
    public final void resume() {
    }

    @Override // yads.mw0
    public final void start() {
        this.f118552a.f108914a.add(this);
    }

    @Override // yads.c62
    public final void a(boolean z10) {
        if (z10) {
            return;
        }
        this.f118553b.a();
        this.f118552a.f108914a.remove(this);
    }
}
