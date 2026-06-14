package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$1$1", f = "Recomposer.kt", l = {}, m = "invokeSuspend")
final class Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$1$1 extends k implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ ControlledComposition $composition;
    int label;
    final /* synthetic */ Recomposer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$1$1(Recomposer recomposer, ControlledComposition controlledComposition, Continuation continuation) {
        super(2, continuation);
        this.this$0 = recomposer;
        this.$composition = controlledComposition;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        return new Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$1$1(this.this$0, this.$composition, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        CancellableContinuation cancellableContinuationDeriveStateLocked;
        pf.b.g();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.d.b(obj);
        ControlledComposition controlledCompositionPerformRecompose = this.this$0.performRecompose(this.$composition, null);
        Object obj2 = this.this$0.stateLock;
        Recomposer recomposer = this.this$0;
        synchronized (obj2) {
            if (controlledCompositionPerformRecompose != null) {
                try {
                    recomposer.compositionsAwaitingApply.add(controlledCompositionPerformRecompose);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            recomposer.concurrentCompositionsOutstanding--;
            cancellableContinuationDeriveStateLocked = recomposer.deriveStateLocked();
        }
        if (cancellableContinuationDeriveStateLocked != null) {
            Result.Companion companion = Result.f93230c;
            cancellableContinuationDeriveStateLocked.resumeWith(Result.b(Unit.f93236a));
        }
        return Unit.f93236a;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
