package androidx.compose.animation.core;

import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.ui.MotionDurationScale;
import androidx.exifinterface.media.ExifInterface;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aW\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00042\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001aE\u0010\f\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u000b2\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a}\u0010\t\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u000e\"\b\b\u0001\u0010\u0010*\u00020\u000f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00112\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0013\u001aw\u0010\u0019\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u000e\"\b\b\u0001\u0010\u0010*\u00020\u000f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00142\u0006\u0010\u0002\u001a\u00028\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00152 \b\u0002\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0018\u0012\u0004\u0012\u00020\u00070\u0017H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001am\u0010\f\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u000e\"\b\b\u0001\u0010\u0010*\u00020\u000f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00142\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b2\b\b\u0002\u0010\u0016\u001a\u00020\u00152 \b\u0002\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0018\u0012\u0004\u0012\u00020\u00070\u0017H\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u001c\u001as\u0010\t\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u000e\"\b\b\u0001\u0010\u0010*\u00020\u000f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00142\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2 \b\u0002\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0018\u0012\u0004\u0012\u00020\u00070\u0017H\u0080@ø\u0001\u0000¢\u0006\u0004\b\t\u0010!\u001aM\u0010$\u001a\u00028\u0000\"\u0004\b\u0000\u0010\"\"\u0004\b\u0001\u0010\u000e\"\b\b\u0002\u0010\u0010*\u00020\u000f*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u001d2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00028\u00000\u0017H\u0082@ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001aC\u0010'\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u000e\"\b\b\u0001\u0010\u0010*\u00020\u000f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00182\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014H\u0000¢\u0006\u0004\b'\u0010(\u001a\u0087\u0001\u0010,\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u000e\"\b\b\u0001\u0010\u0010*\u00020\u000f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00182\u0006\u0010)\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020\u00002\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00142\u001e\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0018\u0012\u0004\u0012\u00020\u00070\u0017H\u0002¢\u0006\u0004\b,\u0010-\u001a\u0087\u0001\u0010/\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u000e\"\b\b\u0001\u0010\u0010*\u00020\u000f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00182\u0006\u0010)\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020\u001f2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00142\u001e\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0018\u0012\u0004\u0012\u00020\u00070\u0017H\u0002¢\u0006\u0004\b/\u00100\"\u0018\u0010*\u001a\u00020\u0000*\u0002018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b2\u00103\u0082\u0002\u0004\n\u0002\b\u0019¨\u00064"}, d2 = {"", "initialValue", "targetValue", "initialVelocity", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "Lkotlin/Function2;", "", "block", "animate", "(FFFLandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "animateDecay", "(FFLandroidx/compose/animation/core/FloatDecayAnimationSpec;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T", "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "(Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/animation/core/AnimationState;", "", "sequentialAnimation", "Lkotlin/Function1;", "Landroidx/compose/animation/core/AnimationScope;", "animateTo", "(Landroidx/compose/animation/core/AnimationState;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/animation/core/DecayAnimationSpec;", "(Landroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/DecayAnimationSpec;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/animation/core/Animation;", "animation", "", "startTimeNanos", "(Landroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/Animation;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "R", "onFrame", "callWithFrameNanos", "(Landroidx/compose/animation/core/Animation;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "state", "updateState", "(Landroidx/compose/animation/core/AnimationScope;Landroidx/compose/animation/core/AnimationState;)V", "frameTimeNanos", "durationScale", "anim", "doAnimationFrameWithScale", "(Landroidx/compose/animation/core/AnimationScope;JFLandroidx/compose/animation/core/Animation;Landroidx/compose/animation/core/AnimationState;Lkotlin/jvm/functions/Function1;)V", "playTimeNanos", "doAnimationFrame", "(Landroidx/compose/animation/core/AnimationScope;JJLandroidx/compose/animation/core/Animation;Landroidx/compose/animation/core/AnimationState;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/coroutines/CoroutineContext;", "getDurationScale", "(Lkotlin/coroutines/CoroutineContext;)F", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SuspendAnimationKt {

    /* JADX INFO: renamed from: androidx.compose.animation.core.SuspendAnimationKt$animate$4, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.animation.core.SuspendAnimationKt", f = "SuspendAnimation.kt", l = {239, POBCoreNativeConstants.POB_NATIVE_MAIN_IMG_W}, m = "animate")
    static final class AnonymousClass4<T, V extends AnimationVector> extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        AnonymousClass4(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SuspendAnimationKt.animate(null, null, 0L, null, this);
        }
    }

    @Nullable
    public static final Object animate(float f10, float f11, float f12, @NotNull AnimationSpec<Float> animationSpec, @NotNull Function2<? super Float, ? super Float, Unit> function2, @NotNull Continuation continuation) {
        Object objAnimate = animate(VectorConvertersKt.getVectorConverter(u.f93332a), kotlin.coroutines.jvm.internal.b.c(f10), kotlin.coroutines.jvm.internal.b.c(f11), kotlin.coroutines.jvm.internal.b.c(f12), animationSpec, function2, continuation);
        return objAnimate == pf.b.g() ? objAnimate : Unit.f93236a;
    }

    public static /* synthetic */ Object animate$default(float f10, float f11, float f12, AnimationSpec animationSpec, Function2 function2, Continuation continuation, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f12 = 0.0f;
        }
        if ((i10 & 8) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return animate(f10, f11, f12, animationSpec, function2, continuation);
    }

    @Nullable
    public static final Object animateDecay(float f10, float f11, @NotNull FloatDecayAnimationSpec floatDecayAnimationSpec, @NotNull final Function2<? super Float, ? super Float, Unit> function2, @NotNull Continuation continuation) {
        Object objAnimate$default = animate$default(AnimationStateKt.AnimationState$default(f10, f11, 0L, 0L, false, 28, null), AnimationKt.DecayAnimation(floatDecayAnimationSpec, f10, f11), 0L, new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.animation.core.SuspendAnimationKt.animateDecay.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                invoke2(animationScope);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull AnimationScope<Float, AnimationVector1D> animate) {
                Intrinsics.checkNotNullParameter(animate, "$this$animate");
                function2.invoke(animate.getValue(), Float.valueOf(((AnimationVector1D) animate.getVelocityVector()).getValue()));
            }
        }, continuation, 2, null);
        return objAnimate$default == pf.b.g() ? objAnimate$default : Unit.f93236a;
    }

    public static /* synthetic */ Object animateDecay$default(AnimationState animationState, DecayAnimationSpec decayAnimationSpec, boolean z10, Function1 function1, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            function1 = new Function1() { // from class: androidx.compose.animation.core.SuspendAnimationKt.animateDecay.4
                public final void invoke(@NotNull AnimationScope animationScope) {
                    Intrinsics.checkNotNullParameter(animationScope, "$this$null");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((AnimationScope) obj2);
                    return Unit.f93236a;
                }
            };
        }
        return animateDecay(animationState, decayAnimationSpec, z10, function1, continuation);
    }

    @Nullable
    public static final <T, V extends AnimationVector> Object animateTo(@NotNull AnimationState<T, V> animationState, T t10, @NotNull AnimationSpec<T> animationSpec, boolean z10, @NotNull Function1<? super AnimationScope<T, V>, Unit> function1, @NotNull Continuation continuation) {
        Object objAnimate = animate(animationState, new TargetBasedAnimation(animationSpec, animationState.getTypeConverter(), animationState.getValue(), t10, animationState.getVelocityVector()), z10 ? animationState.getLastFrameTimeNanos() : Long.MIN_VALUE, function1, continuation);
        return objAnimate == pf.b.g() ? objAnimate : Unit.f93236a;
    }

    public static /* synthetic */ Object animateTo$default(AnimationState animationState, Object obj, AnimationSpec animationSpec, boolean z10, Function1 function1, Continuation continuation, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        boolean z11 = z10;
        if ((i10 & 8) != 0) {
            function1 = new Function1() { // from class: androidx.compose.animation.core.SuspendAnimationKt.animateTo.2
                public final void invoke(@NotNull AnimationScope animationScope) {
                    Intrinsics.checkNotNullParameter(animationScope, "$this$null");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                    invoke((AnimationScope) obj3);
                    return Unit.f93236a;
                }
            };
        }
        return animateTo(animationState, obj, animationSpec2, z11, function1, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <R, T, V extends AnimationVector> Object callWithFrameNanos(Animation<T, V> animation, final Function1<? super Long, ? extends R> function1, Continuation continuation) {
        return animation.getIsInfinite() ? InfiniteAnimationPolicyKt.withInfiniteAnimationFrameNanos(function1, continuation) : MonotonicFrameClockKt.withFrameNanos(new Function1<Long, R>() { // from class: androidx.compose.animation.core.SuspendAnimationKt.callWithFrameNanos.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Long l10) {
                return invoke(l10.longValue());
            }

            public final R invoke(long j10) {
                return function1.invoke(Long.valueOf(j10));
            }
        }, continuation);
    }

    private static final <T, V extends AnimationVector> void doAnimationFrame(AnimationScope<T, V> animationScope, long j10, long j11, Animation<T, V> animation, AnimationState<T, V> animationState, Function1<? super AnimationScope<T, V>, Unit> function1) {
        animationScope.setLastFrameTimeNanos$animation_core_release(j10);
        animationScope.setValue$animation_core_release(animation.getValueFromNanos(j11));
        animationScope.setVelocityVector$animation_core_release(animation.getVelocityVectorFromNanos(j11));
        if (animation.isFinishedFromNanos(j11)) {
            animationScope.setFinishedTimeNanos$animation_core_release(animationScope.getLastFrameTimeNanos());
            animationScope.setRunning$animation_core_release(false);
        }
        updateState(animationScope, animationState);
        function1.invoke(animationScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, V extends AnimationVector> void doAnimationFrameWithScale(AnimationScope<T, V> animationScope, long j10, float f10, Animation<T, V> animation, AnimationState<T, V> animationState, Function1<? super AnimationScope<T, V>, Unit> function1) {
        doAnimationFrame(animationScope, j10, f10 == 0.0f ? animation.getDurationNanos() : (long) ((j10 - animationScope.getStartTimeNanos()) / f10), animation, animationState, function1);
    }

    public static final float getDurationScale(@NotNull CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(coroutineContext, "<this>");
        MotionDurationScale motionDurationScale = (MotionDurationScale) coroutineContext.get(MotionDurationScale.INSTANCE);
        float scaleFactor = motionDurationScale != null ? motionDurationScale.getScaleFactor() : 1.0f;
        if (scaleFactor >= 0.0f) {
            return scaleFactor;
        }
        throw new IllegalStateException("Check failed.");
    }

    public static final <T, V extends AnimationVector> void updateState(@NotNull AnimationScope<T, V> animationScope, @NotNull AnimationState<T, V> state) {
        Intrinsics.checkNotNullParameter(animationScope, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        state.setValue$animation_core_release(animationScope.getValue());
        AnimationVectorsKt.copyFrom(state.getVelocityVector(), animationScope.getVelocityVector());
        state.setFinishedTimeNanos$animation_core_release(animationScope.getFinishedTimeNanos());
        state.setLastFrameTimeNanos$animation_core_release(animationScope.getLastFrameTimeNanos());
        state.setRunning$animation_core_release(animationScope.isRunning());
    }

    public static /* synthetic */ Object animate$default(TwoWayConverter twoWayConverter, Object obj, Object obj2, Object obj3, AnimationSpec animationSpec, Function2 function2, Continuation continuation, int i10, Object obj4) {
        if ((i10 & 8) != 0) {
            obj3 = null;
        }
        if ((i10 & 16) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return animate(twoWayConverter, obj, obj2, obj3, animationSpec, function2, continuation);
    }

    @Nullable
    public static final <T, V extends AnimationVector> Object animateDecay(@NotNull AnimationState<T, V> animationState, @NotNull DecayAnimationSpec<T> decayAnimationSpec, boolean z10, @NotNull Function1<? super AnimationScope<T, V>, Unit> function1, @NotNull Continuation continuation) {
        Object objAnimate = animate(animationState, new DecayAnimation((DecayAnimationSpec) decayAnimationSpec, (TwoWayConverter<T, AnimationVector>) animationState.getTypeConverter(), (Object) animationState.getValue(), animationState.getVelocityVector()), z10 ? animationState.getLastFrameTimeNanos() : Long.MIN_VALUE, function1, continuation);
        return objAnimate == pf.b.g() ? objAnimate : Unit.f93236a;
    }

    public static /* synthetic */ Object animate$default(AnimationState animationState, Animation animation, long j10, Function1 function1, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = Long.MIN_VALUE;
        }
        long j11 = j10;
        if ((i10 & 4) != 0) {
            function1 = new Function1() { // from class: androidx.compose.animation.core.SuspendAnimationKt.animate.5
                public final void invoke(@NotNull AnimationScope animationScope) {
                    Intrinsics.checkNotNullParameter(animationScope, "$this$null");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((AnimationScope) obj2);
                    return Unit.f93236a;
                }
            };
        }
        return animate(animationState, animation, j11, function1, continuation);
    }

    @Nullable
    public static final <T, V extends AnimationVector> Object animate(@NotNull final TwoWayConverter<T, V> twoWayConverter, T t10, T t11, @Nullable T t12, @NotNull AnimationSpec<T> animationSpec, @NotNull final Function2<? super T, ? super T, Unit> function2, @NotNull Continuation continuation) {
        V vNewInstance;
        if (t12 == null || (vNewInstance = twoWayConverter.getConvertToVector().invoke(t12)) == null) {
            vNewInstance = AnimationVectorsKt.newInstance(twoWayConverter.getConvertToVector().invoke(t10));
        }
        AnimationVector animationVector = vNewInstance;
        Object objAnimate$default = animate$default(new AnimationState(twoWayConverter, t10, animationVector, 0L, 0L, false, 56, null), new TargetBasedAnimation(animationSpec, twoWayConverter, t10, t11, animationVector), 0L, new Function1<AnimationScope<T, V>, Unit>() { // from class: androidx.compose.animation.core.SuspendAnimationKt.animate.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke((AnimationScope) obj);
                return Unit.f93236a;
            }

            public final void invoke(@NotNull AnimationScope<T, V> animate) {
                Intrinsics.checkNotNullParameter(animate, "$this$animate");
                function2.invoke(animate.getValue(), twoWayConverter.getConvertFromVector().invoke(animate.getVelocityVector()));
            }
        }, continuation, 2, null);
        return objAnimate$default == pf.b.g() ? objAnimate$default : Unit.f93236a;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T, V extends androidx.compose.animation.core.AnimationVector> java.lang.Object animate(@org.jetbrains.annotations.NotNull final androidx.compose.animation.core.AnimationState<T, V> r23, @org.jetbrains.annotations.NotNull androidx.compose.animation.core.Animation<T, V> r24, long r25, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function1<? super androidx.compose.animation.core.AnimationScope<T, V>, kotlin.Unit> r27, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r28) {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SuspendAnimationKt.animate(androidx.compose.animation.core.AnimationState, androidx.compose.animation.core.Animation, long, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
