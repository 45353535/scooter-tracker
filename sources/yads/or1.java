package yads;

/* JADX INFO: loaded from: classes4.dex */
public abstract class or1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vt2 f114395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile mr1 f114396b;

    static {
        Object obj = vt2.f117186j;
        f114395a = ut2.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static yads.mr1 a(android.content.Context r5, yads.hr2 r6, yads.in3 r7) {
        /*
            yads.wr3 r0 = yads.wr3.f117545a
            yads.tg r0 = new yads.tg
            r0.<init>()
            yads.xg r1 = yads.ig.f111989a
            boolean r2 = yads.sb.a(r5)
            if (r2 == 0) goto L12
            java.lang.String r2 = "322a737a-a0ca-44e0-bc85-649b1c7c1db6"
            goto L14
        L12:
            java.lang.String r2 = "478cb909-6ad1-4e12-84cc-b3629a789f93"
        L14:
            r3 = 0
            yads.wg r4 = new yads.wg     // Catch: java.lang.Throwable -> L24
            r4.<init>(r7, r5, r1, r2)     // Catch: java.lang.Throwable -> L24
            kotlin.Lazy r7 = lf.i.a(r4)     // Catch: java.lang.Throwable -> L24
            yads.yg r1 = new yads.yg     // Catch: java.lang.Throwable -> L24
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L24
            goto L27
        L24:
            boolean r7 = yads.lb1.f113032a
            r1 = r3
        L27:
            yads.nr1 r7 = new yads.nr1
            r7.<init>(r5)
            kotlin.Lazy r5 = lf.i.a(r7)
            if (r6 == 0) goto L38
            boolean r6 = r6.f111724e0
            r7 = 1
            if (r6 != r7) goto L38
            goto L39
        L38:
            r7 = 0
        L39:
            yads.mr1 r6 = new yads.mr1
            java.lang.Object r2 = yads.af1.f108670d
            yads.af1 r2 = yads.ze1.a()
            java.util.concurrent.Executor r2 = r2.a()
            r6.<init>(r1, r5, r7, r2)
            yads.ir2 r5 = new yads.ir2
            r5.<init>(r0)
            java.lang.Object r7 = yads.rr2.f115559b
            yads.rr2 r7 = yads.qr2.a()
            java.lang.Object r0 = yads.rr2.f115559b
            monitor-enter(r0)
            java.util.HashMap r1 = r7.f115561a     // Catch: java.lang.Throwable -> L64
            boolean r1 = r1.containsKey(r5)     // Catch: java.lang.Throwable -> L64
            if (r1 != 0) goto L66
            java.util.HashMap r7 = r7.f115561a     // Catch: java.lang.Throwable -> L64
            r7.put(r5, r3)     // Catch: java.lang.Throwable -> L64
            goto L66
        L64:
            r5 = move-exception
            goto L6a
        L66:
            kotlin.Unit r5 = kotlin.Unit.f93236a     // Catch: java.lang.Throwable -> L64
            monitor-exit(r0)
            return r6
        L6a:
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.or1.a(android.content.Context, yads.hr2, yads.in3):yads.mr1");
    }
}
