package te;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static final Throwable a(Throwable th2) {
        Intrinsics.checkNotNullParameter(th2, "<this>");
        Throwable cause = th2;
        while (true) {
            if (!(cause instanceof CancellationException)) {
                if (cause == null) {
                    break;
                }
                return cause;
            }
            CancellationException cancellationException = (CancellationException) cause;
            if (Intrinsics.areEqual(cause, cancellationException.getCause())) {
                break;
            }
            cause = cancellationException.getCause();
        }
        return th2;
    }
}
