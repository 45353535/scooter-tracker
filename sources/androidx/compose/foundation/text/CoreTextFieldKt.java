package androidx.compose.foundation.text;

import androidx.activity.s;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.text.selection.SelectionHandleInfo;
import androidx.compose.foundation.text.selection.SelectionHandlesKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import com.ironsource.C4424m2;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u001aá\u0001\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00112\b\b\u0002\u0010\u001b\u001a\u00020\u00112$\b\u0002\u0010\u001e\u001a\u001e\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u001c¢\u0006\u0002\b\u001d\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u001dH\u0001¢\u0006\u0004\b\u001f\u0010 \u001a2\u0010$\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!2\u0011\u0010#\u001a\r\u0012\u0004\u0012\u00020\u00030\u001c¢\u0006\u0002\b\u001dH\u0003¢\u0006\u0004\b$\u0010%\u001a#\u0010(\u001a\u00020\u0005*\u00020\u00052\u0006\u0010'\u001a\u00020&2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b(\u0010)\u001a'\u0010-\u001a\u00020\u00032\u0006\u0010'\u001a\u00020&2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\u0011H\u0002¢\u0006\u0004\b-\u0010.\u001a7\u00103\u001a\u00020\u00032\u0006\u00100\u001a\u00020/2\u0006\u0010'\u001a\u00020&2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b3\u00104\u001a\u0017\u00105\u001a\u00020\u00032\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b5\u00106\u001a7\u0010;\u001a\u00020\u0003*\u0002072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u00020\u000b2\u0006\u00102\u001a\u000201H\u0080@ø\u0001\u0000¢\u0006\u0004\b;\u0010<\u001a\u001f\u0010>\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020!2\u0006\u0010=\u001a\u00020\u0011H\u0003¢\u0006\u0004\b>\u0010?\u001a\u0017\u0010@\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020!H\u0001¢\u0006\u0004\b@\u0010A\u001a'\u0010B\u001a\u00020\u00032\u0006\u0010'\u001a\u00020&2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\bB\u0010C\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006D"}, d2 = {"Landroidx/compose/ui/text/input/TextFieldValue;", "value", "Lkotlin/Function1;", "", "onValueChange", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "Landroidx/compose/ui/text/TextLayoutResult;", "onTextLayout", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/ui/graphics/Brush;", "cursorBrush", "", "softWrap", "", "maxLines", "minLines", "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "Landroidx/compose/foundation/text/KeyboardActions;", "keyboardActions", "enabled", "readOnly", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "decorationBox", "CoreTextField", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;ZIILandroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/foundation/text/KeyboardActions;ZZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "manager", "content", "CoreTextFieldRootBox", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/text/TextFieldState;", "state", "previewKeyEventToDeselectOnBack", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/TextFieldState;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/focus/FocusRequester;", "focusRequester", "allowKeyboard", "tapToFocus", "(Landroidx/compose/foundation/text/TextFieldState;Landroidx/compose/ui/focus/FocusRequester;Z)V", "Landroidx/compose/ui/text/input/TextInputService;", "textInputService", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "notifyTextInputServiceOnFocusChange", "(Landroidx/compose/ui/text/input/TextInputService;Landroidx/compose/foundation/text/TextFieldState;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/ui/text/input/OffsetMapping;)V", "onBlur", "(Landroidx/compose/foundation/text/TextFieldState;)V", "Landroidx/compose/foundation/relocation/BringIntoViewRequester;", "Landroidx/compose/foundation/text/TextDelegate;", "textDelegate", "textLayoutResult", "bringSelectionEndIntoView", "(Landroidx/compose/foundation/relocation/BringIntoViewRequester;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/foundation/text/TextDelegate;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/text/input/OffsetMapping;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", C4424m2.f43623v, "SelectionToolbarAndHandles", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;ZLandroidx/compose/runtime/Composer;I)V", "TextFieldCursorHandle", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/runtime/Composer;I)V", "notifyFocusedRect", "(Landroidx/compose/foundation/text/TextFieldState;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/OffsetMapping;)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CoreTextFieldKt {

    /* JADX INFO: renamed from: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$1", f = "CoreTextField.kt", l = {IronSourceError.ERROR_IS_ALL_SMASHES_SESSION_CAPPED}, m = "invokeSuspend")
    static final class C14861 extends k implements Function2<PointerInputScope, Continuation, Object> {
        final /* synthetic */ TextDragObserver $observer;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14861(TextDragObserver textDragObserver, Continuation continuation) {
            super(2, continuation);
            this.$observer = textDragObserver;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            C14861 c14861 = new C14861(this.$observer, continuation);
            c14861.L$0 = obj;
            return c14861;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation continuation) {
            return ((C14861) create(pointerInputScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = b.g();
            int i10 = this.label;
            if (i10 == 0) {
                d.b(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                TextDragObserver textDragObserver = this.$observer;
                this.label = 1;
                if (LongPressTextDragObserverKt.detectDownAndDragGesturesWithObserver(pointerInputScope, textDragObserver, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d.b(obj);
            }
            return Unit.f93236a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x07dd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:328:0x07de  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0140  */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r4v18, types: [int] */
    /* JADX WARN: Type inference failed for: r54v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void CoreTextField(@org.jetbrains.annotations.NotNull final androidx.compose.ui.text.input.TextFieldValue r40, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> r41, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r42, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.TextStyle r43, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.input.VisualTransformation r44, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> r45, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r46, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Brush r47, boolean r48, int r49, int r50, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.input.ImeOptions r51, @org.jetbrains.annotations.Nullable androidx.compose.foundation.text.KeyboardActions r52, boolean r53, boolean r54, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r55, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r56, final int r57, final int r58, final int r59) {
        /*
            Method dump skipped, instruction units count: 2041
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField(androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.input.VisualTransformation, kotlin.jvm.functions.Function1, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, boolean, int, int, androidx.compose.ui.text.input.ImeOptions, androidx.compose.foundation.text.KeyboardActions, boolean, boolean, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void CoreTextFieldRootBox(final Modifier modifier, final TextFieldSelectionManager textFieldSelectionManager, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i10) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-20551815);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-20551815, i10, -1, "androidx.compose.foundation.text.CoreTextFieldRootBox (CoreTextField.kt:663)");
        }
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composerStartRestartGroup, 48);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifier);
        if (!s.a(composerStartRestartGroup.getApplier())) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        composerStartRestartGroup.disableReusing();
        Composer composerM1248constructorimpl = Updater.m1248constructorimpl(composerStartRestartGroup);
        Updater.m1255setimpl(composerM1248constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m1255setimpl(composerM1248constructorimpl, density, companion.getSetDensity());
        Updater.m1255setimpl(composerM1248constructorimpl, layoutDirection, companion.getSetLayoutDirection());
        Updater.m1255setimpl(composerM1248constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
        composerStartRestartGroup.enableReusing();
        function3MaterializerOf.invoke(SkippableUpdater.m1239boximpl(SkippableUpdater.m1240constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        ContextMenu_androidKt.ContextMenuArea(textFieldSelectionManager, function2, composerStartRestartGroup, ((i10 >> 3) & 112) | 8);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextFieldRootBox.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.f93236a;
            }

            public final void invoke(@Nullable Composer composer2, int i11) {
                CoreTextFieldKt.CoreTextFieldRootBox(modifier, textFieldSelectionManager, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void SelectionToolbarAndHandles(final TextFieldSelectionManager textFieldSelectionManager, final boolean z10, Composer composer, final int i10) {
        TextLayoutResultProxy layoutResult;
        TextLayoutResult value;
        Composer composerStartRestartGroup = composer.startRestartGroup(626339208);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(626339208, i10, -1, "androidx.compose.foundation.text.SelectionToolbarAndHandles (CoreTextField.kt:991)");
        }
        if (z10) {
            TextFieldState state = textFieldSelectionManager.getState();
            TextLayoutResult textLayoutResult = null;
            if (state != null && (layoutResult = state.getLayoutResult()) != null && (value = layoutResult.getValue()) != null) {
                TextFieldState state2 = textFieldSelectionManager.getState();
                if (!(state2 != null ? state2.getIsLayoutResultStale() : true)) {
                    textLayoutResult = value;
                }
            }
            if (textLayoutResult != null) {
                if (!TextRange.m3497getCollapsedimpl(textFieldSelectionManager.getValue$foundation_release().getSelection())) {
                    int iOriginalToTransformed = textFieldSelectionManager.getOffsetMapping().originalToTransformed(TextRange.m3503getStartimpl(textFieldSelectionManager.getValue$foundation_release().getSelection()));
                    int iOriginalToTransformed2 = textFieldSelectionManager.getOffsetMapping().originalToTransformed(TextRange.m3498getEndimpl(textFieldSelectionManager.getValue$foundation_release().getSelection()));
                    ResolvedTextDirection bidiRunDirection = textLayoutResult.getBidiRunDirection(iOriginalToTransformed);
                    ResolvedTextDirection bidiRunDirection2 = textLayoutResult.getBidiRunDirection(Math.max(iOriginalToTransformed2 - 1, 0));
                    composerStartRestartGroup.startReplaceableGroup(-498391544);
                    TextFieldState state3 = textFieldSelectionManager.getState();
                    if (state3 != null && state3.getShowSelectionHandleStart()) {
                        TextFieldSelectionManagerKt.TextFieldSelectionHandle(true, bidiRunDirection, textFieldSelectionManager, composerStartRestartGroup, 518);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    TextFieldState state4 = textFieldSelectionManager.getState();
                    if (state4 != null && state4.getShowSelectionHandleEnd()) {
                        TextFieldSelectionManagerKt.TextFieldSelectionHandle(false, bidiRunDirection2, textFieldSelectionManager, composerStartRestartGroup, 518);
                    }
                }
                TextFieldState state5 = textFieldSelectionManager.getState();
                if (state5 != null) {
                    if (textFieldSelectionManager.isTextChanged$foundation_release()) {
                        state5.setShowFloatingToolbar(false);
                    }
                    if (state5.getHasFocus()) {
                        if (state5.getShowFloatingToolbar()) {
                            textFieldSelectionManager.showSelectionToolbar$foundation_release();
                        } else {
                            textFieldSelectionManager.hideSelectionToolbar$foundation_release();
                        }
                    }
                }
            }
        } else {
            textFieldSelectionManager.hideSelectionToolbar$foundation_release();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.SelectionToolbarAndHandles.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.f93236a;
            }

            public final void invoke(@Nullable Composer composer2, int i11) {
                CoreTextFieldKt.SelectionToolbarAndHandles(textFieldSelectionManager, z10, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
            }
        });
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void TextFieldCursorHandle(@NotNull final TextFieldSelectionManager manager, @Nullable Composer composer, final int i10) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1436003720);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1436003720, i10, -1, "androidx.compose.foundation.text.TextFieldCursorHandle (CoreTextField.kt:1034)");
        }
        TextFieldState state = manager.getState();
        if (state != null && state.getShowCursorHandle()) {
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(manager);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = manager.cursorDragObserver$foundation_release();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            TextDragObserver textDragObserver = (TextDragObserver) objRememberedValue;
            final long jM877getCursorPositiontuRUvjQ$foundation_release = manager.m877getCursorPositiontuRUvjQ$foundation_release((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity()));
            Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, textDragObserver, new C14861(textDragObserver, null));
            Offset offsetM1360boximpl = Offset.m1360boximpl(jM877getCursorPositiontuRUvjQ$foundation_release);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged2 = composerStartRestartGroup.changed(offsetM1360boximpl);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.f93236a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                        semantics.set(SelectionHandlesKt.getSelectionHandleInfoKey(), new SelectionHandleInfo(Handle.Cursor, jM877getCursorPositiontuRUvjQ$foundation_release, null));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            AndroidCursorHandle_androidKt.m693CursorHandleULxng0E(jM877getCursorPositiontuRUvjQ$foundation_release, SemanticsModifierKt.semantics$default(modifierPointerInput, false, (Function1) objRememberedValue2, 1, null), null, composerStartRestartGroup, 384);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.TextFieldCursorHandle.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.f93236a;
            }

            public final void invoke(@Nullable Composer composer2, int i11) {
                CoreTextFieldKt.TextFieldCursorHandle(manager, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
            }
        });
    }

    @Nullable
    public static final Object bringSelectionEndIntoView(@NotNull BringIntoViewRequester bringIntoViewRequester, @NotNull TextFieldValue textFieldValue, @NotNull TextDelegate textDelegate, @NotNull TextLayoutResult textLayoutResult, @NotNull OffsetMapping offsetMapping, @NotNull Continuation continuation) {
        int iOriginalToTransformed = offsetMapping.originalToTransformed(TextRange.m3500getMaximpl(textFieldValue.getSelection()));
        Object objBringIntoView = bringIntoViewRequester.bringIntoView(iOriginalToTransformed < textLayoutResult.getLayoutInput().getText().length() ? textLayoutResult.getBoundingBox(iOriginalToTransformed) : iOriginalToTransformed != 0 ? textLayoutResult.getBoundingBox(iOriginalToTransformed - 1) : new Rect(0.0f, 0.0f, 1.0f, IntSize.m4110getHeightimpl(TextFieldDelegateKt.computeSizeForDefaultText$default(textDelegate.getStyle(), textDelegate.getDensity(), textDelegate.getFontFamilyResolver(), null, 0, 24, null))), continuation);
        return objBringIntoView == b.g() ? objBringIntoView : Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyFocusedRect(TextFieldState textFieldState, TextFieldValue textFieldValue, OffsetMapping offsetMapping) {
        Snapshot snapshotCreateNonObservableSnapshot = Snapshot.INSTANCE.createNonObservableSnapshot();
        try {
            Snapshot snapshotMakeCurrent = snapshotCreateNonObservableSnapshot.makeCurrent();
            try {
                TextLayoutResultProxy layoutResult = textFieldState.getLayoutResult();
                if (layoutResult == null) {
                    snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    snapshotCreateNonObservableSnapshot.dispose();
                    return;
                }
                TextInputSession inputSession = textFieldState.getInputSession();
                if (inputSession == null) {
                    snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    snapshotCreateNonObservableSnapshot.dispose();
                    return;
                }
                LayoutCoordinates layoutCoordinates = textFieldState.getLayoutCoordinates();
                if (layoutCoordinates == null) {
                    snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    snapshotCreateNonObservableSnapshot.dispose();
                } else {
                    TextFieldDelegate.INSTANCE.notifyFocusedRect$foundation_release(textFieldValue, textFieldState.getTextDelegate(), layoutResult.getValue(), layoutCoordinates, inputSession, textFieldState.getHasFocus(), offsetMapping);
                    Unit unit = Unit.f93236a;
                    snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    snapshotCreateNonObservableSnapshot.dispose();
                }
            } catch (Throwable th2) {
                snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                throw th2;
            }
        } catch (Throwable th3) {
            snapshotCreateNonObservableSnapshot.dispose();
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyTextInputServiceOnFocusChange(TextInputService textInputService, TextFieldState textFieldState, TextFieldValue textFieldValue, ImeOptions imeOptions, OffsetMapping offsetMapping) {
        if (!textFieldState.getHasFocus()) {
            onBlur(textFieldState);
        } else {
            textFieldState.setInputSession(TextFieldDelegate.INSTANCE.onFocus$foundation_release(textInputService, textFieldValue, textFieldState.getProcessor(), imeOptions, textFieldState.getOnValueChange(), textFieldState.getOnImeActionPerformed()));
            notifyFocusedRect(textFieldState, textFieldValue, offsetMapping);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBlur(TextFieldState textFieldState) {
        TextInputSession inputSession = textFieldState.getInputSession();
        if (inputSession != null) {
            TextFieldDelegate.INSTANCE.onBlur$foundation_release(inputSession, textFieldState.getProcessor(), textFieldState.getOnValueChange());
        }
        textFieldState.setInputSession(null);
    }

    private static final Modifier previewKeyEventToDeselectOnBack(Modifier modifier, final TextFieldState textFieldState, final TextFieldSelectionManager textFieldSelectionManager) {
        return KeyInputModifierKt.onPreviewKeyEvent(modifier, new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.previewKeyEventToDeselectOnBack.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                return m711invokeZmokQxo(keyEvent.m2781unboximpl());
            }

            @NotNull
            /* JADX INFO: renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final Boolean m711invokeZmokQxo(@NotNull android.view.KeyEvent keyEvent) {
                boolean z10;
                Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
                if (textFieldState.getHandleState() == HandleState.Selection && KeyEventHelpers_androidKt.m717cancelsTextSelectionZmokQxo(keyEvent)) {
                    z10 = true;
                    TextFieldSelectionManager.m872deselect_kEHs6E$foundation_release$default(textFieldSelectionManager, null, 1, null);
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tapToFocus(TextFieldState textFieldState, FocusRequester focusRequester, boolean z10) {
        TextInputSession inputSession;
        if (!textFieldState.getHasFocus()) {
            focusRequester.requestFocus();
        } else {
            if (!z10 || (inputSession = textFieldState.getInputSession()) == null) {
                return;
            }
            inputSession.showSoftwareKeyboard();
        }
    }
}
