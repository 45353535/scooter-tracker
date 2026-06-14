package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableOpenTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.vector.VectorProperty;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import com.ironsource.C4329g8;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a{\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\"\u0010\u0010\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0085\u0001\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\"\u0010\u0010\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u0014\u0010\u001b\u001a(\u0010\u001f\u001a\u00020\r*\u00020\u001c2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\r0\u001dH\u0082\b¢\u0006\u0004\b\u001f\u0010 \u001a-\u0010&\u001a\u00020\r2\u0006\u0010\"\u001a\u00020!2\u0014\b\u0002\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020$0#H\u0007¢\u0006\u0004\b&\u0010'\"\u0014\u0010(\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010)\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006*"}, d2 = {"Landroidx/compose/ui/unit/Dp;", "defaultWidth", "defaultHeight", "", "viewportWidth", "viewportHeight", "", "name", "Landroidx/compose/ui/graphics/Color;", "tintColor", "Landroidx/compose/ui/graphics/BlendMode;", "tintBlendMode", "Lkotlin/Function2;", "", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/ui/graphics/vector/VectorComposable;", "content", "Landroidx/compose/ui/graphics/vector/VectorPainter;", "rememberVectorPainter-mlNsNFs", "(FFFFLjava/lang/String;JILkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/graphics/vector/VectorPainter;", "rememberVectorPainter", "", "autoMirror", "rememberVectorPainter-vIP8VLU", "(FFFFLjava/lang/String;JIZLkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/graphics/vector/VectorPainter;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "image", "(Landroidx/compose/ui/graphics/vector/ImageVector;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/vector/VectorPainter;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/Function1;", "block", "mirror", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/graphics/vector/VectorGroup;", "group", "", "Landroidx/compose/ui/graphics/vector/VectorConfig;", C4329g8.f43171p, "RenderVectorGroup", "(Landroidx/compose/ui/graphics/vector/VectorGroup;Ljava/util/Map;Landroidx/compose/runtime/Composer;II)V", "RootGroupName", "Ljava/lang/String;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class VectorPainterKt {

    @NotNull
    public static final String RootGroupName = "VectorRootGroup";

    @ComposableTarget(applier = "androidx.compose.ui.graphics.vector.VectorComposable")
    @Composable
    public static final void RenderVectorGroup(@NotNull final VectorGroup group, @Nullable Map<String, ? extends VectorConfig> map, @Nullable Composer composer, final int i10, final int i11) {
        int i12;
        final Map<String, ? extends VectorConfig> map2;
        Iterator<VectorNode> it;
        final Map<String, ? extends VectorConfig> map3;
        Intrinsics.checkNotNullParameter(group, "group");
        Composer composerStartRestartGroup = composer.startRestartGroup(-446179233);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(group) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 16;
        }
        if (i13 == 2 && (i12 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            map2 = map;
        } else {
            Map<String, ? extends VectorConfig> mapEmptyMap = i13 != 0 ? MapsKt.emptyMap() : map;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-446179233, i10, -1, "androidx.compose.ui.graphics.vector.RenderVectorGroup (VectorPainter.kt:327)");
            }
            Iterator<VectorNode> it2 = group.iterator();
            while (it2.hasNext()) {
                final VectorNode next = it2.next();
                if (next instanceof VectorPath) {
                    composerStartRestartGroup.startReplaceableGroup(-326285735);
                    VectorPath vectorPath = (VectorPath) next;
                    VectorConfig vectorConfig = mapEmptyMap.get(vectorPath.getName());
                    if (vectorConfig == null) {
                        vectorConfig = new VectorConfig() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt$RenderVectorGroup$config$1
                            @Override // androidx.compose.ui.graphics.vector.VectorConfig
                            public /* synthetic */ Object getOrDefault(VectorProperty vectorProperty, Object obj) {
                                return a.a(this, vectorProperty, obj);
                            }
                        };
                    }
                    it = it2;
                    Composer composer2 = composerStartRestartGroup;
                    map3 = mapEmptyMap;
                    VectorComposeKt.m2155Path9cdaXJ4((List) vectorConfig.getOrDefault(VectorProperty.PathData.INSTANCE, vectorPath.getPathData()), vectorPath.getPathFillType(), vectorPath.getName(), (Brush) vectorConfig.getOrDefault(VectorProperty.Fill.INSTANCE, vectorPath.getFill()), ((Number) vectorConfig.getOrDefault(VectorProperty.FillAlpha.INSTANCE, Float.valueOf(vectorPath.getFillAlpha()))).floatValue(), (Brush) vectorConfig.getOrDefault(VectorProperty.Stroke.INSTANCE, vectorPath.getStroke()), ((Number) vectorConfig.getOrDefault(VectorProperty.StrokeAlpha.INSTANCE, Float.valueOf(vectorPath.getStrokeAlpha()))).floatValue(), ((Number) vectorConfig.getOrDefault(VectorProperty.StrokeLineWidth.INSTANCE, Float.valueOf(vectorPath.getStrokeLineWidth()))).floatValue(), vectorPath.getStrokeLineCap(), vectorPath.getStrokeLineJoin(), vectorPath.getStrokeLineMiter(), ((Number) vectorConfig.getOrDefault(VectorProperty.TrimPathStart.INSTANCE, Float.valueOf(vectorPath.getTrimPathStart()))).floatValue(), ((Number) vectorConfig.getOrDefault(VectorProperty.TrimPathEnd.INSTANCE, Float.valueOf(vectorPath.getTrimPathEnd()))).floatValue(), ((Number) vectorConfig.getOrDefault(VectorProperty.TrimPathOffset.INSTANCE, Float.valueOf(vectorPath.getTrimPathOffset()))).floatValue(), composer2, 8, 0, 0);
                    composerStartRestartGroup = composer2;
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    it = it2;
                    map3 = mapEmptyMap;
                    if (next instanceof VectorGroup) {
                        composerStartRestartGroup.startReplaceableGroup(-326283877);
                        VectorGroup vectorGroup = (VectorGroup) next;
                        VectorConfig vectorConfig2 = map3.get(vectorGroup.getName());
                        if (vectorConfig2 == null) {
                            vectorConfig2 = new VectorConfig() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt$RenderVectorGroup$config$2
                                @Override // androidx.compose.ui.graphics.vector.VectorConfig
                                public /* synthetic */ Object getOrDefault(VectorProperty vectorProperty, Object obj) {
                                    return a.a(this, vectorProperty, obj);
                                }
                            };
                        }
                        VectorComposeKt.Group(vectorGroup.getName(), ((Number) vectorConfig2.getOrDefault(VectorProperty.Rotation.INSTANCE, Float.valueOf(vectorGroup.getRotation()))).floatValue(), ((Number) vectorConfig2.getOrDefault(VectorProperty.PivotX.INSTANCE, Float.valueOf(vectorGroup.getPivotX()))).floatValue(), ((Number) vectorConfig2.getOrDefault(VectorProperty.PivotY.INSTANCE, Float.valueOf(vectorGroup.getPivotY()))).floatValue(), ((Number) vectorConfig2.getOrDefault(VectorProperty.ScaleX.INSTANCE, Float.valueOf(vectorGroup.getScaleX()))).floatValue(), ((Number) vectorConfig2.getOrDefault(VectorProperty.ScaleY.INSTANCE, Float.valueOf(vectorGroup.getScaleY()))).floatValue(), ((Number) vectorConfig2.getOrDefault(VectorProperty.TranslateX.INSTANCE, Float.valueOf(vectorGroup.getTranslationX()))).floatValue(), ((Number) vectorConfig2.getOrDefault(VectorProperty.TranslateY.INSTANCE, Float.valueOf(vectorGroup.getTranslationY()))).floatValue(), (List) vectorConfig2.getOrDefault(VectorProperty.PathData.INSTANCE, vectorGroup.getClipPathData()), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1450046638, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt.RenderVectorGroup.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.f93236a;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.graphics.vector.VectorComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer3, int i14) {
                                if ((i14 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1450046638, i14, -1, "androidx.compose.ui.graphics.vector.RenderVectorGroup.<anonymous> (VectorPainter.kt:413)");
                                }
                                VectorPainterKt.RenderVectorGroup((VectorGroup) next, map3, composer3, 64, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composerStartRestartGroup, 939524096, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-326282407);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                }
                mapEmptyMap = map3;
                it2 = it;
            }
            map2 = mapEmptyMap;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt.RenderVectorGroup.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.f93236a;
            }

            public final void invoke(@Nullable Composer composer3, int i14) {
                VectorPainterKt.RenderVectorGroup(group, map2, composer3, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
            }
        });
    }

    private static final void mirror(DrawScope drawScope, Function1<? super DrawScope, Unit> function1) {
        long jMo2039getCenterF1C5BW0 = drawScope.mo2039getCenterF1C5BW0();
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo2046getSizeNHjbRc = drawContext.mo2046getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2053scale0AR0LA0(-1.0f, 1.0f, jMo2039getCenterF1C5BW0);
        function1.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo2047setSizeuvyYCjk(jMo2046getSizeNHjbRc);
    }

    @Composable
    @NotNull
    public static final VectorPainter rememberVectorPainter(@NotNull final ImageVector image, @Nullable Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(image, "image");
        composer.startReplaceableGroup(1413834416);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1413834416, i10, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:157)");
        }
        VectorPainter vectorPainterM2162rememberVectorPaintervIP8VLU = m2162rememberVectorPaintervIP8VLU(image.getDefaultWidth(), image.getDefaultHeight(), image.getViewportWidth(), image.getViewportHeight(), image.getName(), image.getTintColor(), image.getTintBlendMode(), image.getAutoMirror(), ComposableLambdaKt.composableLambda(composer, 1873274766, true, new Function4<Float, Float, Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt.rememberVectorPainter.3
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(Float f10, Float f11, Composer composer2, Integer num) {
                invoke(f10.floatValue(), f11.floatValue(), composer2, num.intValue());
                return Unit.f93236a;
            }

            @ComposableTarget(applier = "androidx.compose.ui.graphics.vector.VectorComposable")
            @Composable
            public final void invoke(float f10, float f11, @Nullable Composer composer2, int i11) {
                if ((i11 & 11) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1873274766, i11, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter.<anonymous> (VectorPainter.kt:167)");
                }
                VectorPainterKt.RenderVectorGroup(image.getRoot(), null, composer2, 0, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), composer, 100663296, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return vectorPainterM2162rememberVectorPaintervIP8VLU;
    }

    @Composable
    @ComposableOpenTarget(index = -1)
    @NotNull
    /* JADX INFO: renamed from: rememberVectorPainter-mlNsNFs, reason: not valid java name */
    public static final VectorPainter m2161rememberVectorPaintermlNsNFs(float f10, float f11, float f12, float f13, @Nullable String str, long j10, int i10, @NotNull Function4<? super Float, ? super Float, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i11, int i12) {
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(-964365210);
        float f14 = (i12 & 4) != 0 ? Float.NaN : f12;
        float f15 = (i12 & 8) != 0 ? Float.NaN : f13;
        String str2 = (i12 & 16) != 0 ? RootGroupName : str;
        long jM1640getUnspecified0d7_KjU = (i12 & 32) != 0 ? Color.INSTANCE.m1640getUnspecified0d7_KjU() : j10;
        int iM1552getSrcIn0nO6VwU = (i12 & 64) != 0 ? BlendMode.INSTANCE.m1552getSrcIn0nO6VwU() : i10;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-964365210, i11, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:73)");
        }
        VectorPainter vectorPainterM2162rememberVectorPaintervIP8VLU = m2162rememberVectorPaintervIP8VLU(f10, f11, f14, f15, str2, jM1640getUnspecified0d7_KjU, iM1552getSrcIn0nO6VwU, false, content, composer, (i11 & 14) | 12582912 | (i11 & 112) | (i11 & 896) | (i11 & 7168) | (57344 & i11) | (458752 & i11) | (3670016 & i11) | ((i11 << 3) & 234881024), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return vectorPainterM2162rememberVectorPaintervIP8VLU;
    }

    @Composable
    @ComposableOpenTarget(index = -1)
    @NotNull
    /* JADX INFO: renamed from: rememberVectorPainter-vIP8VLU, reason: not valid java name */
    public static final VectorPainter m2162rememberVectorPaintervIP8VLU(float f10, float f11, float f12, float f13, @Nullable String str, long j10, int i10, boolean z10, @NotNull Function4<? super Float, ? super Float, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i11, int i12) {
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(1068590786);
        float f14 = (i12 & 4) != 0 ? Float.NaN : f12;
        float f15 = (i12 & 8) == 0 ? f13 : Float.NaN;
        String str2 = (i12 & 16) != 0 ? RootGroupName : str;
        long jM1640getUnspecified0d7_KjU = (i12 & 32) != 0 ? Color.INSTANCE.m1640getUnspecified0d7_KjU() : j10;
        int iM1552getSrcIn0nO6VwU = (i12 & 64) != 0 ? BlendMode.INSTANCE.m1552getSrcIn0nO6VwU() : i10;
        boolean z11 = (i12 & 128) != 0 ? false : z10;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1068590786, i11, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:115)");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        float fMo308toPx0680j_4 = density.mo308toPx0680j_4(f10);
        float fMo308toPx0680j_42 = density.mo308toPx0680j_4(f11);
        if (Float.isNaN(f14)) {
            f14 = fMo308toPx0680j_4;
        }
        if (Float.isNaN(f15)) {
            f15 = fMo308toPx0680j_42;
        }
        Color colorM1594boximpl = Color.m1594boximpl(jM1640getUnspecified0d7_KjU);
        BlendMode blendModeM1520boximpl = BlendMode.m1520boximpl(iM1552getSrcIn0nO6VwU);
        int i13 = i11 >> 15;
        composer.startReplaceableGroup(511388516);
        boolean zChanged = composer.changed(colorM1594boximpl) | composer.changed(blendModeM1520boximpl);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = !Color.m1605equalsimpl0(jM1640getUnspecified0d7_KjU, Color.INSTANCE.m1640getUnspecified0d7_KjU()) ? ColorFilter.INSTANCE.m1648tintxETnrds(jM1640getUnspecified0d7_KjU, iM1552getSrcIn0nO6VwU) : null;
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        ColorFilter colorFilter = (ColorFilter) objRememberedValue;
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new VectorPainter();
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        VectorPainter vectorPainter = (VectorPainter) objRememberedValue2;
        vectorPainter.m2160setSizeuvyYCjk$ui_release(SizeKt.Size(fMo308toPx0680j_4, fMo308toPx0680j_42));
        vectorPainter.setAutoMirror$ui_release(z11);
        vectorPainter.setIntrinsicColorFilter$ui_release(colorFilter);
        vectorPainter.RenderVector$ui_release(str2, f14, f15, content, composer, ((i11 >> 12) & 14) | 32768 | (i13 & 7168));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return vectorPainter;
    }
}
