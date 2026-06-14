package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class nd0 implements li1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v03 f113821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final md0 f113822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public jo f113823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public li1 f113824e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f113825f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f113826g;

    public nd0(md0 md0Var, r23 r23Var) {
        this.f113822c = md0Var;
        this.f113821b = new v03(r23Var);
    }

    @Override // yads.li1
    public final long a() {
        if (this.f113825f) {
            return this.f113821b.a();
        }
        li1 li1Var = this.f113824e;
        li1Var.getClass();
        return li1Var.a();
    }

    @Override // yads.li1
    public final gc2 getPlaybackParameters() {
        li1 li1Var = this.f113824e;
        return li1Var != null ? li1Var.getPlaybackParameters() : this.f113821b.f116832f;
    }

    @Override // yads.li1
    public final void a(gc2 gc2Var) {
        li1 li1Var = this.f113824e;
        if (li1Var != null) {
            li1Var.a(gc2Var);
            gc2Var = this.f113824e.getPlaybackParameters();
        }
        this.f113821b.a(gc2Var);
    }
}
