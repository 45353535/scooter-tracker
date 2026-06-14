package yads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class ex2 implements me1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h30 f110515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d13 f110516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f110517c;

    public ex2(c30 c30Var, h30 h30Var) {
        ge1.a();
        this.f110515a = h30Var;
        this.f110516b = new d13(c30Var);
    }

    @Override // yads.me1
    public final void a() {
        int i10;
        d13 d13Var;
        byte[] bArr;
        d13 d13Var2 = this.f110516b;
        d13Var2.f109697b = 0L;
        try {
            d13Var2.a(this.f110515a);
            do {
                i10 = (int) this.f110516b.f109697b;
                byte[] bArr2 = this.f110517c;
                if (bArr2 == null) {
                    this.f110517c = new byte[1024];
                } else if (i10 == bArr2.length) {
                    this.f110517c = Arrays.copyOf(bArr2, bArr2.length * 2);
                }
                d13Var = this.f110516b;
                bArr = this.f110517c;
            } while (d13Var.c(bArr, i10, bArr.length - i10) != -1);
            f30.a(this.f110516b);
        } catch (Throwable th2) {
            f30.a(this.f110516b);
            throw th2;
        }
    }

    @Override // yads.me1
    public final void b() {
    }
}
