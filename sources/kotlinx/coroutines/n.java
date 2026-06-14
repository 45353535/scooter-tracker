package kotlinx.coroutines;

import eg.p0;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes3.dex */
final class n implements p0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Future f93628b;

    public n(Future future) {
        this.f93628b = future;
    }

    @Override // eg.p0
    public void dispose() {
        this.f93628b.cancel(false);
    }

    public String toString() {
        return "DisposableFutureHandle[" + this.f93628b + ']';
    }
}
