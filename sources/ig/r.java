package ig;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
final class r implements Continuation {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r f74818b = new r();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final CoroutineContext f74819c = kotlin.coroutines.e.f93267b;

    private r() {
    }

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        return f74819c;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object obj) {
    }
}
