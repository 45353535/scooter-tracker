package kotlinx.coroutines;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes3.dex */
public interface CancellableContinuation extends Continuation {

    public static final class a {
        public static /* synthetic */ boolean a(CancellableContinuation cancellableContinuation, Throwable th2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                th2 = null;
            }
            return cancellableContinuation.a(th2);
        }
    }

    void A(CoroutineDispatcher coroutineDispatcher, Object obj);

    Object B(Object obj, Object obj2, Function3 function3);

    boolean a(Throwable th2);

    boolean isActive();

    boolean n();

    void r(Object obj, Function1 function1);

    void t(Object obj, Function3 function3);

    void u(Object obj);

    void v(Function1 function1);

    Object x(Throwable th2);
}
