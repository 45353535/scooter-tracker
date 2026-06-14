package androidx.activity.compose;

import androidx.activity.FullyDrawnReporter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "androidx.activity.compose.ReportDrawnKt$ReportDrawnAfter$1$1", f = "ReportDrawn.kt", l = {182}, m = "invokeSuspend")
final class ReportDrawnKt$ReportDrawnAfter$1$1 extends k implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ Function1<Continuation, Object> $block;
    final /* synthetic */ FullyDrawnReporter $fullyDrawnReporter;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ReportDrawnKt$ReportDrawnAfter$1$1(FullyDrawnReporter fullyDrawnReporter, Function1<? super Continuation, ? extends Object> function1, Continuation continuation) {
        super(2, continuation);
        this.$fullyDrawnReporter = fullyDrawnReporter;
        this.$block = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        return new ReportDrawnKt$ReportDrawnAfter$1$1(this.$fullyDrawnReporter, this.$block, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        FullyDrawnReporter fullyDrawnReporter;
        Throwable th2;
        Object objG = b.g();
        int i10 = this.label;
        if (i10 == 0) {
            d.b(obj);
            FullyDrawnReporter fullyDrawnReporter2 = this.$fullyDrawnReporter;
            Function1<Continuation, Object> function1 = this.$block;
            fullyDrawnReporter2.addReporter();
            if (!fullyDrawnReporter2.isFullyDrawnReported()) {
                try {
                    this.L$0 = fullyDrawnReporter2;
                    this.label = 1;
                    if (function1.invoke(this) == objG) {
                        return objG;
                    }
                    fullyDrawnReporter = fullyDrawnReporter2;
                    fullyDrawnReporter.removeReporter();
                } catch (Throwable th3) {
                    fullyDrawnReporter = fullyDrawnReporter2;
                    th2 = th3;
                    fullyDrawnReporter.removeReporter();
                    throw th2;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fullyDrawnReporter = (FullyDrawnReporter) this.L$0;
            try {
                d.b(obj);
                fullyDrawnReporter.removeReporter();
            } catch (Throwable th4) {
                th2 = th4;
                fullyDrawnReporter.removeReporter();
                throw th2;
            }
        }
        return Unit.f93236a;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((ReportDrawnKt$ReportDrawnAfter$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
