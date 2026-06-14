package yads;

import java.io.EOFException;

/* JADX INFO: loaded from: classes4.dex */
public final class h11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w92 f111435a = new w92(10);

    public final fr1 a(yc0 yc0Var, d11 d11Var) throws Throwable {
        fr1 fr1VarA = null;
        int i10 = 0;
        while (true) {
            try {
                yc0Var.b(this.f111435a.f117356a, 0, 10, false);
                this.f111435a.e(0);
                if (this.f111435a.o() != 4801587) {
                    break;
                }
                w92 w92Var = this.f111435a;
                w92Var.e(w92Var.f117357b + 3);
                int iL = this.f111435a.l();
                int i11 = iL + 10;
                if (fr1VarA == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(this.f111435a.f117356a, 0, bArr, 0, 10);
                    yc0Var.b(bArr, 10, iL, false);
                    fr1VarA = new f11(d11Var).a(i11, bArr);
                } else {
                    yc0Var.a(false, iL);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        yc0Var.f118154f = 0;
        yc0Var.a(false, i10);
        return fr1VarA;
    }
}
