package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.State;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ?\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\"\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\fR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u001b\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollDraggableState;", "Landroidx/compose/foundation/gestures/DraggableState;", "Landroidx/compose/foundation/gestures/DragScope;", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "scrollLogic", "<init>", "(Landroidx/compose/runtime/State;)V", "", "pixels", "", "dragBy", "(F)V", "Landroidx/compose/foundation/MutatePriority;", "dragPriority", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "block", "drag", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delta", "dispatchRawDelta", "Landroidx/compose/runtime/State;", "getScrollLogic", "()Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/gestures/ScrollScope;", "latestScrollScope", "Landroidx/compose/foundation/gestures/ScrollScope;", "getLatestScrollScope", "()Landroidx/compose/foundation/gestures/ScrollScope;", "setLatestScrollScope", "(Landroidx/compose/foundation/gestures/ScrollScope;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class ScrollDraggableState implements DraggableState, DragScope {

    @NotNull
    private ScrollScope latestScrollScope;

    @NotNull
    private final State<ScrollingLogic> scrollLogic;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ScrollDraggableState$drag$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/ScrollScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.ScrollDraggableState$drag$2", f = "Scrollable.kt", l = {476}, m = "invokeSuspend")
    static final class AnonymousClass2 extends k implements Function2<ScrollScope, Continuation, Object> {
        final /* synthetic */ Function2<DragScope, Continuation, Object> $block;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Function2<? super DragScope, ? super Continuation, ? extends Object> function2, Continuation continuation) {
            super(2, continuation);
            this.$block = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            AnonymousClass2 anonymousClass2 = ScrollDraggableState.this.new AnonymousClass2(this.$block, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull ScrollScope scrollScope, @Nullable Continuation continuation) {
            return ((AnonymousClass2) create(scrollScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.d.b(obj);
                ScrollDraggableState.this.setLatestScrollScope((ScrollScope) this.L$0);
                Function2<DragScope, Continuation, Object> function2 = this.$block;
                ScrollDraggableState scrollDraggableState = ScrollDraggableState.this;
                this.label = 1;
                if (function2.invoke(scrollDraggableState, this) == objG) {
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
    }

    public ScrollDraggableState(@NotNull State<ScrollingLogic> scrollLogic) {
        Intrinsics.checkNotNullParameter(scrollLogic, "scrollLogic");
        this.scrollLogic = scrollLogic;
        this.latestScrollScope = ScrollableKt.NoOpScrollScope;
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public void dispatchRawDelta(float delta) {
        ScrollingLogic value = this.scrollLogic.getValue();
        value.m321performRawScrollMKHz9U(value.m327toOffsettuRUvjQ(delta));
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    @Nullable
    public Object drag(@NotNull MutatePriority mutatePriority, @NotNull Function2<? super DragScope, ? super Continuation, ? extends Object> function2, @NotNull Continuation continuation) {
        Object objScroll = this.scrollLogic.getValue().getScrollableState().scroll(mutatePriority, new AnonymousClass2(function2, null), continuation);
        return objScroll == pf.b.g() ? objScroll : Unit.f93236a;
    }

    @Override // androidx.compose.foundation.gestures.DragScope
    public void dragBy(float pixels) {
        ScrollingLogic value = this.scrollLogic.getValue();
        value.m318dispatchScroll3eAAhYA(this.latestScrollScope, value.m327toOffsettuRUvjQ(pixels), NestedScrollSource.INSTANCE.m2818getDragWNlRxjI());
    }

    @NotNull
    public final ScrollScope getLatestScrollScope() {
        return this.latestScrollScope;
    }

    @NotNull
    public final State<ScrollingLogic> getScrollLogic() {
        return this.scrollLogic;
    }

    public final void setLatestScrollScope(@NotNull ScrollScope scrollScope) {
        Intrinsics.checkNotNullParameter(scrollScope, "<set-?>");
        this.latestScrollScope = scrollScope;
    }
}
