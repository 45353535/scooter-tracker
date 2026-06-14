package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class j72 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f72 f112253c = new f72();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile j72 f112254d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final px2 f112255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c83 f112256b;

    public j72(Context context, v11 v11Var) {
        i72 i72VarA = a(context);
        xm2 xm2VarB = b(context);
        g72 g72Var = new g72(i72VarA);
        this.f112256b = new c83(i72VarA, v11Var);
        this.f112255a = new px2(xm2VarB, g72Var, v11Var);
    }

    public static i72 a(Context context) {
        int iJ;
        try {
            iJ = kotlin.ranges.g.j(((int) (Runtime.getRuntime().maxMemory() / ((long) 1024))) / 8, ((int) (((r6.widthPixels * r6.heightPixels) * context.getResources().getDisplayMetrics().density) / 1024)) * 3);
        } catch (IllegalArgumentException unused) {
            boolean z10 = lb1.f113032a;
            iJ = 5120;
        }
        return new i72(kotlin.ranges.g.e(iJ, 5120));
    }

    public final c83 b() {
        return this.f112256b;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static yads.xm2 b(android.content.Context r2) {
        /*
            java.lang.Object r0 = yads.vt2.f117186j
            yads.vt2 r0 = yads.ut2.a()
            yads.hr2 r0 = r0.a(r2)
            if (r0 == 0) goto L1f
            java.lang.Integer r0 = r0.f111752s0
            if (r0 == 0) goto L1f
            int r1 = r0.intValue()
            if (r1 == 0) goto L17
            goto L18
        L17:
            r0 = 0
        L18:
            if (r0 == 0) goto L1f
            int r0 = r0.intValue()
            goto L20
        L1f:
            r0 = 4
        L20:
            yads.xm2 r2 = yads.ym2.a(r2, r0)
            r2.a()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.j72.b(android.content.Context):yads.xm2");
    }

    public final px2 a() {
        return this.f112255a;
    }
}
