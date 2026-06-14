package androidx.compose.material;

import androidx.compose.animation.core.SpringSpec;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JW\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\u000bH\u0001¢\u0006\u0004\b\u000e\u0010\u000fR&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0016\u0010\u0003\u001a\u0004\b\u0014\u0010\u0015R)\u0010\u0018\u001a\u00020\u00178\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001c\u0010\u0003\u001a\u0004\b\u001a\u0010\u001bR2\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b\"\u0010\u0003\u001a\u0004\b \u0010!\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Landroidx/compose/material/SwipeableV2Defaults;", "", "<init>", "()V", "T", "Landroidx/compose/material/SwipeableV2State;", "state", "Lkotlin/Function2;", "", "", "animate", "Lkotlin/Function1;", "snap", "Landroidx/compose/material/AnchorChangeHandler;", "ReconcileAnimationOnAnchorChangeHandler$material_release", "(Landroidx/compose/material/SwipeableV2State;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)Landroidx/compose/material/AnchorChangeHandler;", "ReconcileAnimationOnAnchorChangeHandler", "Landroidx/compose/animation/core/SpringSpec;", "AnimationSpec", "Landroidx/compose/animation/core/SpringSpec;", "getAnimationSpec", "()Landroidx/compose/animation/core/SpringSpec;", "getAnimationSpec$annotations", "Landroidx/compose/ui/unit/Dp;", "VelocityThreshold", "F", "getVelocityThreshold-D9Ej5fM", "()F", "getVelocityThreshold-D9Ej5fM$annotations", "Landroidx/compose/ui/unit/Density;", "PositionalThreshold", "Lkotlin/jvm/functions/Function2;", "getPositionalThreshold", "()Lkotlin/jvm/functions/Function2;", "getPositionalThreshold$annotations", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ExperimentalMaterialApi
public final class SwipeableV2Defaults {

    @NotNull
    public static final SwipeableV2Defaults INSTANCE = new SwipeableV2Defaults();

    @NotNull
    private static final SpringSpec<Float> AnimationSpec = new SpringSpec<>(0.0f, 0.0f, null, 7, null);
    private static final float VelocityThreshold = Dp.m3951constructorimpl(125);

    @NotNull
    private static final Function2<Density, Float, Float> PositionalThreshold = SwipeableV2Kt.m1138fixedPositionalThreshold0680j_4(Dp.m3951constructorimpl(56));

    private SwipeableV2Defaults() {
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getAnimationSpec$annotations() {
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getPositionalThreshold$annotations() {
    }

    @ExperimentalMaterialApi
    /* JADX INFO: renamed from: getVelocityThreshold-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m1136getVelocityThresholdD9Ej5fM$annotations() {
    }

    @ExperimentalMaterialApi
    @NotNull
    public final <T> AnchorChangeHandler<T> ReconcileAnimationOnAnchorChangeHandler$material_release(@NotNull final SwipeableV2State<T> state, @NotNull final Function2<? super T, ? super Float, Unit> animate, @NotNull final Function1<? super T, Unit> snap) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(animate, "animate");
        Intrinsics.checkNotNullParameter(snap, "snap");
        return new AnchorChangeHandler<T>() { // from class: androidx.compose.material.SwipeableV2Defaults$ReconcileAnimationOnAnchorChangeHandler$1
            @Override // androidx.compose.material.AnchorChangeHandler
            public final void onAnchorsChanged(T t10, @NotNull Map<T, Float> previousAnchors, @NotNull Map<T, Float> newAnchors) {
                Intrinsics.checkNotNullParameter(previousAnchors, "previousAnchors");
                Intrinsics.checkNotNullParameter(newAnchors, "newAnchors");
                Float f10 = previousAnchors.get(t10);
                Float f11 = newAnchors.get(t10);
                if (Intrinsics.areEqual(f10, f11)) {
                    return;
                }
                if (f11 != null) {
                    animate.invoke(t10, Float.valueOf(state.getLastVelocity()));
                } else {
                    snap.invoke((T) SwipeableV2Kt.closestAnchor$default(newAnchors, state.requireOffset(), false, 2, null));
                }
            }
        };
    }

    @NotNull
    public final SpringSpec<Float> getAnimationSpec() {
        return AnimationSpec;
    }

    @NotNull
    public final Function2<Density, Float, Float> getPositionalThreshold() {
        return PositionalThreshold;
    }

    /* JADX INFO: renamed from: getVelocityThreshold-D9Ej5fM, reason: not valid java name */
    public final float m1137getVelocityThresholdD9Ej5fM() {
        return VelocityThreshold;
    }
}
