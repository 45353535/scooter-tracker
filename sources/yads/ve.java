package yads;

import android.content.Context;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ve {
    public static final mr1 a(Context context, in3 in3Var) {
        wr3 wr3Var = wr3.f117545a;
        if (or1.f114396b == null) {
            synchronized (mr1.f113590e) {
                try {
                    if (or1.f114396b == null) {
                        Context contextA = gz.a(context);
                        or1.f114396b = or1.a(contextA, or1.f114395a.a(contextA), in3Var);
                    }
                    Unit unit = Unit.f93236a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        mr1 mr1Var = or1.f114396b;
        if (mr1Var != null) {
            return mr1Var;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
