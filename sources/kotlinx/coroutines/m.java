package kotlinx.coroutines;

import eg.m0;
import eg.y1;
import java.util.concurrent.CancellationException;
import jg.l0;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m extends lg.h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f93627d;

    public m(int i10) {
        this.f93627d = i10;
    }

    public void d(Object obj, Throwable th2) {
    }

    public abstract Continuation e();

    public Throwable f(Object obj) {
        eg.t tVar = obj instanceof eg.t ? (eg.t) obj : null;
        if (tVar != null) {
            return tVar.f69173a;
        }
        return null;
    }

    public Object g(Object obj) {
        return obj;
    }

    public final void h(Throwable th2) {
        eg.d0.a(e().getContext(), new eg.g0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2));
    }

    public abstract Object i();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Continuation continuationE = e();
            Intrinsics.checkNotNull(continuationE, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            jg.i iVar = (jg.i) continuationE;
            Continuation continuation = iVar.f85877f;
            Object obj = iVar.f85879h;
            CoroutineContext context = continuation.getContext();
            Object objI = l0.i(context, obj);
            Job job = null;
            y1 y1VarM = objI != l0.f85891a ? eg.a0.m(continuation, context, objI) : null;
            try {
                CoroutineContext context2 = continuation.getContext();
                Object objI2 = i();
                Throwable thF = f(objI2);
                if (thF == null && m0.b(this.f93627d)) {
                    job = (Job) context2.get(Job.N8);
                }
                if (job != null && !job.isActive()) {
                    CancellationException cancellationExceptionW = job.W();
                    d(objI2, cancellationExceptionW);
                    Result.Companion companion = Result.f93230c;
                    continuation.resumeWith(Result.b(kotlin.d.a(cancellationExceptionW)));
                } else if (thF != null) {
                    Result.Companion companion2 = Result.f93230c;
                    continuation.resumeWith(Result.b(kotlin.d.a(thF)));
                } else {
                    Result.Companion companion3 = Result.f93230c;
                    continuation.resumeWith(Result.b(g(objI2)));
                }
                Unit unit = Unit.f93236a;
                if (y1VarM == null || y1VarM.c1()) {
                    l0.f(context, objI);
                }
            } catch (Throwable th2) {
                if (y1VarM == null || y1VarM.c1()) {
                    l0.f(context, objI);
                }
                throw th2;
            }
        } catch (eg.l0 e10) {
            eg.d0.a(e().getContext(), e10.getCause());
        } catch (Throwable th3) {
            h(th3);
        }
    }
}
