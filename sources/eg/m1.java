package eg;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m1 {
    public static final s a(Job job) {
        return new l1(job);
    }

    public static /* synthetic */ s b(Job job, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            job = null;
        }
        return a(job);
    }

    public static final Object c(Function2 function2, Continuation continuation) {
        k1 k1Var = new k1(continuation.getContext(), continuation);
        Object objD = kg.b.d(k1Var, k1Var, function2);
        if (objD == pf.b.g()) {
            kotlin.coroutines.jvm.internal.g.c(continuation);
        }
        return objD;
    }
}
