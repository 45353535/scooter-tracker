package j$.time;

import com.vungle.ads.internal.protos.Sdk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class l implements j$.time.temporal.n, j$.time.temporal.o {
    public static final l APRIL;
    public static final l AUGUST;
    public static final l DECEMBER;
    public static final l FEBRUARY;
    public static final l JANUARY;
    public static final l JULY;
    public static final l JUNE;
    public static final l MARCH;
    public static final l MAY;
    public static final l NOVEMBER;
    public static final l OCTOBER;
    public static final l SEPTEMBER;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l[] f84676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ l[] f84677b;

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f84677b.clone();
    }

    static {
        l lVar = new l("JANUARY", 0);
        JANUARY = lVar;
        l lVar2 = new l("FEBRUARY", 1);
        FEBRUARY = lVar2;
        l lVar3 = new l("MARCH", 2);
        MARCH = lVar3;
        l lVar4 = new l("APRIL", 3);
        APRIL = lVar4;
        l lVar5 = new l("MAY", 4);
        MAY = lVar5;
        l lVar6 = new l("JUNE", 5);
        JUNE = lVar6;
        l lVar7 = new l("JULY", 6);
        JULY = lVar7;
        l lVar8 = new l("AUGUST", 7);
        AUGUST = lVar8;
        l lVar9 = new l("SEPTEMBER", 8);
        SEPTEMBER = lVar9;
        l lVar10 = new l("OCTOBER", 9);
        OCTOBER = lVar10;
        l lVar11 = new l("NOVEMBER", 10);
        NOVEMBER = lVar11;
        l lVar12 = new l("DECEMBER", 11);
        DECEMBER = lVar12;
        f84677b = new l[]{lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9, lVar10, lVar11, lVar12};
        f84676a = values();
    }

    public static l F(int i10) {
        if (i10 < 1 || i10 > 12) {
            throw new b("Invalid value for MonthOfYear: " + i10);
        }
        return f84676a[i10 - 1];
    }

    public final int getValue() {
        return ordinal() + 1;
    }

    @Override // j$.time.temporal.n
    public final boolean f(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? qVar == j$.time.temporal.a.MONTH_OF_YEAR : qVar != null && qVar.m(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.u n(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return qVar.j();
        }
        return j$.time.temporal.r.d(this, qVar);
    }

    @Override // j$.time.temporal.n
    public final int k(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return getValue();
        }
        return j$.time.temporal.r.a(this, qVar);
    }

    @Override // j$.time.temporal.n
    public final long t(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return getValue();
        }
        if (qVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.t(c.a("Unsupported field: ", qVar));
        }
        return qVar.k(this);
    }

    public final int D(boolean z10) {
        int i10 = k.f84675a[ordinal()];
        return i10 != 1 ? (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) ? 30 : 31 : z10 ? 29 : 28;
    }

    public final int E() {
        int i10 = k.f84675a[ordinal()];
        if (i10 != 1) {
            return (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) ? 30 : 31;
        }
        return 29;
    }

    public final int C(boolean z10) {
        switch (k.f84675a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z10 ? 1 : 0) + 91;
            case 3:
                return (z10 ? 1 : 0) + 152;
            case 4:
                return (z10 ? 1 : 0) + 244;
            case 5:
                return (z10 ? 1 : 0) + 305;
            case 6:
                return 1;
            case 7:
                return (z10 ? 1 : 0) + 60;
            case 8:
                return (z10 ? 1 : 0) + 121;
            case 9:
                return (z10 ? 1 : 0) + 182;
            case 10:
                return (z10 ? 1 : 0) + Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE;
            case 11:
                return (z10 ? 1 : 0) + 274;
            default:
                return (z10 ? 1 : 0) + 335;
        }
    }

    @Override // j$.time.temporal.n
    public final Object p(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.r.f84717b) {
            return j$.time.chrono.t.f84589c;
        }
        if (aVar == j$.time.temporal.r.f84718c) {
            return j$.time.temporal.b.MONTHS;
        }
        return j$.time.temporal.r.c(this, aVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m w(j$.time.temporal.m mVar) {
        if (!j$.com.android.tools.r8.a.t(mVar).equals(j$.time.chrono.t.f84589c)) {
            throw new b("Adjustment only supported on ISO date-time");
        }
        return mVar.d(getValue(), j$.time.temporal.a.MONTH_OF_YEAR);
    }
}
