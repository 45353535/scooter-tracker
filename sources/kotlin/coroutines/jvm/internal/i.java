package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i extends a {
    public i(Continuation continuation) {
        super(continuation);
        if (continuation != null && continuation.getContext() != kotlin.coroutines.e.f93267b) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // kotlin.coroutines.Continuation
    @NotNull
    public CoroutineContext getContext() {
        return kotlin.coroutines.e.f93267b;
    }
}
