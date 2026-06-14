package androidx.compose.material;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aM\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0007¢\u0006\u0002\u0010\u0017\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0013\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\u0005\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\u0006\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\u0007\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\b\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\t\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"RadioAnimationDuration", "", "RadioButtonDotSize", "Landroidx/compose/ui/unit/Dp;", "F", "RadioButtonPadding", "RadioButtonRippleRadius", "RadioButtonSize", "RadioRadius", "RadioStrokeWidth", "RadioButton", "", "selected", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "colors", "Landroidx/compose/material/RadioButtonColors;", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/RadioButtonColors;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class RadioButtonKt {
    private static final int RadioAnimationDuration = 100;
    private static final float RadioButtonDotSize;
    private static final float RadioButtonPadding;
    private static final float RadioButtonRippleRadius = Dp.m3951constructorimpl(24);
    private static final float RadioButtonSize;
    private static final float RadioRadius;
    private static final float RadioStrokeWidth;

    static {
        float f10 = 2;
        RadioButtonPadding = Dp.m3951constructorimpl(f10);
        float fM3951constructorimpl = Dp.m3951constructorimpl(20);
        RadioButtonSize = fM3951constructorimpl;
        RadioRadius = Dp.m3951constructorimpl(fM3951constructorimpl / f10);
        RadioButtonDotSize = Dp.m3951constructorimpl(12);
        RadioStrokeWidth = Dp.m3951constructorimpl(f10);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0235 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0133  */
    /* JADX WARN: Type inference failed for: r10v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v9 */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void RadioButton(final boolean r23, @org.jetbrains.annotations.Nullable final kotlin.jvm.functions.Function0<kotlin.Unit> r24, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r25, boolean r26, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r27, @org.jetbrains.annotations.Nullable androidx.compose.material.RadioButtonColors r28, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instruction units count: 581
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.RadioButtonKt.RadioButton(boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.material.RadioButtonColors, androidx.compose.runtime.Composer, int, int):void");
    }
}
