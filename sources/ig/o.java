package ig;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o {
    public static final Object a(Function2 function2, Continuation continuation) {
        n nVar = new n(continuation.getContext(), continuation);
        Object objD = kg.b.d(nVar, nVar, function2);
        if (objD == pf.b.g()) {
            kotlin.coroutines.jvm.internal.g.c(continuation);
        }
        return objD;
    }
}
