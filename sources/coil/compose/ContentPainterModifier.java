package coil.compose;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.ScaleFactorKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p.g;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B1\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0013J)\u0010\u001d\u001a\u00020\u001a*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0014H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\"\u001a\u00020 *\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J#\u0010$\u001a\u00020 *\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b$\u0010#J#\u0010&\u001a\u00020 *\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020 H\u0016¢\u0006\u0004\b&\u0010#J#\u0010'\u001a\u00020 *\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020 H\u0016¢\u0006\u0004\b'\u0010#J\u0013\u0010*\u001a\u00020)*\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u0010\u0010-\u001a\u00020,HÖ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020 HÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00104\u001a\u0002032\b\u00102\u001a\u0004\u0018\u000101HÖ\u0003¢\u0006\u0004\b4\u00105R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00106R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u00107R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006>"}, d2 = {"Lcoil/compose/ContentPainterModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/draw/DrawModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "Landroidx/compose/ui/graphics/painter/Painter;", "painter", "Landroidx/compose/ui/Alignment;", "alignment", "Landroidx/compose/ui/layout/ContentScale;", "contentScale", "", "alpha", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "<init>", "(Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;)V", "Landroidx/compose/ui/geometry/Size;", "dstSize", "a", "(J)J", "Landroidx/compose/ui/unit/Constraints;", "constraints", "b", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "height", "minIntrinsicWidth", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "maxIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicHeight", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "", "draw", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/graphics/painter/Painter;", "Landroidx/compose/ui/Alignment;", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "Landroidx/compose/ui/layout/ContentScale;", "d", "F", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Landroidx/compose/ui/graphics/ColorFilter;", "coil-compose-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class ContentPainterModifier extends InspectorValueInfo implements LayoutModifier, DrawModifier {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Alignment alignment;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final ContentScale contentScale;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final float alpha;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final ColorFilter colorFilter;

    @NotNull
    private final Painter painter;

    static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Placeable f6912f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Placeable placeable) {
            super(1);
            this.f6912f = placeable;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Placeable.PlacementScope) obj);
            return Unit.f93236a;
        }

        public final void invoke(Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope.placeRelative$default(placementScope, this.f6912f, 0, 0, 0.0f, 4, null);
        }
    }

    public static final class b extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Painter f6913f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Alignment f6914g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ ContentScale f6915h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ float f6916i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ ColorFilter f6917j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Painter painter, Alignment alignment, ContentScale contentScale, float f10, ColorFilter colorFilter) {
            super(1);
            this.f6913f = painter;
            this.f6914g = alignment;
            this.f6915h = contentScale;
            this.f6916i = f10;
            this.f6917j = colorFilter;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InspectorInfo) obj);
            return Unit.f93236a;
        }

        public final void invoke(InspectorInfo inspectorInfo) {
            Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
            inspectorInfo.setName("content");
            inspectorInfo.getProperties().set("painter", this.f6913f);
            inspectorInfo.getProperties().set("alignment", this.f6914g);
            inspectorInfo.getProperties().set("contentScale", this.f6915h);
            inspectorInfo.getProperties().set("alpha", Float.valueOf(this.f6916i));
            inspectorInfo.getProperties().set("colorFilter", this.f6917j);
        }
    }

    public ContentPainterModifier(Painter painter, Alignment alignment, ContentScale contentScale, float f10, ColorFilter colorFilter) {
        Painter painter2;
        Alignment alignment2;
        ContentScale contentScale2;
        float f11;
        ColorFilter colorFilter2;
        Function1 noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            painter2 = painter;
            alignment2 = alignment;
            contentScale2 = contentScale;
            f11 = f10;
            colorFilter2 = colorFilter;
            noInspectorInfo = new b(painter2, alignment2, contentScale2, f11, colorFilter2);
        } else {
            painter2 = painter;
            alignment2 = alignment;
            contentScale2 = contentScale;
            f11 = f10;
            colorFilter2 = colorFilter;
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        super(noInspectorInfo);
        this.painter = painter2;
        this.alignment = alignment2;
        this.contentScale = contentScale2;
        this.alpha = f11;
        this.colorFilter = colorFilter2;
    }

    private final long a(long dstSize) {
        if (Size.m1442isEmptyimpl(dstSize)) {
            return Size.INSTANCE.m1449getZeroNHjbRc();
        }
        long intrinsicSize = this.painter.getIntrinsicSize();
        if (intrinsicSize == Size.INSTANCE.m1448getUnspecifiedNHjbRc()) {
            return dstSize;
        }
        float fM1440getWidthimpl = Size.m1440getWidthimpl(intrinsicSize);
        if (Float.isInfinite(fM1440getWidthimpl) || Float.isNaN(fM1440getWidthimpl)) {
            fM1440getWidthimpl = Size.m1440getWidthimpl(dstSize);
        }
        float fM1437getHeightimpl = Size.m1437getHeightimpl(intrinsicSize);
        if (Float.isInfinite(fM1437getHeightimpl) || Float.isNaN(fM1437getHeightimpl)) {
            fM1437getHeightimpl = Size.m1437getHeightimpl(dstSize);
        }
        long jSize = SizeKt.Size(fM1440getWidthimpl, fM1437getHeightimpl);
        return ScaleFactorKt.m3080timesUQTWf7w(jSize, this.contentScale.mo3002computeScaleFactorH7hwNQA(jSize, dstSize));
    }

    private final long b(long constraints) {
        float fM3921getMinWidthimpl;
        int iM3920getMinHeightimpl;
        float fA;
        boolean zM3917getHasFixedWidthimpl = Constraints.m3917getHasFixedWidthimpl(constraints);
        boolean zM3916getHasFixedHeightimpl = Constraints.m3916getHasFixedHeightimpl(constraints);
        if (!zM3917getHasFixedWidthimpl || !zM3916getHasFixedHeightimpl) {
            boolean z10 = Constraints.m3915getHasBoundedWidthimpl(constraints) && Constraints.m3914getHasBoundedHeightimpl(constraints);
            long intrinsicSize = this.painter.getIntrinsicSize();
            if (intrinsicSize != Size.INSTANCE.m1448getUnspecifiedNHjbRc()) {
                if (z10 && (zM3917getHasFixedWidthimpl || zM3916getHasFixedHeightimpl)) {
                    fM3921getMinWidthimpl = Constraints.m3919getMaxWidthimpl(constraints);
                    iM3920getMinHeightimpl = Constraints.m3918getMaxHeightimpl(constraints);
                } else {
                    float fM1440getWidthimpl = Size.m1440getWidthimpl(intrinsicSize);
                    float fM1437getHeightimpl = Size.m1437getHeightimpl(intrinsicSize);
                    fM3921getMinWidthimpl = (Float.isInfinite(fM1440getWidthimpl) || Float.isNaN(fM1440getWidthimpl)) ? Constraints.m3921getMinWidthimpl(constraints) : g.b(constraints, fM1440getWidthimpl);
                    if (!Float.isInfinite(fM1437getHeightimpl) && !Float.isNaN(fM1437getHeightimpl)) {
                        fA = g.a(constraints, fM1437getHeightimpl);
                        long jA = a(SizeKt.Size(fM3921getMinWidthimpl, fA));
                        return Constraints.m3910copyZbe2FdA$default(constraints, ConstraintsKt.m3933constrainWidthK40F9xA(constraints, zf.a.d(Size.m1440getWidthimpl(jA))), 0, ConstraintsKt.m3932constrainHeightK40F9xA(constraints, zf.a.d(Size.m1437getHeightimpl(jA))), 0, 10, null);
                    }
                    iM3920getMinHeightimpl = Constraints.m3920getMinHeightimpl(constraints);
                }
                fA = iM3920getMinHeightimpl;
                long jA2 = a(SizeKt.Size(fM3921getMinWidthimpl, fA));
                return Constraints.m3910copyZbe2FdA$default(constraints, ConstraintsKt.m3933constrainWidthK40F9xA(constraints, zf.a.d(Size.m1440getWidthimpl(jA2))), 0, ConstraintsKt.m3932constrainHeightK40F9xA(constraints, zf.a.d(Size.m1437getHeightimpl(jA2))), 0, 10, null);
            }
            if (z10) {
                return Constraints.m3910copyZbe2FdA$default(constraints, Constraints.m3919getMaxWidthimpl(constraints), 0, Constraints.m3918getMaxHeightimpl(constraints), 0, 10, null);
            }
        }
        return constraints;
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean all(Function1 function1) {
        return androidx.compose.ui.b.a(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean any(Function1 function1) {
        return androidx.compose.ui.b.b(this, function1);
    }

    @Override // androidx.compose.ui.draw.DrawModifier
    public void draw(ContentDrawScope contentDrawScope) {
        long jA = a(contentDrawScope.mo2040getSizeNHjbRc());
        long jMo1265alignKFBX0sM = this.alignment.mo1265alignKFBX0sM(g.e(jA), g.e(contentDrawScope.mo2040getSizeNHjbRc()), contentDrawScope.getLayoutDirection());
        float fM4061component1impl = IntOffset.m4061component1impl(jMo1265alignKFBX0sM);
        float fM4062component2impl = IntOffset.m4062component2impl(jMo1265alignKFBX0sM);
        contentDrawScope.getDrawContext().getTransform().translate(fM4061component1impl, fM4062component2impl);
        this.painter.m2139drawx_KDEd0(contentDrawScope, jA, this.alpha, this.colorFilter);
        contentDrawScope.getDrawContext().getTransform().translate(-fM4061component1impl, -fM4062component2impl);
        contentDrawScope.drawContent();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContentPainterModifier)) {
            return false;
        }
        ContentPainterModifier contentPainterModifier = (ContentPainterModifier) other;
        return Intrinsics.areEqual(this.painter, contentPainterModifier.painter) && Intrinsics.areEqual(this.alignment, contentPainterModifier.alignment) && Intrinsics.areEqual(this.contentScale, contentPainterModifier.contentScale) && Intrinsics.areEqual((Object) Float.valueOf(this.alpha), (Object) Float.valueOf(contentPainterModifier.alpha)) && Intrinsics.areEqual(this.colorFilter, contentPainterModifier.colorFilter);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldIn(Object obj, Function2 function2) {
        return androidx.compose.ui.b.c(this, obj, function2);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldOut(Object obj, Function2 function2) {
        return androidx.compose.ui.b.d(this, obj, function2);
    }

    public int hashCode() {
        int iHashCode = ((((((this.painter.hashCode() * 31) + this.alignment.hashCode()) * 31) + this.contentScale.hashCode()) * 31) + Float.floatToIntBits(this.alpha)) * 31;
        ColorFilter colorFilter = this.colorFilter;
        return iHashCode + (colorFilter == null ? 0 : colorFilter.hashCode());
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        if (this.painter.getIntrinsicSize() == Size.INSTANCE.m1448getUnspecifiedNHjbRc()) {
            return intrinsicMeasurable.maxIntrinsicHeight(i10);
        }
        int iMaxIntrinsicHeight = intrinsicMeasurable.maxIntrinsicHeight(Constraints.m3919getMaxWidthimpl(b(ConstraintsKt.Constraints$default(0, i10, 0, 0, 13, null))));
        return Math.max(zf.a.d(Size.m1437getHeightimpl(a(SizeKt.Size(i10, iMaxIntrinsicHeight)))), iMaxIntrinsicHeight);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        if (this.painter.getIntrinsicSize() == Size.INSTANCE.m1448getUnspecifiedNHjbRc()) {
            return intrinsicMeasurable.maxIntrinsicWidth(i10);
        }
        int iMaxIntrinsicWidth = intrinsicMeasurable.maxIntrinsicWidth(Constraints.m3918getMaxHeightimpl(b(ConstraintsKt.Constraints$default(0, 0, 0, i10, 7, null))));
        return Math.max(zf.a.d(Size.m1440getWidthimpl(a(SizeKt.Size(iMaxIntrinsicWidth, i10)))), iMaxIntrinsicWidth);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo43measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j10) {
        Placeable placeableMo3011measureBRTryo0 = measurable.mo3011measureBRTryo0(b(j10));
        return MeasureScope.CC.p(measureScope, placeableMo3011measureBRTryo0.getWidth(), placeableMo3011measureBRTryo0.getHeight(), null, new a(placeableMo3011measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        if (this.painter.getIntrinsicSize() == Size.INSTANCE.m1448getUnspecifiedNHjbRc()) {
            return intrinsicMeasurable.minIntrinsicHeight(i10);
        }
        int iMinIntrinsicHeight = intrinsicMeasurable.minIntrinsicHeight(Constraints.m3919getMaxWidthimpl(b(ConstraintsKt.Constraints$default(0, i10, 0, 0, 13, null))));
        return Math.max(zf.a.d(Size.m1437getHeightimpl(a(SizeKt.Size(i10, iMinIntrinsicHeight)))), iMinIntrinsicHeight);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        if (this.painter.getIntrinsicSize() == Size.INSTANCE.m1448getUnspecifiedNHjbRc()) {
            return intrinsicMeasurable.minIntrinsicWidth(i10);
        }
        int iMinIntrinsicWidth = intrinsicMeasurable.minIntrinsicWidth(Constraints.m3918getMaxHeightimpl(b(ConstraintsKt.Constraints$default(0, 0, 0, i10, 7, null))));
        return Math.max(zf.a.d(Size.m1440getWidthimpl(a(SizeKt.Size(iMinIntrinsicWidth, i10)))), iMinIntrinsicWidth);
    }

    @Override // androidx.compose.ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return androidx.compose.ui.a.a(this, modifier);
    }

    public String toString() {
        return "ContentPainterModifier(painter=" + this.painter + ", alignment=" + this.alignment + ", contentScale=" + this.contentScale + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ')';
    }
}
