package androidx.compose.material.pullrefresh;

import androidx.activity.s;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ColorsKt;
import androidx.compose.material.ExperimentalMaterialApi;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.SurfaceKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.graphics.drawscope.b;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.material.internal.ViewUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0002\u001a-\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001aM\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020!2\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\"\u001a\u00020\u001a2\b\b\u0002\u0010#\u001a\u00020\u001a2\b\b\u0002\u0010$\u001a\u00020!H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001aA\u0010'\u001a\u00020\u0016*\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u0013H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b/\u00100\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0013\u0010\u0003\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u0013\u0010\u0006\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u0013\u0010\u0007\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\"\u0013\u0010\n\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u0013\u0010\u000b\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u000e\u0010\f\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0013\u0010\u0011\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00061"}, d2 = {"AlphaTween", "Landroidx/compose/animation/core/TweenSpec;", "", "ArcRadius", "Landroidx/compose/ui/unit/Dp;", "F", "ArrowHeight", "ArrowWidth", "CrossfadeDurationMs", "", "Elevation", "IndicatorSize", "MaxAlpha", "MaxProgressArc", "MinAlpha", "SpinnerShape", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "StrokeWidth", "ArrowValues", "Landroidx/compose/material/pullrefresh/ArrowValues;", "progress", "CircularArrowIndicator", "", "state", "Landroidx/compose/material/pullrefresh/PullRefreshState;", "color", "Landroidx/compose/ui/graphics/Color;", "modifier", "Landroidx/compose/ui/Modifier;", "CircularArrowIndicator-iJQMabo", "(Landroidx/compose/material/pullrefresh/PullRefreshState;JLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "PullRefreshIndicator", "refreshing", "", "backgroundColor", "contentColor", "scale", "PullRefreshIndicator-jB83MbM", "(ZLandroidx/compose/material/pullrefresh/PullRefreshState;Landroidx/compose/ui/Modifier;JJZLandroidx/compose/runtime/Composer;II)V", "drawArrow", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "arrow", "Landroidx/compose/ui/graphics/Path;", "bounds", "Landroidx/compose/ui/geometry/Rect;", "alpha", "values", "drawArrow-Bx497Mc", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/geometry/Rect;JFLandroidx/compose/material/pullrefresh/ArrowValues;)V", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PullRefreshIndicatorKt {
    private static final int CrossfadeDurationMs = 100;
    private static final float MaxAlpha = 1.0f;
    private static final float MaxProgressArc = 0.8f;
    private static final float MinAlpha = 0.3f;
    private static final float IndicatorSize = Dp.m3951constructorimpl(40);

    @NotNull
    private static final RoundedCornerShape SpinnerShape = RoundedCornerShapeKt.getCircleShape();
    private static final float ArcRadius = Dp.m3951constructorimpl((float) 7.5d);
    private static final float StrokeWidth = Dp.m3951constructorimpl((float) 2.5d);
    private static final float ArrowWidth = Dp.m3951constructorimpl(10);
    private static final float ArrowHeight = Dp.m3951constructorimpl(5);
    private static final float Elevation = Dp.m3951constructorimpl(6);

    @NotNull
    private static final TweenSpec<Float> AlphaTween = AnimationSpecKt.tween$default(300, 0, EasingKt.getLinearEasing(), 2, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrowValues ArrowValues(float f10) {
        float fMax = (Math.max(Math.min(1.0f, f10) - 0.4f, 0.0f) * 5) / 3;
        float fM = g.m(Math.abs(f10) - 1.0f, 0.0f, 2.0f);
        float fPow = (((0.4f * fMax) - 0.25f) + (fM - (((float) Math.pow(fM, 2)) / 4))) * 0.5f;
        float f11 = 360;
        return new ArrowValues(fPow, fPow * f11, ((MaxProgressArc * fMax) + fPow) * f11, Math.min(1.0f, fMax));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @ExperimentalMaterialApi
    /* JADX INFO: renamed from: CircularArrowIndicator-iJQMabo, reason: not valid java name */
    public static final void m1202CircularArrowIndicatoriJQMabo(final PullRefreshState pullRefreshState, final long j10, final Modifier modifier, Composer composer, int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-486016981);
        if (ComposerKt.isTraceInProgress()) {
            i11 = i10;
            ComposerKt.traceEventStart(-486016981, i11, -1, "androidx.compose.material.pullrefresh.CircularArrowIndicator (PullRefreshIndicator.kt:121)");
        } else {
            i11 = i10;
        }
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        Object obj = objRememberedValue;
        if (objRememberedValue == companion.getEmpty()) {
            Path Path = AndroidPath_androidKt.Path();
            Path.mo1506setFillTypeoQ8Xj4U(PathFillType.INSTANCE.m1857getEvenOddRgk1Os());
            composerStartRestartGroup.updateRememberedValue(Path);
            obj = Path;
        }
        composerStartRestartGroup.endReplaceableGroup();
        final Path path = (Path) obj;
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged = composerStartRestartGroup.changed(pullRefreshState);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0<Float>() { // from class: androidx.compose.material.pullrefresh.PullRefreshIndicatorKt$CircularArrowIndicator$targetAlpha$2$1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Float invoke() {
                    return Float.valueOf(pullRefreshState.getProgress() < 1.0f ? 0.3f : 1.0f);
                }
            });
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        final State stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(CircularArrowIndicator_iJQMabo$lambda$5((State) objRememberedValue2), AlphaTween, 0.0f, null, composerStartRestartGroup, 48, 12);
        CanvasKt.Canvas(SemanticsModifierKt.semantics$default(modifier, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.pullrefresh.PullRefreshIndicatorKt$CircularArrowIndicator$1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.f93236a;
            }
        }, 1, null), new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.pullrefresh.PullRefreshIndicatorKt$CircularArrowIndicator$2
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
                Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                ArrowValues ArrowValues = PullRefreshIndicatorKt.ArrowValues(pullRefreshState.getProgress());
                float fFloatValue = stateAnimateFloatAsState.getValue().floatValue();
                float rotation = ArrowValues.getRotation();
                long j11 = j10;
                Path path2 = path;
                long jMo2039getCenterF1C5BW0 = Canvas.mo2039getCenterF1C5BW0();
                DrawContext drawContext = Canvas.getDrawContext();
                long jMo2046getSizeNHjbRc = drawContext.mo2046getSizeNHjbRc();
                drawContext.getCanvas().save();
                drawContext.getTransform().mo2052rotateUv8p0NA(rotation, jMo2039getCenterF1C5BW0);
                float fMo308toPx0680j_4 = Canvas.mo308toPx0680j_4(PullRefreshIndicatorKt.ArcRadius) + (Canvas.mo308toPx0680j_4(PullRefreshIndicatorKt.StrokeWidth) / 2.0f);
                Rect rect = new Rect(Offset.m1371getXimpl(SizeKt.m1450getCenteruvyYCjk(Canvas.mo2040getSizeNHjbRc())) - fMo308toPx0680j_4, Offset.m1372getYimpl(SizeKt.m1450getCenteruvyYCjk(Canvas.mo2040getSizeNHjbRc())) - fMo308toPx0680j_4, Offset.m1371getXimpl(SizeKt.m1450getCenteruvyYCjk(Canvas.mo2040getSizeNHjbRc())) + fMo308toPx0680j_4, Offset.m1372getYimpl(SizeKt.m1450getCenteruvyYCjk(Canvas.mo2040getSizeNHjbRc())) + fMo308toPx0680j_4);
                b.v(Canvas, j11, ArrowValues.getStartAngle(), ArrowValues.getEndAngle() - ArrowValues.getStartAngle(), false, rect.m1406getTopLeftF1C5BW0(), rect.m1404getSizeNHjbRc(), fFloatValue, new Stroke(Canvas.mo308toPx0680j_4(PullRefreshIndicatorKt.StrokeWidth), 0.0f, StrokeCap.INSTANCE.m1929getSquareKaPHkGw(), 0, null, 26, null), null, 0, ViewUtils.EDGE_TO_EDGE_FLAGS, null);
                PullRefreshIndicatorKt.m1206drawArrowBx497Mc(Canvas, path2, rect, j11, fFloatValue, ArrowValues);
                drawContext.getCanvas().restore();
                drawContext.mo2047setSizeuvyYCjk(jMo2046getSizeNHjbRc);
            }
        }, composerStartRestartGroup, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final int i12 = i11;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.pullrefresh.PullRefreshIndicatorKt$CircularArrowIndicator$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.f93236a;
            }

            public final void invoke(@Nullable Composer composer2, int i13) {
                PullRefreshIndicatorKt.m1202CircularArrowIndicatoriJQMabo(pullRefreshState, j10, modifier, composer2, RecomposeScopeImplKt.updateChangedFlags(i12 | 1));
            }
        });
    }

    private static final float CircularArrowIndicator_iJQMabo$lambda$5(State<Float> state) {
        return state.getValue().floatValue();
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @ExperimentalMaterialApi
    /* JADX INFO: renamed from: PullRefreshIndicator-jB83MbM, reason: not valid java name */
    public static final void m1203PullRefreshIndicatorjB83MbM(final boolean z10, @NotNull final PullRefreshState state, @Nullable Modifier modifier, long j10, long j11, boolean z11, @Nullable Composer composer, int i10, final int i11) {
        int i12;
        long jM966getSurface0d7_KjU;
        int i13;
        long j12;
        final boolean z12;
        Object objDerivedStateOf;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(308716636);
        Modifier modifier2 = (i11 & 4) != 0 ? Modifier.INSTANCE : modifier;
        if ((i11 & 8) != 0) {
            jM966getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m966getSurface0d7_KjU();
            i12 = i10;
            i13 = i12 & (-7169);
        } else {
            i12 = i10;
            jM966getSurface0d7_KjU = j10;
            i13 = i12;
        }
        if ((i11 & 16) != 0) {
            long jM980contentColorForek8zF_U = ColorsKt.m980contentColorForek8zF_U(jM966getSurface0d7_KjU, composerStartRestartGroup, (i13 >> 9) & 14);
            i13 &= -57345;
            j12 = jM980contentColorForek8zF_U;
        } else {
            j12 = j11;
        }
        boolean z13 = (i11 & 32) != 0 ? false : z11;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(308716636, i13, -1, "androidx.compose.material.pullrefresh.PullRefreshIndicator (PullRefreshIndicator.kt:72)");
        }
        Boolean boolValueOf = Boolean.valueOf(z10);
        composerStartRestartGroup.startReplaceableGroup(511388516);
        boolean zChanged = composerStartRestartGroup.changed(boolValueOf) | composerStartRestartGroup.changed(state);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            z12 = z10;
            objDerivedStateOf = SnapshotStateKt.derivedStateOf(new Function0<Boolean>() { // from class: androidx.compose.material.pullrefresh.PullRefreshIndicatorKt$PullRefreshIndicator$showElevation$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Boolean invoke() {
                    return Boolean.valueOf(z12 || state.getPosition$material_release() > 0.5f);
                }
            });
            composerStartRestartGroup.updateRememberedValue(objDerivedStateOf);
        } else {
            objDerivedStateOf = objRememberedValue;
            z12 = z10;
        }
        composerStartRestartGroup.endReplaceableGroup();
        final int i14 = i13;
        final boolean z14 = z12;
        final long j13 = j12;
        SurfaceKt.m1124SurfaceFjzlyU(PullRefreshIndicatorTransformKt.pullRefreshIndicatorTransform(androidx.compose.foundation.layout.SizeKt.m461size3ABfNKs(modifier2, IndicatorSize), state, z13), SpinnerShape, jM966getSurface0d7_KjU, 0L, null, PullRefreshIndicator_jB83MbM$lambda$1((State) objDerivedStateOf) ? Elevation : Dp.m3951constructorimpl(0), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -194757728, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.pullrefresh.PullRefreshIndicatorKt$PullRefreshIndicator$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.f93236a;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(@Nullable Composer composer2, int i15) {
                if ((i15 & 11) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-194757728, i15, -1, "androidx.compose.material.pullrefresh.PullRefreshIndicator.<anonymous> (PullRefreshIndicator.kt:91)");
                }
                Boolean boolValueOf2 = Boolean.valueOf(z14);
                TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(100, 0, null, 6, null);
                final long j14 = j13;
                final int i16 = i14;
                final PullRefreshState pullRefreshState = state;
                CrossfadeKt.Crossfade(boolValueOf2, null, tweenSpecTween$default, ComposableLambdaKt.composableLambda(composer2, -2067838016, true, new Function3<Boolean, Composer, Integer, Unit>() { // from class: androidx.compose.material.pullrefresh.PullRefreshIndicatorKt$PullRefreshIndicator$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Composer composer3, Integer num) {
                        invoke(bool.booleanValue(), composer3, num.intValue());
                        return Unit.f93236a;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(boolean z15, @Nullable Composer composer3, int i17) {
                        int i18;
                        if ((i17 & 14) == 0) {
                            i18 = (composer3.changed(z15) ? 4 : 2) | i17;
                        } else {
                            i18 = i17;
                        }
                        if ((i18 & 91) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2067838016, i17, -1, "androidx.compose.material.pullrefresh.PullRefreshIndicator.<anonymous>.<anonymous> (PullRefreshIndicator.kt:95)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierFillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                        Alignment center = Alignment.INSTANCE.getCenter();
                        long j15 = j14;
                        int i19 = i16;
                        PullRefreshState pullRefreshState2 = pullRefreshState;
                        composer3.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer3, 6);
                        composer3.startReplaceableGroup(-1323940314);
                        Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierFillMaxSize$default);
                        if (!s.a(composer3.getApplier())) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        composer3.disableReusing();
                        Composer composerM1248constructorimpl = Updater.m1248constructorimpl(composer3);
                        Updater.m1255setimpl(composerM1248constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m1255setimpl(composerM1248constructorimpl, density, companion2.getSetDensity());
                        Updater.m1255setimpl(composerM1248constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                        Updater.m1255setimpl(composerM1248constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
                        composer3.enableReusing();
                        function3MaterializerOf.invoke(SkippableUpdater.m1239boximpl(SkippableUpdater.m1240constructorimpl(composer3)), composer3, 0);
                        composer3.startReplaceableGroup(2058660585);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        float fM3951constructorimpl = Dp.m3951constructorimpl(Dp.m3951constructorimpl(PullRefreshIndicatorKt.ArcRadius + PullRefreshIndicatorKt.StrokeWidth) * 2);
                        if (z15) {
                            composer3.startReplaceableGroup(-2035147561);
                            ProgressIndicatorKt.m1076CircularProgressIndicatorLxG7B9w(androidx.compose.foundation.layout.SizeKt.m461size3ABfNKs(companion, fM3951constructorimpl), j15, PullRefreshIndicatorKt.StrokeWidth, 0L, 0, composer3, ((i19 >> 9) & 112) | 390, 24);
                            composer3.endReplaceableGroup();
                        } else {
                            composer3.startReplaceableGroup(-2035147307);
                            PullRefreshIndicatorKt.m1202CircularArrowIndicatoriJQMabo(pullRefreshState2, j15, androidx.compose.foundation.layout.SizeKt.m461size3ABfNKs(companion, fM3951constructorimpl), composer3, ((i19 >> 9) & 112) | 392);
                            composer3.endReplaceableGroup();
                        }
                        composer3.endReplaceableGroup();
                        composer3.endNode();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composer2, (i14 & 14) | 3456, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), composerStartRestartGroup, ((i13 >> 3) & 896) | 1572912, 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final long j14 = jM966getSurface0d7_KjU;
        final Modifier modifier3 = modifier2;
        final int i15 = i12;
        final boolean z15 = z13;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.pullrefresh.PullRefreshIndicatorKt$PullRefreshIndicator$2
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
                PullRefreshIndicatorKt.m1203PullRefreshIndicatorjB83MbM(z10, state, modifier3, j14, j13, z15, composer2, RecomposeScopeImplKt.updateChangedFlags(i15 | 1), i11);
            }
        });
    }

    private static final boolean PullRefreshIndicator_jB83MbM$lambda$1(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: drawArrow-Bx497Mc, reason: not valid java name */
    public static final void m1206drawArrowBx497Mc(DrawScope drawScope, Path path, Rect rect, long j10, float f10, ArrowValues arrowValues) {
        path.reset();
        path.moveTo(0.0f, 0.0f);
        float f11 = ArrowWidth;
        path.lineTo(drawScope.mo308toPx0680j_4(f11) * arrowValues.getScale(), 0.0f);
        path.lineTo((drawScope.mo308toPx0680j_4(f11) * arrowValues.getScale()) / 2, drawScope.mo308toPx0680j_4(ArrowHeight) * arrowValues.getScale());
        path.mo1507translatek4lQ0M(OffsetKt.Offset(((Math.min(rect.getWidth(), rect.getHeight()) / 2.0f) + Offset.m1371getXimpl(rect.m1401getCenterF1C5BW0())) - ((drawScope.mo308toPx0680j_4(f11) * arrowValues.getScale()) / 2.0f), Offset.m1372getYimpl(rect.m1401getCenterF1C5BW0()) + (drawScope.mo308toPx0680j_4(StrokeWidth) / 2.0f)));
        path.close();
        float endAngle = arrowValues.getEndAngle();
        long jMo2039getCenterF1C5BW0 = drawScope.mo2039getCenterF1C5BW0();
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo2046getSizeNHjbRc = drawContext.mo2046getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2052rotateUv8p0NA(endAngle, jMo2039getCenterF1C5BW0);
        b.G(drawScope, path, j10, f10, null, null, 0, 56, null);
        drawContext.getCanvas().restore();
        drawContext.mo2047setSizeuvyYCjk(jMo2046getSizeNHjbRc);
    }
}
