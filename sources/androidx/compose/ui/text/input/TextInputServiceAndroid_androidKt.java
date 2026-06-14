package androidx.compose.ui.text.input;

import android.view.Choreographer;
import android.view.inputmethod.EditorInfo;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.emoji2.text.EmojiCompat;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\tH\u0000\u001a\u001c\u0010\n\u001a\u00020\u000b*\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0000\u001a\f\u0010\u0011\u001a\u00020\u000b*\u00020\fH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"DEBUG_CLASS", "", "hasFlag", "", "bits", "", "flag", "asExecutor", "Ljava/util/concurrent/Executor;", "Landroid/view/Choreographer;", "update", "", "Landroid/view/inputmethod/EditorInfo;", "imeOptions", "Landroidx/compose/ui/text/input/ImeOptions;", "textFieldValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "updateWithEmojiCompat", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TextInputServiceAndroid_androidKt {

    @NotNull
    private static final String DEBUG_CLASS = "TextInputServiceAndroid";

    @NotNull
    public static final Executor asExecutor(@NotNull final Choreographer choreographer) {
        Intrinsics.checkNotNullParameter(choreographer, "<this>");
        return new Executor() { // from class: androidx.compose.ui.text.input.f
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                TextInputServiceAndroid_androidKt.asExecutor$lambda$1(choreographer, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void asExecutor$lambda$1(Choreographer this_asExecutor, final Runnable runnable) {
        Intrinsics.checkNotNullParameter(this_asExecutor, "$this_asExecutor");
        this_asExecutor.postFrameCallback(new Choreographer.FrameCallback() { // from class: androidx.compose.ui.text.input.e
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j10) {
                runnable.run();
            }
        });
    }

    private static final boolean hasFlag(int i10, int i11) {
        return (i10 & i11) == i11;
    }

    public static final void update(@NotNull EditorInfo editorInfo, @NotNull ImeOptions imeOptions, @NotNull TextFieldValue textFieldValue) {
        Intrinsics.checkNotNullParameter(editorInfo, "<this>");
        Intrinsics.checkNotNullParameter(imeOptions, "imeOptions");
        Intrinsics.checkNotNullParameter(textFieldValue, "textFieldValue");
        int imeAction = imeOptions.getImeAction();
        ImeAction.Companion companion = ImeAction.INSTANCE;
        int i10 = 6;
        if (ImeAction.m3637equalsimpl0(imeAction, companion.m3649getDefaulteUduSuo())) {
            if (!imeOptions.getSingleLine()) {
                i10 = 0;
            }
        } else if (ImeAction.m3637equalsimpl0(imeAction, companion.m3653getNoneeUduSuo())) {
            i10 = 1;
        } else if (ImeAction.m3637equalsimpl0(imeAction, companion.m3651getGoeUduSuo())) {
            i10 = 2;
        } else if (ImeAction.m3637equalsimpl0(imeAction, companion.m3652getNexteUduSuo())) {
            i10 = 5;
        } else if (ImeAction.m3637equalsimpl0(imeAction, companion.m3654getPreviouseUduSuo())) {
            i10 = 7;
        } else if (ImeAction.m3637equalsimpl0(imeAction, companion.m3655getSearcheUduSuo())) {
            i10 = 3;
        } else if (ImeAction.m3637equalsimpl0(imeAction, companion.m3656getSendeUduSuo())) {
            i10 = 4;
        } else if (!ImeAction.m3637equalsimpl0(imeAction, companion.m3650getDoneeUduSuo())) {
            throw new IllegalStateException("invalid ImeAction");
        }
        editorInfo.imeOptions = i10;
        int keyboardType = imeOptions.getKeyboardType();
        KeyboardType.Companion companion2 = KeyboardType.INSTANCE;
        if (KeyboardType.m3682equalsimpl0(keyboardType, companion2.m3702getTextPjHm6EE())) {
            editorInfo.inputType = 1;
        } else if (KeyboardType.m3682equalsimpl0(keyboardType, companion2.m3695getAsciiPjHm6EE())) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= Integer.MIN_VALUE;
        } else if (KeyboardType.m3682equalsimpl0(keyboardType, companion2.m3698getNumberPjHm6EE())) {
            editorInfo.inputType = 2;
        } else if (KeyboardType.m3682equalsimpl0(keyboardType, companion2.m3701getPhonePjHm6EE())) {
            editorInfo.inputType = 3;
        } else if (KeyboardType.m3682equalsimpl0(keyboardType, companion2.m3703getUriPjHm6EE())) {
            editorInfo.inputType = 17;
        } else if (KeyboardType.m3682equalsimpl0(keyboardType, companion2.m3697getEmailPjHm6EE())) {
            editorInfo.inputType = 33;
        } else if (KeyboardType.m3682equalsimpl0(keyboardType, companion2.m3700getPasswordPjHm6EE())) {
            editorInfo.inputType = 129;
        } else if (KeyboardType.m3682equalsimpl0(keyboardType, companion2.m3699getNumberPasswordPjHm6EE())) {
            editorInfo.inputType = 18;
        } else {
            if (!KeyboardType.m3682equalsimpl0(keyboardType, companion2.m3696getDecimalPjHm6EE())) {
                throw new IllegalStateException("Invalid Keyboard Type");
            }
            editorInfo.inputType = 8194;
        }
        if (!imeOptions.getSingleLine() && hasFlag(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (ImeAction.m3637equalsimpl0(imeOptions.getImeAction(), companion.m3649getDefaulteUduSuo())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (hasFlag(editorInfo.inputType, 1)) {
            int capitalization = imeOptions.getCapitalization();
            KeyboardCapitalization.Companion companion3 = KeyboardCapitalization.INSTANCE;
            if (KeyboardCapitalization.m3667equalsimpl0(capitalization, companion3.m3675getCharactersIUNYP9k())) {
                editorInfo.inputType |= 4096;
            } else if (KeyboardCapitalization.m3667equalsimpl0(capitalization, companion3.m3678getWordsIUNYP9k())) {
                editorInfo.inputType |= 8192;
            } else if (KeyboardCapitalization.m3667equalsimpl0(capitalization, companion3.m3677getSentencesIUNYP9k())) {
                editorInfo.inputType |= 16384;
            }
            if (imeOptions.getAutoCorrect()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = TextRange.m3503getStartimpl(textFieldValue.getSelection());
        editorInfo.initialSelEnd = TextRange.m3498getEndimpl(textFieldValue.getSelection());
        EditorInfoCompat.setInitialSurroundingText(editorInfo, textFieldValue.getText());
        editorInfo.imeOptions |= 33554432;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateWithEmojiCompat(EditorInfo editorInfo) {
        if (EmojiCompat.isConfigured()) {
            EmojiCompat.get().updateEditorInfo(editorInfo);
        }
    }
}
