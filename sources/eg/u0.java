package eg;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u0 {
    public static final CancellationException a(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }
}
