package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static State a(TextFieldColorsWithIcons textFieldColorsWithIcons, boolean z10, boolean z11, InteractionSource interactionSource, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        composer.startReplaceableGroup(1279189910);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1279189910, i10, -1, "androidx.compose.material.TextFieldColorsWithIcons.leadingIconColor (TextFieldDefaults.kt:160)");
        }
        State<Color> stateLeadingIconColor = textFieldColorsWithIcons.leadingIconColor(z10, z11, composer, (i10 & 126) | ((i10 >> 3) & 896));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateLeadingIconColor;
    }

    public static State b(TextFieldColorsWithIcons textFieldColorsWithIcons, boolean z10, boolean z11, InteractionSource interactionSource, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        composer.startReplaceableGroup(-712140408);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-712140408, i10, -1, "androidx.compose.material.TextFieldColorsWithIcons.trailingIconColor (TextFieldDefaults.kt:177)");
        }
        State<Color> stateTrailingIconColor = textFieldColorsWithIcons.trailingIconColor(z10, z11, composer, (i10 & 126) | ((i10 >> 3) & 896));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateTrailingIconColor;
    }
}
