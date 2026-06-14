package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public abstract class cc3 {
    public static dc3 a(Context context) {
        dc3 dc3Var;
        dc3 dc3Var2 = dc3.f109881c;
        if (dc3Var2 != null) {
            return dc3Var2;
        }
        synchronized (dc3.f109880b) {
            dc3Var = dc3.f109881c;
            if (dc3Var == null) {
                dc3Var = new dc3(an3.a(context, 1));
                dc3.f109881c = dc3Var;
            }
        }
        return dc3Var;
    }
}
