package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J?\u0010\u000f\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\"\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"Landroidx/compose/foundation/gestures/DefaultScrollableState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "Lkotlin/Function1;", "", "onDelta", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/coroutines/Continuation;", "", "", "block", "scroll", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delta", "dispatchRawDelta", "(F)F", "Lkotlin/jvm/functions/Function1;", "getOnDelta", "()Lkotlin/jvm/functions/Function1;", "scrollScope", "Landroidx/compose/foundation/gestures/ScrollScope;", "Landroidx/compose/foundation/MutatorMutex;", "scrollMutex", "Landroidx/compose/foundation/MutatorMutex;", "Landroidx/compose/runtime/MutableState;", "", "isScrollingState", "Landroidx/compose/runtime/MutableState;", "isScrollInProgress", "()Z", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class DefaultScrollableState implements ScrollableState {

    @NotNull
    private final MutableState<Boolean> isScrollingState;

    @NotNull
    private final Function1<Float, Float> onDelta;

    @NotNull
    private final MutatorMutex scrollMutex;

    @NotNull
    private final ScrollScope scrollScope;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2", f = "ScrollableState.kt", l = {175}, m = "invokeSuspend")
    static final class AnonymousClass2 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Function2<ScrollScope, Continuation, Object> $block;
        final /* synthetic */ MutatePriority $scrollPriority;
        int label;

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/ScrollScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1", f = "ScrollableState.kt", l = {178}, m = "invokeSuspend")
        static final class AnonymousClass1 extends k implements Function2<ScrollScope, Continuation, Object> {
            final /* synthetic */ Function2<ScrollScope, Continuation, Object> $block;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ DefaultScrollableState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(DefaultScrollableState defaultScrollableState, Function2<? super ScrollScope, ? super Continuation, ? extends Object> function2, Continuation continuation) {
                super(2, continuation);
                this.this$0 = defaultScrollableState;
                this.$block = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$block, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull ScrollScope scrollScope, @Nullable Continuation continuation) {
                return ((AnonymousClass1) create(scrollScope, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objG = pf.b.g();
                int i10 = this.label;
                try {
                    if (i10 == 0) {
                        kotlin.d.b(obj);
                        ScrollScope scrollScope = (ScrollScope) this.L$0;
                        this.this$0.isScrollingState.setValue(kotlin.coroutines.jvm.internal.b.a(true));
                        Function2<ScrollScope, Continuation, Object> function2 = this.$block;
                        this.label = 1;
                        if (function2.invoke(scrollScope, this) == objG) {
                            return objG;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.d.b(obj);
                    }
                    this.this$0.isScrollingState.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                    return Unit.f93236a;
                } catch (Throwable th2) {
                    this.this$0.isScrollingState.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                    throw th2;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(MutatePriority mutatePriority, Function2<? super ScrollScope, ? super Continuation, ? extends Object> function2, Continuation continuation) {
            super(2, continuation);
            this.$scrollPriority = mutatePriority;
            this.$block = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return DefaultScrollableState.this.new AnonymousClass2(this.$scrollPriority, this.$block, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.d.b(obj);
                MutatorMutex mutatorMutex = DefaultScrollableState.this.scrollMutex;
                ScrollScope scrollScope = DefaultScrollableState.this.scrollScope;
                MutatePriority mutatePriority = this.$scrollPriority;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(DefaultScrollableState.this, this.$block, null);
                this.label = 1;
                if (mutatorMutex.mutateWith(scrollScope, mutatePriority, anonymousClass1, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultScrollableState(@NotNull Function1<? super Float, Float> onDelta) {
        Intrinsics.checkNotNullParameter(onDelta, "onDelta");
        this.onDelta = onDelta;
        this.scrollScope = new ScrollScope() { // from class: androidx.compose.foundation.gestures.DefaultScrollableState$scrollScope$1
            @Override // androidx.compose.foundation.gestures.ScrollScope
            public float scrollBy(float pixels) {
                return this.this$0.getOnDelta().invoke(Float.valueOf(pixels)).floatValue();
            }
        };
        this.scrollMutex = new MutatorMutex();
        this.isScrollingState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float delta) {
        return this.onDelta.invoke(Float.valueOf(delta)).floatValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public /* synthetic */ boolean getCanScrollBackward() {
        return c.a(this);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public /* synthetic */ boolean getCanScrollForward() {
        return c.b(this);
    }

    @NotNull
    public final Function1<Float, Float> getOnDelta() {
        return this.onDelta;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.isScrollingState.getValue().booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    @Nullable
    public Object scroll(@NotNull MutatePriority mutatePriority, @NotNull Function2<? super ScrollScope, ? super Continuation, ? extends Object> function2, @NotNull Continuation continuation) {
        Object objG = i.g(new AnonymousClass2(mutatePriority, function2, null), continuation);
        return objG == pf.b.g() ? objG : Unit.f93236a;
    }
}
