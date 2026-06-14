package androidx.compose.material;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.input.pointer.b;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.z;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aI\u0010\f\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005H\u0080@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a]\u0010\u0012\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00052\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070\rH\u0082Hø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a!\u0010\u0017\u001a\u00020\u0014*\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a!\u0010\u001b\u001a\u00020\u0007*\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\"\u0017\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\"\u0017\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001f\u0010\u001e\"\u0014\u0010 \u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006!"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/input/pointer/PointerId;", "pointerId", "Landroidx/compose/ui/input/pointer/PointerType;", "pointerType", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "", "", "onPointerSlopReached", "awaitHorizontalPointerSlopOrCancellation-gDDlDlE", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitHorizontalPointerSlopOrCancellation", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "getDragDirectionValue", "awaitPointerSlopOrCancellation-pn7EDYM", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitPointerSlopOrCancellation", "Landroidx/compose/ui/input/pointer/PointerEvent;", "", "isPointerUp-DmW0f2w", "(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z", "isPointerUp", "Landroidx/compose/ui/platform/ViewConfiguration;", "pointerSlop-E8SPZFQ", "(Landroidx/compose/ui/platform/ViewConfiguration;I)F", "pointerSlop", "Landroidx/compose/ui/unit/Dp;", "mouseSlop", "F", "defaultTouchSlop", "mouseToTouchSlopRatio", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class DragGestureDetectorCopyKt {
    private static final float defaultTouchSlop;
    private static final float mouseSlop;
    private static final float mouseToTouchSlopRatio;

    static {
        float fM3951constructorimpl = Dp.m3951constructorimpl((float) 0.125d);
        mouseSlop = fM3951constructorimpl;
        float fM3951constructorimpl2 = Dp.m3951constructorimpl(18);
        defaultTouchSlop = fM3951constructorimpl2;
        mouseToTouchSlopRatio = fM3951constructorimpl / fM3951constructorimpl2;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0123 -> B:47:0x012b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0163 -> B:54:0x0165). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0180 -> B:47:0x012b). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: awaitHorizontalPointerSlopOrCancellation-gDDlDlE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m998awaitHorizontalPointerSlopOrCancellationgDDlDlE(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.AwaitPointerEventScope r20, long r21, int r23, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.Unit> r24, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r25) {
        /*
            Method dump skipped, instruction units count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DragGestureDetectorCopyKt.m998awaitHorizontalPointerSlopOrCancellationgDDlDlE(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: awaitPointerSlopOrCancellation-pn7EDYM, reason: not valid java name */
    private static final Object m999awaitPointerSlopOrCancellationpn7EDYM(AwaitPointerEventScope awaitPointerEventScope, long j10, int i10, Function2<? super PointerInputChange, ? super Float, Unit> function2, Function1<? super Offset, Float> function1, Continuation continuation) {
        float f10;
        int i11;
        int i12;
        PointerInputChange pointerInputChange;
        float f11;
        PointerInputChange pointerInputChange2;
        if (m1000isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j10)) {
            return null;
        }
        float fM1001pointerSlopE8SPZFQ = m1001pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i10);
        u0 u0Var = new u0();
        u0Var.f93333b = j10;
        float f12 = 0.0f;
        while (true) {
            int i13 = 0;
            z.c(0);
            int i14 = 1;
            Object objT = b.t(awaitPointerEventScope, null, continuation, 1, null);
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
            Intrinsics.checkNotNull(pointerInputChange);
            PointerInputChange pointerInputChange3 = pointerInputChange;
            if (pointerInputChange3.isConsumed()) {
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
                float fFloatValue = f10 + (function1.invoke(Offset.m1360boximpl(pointerInputChange3.getPosition())).floatValue() - function1.invoke(Offset.m1360boximpl(pointerInputChange3.getPreviousPosition())).floatValue());
                if (Math.abs(fFloatValue) < fM1001pointerSlopE8SPZFQ) {
                    PointerEventPass pointerEventPass = PointerEventPass.Final;
                    z.c(i11);
                    awaitPointerEventScope.awaitPointerEvent(pointerEventPass, continuation);
                    z.c(i12);
                    if (pointerInputChange3.isConsumed()) {
                        return null;
                    }
                    f11 = fFloatValue;
                } else {
                    function2.invoke(pointerInputChange3, Float.valueOf(fFloatValue - (Math.signum(fFloatValue) * fM1001pointerSlopE8SPZFQ)));
                    if (pointerInputChange3.isConsumed()) {
                        return pointerInputChange3;
                    }
                    f11 = 0.0f;
                    f12 = f11;
                }
            }
            f12 = f11;
        }
    }

    /* JADX INFO: renamed from: isPointerUp-DmW0f2w, reason: not valid java name */
    private static final boolean m1000isPointerUpDmW0f2w(PointerEvent pointerEvent, long j10) {
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
    public static final float m1001pointerSlopE8SPZFQ(@NotNull ViewConfiguration pointerSlop, int i10) {
        Intrinsics.checkNotNullParameter(pointerSlop, "$this$pointerSlop");
        return PointerType.m2964equalsimpl0(i10, PointerType.INSTANCE.m2969getMouseT8wyACA()) ? pointerSlop.getTouchSlop() * mouseToTouchSlopRatio : pointerSlop.getTouchSlop();
    }
}
