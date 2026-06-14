package ig;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends CancellationException {
    public k() {
        super("Child of the scoped flow was cancelled");
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
