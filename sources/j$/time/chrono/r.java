package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends AbstractC5641d {
    private static final long serialVersionUID = -5207853542612002020L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient p f84584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient int f84585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient int f84586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f84587d;

    @Override // j$.time.chrono.AbstractC5641d, j$.time.chrono.InterfaceC5639b
    public final InterfaceC5642e v(j$.time.j jVar) {
        return new C5644g(this, jVar);
    }

    public r(p pVar, int i10, int i11, int i12) {
        pVar.n(i10, i11, i12);
        this.f84584a = pVar;
        this.f84585b = i10;
        this.f84586c = i11;
        this.f84587d = i12;
    }

    public r(p pVar, long j10) {
        int i10 = (int) j10;
        pVar.k();
        if (i10 < pVar.f84576e || i10 >= pVar.f84577f) {
            throw new j$.time.b("Hijrah date out of range");
        }
        int iBinarySearch = Arrays.binarySearch(pVar.f84575d, i10);
        iBinarySearch = iBinarySearch < 0 ? (-iBinarySearch) - 2 : iBinarySearch;
        int i11 = pVar.f84578g;
        int[] iArr = {(iBinarySearch + i11) / 12, ((i11 + iBinarySearch) % 12) + 1, (i10 - pVar.f84575d[iBinarySearch]) + 1};
        this.f84584a = pVar;
        this.f84585b = iArr[0];
        this.f84586c = iArr[1];
        this.f84587d = iArr[2];
    }

    @Override // j$.time.chrono.InterfaceC5639b
    public final m a() {
        return this.f84584a;
    }

    @Override // j$.time.chrono.AbstractC5641d
    public final n D() {
        return s.AH;
    }

    @Override // j$.time.chrono.AbstractC5641d, j$.time.chrono.InterfaceC5639b
    public final int hashCode() {
        this.f84584a.getClass();
        int i10 = this.f84585b;
        return (((i10 << 11) + (this.f84586c << 6)) + this.f84587d) ^ ((i10 & (-2048)) ^ 2100100019);
    }

    @Override // j$.time.chrono.AbstractC5641d, j$.time.temporal.n
    public final j$.time.temporal.u n(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.p(this);
        }
        if (!j$.com.android.tools.r8.a.k(this, qVar)) {
            throw new j$.time.temporal.t(j$.time.c.a("Unsupported field: ", qVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        int i10 = q.f84583a[aVar.ordinal()];
        int i11 = this.f84585b;
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? this.f84584a.w(aVar) : j$.time.temporal.u.e(1L, 5L) : j$.time.temporal.u.e(1L, r3.C(i11, 12)) : j$.time.temporal.u.e(1L, r3.p(i11, this.f84586c));
    }

    @Override // j$.time.temporal.n
    public final long t(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.k(this);
        }
        int i10 = q.f84583a[((j$.time.temporal.a) qVar).ordinal()];
        int i11 = this.f84586c;
        int i12 = this.f84587d;
        int i13 = this.f84585b;
        switch (i10) {
            case 1:
                return i12;
            case 2:
                return J();
            case 3:
                return ((i12 - 1) / 7) + 1;
            case 4:
                return ((int) j$.com.android.tools.r8.a.x(u() + 3, 7)) + 1;
            case 5:
                return ((i12 - 1) % 7) + 1;
            case 6:
                return ((J() - 1) % 7) + 1;
            case 7:
                return u();
            case 8:
                return ((J() - 1) / 7) + 1;
            case 9:
                return i11;
            case 10:
                return ((((long) i13) * 12) + ((long) i11)) - 1;
            case 11:
                return i13;
            case 12:
                return i13;
            case 13:
                return i13 <= 1 ? 0 : 1;
            default:
                throw new j$.time.temporal.t(j$.time.c.a("Unsupported field: ", qVar));
        }
    }

    @Override // j$.time.chrono.AbstractC5641d, j$.time.temporal.m
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public final r d(long j10, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (r) super.d(j10, qVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        p pVar = this.f84584a;
        pVar.w(aVar).b(j10, aVar);
        int i10 = (int) j10;
        int i11 = q.f84583a[aVar.ordinal()];
        int i12 = this.f84587d;
        int i13 = this.f84586c;
        int i14 = this.f84585b;
        switch (i11) {
            case 1:
                return M(i14, i13, i10);
            case 2:
                return F(Math.min(i10, pVar.C(i14, 12)) - J());
            case 3:
                return F((j10 - t(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return F(j10 - ((long) (((int) j$.com.android.tools.r8.a.x(u() + 3, 7)) + 1)));
            case 5:
                return F(j10 - t(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 6:
                return F(j10 - t(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 7:
                return new r(pVar, j10);
            case 8:
                return F((j10 - t(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return M(i14, i10, i12);
            case 10:
                return G(j10 - (((((long) i14) * 12) + ((long) i13)) - 1));
            case 11:
                if (i14 < 1) {
                    i10 = 1 - i10;
                }
                return M(i10, i13, i12);
            case 12:
                return M(i10, i13, i12);
            case 13:
                return M(1 - i14, i13, i12);
            default:
                throw new j$.time.temporal.t(j$.time.c.a("Unsupported field: ", qVar));
        }
    }

    public final r M(int i10, int i11, int i12) {
        p pVar = this.f84584a;
        int iP = pVar.p(i10, i11);
        if (i12 > iP) {
            i12 = iP;
        }
        return new r(pVar, i10, i11, i12);
    }

    @Override // j$.time.chrono.AbstractC5641d
    /* JADX INFO: renamed from: I */
    public final InterfaceC5639b m(j$.time.temporal.o oVar) {
        return (r) super.m(oVar);
    }

    @Override // j$.time.chrono.AbstractC5641d, j$.time.temporal.m
    public final j$.time.temporal.m m(j$.time.g gVar) {
        return (r) super.m(gVar);
    }

    @Override // j$.time.chrono.AbstractC5641d, j$.time.chrono.InterfaceC5639b
    public final long u() {
        return this.f84584a.n(this.f84585b, this.f84586c, this.f84587d);
    }

    @Override // j$.time.chrono.AbstractC5641d
    public final InterfaceC5639b H(long j10) {
        if (j10 == 0) {
            return this;
        }
        long j11 = ((long) this.f84585b) + ((long) ((int) j10));
        int i10 = (int) j11;
        if (j11 == i10) {
            return M(i10, this.f84586c, this.f84587d);
        }
        throw new ArithmeticException();
    }

    @Override // j$.time.chrono.AbstractC5641d
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public final r G(long j10) {
        if (j10 == 0) {
            return this;
        }
        long j11 = (((long) this.f84585b) * 12) + ((long) (this.f84586c - 1)) + j10;
        long jY = j$.com.android.tools.r8.a.y(j11, 12L);
        int i10 = this.f84584a.f84578g;
        if (jY >= i10 / 12 && jY <= (((r4.f84575d.length - 1) + i10) / 12) - 1) {
            return M((int) jY, ((int) j$.com.android.tools.r8.a.x(j11, 12L)) + 1, this.f84587d);
        }
        throw new j$.time.b("Invalid Hijrah year: " + jY);
    }

    @Override // j$.time.chrono.AbstractC5641d
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public final r F(long j10) {
        return new r(this.f84584a, u() + j10);
    }

    @Override // j$.time.chrono.AbstractC5641d, j$.time.chrono.InterfaceC5639b, j$.time.temporal.m
    public final InterfaceC5639b e(long j10, j$.time.temporal.s sVar) {
        return (r) super.e(j10, sVar);
    }

    @Override // j$.time.chrono.AbstractC5641d, j$.time.temporal.m
    public final j$.time.temporal.m e(long j10, j$.time.temporal.s sVar) {
        return (r) super.e(j10, sVar);
    }

    @Override // j$.time.chrono.AbstractC5641d
    /* JADX INFO: renamed from: E */
    public final InterfaceC5639b j(long j10, j$.time.temporal.s sVar) {
        return (r) super.j(j10, sVar);
    }

    @Override // j$.time.chrono.AbstractC5641d, j$.time.temporal.m
    public final j$.time.temporal.m j(long j10, j$.time.temporal.b bVar) {
        return (r) super.j(j10, bVar);
    }

    public final int J() {
        return this.f84584a.C(this.f84585b, this.f84586c - 1) + this.f84587d;
    }

    @Override // j$.time.chrono.AbstractC5641d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (this.f84585b == rVar.f84585b && this.f84586c == rVar.f84586c && this.f84587d == rVar.f84587d && this.f84584a.equals(rVar.f84584a)) {
                return true;
            }
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new F((byte) 6, this);
    }
}
