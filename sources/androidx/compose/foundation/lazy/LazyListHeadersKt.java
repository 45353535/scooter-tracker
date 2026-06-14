package androidx.compose.foundation.lazy;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\u001aF\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0000¨\u0006\f"}, d2 = {"findOrComposeLazyListHeader", "Landroidx/compose/foundation/lazy/LazyListPositionedItem;", "composedVisibleItems", "", "itemProvider", "Landroidx/compose/foundation/lazy/LazyMeasuredItemProvider;", "headerIndexes", "", "", "beforeContentPadding", "layoutWidth", "layoutHeight", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LazyListHeadersKt {
    @Nullable
    public static final LazyListPositionedItem findOrComposeLazyListHeader(@NotNull List<LazyListPositionedItem> composedVisibleItems, @NotNull LazyMeasuredItemProvider itemProvider, @NotNull List<Integer> headerIndexes, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(composedVisibleItems, "composedVisibleItems");
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        Intrinsics.checkNotNullParameter(headerIndexes, "headerIndexes");
        int index = ((LazyListPositionedItem) CollectionsKt.first((List) composedVisibleItems)).getIndex();
        int size = headerIndexes.size();
        int iIntValue = -1;
        int iIntValue2 = -1;
        int i13 = 0;
        while (i13 < size && headerIndexes.get(i13).intValue() <= index) {
            iIntValue = headerIndexes.get(i13).intValue();
            i13++;
            iIntValue2 = ((i13 < 0 || i13 > CollectionsKt.getLastIndex(headerIndexes)) ? -1 : headerIndexes.get(i13)).intValue();
        }
        int size2 = composedVisibleItems.size();
        int offset = Integer.MIN_VALUE;
        int offset2 = Integer.MIN_VALUE;
        int i14 = -1;
        for (int i15 = 0; i15 < size2; i15++) {
            LazyListPositionedItem lazyListPositionedItem = composedVisibleItems.get(i15);
            if (lazyListPositionedItem.getIndex() == iIntValue) {
                offset = lazyListPositionedItem.getOffset();
                i14 = i15;
            } else if (lazyListPositionedItem.getIndex() == iIntValue2) {
                offset2 = lazyListPositionedItem.getOffset();
            }
        }
        if (iIntValue == -1) {
            return null;
        }
        LazyMeasuredItem lazyMeasuredItemM537getAndMeasureZjPyQlc = itemProvider.m537getAndMeasureZjPyQlc(DataIndex.m506constructorimpl(iIntValue));
        int iMax = offset != Integer.MIN_VALUE ? Math.max(-i10, offset) : -i10;
        if (offset2 != Integer.MIN_VALUE) {
            iMax = Math.min(iMax, offset2 - lazyMeasuredItemM537getAndMeasureZjPyQlc.getSize());
        }
        LazyListPositionedItem lazyListPositionedItemPosition = lazyMeasuredItemM537getAndMeasureZjPyQlc.position(iMax, i11, i12);
        if (i14 != -1) {
            composedVisibleItems.set(i14, lazyListPositionedItemPosition);
            return lazyListPositionedItemPosition;
        }
        composedVisibleItems.add(0, lazyListPositionedItemPosition);
        return lazyListPositionedItemPosition;
    }
}
