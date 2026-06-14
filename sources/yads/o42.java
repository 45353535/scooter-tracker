package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class o42 implements mw0, z42 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q42 f114197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gp2 f114198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f114199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vv f114200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final iv f114201e;

    public o42(q42 q42Var, gp2 gp2Var, Long l10, vv vvVar, iv ivVar) {
        this.f114197a = q42Var;
        this.f114198b = gp2Var;
        this.f114199c = l10;
        this.f114200d = vvVar;
        this.f114201e = ivVar;
    }

    @Override // yads.z42
    public final void a(long j10, long j11) {
        if (this.f114201e.a()) {
            vv vvVar = this.f114200d;
            vvVar.f117209b = j11;
            long j12 = j11 + vvVar.f117208a;
            Long l10 = this.f114199c;
            if (l10 == null || j12 < l10.longValue()) {
                return;
            }
            this.f114198b.a();
            c();
        }
    }

    @Override // yads.z42
    public final void b() {
        if (this.f114201e.a()) {
            this.f114198b.a();
            c();
        }
    }

    public final void c() {
        this.f114197a.f114874a.remove(this);
    }

    @Override // yads.mw0
    public final void invalidate() {
        c();
    }

    @Override // yads.mw0
    public final void pause() {
    }

    @Override // yads.mw0
    public final void resume() {
    }

    @Override // yads.mw0
    public final void start() {
        Long l10;
        this.f114197a.f114874a.add(this);
        if (!this.f114201e.a() || (l10 = this.f114199c) == null || this.f114200d.f117208a < l10.longValue()) {
            return;
        }
        this.f114198b.a();
        c();
    }

    @Override // yads.z42
    public final void a() {
        this.f114198b.a();
        c();
    }
}
