package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e72 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f110233a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile xm2 f110234b;

    public static final xm2 a(Context context) {
        xm2 xm2VarA;
        xm2 xm2Var = f110234b;
        if (xm2Var != null) {
            return xm2Var;
        }
        synchronized (f110233a) {
            xm2VarA = f110234b;
            if (xm2VarA == null) {
                xm2VarA = ym2.a(context, w62.a(context));
                f110234b = xm2VarA;
                xm2VarA.a();
            }
        }
        return xm2VarA;
    }
}
