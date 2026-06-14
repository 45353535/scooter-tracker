package androidx.compose.ui.draw;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.ScaleFactorKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.c;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.ui.draw.PainterModifierNode, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B?\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\u001d\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020,H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b.\u0010/J\u001d\u00100\u001a\u0002012\u0006\u00102\u001a\u000201H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b3\u0010/J\b\u00104\u001a\u000205H\u0016J\f\u00106\u001a\u000207*\u000208H\u0016J\u0019\u00109\u001a\u00020\u0007*\u00020,H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b:\u0010;J\u0019\u0010<\u001a\u00020\u0007*\u00020,H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b=\u0010;J\u001c\u0010>\u001a\u00020?*\u00020@2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020?H\u0016J\u001c\u0010D\u001a\u00020?*\u00020@2\u0006\u0010A\u001a\u00020B2\u0006\u0010E\u001a\u00020?H\u0016J)\u0010F\u001a\u00020G*\u00020H2\u0006\u0010A\u001a\u00020I2\u0006\u00102\u001a\u000201H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bJ\u0010KJ\u001c\u0010L\u001a\u00020?*\u00020@2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020?H\u0016J\u001c\u0010M\u001a\u00020?*\u00020@2\u0006\u0010A\u001a\u00020B2\u0006\u0010E\u001a\u00020?H\u0016R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010&\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006N"}, d2 = {"Landroidx/compose/ui/draw/PainterModifierNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DrawModifierNode;", "painter", "Landroidx/compose/ui/graphics/painter/Painter;", "sizeToIntrinsics", "", "alignment", "Landroidx/compose/ui/Alignment;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "alpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "(Landroidx/compose/ui/graphics/painter/Painter;ZLandroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;)V", "getAlignment", "()Landroidx/compose/ui/Alignment;", "setAlignment", "(Landroidx/compose/ui/Alignment;)V", "getAlpha", "()F", "setAlpha", "(F)V", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "setColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "getContentScale", "()Landroidx/compose/ui/layout/ContentScale;", "setContentScale", "(Landroidx/compose/ui/layout/ContentScale;)V", "getPainter", "()Landroidx/compose/ui/graphics/painter/Painter;", "setPainter", "(Landroidx/compose/ui/graphics/painter/Painter;)V", "getSizeToIntrinsics", "()Z", "setSizeToIntrinsics", "(Z)V", "useIntrinsicSize", "getUseIntrinsicSize", "calculateScaledSize", "Landroidx/compose/ui/geometry/Size;", "dstSize", "calculateScaledSize-E7KxVPU", "(J)J", "modifyConstraints", "Landroidx/compose/ui/unit/Constraints;", "constraints", "modifyConstraints-ZezNO4M", "toString", "", "draw", "", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "hasSpecifiedAndFiniteHeight", "hasSpecifiedAndFiniteHeight-uvyYCjk", "(J)Z", "hasSpecifiedAndFiniteWidth", "hasSpecifiedAndFiniteWidth-uvyYCjk", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class PainterModifier extends Modifier.Node implements LayoutModifierNode, DrawModifierNode {

    @NotNull
    private Alignment alignment;
    private float alpha;

    @Nullable
    private ColorFilter colorFilter;

    @NotNull
    private ContentScale contentScale;

    @NotNull
    private Painter painter;
    private boolean sizeToIntrinsics;

    public /* synthetic */ PainterModifier(Painter painter, boolean z10, Alignment alignment, ContentScale contentScale, float f10, ColorFilter colorFilter, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(painter, z10, (i10 & 4) != 0 ? Alignment.INSTANCE.getCenter() : alignment, (i10 & 8) != 0 ? ContentScale.INSTANCE.getInside() : contentScale, (i10 & 16) != 0 ? 1.0f : f10, (i10 & 32) != 0 ? null : colorFilter);
    }

    /* JADX INFO: renamed from: calculateScaledSize-E7KxVPU, reason: not valid java name */
    private final long m1282calculateScaledSizeE7KxVPU(long dstSize) {
        if (!getUseIntrinsicSize()) {
            return dstSize;
        }
        long jSize = SizeKt.Size(!m1284hasSpecifiedAndFiniteWidthuvyYCjk(this.painter.getIntrinsicSize()) ? Size.m1440getWidthimpl(dstSize) : Size.m1440getWidthimpl(this.painter.getIntrinsicSize()), !m1283hasSpecifiedAndFiniteHeightuvyYCjk(this.painter.getIntrinsicSize()) ? Size.m1437getHeightimpl(dstSize) : Size.m1437getHeightimpl(this.painter.getIntrinsicSize()));
        return (Size.m1440getWidthimpl(dstSize) == 0.0f || Size.m1437getHeightimpl(dstSize) == 0.0f) ? Size.INSTANCE.m1449getZeroNHjbRc() : ScaleFactorKt.m3080timesUQTWf7w(jSize, this.contentScale.mo3002computeScaleFactorH7hwNQA(jSize, dstSize));
    }

    private final boolean getUseIntrinsicSize() {
        return this.sizeToIntrinsics && this.painter.getIntrinsicSize() != Size.INSTANCE.m1448getUnspecifiedNHjbRc();
    }

    /* JADX INFO: renamed from: hasSpecifiedAndFiniteHeight-uvyYCjk, reason: not valid java name */
    private final boolean m1283hasSpecifiedAndFiniteHeightuvyYCjk(long j10) {
        if (Size.m1436equalsimpl0(j10, Size.INSTANCE.m1448getUnspecifiedNHjbRc())) {
            return false;
        }
        float fM1437getHeightimpl = Size.m1437getHeightimpl(j10);
        return (Float.isInfinite(fM1437getHeightimpl) || Float.isNaN(fM1437getHeightimpl)) ? false : true;
    }

    /* JADX INFO: renamed from: hasSpecifiedAndFiniteWidth-uvyYCjk, reason: not valid java name */
    private final boolean m1284hasSpecifiedAndFiniteWidthuvyYCjk(long j10) {
        if (Size.m1436equalsimpl0(j10, Size.INSTANCE.m1448getUnspecifiedNHjbRc())) {
            return false;
        }
        float fM1440getWidthimpl = Size.m1440getWidthimpl(j10);
        return (Float.isInfinite(fM1440getWidthimpl) || Float.isNaN(fM1440getWidthimpl)) ? false : true;
    }

    /* JADX INFO: renamed from: modifyConstraints-ZezNO4M, reason: not valid java name */
    private final long m1285modifyConstraintsZezNO4M(long constraints) {
        boolean z10 = false;
        boolean z11 = Constraints.m3915getHasBoundedWidthimpl(constraints) && Constraints.m3914getHasBoundedHeightimpl(constraints);
        if (Constraints.m3917getHasFixedWidthimpl(constraints) && Constraints.m3916getHasFixedHeightimpl(constraints)) {
            z10 = true;
        }
        if ((!getUseIntrinsicSize() && z11) || z10) {
            return Constraints.m3910copyZbe2FdA$default(constraints, Constraints.m3919getMaxWidthimpl(constraints), 0, Constraints.m3918getMaxHeightimpl(constraints), 0, 10, null);
        }
        long jMo2133getIntrinsicSizeNHjbRc = this.painter.getIntrinsicSize();
        long jM1282calculateScaledSizeE7KxVPU = m1282calculateScaledSizeE7KxVPU(SizeKt.Size(ConstraintsKt.m3933constrainWidthK40F9xA(constraints, m1284hasSpecifiedAndFiniteWidthuvyYCjk(jMo2133getIntrinsicSizeNHjbRc) ? zf.a.d(Size.m1440getWidthimpl(jMo2133getIntrinsicSizeNHjbRc)) : Constraints.m3921getMinWidthimpl(constraints)), ConstraintsKt.m3932constrainHeightK40F9xA(constraints, m1283hasSpecifiedAndFiniteHeightuvyYCjk(jMo2133getIntrinsicSizeNHjbRc) ? zf.a.d(Size.m1437getHeightimpl(jMo2133getIntrinsicSizeNHjbRc)) : Constraints.m3920getMinHeightimpl(constraints))));
        return Constraints.m3910copyZbe2FdA$default(constraints, ConstraintsKt.m3933constrainWidthK40F9xA(constraints, zf.a.d(Size.m1440getWidthimpl(jM1282calculateScaledSizeE7KxVPU))), 0, ConstraintsKt.m3932constrainHeightK40F9xA(constraints, zf.a.d(Size.m1437getHeightimpl(jM1282calculateScaledSizeE7KxVPU))), 0, 10, null);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(@NotNull ContentDrawScope contentDrawScope) {
        Intrinsics.checkNotNullParameter(contentDrawScope, "<this>");
        long jMo2133getIntrinsicSizeNHjbRc = this.painter.getIntrinsicSize();
        long jSize = SizeKt.Size(m1284hasSpecifiedAndFiniteWidthuvyYCjk(jMo2133getIntrinsicSizeNHjbRc) ? Size.m1440getWidthimpl(jMo2133getIntrinsicSizeNHjbRc) : Size.m1440getWidthimpl(contentDrawScope.mo2040getSizeNHjbRc()), m1283hasSpecifiedAndFiniteHeightuvyYCjk(jMo2133getIntrinsicSizeNHjbRc) ? Size.m1437getHeightimpl(jMo2133getIntrinsicSizeNHjbRc) : Size.m1437getHeightimpl(contentDrawScope.mo2040getSizeNHjbRc()));
        long jM1449getZeroNHjbRc = (Size.m1440getWidthimpl(contentDrawScope.mo2040getSizeNHjbRc()) == 0.0f || Size.m1437getHeightimpl(contentDrawScope.mo2040getSizeNHjbRc()) == 0.0f) ? Size.INSTANCE.m1449getZeroNHjbRc() : ScaleFactorKt.m3080timesUQTWf7w(jSize, this.contentScale.mo3002computeScaleFactorH7hwNQA(jSize, contentDrawScope.mo2040getSizeNHjbRc()));
        long jMo1265alignKFBX0sM = this.alignment.mo1265alignKFBX0sM(IntSizeKt.IntSize(zf.a.d(Size.m1440getWidthimpl(jM1449getZeroNHjbRc)), zf.a.d(Size.m1437getHeightimpl(jM1449getZeroNHjbRc))), IntSizeKt.IntSize(zf.a.d(Size.m1440getWidthimpl(contentDrawScope.mo2040getSizeNHjbRc())), zf.a.d(Size.m1437getHeightimpl(contentDrawScope.mo2040getSizeNHjbRc()))), contentDrawScope.getLayoutDirection());
        float fM4069getXimpl = IntOffset.m4069getXimpl(jMo1265alignKFBX0sM);
        float fM4070getYimpl = IntOffset.m4070getYimpl(jMo1265alignKFBX0sM);
        contentDrawScope.getDrawContext().getTransform().translate(fM4069getXimpl, fM4070getYimpl);
        this.painter.m2139drawx_KDEd0(contentDrawScope, jM1449getZeroNHjbRc, this.alpha, this.colorFilter);
        contentDrawScope.getDrawContext().getTransform().translate(-fM4069getXimpl, -fM4070getYimpl);
        contentDrawScope.drawContent();
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode, androidx.compose.ui.layout.Remeasurement
    public /* synthetic */ void forceRemeasure() {
        c.a(this);
    }

    @NotNull
    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    @Nullable
    public final ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    @NotNull
    public final ContentScale getContentScale() {
        return this.contentScale;
    }

    @NotNull
    public final Painter getPainter() {
        return this.painter;
    }

    public final boolean getSizeToIntrinsics() {
        return this.sizeToIntrinsics;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (!getUseIntrinsicSize()) {
            return measurable.maxIntrinsicHeight(i10);
        }
        long jM1285modifyConstraintsZezNO4M = m1285modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i10, 0, 0, 13, null));
        return Math.max(Constraints.m3920getMinHeightimpl(jM1285modifyConstraintsZezNO4M), measurable.maxIntrinsicHeight(i10));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (!getUseIntrinsicSize()) {
            return measurable.maxIntrinsicWidth(i10);
        }
        long jM1285modifyConstraintsZezNO4M = m1285modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i10, 7, null));
        return Math.max(Constraints.m3921getMinWidthimpl(jM1285modifyConstraintsZezNO4M), measurable.maxIntrinsicWidth(i10));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
    public MeasureResult mo1286measure3p2s80s(@NotNull MeasureScope measure, @NotNull Measurable measurable, long j10) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        final Placeable placeableMo3011measureBRTryo0 = measurable.mo3011measureBRTryo0(m1285modifyConstraintsZezNO4M(j10));
        return MeasureScope.CC.p(measure, placeableMo3011measureBRTryo0.getWidth(), placeableMo3011measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.ui.draw.PainterModifierNode$measure$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Placeable.PlacementScope layout) {
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                Placeable.PlacementScope.placeRelative$default(layout, placeableMo3011measureBRTryo0, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (!getUseIntrinsicSize()) {
            return measurable.minIntrinsicHeight(i10);
        }
        long jM1285modifyConstraintsZezNO4M = m1285modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i10, 0, 0, 13, null));
        return Math.max(Constraints.m3920getMinHeightimpl(jM1285modifyConstraintsZezNO4M), measurable.minIntrinsicHeight(i10));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (!getUseIntrinsicSize()) {
            return measurable.minIntrinsicWidth(i10);
        }
        long jM1285modifyConstraintsZezNO4M = m1285modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i10, 7, null));
        return Math.max(Constraints.m3921getMinWidthimpl(jM1285modifyConstraintsZezNO4M), measurable.minIntrinsicWidth(i10));
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public /* synthetic */ void onMeasureResultChanged() {
        androidx.compose.ui.node.a.a(this);
    }

    public final void setAlignment(@NotNull Alignment alignment) {
        Intrinsics.checkNotNullParameter(alignment, "<set-?>");
        this.alignment = alignment;
    }

    public final void setAlpha(float f10) {
        this.alpha = f10;
    }

    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
    }

    public final void setContentScale(@NotNull ContentScale contentScale) {
        Intrinsics.checkNotNullParameter(contentScale, "<set-?>");
        this.contentScale = contentScale;
    }

    public final void setPainter(@NotNull Painter painter) {
        Intrinsics.checkNotNullParameter(painter, "<set-?>");
        this.painter = painter;
    }

    public final void setSizeToIntrinsics(boolean z10) {
        this.sizeToIntrinsics = z10;
    }

    @NotNull
    public String toString() {
        return "PainterModifier(painter=" + this.painter + ", sizeToIntrinsics=" + this.sizeToIntrinsics + ", alignment=" + this.alignment + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ')';
    }

    public PainterModifier(@NotNull Painter painter, boolean z10, @NotNull Alignment alignment, @NotNull ContentScale contentScale, float f10, @Nullable ColorFilter colorFilter) {
        Intrinsics.checkNotNullParameter(painter, "painter");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(contentScale, "contentScale");
        this.painter = painter;
        this.sizeToIntrinsics = z10;
        this.alignment = alignment;
        this.contentScale = contentScale;
        this.alpha = f10;
        this.colorFilter = colorFilter;
    }
}
