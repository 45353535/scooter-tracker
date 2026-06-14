package hg;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
class f extends ig.e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Function2 f73212e;

    public /* synthetic */ f(Function2 function2, CoroutineContext coroutineContext, int i10, gg.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2, (i11 & 2) != 0 ? kotlin.coroutines.e.f93267b : coroutineContext, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? gg.a.f72765b : aVar);
    }

    static /* synthetic */ Object n(f fVar, gg.v vVar, Continuation continuation) {
        Object objInvoke = fVar.f73212e.invoke(vVar, continuation);
        return objInvoke == pf.b.g() ? objInvoke : Unit.f93236a;
    }

    @Override // ig.e
    protected Object f(gg.v vVar, Continuation continuation) {
        return n(this, vVar, continuation);
    }

    @Override // ig.e
    protected ig.e i(CoroutineContext coroutineContext, int i10, gg.a aVar) {
        return new f(this.f73212e, coroutineContext, i10, aVar);
    }

    @Override // ig.e
    public String toString() {
        return "block[" + this.f73212e + "] -> " + super.toString();
    }

    public f(Function2 function2, CoroutineContext coroutineContext, int i10, gg.a aVar) {
        super(coroutineContext, i10, aVar);
        this.f73212e = function2;
    }
}
