package ef;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements CoroutineStackFrame, Continuation {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f69116b = new n();

    private n() {
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public CoroutineStackFrame getCallerFrame() {
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        return kotlin.coroutines.e.f93267b;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object obj) {
        m.f69115a.a();
    }
}
