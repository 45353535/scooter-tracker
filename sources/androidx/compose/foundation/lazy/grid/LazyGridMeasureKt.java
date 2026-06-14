package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.d;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aå\u0001\u0010+\u001a\u00020(2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2*\u0010'\u001a&\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0#\u0012\u0004\u0012\u00020&0\"H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*\u001aY\u00101\u001a\b\u0012\u0004\u0012\u0002000/2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00110#2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00130#H\u0083\bø\u0001\u0001¢\u0006\u0004\b1\u00102\u001a\u0093\u0001\u0010>\u001a\b\u0012\u0004\u0012\u00020=0<2\f\u00104\u001a\b\u0012\u0004\u0012\u0002030/2\f\u00105\u001a\b\u0012\u0004\u0012\u0002000/2\f\u00106\u001a\b\u0012\u0004\u0012\u0002000/2\u0006\u00107\u001a\u00020\u00002\u0006\u00108\u001a\u00020\u00002\u0006\u00109\u001a\u00020\u00002\u0006\u0010:\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b>\u0010?\u001a+\u0010A\u001a\u00020=*\u0002002\u0006\u0010@\u001a\u00020\u00002\u0006\u00107\u001a\u00020\u00002\u0006\u00108\u001a\u00020\u0000H\u0002¢\u0006\u0004\bA\u0010B\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006C"}, d2 = {"", "itemsCount", "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;", "itemProvider", "Landroidx/compose/foundation/lazy/grid/LazyMeasuredLineProvider;", "measuredLineProvider", "Landroidx/compose/foundation/lazy/grid/LazyMeasuredItemProvider;", "measuredItemProvider", "mainAxisAvailableSize", "beforeContentPadding", "afterContentPadding", "spaceBetweenLines", "Landroidx/compose/foundation/lazy/grid/LineIndex;", "firstVisibleLineIndex", "firstVisibleLineScrollOffset", "", "scrollToBeConsumed", "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "isVertical", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "reverseLayout", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "placementAnimator", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "spanLayoutProvider", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "pinnedItems", "Lkotlin/Function3;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Landroidx/compose/ui/layout/MeasureResult;", "layout", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "measureLazyGrid-t5wl_D8", "(ILandroidx/compose/foundation/lazy/grid/LazyGridItemProvider;Landroidx/compose/foundation/lazy/grid/LazyMeasuredLineProvider;Landroidx/compose/foundation/lazy/grid/LazyMeasuredItemProvider;IIIIIIFJZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "measureLazyGrid", "Landroidx/compose/foundation/lazy/grid/ItemIndex;", "itemConstraints", "filter", "", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "calculateExtraItems", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;Landroidx/compose/foundation/lazy/grid/LazyMeasuredItemProvider;Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", "lines", "itemsBefore", "itemsAfter", "layoutWidth", "layoutHeight", "finalMainAxisOffset", "maxOffset", "firstLineScrollOffset", "", "Landroidx/compose/foundation/lazy/grid/LazyGridPositionedItem;", "calculateItemsOffsets", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIIIZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;)Ljava/util/List;", "mainAxisOffset", "positionExtraItem", "(Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;III)Landroidx/compose/foundation/lazy/grid/LazyGridPositionedItem;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LazyGridMeasureKt {
    @ExperimentalFoundationApi
    private static final List<LazyGridMeasuredItem> calculateExtraItems(LazyLayoutPinnedItemList lazyLayoutPinnedItemList, LazyMeasuredItemProvider lazyMeasuredItemProvider, LazyGridItemProvider lazyGridItemProvider, Function1<? super ItemIndex, Constraints> function1, Function1<? super Integer, Boolean> function12) {
        int size = lazyLayoutPinnedItemList.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            LazyLayoutPinnedItemList.PinnedItem pinnedItem = lazyLayoutPinnedItemList.get(i10);
            int iFindIndexByKey = LazyLayoutItemProviderKt.findIndexByKey(lazyGridItemProvider, pinnedItem.getKey(), pinnedItem.getIndex());
            if (function12.invoke(Integer.valueOf(iFindIndexByKey)).booleanValue()) {
                int iM552constructorimpl = ItemIndex.m552constructorimpl(iFindIndexByKey);
                LazyGridMeasuredItem lazyGridMeasuredItemM593getAndMeasureednRnyU$default = LazyMeasuredItemProvider.m593getAndMeasureednRnyU$default(lazyMeasuredItemProvider, iM552constructorimpl, 0, function1.invoke(ItemIndex.m550boximpl(iM552constructorimpl)).getValue(), 2, null);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(lazyGridMeasuredItemM593getAndMeasureednRnyU$default);
            }
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
    }

    private static final List<LazyGridPositionedItem> calculateItemsOffsets(List<LazyGridMeasuredLine> list, List<LazyGridMeasuredItem> list2, List<LazyGridMeasuredItem> list3, int i10, int i11, int i12, int i13, int i14, boolean z10, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z11, Density density) {
        int i15 = z10 ? i11 : i10;
        boolean z12 = i12 < Math.min(i15, i13);
        if (z12 && i14 != 0) {
            throw new IllegalStateException("Check failed.");
        }
        int size = list.size();
        int length = 0;
        for (int i16 = 0; i16 < size; i16++) {
            length += list.get(i16).getItems().length;
        }
        ArrayList arrayList = new ArrayList(length);
        if (!z12) {
            int size2 = list2.size();
            int mainAxisSizeWithSpacings = i14;
            for (int i17 = 0; i17 < size2; i17++) {
                LazyGridMeasuredItem lazyGridMeasuredItem = list2.get(i17);
                mainAxisSizeWithSpacings -= lazyGridMeasuredItem.getMainAxisSizeWithSpacings();
                arrayList.add(positionExtraItem(lazyGridMeasuredItem, mainAxisSizeWithSpacings, i10, i11));
            }
            int size3 = list.size();
            int mainAxisSizeWithSpacings2 = i14;
            for (int i18 = 0; i18 < size3; i18++) {
                LazyGridMeasuredLine lazyGridMeasuredLine = list.get(i18);
                arrayList.addAll(lazyGridMeasuredLine.position(mainAxisSizeWithSpacings2, i10, i11));
                mainAxisSizeWithSpacings2 += lazyGridMeasuredLine.getMainAxisSizeWithSpacings();
            }
            int size4 = list3.size();
            for (int i19 = 0; i19 < size4; i19++) {
                LazyGridMeasuredItem lazyGridMeasuredItem2 = list3.get(i19);
                arrayList.add(positionExtraItem(lazyGridMeasuredItem2, mainAxisSizeWithSpacings2, i10, i11));
                mainAxisSizeWithSpacings2 += lazyGridMeasuredItem2.getMainAxisSizeWithSpacings();
            }
        } else {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            int size5 = list.size();
            int[] iArr = new int[size5];
            for (int i20 = 0; i20 < size5; i20++) {
                iArr[i20] = list.get(calculateItemsOffsets$reverseAware(i20, z11, size5)).getMainAxisSize();
            }
            int[] iArr2 = new int[size5];
            for (int i21 = 0; i21 < size5; i21++) {
                iArr2[i21] = 0;
            }
            if (z10) {
                if (vertical == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                vertical.arrange(density, i15, iArr, iArr2);
            } else {
                if (horizontal == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                horizontal.arrange(density, i15, iArr, LayoutDirection.Ltr, iArr2);
            }
            d indices = ArraysKt.getIndices(iArr2);
            if (z11) {
                indices = g.s(indices);
            }
            int iE = indices.e();
            int iF = indices.f();
            int iG = indices.g();
            if ((iG > 0 && iE <= iF) || (iG < 0 && iF <= iE)) {
                while (true) {
                    int mainAxisSize = iArr2[iE];
                    LazyGridMeasuredLine lazyGridMeasuredLine2 = list.get(calculateItemsOffsets$reverseAware(iE, z11, size5));
                    if (z11) {
                        mainAxisSize = (i15 - mainAxisSize) - lazyGridMeasuredLine2.getMainAxisSize();
                    }
                    arrayList.addAll(lazyGridMeasuredLine2.position(mainAxisSize, i10, i11));
                    if (iE == iF) {
                        break;
                    }
                    iE += iG;
                }
            }
        }
        return arrayList;
    }

    private static final int calculateItemsOffsets$reverseAware(int i10, boolean z10, int i11) {
        return !z10 ? i10 : (i11 - i10) - 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: measureLazyGrid-t5wl_D8, reason: not valid java name */
    public static final LazyGridMeasureResult m581measureLazyGridt5wl_D8(int i10, @NotNull LazyGridItemProvider itemProvider, @NotNull LazyMeasuredLineProvider measuredLineProvider, @NotNull LazyMeasuredItemProvider measuredItemProvider, int i11, int i12, int i13, int i14, int i15, int i16, float f10, long j10, boolean z10, @Nullable Arrangement.Vertical vertical, @Nullable Arrangement.Horizontal horizontal, boolean z11, @NotNull Density density, @NotNull LazyGridItemPlacementAnimator placementAnimator, @NotNull LazyGridSpanLayoutProvider spanLayoutProvider, @NotNull LazyLayoutPinnedItemList pinnedItems, @NotNull Function3<? super Integer, ? super Integer, ? super Function1<? super Placeable.PlacementScope, Unit>, ? extends MeasureResult> layout) {
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        List<LazyGridPositionedItem> list;
        int i24;
        int i25;
        int i26;
        ArrayList arrayList;
        float f11;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        LazyGridMeasuredItem[] items;
        LazyGridMeasuredItem lazyGridMeasuredItem;
        int i33;
        int i34;
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        Intrinsics.checkNotNullParameter(measuredLineProvider, "measuredLineProvider");
        Intrinsics.checkNotNullParameter(measuredItemProvider, "measuredItemProvider");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(placementAnimator, "placementAnimator");
        Intrinsics.checkNotNullParameter(spanLayoutProvider, "spanLayoutProvider");
        Intrinsics.checkNotNullParameter(pinnedItems, "pinnedItems");
        Intrinsics.checkNotNullParameter(layout, "layout");
        if (i12 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i13 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i10 <= 0) {
            return new LazyGridMeasureResult(null, 0, false, 0.0f, layout.invoke(Integer.valueOf(Constraints.m3921getMinWidthimpl(j10)), Integer.valueOf(Constraints.m3920getMinHeightimpl(j10)), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridMeasureKt$measureLazyGrid$1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Placeable.PlacementScope invoke) {
                    Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return Unit.f93236a;
                }
            }), CollectionsKt.emptyList(), -i12, i11 + i13, 0, z11, z10 ? Orientation.Vertical : Orientation.Horizontal, i13, i14);
        }
        int iD = zf.a.d(f10);
        int i35 = i16 - iD;
        int i36 = 0;
        if (LineIndex.m603equalsimpl0(i15, LineIndex.m600constructorimpl(0)) && i35 < 0) {
            iD += i35;
            i35 = 0;
        }
        ArrayList arrayList2 = new ArrayList();
        int i37 = i35;
        int i38 = -i12;
        int i39 = i38 + (i14 < 0 ? i14 : 0);
        int mainAxisSizeWithSpacings = i37 + i39;
        while (true) {
            i17 = i15;
            if (mainAxisSizeWithSpacings >= 0 || i17 - LineIndex.m600constructorimpl(i36) <= 0) {
                break;
            }
            int iM600constructorimpl = LineIndex.m600constructorimpl(i17 - 1);
            int i40 = iD;
            LazyGridMeasuredLine lazyGridMeasuredLineM596getAndMeasurebKFJvoY = measuredLineProvider.m596getAndMeasurebKFJvoY(iM600constructorimpl);
            i15 = iM600constructorimpl;
            arrayList2.add(i36, lazyGridMeasuredLineM596getAndMeasurebKFJvoY);
            mainAxisSizeWithSpacings += lazyGridMeasuredLineM596getAndMeasurebKFJvoY.getMainAxisSizeWithSpacings();
            iD = i40;
            i36 = 0;
        }
        int i41 = iD;
        if (mainAxisSizeWithSpacings < i39) {
            i18 = i41 + mainAxisSizeWithSpacings;
            mainAxisSizeWithSpacings = i39;
        } else {
            i18 = i41;
        }
        int mainAxisSizeWithSpacings2 = mainAxisSizeWithSpacings - i39;
        int i42 = i11 + i13;
        int i43 = i18;
        int i44 = i38;
        int iE = g.e(i42, 0);
        int size = arrayList2.size();
        int mainAxisSizeWithSpacings3 = -mainAxisSizeWithSpacings2;
        int iM600constructorimpl2 = i17;
        for (int i45 = 0; i45 < size; i45++) {
            LazyGridMeasuredLine lazyGridMeasuredLine = (LazyGridMeasuredLine) arrayList2.get(i45);
            iM600constructorimpl2 = LineIndex.m600constructorimpl(iM600constructorimpl2 + 1);
            mainAxisSizeWithSpacings3 += lazyGridMeasuredLine.getMainAxisSizeWithSpacings();
        }
        int i46 = mainAxisSizeWithSpacings3;
        int iM600constructorimpl3 = iM600constructorimpl2;
        while (iM600constructorimpl3 < i10 && (i46 < iE || i46 <= 0 || arrayList2.isEmpty())) {
            i19 = mainAxisSizeWithSpacings2;
            LazyGridMeasuredLine lazyGridMeasuredLineM596getAndMeasurebKFJvoY2 = measuredLineProvider.m596getAndMeasurebKFJvoY(iM600constructorimpl3);
            if (lazyGridMeasuredLineM596getAndMeasurebKFJvoY2.isEmpty()) {
                break;
            }
            int mainAxisSizeWithSpacings4 = i46 + lazyGridMeasuredLineM596getAndMeasurebKFJvoY2.getMainAxisSizeWithSpacings();
            if (mainAxisSizeWithSpacings4 <= i39) {
                i33 = mainAxisSizeWithSpacings4;
                i34 = i39;
                if (((LazyGridMeasuredItem) ArraysKt.last(lazyGridMeasuredLineM596getAndMeasurebKFJvoY2.getItems())).getIndex() != i10 - 1) {
                    int iM600constructorimpl4 = LineIndex.m600constructorimpl(iM600constructorimpl3 + 1);
                    mainAxisSizeWithSpacings2 = i19 - lazyGridMeasuredLineM596getAndMeasurebKFJvoY2.getMainAxisSizeWithSpacings();
                    i17 = iM600constructorimpl4;
                }
                iM600constructorimpl3 = LineIndex.m600constructorimpl(iM600constructorimpl3 + 1);
                i39 = i34;
                i46 = i33;
            } else {
                i33 = mainAxisSizeWithSpacings4;
                i34 = i39;
            }
            arrayList2.add(lazyGridMeasuredLineM596getAndMeasurebKFJvoY2);
            mainAxisSizeWithSpacings2 = i19;
            iM600constructorimpl3 = LineIndex.m600constructorimpl(iM600constructorimpl3 + 1);
            i39 = i34;
            i46 = i33;
        }
        i19 = mainAxisSizeWithSpacings2;
        if (i46 < i11) {
            int i47 = i11 - i46;
            int mainAxisSizeWithSpacings5 = i19 - i47;
            i46 += i47;
            while (true) {
                i20 = 0;
                if (mainAxisSizeWithSpacings5 >= i12 || i17 - LineIndex.m600constructorimpl(0) <= 0) {
                    break;
                }
                int iM600constructorimpl5 = LineIndex.m600constructorimpl(i17 - 1);
                LazyGridMeasuredLine lazyGridMeasuredLineM596getAndMeasurebKFJvoY3 = measuredLineProvider.m596getAndMeasurebKFJvoY(iM600constructorimpl5);
                arrayList2.add(0, lazyGridMeasuredLineM596getAndMeasurebKFJvoY3);
                mainAxisSizeWithSpacings5 += lazyGridMeasuredLineM596getAndMeasurebKFJvoY3.getMainAxisSizeWithSpacings();
                i17 = iM600constructorimpl5;
            }
            int i48 = i43 + i47;
            if (mainAxisSizeWithSpacings5 < 0) {
                i46 += mainAxisSizeWithSpacings5;
                i21 = i48 + mainAxisSizeWithSpacings5;
                i22 = 0;
            } else {
                i21 = i48;
                i22 = mainAxisSizeWithSpacings5;
            }
        } else {
            i20 = 0;
            i21 = i43;
            i22 = i19;
        }
        float f12 = (zf.a.a(zf.a.d(f10)) != zf.a.a(i21) || Math.abs(zf.a.d(f10)) < Math.abs(i21)) ? f10 : i21;
        if (i22 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i49 = -i22;
        LazyGridMeasuredLine lazyGridMeasuredLine2 = (LazyGridMeasuredLine) CollectionsKt.first((List) arrayList2);
        LazyGridMeasuredItem lazyGridMeasuredItem2 = (LazyGridMeasuredItem) ArraysKt.firstOrNull(lazyGridMeasuredLine2.getItems());
        int index = lazyGridMeasuredItem2 != null ? lazyGridMeasuredItem2.getIndex() : i20;
        LazyGridMeasuredLine lazyGridMeasuredLine3 = (LazyGridMeasuredLine) CollectionsKt.lastOrNull((List) arrayList2);
        int index2 = (lazyGridMeasuredLine3 == null || (items = lazyGridMeasuredLine3.getItems()) == null || (lazyGridMeasuredItem = (LazyGridMeasuredItem) ArraysKt.lastOrNull(items)) == null) ? i20 : lazyGridMeasuredItem.getIndex();
        ArrayList arrayList3 = arrayList2;
        int size2 = pinnedItems.size();
        List listEmptyList = null;
        int i50 = index2;
        List listEmptyList2 = null;
        int i51 = i20;
        while (i51 < size2) {
            LazyLayoutPinnedItemList.PinnedItem pinnedItem = pinnedItems.get(i51);
            int i52 = i22;
            int iFindIndexByKey = LazyLayoutItemProviderKt.findIndexByKey(itemProvider, pinnedItem.getKey(), pinnedItem.getIndex());
            if (iFindIndexByKey < 0 || iFindIndexByKey >= index) {
                i26 = i50;
                arrayList = arrayList3;
                f11 = f12;
                i27 = size2;
                i28 = index;
                i29 = i51;
                i30 = i44;
                i31 = 0;
                i32 = i49;
            } else {
                int iM552constructorimpl = ItemIndex.m552constructorimpl(iFindIndexByKey);
                int i53 = index;
                long jM597itemConstraintsHZ0wssc = measuredLineProvider.m597itemConstraintsHZ0wssc(iM552constructorimpl);
                i27 = size2;
                i26 = i50;
                f11 = f12;
                i29 = i51;
                i28 = i53;
                i31 = 0;
                i30 = i44;
                i32 = i49;
                arrayList = arrayList3;
                LazyGridMeasuredItem lazyGridMeasuredItemM593getAndMeasureednRnyU$default = LazyMeasuredItemProvider.m593getAndMeasureednRnyU$default(measuredItemProvider, iM552constructorimpl, 0, jM597itemConstraintsHZ0wssc, 2, null);
                if (listEmptyList2 == null) {
                    listEmptyList2 = new ArrayList();
                }
                List list2 = listEmptyList2;
                list2.add(lazyGridMeasuredItemM593getAndMeasureednRnyU$default);
                listEmptyList2 = list2;
            }
            i51 = i29 + 1;
            arrayList3 = arrayList;
            i50 = i26;
            f12 = f11;
            i49 = i32;
            i22 = i52;
            i20 = i31;
            i44 = i30;
            size2 = i27;
            index = i28;
        }
        int i54 = i50;
        int i55 = i22;
        float f13 = f12;
        int i56 = index;
        int i57 = i20;
        int i58 = i44;
        ArrayList arrayList4 = arrayList3;
        int i59 = i49;
        if (listEmptyList2 == null) {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        int size3 = pinnedItems.size();
        int i60 = i57;
        while (i60 < size3) {
            LazyLayoutPinnedItemList.PinnedItem pinnedItem2 = pinnedItems.get(i60);
            int iFindIndexByKey2 = LazyLayoutItemProviderKt.findIndexByKey(itemProvider, pinnedItem2.getKey(), pinnedItem2.getIndex());
            if (i54 + 1 > iFindIndexByKey2 || iFindIndexByKey2 >= i10) {
                i24 = size3;
                i25 = i60;
            } else {
                int iM552constructorimpl2 = ItemIndex.m552constructorimpl(iFindIndexByKey2);
                i25 = i60;
                i24 = size3;
                LazyGridMeasuredItem lazyGridMeasuredItemM593getAndMeasureednRnyU$default2 = LazyMeasuredItemProvider.m593getAndMeasureednRnyU$default(measuredItemProvider, iM552constructorimpl2, 0, measuredLineProvider.m597itemConstraintsHZ0wssc(iM552constructorimpl2), 2, null);
                if (listEmptyList == null) {
                    listEmptyList = new ArrayList();
                }
                List list3 = listEmptyList;
                list3.add(lazyGridMeasuredItemM593getAndMeasureednRnyU$default2);
                listEmptyList = list3;
            }
            i60 = i25 + 1;
            size3 = i24;
        }
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List list4 = listEmptyList;
        if (i12 > 0 || i14 < 0) {
            int size4 = arrayList4.size();
            int i61 = i55;
            int i62 = i57;
            while (i62 < size4) {
                int mainAxisSizeWithSpacings6 = ((LazyGridMeasuredLine) arrayList4.get(i62)).getMainAxisSizeWithSpacings();
                if (i61 == 0 || mainAxisSizeWithSpacings6 > i61 || i62 == CollectionsKt.getLastIndex(arrayList4)) {
                    break;
                }
                i61 -= mainAxisSizeWithSpacings6;
                i62++;
                lazyGridMeasuredLine2 = (LazyGridMeasuredLine) arrayList4.get(i62);
            }
            i23 = i61;
        } else {
            i23 = i55;
        }
        LazyGridMeasuredLine lazyGridMeasuredLine4 = lazyGridMeasuredLine2;
        int iM3919getMaxWidthimpl = z10 ? Constraints.m3919getMaxWidthimpl(j10) : ConstraintsKt.m3933constrainWidthK40F9xA(j10, i46);
        int iM3932constrainHeightK40F9xA = z10 ? ConstraintsKt.m3932constrainHeightK40F9xA(j10, i46) : Constraints.m3918getMaxHeightimpl(j10);
        int i63 = i46;
        List list5 = listEmptyList2;
        final List<LazyGridPositionedItem> listCalculateItemsOffsets = calculateItemsOffsets(arrayList4, list5, list4, iM3919getMaxWidthimpl, iM3932constrainHeightK40F9xA, i63, i11, i59, z10, vertical, horizontal, z11, density);
        placementAnimator.onMeasured((int) f13, iM3919getMaxWidthimpl, iM3932constrainHeightK40F9xA, listCalculateItemsOffsets, measuredItemProvider, spanLayoutProvider);
        int i64 = (i54 != i10 + (-1) || i63 > i11) ? 1 : i57;
        MeasureResult measureResultInvoke = layout.invoke(Integer.valueOf(iM3919getMaxWidthimpl), Integer.valueOf(iM3932constrainHeightK40F9xA), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridMeasureKt$measureLazyGrid$3
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
            public final void invoke2(@NotNull Placeable.PlacementScope invoke) {
                Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
                List<LazyGridPositionedItem> list6 = listCalculateItemsOffsets;
                int size5 = list6.size();
                for (int i65 = 0; i65 < size5; i65++) {
                    list6.get(i65).place(invoke);
                }
            }
        });
        if (list5.isEmpty() && list4.isEmpty()) {
            list = listCalculateItemsOffsets;
        } else {
            ArrayList arrayList5 = new ArrayList(listCalculateItemsOffsets.size());
            int size5 = listCalculateItemsOffsets.size();
            int i65 = i57;
            while (i65 < size5) {
                LazyGridPositionedItem lazyGridPositionedItem = listCalculateItemsOffsets.get(i65);
                int index3 = lazyGridPositionedItem.getIndex();
                int i66 = i56;
                if (i66 <= index3 && index3 <= i54) {
                    arrayList5.add(lazyGridPositionedItem);
                }
                i65++;
                i56 = i66;
            }
            list = arrayList5;
        }
        return new LazyGridMeasureResult(lazyGridMeasuredLine4, i23, i64, f13, measureResultInvoke, list, i58, i42, i10, z11, z10 ? Orientation.Vertical : Orientation.Horizontal, i13, i14);
    }

    private static final LazyGridPositionedItem positionExtraItem(LazyGridMeasuredItem lazyGridMeasuredItem, int i10, int i11, int i12) {
        return lazyGridMeasuredItem.position(i10, 0, i11, i12, 0, 0);
    }
}
