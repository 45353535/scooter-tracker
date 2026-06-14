package androidx.compose.runtime;

import com.ironsource.C4240b4;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \f2\u00020\u0001:\u0001\fJ-\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003H¦@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0018\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/MonotonicFrameClock;", "Lkotlin/coroutines/CoroutineContext$Element;", "R", "Lkotlin/Function1;", "", "onFrame", "withFrameNanos", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext$b;", "getKey", "()Lkotlin/coroutines/CoroutineContext$b;", C4240b4.i.W, "Key", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface MonotonicFrameClock extends CoroutineContext.Element {

    /* JADX INFO: renamed from: Key, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static <R> R fold(@NotNull MonotonicFrameClock monotonicFrameClock, R r10, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return (R) CoroutineContext.Element.a.a(monotonicFrameClock, r10, operation);
        }

        @Nullable
        public static <E extends CoroutineContext.Element> E get(@NotNull MonotonicFrameClock monotonicFrameClock, @NotNull CoroutineContext.b key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return (E) CoroutineContext.Element.a.b(monotonicFrameClock, key);
        }

        @Deprecated
        @NotNull
        public static CoroutineContext.b getKey(@NotNull MonotonicFrameClock monotonicFrameClock) {
            return c.a(monotonicFrameClock);
        }

        @NotNull
        public static CoroutineContext minusKey(@NotNull MonotonicFrameClock monotonicFrameClock, @NotNull CoroutineContext.b key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return CoroutineContext.Element.a.c(monotonicFrameClock, key);
        }

        @NotNull
        public static CoroutineContext plus(@NotNull MonotonicFrameClock monotonicFrameClock, @NotNull CoroutineContext context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return CoroutineContext.Element.a.d(monotonicFrameClock, context);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.MonotonicFrameClock$Key, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/MonotonicFrameClock$Key;", "Lkotlin/coroutines/CoroutineContext$b;", "Landroidx/compose/runtime/MonotonicFrameClock;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion implements CoroutineContext.b {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* synthetic */ Object fold(Object obj, @NotNull Function2 function2);

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Nullable
    /* synthetic */ CoroutineContext.Element get(@NotNull CoroutineContext.b bVar);

    @Override // kotlin.coroutines.CoroutineContext.Element
    @NotNull
    CoroutineContext.b getKey();

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    /* synthetic */ CoroutineContext minusKey(@NotNull CoroutineContext.b bVar);

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    /* synthetic */ CoroutineContext plus(@NotNull CoroutineContext coroutineContext);

    @Nullable
    <R> Object withFrameNanos(@NotNull Function1<? super Long, ? extends R> function1, @NotNull Continuation continuation);
}
