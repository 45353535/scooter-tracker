package androidx.compose.foundation;

import androidx.compose.material.OutlinedTextFieldKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathOperation;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u001a(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0002\u001a\u001c\u0010\u000b\u001a\u00020\f*\u00020\f2\u0006\u0010\u000b\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u001a/\u0010\u000b\u001a\u00020\f*\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a1\u0010\u000b\u001a\u00020\f*\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u000e\u001a\u00020\u000fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a\f\u0010\u001a\u001a\u00020\u001b*\u00020\u001cH\u0002\u001a:\u0010\u001d\u001a\u00020\u001b*\u00020\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\"2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0003H\u0002\u001aA\u0010#\u001a\u00020\u001b*\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010(\u001a\u00020\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*\u001aW\u0010+\u001a\u00020\u001b*\u00020\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010!\u001a\u00020,2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010.\u001a\u0012\u0010/\u001a\u00020 *\b\u0012\u0004\u0012\u00020 0\u001fH\u0002\u001a!\u00100\u001a\u000201*\u0002012\u0006\u00102\u001a\u00020\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b3\u00104\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00065"}, d2 = {"createInsetRoundedRect", "Landroidx/compose/ui/geometry/RoundRect;", "widthPx", "", "roundedRect", "createRoundRectPath", "Landroidx/compose/ui/graphics/Path;", "targetPath", "strokeWidth", "fillArea", "", OutlinedTextFieldKt.BorderId, "Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/BorderStroke;", "shape", "Landroidx/compose/ui/graphics/Shape;", "width", "Landroidx/compose/ui/unit/Dp;", "brush", "Landroidx/compose/ui/graphics/Brush;", "border-ziNgDLE", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "color", "Landroidx/compose/ui/graphics/Color;", "border-xT4_qwU", "(Landroidx/compose/ui/Modifier;FJLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "drawContentWithoutBorder", "Landroidx/compose/ui/draw/DrawResult;", "Landroidx/compose/ui/draw/CacheDrawScope;", "drawGenericBorder", "borderCacheRef", "Landroidx/compose/ui/node/Ref;", "Landroidx/compose/foundation/BorderCache;", "outline", "Landroidx/compose/ui/graphics/Outline$Generic;", "drawRectBorder", "topLeft", "Landroidx/compose/ui/geometry/Offset;", "borderSize", "Landroidx/compose/ui/geometry/Size;", "strokeWidthPx", "drawRectBorder-NsqcLGU", "(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/graphics/Brush;JJZF)Landroidx/compose/ui/draw/DrawResult;", "drawRoundRectBorder", "Landroidx/compose/ui/graphics/Outline$Rounded;", "drawRoundRectBorder-SYlcjDY", "(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/node/Ref;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Outline$Rounded;JJZF)Landroidx/compose/ui/draw/DrawResult;", "obtain", "shrink", "Landroidx/compose/ui/geometry/CornerRadius;", "value", "shrink-Kibmq7A", "(JF)J", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class BorderKt {
    @NotNull
    public static final Modifier border(@NotNull Modifier modifier, @NotNull BorderStroke border, @NotNull Shape shape) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(border, "border");
        Intrinsics.checkNotNullParameter(shape, "shape");
        return m182borderziNgDLE(modifier, border.getWidth(), border.getBrush(), shape);
    }

    public static /* synthetic */ Modifier border$default(Modifier modifier, BorderStroke borderStroke, Shape shape, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        return border(modifier, borderStroke, shape);
    }

    @NotNull
    /* JADX INFO: renamed from: border-xT4_qwU, reason: not valid java name */
    public static final Modifier m180borderxT4_qwU(@NotNull Modifier border, float f10, long j10, @NotNull Shape shape) {
        Intrinsics.checkNotNullParameter(border, "$this$border");
        Intrinsics.checkNotNullParameter(shape, "shape");
        return m182borderziNgDLE(border, f10, new SolidColor(j10, null), shape);
    }

    /* JADX INFO: renamed from: border-xT4_qwU$default, reason: not valid java name */
    public static /* synthetic */ Modifier m181borderxT4_qwU$default(Modifier modifier, float f10, long j10, Shape shape, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        return m180borderxT4_qwU(modifier, f10, j10, shape);
    }

    @NotNull
    /* JADX INFO: renamed from: border-ziNgDLE, reason: not valid java name */
    public static final Modifier m182borderziNgDLE(@NotNull Modifier border, final float f10, @NotNull final Brush brush, @NotNull final Shape shape) {
        Intrinsics.checkNotNullParameter(border, "$this$border");
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(shape, "shape");
        return ComposedModifierKt.composed(border, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.BorderKt$border-ziNgDLE$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName(OutlinedTextFieldKt.BorderId);
                inspectorInfo.getProperties().set("width", Dp.m3949boximpl(f10));
                if (brush instanceof SolidColor) {
                    inspectorInfo.getProperties().set("color", Color.m1594boximpl(((SolidColor) brush).getValue()));
                    inspectorInfo.setValue(Color.m1594boximpl(((SolidColor) brush).getValue()));
                } else {
                    inspectorInfo.getProperties().set("brush", brush);
                }
                inspectorInfo.getProperties().set("shape", shape);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.BorderKt.border.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
                return invoke(modifier, composer, num.intValue());
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i10) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(-1498088849);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1498088849, i10, -1, "androidx.compose.foundation.border.<anonymous> (Border.kt:93)");
                }
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Ref();
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                final Ref ref = (Ref) objRememberedValue;
                Modifier.Companion companion = Modifier.INSTANCE;
                final float f11 = f10;
                final Shape shape2 = shape;
                final Brush brush2 = brush;
                Modifier modifierThen = composed.then(DrawModifierKt.drawWithCache(companion, new Function1<CacheDrawScope, DrawResult>() { // from class: androidx.compose.foundation.BorderKt.border.2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    public final DrawResult invoke(@NotNull CacheDrawScope drawWithCache) {
                        Intrinsics.checkNotNullParameter(drawWithCache, "$this$drawWithCache");
                        if (drawWithCache.mo308toPx0680j_4(f11) < 0.0f || Size.m1439getMinDimensionimpl(drawWithCache.m1281getSizeNHjbRc()) <= 0.0f) {
                            return BorderKt.drawContentWithoutBorder(drawWithCache);
                        }
                        float f12 = 2;
                        float fMin = Math.min(Dp.m3956equalsimpl0(f11, Dp.INSTANCE.m3969getHairlineD9Ej5fM()) ? 1.0f : (float) Math.ceil(drawWithCache.mo308toPx0680j_4(f11)), (float) Math.ceil(Size.m1439getMinDimensionimpl(drawWithCache.m1281getSizeNHjbRc()) / f12));
                        float f13 = fMin / f12;
                        long jOffset = OffsetKt.Offset(f13, f13);
                        long jSize = SizeKt.Size(Size.m1440getWidthimpl(drawWithCache.m1281getSizeNHjbRc()) - fMin, Size.m1437getHeightimpl(drawWithCache.m1281getSizeNHjbRc()) - fMin);
                        boolean z10 = f12 * fMin > Size.m1439getMinDimensionimpl(drawWithCache.m1281getSizeNHjbRc());
                        Outline outlineMo212createOutlinePq9zytI = shape2.mo212createOutlinePq9zytI(drawWithCache.m1281getSizeNHjbRc(), drawWithCache.getLayoutDirection(), drawWithCache);
                        if (outlineMo212createOutlinePq9zytI instanceof Outline.Generic) {
                            return BorderKt.drawGenericBorder(drawWithCache, ref, brush2, (Outline.Generic) outlineMo212createOutlinePq9zytI, z10, fMin);
                        }
                        if (outlineMo212createOutlinePq9zytI instanceof Outline.Rounded) {
                            return BorderKt.m184drawRoundRectBorderSYlcjDY(drawWithCache, ref, brush2, (Outline.Rounded) outlineMo212createOutlinePq9zytI, jOffset, jSize, z10, fMin);
                        }
                        if (outlineMo212createOutlinePq9zytI instanceof Outline.Rectangle) {
                            return BorderKt.m183drawRectBorderNsqcLGU(drawWithCache, brush2, jOffset, jSize, z10, fMin);
                        }
                        throw new m();
                    }
                }));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierThen;
            }
        });
    }

    private static final RoundRect createInsetRoundedRect(float f10, RoundRect roundRect) {
        return new RoundRect(f10, f10, roundRect.getWidth() - f10, roundRect.getHeight() - f10, m185shrinkKibmq7A(roundRect.m1421getTopLeftCornerRadiuskKHJgLs(), f10), m185shrinkKibmq7A(roundRect.m1422getTopRightCornerRadiuskKHJgLs(), f10), m185shrinkKibmq7A(roundRect.m1420getBottomRightCornerRadiuskKHJgLs(), f10), m185shrinkKibmq7A(roundRect.m1419getBottomLeftCornerRadiuskKHJgLs(), f10), null);
    }

    private static final Path createRoundRectPath(Path path, RoundRect roundRect, float f10, boolean z10) {
        path.reset();
        path.addRoundRect(roundRect);
        if (!z10) {
            Path Path = AndroidPath_androidKt.Path();
            Path.addRoundRect(createInsetRoundedRect(f10, roundRect));
            path.mo1505opN5in7k0(path, Path, PathOperation.INSTANCE.m1866getDifferenceb3I0S0c());
        }
        return path;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawResult drawContentWithoutBorder(CacheDrawScope cacheDrawScope) {
        return cacheDrawScope.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.BorderKt.drawContentWithoutBorder.1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ContentDrawScope onDrawWithContent) {
                Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
                onDrawWithContent.drawContent();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.ui.draw.DrawResult drawGenericBorder(androidx.compose.ui.draw.CacheDrawScope r40, androidx.compose.ui.node.Ref<androidx.compose.foundation.BorderCache> r41, final androidx.compose.ui.graphics.Brush r42, final androidx.compose.ui.graphics.Outline.Generic r43, boolean r44, float r45) {
        /*
            Method dump skipped, instruction units count: 601
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BorderKt.drawGenericBorder(androidx.compose.ui.draw.CacheDrawScope, androidx.compose.ui.node.Ref, androidx.compose.ui.graphics.Brush, androidx.compose.ui.graphics.Outline$Generic, boolean, float):androidx.compose.ui.draw.DrawResult");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: drawRectBorder-NsqcLGU, reason: not valid java name */
    public static final DrawResult m183drawRectBorderNsqcLGU(CacheDrawScope cacheDrawScope, final Brush brush, long j10, long j11, boolean z10, float f10) {
        final long jM1387getZeroF1C5BW0 = z10 ? Offset.INSTANCE.m1387getZeroF1C5BW0() : j10;
        final long jM1281getSizeNHjbRc = z10 ? cacheDrawScope.m1281getSizeNHjbRc() : j11;
        final DrawStyle stroke = z10 ? Fill.INSTANCE : new Stroke(f10, 0.0f, 0, 0, null, 30, null);
        return cacheDrawScope.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.BorderKt$drawRectBorder$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ContentDrawScope onDrawWithContent) {
                Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
                onDrawWithContent.drawContent();
                androidx.compose.ui.graphics.drawscope.b.J(onDrawWithContent, brush, jM1387getZeroF1C5BW0, jM1281getSizeNHjbRc, 0.0f, stroke, null, 0, 104, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: drawRoundRectBorder-SYlcjDY, reason: not valid java name */
    public static final DrawResult m184drawRoundRectBorderSYlcjDY(CacheDrawScope cacheDrawScope, Ref<BorderCache> ref, final Brush brush, Outline.Rounded rounded, final long j10, final long j11, final boolean z10, final float f10) {
        if (!RoundRectKt.isSimple(rounded.getRoundRect())) {
            final Path pathCreateRoundRectPath = createRoundRectPath(obtain(ref).obtainPath(), rounded.getRoundRect(), f10, z10);
            return cacheDrawScope.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.BorderKt$drawRoundRectBorder$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                    invoke2(contentDrawScope);
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull ContentDrawScope onDrawWithContent) {
                    Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
                    onDrawWithContent.drawContent();
                    androidx.compose.ui.graphics.drawscope.b.F(onDrawWithContent, pathCreateRoundRectPath, brush, 0.0f, null, null, 0, 60, null);
                }
            });
        }
        final long jM1421getTopLeftCornerRadiuskKHJgLs = rounded.getRoundRect().m1421getTopLeftCornerRadiuskKHJgLs();
        final float f11 = f10 / 2;
        final Stroke stroke = new Stroke(f10, 0.0f, 0, 0, null, 30, null);
        return cacheDrawScope.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.BorderKt$drawRoundRectBorder$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ContentDrawScope onDrawWithContent) {
                Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
                onDrawWithContent.drawContent();
                if (z10) {
                    androidx.compose.ui.graphics.drawscope.b.L(onDrawWithContent, brush, 0L, 0L, jM1421getTopLeftCornerRadiuskKHJgLs, 0.0f, null, null, 0, 246, null);
                    return;
                }
                float fM1346getXimpl = CornerRadius.m1346getXimpl(jM1421getTopLeftCornerRadiuskKHJgLs);
                float f12 = f11;
                if (fM1346getXimpl >= f12) {
                    androidx.compose.ui.graphics.drawscope.b.L(onDrawWithContent, brush, j10, j11, BorderKt.m185shrinkKibmq7A(jM1421getTopLeftCornerRadiuskKHJgLs, f12), 0.0f, stroke, null, 0, 208, null);
                    return;
                }
                float f13 = f10;
                float fM1440getWidthimpl = Size.m1440getWidthimpl(onDrawWithContent.mo2040getSizeNHjbRc()) - f10;
                float fM1437getHeightimpl = Size.m1437getHeightimpl(onDrawWithContent.mo2040getSizeNHjbRc()) - f10;
                int iM1592getDifferencertfAjoo = ClipOp.INSTANCE.m1592getDifferencertfAjoo();
                Brush brush2 = brush;
                long j12 = jM1421getTopLeftCornerRadiuskKHJgLs;
                DrawContext drawContext = onDrawWithContent.getDrawContext();
                long jMo2046getSizeNHjbRc = drawContext.mo2046getSizeNHjbRc();
                drawContext.getCanvas().save();
                drawContext.getTransform().mo2049clipRectN_I0leg(f13, f13, fM1440getWidthimpl, fM1437getHeightimpl, iM1592getDifferencertfAjoo);
                androidx.compose.ui.graphics.drawscope.b.L(onDrawWithContent, brush2, 0L, 0L, j12, 0.0f, null, null, 0, 246, null);
                drawContext.getCanvas().restore();
                drawContext.mo2047setSizeuvyYCjk(jMo2046getSizeNHjbRc);
            }
        });
    }

    private static final BorderCache obtain(Ref<BorderCache> ref) {
        BorderCache value = ref.getValue();
        if (value != null) {
            return value;
        }
        BorderCache borderCache = new BorderCache(null, null, null, null, 15, null);
        ref.setValue(borderCache);
        return borderCache;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: shrink-Kibmq7A, reason: not valid java name */
    public static final long m185shrinkKibmq7A(long j10, float f10) {
        return CornerRadiusKt.CornerRadius(Math.max(0.0f, CornerRadius.m1346getXimpl(j10) - f10), Math.max(0.0f, CornerRadius.m1347getYimpl(j10) - f10));
    }
}
