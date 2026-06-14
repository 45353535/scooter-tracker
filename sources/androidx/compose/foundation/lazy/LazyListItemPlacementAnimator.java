package androidx.compose.foundation.lazy;

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
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001a\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00162\b\b\u0002\u0010\u001e\u001a\u00020\bH\u0002J;\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u0019ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b%\u0010&J4\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\b2\u0006\u0010+\u001a\u00020\b2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00160\u00122\u0006\u0010-\u001a\u00020.J\u0006\u0010/\u001a\u00020(J\u0018\u00100\u001a\u00020(2\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u00101\u001a\u00020\rH\u0002J\u0014\u00102\u001a\u00020\u0005*\u00020\r2\u0006\u00103\u001a\u00020\bH\u0002J\u001c\u00104\u001a\u00020\u0019*\u00020\bH\u0002ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b5\u00106R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b0\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u000fj\b\u0012\u0004\u0012\u00020\u0001`\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0018\u001a\u00020\b*\u00020\u00198BX\u0082\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00067"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "isVertical", "", "(Lkotlinx/coroutines/CoroutineScope;Z)V", "firstVisibleIndex", "", "keyToIndexMap", "", "keyToItemInfoMap", "", "Landroidx/compose/foundation/lazy/ItemInfo;", "movingAwayKeys", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "movingAwayToEndBound", "", "Landroidx/compose/foundation/lazy/LazyMeasuredItem;", "movingAwayToStartBound", "movingInFromEndBound", "Landroidx/compose/foundation/lazy/LazyListPositionedItem;", "movingInFromStartBound", "mainAxis", "Landroidx/compose/ui/unit/IntOffset;", "getMainAxis--gyyYBs", "(J)I", "createItemInfo", "item", "mainAxisOffset", "getAnimatedOffset", C4240b4.i.W, "placeableIndex", "minOffset", "maxOffset", "rawOffset", "getAnimatedOffset-YT5a7pE", "(Ljava/lang/Object;IIIJ)J", "onMeasured", "", "consumedScroll", "layoutWidth", "layoutHeight", "positionedItems", "itemProvider", "Landroidx/compose/foundation/lazy/LazyMeasuredItemProvider;", "reset", "startAnimationsIfNeeded", "itemInfo", "isWithinBounds", "mainAxisLayoutSize", "toOffset", "toOffset-Bjo55l4", "(I)J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LazyListItemPlacementAnimator {
    private int firstVisibleIndex;
    private final boolean isVertical;

    @NotNull
    private Map<Object, Integer> keyToIndexMap;

    @NotNull
    private final Map<Object, ItemInfo> keyToItemInfoMap;

    @NotNull
    private final LinkedHashSet<Object> movingAwayKeys;

    @NotNull
    private final List<LazyMeasuredItem> movingAwayToEndBound;

    @NotNull
    private final List<LazyMeasuredItem> movingAwayToStartBound;

    @NotNull
    private final List<LazyListPositionedItem> movingInFromEndBound;

    @NotNull
    private final List<LazyListPositionedItem> movingInFromStartBound;

    @NotNull
    private final CoroutineScope scope;

    public LazyListItemPlacementAnimator(@NotNull CoroutineScope scope, boolean z10) {
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

    private final ItemInfo createItemInfo(LazyListPositionedItem item, int mainAxisOffset) {
        ItemInfo itemInfo = new ItemInfo();
        long jM530getOffsetBjo55l4 = item.m530getOffsetBjo55l4(0);
        long jM4065copyiSbpLlY$default = this.isVertical ? IntOffset.m4065copyiSbpLlY$default(jM530getOffsetBjo55l4, 0, mainAxisOffset, 1, null) : IntOffset.m4065copyiSbpLlY$default(jM530getOffsetBjo55l4, mainAxisOffset, 0, 2, null);
        int placeablesCount = item.getPlaceablesCount();
        for (int i10 = 0; i10 < placeablesCount; i10++) {
            long jM530getOffsetBjo55l42 = item.m530getOffsetBjo55l4(i10);
            long jIntOffset = IntOffsetKt.IntOffset(IntOffset.m4069getXimpl(jM530getOffsetBjo55l42) - IntOffset.m4069getXimpl(jM530getOffsetBjo55l4), IntOffset.m4070getYimpl(jM530getOffsetBjo55l42) - IntOffset.m4070getYimpl(jM530getOffsetBjo55l4));
            itemInfo.getPlaceables().add(new PlaceableInfo(IntOffsetKt.IntOffset(IntOffset.m4069getXimpl(jM4065copyiSbpLlY$default) + IntOffset.m4069getXimpl(jIntOffset), IntOffset.m4070getYimpl(jM4065copyiSbpLlY$default) + IntOffset.m4070getYimpl(jIntOffset)), item.getMainAxisSize(i10), null));
        }
        return itemInfo;
    }

    static /* synthetic */ ItemInfo createItemInfo$default(LazyListItemPlacementAnimator lazyListItemPlacementAnimator, LazyListPositionedItem lazyListPositionedItem, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = lazyListItemPlacementAnimator.m520getMainAxisgyyYBs(lazyListPositionedItem.m530getOffsetBjo55l4(0));
        }
        return lazyListItemPlacementAnimator.createItemInfo(lazyListPositionedItem, i10);
    }

    /* JADX INFO: renamed from: getMainAxis--gyyYBs, reason: not valid java name */
    private final int m520getMainAxisgyyYBs(long j10) {
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
            if (m520getMainAxisgyyYBs(jIntOffset) + placeableInfo.getMainAxisSize() > 0 && m520getMainAxisgyyYBs(jIntOffset) < i10) {
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
    private final void startAnimationsIfNeeded(androidx.compose.foundation.lazy.LazyListPositionedItem r18, androidx.compose.foundation.lazy.ItemInfo r19) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListItemPlacementAnimator.startAnimationsIfNeeded(androidx.compose.foundation.lazy.LazyListPositionedItem, androidx.compose.foundation.lazy.ItemInfo):void");
    }

    /* JADX INFO: renamed from: toOffset-Bjo55l4, reason: not valid java name */
    private final long m521toOffsetBjo55l4(int i10) {
        boolean z10 = this.isVertical;
        int i11 = z10 ? 0 : i10;
        if (!z10) {
            i10 = 0;
        }
        return IntOffsetKt.IntOffset(i11, i10);
    }

    /* JADX INFO: renamed from: getAnimatedOffset-YT5a7pE, reason: not valid java name */
    public final long m522getAnimatedOffsetYT5a7pE(@NotNull Object key, int placeableIndex, int minOffset, int maxOffset, long rawOffset) {
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
        if (placeableInfo.getInProgress() && ((m520getMainAxisgyyYBs(jIntOffset2) <= minOffset && m520getMainAxisgyyYBs(jIntOffset) <= minOffset) || (m520getMainAxisgyyYBs(jIntOffset2) >= maxOffset && m520getMainAxisgyyYBs(jIntOffset) >= maxOffset))) {
            i.d(this.scope, null, null, new LazyListItemPlacementAnimator$getAnimatedOffset$1(placeableInfo, null), 3, null);
        }
        return jIntOffset;
    }

    public final void onMeasured(int consumedScroll, int layoutWidth, int layoutHeight, @NotNull List<LazyListPositionedItem> positionedItems, @NotNull LazyMeasuredItemProvider itemProvider) {
        boolean z10;
        int i10;
        long j10;
        Intrinsics.checkNotNullParameter(positionedItems, "positionedItems");
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
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
        LazyListPositionedItem lazyListPositionedItem = (LazyListPositionedItem) CollectionsKt.firstOrNull((List) positionedItems);
        this.firstVisibleIndex = lazyListPositionedItem != null ? lazyListPositionedItem.getIndex() : 0;
        final Map<Object, Integer> map = this.keyToIndexMap;
        this.keyToIndexMap = itemProvider.getKeyToIndexMap();
        int i13 = this.isVertical ? layoutHeight : layoutWidth;
        long jM521toOffsetBjo55l4 = m521toOffsetBjo55l4(consumedScroll);
        this.movingAwayKeys.addAll(this.keyToItemInfoMap.keySet());
        int size2 = positionedItems.size();
        int i14 = 0;
        while (i14 < size2) {
            LazyListPositionedItem lazyListPositionedItem2 = positionedItems.get(i14);
            this.movingAwayKeys.remove(lazyListPositionedItem2.getKey());
            if (lazyListPositionedItem2.getHasAnimations()) {
                ItemInfo itemInfo = this.keyToItemInfoMap.get(lazyListPositionedItem2.getKey());
                if (itemInfo == null) {
                    Integer num = map.get(lazyListPositionedItem2.getKey());
                    if (num == null || lazyListPositionedItem2.getIndex() == num.intValue()) {
                        i10 = i12;
                        j10 = jM521toOffsetBjo55l4;
                        this.keyToItemInfoMap.put(lazyListPositionedItem2.getKey(), createItemInfo$default(this, lazyListPositionedItem2, 0, 2, null));
                    } else {
                        if (num.intValue() < i12) {
                            this.movingInFromStartBound.add(lazyListPositionedItem2);
                        } else {
                            this.movingInFromEndBound.add(lazyListPositionedItem2);
                        }
                        i10 = i12;
                        j10 = jM521toOffsetBjo55l4;
                    }
                } else {
                    i10 = i12;
                    j10 = jM521toOffsetBjo55l4;
                    long notAnimatableDelta = itemInfo.getNotAnimatableDelta();
                    itemInfo.m519setNotAnimatableDeltagyyYBs(IntOffsetKt.IntOffset(IntOffset.m4069getXimpl(notAnimatableDelta) + IntOffset.m4069getXimpl(j10), IntOffset.m4070getYimpl(notAnimatableDelta) + IntOffset.m4070getYimpl(j10)));
                    startAnimationsIfNeeded(lazyListPositionedItem2, itemInfo);
                }
            } else {
                i10 = i12;
                j10 = jM521toOffsetBjo55l4;
                this.keyToItemInfoMap.remove(lazyListPositionedItem2.getKey());
            }
            i14++;
            i12 = i10;
            jM521toOffsetBjo55l4 = j10;
        }
        List<LazyListPositionedItem> list = this.movingInFromStartBound;
        if (list.size() > 1) {
            CollectionsKt.sortWith(list, new Comparator() { // from class: androidx.compose.foundation.lazy.LazyListItemPlacementAnimator$onMeasured$$inlined$sortByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    return mf.a.d((Integer) map.get(((LazyListPositionedItem) t11).getKey()), (Integer) map.get(((LazyListPositionedItem) t10).getKey()));
                }
            });
        }
        List<LazyListPositionedItem> list2 = this.movingInFromStartBound;
        int size3 = list2.size();
        int size4 = 0;
        for (int i15 = 0; i15 < size3; i15++) {
            LazyListPositionedItem lazyListPositionedItem3 = list2.get(i15);
            int size5 = (0 - size4) - lazyListPositionedItem3.getSize();
            size4 += lazyListPositionedItem3.getSize();
            ItemInfo itemInfoCreateItemInfo = createItemInfo(lazyListPositionedItem3, size5);
            this.keyToItemInfoMap.put(lazyListPositionedItem3.getKey(), itemInfoCreateItemInfo);
            startAnimationsIfNeeded(lazyListPositionedItem3, itemInfoCreateItemInfo);
        }
        List<LazyListPositionedItem> list3 = this.movingInFromEndBound;
        if (list3.size() > 1) {
            CollectionsKt.sortWith(list3, new Comparator() { // from class: androidx.compose.foundation.lazy.LazyListItemPlacementAnimator$onMeasured$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    return mf.a.d((Integer) map.get(((LazyListPositionedItem) t10).getKey()), (Integer) map.get(((LazyListPositionedItem) t11).getKey()));
                }
            });
        }
        List<LazyListPositionedItem> list4 = this.movingInFromEndBound;
        int size6 = list4.size();
        int size7 = 0;
        for (int i16 = 0; i16 < size6; i16++) {
            LazyListPositionedItem lazyListPositionedItem4 = list4.get(i16);
            int i17 = i13 + size7;
            size7 += lazyListPositionedItem4.getSize();
            ItemInfo itemInfoCreateItemInfo2 = createItemInfo(lazyListPositionedItem4, i17);
            this.keyToItemInfoMap.put(lazyListPositionedItem4.getKey(), itemInfoCreateItemInfo2);
            startAnimationsIfNeeded(lazyListPositionedItem4, itemInfoCreateItemInfo2);
        }
        for (Object obj : this.movingAwayKeys) {
            ItemInfo itemInfo2 = (ItemInfo) MapsKt.getValue(this.keyToItemInfoMap, obj);
            Integer num2 = this.keyToIndexMap.get(obj);
            List<PlaceableInfo> placeables = itemInfo2.getPlaceables();
            int size8 = placeables.size();
            int i18 = 0;
            while (true) {
                if (i18 >= size8) {
                    z10 = false;
                    break;
                } else {
                    if (placeables.get(i18).getInProgress()) {
                        z10 = true;
                        break;
                    }
                    i18++;
                }
            }
            if (itemInfo2.getPlaceables().isEmpty() || num2 == null || ((!z10 && Intrinsics.areEqual(num2, map.get(obj))) || !(z10 || isWithinBounds(itemInfo2, i13)))) {
                this.keyToItemInfoMap.remove(obj);
            } else {
                LazyMeasuredItem lazyMeasuredItemM537getAndMeasureZjPyQlc = itemProvider.m537getAndMeasureZjPyQlc(DataIndex.m506constructorimpl(num2.intValue()));
                if (num2.intValue() < this.firstVisibleIndex) {
                    this.movingAwayToStartBound.add(lazyMeasuredItemM537getAndMeasureZjPyQlc);
                } else {
                    this.movingAwayToEndBound.add(lazyMeasuredItemM537getAndMeasureZjPyQlc);
                }
            }
        }
        List<LazyMeasuredItem> list5 = this.movingAwayToStartBound;
        if (list5.size() > 1) {
            CollectionsKt.sortWith(list5, new Comparator() { // from class: androidx.compose.foundation.lazy.LazyListItemPlacementAnimator$onMeasured$$inlined$sortByDescending$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    return mf.a.d((Integer) this.this$0.keyToIndexMap.get(((LazyMeasuredItem) t11).getKey()), (Integer) this.this$0.keyToIndexMap.get(((LazyMeasuredItem) t10).getKey()));
                }
            });
        }
        List<LazyMeasuredItem> list6 = this.movingAwayToStartBound;
        int size9 = list6.size();
        int size10 = 0;
        for (int i19 = 0; i19 < size9; i19++) {
            LazyMeasuredItem lazyMeasuredItem = list6.get(i19);
            int size11 = (0 - size10) - lazyMeasuredItem.getSize();
            size10 += lazyMeasuredItem.getSize();
            ItemInfo itemInfo3 = (ItemInfo) MapsKt.getValue(this.keyToItemInfoMap, lazyMeasuredItem.getKey());
            LazyListPositionedItem lazyListPositionedItemPosition = lazyMeasuredItem.position(size11, layoutWidth, layoutHeight);
            positionedItems.add(lazyListPositionedItemPosition);
            startAnimationsIfNeeded(lazyListPositionedItemPosition, itemInfo3);
        }
        List<LazyMeasuredItem> list7 = this.movingAwayToEndBound;
        if (list7.size() > 1) {
            CollectionsKt.sortWith(list7, new Comparator() { // from class: androidx.compose.foundation.lazy.LazyListItemPlacementAnimator$onMeasured$$inlined$sortBy$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    return mf.a.d((Integer) this.this$0.keyToIndexMap.get(((LazyMeasuredItem) t10).getKey()), (Integer) this.this$0.keyToIndexMap.get(((LazyMeasuredItem) t11).getKey()));
                }
            });
        }
        List<LazyMeasuredItem> list8 = this.movingAwayToEndBound;
        int size12 = list8.size();
        int size13 = 0;
        for (int i20 = 0; i20 < size12; i20++) {
            LazyMeasuredItem lazyMeasuredItem2 = list8.get(i20);
            int i21 = i13 + size13;
            size13 += lazyMeasuredItem2.getSize();
            ItemInfo itemInfo4 = (ItemInfo) MapsKt.getValue(this.keyToItemInfoMap, lazyMeasuredItem2.getKey());
            LazyListPositionedItem lazyListPositionedItemPosition2 = lazyMeasuredItem2.position(i21, layoutWidth, layoutHeight);
            positionedItems.add(lazyListPositionedItemPosition2);
            startAnimationsIfNeeded(lazyListPositionedItemPosition2, itemInfo4);
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
