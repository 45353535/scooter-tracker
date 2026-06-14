package eg;

import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes3.dex */
public final class y1 extends jg.a0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ThreadLocal f69189f;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public y1(CoroutineContext coroutineContext, Continuation continuation) {
        z1 z1Var = z1.f69193b;
        super(coroutineContext.get(z1Var) == null ? coroutineContext.plus(z1Var) : coroutineContext, continuation);
        this.f69189f = new ThreadLocal();
        if (continuation.getContext().get(kotlin.coroutines.d.M8) instanceof CoroutineDispatcher) {
            return;
        }
        Object objI = jg.l0.i(coroutineContext, null);
        jg.l0.f(coroutineContext, objI);
        e1(coroutineContext, objI);
    }

    private final void d1() {
        if (this.threadLocalIsSet) {
            Pair pair = (Pair) this.f69189f.get();
            if (pair != null) {
                jg.l0.f((CoroutineContext) pair.component1(), pair.component2());
            }
            this.f69189f.remove();
        }
    }

    @Override // jg.a0, kotlinx.coroutines.a
    protected void X0(Object obj) {
        d1();
        Object objA = v.a(obj, this.f85861e);
        Continuation continuation = this.f85861e;
        CoroutineContext context = continuation.getContext();
        Object objI = jg.l0.i(context, null);
        y1 y1VarM = objI != jg.l0.f85891a ? a0.m(continuation, context, objI) : null;
        try {
            this.f85861e.resumeWith(objA);
            Unit unit = Unit.f93236a;
            if (y1VarM == null || y1VarM.c1()) {
                jg.l0.f(context, objI);
            }
        } catch (Throwable th2) {
            if (y1VarM == null || y1VarM.c1()) {
                jg.l0.f(context, objI);
            }
            throw th2;
        }
    }

    @Override // jg.a0
    public void b1() {
        d1();
    }

    public final boolean c1() {
        boolean z10 = this.threadLocalIsSet && this.f69189f.get() == null;
        this.f69189f.remove();
        return !z10;
    }

    public final void e1(CoroutineContext coroutineContext, Object obj) {
        this.threadLocalIsSet = true;
        this.f69189f.set(TuplesKt.to(coroutineContext, obj));
    }
}
