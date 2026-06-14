package androidx.compose.foundation.lazy.grid;

import androidx.compose.ui.unit.LayoutDirection;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.C4240b4;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001BT\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\rø\u0001\u0000¢\u0006\u0002\u0010\u0012J\u0006\u0010\u001d\u001a\u00020\u000bJ$\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\b2\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\rR\u000e\u0010\u0011\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0019\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\u001b\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u000e\u0010\u0010\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", "", FirebaseAnalytics.Param.INDEX, "Landroidx/compose/foundation/lazy/grid/LineIndex;", FirebaseAnalytics.Param.ITEMS, "", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "spans", "", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "isVertical", "", "slotsPerLine", "", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "mainAxisSpacing", "crossAxisSpacing", "(I[Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;Ljava/util/List;ZILandroidx/compose/ui/unit/LayoutDirection;IILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getIndex-hA7yfN8", "()I", "I", "getItems", "()[Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "[Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "mainAxisSize", "getMainAxisSize", "mainAxisSizeWithSpacings", "getMainAxisSizeWithSpacings", "isEmpty", C4240b4.i.L, "Landroidx/compose/foundation/lazy/grid/LazyGridPositionedItem;", "offset", "layoutWidth", "layoutHeight", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LazyGridMeasuredLine {
    private final int crossAxisSpacing;
    private final int index;
    private final boolean isVertical;

    @NotNull
    private final LazyGridMeasuredItem[] items;

    @NotNull
    private final LayoutDirection layoutDirection;
    private final int mainAxisSize;
    private final int mainAxisSizeWithSpacings;
    private final int mainAxisSpacing;
    private final int slotsPerLine;

    @NotNull
    private final List<GridItemSpan> spans;

    public /* synthetic */ LazyGridMeasuredLine(int i10, LazyGridMeasuredItem[] lazyGridMeasuredItemArr, List list, boolean z10, int i11, LayoutDirection layoutDirection, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, lazyGridMeasuredItemArr, list, z10, i11, layoutDirection, i12, i13);
    }

    /* JADX INFO: renamed from: getIndex-hA7yfN8, reason: not valid java name and from getter */
    public final int getIndex() {
        return this.index;
    }

    @NotNull
    public final LazyGridMeasuredItem[] getItems() {
        return this.items;
    }

    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    public final int getMainAxisSizeWithSpacings() {
        return this.mainAxisSizeWithSpacings;
    }

    public final boolean isEmpty() {
        return this.items.length == 0;
    }

    @NotNull
    public final List<LazyGridPositionedItem> position(int offset, int layoutWidth, int layoutHeight) {
        LazyGridMeasuredItem[] lazyGridMeasuredItemArr = this.items;
        ArrayList arrayList = new ArrayList(lazyGridMeasuredItemArr.length);
        int length = lazyGridMeasuredItemArr.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int crossAxisSize = 0;
        while (i10 < length) {
            LazyGridMeasuredItem lazyGridMeasuredItem = lazyGridMeasuredItemArr[i10];
            int i13 = i11 + 1;
            int iM546getCurrentLineSpanimpl = GridItemSpan.m546getCurrentLineSpanimpl(this.spans.get(i11).getPackedValue());
            int i14 = this.layoutDirection == LayoutDirection.Rtl ? (this.slotsPerLine - i12) - iM546getCurrentLineSpanimpl : i12;
            boolean z10 = this.isVertical;
            int i15 = z10 ? this.index : i14;
            if (!z10) {
                i14 = this.index;
            }
            LazyGridPositionedItem lazyGridPositionedItemPosition = lazyGridMeasuredItem.position(offset, crossAxisSize, layoutWidth, layoutHeight, i15, i14);
            crossAxisSize += lazyGridMeasuredItem.getCrossAxisSize() + this.crossAxisSpacing;
            i12 += iM546getCurrentLineSpanimpl;
            arrayList.add(lazyGridPositionedItemPosition);
            i10++;
            i11 = i13;
        }
        return arrayList;
    }

    private LazyGridMeasuredLine(int i10, LazyGridMeasuredItem[] lazyGridMeasuredItemArr, List<GridItemSpan> list, boolean z10, int i11, LayoutDirection layoutDirection, int i12, int i13) {
        this.index = i10;
        this.items = lazyGridMeasuredItemArr;
        this.spans = list;
        this.isVertical = z10;
        this.slotsPerLine = i11;
        this.layoutDirection = layoutDirection;
        this.mainAxisSpacing = i12;
        this.crossAxisSpacing = i13;
        int iMax = 0;
        for (LazyGridMeasuredItem lazyGridMeasuredItem : lazyGridMeasuredItemArr) {
            iMax = Math.max(iMax, lazyGridMeasuredItem.getMainAxisSize());
        }
        this.mainAxisSize = iMax;
        this.mainAxisSizeWithSpacings = g.e(iMax + this.mainAxisSpacing, 0);
    }
}
