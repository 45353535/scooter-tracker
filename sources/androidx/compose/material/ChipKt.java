package androidx.compose.material;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a\u008b\u0001\u0010\u0014\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u000f2\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001aÁ\u0001\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u00172\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u000f2\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u000f2\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u000f2\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0004\b\u001a\u0010\u001b\"\u0017\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\"\u0017\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001f\u0010\u001e\"\u0017\u0010 \u001a\u00020\u001c8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b \u0010\u001e\"\u0017\u0010!\u001a\u00020\u001c8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b!\u0010\u001e\"\u0014\u0010#\u001a\u00020\"8\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u001e\"\u0014\u0010$\u001a\u00020\"8\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\u001e\"\u0017\u0010%\u001a\u00020\u001c8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b%\u0010\u001e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, d2 = {"Lkotlin/Function0;", "", "onClick", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/foundation/BorderStroke;", OutlinedTextFieldKt.BorderId, "Landroidx/compose/material/ChipColors;", "colors", "Landroidx/compose/runtime/Composable;", "leadingIcon", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "content", "Chip", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/material/ChipColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "selected", "Landroidx/compose/material/SelectableChipColors;", "selectedIcon", "trailingIcon", "FilterChip", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/material/SelectableChipColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/unit/Dp;", "HorizontalPadding", "F", "LeadingIconStartSpacing", "LeadingIconEndSpacing", "TrailingIconSpacing", "", "SurfaceOverlayOpacity", "SelectedOverlayOpacity", "SelectedIconContainerSize", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ChipKt {
    private static final float LeadingIconEndSpacing;
    private static final float SelectedOverlayOpacity = 0.16f;
    private static final float SurfaceOverlayOpacity = 0.12f;
    private static final float TrailingIconSpacing;
    private static final float HorizontalPadding = Dp.m3951constructorimpl(12);
    private static final float LeadingIconStartSpacing = Dp.m3951constructorimpl(4);
    private static final float SelectedIconContainerSize = Dp.m3951constructorimpl(24);

    static {
        float f10 = 8;
        LeadingIconEndSpacing = Dp.m3951constructorimpl(f10);
        TrailingIconSpacing = Dp.m3951constructorimpl(f10);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0288 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0108  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void Chip(@org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function0<kotlin.Unit> r36, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r37, boolean r38, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r39, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Shape r40, @org.jetbrains.annotations.Nullable androidx.compose.foundation.BorderStroke r41, @org.jetbrains.annotations.Nullable androidx.compose.material.ChipColors r42, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r43, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r44, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r45, final int r46, final int r47) {
        /*
            Method dump skipped, instruction units count: 665
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ChipKt.Chip(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.foundation.BorderStroke, androidx.compose.material.ChipColors, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long Chip$lambda$1(State<Color> state) {
        return state.getValue().m1614unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0365 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0121  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void FilterChip(final boolean r44, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function0<kotlin.Unit> r45, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r46, boolean r47, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r48, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Shape r49, @org.jetbrains.annotations.Nullable androidx.compose.foundation.BorderStroke r50, @org.jetbrains.annotations.Nullable androidx.compose.material.SelectableChipColors r51, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r52, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r53, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r54, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r55, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r56, final int r57, final int r58, final int r59) {
        /*
            Method dump skipped, instruction units count: 896
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ChipKt.FilterChip(boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.foundation.BorderStroke, androidx.compose.material.SelectableChipColors, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
