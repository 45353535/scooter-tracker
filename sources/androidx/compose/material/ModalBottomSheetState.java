package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.ironsource.C4329g8;
import com.ironsource.C4424m2;
import com.my.target.common.menu.MenuActionType;
import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 42\u00020\u0001:\u00014B1\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nB=\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\fJ%\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00032\b\b\u0002\u0010%\u001a\u00020\u0006H\u0080@ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u0013\u0010(\u001a\u00020#H\u0080@ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u0013\u0010+\u001a\u00020#H\u0080@ø\u0001\u0000¢\u0006\u0004\b,\u0010*J\u0011\u0010-\u001a\u00020#H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010*J\r\u0010.\u001a\u00020\u0006H\u0000¢\u0006\u0002\b/J\u0011\u00100\u001a\u00020#H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010*J\u001b\u00101\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0003H\u0080@ø\u0001\u0000¢\u0006\u0004\b2\u00103R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0014\u0010\u000b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u0018\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001dX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b!\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u00065"}, d2 = {"Landroidx/compose/material/ModalBottomSheetState;", "", "initialValue", "Landroidx/compose/material/ModalBottomSheetValue;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmStateChange", "Lkotlin/Function1;", "", "(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;)V", "isSkipHalfExpanded", "(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;ZLkotlin/jvm/functions/Function1;)V", "getAnimationSpec$material_release", "()Landroidx/compose/animation/core/AnimationSpec;", "currentValue", "getCurrentValue", "()Landroidx/compose/material/ModalBottomSheetValue;", "hasHalfExpandedState", "getHasHalfExpandedState$material_release", "()Z", "isAnimationRunning", "isAnimationRunning$material_release", "isSkipHalfExpanded$material_release", C4329g8.f43166k, "lastVelocity", "getLastVelocity$material_release", "()F", "swipeableState", "Landroidx/compose/material/SwipeableV2State;", "getSwipeableState$material_release", "()Landroidx/compose/material/SwipeableV2State;", "targetValue", "getTargetValue", "animateTo", "", TypedValues.AttributesType.S_TARGET, "velocity", "animateTo$material_release", "(Landroidx/compose/material/ModalBottomSheetValue;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "expand", "expand$material_release", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "halfExpand", "halfExpand$material_release", MenuActionType.HIDE, "requireOffset", "requireOffset$material_release", C4424m2.f43623v, "snapTo", "snapTo$material_release", "(Landroidx/compose/material/ModalBottomSheetValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", y.f66058y, "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ExperimentalMaterialApi
public final class ModalBottomSheetState {

    @NotNull
    private final AnimationSpec<Float> animationSpec;
    private final boolean isSkipHalfExpanded;

    @NotNull
    private final SwipeableV2State<ModalBottomSheetValue> swipeableState;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J:\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\r\u001a\u00020\fJ<\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0007¨\u0006\u000f"}, d2 = {"Landroidx/compose/material/ModalBottomSheetState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material/ModalBottomSheetState;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmValueChange", "Lkotlin/Function1;", "Landroidx/compose/material/ModalBottomSheetValue;", "", "skipHalfExpanded", "confirmStateChange", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Saver<ModalBottomSheetState, ?> Saver(@NotNull final AnimationSpec<Float> animationSpec, @NotNull final Function1<? super ModalBottomSheetValue, Boolean> confirmValueChange, final boolean skipHalfExpanded) {
            Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
            Intrinsics.checkNotNullParameter(confirmValueChange, "confirmValueChange");
            return SaverKt.Saver(new Function2<SaverScope, ModalBottomSheetState, ModalBottomSheetValue>() { // from class: androidx.compose.material.ModalBottomSheetState$Companion$Saver$1
                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final ModalBottomSheetValue invoke(@NotNull SaverScope Saver, @NotNull ModalBottomSheetState it) {
                    Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return it.getCurrentValue();
                }
            }, new Function1<ModalBottomSheetValue, ModalBottomSheetState>() { // from class: androidx.compose.material.ModalBottomSheetState$Companion$Saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final ModalBottomSheetState invoke(@NotNull ModalBottomSheetValue it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return ModalBottomSheetKt.ModalBottomSheetState(it, animationSpec, confirmValueChange, skipHalfExpanded);
                }
            });
        }

        private Companion() {
        }

        @NotNull
        public final Saver<ModalBottomSheetState, ?> Saver(@NotNull AnimationSpec<Float> animationSpec, boolean skipHalfExpanded, @NotNull Function1<? super ModalBottomSheetValue, Boolean> confirmStateChange) {
            Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
            Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
            return Saver(animationSpec, confirmStateChange, skipHalfExpanded);
        }
    }

    public ModalBottomSheetState(@NotNull ModalBottomSheetValue initialValue, @NotNull AnimationSpec<Float> animationSpec, boolean z10, @NotNull Function1<? super ModalBottomSheetValue, Boolean> confirmStateChange) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
        this.animationSpec = animationSpec;
        this.isSkipHalfExpanded = z10;
        this.swipeableState = new SwipeableV2State<>(initialValue, animationSpec, confirmStateChange, ModalBottomSheetKt.PositionalThreshold, ModalBottomSheetKt.VelocityThreshold, null);
        if (z10 && initialValue == ModalBottomSheetValue.HalfExpanded) {
            throw new IllegalArgumentException("The initial value must not be set to HalfExpanded if skipHalfExpanded is set to true.");
        }
    }

    public static /* synthetic */ Object animateTo$material_release$default(ModalBottomSheetState modalBottomSheetState, ModalBottomSheetValue modalBottomSheetValue, float f10, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = modalBottomSheetState.swipeableState.getLastVelocity();
        }
        return modalBottomSheetState.animateTo$material_release(modalBottomSheetValue, f10, continuation);
    }

    @Nullable
    public final Object animateTo$material_release(@NotNull ModalBottomSheetValue modalBottomSheetValue, float f10, @NotNull Continuation continuation) throws Throwable {
        Object objAnimateTo = this.swipeableState.animateTo(modalBottomSheetValue, f10, continuation);
        return objAnimateTo == b.g() ? objAnimateTo : Unit.f93236a;
    }

    @Nullable
    public final Object expand$material_release(@NotNull Continuation continuation) {
        SwipeableV2State<ModalBottomSheetValue> swipeableV2State = this.swipeableState;
        ModalBottomSheetValue modalBottomSheetValue = ModalBottomSheetValue.Expanded;
        if (!swipeableV2State.hasAnchorForValue(modalBottomSheetValue)) {
            return Unit.f93236a;
        }
        Object objAnimateTo$material_release$default = animateTo$material_release$default(this, modalBottomSheetValue, 0.0f, continuation, 2, null);
        return objAnimateTo$material_release$default == b.g() ? objAnimateTo$material_release$default : Unit.f93236a;
    }

    @NotNull
    public final AnimationSpec<Float> getAnimationSpec$material_release() {
        return this.animationSpec;
    }

    @NotNull
    public final ModalBottomSheetValue getCurrentValue() {
        return this.swipeableState.getCurrentValue();
    }

    public final boolean getHasHalfExpandedState$material_release() {
        return this.swipeableState.hasAnchorForValue(ModalBottomSheetValue.HalfExpanded);
    }

    public final float getLastVelocity$material_release() {
        return this.swipeableState.getLastVelocity();
    }

    @NotNull
    public final SwipeableV2State<ModalBottomSheetValue> getSwipeableState$material_release() {
        return this.swipeableState;
    }

    @NotNull
    public final ModalBottomSheetValue getTargetValue() {
        return this.swipeableState.getTargetValue();
    }

    @Nullable
    public final Object halfExpand$material_release(@NotNull Continuation continuation) {
        if (!getHasHalfExpandedState$material_release()) {
            return Unit.f93236a;
        }
        Object objAnimateTo$material_release$default = animateTo$material_release$default(this, ModalBottomSheetValue.HalfExpanded, 0.0f, continuation, 2, null);
        return objAnimateTo$material_release$default == b.g() ? objAnimateTo$material_release$default : Unit.f93236a;
    }

    @Nullable
    public final Object hide(@NotNull Continuation continuation) {
        Object objAnimateTo$material_release$default = animateTo$material_release$default(this, ModalBottomSheetValue.Hidden, 0.0f, continuation, 2, null);
        return objAnimateTo$material_release$default == b.g() ? objAnimateTo$material_release$default : Unit.f93236a;
    }

    public final boolean isAnimationRunning$material_release() {
        return this.swipeableState.isAnimationRunning();
    }

    /* JADX INFO: renamed from: isSkipHalfExpanded$material_release, reason: from getter */
    public final boolean getIsSkipHalfExpanded() {
        return this.isSkipHalfExpanded;
    }

    public final boolean isVisible() {
        return this.swipeableState.getCurrentValue() != ModalBottomSheetValue.Hidden;
    }

    public final float requireOffset$material_release() {
        return this.swipeableState.requireOffset();
    }

    @Nullable
    public final Object show(@NotNull Continuation continuation) {
        Object objAnimateTo$material_release$default = animateTo$material_release$default(this, getHasHalfExpandedState$material_release() ? ModalBottomSheetValue.HalfExpanded : ModalBottomSheetValue.Expanded, 0.0f, continuation, 2, null);
        return objAnimateTo$material_release$default == b.g() ? objAnimateTo$material_release$default : Unit.f93236a;
    }

    @Nullable
    public final Object snapTo$material_release(@NotNull ModalBottomSheetValue modalBottomSheetValue, @NotNull Continuation continuation) throws Throwable {
        Object objSnapTo = this.swipeableState.snapTo(modalBottomSheetValue, continuation);
        return objSnapTo == b.g() ? objSnapTo : Unit.f93236a;
    }

    public /* synthetic */ ModalBottomSheetState(ModalBottomSheetValue modalBottomSheetValue, AnimationSpec animationSpec, boolean z10, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(modalBottomSheetValue, (i10 & 2) != 0 ? SwipeableDefaults.INSTANCE.getAnimationSpec() : animationSpec, (i10 & 4) != 0 ? false : z10, function1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetState(@NotNull ModalBottomSheetValue initialValue, @NotNull AnimationSpec<Float> animationSpec, @NotNull Function1<? super ModalBottomSheetValue, Boolean> confirmStateChange) {
        this(initialValue, animationSpec, false, confirmStateChange);
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
    }
}
