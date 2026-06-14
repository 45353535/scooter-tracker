package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class nf3 {
    public final of3 a(Context context) {
        of3 of3Var;
        of3 of3Var2 = of3.f114305d;
        if (of3Var2 != null) {
            return of3Var2;
        }
        synchronized (this) {
            of3Var = of3.f114305d;
            if (of3Var == null) {
                of3Var = new of3(context);
                of3.f114305d = of3Var;
            }
        }
        return of3Var;
    }
}
