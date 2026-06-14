package androidx.compose.ui.draw;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.RenderEffectKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TileMode;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a+\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a3\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\f"}, d2 = {"blur", "Landroidx/compose/ui/Modifier;", "radius", "Landroidx/compose/ui/unit/Dp;", "edgeTreatment", "Landroidx/compose/ui/draw/BlurredEdgeTreatment;", "blur-F8QBwvs", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "radiusX", "radiusY", "blur-1fqS-gw", "(Landroidx/compose/ui/Modifier;FFLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class BlurKt {
    @Stable
    @NotNull
    /* JADX INFO: renamed from: blur-1fqS-gw, reason: not valid java name */
    public static final Modifier m1267blur1fqSgw(@NotNull Modifier blur, final float f10, final float f11, @NotNull final Shape shape) {
        int iM1948getDecal3opZhB0;
        final boolean z10;
        Intrinsics.checkNotNullParameter(blur, "$this$blur");
        if (shape != null) {
            iM1948getDecal3opZhB0 = TileMode.INSTANCE.m1947getClamp3opZhB0();
            z10 = true;
        } else {
            iM1948getDecal3opZhB0 = TileMode.INSTANCE.m1948getDecal3opZhB0();
            z10 = false;
        }
        final int i10 = iM1948getDecal3opZhB0;
        float f12 = 0;
        return ((Dp.m3950compareTo0680j_4(f10, Dp.m3951constructorimpl(f12)) <= 0 || Dp.m3950compareTo0680j_4(f11, Dp.m3951constructorimpl(f12)) <= 0) && !z10) ? blur : GraphicsLayerModifierKt.graphicsLayer(blur, new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.ui.draw.BlurKt$blur$1
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
                float fMo308toPx0680j_4 = graphicsLayer.mo308toPx0680j_4(f10);
                float fMo308toPx0680j_42 = graphicsLayer.mo308toPx0680j_4(f11);
                graphicsLayer.setRenderEffect((fMo308toPx0680j_4 <= 0.0f || fMo308toPx0680j_42 <= 0.0f) ? null : RenderEffectKt.m1882BlurEffect3YTHUZs(fMo308toPx0680j_4, fMo308toPx0680j_42, i10));
                Shape rectangleShape = shape;
                if (rectangleShape == null) {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                }
                graphicsLayer.setShape(rectangleShape);
                graphicsLayer.setClip(z10);
            }
        });
    }

    /* JADX INFO: renamed from: blur-1fqS-gw$default, reason: not valid java name */
    public static /* synthetic */ Modifier m1268blur1fqSgw$default(Modifier modifier, float f10, float f11, BlurredEdgeTreatment blurredEdgeTreatment, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            blurredEdgeTreatment = BlurredEdgeTreatment.m1271boximpl(BlurredEdgeTreatment.INSTANCE.m1278getRectangleGoahg());
        }
        return m1267blur1fqSgw(modifier, f10, f11, blurredEdgeTreatment.m1277unboximpl());
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: blur-F8QBwvs, reason: not valid java name */
    public static final Modifier m1269blurF8QBwvs(@NotNull Modifier blur, float f10, @NotNull Shape shape) {
        Intrinsics.checkNotNullParameter(blur, "$this$blur");
        return m1267blur1fqSgw(blur, f10, f10, shape);
    }

    /* JADX INFO: renamed from: blur-F8QBwvs$default, reason: not valid java name */
    public static /* synthetic */ Modifier m1270blurF8QBwvs$default(Modifier modifier, float f10, BlurredEdgeTreatment blurredEdgeTreatment, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            blurredEdgeTreatment = BlurredEdgeTreatment.m1271boximpl(BlurredEdgeTreatment.INSTANCE.m1278getRectangleGoahg());
        }
        return m1269blurF8QBwvs(modifier, f10, blurredEdgeTreatment.m1277unboximpl());
    }
}
