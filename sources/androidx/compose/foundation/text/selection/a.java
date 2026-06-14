package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ Pair a(Selectable selectable, long j10, long j11, Offset offset, boolean z10, LayoutCoordinates layoutCoordinates, SelectionAdjustment selectionAdjustment, Selection selection, int i10, Object obj) {
        if (obj == null) {
            return selectable.mo810updateSelectionqCDeeow(j10, j11, offset, (i10 & 8) != 0 ? true : z10, layoutCoordinates, selectionAdjustment, (i10 & 64) != 0 ? null : selection);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateSelection-qCDeeow");
    }
}
