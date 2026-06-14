package yads;

import eg.c0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class j10 implements eg.c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0.b f112216b = eg.c0.J8;

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
        return this.f112216b;
    }

    @Override // eg.c0
    public final void handleException(CoroutineContext coroutineContext, Throwable th2) {
        th2.getMessage();
        boolean z10 = lb1.f113032a;
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
