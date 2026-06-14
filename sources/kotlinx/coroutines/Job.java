package kotlinx.coroutines;

import eg.p0;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes3.dex */
public interface Job extends CoroutineContext.Element {
    public static final b N8 = b.f93569b;

    public static final class a {
        public static /* synthetic */ void a(Job job, CancellationException cancellationException, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                cancellationException = null;
            }
            job.cancel(cancellationException);
        }

        public static Object b(Job job, Object obj, Function2 function2) {
            return CoroutineContext.Element.a.a(job, obj, function2);
        }

        public static CoroutineContext.Element c(Job job, CoroutineContext.b bVar) {
            return CoroutineContext.Element.a.b(job, bVar);
        }

        public static /* synthetic */ p0 d(Job job, boolean z10, boolean z11, Function1 function1, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
            }
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            if ((i10 & 2) != 0) {
                z11 = true;
            }
            return job.U(z10, z11, function1);
        }

        public static CoroutineContext e(Job job, CoroutineContext.b bVar) {
            return CoroutineContext.Element.a.c(job, bVar);
        }

        public static CoroutineContext f(Job job, CoroutineContext coroutineContext) {
            return CoroutineContext.Element.a.d(job, coroutineContext);
        }
    }

    public static final class b implements CoroutineContext.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ b f93569b = new b();

        private b() {
        }
    }

    mg.a M();

    p0 U(boolean z10, boolean z11, Function1 function1);

    CancellationException W();

    void cancel(CancellationException cancellationException);

    Sequence getChildren();

    eg.n h(eg.o oVar);

    Object i0(Continuation continuation);

    boolean isActive();

    boolean isCancelled();

    boolean n();

    p0 q(Function1 function1);

    boolean start();
}
