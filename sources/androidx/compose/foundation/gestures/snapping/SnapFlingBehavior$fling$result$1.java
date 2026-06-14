package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.gestures.ScrollScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/gestures/snapping/AnimationResult;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1", f = "SnapFlingBehavior.kt", l = {134, 136}, m = "invokeSuspend")
final class SnapFlingBehavior$fling$result$1 extends k implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ float $initialVelocity;
    final /* synthetic */ Function1<Float, Unit> $onRemainingScrollOffsetUpdate;
    final /* synthetic */ ScrollScope $this_fling;
    int label;
    final /* synthetic */ SnapFlingBehavior this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SnapFlingBehavior$fling$result$1(float f10, SnapFlingBehavior snapFlingBehavior, ScrollScope scrollScope, Function1<? super Float, Unit> function1, Continuation continuation) {
        super(2, continuation);
        this.$initialVelocity = f10;
        this.this$0 = snapFlingBehavior;
        this.$this_fling = scrollScope;
        this.$onRemainingScrollOffsetUpdate = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        return new SnapFlingBehavior$fling$result$1(this.$initialVelocity, this.this$0, this.$this_fling, this.$onRemainingScrollOffsetUpdate, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        if (r6 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        if (r6 == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = pf.b.g()
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.d.b(r6)
            goto L5a
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            kotlin.d.b(r6)
            goto L46
        L1e:
            kotlin.d.b(r6)
            float r6 = r5.$initialVelocity
            float r6 = java.lang.Math.abs(r6)
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior r1 = r5.this$0
            float r1 = androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.access$getVelocityThreshold$p(r1)
            float r1 = java.lang.Math.abs(r1)
            int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r6 > 0) goto L49
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior r6 = r5.this$0
            androidx.compose.foundation.gestures.ScrollScope r1 = r5.$this_fling
            float r2 = r5.$initialVelocity
            kotlin.jvm.functions.Function1<java.lang.Float, kotlin.Unit> r4 = r5.$onRemainingScrollOffsetUpdate
            r5.label = r3
            java.lang.Object r6 = androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.access$shortSnap(r6, r1, r2, r4, r5)
            if (r6 != r0) goto L46
            goto L59
        L46:
            androidx.compose.foundation.gestures.snapping.AnimationResult r6 = (androidx.compose.foundation.gestures.snapping.AnimationResult) r6
            return r6
        L49:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior r6 = r5.this$0
            androidx.compose.foundation.gestures.ScrollScope r1 = r5.$this_fling
            float r3 = r5.$initialVelocity
            kotlin.jvm.functions.Function1<java.lang.Float, kotlin.Unit> r4 = r5.$onRemainingScrollOffsetUpdate
            r5.label = r2
            java.lang.Object r6 = androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.access$longSnap(r6, r1, r3, r4, r5)
            if (r6 != r0) goto L5a
        L59:
            return r0
        L5a:
            androidx.compose.foundation.gestures.snapping.AnimationResult r6 = (androidx.compose.foundation.gestures.snapping.AnimationResult) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((SnapFlingBehavior$fling$result$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
