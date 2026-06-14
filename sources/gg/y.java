package gg;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public interface y {

    public static final class a {
        public static /* synthetic */ boolean a(y yVar, Throwable th2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
            }
            if ((i10 & 1) != 0) {
                th2 = null;
            }
            return yVar.l(th2);
        }
    }

    void b(Function1 function1);

    Object e(Object obj);

    boolean j();

    boolean l(Throwable th2);

    Object w(Object obj, Continuation continuation);
}
