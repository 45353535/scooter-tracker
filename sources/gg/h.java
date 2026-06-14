package gg;

import eg.a1;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.b0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h extends kotlinx.coroutines.a implements g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g f72823e;

    public h(CoroutineContext coroutineContext, g gVar, boolean z10, boolean z11) {
        super(coroutineContext, z10, z11);
        this.f72823e = gVar;
    }

    @Override // kotlinx.coroutines.b0
    public void N(Throwable th2) {
        CancellationException cancellationExceptionQ0 = b0.Q0(this, th2, null, 1, null);
        this.f72823e.cancel(cancellationExceptionQ0);
        K(cancellationExceptionQ0);
    }

    @Override // gg.y
    public void b(Function1 function1) {
        this.f72823e.b(function1);
    }

    protected final g c1() {
        return this.f72823e;
    }

    @Override // kotlinx.coroutines.b0, kotlinx.coroutines.Job, gg.x
    public final void cancel(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new a1(Q(), null, this);
        }
        N(cancellationException);
    }

    @Override // gg.y
    public Object e(Object obj) {
        return this.f72823e.e(obj);
    }

    @Override // gg.x
    public Object f() {
        return this.f72823e.f();
    }

    @Override // gg.x
    public Object i(Continuation continuation) {
        Object objI = this.f72823e.i(continuation);
        pf.b.g();
        return objI;
    }

    @Override // gg.x
    public i iterator() {
        return this.f72823e.iterator();
    }

    @Override // gg.y
    public boolean j() {
        return this.f72823e.j();
    }

    @Override // gg.x
    public Object k(Continuation continuation) {
        return this.f72823e.k(continuation);
    }

    @Override // gg.y
    public boolean l(Throwable th2) {
        return this.f72823e.l(th2);
    }

    @Override // gg.y
    public Object w(Object obj, Continuation continuation) {
        return this.f72823e.w(obj, continuation);
    }

    public final g b1() {
        return this;
    }
}
