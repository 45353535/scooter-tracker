package kotlinx.coroutines;

import eg.b1;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
final class w extends b1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f93644g = AtomicIntegerFieldUpdater.newUpdater(w.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Function1 f93645f;

    public w(Function1 function1) {
        this.f93645f = function1;
    }

    @Override // eg.b1
    public boolean u() {
        return true;
    }

    @Override // eg.b1
    public void v(Throwable th2) {
        if (f93644g.compareAndSet(this, 0, 1)) {
            this.f93645f.invoke(th2);
        }
    }
}
