package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class i11 implements qk0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z43 f111833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f111834c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f111836e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f111837f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w92 f111832a = new w92(10);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f111835d = -9223372036854775807L;

    @Override // yads.qk0
    public final void a(w92 w92Var) {
        if (this.f111833b == null) {
            throw new IllegalStateException();
        }
        if (this.f111834c) {
            int i10 = w92Var.f117358c - w92Var.f117357b;
            int i11 = this.f111837f;
            if (i11 < 10) {
                int iMin = Math.min(i10, 10 - i11);
                System.arraycopy(w92Var.f117356a, w92Var.f117357b, this.f111832a.f117356a, this.f111837f, iMin);
                if (this.f111837f + iMin == 10) {
                    this.f111832a.e(0);
                    if (73 != this.f111832a.m() || 68 != this.f111832a.m() || 51 != this.f111832a.m()) {
                        uf1.d("Id3Reader", "Discarding invalid ID3 tag");
                        this.f111834c = false;
                        return;
                    } else {
                        w92 w92Var2 = this.f111832a;
                        w92Var2.e(w92Var2.f117357b + 3);
                        this.f111836e = this.f111832a.l() + 10;
                    }
                }
            }
            int iMin2 = Math.min(i10, this.f111836e - this.f111837f);
            this.f111833b.a(iMin2, w92Var);
            this.f111837f += iMin2;
        }
    }

    @Override // yads.qk0
    public final void b() {
        int i10;
        z43 z43Var = this.f111833b;
        if (z43Var == null) {
            throw new IllegalStateException();
        }
        if (this.f111834c && (i10 = this.f111836e) != 0 && this.f111837f == i10) {
            long j10 = this.f111835d;
            if (j10 != -9223372036854775807L) {
                z43Var.a(j10, 1, i10, 0, null);
            }
            this.f111834c = false;
        }
    }

    @Override // yads.qk0
    public final void a(ap0 ap0Var, y63 y63Var) {
        y63Var.a();
        y63Var.b();
        z43 z43VarA = ap0Var.a(y63Var.f118106d, 5);
        this.f111833b = z43VarA;
        xv0 xv0Var = new xv0();
        y63Var.b();
        xv0Var.f117972a = y63Var.f118107e;
        xv0Var.f117982k = "application/id3";
        z43VarA.a(new yv0(xv0Var));
    }

    @Override // yads.qk0
    public final void a(int i10, long j10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f111834c = true;
        if (j10 != -9223372036854775807L) {
            this.f111835d = j10;
        }
        this.f111836e = 0;
        this.f111837f = 0;
    }

    @Override // yads.qk0
    public final void a() {
        this.f111834c = false;
        this.f111835d = -9223372036854775807L;
    }
}
