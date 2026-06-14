package ig;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends CancellationException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient Object f74746b;

    public a(Object obj) {
        super("Flow was aborted, no more elements needed");
        this.f74746b = obj;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
