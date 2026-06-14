package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001Bv\u0012\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002R\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u001c\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0002R\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n\u0012\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n\u0012\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\nø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0015J)\u0010!\u001a\u00020\u001e*\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 R0\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002R\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$R0\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0002R\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b%\u0010$R\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(R\u001f\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n8\u0006¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b)\u0010(R\u001f\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010&\u001a\u0004\b*\u0010(R$\u0010+\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R2\u00104\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000602\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000303018\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00068"}, d2 = {"Landroidx/compose/animation/ExpandShrinkModifier;", "Landroidx/compose/animation/LayoutModifierWithPassThroughIntrinsics;", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/animation/core/AnimationVector2D;", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "sizeAnimation", "Landroidx/compose/ui/unit/IntOffset;", "offsetAnimation", "Landroidx/compose/runtime/State;", "Landroidx/compose/animation/ChangeSize;", "expand", "shrink", "Landroidx/compose/ui/Alignment;", "alignment", "<init>", "(Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;)V", "targetState", "fullSize", "sizeByState-Uzc_VyU", "(Landroidx/compose/animation/EnterExitState;J)J", "sizeByState", "targetOffsetByState-oFUgxo0", "targetOffsetByState", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "getSizeAnimation", "()Landroidx/compose/animation/core/Transition$DeferredAnimation;", "getOffsetAnimation", "Landroidx/compose/runtime/State;", "getExpand", "()Landroidx/compose/runtime/State;", "getShrink", "getAlignment", "currentAlignment", "Landroidx/compose/ui/Alignment;", "getCurrentAlignment", "()Landroidx/compose/ui/Alignment;", "setCurrentAlignment", "(Landroidx/compose/ui/Alignment;)V", "Lkotlin/Function1;", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "sizeTransitionSpec", "Lkotlin/jvm/functions/Function1;", "getSizeTransitionSpec", "()Lkotlin/jvm/functions/Function1;", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class ExpandShrinkModifier extends LayoutModifierWithPassThroughIntrinsics {

    @NotNull
    private final State<Alignment> alignment;

    @Nullable
    private Alignment currentAlignment;

    @NotNull
    private final State<ChangeSize> expand;

    @NotNull
    private final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> offsetAnimation;

    @NotNull
    private final State<ChangeSize> shrink;

    @NotNull
    private final Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> sizeAnimation;

    @NotNull
    private final Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntSize>> sizeTransitionSpec;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnterExitState.values().length];
            try {
                iArr[EnterExitState.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnterExitState.PreEnter.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnterExitState.PostExit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExpandShrinkModifier(@NotNull Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> sizeAnimation, @NotNull Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> offsetAnimation, @NotNull State<ChangeSize> expand, @NotNull State<ChangeSize> shrink, @NotNull State<? extends Alignment> alignment) {
        Intrinsics.checkNotNullParameter(sizeAnimation, "sizeAnimation");
        Intrinsics.checkNotNullParameter(offsetAnimation, "offsetAnimation");
        Intrinsics.checkNotNullParameter(expand, "expand");
        Intrinsics.checkNotNullParameter(shrink, "shrink");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        this.sizeAnimation = sizeAnimation;
        this.offsetAnimation = offsetAnimation;
        this.expand = expand;
        this.shrink = shrink;
        this.alignment = alignment;
        this.sizeTransitionSpec = new Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntSize>>() { // from class: androidx.compose.animation.ExpandShrinkModifier$sizeTransitionSpec$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final FiniteAnimationSpec<IntSize> invoke(@NotNull Transition.Segment<EnterExitState> segment) {
                Intrinsics.checkNotNullParameter(segment, "$this$null");
                EnterExitState enterExitState = EnterExitState.PreEnter;
                EnterExitState enterExitState2 = EnterExitState.Visible;
                FiniteAnimationSpec<IntSize> animationSpec = null;
                if (segment.isTransitioningTo(enterExitState, enterExitState2)) {
                    ChangeSize value = this.this$0.getExpand().getValue();
                    if (value != null) {
                        animationSpec = value.getAnimationSpec();
                    }
                } else if (segment.isTransitioningTo(enterExitState2, EnterExitState.PostExit)) {
                    ChangeSize value2 = this.this$0.getShrink().getValue();
                    if (value2 != null) {
                        animationSpec = value2.getAnimationSpec();
                    }
                } else {
                    animationSpec = EnterExitTransitionKt.DefaultSizeAnimationSpec;
                }
                return animationSpec == null ? EnterExitTransitionKt.DefaultSizeAnimationSpec : animationSpec;
            }
        };
    }

    @NotNull
    public final State<Alignment> getAlignment() {
        return this.alignment;
    }

    @Nullable
    public final Alignment getCurrentAlignment() {
        return this.currentAlignment;
    }

    @NotNull
    public final State<ChangeSize> getExpand() {
        return this.expand;
    }

    @NotNull
    public final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> getOffsetAnimation() {
        return this.offsetAnimation;
    }

    @NotNull
    public final State<ChangeSize> getShrink() {
        return this.shrink;
    }

    @NotNull
    public final Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> getSizeAnimation() {
        return this.sizeAnimation;
    }

    @NotNull
    public final Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntSize>> getSizeTransitionSpec() {
        return this.sizeTransitionSpec;
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo43measure3p2s80s(@NotNull MeasureScope measure, @NotNull Measurable measurable, long j10) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        final Placeable placeableMo3011measureBRTryo0 = measurable.mo3011measureBRTryo0(j10);
        final long jIntSize = IntSizeKt.IntSize(placeableMo3011measureBRTryo0.getWidth(), placeableMo3011measureBRTryo0.getHeight());
        long packedValue = this.sizeAnimation.animate(this.sizeTransitionSpec, new Function1<EnterExitState, IntSize>() { // from class: androidx.compose.animation.ExpandShrinkModifier$measure$currentSize$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntSize invoke(EnterExitState enterExitState) {
                return IntSize.m4103boximpl(m79invokeYEO4UFw(enterExitState));
            }

            /* JADX INFO: renamed from: invoke-YEO4UFw, reason: not valid java name */
            public final long m79invokeYEO4UFw(@NotNull EnterExitState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.this$0.m77sizeByStateUzc_VyU(it, jIntSize);
            }
        }).getValue().getPackedValue();
        final long packedValue2 = this.offsetAnimation.animate(new Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntOffset>>() { // from class: androidx.compose.animation.ExpandShrinkModifier$measure$offsetDelta$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final FiniteAnimationSpec<IntOffset> invoke(@NotNull Transition.Segment<EnterExitState> animate) {
                Intrinsics.checkNotNullParameter(animate, "$this$animate");
                return EnterExitTransitionKt.DefaultOffsetAnimationSpec;
            }
        }, new Function1<EnterExitState, IntOffset>() { // from class: androidx.compose.animation.ExpandShrinkModifier$measure$offsetDelta$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntOffset invoke(EnterExitState enterExitState) {
                return IntOffset.m4060boximpl(m80invokeBjo55l4(enterExitState));
            }

            /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
            public final long m80invokeBjo55l4(@NotNull EnterExitState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.this$0.m78targetOffsetByStateoFUgxo0(it, jIntSize);
            }
        }).getValue().getPackedValue();
        Alignment alignment = this.currentAlignment;
        final long jMo1265alignKFBX0sM = alignment != null ? alignment.mo1265alignKFBX0sM(jIntSize, packedValue, LayoutDirection.Ltr) : IntOffset.INSTANCE.m4079getZeronOccac();
        return MeasureScope.CC.p(measure, IntSize.m4111getWidthimpl(packedValue), IntSize.m4110getHeightimpl(packedValue), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.ExpandShrinkModifier$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Placeable.PlacementScope layout) {
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                Placeable.PlacementScope.place$default(layout, placeableMo3011measureBRTryo0, IntOffset.m4069getXimpl(jMo1265alignKFBX0sM) + IntOffset.m4069getXimpl(packedValue2), IntOffset.m4070getYimpl(jMo1265alignKFBX0sM) + IntOffset.m4070getYimpl(packedValue2), 0.0f, 4, null);
            }
        }, 4, null);
    }

    public final void setCurrentAlignment(@Nullable Alignment alignment) {
        this.currentAlignment = alignment;
    }

    /* JADX INFO: renamed from: sizeByState-Uzc_VyU, reason: not valid java name */
    public final long m77sizeByStateUzc_VyU(@NotNull EnterExitState targetState, long fullSize) {
        Intrinsics.checkNotNullParameter(targetState, "targetState");
        ChangeSize value = this.expand.getValue();
        long packedValue = value != null ? value.getSize().invoke(IntSize.m4103boximpl(fullSize)).getPackedValue() : fullSize;
        ChangeSize value2 = this.shrink.getValue();
        long packedValue2 = value2 != null ? value2.getSize().invoke(IntSize.m4103boximpl(fullSize)).getPackedValue() : fullSize;
        int i10 = WhenMappings.$EnumSwitchMapping$0[targetState.ordinal()];
        if (i10 == 1) {
            return fullSize;
        }
        if (i10 == 2) {
            return packedValue;
        }
        if (i10 == 3) {
            return packedValue2;
        }
        throw new m();
    }

    /* JADX INFO: renamed from: targetOffsetByState-oFUgxo0, reason: not valid java name */
    public final long m78targetOffsetByStateoFUgxo0(@NotNull EnterExitState targetState, long fullSize) {
        Intrinsics.checkNotNullParameter(targetState, "targetState");
        if (this.currentAlignment == null) {
            return IntOffset.INSTANCE.m4079getZeronOccac();
        }
        if (this.alignment.getValue() == null) {
            return IntOffset.INSTANCE.m4079getZeronOccac();
        }
        if (Intrinsics.areEqual(this.currentAlignment, this.alignment.getValue())) {
            return IntOffset.INSTANCE.m4079getZeronOccac();
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[targetState.ordinal()];
        if (i10 == 1) {
            return IntOffset.INSTANCE.m4079getZeronOccac();
        }
        if (i10 == 2) {
            return IntOffset.INSTANCE.m4079getZeronOccac();
        }
        if (i10 != 3) {
            throw new m();
        }
        ChangeSize value = this.shrink.getValue();
        if (value == null) {
            return IntOffset.INSTANCE.m4079getZeronOccac();
        }
        long packedValue = value.getSize().invoke(IntSize.m4103boximpl(fullSize)).getPackedValue();
        Alignment value2 = this.alignment.getValue();
        Intrinsics.checkNotNull(value2);
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        long jMo1265alignKFBX0sM = value2.mo1265alignKFBX0sM(fullSize, packedValue, layoutDirection);
        Alignment alignment = this.currentAlignment;
        Intrinsics.checkNotNull(alignment);
        long jMo1265alignKFBX0sM2 = alignment.mo1265alignKFBX0sM(fullSize, packedValue, layoutDirection);
        return IntOffsetKt.IntOffset(IntOffset.m4069getXimpl(jMo1265alignKFBX0sM) - IntOffset.m4069getXimpl(jMo1265alignKFBX0sM2), IntOffset.m4070getYimpl(jMo1265alignKFBX0sM) - IntOffset.m4070getYimpl(jMo1265alignKFBX0sM2));
    }
}
