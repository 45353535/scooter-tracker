package androidx.compose.foundation;

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

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "androidx.compose.foundation.BasicMarqueeKt$basicMarquee$2$1$1", f = "BasicMarquee.kt", l = {174}, m = "invokeSuspend")
final class BasicMarqueeKt$basicMarquee$2$1$1 extends k implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ MarqueeModifier $modifier;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BasicMarqueeKt$basicMarquee$2$1$1(MarqueeModifier marqueeModifier, Continuation continuation) {
        super(2, continuation);
        this.$modifier = marqueeModifier;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        return new BasicMarqueeKt$basicMarquee$2$1$1(this.$modifier, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objG = pf.b.g();
        int i10 = this.label;
        if (i10 == 0) {
            d.b(obj);
            MarqueeModifier marqueeModifier = this.$modifier;
            this.label = 1;
            if (marqueeModifier.runAnimation(this) == objG) {
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
        return ((BasicMarqueeKt$basicMarquee$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
