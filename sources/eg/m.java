package eg;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f69158c = AtomicIntegerFieldUpdater.newUpdater(m.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public m(Continuation continuation, Throwable th2, boolean z10) {
        if (th2 == null) {
            th2 = new CancellationException("Continuation " + continuation + " was cancelled normally");
        }
        super(th2, z10);
    }

    public final boolean e() {
        return f69158c.compareAndSet(this, 0, 1);
    }
}
