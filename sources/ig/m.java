package ig;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements CoroutineContext {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ CoroutineContext f74816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Throwable f74817c;

    public m(Throwable th2, CoroutineContext coroutineContext) {
        this.f74816b = coroutineContext;
        this.f74817c = th2;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public Object fold(Object obj, Function2 function2) {
        return this.f74816b.fold(obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext.Element get(CoroutineContext.b bVar) {
        return this.f74816b.get(bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.b bVar) {
        return this.f74816b.minusKey(bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return this.f74816b.plus(coroutineContext);
    }
}
