package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001cB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0010\u0010\u0015\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0000J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u0019ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/text/selection/Selection;", "", "start", "Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "end", "handlesCrossed", "", "(Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;Z)V", "getEnd", "()Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "getHandlesCrossed", "()Z", "getStart", "component1", "component2", "component3", MenuActionType.COPY, "equals", "other", "hashCode", "", "merge", "toString", "", "toTextRange", "Landroidx/compose/ui/text/TextRange;", "toTextRange-d9O1mEE", "()J", "AnchorInfo", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Selection {

    @NotNull
    private final AnchorInfo end;
    private final boolean handlesCrossed;

    @NotNull
    private final AnchorInfo start;

    @Immutable
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "", "direction", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "offset", "", "selectableId", "", "(Landroidx/compose/ui/text/style/ResolvedTextDirection;IJ)V", "getDirection", "()Landroidx/compose/ui/text/style/ResolvedTextDirection;", "getOffset", "()I", "getSelectableId", "()J", "component1", "component2", "component3", MenuActionType.COPY, "equals", "", "other", "hashCode", "toString", "", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class AnchorInfo {

        @NotNull
        private final ResolvedTextDirection direction;
        private final int offset;
        private final long selectableId;

        public AnchorInfo(@NotNull ResolvedTextDirection direction, int i10, long j10) {
            Intrinsics.checkNotNullParameter(direction, "direction");
            this.direction = direction;
            this.offset = i10;
            this.selectableId = j10;
        }

        public static /* synthetic */ AnchorInfo copy$default(AnchorInfo anchorInfo, ResolvedTextDirection resolvedTextDirection, int i10, long j10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                resolvedTextDirection = anchorInfo.direction;
            }
            if ((i11 & 2) != 0) {
                i10 = anchorInfo.offset;
            }
            if ((i11 & 4) != 0) {
                j10 = anchorInfo.selectableId;
            }
            return anchorInfo.copy(resolvedTextDirection, i10, j10);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ResolvedTextDirection getDirection() {
            return this.direction;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getOffset() {
            return this.offset;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final long getSelectableId() {
            return this.selectableId;
        }

        @NotNull
        public final AnchorInfo copy(@NotNull ResolvedTextDirection direction, int offset, long selectableId) {
            Intrinsics.checkNotNullParameter(direction, "direction");
            return new AnchorInfo(direction, offset, selectableId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AnchorInfo)) {
                return false;
            }
            AnchorInfo anchorInfo = (AnchorInfo) other;
            return this.direction == anchorInfo.direction && this.offset == anchorInfo.offset && this.selectableId == anchorInfo.selectableId;
        }

        @NotNull
        public final ResolvedTextDirection getDirection() {
            return this.direction;
        }

        public final int getOffset() {
            return this.offset;
        }

        public final long getSelectableId() {
            return this.selectableId;
        }

        public int hashCode() {
            return (((this.direction.hashCode() * 31) + this.offset) * 31) + androidx.collection.b.a(this.selectableId);
        }

        @NotNull
        public String toString() {
            return "AnchorInfo(direction=" + this.direction + ", offset=" + this.offset + ", selectableId=" + this.selectableId + ')';
        }
    }

    public Selection(@NotNull AnchorInfo start, @NotNull AnchorInfo end, boolean z10) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        this.start = start;
        this.end = end;
        this.handlesCrossed = z10;
    }

    public static /* synthetic */ Selection copy$default(Selection selection, AnchorInfo anchorInfo, AnchorInfo anchorInfo2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            anchorInfo = selection.start;
        }
        if ((i10 & 2) != 0) {
            anchorInfo2 = selection.end;
        }
        if ((i10 & 4) != 0) {
            z10 = selection.handlesCrossed;
        }
        return selection.copy(anchorInfo, anchorInfo2, z10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AnchorInfo getStart() {
        return this.start;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AnchorInfo getEnd() {
        return this.end;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getHandlesCrossed() {
        return this.handlesCrossed;
    }

    @NotNull
    public final Selection copy(@NotNull AnchorInfo start, @NotNull AnchorInfo end, boolean handlesCrossed) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        return new Selection(start, end, handlesCrossed);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Selection)) {
            return false;
        }
        Selection selection = (Selection) other;
        return Intrinsics.areEqual(this.start, selection.start) && Intrinsics.areEqual(this.end, selection.end) && this.handlesCrossed == selection.handlesCrossed;
    }

    @NotNull
    public final AnchorInfo getEnd() {
        return this.end;
    }

    public final boolean getHandlesCrossed() {
        return this.handlesCrossed;
    }

    @NotNull
    public final AnchorInfo getStart() {
        return this.start;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public int hashCode() {
        int iHashCode = ((this.start.hashCode() * 31) + this.end.hashCode()) * 31;
        boolean z10 = this.handlesCrossed;
        ?? r12 = z10;
        if (z10) {
            r12 = 1;
        }
        return iHashCode + r12;
    }

    @NotNull
    public final Selection merge(@Nullable Selection other) {
        return other == null ? this : this.handlesCrossed ? copy$default(this, other.start, null, false, 6, null) : copy$default(this, null, other.end, false, 5, null);
    }

    @NotNull
    public String toString() {
        return "Selection(start=" + this.start + ", end=" + this.end + ", handlesCrossed=" + this.handlesCrossed + ')';
    }

    /* JADX INFO: renamed from: toTextRange-d9O1mEE, reason: not valid java name */
    public final long m816toTextRanged9O1mEE() {
        return TextRangeKt.TextRange(this.start.getOffset(), this.end.getOffset());
    }

    public /* synthetic */ Selection(AnchorInfo anchorInfo, AnchorInfo anchorInfo2, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(anchorInfo, anchorInfo2, (i10 & 4) != 0 ? false : z10);
    }
}
