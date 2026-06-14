package androidx.compose.material;

import androidx.compose.runtime.State;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0004\u001aQ\u0010\r\u001a\u00020\n2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a^\u0010\u0017\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u000f2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a\"\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019H\u0000ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\"\u0017\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001f\u0010 \"\u001d\u0010!\u001a\u00020\u001e8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b\"\u0010#\"\u0017\u0010$\u001a\u00020\u001e8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b$\u0010 \"\u001d\u0010%\u001a\u00020\u001e8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010#\"\u0017\u0010'\u001a\u00020\u001e8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b'\u0010 \"\u0017\u0010(\u001a\u00020\u001e8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b(\u0010 \"\u0017\u0010)\u001a\u00020\u001e8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b)\u0010 \"\u0014\u0010+\u001a\u00020*8\u0000X\u0080T¢\u0006\u0006\n\u0004\b+\u0010,\"\u0014\u0010-\u001a\u00020*8\u0000X\u0080T¢\u0006\u0006\n\u0004\b-\u0010,\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006."}, d2 = {"Landroidx/compose/animation/core/MutableTransitionState;", "", "expandedStates", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/ui/graphics/TransformOrigin;", "transformOriginState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "", "Landroidx/compose/runtime/Composable;", "content", "DropdownMenuContent", "(Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function0;", "onClick", "enabled", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/foundation/layout/RowScope;", "DropdownMenuItemContent", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/unit/IntRect;", "parentBounds", "menuBounds", "calculateTransformOrigin", "(Landroidx/compose/ui/unit/IntRect;Landroidx/compose/ui/unit/IntRect;)J", "Landroidx/compose/ui/unit/Dp;", "MenuElevation", "F", "MenuVerticalMargin", "getMenuVerticalMargin", "()F", "DropdownMenuItemHorizontalPadding", "DropdownMenuVerticalPadding", "getDropdownMenuVerticalPadding", "DropdownMenuItemDefaultMinWidth", "DropdownMenuItemDefaultMaxWidth", "DropdownMenuItemDefaultMinHeight", "", "InTransitionDuration", "I", "OutTransitionDuration", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class MenuKt {
    private static final float DropdownMenuItemDefaultMinHeight;
    private static final float DropdownMenuVerticalPadding;
    public static final int InTransitionDuration = 120;
    private static final float MenuElevation;
    private static final float MenuVerticalMargin;
    public static final int OutTransitionDuration = 75;
    private static final float DropdownMenuItemHorizontalPadding = Dp.m3951constructorimpl(16);
    private static final float DropdownMenuItemDefaultMinWidth = Dp.m3951constructorimpl(112);
    private static final float DropdownMenuItemDefaultMaxWidth = Dp.m3951constructorimpl(280);

    static {
        float f10 = 8;
        MenuElevation = Dp.m3951constructorimpl(f10);
        float f11 = 48;
        MenuVerticalMargin = Dp.m3951constructorimpl(f11);
        DropdownMenuVerticalPadding = Dp.m3951constructorimpl(f10);
        DropdownMenuItemDefaultMinHeight = Dp.m3951constructorimpl(f11);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0243 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0239  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void DropdownMenuContent(@org.jetbrains.annotations.NotNull final androidx.compose.animation.core.MutableTransitionState<java.lang.Boolean> r22, @org.jetbrains.annotations.NotNull final androidx.compose.runtime.MutableState<androidx.compose.ui.graphics.TransformOrigin> r23, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r24, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r25, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instruction units count: 591
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.MenuKt.DropdownMenuContent(androidx.compose.animation.core.MutableTransitionState, androidx.compose.runtime.MutableState, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float DropdownMenuContent$lambda$1(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float DropdownMenuContent$lambda$3(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0231 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b0  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void DropdownMenuItemContent(@org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function0<kotlin.Unit> r22, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r23, boolean r24, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.PaddingValues r25, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r26, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r27, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r28, final int r29, final int r30) {
        /*
            Method dump skipped, instruction units count: 578
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.MenuKt.DropdownMenuItemContent(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long calculateTransformOrigin(@org.jetbrains.annotations.NotNull androidx.compose.ui.unit.IntRect r5, @org.jetbrains.annotations.NotNull androidx.compose.ui.unit.IntRect r6) {
        /*
            java.lang.String r0 = "parentBounds"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "menuBounds"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            int r0 = r6.getLeft()
            int r1 = r5.getRight()
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            if (r0 < r1) goto L19
        L17:
            r0 = r3
            goto L53
        L19:
            int r0 = r6.getRight()
            int r1 = r5.getLeft()
            if (r0 > r1) goto L25
            r0 = r2
            goto L53
        L25:
            int r0 = r6.getWidth()
            if (r0 != 0) goto L2c
            goto L17
        L2c:
            int r0 = r5.getLeft()
            int r1 = r6.getLeft()
            int r0 = java.lang.Math.max(r0, r1)
            int r1 = r5.getRight()
            int r4 = r6.getRight()
            int r1 = java.lang.Math.min(r1, r4)
            int r0 = r0 + r1
            int r0 = r0 / 2
            int r1 = r6.getLeft()
            int r0 = r0 - r1
            float r0 = (float) r0
            int r1 = r6.getWidth()
            float r1 = (float) r1
            float r0 = r0 / r1
        L53:
            int r1 = r6.getTop()
            int r4 = r5.getBottom()
            if (r1 < r4) goto L5f
        L5d:
            r2 = r3
            goto L99
        L5f:
            int r1 = r6.getBottom()
            int r4 = r5.getTop()
            if (r1 > r4) goto L6a
            goto L99
        L6a:
            int r1 = r6.getHeight()
            if (r1 != 0) goto L71
            goto L5d
        L71:
            int r1 = r5.getTop()
            int r2 = r6.getTop()
            int r1 = java.lang.Math.max(r1, r2)
            int r5 = r5.getBottom()
            int r2 = r6.getBottom()
            int r5 = java.lang.Math.min(r5, r2)
            int r1 = r1 + r5
            int r1 = r1 / 2
            int r5 = r6.getTop()
            int r1 = r1 - r5
            float r5 = (float) r1
            int r6 = r6.getHeight()
            float r6 = (float) r6
            float r2 = r5 / r6
        L99:
            long r5 = androidx.compose.ui.graphics.TransformOriginKt.TransformOrigin(r0, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.MenuKt.calculateTransformOrigin(androidx.compose.ui.unit.IntRect, androidx.compose.ui.unit.IntRect):long");
    }

    public static final float getDropdownMenuVerticalPadding() {
        return DropdownMenuVerticalPadding;
    }

    public static final float getMenuVerticalMargin() {
        return MenuVerticalMargin;
    }
}
