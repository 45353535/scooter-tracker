package androidx.compose.foundation.lazy.grid;

import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import com.ironsource.C4240b4;
import eg.i;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001a\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u00162\b\b\u0002\u0010!\u001a\u00020\bH\u0002J;\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020\b2\u0006\u0010&\u001a\u00020\b2\u0006\u0010'\u001a\u00020\u001cø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010)J<\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\b2\u0006\u0010-\u001a\u00020\b2\u0006\u0010.\u001a\u00020\b2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00160\u00122\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000203J\u0006\u00104\u001a\u00020+J\u0018\u00105\u001a\u00020+2\u0006\u0010 \u001a\u00020\u00162\u0006\u00106\u001a\u00020\rH\u0002J\u0014\u00107\u001a\u00020\u0005*\u00020\r2\u0006\u00108\u001a\u00020\bH\u0002J\u001c\u00109\u001a\u00020\u001c*\u00020\bH\u0002ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b:\u0010;R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b0\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u000fj\b\u0012\u0004\u0012\u00020\u0001`\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0018\u001a\u00020\b*\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001b\u001a\u00020\b*\u00020\u001c8BX\u0082\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006<"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "isVertical", "", "(Lkotlinx/coroutines/CoroutineScope;Z)V", "firstVisibleIndex", "", "keyToIndexMap", "", "keyToItemInfoMap", "", "Landroidx/compose/foundation/lazy/grid/ItemInfo;", "movingAwayKeys", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "movingAwayToEndBound", "", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "movingAwayToStartBound", "movingInFromEndBound", "Landroidx/compose/foundation/lazy/grid/LazyGridPositionedItem;", "movingInFromStartBound", "line", "getLine", "(Landroidx/compose/foundation/lazy/grid/LazyGridPositionedItem;)I", "mainAxis", "Landroidx/compose/ui/unit/IntOffset;", "getMainAxis--gyyYBs", "(J)I", "createItemInfo", "item", "mainAxisOffset", "getAnimatedOffset", C4240b4.i.W, "placeableIndex", "minOffset", "maxOffset", "rawOffset", "getAnimatedOffset-YT5a7pE", "(Ljava/lang/Object;IIIJ)J", "onMeasured", "", "consumedScroll", "layoutWidth", "layoutHeight", "positionedItems", "itemProvider", "Landroidx/compose/foundation/lazy/grid/LazyMeasuredItemProvider;", "spanLayoutProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "reset", "startAnimationsIfNeeded", "itemInfo", "isWithinBounds", "mainAxisLayoutSize", "toOffset", "toOffset-Bjo55l4", "(I)J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LazyGridItemPlacementAnimator {
    private int firstVisibleIndex;
    private final boolean isVertical;

    @NotNull
    private Map<Object, Integer> keyToIndexMap;

    @NotNull
    private final Map<Object, ItemInfo> keyToItemInfoMap;

    @NotNull
    private final LinkedHashSet<Object> movingAwayKeys;

    @NotNull
    private final List<LazyGridMeasuredItem> movingAwayToEndBound;

    @NotNull
    private final List<LazyGridMeasuredItem> movingAwayToStartBound;

    @NotNull
    private final List<LazyGridPositionedItem> movingInFromEndBound;

    @NotNull
    private final List<LazyGridPositionedItem> movingInFromStartBound;

    @NotNull
    private final CoroutineScope scope;

    public LazyGridItemPlacementAnimator(@NotNull CoroutineScope scope, boolean z10) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.scope = scope;
        this.isVertical = z10;
        this.keyToItemInfoMap = new LinkedHashMap();
        this.keyToIndexMap = MapsKt.emptyMap();
        this.movingAwayKeys = new LinkedHashSet<>();
        this.movingInFromStartBound = new ArrayList();
        this.movingInFromEndBound = new ArrayList();
        this.movingAwayToStartBound = new ArrayList();
        this.movingAwayToEndBound = new ArrayList();
    }

    private final ItemInfo createItemInfo(LazyGridPositionedItem item, int mainAxisOffset) {
        ItemInfo itemInfo = new ItemInfo(item.getCrossAxisSize(), item.getCrossAxisOffset());
        long jM4065copyiSbpLlY$default = this.isVertical ? IntOffset.m4065copyiSbpLlY$default(item.getOffset(), 0, mainAxisOffset, 1, null) : IntOffset.m4065copyiSbpLlY$default(item.getOffset(), mainAxisOffset, 0, 2, null);
        int placeablesCount = item.getPlaceablesCount();
        for (int i10 = 0; i10 < placeablesCount; i10++) {
            itemInfo.getPlaceables().add(new PlaceableInfo(jM4065copyiSbpLlY$default, item.getMainAxisSize(i10), null));
        }
        return itemInfo;
    }

    static /* synthetic */ ItemInfo createItemInfo$default(LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator, LazyGridPositionedItem lazyGridPositionedItem, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = lazyGridItemPlacementAnimator.m573getMainAxisgyyYBs(lazyGridPositionedItem.getOffset());
        }
        return lazyGridItemPlacementAnimator.createItemInfo(lazyGridPositionedItem, i10);
    }

    private final int getLine(LazyGridPositionedItem lazyGridPositionedItem) {
        return this.isVertical ? lazyGridPositionedItem.getRow() : lazyGridPositionedItem.getColumn();
    }

    /* JADX INFO: renamed from: getMainAxis--gyyYBs, reason: not valid java name */
    private final int m573getMainAxisgyyYBs(long j10) {
        return this.isVertical ? IntOffset.m4070getYimpl(j10) : IntOffset.m4069getXimpl(j10);
    }

    private final boolean isWithinBounds(ItemInfo itemInfo, int i10) {
        List<PlaceableInfo> placeables = itemInfo.getPlaceables();
        int size = placeables.size();
        for (int i11 = 0; i11 < size; i11++) {
            PlaceableInfo placeableInfo = placeables.get(i11);
            long targetOffset = placeableInfo.getTargetOffset();
            long notAnimatableDelta = itemInfo.getNotAnimatableDelta();
            long jIntOffset = IntOffsetKt.IntOffset(IntOffset.m4069getXimpl(targetOffset) + IntOffset.m4069getXimpl(notAnimatableDelta), IntOffset.m4070getYimpl(targetOffset) + IntOffset.m4070getYimpl(notAnimatableDelta));
            if (m573getMainAxisgyyYBs(jIntOffset) + placeableInfo.getMainAxisSize() > 0 && m573getMainAxisgyyYBs(jIntOffset) < i10) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void startAnimationsIfNeeded(androidx.compose.foundation.lazy.grid.LazyGridPositionedItem r18, androidx.compose.foundation.lazy.grid.ItemInfo r19) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator.startAnimationsIfNeeded(androidx.compose.foundation.lazy.grid.LazyGridPositionedItem, androidx.compose.foundation.lazy.grid.ItemInfo):void");
    }

    /* JADX INFO: renamed from: toOffset-Bjo55l4, reason: not valid java name */
    private final long m574toOffsetBjo55l4(int i10) {
        boolean z10 = this.isVertical;
        int i11 = z10 ? 0 : i10;
        if (!z10) {
            i10 = 0;
        }
        return IntOffsetKt.IntOffset(i11, i10);
    }

    /* JADX INFO: renamed from: getAnimatedOffset-YT5a7pE, reason: not valid java name */
    public final long m575getAnimatedOffsetYT5a7pE(@NotNull Object key, int placeableIndex, int minOffset, int maxOffset, long rawOffset) {
        Intrinsics.checkNotNullParameter(key, "key");
        ItemInfo itemInfo = this.keyToItemInfoMap.get(key);
        if (itemInfo == null) {
            return rawOffset;
        }
        PlaceableInfo placeableInfo = itemInfo.getPlaceables().get(placeableIndex);
        long packedValue = placeableInfo.getAnimatedOffset().getValue().getPackedValue();
        long notAnimatableDelta = itemInfo.getNotAnimatableDelta();
        long jIntOffset = IntOffsetKt.IntOffset(IntOffset.m4069getXimpl(packedValue) + IntOffset.m4069getXimpl(notAnimatableDelta), IntOffset.m4070getYimpl(packedValue) + IntOffset.m4070getYimpl(notAnimatableDelta));
        long targetOffset = placeableInfo.getTargetOffset();
        long notAnimatableDelta2 = itemInfo.getNotAnimatableDelta();
        long jIntOffset2 = IntOffsetKt.IntOffset(IntOffset.m4069getXimpl(targetOffset) + IntOffset.m4069getXimpl(notAnimatableDelta2), IntOffset.m4070getYimpl(targetOffset) + IntOffset.m4070getYimpl(notAnimatableDelta2));
        if (placeableInfo.getInProgress() && ((m573getMainAxisgyyYBs(jIntOffset2) <= minOffset && m573getMainAxisgyyYBs(jIntOffset) < minOffset) || (m573getMainAxisgyyYBs(jIntOffset2) >= maxOffset && m573getMainAxisgyyYBs(jIntOffset) > maxOffset))) {
            i.d(this.scope, null, null, new LazyGridItemPlacementAnimator$getAnimatedOffset$1(placeableInfo, null), 3, null);
        }
        return jIntOffset;
    }

    public final void onMeasured(int consumedScroll, int layoutWidth, int layoutHeight, @NotNull List<LazyGridPositionedItem> positionedItems, @NotNull LazyMeasuredItemProvider itemProvider, @NotNull LazyGridSpanLayoutProvider spanLayoutProvider) {
        boolean z10;
        int i10;
        Intrinsics.checkNotNullParameter(positionedItems, "positionedItems");
        LazyMeasuredItemProvider itemProvider2 = itemProvider;
        Intrinsics.checkNotNullParameter(itemProvider2, "itemProvider");
        Intrinsics.checkNotNullParameter(spanLayoutProvider, "spanLayoutProvider");
        int size = positionedItems.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                if (this.keyToItemInfoMap.isEmpty()) {
                    reset();
                    return;
                }
            } else if (positionedItems.get(i11).getHasAnimations()) {
                break;
            } else {
                i11++;
            }
        }
        int i12 = this.firstVisibleIndex;
        LazyGridPositionedItem lazyGridPositionedItem = (LazyGridPositionedItem) CollectionsKt.firstOrNull((List) positionedItems);
        this.firstVisibleIndex = lazyGridPositionedItem != null ? lazyGridPositionedItem.getIndex() : 0;
        final Map<Object, Integer> map = this.keyToIndexMap;
        this.keyToIndexMap = itemProvider2.getKeyToIndexMap();
        int i13 = this.isVertical ? layoutHeight : layoutWidth;
        long jM574toOffsetBjo55l4 = m574toOffsetBjo55l4(consumedScroll);
        this.movingAwayKeys.addAll(this.keyToItemInfoMap.keySet());
        int size2 = positionedItems.size();
        int i14 = 0;
        while (i14 < size2) {
            LazyGridPositionedItem lazyGridPositionedItem2 = positionedItems.get(i14);
            this.movingAwayKeys.remove(lazyGridPositionedItem2.getKey());
            if (lazyGridPositionedItem2.getHasAnimations()) {
                ItemInfo itemInfo = this.keyToItemInfoMap.get(lazyGridPositionedItem2.getKey());
                if (itemInfo == null) {
                    Integer num = map.get(lazyGridPositionedItem2.getKey());
                    if (num == null || lazyGridPositionedItem2.getIndex() == num.intValue()) {
                        i10 = i12;
                        this.keyToItemInfoMap.put(lazyGridPositionedItem2.getKey(), createItemInfo$default(this, lazyGridPositionedItem2, 0, 2, null));
                    } else {
                        if (num.intValue() < i12) {
                            this.movingInFromStartBound.add(lazyGridPositionedItem2);
                        } else {
                            this.movingInFromEndBound.add(lazyGridPositionedItem2);
                        }
                        i10 = i12;
                    }
                } else {
                    i10 = i12;
                    long notAnimatableDelta = itemInfo.getNotAnimatableDelta();
                    itemInfo.m564setNotAnimatableDeltagyyYBs(IntOffsetKt.IntOffset(IntOffset.m4069getXimpl(notAnimatableDelta) + IntOffset.m4069getXimpl(jM574toOffsetBjo55l4), IntOffset.m4070getYimpl(notAnimatableDelta) + IntOffset.m4070getYimpl(jM574toOffsetBjo55l4)));
                    itemInfo.setCrossAxisSize(lazyGridPositionedItem2.getCrossAxisSize());
                    itemInfo.setCrossAxisOffset(lazyGridPositionedItem2.getCrossAxisOffset());
                    startAnimationsIfNeeded(lazyGridPositionedItem2, itemInfo);
                }
            } else {
                i10 = i12;
                this.keyToItemInfoMap.remove(lazyGridPositionedItem2.getKey());
            }
            i14++;
            i12 = i10;
        }
        List<LazyGridPositionedItem> list = this.movingInFromStartBound;
        if (list.size() > 1) {
            CollectionsKt.sortWith(list, new Comparator() { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator$onMeasured$$inlined$sortByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    return mf.a.d((Integer) map.get(((LazyGridPositionedItem) t11).getKey()), (Integer) map.get(((LazyGridPositionedItem) t10).getKey()));
                }
            });
        }
        List<LazyGridPositionedItem> list2 = this.movingInFromStartBound;
        int size3 = list2.size();
        int i15 = -1;
        int i16 = 0;
        int i17 = 0;
        int mainAxisSize = 0;
        int i18 = -1;
        while (i16 < size3) {
            LazyGridPositionedItem lazyGridPositionedItem3 = list2.get(i16);
            int line = getLine(lazyGridPositionedItem3);
            if (line == i15 || line != i18) {
                i17 += mainAxisSize;
                mainAxisSize = lazyGridPositionedItem3.getMainAxisSize();
                i18 = line;
            } else {
                mainAxisSize = Math.max(mainAxisSize, lazyGridPositionedItem3.getMainAxisSize());
            }
            ItemInfo itemInfoCreateItemInfo = createItemInfo(lazyGridPositionedItem3, (0 - i17) - lazyGridPositionedItem3.getMainAxisSize());
            this.keyToItemInfoMap.put(lazyGridPositionedItem3.getKey(), itemInfoCreateItemInfo);
            startAnimationsIfNeeded(lazyGridPositionedItem3, itemInfoCreateItemInfo);
            i16++;
            i15 = -1;
        }
        List<LazyGridPositionedItem> list3 = this.movingInFromEndBound;
        if (list3.size() > 1) {
            CollectionsKt.sortWith(list3, new Comparator() { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator$onMeasured$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    return mf.a.d((Integer) map.get(((LazyGridPositionedItem) t10).getKey()), (Integer) map.get(((LazyGridPositionedItem) t11).getKey()));
                }
            });
        }
        List<LazyGridPositionedItem> list4 = this.movingInFromEndBound;
        int size4 = list4.size();
        int i19 = -1;
        int i20 = 0;
        int mainAxisSize2 = 0;
        for (int i21 = 0; i21 < size4; i21++) {
            LazyGridPositionedItem lazyGridPositionedItem4 = list4.get(i21);
            int line2 = getLine(lazyGridPositionedItem4);
            if (line2 == -1 || line2 != i19) {
                i20 += mainAxisSize2;
                mainAxisSize2 = lazyGridPositionedItem4.getMainAxisSize();
                i19 = line2;
            } else {
                mainAxisSize2 = Math.max(mainAxisSize2, lazyGridPositionedItem4.getMainAxisSize());
            }
            ItemInfo itemInfoCreateItemInfo2 = createItemInfo(lazyGridPositionedItem4, i13 + i20);
            this.keyToItemInfoMap.put(lazyGridPositionedItem4.getKey(), itemInfoCreateItemInfo2);
            startAnimationsIfNeeded(lazyGridPositionedItem4, itemInfoCreateItemInfo2);
        }
        for (Object obj : this.movingAwayKeys) {
            ItemInfo itemInfo2 = (ItemInfo) MapsKt.getValue(this.keyToItemInfoMap, obj);
            Integer num2 = this.keyToIndexMap.get(obj);
            List<PlaceableInfo> placeables = itemInfo2.getPlaceables();
            int size5 = placeables.size();
            int i22 = 0;
            while (true) {
                if (i22 >= size5) {
                    z10 = false;
                    break;
                } else {
                    if (placeables.get(i22).getInProgress()) {
                        z10 = true;
                        break;
                    }
                    i22++;
                }
            }
            if (itemInfo2.getPlaceables().isEmpty() || num2 == null || ((!z10 && Intrinsics.areEqual(num2, map.get(obj))) || !(z10 || isWithinBounds(itemInfo2, i13)))) {
                this.keyToItemInfoMap.remove(obj);
            } else {
                LazyGridMeasuredItem lazyGridMeasuredItemM593getAndMeasureednRnyU$default = LazyMeasuredItemProvider.m593getAndMeasureednRnyU$default(itemProvider2, ItemIndex.m552constructorimpl(num2.intValue()), 0, this.isVertical ? Constraints.INSTANCE.m3929fixedWidthOenEA2s(itemInfo2.getCrossAxisSize()) : Constraints.INSTANCE.m3928fixedHeightOenEA2s(itemInfo2.getCrossAxisSize()), 2, null);
                if (num2.intValue() < this.firstVisibleIndex) {
                    this.movingAwayToStartBound.add(lazyGridMeasuredItemM593getAndMeasureednRnyU$default);
                } else {
                    this.movingAwayToEndBound.add(lazyGridMeasuredItemM593getAndMeasureednRnyU$default);
                }
            }
            itemProvider2 = itemProvider;
        }
        List<LazyGridMeasuredItem> list5 = this.movingAwayToStartBound;
        if (list5.size() > 1) {
            CollectionsKt.sortWith(list5, new Comparator() { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator$onMeasured$$inlined$sortByDescending$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    return mf.a.d((Integer) this.this$0.keyToIndexMap.get(((LazyGridMeasuredItem) t11).getKey()), (Integer) this.this$0.keyToIndexMap.get(((LazyGridMeasuredItem) t10).getKey()));
                }
            });
        }
        List<LazyGridMeasuredItem> list6 = this.movingAwayToStartBound;
        int size6 = list6.size();
        int i23 = 0;
        int mainAxisSize3 = 0;
        int i24 = -1;
        for (int i25 = 0; i25 < size6; i25++) {
            LazyGridMeasuredItem lazyGridMeasuredItem = list6.get(i25);
            int iM591getLineIndexOfItem_Ze7BM = spanLayoutProvider.m591getLineIndexOfItem_Ze7BM(lazyGridMeasuredItem.getIndex());
            if (iM591getLineIndexOfItem_Ze7BM == -1 || iM591getLineIndexOfItem_Ze7BM != i24) {
                i23 += mainAxisSize3;
                mainAxisSize3 = lazyGridMeasuredItem.getMainAxisSize();
                i24 = iM591getLineIndexOfItem_Ze7BM;
            } else {
                mainAxisSize3 = Math.max(mainAxisSize3, lazyGridMeasuredItem.getMainAxisSize());
            }
            int mainAxisSize4 = (0 - i23) - lazyGridMeasuredItem.getMainAxisSize();
            ItemInfo itemInfo3 = (ItemInfo) MapsKt.getValue(this.keyToItemInfoMap, lazyGridMeasuredItem.getKey());
            LazyGridPositionedItem lazyGridPositionedItemPosition = lazyGridMeasuredItem.position(mainAxisSize4, itemInfo3.getCrossAxisOffset(), layoutWidth, layoutHeight, -1, -1);
            positionedItems.add(lazyGridPositionedItemPosition);
            startAnimationsIfNeeded(lazyGridPositionedItemPosition, itemInfo3);
        }
        List<LazyGridMeasuredItem> list7 = this.movingAwayToEndBound;
        if (list7.size() > 1) {
            CollectionsKt.sortWith(list7, new Comparator() { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator$onMeasured$$inlined$sortBy$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    return mf.a.d((Integer) this.this$0.keyToIndexMap.get(((LazyGridMeasuredItem) t10).getKey()), (Integer) this.this$0.keyToIndexMap.get(((LazyGridMeasuredItem) t11).getKey()));
                }
            });
        }
        List<LazyGridMeasuredItem> list8 = this.movingAwayToEndBound;
        int size7 = list8.size();
        int mainAxisSize5 = 0;
        int i26 = -1;
        int i27 = 0;
        for (int i28 = 0; i28 < size7; i28++) {
            LazyGridMeasuredItem lazyGridMeasuredItem2 = list8.get(i28);
            int iM591getLineIndexOfItem_Ze7BM2 = spanLayoutProvider.m591getLineIndexOfItem_Ze7BM(lazyGridMeasuredItem2.getIndex());
            if (iM591getLineIndexOfItem_Ze7BM2 == -1 || iM591getLineIndexOfItem_Ze7BM2 != i26) {
                i27 += mainAxisSize5;
                mainAxisSize5 = lazyGridMeasuredItem2.getMainAxisSize();
                i26 = iM591getLineIndexOfItem_Ze7BM2;
            } else {
                mainAxisSize5 = Math.max(mainAxisSize5, lazyGridMeasuredItem2.getMainAxisSize());
            }
            ItemInfo itemInfo4 = (ItemInfo) MapsKt.getValue(this.keyToItemInfoMap, lazyGridMeasuredItem2.getKey());
            LazyGridPositionedItem lazyGridPositionedItemPosition2 = lazyGridMeasuredItem2.position(i13 + i27, itemInfo4.getCrossAxisOffset(), layoutWidth, layoutHeight, -1, -1);
            positionedItems.add(lazyGridPositionedItemPosition2);
            startAnimationsIfNeeded(lazyGridPositionedItemPosition2, itemInfo4);
        }
        this.movingInFromStartBound.clear();
        this.movingInFromEndBound.clear();
        this.movingAwayToStartBound.clear();
        this.movingAwayToEndBound.clear();
        this.movingAwayKeys.clear();
    }

    public final void reset() {
        this.keyToItemInfoMap.clear();
        this.keyToIndexMap = MapsKt.emptyMap();
        this.firstVisibleIndex = -1;
    }
}
