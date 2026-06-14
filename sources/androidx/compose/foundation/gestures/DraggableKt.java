package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import androidx.compose.ui.input.pointer.util.VelocityTrackerKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Velocity;
import com.appsflyer.AppsFlyerProperties;
import gg.g;
import gg.y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.j;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u001a!\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a©\u0001\u0010\u001a\u001a\u00020\t*\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\r2*\b\u0002\u0010\u0017\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00122*\b\u0002\u0010\u0018\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00122\b\b\u0002\u0010\u0019\u001a\u00020\rø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001aÃ\u0001\u0010\u001a\u001a\u00020\t*\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\r0\u00002\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u001e2*\b\u0002\u0010\u0017\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00122*\b\u0002\u0010\u0018\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00122\b\b\u0002\u0010\u0019\u001a\u00020\rH\u0000ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010 \u001af\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0014\u0018\u00010%*\u00020!2\u0018\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\r0\u00000\"2\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u001e0\"2\u0006\u0010$\u001a\u00020#2\u0006\u0010\f\u001a\u00020\u000bH\u0082@ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001aS\u0010/\u001a\u00020\r*\u00020!2\u0006\u0010(\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020\u00142\u0006\u0010$\u001a\u00020#2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0082@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b-\u0010.\u001aA\u00105\u001a\u00020\r*\u00020!2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00101\u001a\u0002002\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00020\u0000H\u0082@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b3\u00104\u001a!\u00108\u001a\u00020\u0001*\u00020\u00142\u0006\u0010\f\u001a\u00020\u000bH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b6\u00107\u001a!\u00108\u001a\u00020\u0001*\u00020\u001f2\u0006\u0010\f\u001a\u00020\u000bH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b9\u00107\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006:"}, d2 = {"Lkotlin/Function1;", "", "", "onDelta", "Landroidx/compose/foundation/gestures/DraggableState;", "DraggableState", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/foundation/gestures/DraggableState;", "rememberDraggableState", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/DraggableState;", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "startDragImmediately", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/coroutines/Continuation;", "", "onDragStarted", "onDragStopped", "reverseDirection", "draggable", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/DraggableState;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Z)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "canDrag", "Lkotlin/Function0;", "Landroidx/compose/ui/unit/Velocity;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/DraggableState;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Z)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/input/pointer/util/VelocityTracker;", "velocityTracker", "Lkotlin/Pair;", "awaitDownAndSlop", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/ui/input/pointer/util/VelocityTracker;Landroidx/compose/foundation/gestures/Orientation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startEvent", "initialDelta", "Lgg/y;", "Landroidx/compose/foundation/gestures/DragEvent;", AppsFlyerProperties.CHANNEL, "awaitDrag-Su4bsnU", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerInputChange;JLandroidx/compose/ui/input/pointer/util/VelocityTracker;Lgg/y;ZLandroidx/compose/foundation/gestures/Orientation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitDrag", "Landroidx/compose/ui/input/pointer/PointerId;", "pointerId", "onDrag", "onDragOrUp-Axegvzg", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/foundation/gestures/Orientation;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onDragOrUp", "toFloat-3MmeM6k", "(JLandroidx/compose/foundation/gestures/Orientation;)F", "toFloat", "toFloat-sF-c-tU", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class DraggableKt {

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DraggableKt$awaitDownAndSlop$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.DraggableKt", f = "Draggable.kt", l = {316, 325, 478, 528}, m = "awaitDownAndSlop")
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
        float F$0;
        float F$1;
        float F$2;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
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
            return DraggableKt.awaitDownAndSlop(null, null, null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "it", "Landroidx/compose/ui/geometry/Offset;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$1", f = "Draggable.kt", l = {}, m = "invokeSuspend")
    public static final class C14071 extends k implements Function3<CoroutineScope, Offset, Continuation, Object> {
        int label;

        C14071(Continuation continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Offset offset, Continuation continuation) {
            return m285invoked4ec7I(coroutineScope, offset.getPackedValue(), continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke-d-4ec7I, reason: not valid java name */
        public final Object m285invoked4ec7I(@NotNull CoroutineScope coroutineScope, long j10, @Nullable Continuation continuation) {
            return new C14071(continuation).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            pf.b.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            return Unit.f93236a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "it", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$2", f = "Draggable.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends k implements Function3<CoroutineScope, Float, Continuation, Object> {
        int label;

        AnonymousClass2(Continuation continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Float f10, Continuation continuation) {
            return invoke(coroutineScope, f10.floatValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            pf.b.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            return Unit.f93236a;
        }

        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, float f10, @Nullable Continuation continuation) {
            return new AnonymousClass2(continuation).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "velocity", "Landroidx/compose/ui/unit/Velocity;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$5", f = "Draggable.kt", l = {193}, m = "invokeSuspend")
    static final class AnonymousClass5 extends k implements Function3<CoroutineScope, Velocity, Continuation, Object> {
        final /* synthetic */ Function3<CoroutineScope, Float, Continuation, Object> $onDragStopped;
        final /* synthetic */ Orientation $orientation;
        /* synthetic */ long J$0;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass5(Function3<? super CoroutineScope, ? super Float, ? super Continuation, ? extends Object> function3, Orientation orientation, Continuation continuation) {
            super(3, continuation);
            this.$onDragStopped = function3;
            this.$orientation = orientation;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Velocity velocity, Continuation continuation) {
            return m286invokeLuvzFrg(coroutineScope, velocity.getPackedValue(), continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke-LuvzFrg, reason: not valid java name */
        public final Object m286invokeLuvzFrg(@NotNull CoroutineScope coroutineScope, long j10, @Nullable Continuation continuation) {
            AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.$onDragStopped, this.$orientation, continuation);
            anonymousClass5.L$0 = coroutineScope;
            anonymousClass5.J$0 = j10;
            return anonymousClass5.invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.d.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                long j10 = this.J$0;
                Function3<CoroutineScope, Float, Continuation, Object> function3 = this.$onDragStopped;
                Float fC = kotlin.coroutines.jvm.internal.b.c(DraggableKt.m283toFloatsFctU(j10, this.$orientation));
                this.label = 1;
                if (function3.invoke(coroutineScope, fC, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            return Unit.f93236a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$6, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "it", "Landroidx/compose/ui/geometry/Offset;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$6", f = "Draggable.kt", l = {}, m = "invokeSuspend")
    static final class AnonymousClass6 extends k implements Function3<CoroutineScope, Offset, Continuation, Object> {
        int label;

        AnonymousClass6(Continuation continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Offset offset, Continuation continuation) {
            return m287invoked4ec7I(coroutineScope, offset.getPackedValue(), continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke-d-4ec7I, reason: not valid java name */
        public final Object m287invoked4ec7I(@NotNull CoroutineScope coroutineScope, long j10, @Nullable Continuation continuation) {
            return new AnonymousClass6(continuation).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            pf.b.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            return Unit.f93236a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$7, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "it", "Landroidx/compose/ui/unit/Velocity;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$7", f = "Draggable.kt", l = {}, m = "invokeSuspend")
    static final class AnonymousClass7 extends k implements Function3<CoroutineScope, Velocity, Continuation, Object> {
        int label;

        AnonymousClass7(Continuation continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Velocity velocity, Continuation continuation) {
            return m288invokeLuvzFrg(coroutineScope, velocity.getPackedValue(), continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke-LuvzFrg, reason: not valid java name */
        public final Object m288invokeLuvzFrg(@NotNull CoroutineScope coroutineScope, long j10, @Nullable Continuation continuation) {
            return new AnonymousClass7(continuation).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            pf.b.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            return Unit.f93236a;
        }
    }

    @NotNull
    public static final DraggableState DraggableState(@NotNull Function1<? super Float, Unit> onDelta) {
        Intrinsics.checkNotNullParameter(onDelta, "onDelta");
        return new DefaultDraggableState(onDelta);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02f5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f6 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0239 -> B:38:0x0199). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x029f -> B:78:0x02a9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:94:0x02f6 -> B:82:0x02b5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object awaitDownAndSlop(androidx.compose.ui.input.pointer.AwaitPointerEventScope r20, androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Boolean>> r21, androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function0<java.lang.Boolean>> r22, androidx.compose.ui.input.pointer.util.VelocityTracker r23, androidx.compose.foundation.gestures.Orientation r24, kotlin.coroutines.Continuation r25) {
        /*
            Method dump skipped, instruction units count: 770
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt.awaitDownAndSlop(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.runtime.State, androidx.compose.runtime.State, androidx.compose.ui.input.pointer.util.VelocityTracker, androidx.compose.foundation.gestures.Orientation, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: awaitDrag-Su4bsnU, reason: not valid java name */
    public static final Object m280awaitDragSu4bsnU(AwaitPointerEventScope awaitPointerEventScope, PointerInputChange pointerInputChange, long j10, final VelocityTracker velocityTracker, final y yVar, final boolean z10, Orientation orientation, Continuation continuation) {
        yVar.e(new DragEvent.DragStarted(Offset.m1375minusMKHz9U(pointerInputChange.getPosition(), OffsetKt.Offset(Offset.m1371getXimpl(j10) * Math.signum(Offset.m1371getXimpl(pointerInputChange.getPosition())), Offset.m1372getYimpl(j10) * Math.signum(Offset.m1372getYimpl(pointerInputChange.getPosition())))), null));
        yVar.e(new DragEvent.DragDelta(z10 ? Offset.m1378timestuRUvjQ(j10, -1.0f) : j10, null));
        return m281onDragOrUpAxegvzg(awaitPointerEventScope, orientation, pointerInputChange.getId(), new Function1<PointerInputChange, Unit>() { // from class: androidx.compose.foundation.gestures.DraggableKt$awaitDrag$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange2) {
                invoke2(pointerInputChange2);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull PointerInputChange event) {
                Intrinsics.checkNotNullParameter(event, "event");
                VelocityTrackerKt.addPointerInputChange(velocityTracker, event);
                if (PointerEventKt.changedToUpIgnoreConsumed(event)) {
                    return;
                }
                long jPositionChange = PointerEventKt.positionChange(event);
                event.consume();
                y yVar2 = yVar;
                if (z10) {
                    jPositionChange = Offset.m1378timestuRUvjQ(jPositionChange, -1.0f);
                }
                yVar2.e(new DragEvent.DragDelta(jPositionChange, null));
            }
        }, continuation);
    }

    @NotNull
    public static final Modifier draggable(@NotNull Modifier modifier, @NotNull DraggableState state, @NotNull Orientation orientation, boolean z10, @Nullable MutableInteractionSource mutableInteractionSource, final boolean z11, @NotNull Function3<? super CoroutineScope, ? super Offset, ? super Continuation, ? extends Object> onDragStarted, @NotNull Function3<? super CoroutineScope, ? super Float, ? super Continuation, ? extends Object> onDragStopped, boolean z12) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(onDragStarted, "onDragStarted");
        Intrinsics.checkNotNullParameter(onDragStopped, "onDragStopped");
        return draggable(modifier, state, new Function1<PointerInputChange, Boolean>() { // from class: androidx.compose.foundation.gestures.DraggableKt.draggable.3
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull PointerInputChange it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.TRUE;
            }
        }, orientation, z10, mutableInteractionSource, new Function0<Boolean>() { // from class: androidx.compose.foundation.gestures.DraggableKt.draggable.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Boolean invoke() {
                return Boolean.valueOf(z11);
            }
        }, onDragStarted, new AnonymousClass5(onDragStopped, orientation, null), z12);
    }

    public static /* synthetic */ Modifier draggable$default(Modifier modifier, DraggableState draggableState, Orientation orientation, boolean z10, MutableInteractionSource mutableInteractionSource, boolean z11, Function3 function3, Function3 function32, boolean z12, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return draggable(modifier, draggableState, orientation, z10, (i10 & 8) != 0 ? null : mutableInteractionSource, (i10 & 16) != 0 ? false : z11, (i10 & 32) != 0 ? new C14071(null) : function3, (i10 & 64) != 0 ? new AnonymousClass2(null) : function32, (i10 & 128) != 0 ? false : z12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x010a, code lost:
    
        if ((((java.lang.Number) r9.invoke(r14)).floatValue() == 0.0f) == false) goto L55;
     */
    /* JADX WARN: Path cross not found for [B:50:0x00f8, B:39:0x00cf], limit reached: 72 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x008f -> B:27:0x0096). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: onDragOrUp-Axegvzg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m281onDragOrUpAxegvzg(androidx.compose.ui.input.pointer.AwaitPointerEventScope r17, androidx.compose.foundation.gestures.Orientation r18, long r19, kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit> r21, kotlin.coroutines.Continuation r22) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt.m281onDragOrUpAxegvzg(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.gestures.Orientation, long, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Composable
    @NotNull
    public static final DraggableState rememberDraggableState(@NotNull Function1<? super Float, Unit> onDelta, @Nullable Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(onDelta, "onDelta");
        composer.startReplaceableGroup(-183245213);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-183245213, i10, -1, "androidx.compose.foundation.gestures.rememberDraggableState (Draggable.kt:138)");
        }
        final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(onDelta, composer, i10 & 14);
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = DraggableState(new Function1<Float, Unit>() { // from class: androidx.compose.foundation.gestures.DraggableKt$rememberDraggableState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Float f10) {
                    invoke(f10.floatValue());
                    return Unit.f93236a;
                }

                public final void invoke(float f10) {
                    stateRememberUpdatedState.getValue().invoke(Float.valueOf(f10));
                }
            });
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        DraggableState draggableState = (DraggableState) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return draggableState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: toFloat-3MmeM6k, reason: not valid java name */
    public static final float m282toFloat3MmeM6k(long j10, Orientation orientation) {
        return orientation == Orientation.Vertical ? Offset.m1372getYimpl(j10) : Offset.m1371getXimpl(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: toFloat-sF-c-tU, reason: not valid java name */
    public static final float m283toFloatsFctU(long j10, Orientation orientation) {
        return orientation == Orientation.Vertical ? Velocity.m4177getYimpl(j10) : Velocity.m4176getXimpl(j10);
    }

    @NotNull
    public static final Modifier draggable(@NotNull Modifier modifier, @NotNull final DraggableState state, @NotNull final Function1<? super PointerInputChange, Boolean> canDrag, @NotNull final Orientation orientation, final boolean z10, @Nullable final MutableInteractionSource mutableInteractionSource, @NotNull final Function0<Boolean> startDragImmediately, @NotNull final Function3<? super CoroutineScope, ? super Offset, ? super Continuation, ? extends Object> onDragStarted, @NotNull final Function3<? super CoroutineScope, ? super Velocity, ? super Continuation, ? extends Object> onDragStopped, final boolean z11) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(canDrag, "canDrag");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(startDragImmediately, "startDragImmediately");
        Intrinsics.checkNotNullParameter(onDragStarted, "onDragStarted");
        Intrinsics.checkNotNullParameter(onDragStopped, "onDragStopped");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.gestures.DraggableKt$draggable$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("draggable");
                inspectorInfo.getProperties().set("canDrag", canDrag);
                inspectorInfo.getProperties().set("orientation", orientation);
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z10));
                inspectorInfo.getProperties().set("reverseDirection", Boolean.valueOf(z11));
                inspectorInfo.getProperties().set("interactionSource", mutableInteractionSource);
                inspectorInfo.getProperties().set("startDragImmediately", startDragImmediately);
                inspectorInfo.getProperties().set("onDragStarted", onDragStarted);
                inspectorInfo.getProperties().set("onDragStopped", onDragStopped);
                inspectorInfo.getProperties().set("state", state);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.gestures.DraggableKt.draggable.9

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$9$2, reason: invalid class name */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$2", f = "Draggable.kt", l = {239, 241, 243, 251, 253, 257}, m = "invokeSuspend")
            static final class AnonymousClass2 extends k implements Function2<CoroutineScope, Continuation, Object> {
                final /* synthetic */ g $channel;
                final /* synthetic */ State<DragLogic> $dragLogic$delegate;
                final /* synthetic */ Orientation $orientation;
                final /* synthetic */ DraggableState $state;
                private /* synthetic */ Object L$0;
                Object L$1;
                Object L$2;
                int label;

                /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$9$2$2, reason: invalid class name and collision with other inner class name */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$2$2", f = "Draggable.kt", l = {246}, m = "invokeSuspend")
                static final class C00282 extends k implements Function2<DragScope, Continuation, Object> {
                    final /* synthetic */ g $channel;
                    final /* synthetic */ Ref$ObjectRef $event;
                    final /* synthetic */ Orientation $orientation;
                    private /* synthetic */ Object L$0;
                    Object L$1;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C00282(Ref$ObjectRef ref$ObjectRef, g gVar, Orientation orientation, Continuation continuation) {
                        super(2, continuation);
                        this.$event = ref$ObjectRef;
                        this.$channel = gVar;
                        this.$orientation = orientation;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @NotNull
                    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                        C00282 c00282 = new C00282(this.$event, this.$channel, this.$orientation, continuation);
                        c00282.L$0 = obj;
                        return c00282;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    @Nullable
                    public final Object invoke(@NotNull DragScope dragScope, @Nullable Continuation continuation) {
                        return ((C00282) create(dragScope, continuation)).invokeSuspend(Unit.f93236a);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0058 -> B:22:0x005b). Please report as a decompilation issue!!! */
                    @Override // kotlin.coroutines.jvm.internal.a
                    @org.jetbrains.annotations.Nullable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
                        /*
                            r6 = this;
                            java.lang.Object r0 = pf.b.g()
                            int r1 = r6.label
                            r2 = 1
                            if (r1 == 0) goto L1f
                            if (r1 != r2) goto L17
                            java.lang.Object r1 = r6.L$1
                            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref$ObjectRef) r1
                            java.lang.Object r3 = r6.L$0
                            androidx.compose.foundation.gestures.DragScope r3 = (androidx.compose.foundation.gestures.DragScope) r3
                            kotlin.d.b(r7)
                            goto L5b
                        L17:
                            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r7.<init>(r0)
                            throw r7
                        L1f:
                            kotlin.d.b(r7)
                            java.lang.Object r7 = r6.L$0
                            androidx.compose.foundation.gestures.DragScope r7 = (androidx.compose.foundation.gestures.DragScope) r7
                            r3 = r7
                        L27:
                            kotlin.jvm.internal.Ref$ObjectRef r7 = r6.$event
                            java.lang.Object r7 = r7.f93280b
                            boolean r1 = r7 instanceof androidx.compose.foundation.gestures.DragEvent.DragStopped
                            if (r1 != 0) goto L5e
                            boolean r1 = r7 instanceof androidx.compose.foundation.gestures.DragEvent.DragCancelled
                            if (r1 != 0) goto L5e
                            boolean r1 = r7 instanceof androidx.compose.foundation.gestures.DragEvent.DragDelta
                            if (r1 == 0) goto L3a
                            androidx.compose.foundation.gestures.DragEvent$DragDelta r7 = (androidx.compose.foundation.gestures.DragEvent.DragDelta) r7
                            goto L3b
                        L3a:
                            r7 = 0
                        L3b:
                            if (r7 == 0) goto L4a
                            androidx.compose.foundation.gestures.Orientation r1 = r6.$orientation
                            long r4 = r7.getDelta()
                            float r7 = androidx.compose.foundation.gestures.DraggableKt.m278access$toFloat3MmeM6k(r4, r1)
                            r3.dragBy(r7)
                        L4a:
                            kotlin.jvm.internal.Ref$ObjectRef r1 = r6.$event
                            gg.g r7 = r6.$channel
                            r6.L$0 = r3
                            r6.L$1 = r1
                            r6.label = r2
                            java.lang.Object r7 = r7.k(r6)
                            if (r7 != r0) goto L5b
                            return r0
                        L5b:
                            r1.f93280b = r7
                            goto L27
                        L5e:
                            kotlin.Unit r7 = kotlin.Unit.f93236a
                            return r7
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt.AnonymousClass9.AnonymousClass2.C00282.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(g gVar, DraggableState draggableState, State<DragLogic> state, Orientation orientation, Continuation continuation) {
                    super(2, continuation);
                    this.$channel = gVar;
                    this.$state = draggableState;
                    this.$dragLogic$delegate = state;
                    this.$orientation = orientation;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @NotNull
                public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$channel, this.$state, this.$dragLogic$delegate, this.$orientation, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                /* JADX WARN: Code restructure failed: missing block: B:43:0x00f6, code lost:
                
                    if (r9.processDragCancel(r3, r8) == r0) goto L48;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:47:0x010d, code lost:
                
                    if (r9.processDragCancel(r1, r8) == r0) goto L48;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:57:0x00e4, code lost:
                
                    r1 = r3;
                 */
                /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
                /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
                /* JADX WARN: Removed duplicated region for block: B:32:0x00c1  */
                /* JADX WARN: Removed duplicated region for block: B:33:0x00c2 A[Catch: CancellationException -> 0x0036, PHI: r1 r3
  0x00c2: PHI (r1v14 kotlin.jvm.internal.Ref$ObjectRef) = (r1v6 kotlin.jvm.internal.Ref$ObjectRef), (r1v21 kotlin.jvm.internal.Ref$ObjectRef) binds: [B:12:0x0031, B:31:0x00bf] A[DONT_GENERATE, DONT_INLINE]
  0x00c2: PHI (r3v8 kotlinx.coroutines.CoroutineScope) = (r3v5 kotlinx.coroutines.CoroutineScope), (r3v9 kotlinx.coroutines.CoroutineScope) binds: [B:12:0x0031, B:31:0x00bf] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {CancellationException -> 0x0036, blocks: (B:30:0x00a7, B:33:0x00c2, B:35:0x00ce, B:40:0x00e7, B:42:0x00eb, B:12:0x0031), top: B:55:0x0031 }] */
                /* JADX WARN: Removed duplicated region for block: B:35:0x00ce A[Catch: CancellationException -> 0x0036, TryCatch #1 {CancellationException -> 0x0036, blocks: (B:30:0x00a7, B:33:0x00c2, B:35:0x00ce, B:40:0x00e7, B:42:0x00eb, B:12:0x0031), top: B:55:0x0031 }] */
                /* JADX WARN: Removed duplicated region for block: B:40:0x00e7 A[Catch: CancellationException -> 0x0036, TryCatch #1 {CancellationException -> 0x0036, blocks: (B:30:0x00a7, B:33:0x00c2, B:35:0x00ce, B:40:0x00e7, B:42:0x00eb, B:12:0x0031), top: B:55:0x0031 }] */
                /* JADX WARN: Removed duplicated region for block: B:49:0x0110  */
                /* JADX WARN: Removed duplicated region for block: B:50:0x0113  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00f9 -> B:18:0x005c). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x010d -> B:39:0x00e4). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0110 -> B:18:0x005c). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.a
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r9) {
                    /*
                        Method dump skipped, instruction units count: 296
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt.AnonymousClass9.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                    return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
                }
            }

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$9$3, reason: invalid class name */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$3", f = "Draggable.kt", l = {263}, m = "invokeSuspend")
            static final class AnonymousClass3 extends k implements Function2<PointerInputScope, Continuation, Object> {
                final /* synthetic */ State<Function1<PointerInputChange, Boolean>> $canDragState;
                final /* synthetic */ g $channel;
                final /* synthetic */ boolean $enabled;
                final /* synthetic */ Orientation $orientation;
                final /* synthetic */ boolean $reverseDirection;
                final /* synthetic */ State<Function0<Boolean>> $startImmediatelyState;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1", f = "Draggable.kt", l = {265}, m = "invokeSuspend")
                static final class AnonymousClass1 extends k implements Function2<CoroutineScope, Continuation, Object> {
                    final /* synthetic */ PointerInputScope $$this$pointerInput;
                    final /* synthetic */ State<Function1<PointerInputChange, Boolean>> $canDragState;
                    final /* synthetic */ g $channel;
                    final /* synthetic */ Orientation $orientation;
                    final /* synthetic */ boolean $reverseDirection;
                    final /* synthetic */ State<Function0<Boolean>> $startImmediatelyState;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1$1, reason: invalid class name and collision with other inner class name */
                    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1$1", f = "Draggable.kt", l = {268, 276}, m = "invokeSuspend")
                    static final class C00291 extends j implements Function2<AwaitPointerEventScope, Continuation, Object> {
                        final /* synthetic */ CoroutineScope $$this$coroutineScope;
                        final /* synthetic */ State<Function1<PointerInputChange, Boolean>> $canDragState;
                        final /* synthetic */ g $channel;
                        final /* synthetic */ Orientation $orientation;
                        final /* synthetic */ boolean $reverseDirection;
                        final /* synthetic */ State<Function0<Boolean>> $startImmediatelyState;
                        int I$0;
                        private /* synthetic */ Object L$0;
                        Object L$1;
                        Object L$2;
                        Object L$3;
                        boolean Z$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        C00291(CoroutineScope coroutineScope, State<? extends Function1<? super PointerInputChange, Boolean>> state, State<? extends Function0<Boolean>> state2, Orientation orientation, g gVar, boolean z10, Continuation continuation) {
                            super(2, continuation);
                            this.$$this$coroutineScope = coroutineScope;
                            this.$canDragState = state;
                            this.$startImmediatelyState = state2;
                            this.$orientation = orientation;
                            this.$channel = gVar;
                            this.$reverseDirection = z10;
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        @NotNull
                        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                            C00291 c00291 = new C00291(this.$$this$coroutineScope, this.$canDragState, this.$startImmediatelyState, this.$orientation, this.$channel, this.$reverseDirection, continuation);
                            c00291.L$0 = obj;
                            return c00291;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        @Nullable
                        public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable Continuation continuation) {
                            return ((C00291) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.f93236a);
                        }

                        /* JADX WARN: Can't wrap try/catch for region: R(10:6|(3:76|7|8)|78|32|(3:34|(1:36)(1:37)|38)(1:39)|40|41|57|17|(3:19|(3:22|23|(7:25|74|26|27|80|28|(9:31|78|32|(0)(0)|40|41|57|17|(2:70|71)(0)))(3:69|17|(0)(0)))|30)(0)) */
                        /* JADX WARN: Can't wrap try/catch for region: R(7:25|(1:74)|26|27|80|28|(9:31|78|32|(0)(0)|40|41|57|17|(2:70|71)(0))) */
                        /* JADX WARN: Code restructure failed: missing block: B:42:0x00e9, code lost:
                        
                            r0 = th;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:43:0x00ea, code lost:
                        
                            r14 = r1;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:44:0x00ec, code lost:
                        
                            r0 = e;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:46:0x00ee, code lost:
                        
                            r0 = th;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:47:0x00ef, code lost:
                        
                            r4 = r6;
                            r2 = r7;
                            r7 = r5;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:48:0x00f3, code lost:
                        
                            r0 = e;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:49:0x00f4, code lost:
                        
                            r8 = r1;
                            r4 = r6;
                            r2 = r7;
                            r3 = r16;
                            r7 = r5;
                         */
                        /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
                        /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
                        /* JADX WARN: Removed duplicated region for block: B:34:0x00ce  */
                        /* JADX WARN: Removed duplicated region for block: B:39:0x00e2  */
                        /* JADX WARN: Removed duplicated region for block: B:56:0x010c  */
                        /* JADX WARN: Removed duplicated region for block: B:58:0x0117 A[Catch: all -> 0x0118, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0118, blocks: (B:54:0x0106, B:58:0x0117), top: B:72:0x0106 }] */
                        /* JADX WARN: Removed duplicated region for block: B:61:0x011b  */
                        /* JADX WARN: Removed duplicated region for block: B:66:0x012e  */
                        /* JADX WARN: Removed duplicated region for block: B:69:0x0134  */
                        /* JADX WARN: Removed duplicated region for block: B:70:0x013a  */
                        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00bf -> B:78:0x00c6). Please report as a decompilation issue!!! */
                        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x010c -> B:41:0x00e7). Please report as a decompilation issue!!! */
                        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x0134 -> B:17:0x005c). Please report as a decompilation issue!!! */
                        @Override // kotlin.coroutines.jvm.internal.a
                        @org.jetbrains.annotations.Nullable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r20) throws java.lang.Throwable {
                            /*
                                Method dump skipped, instruction units count: 317
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt.AnonymousClass9.AnonymousClass3.AnonymousClass1.C00291.invokeSuspend(java.lang.Object):java.lang.Object");
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass1(PointerInputScope pointerInputScope, State<? extends Function1<? super PointerInputChange, Boolean>> state, State<? extends Function0<Boolean>> state2, Orientation orientation, g gVar, boolean z10, Continuation continuation) {
                        super(2, continuation);
                        this.$$this$pointerInput = pointerInputScope;
                        this.$canDragState = state;
                        this.$startImmediatelyState = state2;
                        this.$orientation = orientation;
                        this.$channel = gVar;
                        this.$reverseDirection = z10;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @NotNull
                    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$pointerInput, this.$canDragState, this.$startImmediatelyState, this.$orientation, this.$channel, this.$reverseDirection, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
                    @Override // kotlin.coroutines.jvm.internal.a
                    @org.jetbrains.annotations.Nullable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r12) {
                        /*
                            r11 = this;
                            java.lang.Object r0 = pf.b.g()
                            int r1 = r11.label
                            r2 = 1
                            if (r1 == 0) goto L1f
                            if (r1 != r2) goto L17
                            java.lang.Object r0 = r11.L$0
                            r1 = r0
                            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                            kotlin.d.b(r12)     // Catch: java.util.concurrent.CancellationException -> L14
                            goto L4d
                        L14:
                            r0 = move-exception
                            r12 = r0
                            goto L47
                        L17:
                            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r12.<init>(r0)
                            throw r12
                        L1f:
                            kotlin.d.b(r12)
                            java.lang.Object r12 = r11.L$0
                            r4 = r12
                            kotlinx.coroutines.CoroutineScope r4 = (kotlinx.coroutines.CoroutineScope) r4
                            androidx.compose.ui.input.pointer.PointerInputScope r12 = r11.$$this$pointerInput     // Catch: java.util.concurrent.CancellationException -> L44
                            androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1$1 r3 = new androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1$1     // Catch: java.util.concurrent.CancellationException -> L44
                            androidx.compose.runtime.State<kotlin.jvm.functions.Function1<androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Boolean>> r5 = r11.$canDragState     // Catch: java.util.concurrent.CancellationException -> L44
                            androidx.compose.runtime.State<kotlin.jvm.functions.Function0<java.lang.Boolean>> r6 = r11.$startImmediatelyState     // Catch: java.util.concurrent.CancellationException -> L44
                            androidx.compose.foundation.gestures.Orientation r7 = r11.$orientation     // Catch: java.util.concurrent.CancellationException -> L44
                            gg.g r8 = r11.$channel     // Catch: java.util.concurrent.CancellationException -> L44
                            boolean r9 = r11.$reverseDirection     // Catch: java.util.concurrent.CancellationException -> L44
                            r10 = 0
                            r3.<init>(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.util.concurrent.CancellationException -> L44
                            r11.L$0 = r4     // Catch: java.util.concurrent.CancellationException -> L44
                            r11.label = r2     // Catch: java.util.concurrent.CancellationException -> L44
                            java.lang.Object r12 = r12.awaitPointerEventScope(r3, r11)     // Catch: java.util.concurrent.CancellationException -> L44
                            if (r12 != r0) goto L4d
                            return r0
                        L44:
                            r0 = move-exception
                            r12 = r0
                            r1 = r4
                        L47:
                            boolean r0 = kotlinx.coroutines.i.i(r1)
                            if (r0 == 0) goto L50
                        L4d:
                            kotlin.Unit r12 = kotlin.Unit.f93236a
                            return r12
                        L50:
                            throw r12
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt.AnonymousClass9.AnonymousClass3.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                    }

                    @Override // kotlin.jvm.functions.Function2
                    @Nullable
                    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass3(boolean z10, State<? extends Function1<? super PointerInputChange, Boolean>> state, State<? extends Function0<Boolean>> state2, Orientation orientation, g gVar, boolean z11, Continuation continuation) {
                    super(2, continuation);
                    this.$enabled = z10;
                    this.$canDragState = state;
                    this.$startImmediatelyState = state2;
                    this.$orientation = orientation;
                    this.$channel = gVar;
                    this.$reverseDirection = z11;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @NotNull
                public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$enabled, this.$canDragState, this.$startImmediatelyState, this.$orientation, this.$channel, this.$reverseDirection, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation continuation) {
                    return ((AnonymousClass3) create(pointerInputScope, continuation)).invokeSuspend(Unit.f93236a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object objG = pf.b.g();
                    int i10 = this.label;
                    if (i10 == 0) {
                        kotlin.d.b(obj);
                        PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                        if (!this.$enabled) {
                            return Unit.f93236a;
                        }
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(pointerInputScope, this.$canDragState, this.$startImmediatelyState, this.$orientation, this.$channel, this.$reverseDirection, null);
                        this.label = 1;
                        if (i.g(anonymousClass1, this) == objG) {
                            return objG;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.d.b(obj);
                    }
                    return Unit.f93236a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final DragLogic invoke$lambda$3(State<DragLogic> state2) {
                return state2.getValue();
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i10) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(597193710);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(597193710, i10, -1, "androidx.compose.foundation.gestures.draggable.<anonymous> (Draggable.kt:220)");
                }
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                final MutableState mutableState = (MutableState) objRememberedValue;
                final MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
                composer.startReplaceableGroup(511388516);
                boolean zChanged = composer.changed(mutableState) | composer.changed(mutableInteractionSource2);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.gestures.DraggableKt$draggable$9$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        @NotNull
                        public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                            final MutableState<DragInteraction.Start> mutableState2 = mutableState;
                            final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
                            return new DisposableEffectResult() { // from class: androidx.compose.foundation.gestures.DraggableKt$draggable$9$1$1$invoke$$inlined$onDispose$1
                                @Override // androidx.compose.runtime.DisposableEffectResult
                                public void dispose() {
                                    DragInteraction.Start start = (DragInteraction.Start) mutableState2.getValue();
                                    if (start != null) {
                                        MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource3;
                                        if (mutableInteractionSource4 != null) {
                                            mutableInteractionSource4.tryEmit(new DragInteraction.Cancel(start));
                                        }
                                        mutableState2.setValue(null);
                                    }
                                }
                            };
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceableGroup();
                EffectsKt.DisposableEffect(mutableInteractionSource2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer, 0);
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue3 = composer.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = gg.j.b(Integer.MAX_VALUE, null, null, 6, null);
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceableGroup();
                g gVar = (g) objRememberedValue3;
                State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(startDragImmediately, composer, 0);
                State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(canDrag, composer, 0);
                State stateRememberUpdatedState3 = SnapshotStateKt.rememberUpdatedState(new DragLogic(onDragStarted, onDragStopped, mutableState, mutableInteractionSource), composer, 8);
                DraggableState draggableState = state;
                EffectsKt.LaunchedEffect(draggableState, new AnonymousClass2(gVar, draggableState, stateRememberUpdatedState3, orientation, null), composer, 64);
                Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput((Modifier) Modifier.INSTANCE, new Object[]{orientation, Boolean.valueOf(z10), Boolean.valueOf(z11)}, (Function2<? super PointerInputScope, ? super Continuation, ? extends Object>) new AnonymousClass3(z10, stateRememberUpdatedState2, stateRememberUpdatedState, orientation, gVar, z11, null));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierPointerInput;
            }
        });
    }
}
