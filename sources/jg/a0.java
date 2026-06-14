package jg;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;

/* JADX INFO: loaded from: classes3.dex */
public class a0 extends kotlinx.coroutines.a implements CoroutineStackFrame {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Continuation f85861e;

    public a0(CoroutineContext coroutineContext, Continuation continuation) {
        super(coroutineContext, true, true);
        this.f85861e = continuation;
    }

    @Override // kotlinx.coroutines.b0
    protected void H(Object obj) {
        j.b(pf.b.d(this.f85861e), eg.v.a(obj, this.f85861e));
    }

    @Override // kotlinx.coroutines.a
    protected void X0(Object obj) {
        Continuation continuation = this.f85861e;
        continuation.resumeWith(eg.v.a(obj, continuation));
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.f85861e;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlinx.coroutines.b0
    protected final boolean t0() {
        return true;
    }

    public void b1() {
    }
}
