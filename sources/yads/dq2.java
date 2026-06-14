package yads;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class dq2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ke f110023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f110024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w92 f110025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public cq2 f110026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public cq2 f110027e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public cq2 f110028f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f110029g;

    public dq2(ke keVar) {
        this.f110023a = keVar;
        int iB = ((va0) keVar).b();
        this.f110024b = iB;
        this.f110025c = new w92(32);
        cq2 cq2Var = new cq2(iB, 0L);
        this.f110026d = cq2Var;
        this.f110027e = cq2Var;
        this.f110028f = cq2Var;
    }

    public final void a(cq2 cq2Var) {
        if (cq2Var.f109519c == null) {
            return;
        }
        va0 va0Var = (va0) this.f110023a;
        synchronized (va0Var) {
            cq2 cq2Var2 = cq2Var;
            while (cq2Var2 != null) {
                try {
                    je[] jeVarArr = va0Var.f116917g;
                    int i10 = va0Var.f116916f;
                    va0Var.f116916f = i10 + 1;
                    je jeVar = cq2Var2.f109519c;
                    jeVar.getClass();
                    jeVarArr[i10] = jeVar;
                    va0Var.f116915e--;
                    cq2Var2 = cq2Var2.f109520d;
                    if (cq2Var2 == null || cq2Var2.f109519c == null) {
                        cq2Var2 = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            va0Var.notifyAll();
        }
        cq2Var.f109519c = null;
        cq2Var.f109520d = null;
    }

    public final void a(long j10) {
        cq2 cq2Var;
        if (j10 == -1) {
            return;
        }
        while (true) {
            cq2Var = this.f110026d;
            if (j10 < cq2Var.f109518b) {
                break;
            }
            ke keVar = this.f110023a;
            je jeVar = cq2Var.f109519c;
            va0 va0Var = (va0) keVar;
            synchronized (va0Var) {
                je[] jeVarArr = va0Var.f116917g;
                int i10 = va0Var.f116916f;
                va0Var.f116916f = i10 + 1;
                jeVarArr[i10] = jeVar;
                va0Var.f116915e--;
                va0Var.notifyAll();
            }
            cq2 cq2Var2 = this.f110026d;
            cq2Var2.f109519c = null;
            cq2 cq2Var3 = cq2Var2.f109520d;
            cq2Var2.f109520d = null;
            this.f110026d = cq2Var3;
        }
        if (this.f110027e.f109517a < cq2Var.f109517a) {
            this.f110027e = cq2Var;
        }
    }

    public static cq2 a(cq2 cq2Var, long j10, ByteBuffer byteBuffer, int i10) {
        while (j10 >= cq2Var.f109518b) {
            cq2Var = cq2Var.f109520d;
        }
        while (i10 > 0) {
            int iMin = Math.min(i10, (int) (cq2Var.f109518b - j10));
            je jeVar = cq2Var.f109519c;
            byteBuffer.put(jeVar.f112328a, ((int) (j10 - cq2Var.f109517a)) + jeVar.f112329b, iMin);
            i10 -= iMin;
            j10 += (long) iMin;
            if (j10 == cq2Var.f109518b) {
                cq2Var = cq2Var.f109520d;
            }
        }
        return cq2Var;
    }

    public static cq2 a(cq2 cq2Var, long j10, byte[] bArr, int i10) {
        while (j10 >= cq2Var.f109518b) {
            cq2Var = cq2Var.f109520d;
        }
        int i11 = i10;
        while (i11 > 0) {
            int iMin = Math.min(i11, (int) (cq2Var.f109518b - j10));
            je jeVar = cq2Var.f109519c;
            System.arraycopy(jeVar.f112328a, ((int) (j10 - cq2Var.f109517a)) + jeVar.f112329b, bArr, i10 - i11, iMin);
            i11 -= iMin;
            j10 += (long) iMin;
            if (j10 == cq2Var.f109518b) {
                cq2Var = cq2Var.f109520d;
            }
        }
        return cq2Var;
    }

    public static cq2 a(cq2 cq2Var, fa0 fa0Var, eq2 eq2Var, w92 w92Var) {
        cq2 cq2VarA;
        int iR;
        if (fa0Var.b(1073741824)) {
            long j10 = eq2Var.f110438b;
            w92Var.c(1);
            cq2 cq2VarA2 = a(cq2Var, j10, w92Var.f117356a, 1);
            long j11 = j10 + 1;
            byte b10 = w92Var.f117356a[0];
            boolean z10 = (b10 & UnsignedBytes.MAX_POWER_OF_TWO) != 0;
            int i10 = b10 & Ascii.DEL;
            y10 y10Var = fa0Var.f110669c;
            byte[] bArr = y10Var.f118048a;
            if (bArr == null) {
                y10Var.f118048a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            cq2VarA = a(cq2VarA2, j11, y10Var.f118048a, i10);
            long j12 = j11 + ((long) i10);
            if (z10) {
                w92Var.c(2);
                cq2VarA = a(cq2VarA, j12, w92Var.f117356a, 2);
                j12 += 2;
                iR = w92Var.r();
            } else {
                iR = 1;
            }
            int[] iArr = y10Var.f118051d;
            if (iArr == null || iArr.length < iR) {
                iArr = new int[iR];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = y10Var.f118052e;
            if (iArr3 == null || iArr3.length < iR) {
                iArr3 = new int[iR];
            }
            int[] iArr4 = iArr3;
            if (z10) {
                int i11 = iR * 6;
                w92Var.c(i11);
                cq2VarA = a(cq2VarA, j12, w92Var.f117356a, i11);
                j12 += (long) i11;
                w92Var.e(0);
                for (int i12 = 0; i12 < iR; i12++) {
                    iArr2[i12] = w92Var.r();
                    iArr4[i12] = w92Var.p();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = eq2Var.f110437a - ((int) (j12 - eq2Var.f110438b));
            }
            y43 y43Var = eq2Var.f110439c;
            int i13 = w83.f117341a;
            y10Var.a(iR, iArr2, iArr4, y43Var.f118081b, y10Var.f118048a, y43Var.f118080a, y43Var.f118082c, y43Var.f118083d);
            long j13 = eq2Var.f110438b;
            int i14 = (int) (j12 - j13);
            eq2Var.f110438b = j13 + ((long) i14);
            eq2Var.f110437a -= i14;
        } else {
            cq2VarA = cq2Var;
        }
        if (fa0Var.b(268435456)) {
            w92Var.c(4);
            cq2 cq2VarA3 = a(cq2VarA, eq2Var.f110438b, w92Var.f117356a, 4);
            int iP = w92Var.p();
            eq2Var.f110438b += 4;
            eq2Var.f110437a -= 4;
            fa0Var.c(iP);
            cq2 cq2VarA4 = a(cq2VarA3, eq2Var.f110438b, fa0Var.f110670d, iP);
            eq2Var.f110438b += (long) iP;
            int i15 = eq2Var.f110437a - iP;
            eq2Var.f110437a = i15;
            ByteBuffer byteBuffer = fa0Var.f110673g;
            if (byteBuffer != null && byteBuffer.capacity() >= i15) {
                fa0Var.f110673g.clear();
            } else {
                fa0Var.f110673g = ByteBuffer.allocate(i15);
            }
            return a(cq2VarA4, eq2Var.f110438b, fa0Var.f110673g, eq2Var.f110437a);
        }
        fa0Var.c(eq2Var.f110437a);
        return a(cq2VarA, eq2Var.f110438b, fa0Var.f110670d, eq2Var.f110437a);
    }
}
