package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.C4240b4;
import com.my.target.common.menu.MenuActionType;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001BN\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0002\u0010\u0011J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#J\b\u0010$\u001a\u00020%H\u0016J.\u0010&\u001a\u00020\u0003*\u00020\u00032\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050(H\u0082\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0002\u001a\u00020\u0003X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\t\u001a\u00020\nX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\u001b\u001a\u00020\u0005*\u00020\r8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridPositionedItem;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemInfo;", "offset", "Landroidx/compose/ui/unit/IntOffset;", FirebaseAnalytics.Param.INDEX, "", "lane", C4240b4.i.W, "", "size", "Landroidx/compose/ui/unit/IntSize;", "placeables", "", "Landroidx/compose/ui/layout/Placeable;", "isVertical", "", "mainAxisLayoutSize", "(JIILjava/lang/Object;JLjava/util/List;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getIndex", "()I", "getKey", "()Ljava/lang/Object;", "getLane", "getOffset-nOcc-ac", "()J", "J", "getSize-YbymL2g", "mainAxisSize", "getMainAxisSize", "(Landroidx/compose/ui/layout/Placeable;)I", "place", "", "scope", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;", "toString", "", MenuActionType.COPY, "mainAxisMap", "Lkotlin/Function1;", "copy-4Tuh3kE", "(JLkotlin/jvm/functions/Function1;)J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class LazyStaggeredGridPositionedItem implements LazyStaggeredGridItemInfo {
    private final int index;
    private final boolean isVertical;

    @NotNull
    private final Object key;
    private final int lane;
    private final int mainAxisLayoutSize;
    private final long offset;

    @NotNull
    private final List<Placeable> placeables;
    private final long size;

    public /* synthetic */ LazyStaggeredGridPositionedItem(long j10, int i10, int i11, Object obj, long j11, List list, boolean z10, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, i10, i11, obj, j11, list, z10, i12);
    }

    /* JADX INFO: renamed from: copy-4Tuh3kE, reason: not valid java name */
    private final long m643copy4Tuh3kE(long j10, Function1<? super Integer, Integer> function1) {
        int iM4069getXimpl = this.isVertical ? IntOffset.m4069getXimpl(j10) : function1.invoke(Integer.valueOf(IntOffset.m4069getXimpl(j10))).intValue();
        boolean z10 = this.isVertical;
        int iM4070getYimpl = IntOffset.m4070getYimpl(j10);
        if (z10) {
            iM4070getYimpl = function1.invoke(Integer.valueOf(iM4070getYimpl)).intValue();
        }
        return IntOffsetKt.IntOffset(iM4069getXimpl, iM4070getYimpl);
    }

    private final int getMainAxisSize(Placeable placeable) {
        return this.isVertical ? placeable.getHeight() : placeable.getWidth();
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    @NotNull
    public Object getKey() {
        return this.key;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    public int getLane() {
        return this.lane;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    /* JADX INFO: renamed from: getOffset-nOcc-ac, reason: from getter */
    public long getOffset() {
        return this.offset;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    /* JADX INFO: renamed from: getSize-YbymL2g, reason: from getter */
    public long getSize() {
        return this.size;
    }

    public final void place(@NotNull Placeable.PlacementScope scope, @NotNull LazyStaggeredGridMeasureContext context) {
        long offset;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(context, "context");
        List<Placeable> list = this.placeables;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Placeable placeable = list.get(i10);
            if (context.getReverseLayout()) {
                long offset2 = getOffset();
                offset = IntOffsetKt.IntOffset(this.isVertical ? IntOffset.m4069getXimpl(offset2) : (this.mainAxisLayoutSize - IntOffset.m4069getXimpl(offset2)) - (this.isVertical ? placeable.getHeight() : placeable.getWidth()), this.isVertical ? (this.mainAxisLayoutSize - IntOffset.m4070getYimpl(offset2)) - (this.isVertical ? placeable.getHeight() : placeable.getWidth()) : IntOffset.m4070getYimpl(offset2));
            } else {
                offset = getOffset();
            }
            long jM632getContentOffsetnOccac = context.getContentOffset();
            Placeable.PlacementScope.m3048placeRelativeWithLayeraW9wM$default(scope, placeable, IntOffsetKt.IntOffset(IntOffset.m4069getXimpl(offset) + IntOffset.m4069getXimpl(jM632getContentOffsetnOccac), IntOffset.m4070getYimpl(offset) + IntOffset.m4070getYimpl(jM632getContentOffsetnOccac)), 0.0f, null, 6, null);
        }
    }

    @NotNull
    public String toString() {
        return super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private LazyStaggeredGridPositionedItem(long j10, int i10, int i11, Object obj, long j11, List<? extends Placeable> list, boolean z10, int i12) {
        this.offset = j10;
        this.index = i10;
        this.lane = i11;
        this.key = obj;
        this.size = j11;
        this.placeables = list;
        this.isVertical = z10;
        this.mainAxisLayoutSize = i12;
    }
}
