package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class ia3 implements ed3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eh3 f111934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vc3 f111935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lh3 f111936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f111937d;

    public ia3(fh3 fh3Var, vc3 vc3Var, lh3 lh3Var) {
        this.f111934a = fh3Var;
        this.f111935b = vc3Var;
        this.f111936c = lh3Var;
    }

    @Override // yads.ed3
    public final void a(long j10, long j11) {
        if (this.f111937d || j11 <= 0 || !this.f111936c.a()) {
            return;
        }
        this.f111937d = true;
        this.f111934a.a(this.f111935b.getVolume(), j10);
    }

    public /* synthetic */ ia3(kh3 kh3Var, fh3 fh3Var, vc3 vc3Var) {
        this(fh3Var, vc3Var, new lh3(kh3Var));
    }
}
