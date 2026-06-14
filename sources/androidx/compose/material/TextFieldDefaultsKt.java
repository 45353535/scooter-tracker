package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aK\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"animateBorderStrokeAsState", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/BorderStroke;", "enabled", "", "isError", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "colors", "Landroidx/compose/material/TextFieldColors;", "focusedBorderThickness", "Landroidx/compose/ui/unit/Dp;", "unfocusedBorderThickness", "animateBorderStrokeAsState-NuRrP5Q", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material/TextFieldColors;FFLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TextFieldDefaultsKt {
    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    /* JADX INFO: renamed from: animateBorderStrokeAsState-NuRrP5Q, reason: not valid java name */
    public static final State<BorderStroke> m1179animateBorderStrokeAsStateNuRrP5Q(boolean z10, boolean z11, InteractionSource interactionSource, TextFieldColors textFieldColors, float f10, float f11, Composer composer, int i10) {
        State stateRememberUpdatedState;
        composer.startReplaceableGroup(1097899920);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1097899920, i10, -1, "androidx.compose.material.animateBorderStrokeAsState (TextFieldDefaults.kt:835)");
        }
        State<Boolean> stateCollectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i10 >> 6) & 14);
        State<Color> stateIndicatorColor = textFieldColors.indicatorColor(z10, z11, interactionSource, composer, i10 & 8190);
        float f12 = animateBorderStrokeAsState_NuRrP5Q$lambda$0(stateCollectIsFocusedAsState) ? f10 : f11;
        if (z10) {
            composer.startReplaceableGroup(1685712066);
            stateRememberUpdatedState = AnimateAsStateKt.m100animateDpAsStateKz89ssw(f12, AnimationSpecKt.tween$default(TextFieldImplKt.AnimationDuration, 0, null, 6, null), null, composer, 48, 4);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(1685712164);
            stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Dp.m3949boximpl(f11), composer, (i10 >> 15) & 14);
            composer.endReplaceableGroup();
        }
        State<BorderStroke> stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(new BorderStroke(((Dp) stateRememberUpdatedState.getValue()).m3965unboximpl(), new SolidColor(stateIndicatorColor.getValue().m1614unboximpl(), null), null), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState2;
    }

    private static final boolean animateBorderStrokeAsState_NuRrP5Q$lambda$0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
