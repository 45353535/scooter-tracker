package j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class K implements n {
    public static final K BE;
    public static final K BEFORE_BE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ K[] f84555a;

    @Override // j$.time.temporal.n
    public final /* synthetic */ boolean f(j$.time.temporal.q qVar) {
        return j$.com.android.tools.r8.a.l(this, qVar);
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

    public static K valueOf(String str) {
        return (K) Enum.valueOf(K.class, str);
    }

    public static K[] values() {
        return (K[]) f84555a.clone();
    }

    static {
        K k10 = new K("BEFORE_BE", 0);
        BEFORE_BE = k10;
        K k11 = new K("BE", 1);
        BE = k11;
        f84555a = new K[]{k10, k11};
    }

    @Override // j$.time.chrono.n
    public final int getValue() {
        return ordinal();
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.u n(j$.time.temporal.q qVar) {
        return j$.time.temporal.r.d(this, qVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m w(j$.time.temporal.m mVar) {
        return mVar.d(getValue(), j$.time.temporal.a.ERA);
    }
}
