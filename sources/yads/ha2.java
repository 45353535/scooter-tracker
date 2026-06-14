package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class ha2 implements ju2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public yv0 f111529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l43 f111530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z43 f111531c;

    public ha2(String str) {
        this.f111529a = new xv0().d(str).a();
    }

    @Override // yads.ju2
    public final void a(w92 w92Var) {
        long jA;
        l43 l43Var = this.f111530b;
        if (l43Var == null) {
            throw new IllegalStateException();
        }
        int i10 = w83.f117341a;
        synchronized (l43Var) {
            try {
                long j10 = l43Var.f112969c;
                jA = j10 != -9223372036854775807L ? j10 + l43Var.f112968b : l43Var.a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        long jB = this.f111530b.b();
        if (jA == -9223372036854775807L || jB == -9223372036854775807L) {
            return;
        }
        yv0 yv0Var = this.f111529a;
        if (jB != yv0Var.f118402q) {
            xv0 xv0Var = new xv0(yv0Var);
            xv0Var.f117986o = jB;
            yv0 yv0Var2 = new yv0(xv0Var);
            this.f111529a = yv0Var2;
            this.f111531c.a(yv0Var2);
        }
        int i11 = w92Var.f117358c - w92Var.f117357b;
        this.f111531c.a(i11, w92Var);
        this.f111531c.a(jA, 1, i11, 0, null);
    }

    @Override // yads.ju2
    public final void a(l43 l43Var, ap0 ap0Var, y63 y63Var) {
        this.f111530b = l43Var;
        y63Var.a();
        y63Var.b();
        z43 z43VarA = ap0Var.a(y63Var.f118106d, 5);
        this.f111531c = z43VarA;
        z43VarA.a(this.f111529a);
    }
}
