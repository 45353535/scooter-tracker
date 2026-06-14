package j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class s implements n {
    public static final s AH;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ s[] f84588a;

    @Override // j$.time.temporal.n
    public final /* synthetic */ boolean f(j$.time.temporal.q qVar) {
        return j$.com.android.tools.r8.a.l(this, qVar);
    }

    @Override // j$.time.chrono.n
    public final int getValue() {
        return 1;
    }

    @Override // j$.time.temporal.n
    public final /* synthetic */ int k(j$.time.temporal.q qVar) {
        return j$.com.android.tools.r8.a.i(this, (j$.time.temporal.a) qVar);
    }

    @Override // j$.time.temporal.n
    public final /* synthetic */ Object p(j$.time.format.a aVar) {
        return j$.com.android.tools.r8.a.q(this, aVar);
    }

    @Override // j$.time.temporal.n
    public final /* synthetic */ long t(j$.time.temporal.q qVar) {
        return j$.com.android.tools.r8.a.j(this, qVar);
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f84588a.clone();
    }

    static {
        s sVar = new s("AH", 0);
        AH = sVar;
        f84588a = new s[]{sVar};
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.u n(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.ERA) {
            return j$.time.temporal.u.e(1L, 1L);
        }
        return j$.time.temporal.r.d(this, qVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m w(j$.time.temporal.m mVar) {
        return mVar.d(1, j$.time.temporal.a.ERA);
    }
}
