package eg;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z0 {

    static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f69190r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f69191s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function0 f69192t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function0 function0, Continuation continuation) {
            super(2, continuation);
            this.f69192t = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = new a(this.f69192t, continuation);
            aVar.f69191s = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f69190r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            return z0.d(((CoroutineScope) this.f69191s).getCoroutineContext(), this.f69192t);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public static final Object b(CoroutineContext coroutineContext, Function0 function0, Continuation continuation) {
        return g.g(coroutineContext, new a(function0, null), continuation);
    }

    public static /* synthetic */ Object c(CoroutineContext coroutineContext, Function0 function0, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = kotlin.coroutines.e.f93267b;
        }
        return b(coroutineContext, function0, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(CoroutineContext coroutineContext, Function0 function0) throws Throwable {
        try {
            u1 u1Var = new u1();
            u1Var.A(kotlinx.coroutines.z.o(coroutineContext));
            try {
                return function0.invoke();
            } finally {
                u1Var.x();
            }
        } catch (InterruptedException e10) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e10);
        }
    }
}
