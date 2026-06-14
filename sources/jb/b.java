package jb;

import com.google.common.base.Ascii;
import java.util.Arrays;
import jb.i;
import oa.a0;
import oa.b0;
import oa.m0;
import oa.s;
import oa.y;
import oa.z;
import q9.d0;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
final class b extends i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private b0 f85713n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private a f85714o;

    private static final class a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private b0 f85715a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b0.a f85716b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f85717c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f85718d = -1;

        public a(b0 b0Var, b0.a aVar) {
            this.f85715a = b0Var;
            this.f85716b = aVar;
        }

        @Override // jb.g
        public long a(s sVar) {
            long j10 = this.f85718d;
            if (j10 < 0) {
                return -1L;
            }
            long j11 = -(j10 + 2);
            this.f85718d = -1L;
            return j11;
        }

        public void b(long j10) {
            this.f85717c = j10;
        }

        @Override // jb.g
        public m0 createSeekMap() {
            q9.a.g(this.f85717c != -1);
            return new a0(this.f85715a, this.f85717c);
        }

        @Override // jb.g
        public void startSeek(long j10) {
            long[] jArr = this.f85716b.f96476a;
            this.f85718d = jArr[o0.h(jArr, j10, true, true)];
        }
    }

    b() {
    }

    private int n(d0 d0Var) {
        int i10 = (d0Var.e()[2] & 255) >> 4;
        if (i10 == 6 || i10 == 7) {
            d0Var.X(4);
            d0Var.Q();
        }
        int iJ = y.j(d0Var, i10);
        d0Var.W(0);
        return iJ;
    }

    private static boolean o(byte[] bArr) {
        return bArr[0] == -1;
    }

    public static boolean p(d0 d0Var) {
        return d0Var.a() >= 5 && d0Var.H() == 127 && d0Var.J() == 1179402563;
    }

    @Override // jb.i
    protected long f(d0 d0Var) {
        if (o(d0Var.e())) {
            return n(d0Var);
        }
        return -1L;
    }

    @Override // jb.i
    protected boolean i(d0 d0Var, long j10, i.b bVar) {
        byte[] bArrE = d0Var.e();
        b0 b0Var = this.f85713n;
        if (b0Var == null) {
            b0 b0Var2 = new b0(bArrE, 17);
            this.f85713n = b0Var2;
            bVar.f85755a = b0Var2.g(Arrays.copyOfRange(bArrE, 9, d0Var.g()), null).b().U("audio/ogg").N();
            return true;
        }
        if ((bArrE[0] & Ascii.DEL) == 3) {
            b0.a aVarG = z.g(d0Var);
            b0 b0VarB = b0Var.b(aVarG);
            this.f85713n = b0VarB;
            this.f85714o = new a(b0VarB, aVarG);
            return true;
        }
        if (!o(bArrE)) {
            return true;
        }
        a aVar = this.f85714o;
        if (aVar != null) {
            aVar.b(j10);
            bVar.f85756b = this.f85714o;
        }
        q9.a.e(bVar.f85755a);
        return false;
    }

    @Override // jb.i
    protected void l(boolean z10) {
        super.l(z10);
        if (z10) {
            this.f85713n = null;
            this.f85714o = null;
        }
    }
}
