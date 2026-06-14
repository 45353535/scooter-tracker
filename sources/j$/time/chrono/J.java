package j$.time.chrono;

import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class J extends AbstractC5641d {
    private static final long serialVersionUID = -8722293800195731463L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient j$.time.g f84554a;

    @Override // j$.time.chrono.AbstractC5641d, j$.time.chrono.InterfaceC5639b
    public final InterfaceC5642e v(j$.time.j jVar) {
        return new C5644g(this, jVar);
    }

    public J(j$.time.g gVar) {
        Objects.requireNonNull(gVar, "isoDate");
        this.f84554a = gVar;
    }

    @Override // j$.time.chrono.InterfaceC5639b
    public final m a() {
        return H.f84552c;
    }

    @Override // j$.time.chrono.AbstractC5641d, j$.time.chrono.InterfaceC5639b
    public final int hashCode() {
        H.f84552c.getClass();
        return this.f84554a.hashCode() ^ 146118545;
    }

    @Override // j$.time.chrono.AbstractC5641d
    public final n D() {
        return J() >= 1 ? K.BE : K.BEFORE_BE;
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
        int i10 = I.f84553a[aVar.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return this.f84554a.n(qVar);
        }
        if (i10 != 4) {
            return H.f84552c.k(aVar);
        }
        j$.time.temporal.u uVar = j$.time.temporal.a.YEAR.f84698b;
        return j$.time.temporal.u.e(1L, J() <= 0 ? (-(uVar.f84723a + 543)) + 1 : 543 + uVar.f84726d);
    }

    @Override // j$.time.temporal.n
    public final long t(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            int i10 = I.f84553a[((j$.time.temporal.a) qVar).ordinal()];
            if (i10 == 4) {
                int iJ = J();
                if (iJ < 1) {
                    iJ = 1 - iJ;
                }
                return iJ;
            }
            j$.time.g gVar = this.f84554a;
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
    public final j$.time.chrono.J d(long r9, j$.time.temporal.q r11) {
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
            int[] r1 = j$.time.chrono.I.f84553a
            int r2 = r0.ordinal()
            r2 = r1[r2]
            j$.time.g r3 = r8.f84554a
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
            j$.time.chrono.H r11 = j$.time.chrono.H.f84552c
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
            j$.time.chrono.J r9 = r8.L(r9)
            return r9
        L49:
            j$.time.chrono.H r2 = j$.time.chrono.H.f84552c
            j$.time.temporal.u r2 = r2.k(r0)
            int r2 = r2.a(r9, r0)
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r6) goto L82
            if (r0 == r5) goto L77
            if (r0 == r4) goto L68
        L5f:
            j$.time.g r9 = r3.d(r9, r11)
            j$.time.chrono.J r9 = r8.L(r9)
            return r9
        L68:
            int r9 = r8.J()
            int r9 = (-542) - r9
            j$.time.g r9 = r3.U(r9)
            j$.time.chrono.J r9 = r8.L(r9)
            return r9
        L77:
            int r2 = r2 + (-543)
            j$.time.g r9 = r3.U(r2)
            j$.time.chrono.J r9 = r8.L(r9)
            return r9
        L82:
            int r9 = r8.J()
            r10 = 1
            if (r9 < r10) goto L8a
            goto L8c
        L8a:
            int r2 = 1 - r2
        L8c:
            int r2 = r2 + (-543)
            j$.time.g r9 = r3.U(r2)
            j$.time.chrono.J r9 = r8.L(r9)
            return r9
        L97:
            j$.time.chrono.b r9 = super.d(r9, r11)
            j$.time.chrono.J r9 = (j$.time.chrono.J) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.J.d(long, j$.time.temporal.q):j$.time.chrono.J");
    }

    @Override // j$.time.chrono.AbstractC5641d
    /* JADX INFO: renamed from: I */
    public final InterfaceC5639b m(j$.time.temporal.o oVar) {
        return (J) super.m(oVar);
    }

    @Override // j$.time.chrono.AbstractC5641d, j$.time.temporal.m
    public final j$.time.temporal.m m(j$.time.g gVar) {
        return (J) super.m(gVar);
    }

    @Override // j$.time.chrono.AbstractC5641d
    public final InterfaceC5639b H(long j10) {
        return L(this.f84554a.P(j10));
    }

    @Override // j$.time.chrono.AbstractC5641d
    public final InterfaceC5639b G(long j10) {
        return L(this.f84554a.O(j10));
    }

    @Override // j$.time.chrono.AbstractC5641d
    public final InterfaceC5639b F(long j10) {
        return L(this.f84554a.N(j10));
    }

    @Override // j$.time.chrono.AbstractC5641d, j$.time.chrono.InterfaceC5639b, j$.time.temporal.m
    public final InterfaceC5639b e(long j10, j$.time.temporal.s sVar) {
        return (J) super.e(j10, sVar);
    }

    @Override // j$.time.chrono.AbstractC5641d, j$.time.temporal.m
    public final j$.time.temporal.m e(long j10, j$.time.temporal.s sVar) {
        return (J) super.e(j10, sVar);
    }

    @Override // j$.time.chrono.AbstractC5641d
    /* JADX INFO: renamed from: E */
    public final InterfaceC5639b j(long j10, j$.time.temporal.s sVar) {
        return (J) super.j(j10, sVar);
    }

    @Override // j$.time.chrono.AbstractC5641d, j$.time.temporal.m
    public final j$.time.temporal.m j(long j10, j$.time.temporal.b bVar) {
        return (J) super.j(j10, bVar);
    }

    public final J L(j$.time.g gVar) {
        return gVar.equals(this.f84554a) ? this : new J(gVar);
    }

    @Override // j$.time.chrono.AbstractC5641d, j$.time.chrono.InterfaceC5639b
    public final long u() {
        return this.f84554a.u();
    }

    @Override // j$.time.chrono.AbstractC5641d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof J) {
            return this.f84554a.equals(((J) obj).f84554a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new F((byte) 8, this);
    }

    public final int J() {
        return this.f84554a.f84661a + 543;
    }
}
