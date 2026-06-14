package eg;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
final class z1 implements CoroutineContext.Element, CoroutineContext.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z1 f69193b = new z1();

    private z1() {
    }

    @Override // kotlin.coroutines.CoroutineContext
    public Object fold(Object obj, Function2 function2) {
        return CoroutineContext.Element.a.a(this, obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext.Element get(CoroutineContext.b bVar) {
        return CoroutineContext.Element.a.b(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.b bVar) {
        return CoroutineContext.Element.a.c(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.Element.a.d(this, coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public CoroutineContext.b getKey() {
        return this;
    }
}
