package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class y extends AbstractC5641d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j$.time.g f84594d = j$.time.g.K(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient j$.time.g f84595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient z f84596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient int f84597c;

    @Override // j$.time.chrono.AbstractC5641d, j$.time.chrono.InterfaceC5639b
    public final InterfaceC5642e v(j$.time.j jVar) {
        return new C5644g(this, jVar);
    }

    public y(j$.time.g gVar) {
        j$.time.g gVar2 = f84594d;
        if (!j$.time.c.b(gVar2) ? gVar.u() >= gVar2.u() : gVar.C(gVar2) >= 0) {
            throw new j$.time.b("JapaneseDate before Meiji 6 is not supported");
        }
        z zVarI = z.i(gVar);
        this.f84596b = zVarI;
        this.f84597c = (gVar.f84661a - zVarI.f84601b.f84661a) + 1;
        this.f84595a = gVar;
    }

    @Override // j$.time.chrono.InterfaceC5639b
    public final m a() {
        return w.f84592c;
    }

    @Override // j$.time.chrono.AbstractC5641d, j$.time.chrono.InterfaceC5639b
    public final int hashCode() {
        w.f84592c.getClass();
        return this.f84595a.hashCode() ^ (-688086063);
    }

    @Override // j$.time.chrono.AbstractC5641d
    public final n D() {
        return this.f84596b;
    }

    @Override // j$.time.chrono.AbstractC5641d, j$.time.chrono.InterfaceC5639b, j$.time.temporal.n
    public final boolean f(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH || qVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR || qVar == j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH || qVar == j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).t();
        }
        return qVar != null && qVar.m(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
    @Override // j$.time.chrono.AbstractC5641d, j$.time.temporal.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j$.time.temporal.u n(j$.time.temporal.q r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof j$.time.temporal.a
            if (r0 == 0) goto L91
            boolean r0 = r7.f(r8)
            if (r0 == 0) goto L85
            j$.time.temporal.a r8 = (j$.time.temporal.a) r8
            int[] r0 = j$.time.chrono.x.f84593a
            int r1 = r8.ordinal()
            r0 = r0[r1]
            j$.time.g r1 = r7.f84595a
            r2 = 1
            r3 = 1
            if (r0 == r2) goto L7b
            j$.time.chrono.z r5 = r7.f84596b
            r6 = 2
            if (r0 == r6) goto L4a
            r1 = 3
            if (r0 == r1) goto L2a
            j$.time.chrono.w r0 = j$.time.chrono.w.f84592c
            j$.time.temporal.u r8 = r0.k(r8)
            return r8
        L2a:
            j$.time.g r8 = r5.f84601b
            j$.time.chrono.z r0 = r5.l()
            int r8 = r8.f84661a
            if (r0 == 0) goto L40
            j$.time.g r0 = r0.f84601b
            int r0 = r0.f84661a
            int r0 = r0 - r8
            int r0 = r0 + r2
            long r0 = (long) r0
            j$.time.temporal.u r8 = j$.time.temporal.u.e(r3, r0)
            return r8
        L40:
            r0 = 999999999(0x3b9ac9ff, float:0.004723787)
            int r0 = r0 - r8
            long r0 = (long) r0
            j$.time.temporal.u r8 = j$.time.temporal.u.e(r3, r0)
            return r8
        L4a:
            j$.time.chrono.z r8 = r5.l()
            if (r8 == 0) goto L5e
            j$.time.g r8 = r8.f84601b
            int r0 = r1.f84661a
            int r6 = r8.f84661a
            if (r6 != r0) goto L5e
            int r8 = r8.H()
            int r8 = r8 - r2
            goto L69
        L5e:
            boolean r8 = r1.I()
            if (r8 == 0) goto L67
            r8 = 366(0x16e, float:5.13E-43)
            goto L69
        L67:
            r8 = 365(0x16d, float:5.11E-43)
        L69:
            int r0 = r7.f84597c
            if (r0 != r2) goto L75
            j$.time.g r0 = r5.f84601b
            int r0 = r0.H()
            int r0 = r0 - r2
            int r8 = r8 - r0
        L75:
            long r0 = (long) r8
            j$.time.temporal.u r8 = j$.time.temporal.u.e(r3, r0)
            return r8
        L7b:
            int r8 = r1.J()
            long r0 = (long) r8
            j$.time.temporal.u r8 = j$.time.temporal.u.e(r3, r0)
            return r8
        L85:
            j$.time.temporal.t r0 = new j$.time.temporal.t
            java.lang.String r1 = "Unsupported field: "
            java.lang.String r8 = j$.time.c.a(r1, r8)
            r0.<init>(r8)
            throw r0
        L91:
            j$.time.temporal.u r8 = r8.p(r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.y.n(j$.time.temporal.q):j$.time.temporal.u");
    }

    @Override // j$.time.temporal.n
    public final long t(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.k(this);
        }
        int i10 = x.f84593a[((j$.time.temporal.a) qVar).ordinal()];
        int i11 = this.f84597c;
        z zVar = this.f84596b;
        j$.time.g gVar = this.f84595a;
        switch (i10) {
            case 2:
                return i11 == 1 ? (gVar.H() - zVar.f84601b.H()) + 1 : gVar.H();
            case 3:
                return i11;
            case 4:
            case 5:
            case 6:
            case 7:
                throw new j$.time.temporal.t(j$.time.c.a("Unsupported field: ", qVar));
            case 8:
                return zVar.f84600a;
            default:
                return gVar.t(qVar);
        }
    }

    @Override // j$.time.chrono.AbstractC5641d, j$.time.temporal.m
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public final y d(long j10, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
            if (t(aVar) == j10) {
                return this;
            }
            int[] iArr = x.f84593a;
            int i10 = iArr[aVar.ordinal()];
            j$.time.g gVar = this.f84595a;
            if (i10 == 3 || i10 == 8 || i10 == 9) {
                int iA = w.f84592c.k(aVar).a(j10, aVar);
                int i11 = iArr[aVar.ordinal()];
                if (i11 == 3) {
                    return L(this.f84596b, iA);
                }
                if (i11 == 8) {
                    return L(z.o(iA), this.f84597c);
                }
                if (i11 == 9) {
                    return K(gVar.U(iA));
                }
            }
            return K(gVar.d(j10, qVar));
        }
        return (y) super.d(j10, qVar);
    }

    @Override // j$.time.chrono.AbstractC5641d
    /* JADX INFO: renamed from: I */
    public final InterfaceC5639b m(j$.time.temporal.o oVar) {
        return (y) super.m(oVar);
    }

    @Override // j$.time.chrono.AbstractC5641d, j$.time.temporal.m
    public final j$.time.temporal.m m(j$.time.g gVar) {
        return (y) super.m(gVar);
    }

    public final y L(z zVar, int i10) {
        w.f84592c.getClass();
        if (zVar == null) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        int i11 = zVar.f84601b.f84661a;
        int i12 = (i11 + i10) - 1;
        if (i10 != 1 && (i12 < -999999999 || i12 > 999999999 || i12 < i11 || zVar != z.i(j$.time.g.K(i12, 1, 1)))) {
            throw new j$.time.b("Invalid yearOfEra value");
        }
        return K(this.f84595a.U(i12));
    }

    @Override // j$.time.chrono.AbstractC5641d
    public final InterfaceC5639b H(long j10) {
        return K(this.f84595a.P(j10));
    }

    @Override // j$.time.chrono.AbstractC5641d
    public final InterfaceC5639b G(long j10) {
        return K(this.f84595a.O(j10));
    }

    @Override // j$.time.chrono.AbstractC5641d
    public final InterfaceC5639b F(long j10) {
        return K(this.f84595a.N(j10));
    }

    @Override // j$.time.chrono.AbstractC5641d, j$.time.chrono.InterfaceC5639b, j$.time.temporal.m
    public final InterfaceC5639b e(long j10, j$.time.temporal.s sVar) {
        return (y) super.e(j10, sVar);
    }

    @Override // j$.time.chrono.AbstractC5641d, j$.time.temporal.m
    public final j$.time.temporal.m e(long j10, j$.time.temporal.s sVar) {
        return (y) super.e(j10, sVar);
    }

    @Override // j$.time.chrono.AbstractC5641d
    /* JADX INFO: renamed from: E */
    public final InterfaceC5639b j(long j10, j$.time.temporal.s sVar) {
        return (y) super.j(j10, sVar);
    }

    @Override // j$.time.chrono.AbstractC5641d, j$.time.temporal.m
    public final j$.time.temporal.m j(long j10, j$.time.temporal.b bVar) {
        return (y) super.j(j10, bVar);
    }

    public final y K(j$.time.g gVar) {
        return gVar.equals(this.f84595a) ? this : new y(gVar);
    }

    @Override // j$.time.chrono.AbstractC5641d, j$.time.chrono.InterfaceC5639b
    public final long u() {
        return this.f84595a.u();
    }

    @Override // j$.time.chrono.AbstractC5641d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y) {
            return this.f84595a.equals(((y) obj).f84595a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new F((byte) 4, this);
    }
}
