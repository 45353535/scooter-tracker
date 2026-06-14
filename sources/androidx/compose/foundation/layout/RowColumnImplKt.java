package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u001aa\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u00002*\u0010\b\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a5\u0010\u0016\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00132\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a5\u0010\u0018\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00132\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0018\u0010\u0017\u001a5\u0010\u0019\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00132\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0019\u0010\u0017\u001a5\u0010\u001a\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00132\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u001a\u0010\u0017\u001aq\u0010#\u001a\u00020\u00032\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0018\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001c2\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001c2\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u0000H\u0002¢\u0006\u0004\b#\u0010$\u001aG\u0010&\u001a\u00020\u00032\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0018\u0010%\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001c2\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0003H\u0002¢\u0006\u0004\b&\u0010'\u001aa\u0010)\u001a\u00020\u00032\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0018\u0010%\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001c2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001c2\u0006\u0010(\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0003H\u0002¢\u0006\u0004\b)\u0010*\"\u001a\u0010.\u001a\u0004\u0018\u00010+*\u00020\u00158@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-\"\u001a\u00102\u001a\u00020/*\u0004\u0018\u00010+8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b0\u00101\"\u001a\u00106\u001a\u000203*\u0004\u0018\u00010+8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b4\u00105\"\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r*\u0004\u0018\u00010+8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b7\u00108\"\u001a\u00109\u001a\u000203*\u0004\u0018\u00010+8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b9\u00105\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006:"}, d2 = {"Landroidx/compose/foundation/layout/LayoutOrientation;", "orientation", "Lkotlin/Function5;", "", "", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/Density;", "", "arrangement", "Landroidx/compose/ui/unit/Dp;", "arrangementSpacing", "Landroidx/compose/foundation/layout/SizeMode;", "crossAxisSize", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "crossAxisAlignment", "Landroidx/compose/ui/layout/MeasurePolicy;", "rowColumnMeasurePolicy-TDGSqEk", "(Landroidx/compose/foundation/layout/LayoutOrientation;Lkotlin/jvm/functions/Function5;FLandroidx/compose/foundation/layout/SizeMode;Landroidx/compose/foundation/layout/CrossAxisAlignment;)Landroidx/compose/ui/layout/MeasurePolicy;", "rowColumnMeasurePolicy", "Lkotlin/Function3;", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "MinIntrinsicWidthMeasureBlock", "(Landroidx/compose/foundation/layout/LayoutOrientation;)Lkotlin/jvm/functions/Function3;", "MinIntrinsicHeightMeasureBlock", "MaxIntrinsicWidthMeasureBlock", "MaxIntrinsicHeightMeasureBlock", "children", "Lkotlin/Function2;", "intrinsicMainSize", "intrinsicCrossSize", "crossAxisAvailable", "mainAxisSpacing", "layoutOrientation", "intrinsicOrientation", "intrinsicSize", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;IILandroidx/compose/foundation/layout/LayoutOrientation;Landroidx/compose/foundation/layout/LayoutOrientation;)I", "mainAxisSize", "intrinsicMainAxisSize", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;II)I", "mainAxisAvailable", "intrinsicCrossAxisSize", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;II)I", "Landroidx/compose/foundation/layout/RowColumnParentData;", "getRowColumnParentData", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Landroidx/compose/foundation/layout/RowColumnParentData;", "rowColumnParentData", "", "getWeight", "(Landroidx/compose/foundation/layout/RowColumnParentData;)F", "weight", "", "getFill", "(Landroidx/compose/foundation/layout/RowColumnParentData;)Z", Reporting.EventType.FILL, "getCrossAxisAlignment", "(Landroidx/compose/foundation/layout/RowColumnParentData;)Landroidx/compose/foundation/layout/CrossAxisAlignment;", "isRelative", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class RowColumnImplKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Function3<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> MaxIntrinsicHeightMeasureBlock(LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? IntrinsicMeasureBlocks.INSTANCE.getHorizontalMaxHeight() : IntrinsicMeasureBlocks.INSTANCE.getVerticalMaxHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function3<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> MaxIntrinsicWidthMeasureBlock(LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? IntrinsicMeasureBlocks.INSTANCE.getHorizontalMaxWidth() : IntrinsicMeasureBlocks.INSTANCE.getVerticalMaxWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function3<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> MinIntrinsicHeightMeasureBlock(LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? IntrinsicMeasureBlocks.INSTANCE.getHorizontalMinHeight() : IntrinsicMeasureBlocks.INSTANCE.getVerticalMinHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function3<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> MinIntrinsicWidthMeasureBlock(LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? IntrinsicMeasureBlocks.INSTANCE.getHorizontalMinWidth() : IntrinsicMeasureBlocks.INSTANCE.getVerticalMinWidth();
    }

    @Nullable
    public static final CrossAxisAlignment getCrossAxisAlignment(@Nullable RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData != null) {
            return rowColumnParentData.getCrossAxisAlignment();
        }
        return null;
    }

    public static final boolean getFill(@Nullable RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData != null) {
            return rowColumnParentData.getFill();
        }
        return true;
    }

    @Nullable
    public static final RowColumnParentData getRowColumnParentData(@NotNull IntrinsicMeasurable intrinsicMeasurable) {
        Intrinsics.checkNotNullParameter(intrinsicMeasurable, "<this>");
        Object parentData = intrinsicMeasurable.getParentData();
        if (parentData instanceof RowColumnParentData) {
            return (RowColumnParentData) parentData;
        }
        return null;
    }

    public static final float getWeight(@Nullable RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData != null) {
            return rowColumnParentData.getWeight();
        }
        return 0.0f;
    }

    private static final int intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> list, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> function2, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> function22, int i10, int i11) {
        int iMin = Math.min((list.size() - 1) * i11, i10);
        int size = list.size();
        int iMax = 0;
        float f10 = 0.0f;
        for (int i12 = 0; i12 < size; i12++) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i12);
            float weight = getWeight(getRowColumnParentData(intrinsicMeasurable));
            if (weight == 0.0f) {
                int iMin2 = Math.min(function2.invoke(intrinsicMeasurable, Integer.MAX_VALUE).intValue(), i10 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, function22.invoke(intrinsicMeasurable, Integer.valueOf(iMin2)).intValue());
            } else if (weight > 0.0f) {
                f10 += weight;
            }
        }
        int iD = f10 == 0.0f ? 0 : i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : zf.a.d(Math.max(i10 - iMin, 0) / f10);
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            IntrinsicMeasurable intrinsicMeasurable2 = list.get(i13);
            float weight2 = getWeight(getRowColumnParentData(intrinsicMeasurable2));
            if (weight2 > 0.0f) {
                iMax = Math.max(iMax, function22.invoke(intrinsicMeasurable2, Integer.valueOf(iD != Integer.MAX_VALUE ? zf.a.d(iD * weight2) : Integer.MAX_VALUE)).intValue());
            }
        }
        return iMax;
    }

    private static final int intrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> function2, int i10, int i11) {
        int size = list.size();
        int iMax = 0;
        int i12 = 0;
        float f10 = 0.0f;
        for (int i13 = 0; i13 < size; i13++) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i13);
            float weight = getWeight(getRowColumnParentData(intrinsicMeasurable));
            int iIntValue = function2.invoke(intrinsicMeasurable, Integer.valueOf(i10)).intValue();
            if (weight == 0.0f) {
                i12 += iIntValue;
            } else if (weight > 0.0f) {
                f10 += weight;
                iMax = Math.max(iMax, zf.a.d(iIntValue / weight));
            }
        }
        return zf.a.d(iMax * f10) + i12 + ((list.size() - 1) * i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int intrinsicSize(List<? extends IntrinsicMeasurable> list, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> function2, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> function22, int i10, int i11, LayoutOrientation layoutOrientation, LayoutOrientation layoutOrientation2) {
        return layoutOrientation == layoutOrientation2 ? intrinsicMainAxisSize(list, function2, i10, i11) : intrinsicCrossAxisSize(list, function22, function2, i10, i11);
    }

    public static final boolean isRelative(@Nullable RowColumnParentData rowColumnParentData) {
        CrossAxisAlignment crossAxisAlignment = getCrossAxisAlignment(rowColumnParentData);
        if (crossAxisAlignment != null) {
            return crossAxisAlignment.isRelative$foundation_layout_release();
        }
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: rowColumnMeasurePolicy-TDGSqEk, reason: not valid java name */
    public static final MeasurePolicy m439rowColumnMeasurePolicyTDGSqEk(@NotNull final LayoutOrientation orientation, @NotNull final Function5<? super Integer, ? super int[], ? super LayoutDirection, ? super Density, ? super int[], Unit> arrangement, final float f10, @NotNull final SizeMode crossAxisSize, @NotNull final CrossAxisAlignment crossAxisAlignment) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(arrangement, "arrangement");
        Intrinsics.checkNotNullParameter(crossAxisSize, "crossAxisSize");
        Intrinsics.checkNotNullParameter(crossAxisAlignment, "crossAxisAlignment");
        return new MeasurePolicy() { // from class: androidx.compose.foundation.layout.RowColumnImplKt$rowColumnMeasurePolicy$1
            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i10) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return ((Number) RowColumnImplKt.MaxIntrinsicHeightMeasureBlock(orientation).invoke(measurables, Integer.valueOf(i10), Integer.valueOf(intrinsicMeasureScope.mo302roundToPx0680j_4(f10)))).intValue();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i10) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return ((Number) RowColumnImplKt.MaxIntrinsicWidthMeasureBlock(orientation).invoke(measurables, Integer.valueOf(i10), Integer.valueOf(intrinsicMeasureScope.mo302roundToPx0680j_4(f10)))).intValue();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            @NotNull
            /* JADX INFO: renamed from: measure-3p2s80s */
            public MeasureResult mo30measure3p2s80s(@NotNull final MeasureScope measure, @NotNull List<? extends Measurable> measurables, long j10) {
                int crossAxisSize2;
                int mainAxisSize;
                Intrinsics.checkNotNullParameter(measure, "$this$measure");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                final RowColumnMeasurementHelper rowColumnMeasurementHelper = new RowColumnMeasurementHelper(orientation, arrangement, f10, crossAxisSize, crossAxisAlignment, measurables, new Placeable[measurables.size()], null);
                final RowColumnMeasureHelperResult rowColumnMeasureHelperResultM441measureWithoutPlacing_EkL_Y = rowColumnMeasurementHelper.m441measureWithoutPlacing_EkL_Y(measure, j10, 0, measurables.size());
                if (orientation == LayoutOrientation.Horizontal) {
                    crossAxisSize2 = rowColumnMeasureHelperResultM441measureWithoutPlacing_EkL_Y.getMainAxisSize();
                    mainAxisSize = rowColumnMeasureHelperResultM441measureWithoutPlacing_EkL_Y.getCrossAxisSize();
                } else {
                    crossAxisSize2 = rowColumnMeasureHelperResultM441measureWithoutPlacing_EkL_Y.getCrossAxisSize();
                    mainAxisSize = rowColumnMeasureHelperResultM441measureWithoutPlacing_EkL_Y.getMainAxisSize();
                }
                return MeasureScope.CC.p(measure, crossAxisSize2, mainAxisSize, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.RowColumnImplKt$rowColumnMeasurePolicy$1$measure$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                        rowColumnMeasurementHelper.placeHelper(layout, rowColumnMeasureHelperResultM441measureWithoutPlacing_EkL_Y, 0, measure.getLayoutDirection());
                    }
                }, 4, null);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i10) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return ((Number) RowColumnImplKt.MinIntrinsicHeightMeasureBlock(orientation).invoke(measurables, Integer.valueOf(i10), Integer.valueOf(intrinsicMeasureScope.mo302roundToPx0680j_4(f10)))).intValue();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i10) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return ((Number) RowColumnImplKt.MinIntrinsicWidthMeasureBlock(orientation).invoke(measurables, Integer.valueOf(i10), Integer.valueOf(intrinsicMeasureScope.mo302roundToPx0680j_4(f10)))).intValue();
            }
        };
    }
}
