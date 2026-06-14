package androidx.compose.foundation.text;

import android.view.InputDevice;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.key.Key_androidKt;
import androidx.compose.ui.text.input.TextInputSession;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¨\u0006\u0006"}, d2 = {"interceptDPadAndMoveFocus", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/text/TextFieldState;", "focusManager", "Landroidx/compose/ui/focus/FocusManager;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TextFieldFocusModifier_androidKt {
    @NotNull
    public static final Modifier interceptDPadAndMoveFocus(@NotNull Modifier modifier, @NotNull final TextFieldState state, @NotNull final FocusManager focusManager) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(focusManager, "focusManager");
        return KeyInputModifierKt.onPreviewKeyEvent(modifier, new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.foundation.text.TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                return m773invokeZmokQxo(keyEvent.m2781unboximpl());
            }

            @NotNull
            /* JADX INFO: renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final Boolean m773invokeZmokQxo(@NotNull android.view.KeyEvent keyEvent) {
                boolean zMo1313moveFocus3ESFkO8;
                Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
                InputDevice device = keyEvent.getDevice();
                if (device == null) {
                    return Boolean.FALSE;
                }
                if (device.getKeyboardType() == 2 && device.isVirtual()) {
                    return Boolean.FALSE;
                }
                if (!KeyEventType.m2785equalsimpl0(KeyEvent_androidKt.m2793getTypeZmokQxo(keyEvent), KeyEventType.INSTANCE.m2789getKeyDownCS__XNY())) {
                    return Boolean.FALSE;
                }
                switch (Key_androidKt.m2801getNativeKeyCodeYVgTNJs(KeyEvent_androidKt.m2792getKeyZmokQxo(keyEvent))) {
                    case 19:
                        zMo1313moveFocus3ESFkO8 = focusManager.mo1313moveFocus3ESFkO8(FocusDirection.INSTANCE.m1312getUpdhqQ8s());
                        break;
                    case 20:
                        zMo1313moveFocus3ESFkO8 = focusManager.mo1313moveFocus3ESFkO8(FocusDirection.INSTANCE.m1303getDowndhqQ8s());
                        break;
                    case 21:
                        zMo1313moveFocus3ESFkO8 = focusManager.mo1313moveFocus3ESFkO8(FocusDirection.INSTANCE.m1307getLeftdhqQ8s());
                        break;
                    case 22:
                        zMo1313moveFocus3ESFkO8 = focusManager.mo1313moveFocus3ESFkO8(FocusDirection.INSTANCE.m1311getRightdhqQ8s());
                        break;
                    case 23:
                        TextInputSession inputSession = state.getInputSession();
                        if (inputSession != null) {
                            inputSession.showSoftwareKeyboard();
                        }
                        zMo1313moveFocus3ESFkO8 = true;
                        break;
                    default:
                        zMo1313moveFocus3ESFkO8 = false;
                        break;
                }
                return Boolean.valueOf(zMo1313moveFocus3ESFkO8);
            }
        });
    }
}
