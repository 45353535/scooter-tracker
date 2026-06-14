package androidx.compose.animation.core;

import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.ui.platform.InfiniteAnimationPolicy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\u001a-\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a/\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\u0086Hø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"R", "Lkotlin/Function1;", "", "onFrame", "withInfiniteAnimationFrameNanos", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withInfiniteAnimationFrameMillis", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class InfiniteAnimationPolicyKt {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: androidx.compose.animation.core.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameMillis$2, reason: invalid class name */
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

    /* JADX INFO: renamed from: androidx.compose.animation.core.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\u008a@"}, d2 = {"<anonymous>", "R"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.animation.core.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2", f = "InfiniteAnimationPolicy.kt", l = {31}, m = "invokeSuspend")
    static final class C13762 extends k implements Function1<Continuation, Object> {
        final /* synthetic */ Function1<Long, R> $onFrame;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C13762(Function1<? super Long, ? extends R> function1, Continuation continuation) {
            super(1, continuation);
            this.$onFrame = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@NotNull Continuation continuation) {
            return new C13762(this.$onFrame, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                return obj;
            }
            kotlin.d.b(obj);
            Function1<Long, R> function1 = this.$onFrame;
            this.label = 1;
            Object objWithFrameNanos = MonotonicFrameClockKt.withFrameNanos(function1, this);
            return objWithFrameNanos == objG ? objG : objWithFrameNanos;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable Continuation continuation) {
            return ((C13762) create(continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    @Nullable
    public static final <R> Object withInfiniteAnimationFrameMillis(@NotNull Function1<? super Long, ? extends R> function1, @NotNull Continuation continuation) {
        return withInfiniteAnimationFrameNanos(new AnonymousClass2(function1), continuation);
    }

    private static final <R> Object withInfiniteAnimationFrameMillis$$forInline(Function1<? super Long, ? extends R> function1, Continuation continuation) {
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(function1);
        z.c(0);
        Object objWithInfiniteAnimationFrameNanos = withInfiniteAnimationFrameNanos(anonymousClass2, continuation);
        z.c(1);
        return objWithInfiniteAnimationFrameNanos;
    }

    @Nullable
    public static final <R> Object withInfiniteAnimationFrameNanos(@NotNull Function1<? super Long, ? extends R> function1, @NotNull Continuation continuation) {
        InfiniteAnimationPolicy infiniteAnimationPolicy = (InfiniteAnimationPolicy) continuation.getContext().get(InfiniteAnimationPolicy.INSTANCE);
        return infiniteAnimationPolicy == null ? MonotonicFrameClockKt.withFrameNanos(function1, continuation) : infiniteAnimationPolicy.onInfiniteOperation(new C13762(function1, null), continuation);
    }
}
