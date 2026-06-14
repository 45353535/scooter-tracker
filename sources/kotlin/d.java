package kotlin;

import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {
    public static final Object a(Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        return new Result.a(exception);
    }

    public static final void b(Object obj) {
        if (obj instanceof Result.a) {
            throw ((Result.a) obj).f93232b;
        }
    }
}
