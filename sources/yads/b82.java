package yads;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes4.dex */
public final class b82 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f108933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f108934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f108935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f108936d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f108937e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f108938f = new int[255];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w92 f108939g = new w92(255);

    public final boolean a(yc0 yc0Var, boolean z10) throws ba2, EOFException {
        this.f108933a = 0;
        this.f108934b = 0L;
        this.f108935c = 0;
        this.f108936d = 0;
        this.f108937e = 0;
        this.f108939g.c(27);
        try {
            if (yc0Var.b(this.f108939g.f117356a, 0, 27, z10) && this.f108939g.n() == 1332176723) {
                if (this.f108939g.m() != 0) {
                    if (z10) {
                        return false;
                    }
                    throw ba2.b("unsupported bit stream revision");
                }
                this.f108933a = this.f108939g.m();
                this.f108934b = this.f108939g.e();
                this.f108939g.g();
                this.f108939g.g();
                this.f108939g.g();
                int iM = this.f108939g.m();
                this.f108935c = iM;
                this.f108936d = iM + 27;
                this.f108939g.c(iM);
                try {
                    if (yc0Var.b(this.f108939g.f117356a, 0, this.f108935c, z10)) {
                        for (int i10 = 0; i10 < this.f108935c; i10++) {
                            this.f108938f[i10] = this.f108939g.m();
                            this.f108937e += this.f108938f[i10];
                        }
                        return true;
                    }
                } catch (EOFException e10) {
                    if (!z10) {
                        throw e10;
                    }
                }
                return false;
            }
        } catch (EOFException e11) {
            if (!z10) {
                throw e11;
            }
        }
        return false;
    }

    public final boolean a(yc0 yc0Var, long j10) throws EOFException, InterruptedIOException {
        long j11 = yc0Var.f118152d;
        if (j11 == ((long) yc0Var.f118154f) + j11) {
            this.f108939g.c(4);
            while (true) {
                if (j10 != -1 && yc0Var.f118152d + 4 >= j10) {
                    break;
                }
                try {
                    if (!yc0Var.b(this.f108939g.f117356a, 0, 4, true)) {
                        break;
                    }
                    this.f108939g.e(0);
                    if (this.f108939g.n() == 1332176723) {
                        yc0Var.f118154f = 0;
                        return true;
                    }
                    yc0Var.a(1);
                } catch (EOFException unused) {
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
        do {
            if (j10 != -1 && yc0Var.f118152d >= j10) {
                break;
            }
        } while (yc0Var.c(1) != -1);
        return false;
    }
}
