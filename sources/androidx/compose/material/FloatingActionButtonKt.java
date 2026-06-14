package androidx.compose.material;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0089\u0001\u0010\u0006\u001a\u00020\u00072\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0002\b\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\b\b\u0002\u0010\f\u001a\u00020\r2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t¢\u0006\u0002\b\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001ar\u0010\u001a\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00172\u0011\u0010\u001b\u001a\r\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0002\b\nH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0004\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0005\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"ExtendedFabIconPadding", "Landroidx/compose/ui/unit/Dp;", "F", "ExtendedFabSize", "ExtendedFabTextPadding", "FabSize", "ExtendedFloatingActionButton", "", "text", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "onClick", "modifier", "Landroidx/compose/ui/Modifier;", "icon", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "shape", "Landroidx/compose/ui/graphics/Shape;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "elevation", "Landroidx/compose/material/FloatingActionButtonElevation;", "ExtendedFloatingActionButton-wqdebIU", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material/FloatingActionButtonElevation;Landroidx/compose/runtime/Composer;II)V", "FloatingActionButton", "content", "FloatingActionButton-bogVsAg", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material/FloatingActionButtonElevation;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class FloatingActionButtonKt {
    private static final float FabSize = Dp.m3951constructorimpl(56);
    private static final float ExtendedFabSize = Dp.m3951constructorimpl(48);
    private static final float ExtendedFabIconPadding = Dp.m3951constructorimpl(12);
    private static final float ExtendedFabTextPadding = Dp.m3951constructorimpl(20);

    /* JADX WARN: Removed duplicated region for block: B:100:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011b  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: ExtendedFloatingActionButton-wqdebIU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1039ExtendedFloatingActionButtonwqdebIU(@org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r26, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function0<kotlin.Unit> r27, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r28, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r29, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r30, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Shape r31, long r32, long r34, @org.jetbrains.annotations.Nullable androidx.compose.material.FloatingActionButtonElevation r36, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instruction units count: 688
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.FloatingActionButtonKt.m1039ExtendedFloatingActionButtonwqdebIU(kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.material.FloatingActionButtonElevation, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0254 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0117  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: FloatingActionButton-bogVsAg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1040FloatingActionButtonbogVsAg(@org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function0<kotlin.Unit> r21, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r22, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r23, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Shape r24, long r25, long r27, @org.jetbrains.annotations.Nullable androidx.compose.material.FloatingActionButtonElevation r29, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r30, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instruction units count: 613
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.FloatingActionButtonKt.m1040FloatingActionButtonbogVsAg(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.material.FloatingActionButtonElevation, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }
}
