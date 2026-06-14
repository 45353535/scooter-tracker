package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.TextRange;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\f\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ \u0010\u0010\u001a\u00020\u00112\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000fH\u0002J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u0006\u0010\u0018\u001a\u00020\bJ\f\u0010\u0019\u001a\u00020\u0011*\u00020\u000fH\u0002R\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/text/input/EditProcessor;", "", "()V", "<set-?>", "Landroidx/compose/ui/text/input/EditingBuffer;", "mBuffer", "getMBuffer$ui_text_release", "()Landroidx/compose/ui/text/input/EditingBuffer;", "Landroidx/compose/ui/text/input/TextFieldValue;", "mBufferState", "getMBufferState$ui_text_release", "()Landroidx/compose/ui/text/input/TextFieldValue;", "apply", "editCommands", "", "Landroidx/compose/ui/text/input/EditCommand;", "generateBatchErrorMessage", "", "failedCommand", "reset", "", "value", "textInputSession", "Landroidx/compose/ui/text/input/TextInputSession;", "toTextFieldValue", "toStringForLog", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class EditProcessor {
    public static final int $stable = 8;

    @NotNull
    private TextFieldValue mBufferState = new TextFieldValue(AnnotatedStringKt.emptyAnnotatedString(), TextRange.INSTANCE.m3508getZerod9O1mEE(), (TextRange) null, (DefaultConstructorMarker) null);

    @NotNull
    private EditingBuffer mBuffer = new EditingBuffer(this.mBufferState.getText(), this.mBufferState.getSelection(), (DefaultConstructorMarker) null);

    private final String generateBatchErrorMessage(List<? extends EditCommand> editCommands, final EditCommand failedCommand) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Error while applying EditCommand batch to buffer (length=" + this.mBuffer.getLength$ui_text_release() + ", composition=" + this.mBuffer.m3631getCompositionMzsxiRA$ui_text_release() + ", selection=" + ((Object) TextRange.m3506toStringimpl(this.mBuffer.m3632getSelectiond9O1mEE$ui_text_release())) + "):");
        Intrinsics.checkNotNullExpressionValue(sb2, "append(value)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append('\\n')");
        CollectionsKt___CollectionsKt.joinTo(editCommands, sb2, (124 & 2) != 0 ? ", " : IOUtils.LINE_SEPARATOR_UNIX, (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? APSSharedUtil.TRUNCATE_SEPARATOR : null, (124 & 64) != 0 ? null : new Function1<EditCommand, CharSequence>() { // from class: androidx.compose.ui.text.input.EditProcessor$generateBatchErrorMessage$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final CharSequence invoke(@NotNull EditCommand it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (failedCommand == it ? " > " : "   ") + this.toStringForLog(it);
            }
        });
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String toStringForLog(EditCommand editCommand) {
        if (editCommand instanceof CommitTextCommand) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("CommitTextCommand(text.length=");
            CommitTextCommand commitTextCommand = (CommitTextCommand) editCommand;
            sb2.append(commitTextCommand.getText().length());
            sb2.append(", newCursorPosition=");
            sb2.append(commitTextCommand.getNewCursorPosition());
            sb2.append(')');
            return sb2.toString();
        }
        if (editCommand instanceof SetComposingTextCommand) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("SetComposingTextCommand(text.length=");
            SetComposingTextCommand setComposingTextCommand = (SetComposingTextCommand) editCommand;
            sb3.append(setComposingTextCommand.getText().length());
            sb3.append(", newCursorPosition=");
            sb3.append(setComposingTextCommand.getNewCursorPosition());
            sb3.append(')');
            return sb3.toString();
        }
        if (editCommand instanceof SetComposingRegionCommand) {
            return editCommand.toString();
        }
        if (editCommand instanceof DeleteSurroundingTextCommand) {
            return editCommand.toString();
        }
        if (editCommand instanceof DeleteSurroundingTextInCodePointsCommand) {
            return editCommand.toString();
        }
        if (editCommand instanceof SetSelectionCommand) {
            return editCommand.toString();
        }
        if (editCommand instanceof FinishComposingTextCommand) {
            return editCommand.toString();
        }
        if (editCommand instanceof BackspaceCommand) {
            return editCommand.toString();
        }
        if (editCommand instanceof MoveCursorCommand) {
            return editCommand.toString();
        }
        if (editCommand instanceof DeleteAllCommand) {
            return editCommand.toString();
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Unknown EditCommand: ");
        String simpleName = v0.b(editCommand.getClass()).getSimpleName();
        if (simpleName == null) {
            simpleName = "{anonymous EditCommand}";
        }
        sb4.append(simpleName);
        return sb4.toString();
    }

    @NotNull
    public final TextFieldValue apply(@NotNull List<? extends EditCommand> editCommands) {
        Intrinsics.checkNotNullParameter(editCommands, "editCommands");
        EditCommand editCommand = null;
        try {
            int size = editCommands.size();
            int i10 = 0;
            while (i10 < size) {
                EditCommand editCommand2 = editCommands.get(i10);
                try {
                    editCommand2.applyTo(this.mBuffer);
                    i10++;
                    editCommand = editCommand2;
                } catch (Exception e10) {
                    e = e10;
                    editCommand = editCommand2;
                    throw new RuntimeException(generateBatchErrorMessage(editCommands, editCommand), e);
                }
            }
            TextFieldValue textFieldValue = new TextFieldValue(this.mBuffer.toAnnotatedString$ui_text_release(), this.mBuffer.m3632getSelectiond9O1mEE$ui_text_release(), this.mBuffer.m3631getCompositionMzsxiRA$ui_text_release(), (DefaultConstructorMarker) null);
            this.mBufferState = textFieldValue;
            return textFieldValue;
        } catch (Exception e11) {
            e = e11;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: getMBuffer$ui_text_release, reason: from getter */
    public final EditingBuffer getMBuffer() {
        return this.mBuffer;
    }

    @NotNull
    /* JADX INFO: renamed from: getMBufferState$ui_text_release, reason: from getter */
    public final TextFieldValue getMBufferState() {
        return this.mBufferState;
    }

    public final void reset(@NotNull TextFieldValue value, @Nullable TextInputSession textInputSession) {
        Intrinsics.checkNotNullParameter(value, "value");
        boolean zAreEqual = Intrinsics.areEqual(value.getComposition(), this.mBuffer.m3631getCompositionMzsxiRA$ui_text_release());
        boolean z10 = true;
        boolean z11 = false;
        if (!Intrinsics.areEqual(this.mBufferState.getText(), value.getText())) {
            this.mBuffer = new EditingBuffer(value.getText(), value.getSelection(), (DefaultConstructorMarker) null);
        } else if (TextRange.m3496equalsimpl0(this.mBufferState.getSelection(), value.getSelection())) {
            z10 = false;
        } else {
            this.mBuffer.setSelection$ui_text_release(TextRange.m3501getMinimpl(value.getSelection()), TextRange.m3500getMaximpl(value.getSelection()));
            z11 = true;
            z10 = false;
        }
        if (value.getComposition() == null) {
            this.mBuffer.commitComposition$ui_text_release();
        } else if (!TextRange.m3497getCollapsedimpl(value.getComposition().getPackedValue())) {
            this.mBuffer.setComposition$ui_text_release(TextRange.m3501getMinimpl(value.getComposition().getPackedValue()), TextRange.m3500getMaximpl(value.getComposition().getPackedValue()));
        }
        if (z10 || (!z11 && !zAreEqual)) {
            this.mBuffer.commitComposition$ui_text_release();
            value = TextFieldValue.m3704copy3r_uNRQ$default(value, (AnnotatedString) null, 0L, (TextRange) null, 3, (Object) null);
        }
        TextFieldValue textFieldValue = this.mBufferState;
        this.mBufferState = value;
        if (textInputSession != null) {
            textInputSession.updateState(textFieldValue, value);
        }
    }

    @NotNull
    public final TextFieldValue toTextFieldValue() {
        return this.mBufferState;
    }
}
