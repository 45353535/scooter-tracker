package eg;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes3.dex */
public final class l0 extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Throwable f69157b;

    public l0(Throwable th2, CoroutineDispatcher coroutineDispatcher, CoroutineContext coroutineContext) {
        super("Coroutine dispatcher " + coroutineDispatcher + " threw an exception, context = " + coroutineContext, th2);
        this.f69157b = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f69157b;
    }
}
