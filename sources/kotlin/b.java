package kotlin;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.coroutines.jvm.internal.g;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.b1;

/* JADX INFO: loaded from: classes3.dex */
final class b extends lf.b implements Continuation {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Function3 f93238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f93239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Continuation f93240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Object f93241e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Function3 block, Object obj) {
        super(null);
        Intrinsics.checkNotNullParameter(block, "block");
        this.f93238b = block;
        this.f93239c = obj;
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f93240d = this;
        this.f93241e = a.f93237a;
    }

    @Override // lf.b
    public Object b(Object obj, Continuation continuation) {
        Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f93240d = continuation;
        this.f93239c = obj;
        Object objG = pf.b.g();
        if (objG == pf.b.g()) {
            g.c(continuation);
        }
        return objG;
    }

    public final Object c() {
        while (true) {
            Object obj = this.f93241e;
            Continuation continuation = this.f93240d;
            if (continuation == null) {
                d.b(obj);
                return obj;
            }
            if (Result.d(a.f93237a, obj)) {
                try {
                    Function3 function3 = this.f93238b;
                    Object obj2 = this.f93239c;
                    Object objF = !(function3 instanceof kotlin.coroutines.jvm.internal.a) ? pf.b.f(function3, this, obj2, continuation) : ((Function3) b1.g(function3, 3)).invoke(this, obj2, continuation);
                    if (objF != pf.b.g()) {
                        continuation.resumeWith(Result.b(objF));
                    }
                } catch (Throwable th2) {
                    Result.Companion companion = Result.f93230c;
                    continuation.resumeWith(Result.b(d.a(th2)));
                }
            } else {
                this.f93241e = a.f93237a;
                continuation.resumeWith(obj);
            }
        }
    }

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        return e.f93267b;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object obj) {
        this.f93240d = null;
        this.f93241e = obj;
    }
}
