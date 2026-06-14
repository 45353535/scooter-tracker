package androidx.room;

import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.e(c = "androidx.room.CoroutinesRoom$Companion$execute$4$job$1", f = "CoroutinesRoom.android.kt", l = {}, m = "invokeSuspend")
final class CoroutinesRoom$Companion$execute$4$job$1 extends kotlin.coroutines.jvm.internal.k implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ Callable<R> $callable;
    final /* synthetic */ CancellableContinuation $continuation;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CoroutinesRoom$Companion$execute$4$job$1(Callable<R> callable, CancellableContinuation cancellableContinuation, Continuation continuation) {
        super(2, continuation);
        this.$callable = callable;
        this.$continuation = cancellableContinuation;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new CoroutinesRoom$Companion$execute$4$job$1(this.$callable, this.$continuation, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.d.b(obj);
        try {
            this.$continuation.resumeWith(Result.b(this.$callable.call()));
        } catch (Throwable th2) {
            CancellableContinuation cancellableContinuation = this.$continuation;
            Result.Companion companion = Result.f93230c;
            cancellableContinuation.resumeWith(Result.b(kotlin.d.a(th2)));
        }
        return Unit.f93236a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((CoroutinesRoom$Companion$execute$4$job$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
