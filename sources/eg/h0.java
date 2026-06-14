package eg;

import kotlin.Result;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h0 {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(Continuation continuation) {
        Object objB;
        if (continuation instanceof jg.i) {
            return ((jg.i) continuation).toString();
        }
        try {
            Result.Companion companion = Result.f93230c;
            objB = Result.b(continuation + '@' + b(continuation));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        if (Result.g(objB) != null) {
            objB = continuation.getClass().getName() + '@' + b(continuation);
        }
        return (String) objB;
    }
}
