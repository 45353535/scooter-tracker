package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aA\u0010\n\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003H\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u001a9\u0010\u0010\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u000bH\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a'\u0010\u0013\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001aj\u0010\u0019\u001a\u00020\u0006*\u00020\u00142\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u000b2\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00162\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u00162\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003H\u0086@ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001aj\u0010\u001b\u001a\u00020\u0006*\u00020\u00142\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u000b2\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00162\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u00162\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003H\u0086@ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001a\u001aA\u0010\u001e\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00060\u0003H\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\t\u001aI\u0010#\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u001f2\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00060\u0003H\u0080@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b!\u0010\"\u001a9\u0010%\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u000bH\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b$\u0010\u000f\u001a'\u0010'\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b&\u0010\u0012\u001aj\u0010)\u001a\u00020\u0006*\u00020\u00142\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u000b2\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00162\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u00162\u0018\u0010(\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00060\u0003H\u0086@ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b)\u0010\u001a\u001aA\u0010+\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00060\u0003H\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b*\u0010\t\u001aI\u0010.\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u001f2\u0018\u0010,\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00060\u0003H\u0080@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b-\u0010\"\u001a9\u00100\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u000bH\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b/\u0010\u000f\u001a'\u00102\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b1\u0010\u0012\u001aj\u00104\u001a\u00020\u0006*\u00020\u00142\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u000b2\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00162\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u00162\u0018\u00103\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00060\u0003H\u0086@ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b4\u0010\u001a\u001ac\u0010\u0010\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u000b2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001c0\u000b2\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\u000bH\u0080Hø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b7\u00108\u001a;\u0010;\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\u000bH\u0082Hø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b:\u0010\u000f\u001a]\u0010A\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010=\u001a\u00020<2\b\b\u0002\u0010>\u001a\u00020\r2\u0018\u0010,\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003H\u0080Hø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b?\u0010@\u001a\u0013\u0010C\u001a\u00020<*\u00020BH\u0000¢\u0006\u0004\bC\u0010D\u001a'\u0010F\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\bE\u0010\u0012\u001a!\u0010J\u001a\u00020\r*\u00020G2\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bH\u0010I\u001a!\u0010N\u001a\u00020\u001c*\u00020K2\u0006\u0010 \u001a\u00020\u001fH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bL\u0010M\"\u001a\u0010O\u001a\u00020<8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u001a\u0010S\u001a\u00020<8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bS\u0010P\u001a\u0004\bT\u0010R\"\u0017\u0010V\u001a\u00020U8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\bV\u0010W\"\u0017\u0010X\u001a\u00020U8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\bX\u0010W\"\u0014\u0010Y\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010W\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006Z"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/input/pointer/PointerId;", "pointerId", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/geometry/Offset;", "", "onTouchSlopReached", "awaitTouchSlopOrCancellation-jO51t88", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitTouchSlopOrCancellation", "Lkotlin/Function1;", "onDrag", "", "drag-jO51t88", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "drag", "awaitDragOrCancellation-rnUCldI", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitDragOrCancellation", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "onDragStart", "Lkotlin/Function0;", "onDragEnd", "onDragCancel", "detectDragGestures", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detectDragGesturesAfterLongPress", "", "awaitVerticalTouchSlopOrCancellation-jO51t88", "awaitVerticalTouchSlopOrCancellation", "Landroidx/compose/ui/input/pointer/PointerType;", "pointerType", "awaitVerticalPointerSlopOrCancellation-gDDlDlE", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitVerticalPointerSlopOrCancellation", "verticalDrag-jO51t88", "verticalDrag", "awaitVerticalDragOrCancellation-rnUCldI", "awaitVerticalDragOrCancellation", "onVerticalDrag", "detectVerticalDragGestures", "awaitHorizontalTouchSlopOrCancellation-jO51t88", "awaitHorizontalTouchSlopOrCancellation", "onPointerSlopReached", "awaitHorizontalPointerSlopOrCancellation-gDDlDlE", "awaitHorizontalPointerSlopOrCancellation", "horizontalDrag-jO51t88", "horizontalDrag", "awaitHorizontalDragOrCancellation-rnUCldI", "awaitHorizontalDragOrCancellation", "onHorizontalDrag", "detectHorizontalDragGestures", "motionFromChange", "motionConsumed", "drag-VnAYq1g", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hasDragged", "awaitDragOrUp-jO51t88", "awaitDragOrUp", "Landroidx/compose/foundation/gestures/PointerDirectionConfig;", "pointerDirectionConfig", "triggerOnMainAxisSlop", "awaitPointerSlopOrCancellation-wtdNQyU", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILandroidx/compose/foundation/gestures/PointerDirectionConfig;ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitPointerSlopOrCancellation", "Landroidx/compose/foundation/gestures/Orientation;", "toPointerDirectionConfig", "(Landroidx/compose/foundation/gestures/Orientation;)Landroidx/compose/foundation/gestures/PointerDirectionConfig;", "awaitLongPressOrCancellation-rnUCldI", "awaitLongPressOrCancellation", "Landroidx/compose/ui/input/pointer/PointerEvent;", "isPointerUp-DmW0f2w", "(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z", "isPointerUp", "Landroidx/compose/ui/platform/ViewConfiguration;", "pointerSlop-E8SPZFQ", "(Landroidx/compose/ui/platform/ViewConfiguration;I)F", "pointerSlop", "HorizontalPointerDirectionConfig", "Landroidx/compose/foundation/gestures/PointerDirectionConfig;", "getHorizontalPointerDirectionConfig", "()Landroidx/compose/foundation/gestures/PointerDirectionConfig;", "VerticalPointerDirectionConfig", "getVerticalPointerDirectionConfig", "Landroidx/compose/ui/unit/Dp;", "mouseSlop", "F", "defaultTouchSlop", "mouseToTouchSlopRatio", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class DragGestureDetectorKt {

    @NotNull
    private static final PointerDirectionConfig HorizontalPointerDirectionConfig = new PointerDirectionConfig() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$HorizontalPointerDirectionConfig$1
        @Override // androidx.compose.foundation.gestures.PointerDirectionConfig
        /* JADX INFO: renamed from: crossAxisDelta-k-4lQ0M, reason: not valid java name */
        public float mo269crossAxisDeltak4lQ0M(long offset) {
            return Offset.m1372getYimpl(offset);
        }

        @Override // androidx.compose.foundation.gestures.PointerDirectionConfig
        /* JADX INFO: renamed from: mainAxisDelta-k-4lQ0M, reason: not valid java name */
        public float mo270mainAxisDeltak4lQ0M(long offset) {
            return Offset.m1371getXimpl(offset);
        }

        @Override // androidx.compose.foundation.gestures.PointerDirectionConfig
        /* JADX INFO: renamed from: offsetFromChanges-dBAh8RU, reason: not valid java name */
        public long mo271offsetFromChangesdBAh8RU(float mainChange, float crossChange) {
            return OffsetKt.Offset(mainChange, crossChange);
        }
    };

    @NotNull
    private static final PointerDirectionConfig VerticalPointerDirectionConfig = new PointerDirectionConfig() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$VerticalPointerDirectionConfig$1
        @Override // androidx.compose.foundation.gestures.PointerDirectionConfig
        /* JADX INFO: renamed from: crossAxisDelta-k-4lQ0M */
        public float mo269crossAxisDeltak4lQ0M(long offset) {
            return Offset.m1371getXimpl(offset);
        }

        @Override // androidx.compose.foundation.gestures.PointerDirectionConfig
        /* JADX INFO: renamed from: mainAxisDelta-k-4lQ0M */
        public float mo270mainAxisDeltak4lQ0M(long offset) {
            return Offset.m1372getYimpl(offset);
        }

        @Override // androidx.compose.foundation.gestures.PointerDirectionConfig
        /* JADX INFO: renamed from: offsetFromChanges-dBAh8RU */
        public long mo271offsetFromChangesdBAh8RU(float mainChange, float crossChange) {
            return OffsetKt.Offset(crossChange, mainChange);
        }
    };
    private static final float defaultTouchSlop;
    private static final float mouseSlop;
    private static final float mouseToTouchSlopRatio;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5", f = "DragGestureDetector.kt", l = {176, 890, 940, 193}, m = "invokeSuspend")
    static final class AnonymousClass5 extends j implements Function2<AwaitPointerEventScope, Continuation, Object> {
        final /* synthetic */ Function2<PointerInputChange, Offset, Unit> $onDrag;
        final /* synthetic */ Function0<Unit> $onDragCancel;
        final /* synthetic */ Function0<Unit> $onDragEnd;
        final /* synthetic */ Function1<Offset, Unit> $onDragStart;
        float F$0;
        float F$1;
        float F$2;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass5(Function1<? super Offset, Unit> function1, Function2<? super PointerInputChange, ? super Offset, Unit> function2, Function0<Unit> function0, Function0<Unit> function02, Continuation continuation) {
            super(2, continuation);
            this.$onDragStart = function1;
            this.$onDrag = function2;
            this.$onDragCancel = function0;
            this.$onDragEnd = function02;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.$onDragStart, this.$onDrag, this.$onDragCancel, this.$onDragEnd, continuation);
            anonymousClass5.L$0 = obj;
            return anonymousClass5;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable Continuation continuation) {
            return ((AnonymousClass5) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x00ad, code lost:
        
            if (r1 == r6) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0110, code lost:
        
            if (r15 == r6) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:82:0x0289, code lost:
        
            return r6;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00d7  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00dc  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x01f6  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x01fd  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x023c  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x024c  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x0292  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x0298  */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00d7 -> B:74:0x023a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0152 -> B:35:0x0155). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0191 -> B:22:0x00f4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x01ef -> B:63:0x01f0). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x0237 -> B:74:0x023a). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r21) {
            /*
                Method dump skipped, instruction units count: 681
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.AnonymousClass5.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5", f = "DragGestureDetector.kt", l = {235, 236, 241}, m = "invokeSuspend")
    static final class C13965 extends j implements Function2<AwaitPointerEventScope, Continuation, Object> {
        final /* synthetic */ Function2<PointerInputChange, Offset, Unit> $onDrag;
        final /* synthetic */ Function0<Unit> $onDragCancel;
        final /* synthetic */ Function0<Unit> $onDragEnd;
        final /* synthetic */ Function1<Offset, Unit> $onDragStart;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C13965(Function1<? super Offset, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function2<? super PointerInputChange, ? super Offset, Unit> function2, Continuation continuation) {
            super(2, continuation);
            this.$onDragStart = function1;
            this.$onDragEnd = function0;
            this.$onDragCancel = function02;
            this.$onDrag = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            C13965 c13965 = new C13965(this.$onDragStart, this.$onDragEnd, this.$onDragCancel, this.$onDrag, continuation);
            c13965.L$0 = obj;
            return c13965;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable Continuation continuation) {
            return ((C13965) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0064 A[Catch: CancellationException -> 0x00b3, PHI: r1 r8 r12
  0x0064: PHI (r1v8 androidx.compose.ui.input.pointer.AwaitPointerEventScope) = 
  (r1v4 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
  (r1v9 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
 binds: [B:16:0x002f, B:28:0x0061] A[DONT_GENERATE, DONT_INLINE]
  0x0064: PHI (r8v6 androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5) = 
  (r8v2 androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5)
  (r8v7 androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5)
 binds: [B:16:0x002f, B:28:0x0061] A[DONT_GENERATE, DONT_INLINE]
  0x0064: PHI (r12v12 java.lang.Object) = (r12v0 java.lang.Object), (r12v18 java.lang.Object) binds: [B:16:0x002f, B:28:0x0061] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {CancellationException -> 0x00b3, blocks: (B:36:0x008c, B:38:0x0094, B:40:0x00a3, B:42:0x00af, B:45:0x00b6, B:46:0x00b9, B:47:0x00bf, B:30:0x0064, B:32:0x0068, B:27:0x0053, B:23:0x004b), top: B:57:0x004b }] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0068 A[Catch: CancellationException -> 0x00b3, TryCatch #2 {CancellationException -> 0x00b3, blocks: (B:36:0x008c, B:38:0x0094, B:40:0x00a3, B:42:0x00af, B:45:0x00b6, B:46:0x00b9, B:47:0x00bf, B:30:0x0064, B:32:0x0068, B:27:0x0053, B:23:0x004b), top: B:57:0x004b }] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0094 A[Catch: CancellationException -> 0x00b3, TryCatch #2 {CancellationException -> 0x00b3, blocks: (B:36:0x008c, B:38:0x0094, B:40:0x00a3, B:42:0x00af, B:45:0x00b6, B:46:0x00b9, B:47:0x00bf, B:30:0x0064, B:32:0x0068, B:27:0x0053, B:23:0x004b), top: B:57:0x004b }] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00bf A[Catch: CancellationException -> 0x00b3, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x00b3, blocks: (B:36:0x008c, B:38:0x0094, B:40:0x00a3, B:42:0x00af, B:45:0x00b6, B:46:0x00b9, B:47:0x00bf, B:30:0x0064, B:32:0x0068, B:27:0x0053, B:23:0x004b), top: B:57:0x004b }] */
        @Override // kotlin.coroutines.jvm.internal.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r12) {
            /*
                Method dump skipped, instruction units count: 208
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.C13965.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5", f = "DragGestureDetector.kt", l = {539, 541, 552}, m = "invokeSuspend")
    static final class C14005 extends j implements Function2<AwaitPointerEventScope, Continuation, Object> {
        final /* synthetic */ Function0<Unit> $onDragCancel;
        final /* synthetic */ Function0<Unit> $onDragEnd;
        final /* synthetic */ Function1<Offset, Unit> $onDragStart;
        final /* synthetic */ Function2<PointerInputChange, Float, Unit> $onHorizontalDrag;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C14005(Function1<? super Offset, Unit> function1, Function2<? super PointerInputChange, ? super Float, Unit> function2, Function0<Unit> function0, Function0<Unit> function02, Continuation continuation) {
            super(2, continuation);
            this.$onDragStart = function1;
            this.$onHorizontalDrag = function2;
            this.$onDragEnd = function0;
            this.$onDragCancel = function02;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            C14005 c14005 = new C14005(this.$onDragStart, this.$onHorizontalDrag, this.$onDragEnd, this.$onDragCancel, continuation);
            c14005.L$0 = obj;
            return c14005;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable Continuation continuation) {
            return ((C14005) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x00a5, code lost:
        
            if (r13 == r0) goto L24;
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
        @Override // kotlin.coroutines.jvm.internal.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r12.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L36
                if (r1 == r4) goto L2c
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                kotlin.d.b(r13)
                r8 = r12
                goto La8
            L17:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1f:
                java.lang.Object r1 = r12.L$1
                kotlin.jvm.internal.s0 r1 = (kotlin.jvm.internal.s0) r1
                java.lang.Object r3 = r12.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r3
                kotlin.d.b(r13)
                r8 = r12
                goto L73
            L2c:
                java.lang.Object r1 = r12.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                kotlin.d.b(r13)
                r8 = r12
                r6 = r1
                goto L4f
            L36:
                kotlin.d.b(r13)
                java.lang.Object r13 = r12.L$0
                r5 = r13
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r5
                r12.L$0 = r5
                r12.label = r4
                r6 = 0
                r7 = 0
                r9 = 2
                r10 = 0
                r8 = r12
                java.lang.Object r13 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r5, r6, r7, r8, r9, r10)
                if (r13 != r0) goto L4e
                goto La7
            L4e:
                r6 = r5
            L4f:
                androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.ui.input.pointer.PointerInputChange) r13
                kotlin.jvm.internal.s0 r1 = new kotlin.jvm.internal.s0
                r1.<init>()
                r11 = r8
                long r7 = r13.getId()
                int r9 = r13.getType()
                androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5$drag$1 r10 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5$drag$1
                r10.<init>()
                r11.L$0 = r6
                r11.L$1 = r1
                r11.label = r3
                java.lang.Object r13 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m252awaitHorizontalPointerSlopOrCancellationgDDlDlE(r6, r7, r9, r10, r11)
                r8 = r11
                if (r13 != r0) goto L72
                goto La7
            L72:
                r3 = r6
            L73:
                androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.ui.input.pointer.PointerInputChange) r13
                if (r13 == 0) goto Lbb
                kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit> r4 = r8.$onDragStart
                long r5 = r13.getPosition()
                androidx.compose.ui.geometry.Offset r5 = androidx.compose.ui.geometry.Offset.m1360boximpl(r5)
                r4.invoke(r5)
                kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Float, kotlin.Unit> r4 = r8.$onHorizontalDrag
                float r1 = r1.f93329b
                java.lang.Float r1 = kotlin.coroutines.jvm.internal.b.c(r1)
                r4.invoke(r13, r1)
                long r4 = r13.getId()
                androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5$1 r13 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5$1
                kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Float, kotlin.Unit> r1 = r8.$onHorizontalDrag
                r13.<init>()
                r1 = 0
                r8.L$0 = r1
                r8.L$1 = r1
                r8.label = r2
                java.lang.Object r13 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m265horizontalDragjO51t88(r3, r4, r13, r12)
                if (r13 != r0) goto La8
            La7:
                return r0
            La8:
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r13 = r13.booleanValue()
                if (r13 == 0) goto Lb6
                kotlin.jvm.functions.Function0<kotlin.Unit> r13 = r8.$onDragEnd
                r13.invoke()
                goto Lbb
            Lb6:
                kotlin.jvm.functions.Function0<kotlin.Unit> r13 = r8.$onDragCancel
                r13.invoke()
            Lbb:
                kotlin.Unit r13 = kotlin.Unit.f93236a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.C14005.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5", f = "DragGestureDetector.kt", l = {391, 393, 401}, m = "invokeSuspend")
    static final class C14045 extends j implements Function2<AwaitPointerEventScope, Continuation, Object> {
        final /* synthetic */ Function0<Unit> $onDragCancel;
        final /* synthetic */ Function0<Unit> $onDragEnd;
        final /* synthetic */ Function1<Offset, Unit> $onDragStart;
        final /* synthetic */ Function2<PointerInputChange, Float, Unit> $onVerticalDrag;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C14045(Function1<? super Offset, Unit> function1, Function2<? super PointerInputChange, ? super Float, Unit> function2, Function0<Unit> function0, Function0<Unit> function02, Continuation continuation) {
            super(2, continuation);
            this.$onDragStart = function1;
            this.$onVerticalDrag = function2;
            this.$onDragEnd = function0;
            this.$onDragCancel = function02;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            C14045 c14045 = new C14045(this.$onDragStart, this.$onVerticalDrag, this.$onDragEnd, this.$onDragCancel, continuation);
            c14045.L$0 = obj;
            return c14045;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable Continuation continuation) {
            return ((C14045) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x00a5, code lost:
        
            if (r13 == r0) goto L24;
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
        @Override // kotlin.coroutines.jvm.internal.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r12.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L36
                if (r1 == r4) goto L2c
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                kotlin.d.b(r13)
                r8 = r12
                goto La8
            L17:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1f:
                java.lang.Object r1 = r12.L$1
                kotlin.jvm.internal.s0 r1 = (kotlin.jvm.internal.s0) r1
                java.lang.Object r3 = r12.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r3
                kotlin.d.b(r13)
                r8 = r12
                goto L73
            L2c:
                java.lang.Object r1 = r12.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                kotlin.d.b(r13)
                r8 = r12
                r6 = r1
                goto L4f
            L36:
                kotlin.d.b(r13)
                java.lang.Object r13 = r12.L$0
                r5 = r13
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r5
                r12.L$0 = r5
                r12.label = r4
                r6 = 0
                r7 = 0
                r9 = 2
                r10 = 0
                r8 = r12
                java.lang.Object r13 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r5, r6, r7, r8, r9, r10)
                if (r13 != r0) goto L4e
                goto La7
            L4e:
                r6 = r5
            L4f:
                androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.ui.input.pointer.PointerInputChange) r13
                kotlin.jvm.internal.s0 r1 = new kotlin.jvm.internal.s0
                r1.<init>()
                r11 = r8
                long r7 = r13.getId()
                int r9 = r13.getType()
                androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5$drag$1 r10 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5$drag$1
                r10.<init>()
                r11.L$0 = r6
                r11.L$1 = r1
                r11.label = r3
                java.lang.Object r13 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m260awaitVerticalPointerSlopOrCancellationgDDlDlE(r6, r7, r9, r10, r11)
                r8 = r11
                if (r13 != r0) goto L72
                goto La7
            L72:
                r3 = r6
            L73:
                androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.ui.input.pointer.PointerInputChange) r13
                if (r13 == 0) goto Lbb
                kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit> r4 = r8.$onDragStart
                long r5 = r13.getPosition()
                androidx.compose.ui.geometry.Offset r5 = androidx.compose.ui.geometry.Offset.m1360boximpl(r5)
                r4.invoke(r5)
                kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Float, kotlin.Unit> r4 = r8.$onVerticalDrag
                float r1 = r1.f93329b
                java.lang.Float r1 = kotlin.coroutines.jvm.internal.b.c(r1)
                r4.invoke(r13, r1)
                long r4 = r13.getId()
                androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5$1 r13 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5$1
                kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Float, kotlin.Unit> r1 = r8.$onVerticalDrag
                r13.<init>()
                r1 = 0
                r8.L$0 = r1
                r8.L$1 = r1
                r8.label = r2
                java.lang.Object r13 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m268verticalDragjO51t88(r3, r4, r13, r12)
                if (r13 != r0) goto La8
            La7:
                return r0
            La8:
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r13 = r13.booleanValue()
                if (r13 == 0) goto Lb6
                kotlin.jvm.functions.Function0<kotlin.Unit> r13 = r8.$onDragEnd
                r13.invoke()
                goto Lbb
            Lb6:
                kotlin.jvm.functions.Function0<kotlin.Unit> r13 = r8.$onDragCancel
                r13.invoke()
            Lbb:
                kotlin.Unit r13 = kotlin.Unit.f93236a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.C14045.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        float fM3951constructorimpl = Dp.m3951constructorimpl((float) 0.125d);
        mouseSlop = fM3951constructorimpl;
        float fM3951constructorimpl2 = Dp.m3951constructorimpl(18);
        defaultTouchSlop = fM3951constructorimpl2;
        mouseToTouchSlopRatio = fM3951constructorimpl / fM3951constructorimpl2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ca, code lost:
    
        if (androidx.compose.ui.input.pointer.PointerEventKt.positionChangedIgnoreConsumed(r11) != false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0067 -> B:22:0x006c). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: awaitDragOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m249awaitDragOrCancellationrnUCldI(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.AwaitPointerEventScope r17, long r18, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r20) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m249awaitDragOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: awaitDragOrUp-jO51t88, reason: not valid java name */
    private static final Object m250awaitDragOrUpjO51t88(AwaitPointerEventScope awaitPointerEventScope, long j10, Function1<? super PointerInputChange, Boolean> function1, Continuation continuation) {
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        u0 u0Var = new u0();
        u0Var.f93333b = j10;
        while (true) {
            int i10 = 0;
            z.c(0);
            PointerInputChange pointerInputChange3 = null;
            Object objT = androidx.compose.ui.input.pointer.b.t(awaitPointerEventScope, null, continuation, 1, null);
            z.c(1);
            PointerEvent pointerEvent = (PointerEvent) objT;
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    pointerInputChange = null;
                    break;
                }
                pointerInputChange = changes.get(i11);
                if (Boolean.valueOf(PointerId.m2891equalsimpl0(pointerInputChange.getId(), u0Var.f93333b)).booleanValue()) {
                    break;
                }
                i11++;
            }
            pointerInputChange2 = pointerInputChange;
            if (pointerInputChange2 == null) {
                return null;
            }
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                int size2 = changes2.size();
                while (true) {
                    if (i10 >= size2) {
                        break;
                    }
                    PointerInputChange pointerInputChange4 = changes2.get(i10);
                    if (Boolean.valueOf(pointerInputChange4.getPressed()).booleanValue()) {
                        pointerInputChange3 = pointerInputChange4;
                        break;
                    }
                    i10++;
                }
                PointerInputChange pointerInputChange5 = pointerInputChange3;
                if (pointerInputChange5 == null) {
                    break;
                }
                u0Var.f93333b = pointerInputChange5.getId();
            } else if (function1.invoke(pointerInputChange2).booleanValue()) {
                break;
            }
        }
        return pointerInputChange2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d4, code lost:
    
        if ((androidx.compose.ui.geometry.Offset.m1371getXimpl(androidx.compose.ui.input.pointer.PointerEventKt.positionChangeIgnoreConsumed(r11)) == 0.0f ? 1 : 0) == 0) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0067 -> B:22:0x006c). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: awaitHorizontalDragOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m251awaitHorizontalDragOrCancellationrnUCldI(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.AwaitPointerEventScope r17, long r18, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r20) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m251awaitHorizontalDragOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x014b -> B:50:0x015a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x01ac -> B:61:0x01b4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x01f2 -> B:50:0x015a). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: awaitHorizontalPointerSlopOrCancellation-gDDlDlE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m252awaitHorizontalPointerSlopOrCancellationgDDlDlE(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.AwaitPointerEventScope r20, long r21, int r23, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.Unit> r24, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r25) {
        /*
            Method dump skipped, instruction units count: 507
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m252awaitHorizontalPointerSlopOrCancellationgDDlDlE(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0115 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0153 -> B:20:0x00ba). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x01b5 -> B:60:0x01bb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x01fc -> B:64:0x01c7). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: awaitHorizontalTouchSlopOrCancellation-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m253awaitHorizontalTouchSlopOrCancellationjO51t88(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.AwaitPointerEventScope r20, long r21, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.Unit> r23, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r24) {
        /*
            Method dump skipped, instruction units count: 518
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m253awaitHorizontalTouchSlopOrCancellationjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: awaitLongPressOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m254awaitLongPressOrCancellationrnUCldI(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.AwaitPointerEventScope r9, long r10, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r12) {
        /*
            boolean r0 = r12 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1
            if (r0 == 0) goto L13
            r0 = r12
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1 r0 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1 r0 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r9 = r0.L$1
            kotlin.jvm.internal.Ref$ObjectRef r9 = (kotlin.jvm.internal.Ref$ObjectRef) r9
            java.lang.Object r10 = r0.L$0
            androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.ui.input.pointer.PointerInputChange) r10
            kotlin.d.b(r12)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L9b
            goto L99
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3a:
            kotlin.d.b(r12)
            androidx.compose.ui.input.pointer.PointerEvent r12 = r9.getCurrentEvent()
            boolean r12 = m266isPointerUpDmW0f2w(r12, r10)
            if (r12 == 0) goto L48
            return r4
        L48:
            androidx.compose.ui.input.pointer.PointerEvent r12 = r9.getCurrentEvent()
            java.util.List r12 = r12.getChanges()
            int r2 = r12.size()
            r5 = 0
        L55:
            if (r5 >= r2) goto L6c
            java.lang.Object r6 = r12.get(r5)
            r7 = r6
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
            long r7 = r7.getId()
            boolean r7 = androidx.compose.ui.input.pointer.PointerId.m2891equalsimpl0(r7, r10)
            if (r7 == 0) goto L69
            goto L6d
        L69:
            int r5 = r5 + 1
            goto L55
        L6c:
            r6 = r4
        L6d:
            r10 = r6
            androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.ui.input.pointer.PointerInputChange) r10
            if (r10 != 0) goto L73
            return r4
        L73:
            kotlin.jvm.internal.Ref$ObjectRef r11 = new kotlin.jvm.internal.Ref$ObjectRef
            r11.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r12 = new kotlin.jvm.internal.Ref$ObjectRef
            r12.<init>()
            r12.f93280b = r10
            androidx.compose.ui.platform.ViewConfiguration r2 = r9.getViewConfiguration()
            long r5 = r2.getLongPressTimeoutMillis()
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2 r2 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L9a
            r2.<init>(r12, r11, r4)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L9a
            r0.L$0 = r10     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L9a
            r0.L$1 = r11     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L9a
            r0.label = r3     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L9a
            java.lang.Object r9 = r9.withTimeout(r5, r2, r0)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L9a
            if (r9 != r1) goto L99
            return r1
        L99:
            return r4
        L9a:
            r9 = r11
        L9b:
            java.lang.Object r9 = r9.f93280b
            androidx.compose.ui.input.pointer.PointerInputChange r9 = (androidx.compose.ui.input.pointer.PointerInputChange) r9
            if (r9 != 0) goto La2
            goto La3
        La2:
            r10 = r9
        La3:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m254awaitLongPressOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x014e -> B:50:0x015d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x01af -> B:61:0x01b3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x01f3 -> B:20:0x00b6). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: awaitPointerSlopOrCancellation-wtdNQyU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m255awaitPointerSlopOrCancellationwtdNQyU(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.AwaitPointerEventScope r20, long r21, int r23, @org.jetbrains.annotations.NotNull androidx.compose.foundation.gestures.PointerDirectionConfig r24, boolean r25, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit> r26, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r27) {
        /*
            Method dump skipped, instruction units count: 513
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m255awaitPointerSlopOrCancellationwtdNQyU(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, androidx.compose.foundation.gestures.PointerDirectionConfig, boolean, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: awaitPointerSlopOrCancellation-wtdNQyU$$forInline, reason: not valid java name */
    private static final Object m256awaitPointerSlopOrCancellationwtdNQyU$$forInline(AwaitPointerEventScope awaitPointerEventScope, long j10, int i10, PointerDirectionConfig pointerDirectionConfig, boolean z10, Function2<? super PointerInputChange, ? super Offset, Unit> function2, Continuation continuation) {
        float f10;
        int i11;
        int i12;
        PointerInputChange pointerInputChange;
        long jM1375minusMKHz9U;
        float f11;
        PointerInputChange pointerInputChange2;
        if (m266isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j10)) {
            return null;
        }
        float fM267pointerSlopE8SPZFQ = m267pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i10);
        u0 u0Var = new u0();
        u0Var.f93333b = j10;
        float f12 = 0.0f;
        float fMo269crossAxisDeltak4lQ0M = 0.0f;
        while (true) {
            int i13 = 0;
            z.c(0);
            int i14 = 1;
            Object objT = androidx.compose.ui.input.pointer.b.t(awaitPointerEventScope, null, continuation, 1, null);
            z.c(1);
            PointerEvent pointerEvent = (PointerEvent) objT;
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i15 = 0;
            while (true) {
                if (i15 >= size) {
                    f10 = f12;
                    i11 = i13;
                    i12 = i14;
                    pointerInputChange = null;
                    break;
                }
                pointerInputChange = changes.get(i15);
                f10 = f12;
                i11 = i13;
                i12 = i14;
                if (Boolean.valueOf(PointerId.m2891equalsimpl0(pointerInputChange.getId(), u0Var.f93333b)).booleanValue()) {
                    break;
                }
                i15++;
                f12 = f10;
                i13 = i11;
                i14 = i12;
            }
            PointerInputChange pointerInputChange3 = pointerInputChange;
            if (pointerInputChange3 == null || pointerInputChange3.isConsumed()) {
                return null;
            }
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                int size2 = changes2.size();
                int i16 = i11;
                while (true) {
                    if (i16 >= size2) {
                        pointerInputChange2 = null;
                        break;
                    }
                    pointerInputChange2 = changes2.get(i16);
                    if (Boolean.valueOf(pointerInputChange2.getPressed()).booleanValue()) {
                        break;
                    }
                    i16++;
                }
                PointerInputChange pointerInputChange4 = pointerInputChange2;
                if (pointerInputChange4 == null) {
                    return null;
                }
                u0Var.f93333b = pointerInputChange4.getId();
                f11 = f10;
            } else {
                long position = pointerInputChange3.getPosition();
                long previousPosition = pointerInputChange3.getPreviousPosition();
                float fMo270mainAxisDeltak4lQ0M = f10 + (pointerDirectionConfig.mo270mainAxisDeltak4lQ0M(position) - pointerDirectionConfig.mo270mainAxisDeltak4lQ0M(previousPosition));
                fMo269crossAxisDeltak4lQ0M += pointerDirectionConfig.mo269crossAxisDeltak4lQ0M(position) - pointerDirectionConfig.mo269crossAxisDeltak4lQ0M(previousPosition);
                float fAbs = z10 ? Math.abs(fMo270mainAxisDeltak4lQ0M) : Offset.m1369getDistanceimpl(pointerDirectionConfig.mo271offsetFromChangesdBAh8RU(fMo270mainAxisDeltak4lQ0M, fMo269crossAxisDeltak4lQ0M));
                if (fAbs < fM267pointerSlopE8SPZFQ) {
                    PointerEventPass pointerEventPass = PointerEventPass.Final;
                    z.c(i11);
                    awaitPointerEventScope.awaitPointerEvent(pointerEventPass, continuation);
                    z.c(i12);
                    if (pointerInputChange3.isConsumed()) {
                        return null;
                    }
                    f11 = fMo270mainAxisDeltak4lQ0M;
                } else {
                    if (z10) {
                        jM1375minusMKHz9U = pointerDirectionConfig.mo271offsetFromChangesdBAh8RU(fMo270mainAxisDeltak4lQ0M - (Math.signum(fMo270mainAxisDeltak4lQ0M) * fM267pointerSlopE8SPZFQ), fMo269crossAxisDeltak4lQ0M);
                    } else {
                        long jMo271offsetFromChangesdBAh8RU = pointerDirectionConfig.mo271offsetFromChangesdBAh8RU(fMo270mainAxisDeltak4lQ0M, fMo269crossAxisDeltak4lQ0M);
                        jM1375minusMKHz9U = Offset.m1375minusMKHz9U(jMo271offsetFromChangesdBAh8RU, Offset.m1378timestuRUvjQ(Offset.m1366divtuRUvjQ(jMo271offsetFromChangesdBAh8RU, fAbs), fM267pointerSlopE8SPZFQ));
                    }
                    function2.invoke(pointerInputChange3, Offset.m1360boximpl(jM1375minusMKHz9U));
                    if (pointerInputChange3.isConsumed()) {
                        return pointerInputChange3;
                    }
                    f11 = 0.0f;
                    fMo269crossAxisDeltak4lQ0M = 0.0f;
                    f12 = f11;
                }
            }
            f12 = f11;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ea, code lost:
    
        if (r3 == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ec, code lost:
    
        r8 = r2.mo271offsetFromChangesdBAh8RU(r10 - (java.lang.Math.signum(r10) * r5), r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f7, code lost:
    
        r9 = r2.mo271offsetFromChangesdBAh8RU(r10, r11);
        r8 = androidx.compose.ui.geometry.Offset.m1375minusMKHz9U(r9, androidx.compose.ui.geometry.Offset.m1378timestuRUvjQ(androidx.compose.ui.geometry.Offset.m1366divtuRUvjQ(r9, r8), r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0107, code lost:
    
        r24.invoke(r4, androidx.compose.ui.geometry.Offset.m1360boximpl(r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0114, code lost:
    
        if (r4.isConsumed() == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0116, code lost:
    
        return r4;
     */
    /* JADX INFO: renamed from: awaitPointerSlopOrCancellation-wtdNQyU$default, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object m257awaitPointerSlopOrCancellationwtdNQyU$default(androidx.compose.ui.input.pointer.AwaitPointerEventScope r18, long r19, int r21, androidx.compose.foundation.gestures.PointerDirectionConfig r22, boolean r23, kotlin.jvm.functions.Function2 r24, kotlin.coroutines.Continuation r25, int r26, java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m257awaitPointerSlopOrCancellationwtdNQyU$default(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, androidx.compose.foundation.gestures.PointerDirectionConfig, boolean, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation, int, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0113 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0152 -> B:20:0x00bb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x01b7 -> B:60:0x01be). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x01fd -> B:64:0x01ca). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: awaitTouchSlopOrCancellation-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m258awaitTouchSlopOrCancellationjO51t88(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.AwaitPointerEventScope r19, long r20, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit> r22, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r23) {
        /*
            Method dump skipped, instruction units count: 518
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m258awaitTouchSlopOrCancellationjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d4, code lost:
    
        if ((androidx.compose.ui.geometry.Offset.m1372getYimpl(androidx.compose.ui.input.pointer.PointerEventKt.positionChangeIgnoreConsumed(r11)) == 0.0f ? 1 : 0) == 0) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0067 -> B:22:0x006c). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: awaitVerticalDragOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m259awaitVerticalDragOrCancellationrnUCldI(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.AwaitPointerEventScope r17, long r18, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r20) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m259awaitVerticalDragOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x014b -> B:50:0x015a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x01ac -> B:61:0x01b4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x01f2 -> B:50:0x015a). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: awaitVerticalPointerSlopOrCancellation-gDDlDlE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m260awaitVerticalPointerSlopOrCancellationgDDlDlE(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.AwaitPointerEventScope r20, long r21, int r23, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.Unit> r24, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r25) {
        /*
            Method dump skipped, instruction units count: 507
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m260awaitVerticalPointerSlopOrCancellationgDDlDlE(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0115 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0153 -> B:20:0x00ba). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x01b5 -> B:60:0x01bb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x01fc -> B:64:0x01c7). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: awaitVerticalTouchSlopOrCancellation-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m261awaitVerticalTouchSlopOrCancellationjO51t88(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.AwaitPointerEventScope r20, long r21, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.Unit> r23, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r24) {
        /*
            Method dump skipped, instruction units count: 518
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m261awaitVerticalTouchSlopOrCancellationjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Nullable
    public static final Object detectDragGestures(@NotNull PointerInputScope pointerInputScope, @NotNull Function1<? super Offset, Unit> function1, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull Function2<? super PointerInputChange, ? super Offset, Unit> function2, @NotNull Continuation continuation) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new AnonymousClass5(function1, function2, function02, function0, null), continuation);
        return objAwaitEachGesture == pf.b.g() ? objAwaitEachGesture : Unit.f93236a;
    }

    public static /* synthetic */ Object detectDragGestures$default(PointerInputScope pointerInputScope, Function1 function1, Function0 function0, Function0 function02, Function2 function2, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures.2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                    m272invokek4lQ0M(offset.getPackedValue());
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m272invokek4lQ0M(long j10) {
                }
            };
        }
        if ((i10 & 2) != 0) {
            function0 = new Function0<Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures.3
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.f93236a;
                }
            };
        }
        if ((i10 & 4) != 0) {
            function02 = new Function0<Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures.4
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.f93236a;
                }
            };
        }
        Function0 function03 = function02;
        return detectDragGestures(pointerInputScope, function1, function0, function03, function2, continuation);
    }

    @Nullable
    public static final Object detectDragGesturesAfterLongPress(@NotNull PointerInputScope pointerInputScope, @NotNull Function1<? super Offset, Unit> function1, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull Function2<? super PointerInputChange, ? super Offset, Unit> function2, @NotNull Continuation continuation) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new C13965(function1, function0, function02, function2, null), continuation);
        return objAwaitEachGesture == pf.b.g() ? objAwaitEachGesture : Unit.f93236a;
    }

    public static /* synthetic */ Object detectDragGesturesAfterLongPress$default(PointerInputScope pointerInputScope, Function1 function1, Function0 function0, Function0 function02, Function2 function2, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGesturesAfterLongPress.2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                    m273invokek4lQ0M(offset.getPackedValue());
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m273invokek4lQ0M(long j10) {
                }
            };
        }
        if ((i10 & 2) != 0) {
            function0 = new Function0<Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGesturesAfterLongPress.3
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.f93236a;
                }
            };
        }
        if ((i10 & 4) != 0) {
            function02 = new Function0<Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGesturesAfterLongPress.4
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.f93236a;
                }
            };
        }
        Function0 function03 = function02;
        return detectDragGesturesAfterLongPress(pointerInputScope, function1, function0, function03, function2, continuation);
    }

    @Nullable
    public static final Object detectHorizontalDragGestures(@NotNull PointerInputScope pointerInputScope, @NotNull Function1<? super Offset, Unit> function1, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull Function2<? super PointerInputChange, ? super Float, Unit> function2, @NotNull Continuation continuation) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new C14005(function1, function2, function0, function02, null), continuation);
        return objAwaitEachGesture == pf.b.g() ? objAwaitEachGesture : Unit.f93236a;
    }

    public static /* synthetic */ Object detectHorizontalDragGestures$default(PointerInputScope pointerInputScope, Function1 function1, Function0 function0, Function0 function02, Function2 function2, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectHorizontalDragGestures.2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                    m274invokek4lQ0M(offset.getPackedValue());
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m274invokek4lQ0M(long j10) {
                }
            };
        }
        if ((i10 & 2) != 0) {
            function0 = new Function0<Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectHorizontalDragGestures.3
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.f93236a;
                }
            };
        }
        if ((i10 & 4) != 0) {
            function02 = new Function0<Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectHorizontalDragGestures.4
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.f93236a;
                }
            };
        }
        Function0 function03 = function02;
        return detectHorizontalDragGestures(pointerInputScope, function1, function0, function03, function2, continuation);
    }

    @Nullable
    public static final Object detectVerticalDragGestures(@NotNull PointerInputScope pointerInputScope, @NotNull Function1<? super Offset, Unit> function1, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull Function2<? super PointerInputChange, ? super Float, Unit> function2, @NotNull Continuation continuation) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new C14045(function1, function2, function0, function02, null), continuation);
        return objAwaitEachGesture == pf.b.g() ? objAwaitEachGesture : Unit.f93236a;
    }

    public static /* synthetic */ Object detectVerticalDragGestures$default(PointerInputScope pointerInputScope, Function1 function1, Function0 function0, Function0 function02, Function2 function2, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectVerticalDragGestures.2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                    m275invokek4lQ0M(offset.getPackedValue());
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m275invokek4lQ0M(long j10) {
                }
            };
        }
        if ((i10 & 2) != 0) {
            function0 = new Function0<Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectVerticalDragGestures.3
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.f93236a;
                }
            };
        }
        if ((i10 & 4) != 0) {
            function02 = new Function0<Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectVerticalDragGestures.4
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.f93236a;
                }
            };
        }
        Function0 function03 = function02;
        return detectVerticalDragGestures(pointerInputScope, function1, function0, function03, function2, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x010c, code lost:
    
        if ((r3.invoke(r15).floatValue() == 0.0f) == false) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:46:0x00fa, B:35:0x00d0], limit reached: 62 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x008d -> B:23:0x0093). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: drag-VnAYq1g, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m262dragVnAYq1g(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.AwaitPointerEventScope r19, long r20, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit> r22, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Float> r23, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Boolean> r24, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r25) {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m262dragVnAYq1g(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: drag-VnAYq1g$$forInline, reason: not valid java name */
    private static final Object m263dragVnAYq1g$$forInline(AwaitPointerEventScope awaitPointerEventScope, long j10, Function1<? super PointerInputChange, Unit> function1, Function1<? super PointerInputChange, Float> function12, Function1<? super PointerInputChange, Boolean> function13, Continuation continuation) {
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        PointerInputChange pointerInputChange3;
        long id2 = j10;
        if (m266isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), id2)) {
            return null;
        }
        while (true) {
            u0 u0Var = new u0();
            u0Var.f93333b = id2;
            while (true) {
                z.c(0);
                Object objT = androidx.compose.ui.input.pointer.b.t(awaitPointerEventScope, null, continuation, 1, null);
                z.c(1);
                PointerEvent pointerEvent = (PointerEvent) objT;
                List<PointerInputChange> changes = pointerEvent.getChanges();
                int size = changes.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        pointerInputChange = null;
                        break;
                    }
                    pointerInputChange = changes.get(i10);
                    if (Boolean.valueOf(PointerId.m2891equalsimpl0(pointerInputChange.getId(), u0Var.f93333b)).booleanValue()) {
                        break;
                    }
                    i10++;
                }
                pointerInputChange2 = pointerInputChange;
                if (pointerInputChange2 == null) {
                    pointerInputChange2 = null;
                    break;
                }
                if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                    List<PointerInputChange> changes2 = pointerEvent.getChanges();
                    int size2 = changes2.size();
                    while (true) {
                        if (i >= size2) {
                            pointerInputChange3 = null;
                            break;
                        }
                        pointerInputChange3 = changes2.get(i);
                        if (Boolean.valueOf(pointerInputChange3.getPressed()).booleanValue()) {
                            break;
                        }
                        i++;
                    }
                    PointerInputChange pointerInputChange4 = pointerInputChange3;
                    if (pointerInputChange4 == null) {
                        break;
                    }
                    u0Var.f93333b = pointerInputChange4.getId();
                } else {
                    if (Boolean.valueOf((function12.invoke(pointerInputChange2).floatValue() == 0.0f ? 1 : 0) ^ 1).booleanValue()) {
                        break;
                    }
                }
            }
            if (pointerInputChange2 == null || function13.invoke(pointerInputChange2).booleanValue()) {
                return null;
            }
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                return pointerInputChange2;
            }
            function1.invoke(pointerInputChange2);
            id2 = pointerInputChange2.getId();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0048 -> B:18:0x004b). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: drag-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m264dragjO51t88(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.AwaitPointerEventScope r4, long r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit> r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1 r0 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1 r0 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.L$1
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            java.lang.Object r5 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r5
            kotlin.d.b(r8)
            r7 = r4
            r4 = r5
            goto L4b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            kotlin.d.b(r8)
        L3e:
            r0.L$0 = r4
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r8 = m249awaitDragOrCancellationrnUCldI(r4, r5, r0)
            if (r8 != r1) goto L4b
            return r1
        L4b:
            androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
            if (r8 != 0) goto L55
            r4 = 0
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.b.a(r4)
            return r4
        L55:
            boolean r5 = androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(r8)
            if (r5 == 0) goto L60
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.b.a(r3)
            return r4
        L60:
            r7.invoke(r8)
            long r5 = r8.getId()
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m264dragjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @NotNull
    public static final PointerDirectionConfig getHorizontalPointerDirectionConfig() {
        return HorizontalPointerDirectionConfig;
    }

    @NotNull
    public static final PointerDirectionConfig getVerticalPointerDirectionConfig() {
        return VerticalPointerDirectionConfig;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e9, code lost:
    
        if ((androidx.compose.ui.geometry.Offset.m1371getXimpl(androidx.compose.ui.input.pointer.PointerEventKt.positionChangeIgnoreConsumed(r13)) == 0.0f) == false) goto L51;
     */
    /* JADX WARN: Path cross not found for [B:46:0x00d9, B:35:0x00b0], limit reached: 64 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0079 -> B:23:0x007e). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: horizontalDrag-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m265horizontalDragjO51t88(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.AwaitPointerEventScope r17, long r18, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit> r20, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r21) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m265horizontalDragjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: isPointerUp-DmW0f2w, reason: not valid java name */
    public static final boolean m266isPointerUpDmW0f2w(PointerEvent pointerEvent, long j10) {
        PointerInputChange pointerInputChange;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                pointerInputChange = null;
                break;
            }
            pointerInputChange = changes.get(i10);
            if (PointerId.m2891equalsimpl0(pointerInputChange.getId(), j10)) {
                break;
            }
            i10++;
        }
        PointerInputChange pointerInputChange2 = pointerInputChange;
        if (pointerInputChange2 != null && pointerInputChange2.getPressed()) {
            z10 = true;
        }
        return true ^ z10;
    }

    /* JADX INFO: renamed from: pointerSlop-E8SPZFQ, reason: not valid java name */
    public static final float m267pointerSlopE8SPZFQ(@NotNull ViewConfiguration pointerSlop, int i10) {
        Intrinsics.checkNotNullParameter(pointerSlop, "$this$pointerSlop");
        return PointerType.m2964equalsimpl0(i10, PointerType.INSTANCE.m2969getMouseT8wyACA()) ? pointerSlop.getTouchSlop() * mouseToTouchSlopRatio : pointerSlop.getTouchSlop();
    }

    @NotNull
    public static final PointerDirectionConfig toPointerDirectionConfig(@NotNull Orientation orientation) {
        Intrinsics.checkNotNullParameter(orientation, "<this>");
        return orientation == Orientation.Vertical ? VerticalPointerDirectionConfig : HorizontalPointerDirectionConfig;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e9, code lost:
    
        if ((androidx.compose.ui.geometry.Offset.m1372getYimpl(androidx.compose.ui.input.pointer.PointerEventKt.positionChangeIgnoreConsumed(r13)) == 0.0f) == false) goto L51;
     */
    /* JADX WARN: Path cross not found for [B:46:0x00d9, B:35:0x00b0], limit reached: 64 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0079 -> B:23:0x007e). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: verticalDrag-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m268verticalDragjO51t88(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.AwaitPointerEventScope r17, long r18, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit> r20, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r21) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m268verticalDragjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
