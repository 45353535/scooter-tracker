package eg;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CancellableContinuation;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l {
    public static final void a(CancellableContinuation cancellableContinuation, p0 p0Var) {
        c(cancellableContinuation, new q0(p0Var));
    }

    public static final kotlinx.coroutines.e b(Continuation continuation) {
        if (!(continuation instanceof jg.i)) {
            return new kotlinx.coroutines.e(continuation, 1);
        }
        kotlinx.coroutines.e eVarK = ((jg.i) continuation).k();
        if (eVarK != null) {
            if (!eVarK.R()) {
                eVarK = null;
            }
            if (eVarK != null) {
                return eVarK;
            }
        }
        return new kotlinx.coroutines.e(continuation, 2);
    }

    public static final void c(CancellableContinuation cancellableContinuation, kotlinx.coroutines.d dVar) {
        if (!(cancellableContinuation instanceof kotlinx.coroutines.e)) {
            throw new UnsupportedOperationException("third-party implementation of CancellableContinuation is not supported");
        }
        ((kotlinx.coroutines.e) cancellableContinuation).L(dVar);
    }
}
