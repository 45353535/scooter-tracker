package ef;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.b1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h {
    public static final Object a(Function3 interceptor, e context, Object subject, Continuation continuation) {
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(subject, "subject");
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        return ((Function3) b1.g(interceptor, 3)).invoke(context, subject, continuation);
    }
}
