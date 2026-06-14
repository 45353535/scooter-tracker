package androidx.compose.foundation.text;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0005\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/text/DeadKeyCombiner;", "", "()V", "deadKeyCode", "", "Ljava/lang/Integer;", "consume", "event", "Landroidx/compose/ui/input/key/KeyEvent;", "consume-ZmokQxo", "(Landroid/view/KeyEvent;)Ljava/lang/Integer;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DeadKeyCombiner {

    @Nullable
    private Integer deadKeyCode;

    @Nullable
    /* JADX INFO: renamed from: consume-ZmokQxo, reason: not valid java name */
    public final Integer m716consumeZmokQxo(@NotNull KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int iM2794getUtf16CodePointZmokQxo = KeyEvent_androidKt.m2794getUtf16CodePointZmokQxo(event);
        if ((Integer.MIN_VALUE & iM2794getUtf16CodePointZmokQxo) != 0) {
            this.deadKeyCode = Integer.valueOf(iM2794getUtf16CodePointZmokQxo & Integer.MAX_VALUE);
            return null;
        }
        Integer num = this.deadKeyCode;
        if (num == null) {
            return Integer.valueOf(iM2794getUtf16CodePointZmokQxo);
        }
        this.deadKeyCode = null;
        Integer numValueOf = Integer.valueOf(KeyCharacterMap.getDeadChar(num.intValue(), iM2794getUtf16CodePointZmokQxo));
        Integer num2 = numValueOf.intValue() != 0 ? numValueOf : null;
        return num2 == null ? Integer.valueOf(iM2794getUtf16CodePointZmokQxo) : num2;
    }
}
