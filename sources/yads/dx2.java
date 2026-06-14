package yads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class dx2 implements iq2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f110107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f110108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fx2 f110109d;

    public dx2(fx2 fx2Var) {
        this.f110109d = fx2Var;
    }

    @Override // yads.iq2
    public final void a() throws IOException {
        fx2 fx2Var = this.f110109d;
        if (fx2Var.f110969l) {
            return;
        }
        fx2Var.f110967j.a(Integer.MIN_VALUE);
    }

    @Override // yads.iq2
    public final boolean c() {
        return this.f110109d.f110970m;
    }

    @Override // yads.iq2
    public final int a(zv0 zv0Var, fa0 fa0Var, int i10) {
        if (!this.f110108c) {
            fx2 fx2Var = this.f110109d;
            ol1 ol1Var = fx2Var.f110963f;
            ol1Var.a(new tk1(1, tr1.d(fx2Var.f110968k.f118398m), this.f110109d.f110968k, 0, null, ol1Var.a(0L), -9223372036854775807L));
            this.f110108c = true;
        }
        fx2 fx2Var2 = this.f110109d;
        boolean z10 = fx2Var2.f110970m;
        if (z10 && fx2Var2.f110971n == null) {
            this.f110107b = 2;
        }
        int i11 = this.f110107b;
        if (i11 == 2) {
            fa0Var.f112430b |= 4;
            return -4;
        }
        if ((i10 & 2) != 0 || i11 == 0) {
            zv0Var.f118845b = fx2Var2.f110968k;
            this.f110107b = 1;
            return -5;
        }
        if (!z10) {
            return -3;
        }
        fx2Var2.f110971n.getClass();
        fa0Var.f112430b |= 1;
        fa0Var.f110672f = 0L;
        if ((i10 & 4) == 0) {
            fa0Var.c(this.f110109d.f110972o);
            ByteBuffer byteBuffer = fa0Var.f110670d;
            fx2 fx2Var3 = this.f110109d;
            byteBuffer.put(fx2Var3.f110971n, 0, fx2Var3.f110972o);
        }
        if ((i10 & 1) == 0) {
            this.f110107b = 2;
        }
        return -4;
    }

    @Override // yads.iq2
    public final int a(long j10) {
        if (!this.f110108c) {
            fx2 fx2Var = this.f110109d;
            ol1 ol1Var = fx2Var.f110963f;
            ol1Var.a(new tk1(1, tr1.d(fx2Var.f110968k.f118398m), this.f110109d.f110968k, 0, null, ol1Var.a(0L), -9223372036854775807L));
            this.f110108c = true;
        }
        if (j10 <= 0 || this.f110107b == 2) {
            return 0;
        }
        this.f110107b = 2;
        return 1;
    }
}
