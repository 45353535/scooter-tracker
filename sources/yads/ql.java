package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class ql implements xo0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f115056c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public rl f115058e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f115061h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public zt f115062i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f115066m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f115067n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w92 f115054a = new w92(12);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pl f115055b = new pl();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ap0 f115057d = new vj0();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public zt[] f115060g = new zt[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f115064k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f115065l = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f115063j = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f115059f = -9223372036854775807L;

    @Override // yads.xo0
    public final void a(ap0 ap0Var) {
        this.f115056c = 0;
        this.f115057d = ap0Var;
        this.f115061h = -1L;
    }

    @Override // yads.xo0
    public final void release() {
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010e  */
    @Override // yads.xo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(yads.yo0 r29, yads.be2 r30) throws yads.ba2, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instruction units count: 1070
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.ql.a(yads.yo0, yads.be2):int");
    }

    @Override // yads.xo0
    public final void a(long j10, long j11) {
        this.f115061h = -1L;
        this.f115062i = null;
        for (zt ztVar : this.f115060g) {
            if (ztVar.f118809j == 0) {
                ztVar.f118807h = 0;
            } else {
                ztVar.f118807h = ztVar.f118811l[w83.b(ztVar.f118810k, j10, true)];
            }
        }
        if (j10 == 0) {
            if (this.f115060g.length == 0) {
                this.f115056c = 0;
                return;
            } else {
                this.f115056c = 3;
                return;
            }
        }
        this.f115056c = 6;
    }

    @Override // yads.xo0
    public final boolean a(yo0 yo0Var) {
        ((yc0) yo0Var).b(this.f115054a.f117356a, 0, 12, false);
        this.f115054a.e(0);
        if (this.f115054a.d() != 1179011410) {
            return false;
        }
        w92 w92Var = this.f115054a;
        w92Var.e(w92Var.f117357b + 4);
        return this.f115054a.d() == 541677121;
    }
}
