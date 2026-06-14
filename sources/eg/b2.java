package eg;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b2 {
    public static final Object a(Continuation continuation) {
        Object objG;
        CoroutineContext context = continuation.getContext();
        kotlinx.coroutines.z.m(context);
        Continuation continuationD = pf.b.d(continuation);
        jg.i iVar = continuationD instanceof jg.i ? (jg.i) continuationD : null;
        if (iVar == null) {
            objG = Unit.f93236a;
        } else {
            if (jg.j.d(iVar.f85876e, context)) {
                iVar.l(context, Unit.f93236a);
            } else {
                kotlinx.coroutines.i0 i0Var = new kotlinx.coroutines.i0();
                CoroutineContext coroutineContextPlus = context.plus(i0Var);
                Unit unit = Unit.f93236a;
                iVar.l(coroutineContextPlus, unit);
                objG = (!i0Var.f93623b || jg.j.e(iVar)) ? pf.b.g() : unit;
            }
            objG = pf.b.g();
        }
        if (objG == pf.b.g()) {
            kotlin.coroutines.jvm.internal.g.c(continuation);
        }
        return objG == pf.b.g() ? objG : Unit.f93236a;
    }
}
