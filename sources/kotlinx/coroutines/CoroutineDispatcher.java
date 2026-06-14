package kotlinx.coroutines;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CoroutineDispatcher extends kotlin.coroutines.a implements kotlin.coroutines.d {

    @NotNull
    public static final a Key = new a(null);

    public static final class a extends kotlin.coroutines.b {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CoroutineDispatcher d(CoroutineContext.Element element) {
            if (element instanceof CoroutineDispatcher) {
                return (CoroutineDispatcher) element;
            }
            return null;
        }

        private a() {
            super(kotlin.coroutines.d.M8, new Function1() { // from class: eg.b0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CoroutineDispatcher.a.d((CoroutineContext.Element) obj);
                }
            });
        }
    }

    public CoroutineDispatcher() {
        super(kotlin.coroutines.d.M8);
    }

    public static /* synthetic */ CoroutineDispatcher limitedParallelism$default(CoroutineDispatcher coroutineDispatcher, int i10, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: limitedParallelism");
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        return coroutineDispatcher.limitedParallelism(i10, str);
    }

    public abstract void dispatch(CoroutineContext coroutineContext, Runnable runnable);

    public void dispatchYield(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        jg.j.c(this, coroutineContext, runnable);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.b bVar) {
        return (E) d.a.a(this, bVar);
    }

    @Override // kotlin.coroutines.d
    @NotNull
    public final <T> Continuation interceptContinuation(@NotNull Continuation continuation) {
        return new jg.i(this, continuation);
    }

    public boolean isDispatchNeeded(@NotNull CoroutineContext coroutineContext) {
        return true;
    }

    @NotNull
    public CoroutineDispatcher limitedParallelism(int i10, @Nullable String str) {
        jg.m.a(i10);
        return new jg.l(this, i10, str);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.b bVar) {
        return d.a.b(this, bVar);
    }

    @NotNull
    public final CoroutineDispatcher plus(@NotNull CoroutineDispatcher coroutineDispatcher) {
        return coroutineDispatcher;
    }

    @Override // kotlin.coroutines.d
    public final void releaseInterceptedContinuation(@NotNull Continuation continuation) {
        Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((jg.i) continuation).s();
    }

    @NotNull
    public String toString() {
        return eg.h0.a(this) + '@' + eg.h0.b(this);
    }

    public /* synthetic */ CoroutineDispatcher limitedParallelism(int i10) {
        return limitedParallelism(i10, null);
    }
}
