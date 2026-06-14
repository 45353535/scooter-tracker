package androidx.room;

import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\b\u0003\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u0001H\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "R", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.e(c = "androidx.room.CoroutinesRoom$Companion$execute$2", f = "CoroutinesRoom.android.kt", l = {}, m = "invokeSuspend")
final class CoroutinesRoom$Companion$execute$2 extends kotlin.coroutines.jvm.internal.k implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ Callable<R> $callable;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CoroutinesRoom$Companion$execute$2(Callable<R> callable, Continuation continuation) {
        super(2, continuation);
        this.$callable = callable;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new CoroutinesRoom$Companion$execute$2(this.$callable, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.d.b(obj);
        return this.$callable.call();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((CoroutinesRoom$Companion$execute$2) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
