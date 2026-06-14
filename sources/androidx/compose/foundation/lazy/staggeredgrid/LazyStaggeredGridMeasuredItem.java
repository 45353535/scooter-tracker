package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSizeKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.C4240b4;
import com.ironsource.C4329g8;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ&\u0010!\u001a\u00020\"2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0003R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0012\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0010R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0010¨\u0006&"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "", FirebaseAnalytics.Param.INDEX, "", C4240b4.i.W, "placeables", "", "Landroidx/compose/ui/layout/Placeable;", "isVertical", "", "spacing", "lane", "span", "(ILjava/lang/Object;Ljava/util/List;ZIII)V", "crossAxisSize", "getCrossAxisSize", "()I", "getIndex", "()Z", C4329g8.f43166k, "setVisible", "(Z)V", "getKey", "()Ljava/lang/Object;", "getLane", "mainAxisSize", "getMainAxisSize", "getPlaceables", "()Ljava/util/List;", "sizeWithSpacings", "getSizeWithSpacings", "getSpacing", "getSpan", C4240b4.i.L, "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridPositionedItem;", "mainAxis", "crossAxis", "mainAxisLayoutSize", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class LazyStaggeredGridMeasuredItem {
    private final int crossAxisSize;
    private final int index;
    private final boolean isVertical;
    private boolean isVisible;

    @NotNull
    private final Object key;
    private final int lane;
    private final int mainAxisSize;

    @NotNull
    private final List<Placeable> placeables;
    private final int sizeWithSpacings;
    private final int spacing;
    private final int span;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyStaggeredGridMeasuredItem(int i10, @NotNull Object key, @NotNull List<? extends Placeable> placeables, boolean z10, int i11, int i12, int i13) {
        Integer num;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(placeables, "placeables");
        this.index = i10;
        this.key = key;
        this.placeables = placeables;
        this.isVertical = z10;
        this.spacing = i11;
        this.lane = i12;
        this.span = i13;
        int i14 = 1;
        this.isVisible = true;
        Integer numValueOf = 0;
        int size = placeables.size();
        for (int i15 = 0; i15 < size; i15++) {
            Placeable placeable = (Placeable) placeables.get(i15);
            numValueOf = Integer.valueOf(numValueOf.intValue() + (this.isVertical ? placeable.getHeight() : placeable.getWidth()));
        }
        int iIntValue = numValueOf.intValue();
        this.mainAxisSize = iIntValue;
        this.sizeWithSpacings = g.e(iIntValue + this.spacing, 0);
        List<Placeable> list = this.placeables;
        if (list.isEmpty()) {
            num = null;
        } else {
            Placeable placeable2 = list.get(0);
            Integer numValueOf2 = Integer.valueOf(this.isVertical ? placeable2.getWidth() : placeable2.getHeight());
            int lastIndex = CollectionsKt.getLastIndex(list);
            if (1 <= lastIndex) {
                while (true) {
                    Placeable placeable3 = list.get(i14);
                    Integer numValueOf3 = Integer.valueOf(this.isVertical ? placeable3.getWidth() : placeable3.getHeight());
                    numValueOf2 = numValueOf3.compareTo(numValueOf2) > 0 ? numValueOf3 : numValueOf2;
                    if (i14 == lastIndex) {
                        break;
                    } else {
                        i14++;
                    }
                }
            }
            num = numValueOf2;
        }
        this.crossAxisSize = num != null ? num.intValue() : 0;
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    public final int getIndex() {
        return this.index;
    }

    @NotNull
    public final Object getKey() {
        return this.key;
    }

    public final int getLane() {
        return this.lane;
    }

    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    @NotNull
    public final List<Placeable> getPlaceables() {
        return this.placeables;
    }

    public final int getSizeWithSpacings() {
        return this.sizeWithSpacings;
    }

    public final int getSpacing() {
        return this.spacing;
    }

    public final int getSpan() {
        return this.span;
    }

    /* JADX INFO: renamed from: isVertical, reason: from getter */
    public final boolean getIsVertical() {
        return this.isVertical;
    }

    /* JADX INFO: renamed from: isVisible, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    @NotNull
    public final LazyStaggeredGridPositionedItem position(int lane, int mainAxis, int crossAxis, int mainAxisLayoutSize) {
        return new LazyStaggeredGridPositionedItem(this.isVertical ? IntOffsetKt.IntOffset(crossAxis, mainAxis) : IntOffsetKt.IntOffset(mainAxis, crossAxis), this.index, lane, this.key, this.isVertical ? IntSizeKt.IntSize(this.crossAxisSize, this.sizeWithSpacings) : IntSizeKt.IntSize(this.sizeWithSpacings, this.crossAxisSize), this.placeables, this.isVertical, mainAxisLayoutSize, null);
    }

    public final void setVisible(boolean z10) {
        this.isVisible = z10;
    }
}
