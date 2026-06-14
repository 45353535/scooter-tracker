package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class f72 {
    public final j72 a(Context context) {
        j72 j72Var;
        j72 j72Var2 = j72.f112254d;
        if (j72Var2 != null) {
            return j72Var2;
        }
        synchronized (this) {
            j72Var = j72.f112254d;
            if (j72Var == null) {
                j72Var = new j72(context, new v11());
                j72.f112254d = j72Var;
            }
        }
        return j72Var;
    }
}
