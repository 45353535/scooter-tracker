package of;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static final Continuation a(Function1 function1, Continuation completion) {
        Intrinsics.checkNotNullParameter(function1, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        return new e(pf.b.d(pf.b.a(function1, completion)), pf.b.g());
    }

    public static final Continuation b(Function2 function2, Object obj, Continuation completion) {
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        return new e(pf.b.d(pf.b.b(function2, obj, completion)), pf.b.g());
    }

    public static final void c(Function2 function2, Object obj, Continuation completion) {
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        Continuation continuationD = pf.b.d(pf.b.b(function2, obj, completion));
        Result.Companion companion = Result.f93230c;
        continuationD.resumeWith(Result.b(Unit.f93236a));
    }
}
