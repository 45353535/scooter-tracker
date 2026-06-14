package eg;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public interface c0 extends CoroutineContext.Element {
    public static final b J8 = b.f69135b;

    public static final class a {
        public static Object a(c0 c0Var, Object obj, Function2 function2) {
            return CoroutineContext.Element.a.a(c0Var, obj, function2);
        }

        public static CoroutineContext.Element b(c0 c0Var, CoroutineContext.b bVar) {
            return CoroutineContext.Element.a.b(c0Var, bVar);
        }

        public static CoroutineContext c(c0 c0Var, CoroutineContext.b bVar) {
            return CoroutineContext.Element.a.c(c0Var, bVar);
        }

        public static CoroutineContext d(c0 c0Var, CoroutineContext coroutineContext) {
            return CoroutineContext.Element.a.d(c0Var, coroutineContext);
        }
    }

    public static final class b implements CoroutineContext.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ b f69135b = new b();

        private b() {
        }
    }

    void handleException(CoroutineContext coroutineContext, Throwable th2);
}
