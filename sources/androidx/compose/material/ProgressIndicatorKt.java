package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.graphics.drawscope.b;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.amazon.device.ads.DtbConstants;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\u001a3\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\u0005H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001aG\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\u00052\b\b\u0002\u0010'\u001a\u00020#2\b\b\u0002\u0010(\u001a\u00020)H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001a;\u0010\u001e\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020\u00012\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\u0005H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b-\u0010.\u001aO\u0010\u001e\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020\u00012\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\u00052\b\b\u0002\u0010'\u001a\u00020#2\b\b\u0002\u0010(\u001a\u00020)H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b/\u00100\u001a3\u00101\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010'\u001a\u00020#H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b2\u00103\u001a=\u00101\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010'\u001a\u00020#2\b\b\u0002\u0010(\u001a\u00020)H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001a;\u00101\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020\u00012\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010'\u001a\u00020#H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b6\u00107\u001aE\u00101\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020\u00012\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010'\u001a\u00020#2\b\b\u0002\u0010(\u001a\u00020)H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b8\u00109\u001a9\u0010:\u001a\u00020\u001f*\u00020;2\u0006\u0010<\u001a\u00020\u00012\u0006\u0010=\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#2\u0006\u0010>\u001a\u00020?H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b@\u0010A\u001a)\u0010B\u001a\u00020\u001f*\u00020;2\u0006\u0010\"\u001a\u00020#2\u0006\u0010>\u001a\u00020?H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bC\u0010D\u001a9\u0010E\u001a\u00020\u001f*\u00020;2\u0006\u0010<\u001a\u00020\u00012\u0006\u0010=\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#2\u0006\u0010>\u001a\u00020?H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bF\u0010A\u001aA\u0010G\u001a\u00020\u001f*\u00020;2\u0006\u0010<\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\u00052\u0006\u0010=\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#2\u0006\u0010>\u001a\u00020?H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bH\u0010I\u001aA\u0010J\u001a\u00020\u001f*\u00020;2\u0006\u0010K\u001a\u00020\u00012\u0006\u0010L\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00012\u0006\u0010(\u001a\u00020)H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bM\u0010N\u001a1\u0010O\u001a\u00020\u001f*\u00020;2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00012\u0006\u0010(\u001a\u00020)H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bP\u0010Q\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0013\u0010\u0004\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0006\"\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u0013\u0010\u0012\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0006\"\u0013\u0010\u0013\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0006\"\u000e\u0010\u0014\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006R"}, d2 = {"BaseRotationAngle", "", "CircularEasing", "Landroidx/compose/animation/core/CubicBezierEasing;", "CircularIndicatorDiameter", "Landroidx/compose/ui/unit/Dp;", "F", "FirstLineHeadDelay", "", "FirstLineHeadDuration", "FirstLineHeadEasing", "FirstLineTailDelay", "FirstLineTailDuration", "FirstLineTailEasing", "HeadAndTailAnimationDuration", "HeadAndTailDelayDuration", "JumpRotationAngle", "LinearAnimationDuration", "LinearIndicatorHeight", "LinearIndicatorWidth", "RotationAngleOffset", "RotationDuration", "RotationsPerCycle", "SecondLineHeadDelay", "SecondLineHeadDuration", "SecondLineHeadEasing", "SecondLineTailDelay", "SecondLineTailDuration", "SecondLineTailEasing", "StartAngleOffset", "CircularProgressIndicator", "", "modifier", "Landroidx/compose/ui/Modifier;", "color", "Landroidx/compose/ui/graphics/Color;", "strokeWidth", "CircularProgressIndicator-aM-cp0Q", "(Landroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V", "backgroundColor", "strokeCap", "Landroidx/compose/ui/graphics/StrokeCap;", "CircularProgressIndicator-LxG7B9w", "(Landroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V", "progress", "CircularProgressIndicator-MBs18nI", "(FLandroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V", "CircularProgressIndicator-DUhRLBM", "(FLandroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator", "LinearProgressIndicator-RIQooxk", "(Landroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator-2cYBFYY", "(Landroidx/compose/ui/Modifier;JJILandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator-eaDK9VM", "(FLandroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator-_5eSR-E", "(FLandroidx/compose/ui/Modifier;JJILandroidx/compose/runtime/Composer;II)V", "drawCircularIndicator", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "startAngle", "sweep", "stroke", "Landroidx/compose/ui/graphics/drawscope/Stroke;", "drawCircularIndicator-42QJj7c", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "drawCircularIndicatorBackground", "drawCircularIndicatorBackground-bw27NRU", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "drawDeterminateCircularIndicator", "drawDeterminateCircularIndicator-42QJj7c", "drawIndeterminateCircularIndicator", "drawIndeterminateCircularIndicator-hrjfTZI", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "drawLinearIndicator", "startFraction", "endFraction", "drawLinearIndicator-qYKTg0g", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJFI)V", "drawLinearIndicatorBackground", "drawLinearIndicatorBackground-AZGd3zU", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFI)V", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ProgressIndicatorKt {
    private static final float BaseRotationAngle = 286.0f;
    private static final int FirstLineHeadDelay = 0;
    private static final int FirstLineHeadDuration = 750;
    private static final int FirstLineTailDelay = 333;
    private static final int FirstLineTailDuration = 850;
    private static final int HeadAndTailAnimationDuration = 666;
    private static final int HeadAndTailDelayDuration = 666;
    private static final float JumpRotationAngle = 290.0f;
    private static final int LinearAnimationDuration = 1800;
    private static final float RotationAngleOffset = 216.0f;
    private static final int RotationDuration = 1332;
    private static final int RotationsPerCycle = 5;
    private static final int SecondLineHeadDelay = 1000;
    private static final int SecondLineHeadDuration = 567;
    private static final int SecondLineTailDelay = 1267;
    private static final int SecondLineTailDuration = 533;
    private static final float StartAngleOffset = -90.0f;
    private static final float LinearIndicatorHeight = ProgressIndicatorDefaults.INSTANCE.m1074getStrokeWidthD9Ej5fM();
    private static final float LinearIndicatorWidth = Dp.m3951constructorimpl(240);
    private static final float CircularIndicatorDiameter = Dp.m3951constructorimpl(40);

    @NotNull
    private static final CubicBezierEasing FirstLineHeadEasing = new CubicBezierEasing(0.2f, 0.0f, 0.8f, 1.0f);

    @NotNull
    private static final CubicBezierEasing FirstLineTailEasing = new CubicBezierEasing(0.4f, 0.0f, 1.0f, 1.0f);

    @NotNull
    private static final CubicBezierEasing SecondLineHeadEasing = new CubicBezierEasing(0.0f, 0.0f, 0.65f, 1.0f);

    @NotNull
    private static final CubicBezierEasing SecondLineTailEasing = new CubicBezierEasing(0.1f, 0.0f, 0.45f, 1.0f);

    @NotNull
    private static final CubicBezierEasing CircularEasing = new CubicBezierEasing(0.4f, 0.0f, 0.2f, 1.0f);

    /* JADX WARN: Removed duplicated region for block: B:101:0x018c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0181  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* JADX INFO: renamed from: CircularProgressIndicator-DUhRLBM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1075CircularProgressIndicatorDUhRLBM(final float r18, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r19, long r20, float r22, long r23, int r25, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ProgressIndicatorKt.m1075CircularProgressIndicatorDUhRLBM(float, androidx.compose.ui.Modifier, long, float, long, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x025f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0260  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* JADX INFO: renamed from: CircularProgressIndicator-LxG7B9w, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1076CircularProgressIndicatorLxG7B9w(@org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r26, long r27, float r29, long r30, int r32, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instruction units count: 619
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ProgressIndicatorKt.m1076CircularProgressIndicatorLxG7B9w(androidx.compose.ui.Modifier, long, float, long, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x010e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010f  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* JADX INFO: renamed from: CircularProgressIndicator-MBs18nI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void m1077CircularProgressIndicatorMBs18nI(final float r18, androidx.compose.ui.Modifier r19, long r20, float r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ProgressIndicatorKt.m1077CircularProgressIndicatorMBs18nI(float, androidx.compose.ui.Modifier, long, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ee A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ef  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* JADX INFO: renamed from: CircularProgressIndicator-aM-cp0Q, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void m1078CircularProgressIndicatoraMcp0Q(androidx.compose.ui.Modifier r16, long r17, float r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ProgressIndicatorKt.m1078CircularProgressIndicatoraMcp0Q(androidx.compose.ui.Modifier, long, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float CircularProgressIndicator_LxG7B9w$lambda$10(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float CircularProgressIndicator_LxG7B9w$lambda$11(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int CircularProgressIndicator_LxG7B9w$lambda$8(State<Integer> state) {
        return state.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float CircularProgressIndicator_LxG7B9w$lambda$9(State<Float> state) {
        return state.getValue().floatValue();
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* JADX INFO: renamed from: LinearProgressIndicator-2cYBFYY, reason: not valid java name */
    public static final void m1079LinearProgressIndicator2cYBFYY(@Nullable Modifier modifier, long j10, long j11, int i10, @Nullable Composer composer, final int i11, final int i12) {
        Modifier modifier2;
        int i13;
        long j12;
        long j13;
        int iM1927getButtKaPHkGw;
        final int i14;
        final long j14;
        final long j15;
        Composer composer2;
        final long j16;
        final int i15;
        final long j17;
        Composer composerStartRestartGroup = composer.startRestartGroup(1501635280);
        int i16 = i12 & 1;
        if (i16 != 0) {
            i13 = i11 | 6;
            modifier2 = modifier;
        } else if ((i11 & 14) == 0) {
            modifier2 = modifier;
            i13 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i11;
        } else {
            modifier2 = modifier;
            i13 = i11;
        }
        if ((i11 & 112) == 0) {
            if ((i12 & 2) == 0) {
                j12 = j10;
                int i17 = composerStartRestartGroup.changed(j12) ? 32 : 16;
                i13 |= i17;
            } else {
                j12 = j10;
            }
            i13 |= i17;
        } else {
            j12 = j10;
        }
        if ((i11 & 896) == 0) {
            if ((i12 & 4) == 0) {
                j13 = j11;
                int i18 = composerStartRestartGroup.changed(j13) ? 256 : 128;
                i13 |= i18;
            } else {
                j13 = j11;
            }
            i13 |= i18;
        } else {
            j13 = j11;
        }
        if ((i11 & 7168) == 0) {
            if ((i12 & 8) == 0) {
                iM1927getButtKaPHkGw = i10;
                int i19 = composerStartRestartGroup.changed(iM1927getButtKaPHkGw) ? 2048 : 1024;
                i13 |= i19;
            } else {
                iM1927getButtKaPHkGw = i10;
            }
            i13 |= i19;
        } else {
            iM1927getButtKaPHkGw = i10;
        }
        if ((i13 & 5851) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
            j16 = j13;
            i15 = iM1927getButtKaPHkGw;
            j17 = j12;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i11 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i16 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                long jM962getPrimary0d7_KjU = (i12 & 2) != 0 ? MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m962getPrimary0d7_KjU() : j12;
                long jM1603copywmQWz5c$default = (i12 & 4) != 0 ? Color.m1603copywmQWz5c$default(jM962getPrimary0d7_KjU, 0.24f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
                if ((i12 & 8) != 0) {
                    iM1927getButtKaPHkGw = StrokeCap.INSTANCE.m1927getButtKaPHkGw();
                }
                i14 = iM1927getButtKaPHkGw;
                j14 = jM962getPrimary0d7_KjU;
                j15 = jM1603copywmQWz5c$default;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                i14 = iM1927getButtKaPHkGw;
                j14 = j12;
                j15 = j13;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1501635280, i11, -1, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:106)");
            }
            InfiniteTransition infiniteTransitionRememberInfiniteTransition = InfiniteTransitionKt.rememberInfiniteTransition(composerStartRestartGroup, 0);
            InfiniteRepeatableSpec infiniteRepeatableSpecM110infiniteRepeatable9IiC70o$default = AnimationSpecKt.m110infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    invoke2(keyframesSpecConfig);
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
                    Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                    keyframes.setDurationMillis(1800);
                    keyframes.with(keyframes.at(Float.valueOf(0.0f), 0), ProgressIndicatorKt.FirstLineHeadEasing);
                    keyframes.at(Float.valueOf(1.0f), UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS);
                }
            }), null, 0L, 6, null);
            int i20 = InfiniteTransition.$stable;
            int i21 = InfiniteRepeatableSpec.$stable;
            final State stateAnimateFloat = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, 1.0f, infiniteRepeatableSpecM110infiniteRepeatable9IiC70o$default, composerStartRestartGroup, i20 | 432 | (i21 << 9));
            final State stateAnimateFloat2 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, 1.0f, AnimationSpecKt.m110infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$firstLineTail$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    invoke2(keyframesSpecConfig);
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
                    Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                    keyframes.setDurationMillis(1800);
                    keyframes.with(keyframes.at(Float.valueOf(0.0f), 333), ProgressIndicatorKt.FirstLineTailEasing);
                    keyframes.at(Float.valueOf(1.0f), 1183);
                }
            }), null, 0L, 6, null), composerStartRestartGroup, i20 | 432 | (i21 << 9));
            final State stateAnimateFloat3 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, 1.0f, AnimationSpecKt.m110infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$secondLineHead$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    invoke2(keyframesSpecConfig);
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
                    Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                    keyframes.setDurationMillis(1800);
                    keyframes.with(keyframes.at(Float.valueOf(0.0f), 1000), ProgressIndicatorKt.SecondLineHeadEasing);
                    keyframes.at(Float.valueOf(1.0f), 1567);
                }
            }), null, 0L, 6, null), composerStartRestartGroup, i20 | 432 | (i21 << 9));
            final State stateAnimateFloat4 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, 1.0f, AnimationSpecKt.m110infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$secondLineTail$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    invoke2(keyframesSpecConfig);
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
                    Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                    keyframes.setDurationMillis(1800);
                    keyframes.with(keyframes.at(Float.valueOf(0.0f), 1267), ProgressIndicatorKt.SecondLineTailEasing);
                    keyframes.at(Float.valueOf(1.0f), 1800);
                }
            }), null, 0L, 6, null), composerStartRestartGroup, i20 | 432 | (i21 << 9));
            Modifier modifierM463sizeVpY3zN4 = SizeKt.m463sizeVpY3zN4(ProgressSemanticsKt.progressSemantics(modifier2), LinearIndicatorWidth, LinearIndicatorHeight);
            Object[] objArr = {Color.m1594boximpl(j15), StrokeCap.m1920boximpl(i14), stateAnimateFloat, stateAnimateFloat2, Color.m1594boximpl(j14), stateAnimateFloat3, stateAnimateFloat4};
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            boolean zChanged = false;
            for (int i22 = 0; i22 < 7; i22++) {
                zChanged |= composerStartRestartGroup.changed(objArr[i22]);
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.f93236a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull DrawScope Canvas) {
                        DrawScope drawScope;
                        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                        float fM1437getHeightimpl = Size.m1437getHeightimpl(Canvas.mo2040getSizeNHjbRc());
                        ProgressIndicatorKt.m1093drawLinearIndicatorBackgroundAZGd3zU(Canvas, j15, fM1437getHeightimpl, i14);
                        if (ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$1(stateAnimateFloat) - ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$2(stateAnimateFloat2) > 0.0f) {
                            drawScope = Canvas;
                            ProgressIndicatorKt.m1092drawLinearIndicatorqYKTg0g(drawScope, ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$1(stateAnimateFloat), ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$2(stateAnimateFloat2), j14, fM1437getHeightimpl, i14);
                        } else {
                            drawScope = Canvas;
                        }
                        if (ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$3(stateAnimateFloat3) - ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$4(stateAnimateFloat4) > 0.0f) {
                            ProgressIndicatorKt.m1092drawLinearIndicatorqYKTg0g(drawScope, ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$3(stateAnimateFloat3), ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$4(stateAnimateFloat4), j14, fM1437getHeightimpl, i14);
                        }
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(modifierM463sizeVpY3zN4, (Function1) objRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer2 = composerStartRestartGroup;
            j16 = j15;
            i15 = i14;
            j17 = j14;
        }
        final Modifier modifier3 = modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.f93236a;
            }

            public final void invoke(@Nullable Composer composer3, int i23) {
                ProgressIndicatorKt.m1079LinearProgressIndicator2cYBFYY(modifier3, j17, j16, i15, composer3, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
            }
        });
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* JADX INFO: renamed from: LinearProgressIndicator-RIQooxk, reason: not valid java name */
    public static final /* synthetic */ void m1080LinearProgressIndicatorRIQooxk(Modifier modifier, long j10, long j11, Composer composer, final int i10, final int i11) {
        Modifier modifier2;
        int i12;
        long jM962getPrimary0d7_KjU;
        long j12;
        long jM1603copywmQWz5c$default;
        long j13;
        Modifier modifier3;
        final Modifier modifier4;
        final long j14;
        final long j15;
        Composer composerStartRestartGroup = composer.startRestartGroup(-819397058);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            modifier2 = modifier;
        } else if ((i10 & 14) == 0) {
            modifier2 = modifier;
            i12 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i10;
        } else {
            modifier2 = modifier;
            i12 = i10;
        }
        if ((i10 & 112) == 0) {
            if ((i11 & 2) == 0) {
                jM962getPrimary0d7_KjU = j10;
                int i14 = composerStartRestartGroup.changed(jM962getPrimary0d7_KjU) ? 32 : 16;
                i12 |= i14;
            } else {
                jM962getPrimary0d7_KjU = j10;
            }
            i12 |= i14;
        } else {
            jM962getPrimary0d7_KjU = j10;
        }
        if ((i10 & 896) == 0) {
            if ((i11 & 4) == 0) {
                j12 = j11;
                int i15 = composerStartRestartGroup.changed(j12) ? 256 : 128;
                i12 |= i15;
            } else {
                j12 = j11;
            }
            i12 |= i15;
        } else {
            j12 = j11;
        }
        if ((i12 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier4 = modifier2;
            j14 = jM962getPrimary0d7_KjU;
            j15 = j12;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                Modifier modifier5 = i13 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i11 & 2) != 0) {
                    jM962getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m962getPrimary0d7_KjU();
                    i12 &= -113;
                }
                long j16 = jM962getPrimary0d7_KjU;
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    modifier3 = modifier5;
                    jM1603copywmQWz5c$default = Color.m1603copywmQWz5c$default(j16, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                    j13 = j16;
                } else {
                    jM1603copywmQWz5c$default = j12;
                    j13 = j16;
                    modifier3 = modifier5;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                }
                jM1603copywmQWz5c$default = j12;
                modifier3 = modifier2;
                j13 = jM962getPrimary0d7_KjU;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-819397058, i12, -1, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:205)");
            }
            m1079LinearProgressIndicator2cYBFYY(modifier3, j13, jM1603copywmQWz5c$default, StrokeCap.INSTANCE.m1927getButtKaPHkGw(), composerStartRestartGroup, i12 & 1022, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            j14 = j13;
            j15 = jM1603copywmQWz5c$default;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.f93236a;
            }

            public final void invoke(@Nullable Composer composer2, int i16) {
                ProgressIndicatorKt.m1080LinearProgressIndicatorRIQooxk(modifier4, j14, j15, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0175 A[LOOP:0: B:88:0x0173->B:89:0x0175, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a5  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* JADX INFO: renamed from: LinearProgressIndicator-_5eSR-E, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1081LinearProgressIndicator_5eSRE(final float r26, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r27, long r28, long r30, int r32, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ProgressIndicatorKt.m1081LinearProgressIndicator_5eSRE(float, androidx.compose.ui.Modifier, long, long, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0117 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0118  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* JADX INFO: renamed from: LinearProgressIndicator-eaDK9VM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void m1082LinearProgressIndicatoreaDK9VM(final float r24, androidx.compose.ui.Modifier r25, long r26, long r28, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ProgressIndicatorKt.m1082LinearProgressIndicatoreaDK9VM(float, androidx.compose.ui.Modifier, long, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LinearProgressIndicator_2cYBFYY$lambda$1(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LinearProgressIndicator_2cYBFYY$lambda$2(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LinearProgressIndicator_2cYBFYY$lambda$3(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LinearProgressIndicator_2cYBFYY$lambda$4(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: renamed from: drawCircularIndicator-42QJj7c, reason: not valid java name */
    private static final void m1088drawCircularIndicator42QJj7c(DrawScope drawScope, float f10, float f11, long j10, Stroke stroke) {
        float f12 = 2;
        float width = stroke.getWidth() / f12;
        float fM1440getWidthimpl = Size.m1440getWidthimpl(drawScope.mo2040getSizeNHjbRc()) - (f12 * width);
        b.v(drawScope, j10, f10, f11, false, OffsetKt.Offset(width, width), androidx.compose.ui.geometry.SizeKt.Size(fM1440getWidthimpl, fM1440getWidthimpl), 0.0f, stroke, null, 0, 832, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: drawCircularIndicatorBackground-bw27NRU, reason: not valid java name */
    public static final void m1089drawCircularIndicatorBackgroundbw27NRU(DrawScope drawScope, long j10, Stroke stroke) {
        m1088drawCircularIndicator42QJj7c(drawScope, 0.0f, 360.0f, j10, stroke);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: drawDeterminateCircularIndicator-42QJj7c, reason: not valid java name */
    public static final void m1090drawDeterminateCircularIndicator42QJj7c(DrawScope drawScope, float f10, float f11, long j10, Stroke stroke) {
        m1088drawCircularIndicator42QJj7c(drawScope, f10, f11, j10, stroke);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: drawIndeterminateCircularIndicator-hrjfTZI, reason: not valid java name */
    public static final void m1091drawIndeterminateCircularIndicatorhrjfTZI(DrawScope drawScope, float f10, float f11, float f12, long j10, Stroke stroke) {
        m1088drawCircularIndicator42QJj7c(drawScope, f10 + (StrokeCap.m1923equalsimpl0(stroke.getCap(), StrokeCap.INSTANCE.m1927getButtKaPHkGw()) ? 0.0f : ((f11 / Dp.m3951constructorimpl(CircularIndicatorDiameter / 2)) * 57.29578f) / 2.0f), Math.max(f12, 0.1f), j10, stroke);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: drawLinearIndicator-qYKTg0g, reason: not valid java name */
    public static final void m1092drawLinearIndicatorqYKTg0g(DrawScope drawScope, float f10, float f11, long j10, float f12, int i10) {
        float fM1440getWidthimpl = Size.m1440getWidthimpl(drawScope.mo2040getSizeNHjbRc());
        float fM1437getHeightimpl = Size.m1437getHeightimpl(drawScope.mo2040getSizeNHjbRc());
        float f13 = 2;
        float f14 = fM1437getHeightimpl / f13;
        boolean z10 = drawScope.getLayoutDirection() == LayoutDirection.Ltr;
        float f15 = (z10 ? f10 : 1.0f - f11) * fM1440getWidthimpl;
        float f16 = (z10 ? f11 : 1.0f - f10) * fM1440getWidthimpl;
        if (StrokeCap.m1923equalsimpl0(i10, StrokeCap.INSTANCE.m1927getButtKaPHkGw()) || fM1437getHeightimpl > fM1440getWidthimpl) {
            b.C(drawScope, j10, OffsetKt.Offset(f15, f14), OffsetKt.Offset(f16, f14), f12, 0, null, 0.0f, null, 0, 496, null);
            return;
        }
        float f17 = f12 / f13;
        bg.b bVarB = g.b(f17, fM1440getWidthimpl - f17);
        float fFloatValue = ((Number) g.q(Float.valueOf(f15), bVarB)).floatValue();
        float fFloatValue2 = ((Number) g.q(Float.valueOf(f16), bVarB)).floatValue();
        if (Math.abs(f11 - f10) > 0.0f) {
            b.C(drawScope, j10, OffsetKt.Offset(fFloatValue, f14), OffsetKt.Offset(fFloatValue2, f14), f12, i10, null, 0.0f, null, 0, DtbConstants.DEFAULT_PLAYER_HEIGHT, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: drawLinearIndicatorBackground-AZGd3zU, reason: not valid java name */
    public static final void m1093drawLinearIndicatorBackgroundAZGd3zU(DrawScope drawScope, long j10, float f10, int i10) {
        m1092drawLinearIndicatorqYKTg0g(drawScope, 0.0f, 1.0f, j10, f10, i10);
    }
}
