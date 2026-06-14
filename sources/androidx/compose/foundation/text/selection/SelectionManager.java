package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.platform.d2;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import com.ironsource.C4240b4;
import com.my.target.common.menu.MenuActionType;
import com.unity3d.mediation.LevelPlayAdError;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001b\u0010f\u001a\u00020L2\u0006\u0010g\u001a\u00020\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bh\u0010\"J'\u0010i\u001a\u0004\u0018\u00010\u00162\u0006\u0010j\u001a\u00020\u000f2\u0006\u0010k\u001a\u00020\u0016H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bl\u0010mJ\r\u0010n\u001a\u00020LH\u0000¢\u0006\u0002\boJ\u0017\u0010p\u001a\u0004\u0018\u00010q2\u0006\u0010r\u001a\u00020sH\u0000¢\u0006\u0002\btJ\b\u0010u\u001a\u00020vH\u0002J\u000f\u0010w\u001a\u0004\u0018\u00010xH\u0000¢\u0006\u0002\byJ\u000e\u0010z\u001a\u00020{2\u0006\u0010|\u001a\u00020?J\r\u0010}\u001a\u00020LH\u0000¢\u0006\u0002\b~J\u0006\u0010\u007f\u001a\u00020LJ\u000f\u0010\u0080\u0001\u001a\u00020\u000fH\u0000¢\u0006\u0003\b\u0081\u0001JA\u0010\u0082\u0001\u001a\u001f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0012\u0012\u0010\u0012\u0005\u0012\u00030\u0085\u0001\u0012\u0004\u0012\u00020\u00070\u0084\u00010\u0083\u00012\b\u0010\u0086\u0001\u001a\u00030\u0085\u00012\t\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0003\b\u0088\u0001J\u000f\u0010\u0089\u0001\u001a\u00020LH\u0000¢\u0006\u0003\b\u008a\u0001J2\u0010\u008b\u0001\u001a\u00020L2\u0006\u0010g\u001a\u00020\u00162\u0006\u0010|\u001a\u00020?2\b\u0010\u008c\u0001\u001a\u00030\u008d\u0001H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\t\u0010\u0090\u0001\u001a\u00020LH\u0002JE\u0010\u0091\u0001\u001a\u00020?2\u0006\u0010Y\u001a\u00020\u00162\u0006\u0010/\u001a\u00020\u00162\t\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u00162\u0006\u0010|\u001a\u00020?2\b\u0010\u008c\u0001\u001a\u00030\u008d\u0001H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J<\u0010\u0091\u0001\u001a\u00020?2\t\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u00162\b\u0010Q\u001a\u0004\u0018\u00010\u00162\u0006\u0010|\u001a\u00020?2\b\u0010\u008c\u0001\u001a\u00030\u008d\u0001H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0003\b\u0096\u0001J\t\u0010\u0097\u0001\u001a\u00020LH\u0002J0\u0010\u0098\u0001\u001a\u00020L*\u00030\u0099\u00012\u0013\u0010\u009a\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020L0KH\u0082@ø\u0001\u0000ø\u0001\u0000¢\u0006\u0003\u0010\u009b\u0001J\u001d\u0010\u009c\u0001\u001a\u00020G*\u00020G2\u000e\u0010\u009d\u0001\u001a\t\u0012\u0004\u0012\u00020L0\u009e\u0001H\u0002R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR(\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R8\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u00168F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR4\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00168@@BX\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b#\u0010\u001d\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R4\u0010$\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00168@@BX\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b'\u0010\u001d\u001a\u0004\b%\u0010 \"\u0004\b&\u0010\"R/\u0010)\u001a\u0004\u0018\u00010(2\b\u0010\u0015\u001a\u0004\u0018\u00010(8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b.\u0010\u001d\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R8\u0010/\u001a\u0004\u0018\u00010\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u00168F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b2\u0010\u001d\u001a\u0004\b0\u0010\u0019\"\u0004\b1\u0010\u001bR\u001a\u00103\u001a\u000204X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001c\u00109\u001a\u0004\u0018\u00010:X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R+\u0010@\u001a\u00020?2\u0006\u0010\u0015\u001a\u00020?8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bE\u0010\u001d\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0011\u0010F\u001a\u00020G8F¢\u0006\u0006\u001a\u0004\bH\u0010IR(\u0010J\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020L0KX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u0019\u0010Q\u001a\u0004\u0018\u00010\u0016X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0002\n\u0000R(\u0010R\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010W\u001a\u00020?8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bX\u0010BR8\u0010Y\u001a\u0004\u0018\u00010\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u00168F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\\\u0010\u001d\u001a\u0004\bZ\u0010\u0019\"\u0004\b[\u0010\u001bR\u001c\u0010]\u001a\u0004\u0018\u00010^X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u001a\u0010c\u001a\u00020?X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010B\"\u0004\be\u0010D\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u009f\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionManager;", "", "selectionRegistrar", "Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;", "(Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;)V", "_selection", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/foundation/text/selection/Selection;", "clipboardManager", "Landroidx/compose/ui/platform/ClipboardManager;", "getClipboardManager", "()Landroidx/compose/ui/platform/ClipboardManager;", "setClipboardManager", "(Landroidx/compose/ui/platform/ClipboardManager;)V", "value", "Landroidx/compose/ui/layout/LayoutCoordinates;", "containerLayoutCoordinates", "getContainerLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "setContainerLayoutCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "<set-?>", "Landroidx/compose/ui/geometry/Offset;", "currentDragPosition", "getCurrentDragPosition-_m7T9-E", "()Landroidx/compose/ui/geometry/Offset;", "setCurrentDragPosition-_kEHs6E", "(Landroidx/compose/ui/geometry/Offset;)V", "currentDragPosition$delegate", "Landroidx/compose/runtime/MutableState;", "dragBeginPosition", "getDragBeginPosition-F1C5BW0$foundation_release", "()J", "setDragBeginPosition-k-4lQ0M", "(J)V", "dragBeginPosition$delegate", "dragTotalDistance", "getDragTotalDistance-F1C5BW0$foundation_release", "setDragTotalDistance-k-4lQ0M", "dragTotalDistance$delegate", "Landroidx/compose/foundation/text/Handle;", "draggingHandle", "getDraggingHandle", "()Landroidx/compose/foundation/text/Handle;", "setDraggingHandle", "(Landroidx/compose/foundation/text/Handle;)V", "draggingHandle$delegate", "endHandlePosition", "getEndHandlePosition-_m7T9-E", "setEndHandlePosition-_kEHs6E", "endHandlePosition$delegate", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "getFocusRequester", "()Landroidx/compose/ui/focus/FocusRequester;", "setFocusRequester", "(Landroidx/compose/ui/focus/FocusRequester;)V", "hapticFeedBack", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "getHapticFeedBack", "()Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "setHapticFeedBack", "(Landroidx/compose/ui/hapticfeedback/HapticFeedback;)V", "", "hasFocus", "getHasFocus", "()Z", "setHasFocus", "(Z)V", "hasFocus$delegate", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "onSelectionChange", "Lkotlin/Function1;", "", "getOnSelectionChange", "()Lkotlin/jvm/functions/Function1;", "setOnSelectionChange", "(Lkotlin/jvm/functions/Function1;)V", "previousPosition", "selection", "getSelection", "()Landroidx/compose/foundation/text/selection/Selection;", "setSelection", "(Landroidx/compose/foundation/text/selection/Selection;)V", "shouldShowMagnifier", "getShouldShowMagnifier", "startHandlePosition", "getStartHandlePosition-_m7T9-E", "setStartHandlePosition-_kEHs6E", "startHandlePosition$delegate", "textToolbar", "Landroidx/compose/ui/platform/TextToolbar;", "getTextToolbar", "()Landroidx/compose/ui/platform/TextToolbar;", "setTextToolbar", "(Landroidx/compose/ui/platform/TextToolbar;)V", "touchMode", "getTouchMode", "setTouchMode", "contextMenuOpenAdjustment", C4240b4.i.L, "contextMenuOpenAdjustment-k-4lQ0M", "convertToContainerCoordinates", "layoutCoordinates", "offset", "convertToContainerCoordinates-Q7Q5hAU", "(Landroidx/compose/ui/layout/LayoutCoordinates;J)Landroidx/compose/ui/geometry/Offset;", MenuActionType.COPY, "copy$foundation_release", "getAnchorSelectable", "Landroidx/compose/foundation/text/selection/Selectable;", "anchor", "Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "getAnchorSelectable$foundation_release", "getContentRect", "Landroidx/compose/ui/geometry/Rect;", "getSelectedText", "Landroidx/compose/ui/text/AnnotatedString;", "getSelectedText$foundation_release", "handleDragObserver", "Landroidx/compose/foundation/text/TextDragObserver;", "isStartHandle", "hideSelectionToolbar", "hideSelectionToolbar$foundation_release", "onRelease", "requireContainerCoordinates", "requireContainerCoordinates$foundation_release", "selectAll", "Lkotlin/Pair;", "", "", "selectableId", "previousSelection", "selectAll$foundation_release", "showSelectionToolbar", "showSelectionToolbar$foundation_release", "startSelection", "adjustment", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "startSelection-9KIMszo", "(JZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)V", "updateHandleOffsets", "updateSelection", "previousHandlePosition", "updateSelection-3R_-tFg$foundation_release", "(JJLandroidx/compose/ui/geometry/Offset;ZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)Z", "newPosition", "updateSelection-RHHTvR4$foundation_release", "updateSelectionToolbarPosition", "detectNonConsumingTap", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "onTap", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onClearSelectionRequested", "block", "Lkotlin/Function0;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SelectionManager {

    @NotNull
    private final MutableState<Selection> _selection;

    @Nullable
    private ClipboardManager clipboardManager;

    @Nullable
    private LayoutCoordinates containerLayoutCoordinates;

    /* JADX INFO: renamed from: currentDragPosition$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState currentDragPosition;

    /* JADX INFO: renamed from: dragBeginPosition$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState dragBeginPosition;

    /* JADX INFO: renamed from: dragTotalDistance$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState dragTotalDistance;

    /* JADX INFO: renamed from: draggingHandle$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState draggingHandle;

    /* JADX INFO: renamed from: endHandlePosition$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState endHandlePosition;

    @NotNull
    private FocusRequester focusRequester;

    @Nullable
    private HapticFeedback hapticFeedBack;

    /* JADX INFO: renamed from: hasFocus$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState hasFocus;

    @NotNull
    private Function1<? super Selection, Unit> onSelectionChange;

    @Nullable
    private Offset previousPosition;

    @NotNull
    private final SelectionRegistrarImpl selectionRegistrar;

    /* JADX INFO: renamed from: startHandlePosition$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState startHandlePosition;

    @Nullable
    private TextToolbar textToolbar;
    private boolean touchMode;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionManager$detectNonConsumingTap$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.compose.foundation.text.selection.SelectionManager$detectNonConsumingTap$2", f = "SelectionManager.kt", l = {LevelPlayAdError.ERROR_CODE_LOAD_FAILED_ALREADY_CALLED}, m = "invokeSuspend")
    static final class C15002 extends j implements Function2<AwaitPointerEventScope, Continuation, Object> {
        final /* synthetic */ Function1<Offset, Unit> $onTap;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C15002(Function1<? super Offset, Unit> function1, Continuation continuation) {
            super(2, continuation);
            this.$onTap = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            C15002 c15002 = new C15002(this.$onTap, continuation);
            c15002.L$0 = obj;
            return c15002;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable Continuation continuation) {
            return ((C15002) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 == 0) {
                d.b(obj);
                AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                this.label = 1;
                obj = TapGestureDetectorKt.waitForUpOrCancellation$default(awaitPointerEventScope, null, this, 1, null);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d.b(obj);
            }
            PointerInputChange pointerInputChange = (PointerInputChange) obj;
            if (pointerInputChange != null) {
                this.$onTap.invoke(Offset.m1360boximpl(pointerInputChange.getPosition()));
            }
            return Unit.f93236a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1", f = "SelectionManager.kt", l = {634}, m = "invokeSuspend")
    static final class C15021 extends k implements Function2<PointerInputScope, Continuation, Object> {
        final /* synthetic */ Function0<Unit> $block;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C15021(Function0<Unit> function0, Continuation continuation) {
            super(2, continuation);
            this.$block = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            C15021 c15021 = SelectionManager.this.new C15021(this.$block, continuation);
            c15021.L$0 = obj;
            return c15021;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation continuation) {
            return ((C15021) create(pointerInputScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 == 0) {
                d.b(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                SelectionManager selectionManager = SelectionManager.this;
                final Function0<Unit> function0 = this.$block;
                Function1<Offset, Unit> function1 = new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.onClearSelectionRequested.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                        m857invokek4lQ0M(offset.getPackedValue());
                        return Unit.f93236a;
                    }

                    /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
                    public final void m857invokek4lQ0M(long j10) {
                        function0.invoke();
                    }
                };
                this.label = 1;
                if (selectionManager.detectNonConsumingTap(pointerInputScope, function1, this) == objG) {
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

    public SelectionManager(@NotNull SelectionRegistrarImpl selectionRegistrar) {
        Intrinsics.checkNotNullParameter(selectionRegistrar, "selectionRegistrar");
        this.selectionRegistrar = selectionRegistrar;
        this._selection = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.touchMode = true;
        this.onSelectionChange = new Function1<Selection, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$onSelectionChange$1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Selection selection) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Selection selection) {
                invoke2(selection);
                return Unit.f93236a;
            }
        };
        this.focusRequester = new FocusRequester();
        this.hasFocus = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        Offset.Companion companion = Offset.INSTANCE;
        this.dragBeginPosition = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m1360boximpl(companion.m1387getZeroF1C5BW0()), null, 2, null);
        this.dragTotalDistance = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m1360boximpl(companion.m1387getZeroF1C5BW0()), null, 2, null);
        this.startHandlePosition = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.endHandlePosition = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.draggingHandle = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.currentDragPosition = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        selectionRegistrar.setOnPositionChangeCallback$foundation_release(new Function1<Long, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l10) {
                invoke(l10.longValue());
                return Unit.f93236a;
            }

            public final void invoke(long j10) {
                Selection selection;
                Selection.AnchorInfo end;
                Selection.AnchorInfo start;
                Selection selection2 = SelectionManager.this.getSelection();
                if ((selection2 == null || (start = selection2.getStart()) == null || j10 != start.getSelectableId()) && ((selection = SelectionManager.this.getSelection()) == null || (end = selection.getEnd()) == null || j10 != end.getSelectableId())) {
                    return;
                }
                SelectionManager.this.updateHandleOffsets();
                SelectionManager.this.updateSelectionToolbarPosition();
            }
        });
        selectionRegistrar.setOnSelectionUpdateStartCallback$foundation_release(new Function3<LayoutCoordinates, Offset, SelectionAdjustment, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.2
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates, Offset offset, SelectionAdjustment selectionAdjustment) {
                m854invoked4ec7I(layoutCoordinates, offset.getPackedValue(), selectionAdjustment);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke-d-4ec7I, reason: not valid java name */
            public final void m854invoked4ec7I(@NotNull LayoutCoordinates layoutCoordinates, long j10, @NotNull SelectionAdjustment selectionMode) {
                Intrinsics.checkNotNullParameter(layoutCoordinates, "layoutCoordinates");
                Intrinsics.checkNotNullParameter(selectionMode, "selectionMode");
                Offset offsetM839convertToContainerCoordinatesQ7Q5hAU = SelectionManager.this.m839convertToContainerCoordinatesQ7Q5hAU(layoutCoordinates, j10);
                if (offsetM839convertToContainerCoordinatesQ7Q5hAU != null) {
                    SelectionManager.this.m845startSelection9KIMszo(offsetM839convertToContainerCoordinatesQ7Q5hAU.getPackedValue(), false, selectionMode);
                    SelectionManager.this.getFocusRequester().requestFocus();
                    SelectionManager.this.hideSelectionToolbar$foundation_release();
                }
            }
        });
        selectionRegistrar.setOnSelectionUpdateSelectAll$foundation_release(new Function1<Long, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l10) {
                invoke(l10.longValue());
                return Unit.f93236a;
            }

            public final void invoke(long j10) {
                SelectionManager selectionManager = SelectionManager.this;
                Pair<Selection, Map<Long, Selection>> pairSelectAll$foundation_release = selectionManager.selectAll$foundation_release(j10, selectionManager.getSelection());
                Selection selectionComponent1 = pairSelectAll$foundation_release.component1();
                Map<Long, Selection> mapComponent2 = pairSelectAll$foundation_release.component2();
                if (!Intrinsics.areEqual(selectionComponent1, SelectionManager.this.getSelection())) {
                    SelectionManager.this.selectionRegistrar.setSubselections(mapComponent2);
                    SelectionManager.this.getOnSelectionChange().invoke(selectionComponent1);
                }
                SelectionManager.this.getFocusRequester().requestFocus();
                SelectionManager.this.hideSelectionToolbar$foundation_release();
            }
        });
        selectionRegistrar.setOnSelectionUpdateCallback$foundation_release(new Function5<LayoutCoordinates, Offset, Offset, Boolean, SelectionAdjustment, Boolean>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.4
            {
                super(5);
            }

            @Override // kotlin.jvm.functions.Function5
            public /* bridge */ /* synthetic */ Boolean invoke(LayoutCoordinates layoutCoordinates, Offset offset, Offset offset2, Boolean bool, SelectionAdjustment selectionAdjustment) {
                return m855invoke5iVPX68(layoutCoordinates, offset.getPackedValue(), offset2.getPackedValue(), bool.booleanValue(), selectionAdjustment);
            }

            @NotNull
            /* JADX INFO: renamed from: invoke-5iVPX68, reason: not valid java name */
            public final Boolean m855invoke5iVPX68(@NotNull LayoutCoordinates layoutCoordinates, long j10, long j11, boolean z10, @NotNull SelectionAdjustment selectionMode) {
                Intrinsics.checkNotNullParameter(layoutCoordinates, "layoutCoordinates");
                Intrinsics.checkNotNullParameter(selectionMode, "selectionMode");
                return Boolean.valueOf(SelectionManager.this.m853updateSelectionRHHTvR4$foundation_release(SelectionManager.this.m839convertToContainerCoordinatesQ7Q5hAU(layoutCoordinates, j10), SelectionManager.this.m839convertToContainerCoordinatesQ7Q5hAU(layoutCoordinates, j11), z10, selectionMode));
            }
        });
        selectionRegistrar.setOnSelectionUpdateEndCallback$foundation_release(new Function0<Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.5
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                SelectionManager.this.showSelectionToolbar$foundation_release();
                SelectionManager.this.setDraggingHandle(null);
                SelectionManager.this.m840setCurrentDragPosition_kEHs6E(null);
            }
        });
        selectionRegistrar.setOnSelectableChangeCallback$foundation_release(new Function1<Long, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.6
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l10) {
                invoke(l10.longValue());
                return Unit.f93236a;
            }

            public final void invoke(long j10) {
                if (SelectionManager.this.selectionRegistrar.getSubselections().containsKey(Long.valueOf(j10))) {
                    SelectionManager.this.onRelease();
                    SelectionManager.this.setSelection(null);
                }
            }
        });
        selectionRegistrar.setAfterSelectableUnsubscribe$foundation_release(new Function1<Long, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.7
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l10) {
                invoke(l10.longValue());
                return Unit.f93236a;
            }

            public final void invoke(long j10) {
                Selection selection;
                Selection.AnchorInfo end;
                Selection.AnchorInfo start;
                Selection selection2 = SelectionManager.this.getSelection();
                if ((selection2 == null || (start = selection2.getStart()) == null || j10 != start.getSelectableId()) && ((selection = SelectionManager.this.getSelection()) == null || (end = selection.getEnd()) == null || j10 != end.getSelectableId())) {
                    return;
                }
                SelectionManager.this.m844setStartHandlePosition_kEHs6E(null);
                SelectionManager.this.m843setEndHandlePosition_kEHs6E(null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: convertToContainerCoordinates-Q7Q5hAU, reason: not valid java name */
    public final Offset m839convertToContainerCoordinatesQ7Q5hAU(LayoutCoordinates layoutCoordinates, long offset) {
        LayoutCoordinates layoutCoordinates2 = this.containerLayoutCoordinates;
        if (layoutCoordinates2 == null || !layoutCoordinates2.isAttached()) {
            return null;
        }
        return Offset.m1360boximpl(requireContainerCoordinates$foundation_release().mo3016localPositionOfR5De75A(layoutCoordinates, offset));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object detectNonConsumingTap(PointerInputScope pointerInputScope, Function1<? super Offset, Unit> function1, Continuation continuation) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new C15002(function1, null), continuation);
        return objAwaitEachGesture == pf.b.g() ? objAwaitEachGesture : Unit.f93236a;
    }

    private final Rect getContentRect() {
        LayoutCoordinates layoutCoordinates;
        LayoutCoordinates layoutCoordinates2;
        Selection selection = getSelection();
        if (selection == null) {
            return Rect.INSTANCE.getZero();
        }
        Selectable anchorSelectable$foundation_release = getAnchorSelectable$foundation_release(selection.getStart());
        Selectable anchorSelectable$foundation_release2 = getAnchorSelectable$foundation_release(selection.getEnd());
        if (anchorSelectable$foundation_release == null || (layoutCoordinates = anchorSelectable$foundation_release.getLayoutCoordinates()) == null) {
            return Rect.INSTANCE.getZero();
        }
        if (anchorSelectable$foundation_release2 == null || (layoutCoordinates2 = anchorSelectable$foundation_release2.getLayoutCoordinates()) == null) {
            return Rect.INSTANCE.getZero();
        }
        LayoutCoordinates layoutCoordinates3 = this.containerLayoutCoordinates;
        if (layoutCoordinates3 == null || !layoutCoordinates3.isAttached()) {
            return Rect.INSTANCE.getZero();
        }
        long jMo3016localPositionOfR5De75A = layoutCoordinates3.mo3016localPositionOfR5De75A(layoutCoordinates, anchorSelectable$foundation_release.mo808getHandlePositiondBAh8RU(selection, true));
        long jMo3016localPositionOfR5De75A2 = layoutCoordinates3.mo3016localPositionOfR5De75A(layoutCoordinates2, anchorSelectable$foundation_release2.mo808getHandlePositiondBAh8RU(selection, false));
        long jMo3017localToRootMKHz9U = layoutCoordinates3.mo3017localToRootMKHz9U(jMo3016localPositionOfR5De75A);
        long jMo3017localToRootMKHz9U2 = layoutCoordinates3.mo3017localToRootMKHz9U(jMo3016localPositionOfR5De75A2);
        return new Rect(Math.min(Offset.m1371getXimpl(jMo3017localToRootMKHz9U), Offset.m1371getXimpl(jMo3017localToRootMKHz9U2)), Math.min(Offset.m1372getYimpl(layoutCoordinates3.mo3017localToRootMKHz9U(layoutCoordinates3.mo3016localPositionOfR5De75A(layoutCoordinates, OffsetKt.Offset(0.0f, anchorSelectable$foundation_release.getBoundingBox(selection.getStart().getOffset()).getTop())))), Offset.m1372getYimpl(layoutCoordinates3.mo3017localToRootMKHz9U(layoutCoordinates3.mo3016localPositionOfR5De75A(layoutCoordinates2, OffsetKt.Offset(0.0f, anchorSelectable$foundation_release2.getBoundingBox(selection.getEnd().getOffset()).getTop()))))), Math.max(Offset.m1371getXimpl(jMo3017localToRootMKHz9U), Offset.m1371getXimpl(jMo3017localToRootMKHz9U2)), Math.max(Offset.m1372getYimpl(jMo3017localToRootMKHz9U), Offset.m1372getYimpl(jMo3017localToRootMKHz9U2)) + ((float) (((double) SelectionHandlesKt.getHandleHeight()) * 4.0d)));
    }

    private final boolean getShouldShowMagnifier() {
        return getDraggingHandle() != null;
    }

    private final Modifier onClearSelectionRequested(Modifier modifier, Function0<Unit> function0) {
        return getHasFocus() ? SuspendingPointerInputFilterKt.pointerInput(modifier, Unit.f93236a, new C15021(function0, null)) : modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setCurrentDragPosition-_kEHs6E, reason: not valid java name */
    public final void m840setCurrentDragPosition_kEHs6E(Offset offset) {
        this.currentDragPosition.setValue(offset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setDragBeginPosition-k-4lQ0M, reason: not valid java name */
    public final void m841setDragBeginPositionk4lQ0M(long j10) {
        this.dragBeginPosition.setValue(Offset.m1360boximpl(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setDragTotalDistance-k-4lQ0M, reason: not valid java name */
    public final void m842setDragTotalDistancek4lQ0M(long j10) {
        this.dragTotalDistance.setValue(Offset.m1360boximpl(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDraggingHandle(Handle handle) {
        this.draggingHandle.setValue(handle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setEndHandlePosition-_kEHs6E, reason: not valid java name */
    public final void m843setEndHandlePosition_kEHs6E(Offset offset) {
        this.endHandlePosition.setValue(offset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setStartHandlePosition-_kEHs6E, reason: not valid java name */
    public final void m844setStartHandlePosition_kEHs6E(Offset offset) {
        this.startHandlePosition.setValue(offset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startSelection-9KIMszo, reason: not valid java name */
    public final void m845startSelection9KIMszo(long position, boolean isStartHandle, SelectionAdjustment adjustment) {
        m852updateSelection3R_tFg$foundation_release(position, position, null, isStartHandle, adjustment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateHandleOffsets() {
        Selection.AnchorInfo end;
        Selection.AnchorInfo start;
        Selection selection = getSelection();
        LayoutCoordinates layoutCoordinates = this.containerLayoutCoordinates;
        Selectable anchorSelectable$foundation_release = (selection == null || (start = selection.getStart()) == null) ? null : getAnchorSelectable$foundation_release(start);
        Selectable anchorSelectable$foundation_release2 = (selection == null || (end = selection.getEnd()) == null) ? null : getAnchorSelectable$foundation_release(end);
        LayoutCoordinates layoutCoordinates2 = anchorSelectable$foundation_release != null ? anchorSelectable$foundation_release.getLayoutCoordinates() : null;
        LayoutCoordinates layoutCoordinates3 = anchorSelectable$foundation_release2 != null ? anchorSelectable$foundation_release2.getLayoutCoordinates() : null;
        if (selection == null || layoutCoordinates == null || !layoutCoordinates.isAttached() || layoutCoordinates2 == null || layoutCoordinates3 == null) {
            m844setStartHandlePosition_kEHs6E(null);
            m843setEndHandlePosition_kEHs6E(null);
            return;
        }
        long jMo3016localPositionOfR5De75A = layoutCoordinates.mo3016localPositionOfR5De75A(layoutCoordinates2, anchorSelectable$foundation_release.mo808getHandlePositiondBAh8RU(selection, true));
        long jMo3016localPositionOfR5De75A2 = layoutCoordinates.mo3016localPositionOfR5De75A(layoutCoordinates3, anchorSelectable$foundation_release2.mo808getHandlePositiondBAh8RU(selection, false));
        Rect rectVisibleBounds = SelectionManagerKt.visibleBounds(layoutCoordinates);
        Offset offsetM1360boximpl = Offset.m1360boximpl(jMo3016localPositionOfR5De75A);
        offsetM1360boximpl.getPackedValue();
        if (!SelectionManagerKt.m859containsInclusiveUv8p0NA(rectVisibleBounds, jMo3016localPositionOfR5De75A) && getDraggingHandle() != Handle.SelectionStart) {
            offsetM1360boximpl = null;
        }
        m844setStartHandlePosition_kEHs6E(offsetM1360boximpl);
        Offset offsetM1360boximpl2 = Offset.m1360boximpl(jMo3016localPositionOfR5De75A2);
        offsetM1360boximpl2.getPackedValue();
        m843setEndHandlePosition_kEHs6E((SelectionManagerKt.m859containsInclusiveUv8p0NA(rectVisibleBounds, jMo3016localPositionOfR5De75A2) || getDraggingHandle() == Handle.SelectionEnd) ? offsetM1360boximpl2 : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSelectionToolbarPosition() {
        if (getHasFocus()) {
            TextToolbar textToolbar = this.textToolbar;
            if ((textToolbar != null ? textToolbar.getStatus() : null) == TextToolbarStatus.Shown) {
                showSelectionToolbar$foundation_release();
            }
        }
    }

    /* JADX INFO: renamed from: contextMenuOpenAdjustment-k-4lQ0M, reason: not valid java name */
    public final void m846contextMenuOpenAdjustmentk4lQ0M(long position) {
        Selection selection = getSelection();
        if (selection != null ? TextRange.m3497getCollapsedimpl(selection.m816toTextRanged9O1mEE()) : true) {
            m845startSelection9KIMszo(position, true, SelectionAdjustment.INSTANCE.getWord());
        }
    }

    public final void copy$foundation_release() {
        ClipboardManager clipboardManager;
        AnnotatedString selectedText$foundation_release = getSelectedText$foundation_release();
        if (selectedText$foundation_release == null || (clipboardManager = this.clipboardManager) == null) {
            return;
        }
        clipboardManager.setText(selectedText$foundation_release);
    }

    @Nullable
    public final Selectable getAnchorSelectable$foundation_release(@NotNull Selection.AnchorInfo anchor) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        return this.selectionRegistrar.getSelectableMap$foundation_release().get(Long.valueOf(anchor.getSelectableId()));
    }

    @Nullable
    public final ClipboardManager getClipboardManager() {
        return this.clipboardManager;
    }

    @Nullable
    public final LayoutCoordinates getContainerLayoutCoordinates() {
        return this.containerLayoutCoordinates;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* JADX INFO: renamed from: getCurrentDragPosition-_m7T9-E, reason: not valid java name */
    public final Offset m847getCurrentDragPosition_m7T9E() {
        return (Offset) this.currentDragPosition.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getDragBeginPosition-F1C5BW0$foundation_release, reason: not valid java name */
    public final long m848getDragBeginPositionF1C5BW0$foundation_release() {
        return ((Offset) this.dragBeginPosition.getValue()).getPackedValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getDragTotalDistance-F1C5BW0$foundation_release, reason: not valid java name */
    public final long m849getDragTotalDistanceF1C5BW0$foundation_release() {
        return ((Offset) this.dragTotalDistance.getValue()).getPackedValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Handle getDraggingHandle() {
        return (Handle) this.draggingHandle.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* JADX INFO: renamed from: getEndHandlePosition-_m7T9-E, reason: not valid java name */
    public final Offset m850getEndHandlePosition_m7T9E() {
        return (Offset) this.endHandlePosition.getValue();
    }

    @NotNull
    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    @Nullable
    public final HapticFeedback getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getHasFocus() {
        return ((Boolean) this.hasFocus.getValue()).booleanValue();
    }

    @NotNull
    public final Modifier getModifier() {
        Modifier modifierSelectionMagnifier = Modifier.INSTANCE;
        Modifier modifierOnKeyEvent = KeyInputModifierKt.onKeyEvent(FocusableKt.focusable$default(FocusChangedModifierKt.onFocusChanged(FocusRequesterModifierKt.focusRequester(OnGloballyPositionedModifierKt.onGloballyPositioned(onClearSelectionRequested(modifierSelectionMagnifier, new Function0<Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$modifier$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.onRelease();
            }
        }), new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$modifier$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                invoke2(layoutCoordinates);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull LayoutCoordinates it) {
                Intrinsics.checkNotNullParameter(it, "it");
                this.this$0.setContainerLayoutCoordinates(it);
            }
        }), this.focusRequester), new Function1<FocusState, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$modifier$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(FocusState focusState) {
                invoke2(focusState);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull FocusState focusState) {
                Intrinsics.checkNotNullParameter(focusState, "focusState");
                if (!focusState.isFocused() && this.this$0.getHasFocus()) {
                    this.this$0.onRelease();
                }
                this.this$0.setHasFocus(focusState.isFocused());
            }
        }), false, null, 3, null), new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$modifier$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                return m856invokeZmokQxo(keyEvent.m2781unboximpl());
            }

            @NotNull
            /* JADX INFO: renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final Boolean m856invokeZmokQxo(@NotNull android.view.KeyEvent it) {
                boolean z10;
                Intrinsics.checkNotNullParameter(it, "it");
                if (SelectionManager_androidKt.m860isCopyKeyEventZmokQxo(it)) {
                    this.this$0.copy$foundation_release();
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            }
        });
        if (getShouldShowMagnifier()) {
            modifierSelectionMagnifier = SelectionManager_androidKt.selectionMagnifier(modifierSelectionMagnifier, this);
        }
        return modifierOnKeyEvent.then(modifierSelectionMagnifier);
    }

    @NotNull
    public final Function1<Selection, Unit> getOnSelectionChange() {
        return this.onSelectionChange;
    }

    @Nullable
    public final AnnotatedString getSelectedText$foundation_release() {
        AnnotatedString annotatedStringPlus;
        List<Selectable> listSort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release());
        Selection selection = getSelection();
        AnnotatedString annotatedString = null;
        if (selection != null) {
            int size = listSort.size();
            for (int i10 = 0; i10 < size; i10++) {
                Selectable selectable = listSort.get(i10);
                if (selectable.getSelectableId() == selection.getStart().getSelectableId() || selectable.getSelectableId() == selection.getEnd().getSelectableId() || annotatedString != null) {
                    AnnotatedString currentSelectedText = SelectionManagerKt.getCurrentSelectedText(selectable, selection);
                    if (annotatedString != null && (annotatedStringPlus = annotatedString.plus(currentSelectedText)) != null) {
                        currentSelectedText = annotatedStringPlus;
                    }
                    if ((selectable.getSelectableId() == selection.getEnd().getSelectableId() && !selection.getHandlesCrossed()) || (selectable.getSelectableId() == selection.getStart().getSelectableId() && selection.getHandlesCrossed())) {
                        return currentSelectedText;
                    }
                    annotatedString = currentSelectedText;
                }
            }
        }
        return annotatedString;
    }

    @Nullable
    public final Selection getSelection() {
        return this._selection.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* JADX INFO: renamed from: getStartHandlePosition-_m7T9-E, reason: not valid java name */
    public final Offset m851getStartHandlePosition_m7T9E() {
        return (Offset) this.startHandlePosition.getValue();
    }

    @Nullable
    public final TextToolbar getTextToolbar() {
        return this.textToolbar;
    }

    public final boolean getTouchMode() {
        return this.touchMode;
    }

    @NotNull
    public final TextDragObserver handleDragObserver(final boolean isStartHandle) {
        return new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.SelectionManager.handleDragObserver.1
            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
                SelectionManager.this.showSelectionToolbar$foundation_release();
                SelectionManager.this.setDraggingHandle(null);
                SelectionManager.this.m840setCurrentDragPosition_kEHs6E(null);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* JADX INFO: renamed from: onDown-k-4lQ0M */
            public void mo756onDownk4lQ0M(long point) {
                LayoutCoordinates layoutCoordinates;
                Selection selection = SelectionManager.this.getSelection();
                if (selection == null) {
                    return;
                }
                Selectable anchorSelectable$foundation_release = SelectionManager.this.getAnchorSelectable$foundation_release(isStartHandle ? selection.getStart() : selection.getEnd());
                if (anchorSelectable$foundation_release == null || (layoutCoordinates = anchorSelectable$foundation_release.getLayoutCoordinates()) == null) {
                    return;
                }
                long jM826getAdjustedCoordinatesk4lQ0M = SelectionHandlesKt.m826getAdjustedCoordinatesk4lQ0M(anchorSelectable$foundation_release.mo808getHandlePositiondBAh8RU(selection, isStartHandle));
                SelectionManager selectionManager = SelectionManager.this;
                selectionManager.m840setCurrentDragPosition_kEHs6E(Offset.m1360boximpl(selectionManager.requireContainerCoordinates$foundation_release().mo3016localPositionOfR5De75A(layoutCoordinates, jM826getAdjustedCoordinatesk4lQ0M)));
                SelectionManager.this.setDraggingHandle(isStartHandle ? Handle.SelectionStart : Handle.SelectionEnd);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* JADX INFO: renamed from: onDrag-k-4lQ0M */
            public void mo757onDragk4lQ0M(long delta) {
                SelectionManager selectionManager = SelectionManager.this;
                selectionManager.m842setDragTotalDistancek4lQ0M(Offset.m1376plusMKHz9U(selectionManager.m849getDragTotalDistanceF1C5BW0$foundation_release(), delta));
                long jM1376plusMKHz9U = Offset.m1376plusMKHz9U(SelectionManager.this.m848getDragBeginPositionF1C5BW0$foundation_release(), SelectionManager.this.m849getDragTotalDistanceF1C5BW0$foundation_release());
                if (SelectionManager.this.m853updateSelectionRHHTvR4$foundation_release(Offset.m1360boximpl(jM1376plusMKHz9U), Offset.m1360boximpl(SelectionManager.this.m848getDragBeginPositionF1C5BW0$foundation_release()), isStartHandle, SelectionAdjustment.INSTANCE.getCharacterWithWordAccelerate())) {
                    SelectionManager.this.m841setDragBeginPositionk4lQ0M(jM1376plusMKHz9U);
                    SelectionManager.this.m842setDragTotalDistancek4lQ0M(Offset.INSTANCE.m1387getZeroF1C5BW0());
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* JADX INFO: renamed from: onStart-k-4lQ0M */
            public void mo758onStartk4lQ0M(long startPoint) {
                LayoutCoordinates layoutCoordinates;
                long jMo808getHandlePositiondBAh8RU;
                SelectionManager.this.hideSelectionToolbar$foundation_release();
                Selection selection = SelectionManager.this.getSelection();
                Intrinsics.checkNotNull(selection);
                Selectable selectable = SelectionManager.this.selectionRegistrar.getSelectableMap$foundation_release().get(Long.valueOf(selection.getStart().getSelectableId()));
                Selectable selectable2 = SelectionManager.this.selectionRegistrar.getSelectableMap$foundation_release().get(Long.valueOf(selection.getEnd().getSelectableId()));
                if (isStartHandle) {
                    layoutCoordinates = selectable != null ? selectable.getLayoutCoordinates() : null;
                    Intrinsics.checkNotNull(layoutCoordinates);
                } else {
                    layoutCoordinates = selectable2 != null ? selectable2.getLayoutCoordinates() : null;
                    Intrinsics.checkNotNull(layoutCoordinates);
                }
                if (isStartHandle) {
                    Intrinsics.checkNotNull(selectable);
                    jMo808getHandlePositiondBAh8RU = selectable.mo808getHandlePositiondBAh8RU(selection, true);
                } else {
                    Intrinsics.checkNotNull(selectable2);
                    jMo808getHandlePositiondBAh8RU = selectable2.mo808getHandlePositiondBAh8RU(selection, false);
                }
                long jM826getAdjustedCoordinatesk4lQ0M = SelectionHandlesKt.m826getAdjustedCoordinatesk4lQ0M(jMo808getHandlePositiondBAh8RU);
                SelectionManager selectionManager = SelectionManager.this;
                selectionManager.m841setDragBeginPositionk4lQ0M(selectionManager.requireContainerCoordinates$foundation_release().mo3016localPositionOfR5De75A(layoutCoordinates, jM826getAdjustedCoordinatesk4lQ0M));
                SelectionManager.this.m842setDragTotalDistancek4lQ0M(Offset.INSTANCE.m1387getZeroF1C5BW0());
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                SelectionManager.this.showSelectionToolbar$foundation_release();
                SelectionManager.this.setDraggingHandle(null);
                SelectionManager.this.m840setCurrentDragPosition_kEHs6E(null);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
                SelectionManager.this.setDraggingHandle(null);
                SelectionManager.this.m840setCurrentDragPosition_kEHs6E(null);
            }
        };
    }

    public final void hideSelectionToolbar$foundation_release() {
        TextToolbar textToolbar;
        if (getHasFocus()) {
            TextToolbar textToolbar2 = this.textToolbar;
            if ((textToolbar2 != null ? textToolbar2.getStatus() : null) != TextToolbarStatus.Shown || (textToolbar = this.textToolbar) == null) {
                return;
            }
            textToolbar.hide();
        }
    }

    public final void onRelease() {
        this.selectionRegistrar.setSubselections(MapsKt.emptyMap());
        hideSelectionToolbar$foundation_release();
        if (getSelection() != null) {
            this.onSelectionChange.invoke(null);
            HapticFeedback hapticFeedback = this.hapticFeedBack;
            if (hapticFeedback != null) {
                hapticFeedback.mo2170performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m2179getTextHandleMove5zf0vsI());
            }
        }
    }

    @NotNull
    public final LayoutCoordinates requireContainerCoordinates$foundation_release() {
        LayoutCoordinates layoutCoordinates = this.containerLayoutCoordinates;
        if (layoutCoordinates == null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (layoutCoordinates.isAttached()) {
            return layoutCoordinates;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @NotNull
    public final Pair<Selection, Map<Long, Selection>> selectAll$foundation_release(long selectableId, @Nullable Selection previousSelection) {
        HapticFeedback hapticFeedback;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<Selectable> listSort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release());
        int size = listSort.size();
        Selection selectionMerge = null;
        for (int i10 = 0; i10 < size; i10++) {
            Selectable selectable = listSort.get(i10);
            Selection selectAllSelection = selectable.getSelectableId() == selectableId ? selectable.getSelectAllSelection() : null;
            if (selectAllSelection != null) {
                linkedHashMap.put(Long.valueOf(selectable.getSelectableId()), selectAllSelection);
            }
            selectionMerge = SelectionManagerKt.merge(selectionMerge, selectAllSelection);
        }
        if (!Intrinsics.areEqual(selectionMerge, previousSelection) && (hapticFeedback = this.hapticFeedBack) != null) {
            hapticFeedback.mo2170performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m2179getTextHandleMove5zf0vsI());
        }
        return new Pair<>(selectionMerge, linkedHashMap);
    }

    public final void setClipboardManager(@Nullable ClipboardManager clipboardManager) {
        this.clipboardManager = clipboardManager;
    }

    public final void setContainerLayoutCoordinates(@Nullable LayoutCoordinates layoutCoordinates) {
        this.containerLayoutCoordinates = layoutCoordinates;
        if (!getHasFocus() || getSelection() == null) {
            return;
        }
        Offset offsetM1360boximpl = layoutCoordinates != null ? Offset.m1360boximpl(LayoutCoordinatesKt.positionInWindow(layoutCoordinates)) : null;
        if (Intrinsics.areEqual(this.previousPosition, offsetM1360boximpl)) {
            return;
        }
        this.previousPosition = offsetM1360boximpl;
        updateHandleOffsets();
        updateSelectionToolbarPosition();
    }

    public final void setFocusRequester(@NotNull FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "<set-?>");
        this.focusRequester = focusRequester;
    }

    public final void setHapticFeedBack(@Nullable HapticFeedback hapticFeedback) {
        this.hapticFeedBack = hapticFeedback;
    }

    public final void setHasFocus(boolean z10) {
        this.hasFocus.setValue(Boolean.valueOf(z10));
    }

    public final void setOnSelectionChange(@NotNull Function1<? super Selection, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onSelectionChange = function1;
    }

    public final void setSelection(@Nullable Selection selection) {
        this._selection.setValue(selection);
        if (selection != null) {
            updateHandleOffsets();
        }
    }

    public final void setTextToolbar(@Nullable TextToolbar textToolbar) {
        this.textToolbar = textToolbar;
    }

    public final void setTouchMode(boolean z10) {
        this.touchMode = z10;
    }

    public final void showSelectionToolbar$foundation_release() {
        TextToolbar textToolbar;
        if (!getHasFocus() || getSelection() == null || (textToolbar = this.textToolbar) == null) {
            return;
        }
        d2.a(textToolbar, getContentRect(), new Function0<Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$showSelectionToolbar$1$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.copy$foundation_release();
                this.this$0.onRelease();
            }
        }, null, null, null, 28, null);
    }

    /* JADX INFO: renamed from: updateSelection-3R_-tFg$foundation_release, reason: not valid java name */
    public final boolean m852updateSelection3R_tFg$foundation_release(long startHandlePosition, long endHandlePosition, @Nullable Offset previousHandlePosition, boolean isStartHandle, @NotNull SelectionAdjustment adjustment) {
        SelectionAdjustment adjustment2 = adjustment;
        Intrinsics.checkNotNullParameter(adjustment2, "adjustment");
        setDraggingHandle(isStartHandle ? Handle.SelectionStart : Handle.SelectionEnd);
        m840setCurrentDragPosition_kEHs6E(isStartHandle ? Offset.m1360boximpl(startHandlePosition) : Offset.m1360boximpl(endHandlePosition));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<Selectable> listSort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release());
        int size = listSort.size();
        Selection selectionMerge = null;
        int i10 = 0;
        boolean z10 = false;
        while (i10 < size) {
            Selectable selectable = listSort.get(i10);
            int i11 = i10;
            Pair<Selection, Boolean> pairMo810updateSelectionqCDeeow = selectable.mo810updateSelectionqCDeeow(startHandlePosition, endHandlePosition, previousHandlePosition, isStartHandle, requireContainerCoordinates$foundation_release(), adjustment2, this.selectionRegistrar.getSubselections().get(Long.valueOf(selectable.getSelectableId())));
            Selection selectionComponent1 = pairMo810updateSelectionqCDeeow.component1();
            z10 = z10 || pairMo810updateSelectionqCDeeow.component2().booleanValue();
            if (selectionComponent1 != null) {
                linkedHashMap.put(Long.valueOf(selectable.getSelectableId()), selectionComponent1);
            }
            selectionMerge = SelectionManagerKt.merge(selectionMerge, selectionComponent1);
            i10 = i11 + 1;
            adjustment2 = adjustment;
        }
        if (!Intrinsics.areEqual(selectionMerge, getSelection())) {
            HapticFeedback hapticFeedback = this.hapticFeedBack;
            if (hapticFeedback != null) {
                hapticFeedback.mo2170performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m2179getTextHandleMove5zf0vsI());
            }
            this.selectionRegistrar.setSubselections(linkedHashMap);
            this.onSelectionChange.invoke(selectionMerge);
        }
        return z10;
    }

    /* JADX INFO: renamed from: updateSelection-RHHTvR4$foundation_release, reason: not valid java name */
    public final boolean m853updateSelectionRHHTvR4$foundation_release(@Nullable Offset newPosition, @Nullable Offset previousPosition, boolean isStartHandle, @NotNull SelectionAdjustment adjustment) {
        Selection selection;
        Offset offsetM839convertToContainerCoordinatesQ7Q5hAU;
        Intrinsics.checkNotNullParameter(adjustment, "adjustment");
        if (newPosition == null || (selection = getSelection()) == null) {
            return false;
        }
        Selectable selectable = this.selectionRegistrar.getSelectableMap$foundation_release().get(Long.valueOf(isStartHandle ? selection.getEnd().getSelectableId() : selection.getStart().getSelectableId()));
        if (selectable == null) {
            offsetM839convertToContainerCoordinatesQ7Q5hAU = null;
        } else {
            LayoutCoordinates layoutCoordinates = selectable.getLayoutCoordinates();
            Intrinsics.checkNotNull(layoutCoordinates);
            offsetM839convertToContainerCoordinatesQ7Q5hAU = m839convertToContainerCoordinatesQ7Q5hAU(layoutCoordinates, SelectionHandlesKt.m826getAdjustedCoordinatesk4lQ0M(selectable.mo808getHandlePositiondBAh8RU(selection, !isStartHandle)));
        }
        if (offsetM839convertToContainerCoordinatesQ7Q5hAU == null) {
            return false;
        }
        long packedValue = offsetM839convertToContainerCoordinatesQ7Q5hAU.getPackedValue();
        long packedValue2 = isStartHandle ? newPosition.getPackedValue() : packedValue;
        if (!isStartHandle) {
            packedValue = newPosition.getPackedValue();
        }
        return m852updateSelection3R_tFg$foundation_release(packedValue2, packedValue, previousPosition, isStartHandle, adjustment);
    }
}
