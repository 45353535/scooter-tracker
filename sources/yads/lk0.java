package yads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class lk0 implements qk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f113125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z43[] f113126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f113127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f113128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f113129e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f113130f = -9223372036854775807L;

    public lk0(List list) {
        this.f113125a = list;
        this.f113126b = new z43[list.size()];
    }

    @Override // yads.qk0
    public final void a(w92 w92Var) {
        if (this.f113127c) {
            if (this.f113128d == 2) {
                if (w92Var.f117358c - w92Var.f117357b == 0) {
                    return;
                }
                if (w92Var.m() != 32) {
                    this.f113127c = false;
                }
                this.f113128d--;
                if (!this.f113127c) {
                    return;
                }
            }
            if (this.f113128d == 1) {
                if (w92Var.f117358c - w92Var.f117357b == 0) {
                    return;
                }
                if (w92Var.m() != 0) {
                    this.f113127c = false;
                }
                this.f113128d--;
                if (!this.f113127c) {
                    return;
                }
            }
            int i10 = w92Var.f117357b;
            int i11 = w92Var.f117358c - i10;
            for (z43 z43Var : this.f113126b) {
                w92Var.e(i10);
                z43Var.a(i11, w92Var);
            }
            this.f113129e += i11;
        }
    }

    @Override // yads.qk0
    public final void b() {
        if (this.f113127c) {
            if (this.f113130f != -9223372036854775807L) {
                for (z43 z43Var : this.f113126b) {
                    z43Var.a(this.f113130f, 1, this.f113129e, 0, null);
                }
            }
            this.f113127c = false;
        }
    }

    @Override // yads.qk0
    public final void a(ap0 ap0Var, y63 y63Var) {
        for (int i10 = 0; i10 < this.f113126b.length; i10++) {
            v63 v63Var = (v63) this.f113125a.get(i10);
            y63Var.a();
            y63Var.b();
            z43 z43VarA = ap0Var.a(y63Var.f118106d, 3);
            xv0 xv0Var = new xv0();
            y63Var.b();
            xv0Var.f117972a = y63Var.f118107e;
            xv0Var.f117982k = "application/dvbsubs";
            xv0Var.f117984m = Collections.singletonList(v63Var.f116898b);
            xv0Var.f117974c = v63Var.f116897a;
            z43VarA.a(new yv0(xv0Var));
            this.f113126b[i10] = z43VarA;
        }
    }

    @Override // yads.qk0
    public final void a(int i10, long j10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f113127c = true;
        if (j10 != -9223372036854775807L) {
            this.f113130f = j10;
        }
        this.f113129e = 0;
        this.f113128d = 2;
    }

    @Override // yads.qk0
    public final void a() {
        this.f113127c = false;
        this.f113130f = -9223372036854775807L;
    }
}
