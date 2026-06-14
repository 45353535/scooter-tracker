package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d extends a {

    @Nullable
    private final CoroutineContext _context;

    @Nullable
    private transient Continuation intercepted;

    public d(Continuation continuation, CoroutineContext coroutineContext) {
        super(continuation);
        this._context = coroutineContext;
    }

    @Override // kotlin.coroutines.Continuation
    @NotNull
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this._context;
        Intrinsics.checkNotNull(coroutineContext);
        return coroutineContext;
    }

    @NotNull
    public final Continuation intercepted() {
        Continuation continuationInterceptContinuation = this.intercepted;
        if (continuationInterceptContinuation == null) {
            kotlin.coroutines.d dVar = (kotlin.coroutines.d) getContext().get(kotlin.coroutines.d.M8);
            if (dVar == null || (continuationInterceptContinuation = dVar.interceptContinuation(this)) == null) {
                continuationInterceptContinuation = this;
            }
            this.intercepted = continuationInterceptContinuation;
        }
        return continuationInterceptContinuation;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    protected void releaseIntercepted() {
        Continuation continuation = this.intercepted;
        if (continuation != null && continuation != this) {
            CoroutineContext.Element element = getContext().get(kotlin.coroutines.d.M8);
            Intrinsics.checkNotNull(element);
            ((kotlin.coroutines.d) element).releaseInterceptedContinuation(continuation);
        }
        this.intercepted = c.f93268b;
    }

    public d(Continuation continuation) {
        this(continuation, continuation != null ? continuation.getContext() : null);
    }
}
