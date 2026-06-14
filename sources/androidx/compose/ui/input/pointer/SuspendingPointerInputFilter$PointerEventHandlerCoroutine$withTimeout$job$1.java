package androidx.compose.ui.input.pointer;

import androidx.compose.ui.input.pointer.SuspendingPointerInputFilter;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1", f = "SuspendingPointerInputFilter.kt", l = {IronSourceError.ERROR_DO_BN_LOAD_DURING_SHOW, 621}, m = "invokeSuspend")
final class SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1 extends k implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ long $timeMillis;
    int label;
    final /* synthetic */ SuspendingPointerInputFilter.PointerEventHandlerCoroutine<R> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1(long j10, SuspendingPointerInputFilter.PointerEventHandlerCoroutine<R> pointerEventHandlerCoroutine, Continuation continuation) {
        super(2, continuation);
        this.$timeMillis = j10;
        this.this$0 = pointerEventHandlerCoroutine;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        return new SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1(this.$timeMillis, this.this$0, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        if (eg.k0.a(1, r8) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = pf.b.g()
            int r1 = r8.label
            r2 = 1
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L20
            if (r1 == r5) goto L1c
            if (r1 != r4) goto L14
            kotlin.d.b(r9)
            goto L38
        L14:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1c:
            kotlin.d.b(r9)
            goto L2f
        L20:
            kotlin.d.b(r9)
            long r6 = r8.$timeMillis
            long r6 = r6 - r2
            r8.label = r5
            java.lang.Object r9 = eg.k0.a(r6, r8)
            if (r9 != r0) goto L2f
            goto L37
        L2f:
            r8.label = r4
            java.lang.Object r9 = eg.k0.a(r2, r8)
            if (r9 != r0) goto L38
        L37:
            return r0
        L38:
            androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine<R> r9 = r8.this$0
            kotlinx.coroutines.CancellableContinuation r9 = androidx.compose.ui.input.pointer.SuspendingPointerInputFilter.PointerEventHandlerCoroutine.access$getPointerAwaiter$p(r9)
            if (r9 == 0) goto L54
            kotlin.Result$Companion r0 = kotlin.Result.f93230c
            androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException r0 = new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
            long r1 = r8.$timeMillis
            r0.<init>(r1)
            java.lang.Object r0 = kotlin.d.a(r0)
            java.lang.Object r0 = kotlin.Result.b(r0)
            r9.resumeWith(r0)
        L54:
            kotlin.Unit r9 = kotlin.Unit.f93236a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
