package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "androidx.datastore.core.SingleProcessCoordinator$updateNotifications$1", f = "SingleProcessCoordinator.kt", l = {}, m = "invokeSuspend")
final class SingleProcessCoordinator$updateNotifications$1 extends k implements Function2<FlowCollector, Continuation, Object> {
    int label;

    SingleProcessCoordinator$updateNotifications$1(Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        return new SingleProcessCoordinator$updateNotifications$1(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        b.g();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        d.b(obj);
        return Unit.f93236a;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull FlowCollector flowCollector, @Nullable Continuation continuation) {
        return ((SingleProcessCoordinator$updateNotifications$1) create(flowCollector, continuation)).invokeSuspend(Unit.f93236a);
    }
}
