package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class vd0 implements c82 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b82 f116965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f116966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f116967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l13 f116968d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f116969e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f116970f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f116971g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f116972h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f116973i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f116974j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f116975k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f116976l;

    public vd0(l13 l13Var, long j10, long j11, long j12, long j13, boolean z10) {
        fi.a(j10 >= 0 && j11 > j10);
        this.f116968d = l13Var;
        this.f116966b = j10;
        this.f116967c = j11;
        if (j12 == j11 - j10 || z10) {
            this.f116970f = j13;
            this.f116969e = 4;
        } else {
            this.f116969e = 0;
        }
        this.f116965a = new b82();
    }

    @Override // yads.c82
    public final nu2 a() {
        if (this.f116970f != 0) {
            return new ud0(this);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c4  */
    @Override // yads.c82
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(yads.yc0 r27) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.vd0.a(yads.yc0):long");
    }

    @Override // yads.c82
    public final void a(long j10) {
        long j11 = this.f116970f - 1;
        int i10 = w83.f117341a;
        this.f116972h = Math.max(0L, Math.min(j10, j11));
        this.f116969e = 2;
        this.f116973i = this.f116966b;
        this.f116974j = this.f116967c;
        this.f116975k = 0L;
        this.f116976l = this.f116970f;
    }
}
