package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class qk3 implements pk3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ap0 f115046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z43 f115047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sk3 f115048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yv0 f115049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f115050e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f115051f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f115052g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f115053h;

    public qk3(ap0 ap0Var, z43 z43Var, sk3 sk3Var, String str, int i10) throws ba2 {
        this.f115046a = ap0Var;
        this.f115047b = z43Var;
        this.f115048c = sk3Var;
        int i11 = (sk3Var.f115844a * sk3Var.f115847d) / 8;
        if (sk3Var.f115846c != i11) {
            throw ba2.a("Expected block size: " + i11 + "; got: " + sk3Var.f115846c);
        }
        int i12 = sk3Var.f115845b * i11;
        int i13 = i12 * 8;
        int iMax = Math.max(i11, i12 / 10);
        this.f115050e = iMax;
        this.f115049d = new xv0().d(str).a(i13).e(i13).c(iMax).b(sk3Var.f115844a).g(sk3Var.f115845b).d(i10).a();
    }

    @Override // yads.pk3
    public final void a(int i10, long j10) {
        this.f115046a.a(new vk3(this.f115048c, 1, i10, j10));
        this.f115047b.a(this.f115049d);
    }

    @Override // yads.pk3
    public final void a(long j10) {
        this.f115051f = j10;
        this.f115052g = 0;
        this.f115053h = 0L;
    }

    @Override // yads.pk3
    public final boolean a(yc0 yc0Var, long j10) {
        int i10;
        int i11;
        long j11 = j10;
        while (j11 > 0 && (i10 = this.f115052g) < (i11 = this.f115050e)) {
            int iA = this.f115047b.a(yc0Var, (int) Math.min(i11 - i10, j11), true);
            if (iA == -1) {
                j11 = 0;
            } else {
                this.f115052g += iA;
                j11 -= (long) iA;
            }
        }
        int i12 = this.f115048c.f115846c;
        int i13 = this.f115052g / i12;
        if (i13 > 0) {
            long jA = this.f115051f + w83.a(this.f115053h, 1000000L, r1.f115845b);
            int i14 = i13 * i12;
            int i15 = this.f115052g - i14;
            this.f115047b.a(jA, 1, i14, i15, null);
            this.f115053h += (long) i13;
            this.f115052g = i15;
        }
        return j11 <= 0;
    }
}
