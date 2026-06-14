package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class qj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f115020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f115021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f115022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f115023d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f115024e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w92 f115025f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w92 f115026g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f115027h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f115028i;

    public qj(w92 w92Var, w92 w92Var2, boolean z10) throws ba2 {
        this.f115026g = w92Var;
        this.f115025f = w92Var2;
        this.f115024e = z10;
        w92Var2.e(12);
        this.f115020a = w92Var2.p();
        w92Var.e(12);
        this.f115028i = w92Var.p();
        bp0.a("first_chunk must be 1", w92Var.b() == 1);
        this.f115021b = -1;
    }

    public final boolean a() {
        int i10 = this.f115021b + 1;
        this.f115021b = i10;
        if (i10 == this.f115020a) {
            return false;
        }
        this.f115023d = this.f115024e ? this.f115025f.q() : this.f115025f.n();
        if (this.f115021b == this.f115027h) {
            this.f115022c = this.f115026g.p();
            w92 w92Var = this.f115026g;
            w92Var.e(w92Var.f117357b + 4);
            int i11 = this.f115028i - 1;
            this.f115028i = i11;
            this.f115027h = i11 > 0 ? this.f115026g.p() - 1 : -1;
        }
        return true;
    }
}
