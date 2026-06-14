package jg;

import java.util.Iterator;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g {
    public static final void a(CoroutineContext coroutineContext, Throwable th2) {
        Iterator it = f.a().iterator();
        while (it.hasNext()) {
            try {
                ((eg.c0) it.next()).handleException(coroutineContext, th2);
            } catch (Throwable th3) {
                f.b(eg.d0.b(th2, th3));
            }
        }
        try {
            lf.c.a(th2, new h(coroutineContext));
        } catch (Throwable unused) {
        }
        f.b(th2);
    }
}
