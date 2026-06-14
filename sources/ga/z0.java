package ga;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import ga.b1;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import ka.b;
import oa.s0;

/* JADX INFO: loaded from: classes12.dex */
class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ka.b f72562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f72563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q9.d0 f72564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f72565d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f72566e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f72567f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f72568g;

    private static final class a implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f72569a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f72570b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ka.a f72571c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public a f72572d;

        public a(long j10, int i10) {
            c(j10, i10);
        }

        public a a() {
            this.f72571c = null;
            a aVar = this.f72572d;
            this.f72572d = null;
            return aVar;
        }

        public void b(ka.a aVar, a aVar2) {
            this.f72571c = aVar;
            this.f72572d = aVar2;
        }

        public void c(long j10, int i10) {
            q9.a.g(this.f72571c == null);
            this.f72569a = j10;
            this.f72570b = j10 + ((long) i10);
        }

        public int d(long j10) {
            return ((int) (j10 - this.f72569a)) + this.f72571c.f93056b;
        }

        @Override // ka.b.a
        public ka.a getAllocation() {
            return (ka.a) q9.a.e(this.f72571c);
        }

        @Override // ka.b.a
        public b.a next() {
            a aVar = this.f72572d;
            if (aVar == null || aVar.f72571c == null) {
                return null;
            }
            return aVar;
        }
    }

    public z0(ka.b bVar) {
        this.f72562a = bVar;
        int individualAllocationLength = bVar.getIndividualAllocationLength();
        this.f72563b = individualAllocationLength;
        this.f72564c = new q9.d0(32);
        a aVar = new a(0L, individualAllocationLength);
        this.f72565d = aVar;
        this.f72566e = aVar;
        this.f72567f = aVar;
    }

    private void a(a aVar) {
        if (aVar.f72571c == null) {
            return;
        }
        this.f72562a.b(aVar);
        aVar.a();
    }

    private static a d(a aVar, long j10) {
        while (j10 >= aVar.f72570b) {
            aVar = aVar.f72572d;
        }
        return aVar;
    }

    private void g(int i10) {
        long j10 = this.f72568g + ((long) i10);
        this.f72568g = j10;
        a aVar = this.f72567f;
        if (j10 == aVar.f72570b) {
            this.f72567f = aVar.f72572d;
        }
    }

    private int h(int i10) {
        a aVar = this.f72567f;
        if (aVar.f72571c == null) {
            aVar.b(this.f72562a.allocate(), new a(this.f72567f.f72570b, this.f72563b));
        }
        return Math.min(i10, (int) (this.f72567f.f72570b - this.f72568g));
    }

    private static a i(a aVar, long j10, ByteBuffer byteBuffer, int i10) {
        a aVarD = d(aVar, j10);
        while (i10 > 0) {
            int iMin = Math.min(i10, (int) (aVarD.f72570b - j10));
            byteBuffer.put(aVarD.f72571c.f93055a, aVarD.d(j10), iMin);
            i10 -= iMin;
            j10 += (long) iMin;
            if (j10 == aVarD.f72570b) {
                aVarD = aVarD.f72572d;
            }
        }
        return aVarD;
    }

    private static a j(a aVar, long j10, byte[] bArr, int i10) {
        a aVarD = d(aVar, j10);
        int i11 = i10;
        while (i11 > 0) {
            int iMin = Math.min(i11, (int) (aVarD.f72570b - j10));
            System.arraycopy(aVarD.f72571c.f93055a, aVarD.d(j10), bArr, i10 - i11, iMin);
            i11 -= iMin;
            j10 += (long) iMin;
            if (j10 == aVarD.f72570b) {
                aVarD = aVarD.f72572d;
            }
        }
        return aVarD;
    }

    private static a k(a aVar, t9.f fVar, b1.b bVar, q9.d0 d0Var) {
        long j10 = bVar.f72225b;
        int iP = 1;
        d0Var.S(1);
        a aVarJ = j(aVar, j10, d0Var.e(), 1);
        long j11 = j10 + 1;
        byte b10 = d0Var.e()[0];
        boolean z10 = (b10 & UnsignedBytes.MAX_POWER_OF_TWO) != 0;
        int i10 = b10 & Ascii.DEL;
        t9.c cVar = fVar.f104987d;
        byte[] bArr = cVar.f104974a;
        if (bArr == null) {
            cVar.f104974a = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        a aVarJ2 = j(aVarJ, j11, cVar.f104974a, i10);
        long j12 = j11 + ((long) i10);
        if (z10) {
            d0Var.S(2);
            aVarJ2 = j(aVarJ2, j12, d0Var.e(), 2);
            j12 += 2;
            iP = d0Var.P();
        }
        int i11 = iP;
        int[] iArr = cVar.f104977d;
        if (iArr == null || iArr.length < i11) {
            iArr = new int[i11];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = cVar.f104978e;
        if (iArr3 == null || iArr3.length < i11) {
            iArr3 = new int[i11];
        }
        int[] iArr4 = iArr3;
        if (z10) {
            int i12 = i11 * 6;
            d0Var.S(i12);
            aVarJ2 = j(aVarJ2, j12, d0Var.e(), i12);
            j12 += (long) i12;
            d0Var.W(0);
            for (int i13 = 0; i13 < i11; i13++) {
                iArr2[i13] = d0Var.P();
                iArr4[i13] = d0Var.L();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = bVar.f72224a - ((int) (j12 - bVar.f72225b));
        }
        s0.a aVar2 = (s0.a) q9.o0.i(bVar.f72226c);
        cVar.c(i11, iArr2, iArr4, aVar2.f96643b, cVar.f104974a, aVar2.f96642a, aVar2.f96644c, aVar2.f96645d);
        long j13 = bVar.f72225b;
        int i14 = (int) (j12 - j13);
        bVar.f72225b = j13 + ((long) i14);
        bVar.f72224a -= i14;
        return aVarJ2;
    }

    private static a l(a aVar, t9.f fVar, b1.b bVar, q9.d0 d0Var) {
        if (fVar.o()) {
            aVar = k(aVar, fVar, bVar, d0Var);
        }
        if (!fVar.e()) {
            fVar.m(bVar.f72224a);
            return i(aVar, bVar.f72225b, fVar.f104988e, bVar.f72224a);
        }
        d0Var.S(4);
        a aVarJ = j(aVar, bVar.f72225b, d0Var.e(), 4);
        int iL = d0Var.L();
        bVar.f72225b += 4;
        bVar.f72224a -= 4;
        fVar.m(iL);
        a aVarI = i(aVarJ, bVar.f72225b, fVar.f104988e, iL);
        bVar.f72225b += (long) iL;
        int i10 = bVar.f72224a - iL;
        bVar.f72224a = i10;
        fVar.q(i10);
        return i(aVarI, bVar.f72225b, fVar.f104991h, bVar.f72224a);
    }

    public void b(long j10) {
        a aVar;
        if (j10 == -1) {
            return;
        }
        while (true) {
            aVar = this.f72565d;
            if (j10 < aVar.f72570b) {
                break;
            }
            this.f72562a.a(aVar.f72571c);
            this.f72565d = this.f72565d.a();
        }
        if (this.f72566e.f72569a < aVar.f72569a) {
            this.f72566e = aVar;
        }
    }

    public void c(long j10) {
        q9.a.a(j10 <= this.f72568g);
        this.f72568g = j10;
        if (j10 != 0) {
            a aVar = this.f72565d;
            if (j10 != aVar.f72569a) {
                while (this.f72568g > aVar.f72570b) {
                    aVar = aVar.f72572d;
                }
                a aVar2 = (a) q9.a.e(aVar.f72572d);
                a(aVar2);
                a aVar3 = new a(aVar.f72570b, this.f72563b);
                aVar.f72572d = aVar3;
                if (this.f72568g == aVar.f72570b) {
                    aVar = aVar3;
                }
                this.f72567f = aVar;
                if (this.f72566e == aVar2) {
                    this.f72566e = aVar3;
                    return;
                }
                return;
            }
        }
        a(this.f72565d);
        a aVar4 = new a(this.f72568g, this.f72563b);
        this.f72565d = aVar4;
        this.f72566e = aVar4;
        this.f72567f = aVar4;
    }

    public long e() {
        return this.f72568g;
    }

    public void f(t9.f fVar, b1.b bVar) {
        l(this.f72566e, fVar, bVar, this.f72564c);
    }

    public void m(t9.f fVar, b1.b bVar) {
        this.f72566e = l(this.f72566e, fVar, bVar, this.f72564c);
    }

    public void n() {
        a(this.f72565d);
        this.f72565d.c(0L, this.f72563b);
        a aVar = this.f72565d;
        this.f72566e = aVar;
        this.f72567f = aVar;
        this.f72568g = 0L;
        this.f72562a.trim();
    }

    public void o() {
        this.f72566e = this.f72565d;
    }

    public int p(n9.h hVar, int i10, boolean z10) throws EOFException {
        int iH = h(i10);
        a aVar = this.f72567f;
        int i11 = hVar.read(aVar.f72571c.f93055a, aVar.d(this.f72568g), iH);
        if (i11 != -1) {
            g(i11);
            return i11;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    public void q(q9.d0 d0Var, int i10) {
        while (i10 > 0) {
            int iH = h(i10);
            a aVar = this.f72567f;
            d0Var.l(aVar.f72571c.f93055a, aVar.d(this.f72568g), iH);
            i10 -= iH;
            g(iH);
        }
    }
}
