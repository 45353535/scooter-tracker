package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\u0010\tJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000bH\u0016J(\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0010\u001a\u00020\u000bH\u0016J\n\u0010\u001d\u001a\u0004\u0018\u00010\u0006H\u0016J \u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0014\u001a\u00020\u000bH\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b \u0010!J\n\u0010\"\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010#\u001a\u00020$H\u0016J_\u0010%\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u001a0&2\u0006\u0010'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u00162\b\u0010)\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020\u00062\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0018H\u0016ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b.\u0010/R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\u00020\u000b*\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00060"}, d2 = {"Landroidx/compose/foundation/text/selection/MultiWidgetSelectionDelegate;", "Landroidx/compose/foundation/text/selection/Selectable;", "selectableId", "", "coordinatesCallback", "Lkotlin/Function0;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "layoutResultCallback", "Landroidx/compose/ui/text/TextLayoutResult;", "(JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "_previousLastVisibleOffset", "", "_previousTextLayoutResult", "getSelectableId", "()J", "lastVisibleOffset", "getLastVisibleOffset", "(Landroidx/compose/ui/text/TextLayoutResult;)I", "getBoundingBox", "Landroidx/compose/ui/geometry/Rect;", "offset", "getHandlePosition", "Landroidx/compose/ui/geometry/Offset;", "selection", "Landroidx/compose/foundation/text/selection/Selection;", "isStartHandle", "", "getHandlePosition-dBAh8RU", "(Landroidx/compose/foundation/text/selection/Selection;Z)J", "getLayoutCoordinates", "getRangeOfLineContaining", "Landroidx/compose/ui/text/TextRange;", "getRangeOfLineContaining--jx7JFs", "(I)J", "getSelectAllSelection", "getText", "Landroidx/compose/ui/text/AnnotatedString;", "updateSelection", "Lkotlin/Pair;", "startHandlePosition", "endHandlePosition", "previousHandlePosition", "containerLayoutCoordinates", "adjustment", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "previousSelection", "updateSelection-qCDeeow", "(JJLandroidx/compose/ui/geometry/Offset;ZLandroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/foundation/text/selection/SelectionAdjustment;Landroidx/compose/foundation/text/selection/Selection;)Lkotlin/Pair;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MultiWidgetSelectionDelegate implements Selectable {
    private int _previousLastVisibleOffset;

    @Nullable
    private TextLayoutResult _previousTextLayoutResult;

    @NotNull
    private final Function0<LayoutCoordinates> coordinatesCallback;

    @NotNull
    private final Function0<TextLayoutResult> layoutResultCallback;
    private final long selectableId;

    /* JADX WARN: Multi-variable type inference failed */
    public MultiWidgetSelectionDelegate(long j10, @NotNull Function0<? extends LayoutCoordinates> coordinatesCallback, @NotNull Function0<TextLayoutResult> layoutResultCallback) {
        Intrinsics.checkNotNullParameter(coordinatesCallback, "coordinatesCallback");
        Intrinsics.checkNotNullParameter(layoutResultCallback, "layoutResultCallback");
        this.selectableId = j10;
        this.coordinatesCallback = coordinatesCallback;
        this.layoutResultCallback = layoutResultCallback;
        this._previousLastVisibleOffset = -1;
    }

    private final synchronized int getLastVisibleOffset(TextLayoutResult textLayoutResult) {
        int lineCount;
        try {
            if (this._previousTextLayoutResult != textLayoutResult) {
                if (!textLayoutResult.getDidOverflowHeight() || textLayoutResult.getMultiParagraph().getDidExceedMaxLines()) {
                    lineCount = textLayoutResult.getLineCount() - 1;
                } else {
                    lineCount = g.j(textLayoutResult.getLineForVerticalPosition(IntSize.m4110getHeightimpl(textLayoutResult.getSize())), textLayoutResult.getLineCount() - 1);
                    while (textLayoutResult.getLineTop(lineCount) >= IntSize.m4110getHeightimpl(textLayoutResult.getSize())) {
                        lineCount--;
                    }
                }
                this._previousLastVisibleOffset = textLayoutResult.getLineEnd(lineCount, true);
                this._previousTextLayoutResult = textLayoutResult;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this._previousLastVisibleOffset;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    @NotNull
    public Rect getBoundingBox(int offset) {
        TextLayoutResult textLayoutResultInvoke = this.layoutResultCallback.invoke();
        if (textLayoutResultInvoke == null) {
            return Rect.INSTANCE.getZero();
        }
        int length = textLayoutResultInvoke.getLayoutInput().getText().length();
        return length < 1 ? Rect.INSTANCE.getZero() : textLayoutResultInvoke.getBoundingBox(g.n(offset, 0, length - 1));
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    /* JADX INFO: renamed from: getHandlePosition-dBAh8RU, reason: not valid java name */
    public long mo808getHandlePositiondBAh8RU(@NotNull Selection selection, boolean isStartHandle) {
        Intrinsics.checkNotNullParameter(selection, "selection");
        if ((isStartHandle && selection.getStart().getSelectableId() != getSelectableId()) || (!isStartHandle && selection.getEnd().getSelectableId() != getSelectableId())) {
            return Offset.INSTANCE.m1387getZeroF1C5BW0();
        }
        if (getLayoutCoordinates() == null) {
            return Offset.INSTANCE.m1387getZeroF1C5BW0();
        }
        TextLayoutResult textLayoutResultInvoke = this.layoutResultCallback.invoke();
        if (textLayoutResultInvoke == null) {
            return Offset.INSTANCE.m1387getZeroF1C5BW0();
        }
        return TextSelectionDelegateKt.getSelectionHandleCoordinates(textLayoutResultInvoke, g.n((isStartHandle ? selection.getStart() : selection.getEnd()).getOffset(), 0, getLastVisibleOffset(textLayoutResultInvoke)), isStartHandle, selection.getHandlesCrossed());
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    @Nullable
    public LayoutCoordinates getLayoutCoordinates() {
        LayoutCoordinates layoutCoordinatesInvoke = this.coordinatesCallback.invoke();
        if (layoutCoordinatesInvoke == null || !layoutCoordinatesInvoke.isAttached()) {
            return null;
        }
        return layoutCoordinatesInvoke;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    /* JADX INFO: renamed from: getRangeOfLineContaining--jx7JFs, reason: not valid java name */
    public long mo809getRangeOfLineContainingjx7JFs(int offset) {
        TextLayoutResult textLayoutResultInvoke = this.layoutResultCallback.invoke();
        if (textLayoutResultInvoke == null) {
            return TextRange.INSTANCE.m3508getZerod9O1mEE();
        }
        int lastVisibleOffset = getLastVisibleOffset(textLayoutResultInvoke);
        if (lastVisibleOffset < 1) {
            return TextRange.INSTANCE.m3508getZerod9O1mEE();
        }
        int lineForOffset = textLayoutResultInvoke.getLineForOffset(g.n(offset, 0, lastVisibleOffset - 1));
        return TextRangeKt.TextRange(textLayoutResultInvoke.getLineStart(lineForOffset), textLayoutResultInvoke.getLineEnd(lineForOffset, true));
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    @Nullable
    public Selection getSelectAllSelection() {
        TextLayoutResult textLayoutResultInvoke = this.layoutResultCallback.invoke();
        if (textLayoutResultInvoke == null) {
            return null;
        }
        return MultiWidgetSelectionDelegateKt.m812getAssembledSelectionInfovJH6DeI(TextRangeKt.TextRange(0, textLayoutResultInvoke.getLayoutInput().getText().length()), false, getSelectableId(), textLayoutResultInvoke);
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public long getSelectableId() {
        return this.selectableId;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    @NotNull
    public AnnotatedString getText() {
        TextLayoutResult textLayoutResultInvoke = this.layoutResultCallback.invoke();
        return textLayoutResultInvoke == null ? new AnnotatedString("", null, null, 6, null) : textLayoutResultInvoke.getLayoutInput().getText();
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    @NotNull
    /* JADX INFO: renamed from: updateSelection-qCDeeow, reason: not valid java name */
    public Pair<Selection, Boolean> mo810updateSelectionqCDeeow(long startHandlePosition, long endHandlePosition, @Nullable Offset previousHandlePosition, boolean isStartHandle, @NotNull LayoutCoordinates containerLayoutCoordinates, @NotNull SelectionAdjustment adjustment, @Nullable Selection previousSelection) {
        Intrinsics.checkNotNullParameter(containerLayoutCoordinates, "containerLayoutCoordinates");
        Intrinsics.checkNotNullParameter(adjustment, "adjustment");
        if (previousSelection != null && (getSelectableId() != previousSelection.getStart().getSelectableId() || getSelectableId() != previousSelection.getEnd().getSelectableId())) {
            throw new IllegalArgumentException("The given previousSelection doesn't belong to this selectable.");
        }
        LayoutCoordinates layoutCoordinates = getLayoutCoordinates();
        if (layoutCoordinates == null) {
            return new Pair<>(null, Boolean.FALSE);
        }
        TextLayoutResult textLayoutResultInvoke = this.layoutResultCallback.invoke();
        if (textLayoutResultInvoke == null) {
            return new Pair<>(null, Boolean.FALSE);
        }
        long jMo3016localPositionOfR5De75A = containerLayoutCoordinates.mo3016localPositionOfR5De75A(layoutCoordinates, Offset.INSTANCE.m1387getZeroF1C5BW0());
        return MultiWidgetSelectionDelegateKt.m814getTextSelectionInfoyM0VcXU(textLayoutResultInvoke, Offset.m1375minusMKHz9U(startHandlePosition, jMo3016localPositionOfR5De75A), Offset.m1375minusMKHz9U(endHandlePosition, jMo3016localPositionOfR5De75A), previousHandlePosition != null ? Offset.m1360boximpl(Offset.m1375minusMKHz9U(previousHandlePosition.getPackedValue(), jMo3016localPositionOfR5De75A)) : null, getSelectableId(), adjustment, previousSelection, isStartHandle);
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public int getLastVisibleOffset() {
        TextLayoutResult textLayoutResultInvoke = this.layoutResultCallback.invoke();
        if (textLayoutResultInvoke == null) {
            return 0;
        }
        return getLastVisibleOffset(textLayoutResultInvoke);
    }
}
