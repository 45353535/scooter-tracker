package ef;

import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {
    public static final e a(Object context, List interceptors, Object subject, CoroutineContext coroutineContext, boolean z10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(subject, "subject");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        return (g.a() || z10) ? new a(context, interceptors, subject, coroutineContext) : new o(subject, context, interceptors);
    }
}
