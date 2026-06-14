package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class o41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n41 f114195a = new n41(xl2.D, xl2.C, xl2.E, xl2.F);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n41 f114196b = new n41(xl2.f117878o, xl2.f117877n, xl2.f117879p, xl2.f117880q);

    public static n41 a(ta taVar) {
        int iOrdinal = taVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return f114195a;
        }
        if (iOrdinal == 2) {
            return f114196b;
        }
        throw new lf.m();
    }
}
