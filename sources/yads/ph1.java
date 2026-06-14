package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class ph1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f114676c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qh1 f114677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oh1 f114678b = new oh1();

    public ph1(df1 df1Var) {
        this.f114677a = new qh1(df1Var);
    }

    public final String a() {
        String strA;
        synchronized (f114676c) {
            strA = this.f114677a.a();
            if (strA == null) {
                this.f114678b.getClass();
                strA = oh1.a();
                this.f114677a.a(strA);
            }
        }
        return strA;
    }
}
