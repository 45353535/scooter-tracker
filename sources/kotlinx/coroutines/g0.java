package kotlinx.coroutines;

import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
final class g0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CoroutineDispatcher f93614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CancellableContinuation f93615c;

    public g0(CoroutineDispatcher coroutineDispatcher, CancellableContinuation cancellableContinuation) {
        this.f93614b = coroutineDispatcher;
        this.f93615c = cancellableContinuation;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f93615c.A(this.f93614b, Unit.f93236a);
    }
}
