package ig;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
final class n extends jg.a0 {
    public n(CoroutineContext coroutineContext, Continuation continuation) {
        super(coroutineContext, continuation);
    }

    @Override // kotlinx.coroutines.b0
    public boolean R(Throwable th2) {
        if (th2 instanceof k) {
            return true;
        }
        return L(th2);
    }
}
