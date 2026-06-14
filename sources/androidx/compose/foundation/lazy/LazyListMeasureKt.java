package androidx.compose.foundation.lazy;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.ranges.d;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aó\u0001\u0010,\u001a\u00020)2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00000\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!2*\u0010(\u001a&\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$\u0012\u0004\u0012\u00020'0#H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010+\u001aS\u00100\u001a\b\u0012\u0004\u0012\u00020.0\u00132\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b0\u00101\u001aS\u00105\u001a\b\u0012\u0004\u0012\u00020.0\u00132\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u00102\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b3\u00104\u001a\u0093\u0001\u0010?\u001a\b\u0012\u0004\u0012\u00020>0-2\f\u00106\u001a\b\u0012\u0004\u0012\u00020.0\u00132\f\u00107\u001a\b\u0012\u0004\u0012\u00020.0\u00132\f\u00108\u001a\b\u0012\u0004\u0012\u00020.0\u00132\u0006\u00109\u001a\u00020\u00002\u0006\u0010:\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u00002\u0006\u0010<\u001a\u00020\u00002\u0006\u0010=\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b?\u0010@\" \u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010C\"\u0018\u0010F\u001a\u00020\u0011*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010E\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006G"}, d2 = {"", "itemsCount", "Landroidx/compose/foundation/lazy/LazyListItemProvider;", "itemProvider", "Landroidx/compose/foundation/lazy/LazyMeasuredItemProvider;", "measuredItemProvider", "mainAxisAvailableSize", "beforeContentPadding", "afterContentPadding", "spaceBetweenItems", "Landroidx/compose/foundation/lazy/DataIndex;", "firstVisibleItemIndex", "firstVisibleItemScrollOffset", "", "scrollToBeConsumed", "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "isVertical", "", "headerIndexes", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "reverseLayout", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;", "placementAnimator", "Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;", "beyondBoundsInfo", "beyondBoundsItemCount", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "pinnedItems", "Lkotlin/Function3;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Landroidx/compose/ui/layout/MeasureResult;", "layout", "Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "measureLazyList-Hh3qtAg", "(ILandroidx/compose/foundation/lazy/LazyListItemProvider;Landroidx/compose/foundation/lazy/LazyMeasuredItemProvider;IIIIIIFJZLjava/util/List;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;ILandroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "measureLazyList", "", "Landroidx/compose/foundation/lazy/LazyMeasuredItem;", "visibleItems", "createItemsAfterList", "(Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;Ljava/util/List;Landroidx/compose/foundation/lazy/LazyMeasuredItemProvider;Landroidx/compose/foundation/lazy/LazyListItemProvider;IILandroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;)Ljava/util/List;", "currentFirstItemIndex", "createItemsBeforeList-tv8sHfA", "(Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;ILandroidx/compose/foundation/lazy/LazyMeasuredItemProvider;Landroidx/compose/foundation/lazy/LazyListItemProvider;IILandroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;)Ljava/util/List;", "createItemsBeforeList", FirebaseAnalytics.Param.ITEMS, "extraItemsBefore", "extraItemsAfter", "layoutWidth", "layoutHeight", "finalMainAxisOffset", "maxOffset", "itemsScrollOffset", "Landroidx/compose/foundation/lazy/LazyListPositionedItem;", "calculateItemsOffsets", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIIIZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;)Ljava/util/List;", "Lkotlin/Pair;", "EmptyRange", "Lkotlin/Pair;", "getNotInEmptyRange", "(I)Z", "notInEmptyRange", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LazyListMeasureKt {

    @NotNull
    private static final Pair<Integer, Integer> EmptyRange = TuplesKt.to(Integer.MIN_VALUE, Integer.MIN_VALUE);

    private static final List<LazyListPositionedItem> calculateItemsOffsets(List<LazyMeasuredItem> list, List<LazyMeasuredItem> list2, List<LazyMeasuredItem> list3, int i10, int i11, int i12, int i13, int i14, boolean z10, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z11, Density density) {
        int i15 = z10 ? i11 : i10;
        boolean z12 = i12 < Math.min(i15, i13);
        if (z12 && i14 != 0) {
            throw new IllegalStateException("Check failed.");
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + list3.size());
        if (!z12) {
            int size = list2.size();
            int sizeWithSpacings = i14;
            for (int i16 = 0; i16 < size; i16++) {
                LazyMeasuredItem lazyMeasuredItem = list2.get(i16);
                sizeWithSpacings -= lazyMeasuredItem.getSizeWithSpacings();
                arrayList.add(lazyMeasuredItem.position(sizeWithSpacings, i10, i11));
            }
            int size2 = list.size();
            int sizeWithSpacings2 = i14;
            for (int i17 = 0; i17 < size2; i17++) {
                LazyMeasuredItem lazyMeasuredItem2 = list.get(i17);
                arrayList.add(lazyMeasuredItem2.position(sizeWithSpacings2, i10, i11));
                sizeWithSpacings2 += lazyMeasuredItem2.getSizeWithSpacings();
            }
            int size3 = list3.size();
            for (int i18 = 0; i18 < size3; i18++) {
                LazyMeasuredItem lazyMeasuredItem3 = list3.get(i18);
                arrayList.add(lazyMeasuredItem3.position(sizeWithSpacings2, i10, i11));
                sizeWithSpacings2 += lazyMeasuredItem3.getSizeWithSpacings();
            }
        } else {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            int size4 = list.size();
            int[] iArr = new int[size4];
            for (int i19 = 0; i19 < size4; i19++) {
                iArr[i19] = list.get(calculateItemsOffsets$reverseAware(i19, z11, size4)).getSize();
            }
            int[] iArr2 = new int[size4];
            for (int i20 = 0; i20 < size4; i20++) {
                iArr2[i20] = 0;
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
                    int size5 = iArr2[iE];
                    LazyMeasuredItem lazyMeasuredItem4 = list.get(calculateItemsOffsets$reverseAware(iE, z11, size4));
                    if (z11) {
                        size5 = (i15 - size5) - lazyMeasuredItem4.getSize();
                    }
                    arrayList.add(lazyMeasuredItem4.position(size5, i10, i11));
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

    private static final List<LazyMeasuredItem> createItemsAfterList(LazyListBeyondBoundsInfo lazyListBeyondBoundsInfo, List<LazyMeasuredItem> list, LazyMeasuredItemProvider lazyMeasuredItemProvider, LazyListItemProvider lazyListItemProvider, int i10, int i11, LazyLayoutPinnedItemList lazyLayoutPinnedItemList) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        int index = ((LazyMeasuredItem) CollectionsKt.last((List) list)).getIndex();
        if (lazyListBeyondBoundsInfo.hasIntervals()) {
            index = Math.max(createItemsAfterList$endIndex(lazyListBeyondBoundsInfo, i10), index);
        }
        int iMin = Math.min(index + i11, i10 - 1);
        int index2 = ((LazyMeasuredItem) CollectionsKt.last((List) list)).getIndex() + 1;
        if (index2 <= iMin) {
            while (true) {
                createItemsAfterList$addItem(ref$ObjectRef, lazyMeasuredItemProvider, index2);
                if (index2 == iMin) {
                    break;
                }
                index2++;
            }
        }
        int size = lazyLayoutPinnedItemList.size();
        for (int i12 = 0; i12 < size; i12++) {
            LazyLayoutPinnedItemList.PinnedItem pinnedItem = lazyLayoutPinnedItemList.get(i12);
            int iFindIndexByKey = LazyLayoutItemProviderKt.findIndexByKey(lazyListItemProvider, pinnedItem.getKey(), pinnedItem.getIndex());
            if (iFindIndexByKey > iMin && iFindIndexByKey < i10) {
                createItemsAfterList$addItem(ref$ObjectRef, lazyMeasuredItemProvider, iFindIndexByKey);
            }
        }
        List<LazyMeasuredItem> list2 = (List) ref$ObjectRef.f93280b;
        return list2 == null ? CollectionsKt.emptyList() : list2;
    }

    private static final void createItemsAfterList$addItem(Ref$ObjectRef ref$ObjectRef, LazyMeasuredItemProvider lazyMeasuredItemProvider, int i10) {
        if (ref$ObjectRef.f93280b == null) {
            ref$ObjectRef.f93280b = new ArrayList();
        }
        Object obj = ref$ObjectRef.f93280b;
        if (obj == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ((List) obj).add(lazyMeasuredItemProvider.m537getAndMeasureZjPyQlc(DataIndex.m506constructorimpl(i10)));
    }

    private static final int createItemsAfterList$endIndex(LazyListBeyondBoundsInfo lazyListBeyondBoundsInfo, int i10) {
        return Math.min(lazyListBeyondBoundsInfo.getEnd(), i10 - 1);
    }

    /* JADX INFO: renamed from: createItemsBeforeList-tv8sHfA, reason: not valid java name */
    private static final List<LazyMeasuredItem> m526createItemsBeforeListtv8sHfA(LazyListBeyondBoundsInfo lazyListBeyondBoundsInfo, int i10, LazyMeasuredItemProvider lazyMeasuredItemProvider, LazyListItemProvider lazyListItemProvider, int i11, int i12, LazyLayoutPinnedItemList lazyLayoutPinnedItemList) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        int iMin = lazyListBeyondBoundsInfo.hasIntervals() ? Math.min(createItemsBeforeList_tv8sHfA$startIndex(lazyListBeyondBoundsInfo, i11), i10) : i10;
        int iMax = Math.max(0, iMin - i12);
        int i13 = i10 - 1;
        if (iMax <= i13) {
            while (true) {
                createItemsBeforeList_tv8sHfA$addItem$5(ref$ObjectRef, lazyMeasuredItemProvider, i13);
                if (i13 == iMax) {
                    break;
                }
                i13--;
            }
        }
        int size = lazyLayoutPinnedItemList.size();
        for (int i14 = 0; i14 < size; i14++) {
            LazyLayoutPinnedItemList.PinnedItem pinnedItem = lazyLayoutPinnedItemList.get(i14);
            int iFindIndexByKey = LazyLayoutItemProviderKt.findIndexByKey(lazyListItemProvider, pinnedItem.getKey(), pinnedItem.getIndex());
            if (iFindIndexByKey < iMax) {
                createItemsBeforeList_tv8sHfA$addItem$5(ref$ObjectRef, lazyMeasuredItemProvider, iFindIndexByKey);
            }
        }
        List<LazyMeasuredItem> list = (List) ref$ObjectRef.f93280b;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    private static final void createItemsBeforeList_tv8sHfA$addItem$5(Ref$ObjectRef ref$ObjectRef, LazyMeasuredItemProvider lazyMeasuredItemProvider, int i10) {
        if (ref$ObjectRef.f93280b == null) {
            ref$ObjectRef.f93280b = new ArrayList();
        }
        Object obj = ref$ObjectRef.f93280b;
        if (obj == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ((List) obj).add(lazyMeasuredItemProvider.m537getAndMeasureZjPyQlc(DataIndex.m506constructorimpl(i10)));
    }

    private static final int createItemsBeforeList_tv8sHfA$startIndex(LazyListBeyondBoundsInfo lazyListBeyondBoundsInfo, int i10) {
        return Math.min(lazyListBeyondBoundsInfo.getStart(), i10 - 1);
    }

    private static final boolean getNotInEmptyRange(int i10) {
        return i10 != Integer.MIN_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0249, code lost:
    
        r32 = r0;
     */
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: measureLazyList-Hh3qtAg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.foundation.lazy.LazyListMeasureResult m527measureLazyListHh3qtAg(int r23, @org.jetbrains.annotations.NotNull androidx.compose.foundation.lazy.LazyListItemProvider r24, @org.jetbrains.annotations.NotNull androidx.compose.foundation.lazy.LazyMeasuredItemProvider r25, int r26, int r27, int r28, int r29, int r30, int r31, float r32, long r33, boolean r35, @org.jetbrains.annotations.NotNull java.util.List<java.lang.Integer> r36, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.Arrangement.Vertical r37, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.Arrangement.Horizontal r38, boolean r39, @org.jetbrains.annotations.NotNull androidx.compose.ui.unit.Density r40, @org.jetbrains.annotations.NotNull androidx.compose.foundation.lazy.LazyListItemPlacementAnimator r41, @org.jetbrains.annotations.NotNull androidx.compose.foundation.lazy.LazyListBeyondBoundsInfo r42, int r43, @org.jetbrains.annotations.NotNull androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList r44, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super java.lang.Integer, ? super kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>, ? extends androidx.compose.ui.layout.MeasureResult> r45) {
        /*
            Method dump skipped, instruction units count: 952
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListMeasureKt.m527measureLazyListHh3qtAg(int, androidx.compose.foundation.lazy.LazyListItemProvider, androidx.compose.foundation.lazy.LazyMeasuredItemProvider, int, int, int, int, int, int, float, long, boolean, java.util.List, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, boolean, androidx.compose.ui.unit.Density, androidx.compose.foundation.lazy.LazyListItemPlacementAnimator, androidx.compose.foundation.lazy.LazyListBeyondBoundsInfo, int, androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList, kotlin.jvm.functions.Function3):androidx.compose.foundation.lazy.LazyListMeasureResult");
    }
}
