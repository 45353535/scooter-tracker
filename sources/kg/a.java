package kg;

import eg.l0;
import jg.j;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    private static final void a(Continuation continuation, Throwable th2) throws Throwable {
        if (th2 instanceof l0) {
            th2 = ((l0) th2).getCause();
        }
        Result.Companion companion = Result.f93230c;
        continuation.resumeWith(Result.b(d.a(th2)));
        throw th2;
    }

    public static final void b(Continuation continuation, Continuation continuation2) throws Throwable {
        try {
            Continuation continuationD = pf.b.d(continuation);
            Result.Companion companion = Result.f93230c;
            j.b(continuationD, Result.b(Unit.f93236a));
        } catch (Throwable th2) {
            a(continuation2, th2);
        }
    }

    public static final void c(Function1 function1, Continuation continuation) throws Throwable {
        try {
            Continuation continuationD = pf.b.d(pf.b.a(function1, continuation));
            Result.Companion companion = Result.f93230c;
            j.b(continuationD, Result.b(Unit.f93236a));
        } catch (Throwable th2) {
            a(continuation, th2);
        }
    }

    public static final void d(Function2 function2, Object obj, Continuation continuation) {
        try {
            Continuation continuationD = pf.b.d(pf.b.b(function2, obj, continuation));
            Result.Companion companion = Result.f93230c;
            j.b(continuationD, Result.b(Unit.f93236a));
        } catch (Throwable th2) {
            a(continuation, th2);
        }
    }
}
