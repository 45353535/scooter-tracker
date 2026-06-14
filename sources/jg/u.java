package jg;

import eg.e1;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u {
    private static final v a(Throwable th2, String str) throws Throwable {
        if (th2 != null) {
            throw th2;
        }
        d();
        throw new lf.g();
    }

    static /* synthetic */ v b(Throwable th2, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            th2 = null;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        return a(th2, str);
    }

    public static final boolean c(e1 e1Var) {
        return e1Var.m() instanceof v;
    }

    public static final Void d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    public static final e1 e(s sVar, List list) {
        try {
            return sVar.c(list);
        } catch (Throwable th2) {
            return a(th2, sVar.b());
        }
    }
}
