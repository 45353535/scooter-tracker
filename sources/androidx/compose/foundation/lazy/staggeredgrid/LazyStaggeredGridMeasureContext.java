package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.ui.layout.Placeable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001Bp\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0002\u0010\u0017J*\u0010<\u001a\u000207*\u00020\u00052\u0006\u0010=\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020\u000fø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b?\u0010@J\u0012\u00106\u001a\u00020\u000b*\u00020\u00052\u0006\u0010=\u001a\u00020\u000fR\u0011\u0010\u0013\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0012\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u001c\u0010\b\u001a\u00020\tø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0010\u001a\u00020\u0011ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\u0016\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010 R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010#\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0011\u0010%\u001a\u00020&¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0019R\u0011\u0010\u0015\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0019R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010-\u001a\u00020.¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\u0014\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b3\u0010 R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0019\u00106\u001a\u00020\u000b*\u0002078Æ\u0002ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b8\u00109R\u0019\u0010%\u001a\u00020\u000f*\u0002078Æ\u0002ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b:\u0010;\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006A"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;", "", "state", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "itemProvider", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "resolvedSlotSums", "", "constraints", "Landroidx/compose/ui/unit/Constraints;", "isVertical", "", "measureScope", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "mainAxisAvailableSize", "", "contentOffset", "Landroidx/compose/ui/unit/IntOffset;", "beforeContentPadding", "afterContentPadding", "reverseLayout", "mainAxisSpacing", "crossAxisSpacing", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;[IJZLandroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;IJIIZIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAfterContentPadding", "()I", "getBeforeContentPadding", "getConstraints-msEJaDk", "()J", "J", "getContentOffset-nOcc-ac", "getCrossAxisSpacing", "()Z", "getItemProvider", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "laneCount", "getLaneCount", "laneInfo", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;", "getLaneInfo", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;", "getMainAxisAvailableSize", "getMainAxisSpacing", "getMeasureScope", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "measuredItemProvider", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;", "getMeasuredItemProvider", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;", "getResolvedSlotSums", "()[I", "getReverseLayout", "getState", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "isFullSpan", "Landroidx/compose/foundation/lazy/staggeredgrid/SpanRange;", "isFullSpan-SZVOQXA", "(J)Z", "getLaneInfo-SZVOQXA", "(J)I", "getSpanRange", "itemIndex", "lane", "getSpanRange-lOCCd4c", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;II)J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class LazyStaggeredGridMeasureContext {
    private final int afterContentPadding;
    private final int beforeContentPadding;
    private final long constraints;
    private final long contentOffset;
    private final int crossAxisSpacing;
    private final boolean isVertical;

    @NotNull
    private final LazyStaggeredGridItemProvider itemProvider;
    private final int laneCount;

    @NotNull
    private final LazyStaggeredGridLaneInfo laneInfo;
    private final int mainAxisAvailableSize;
    private final int mainAxisSpacing;

    @NotNull
    private final LazyLayoutMeasureScope measureScope;

    @NotNull
    private final LazyStaggeredGridMeasureProvider measuredItemProvider;

    @NotNull
    private final int[] resolvedSlotSums;
    private final boolean reverseLayout;

    @NotNull
    private final LazyStaggeredGridState state;

    public /* synthetic */ LazyStaggeredGridMeasureContext(LazyStaggeredGridState lazyStaggeredGridState, LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, int[] iArr, long j10, boolean z10, LazyLayoutMeasureScope lazyLayoutMeasureScope, int i10, long j11, int i11, int i12, boolean z11, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyStaggeredGridState, lazyStaggeredGridItemProvider, iArr, j10, z10, lazyLayoutMeasureScope, i10, j11, i11, i12, z11, i13, i14);
    }

    public final int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    public final int getBeforeContentPadding() {
        return this.beforeContentPadding;
    }

    /* JADX INFO: renamed from: getConstraints-msEJaDk, reason: not valid java name and from getter */
    public final long getConstraints() {
        return this.constraints;
    }

    /* JADX INFO: renamed from: getContentOffset-nOcc-ac, reason: not valid java name and from getter */
    public final long getContentOffset() {
        return this.contentOffset;
    }

    public final int getCrossAxisSpacing() {
        return this.crossAxisSpacing;
    }

    @NotNull
    public final LazyStaggeredGridItemProvider getItemProvider() {
        return this.itemProvider;
    }

    public final int getLaneCount() {
        return this.laneCount;
    }

    @NotNull
    public final LazyStaggeredGridLaneInfo getLaneInfo() {
        return this.laneInfo;
    }

    /* JADX INFO: renamed from: getLaneInfo-SZVOQXA, reason: not valid java name */
    public final int m633getLaneInfoSZVOQXA(long j10) {
        int i10 = (int) (4294967295L & j10);
        int i11 = (int) (j10 >> 32);
        if (i10 - i11 != 1) {
            return -2;
        }
        return i11;
    }

    public final int getMainAxisAvailableSize() {
        return this.mainAxisAvailableSize;
    }

    public final int getMainAxisSpacing() {
        return this.mainAxisSpacing;
    }

    @NotNull
    public final LazyLayoutMeasureScope getMeasureScope() {
        return this.measureScope;
    }

    @NotNull
    public final LazyStaggeredGridMeasureProvider getMeasuredItemProvider() {
        return this.measuredItemProvider;
    }

    @NotNull
    public final int[] getResolvedSlotSums() {
        return this.resolvedSlotSums;
    }

    public final boolean getReverseLayout() {
        return this.reverseLayout;
    }

    /* JADX INFO: renamed from: getSpanRange-lOCCd4c, reason: not valid java name */
    public final long m634getSpanRangelOCCd4c(@NotNull LazyStaggeredGridItemProvider getSpanRange, int i10, int i11) {
        Intrinsics.checkNotNullParameter(getSpanRange, "$this$getSpanRange");
        boolean zIsFullSpan = getSpanRange.getSpanProvider().isFullSpan(i10);
        int i12 = zIsFullSpan ? this.laneCount : 1;
        if (zIsFullSpan) {
            i11 = 0;
        }
        return SpanRange.m645constructorimpl(i11, i12);
    }

    @NotNull
    public final LazyStaggeredGridState getState() {
        return this.state;
    }

    public final boolean isFullSpan(@NotNull LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, int i10) {
        Intrinsics.checkNotNullParameter(lazyStaggeredGridItemProvider, "<this>");
        return lazyStaggeredGridItemProvider.getSpanProvider().isFullSpan(i10);
    }

    /* JADX INFO: renamed from: isFullSpan-SZVOQXA, reason: not valid java name */
    public final boolean m635isFullSpanSZVOQXA(long j10) {
        return ((int) (4294967295L & j10)) - ((int) (j10 >> 32)) != 1;
    }

    /* JADX INFO: renamed from: isVertical, reason: from getter */
    public final boolean getIsVertical() {
        return this.isVertical;
    }

    private LazyStaggeredGridMeasureContext(LazyStaggeredGridState lazyStaggeredGridState, LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, int[] iArr, long j10, boolean z10, LazyLayoutMeasureScope lazyLayoutMeasureScope, int i10, long j11, int i11, int i12, boolean z11, int i13, int i14) {
        this.state = lazyStaggeredGridState;
        this.itemProvider = lazyStaggeredGridItemProvider;
        this.resolvedSlotSums = iArr;
        this.constraints = j10;
        this.isVertical = z10;
        this.measureScope = lazyLayoutMeasureScope;
        this.mainAxisAvailableSize = i10;
        this.contentOffset = j11;
        this.beforeContentPadding = i11;
        this.afterContentPadding = i12;
        this.reverseLayout = z11;
        this.mainAxisSpacing = i13;
        this.crossAxisSpacing = i14;
        this.measuredItemProvider = new LazyStaggeredGridMeasureProvider(z10, lazyStaggeredGridItemProvider, lazyLayoutMeasureScope, iArr, i14, new MeasuredItemFactory() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext$measuredItemProvider$1
            @Override // androidx.compose.foundation.lazy.staggeredgrid.MeasuredItemFactory
            @NotNull
            public final LazyStaggeredGridMeasuredItem createItem(int i15, int i16, int i17, @NotNull Object key, @NotNull List<? extends Placeable> placeables) {
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(placeables, "placeables");
                return new LazyStaggeredGridMeasuredItem(i15, key, placeables, this.this$0.getIsVertical(), this.this$0.getMainAxisSpacing(), i16, i17);
            }
        });
        this.laneInfo = lazyStaggeredGridState.getLaneInfo();
        this.laneCount = iArr.length;
    }
}
