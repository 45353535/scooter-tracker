package j$.time.temporal;

/* JADX INFO: loaded from: classes2.dex */
public enum k implements q {
    JULIAN_DAY("JulianDay", 2440588),
    MODIFIED_JULIAN_DAY("ModifiedJulianDay", 40587),
    RATA_DIE("RataDie", 719163);

    private static final long serialVersionUID = -7501623920830201812L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient String f84710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient u f84711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient long f84712c;

    @Override // j$.time.temporal.q
    public final boolean t() {
        return true;
    }

    static {
        b bVar = b.NANOS;
    }

    k(String str, long j10) {
        this.f84710a = str;
        this.f84711b = u.e((-365243219162L) + j10, 365241780471L + j10);
        this.f84712c = j10;
    }

    @Override // j$.time.temporal.q
    public final u j() {
        return this.f84711b;
    }

    @Override // j$.time.temporal.q
    public final boolean m(n nVar) {
        return nVar.f(a.EPOCH_DAY);
    }

    @Override // j$.time.temporal.q
    public final u p(n nVar) {
        if (nVar.f(a.EPOCH_DAY)) {
            return this.f84711b;
        }
        throw new j$.time.b("Unsupported field: " + this);
    }

    @Override // j$.time.temporal.q
    public final long k(n nVar) {
        return nVar.t(a.EPOCH_DAY) + this.f84712c;
    }

    @Override // j$.time.temporal.q
    public final m n(m mVar, long j10) {
        if (!this.f84711b.d(j10)) {
            throw new j$.time.b("Invalid value: " + this.f84710a + " " + j10);
        }
        return mVar.d(j$.com.android.tools.r8.a.A(j10, this.f84712c), a.EPOCH_DAY);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f84710a;
    }
}
