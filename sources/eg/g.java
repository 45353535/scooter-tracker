package eg;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g {
    public static final Deferred a(CoroutineScope coroutineScope, CoroutineContext coroutineContext, f0 f0Var, Function2 function2) {
        return i.a(coroutineScope, coroutineContext, f0Var, function2);
    }

    public static final Job c(CoroutineScope coroutineScope, CoroutineContext coroutineContext, f0 f0Var, Function2 function2) {
        return i.c(coroutineScope, coroutineContext, f0Var, function2);
    }

    public static final Object e(CoroutineContext coroutineContext, Function2 function2) {
        return h.a(coroutineContext, function2);
    }

    public static final Object g(CoroutineContext coroutineContext, Function2 function2, Continuation continuation) {
        return i.e(coroutineContext, function2, continuation);
    }
}
