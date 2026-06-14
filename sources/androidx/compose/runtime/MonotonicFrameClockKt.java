package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a3\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0014\b\u0004\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002H\u0086Hø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a-\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\b\"\u001e\u0010\u000e\u001a\u00020\u0001*\u00020\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"R", "Landroidx/compose/runtime/MonotonicFrameClock;", "Lkotlin/Function1;", "", "onFrame", "withFrameMillis", "(Landroidx/compose/runtime/MonotonicFrameClock;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withFrameNanos", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "getMonotonicFrameClock", "(Lkotlin/coroutines/CoroutineContext;)Landroidx/compose/runtime/MonotonicFrameClock;", "getMonotonicFrameClock$annotations", "(Lkotlin/coroutines/CoroutineContext;)V", "monotonicFrameClock", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class MonotonicFrameClockKt {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: androidx.compose.runtime.MonotonicFrameClockKt$withFrameMillis$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "R", "it", "", "invoke", "(J)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class AnonymousClass2<R> extends Lambda implements Function1<Long, R> {
        final /* synthetic */ Function1<Long, R> $onFrame;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Function1<? super Long, ? extends R> function1) {
            super(1);
            this.$onFrame = function1;
        }

        public final R invoke(long j10) {
            return this.$onFrame.invoke(Long.valueOf(j10 / 1000000));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Long l10) {
            return invoke(l10.longValue());
        }
    }

    @NotNull
    public static final MonotonicFrameClock getMonotonicFrameClock(@NotNull CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(coroutineContext, "<this>");
        MonotonicFrameClock monotonicFrameClock = (MonotonicFrameClock) coroutineContext.get(MonotonicFrameClock.INSTANCE);
        if (monotonicFrameClock != null) {
            return monotonicFrameClock;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    @ExperimentalComposeApi
    public static /* synthetic */ void getMonotonicFrameClock$annotations(CoroutineContext coroutineContext) {
    }

    @Nullable
    public static final <R> Object withFrameMillis(@NotNull MonotonicFrameClock monotonicFrameClock, @NotNull Function1<? super Long, ? extends R> function1, @NotNull Continuation continuation) {
        return monotonicFrameClock.withFrameNanos(new AnonymousClass2(function1), continuation);
    }

    private static final <R> Object withFrameMillis$$forInline(MonotonicFrameClock monotonicFrameClock, Function1<? super Long, ? extends R> function1, Continuation continuation) {
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(function1);
        z.c(0);
        Object objWithFrameNanos = monotonicFrameClock.withFrameNanos(anonymousClass2, continuation);
        z.c(1);
        return objWithFrameNanos;
    }

    @Nullable
    public static final <R> Object withFrameNanos(@NotNull Function1<? super Long, ? extends R> function1, @NotNull Continuation continuation) {
        return getMonotonicFrameClock(continuation.getContext()).withFrameNanos(function1, continuation);
    }

    @Nullable
    public static final <R> Object withFrameMillis(@NotNull Function1<? super Long, ? extends R> function1, @NotNull Continuation continuation) {
        return getMonotonicFrameClock(continuation.getContext()).withFrameNanos(new AnonymousClass2(function1), continuation);
    }
}
