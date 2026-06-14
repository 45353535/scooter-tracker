package androidx.compose.foundation.pager;

import androidx.compose.ui.unit.Density;
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
@e(c = "androidx.compose.foundation.pager.PagerKt$Pager$2$1", f = "Pager.kt", l = {}, m = "invokeSuspend")
final class PagerKt$Pager$2$1 extends k implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ Density $density;
    final /* synthetic */ float $pageSpacing;
    final /* synthetic */ PagerState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PagerKt$Pager$2$1(Density density, PagerState pagerState, float f10, Continuation continuation) {
        super(2, continuation);
        this.$density = density;
        this.$state = pagerState;
        this.$pageSpacing = f10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        return new PagerKt$Pager$2$1(this.$density, this.$state, this.$pageSpacing, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        b.g();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        d.b(obj);
        this.$state.setPageSpacing$foundation_release(this.$density.mo302roundToPx0680j_4(this.$pageSpacing));
        return Unit.f93236a;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((PagerKt$Pager$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
