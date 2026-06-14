package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import bg.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001ak\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\u0011*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f0\u000eH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a'\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a*\u0010\u001a\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u0017*\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0082\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a*\u0010\u001c\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u0017*\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0082\u0002¢\u0006\u0004\b\u001c\u0010\u001b\u001aa\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\u0011*\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00062\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\u001e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060 2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f0\u000eH\u0082@ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001ai\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\u0011*\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00062\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\u001e2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060%2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f0\u000eH\u0082@ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001a\u001b\u0010*\u001a\u00020\u0006*\u00020\u00062\u0006\u0010)\u001a\u00020\u0006H\u0002¢\u0006\u0004\b*\u0010+\u001a\u001e\u0010/\u001a\u00020\u000f2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,H\u0082\b¢\u0006\u0004\b/\u00100\"\u001d\u00102\u001a\u0002018\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0014\u00106\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b6\u00103\"\u0014\u00107\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b7\u00103\"\u0014\u00109\u001a\u0002088\u0002X\u0082T¢\u0006\u0006\n\u0004\b9\u0010:\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006;"}, d2 = {"Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "snapLayoutInfoProvider", "Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;", "rememberSnapFlingBehavior", "(Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;", "Landroidx/compose/foundation/gestures/ScrollScope;", "", "initialTargetOffset", "initialVelocity", "Landroidx/compose/foundation/gestures/snapping/ApproachAnimation;", "Landroidx/compose/animation/core/AnimationVector1D;", "animation", "Landroidx/compose/ui/unit/Density;", "density", "Lkotlin/Function1;", "", "onAnimationStep", "Landroidx/compose/foundation/gestures/snapping/AnimationResult;", "approach", "(Landroidx/compose/foundation/gestures/ScrollScope;FFLandroidx/compose/foundation/gestures/snapping/ApproachAnimation;Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;Landroidx/compose/ui/unit/Density;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "velocity", "findClosestOffset", "(FLandroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;Landroidx/compose/ui/unit/Density;)F", "", "T", "Lbg/b;", "component1", "(Lbg/b;)Ljava/lang/Comparable;", "component2", "targetOffset", "Landroidx/compose/animation/core/AnimationState;", "animationState", "Landroidx/compose/animation/core/DecayAnimationSpec;", "decayAnimationSpec", "animateDecay", "(Landroidx/compose/foundation/gestures/ScrollScope;FLandroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/DecayAnimationSpec;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelOffset", "Landroidx/compose/animation/core/AnimationSpec;", "snapAnimationSpec", "animateSnap", "(Landroidx/compose/foundation/gestures/ScrollScope;FFLandroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", TypedValues.AttributesType.S_TARGET, "coerceToTarget", "(FF)F", "Lkotlin/Function0;", "", "generateMsg", "debugLog", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/unit/Dp;", "MinFlingVelocityDp", "F", "getMinFlingVelocityDp", "()F", "NoDistance", "NoVelocity", "", "DEBUG", "Z", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SnapFlingBehaviorKt {
    private static final boolean DEBUG = false;
    private static final float MinFlingVelocityDp = Dp.m3951constructorimpl(400);
    public static final float NoDistance = 0.0f;
    public static final float NoVelocity = 0.0f;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", f = "SnapFlingBehavior.kt", l = {406}, m = "animateDecay")
    static final class AnonymousClass1 extends d {
        float F$0;
        Object L$0;
        Object L$1;
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
            return SnapFlingBehaviorKt.animateDecay(null, 0.0f, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateSnap$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", f = "SnapFlingBehavior.kt", l = {451}, m = "animateSnap")
    static final class C14271 extends d {
        float F$0;
        float F$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C14271(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SnapFlingBehaviorKt.animateSnap(null, 0.0f, 0.0f, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$approach$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", f = "SnapFlingBehavior.kt", l = {311}, m = "approach")
    static final class C14291 extends d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C14291(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SnapFlingBehaviorKt.approach(null, 0.0f, 0.0f, null, null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object animateDecay(final androidx.compose.foundation.gestures.ScrollScope r5, final float r6, androidx.compose.animation.core.AnimationState<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r7, androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> r8, final kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> r9, kotlin.coroutines.Continuation r10) {
        /*
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1 r0 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1 r0 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            float r6 = r0.F$0
            java.lang.Object r5 = r0.L$1
            kotlin.jvm.internal.s0 r5 = (kotlin.jvm.internal.s0) r5
            java.lang.Object r7 = r0.L$0
            androidx.compose.animation.core.AnimationState r7 = (androidx.compose.animation.core.AnimationState) r7
            kotlin.d.b(r10)
            goto L6b
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            kotlin.d.b(r10)
            kotlin.jvm.internal.s0 r10 = new kotlin.jvm.internal.s0
            r10.<init>()
            java.lang.Object r2 = r7.getVelocity()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L54
            r2 = r3
            goto L55
        L54:
            r2 = 0
        L55:
            r2 = r2 ^ r3
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$2 r4 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$2
            r4.<init>()
            r0.L$0 = r7
            r0.L$1 = r10
            r0.F$0 = r6
            r0.label = r3
            java.lang.Object r5 = androidx.compose.animation.core.SuspendAnimationKt.animateDecay(r7, r8, r2, r4, r0)
            if (r5 != r1) goto L6a
            return r1
        L6a:
            r5 = r10
        L6b:
            androidx.compose.foundation.gestures.snapping.AnimationResult r8 = new androidx.compose.foundation.gestures.snapping.AnimationResult
            float r5 = r5.f93329b
            float r6 = r6 - r5
            java.lang.Float r5 = kotlin.coroutines.jvm.internal.b.c(r6)
            r8.<init>(r5, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.animateDecay(androidx.compose.foundation.gestures.ScrollScope, float, androidx.compose.animation.core.AnimationState, androidx.compose.animation.core.DecayAnimationSpec, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateDecay$consumeDelta(AnimationScope<Float, AnimationVector1D> animationScope, ScrollScope scrollScope, Function1<? super Float, Unit> function1, float f10) {
        float fScrollBy = scrollScope.scrollBy(f10);
        function1.invoke(Float.valueOf(fScrollBy));
        if (Math.abs(f10 - fScrollBy) > 0.5f) {
            animationScope.cancelAnimation();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object animateSnap(final androidx.compose.foundation.gestures.ScrollScope r20, float r21, final float r22, androidx.compose.animation.core.AnimationState<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r23, androidx.compose.animation.core.AnimationSpec<java.lang.Float> r24, final kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> r25, kotlin.coroutines.Continuation r26) {
        /*
            r0 = r26
            boolean r1 = r0 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.C14271
            if (r1 == 0) goto L16
            r1 = r0
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateSnap$1 r1 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.C14271) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.label = r2
        L14:
            r7 = r1
            goto L1c
        L16:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateSnap$1 r1 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateSnap$1
            r1.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r7.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r7.label
            r3 = 1
            if (r2 == 0) goto L43
            if (r2 != r3) goto L3b
            float r1 = r7.F$1
            float r2 = r7.F$0
            java.lang.Object r3 = r7.L$1
            kotlin.jvm.internal.s0 r3 = (kotlin.jvm.internal.s0) r3
            java.lang.Object r4 = r7.L$0
            androidx.compose.animation.core.AnimationState r4 = (androidx.compose.animation.core.AnimationState) r4
            kotlin.d.b(r0)
            r9 = r2
            r10 = r4
            goto L95
        L3b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L43:
            kotlin.d.b(r0)
            kotlin.jvm.internal.s0 r0 = new kotlin.jvm.internal.s0
            r0.<init>()
            java.lang.Object r2 = r23.getVelocity()
            java.lang.Number r2 = (java.lang.Number) r2
            float r8 = r2.floatValue()
            java.lang.Float r2 = kotlin.coroutines.jvm.internal.b.c(r21)
            java.lang.Object r4 = r23.getVelocity()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 != 0) goto L6a
            r4 = r3
            goto L6b
        L6a:
            r4 = 0
        L6b:
            r5 = r4 ^ 1
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateSnap$2 r6 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateSnap$2
            r4 = r20
            r9 = r22
            r10 = r25
            r6.<init>()
            r4 = r23
            r7.L$0 = r4
            r7.L$1 = r0
            r9 = r21
            r7.F$0 = r9
            r7.F$1 = r8
            r7.label = r3
            r3 = r2
            r2 = r4
            r4 = r24
            java.lang.Object r3 = androidx.compose.animation.core.SuspendAnimationKt.animateTo(r2, r3, r4, r5, r6, r7)
            if (r3 != r1) goto L91
            return r1
        L91:
            r10 = r23
            r3 = r0
            r1 = r8
        L95:
            java.lang.Object r0 = r10.getVelocity()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            float r12 = coerceToTarget(r0, r1)
            androidx.compose.foundation.gestures.snapping.AnimationResult r0 = new androidx.compose.foundation.gestures.snapping.AnimationResult
            float r1 = r3.f93329b
            float r9 = r9 - r1
            java.lang.Float r1 = kotlin.coroutines.jvm.internal.b.c(r9)
            r18 = 29
            r19 = 0
            r11 = 0
            r13 = 0
            r15 = 0
            r17 = 0
            androidx.compose.animation.core.AnimationState r2 = androidx.compose.animation.core.AnimationStateKt.copy$default(r10, r11, r12, r13, r15, r17, r18, r19)
            r0.<init>(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.animateSnap(androidx.compose.foundation.gestures.ScrollScope, float, float, androidx.compose.animation.core.AnimationState, androidx.compose.animation.core.AnimationSpec, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object approach(androidx.compose.foundation.gestures.ScrollScope r7, float r8, float r9, androidx.compose.foundation.gestures.snapping.ApproachAnimation<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r10, androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider r11, androidx.compose.ui.unit.Density r12, kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> r13, kotlin.coroutines.Continuation r14) {
        /*
            boolean r0 = r14 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.C14291
            if (r0 == 0) goto L14
            r0 = r14
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$approach$1 r0 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.C14291) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$approach$1 r0 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$approach$1
            r0.<init>(r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.result
            java.lang.Object r0 = pf.b.g()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L3d
            if (r1 != r2) goto L35
            java.lang.Object r7 = r6.L$1
            r12 = r7
            androidx.compose.ui.unit.Density r12 = (androidx.compose.ui.unit.Density) r12
            java.lang.Object r7 = r6.L$0
            r11 = r7
            androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider r11 = (androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider) r11
            kotlin.d.b(r14)
            goto L58
        L35:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3d:
            kotlin.d.b(r14)
            java.lang.Float r3 = kotlin.coroutines.jvm.internal.b.c(r8)
            java.lang.Float r4 = kotlin.coroutines.jvm.internal.b.c(r9)
            r6.L$0 = r11
            r6.L$1 = r12
            r6.label = r2
            r2 = r7
            r1 = r10
            r5 = r13
            java.lang.Object r14 = r1.approachAnimation(r2, r3, r4, r5, r6)
            if (r14 != r0) goto L58
            return r0
        L58:
            androidx.compose.foundation.gestures.snapping.AnimationResult r14 = (androidx.compose.foundation.gestures.snapping.AnimationResult) r14
            androidx.compose.animation.core.AnimationState r7 = r14.component2()
            java.lang.Object r8 = r7.getVelocity()
            java.lang.Number r8 = (java.lang.Number) r8
            float r8 = r8.floatValue()
            float r8 = findClosestOffset(r8, r11, r12)
            androidx.compose.foundation.gestures.snapping.AnimationResult r9 = new androidx.compose.foundation.gestures.snapping.AnimationResult
            java.lang.Float r8 = kotlin.coroutines.jvm.internal.b.c(r8)
            r9.<init>(r8, r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.approach(androidx.compose.foundation.gestures.ScrollScope, float, float, androidx.compose.foundation.gestures.snapping.ApproachAnimation, androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider, androidx.compose.ui.unit.Density, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float coerceToTarget(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        return f11 > 0.0f ? g.i(f10, f11) : g.d(f10, f11);
    }

    private static final <T extends Comparable<? super T>> T component1(b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return (T) bVar.getStart();
    }

    private static final <T extends Comparable<? super T>> T component2(b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return (T) bVar.getEndInclusive();
    }

    private static final void debugLog(Function0<String> function0) {
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final float findClosestOffset(float r2, @org.jetbrains.annotations.NotNull androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider r3, @org.jetbrains.annotations.NotNull androidx.compose.ui.unit.Density r4) {
        /*
            java.lang.String r0 = "snapLayoutInfoProvider"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "density"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            bg.b r3 = r3.calculateSnappingOffsetBounds(r4)
            java.lang.Comparable r4 = component1(r3)
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            java.lang.Comparable r3 = component2(r3)
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            float r2 = java.lang.Math.signum(r2)
            r0 = 0
            int r1 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r1 != 0) goto L38
            float r2 = java.lang.Math.abs(r3)
            float r1 = java.lang.Math.abs(r4)
            int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r2 > 0) goto L48
            goto L3e
        L38:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 != 0) goto L40
        L3e:
            r4 = r3
            goto L48
        L40:
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L47
            goto L48
        L47:
            r4 = r0
        L48:
            boolean r2 = findClosestOffset$isValidDistance(r4)
            if (r2 == 0) goto L4f
            return r4
        L4f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.findClosestOffset(float, androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider, androidx.compose.ui.unit.Density):float");
    }

    private static final boolean findClosestOffset$isValidDistance(float f10) {
        return (f10 == Float.POSITIVE_INFINITY || f10 == Float.NEGATIVE_INFINITY) ? false : true;
    }

    public static final float getMinFlingVelocityDp() {
        return MinFlingVelocityDp;
    }

    @Composable
    @ExperimentalFoundationApi
    @NotNull
    public static final SnapFlingBehavior rememberSnapFlingBehavior(@NotNull SnapLayoutInfoProvider snapLayoutInfoProvider, @Nullable Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(snapLayoutInfoProvider, "snapLayoutInfoProvider");
        composer.startReplaceableGroup(-473984552);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-473984552, i10, -1, "androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior (SnapFlingBehavior.kt:268)");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        DecayAnimationSpec decayAnimationSpecRememberSplineBasedDecay = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0);
        composer.startReplaceableGroup(1618982084);
        boolean zChanged = composer.changed(snapLayoutInfoProvider) | composer.changed(decayAnimationSpecRememberSplineBasedDecay) | composer.changed(density);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            Object snapFlingBehavior = new SnapFlingBehavior(snapLayoutInfoProvider, AnimationSpecKt.tween$default(0, 0, EasingKt.getLinearEasing(), 3, null), decayAnimationSpecRememberSplineBasedDecay, AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null), density, 0.0f, 32, null);
            composer.updateRememberedValue(snapFlingBehavior);
            objRememberedValue = snapFlingBehavior;
        }
        composer.endReplaceableGroup();
        SnapFlingBehavior snapFlingBehavior2 = (SnapFlingBehavior) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return snapFlingBehavior2;
    }
}
