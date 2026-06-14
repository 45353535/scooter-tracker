package yads;

import eg.c0;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class k10 implements eg.c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nl0 f112552b;

    public k10(nl0 nl0Var) {
        this.f112552b = nl0Var;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return c0.a.a(this, obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(CoroutineContext.b bVar) {
        return c0.a.b(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final CoroutineContext.b getKey() {
        return eg.c0.J8;
    }

    @Override // eg.c0
    public final void handleException(CoroutineContext coroutineContext, Throwable th2) {
        try {
            Result.Companion companion = Result.f93230c;
            String message = th2.getMessage();
            if (message == null) {
                message = "Unknown";
            }
            boolean z10 = lb1.f113032a;
            this.f112552b.reportError(message, th2);
            Result.b(Unit.f93236a);
        } catch (Throwable th3) {
            Result.Companion companion2 = Result.f93230c;
            Result.b(kotlin.d.a(th3));
        }
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(CoroutineContext.b bVar) {
        return c0.a.c(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return c0.a.d(this, coroutineContext);
    }
}
