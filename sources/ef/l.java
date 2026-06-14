package ef;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l {
    public static final Throwable a(Throwable exception, Continuation continuation) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        try {
            return k.a(exception, exception.getCause());
        } catch (Throwable unused) {
            return exception;
        }
    }
}
