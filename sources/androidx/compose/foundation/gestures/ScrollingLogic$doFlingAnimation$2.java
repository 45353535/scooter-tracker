package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.u0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/ScrollScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", f = "Scrollable.kt", l = {442}, m = "invokeSuspend")
final class ScrollingLogic$doFlingAnimation$2 extends k implements Function2<ScrollScope, Continuation, Object> {
    final /* synthetic */ long $available;
    final /* synthetic */ u0 $result;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ScrollingLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollingLogic$doFlingAnimation$2(ScrollingLogic scrollingLogic, u0 u0Var, long j10, Continuation continuation) {
        super(2, continuation);
        this.this$0 = scrollingLogic;
        this.$result = u0Var;
        this.$available = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        ScrollingLogic$doFlingAnimation$2 scrollingLogic$doFlingAnimation$2 = new ScrollingLogic$doFlingAnimation$2(this.this$0, this.$result, this.$available, continuation);
        scrollingLogic$doFlingAnimation$2.L$0 = obj;
        return scrollingLogic$doFlingAnimation$2;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull ScrollScope scrollScope, @Nullable Continuation continuation) {
        return ((ScrollingLogic$doFlingAnimation$2) create(scrollScope, continuation)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        ScrollingLogic scrollingLogic;
        u0 u0Var;
        ScrollingLogic scrollingLogic2;
        long j10;
        Object objG = pf.b.g();
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.d.b(obj);
            final ScrollScope scrollScope = (ScrollScope) this.L$0;
            final ScrollingLogic scrollingLogic3 = this.this$0;
            final Function1<Offset, Offset> function1 = new Function1<Offset, Offset>() { // from class: androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2$outerScopeScroll$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Offset invoke(Offset offset) {
                    return Offset.m1360boximpl(m330invokeMKHz9U(offset.getPackedValue()));
                }

                /* JADX INFO: renamed from: invoke-MK-Hz9U, reason: not valid java name */
                public final long m330invokeMKHz9U(long j11) {
                    ScrollingLogic scrollingLogic4 = scrollingLogic3;
                    return scrollingLogic4.m322reverseIfNeededMKHz9U(scrollingLogic4.m318dispatchScroll3eAAhYA(scrollScope, scrollingLogic4.m322reverseIfNeededMKHz9U(j11), NestedScrollSource.INSTANCE.m2819getFlingWNlRxjI()));
                }
            };
            final ScrollingLogic scrollingLogic4 = this.this$0;
            ScrollScope scrollScope2 = new ScrollScope() { // from class: androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2$scope$1
                @Override // androidx.compose.foundation.gestures.ScrollScope
                public float scrollBy(float pixels) {
                    ScrollingLogic scrollingLogic5 = scrollingLogic4;
                    return scrollingLogic5.m326toFloatk4lQ0M(function1.invoke(Offset.m1360boximpl(scrollingLogic5.m327toOffsettuRUvjQ(pixels))).getPackedValue());
                }
            };
            scrollingLogic = this.this$0;
            u0 u0Var2 = this.$result;
            long j11 = this.$available;
            FlingBehavior flingBehavior = scrollingLogic.getFlingBehavior();
            long j12 = u0Var2.f93333b;
            float fReverseIfNeeded = scrollingLogic.reverseIfNeeded(scrollingLogic.m325toFloatTH1AsA0(j11));
            this.L$0 = scrollingLogic;
            this.L$1 = scrollingLogic;
            this.L$2 = u0Var2;
            this.J$0 = j12;
            this.label = 1;
            obj = flingBehavior.performFling(scrollScope2, fReverseIfNeeded, this);
            if (obj == objG) {
                return objG;
            }
            u0Var = u0Var2;
            scrollingLogic2 = scrollingLogic;
            j10 = j12;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j10 = this.J$0;
            u0Var = (u0) this.L$2;
            scrollingLogic = (ScrollingLogic) this.L$1;
            scrollingLogic2 = (ScrollingLogic) this.L$0;
            kotlin.d.b(obj);
        }
        u0Var.f93333b = scrollingLogic.m328updateQWom1Mo(j10, scrollingLogic2.reverseIfNeeded(((Number) obj).floatValue()));
        return Unit.f93236a;
    }
}
