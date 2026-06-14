package eg;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d0 {
    public static final void a(CoroutineContext coroutineContext, Throwable th2) {
        if (th2 instanceof l0) {
            th2 = ((l0) th2).getCause();
        }
        try {
            c0 c0Var = (c0) coroutineContext.get(c0.J8);
            if (c0Var != null) {
                c0Var.handleException(coroutineContext, th2);
            } else {
                jg.g.a(coroutineContext, th2);
            }
        } catch (Throwable th3) {
            jg.g.a(coroutineContext, b(th2, th3));
        }
    }

    public static final Throwable b(Throwable th2, Throwable th3) {
        if (th2 == th3) {
            return th2;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
        lf.c.a(runtimeException, th2);
        return runtimeException;
    }
}
