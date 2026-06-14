package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u00020\u0003*\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u001a\u001d\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0080@ø\u0001\u0000¢\u0006\u0002\u0010\u000b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"ClicksSlop", "", "awaitMouseEventDown", "Landroidx/compose/ui/input/pointer/PointerEvent;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mouseSelectionDetector", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "observer", "Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/foundation/text/selection/MouseSelectionObserver;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TextSelectionMouseDetectorKt {
    public static final double ClicksSlop = 100.0d;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$awaitMouseEventDown$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt", f = "TextSelectionMouseDetector.kt", l = {125}, m = "awaitMouseEventDown")
    static final class AnonymousClass1 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TextSelectionMouseDetectorKt.awaitMouseEventDown(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2", f = "TextSelectionMouseDetector.kt", l = {89, 96, 111}, m = "invokeSuspend")
    static final class AnonymousClass2 extends j implements Function2<AwaitPointerEventScope, Continuation, Object> {
        final /* synthetic */ MouseSelectionObserver $observer;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(MouseSelectionObserver mouseSelectionObserver, Continuation continuation) {
            super(2, continuation);
            this.$observer = mouseSelectionObserver;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$observer, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable Continuation continuation) {
            return ((AnonymousClass2) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x008e, code lost:
        
            if (androidx.compose.foundation.gestures.DragGestureDetectorKt.m264dragjO51t88(r5, r6, r12, r11) == r0) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00d1, code lost:
        
            if (androidx.compose.foundation.gestures.DragGestureDetectorKt.m264dragjO51t88(r5, r6, r8, r11) == r0) goto L34;
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0091  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0074 -> B:35:0x00d4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x008e -> B:35:0x00d4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00b7 -> B:35:0x00d4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00d1 -> B:35:0x00d4). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r12) {
            /*
                Method dump skipped, instruction units count: 215
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0042 -> B:18:0x0045). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object awaitMouseEventDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope r9, kotlin.coroutines.Continuation r10) {
        /*
            boolean r0 = r10 instanceof androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$awaitMouseEventDown$1 r0 = (androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$awaitMouseEventDown$1 r0 = new androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$awaitMouseEventDown$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r9 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r9 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r9
            kotlin.d.b(r10)
            goto L45
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            kotlin.d.b(r10)
        L38:
            androidx.compose.ui.input.pointer.PointerEventPass r10 = androidx.compose.ui.input.pointer.PointerEventPass.Main
            r0.L$0 = r9
            r0.label = r3
            java.lang.Object r10 = r9.awaitPointerEvent(r10, r0)
            if (r10 != r1) goto L45
            return r1
        L45:
            androidx.compose.ui.input.pointer.PointerEvent r10 = (androidx.compose.ui.input.pointer.PointerEvent) r10
            int r2 = r10.getButtons()
            boolean r2 = androidx.compose.ui.input.pointer.PointerEvent_androidKt.m2882isPrimaryPressedaHzCxE(r2)
            if (r2 == 0) goto L38
            java.util.List r2 = r10.getChanges()
            int r4 = r2.size()
            r5 = 0
        L5a:
            if (r5 >= r4) goto L7b
            java.lang.Object r6 = r2.get(r5)
            androidx.compose.ui.input.pointer.PointerInputChange r6 = (androidx.compose.ui.input.pointer.PointerInputChange) r6
            int r7 = r6.getType()
            androidx.compose.ui.input.pointer.PointerType$Companion r8 = androidx.compose.ui.input.pointer.PointerType.INSTANCE
            int r8 = r8.m2969getMouseT8wyACA()
            boolean r7 = androidx.compose.ui.input.pointer.PointerType.m2964equalsimpl0(r7, r8)
            if (r7 == 0) goto L38
            boolean r6 = androidx.compose.ui.input.pointer.PointerEventKt.changedToDown(r6)
            if (r6 == 0) goto L38
            int r5 = r5 + 1
            goto L5a
        L7b:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt.awaitMouseEventDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Nullable
    public static final Object mouseSelectionDetector(@NotNull PointerInputScope pointerInputScope, @NotNull MouseSelectionObserver mouseSelectionObserver, @NotNull Continuation continuation) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new AnonymousClass2(mouseSelectionObserver, null), continuation);
        return objAwaitEachGesture == pf.b.g() ? objAwaitEachGesture : Unit.f93236a;
    }
}
