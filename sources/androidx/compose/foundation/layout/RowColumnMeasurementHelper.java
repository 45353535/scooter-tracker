package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001Br\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012*\u0010\u0004\u001a&\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015ø\u0001\u0000¢\u0006\u0002\u0010\u0017J2\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u00162\b\u0010-\u001a\u0004\u0018\u00010)2\u0006\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\b2\u0006\u00100\u001a\u00020\u0006H\u0002J(\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u00062\u0006\u00103\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u00072\u0006\u00104\u001a\u000205H\u0002J3\u00106\u001a\u0002072\u0006\u00104\u001a\u0002052\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b<\u0010=J&\u0010>\u001a\u00020\n2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u0002072\u0006\u0010B\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\bJ\n\u0010\r\u001a\u00020\u0006*\u00020\u0016J\n\u0010C\u001a\u00020\u0006*\u00020\u0016R5\u0010\u0004\u001a&\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u000b\u001a\u00020\fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001b\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&R\u0018\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0\u0015X\u0082\u0004¢\u0006\u0004\n\u0002\u0010*\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006D"}, d2 = {"Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;", "", "orientation", "Landroidx/compose/foundation/layout/LayoutOrientation;", "arrangement", "Lkotlin/Function5;", "", "", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/Density;", "", "arrangementSpacing", "Landroidx/compose/ui/unit/Dp;", "crossAxisSize", "Landroidx/compose/foundation/layout/SizeMode;", "crossAxisAlignment", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "placeables", "", "Landroidx/compose/ui/layout/Placeable;", "(Landroidx/compose/foundation/layout/LayoutOrientation;Lkotlin/jvm/functions/Function5;FLandroidx/compose/foundation/layout/SizeMode;Landroidx/compose/foundation/layout/CrossAxisAlignment;Ljava/util/List;[Landroidx/compose/ui/layout/Placeable;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getArrangement", "()Lkotlin/jvm/functions/Function5;", "getArrangementSpacing-D9Ej5fM", "()F", "F", "getCrossAxisAlignment", "()Landroidx/compose/foundation/layout/CrossAxisAlignment;", "getCrossAxisSize", "()Landroidx/compose/foundation/layout/SizeMode;", "getMeasurables", "()Ljava/util/List;", "getOrientation", "()Landroidx/compose/foundation/layout/LayoutOrientation;", "getPlaceables", "()[Landroidx/compose/ui/layout/Placeable;", "[Landroidx/compose/ui/layout/Placeable;", "rowColumnParentData", "Landroidx/compose/foundation/layout/RowColumnParentData;", "[Landroidx/compose/foundation/layout/RowColumnParentData;", "getCrossAxisPosition", "placeable", "parentData", "crossAxisLayoutSize", "layoutDirection", "beforeCrossAxisAlignmentLine", "mainAxisPositions", "mainAxisLayoutSize", "childrenMainAxisSize", "measureScope", "Landroidx/compose/ui/layout/MeasureScope;", "measureWithoutPlacing", "Landroidx/compose/foundation/layout/RowColumnMeasureHelperResult;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "startIndex", "endIndex", "measureWithoutPlacing-_EkL_-Y", "(Landroidx/compose/ui/layout/MeasureScope;JII)Landroidx/compose/foundation/layout/RowColumnMeasureHelperResult;", "placeHelper", "placeableScope", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "measureResult", "crossAxisOffset", "mainAxisSize", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RowColumnMeasurementHelper {

    @NotNull
    private final Function5<Integer, int[], LayoutDirection, Density, int[], Unit> arrangement;
    private final float arrangementSpacing;

    @NotNull
    private final CrossAxisAlignment crossAxisAlignment;

    @NotNull
    private final SizeMode crossAxisSize;

    @NotNull
    private final List<Measurable> measurables;

    @NotNull
    private final LayoutOrientation orientation;

    @NotNull
    private final Placeable[] placeables;

    @NotNull
    private final RowColumnParentData[] rowColumnParentData;

    public /* synthetic */ RowColumnMeasurementHelper(LayoutOrientation layoutOrientation, Function5 function5, float f10, SizeMode sizeMode, CrossAxisAlignment crossAxisAlignment, List list, Placeable[] placeableArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(layoutOrientation, function5, f10, sizeMode, crossAxisAlignment, list, placeableArr);
    }

    private final int getCrossAxisPosition(Placeable placeable, RowColumnParentData parentData, int crossAxisLayoutSize, LayoutDirection layoutDirection, int beforeCrossAxisAlignmentLine) {
        CrossAxisAlignment crossAxisAlignment;
        if (parentData == null || (crossAxisAlignment = parentData.getCrossAxisAlignment()) == null) {
            crossAxisAlignment = this.crossAxisAlignment;
        }
        int iCrossAxisSize = crossAxisLayoutSize - crossAxisSize(placeable);
        if (this.orientation == LayoutOrientation.Horizontal) {
            layoutDirection = LayoutDirection.Ltr;
        }
        return crossAxisAlignment.align$foundation_layout_release(iCrossAxisSize, layoutDirection, placeable, beforeCrossAxisAlignmentLine);
    }

    private final int[] mainAxisPositions(int mainAxisLayoutSize, int[] childrenMainAxisSize, int[] mainAxisPositions, MeasureScope measureScope) {
        this.arrangement.invoke(Integer.valueOf(mainAxisLayoutSize), childrenMainAxisSize, measureScope.getLayoutDirection(), measureScope, mainAxisPositions);
        return mainAxisPositions;
    }

    public final int crossAxisSize(@NotNull Placeable placeable) {
        Intrinsics.checkNotNullParameter(placeable, "<this>");
        return this.orientation == LayoutOrientation.Horizontal ? placeable.getHeight() : placeable.getWidth();
    }

    @NotNull
    public final Function5<Integer, int[], LayoutDirection, Density, int[], Unit> getArrangement() {
        return this.arrangement;
    }

    /* JADX INFO: renamed from: getArrangementSpacing-D9Ej5fM, reason: not valid java name and from getter */
    public final float getArrangementSpacing() {
        return this.arrangementSpacing;
    }

    @NotNull
    public final CrossAxisAlignment getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    @NotNull
    public final SizeMode getCrossAxisSize() {
        return this.crossAxisSize;
    }

    @NotNull
    public final List<Measurable> getMeasurables() {
        return this.measurables;
    }

    @NotNull
    public final LayoutOrientation getOrientation() {
        return this.orientation;
    }

    @NotNull
    public final Placeable[] getPlaceables() {
        return this.placeables;
    }

    public final int mainAxisSize(@NotNull Placeable placeable) {
        Intrinsics.checkNotNullParameter(placeable, "<this>");
        return this.orientation == LayoutOrientation.Horizontal ? placeable.getWidth() : placeable.getHeight();
    }

    @NotNull
    /* JADX INFO: renamed from: measureWithoutPlacing-_EkL_-Y, reason: not valid java name */
    public final RowColumnMeasureHelperResult m441measureWithoutPlacing_EkL_Y(@NotNull MeasureScope measureScope, long constraints, int startIndex, int endIndex) {
        int i10;
        int i11;
        int iJ;
        int i12;
        OrientationIndependentConstraints orientationIndependentConstraints;
        int i13;
        int iMax;
        int i14;
        int i15;
        float f10;
        Intrinsics.checkNotNullParameter(measureScope, "measureScope");
        OrientationIndependentConstraints orientationIndependentConstraints2 = new OrientationIndependentConstraints(constraints, this.orientation, null);
        int iMo302roundToPx0680j_4 = measureScope.mo302roundToPx0680j_4(this.arrangementSpacing);
        int i16 = endIndex - startIndex;
        float f11 = 0.0f;
        int i17 = 0;
        int i18 = startIndex;
        float f12 = 0.0f;
        int iMin = 0;
        int iMax2 = 0;
        int i19 = 0;
        int iMainAxisSize = 0;
        boolean z10 = false;
        while (true) {
            if (i18 >= endIndex) {
                break;
            }
            Measurable measurable = this.measurables.get(i18);
            RowColumnParentData rowColumnParentData = this.rowColumnParentData[i18];
            float weight = RowColumnImplKt.getWeight(rowColumnParentData);
            if (weight > f11) {
                f12 += weight;
                i19++;
                f10 = f11;
            } else {
                int mainAxisMax = orientationIndependentConstraints2.getMainAxisMax();
                Placeable placeableMo3011measureBRTryo0 = this.placeables[i18];
                if (placeableMo3011measureBRTryo0 == null) {
                    i14 = mainAxisMax;
                    f10 = f11;
                    i15 = iMax2;
                    placeableMo3011measureBRTryo0 = measurable.mo3011measureBRTryo0(OrientationIndependentConstraints.copy$default(orientationIndependentConstraints2, 0, mainAxisMax != Integer.MAX_VALUE ? mainAxisMax - iMainAxisSize : Integer.MAX_VALUE, 0, 0, 8, null).m410toBoxConstraintsOenEA2s(this.orientation));
                } else {
                    i14 = mainAxisMax;
                    i15 = iMax2;
                    f10 = f11;
                }
                iMin = Math.min(iMo302roundToPx0680j_4, (i14 - iMainAxisSize) - mainAxisSize(placeableMo3011measureBRTryo0));
                iMainAxisSize += mainAxisSize(placeableMo3011measureBRTryo0) + iMin;
                iMax2 = Math.max(i15, crossAxisSize(placeableMo3011measureBRTryo0));
                z10 = z10 || RowColumnImplKt.isRelative(rowColumnParentData);
                this.placeables[i18] = placeableMo3011measureBRTryo0;
            }
            i18++;
            f11 = f10;
        }
        int i20 = iMax2;
        float f13 = f11;
        if (i19 == 0) {
            iMainAxisSize -= iMin;
            i11 = i20;
            iJ = 0;
        } else {
            int i21 = iMo302roundToPx0680j_4 * (i19 - 1);
            int mainAxisMin = (((f12 <= f13 || orientationIndependentConstraints2.getMainAxisMax() == Integer.MAX_VALUE) ? orientationIndependentConstraints2.getMainAxisMin() : orientationIndependentConstraints2.getMainAxisMax()) - iMainAxisSize) - i21;
            float f14 = f12 > f13 ? mainAxisMin / f12 : f13;
            Iterator it = kotlin.ranges.g.v(startIndex, endIndex).iterator();
            int iD = 0;
            while (it.hasNext()) {
                iD += zf.a.d(RowColumnImplKt.getWeight(this.rowColumnParentData[((IntIterator) it).nextInt()]) * f14);
            }
            int i22 = mainAxisMin - iD;
            i11 = i20;
            int i23 = i22;
            int i24 = startIndex;
            int iMainAxisSize2 = 0;
            while (i24 < endIndex) {
                if (this.placeables[i24] == null) {
                    Measurable measurable2 = this.measurables.get(i24);
                    RowColumnParentData rowColumnParentData2 = this.rowColumnParentData[i24];
                    float weight2 = RowColumnImplKt.getWeight(rowColumnParentData2);
                    if (weight2 <= f13) {
                        throw new IllegalStateException("All weights <= 0 should have placeables");
                    }
                    int iA = zf.a.a(i23);
                    int i25 = i23 - iA;
                    int iMax3 = Math.max(i17, zf.a.d(weight2 * f14) + iA);
                    i12 = i21;
                    Placeable placeableMo3011measureBRTryo02 = measurable2.mo3011measureBRTryo0(new OrientationIndependentConstraints((!RowColumnImplKt.getFill(rowColumnParentData2) || iMax3 == i10) ? 0 : iMax3, iMax3, 0, orientationIndependentConstraints2.getCrossAxisMax()).m410toBoxConstraintsOenEA2s(this.orientation));
                    iMainAxisSize2 += mainAxisSize(placeableMo3011measureBRTryo02);
                    int iMax4 = Math.max(i11, crossAxisSize(placeableMo3011measureBRTryo02));
                    boolean z11 = z10 || RowColumnImplKt.isRelative(rowColumnParentData2);
                    this.placeables[i24] = placeableMo3011measureBRTryo02;
                    z10 = z11;
                    i11 = iMax4;
                    i23 = i25;
                } else {
                    i12 = i21;
                }
                i24++;
                i21 = i12;
                i10 = Integer.MAX_VALUE;
                i17 = 0;
            }
            iJ = kotlin.ranges.g.j(iMainAxisSize2 + i21, orientationIndependentConstraints2.getMainAxisMax() - iMainAxisSize);
        }
        if (z10) {
            int iMax5 = 0;
            iMax = 0;
            for (int i26 = startIndex; i26 < endIndex; i26++) {
                Placeable placeable = this.placeables[i26];
                Intrinsics.checkNotNull(placeable);
                CrossAxisAlignment crossAxisAlignment = RowColumnImplKt.getCrossAxisAlignment(this.rowColumnParentData[i26]);
                Integer numCalculateAlignmentLinePosition$foundation_layout_release = crossAxisAlignment != null ? crossAxisAlignment.calculateAlignmentLinePosition$foundation_layout_release(placeable) : null;
                if (numCalculateAlignmentLinePosition$foundation_layout_release != null) {
                    int iIntValue = numCalculateAlignmentLinePosition$foundation_layout_release.intValue();
                    if (iIntValue == Integer.MIN_VALUE) {
                        iIntValue = 0;
                    }
                    iMax5 = Math.max(iMax5, iIntValue);
                    int iCrossAxisSize = crossAxisSize(placeable);
                    int iIntValue2 = numCalculateAlignmentLinePosition$foundation_layout_release.intValue();
                    if (iIntValue2 == Integer.MIN_VALUE) {
                        iIntValue2 = crossAxisSize(placeable);
                    }
                    iMax = Math.max(iMax, iCrossAxisSize - iIntValue2);
                }
            }
            i13 = iMax5;
            orientationIndependentConstraints = orientationIndependentConstraints2;
        } else {
            orientationIndependentConstraints = orientationIndependentConstraints2;
            i13 = 0;
            iMax = 0;
        }
        int iMax6 = Math.max(iMainAxisSize + iJ, orientationIndependentConstraints.getMainAxisMin());
        int iMax7 = (orientationIndependentConstraints.getCrossAxisMax() == Integer.MAX_VALUE || this.crossAxisSize != SizeMode.Expand) ? Math.max(i11, Math.max(orientationIndependentConstraints.getCrossAxisMin(), iMax + i13)) : orientationIndependentConstraints.getCrossAxisMax();
        int[] iArr = new int[i16];
        for (int i27 = 0; i27 < i16; i27++) {
            iArr[i27] = 0;
        }
        int[] iArr2 = new int[i16];
        for (int i28 = 0; i28 < i16; i28++) {
            Placeable placeable2 = this.placeables[i28 + startIndex];
            Intrinsics.checkNotNull(placeable2);
            iArr2[i28] = mainAxisSize(placeable2);
        }
        return new RowColumnMeasureHelperResult(iMax7, iMax6, startIndex, endIndex, i13, mainAxisPositions(iMax6, iArr2, iArr, measureScope));
    }

    public final void placeHelper(@NotNull Placeable.PlacementScope placeableScope, @NotNull RowColumnMeasureHelperResult measureResult, int crossAxisOffset, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(placeableScope, "placeableScope");
        Intrinsics.checkNotNullParameter(measureResult, "measureResult");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        int endIndex = measureResult.getEndIndex();
        for (int startIndex = measureResult.getStartIndex(); startIndex < endIndex; startIndex++) {
            Placeable placeable = this.placeables[startIndex];
            Intrinsics.checkNotNull(placeable);
            int[] mainAxisPositions = measureResult.getMainAxisPositions();
            Object parentData = this.measurables.get(startIndex).getParentData();
            int crossAxisPosition = getCrossAxisPosition(placeable, parentData instanceof RowColumnParentData ? (RowColumnParentData) parentData : null, measureResult.getCrossAxisSize(), layoutDirection, measureResult.getBeforeCrossAxisAlignmentLine()) + crossAxisOffset;
            if (this.orientation == LayoutOrientation.Horizontal) {
                Placeable.PlacementScope.place$default(placeableScope, placeable, mainAxisPositions[startIndex - measureResult.getStartIndex()], crossAxisPosition, 0.0f, 4, null);
            } else {
                Placeable.PlacementScope.place$default(placeableScope, placeable, crossAxisPosition, mainAxisPositions[startIndex - measureResult.getStartIndex()], 0.0f, 4, null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private RowColumnMeasurementHelper(LayoutOrientation layoutOrientation, Function5<? super Integer, ? super int[], ? super LayoutDirection, ? super Density, ? super int[], Unit> function5, float f10, SizeMode sizeMode, CrossAxisAlignment crossAxisAlignment, List<? extends Measurable> list, Placeable[] placeableArr) {
        this.orientation = layoutOrientation;
        this.arrangement = function5;
        this.arrangementSpacing = f10;
        this.crossAxisSize = sizeMode;
        this.crossAxisAlignment = crossAxisAlignment;
        this.measurables = list;
        this.placeables = placeableArr;
        int size = list.size();
        RowColumnParentData[] rowColumnParentDataArr = new RowColumnParentData[size];
        for (int i10 = 0; i10 < size; i10++) {
            rowColumnParentDataArr[i10] = RowColumnImplKt.getRowColumnParentData(this.measurables.get(i10));
        }
        this.rowColumnParentData = rowColumnParentDataArr;
    }
}
