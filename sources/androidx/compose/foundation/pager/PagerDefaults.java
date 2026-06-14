package androidx.compose.foundation.pager;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JO\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0002\u0010\u000fJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/pager/PagerDefaults;", "", "()V", "flingBehavior", "Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;", "state", "Landroidx/compose/foundation/pager/PagerState;", "pagerSnapDistance", "Landroidx/compose/foundation/pager/PagerSnapDistance;", "lowVelocityAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "highVelocityAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "snapAnimationSpec", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/pager/PagerSnapDistance;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;", "pageNestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PagerDefaults {
    public static final int $stable = 0;

    @NotNull
    public static final PagerDefaults INSTANCE = new PagerDefaults();

    private PagerDefaults() {
    }

    @Composable
    @NotNull
    public final SnapFlingBehavior flingBehavior(@NotNull PagerState state, @Nullable PagerSnapDistance pagerSnapDistance, @Nullable AnimationSpec<Float> animationSpec, @Nullable DecayAnimationSpec<Float> decayAnimationSpec, @Nullable AnimationSpec<Float> animationSpec2, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(state, "state");
        composer.startReplaceableGroup(-344874176);
        PagerSnapDistance pagerSnapDistanceAtMost = (i11 & 2) != 0 ? PagerSnapDistance.INSTANCE.atMost(1) : pagerSnapDistance;
        AnimationSpec<Float> animationSpecTween$default = (i11 & 4) != 0 ? AnimationSpecKt.tween$default(500, 0, EasingKt.getLinearEasing(), 2, null) : animationSpec;
        DecayAnimationSpec<Float> decayAnimationSpecRememberSplineBasedDecay = (i11 & 8) != 0 ? SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0) : decayAnimationSpec;
        AnimationSpec<Float> animationSpecSpring$default = (i11 & 16) != 0 ? AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null) : animationSpec2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-344874176, i10, -1, "androidx.compose.foundation.pager.PagerDefaults.flingBehavior (Pager.kt:462)");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        Object[] objArr = {animationSpecTween$default, decayAnimationSpecRememberSplineBasedDecay, animationSpecSpring$default, pagerSnapDistanceAtMost, density};
        composer.startReplaceableGroup(-568225417);
        boolean zChanged = false;
        for (int i12 = 0; i12 < 5; i12++) {
            zChanged |= composer.changed(objArr[i12]);
        }
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            Object snapFlingBehavior = new SnapFlingBehavior(PagerKt.SnapLayoutInfoProvider(state, pagerSnapDistanceAtMost, decayAnimationSpecRememberSplineBasedDecay), animationSpecTween$default, decayAnimationSpecRememberSplineBasedDecay, animationSpecSpring$default, density, 0.0f, 32, null);
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

    @NotNull
    public final NestedScrollConnection pageNestedScrollConnection(@NotNull Orientation orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return orientation == Orientation.Horizontal ? PagerKt.ConsumeHorizontalFlingNestedScrollConnection : PagerKt.ConsumeVerticalFlingNestedScrollConnection;
    }
}
