package j$.time.chrono;

import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class D extends AbstractC5641d {
    private static final long serialVersionUID = 1300372329181994526L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient j$.time.g f84547a;

    @Override // j$.time.chrono.AbstractC5641d, j$.time.chrono.InterfaceC5639b
    public final InterfaceC5642e v(j$.time.j jVar) {
        return new C5644g(this, jVar);
    }

    public D(j$.time.g gVar) {
        Objects.requireNonNull(gVar, "isoDate");
        this.f84547a = gVar;
    }

    @Override // j$.time.chrono.InterfaceC5639b
    public final m a() {
        return B.f84545c;
    }

    @Override // j$.time.chrono.AbstractC5641d, j$.time.chrono.InterfaceC5639b
    public final int hashCode() {
        B.f84545c.getClass();
        return this.f84547a.hashCode() ^ (-1990173233);
    }

    @Override // j$.time.chrono.AbstractC5641d
    public final n D() {
        return J() >= 1 ? E.ROC : E.BEFORE_ROC;
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
        int i10 = C.f84546a[aVar.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return this.f84547a.n(qVar);
        }
        if (i10 != 4) {
            return B.f84545c.k(aVar);
        }
        j$.time.temporal.u uVar = j$.time.temporal.a.YEAR.f84698b;
        return j$.time.temporal.u.e(1L, J() <= 0 ? (-uVar.f84723a) + 1912 : uVar.f84726d - 1911);
    }

    @Override // j$.time.temporal.n
    public final long t(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            int i10 = C.f84546a[((j$.time.temporal.a) qVar).ordinal()];
            if (i10 == 4) {
                int iJ = J();
                if (iJ < 1) {
                    iJ = 1 - iJ;
                }
                return iJ;
            }
            j$.time.g gVar = this.f84547a;
            if (i10 == 5) {
                return ((((long) J()) * 12) + ((long) gVar.f84662b)) - 1;
            }
            if (i10 == 6) {
                return J();
            }
            if (i10 != 7) {
                return gVar.t(qVar);
            }
            return J() < 1 ? 0 : 1;
        }
        return qVar.k(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    @Override // j$.time.chrono.AbstractC5641d, j$.time.temporal.m
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j$.time.chrono.D d(long r9, j$.time.temporal.q r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof j$.time.temporal.a
            if (r0 == 0) goto L97
            r0 = r11
            j$.time.temporal.a r0 = (j$.time.temporal.a) r0
            long r1 = r8.t(r0)
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 != 0) goto L10
            return r8
        L10:
            int[] r1 = j$.time.chrono.C.f84546a
            int r2 = r0.ordinal()
            r2 = r1[r2]
            j$.time.g r3 = r8.f84547a
            r4 = 7
            r5 = 6
            r6 = 4
            if (r2 == r6) goto L49
            r7 = 5
            if (r2 == r7) goto L27
            if (r2 == r5) goto L49
            if (r2 == r4) goto L49
            goto L5f
        L27:
            j$.time.chrono.B r11 = j$.time.chrono.B.f84545c
            j$.time.temporal.u r11 = r11.k(r0)
            r11.b(r9, r0)
            int r11 = r8.J()
            long r0 = (long) r11
            r4 = 12
            long r0 = r0 * r4
            short r11 = r3.f84662b
            long r4 = (long) r11
            long r0 = r0 + r4
            r4 = 1
            long r0 = r0 - r4
            long r9 = r9 - r0
            j$.time.g r9 = r3.O(r9)
            j$.time.chrono.D r9 = r8.L(r9)
            return r9
        L49:
            j$.time.chrono.B r2 = j$.time.chrono.B.f84545c
            j$.time.temporal.u r2 = r2.k(r0)
            int r2 = r2.a(r9, r0)
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r6) goto L82
            if (r0 == r5) goto L77
            if (r0 == r4) goto L68
        L5f:
            j$.time.g r9 = r3.d(r9, r11)
            j$.time.chrono.D r9 = r8.L(r9)
            return r9
        L68:
            int r9 = r8.J()
            int r9 = 1912 - r9
            j$.time.g r9 = r3.U(r9)
            j$.time.chrono.D r9 = r8.L(r9)
            return r9
        L77:
            int r2 = r2 + 1911
            j$.time.g r9 = r3.U(r2)
            j$.time.chrono.D r9 = r8.L(r9)
            return r9
        L82:
            int r9 = r8.J()
            r10 = 1
            if (r9 < r10) goto L8c
            int r2 = r2 + 1911
            goto L8e
        L8c:
            int r2 = 1912 - r2
        L8e:
            j$.time.g r9 = r3.U(r2)
            j$.time.chrono.D r9 = r8.L(r9)
            return r9
        L97:
            j$.time.chrono.b r9 = super.d(r9, r11)
            j$.time.chrono.D r9 = (j$.time.chrono.D) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.D.d(long, j$.time.temporal.q):j$.time.chrono.D");
    }

    @Override // j$.time.chrono.AbstractC5641d
    /* JADX INFO: renamed from: I */
    public final InterfaceC5639b m(j$.time.temporal.o oVar) {
        return (D) super.m(oVar);
    }

    @Override // j$.time.chrono.AbstractC5641d, j$.time.temporal.m
    public final j$.time.temporal.m m(j$.time.g gVar) {
        return (D) super.m(gVar);
    }

    @Override // j$.time.chrono.AbstractC5641d
    public final InterfaceC5639b H(long j10) {
        return L(this.f84547a.P(j10));
    }

    @Override // j$.time.chrono.AbstractC5641d
    public final InterfaceC5639b G(long j10) {
        return L(this.f84547a.O(j10));
    }

    @Override // j$.time.chrono.AbstractC5641d
    public final InterfaceC5639b F(long j10) {
        return L(this.f84547a.N(j10));
    }

    @Override // j$.time.chrono.AbstractC5641d, j$.time.chrono.InterfaceC5639b, j$.time.temporal.m
    public final InterfaceC5639b e(long j10, j$.time.temporal.s sVar) {
        return (D) super.e(j10, sVar);
    }

    @Override // j$.time.chrono.AbstractC5641d, j$.time.temporal.m
    public final j$.time.temporal.m e(long j10, j$.time.temporal.s sVar) {
        return (D) super.e(j10, sVar);
    }

    @Override // j$.time.chrono.AbstractC5641d
    /* JADX INFO: renamed from: E */
    public final InterfaceC5639b j(long j10, j$.time.temporal.s sVar) {
        return (D) super.j(j10, sVar);
    }

    @Override // j$.time.chrono.AbstractC5641d, j$.time.temporal.m
    public final j$.time.temporal.m j(long j10, j$.time.temporal.b bVar) {
        return (D) super.j(j10, bVar);
    }

    public final D L(j$.time.g gVar) {
        return gVar.equals(this.f84547a) ? this : new D(gVar);
    }

    @Override // j$.time.chrono.AbstractC5641d, j$.time.chrono.InterfaceC5639b
    public final long u() {
        return this.f84547a.u();
    }

    @Override // j$.time.chrono.AbstractC5641d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof D) {
            return this.f84547a.equals(((D) obj).f84547a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new F((byte) 7, this);
    }

    public final int J() {
        return this.f84547a.f84661a - 1911;
    }
}
