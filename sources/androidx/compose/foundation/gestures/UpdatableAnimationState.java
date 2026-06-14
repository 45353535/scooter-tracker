package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VectorizedSpringSpec;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\n\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0086@ø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/gestures/UpdatableAnimationState;", "", "<init>", "()V", "Lkotlin/Function1;", "", "", "beforeFrame", "Lkotlin/Function0;", "afterFrame", "animateToZero", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "lastFrameTime", "J", "Landroidx/compose/animation/core/AnimationVector1D;", "lastVelocity", "Landroidx/compose/animation/core/AnimationVector1D;", "", "isRunning", "Z", "value", "F", "getValue", "()F", "setValue", "(F)V", y.f66058y, "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class UpdatableAnimationState {

    @Deprecated
    public static final float VisibilityThreshold = 0.01f;
    private boolean isRunning;
    private long lastFrameTime = Long.MIN_VALUE;

    @NotNull
    private AnimationVector1D lastVelocity = ZeroVector;
    private float value;

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    @NotNull
    private static final AnimationVector1D ZeroVector = new AnimationVector1D(0.0f);

    @Deprecated
    @NotNull
    private static final VectorizedSpringSpec<AnimationVector1D> RebasableAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null).vectorize((TwoWayConverter) VectorConvertersKt.getVectorConverter(u.f93332a));

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\r\u001a\u00020\u000e*\u00020\tR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Landroidx/compose/foundation/gestures/UpdatableAnimationState$Companion;", "", "()V", "RebasableAnimationSpec", "Landroidx/compose/animation/core/VectorizedSpringSpec;", "Landroidx/compose/animation/core/AnimationVector1D;", "getRebasableAnimationSpec", "()Landroidx/compose/animation/core/VectorizedSpringSpec;", "VisibilityThreshold", "", "ZeroVector", "getZeroVector", "()Landroidx/compose/animation/core/AnimationVector1D;", "isZeroish", "", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final VectorizedSpringSpec<AnimationVector1D> getRebasableAnimationSpec() {
            return UpdatableAnimationState.RebasableAnimationSpec;
        }

        @NotNull
        public final AnimationVector1D getZeroVector() {
            return UpdatableAnimationState.ZeroVector;
        }

        public final boolean isZeroish(float f10) {
            return Math.abs(f10) < 0.01f;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.UpdatableAnimationState", f = "UpdatableAnimationState.kt", l = {100, POBCoreNativeConstants.POB_NATIVE_MAIN_IMG_H}, m = "animateToZero")
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
        float F$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UpdatableAnimationState.this.animateToZero(null, null, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ce, code lost:
    
        if (androidx.compose.runtime.MonotonicFrameClockKt.withFrameNanos(r0, r2) == r1) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082 A[Catch: all -> 0x00ae, PHI: r0 r2 r12 r13 r14
  0x0082: PHI (r0v9 ??) = (r0v3 ??), (r0v15 ??) binds: [B:30:0x007b, B:38:0x00a7] A[DONT_GENERATE, DONT_INLINE]
  0x0082: PHI (r2v4 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1) = 
  (r2v2 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1)
  (r2v5 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1)
 binds: [B:30:0x007b, B:38:0x00a7] A[DONT_GENERATE, DONT_INLINE]
  0x0082: PHI (r12v7 float) = (r12v4 float), (r12v8 float) binds: [B:30:0x007b, B:38:0x00a7] A[DONT_GENERATE, DONT_INLINE]
  0x0082: PHI (r13v7 kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit>) = 
  (r13v4 kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit>)
  (r13v8 kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit>)
 binds: [B:30:0x007b, B:38:0x00a7] A[DONT_GENERATE, DONT_INLINE]
  0x0082: PHI (r14v15 androidx.compose.foundation.gestures.UpdatableAnimationState) = 
  (r14v9 androidx.compose.foundation.gestures.UpdatableAnimationState)
  (r14v16 androidx.compose.foundation.gestures.UpdatableAnimationState)
 binds: [B:30:0x007b, B:38:0x00a7] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #2 {all -> 0x00ae, blocks: (B:36:0x00a2, B:31:0x0082, B:33:0x008c), top: B:59:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c A[Catch: all -> 0x00ae, TryCatch #2 {all -> 0x00ae, blocks: (B:36:0x00a2, B:31:0x0082, B:33:0x008c), top: B:59:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a9 A[PHI: r0 r2 r13 r14
  0x00a9: PHI (r0v4 ??) = (r0v16 ??), (r0v17 ??) binds: [B:32:0x008a, B:38:0x00a7] A[DONT_GENERATE, DONT_INLINE]
  0x00a9: PHI (r2v3 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1) = 
  (r2v4 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1)
  (r2v5 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1)
 binds: [B:32:0x008a, B:38:0x00a7] A[DONT_GENERATE, DONT_INLINE]
  0x00a9: PHI (r13v5 kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit>) = 
  (r13v7 kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit>)
  (r13v8 kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit>)
 binds: [B:32:0x008a, B:38:0x00a7] A[DONT_GENERATE, DONT_INLINE]
  0x00a9: PHI (r14v11 androidx.compose.foundation.gestures.UpdatableAnimationState) = 
  (r14v15 androidx.compose.foundation.gestures.UpdatableAnimationState)
  (r14v16 androidx.compose.foundation.gestures.UpdatableAnimationState)
 binds: [B:32:0x008a, B:38:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v10, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v12, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.jvm.functions.Function0<kotlin.Unit>] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10, types: [androidx.compose.foundation.gestures.UpdatableAnimationState] */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v2, types: [androidx.compose.foundation.gestures.UpdatableAnimationState] */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x009f -> B:59:0x00a2). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object animateToZero(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> r12, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r13, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.UpdatableAnimationState.animateToZero(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final float getValue() {
        return this.value;
    }

    public final void setValue(float f10) {
        this.value = f10;
    }
}
