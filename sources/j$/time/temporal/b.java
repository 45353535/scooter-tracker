package j$.time.temporal;

import j$.time.Duration;

/* JADX INFO: loaded from: classes2.dex */
public enum b implements s {
    NANOS("Nanos"),
    MICROS("Micros"),
    MILLIS("Millis"),
    SECONDS("Seconds"),
    MINUTES("Minutes"),
    HOURS("Hours"),
    HALF_DAYS("HalfDays"),
    DAYS("Days"),
    WEEKS("Weeks"),
    MONTHS("Months"),
    YEARS("Years"),
    DECADES("Decades"),
    CENTURIES("Centuries"),
    MILLENNIA("Millennia"),
    ERAS("Eras"),
    FOREVER("Forever");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84700a;

    static {
        Duration duration = Duration.f84523c;
        Duration.j(j$.com.android.tools.r8.a.u(Long.MAX_VALUE, j$.com.android.tools.r8.a.y(999999999L, 1000000000L)), (int) j$.com.android.tools.r8.a.x(999999999L, 1000000000L));
    }

    b(String str) {
        this.f84700a = str;
    }

    @Override // j$.time.temporal.s
    public final m j(m mVar, long j10) {
        return mVar.e(j10, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f84700a;
    }
}
