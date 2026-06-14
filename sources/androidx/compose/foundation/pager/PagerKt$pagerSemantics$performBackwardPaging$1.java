package androidx.compose.foundation.pager;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "androidx.compose.foundation.pager.PagerKt$pagerSemantics$performBackwardPaging$1", f = "Pager.kt", l = {755}, m = "invokeSuspend")
final class PagerKt$pagerSemantics$performBackwardPaging$1 extends k implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ PagerState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PagerKt$pagerSemantics$performBackwardPaging$1(PagerState pagerState, Continuation continuation) {
        super(2, continuation);
        this.$state = pagerState;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        return new PagerKt$pagerSemantics$performBackwardPaging$1(this.$state, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objG = b.g();
        int i10 = this.label;
        if (i10 == 0) {
            d.b(obj);
            PagerState pagerState = this.$state;
            this.label = 1;
            if (PagerStateKt.animateToPreviousPage(pagerState, this) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b(obj);
        }
        return Unit.f93236a;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((PagerKt$pagerSemantics$performBackwardPaging$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
