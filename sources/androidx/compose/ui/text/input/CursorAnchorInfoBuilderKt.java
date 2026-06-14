package androidx.compose.ui.text.input;

import android.graphics.Matrix;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000\u001a\u001c\u0010\t\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\f"}, d2 = {"build", "Landroid/view/inputmethod/CursorAnchorInfo;", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "textFieldValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "matrix", "Landroid/graphics/Matrix;", "setInsertionMarker", "selectionStart", "", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CursorAnchorInfoBuilderKt {
    @NotNull
    public static final CursorAnchorInfo build(@NotNull CursorAnchorInfo.Builder builder, @NotNull TextFieldValue textFieldValue, @NotNull TextLayoutResult textLayoutResult, @NotNull Matrix matrix) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(textFieldValue, "textFieldValue");
        Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        builder.reset();
        builder.setMatrix(matrix);
        int iM3501getMinimpl = TextRange.m3501getMinimpl(textFieldValue.getSelection());
        builder.setSelectionRange(iM3501getMinimpl, TextRange.m3500getMaximpl(textFieldValue.getSelection()));
        setInsertionMarker(builder, iM3501getMinimpl, textLayoutResult);
        TextRange composition = textFieldValue.getComposition();
        int iM3501getMinimpl2 = composition != null ? TextRange.m3501getMinimpl(composition.getPackedValue()) : -1;
        TextRange composition2 = textFieldValue.getComposition();
        int iM3500getMaximpl = composition2 != null ? TextRange.m3500getMaximpl(composition2.getPackedValue()) : -1;
        if (iM3501getMinimpl2 >= 0 && iM3501getMinimpl2 < iM3500getMaximpl) {
            builder.setComposingText(iM3501getMinimpl2, textFieldValue.getText().subSequence(iM3501getMinimpl2, iM3500getMaximpl));
        }
        CursorAnchorInfo cursorAnchorInfoBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(cursorAnchorInfoBuild, "build()");
        return cursorAnchorInfoBuild;
    }

    private static final CursorAnchorInfo.Builder setInsertionMarker(CursorAnchorInfo.Builder builder, int i10, TextLayoutResult textLayoutResult) {
        if (i10 < 0) {
            return builder;
        }
        Rect cursorRect = textLayoutResult.getCursorRect(i10);
        builder.setInsertionMarkerLocation(cursorRect.getLeft(), cursorRect.getTop(), cursorRect.getBottom(), cursorRect.getBottom(), textLayoutResult.getBidiRunDirection(i10) == ResolvedTextDirection.Rtl ? 4 : 0);
        return builder;
    }
}
