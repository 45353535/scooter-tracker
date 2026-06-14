package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class p42 implements mw0, z42 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q42 f114555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f114556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public y3 f114557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public oh2 f114558d;

    public p42(q42 q42Var, y3 y3Var, oh2 oh2Var, Long l10) {
        this.f114555a = q42Var;
        this.f114556b = l10;
        this.f114557c = y3Var;
        this.f114558d = oh2Var;
    }

    @Override // yads.z42
    public final void a(long j10, long j11) {
        oh2 oh2Var = this.f114558d;
        if (oh2Var != null) {
            oh2Var.a(j10, j11);
        }
        Long l10 = this.f114556b;
        if (l10 == null || j11 <= l10.longValue()) {
            return;
        }
        oh2 oh2Var2 = this.f114558d;
        if (oh2Var2 != null) {
            oh2Var2.a();
        }
        y3 y3Var = this.f114557c;
        if (y3Var != null) {
            y3Var.b();
        }
        this.f114555a.f114874a.remove(this);
        this.f114557c = null;
        this.f114558d = null;
    }

    @Override // yads.z42
    public final void b() {
        oh2 oh2Var = this.f114558d;
        if (oh2Var != null) {
            oh2Var.a();
        }
        y3 y3Var = this.f114557c;
        if (y3Var != null) {
            y3Var.b();
        }
        this.f114555a.f114874a.remove(this);
        this.f114557c = null;
        this.f114558d = null;
    }

    @Override // yads.mw0
    public final void invalidate() {
        this.f114555a.f114874a.remove(this);
        this.f114557c = null;
        this.f114558d = null;
    }

    @Override // yads.mw0
    public final void pause() {
    }

    @Override // yads.mw0
    public final void resume() {
    }

    @Override // yads.mw0
    public final void start() {
        this.f114555a.f114874a.add(this);
    }

    @Override // yads.z42
    public final void a() {
        y3 y3Var = this.f114557c;
        if (y3Var != null) {
            y3Var.a();
        }
        this.f114557c = null;
    }
}
