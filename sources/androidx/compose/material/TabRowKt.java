package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0093\u0001\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042$\b\u0002\u0010\r\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0002\b\u000b¢\u0006\u0002\b\f2\u0018\b\u0002\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\n0\u000e¢\u0006\u0002\b\u000b¢\u0006\u0002\b\f2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\n0\u000e¢\u0006\u0002\b\u000b¢\u0006\u0002\b\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u009d\u0001\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00142$\b\u0002\u0010\r\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0002\b\u000b¢\u0006\u0002\b\f2\u0018\b\u0002\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\n0\u000e¢\u0006\u0002\b\u000b¢\u0006\u0002\b\f2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\n0\u000e¢\u0006\u0002\b\u000b¢\u0006\u0002\b\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\"\u0017\u0010\u0019\u001a\u00020\u00148\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\"\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"", "selectedTabIndex", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "contentColor", "Lkotlin/Function1;", "", "Landroidx/compose/material/TabPosition;", "", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/ui/UiComposable;", "indicator", "Lkotlin/Function0;", "divider", "tabs", "TabRow-pAZo6Ak", "(ILandroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "TabRow", "Landroidx/compose/ui/unit/Dp;", "edgePadding", "ScrollableTabRow-sKfQg0A", "(ILandroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ScrollableTabRow", "ScrollableTabRowMinimumTabWidth", "F", "Landroidx/compose/animation/core/AnimationSpec;", "", "ScrollableTabRowScrollSpec", "Landroidx/compose/animation/core/AnimationSpec;", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TabRowKt {
    private static final float ScrollableTabRowMinimumTabWidth = Dp.m3951constructorimpl(90);

    @NotNull
    private static final AnimationSpec<Float> ScrollableTabRowScrollSpec = AnimationSpecKt.tween$default(250, 0, EasingKt.getFastOutSlowInEasing(), 2, null);

    /* JADX WARN: Removed duplicated region for block: B:106:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01f4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0115  */
    @androidx.compose.runtime.Composable
    @androidx.compose.ui.UiComposable
    /* JADX INFO: renamed from: ScrollableTabRow-sKfQg0A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1159ScrollableTabRowsKfQg0A(final int r25, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r26, long r27, long r29, float r31, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function3<? super java.util.List<androidx.compose.material.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r32, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r33, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r34, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instruction units count: 514
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TabRowKt.m1159ScrollableTabRowsKfQg0A(int, androidx.compose.ui.Modifier, long, long, float, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0116  */
    @androidx.compose.runtime.Composable
    @androidx.compose.ui.UiComposable
    /* JADX INFO: renamed from: TabRow-pAZo6Ak, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1160TabRowpAZo6Ak(final int r23, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r24, long r25, long r27, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function3<? super java.util.List<androidx.compose.material.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r29, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r30, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r31, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TabRowKt.m1160TabRowpAZo6Ak(int, androidx.compose.ui.Modifier, long, long, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }
}
