package androidx.compose.ui.text.input;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.text.TextRange;
import com.ironsource.sdk.controller.f;
import com.mbridge.msdk.MBridgeConstans;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import lf.i;
import lf.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u0001DB\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u000e\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201J\b\u00102\u001a\u00020!H\u0016J\u0010\u00103\u001a\u00020!2\u0006\u00104\u001a\u000205H\u0017J\b\u00106\u001a\u00020!H\u0002J\b\u00107\u001a\u00020!H\u0002J\u0010\u00108\u001a\u00020!2\u0006\u00109\u001a\u00020+H\u0002J\u0010\u0010:\u001a\u00020!2\u0006\u0010;\u001a\u00020<H\u0002J\b\u0010=\u001a\u00020!H\u0016JI\u0010>\u001a\u00020!2\u0006\u0010?\u001a\u00020%2\u0006\u0010\u001b\u001a\u00020\u001c2\u0018\u0010\u001d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f\u0012\u0004\u0012\u00020!0\u001e2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020!0\u001eH\u0016ø\u0001\u0000J\b\u0010@\u001a\u00020!H\u0016J\u001a\u0010A\u001a\u00020!2\b\u0010B\u001a\u0004\u0018\u00010%2\u0006\u0010C\u001a\u00020%H\u0016R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u001d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f\u0012\u0004\u0012\u00020!0\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020!0\u001eX\u0082\u000eø\u0001\u0000¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020%@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006E"}, d2 = {"Landroidx/compose/ui/text/input/TextInputServiceAndroid;", "Landroidx/compose/ui/text/input/PlatformTextInputService;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/view/View;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroidx/compose/ui/text/input/PlatformTextInput;", "(Landroid/view/View;Landroidx/compose/ui/text/input/PlatformTextInput;)V", "inputMethodManager", "Landroidx/compose/ui/text/input/InputMethodManager;", "platformTextInput", "inputCommandProcessorExecutor", "Ljava/util/concurrent/Executor;", "(Landroid/view/View;Landroidx/compose/ui/text/input/InputMethodManager;Landroidx/compose/ui/text/input/PlatformTextInput;Ljava/util/concurrent/Executor;)V", "baseInputConnection", "Landroid/view/inputmethod/BaseInputConnection;", "getBaseInputConnection", "()Landroid/view/inputmethod/BaseInputConnection;", "baseInputConnection$delegate", "Lkotlin/Lazy;", "focusedRect", "Landroid/graphics/Rect;", "frameCallback", "Ljava/lang/Runnable;", "ics", "", "Ljava/lang/ref/WeakReference;", "Landroidx/compose/ui/text/input/RecordingInputConnection;", "imeOptions", "Landroidx/compose/ui/text/input/ImeOptions;", "onEditCommand", "Lkotlin/Function1;", "", "Landroidx/compose/ui/text/input/EditCommand;", "", "onImeActionPerformed", "Landroidx/compose/ui/text/input/ImeAction;", "<set-?>", "Landroidx/compose/ui/text/input/TextFieldValue;", "state", "getState$ui_release", "()Landroidx/compose/ui/text/input/TextFieldValue;", "textInputCommandQueue", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/text/input/TextInputServiceAndroid$TextInputCommand;", "getView", "()Landroid/view/View;", "createInputConnection", "Landroid/view/inputmethod/InputConnection;", "outAttrs", "Landroid/view/inputmethod/EditorInfo;", "hideSoftwareKeyboard", "notifyFocusedRect", "rect", "Landroidx/compose/ui/geometry/Rect;", "processInputCommands", "restartInputImmediately", "sendInputCommand", f.b.f45113g, "setKeyboardVisibleImmediately", "visible", "", "showSoftwareKeyboard", "startInput", "value", "stopInput", "updateState", "oldValue", "newValue", "TextInputCommand", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TextInputServiceAndroid implements PlatformTextInputService {

    /* JADX INFO: renamed from: baseInputConnection$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy baseInputConnection;

    @Nullable
    private Rect focusedRect;

    @Nullable
    private Runnable frameCallback;

    @NotNull
    private List<WeakReference<RecordingInputConnection>> ics;

    @NotNull
    private ImeOptions imeOptions;

    @NotNull
    private final Executor inputCommandProcessorExecutor;

    @NotNull
    private final InputMethodManager inputMethodManager;

    @NotNull
    private Function1<? super List<? extends EditCommand>, Unit> onEditCommand;

    @NotNull
    private Function1<? super ImeAction, Unit> onImeActionPerformed;

    @Nullable
    private final PlatformTextInput platformTextInput;

    @NotNull
    private TextFieldValue state;

    @NotNull
    private final MutableVector<TextInputCommand> textInputCommandQueue;

    @NotNull
    private final View view;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/input/TextInputServiceAndroid$TextInputCommand;", "", "(Ljava/lang/String;I)V", "StartInput", "StopInput", "ShowKeyboard", "HideKeyboard", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private enum TextInputCommand {
        StartInput,
        StopInput,
        ShowKeyboard,
        HideKeyboard
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextInputCommand.values().length];
            try {
                iArr[TextInputCommand.StartInput.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextInputCommand.StopInput.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextInputCommand.ShowKeyboard.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TextInputCommand.HideKeyboard.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public TextInputServiceAndroid(@NotNull View view, @NotNull InputMethodManager inputMethodManager, @Nullable PlatformTextInput platformTextInput, @NotNull Executor inputCommandProcessorExecutor) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(inputMethodManager, "inputMethodManager");
        Intrinsics.checkNotNullParameter(inputCommandProcessorExecutor, "inputCommandProcessorExecutor");
        this.view = view;
        this.inputMethodManager = inputMethodManager;
        this.platformTextInput = platformTextInput;
        this.inputCommandProcessorExecutor = inputCommandProcessorExecutor;
        this.onEditCommand = new Function1<List<? extends EditCommand>, Unit>() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$onEditCommand$1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull List<? extends EditCommand> it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends EditCommand> list) {
                invoke2(list);
                return Unit.f93236a;
            }
        };
        this.onImeActionPerformed = new Function1<ImeAction, Unit>() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$onImeActionPerformed$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ImeAction imeAction) {
                m3710invokeKlQnJC8(imeAction.getValue());
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke-KlQnJC8, reason: not valid java name */
            public final void m3710invokeKlQnJC8(int i10) {
            }
        };
        this.state = new TextFieldValue("", TextRange.INSTANCE.m3508getZerod9O1mEE(), (TextRange) null, 4, (DefaultConstructorMarker) null);
        this.imeOptions = ImeOptions.INSTANCE.getDefault();
        this.ics = new ArrayList();
        this.baseInputConnection = i.b(l.f94211d, new Function0<BaseInputConnection>() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$baseInputConnection$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final BaseInputConnection invoke() {
                return new BaseInputConnection(this.this$0.getView(), false);
            }
        });
        this.textInputCommandQueue = new MutableVector<>(new TextInputCommand[16], 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseInputConnection getBaseInputConnection() {
        return (BaseInputConnection) this.baseInputConnection.getValue();
    }

    private final void processInputCommands() {
        if (!this.view.isFocused()) {
            this.textInputCommandQueue.clear();
            return;
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        MutableVector<TextInputCommand> mutableVector = this.textInputCommandQueue;
        int size = mutableVector.getSize();
        if (size > 0) {
            TextInputCommand[] content = mutableVector.getContent();
            int i10 = 0;
            do {
                processInputCommands$applyToState(content[i10], ref$ObjectRef, ref$ObjectRef2);
                i10++;
            } while (i10 < size);
        }
        if (Intrinsics.areEqual(ref$ObjectRef.f93280b, Boolean.TRUE)) {
            restartInputImmediately();
        }
        Boolean bool = (Boolean) ref$ObjectRef2.f93280b;
        if (bool != null) {
            setKeyboardVisibleImmediately(bool.booleanValue());
        }
        if (Intrinsics.areEqual(ref$ObjectRef.f93280b, Boolean.FALSE)) {
            restartInputImmediately();
        }
    }

    private static final void processInputCommands$applyToState(TextInputCommand textInputCommand, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[textInputCommand.ordinal()];
        if (i10 == 1) {
            Boolean bool = Boolean.TRUE;
            ref$ObjectRef.f93280b = bool;
            ref$ObjectRef2.f93280b = bool;
        } else if (i10 == 2) {
            Boolean bool2 = Boolean.FALSE;
            ref$ObjectRef.f93280b = bool2;
            ref$ObjectRef2.f93280b = bool2;
        } else if ((i10 == 3 || i10 == 4) && !Intrinsics.areEqual(ref$ObjectRef.f93280b, Boolean.FALSE)) {
            ref$ObjectRef2.f93280b = Boolean.valueOf(textInputCommand == TextInputCommand.ShowKeyboard);
        }
    }

    private final void restartInputImmediately() {
        this.inputMethodManager.restartInput();
    }

    private final void sendInputCommand(TextInputCommand command) {
        this.textInputCommandQueue.add(command);
        if (this.frameCallback == null) {
            Runnable runnable = new Runnable() { // from class: androidx.compose.ui.text.input.d
                @Override // java.lang.Runnable
                public final void run() {
                    TextInputServiceAndroid.sendInputCommand$lambda$1(this.f4439b);
                }
            };
            this.inputCommandProcessorExecutor.execute(runnable);
            this.frameCallback = runnable;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendInputCommand$lambda$1(TextInputServiceAndroid this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.frameCallback = null;
        this$0.processInputCommands();
    }

    private final void setKeyboardVisibleImmediately(boolean visible) {
        if (visible) {
            this.inputMethodManager.showSoftInput();
        } else {
            this.inputMethodManager.hideSoftInput();
        }
    }

    @NotNull
    public final InputConnection createInputConnection(@NotNull EditorInfo outAttrs) {
        Intrinsics.checkNotNullParameter(outAttrs, "outAttrs");
        TextInputServiceAndroid_androidKt.update(outAttrs, this.imeOptions, this.state);
        TextInputServiceAndroid_androidKt.updateWithEmojiCompat(outAttrs);
        RecordingInputConnection recordingInputConnection = new RecordingInputConnection(this.state, new InputEventCallback2() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid.createInputConnection.1
            @Override // androidx.compose.ui.text.input.InputEventCallback2
            public void onConnectionClosed(@NotNull RecordingInputConnection ic2) {
                Intrinsics.checkNotNullParameter(ic2, "ic");
                int size = TextInputServiceAndroid.this.ics.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (Intrinsics.areEqual(((WeakReference) TextInputServiceAndroid.this.ics.get(i10)).get(), ic2)) {
                        TextInputServiceAndroid.this.ics.remove(i10);
                        return;
                    }
                }
            }

            @Override // androidx.compose.ui.text.input.InputEventCallback2
            public void onEditCommands(@NotNull List<? extends EditCommand> editCommands) {
                Intrinsics.checkNotNullParameter(editCommands, "editCommands");
                TextInputServiceAndroid.this.onEditCommand.invoke(editCommands);
            }

            @Override // androidx.compose.ui.text.input.InputEventCallback2
            /* JADX INFO: renamed from: onImeAction-KlQnJC8 */
            public void mo3663onImeActionKlQnJC8(int imeAction) {
                TextInputServiceAndroid.this.onImeActionPerformed.invoke(ImeAction.m3634boximpl(imeAction));
            }

            @Override // androidx.compose.ui.text.input.InputEventCallback2
            public void onKeyEvent(@NotNull KeyEvent event) {
                Intrinsics.checkNotNullParameter(event, "event");
                TextInputServiceAndroid.this.getBaseInputConnection().sendKeyEvent(event);
            }
        }, this.imeOptions.getAutoCorrect());
        this.ics.add(new WeakReference<>(recordingInputConnection));
        return recordingInputConnection;
    }

    @NotNull
    /* JADX INFO: renamed from: getState$ui_release, reason: from getter */
    public final TextFieldValue getState() {
        return this.state;
    }

    @NotNull
    public final View getView() {
        return this.view;
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void hideSoftwareKeyboard() {
        sendInputCommand(TextInputCommand.HideKeyboard);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void notifyFocusedRect(@NotNull androidx.compose.ui.geometry.Rect rect) {
        Rect rect2;
        Intrinsics.checkNotNullParameter(rect, "rect");
        this.focusedRect = new Rect(zf.a.d(rect.getLeft()), zf.a.d(rect.getTop()), zf.a.d(rect.getRight()), zf.a.d(rect.getBottom()));
        if (!this.ics.isEmpty() || (rect2 = this.focusedRect) == null) {
            return;
        }
        this.view.requestRectangleOnScreen(new Rect(rect2));
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void showSoftwareKeyboard() {
        sendInputCommand(TextInputCommand.ShowKeyboard);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void startInput(@NotNull TextFieldValue value, @NotNull ImeOptions imeOptions, @NotNull Function1<? super List<? extends EditCommand>, Unit> onEditCommand, @NotNull Function1<? super ImeAction, Unit> onImeActionPerformed) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(imeOptions, "imeOptions");
        Intrinsics.checkNotNullParameter(onEditCommand, "onEditCommand");
        Intrinsics.checkNotNullParameter(onImeActionPerformed, "onImeActionPerformed");
        PlatformTextInput platformTextInput = this.platformTextInput;
        if (platformTextInput != null) {
            platformTextInput.requestInputFocus();
        }
        this.state = value;
        this.imeOptions = imeOptions;
        this.onEditCommand = onEditCommand;
        this.onImeActionPerformed = onImeActionPerformed;
        sendInputCommand(TextInputCommand.StartInput);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void stopInput() {
        PlatformTextInput platformTextInput = this.platformTextInput;
        if (platformTextInput != null) {
            platformTextInput.releaseInputFocus();
        }
        this.onEditCommand = new Function1<List<? extends EditCommand>, Unit>() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid.stopInput.1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull List<? extends EditCommand> it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends EditCommand> list) {
                invoke2(list);
                return Unit.f93236a;
            }
        };
        this.onImeActionPerformed = new Function1<ImeAction, Unit>() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid.stopInput.2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ImeAction imeAction) {
                m3711invokeKlQnJC8(imeAction.getValue());
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke-KlQnJC8, reason: not valid java name */
            public final void m3711invokeKlQnJC8(int i10) {
            }
        };
        this.focusedRect = null;
        sendInputCommand(TextInputCommand.StopInput);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void updateState(@Nullable TextFieldValue oldValue, @NotNull TextFieldValue newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        boolean z10 = (TextRange.m3496equalsimpl0(this.state.getSelection(), newValue.getSelection()) && Intrinsics.areEqual(this.state.getComposition(), newValue.getComposition())) ? false : true;
        this.state = newValue;
        int size = this.ics.size();
        for (int i10 = 0; i10 < size; i10++) {
            RecordingInputConnection recordingInputConnection = this.ics.get(i10).get();
            if (recordingInputConnection != null) {
                recordingInputConnection.setMTextFieldValue$ui_release(newValue);
            }
        }
        if (Intrinsics.areEqual(oldValue, newValue)) {
            if (z10) {
                InputMethodManager inputMethodManager = this.inputMethodManager;
                int iM3501getMinimpl = TextRange.m3501getMinimpl(newValue.getSelection());
                int iM3500getMaximpl = TextRange.m3500getMaximpl(newValue.getSelection());
                TextRange composition = this.state.getComposition();
                int iM3501getMinimpl2 = composition != null ? TextRange.m3501getMinimpl(composition.getPackedValue()) : -1;
                TextRange composition2 = this.state.getComposition();
                inputMethodManager.updateSelection(iM3501getMinimpl, iM3500getMaximpl, iM3501getMinimpl2, composition2 != null ? TextRange.m3500getMaximpl(composition2.getPackedValue()) : -1);
                return;
            }
            return;
        }
        if (oldValue != null && (!Intrinsics.areEqual(oldValue.getText(), newValue.getText()) || (TextRange.m3496equalsimpl0(oldValue.getSelection(), newValue.getSelection()) && !Intrinsics.areEqual(oldValue.getComposition(), newValue.getComposition())))) {
            restartInputImmediately();
            return;
        }
        int size2 = this.ics.size();
        for (int i11 = 0; i11 < size2; i11++) {
            RecordingInputConnection recordingInputConnection2 = this.ics.get(i11).get();
            if (recordingInputConnection2 != null) {
                recordingInputConnection2.updateInputState(this.state, this.inputMethodManager);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TextInputServiceAndroid(View view, InputMethodManager inputMethodManager, PlatformTextInput platformTextInput, Executor executor, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        platformTextInput = (i10 & 4) != 0 ? null : platformTextInput;
        if ((i10 & 8) != 0) {
            Choreographer choreographer = Choreographer.getInstance();
            Intrinsics.checkNotNullExpressionValue(choreographer, "getInstance()");
            executor = TextInputServiceAndroid_androidKt.asExecutor(choreographer);
        }
        this(view, inputMethodManager, platformTextInput, executor);
    }

    public /* synthetic */ TextInputServiceAndroid(View view, PlatformTextInput platformTextInput, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, (i10 & 2) != 0 ? null : platformTextInput);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextInputServiceAndroid(@NotNull View view, @Nullable PlatformTextInput platformTextInput) {
        this(view, new InputMethodManagerImpl(view), platformTextInput, null, 8, null);
        Intrinsics.checkNotNullParameter(view, "view");
    }
}
