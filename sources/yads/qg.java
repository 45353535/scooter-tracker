package yads;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class qg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile n11 f114993a;

    public static final n11 a(Context context) {
        if (f114993a == null) {
            synchronized (n11.f113688g) {
                try {
                    if (f114993a == null) {
                        Context applicationContext = context.getApplicationContext();
                        xg xgVar = ig.f111989a;
                        f114993a = new n11(applicationContext, xgVar, new rg(), new pg(new ng(), xgVar), new ph1(gf1.a(applicationContext, "YadPreferenceFile")));
                    }
                    Unit unit = Unit.f93236a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        n11 n11Var = f114993a;
        Intrinsics.checkNotNull(n11Var);
        return n11Var;
    }
}
