package eg;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CancellableContinuation;

/* JADX INFO: loaded from: classes3.dex */
public abstract class v {
    public static final Object a(Object obj, Continuation continuation) {
        if (!(obj instanceof t)) {
            return Result.b(obj);
        }
        Result.Companion companion = Result.f93230c;
        return Result.b(kotlin.d.a(((t) obj).f69173a));
    }

    public static final Object b(Object obj) {
        Throwable thG = Result.g(obj);
        return thG == null ? obj : new t(thG, false, 2, null);
    }

    public static final Object c(Object obj, CancellableContinuation cancellableContinuation) {
        Throwable thG = Result.g(obj);
        return thG == null ? obj : new t(thG, false, 2, null);
    }
}
