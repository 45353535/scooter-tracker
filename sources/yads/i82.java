package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class i82 {
    public final k82 a(Context context) {
        k82 k82Var;
        k82 k82Var2 = k82.f112644i;
        if (k82Var2 != null) {
            return k82Var2;
        }
        synchronized (this) {
            k82Var = k82.f112644i;
            if (k82Var == null) {
                k82Var = new k82(context);
                k82.f112644i = k82Var;
            }
        }
        return k82Var;
    }
}
