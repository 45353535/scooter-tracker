package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class tf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bq2 f116224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oq2 f116225b;

    public /* synthetic */ tf0() {
        this(new bq2());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0049, code lost:
    
        if (r7.getCurrentModeType() == 4) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
    
        if (r7.getPackageManager().hasSystemFeature("android.hardware.touchscreen") == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final yads.sf0 a(android.content.Context r7) {
        /*
            r6 = this;
            android.content.res.Resources r0 = r7.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            yads.oq2 r1 = r6.f116225b
            android.graphics.Point r1 = r1.a(r7)
            int r2 = r1.x
            int r1 = r1.y
            float r0 = r0.density
            float r2 = (float) r2
            float r3 = r2 / r0
            float r1 = (float) r1
            float r4 = r1 / r0
            float r3 = kotlin.ranges.g.i(r3, r4)
            r4 = 160(0xa0, float:2.24E-43)
            float r4 = (float) r4
            float r0 = r0 * r4
            float r2 = r2 / r0
            float r1 = r1 / r0
            float r2 = r2 * r2
            float r1 = r1 * r1
            float r1 = r1 + r2
            double r0 = (double) r1
            double r0 = java.lang.Math.sqrt(r0)
            r2 = 13
            boolean r2 = yads.sb.a(r2)
            if (r2 == 0) goto L4c
            java.lang.String r2 = "uimode"
            java.lang.Object r7 = r7.getSystemService(r2)
            boolean r2 = r7 instanceof android.app.UiModeManager
            if (r2 == 0) goto L41
            android.app.UiModeManager r7 = (android.app.UiModeManager) r7
            goto L42
        L41:
            r7 = 0
        L42:
            if (r7 == 0) goto L69
            int r7 = r7.getCurrentModeType()
            r2 = 4
            if (r7 != r2) goto L69
            goto L66
        L4c:
            r4 = 4624633867356078080(0x402e000000000000, double:15.0)
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 < 0) goto L69
            yads.bq2 r2 = r6.f116224a
            java.lang.String r4 = "android.hardware.touchscreen"
            r2.getClass()
            android.content.pm.PackageManager r7 = r7.getPackageManager()     // Catch: java.lang.Throwable -> L64
            boolean r7 = r7.hasSystemFeature(r4)     // Catch: java.lang.Throwable -> L64
            if (r7 != 0) goto L69
            goto L66
        L64:
            boolean r7 = yads.lb1.f113032a
        L66:
            yads.sf0 r7 = yads.sf0.f115781d
            return r7
        L69:
            r4 = 4619567317775286272(0x401c000000000000, double:7.0)
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 >= 0) goto L79
            r7 = 1142292480(0x44160000, float:600.0)
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 < 0) goto L76
            goto L79
        L76:
            yads.sf0 r7 = yads.sf0.f115779b
            return r7
        L79:
            yads.sf0 r7 = yads.sf0.f115780c
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.tf0.a(android.content.Context):yads.sf0");
    }

    public tf0(bq2 bq2Var) {
        this.f116224a = bq2Var;
        this.f116225b = new oq2();
    }
}
