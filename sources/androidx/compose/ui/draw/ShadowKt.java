package androidx.compose.ui.draw;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.GraphicsLayerScopeKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u001aI\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"shadow", "Landroidx/compose/ui/Modifier;", "elevation", "Landroidx/compose/ui/unit/Dp;", "shape", "Landroidx/compose/ui/graphics/Shape;", "clip", "", "shadow-ziNgDLE", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Shape;Z)Landroidx/compose/ui/Modifier;", "ambientColor", "Landroidx/compose/ui/graphics/Color;", "spotColor", "shadow-s4CzXII", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Shape;ZJJ)Landroidx/compose/ui/Modifier;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ShadowKt {
    @Stable
    @NotNull
    /* JADX INFO: renamed from: shadow-s4CzXII, reason: not valid java name */
    public static final Modifier m1287shadows4CzXII(@NotNull Modifier shadow, final float f10, @NotNull final Shape shape, final boolean z10, final long j10, final long j11) {
        Intrinsics.checkNotNullParameter(shadow, "$this$shadow");
        Intrinsics.checkNotNullParameter(shape, "shape");
        if (Dp.m3950compareTo0680j_4(f10, Dp.m3951constructorimpl(0)) > 0 || z10) {
            return InspectableValueKt.inspectableWrapper(shadow, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.ui.draw.ShadowKt$shadow-s4CzXII$$inlined$debugInspectorInfo$1
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
                    inspectorInfo.setName("shadow");
                    inspectorInfo.getProperties().set("elevation", Dp.m3949boximpl(f10));
                    inspectorInfo.getProperties().set("shape", shape);
                    inspectorInfo.getProperties().set("clip", Boolean.valueOf(z10));
                    inspectorInfo.getProperties().set("ambientColor", Color.m1594boximpl(j10));
                    inspectorInfo.getProperties().set("spotColor", Color.m1594boximpl(j11));
                }
            } : InspectableValueKt.getNoInspectorInfo(), GraphicsLayerModifierKt.graphicsLayer(Modifier.INSTANCE, new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.ui.draw.ShadowKt$shadow$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                    invoke2(graphicsLayerScope);
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull GraphicsLayerScope graphicsLayer) {
                    Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
                    graphicsLayer.setShadowElevation(graphicsLayer.mo308toPx0680j_4(f10));
                    graphicsLayer.setShape(shape);
                    graphicsLayer.setClip(z10);
                    graphicsLayer.mo1770setAmbientShadowColor8_81llA(j10);
                    graphicsLayer.mo1772setSpotShadowColor8_81llA(j11);
                }
            }));
        }
        return shadow;
    }

    /* JADX INFO: renamed from: shadow-s4CzXII$default, reason: not valid java name */
    public static /* synthetic */ Modifier m1288shadows4CzXII$default(Modifier modifier, float f10, Shape shape, boolean z10, long j10, long j11, int i10, Object obj) {
        boolean z11;
        Shape rectangleShape = (i10 & 2) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        if ((i10 & 4) != 0) {
            z11 = false;
            if (Dp.m3950compareTo0680j_4(f10, Dp.m3951constructorimpl(0)) > 0) {
                z11 = true;
            }
        } else {
            z11 = z10;
        }
        return m1287shadows4CzXII(modifier, f10, rectangleShape, z11, (i10 & 8) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : j10, (i10 & 16) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : j11);
    }

    @Stable
    /* JADX INFO: renamed from: shadow-ziNgDLE, reason: not valid java name */
    public static final /* synthetic */ Modifier m1289shadowziNgDLE(Modifier shadow, float f10, Shape shape, boolean z10) {
        Intrinsics.checkNotNullParameter(shadow, "$this$shadow");
        Intrinsics.checkNotNullParameter(shape, "shape");
        return m1287shadows4CzXII(shadow, f10, shape, z10, GraphicsLayerScopeKt.getDefaultShadowColor(), GraphicsLayerScopeKt.getDefaultShadowColor());
    }

    /* JADX INFO: renamed from: shadow-ziNgDLE$default, reason: not valid java name */
    public static /* synthetic */ Modifier m1290shadowziNgDLE$default(Modifier modifier, float f10, Shape shape, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        if ((i10 & 4) != 0) {
            z10 = false;
            if (Dp.m3950compareTo0680j_4(f10, Dp.m3951constructorimpl(0)) > 0) {
                z10 = true;
            }
        }
        return m1289shadowziNgDLE(modifier, f10, shape, z10);
    }
}
