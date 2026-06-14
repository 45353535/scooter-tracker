package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class a62 implements mw0, c62 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b62 f108578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public y3 f108579b;

    public a62(b62 b62Var, y3 y3Var) {
        this.f108578a = b62Var;
        this.f108579b = y3Var;
    }

    @Override // yads.c62
    public final void a(boolean z10) {
    }

    @Override // yads.mw0
    public final void invalidate() {
        this.f108578a.f108914a.remove(this);
        this.f108579b = null;
    }

    @Override // yads.mw0
    public final void pause() {
    }

    @Override // yads.mw0
    public final void resume() {
    }

    @Override // yads.mw0
    public final void start() {
        this.f108578a.f108914a.add(this);
    }

    @Override // yads.c62
    public final void a() {
        y3 y3Var = this.f108579b;
        if (y3Var != null) {
            y3Var.b();
        }
        this.f108578a.f108914a.remove(this);
        this.f108579b = null;
    }
}
