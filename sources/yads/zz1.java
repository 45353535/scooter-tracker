package yads;

import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zz1 {
    public static a02 a() {
        a02 a02Var;
        a02 a02Var2 = a02.f108505c;
        if (a02Var2 != null) {
            return a02Var2;
        }
        synchronized (a02.f108504b) {
            a02Var = a02.f108505c;
            if (a02Var == null) {
                a02Var = new a02(new WeakHashMap());
                a02.f108505c = a02Var;
            }
        }
        return a02Var;
    }
}
