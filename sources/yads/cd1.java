package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class cd1 implements qk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f109352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w92 f109353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v92 f109354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public z43 f109355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f109356e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public yv0 f109357f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f109358g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f109359h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f109360i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f109361j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f109362k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f109363l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f109364m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f109365n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f109366o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f109367p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f109368q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f109369r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f109370s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f109371t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f109372u;

    public cd1(String str) {
        this.f109352a = str;
        w92 w92Var = new w92(1024);
        this.f109353b = w92Var;
        this.f109354c = new v92(w92Var.a());
        this.f109362k = -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0180, code lost:
    
        throw new yads.ba2(null, null, true, 1);
     */
    @Override // yads.qk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(yads.w92 r18) throws yads.ba2 {
        /*
            Method dump skipped, instruction units count: 608
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.cd1.a(yads.w92):void");
    }

    @Override // yads.qk0
    public final void b() {
    }

    @Override // yads.qk0
    public final void a(ap0 ap0Var, y63 y63Var) {
        y63Var.a();
        y63Var.b();
        this.f109355d = ap0Var.a(y63Var.f118106d, 1);
        y63Var.b();
        this.f109356e = y63Var.f118107e;
    }

    @Override // yads.qk0
    public final void a(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f109362k = j10;
        }
    }

    @Override // yads.qk0
    public final void a() {
        this.f109358g = 0;
        this.f109362k = -9223372036854775807L;
        this.f109363l = false;
    }
}
