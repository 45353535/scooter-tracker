package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import net.pubnative.lite.sdk.utils.AtomManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B9\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0000\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB1\b\u0017\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u000b\u0010\rJ\u001b\u0010\u0010\u001a\u00028\u0001*\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J]\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00182\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00122\u0006\u0010\u0014\u001a\u00028\u00002 \u0010\u0017\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010!\u001a\u00020\u00162\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00018\u00002\n\b\u0002\u0010 \u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b!\u0010\"Je\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00182\u0006\u0010#\u001a\u00028\u00002\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$2\b\b\u0002\u0010\u0014\u001a\u00028\u00002\"\b\u0002\u0010\u0017\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015H\u0086@ø\u0001\u0000¢\u0006\u0004\b&\u0010'JY\u0010)\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00182\u0006\u0010\u0014\u001a\u00028\u00002\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000(2\"\b\u0002\u0010\u0017\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015H\u0086@ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u001b\u0010+\u001a\u00020\u00162\u0006\u0010#\u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u0013\u0010-\u001a\u00020\u0016H\u0086@ø\u0001\u0000¢\u0006\u0004\b-\u0010.J\u0013\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000/¢\u0006\u0004\b0\u00101R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u00104R\u0016\u0010\b\u001a\u0004\u0018\u00018\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00105R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b7\u00108R&\u0010:\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001098\u0000X\u0080\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R+\u0010B\u001a\u00020>2\u0006\u0010?\u001a\u00020>8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER+\u0010#\u001a\u00028\u00002\u0006\u0010?\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bF\u0010A\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR(\u0010\u001f\u001a\u0004\u0018\u00018\u00002\b\u0010?\u001a\u0004\u0018\u00018\u00008\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001f\u00105\u001a\u0004\bK\u0010HR(\u0010 \u001a\u0004\u0018\u00018\u00002\b\u0010?\u001a\u0004\u0018\u00018\u00008\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b \u00105\u001a\u0004\bL\u0010HR\u0014\u0010N\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR \u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00000P8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u0014\u0010U\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010W\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010VR\u0016\u0010X\u001a\u00028\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010VR\u0016\u0010Y\u001a\u00028\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010VR\u0011\u0010\u000f\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\bZ\u0010HR\u0011\u0010]\u001a\u00028\u00018F¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0011\u0010_\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b^\u0010H\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006`"}, d2 = {"Landroidx/compose/animation/core/Animatable;", "T", "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "initialValue", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "visibilityThreshold", "", "label", "<init>", "(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/String;)V", "(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;)V", "", "value", "createVector", "(Ljava/lang/Object;F)Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/animation/core/Animation;", "animation", "initialVelocity", "Lkotlin/Function1;", "", "block", "Landroidx/compose/animation/core/AnimationResult;", "runAnimation", "(Landroidx/compose/animation/core/Animation;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clampToBounds", "(Ljava/lang/Object;)Ljava/lang/Object;", "endAnimation", "()V", "lowerBound", "upperBound", "updateBounds", "(Ljava/lang/Object;Ljava/lang/Object;)V", "targetValue", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "animateTo", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/animation/core/DecayAnimationSpec;", "animateDecay", "(Ljava/lang/Object;Landroidx/compose/animation/core/DecayAnimationSpec;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "snapTo", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", AtomManager.ATOM_STOP_METHOD_NAME, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/runtime/State;", "asState", "()Landroidx/compose/runtime/State;", "Landroidx/compose/animation/core/TwoWayConverter;", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "Ljava/lang/Object;", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "Landroidx/compose/animation/core/AnimationState;", "internalState", "Landroidx/compose/animation/core/AnimationState;", "getInternalState$animation_core_release", "()Landroidx/compose/animation/core/AnimationState;", "", "<set-?>", "isRunning$delegate", "Landroidx/compose/runtime/MutableState;", "isRunning", "()Z", "setRunning", "(Z)V", "targetValue$delegate", "getTargetValue", "()Ljava/lang/Object;", "setTargetValue", "(Ljava/lang/Object;)V", "getLowerBound", "getUpperBound", "Landroidx/compose/animation/core/MutatorMutex;", "mutatorMutex", "Landroidx/compose/animation/core/MutatorMutex;", "Landroidx/compose/animation/core/SpringSpec;", "defaultSpringSpec", "Landroidx/compose/animation/core/SpringSpec;", "getDefaultSpringSpec$animation_core_release", "()Landroidx/compose/animation/core/SpringSpec;", "negativeInfinityBounds", "Landroidx/compose/animation/core/AnimationVector;", "positiveInfinityBounds", "lowerBoundVector", "upperBoundVector", "getValue", "getVelocityVector", "()Landroidx/compose/animation/core/AnimationVector;", "velocityVector", "getVelocity", "velocity", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Animatable<T, V extends AnimationVector> {
    public static final int $stable = 8;

    @NotNull
    private final SpringSpec<T> defaultSpringSpec;

    @NotNull
    private final AnimationState<T, V> internalState;

    /* JADX INFO: renamed from: isRunning$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState isRunning;

    @NotNull
    private final String label;

    @Nullable
    private T lowerBound;

    @NotNull
    private V lowerBoundVector;

    @NotNull
    private final MutatorMutex mutatorMutex;

    @NotNull
    private final V negativeInfinityBounds;

    @NotNull
    private final V positiveInfinityBounds;

    /* JADX INFO: renamed from: targetValue$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState targetValue;

    @NotNull
    private final TwoWayConverter<T, V> typeConverter;

    @Nullable
    private T upperBound;

    @NotNull
    private V upperBoundVector;

    @Nullable
    private final T visibilityThreshold;

    /* JADX INFO: renamed from: androidx.compose.animation.core.Animatable$runAnimation$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/AnimationResult;", "T", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/AnimationVector;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.animation.core.Animatable$runAnimation$2", f = "Animatable.kt", l = {305}, m = "invokeSuspend")
    static final class AnonymousClass2 extends k implements Function1<Continuation, Object> {
        final /* synthetic */ Animation<T, V> $animation;
        final /* synthetic */ Function1<Animatable<T, V>, Unit> $block;
        final /* synthetic */ T $initialVelocity;
        final /* synthetic */ long $startTime;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ Animatable<T, V> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Animatable<T, V> animatable, T t10, Animation<T, V> animation, long j10, Function1<? super Animatable<T, V>, Unit> function1, Continuation continuation) {
            super(1, continuation);
            this.this$0 = animatable;
            this.$initialVelocity = t10;
            this.$animation = animation;
            this.$startTime = j10;
            this.$block = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@NotNull Continuation continuation) {
            return new AnonymousClass2(this.this$0, this.$initialVelocity, this.$animation, this.$startTime, this.$block, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            AnimationState animationState;
            Ref$BooleanRef ref$BooleanRef;
            Object objG = pf.b.g();
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    kotlin.d.b(obj);
                    this.this$0.getInternalState$animation_core_release().setVelocityVector$animation_core_release(this.this$0.getTypeConverter().getConvertToVector().invoke(this.$initialVelocity));
                    this.this$0.setTargetValue(this.$animation.getTargetValue());
                    this.this$0.setRunning(true);
                    final AnimationState animationStateCopy$default = AnimationStateKt.copy$default((AnimationState) this.this$0.getInternalState$animation_core_release(), (Object) null, (AnimationVector) null, 0L, Long.MIN_VALUE, false, 23, (Object) null);
                    final Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
                    Animation<T, V> animation = this.$animation;
                    long j10 = this.$startTime;
                    final Animatable<T, V> animatable = this.this$0;
                    final Function1<Animatable<T, V>, Unit> function1 = this.$block;
                    Function1<AnimationScope<T, V>, Unit> function12 = new Function1<AnimationScope<T, V>, Unit>() { // from class: androidx.compose.animation.core.Animatable.runAnimation.2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Object obj2) {
                            invoke((AnimationScope) obj2);
                            return Unit.f93236a;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        public final void invoke(@NotNull AnimationScope<T, V> animate) {
                            Intrinsics.checkNotNullParameter(animate, "$this$animate");
                            SuspendAnimationKt.updateState(animate, animatable.getInternalState$animation_core_release());
                            Object objClampToBounds = animatable.clampToBounds(animate.getValue());
                            if (Intrinsics.areEqual(objClampToBounds, animate.getValue())) {
                                Function1<Animatable<T, V>, Unit> function13 = function1;
                                if (function13 != null) {
                                    function13.invoke(animatable);
                                    return;
                                }
                                return;
                            }
                            animatable.getInternalState$animation_core_release().setValue$animation_core_release(objClampToBounds);
                            animationStateCopy$default.setValue$animation_core_release((T) objClampToBounds);
                            Function1<Animatable<T, V>, Unit> function14 = function1;
                            if (function14 != null) {
                                function14.invoke(animatable);
                            }
                            animate.cancelAnimation();
                            ref$BooleanRef2.f93279b = true;
                        }
                    };
                    this.L$0 = animationStateCopy$default;
                    this.L$1 = ref$BooleanRef2;
                    this.label = 1;
                    if (SuspendAnimationKt.animate(animationStateCopy$default, animation, j10, function12, this) == objG) {
                        return objG;
                    }
                    animationState = animationStateCopy$default;
                    ref$BooleanRef = ref$BooleanRef2;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ref$BooleanRef = (Ref$BooleanRef) this.L$1;
                    animationState = (AnimationState) this.L$0;
                    kotlin.d.b(obj);
                }
                AnimationEndReason animationEndReason = ref$BooleanRef.f93279b ? AnimationEndReason.BoundReached : AnimationEndReason.Finished;
                this.this$0.endAnimation();
                return new AnimationResult(animationState, animationEndReason);
            } catch (CancellationException e10) {
                this.this$0.endAnimation();
                throw e10;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable Continuation continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.animation.core.Animatable$snapTo$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/AnimationVector;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.animation.core.Animatable$snapTo$2", f = "Animatable.kt", l = {}, m = "invokeSuspend")
    static final class C13742 extends k implements Function1<Continuation, Object> {
        final /* synthetic */ T $targetValue;
        int label;
        final /* synthetic */ Animatable<T, V> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13742(Animatable<T, V> animatable, T t10, Continuation continuation) {
            super(1, continuation);
            this.this$0 = animatable;
            this.$targetValue = t10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@NotNull Continuation continuation) {
            return new C13742(this.this$0, this.$targetValue, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            pf.b.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            this.this$0.endAnimation();
            Object objClampToBounds = this.this$0.clampToBounds(this.$targetValue);
            this.this$0.getInternalState$animation_core_release().setValue$animation_core_release(objClampToBounds);
            this.this$0.setTargetValue(objClampToBounds);
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable Continuation continuation) {
            return ((C13742) create(continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.animation.core.Animatable$stop$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/AnimationVector;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.animation.core.Animatable$stop$2", f = "Animatable.kt", l = {}, m = "invokeSuspend")
    static final class C13752 extends k implements Function1<Continuation, Object> {
        int label;
        final /* synthetic */ Animatable<T, V> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13752(Animatable<T, V> animatable, Continuation continuation) {
            super(1, continuation);
            this.this$0 = animatable;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@NotNull Continuation continuation) {
            return new C13752(this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            pf.b.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            this.this$0.endAnimation();
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable Continuation continuation) {
            return ((C13752) create(continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public Animatable(T t10, @NotNull TwoWayConverter<T, V> typeConverter, @Nullable T t11, @NotNull String label) {
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
        Intrinsics.checkNotNullParameter(label, "label");
        this.typeConverter = typeConverter;
        this.visibilityThreshold = t11;
        this.label = label;
        this.internalState = new AnimationState<>(typeConverter, t10, null, 0L, 0L, false, 60, null);
        this.isRunning = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.targetValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t10, null, 2, null);
        this.mutatorMutex = new MutatorMutex();
        this.defaultSpringSpec = new SpringSpec<>(0.0f, 0.0f, t11, 3, null);
        V v10 = (V) createVector(t10, Float.NEGATIVE_INFINITY);
        this.negativeInfinityBounds = v10;
        V v11 = (V) createVector(t10, Float.POSITIVE_INFINITY);
        this.positiveInfinityBounds = v11;
        this.lowerBoundVector = v10;
        this.upperBoundVector = v11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateDecay$default(Animatable animatable, Object obj, DecayAnimationSpec decayAnimationSpec, Function1 function1, Continuation continuation, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            function1 = null;
        }
        return animatable.animateDecay(obj, decayAnimationSpec, function1, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateTo$default(Animatable animatable, Object obj, AnimationSpec animationSpec, Object obj2, Function1 function1, Continuation continuation, int i10, Object obj3) {
        if ((i10 & 2) != 0) {
            animationSpec = animatable.defaultSpringSpec;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i10 & 4) != 0) {
            obj2 = animatable.getVelocity();
        }
        Object obj4 = obj2;
        if ((i10 & 8) != 0) {
            function1 = null;
        }
        return animatable.animateTo(obj, animationSpec2, obj4, function1, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T clampToBounds(T value) {
        if (Intrinsics.areEqual(this.lowerBoundVector, this.negativeInfinityBounds) && Intrinsics.areEqual(this.upperBoundVector, this.positiveInfinityBounds)) {
            return value;
        }
        V vInvoke = this.typeConverter.getConvertToVector().invoke(value);
        int size = vInvoke.getSize();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            if (vInvoke.get$animation_core_release(i10) < this.lowerBoundVector.get$animation_core_release(i10) || vInvoke.get$animation_core_release(i10) > this.upperBoundVector.get$animation_core_release(i10)) {
                vInvoke.set$animation_core_release(i10, kotlin.ranges.g.m(vInvoke.get$animation_core_release(i10), this.lowerBoundVector.get$animation_core_release(i10), this.upperBoundVector.get$animation_core_release(i10)));
                z10 = true;
            }
        }
        return z10 ? this.typeConverter.getConvertFromVector().invoke(vInvoke) : value;
    }

    private final V createVector(T t10, float f10) {
        V vInvoke = this.typeConverter.getConvertToVector().invoke(t10);
        int size = vInvoke.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            vInvoke.set$animation_core_release(i10, f10);
        }
        return vInvoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void endAnimation() {
        AnimationState<T, V> animationState = this.internalState;
        animationState.getVelocityVector().reset$animation_core_release();
        animationState.setLastFrameTimeNanos$animation_core_release(Long.MIN_VALUE);
        setRunning(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object runAnimation(Animation<T, V> animation, T t10, Function1<? super Animatable<T, V>, Unit> function1, Continuation continuation) {
        return MutatorMutex.mutate$default(this.mutatorMutex, null, new AnonymousClass2(this, t10, animation, this.internalState.getLastFrameTimeNanos(), function1, null), continuation, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRunning(boolean z10) {
        this.isRunning.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTargetValue(T t10) {
        this.targetValue.setValue(t10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateBounds$default(Animatable animatable, Object obj, Object obj2, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = animatable.lowerBound;
        }
        if ((i10 & 2) != 0) {
            obj2 = animatable.upperBound;
        }
        animatable.updateBounds(obj, obj2);
    }

    @Nullable
    public final Object animateDecay(T t10, @NotNull DecayAnimationSpec<T> decayAnimationSpec, @Nullable Function1<? super Animatable<T, V>, Unit> function1, @NotNull Continuation continuation) {
        return runAnimation(new DecayAnimation((DecayAnimationSpec) decayAnimationSpec, (TwoWayConverter) this.typeConverter, (Object) getValue(), (AnimationVector) this.typeConverter.getConvertToVector().invoke(t10)), t10, function1, continuation);
    }

    @Nullable
    public final Object animateTo(T t10, @NotNull AnimationSpec<T> animationSpec, T t11, @Nullable Function1<? super Animatable<T, V>, Unit> function1, @NotNull Continuation continuation) {
        return runAnimation(AnimationKt.TargetBasedAnimation(animationSpec, this.typeConverter, getValue(), t10, t11), t11, function1, continuation);
    }

    @NotNull
    public final State<T> asState() {
        return this.internalState;
    }

    @NotNull
    public final SpringSpec<T> getDefaultSpringSpec$animation_core_release() {
        return this.defaultSpringSpec;
    }

    @NotNull
    public final AnimationState<T, V> getInternalState$animation_core_release() {
        return this.internalState;
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    @Nullable
    public final T getLowerBound() {
        return this.lowerBound;
    }

    public final T getTargetValue() {
        return this.targetValue.getValue();
    }

    @NotNull
    public final TwoWayConverter<T, V> getTypeConverter() {
        return this.typeConverter;
    }

    @Nullable
    public final T getUpperBound() {
        return this.upperBound;
    }

    public final T getValue() {
        return this.internalState.getValue();
    }

    public final T getVelocity() {
        return (T) this.typeConverter.getConvertFromVector().invoke(getVelocityVector());
    }

    @NotNull
    public final V getVelocityVector() {
        return (V) this.internalState.getVelocityVector();
    }

    public final boolean isRunning() {
        return ((Boolean) this.isRunning.getValue()).booleanValue();
    }

    @Nullable
    public final Object snapTo(T t10, @NotNull Continuation continuation) {
        Object objMutate$default = MutatorMutex.mutate$default(this.mutatorMutex, null, new C13742(this, t10, null), continuation, 1, null);
        return objMutate$default == pf.b.g() ? objMutate$default : Unit.f93236a;
    }

    @Nullable
    public final Object stop(@NotNull Continuation continuation) {
        Object objMutate$default = MutatorMutex.mutate$default(this.mutatorMutex, null, new C13752(this, null), continuation, 1, null);
        return objMutate$default == pf.b.g() ? objMutate$default : Unit.f93236a;
    }

    public final void updateBounds(@Nullable T lowerBound, @Nullable T upperBound) {
        V vInvoke;
        V vInvoke2;
        if (lowerBound == null || (vInvoke = this.typeConverter.getConvertToVector().invoke(lowerBound)) == null) {
            vInvoke = this.negativeInfinityBounds;
        }
        if (upperBound == null || (vInvoke2 = this.typeConverter.getConvertToVector().invoke(upperBound)) == null) {
            vInvoke2 = this.positiveInfinityBounds;
        }
        int size = vInvoke.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            if (vInvoke.get$animation_core_release(i10) > vInvoke2.get$animation_core_release(i10)) {
                throw new IllegalStateException(("Lower bound must be no greater than upper bound on *all* dimensions. The provided lower bound: " + vInvoke + " is greater than upper bound " + vInvoke2 + " on index " + i10).toString());
            }
        }
        this.lowerBoundVector = vInvoke;
        this.upperBoundVector = vInvoke2;
        this.upperBound = upperBound;
        this.lowerBound = lowerBound;
        if (isRunning()) {
            return;
        }
        T tClampToBounds = clampToBounds(getValue());
        if (Intrinsics.areEqual(tClampToBounds, getValue())) {
            return;
        }
        this.internalState.setValue$animation_core_release(tClampToBounds);
    }

    public /* synthetic */ Animatable(Object obj, TwoWayConverter twoWayConverter, Object obj2, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, twoWayConverter, (i10 & 4) != 0 ? null : obj2, (i10 & 8) != 0 ? "Animatable" : str);
    }

    public /* synthetic */ Animatable(Object obj, TwoWayConverter twoWayConverter, Object obj2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, twoWayConverter, (i10 & 4) != 0 ? null : obj2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Animatable(Object obj, TwoWayConverter typeConverter, Object obj2) {
        this(obj, typeConverter, obj2, "Animatable");
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
    }
}
