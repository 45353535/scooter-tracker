package kotlinx.coroutines;

import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes3.dex */
final class c implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Future f93595b;

    public c(Future future) {
        this.f93595b = future;
    }

    @Override // kotlinx.coroutines.d
    public void a(Throwable th2) {
        this.f93595b.cancel(false);
    }

    public String toString() {
        return "CancelFutureOnCancel[" + this.f93595b + ']';
    }
}
