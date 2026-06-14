package jg;

import eg.n1;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m0 implements n1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f85895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ThreadLocal f85896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CoroutineContext.b f85897d;

    public m0(Object obj, ThreadLocal threadLocal) {
        this.f85895b = obj;
        this.f85896c = threadLocal;
        this.f85897d = new n0(threadLocal);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public Object fold(Object obj, Function2 function2) {
        return n1.a.a(this, obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext.Element get(CoroutineContext.b bVar) {
        if (!Intrinsics.areEqual(getKey(), bVar)) {
            return null;
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type E of kotlinx.coroutines.internal.ThreadLocalElement.get");
        return this;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public CoroutineContext.b getKey() {
        return this.f85897d;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.b bVar) {
        return Intrinsics.areEqual(getKey(), bVar) ? kotlin.coroutines.e.f93267b : this;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return n1.a.b(this, coroutineContext);
    }

    @Override // eg.n1
    public void restoreThreadContext(CoroutineContext coroutineContext, Object obj) {
        this.f85896c.set(obj);
    }

    public String toString() {
        return "ThreadLocal(value=" + this.f85895b + ", threadLocal = " + this.f85896c + ')';
    }

    @Override // eg.n1
    public Object updateThreadContext(CoroutineContext coroutineContext) {
        Object obj = this.f85896c.get();
        this.f85896c.set(this.f85895b);
        return obj;
    }
}
