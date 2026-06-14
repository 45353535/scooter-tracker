package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextPreparedSelectionState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aZ\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0000¨\u0006\u0012"}, d2 = {"textFieldKeyInput", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/text/TextFieldState;", "manager", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "", "editable", "", "singleLine", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "undoManager", "Landroidx/compose/foundation/text/UndoManager;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TextFieldKeyInputKt {
    @NotNull
    public static final Modifier textFieldKeyInput(@NotNull Modifier modifier, @NotNull final TextFieldState state, @NotNull final TextFieldSelectionManager manager, @NotNull final TextFieldValue value, @NotNull final Function1<? super TextFieldValue, Unit> onValueChange, final boolean z10, final boolean z11, @NotNull final OffsetMapping offsetMapping, @NotNull final UndoManager undoManager) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Intrinsics.checkNotNullParameter(offsetMapping, "offsetMapping");
        Intrinsics.checkNotNullParameter(undoManager, "undoManager");
        return ComposedModifierKt.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.text.TextFieldKeyInputKt.textFieldKeyInput.2

            /* JADX INFO: renamed from: androidx.compose.foundation.text.TextFieldKeyInputKt$textFieldKeyInput$2$1, reason: invalid class name */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            /* synthetic */ class AnonymousClass1 extends y implements Function1<KeyEvent, Boolean> {
                AnonymousClass1(Object obj) {
                    super(1, obj, TextFieldKeyInput.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                    return m776invokeZmokQxo(keyEvent.m2781unboximpl());
                }

                @NotNull
                /* JADX INFO: renamed from: invoke-ZmokQxo, reason: not valid java name */
                public final Boolean m776invokeZmokQxo(@NotNull android.view.KeyEvent p02) {
                    Intrinsics.checkNotNullParameter(p02, "p0");
                    return Boolean.valueOf(((TextFieldKeyInput) this.receiver).m775processZmokQxo(p02));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i10) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(58482146);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(58482146, i10, -1, "androidx.compose.foundation.text.textFieldKeyInput.<anonymous> (TextFieldKeyInput.kt:242)");
                }
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new TextPreparedSelectionState();
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                TextPreparedSelectionState textPreparedSelectionState = (TextPreparedSelectionState) objRememberedValue;
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue2 = composer.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new DeadKeyCombiner();
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceableGroup();
                Modifier modifierOnKeyEvent = KeyInputModifierKt.onKeyEvent(Modifier.INSTANCE, new AnonymousClass1(new TextFieldKeyInput(state, manager, value, z10, z11, textPreparedSelectionState, offsetMapping, undoManager, (DeadKeyCombiner) objRememberedValue2, null, onValueChange, 512, null)));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierOnKeyEvent;
            }
        }, 1, null);
    }

    public static /* synthetic */ Modifier textFieldKeyInput$default(Modifier modifier, TextFieldState textFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, Function1 function1, boolean z10, boolean z11, OffsetMapping offsetMapping, UndoManager undoManager, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            function1 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.TextFieldKeyInputKt.textFieldKeyInput.1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull TextFieldValue it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue2) {
                    invoke2(textFieldValue2);
                    return Unit.f93236a;
                }
            };
        }
        return textFieldKeyInput(modifier, textFieldState, textFieldSelectionManager, textFieldValue, function1, z10, z11, offsetMapping, undoManager);
    }
}
