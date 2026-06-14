package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\u001a.\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0000\u001aG\u0010\b\u001a\u00020\t*\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\nj\u0002`\u000e2\u0006\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\rH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001aO\u0010\u0013\u001a\u00020\t*\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\nj\u0002`\u000e2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\rH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a[\u0010\u0017\u001a\u00020\t*\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\nj\u0002`\u000e2\u0006\u0010\u000f\u001a\u00020\u000b2\u0012\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u0019\"\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\rH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001aU\u0010\u0017\u001a\u00020\t*\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\nj\u0002`\u000e2\u0006\u0010\u000f\u001a\u00020\u000b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u001c2\b\b\u0002\u0010\u0010\u001a\u00020\rH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001d\u001a(\u0010\u001e\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010 \u001a\u00020\u0006H\u0000\u001a(\u0010!\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0000\u001a\u0014\u0010\"\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000*<\b\u0000\u0010#\"\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\n2\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006$"}, d2 = {"down", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "id", "", "durationMillis", "x", "", "y", "invokeOverAllPasses", "", "Lkotlin/Function3;", "Landroidx/compose/ui/input/pointer/PointerEvent;", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/ui/input/pointer/PointerInputHandler;", "pointerEvent", "size", "invokeOverAllPasses-H0pRuoY", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/input/pointer/PointerEvent;J)V", "invokeOverPass", "pointerEventPass", "invokeOverPass-hUlJWOE", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "invokeOverPasses", "pointerEventPasses", "", "invokeOverPasses-hUlJWOE", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/input/pointer/PointerEvent;[Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/input/pointer/PointerEvent;Ljava/util/List;J)V", "moveBy", "dx", "dy", "moveTo", "up", "PointerInputHandler", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PointerInputTestUtilKt {
    @NotNull
    public static final PointerInputChange down(long j10, long j11, float f10, float f11) {
        return new PointerInputChange(PointerId.m2889constructorimpl(j10), j11, OffsetKt.Offset(f10, f11), true, 1.0f, j11, OffsetKt.Offset(f10, f11), false, false, 0, 0L, 1536, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ PointerInputChange down$default(long j10, long j11, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j11 = 0;
        }
        return down(j10, j11, (i10 & 4) != 0 ? 0.0f : f10, (i10 & 8) != 0 ? 0.0f : f11);
    }

    /* JADX INFO: renamed from: invokeOverAllPasses-H0pRuoY, reason: not valid java name */
    public static final void m2943invokeOverAllPassesH0pRuoY(@NotNull Function3<? super PointerEvent, ? super PointerEventPass, ? super IntSize, Unit> invokeOverAllPasses, @NotNull PointerEvent pointerEvent, long j10) {
        Intrinsics.checkNotNullParameter(invokeOverAllPasses, "$this$invokeOverAllPasses");
        Intrinsics.checkNotNullParameter(pointerEvent, "pointerEvent");
        m2947invokeOverPasseshUlJWOE(invokeOverAllPasses, pointerEvent, (List<? extends PointerEventPass>) CollectionsKt.listOf((Object[]) new PointerEventPass[]{PointerEventPass.Initial, PointerEventPass.Main, PointerEventPass.Final}), j10);
    }

    /* JADX INFO: renamed from: invokeOverAllPasses-H0pRuoY$default, reason: not valid java name */
    public static /* synthetic */ void m2944invokeOverAllPassesH0pRuoY$default(Function3 function3, PointerEvent pointerEvent, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = IntSizeKt.IntSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
        m2943invokeOverAllPassesH0pRuoY(function3, pointerEvent, j10);
    }

    /* JADX INFO: renamed from: invokeOverPass-hUlJWOE, reason: not valid java name */
    public static final void m2945invokeOverPasshUlJWOE(@NotNull Function3<? super PointerEvent, ? super PointerEventPass, ? super IntSize, Unit> invokeOverPass, @NotNull PointerEvent pointerEvent, @NotNull PointerEventPass pointerEventPass, long j10) {
        Intrinsics.checkNotNullParameter(invokeOverPass, "$this$invokeOverPass");
        Intrinsics.checkNotNullParameter(pointerEvent, "pointerEvent");
        Intrinsics.checkNotNullParameter(pointerEventPass, "pointerEventPass");
        m2947invokeOverPasseshUlJWOE(invokeOverPass, pointerEvent, (List<? extends PointerEventPass>) CollectionsKt.listOf(pointerEventPass), j10);
    }

    /* JADX INFO: renamed from: invokeOverPass-hUlJWOE$default, reason: not valid java name */
    public static /* synthetic */ void m2946invokeOverPasshUlJWOE$default(Function3 function3, PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j10 = IntSizeKt.IntSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
        m2945invokeOverPasshUlJWOE(function3, pointerEvent, pointerEventPass, j10);
    }

    /* JADX INFO: renamed from: invokeOverPasses-hUlJWOE, reason: not valid java name */
    public static final void m2948invokeOverPasseshUlJWOE(@NotNull Function3<? super PointerEvent, ? super PointerEventPass, ? super IntSize, Unit> invokeOverPasses, @NotNull PointerEvent pointerEvent, @NotNull PointerEventPass[] pointerEventPasses, long j10) {
        Intrinsics.checkNotNullParameter(invokeOverPasses, "$this$invokeOverPasses");
        Intrinsics.checkNotNullParameter(pointerEvent, "pointerEvent");
        Intrinsics.checkNotNullParameter(pointerEventPasses, "pointerEventPasses");
        m2947invokeOverPasseshUlJWOE(invokeOverPasses, pointerEvent, (List<? extends PointerEventPass>) ArraysKt.toList(pointerEventPasses), j10);
    }

    /* JADX INFO: renamed from: invokeOverPasses-hUlJWOE$default, reason: not valid java name */
    public static /* synthetic */ void m2950invokeOverPasseshUlJWOE$default(Function3 function3, PointerEvent pointerEvent, PointerEventPass[] pointerEventPassArr, long j10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j10 = IntSizeKt.IntSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
        m2948invokeOverPasseshUlJWOE((Function3<? super PointerEvent, ? super PointerEventPass, ? super IntSize, Unit>) function3, pointerEvent, pointerEventPassArr, j10);
    }

    @NotNull
    public static final PointerInputChange moveBy(@NotNull PointerInputChange pointerInputChange, long j10, float f10, float f11) {
        Intrinsics.checkNotNullParameter(pointerInputChange, "<this>");
        long id2 = pointerInputChange.getId();
        long uptimeMillis = pointerInputChange.getUptimeMillis();
        boolean pressed = pointerInputChange.getPressed();
        return new PointerInputChange(id2, pointerInputChange.getUptimeMillis() + j10, OffsetKt.Offset(Offset.m1371getXimpl(pointerInputChange.getPosition()) + f10, Offset.m1372getYimpl(pointerInputChange.getPosition()) + f11), true, 1.0f, uptimeMillis, pointerInputChange.getPosition(), pressed, false, 0, 0L, 1536, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ PointerInputChange moveBy$default(PointerInputChange pointerInputChange, long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            f11 = 0.0f;
        }
        return moveBy(pointerInputChange, j10, f10, f11);
    }

    @NotNull
    public static final PointerInputChange moveTo(@NotNull PointerInputChange pointerInputChange, long j10, float f10, float f11) {
        Intrinsics.checkNotNullParameter(pointerInputChange, "<this>");
        long id2 = pointerInputChange.getId();
        long uptimeMillis = pointerInputChange.getUptimeMillis();
        boolean pressed = pointerInputChange.getPressed();
        return new PointerInputChange(id2, j10, OffsetKt.Offset(f10, f11), true, 1.0f, uptimeMillis, pointerInputChange.getPosition(), pressed, false, 0, 0L, 1536, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ PointerInputChange moveTo$default(PointerInputChange pointerInputChange, long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            f11 = 0.0f;
        }
        return moveTo(pointerInputChange, j10, f10, f11);
    }

    @NotNull
    public static final PointerInputChange up(@NotNull PointerInputChange pointerInputChange, long j10) {
        Intrinsics.checkNotNullParameter(pointerInputChange, "<this>");
        long id2 = pointerInputChange.getId();
        long uptimeMillis = pointerInputChange.getUptimeMillis();
        boolean pressed = pointerInputChange.getPressed();
        return new PointerInputChange(id2, j10, pointerInputChange.getPosition(), false, 1.0f, uptimeMillis, pointerInputChange.getPosition(), pressed, false, 0, 0L, 1536, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: invokeOverPasses-hUlJWOE, reason: not valid java name */
    public static final void m2947invokeOverPasseshUlJWOE(@NotNull Function3<? super PointerEvent, ? super PointerEventPass, ? super IntSize, Unit> invokeOverPasses, @NotNull PointerEvent pointerEvent, @NotNull List<? extends PointerEventPass> pointerEventPasses, long j10) {
        Intrinsics.checkNotNullParameter(invokeOverPasses, "$this$invokeOverPasses");
        Intrinsics.checkNotNullParameter(pointerEvent, "pointerEvent");
        Intrinsics.checkNotNullParameter(pointerEventPasses, "pointerEventPasses");
        if (pointerEvent.getChanges().isEmpty()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (pointerEventPasses.isEmpty()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int size = pointerEventPasses.size();
        for (int i10 = 0; i10 < size; i10++) {
            invokeOverPasses.invoke(pointerEvent, pointerEventPasses.get(i10), IntSize.m4103boximpl(j10));
        }
    }

    /* JADX INFO: renamed from: invokeOverPasses-hUlJWOE$default, reason: not valid java name */
    public static /* synthetic */ void m2949invokeOverPasseshUlJWOE$default(Function3 function3, PointerEvent pointerEvent, List list, long j10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j10 = IntSizeKt.IntSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
        m2947invokeOverPasseshUlJWOE((Function3<? super PointerEvent, ? super PointerEventPass, ? super IntSize, Unit>) function3, pointerEvent, (List<? extends PointerEventPass>) list, j10);
    }
}
