package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.unit.Density;
import com.taurusx.tax.f.y;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b5\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0001\u0018\u0000 k*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001kB^\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007\u0012\u001a\b\u0002\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0005¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001e\u001a\u00020\b2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u001aH\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\b2\u0006\u0010\u001f\u001a\u00028\u0000¢\u0006\u0004\b \u0010!J\u001b\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b$\u0010%J%\u0010&\u001a\u00020#2\u0006\u0010\"\u001a\u00028\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u001b\u0010(\u001a\u00020#2\u0006\u0010\u0013\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u0015\u0010+\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u0005¢\u0006\u0004\b+\u0010,R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010/R&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u00102R,\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b4\u00105R#\u0010\u000e\u001a\u00020\r8\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000e\u00106\u001a\u0004\b7\u0010\u0019R+\u0010\u0012\u001a\u00028\u00002\u0006\u00108\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001b\u0010\"\u001a\u00028\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010<R/\u0010\u0011\u001a\u0004\u0018\u00010\u00052\b\u00108\u001a\u0004\u0018\u00010\u00058F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bB\u0010:\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001b\u0010I\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bG\u0010@\u001a\u0004\bH\u0010\u0019R+\u0010N\u001a\u00020\u00052\u0006\u00108\u001a\u00020\u00058F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bJ\u0010:\u001a\u0004\bK\u0010\u0019\"\u0004\bL\u0010MR\u001b\u0010Q\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bO\u0010@\u001a\u0004\bP\u0010\u0019R\u001b\u0010T\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bR\u0010@\u001a\u0004\bS\u0010\u0019R/\u0010X\u001a\u0004\u0018\u00018\u00002\b\u00108\u001a\u0004\u0018\u00018\u00008B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bU\u0010:\u001a\u0004\bV\u0010<\"\u0004\bW\u0010>R\u001a\u0010Z\u001a\u00020Y8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]RC\u0010c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u001a2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u001a8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b^\u0010:\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR$\u0010d\u001a\u0004\u0018\u00010\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010\u0017\"\u0004\bg\u0010hR\u0011\u0010i\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bi\u0010j\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006l"}, d2 = {"Landroidx/compose/material/SwipeableV2State;", "T", "", "initialValue", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "Lkotlin/Function1;", "", "confirmValueChange", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "positionalThreshold", "Landroidx/compose/ui/unit/Dp;", "velocityThreshold", "<init>", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "offset", "currentValue", "velocity", "computeTarget", "(FLjava/lang/Object;F)Ljava/lang/Object;", "requireDensity", "()Landroidx/compose/ui/unit/Density;", "requireOffset", "()F", "", "newAnchors", "updateAnchors$material_release", "(Ljava/util/Map;)Z", "updateAnchors", "value", "hasAnchorForValue", "(Ljava/lang/Object;)Z", "targetValue", "", "snapTo", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateTo", "(Ljava/lang/Object;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "settle", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delta", "dispatchRawDelta", "(F)F", "Landroidx/compose/animation/core/AnimationSpec;", "getAnimationSpec$material_release", "()Landroidx/compose/animation/core/AnimationSpec;", "Lkotlin/jvm/functions/Function1;", "getConfirmValueChange$material_release", "()Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function2;", "getPositionalThreshold$material_release", "()Lkotlin/jvm/functions/Function2;", "F", "getVelocityThreshold-D9Ej5fM$material_release", "<set-?>", "currentValue$delegate", "Landroidx/compose/runtime/MutableState;", "getCurrentValue", "()Ljava/lang/Object;", "setCurrentValue", "(Ljava/lang/Object;)V", "targetValue$delegate", "Landroidx/compose/runtime/State;", "getTargetValue", "offset$delegate", "getOffset", "()Ljava/lang/Float;", "setOffset", "(Ljava/lang/Float;)V", "progress$delegate", "getProgress", "progress", "lastVelocity$delegate", "getLastVelocity", "setLastVelocity", "(F)V", "lastVelocity", "minOffset$delegate", "getMinOffset", "minOffset", "maxOffset$delegate", "getMaxOffset", "maxOffset", "animationTarget$delegate", "getAnimationTarget", "setAnimationTarget", "animationTarget", "Landroidx/compose/foundation/gestures/DraggableState;", "draggableState", "Landroidx/compose/foundation/gestures/DraggableState;", "getDraggableState$material_release", "()Landroidx/compose/foundation/gestures/DraggableState;", "anchors$delegate", "getAnchors$material_release", "()Ljava/util/Map;", "setAnchors$material_release", "(Ljava/util/Map;)V", "anchors", "density", "Landroidx/compose/ui/unit/Density;", "getDensity$material_release", "setDensity$material_release", "(Landroidx/compose/ui/unit/Density;)V", "isAnimationRunning", "()Z", y.f66058y, "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Stable
@ExperimentalMaterialApi
public final class SwipeableV2State<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: anchors$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState anchors;

    @NotNull
    private final AnimationSpec<Float> animationSpec;

    /* JADX INFO: renamed from: animationTarget$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState animationTarget;

    @NotNull
    private final Function1<T, Boolean> confirmValueChange;

    /* JADX INFO: renamed from: currentValue$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState currentValue;

    @Nullable
    private Density density;

    @NotNull
    private final DraggableState draggableState;

    /* JADX INFO: renamed from: lastVelocity$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState lastVelocity;

    /* JADX INFO: renamed from: maxOffset$delegate, reason: from kotlin metadata */
    @NotNull
    private final State maxOffset;

    /* JADX INFO: renamed from: minOffset$delegate, reason: from kotlin metadata */
    @NotNull
    private final State minOffset;

    /* JADX INFO: renamed from: offset$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState offset;

    @NotNull
    private final Function2<Density, Float, Float> positionalThreshold;

    /* JADX INFO: renamed from: progress$delegate, reason: from kotlin metadata */
    @NotNull
    private final State progress;

    /* JADX INFO: renamed from: targetValue$delegate, reason: from kotlin metadata */
    @NotNull
    private final State targetValue;
    private final float velocityThreshold;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Ju\u0010\u0014\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0011\u0012\u0004\u0012\u00028\u00010\u0010\"\b\b\u0001\u0010\u0004*\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\t0\b2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Landroidx/compose/material/SwipeableV2State$Companion;", "", "<init>", "()V", "T", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "Lkotlin/Function1;", "", "confirmValueChange", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "positionalThreshold", "Landroidx/compose/ui/unit/Dp;", "velocityThreshold", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material/SwipeableV2State;", "Saver-eqLRuRQ", "(Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;F)Landroidx/compose/runtime/saveable/Saver;", "Saver", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @ExperimentalMaterialApi
        @NotNull
        /* JADX INFO: renamed from: Saver-eqLRuRQ, reason: not valid java name */
        public final <T> Saver<SwipeableV2State<T>, T> m1141SavereqLRuRQ(@NotNull final AnimationSpec<Float> animationSpec, @NotNull final Function1<? super T, Boolean> confirmValueChange, @NotNull final Function2<? super Density, ? super Float, Float> positionalThreshold, final float velocityThreshold) {
            Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
            Intrinsics.checkNotNullParameter(confirmValueChange, "confirmValueChange");
            Intrinsics.checkNotNullParameter(positionalThreshold, "positionalThreshold");
            return SaverKt.Saver(new Function2<SaverScope, SwipeableV2State<T>, T>() { // from class: androidx.compose.material.SwipeableV2State$Companion$Saver$1
                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final T invoke(@NotNull SaverScope Saver, @NotNull SwipeableV2State<T> it) {
                    Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return it.getCurrentValue();
                }
            }, new Function1<T, SwipeableV2State<T>>() { // from class: androidx.compose.material.SwipeableV2State$Companion$Saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final SwipeableV2State<T> invoke(@NotNull T it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new SwipeableV2State<>(it, animationSpec, confirmValueChange, positionalThreshold, velocityThreshold, null);
                }
            });
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material.SwipeableV2State$animateTo$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.compose.material.SwipeableV2State", f = "SwipeableV2.kt", l = {335}, m = "animateTo")
    static final class C15491 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SwipeableV2State<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C15491(SwipeableV2State<T> swipeableV2State, Continuation continuation) {
            super(continuation);
            this.this$0 = swipeableV2State;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.animateTo(null, 0.0f, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material.SwipeableV2State$animateTo$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/gestures/DragScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.compose.material.SwipeableV2State$animateTo$2", f = "SwipeableV2.kt", l = {338}, m = "invokeSuspend")
    static final class AnonymousClass2 extends k implements Function2<DragScope, Continuation, Object> {
        final /* synthetic */ Float $targetOffset;
        final /* synthetic */ T $targetValue;
        final /* synthetic */ float $velocity;
        int label;
        final /* synthetic */ SwipeableV2State<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(SwipeableV2State<T> swipeableV2State, T t10, Float f10, float f11, Continuation continuation) {
            super(2, continuation);
            this.this$0 = swipeableV2State;
            this.$targetValue = t10;
            this.$targetOffset = f10;
            this.$velocity = f11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return new AnonymousClass2(this.this$0, this.$targetValue, this.$targetOffset, this.$velocity, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull DragScope dragScope, @Nullable Continuation continuation) {
            return ((AnonymousClass2) create(dragScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            AnonymousClass2 anonymousClass2;
            Object objG = b.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.d.b(obj);
                this.this$0.setAnimationTarget(this.$targetValue);
                final s0 s0Var = new s0();
                Float offset = this.this$0.getOffset();
                float fFloatValue = offset != null ? offset.floatValue() : 0.0f;
                s0Var.f93329b = fFloatValue;
                float fFloatValue2 = this.$targetOffset.floatValue();
                float f10 = this.$velocity;
                AnimationSpec<Float> animationSpec$material_release = this.this$0.getAnimationSpec$material_release();
                final SwipeableV2State<T> swipeableV2State = this.this$0;
                Function2<Float, Float, Unit> function2 = new Function2<Float, Float, Unit>() { // from class: androidx.compose.material.SwipeableV2State.animateTo.2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Float f11, Float f12) {
                        invoke(f11.floatValue(), f12.floatValue());
                        return Unit.f93236a;
                    }

                    public final void invoke(float f11, float f12) {
                        swipeableV2State.setOffset(Float.valueOf(f11));
                        s0Var.f93329b = f11;
                        swipeableV2State.setLastVelocity(f12);
                    }
                };
                this.label = 1;
                anonymousClass2 = this;
                if (SuspendAnimationKt.animate(fFloatValue, fFloatValue2, f10, animationSpec$material_release, function2, anonymousClass2) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                anonymousClass2 = this;
            }
            anonymousClass2.this$0.setLastVelocity(0.0f);
            return Unit.f93236a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material.SwipeableV2State$snapTo$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.compose.material.SwipeableV2State", f = "SwipeableV2.kt", l = {304}, m = "snapTo")
    static final class C15501 extends d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SwipeableV2State<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C15501(SwipeableV2State<T> swipeableV2State, Continuation continuation) {
            super(continuation);
            this.this$0 = swipeableV2State;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.snapTo(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material.SwipeableV2State$snapTo$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/gestures/DragScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.compose.material.SwipeableV2State$snapTo$2", f = "SwipeableV2.kt", l = {}, m = "invokeSuspend")
    static final class C15512 extends k implements Function2<DragScope, Continuation, Object> {
        final /* synthetic */ Float $targetOffset;
        final /* synthetic */ T $targetValue;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SwipeableV2State<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C15512(SwipeableV2State<T> swipeableV2State, T t10, Float f10, Continuation continuation) {
            super(2, continuation);
            this.this$0 = swipeableV2State;
            this.$targetValue = t10;
            this.$targetOffset = f10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            C15512 c15512 = new C15512(this.this$0, this.$targetValue, this.$targetOffset, continuation);
            c15512.L$0 = obj;
            return c15512;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull DragScope dragScope, @Nullable Continuation continuation) {
            return ((C15512) create(dragScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            b.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            DragScope dragScope = (DragScope) this.L$0;
            this.this$0.setAnimationTarget(this.$targetValue);
            dragScope.dragBy(this.$targetOffset.floatValue() - this.this$0.requireOffset());
            return Unit.f93236a;
        }
    }

    public /* synthetic */ SwipeableV2State(Object obj, AnimationSpec animationSpec, Function1 function1, Function2 function2, float f10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, animationSpec, function1, function2, f10);
    }

    public static /* synthetic */ Object animateTo$default(SwipeableV2State swipeableV2State, Object obj, float f10, Continuation continuation, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            f10 = swipeableV2State.getLastVelocity();
        }
        return swipeableV2State.animateTo(obj, f10, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T computeTarget(float offset, T currentValue, float velocity) {
        Map<T, Float> anchors$material_release = getAnchors$material_release();
        Float f10 = anchors$material_release.get(currentValue);
        Density densityRequireDensity = requireDensity();
        float fMo308toPx0680j_4 = densityRequireDensity.mo308toPx0680j_4(this.velocityThreshold);
        if (!Intrinsics.areEqual(f10, offset) && f10 != null) {
            if (f10.floatValue() < offset) {
                if (velocity >= fMo308toPx0680j_4) {
                    return (T) SwipeableV2Kt.closestAnchor(anchors$material_release, offset, true);
                }
                T t10 = (T) SwipeableV2Kt.closestAnchor(anchors$material_release, offset, true);
                if (offset >= Math.abs(f10.floatValue() + Math.abs(this.positionalThreshold.invoke(densityRequireDensity, Float.valueOf(Math.abs(((Number) MapsKt.getValue(anchors$material_release, t10)).floatValue() - f10.floatValue()))).floatValue()))) {
                    return t10;
                }
            } else {
                if (velocity <= (-fMo308toPx0680j_4)) {
                    return (T) SwipeableV2Kt.closestAnchor(anchors$material_release, offset, false);
                }
                T t11 = (T) SwipeableV2Kt.closestAnchor(anchors$material_release, offset, false);
                float fAbs = Math.abs(f10.floatValue() - Math.abs(this.positionalThreshold.invoke(densityRequireDensity, Float.valueOf(Math.abs(f10.floatValue() - ((Number) MapsKt.getValue(anchors$material_release, t11)).floatValue()))).floatValue()));
                if (offset >= 0.0f ? offset <= fAbs : Math.abs(offset) >= fAbs) {
                    return t11;
                }
            }
        }
        return currentValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T getAnimationTarget() {
        return this.animationTarget.getValue();
    }

    private final Density requireDensity() {
        Density density = this.density;
        if (density != null) {
            return density;
        }
        throw new IllegalArgumentException(("SwipeableState did not have a density attached. Are you using Modifier.swipeable with this=" + this + " SwipeableState?").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAnimationTarget(T t10) {
        this.animationTarget.setValue(t10);
    }

    private final void setCurrentValue(T t10) {
        this.currentValue.setValue(t10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLastVelocity(float f10) {
        this.lastVelocity.setValue(Float.valueOf(f10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setOffset(Float f10) {
        this.offset.setValue(f10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ea A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object animateTo(T r13, float r14, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableV2State.animateTo(java.lang.Object, float, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final float dispatchRawDelta(float delta) {
        Float offset = getOffset();
        float fFloatValue = offset != null ? offset.floatValue() : 0.0f;
        float fM = g.m(delta + fFloatValue, getMinOffset(), getMaxOffset()) - fFloatValue;
        if (Math.abs(fM) > 0.0f) {
            this.draggableState.dispatchRawDelta(fM);
        }
        return fM;
    }

    @NotNull
    public final Map<T, Float> getAnchors$material_release() {
        return (Map) this.anchors.getValue();
    }

    @NotNull
    public final AnimationSpec<Float> getAnimationSpec$material_release() {
        return this.animationSpec;
    }

    @NotNull
    public final Function1<T, Boolean> getConfirmValueChange$material_release() {
        return this.confirmValueChange;
    }

    public final T getCurrentValue() {
        return this.currentValue.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: getDensity$material_release, reason: from getter */
    public final Density getDensity() {
        return this.density;
    }

    @NotNull
    /* JADX INFO: renamed from: getDraggableState$material_release, reason: from getter */
    public final DraggableState getDraggableState() {
        return this.draggableState;
    }

    public final float getLastVelocity() {
        return ((Number) this.lastVelocity.getValue()).floatValue();
    }

    public final float getMaxOffset() {
        return ((Number) this.maxOffset.getValue()).floatValue();
    }

    public final float getMinOffset() {
        return ((Number) this.minOffset.getValue()).floatValue();
    }

    @Nullable
    public final Float getOffset() {
        return (Float) this.offset.getValue();
    }

    @NotNull
    public final Function2<Density, Float, Float> getPositionalThreshold$material_release() {
        return this.positionalThreshold;
    }

    public final float getProgress() {
        return ((Number) this.progress.getValue()).floatValue();
    }

    public final T getTargetValue() {
        return (T) this.targetValue.getValue();
    }

    /* JADX INFO: renamed from: getVelocityThreshold-D9Ej5fM$material_release, reason: not valid java name and from getter */
    public final float getVelocityThreshold() {
        return this.velocityThreshold;
    }

    public final boolean hasAnchorForValue(T value) {
        return getAnchors$material_release().containsKey(value);
    }

    public final boolean isAnimationRunning() {
        return getAnimationTarget() != null;
    }

    public final float requireOffset() {
        Float offset = getOffset();
        if (offset != null) {
            return offset.floatValue();
        }
        throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
    }

    public final void setAnchors$material_release(@NotNull Map<T, Float> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.anchors.setValue(map);
    }

    public final void setDensity$material_release(@Nullable Density density) {
        this.density = density;
    }

    @Nullable
    public final Object settle(float f10, @NotNull Continuation continuation) throws Throwable {
        T currentValue = getCurrentValue();
        T tComputeTarget = computeTarget(requireOffset(), currentValue, f10);
        if (this.confirmValueChange.invoke(tComputeTarget).booleanValue()) {
            Object objAnimateTo = animateTo(tComputeTarget, f10, continuation);
            return objAnimateTo == b.g() ? objAnimateTo : Unit.f93236a;
        }
        Object objAnimateTo2 = animateTo(currentValue, f10, continuation);
        return objAnimateTo2 == b.g() ? objAnimateTo2 : Unit.f93236a;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object snapTo(T r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof androidx.compose.material.SwipeableV2State.C15501
            if (r0 == 0) goto L14
            r0 = r10
            androidx.compose.material.SwipeableV2State$snapTo$1 r0 = (androidx.compose.material.SwipeableV2State.C15501) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            androidx.compose.material.SwipeableV2State$snapTo$1 r0 = new androidx.compose.material.SwipeableV2State$snapTo$1
            r0.<init>(r8, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r4.result
            java.lang.Object r0 = pf.b.g()
            int r1 = r4.label
            r2 = 1
            r7 = 0
            if (r1 == 0) goto L3e
            if (r1 != r2) goto L36
            java.lang.Object r9 = r4.L$1
            java.lang.Object r0 = r4.L$0
            r1 = r0
            androidx.compose.material.SwipeableV2State r1 = (androidx.compose.material.SwipeableV2State) r1
            kotlin.d.b(r10)     // Catch: java.lang.Throwable -> L33
            goto L65
        L33:
            r0 = move-exception
            r9 = r0
            goto L6f
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3e:
            kotlin.d.b(r10)
            java.util.Map r10 = r8.getAnchors$material_release()
            java.lang.Object r10 = r10.get(r9)
            java.lang.Float r10 = (java.lang.Float) r10
            if (r10 == 0) goto L73
            androidx.compose.foundation.gestures.DraggableState r1 = r8.draggableState     // Catch: java.lang.Throwable -> L6c
            androidx.compose.material.SwipeableV2State$snapTo$2 r3 = new androidx.compose.material.SwipeableV2State$snapTo$2     // Catch: java.lang.Throwable -> L6c
            r3.<init>(r8, r9, r10, r7)     // Catch: java.lang.Throwable -> L6c
            r4.L$0 = r8     // Catch: java.lang.Throwable -> L6c
            r4.L$1 = r9     // Catch: java.lang.Throwable -> L6c
            r4.label = r2     // Catch: java.lang.Throwable -> L6c
            r2 = 0
            r5 = 1
            r6 = 0
            java.lang.Object r10 = androidx.compose.foundation.gestures.a.a(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L6c
            if (r10 != r0) goto L64
            return r0
        L64:
            r1 = r8
        L65:
            r1.setCurrentValue(r9)     // Catch: java.lang.Throwable -> L33
            r1.setAnimationTarget(r7)
            goto L76
        L6c:
            r0 = move-exception
            r9 = r0
            r1 = r8
        L6f:
            r1.setAnimationTarget(r7)
            throw r9
        L73:
            r8.setCurrentValue(r9)
        L76:
            kotlin.Unit r9 = kotlin.Unit.f93236a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableV2State.snapTo(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean updateAnchors$material_release(@NotNull Map<T, Float> newAnchors) {
        boolean z10;
        Intrinsics.checkNotNullParameter(newAnchors, "newAnchors");
        boolean zIsEmpty = getAnchors$material_release().isEmpty();
        setAnchors$material_release(newAnchors);
        if (zIsEmpty) {
            Float f10 = getAnchors$material_release().get(getCurrentValue());
            z10 = f10 != null;
            if (z10) {
                setOffset(f10);
            }
        } else {
            z10 = true;
        }
        return (z10 && zIsEmpty) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SwipeableV2State(T t10, AnimationSpec<Float> animationSpec, Function1<? super T, Boolean> function1, Function2<? super Density, ? super Float, Float> function2, float f10) {
        this.animationSpec = animationSpec;
        this.confirmValueChange = function1;
        this.positionalThreshold = function2;
        this.velocityThreshold = f10;
        this.currentValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t10, null, 2, null);
        this.targetValue = SnapshotStateKt.derivedStateOf(new Function0<T>(this) { // from class: androidx.compose.material.SwipeableV2State$targetValue$2
            final /* synthetic */ SwipeableV2State<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final T invoke() {
                T t11 = (T) this.this$0.getAnimationTarget();
                if (t11 != null) {
                    return t11;
                }
                SwipeableV2State<T> swipeableV2State = this.this$0;
                Float offset = swipeableV2State.getOffset();
                return offset != null ? (T) swipeableV2State.computeTarget(offset.floatValue(), swipeableV2State.getCurrentValue(), 0.0f) : swipeableV2State.getCurrentValue();
            }
        });
        this.offset = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.progress = SnapshotStateKt.derivedStateOf(new Function0<Float>(this) { // from class: androidx.compose.material.SwipeableV2State$progress$2
            final /* synthetic */ SwipeableV2State<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
            @Override // kotlin.jvm.functions.Function0
            @org.jetbrains.annotations.NotNull
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Float invoke() {
                /*
                    r6 = this;
                    androidx.compose.material.SwipeableV2State<T> r0 = r6.this$0
                    java.util.Map r0 = r0.getAnchors$material_release()
                    androidx.compose.material.SwipeableV2State<T> r1 = r6.this$0
                    java.lang.Object r1 = r1.getCurrentValue()
                    java.lang.Object r0 = r0.get(r1)
                    java.lang.Float r0 = (java.lang.Float) r0
                    r1 = 0
                    if (r0 == 0) goto L1a
                    float r0 = r0.floatValue()
                    goto L1b
                L1a:
                    r0 = r1
                L1b:
                    androidx.compose.material.SwipeableV2State<T> r2 = r6.this$0
                    java.util.Map r2 = r2.getAnchors$material_release()
                    androidx.compose.material.SwipeableV2State<T> r3 = r6.this$0
                    java.lang.Object r3 = r3.getTargetValue()
                    java.lang.Object r2 = r2.get(r3)
                    java.lang.Float r2 = (java.lang.Float) r2
                    if (r2 == 0) goto L34
                    float r2 = r2.floatValue()
                    goto L35
                L34:
                    r2 = r1
                L35:
                    float r2 = r2 - r0
                    float r3 = java.lang.Math.abs(r2)
                    r4 = 897988541(0x358637bd, float:1.0E-6)
                    int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                    r5 = 1065353216(0x3f800000, float:1.0)
                    if (r3 <= 0) goto L57
                    androidx.compose.material.SwipeableV2State<T> r3 = r6.this$0
                    float r3 = r3.requireOffset()
                    float r3 = r3 - r0
                    float r3 = r3 / r2
                    int r0 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                    if (r0 >= 0) goto L50
                    goto L5a
                L50:
                    r0 = 1065353199(0x3f7fffef, float:0.999999)
                    int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                    if (r0 <= 0) goto L59
                L57:
                    r1 = r5
                    goto L5a
                L59:
                    r1 = r3
                L5a:
                    java.lang.Float r0 = java.lang.Float.valueOf(r1)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableV2State$progress$2.invoke():java.lang.Float");
            }
        });
        this.lastVelocity = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
        this.minOffset = SnapshotStateKt.derivedStateOf(new Function0<Float>(this) { // from class: androidx.compose.material.SwipeableV2State$minOffset$2
            final /* synthetic */ SwipeableV2State<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Float invoke() {
                Float fMinOrNull = SwipeableV2Kt.minOrNull(this.this$0.getAnchors$material_release());
                return Float.valueOf(fMinOrNull != null ? fMinOrNull.floatValue() : Float.NEGATIVE_INFINITY);
            }
        });
        this.maxOffset = SnapshotStateKt.derivedStateOf(new Function0<Float>(this) { // from class: androidx.compose.material.SwipeableV2State$maxOffset$2
            final /* synthetic */ SwipeableV2State<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Float invoke() {
                Float fMaxOrNull = SwipeableV2Kt.maxOrNull(this.this$0.getAnchors$material_release());
                return Float.valueOf(fMaxOrNull != null ? fMaxOrNull.floatValue() : Float.POSITIVE_INFINITY);
            }
        });
        this.animationTarget = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.draggableState = DraggableKt.DraggableState(new Function1<Float, Unit>(this) { // from class: androidx.compose.material.SwipeableV2State$draggableState$1
            final /* synthetic */ SwipeableV2State<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Float f11) {
                invoke(f11.floatValue());
                return Unit.f93236a;
            }

            public final void invoke(float f11) {
                SwipeableV2State<T> swipeableV2State = this.this$0;
                Float offset = swipeableV2State.getOffset();
                swipeableV2State.setOffset(Float.valueOf(g.m((offset != null ? offset.floatValue() : 0.0f) + f11, this.this$0.getMinOffset(), this.this$0.getMaxOffset())));
            }
        });
        this.anchors = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(MapsKt.emptyMap(), null, 2, null);
    }

    public /* synthetic */ SwipeableV2State(Object obj, AnimationSpec animationSpec, Function1 function1, Function2 function2, float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i10 & 2) != 0 ? SwipeableV2Defaults.INSTANCE.getAnimationSpec() : animationSpec, (i10 & 4) != 0 ? new Function1<T, Boolean>() { // from class: androidx.compose.material.SwipeableV2State.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(T t10) {
                return Boolean.TRUE;
            }
        } : function1, (i10 & 8) != 0 ? SwipeableV2Defaults.INSTANCE.getPositionalThreshold() : function2, (i10 & 16) != 0 ? SwipeableV2Defaults.INSTANCE.m1137getVelocityThresholdD9Ej5fM() : f10, null);
    }
}
