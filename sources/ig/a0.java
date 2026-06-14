package ig;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;

/* JADX INFO: loaded from: classes3.dex */
final class a0 implements Continuation, CoroutineStackFrame {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Continuation f74747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CoroutineContext f74748c;

    public a0(Continuation continuation, CoroutineContext coroutineContext) {
        this.f74747b = continuation;
        this.f74748c = coroutineContext;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.f74747b;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        return this.f74748c;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object obj) {
        this.f74747b.resumeWith(obj);
    }
}
