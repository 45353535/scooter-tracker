package androidx.compose.foundation.lazy.grid;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.C4240b4;
import com.my.target.common.menu.MenuActionType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B~\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0002\u0010\u0018J\u0019\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010,2\u0006\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000J\u0006\u0010-\u001a\u00020\u0005J\u0006\u0010.\u001a\u00020\u0005J\u0006\u0010)\u001a\u00020\u0005J\u000e\u0010)\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202J.\u00103\u001a\u00020\u0003*\u00020\u00032\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000505H\u0082\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b6\u00107R\u0014\u0010\t\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u000e\u0010\u0016\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0002\u001a\u00020\u0003X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010$\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b%\u0010\u001aR\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u001f\u0010\n\u001a\u00020\u000bX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010#\u001a\u0004\b'\u0010\"R\u0019\u0010\u0015\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010#R\u0018\u0010(\u001a\u00020\u0005*\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00068"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridPositionedItem;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;", "offset", "Landroidx/compose/ui/unit/IntOffset;", FirebaseAnalytics.Param.INDEX, "", C4240b4.i.W, "", "row", "column", "size", "Landroidx/compose/ui/unit/IntSize;", "minMainAxisOffset", "maxMainAxisOffset", "isVertical", "", "placeables", "", "Landroidx/compose/ui/layout/Placeable;", "placementAnimator", "Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "visualOffset", "mainAxisLayoutSize", "reverseLayout", "(JILjava/lang/Object;IIJIIZLjava/util/List;Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;JIZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getColumn", "()I", "hasAnimations", "getHasAnimations", "()Z", "getIndex", "getKey", "()Ljava/lang/Object;", "getOffset-nOcc-ac", "()J", "J", "placeablesCount", "getPlaceablesCount", "getRow", "getSize-YbymL2g", "mainAxisSize", "getMainAxisSize", "(Landroidx/compose/ui/layout/Placeable;)I", "getAnimationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "getCrossAxisOffset", "getCrossAxisSize", "place", "", "scope", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", MenuActionType.COPY, "mainAxisMap", "Lkotlin/Function1;", "copy-4Tuh3kE", "(JLkotlin/jvm/functions/Function1;)J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LazyGridPositionedItem implements LazyGridItemInfo {
    private final int column;
    private final boolean hasAnimations;
    private final int index;
    private final boolean isVertical;

    @NotNull
    private final Object key;
    private final int mainAxisLayoutSize;
    private final int maxMainAxisOffset;
    private final int minMainAxisOffset;
    private final long offset;

    @NotNull
    private final List<Placeable> placeables;

    @NotNull
    private final LazyGridItemPlacementAnimator placementAnimator;
    private final boolean reverseLayout;
    private final int row;
    private final long size;
    private final long visualOffset;

    public /* synthetic */ LazyGridPositionedItem(long j10, int i10, Object obj, int i11, int i12, long j11, int i13, int i14, boolean z10, List list, LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator, long j12, int i15, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, i10, obj, i11, i12, j11, i13, i14, z10, list, lazyGridItemPlacementAnimator, j12, i15, z11);
    }

    /* JADX INFO: renamed from: copy-4Tuh3kE, reason: not valid java name */
    private final long m584copy4Tuh3kE(long j10, Function1<? super Integer, Integer> function1) {
        int iM4069getXimpl = this.isVertical ? IntOffset.m4069getXimpl(j10) : function1.invoke(Integer.valueOf(IntOffset.m4069getXimpl(j10))).intValue();
        boolean z10 = this.isVertical;
        int iM4070getYimpl = IntOffset.m4070getYimpl(j10);
        if (z10) {
            iM4070getYimpl = function1.invoke(Integer.valueOf(iM4070getYimpl)).intValue();
        }
        return IntOffsetKt.IntOffset(iM4069getXimpl, iM4070getYimpl);
    }

    @Nullable
    public final FiniteAnimationSpec<IntOffset> getAnimationSpec(int index) {
        Object parentData = this.placeables.get(index).getParentData();
        if (parentData instanceof FiniteAnimationSpec) {
            return (FiniteAnimationSpec) parentData;
        }
        return null;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public int getColumn() {
        return this.column;
    }

    public final int getCrossAxisOffset() {
        return this.isVertical ? IntOffset.m4069getXimpl(getOffset()) : IntOffset.m4070getYimpl(getOffset());
    }

    public final int getCrossAxisSize() {
        return this.isVertical ? IntSize.m4111getWidthimpl(getSize()) : IntSize.m4110getHeightimpl(getSize());
    }

    public final boolean getHasAnimations() {
        return this.hasAnimations;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    @NotNull
    public Object getKey() {
        return this.key;
    }

    public final int getMainAxisSize(int index) {
        return getMainAxisSize(this.placeables.get(index));
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    /* JADX INFO: renamed from: getOffset-nOcc-ac, reason: from getter */
    public long getOffset() {
        return this.offset;
    }

    public final int getPlaceablesCount() {
        return this.placeables.size();
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public int getRow() {
        return this.row;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    /* JADX INFO: renamed from: getSize-YbymL2g, reason: from getter */
    public long getSize() {
        return this.size;
    }

    public final void place(@NotNull Placeable.PlacementScope scope) {
        Placeable.PlacementScope placementScope;
        Intrinsics.checkNotNullParameter(scope, "scope");
        int placeablesCount = getPlaceablesCount();
        int i10 = 0;
        while (i10 < placeablesCount) {
            Placeable placeable = this.placeables.get(i10);
            long jM575getAnimatedOffsetYT5a7pE = getAnimationSpec(i10) != null ? this.placementAnimator.m575getAnimatedOffsetYT5a7pE(getKey(), i10, this.minMainAxisOffset - getMainAxisSize(placeable), this.maxMainAxisOffset, getOffset()) : getOffset();
            if (this.reverseLayout) {
                jM575getAnimatedOffsetYT5a7pE = IntOffsetKt.IntOffset(this.isVertical ? IntOffset.m4069getXimpl(jM575getAnimatedOffsetYT5a7pE) : (this.mainAxisLayoutSize - IntOffset.m4069getXimpl(jM575getAnimatedOffsetYT5a7pE)) - getMainAxisSize(placeable), this.isVertical ? (this.mainAxisLayoutSize - IntOffset.m4070getYimpl(jM575getAnimatedOffsetYT5a7pE)) - getMainAxisSize(placeable) : IntOffset.m4070getYimpl(jM575getAnimatedOffsetYT5a7pE));
            }
            if (this.isVertical) {
                long j10 = this.visualOffset;
                long jIntOffset = IntOffsetKt.IntOffset(IntOffset.m4069getXimpl(jM575getAnimatedOffsetYT5a7pE) + IntOffset.m4069getXimpl(j10), IntOffset.m4070getYimpl(jM575getAnimatedOffsetYT5a7pE) + IntOffset.m4070getYimpl(j10));
                placementScope = scope;
                Placeable.PlacementScope.m3049placeWithLayeraW9wM$default(placementScope, placeable, jIntOffset, 0.0f, null, 6, null);
            } else {
                placementScope = scope;
                long j11 = this.visualOffset;
                Placeable.PlacementScope.m3048placeRelativeWithLayeraW9wM$default(placementScope, placeable, IntOffsetKt.IntOffset(IntOffset.m4069getXimpl(jM575getAnimatedOffsetYT5a7pE) + IntOffset.m4069getXimpl(j11), IntOffset.m4070getYimpl(jM575getAnimatedOffsetYT5a7pE) + IntOffset.m4070getYimpl(j11)), 0.0f, null, 6, null);
            }
            i10++;
            scope = placementScope;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private LazyGridPositionedItem(long j10, int i10, Object obj, int i11, int i12, long j11, int i13, int i14, boolean z10, List<? extends Placeable> list, LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator, long j12, int i15, boolean z11) {
        this.offset = j10;
        this.index = i10;
        this.key = obj;
        this.row = i11;
        this.column = i12;
        this.size = j11;
        this.minMainAxisOffset = i13;
        this.maxMainAxisOffset = i14;
        this.isVertical = z10;
        this.placeables = list;
        this.placementAnimator = lazyGridItemPlacementAnimator;
        this.visualOffset = j12;
        this.mainAxisLayoutSize = i15;
        this.reverseLayout = z11;
        int placeablesCount = getPlaceablesCount();
        boolean z12 = false;
        int i16 = 0;
        while (true) {
            if (i16 >= placeablesCount) {
                break;
            }
            if (getAnimationSpec(i16) != null) {
                z12 = true;
                break;
            }
            i16++;
        }
        this.hasAnimations = z12;
    }

    public final int getMainAxisSize() {
        return this.isVertical ? IntSize.m4110getHeightimpl(getSize()) : IntSize.m4111getWidthimpl(getSize());
    }

    private final int getMainAxisSize(Placeable placeable) {
        return this.isVertical ? placeable.getHeight() : placeable.getWidth();
    }
}
