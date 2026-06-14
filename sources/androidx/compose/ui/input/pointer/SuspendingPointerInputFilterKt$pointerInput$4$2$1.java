package androidx.compose.ui.input.pointer;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$pointerInput$4$2$1", f = "SuspendingPointerInputFilter.kt", l = {292}, m = "invokeSuspend")
final class SuspendingPointerInputFilterKt$pointerInput$4$2$1 extends k implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ Function2<PointerInputScope, Continuation, Object> $block;
    final /* synthetic */ SuspendingPointerInputFilter $filter;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SuspendingPointerInputFilterKt$pointerInput$4$2$1(SuspendingPointerInputFilter suspendingPointerInputFilter, Function2<? super PointerInputScope, ? super Continuation, ? extends Object> function2, Continuation continuation) {
        super(2, continuation);
        this.$filter = suspendingPointerInputFilter;
        this.$block = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        SuspendingPointerInputFilterKt$pointerInput$4$2$1 suspendingPointerInputFilterKt$pointerInput$4$2$1 = new SuspendingPointerInputFilterKt$pointerInput$4$2$1(this.$filter, this.$block, continuation);
        suspendingPointerInputFilterKt$pointerInput$4$2$1.L$0 = obj;
        return suspendingPointerInputFilterKt$pointerInput$4$2$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objG = pf.b.g();
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.d.b(obj);
            this.$filter.setCoroutineScope((CoroutineScope) this.L$0);
            Function2<PointerInputScope, Continuation, Object> function2 = this.$block;
            SuspendingPointerInputFilter suspendingPointerInputFilter = this.$filter;
            this.label = 1;
            if (function2.invoke(suspendingPointerInputFilter, this) == objG) {
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
        return ((SuspendingPointerInputFilterKt$pointerInput$4$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
