package yads;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes4.dex */
public final class nc1 implements xo0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ap0 f113799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f113800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f113801d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f113802e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public tt1 f113804g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public yo0 f113805h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public y03 f113806i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public wt1 f113807j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w92 f113798a = new w92(6);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f113803f = -1;

    public final void a() {
        ap0 ap0Var = this.f113799b;
        ap0Var.getClass();
        z43 z43VarA = ap0Var.a(1024, 4);
        xv0 xv0Var = new xv0();
        xv0Var.f117981j = "image/jpeg";
        xv0Var.f117980i = new fr1(new er1[0]);
        z43VarA.a(new yv0(xv0Var));
        ap0 ap0Var2 = this.f113799b;
        ap0Var2.getClass();
        ap0Var2.a();
        this.f113799b.a(new mu2(-9223372036854775807L, 0L));
        this.f113800c = 6;
    }

    @Override // yads.xo0
    public final void release() {
    }

    @Override // yads.xo0
    public final void a(ap0 ap0Var) {
        this.f113799b = ap0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0198  */
    @Override // yads.xo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(yads.yo0 r27, yads.be2 r28) throws yads.ba2, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instruction units count: 512
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.nc1.a(yads.yo0, yads.be2):int");
    }

    @Override // yads.xo0
    public final void a(long j10, long j11) {
        if (j10 == 0) {
            this.f113800c = 0;
            this.f113807j = null;
        } else if (this.f113800c == 5) {
            wt1 wt1Var = this.f113807j;
            wt1Var.getClass();
            wt1Var.a(j10, j11);
        }
    }

    @Override // yads.xo0
    public final boolean a(yo0 yo0Var) throws EOFException, InterruptedIOException {
        yc0 yc0Var = (yc0) yo0Var;
        this.f113798a.c(2);
        yc0Var.b(this.f113798a.f117356a, 0, 2, false);
        if (this.f113798a.r() != 65496) {
            return false;
        }
        this.f113798a.c(2);
        yc0Var.b(this.f113798a.f117356a, 0, 2, false);
        int iR = this.f113798a.r();
        this.f113801d = iR;
        if (iR == 65504) {
            this.f113798a.c(2);
            yc0Var.b(this.f113798a.f117356a, 0, 2, false);
            yc0Var.a(false, this.f113798a.r() - 2);
            this.f113798a.c(2);
            yc0Var.b(this.f113798a.f117356a, 0, 2, false);
            this.f113801d = this.f113798a.r();
        }
        if (this.f113801d != 65505) {
            return false;
        }
        yc0Var.a(false, 2);
        this.f113798a.c(6);
        yc0Var.b(this.f113798a.f117356a, 0, 6, false);
        return this.f113798a.n() == 1165519206 && this.f113798a.r() == 0;
    }
}
