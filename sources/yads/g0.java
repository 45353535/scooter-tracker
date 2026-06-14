package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class g0 implements qk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v92 f110996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w92 f110997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f110998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f110999d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public z43 f111000e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f111001f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f111002g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f111003h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f111004i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public yv0 f111005j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f111006k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f111007l;

    public g0() {
        this(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01f0  */
    @Override // yads.qk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(yads.w92 r23) {
        /*
            Method dump skipped, instruction units count: 910
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.g0.a(yads.w92):void");
    }

    @Override // yads.qk0
    public final void b() {
    }

    public g0(String str) {
        byte[] bArr = new byte[128];
        this.f110996a = new v92(bArr);
        this.f110997b = new w92(bArr);
        this.f111001f = 0;
        this.f111007l = -9223372036854775807L;
        this.f110998c = str;
    }

    @Override // yads.qk0
    public final void a(ap0 ap0Var, y63 y63Var) {
        y63Var.a();
        y63Var.b();
        this.f110999d = y63Var.f118107e;
        y63Var.b();
        this.f111000e = ap0Var.a(y63Var.f118106d, 1);
    }

    @Override // yads.qk0
    public final void a(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f111007l = j10;
        }
    }

    @Override // yads.qk0
    public final void a() {
        this.f111001f = 0;
        this.f111002g = 0;
        this.f111003h = false;
        this.f111007l = -9223372036854775807L;
    }
}
