package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gl0 {
    public static hl0 a(Context context) {
        hl0 hl0Var;
        hl0 hl0Var2 = hl0.f111625c;
        if (hl0Var2 != null) {
            return hl0Var2;
        }
        synchronized (hl0.f111626d) {
            hl0Var = hl0.f111625c;
            if (hl0Var == null) {
                hl0Var = new hl0(new fl0(), qg.a(context.getApplicationContext()));
                hl0.f111625c = hl0Var;
            }
        }
        return hl0Var;
    }
}
