package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class qq implements z43 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f115122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yv0 f115123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wj0 f115124c = new wj0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public yv0 f115125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public z43 f115126e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f115127f;

    public qq(int i10, int i11, yv0 yv0Var) {
        this.f115122a = i11;
        this.f115123b = yv0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a9  */
    @Override // yads.z43
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(yads.yv0 r24) {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.qq.a(yads.yv0):void");
    }

    @Override // yads.z43
    public /* synthetic */ int b(y20 y20Var, int i10, boolean z10) {
        return m71.a(this, y20Var, i10, z10);
    }

    @Override // yads.z43
    public /* synthetic */ void b(int i10, w92 w92Var) {
        m71.b(this, i10, w92Var);
    }

    @Override // yads.z43
    public final int a(y20 y20Var, int i10, boolean z10) {
        z43 z43Var = this.f115126e;
        int i11 = w83.f117341a;
        return z43Var.b(y20Var, i10, z10);
    }

    @Override // yads.z43
    public final void a(int i10, w92 w92Var) {
        z43 z43Var = this.f115126e;
        int i11 = w83.f117341a;
        z43Var.a(i10, w92Var);
    }

    @Override // yads.z43
    public final void a(long j10, int i10, int i11, int i12, y43 y43Var) {
        long j11 = this.f115127f;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            this.f115126e = this.f115124c;
        }
        z43 z43Var = this.f115126e;
        int i13 = w83.f117341a;
        z43Var.a(j10, i10, i11, i12, y43Var);
    }
}
