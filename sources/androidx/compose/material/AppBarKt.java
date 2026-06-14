package androidx.compose.material;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a\u0082\u0001\u0010\u0011\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0015\b\u0002\u0010\u0006\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\u0019\b\u0002\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a`\u0010\u0011\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001al\u0010\u001b\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0018\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0082\b¢\u0006\u0004\b\u001e\u0010\u001f\u001a \u0010\"\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u001cH\u0080\b¢\u0006\u0004\b\"\u0010#\u001a3\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c0&2\u0006\u0010$\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u001cH\u0000¢\u0006\u0004\b'\u0010(\u001a`\u0010,\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u00172\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010+\"\u0017\u0010-\u001a\u00020\r8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b-\u0010.\"\u0017\u0010/\u001a\u00020\r8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b/\u0010.\"\u0014\u00100\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101\"\u0014\u00102\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00101\"\u0017\u00103\u001a\u00020\r8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b3\u0010.\"\u0017\u00104\u001a\u00020\r8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b4\u0010.\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00065"}, d2 = {"Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "title", "Landroidx/compose/ui/Modifier;", "modifier", "navigationIcon", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "actions", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "contentColor", "Landroidx/compose/ui/unit/Dp;", "elevation", "TopAppBar-xWeB9-s", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;JJFLandroidx/compose/runtime/Composer;II)V", "TopAppBar", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "content", "TopAppBar-HsRjFd4", "(Landroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/Shape;", "cutoutShape", "BottomAppBar-Y1yfwus", "(Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/graphics/Shape;FLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "BottomAppBar", "", "x", "square", "(F)F", "cutoutRadius", "verticalOffset", "calculateCutoutCircleYIntercept", "(FF)F", "controlPointX", "radius", "Lkotlin/Pair;", "calculateRoundedEdgeIntercept", "(FFF)Lkotlin/Pair;", "shape", "AppBar-celAv9A", "(JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "AppBar", "AppBarHeight", "F", "AppBarHorizontalPadding", "TitleInsetWithoutIcon", "Landroidx/compose/ui/Modifier;", "TitleIconModifier", "BottomAppBarCutoutOffset", "BottomAppBarRoundedEdgeRadius", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class AppBarKt {
    private static final float AppBarHeight = Dp.m3951constructorimpl(56);
    private static final float AppBarHorizontalPadding;
    private static final float BottomAppBarCutoutOffset;
    private static final float BottomAppBarRoundedEdgeRadius;

    @NotNull
    private static final Modifier TitleIconModifier;

    @NotNull
    private static final Modifier TitleInsetWithoutIcon;

    static {
        float f10 = 4;
        float fM3951constructorimpl = Dp.m3951constructorimpl(f10);
        AppBarHorizontalPadding = fM3951constructorimpl;
        Modifier.Companion companion = Modifier.INSTANCE;
        TitleInsetWithoutIcon = SizeKt.m466width3ABfNKs(companion, Dp.m3951constructorimpl(Dp.m3951constructorimpl(16) - fM3951constructorimpl));
        TitleIconModifier = SizeKt.m466width3ABfNKs(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), Dp.m3951constructorimpl(Dp.m3951constructorimpl(72) - fM3951constructorimpl));
        BottomAppBarCutoutOffset = Dp.m3951constructorimpl(8);
        BottomAppBarRoundedEdgeRadius = Dp.m3951constructorimpl(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x013b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x013c  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: AppBar-celAv9A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m892AppBarcelAv9A(final long r23, final long r25, final float r27, final androidx.compose.foundation.layout.PaddingValues r28, final androidx.compose.ui.graphics.Shape r29, androidx.compose.ui.Modifier r30, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AppBarKt.m892AppBarcelAv9A(long, long, float, androidx.compose.foundation.layout.PaddingValues, androidx.compose.ui.graphics.Shape, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01d9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0127  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: BottomAppBar-Y1yfwus, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m893BottomAppBarY1yfwus(@org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r22, long r23, long r25, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Shape r27, float r28, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.PaddingValues r29, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r30, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AppBarKt.m893BottomAppBarY1yfwus(androidx.compose.ui.Modifier, long, long, androidx.compose.ui.graphics.Shape, float, androidx.compose.foundation.layout.PaddingValues, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0188 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012c  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: TopAppBar-HsRjFd4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m894TopAppBarHsRjFd4(@org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r19, long r20, long r22, float r24, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.PaddingValues r25, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r26, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instruction units count: 407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AppBarKt.m894TopAppBarHsRjFd4(androidx.compose.ui.Modifier, long, long, float, androidx.compose.foundation.layout.PaddingValues, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0126  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: TopAppBar-xWeB9-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m895TopAppBarxWeB9s(@org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r25, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r26, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r27, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r28, long r29, long r31, float r33, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r34, final int r35, final int r36) {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AppBarKt.m895TopAppBarxWeB9s(kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, long, long, float, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final float calculateCutoutCircleYIntercept(float f10, float f11) {
        return -((float) Math.sqrt((f10 * f10) - (f11 * f11)));
    }

    @NotNull
    public static final Pair<Float, Float> calculateRoundedEdgeIntercept(float f10, float f11, float f12) {
        Float fValueOf;
        Float fValueOf2;
        Pair pair;
        Float fValueOf3;
        Float fValueOf4;
        float f13 = f11 * f11;
        float f14 = f12 * f12;
        float f15 = (f10 * f10) + f13;
        float f16 = f13 * f14 * (f15 - f14);
        float f17 = f10 * f14;
        double d10 = f16;
        float fSqrt = (f17 - ((float) Math.sqrt(d10))) / f15;
        float fSqrt2 = (f17 + ((float) Math.sqrt(d10))) / f15;
        float fSqrt3 = (float) Math.sqrt(f14 - (fSqrt * fSqrt));
        float fSqrt4 = (float) Math.sqrt(f14 - (fSqrt2 * fSqrt2));
        if (f11 > 0.0f) {
            if (fSqrt3 > fSqrt4) {
                fValueOf3 = Float.valueOf(fSqrt);
                fValueOf4 = Float.valueOf(fSqrt3);
            } else {
                fValueOf3 = Float.valueOf(fSqrt2);
                fValueOf4 = Float.valueOf(fSqrt4);
            }
            pair = TuplesKt.to(fValueOf3, fValueOf4);
        } else {
            if (fSqrt3 < fSqrt4) {
                fValueOf = Float.valueOf(fSqrt);
                fValueOf2 = Float.valueOf(fSqrt3);
            } else {
                fValueOf = Float.valueOf(fSqrt2);
                fValueOf2 = Float.valueOf(fSqrt4);
            }
            pair = TuplesKt.to(fValueOf, fValueOf2);
        }
        float fFloatValue = ((Number) pair.component1()).floatValue();
        float fFloatValue2 = ((Number) pair.component2()).floatValue();
        if (fFloatValue < f10) {
            fFloatValue2 = -fFloatValue2;
        }
        return TuplesKt.to(Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2));
    }

    private static final float square(float f10) {
        return f10 * f10;
    }
}
