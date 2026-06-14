package androidx.compose.ui.text.input;

import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"updateRangeAfterDelete", "Landroidx/compose/ui/text/TextRange;", TypedValues.AttributesType.S_TARGET, "deleted", "updateRangeAfterDelete-pWDy79M", "(JJ)J", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class EditingBufferKt {
    /* JADX INFO: renamed from: updateRangeAfterDelete-pWDy79M, reason: not valid java name */
    public static final long m3633updateRangeAfterDeletepWDy79M(long j10, long j11) {
        int iM3499getLengthimpl;
        int iM3501getMinimpl = TextRange.m3501getMinimpl(j10);
        int iM3500getMaximpl = TextRange.m3500getMaximpl(j10);
        if (TextRange.m3505intersects5zctL8(j11, j10)) {
            if (TextRange.m3493contains5zctL8(j11, j10)) {
                iM3501getMinimpl = TextRange.m3501getMinimpl(j11);
                iM3500getMaximpl = iM3501getMinimpl;
            } else {
                if (TextRange.m3493contains5zctL8(j10, j11)) {
                    iM3499getLengthimpl = TextRange.m3499getLengthimpl(j11);
                } else if (TextRange.m3494containsimpl(j11, iM3501getMinimpl)) {
                    iM3501getMinimpl = TextRange.m3501getMinimpl(j11);
                    iM3499getLengthimpl = TextRange.m3499getLengthimpl(j11);
                } else {
                    iM3500getMaximpl = TextRange.m3501getMinimpl(j11);
                }
                iM3500getMaximpl -= iM3499getLengthimpl;
            }
        } else if (iM3500getMaximpl > TextRange.m3501getMinimpl(j11)) {
            iM3501getMinimpl -= TextRange.m3499getLengthimpl(j11);
            iM3499getLengthimpl = TextRange.m3499getLengthimpl(j11);
            iM3500getMaximpl -= iM3499getLengthimpl;
        }
        return TextRangeKt.TextRange(iM3501getMinimpl, iM3500getMaximpl);
    }
}
