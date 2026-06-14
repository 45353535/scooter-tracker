package gg;

import eg.u0;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class o {
    public static final void a(x xVar, Throwable th2) {
        if (th2 != null) {
            cancellationExceptionA = th2 instanceof CancellationException ? (CancellationException) th2 : null;
            if (cancellationExceptionA == null) {
                cancellationExceptionA = u0.a("Channel was consumed, consumer had failed", th2);
            }
        }
        xVar.cancel(cancellationExceptionA);
    }
}
