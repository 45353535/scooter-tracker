package yads;

import android.content.Context;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public abstract class u73 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile boolean f116560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f116561b = new Object();

    public static void a(Context context, mr1 mr1Var) {
        if (f116560a) {
            return;
        }
        synchronized (f116561b) {
            try {
                if (!f116560a) {
                    Object obj = vt2.f117186j;
                    hr2 hr2VarA = ut2.a().a(context);
                    if (hr2VarA != null && hr2VarA.f111722d0) {
                        Thread.setDefaultUncaughtExceptionHandler(new t73(mr1Var, Thread.getDefaultUncaughtExceptionHandler(), hr2VarA));
                        f116560a = true;
                    }
                }
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
