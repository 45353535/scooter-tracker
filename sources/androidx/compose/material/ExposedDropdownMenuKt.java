package androidx.compose.material;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import com.ironsource.C4257c4;
import com.mbridge.msdk.MBridgeConstans;
import io.bidmachine.protobuf.EventTypeExtended;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001aN\u0010\n\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a)\u0010\u000f\u001a\u00020\u0005*\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a=\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"", "expanded", "Lkotlin/Function1;", "", "onExpandedChange", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/material/ExposedDropdownMenuBoxScope;", "Landroidx/compose/runtime/Composable;", "content", "ExposedDropdownMenuBox", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function0;", "", "menuLabel", "expandable", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Ljava/lang/String;)Landroidx/compose/ui/Modifier;", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroidx/compose/ui/layout/LayoutCoordinates;", C4257c4.f42802f, "", "verticalMarginInPx", "onHeightUpdate", "updateHeight", "(Landroid/view/View;Landroidx/compose/ui/layout/LayoutCoordinates;ILkotlin/jvm/functions/Function1;)V", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ExposedDropdownMenuKt {

    /* JADX INFO: renamed from: androidx.compose.material.ExposedDropdownMenuKt$expandable$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.compose.material.ExposedDropdownMenuKt$expandable$1", f = "ExposedDropdownMenu.kt", l = {EventTypeExtended.EVENT_TYPE_EXTENDED_BROKEN_CREATIVE_DETECTOR_VALUE}, m = "invokeSuspend")
    static final class C15111 extends k implements Function2<PointerInputScope, Continuation, Object> {
        final /* synthetic */ Function0<Unit> $onExpandedChange;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.compose.material.ExposedDropdownMenuKt$expandable$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @e(c = "androidx.compose.material.ExposedDropdownMenuKt$expandable$1$1", f = "ExposedDropdownMenu.kt", l = {518, 519}, m = "invokeSuspend")
        static final class C00751 extends j implements Function2<AwaitPointerEventScope, Continuation, Object> {
            final /* synthetic */ Function0<Unit> $onExpandedChange;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00751(Function0<Unit> function0, Continuation continuation) {
                super(2, continuation);
                this.$onExpandedChange = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                C00751 c00751 = new C00751(this.$onExpandedChange, continuation);
                c00751.L$0 = obj;
                return c00751;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable Continuation continuation) {
                return ((C00751) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.f93236a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
            
                if (r11 == r0) goto L16;
             */
            @Override // kotlin.coroutines.jvm.internal.a
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r11) {
                /*
                    r10 = this;
                    java.lang.Object r0 = pf.b.g()
                    int r1 = r10.label
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L24
                    if (r1 == r3) goto L1b
                    if (r1 != r2) goto L13
                    kotlin.d.b(r11)
                    r7 = r10
                    goto L4c
                L13:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r0)
                    throw r11
                L1b:
                    java.lang.Object r1 = r10.L$0
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                    kotlin.d.b(r11)
                    r7 = r10
                    goto L3e
                L24:
                    kotlin.d.b(r11)
                    java.lang.Object r11 = r10.L$0
                    r4 = r11
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r4 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r4
                    androidx.compose.ui.input.pointer.PointerEventPass r6 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                    r10.L$0 = r4
                    r10.label = r3
                    r5 = 0
                    r8 = 1
                    r9 = 0
                    r7 = r10
                    java.lang.Object r11 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r4, r5, r6, r7, r8, r9)
                    if (r11 != r0) goto L3d
                    goto L4b
                L3d:
                    r1 = r4
                L3e:
                    androidx.compose.ui.input.pointer.PointerEventPass r11 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                    r3 = 0
                    r7.L$0 = r3
                    r7.label = r2
                    java.lang.Object r11 = androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForUpOrCancellation(r1, r11, r10)
                    if (r11 != r0) goto L4c
                L4b:
                    return r0
                L4c:
                    androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.ui.input.pointer.PointerInputChange) r11
                    if (r11 == 0) goto L55
                    kotlin.jvm.functions.Function0<kotlin.Unit> r11 = r7.$onExpandedChange
                    r11.invoke()
                L55:
                    kotlin.Unit r11 = kotlin.Unit.f93236a
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ExposedDropdownMenuKt.C15111.C00751.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C15111(Function0<Unit> function0, Continuation continuation) {
            super(2, continuation);
            this.$onExpandedChange = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            C15111 c15111 = new C15111(this.$onExpandedChange, continuation);
            c15111.L$0 = obj;
            return c15111;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation continuation) {
            return ((C15111) create(pointerInputScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = b.g();
            int i10 = this.label;
            if (i10 == 0) {
                d.b(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                C00751 c00751 = new C00751(this.$onExpandedChange, null);
                this.label = 1;
                if (ForEachGestureKt.awaitEachGesture(pointerInputScope, c00751, this) == objG) {
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

    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02cd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02ce  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void ExposedDropdownMenuBox(final boolean r21, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r22, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r23, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function3<? super androidx.compose.material.ExposedDropdownMenuBoxScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r24, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instruction units count: 733
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ExposedDropdownMenuKt.ExposedDropdownMenuBox(boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ExposedDropdownMenuBox$lambda$1(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ExposedDropdownMenuBox$lambda$2(MutableState<Integer> mutableState, int i10) {
        mutableState.setValue(Integer.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ExposedDropdownMenuBox$lambda$4(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ExposedDropdownMenuBox$lambda$5(MutableState<Integer> mutableState, int i10) {
        mutableState.setValue(Integer.valueOf(i10));
    }

    private static final Modifier expandable(Modifier modifier, final Function0<Unit> function0, final String str) {
        return SemanticsModifierKt.semantics$default(SuspendingPointerInputFilterKt.pointerInput(modifier, Unit.f93236a, new C15111(function0, null)), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ExposedDropdownMenuKt.expandable.2
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
                SemanticsPropertiesKt.setContentDescription(semantics, str);
                final Function0<Unit> function02 = function0;
                SemanticsPropertiesKt.onClick$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.ExposedDropdownMenuKt.expandable.2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final Boolean invoke() {
                        function02.invoke();
                        return Boolean.TRUE;
                    }
                }, 1, null);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateHeight(View view, LayoutCoordinates layoutCoordinates, int i10, Function1<? super Integer, Unit> function1) {
        if (layoutCoordinates == null) {
            return;
        }
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        function1.invoke(Integer.valueOf(((int) Math.max(LayoutCoordinatesKt.boundsInWindow(layoutCoordinates).getTop() - rect.top, (rect.bottom - r1) - LayoutCoordinatesKt.boundsInWindow(layoutCoordinates).getBottom())) - i10));
    }
}
