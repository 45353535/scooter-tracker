package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.State;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001BH\u0012\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002R\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u001c\u001a\u00020\u0019*\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bR0\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002R\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"R\u001f\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b#\u0010\"R2\u0010'\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060%\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030&0$8\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006+"}, d2 = {"Landroidx/compose/animation/SlideModifier;", "Landroidx/compose/animation/LayoutModifierWithPassThroughIntrinsics;", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "Landroidx/compose/ui/unit/IntOffset;", "Landroidx/compose/animation/core/AnimationVector2D;", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "lazyAnimation", "Landroidx/compose/runtime/State;", "Landroidx/compose/animation/Slide;", "slideIn", "slideOut", "<init>", "(Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;)V", "targetState", "Landroidx/compose/ui/unit/IntSize;", "fullSize", "targetValueByState-oFUgxo0", "(Landroidx/compose/animation/EnterExitState;J)J", "targetValueByState", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "getLazyAnimation", "()Landroidx/compose/animation/core/Transition$DeferredAnimation;", "Landroidx/compose/runtime/State;", "getSlideIn", "()Landroidx/compose/runtime/State;", "getSlideOut", "Lkotlin/Function1;", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "transitionSpec", "Lkotlin/jvm/functions/Function1;", "getTransitionSpec", "()Lkotlin/jvm/functions/Function1;", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class SlideModifier extends LayoutModifierWithPassThroughIntrinsics {

    @NotNull
    private final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> lazyAnimation;

    @NotNull
    private final State<Slide> slideIn;

    @NotNull
    private final State<Slide> slideOut;

    @NotNull
    private final Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntOffset>> transitionSpec;

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

    public SlideModifier(@NotNull Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> lazyAnimation, @NotNull State<Slide> slideIn, @NotNull State<Slide> slideOut) {
        Intrinsics.checkNotNullParameter(lazyAnimation, "lazyAnimation");
        Intrinsics.checkNotNullParameter(slideIn, "slideIn");
        Intrinsics.checkNotNullParameter(slideOut, "slideOut");
        this.lazyAnimation = lazyAnimation;
        this.slideIn = slideIn;
        this.slideOut = slideOut;
        this.transitionSpec = new Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntOffset>>() { // from class: androidx.compose.animation.SlideModifier$transitionSpec$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final FiniteAnimationSpec<IntOffset> invoke(@NotNull Transition.Segment<EnterExitState> segment) {
                FiniteAnimationSpec<IntOffset> animationSpec;
                FiniteAnimationSpec<IntOffset> animationSpec2;
                Intrinsics.checkNotNullParameter(segment, "$this$null");
                EnterExitState enterExitState = EnterExitState.PreEnter;
                EnterExitState enterExitState2 = EnterExitState.Visible;
                if (segment.isTransitioningTo(enterExitState, enterExitState2)) {
                    Slide value = this.this$0.getSlideIn().getValue();
                    return (value == null || (animationSpec2 = value.getAnimationSpec()) == null) ? EnterExitTransitionKt.DefaultOffsetAnimationSpec : animationSpec2;
                }
                if (!segment.isTransitioningTo(enterExitState2, EnterExitState.PostExit)) {
                    return EnterExitTransitionKt.DefaultOffsetAnimationSpec;
                }
                Slide value2 = this.this$0.getSlideOut().getValue();
                return (value2 == null || (animationSpec = value2.getAnimationSpec()) == null) ? EnterExitTransitionKt.DefaultOffsetAnimationSpec : animationSpec;
            }
        };
    }

    @NotNull
    public final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> getLazyAnimation() {
        return this.lazyAnimation;
    }

    @NotNull
    public final State<Slide> getSlideIn() {
        return this.slideIn;
    }

    @NotNull
    public final State<Slide> getSlideOut() {
        return this.slideOut;
    }

    @NotNull
    public final Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntOffset>> getTransitionSpec() {
        return this.transitionSpec;
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo43measure3p2s80s(@NotNull MeasureScope measure, @NotNull Measurable measurable, long j10) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        final Placeable placeableMo3011measureBRTryo0 = measurable.mo3011measureBRTryo0(j10);
        final long jIntSize = IntSizeKt.IntSize(placeableMo3011measureBRTryo0.getWidth(), placeableMo3011measureBRTryo0.getHeight());
        return MeasureScope.CC.p(measure, placeableMo3011measureBRTryo0.getWidth(), placeableMo3011measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.SlideModifier$measure$1
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
                Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> lazyAnimation = this.this$0.getLazyAnimation();
                Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntOffset>> transitionSpec = this.this$0.getTransitionSpec();
                final SlideModifier slideModifier = this.this$0;
                final long j11 = jIntSize;
                Placeable.PlacementScope.m3049placeWithLayeraW9wM$default(layout, placeableMo3011measureBRTryo0, lazyAnimation.animate(transitionSpec, new Function1<EnterExitState, IntOffset>() { // from class: androidx.compose.animation.SlideModifier$measure$1$slideOffset$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ IntOffset invoke(EnterExitState enterExitState) {
                        return IntOffset.m4060boximpl(m96invokeBjo55l4(enterExitState));
                    }

                    /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                    public final long m96invokeBjo55l4(@NotNull EnterExitState it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return slideModifier.m95targetValueByStateoFUgxo0(it, j11);
                    }
                }).getValue().getPackedValue(), 0.0f, null, 6, null);
            }
        }, 4, null);
    }

    /* JADX INFO: renamed from: targetValueByState-oFUgxo0, reason: not valid java name */
    public final long m95targetValueByStateoFUgxo0(@NotNull EnterExitState targetState, long fullSize) {
        Function1<IntSize, IntOffset> slideOffset;
        Function1<IntSize, IntOffset> slideOffset2;
        Intrinsics.checkNotNullParameter(targetState, "targetState");
        Slide value = this.slideIn.getValue();
        long jM4079getZeronOccac = (value == null || (slideOffset2 = value.getSlideOffset()) == null) ? IntOffset.INSTANCE.m4079getZeronOccac() : slideOffset2.invoke(IntSize.m4103boximpl(fullSize)).getPackedValue();
        Slide value2 = this.slideOut.getValue();
        long jM4079getZeronOccac2 = (value2 == null || (slideOffset = value2.getSlideOffset()) == null) ? IntOffset.INSTANCE.m4079getZeronOccac() : slideOffset.invoke(IntSize.m4103boximpl(fullSize)).getPackedValue();
        int i10 = WhenMappings.$EnumSwitchMapping$0[targetState.ordinal()];
        if (i10 == 1) {
            return IntOffset.INSTANCE.m4079getZeronOccac();
        }
        if (i10 == 2) {
            return jM4079getZeronOccac;
        }
        if (i10 == 3) {
            return jM4079getZeronOccac2;
        }
        throw new m();
    }
}
