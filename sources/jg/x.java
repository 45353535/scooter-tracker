package jg;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x {
    public static final void a(Function1 function1, Object obj, CoroutineContext coroutineContext) {
        s0 s0VarB = b(function1, obj, null);
        if (s0VarB != null) {
            eg.d0.a(coroutineContext, s0VarB);
        }
    }

    public static final s0 b(Function1 function1, Object obj, s0 s0Var) {
        try {
            function1.invoke(obj);
            return s0Var;
        } catch (Throwable th2) {
            if (s0Var != null && s0Var.getCause() != th2) {
                lf.c.a(s0Var, th2);
                return s0Var;
            }
            return new s0("Exception in undelivered element handler for " + obj, th2);
        }
    }

    public static /* synthetic */ s0 c(Function1 function1, Object obj, s0 s0Var, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            s0Var = null;
        }
        return b(function1, obj, s0Var);
    }
}
