package androidx.work;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.e(c = "androidx.work.ListenableFutureKt$launchFuture$1$2", f = "ListenableFuture.kt", l = {42}, m = "invokeSuspend")
final class ListenableFutureKt$launchFuture$1$2 extends kotlin.coroutines.jvm.internal.k implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ Function2<CoroutineScope, Continuation, Object> $block;
    final /* synthetic */ CallbackToFutureAdapter.Completer<T> $completer;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ListenableFutureKt$launchFuture$1$2(Function2<? super CoroutineScope, ? super Continuation, ? extends Object> function2, CallbackToFutureAdapter.Completer<T> completer, Continuation continuation) {
        super(2, continuation);
        this.$block = function2;
        this.$completer = completer;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        ListenableFutureKt$launchFuture$1$2 listenableFutureKt$launchFuture$1$2 = new ListenableFutureKt$launchFuture$1$2(this.$block, this.$completer, continuation);
        listenableFutureKt$launchFuture$1$2.L$0 = obj;
        return listenableFutureKt$launchFuture$1$2;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.label;
        try {
            if (i10 == 0) {
                kotlin.d.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                Function2<CoroutineScope, Continuation, Object> function2 = this.$block;
                this.label = 1;
                obj = function2.invoke(coroutineScope, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            this.$completer.set((T) obj);
        } catch (CancellationException unused) {
            this.$completer.setCancelled();
        } catch (Throwable th2) {
            this.$completer.setException(th2);
        }
        return Unit.f93236a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((ListenableFutureKt$launchFuture$1$2) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
