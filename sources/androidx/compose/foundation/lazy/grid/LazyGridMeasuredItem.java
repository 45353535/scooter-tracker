package androidx.compose.foundation.lazy.grid;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.C4240b4;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001Bn\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015ø\u0001\u0000¢\u0006\u0002\u0010\u0016J6\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\b2\u0006\u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\b2\u0006\u0010+\u001a\u00020\b2\u0006\u0010,\u001a\u00020\bR\u000e\u0010\u000e\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0019\u0010\u0018R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001d\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\u001f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0014\u001a\u00020\u0015X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010$\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006-"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "", FirebaseAnalytics.Param.INDEX, "Landroidx/compose/foundation/lazy/grid/ItemIndex;", C4240b4.i.W, "isVertical", "", "crossAxisSize", "", "mainAxisSpacing", "reverseLayout", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "beforeContentPadding", "afterContentPadding", "placeables", "", "Landroidx/compose/ui/layout/Placeable;", "placementAnimator", "Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "visualOffset", "Landroidx/compose/ui/unit/IntOffset;", "(ILjava/lang/Object;ZIIZLandroidx/compose/ui/unit/LayoutDirection;IILjava/util/List;Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getCrossAxisSize", "()I", "getIndex-VZbfaAc", "I", "getKey", "()Ljava/lang/Object;", "mainAxisSize", "getMainAxisSize", "mainAxisSizeWithSpacings", "getMainAxisSizeWithSpacings", "getMainAxisSpacing", "getPlaceables", "()Ljava/util/List;", "J", C4240b4.i.L, "Landroidx/compose/foundation/lazy/grid/LazyGridPositionedItem;", "mainAxisOffset", "crossAxisOffset", "layoutWidth", "layoutHeight", "row", "column", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LazyGridMeasuredItem {
    private final int afterContentPadding;
    private final int beforeContentPadding;
    private final int crossAxisSize;
    private final int index;
    private final boolean isVertical;

    @NotNull
    private final Object key;

    @NotNull
    private final LayoutDirection layoutDirection;
    private final int mainAxisSize;
    private final int mainAxisSizeWithSpacings;
    private final int mainAxisSpacing;

    @NotNull
    private final List<Placeable> placeables;

    @NotNull
    private final LazyGridItemPlacementAnimator placementAnimator;
    private final boolean reverseLayout;
    private final long visualOffset;

    public /* synthetic */ LazyGridMeasuredItem(int i10, Object obj, boolean z10, int i11, int i12, boolean z11, LayoutDirection layoutDirection, int i13, int i14, List list, LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, obj, z10, i11, i12, z11, layoutDirection, i13, i14, list, lazyGridItemPlacementAnimator, j10);
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    /* JADX INFO: renamed from: getIndex-VZbfaAc, reason: not valid java name and from getter */
    public final int getIndex() {
        return this.index;
    }

    @NotNull
    public final Object getKey() {
        return this.key;
    }

    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    public final int getMainAxisSizeWithSpacings() {
        return this.mainAxisSizeWithSpacings;
    }

    public final int getMainAxisSpacing() {
        return this.mainAxisSpacing;
    }

    @NotNull
    public final List<Placeable> getPlaceables() {
        return this.placeables;
    }

    @NotNull
    public final LazyGridPositionedItem position(int mainAxisOffset, int crossAxisOffset, int layoutWidth, int layoutHeight, int row, int column) {
        boolean z10 = this.isVertical;
        int i10 = z10 ? layoutHeight : layoutWidth;
        int i11 = (z10 && this.layoutDirection == LayoutDirection.Rtl) ? ((z10 ? layoutWidth : layoutHeight) - crossAxisOffset) - this.crossAxisSize : crossAxisOffset;
        return new LazyGridPositionedItem(z10 ? IntOffsetKt.IntOffset(i11, mainAxisOffset) : IntOffsetKt.IntOffset(mainAxisOffset, i11), this.index, this.key, row, column, this.isVertical ? IntSizeKt.IntSize(this.crossAxisSize, this.mainAxisSize) : IntSizeKt.IntSize(this.mainAxisSize, this.crossAxisSize), -this.beforeContentPadding, i10 + this.afterContentPadding, this.isVertical, this.placeables, this.placementAnimator, this.visualOffset, i10, this.reverseLayout, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private LazyGridMeasuredItem(int i10, Object obj, boolean z10, int i11, int i12, boolean z11, LayoutDirection layoutDirection, int i13, int i14, List<? extends Placeable> list, LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator, long j10) {
        this.index = i10;
        this.key = obj;
        this.isVertical = z10;
        this.crossAxisSize = i11;
        this.mainAxisSpacing = i12;
        this.reverseLayout = z11;
        this.layoutDirection = layoutDirection;
        this.beforeContentPadding = i13;
        this.afterContentPadding = i14;
        this.placeables = list;
        this.placementAnimator = lazyGridItemPlacementAnimator;
        this.visualOffset = j10;
        int size = list.size();
        int iMax = 0;
        for (int i15 = 0; i15 < size; i15++) {
            Placeable placeable = (Placeable) list.get(i15);
            iMax = Math.max(iMax, this.isVertical ? placeable.getHeight() : placeable.getWidth());
        }
        this.mainAxisSize = iMax;
        this.mainAxisSizeWithSpacings = g.e(iMax + this.mainAxisSpacing, 0);
    }
}
