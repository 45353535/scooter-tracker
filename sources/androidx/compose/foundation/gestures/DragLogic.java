package androidx.compose.foundation.gestures;

import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001B{\u0012(\u0010\u0007\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012(\u0010\t\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\rø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0011H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0015H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u0006*\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019R?\u0010\u0007\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0006ø\u0001\u0000ø\u0001\u0000¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR?\u0010\t\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0006ø\u0001\u0000ø\u0001\u0000¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010!\u001a\u0004\b\"\u0010#\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"Landroidx/compose/foundation/gestures/DragLogic;", "", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/coroutines/Continuation;", "", "onDragStarted", "Landroidx/compose/ui/unit/Velocity;", "onDragStopped", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/foundation/interaction/DragInteraction$Start;", "dragStartInteraction", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "<init>", "(Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/MutableState;Landroidx/compose/foundation/interaction/MutableInteractionSource;)V", "Landroidx/compose/foundation/gestures/DragEvent$DragStarted;", "event", "processDragStart", "(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/foundation/gestures/DragEvent$DragStarted;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/foundation/gestures/DragEvent$DragStopped;", "processDragStop", "(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/foundation/gestures/DragEvent$DragStopped;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processDragCancel", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/jvm/functions/Function3;", "getOnDragStarted", "()Lkotlin/jvm/functions/Function3;", "getOnDragStopped", "Landroidx/compose/runtime/MutableState;", "getDragStartInteraction", "()Landroidx/compose/runtime/MutableState;", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class DragLogic {

    @NotNull
    private final MutableState<DragInteraction.Start> dragStartInteraction;

    @Nullable
    private final MutableInteractionSource interactionSource;

    @NotNull
    private final Function3<CoroutineScope, Offset, Continuation, Object> onDragStarted;

    @NotNull
    private final Function3<CoroutineScope, Velocity, Continuation, Object> onDragStopped;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragLogic$processDragCancel$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.DragLogic", f = "Draggable.kt", l = {TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE, TypedValues.CycleType.TYPE_WAVE_PHASE}, m = "processDragCancel")
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
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
            return DragLogic.this.processDragCancel(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragLogic$processDragStart$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.DragLogic", f = "Draggable.kt", l = {404, 407, 409}, m = "processDragStart")
    static final class C14051 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C14051(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DragLogic.this.processDragStart(null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragLogic$processDragStop$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.DragLogic", f = "Draggable.kt", l = {TTAdConstant.VIDEO_URL_CODE, TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME}, m = "processDragStop")
    static final class C14061 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C14061(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DragLogic.this.processDragStop(null, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DragLogic(@NotNull Function3<? super CoroutineScope, ? super Offset, ? super Continuation, ? extends Object> onDragStarted, @NotNull Function3<? super CoroutineScope, ? super Velocity, ? super Continuation, ? extends Object> onDragStopped, @NotNull MutableState<DragInteraction.Start> dragStartInteraction, @Nullable MutableInteractionSource mutableInteractionSource) {
        Intrinsics.checkNotNullParameter(onDragStarted, "onDragStarted");
        Intrinsics.checkNotNullParameter(onDragStopped, "onDragStopped");
        Intrinsics.checkNotNullParameter(dragStartInteraction, "dragStartInteraction");
        this.onDragStarted = onDragStarted;
        this.onDragStopped = onDragStopped;
        this.dragStartInteraction = dragStartInteraction;
        this.interactionSource = mutableInteractionSource;
    }

    @NotNull
    public final MutableState<DragInteraction.Start> getDragStartInteraction() {
        return this.dragStartInteraction;
    }

    @Nullable
    public final MutableInteractionSource getInteractionSource() {
        return this.interactionSource;
    }

    @NotNull
    public final Function3<CoroutineScope, Offset, Continuation, Object> getOnDragStarted() {
        return this.onDragStarted;
    }

    @NotNull
    public final Function3<CoroutineScope, Velocity, Continuation, Object> getOnDragStopped() {
        return this.onDragStopped;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        if (r2.emit(r6, r0) == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0082, code lost:
    
        if (r10.invoke(r9, r2, r0) != r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0084, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object processDragCancel(@org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineScope r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.DragLogic.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.foundation.gestures.DragLogic$processDragCancel$1 r0 = (androidx.compose.foundation.gestures.DragLogic.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.DragLogic$processDragCancel$1 r0 = new androidx.compose.foundation.gestures.DragLogic$processDragCancel$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L41
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.d.b(r10)
            goto L85
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            java.lang.Object r9 = r0.L$1
            kotlinx.coroutines.CoroutineScope r9 = (kotlinx.coroutines.CoroutineScope) r9
            java.lang.Object r2 = r0.L$0
            androidx.compose.foundation.gestures.DragLogic r2 = (androidx.compose.foundation.gestures.DragLogic) r2
            kotlin.d.b(r10)
            goto L65
        L41:
            kotlin.d.b(r10)
            androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.DragInteraction$Start> r10 = r8.dragStartInteraction
            java.lang.Object r10 = r10.getValue()
            androidx.compose.foundation.interaction.DragInteraction$Start r10 = (androidx.compose.foundation.interaction.DragInteraction.Start) r10
            if (r10 == 0) goto L6b
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = r8.interactionSource
            if (r2 == 0) goto L64
            androidx.compose.foundation.interaction.DragInteraction$Cancel r6 = new androidx.compose.foundation.interaction.DragInteraction$Cancel
            r6.<init>(r10)
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r4
            java.lang.Object r10 = r2.emit(r6, r0)
            if (r10 != r1) goto L64
            goto L84
        L64:
            r2 = r8
        L65:
            androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.DragInteraction$Start> r10 = r2.dragStartInteraction
            r10.setValue(r5)
            goto L6c
        L6b:
            r2 = r8
        L6c:
            kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, androidx.compose.ui.unit.Velocity, kotlin.coroutines.Continuation, java.lang.Object> r10 = r2.onDragStopped
            androidx.compose.ui.unit.Velocity$Companion r2 = androidx.compose.ui.unit.Velocity.INSTANCE
            long r6 = r2.m4187getZero9UxMQ8M()
            androidx.compose.ui.unit.Velocity r2 = androidx.compose.ui.unit.Velocity.m4167boximpl(r6)
            r0.L$0 = r5
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r9 = r10.invoke(r9, r2, r0)
            if (r9 != r1) goto L85
        L84:
            return r1
        L85:
            kotlin.Unit r9 = kotlin.Unit.f93236a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragLogic.processDragCancel(kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007f, code lost:
    
        if (r2.emit(r6, r0) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c1, code lost:
    
        if (r10.invoke(r8, r9, r0) == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object processDragStart(@org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineScope r8, @org.jetbrains.annotations.NotNull androidx.compose.foundation.gestures.DragEvent.DragStarted r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.DragLogic.C14051
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.foundation.gestures.DragLogic$processDragStart$1 r0 = (androidx.compose.foundation.gestures.DragLogic.C14051) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.DragLogic$processDragStart$1 r0 = new androidx.compose.foundation.gestures.DragLogic$processDragStart$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L5d
            if (r2 == r5) goto L4c
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            kotlin.d.b(r10)
            goto Lc4
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            java.lang.Object r8 = r0.L$3
            androidx.compose.foundation.interaction.DragInteraction$Start r8 = (androidx.compose.foundation.interaction.DragInteraction.Start) r8
            java.lang.Object r9 = r0.L$2
            androidx.compose.foundation.gestures.DragEvent$DragStarted r9 = (androidx.compose.foundation.gestures.DragEvent.DragStarted) r9
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.CoroutineScope r2 = (kotlinx.coroutines.CoroutineScope) r2
            java.lang.Object r4 = r0.L$0
            androidx.compose.foundation.gestures.DragLogic r4 = (androidx.compose.foundation.gestures.DragLogic) r4
            kotlin.d.b(r10)
            goto La0
        L4c:
            java.lang.Object r8 = r0.L$2
            r9 = r8
            androidx.compose.foundation.gestures.DragEvent$DragStarted r9 = (androidx.compose.foundation.gestures.DragEvent.DragStarted) r9
            java.lang.Object r8 = r0.L$1
            kotlinx.coroutines.CoroutineScope r8 = (kotlinx.coroutines.CoroutineScope) r8
            java.lang.Object r2 = r0.L$0
            androidx.compose.foundation.gestures.DragLogic r2 = (androidx.compose.foundation.gestures.DragLogic) r2
            kotlin.d.b(r10)
            goto L83
        L5d:
            kotlin.d.b(r10)
            androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.DragInteraction$Start> r10 = r7.dragStartInteraction
            java.lang.Object r10 = r10.getValue()
            androidx.compose.foundation.interaction.DragInteraction$Start r10 = (androidx.compose.foundation.interaction.DragInteraction.Start) r10
            if (r10 == 0) goto L82
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = r7.interactionSource
            if (r2 == 0) goto L82
            androidx.compose.foundation.interaction.DragInteraction$Cancel r6 = new androidx.compose.foundation.interaction.DragInteraction$Cancel
            r6.<init>(r10)
            r0.L$0 = r7
            r0.L$1 = r8
            r0.L$2 = r9
            r0.label = r5
            java.lang.Object r10 = r2.emit(r6, r0)
            if (r10 != r1) goto L82
            goto Lc3
        L82:
            r2 = r7
        L83:
            androidx.compose.foundation.interaction.DragInteraction$Start r10 = new androidx.compose.foundation.interaction.DragInteraction$Start
            r10.<init>()
            androidx.compose.foundation.interaction.MutableInteractionSource r5 = r2.interactionSource
            if (r5 == 0) goto La3
            r0.L$0 = r2
            r0.L$1 = r8
            r0.L$2 = r9
            r0.L$3 = r10
            r0.label = r4
            java.lang.Object r4 = r5.emit(r10, r0)
            if (r4 != r1) goto L9d
            goto Lc3
        L9d:
            r4 = r2
            r2 = r8
            r8 = r10
        La0:
            r10 = r8
            r8 = r2
            r2 = r4
        La3:
            androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.DragInteraction$Start> r4 = r2.dragStartInteraction
            r4.setValue(r10)
            kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, androidx.compose.ui.geometry.Offset, kotlin.coroutines.Continuation, java.lang.Object> r10 = r2.onDragStarted
            long r4 = r9.getStartPoint()
            androidx.compose.ui.geometry.Offset r9 = androidx.compose.ui.geometry.Offset.m1360boximpl(r4)
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.L$2 = r2
            r0.L$3 = r2
            r0.label = r3
            java.lang.Object r8 = r10.invoke(r8, r9, r0)
            if (r8 != r1) goto Lc4
        Lc3:
            return r1
        Lc4:
            kotlin.Unit r8 = kotlin.Unit.f93236a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragLogic.processDragStart(kotlinx.coroutines.CoroutineScope, androidx.compose.foundation.gestures.DragEvent$DragStarted, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0068, code lost:
    
        if (r2.emit(r6, r0) == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0089, code lost:
    
        if (r11.invoke(r9, r10, r0) != r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008b, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object processDragStop(@org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineScope r9, @org.jetbrains.annotations.NotNull androidx.compose.foundation.gestures.DragEvent.DragStopped r10, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof androidx.compose.foundation.gestures.DragLogic.C14061
            if (r0 == 0) goto L13
            r0 = r11
            androidx.compose.foundation.gestures.DragLogic$processDragStop$1 r0 = (androidx.compose.foundation.gestures.DragLogic.C14061) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.DragLogic$processDragStop$1 r0 = new androidx.compose.foundation.gestures.DragLogic$processDragStop$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L46
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.d.b(r11)
            goto L8c
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            java.lang.Object r9 = r0.L$2
            r10 = r9
            androidx.compose.foundation.gestures.DragEvent$DragStopped r10 = (androidx.compose.foundation.gestures.DragEvent.DragStopped) r10
            java.lang.Object r9 = r0.L$1
            kotlinx.coroutines.CoroutineScope r9 = (kotlinx.coroutines.CoroutineScope) r9
            java.lang.Object r2 = r0.L$0
            androidx.compose.foundation.gestures.DragLogic r2 = (androidx.compose.foundation.gestures.DragLogic) r2
            kotlin.d.b(r11)
            goto L6c
        L46:
            kotlin.d.b(r11)
            androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.DragInteraction$Start> r11 = r8.dragStartInteraction
            java.lang.Object r11 = r11.getValue()
            androidx.compose.foundation.interaction.DragInteraction$Start r11 = (androidx.compose.foundation.interaction.DragInteraction.Start) r11
            if (r11 == 0) goto L72
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = r8.interactionSource
            if (r2 == 0) goto L6b
            androidx.compose.foundation.interaction.DragInteraction$Stop r6 = new androidx.compose.foundation.interaction.DragInteraction$Stop
            r6.<init>(r11)
            r0.L$0 = r8
            r0.L$1 = r9
            r0.L$2 = r10
            r0.label = r4
            java.lang.Object r11 = r2.emit(r6, r0)
            if (r11 != r1) goto L6b
            goto L8b
        L6b:
            r2 = r8
        L6c:
            androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.DragInteraction$Start> r11 = r2.dragStartInteraction
            r11.setValue(r5)
            goto L73
        L72:
            r2 = r8
        L73:
            kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, androidx.compose.ui.unit.Velocity, kotlin.coroutines.Continuation, java.lang.Object> r11 = r2.onDragStopped
            long r6 = r10.getVelocity()
            androidx.compose.ui.unit.Velocity r10 = androidx.compose.ui.unit.Velocity.m4167boximpl(r6)
            r0.L$0 = r5
            r0.L$1 = r5
            r0.L$2 = r5
            r0.label = r3
            java.lang.Object r9 = r11.invoke(r9, r10, r0)
            if (r9 != r1) goto L8c
        L8b:
            return r1
        L8c:
            kotlin.Unit r9 = kotlin.Unit.f93236a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragLogic.processDragStop(kotlinx.coroutines.CoroutineScope, androidx.compose.foundation.gestures.DragEvent$DragStopped, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
