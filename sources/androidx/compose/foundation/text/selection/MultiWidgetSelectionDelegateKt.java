package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import com.ironsource.C4240b4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a-\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001ak\u0010\u0014\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00050\u00152\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u001c\u001a\u00020\u0005H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"getAssembledSelectionInfo", "Landroidx/compose/foundation/text/selection/Selection;", "newSelectionRange", "Landroidx/compose/ui/text/TextRange;", "handlesCrossed", "", "selectableId", "", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "getAssembledSelectionInfo-vJH6DeI", "(JZJLandroidx/compose/ui/text/TextLayoutResult;)Landroidx/compose/foundation/text/selection/Selection;", "getOffsetForPosition", "", "bounds", "Landroidx/compose/ui/geometry/Rect;", C4240b4.i.L, "Landroidx/compose/ui/geometry/Offset;", "getOffsetForPosition-0AR0LA0", "(Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/geometry/Rect;J)I", "getTextSelectionInfo", "Lkotlin/Pair;", "startHandlePosition", "endHandlePosition", "previousHandlePosition", "adjustment", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "previousSelection", "isStartHandle", "getTextSelectionInfo-yM0VcXU", "(Landroidx/compose/ui/text/TextLayoutResult;JJLandroidx/compose/ui/geometry/Offset;JLandroidx/compose/foundation/text/selection/SelectionAdjustment;Landroidx/compose/foundation/text/selection/Selection;Z)Lkotlin/Pair;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class MultiWidgetSelectionDelegateKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getAssembledSelectionInfo-vJH6DeI, reason: not valid java name */
    public static final Selection m812getAssembledSelectionInfovJH6DeI(long j10, boolean z10, long j11, TextLayoutResult textLayoutResult) {
        return new Selection(new Selection.AnchorInfo(textLayoutResult.getBidiRunDirection(TextRange.m3503getStartimpl(j10)), TextRange.m3503getStartimpl(j10), j11), new Selection.AnchorInfo(textLayoutResult.getBidiRunDirection(Math.max(TextRange.m3498getEndimpl(j10) - 1, 0)), TextRange.m3498getEndimpl(j10), j11), z10);
    }

    /* JADX INFO: renamed from: getOffsetForPosition-0AR0LA0, reason: not valid java name */
    public static final int m813getOffsetForPosition0AR0LA0(@NotNull TextLayoutResult textLayoutResult, @NotNull Rect bounds, long j10) {
        Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        int length = textLayoutResult.getLayoutInput().getText().length();
        if (bounds.m1397containsk4lQ0M(j10)) {
            return g.n(textLayoutResult.m3475getOffsetForPositionk4lQ0M(j10), 0, length);
        }
        if (SelectionMode.Vertical.mo864compare3MmeM6k$foundation_release(j10, bounds) < 0) {
            return 0;
        }
        return length;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: getTextSelectionInfo-yM0VcXU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Pair<androidx.compose.foundation.text.selection.Selection, java.lang.Boolean> m814getTextSelectionInfoyM0VcXU(@org.jetbrains.annotations.NotNull androidx.compose.ui.text.TextLayoutResult r14, long r15, long r17, @org.jetbrains.annotations.Nullable androidx.compose.ui.geometry.Offset r19, long r20, @org.jetbrains.annotations.NotNull androidx.compose.foundation.text.selection.SelectionAdjustment r22, @org.jetbrains.annotations.Nullable androidx.compose.foundation.text.selection.Selection r23, boolean r24) {
        /*
            r7 = r23
            java.lang.String r0 = "textLayoutResult"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "adjustment"
            r1 = r22
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            androidx.compose.ui.geometry.Rect r9 = new androidx.compose.ui.geometry.Rect
            long r2 = r14.getSize()
            int r0 = androidx.compose.ui.unit.IntSize.m4111getWidthimpl(r2)
            float r0 = (float) r0
            long r2 = r14.getSize()
            int r2 = androidx.compose.ui.unit.IntSize.m4110getHeightimpl(r2)
            float r2 = (float) r2
            r3 = 0
            r9.<init>(r3, r3, r0, r2)
            androidx.compose.foundation.text.selection.SelectionMode r8 = androidx.compose.foundation.text.selection.SelectionMode.Vertical
            r10 = r15
            r12 = r17
            boolean r0 = r8.m865isSelected2x9bVx0$foundation_release(r9, r10, r12)
            r2 = 0
            if (r0 != 0) goto L3a
            kotlin.Pair r0 = new kotlin.Pair
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.<init>(r2, r1)
            return r0
        L3a:
            r10 = r15
            int r8 = m813getOffsetForPosition0AR0LA0(r14, r9, r10)
            r12 = r17
            int r10 = m813getOffsetForPosition0AR0LA0(r14, r9, r12)
            if (r19 == 0) goto L52
            long r3 = r19.getPackedValue()
            int r0 = m813getOffsetForPosition0AR0LA0(r14, r9, r3)
        L4f:
            r4 = r0
            r0 = r2
            goto L54
        L52:
            r0 = -1
            goto L4f
        L54:
            long r2 = androidx.compose.ui.text.TextRangeKt.TextRange(r8, r10)
            if (r7 == 0) goto L62
            long r11 = r7.m816toTextRanged9O1mEE()
            androidx.compose.ui.text.TextRange r0 = androidx.compose.ui.text.TextRange.m3491boximpl(r11)
        L62:
            r5 = r24
            r6 = r0
            r0 = r1
            r1 = r14
            long r2 = r0.mo817adjustZXO7KMw(r1, r2, r4, r5, r6)
            r0 = r2
            r6 = r4
            boolean r2 = androidx.compose.ui.text.TextRange.m3502getReversedimpl(r0)
            r5 = r14
            r3 = r20
            androidx.compose.foundation.text.selection.Selection r0 = m812getAssembledSelectionInfovJH6DeI(r0, r2, r3, r5)
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r7)
            if (r24 == 0) goto L81
            if (r8 == r6) goto L84
            goto L86
        L81:
            if (r10 == r6) goto L84
            goto L86
        L84:
            if (r1 != 0) goto L88
        L86:
            r1 = 1
            goto L89
        L88:
            r1 = 0
        L89:
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2.<init>(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.MultiWidgetSelectionDelegateKt.m814getTextSelectionInfoyM0VcXU(androidx.compose.ui.text.TextLayoutResult, long, long, androidx.compose.ui.geometry.Offset, long, androidx.compose.foundation.text.selection.SelectionAdjustment, androidx.compose.foundation.text.selection.Selection, boolean):kotlin.Pair");
    }
}
