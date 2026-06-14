package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.LongPressTextDragObserverKt;
import androidx.compose.foundation.text.TextDelegate;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.IntSize;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import kotlin.text.StringsKt;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a%\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u0014\u0010\u000f\u001a\u00020\u0003*\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"TextFieldSelectionHandle", "", "isStartHandle", "", "direction", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "manager", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "(ZLandroidx/compose/ui/text/style/ResolvedTextDirection;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/runtime/Composer;I)V", "calculateSelectionMagnifierCenterAndroid", "Landroidx/compose/ui/geometry/Offset;", "magnifierSize", "Landroidx/compose/ui/unit/IntSize;", "calculateSelectionMagnifierCenterAndroid-O0kMr_c", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;J)J", "isSelectionHandleInVisibleBound", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TextFieldSelectionManagerKt {

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt$TextFieldSelectionHandle$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt$TextFieldSelectionHandle$1", f = "TextFieldSelectionManager.kt", l = {820}, m = "invokeSuspend")
    static final class AnonymousClass1 extends k implements Function2<PointerInputScope, Continuation, Object> {
        final /* synthetic */ TextDragObserver $observer;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(TextDragObserver textDragObserver, Continuation continuation) {
            super(2, continuation);
            this.$observer = textDragObserver;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$observer, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation continuation) {
            return ((AnonymousClass1) create(pointerInputScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = pf.b.g();
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

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Handle.values().length];
            try {
                iArr[Handle.Cursor.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Handle.SelectionStart.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Handle.SelectionEnd.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void TextFieldSelectionHandle(final boolean z10, @NotNull final ResolvedTextDirection direction, @NotNull final TextFieldSelectionManager manager, @Nullable Composer composer, final int i10) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(manager, "manager");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1344558920);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1344558920, i10, -1, "androidx.compose.foundation.text.selection.TextFieldSelectionHandle (TextFieldSelectionManager.kt:803)");
        }
        Boolean boolValueOf = Boolean.valueOf(z10);
        composerStartRestartGroup.startReplaceableGroup(511388516);
        boolean zChanged = composerStartRestartGroup.changed(boolValueOf) | composerStartRestartGroup.changed(manager);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = manager.handleDragObserver$foundation_release(z10);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        TextDragObserver textDragObserver = (TextDragObserver) objRememberedValue;
        int i11 = i10 << 3;
        AndroidSelectionHandles_androidKt.m803SelectionHandle8fL75g(manager.m878getHandlePositiontuRUvjQ$foundation_release(z10), z10, direction, TextRange.m3502getReversedimpl(manager.getValue$foundation_release().getSelection()), SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, textDragObserver, new AnonymousClass1(textDragObserver, null)), null, composerStartRestartGroup, (i11 & 112) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i11 & 896));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt.TextFieldSelectionHandle.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.f93236a;
            }

            public final void invoke(@Nullable Composer composer2, int i12) {
                TextFieldSelectionManagerKt.TextFieldSelectionHandle(z10, direction, manager, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
            }
        });
    }

    /* JADX INFO: renamed from: calculateSelectionMagnifierCenterAndroid-O0kMr_c, reason: not valid java name */
    public static final long m879calculateSelectionMagnifierCenterAndroidO0kMr_c(@NotNull TextFieldSelectionManager manager, long j10) {
        int iM3503getStartimpl;
        TextLayoutResultProxy layoutResult;
        TextLayoutResult value;
        TextDelegate textDelegate;
        AnnotatedString text;
        LayoutCoordinates layoutCoordinates;
        TextLayoutResultProxy layoutResult2;
        LayoutCoordinates innerTextFieldCoordinates;
        Intrinsics.checkNotNullParameter(manager, "manager");
        if (manager.getValue$foundation_release().getText().length() == 0) {
            return Offset.INSTANCE.m1386getUnspecifiedF1C5BW0();
        }
        Handle draggingHandle = manager.getDraggingHandle();
        int i10 = draggingHandle == null ? -1 : WhenMappings.$EnumSwitchMapping$0[draggingHandle.ordinal()];
        if (i10 == -1) {
            return Offset.INSTANCE.m1386getUnspecifiedF1C5BW0();
        }
        if (i10 == 1 || i10 == 2) {
            iM3503getStartimpl = TextRange.m3503getStartimpl(manager.getValue$foundation_release().getSelection());
        } else {
            if (i10 != 3) {
                throw new m();
            }
            iM3503getStartimpl = TextRange.m3498getEndimpl(manager.getValue$foundation_release().getSelection());
        }
        int iOriginalToTransformed = manager.getOffsetMapping().originalToTransformed(iM3503getStartimpl);
        TextFieldState state$foundation_release = manager.getState();
        if (state$foundation_release == null || (layoutResult = state$foundation_release.getLayoutResult()) == null || (value = layoutResult.getValue()) == null) {
            return Offset.INSTANCE.m1386getUnspecifiedF1C5BW0();
        }
        TextFieldState state$foundation_release2 = manager.getState();
        if (state$foundation_release2 == null || (textDelegate = state$foundation_release2.getTextDelegate()) == null || (text = textDelegate.getText()) == null) {
            return Offset.INSTANCE.m1386getUnspecifiedF1C5BW0();
        }
        int iO = g.o(iOriginalToTransformed, StringsKt.o0(text));
        long jM1401getCenterF1C5BW0 = value.getBoundingBox(iO).m1401getCenterF1C5BW0();
        TextFieldState state$foundation_release3 = manager.getState();
        if (state$foundation_release3 == null || (layoutCoordinates = state$foundation_release3.getLayoutCoordinates()) == null) {
            return Offset.INSTANCE.m1386getUnspecifiedF1C5BW0();
        }
        TextFieldState state$foundation_release4 = manager.getState();
        if (state$foundation_release4 == null || (layoutResult2 = state$foundation_release4.getLayoutResult()) == null || (innerTextFieldCoordinates = layoutResult2.getInnerTextFieldCoordinates()) == null) {
            return Offset.INSTANCE.m1386getUnspecifiedF1C5BW0();
        }
        Offset offsetM876getCurrentDragPosition_m7T9E = manager.m876getCurrentDragPosition_m7T9E();
        if (offsetM876getCurrentDragPosition_m7T9E == null) {
            return Offset.INSTANCE.m1386getUnspecifiedF1C5BW0();
        }
        float fM1371getXimpl = Offset.m1371getXimpl(innerTextFieldCoordinates.mo3016localPositionOfR5De75A(layoutCoordinates, offsetM876getCurrentDragPosition_m7T9E.getPackedValue()));
        int lineForOffset = value.getLineForOffset(iO);
        int lineStart = value.getLineStart(lineForOffset);
        int lineEnd = value.getLineEnd(lineForOffset, true);
        boolean z10 = TextRange.m3503getStartimpl(manager.getValue$foundation_release().getSelection()) > TextRange.m3498getEndimpl(manager.getValue$foundation_release().getSelection());
        float horizontalPosition = TextSelectionDelegateKt.getHorizontalPosition(value, lineStart, true, z10);
        float horizontalPosition2 = TextSelectionDelegateKt.getHorizontalPosition(value, lineEnd, false, z10);
        float fM = g.m(fM1371getXimpl, Math.min(horizontalPosition, horizontalPosition2), Math.max(horizontalPosition, horizontalPosition2));
        return Math.abs(fM1371getXimpl - fM) > ((float) (IntSize.m4111getWidthimpl(j10) / 2)) ? Offset.INSTANCE.m1386getUnspecifiedF1C5BW0() : layoutCoordinates.mo3016localPositionOfR5De75A(innerTextFieldCoordinates, OffsetKt.Offset(fM, Offset.m1372getYimpl(jM1401getCenterF1C5BW0)));
    }

    public static final boolean isSelectionHandleInVisibleBound(@NotNull TextFieldSelectionManager textFieldSelectionManager, boolean z10) {
        LayoutCoordinates layoutCoordinates;
        Rect rectVisibleBounds;
        Intrinsics.checkNotNullParameter(textFieldSelectionManager, "<this>");
        TextFieldState state$foundation_release = textFieldSelectionManager.getState();
        if (state$foundation_release == null || (layoutCoordinates = state$foundation_release.getLayoutCoordinates()) == null || (rectVisibleBounds = SelectionManagerKt.visibleBounds(layoutCoordinates)) == null) {
            return false;
        }
        return SelectionManagerKt.m859containsInclusiveUv8p0NA(rectVisibleBounds, textFieldSelectionManager.m878getHandlePositiontuRUvjQ$foundation_release(z10));
    }
}
