package androidx.activity.compose;

import hg.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "androidx.activity.compose.OnBackInstance$job$1", f = "PredictiveBackHandler.kt", l = {160}, m = "invokeSuspend")
final class OnBackInstance$job$1 extends k implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ Function2<Flow, Continuation, Object> $onBack;
    Object L$0;
    int label;
    final /* synthetic */ OnBackInstance this$0;

    /* JADX INFO: renamed from: androidx.activity.compose.OnBackInstance$job$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Landroidx/activity/BackEventCompat;", "it", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.activity.compose.OnBackInstance$job$1$1", f = "PredictiveBackHandler.kt", l = {}, m = "invokeSuspend")
    static final class AnonymousClass1 extends k implements Function3<FlowCollector, Throwable, Continuation, Object> {
        final /* synthetic */ Ref$BooleanRef $completed;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Ref$BooleanRef ref$BooleanRef, Continuation continuation) {
            super(3, continuation);
            this.$completed = ref$BooleanRef;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            b.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b(obj);
            this.$completed.f93279b = true;
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        public final Object invoke(@NotNull FlowCollector flowCollector, @Nullable Throwable th2, @Nullable Continuation continuation) {
            return new AnonymousClass1(this.$completed, continuation).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    OnBackInstance$job$1(Function2<? super Flow, ? super Continuation, ? extends Object> function2, OnBackInstance onBackInstance, Continuation continuation) {
        super(2, continuation);
        this.$onBack = function2;
        this.this$0 = onBackInstance;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        return new OnBackInstance$job$1(this.$onBack, this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Ref$BooleanRef ref$BooleanRef;
        Object objG = b.g();
        int i10 = this.label;
        if (i10 == 0) {
            d.b(obj);
            Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
            Function2<Flow, Continuation, Object> function2 = this.$onBack;
            Flow flowJ = i.J(i.o(this.this$0.getChannel()), new AnonymousClass1(ref$BooleanRef2, null));
            this.L$0 = ref$BooleanRef2;
            this.label = 1;
            if (function2.invoke(flowJ, this) == objG) {
                return objG;
            }
            ref$BooleanRef = ref$BooleanRef2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ref$BooleanRef = (Ref$BooleanRef) this.L$0;
            d.b(obj);
        }
        if (ref$BooleanRef.f93279b) {
            return Unit.f93236a;
        }
        throw new IllegalStateException("You must collect the progress flow");
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((OnBackInstance$job$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
