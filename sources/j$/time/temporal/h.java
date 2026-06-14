package j$.time.temporal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public abstract class h implements q {
    public static final h DAY_OF_QUARTER;
    public static final h QUARTER_OF_YEAR;
    public static final h WEEK_BASED_YEAR;
    public static final h WEEK_OF_WEEK_BASED_YEAR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f84702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ h[] f84703b;

    @Override // j$.time.temporal.q
    public final boolean t() {
        return true;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f84703b.clone();
    }

    static {
        h hVar = new h() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.q
            public final u j() {
                return u.f(90L, 92L);
            }

            @Override // j$.time.temporal.q
            public final boolean m(n nVar) {
                if (!nVar.f(a.DAY_OF_YEAR) || !nVar.f(a.MONTH_OF_YEAR) || !nVar.f(a.YEAR)) {
                    return false;
                }
                h hVar2 = j.f84706a;
                return j$.com.android.tools.r8.a.t(nVar).equals(j$.time.chrono.t.f84589c);
            }

            @Override // j$.time.temporal.q
            public final u p(n nVar) {
                if (!m(nVar)) {
                    throw new t("Unsupported field: DayOfQuarter");
                }
                long jT = nVar.t(h.QUARTER_OF_YEAR);
                if (jT == 1) {
                    long jT2 = nVar.t(a.YEAR);
                    j$.time.chrono.t.f84589c.getClass();
                    return j$.time.chrono.t.k(jT2) ? u.e(1L, 91L) : u.e(1L, 90L);
                }
                if (jT == 2) {
                    return u.e(1L, 91L);
                }
                if (jT == 3 || jT == 4) {
                    return u.e(1L, 92L);
                }
                return j();
            }

            @Override // j$.time.temporal.q
            public final long k(n nVar) {
                if (!m(nVar)) {
                    throw new t("Unsupported field: DayOfQuarter");
                }
                int iK = nVar.k(a.DAY_OF_YEAR);
                int iK2 = nVar.k(a.MONTH_OF_YEAR);
                long jT = nVar.t(a.YEAR);
                int[] iArr = h.f84702a;
                int i10 = (iK2 - 1) / 3;
                j$.time.chrono.t.f84589c.getClass();
                return iK - iArr[i10 + (j$.time.chrono.t.k(jT) ? 4 : 0)];
            }

            @Override // j$.time.temporal.q
            public final m n(m mVar, long j10) {
                long jK = k(mVar);
                j().b(j10, this);
                a aVar = a.DAY_OF_YEAR;
                return mVar.d((j10 - jK) + mVar.t(aVar), aVar);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }
        };
        DAY_OF_QUARTER = hVar;
        h hVar2 = new h() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.q
            public final u j() {
                return u.e(1L, 4L);
            }

            @Override // j$.time.temporal.q
            public final boolean m(n nVar) {
                if (!nVar.f(a.MONTH_OF_YEAR)) {
                    return false;
                }
                h hVar3 = j.f84706a;
                return j$.com.android.tools.r8.a.t(nVar).equals(j$.time.chrono.t.f84589c);
            }

            @Override // j$.time.temporal.q
            public final long k(n nVar) {
                if (!m(nVar)) {
                    throw new t("Unsupported field: QuarterOfYear");
                }
                return (nVar.t(a.MONTH_OF_YEAR) + 2) / 3;
            }

            @Override // j$.time.temporal.q
            public final u p(n nVar) {
                if (!m(nVar)) {
                    throw new t("Unsupported field: QuarterOfYear");
                }
                return j();
            }

            @Override // j$.time.temporal.q
            public final m n(m mVar, long j10) {
                long jK = k(mVar);
                j().b(j10, this);
                a aVar = a.MONTH_OF_YEAR;
                return mVar.d(((j10 - jK) * 3) + mVar.t(aVar), aVar);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }
        };
        QUARTER_OF_YEAR = hVar2;
        h hVar3 = new h() { // from class: j$.time.temporal.f
            @Override // j$.time.temporal.q
            public final u j() {
                return u.f(52L, 53L);
            }

            @Override // j$.time.temporal.q
            public final boolean m(n nVar) {
                if (!nVar.f(a.EPOCH_DAY)) {
                    return false;
                }
                h hVar4 = j.f84706a;
                return j$.com.android.tools.r8.a.t(nVar).equals(j$.time.chrono.t.f84589c);
            }

            @Override // j$.time.temporal.q
            public final u p(n nVar) {
                if (!m(nVar)) {
                    throw new t("Unsupported field: WeekOfWeekBasedYear");
                }
                return u.e(1L, h.D(h.C(j$.time.g.E(nVar))));
            }

            @Override // j$.time.temporal.q
            public final long k(n nVar) {
                if (!m(nVar)) {
                    throw new t("Unsupported field: WeekOfWeekBasedYear");
                }
                return h.w(j$.time.g.E(nVar));
            }

            @Override // j$.time.temporal.q
            public final m n(m mVar, long j10) {
                j().b(j10, this);
                return mVar.e(j$.com.android.tools.r8.a.A(j10, k(mVar)), b.WEEKS);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = hVar3;
        h hVar4 = new h() { // from class: j$.time.temporal.g
            @Override // j$.time.temporal.q
            public final u j() {
                return a.YEAR.f84698b;
            }

            @Override // j$.time.temporal.q
            public final boolean m(n nVar) {
                if (!nVar.f(a.EPOCH_DAY)) {
                    return false;
                }
                h hVar5 = j.f84706a;
                return j$.com.android.tools.r8.a.t(nVar).equals(j$.time.chrono.t.f84589c);
            }

            @Override // j$.time.temporal.q
            public final long k(n nVar) {
                if (m(nVar)) {
                    return h.C(j$.time.g.E(nVar));
                }
                throw new t("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.q
            public final u p(n nVar) {
                if (!m(nVar)) {
                    throw new t("Unsupported field: WeekBasedYear");
                }
                return j();
            }

            @Override // j$.time.temporal.q
            public final m n(m mVar, long j10) {
                if (!m(mVar)) {
                    throw new t("Unsupported field: WeekBasedYear");
                }
                int iA = a.YEAR.f84698b.a(j10, h.WEEK_BASED_YEAR);
                j$.time.g gVarE = j$.time.g.E(mVar);
                int iK = gVarE.k(a.DAY_OF_WEEK);
                int iW = h.w(gVarE);
                if (iW == 53 && h.D(iA) == 52) {
                    iW = 52;
                }
                return mVar.m(j$.time.g.K(iA, 1, 4).N(((iW - 1) * 7) + (iK - r6.k(r0))));
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }
        };
        WEEK_BASED_YEAR = hVar4;
        f84703b = new h[]{hVar, hVar2, hVar3, hVar4};
        f84702a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    public static int D(int i10) {
        j$.time.g gVarK = j$.time.g.K(i10, 1, 1);
        if (gVarK.G() != j$.time.d.THURSDAY) {
            return (gVarK.G() == j$.time.d.WEDNESDAY && gVarK.I()) ? 53 : 52;
        }
        return 53;
    }

    public static int w(j$.time.g gVar) {
        int iOrdinal = gVar.G().ordinal();
        int iH = gVar.H() - 1;
        int i10 = (3 - iOrdinal) + iH;
        int i11 = i10 - ((i10 / 7) * 7);
        int i12 = i11 - 3;
        if (i12 < -3) {
            i12 = i11 + 4;
        }
        if (iH < i12) {
            return (int) u.e(1L, D(C(gVar.T(180).P(-1L)))).f84726d;
        }
        int i13 = ((iH - i12) / 7) + 1;
        if (i13 != 53 || i12 == -3 || (i12 == -2 && gVar.I())) {
            return i13;
        }
        return 1;
    }

    public static int C(j$.time.g gVar) {
        int i10 = gVar.f84661a;
        int iH = gVar.H();
        if (iH <= 3) {
            return iH - gVar.G().ordinal() < -2 ? i10 - 1 : i10;
        }
        if (iH >= 363) {
            return ((iH - 363) - (gVar.I() ? 1 : 0)) - gVar.G().ordinal() >= 0 ? i10 + 1 : i10;
        }
        return i10;
    }
}
