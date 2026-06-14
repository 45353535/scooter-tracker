package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.runtime.snapshots.Snapshot;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.C4240b4;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.jetbrains.annotations.NotNull;
import zf.a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001e\u001a2\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00028\u00000\u0003H\u0083\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\u000b\u001a\u00020\n*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u001e\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\rH\u0082\b¢\u0006\u0004\b\u0010\u0010\u0011\u001ay\u0010(\u001a\u00020%*\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u001fH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'\u001a3\u0010.\u001a\u00020%*\u00020)2\u0006\u0010*\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\u00162\u0006\u0010,\u001a\u00020\u00162\u0006\u0010-\u001a\u00020\u001aH\u0003¢\u0006\u0004\b.\u0010/\u001a=\u00105\u001a\b\u0012\u0004\u0012\u00020403*\u00020)2\u0012\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u00101\u001a\u00020\u00162\u0006\u00102\u001a\u00020\u001fH\u0002¢\u0006\u0004\b5\u00106\u001aB\u00109\u001a\b\u0012\u0004\u0012\u00020403*\u00020)2\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u0002040\u00032\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001a0\u0003H\u0083\b¢\u0006\u0004\b9\u0010:\u001a.\u0010>\u001a\u00020\u000f*\u00020;2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u000f0\u0003H\u0082\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b<\u0010=\u001a\u001b\u0010@\u001a\u00020\u000f*\u00020\u00162\u0006\u0010?\u001a\u00020\u001fH\u0002¢\u0006\u0004\b@\u0010A\u001a!\u0010E\u001a\u00020\u001f*\u00020\u00162\u0006\u0010B\u001a\u00020;H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bC\u0010D\u001a\u001d\u0010G\u001a\u00020\u001f*\u00020\u00162\b\b\u0002\u0010F\u001a\u00020\u001fH\u0000¢\u0006\u0004\bG\u0010H\u001a4\u0010I\u001a\u00020\u001f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00072\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001f0\u0003H\u0082\b¢\u0006\u0004\bI\u0010J\u001a\u0013\u0010K\u001a\u00020\u001f*\u00020\u0016H\u0002¢\u0006\u0004\bK\u0010L\u001a(\u0010M\u001a\u00020\u0016*\u00020\u00162\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f0\u0003H\u0082\b¢\u0006\u0004\bM\u0010N\u001a#\u0010Q\u001a\u00020\u000f*\u00020)2\u0006\u0010O\u001a\u00020\u00162\u0006\u0010P\u001a\u00020\u001fH\u0002¢\u0006\u0004\bQ\u0010R\u001a#\u0010U\u001a\u00020\u001f*\u00020)2\u0006\u0010S\u001a\u00020\u001f2\u0006\u0010T\u001a\u00020\u001fH\u0002¢\u0006\u0004\bU\u0010V\"\u0014\u0010W\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\bW\u0010X\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006Y"}, d2 = {"T", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "scope", "Lkotlin/Function1;", "block", "withDebugLogging", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "", "Lkotlin/collections/ArrayDeque;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "", "debugRender", "([Lkotlin/collections/ArrayDeque;)Ljava/lang/String;", "Lkotlin/Function0;", PglCryptUtils.KEY_MESSAGE, "", "debugLog", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "state", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "itemProvider", "", "resolvedSlotSums", "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "isVertical", "reverseLayout", "Landroidx/compose/ui/unit/IntOffset;", "contentOffset", "", "mainAxisAvailableSize", "mainAxisSpacing", "crossAxisSpacing", "beforeContentPadding", "afterContentPadding", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "measureStaggeredGrid-BTfHGGE", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;[IJZZJIIIII)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "measureStaggeredGrid", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;", "initialScrollDelta", "initialItemIndices", "initialItemOffsets", "canRestartMeasure", "measure", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;I[I[IZ)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "measuredItems", "itemScrollOffsets", "mainAxisLayoutSize", "", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridPositionedItem;", "calculatePositionedItems", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;[Lkotlin/collections/ArrayDeque;[II)Ljava/util/List;", C4240b4.i.L, "filter", "calculateExtraItems", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "Landroidx/compose/foundation/lazy/staggeredgrid/SpanRange;", "forEach-nIS5qE8", "(JLkotlin/jvm/functions/Function1;)V", "forEach", "delta", "offsetBy", "([II)V", "indexRange", "maxInRange-jy6DScQ", "([IJ)I", "maxInRange", "minBound", "indexOfMinValue", "([II)I", "indexOfMinBy", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)I", "indexOfMaxValue", "([I)I", "transform", "([ILkotlin/jvm/functions/Function1;)[I", "indices", "itemCount", "ensureIndicesInRange", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;[II)V", "item", "lane", "findPreviousItemIndex", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;II)I", "DebugLoggingEnabled", "Z", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LazyStaggeredGridMeasureKt {
    private static final boolean DebugLoggingEnabled = false;

    @ExperimentalFoundationApi
    private static final List<LazyStaggeredGridPositionedItem> calculateExtraItems(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, Function1<? super LazyStaggeredGridMeasuredItem, LazyStaggeredGridPositionedItem> function1, Function1<? super Integer, Boolean> function12) {
        LazyLayoutPinnedItemList pinnedItems = lazyStaggeredGridMeasureContext.getState().getPinnedItems();
        int size = pinnedItems.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            LazyLayoutPinnedItemList.PinnedItem pinnedItem = pinnedItems.get(i10);
            int iFindIndexByKey = LazyLayoutItemProviderKt.findIndexByKey(lazyStaggeredGridMeasureContext.getItemProvider(), pinnedItem.getKey(), pinnedItem.getIndex());
            if (function12.invoke(Integer.valueOf(iFindIndexByKey)).booleanValue()) {
                long jM634getSpanRangelOCCd4c = lazyStaggeredGridMeasureContext.m634getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), iFindIndexByKey, 0);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(function1.invoke(lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m642getAndMeasurejy6DScQ(iFindIndexByKey, jM634getSpanRangelOCCd4c)));
            }
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
    }

    private static final List<LazyStaggeredGridPositionedItem> calculatePositionedItems(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, ArrayDeque<LazyStaggeredGridMeasuredItem>[] arrayDequeArr, int[] iArr, int i10) {
        int size = 0;
        for (ArrayDeque<LazyStaggeredGridMeasuredItem> arrayDeque : arrayDequeArr) {
            size += arrayDeque.size();
        }
        ArrayList arrayList = new ArrayList(size);
        while (true) {
            for (ArrayDeque<LazyStaggeredGridMeasuredItem> arrayDeque2 : arrayDequeArr) {
                if (!arrayDeque2.isEmpty()) {
                    int length = arrayDequeArr.length;
                    int i11 = -1;
                    int i12 = Integer.MAX_VALUE;
                    for (int i13 = 0; i13 < length; i13++) {
                        LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemFirstOrNull = arrayDequeArr[i13].firstOrNull();
                        int index = lazyStaggeredGridMeasuredItemFirstOrNull != null ? lazyStaggeredGridMeasuredItemFirstOrNull.getIndex() : Integer.MAX_VALUE;
                        if (i12 > index) {
                            i11 = i13;
                            i12 = index;
                        }
                    }
                    LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemRemoveFirst = arrayDequeArr[i11].removeFirst();
                    if (lazyStaggeredGridMeasuredItemRemoveFirst.getLane() == i11) {
                        long jM645constructorimpl = SpanRange.m645constructorimpl(lazyStaggeredGridMeasuredItemRemoveFirst.getLane(), lazyStaggeredGridMeasuredItemRemoveFirst.getSpan());
                        int iM637maxInRangejy6DScQ = m637maxInRangejy6DScQ(iArr, jM645constructorimpl);
                        int crossAxisSpacing = i11 == 0 ? 0 : lazyStaggeredGridMeasureContext.getResolvedSlotSums()[i11 - 1] + (lazyStaggeredGridMeasureContext.getCrossAxisSpacing() * i11);
                        if (!lazyStaggeredGridMeasuredItemRemoveFirst.getPlaceables().isEmpty()) {
                            arrayList.add(lazyStaggeredGridMeasuredItemRemoveFirst.position(i11, iM637maxInRangejy6DScQ, crossAxisSpacing, i10));
                            int i14 = (int) (jM645constructorimpl & 4294967295L);
                            for (int i15 = (int) (jM645constructorimpl >> 32); i15 < i14; i15++) {
                                iArr[i15] = lazyStaggeredGridMeasuredItemRemoveFirst.getSizeWithSpacings() + iM637maxInRangejy6DScQ;
                            }
                        }
                    }
                }
            }
            return arrayList;
        }
    }

    private static final void debugLog(Function0<String> function0) {
    }

    private static final String debugRender(ArrayDeque<LazyStaggeredGridMeasuredItem>[] arrayDequeArr) {
        return "";
    }

    private static final void ensureIndicesInRange(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int[] iArr, int i10) {
        int length = iArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i11 = length - 1;
            while (true) {
                if (iArr[length] < i10 && lazyStaggeredGridMeasureContext.getLaneInfo().assignedToLane(iArr[length], length)) {
                    break;
                } else {
                    iArr[length] = findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[length], length);
                }
            }
            if (iArr[length] >= 0 && !lazyStaggeredGridMeasureContext.isFullSpan(lazyStaggeredGridMeasureContext.getItemProvider(), iArr[length])) {
                lazyStaggeredGridMeasureContext.getLaneInfo().setLane(iArr[length], length);
            }
            if (i11 < 0) {
                return;
            } else {
                length = i11;
            }
        }
    }

    private static final int findPreviousItemIndex(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int i10, int i11) {
        return lazyStaggeredGridMeasureContext.getLaneInfo().findPreviousItemIndex(i10, i11);
    }

    /* JADX INFO: renamed from: forEach-nIS5qE8, reason: not valid java name */
    private static final void m636forEachnIS5qE8(long j10, Function1<? super Integer, Unit> function1) {
        int i10 = (int) (j10 & 4294967295L);
        for (int i11 = (int) (j10 >> 32); i11 < i10; i11++) {
            function1.invoke(Integer.valueOf(i11));
        }
    }

    private static final int indexOfMaxValue(int[] iArr) {
        int length = iArr.length;
        int i10 = -1;
        int i11 = Integer.MIN_VALUE;
        for (int i12 = 0; i12 < length; i12++) {
            int i13 = iArr[i12];
            if (i11 < i13) {
                i10 = i12;
                i11 = i13;
            }
        }
        return i10;
    }

    private static final <T> int indexOfMinBy(T[] tArr, Function1<? super T, Integer> function1) {
        int length = tArr.length;
        int i10 = -1;
        int i11 = Integer.MAX_VALUE;
        for (int i12 = 0; i12 < length; i12++) {
            int iIntValue = function1.invoke(tArr[i12]).intValue();
            if (i11 > iIntValue) {
                i10 = i12;
                i11 = iIntValue;
            }
        }
        return i10;
    }

    public static final int indexOfMinValue(@NotNull int[] iArr, int i10) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        int i11 = -1;
        int i12 = Integer.MAX_VALUE;
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = i10 + 1;
            int i15 = iArr[i13];
            if (i14 <= i15 && i15 < i12) {
                i11 = i13;
                i12 = i15;
            }
        }
        return i11;
    }

    public static /* synthetic */ int indexOfMinValue$default(int[] iArr, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = Integer.MIN_VALUE;
        }
        return indexOfMinValue(iArr, i10);
    }

    /* JADX INFO: renamed from: maxInRange-jy6DScQ, reason: not valid java name */
    private static final int m637maxInRangejy6DScQ(int[] iArr, long j10) {
        int i10 = (int) (j10 & 4294967295L);
        int iMax = Integer.MIN_VALUE;
        for (int i11 = (int) (j10 >> 32); i11 < i10; i11++) {
            iMax = Math.max(iMax, iArr[i11]);
        }
        return iMax;
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x02d4, code lost:
    
        r2 = indexOfMinValue$default(r9, 0, 1, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02df, code lost:
    
        if (r2 == indexOfMaxValue(r27)) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02e1, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02e2, code lost:
    
        r3 = r27[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02e5, code lost:
    
        if (r3 != (-1)) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02e7, code lost:
    
        r3 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02e8, code lost:
    
        r4 = r30;
        r3 = findPreviousItemIndex(r4, r3, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02ee, code lost:
    
        if (r3 >= 0) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02f0, code lost:
    
        r7 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02f2, code lost:
    
        if (r0 != false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02f8, code lost:
    
        if (measure$lambda$37$misalignedStart(r7, r4, r9, r2) == false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02fa, code lost:
    
        if (r34 == false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02fc, code lost:
    
        r4.getLaneInfo().reset();
        r0 = r7.length;
        r1 = new int[r0];
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0307, code lost:
    
        if (r3 >= r0) goto L416;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0309, code lost:
    
        r1[r3] = -1;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0310, code lost:
    
        r0 = r9.length;
        r3 = new int[r0];
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0314, code lost:
    
        if (r5 >= r0) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0316, code lost:
    
        r3[r5] = r9[r2];
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0322, code lost:
    
        return measure(r4, r8, r1, r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0323, code lost:
    
        r33 = r1;
        r27 = r11;
        r28 = r12;
        r23 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x032d, code lost:
    
        r7 = r27;
        r22 = r0;
        r33 = r1;
        r0 = r4.m634getSpanRangelOCCd4c(r4.getItemProvider(), r3, r2);
        r2 = r4.getLaneInfo();
        r23 = r14;
        r14 = (int) (r0 & 4294967295L);
        r27 = r11;
        r28 = r12;
        r11 = (int) (r0 >> 32);
        r12 = r14 - r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x034e, code lost:
    
        if (r12 == 1) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0350, code lost:
    
        r15 = -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0352, code lost:
    
        r15 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0353, code lost:
    
        r2.setLane(r3, r15);
        r2 = r4.getMeasuredItemProvider().m642getAndMeasurejy6DScQ(r3, r0);
        r0 = m637maxInRangejy6DScQ(r9, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0363, code lost:
    
        if (r12 == 1) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0365, code lost:
    
        r1 = r4.getLaneInfo().getGaps(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x036e, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x036f, code lost:
    
        if (r11 >= r14) goto L412;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0373, code lost:
    
        if (r9[r11] == r0) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0375, code lost:
    
        r22 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0377, code lost:
    
        r26[r11].addFirst(r2);
        r7[r11] = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x037e, code lost:
    
        if (r1 != null) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0380, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0382, code lost:
    
        r12 = r1[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0384, code lost:
    
        r9[r11] = (r0 + r2.getSizeWithSpacings()) + r12;
        r11 = r11 + 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:319:0x064f  */
    @androidx.compose.foundation.ExperimentalFoundationApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult measure(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext r30, int r31, int[] r32, int[] r33, boolean r34) {
        /*
            Method dump skipped, instruction units count: 1927
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt.measure(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext, int, int[], int[], boolean):androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult");
    }

    private static final boolean measure$lambda$37$hasSpaceBeforeFirst(int[] iArr, int[] iArr2, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext) {
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = iArr[i10];
            if (iArr2[i10] < Math.max(-lazyStaggeredGridMeasureContext.getMainAxisSpacing(), 0) && i11 > 0) {
                return true;
            }
        }
        return false;
    }

    private static final boolean measure$lambda$37$misalignedStart(int[] iArr, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int[] iArr2, int i10) {
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[i11], i11) == -1 && iArr2[i11] != iArr2[i10]) {
                return true;
            }
        }
        int length2 = iArr.length;
        for (int i12 = 0; i12 < length2; i12++) {
            if (findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[i12], i12) != -1 && iArr2[i12] >= iArr2[i10]) {
                return true;
            }
        }
        int lane = lazyStaggeredGridMeasureContext.getLaneInfo().getLane(0);
        return (lane == 0 || lane == -1 || lane == -2) ? false : true;
    }

    @ExperimentalFoundationApi
    @NotNull
    /* JADX INFO: renamed from: measureStaggeredGrid-BTfHGGE, reason: not valid java name */
    public static final LazyStaggeredGridMeasureResult m638measureStaggeredGridBTfHGGE(@NotNull LazyLayoutMeasureScope measureStaggeredGrid, @NotNull LazyStaggeredGridState state, @NotNull LazyStaggeredGridItemProvider itemProvider, @NotNull int[] resolvedSlotSums, long j10, boolean z10, boolean z11, long j11, int i10, int i11, int i12, int i13, int i14) {
        int i15;
        int iM637maxInRangejy6DScQ;
        Intrinsics.checkNotNullParameter(measureStaggeredGrid, "$this$measureStaggeredGrid");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        Intrinsics.checkNotNullParameter(resolvedSlotSums, "resolvedSlotSums");
        LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext = new LazyStaggeredGridMeasureContext(state, itemProvider, resolvedSlotSums, j10, z10, measureStaggeredGrid, i10, j11, i13, i14, z11, i11, i12, null);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        Snapshot snapshotCreateNonObservableSnapshot = Snapshot.INSTANCE.createNonObservableSnapshot();
        try {
            Snapshot snapshotMakeCurrent = snapshotCreateNonObservableSnapshot.makeCurrent();
            try {
                int[] indices = state.getScrollPosition().getIndices();
                int[] offsets = state.getScrollPosition().getOffsets();
                if (indices.length != resolvedSlotSums.length) {
                    lazyStaggeredGridMeasureContext.getLaneInfo().reset();
                    int length = resolvedSlotSums.length;
                    int[] iArr = new int[length];
                    int i16 = 0;
                    while (i16 < length) {
                        if (i16 < indices.length && (iM637maxInRangejy6DScQ = indices[i16]) != -1) {
                            i15 = 1;
                        } else if (i16 == 0) {
                            iM637maxInRangejy6DScQ = 0;
                            i15 = 1;
                        } else {
                            i15 = 1;
                            iM637maxInRangejy6DScQ = m637maxInRangejy6DScQ(iArr, SpanRange.m645constructorimpl(0, i16)) + 1;
                        }
                        iArr[i16] = iM637maxInRangejy6DScQ;
                        lazyStaggeredGridMeasureContext.getLaneInfo().setLane(iArr[i16], i16);
                        i16 += i15;
                    }
                    indices = iArr;
                }
                ref$ObjectRef.f93280b = indices;
                if (offsets.length != resolvedSlotSums.length) {
                    int length2 = resolvedSlotSums.length;
                    int[] iArr2 = new int[length2];
                    int i17 = 0;
                    while (i17 < length2) {
                        iArr2[i17] = i17 < offsets.length ? offsets[i17] : i17 == 0 ? 0 : iArr2[i17 - 1];
                        i17++;
                    }
                    offsets = iArr2;
                }
                ref$ObjectRef2.f93280b = offsets;
                Unit unit = Unit.f93236a;
                snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                snapshotCreateNonObservableSnapshot.dispose();
                return measure(lazyStaggeredGridMeasureContext, a.d(state.getScrollToBeConsumed()), (int[]) ref$ObjectRef.f93280b, (int[]) ref$ObjectRef2.f93280b, true);
            } catch (Throwable th2) {
                snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                throw th2;
            }
        } catch (Throwable th3) {
            snapshotCreateNonObservableSnapshot.dispose();
            throw th3;
        }
    }

    private static final void offsetBy(int[] iArr, int i10) {
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = iArr[i11] + i10;
        }
    }

    private static final int[] transform(int[] iArr, Function1<? super Integer, Integer> function1) {
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = function1.invoke(Integer.valueOf(iArr[i10])).intValue();
        }
        return iArr;
    }

    @ExperimentalFoundationApi
    private static final <T> T withDebugLogging(LazyLayoutMeasureScope lazyLayoutMeasureScope, Function1<? super LazyLayoutMeasureScope, ? extends T> function1) {
        return function1.invoke(lazyLayoutMeasureScope);
    }
}
