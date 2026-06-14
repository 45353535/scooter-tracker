package j$.time.temporal;

import j$.time.Duration;

/* JADX INFO: loaded from: classes2.dex */
public enum i implements s {
    WEEK_BASED_YEARS("WeekBasedYears"),
    QUARTER_YEARS("QuarterYears");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84705a;

    static {
        Duration duration = Duration.f84523c;
    }

    i(String str) {
        this.f84705a = str;
    }

    @Override // j$.time.temporal.s
    public final m j(m mVar, long j10) {
        int i10 = c.f84701a[ordinal()];
        if (i10 == 1) {
            return mVar.d(j$.com.android.tools.r8.a.u(mVar.k(r0), j10), j.f84708c);
        }
        if (i10 == 2) {
            return mVar.e(j10 / 4, b.YEARS).e((j10 % 4) * 3, b.MONTHS);
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f84705a;
    }
}
