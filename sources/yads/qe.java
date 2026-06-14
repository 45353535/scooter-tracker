package yads;

/* JADX INFO: loaded from: classes4.dex */
public abstract class qe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile oe f114957a;

    public static final wf a() {
        oe oeVar;
        oe oeVar2 = f114957a;
        if (oeVar2 != null) {
            return oeVar2;
        }
        synchronized (oe.f114280b) {
            oeVar = f114957a;
            if (oeVar == null) {
                Object obj = af1.f108670d;
                oeVar = new oe(ze1.a().a());
                f114957a = oeVar;
            }
        }
        return oeVar;
    }
}
