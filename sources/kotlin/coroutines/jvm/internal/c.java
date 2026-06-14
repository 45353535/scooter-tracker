package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Continuation {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final c f93268b = new c();

    private c() {
    }

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
