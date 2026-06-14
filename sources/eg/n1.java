package eg;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public interface n1 extends CoroutineContext.Element {

    public static final class a {
        public static Object a(n1 n1Var, Object obj, Function2 function2) {
            return CoroutineContext.Element.a.a(n1Var, obj, function2);
        }

        public static CoroutineContext b(n1 n1Var, CoroutineContext coroutineContext) {
            return CoroutineContext.Element.a.d(n1Var, coroutineContext);
        }
    }

    void restoreThreadContext(CoroutineContext coroutineContext, Object obj);

    Object updateThreadContext(CoroutineContext coroutineContext);
}
