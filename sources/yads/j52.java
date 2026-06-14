package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class j52 implements mw0, z42 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q42 f112235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oh2 f112236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nh2 f112237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u2 f112238d;

    public j52(q42 q42Var, m32 m32Var, nh2 nh2Var, u2 u2Var) {
        this.f112235a = q42Var;
        this.f112236b = m32Var;
        this.f112237c = nh2Var;
        this.f112238d = u2Var;
    }

    @Override // yads.z42
    public final void a(long j10, long j11) {
        long j12 = j11 + this.f112237c.f113910a;
        long jA = this.f112238d.a(j10);
        if (j12 < jA) {
            this.f112236b.a(jA, j12);
        } else {
            invalidate();
            this.f112236b.a();
        }
    }

    @Override // yads.z42
    public final void b() {
        this.f112236b.a();
        invalidate();
    }

    @Override // yads.mw0
    public final void invalidate() {
        this.f112235a.f114874a.remove(this);
    }

    @Override // yads.mw0
    public final void pause() {
    }

    @Override // yads.mw0
    public final void resume() {
    }

    @Override // yads.mw0
    public final void start() {
        this.f112235a.f114874a.add(this);
    }

    @Override // yads.z42
    public final void a() {
        this.f112236b.a();
        invalidate();
    }
}
