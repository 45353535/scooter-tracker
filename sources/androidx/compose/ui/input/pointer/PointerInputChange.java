package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.geometry.Offset;
import com.ironsource.C4240b4;
import com.my.target.common.menu.MenuActionType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\"\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001BT\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010ø\u0001\u0000¢\u0006\u0002\u0010\u0011Bh\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0017Bp\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001aBf\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001bB\\\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001cJ\u0006\u0010;\u001a\u00020<J\u0087\u0001\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010>\u001a\u00020\u00052\b\b\u0002\u0010?\u001a\u00020\u00072\b\b\u0002\u0010@\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010A\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u0007H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bB\u0010CJo\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010>\u001a\u00020\u00052\b\b\u0002\u0010?\u001a\u00020\u00072\b\b\u0002\u0010@\u001a\u00020\t2\b\b\u0002\u0010A\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bD\u0010EJw\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010>\u001a\u00020\u00052\b\b\u0002\u0010?\u001a\u00020\u00072\b\b\u0002\u0010@\u001a\u00020\t2\b\b\u0002\u0010A\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0016\u001a\u00020\u0007H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bF\u0010GJm\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010>\u001a\u00020\u00052\b\b\u0002\u0010?\u001a\u00020\u00072\b\b\u0002\u0010@\u001a\u00020\t2\b\b\u0002\u0010A\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0016\u001a\u00020\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bH\u0010IJ}\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010>\u001a\u00020\u00052\b\b\u0002\u0010?\u001a\u00020\u00072\b\b\u0002\u0010@\u001a\u00020\t2\b\b\u0002\u0010A\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u0007H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bJ\u0010KJ\b\u0010L\u001a\u00020MH\u0016R\u0016\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001fR&\u0010\r\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000e8\u0006@BX\u0087\u000e¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148GX\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010\"\u001a\u0004\b&\u0010'R\u001c\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010*\u001a\u0004\b(\u0010)R\u0017\u0010+\u001a\u00020\t8F¢\u0006\f\u0012\u0004\b,\u0010\"\u001a\u0004\b+\u0010-R\u001c\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010*\u001a\u0004\b.\u0010)R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b/\u0010-R\u001a\u0010\u0018\u001a\u00020\u00198GX\u0087\u0004¢\u0006\f\u0012\u0004\b0\u0010\"\u001a\u0004\b1\u00102R\u001c\u0010\u000b\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010*\u001a\u0004\b3\u0010)R\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b4\u0010-R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b5\u0010)R\u001c\u0010\u0016\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010*\u001a\u0004\b6\u0010)R\u001c\u0010\u000f\u001a\u00020\u0010ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u00109\u001a\u0004\b7\u00108R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b:\u0010)\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006N"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputChange;", "", "id", "Landroidx/compose/ui/input/pointer/PointerId;", "uptimeMillis", "", C4240b4.i.L, "Landroidx/compose/ui/geometry/Offset;", "pressed", "", "previousUptimeMillis", "previousPosition", "previousPressed", "consumed", "Landroidx/compose/ui/input/pointer/ConsumedData;", "type", "Landroidx/compose/ui/input/pointer/PointerType;", "(JJJZJJZLandroidx/compose/ui/input/pointer/ConsumedData;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "isInitiallyConsumed", "historical", "", "Landroidx/compose/ui/input/pointer/HistoricalChange;", "scrollDelta", "(JJJZJJZZILjava/util/List;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "pressure", "", "(JJJZFJJZZILjava/util/List;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "(JJJZFJJZZIJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "(JJJZJJZZIJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "_historical", "_pressure", "Ljava/lang/Float;", "<set-?>", "getConsumed$annotations", "()V", "getConsumed", "()Landroidx/compose/ui/input/pointer/ConsumedData;", "getHistorical$annotations", "getHistorical", "()Ljava/util/List;", "getId-J3iCeTQ", "()J", "J", "isConsumed", "isConsumed$annotations", "()Z", "getPosition-F1C5BW0", "getPressed", "getPressure$annotations", "getPressure", "()F", "getPreviousPosition-F1C5BW0", "getPreviousPressed", "getPreviousUptimeMillis", "getScrollDelta-F1C5BW0", "getType-T8wyACA", "()I", "I", "getUptimeMillis", "consume", "", MenuActionType.COPY, "currentTime", "currentPosition", "currentPressed", "previousTime", "copy-wbzehF4", "(JJJZFJJZILjava/util/List;J)Landroidx/compose/ui/input/pointer/PointerInputChange;", "copy-Ezr-O64", "(JJJZJJZLandroidx/compose/ui/input/pointer/ConsumedData;I)Landroidx/compose/ui/input/pointer/PointerInputChange;", "copy-0GkPj7c", "(JJJZJJZLandroidx/compose/ui/input/pointer/ConsumedData;IJ)Landroidx/compose/ui/input/pointer/PointerInputChange;", "copy-JKmWfYY", "(JJJZJJZIJ)Landroidx/compose/ui/input/pointer/PointerInputChange;", "copy-OHpmEuE", "(JJJZJJZILjava/util/List;J)Landroidx/compose/ui/input/pointer/PointerInputChange;", "toString", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PointerInputChange {
    public static final int $stable = 0;

    @Nullable
    private List<HistoricalChange> _historical;

    @Nullable
    private Float _pressure;

    @NotNull
    private ConsumedData consumed;
    private final long id;
    private final long position;
    private final boolean pressed;
    private final long previousPosition;
    private final boolean previousPressed;
    private final long previousUptimeMillis;
    private final long scrollDelta;
    private final int type;
    private final long uptimeMillis;

    @ExperimentalComposeUiApi
    public /* synthetic */ PointerInputChange(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, long j15, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, z10, f10, j13, j14, z11, z12, i10, j15);
    }

    /* JADX INFO: renamed from: copy-0GkPj7c$default, reason: not valid java name */
    public static /* synthetic */ PointerInputChange m2895copy0GkPj7c$default(PointerInputChange pointerInputChange, long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, ConsumedData consumedData, int i10, long j15, int i11, Object obj) {
        long j16;
        long j17 = (i11 & 1) != 0 ? pointerInputChange.id : j10;
        long j18 = (i11 & 2) != 0 ? pointerInputChange.uptimeMillis : j11;
        long j19 = (i11 & 4) != 0 ? pointerInputChange.position : j12;
        boolean z12 = (i11 & 8) != 0 ? pointerInputChange.pressed : z10;
        long j20 = (i11 & 16) != 0 ? pointerInputChange.previousUptimeMillis : j13;
        long j21 = (i11 & 32) != 0 ? pointerInputChange.previousPosition : j14;
        boolean z13 = (i11 & 64) != 0 ? pointerInputChange.previousPressed : z11;
        int i12 = (i11 & 256) != 0 ? pointerInputChange.type : i10;
        if ((i11 & 512) != 0) {
            j16 = pointerInputChange.scrollDelta;
            j17 = j17;
        } else {
            j16 = j15;
        }
        return pointerInputChange.m2900copy0GkPj7c(j17, j18, j19, z12, j20, j21, z13, consumedData, i12, j16);
    }

    /* JADX INFO: renamed from: copy-JKmWfYY$default, reason: not valid java name */
    public static /* synthetic */ PointerInputChange m2897copyJKmWfYY$default(PointerInputChange pointerInputChange, long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, int i10, long j15, int i11, Object obj) {
        long j16;
        long j17;
        long j18 = (i11 & 1) != 0 ? pointerInputChange.id : j10;
        long j19 = (i11 & 2) != 0 ? pointerInputChange.uptimeMillis : j11;
        long j20 = (i11 & 4) != 0 ? pointerInputChange.position : j12;
        boolean z12 = (i11 & 8) != 0 ? pointerInputChange.pressed : z10;
        long j21 = (i11 & 16) != 0 ? pointerInputChange.previousUptimeMillis : j13;
        long j22 = (i11 & 32) != 0 ? pointerInputChange.previousPosition : j14;
        boolean z13 = (i11 & 64) != 0 ? pointerInputChange.previousPressed : z11;
        int i12 = (i11 & 128) != 0 ? pointerInputChange.type : i10;
        if ((i11 & 256) != 0) {
            j16 = pointerInputChange.scrollDelta;
            j17 = j18;
        } else {
            j16 = j15;
            j17 = j18;
        }
        return pointerInputChange.m2902copyJKmWfYY(j17, j19, j20, z12, j21, j22, z13, i12, j16);
    }

    /* JADX INFO: renamed from: copy-OHpmEuE$default, reason: not valid java name */
    public static /* synthetic */ PointerInputChange m2898copyOHpmEuE$default(PointerInputChange pointerInputChange, long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, int i10, List list, long j15, int i11, Object obj) {
        long j16;
        long j17 = (i11 & 1) != 0 ? pointerInputChange.id : j10;
        long j18 = (i11 & 2) != 0 ? pointerInputChange.uptimeMillis : j11;
        long j19 = (i11 & 4) != 0 ? pointerInputChange.position : j12;
        boolean z12 = (i11 & 8) != 0 ? pointerInputChange.pressed : z10;
        long j20 = (i11 & 16) != 0 ? pointerInputChange.previousUptimeMillis : j13;
        long j21 = (i11 & 32) != 0 ? pointerInputChange.previousPosition : j14;
        boolean z13 = (i11 & 64) != 0 ? pointerInputChange.previousPressed : z11;
        int i12 = (i11 & 128) != 0 ? pointerInputChange.type : i10;
        if ((i11 & 512) != 0) {
            j16 = pointerInputChange.scrollDelta;
            j17 = j17;
        } else {
            j16 = j15;
        }
        return pointerInputChange.m2903copyOHpmEuE(j17, j18, j19, z12, j20, j21, z13, i12, list, j16);
    }

    /* JADX INFO: renamed from: copy-wbzehF4$default, reason: not valid java name */
    public static /* synthetic */ PointerInputChange m2899copywbzehF4$default(PointerInputChange pointerInputChange, long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, int i10, List list, long j15, int i11, Object obj) {
        long j16;
        long j17 = (i11 & 1) != 0 ? pointerInputChange.id : j10;
        long j18 = (i11 & 2) != 0 ? pointerInputChange.uptimeMillis : j11;
        long j19 = (i11 & 4) != 0 ? pointerInputChange.position : j12;
        boolean z12 = (i11 & 8) != 0 ? pointerInputChange.pressed : z10;
        float pressure = (i11 & 16) != 0 ? pointerInputChange.getPressure() : f10;
        long j20 = (i11 & 32) != 0 ? pointerInputChange.previousUptimeMillis : j13;
        long j21 = (i11 & 64) != 0 ? pointerInputChange.previousPosition : j14;
        boolean z13 = (i11 & 128) != 0 ? pointerInputChange.previousPressed : z11;
        int i12 = (i11 & 256) != 0 ? pointerInputChange.type : i10;
        if ((i11 & 1024) != 0) {
            j16 = pointerInputChange.scrollDelta;
            j17 = j17;
        } else {
            j16 = j15;
        }
        return pointerInputChange.m2904copywbzehF4(j17, j18, j19, z12, pressure, j20, j21, z13, i12, list, j16);
    }

    public static /* synthetic */ void getConsumed$annotations() {
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getHistorical$annotations() {
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getPressure$annotations() {
    }

    public static /* synthetic */ void isConsumed$annotations() {
    }

    public final void consume() {
        this.consumed.setDownChange(true);
        this.consumed.setPositionChange(true);
    }

    @NotNull
    /* JADX INFO: renamed from: copy-0GkPj7c, reason: not valid java name */
    public final PointerInputChange m2900copy0GkPj7c(long id2, long currentTime, long currentPosition, boolean currentPressed, long previousTime, long previousPosition, boolean previousPressed, @NotNull ConsumedData consumed, int type, long scrollDelta) {
        Intrinsics.checkNotNullParameter(consumed, "consumed");
        PointerInputChange pointerInputChange = new PointerInputChange(id2, currentTime, currentPosition, currentPressed, getPressure(), previousTime, previousPosition, previousPressed, consumed.getDownChange() || consumed.getPositionChange(), type, getHistorical(), scrollDelta, (DefaultConstructorMarker) null);
        this.consumed = consumed;
        return pointerInputChange;
    }

    /* JADX INFO: renamed from: copy-Ezr-O64, reason: not valid java name */
    public final /* synthetic */ PointerInputChange m2901copyEzrO64(long id2, long currentTime, long currentPosition, boolean currentPressed, long previousTime, long previousPosition, boolean previousPressed, ConsumedData consumed, int type) {
        Intrinsics.checkNotNullParameter(consumed, "consumed");
        PointerInputChange pointerInputChange = new PointerInputChange(id2, currentTime, currentPosition, currentPressed, getPressure(), previousTime, previousPosition, previousPressed, consumed.getDownChange() || consumed.getPositionChange(), type, getHistorical(), this.scrollDelta, (DefaultConstructorMarker) null);
        this.consumed = consumed;
        return pointerInputChange;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-JKmWfYY, reason: not valid java name */
    public final PointerInputChange m2902copyJKmWfYY(long id2, long currentTime, long currentPosition, boolean currentPressed, long previousTime, long previousPosition, boolean previousPressed, int type, long scrollDelta) {
        PointerInputChange pointerInputChange = new PointerInputChange(id2, currentTime, currentPosition, currentPressed, getPressure(), previousTime, previousPosition, previousPressed, false, type, (List) getHistorical(), scrollDelta, (DefaultConstructorMarker) null);
        pointerInputChange.consumed = this.consumed;
        return pointerInputChange;
    }

    @ExperimentalComposeUiApi
    @NotNull
    /* JADX INFO: renamed from: copy-OHpmEuE, reason: not valid java name */
    public final PointerInputChange m2903copyOHpmEuE(long id2, long currentTime, long currentPosition, boolean currentPressed, long previousTime, long previousPosition, boolean previousPressed, int type, @NotNull List<HistoricalChange> historical, long scrollDelta) {
        Intrinsics.checkNotNullParameter(historical, "historical");
        PointerInputChange pointerInputChange = new PointerInputChange(id2, currentTime, currentPosition, currentPressed, getPressure(), previousTime, previousPosition, previousPressed, false, type, (List) historical, scrollDelta, (DefaultConstructorMarker) null);
        pointerInputChange.consumed = this.consumed;
        return pointerInputChange;
    }

    @ExperimentalComposeUiApi
    @NotNull
    /* JADX INFO: renamed from: copy-wbzehF4, reason: not valid java name */
    public final PointerInputChange m2904copywbzehF4(long id2, long currentTime, long currentPosition, boolean currentPressed, float pressure, long previousTime, long previousPosition, boolean previousPressed, int type, @NotNull List<HistoricalChange> historical, long scrollDelta) {
        Intrinsics.checkNotNullParameter(historical, "historical");
        PointerInputChange pointerInputChange = new PointerInputChange(id2, currentTime, currentPosition, currentPressed, pressure, previousTime, previousPosition, previousPressed, false, type, (List) historical, scrollDelta, (DefaultConstructorMarker) null);
        pointerInputChange.consumed = this.consumed;
        return pointerInputChange;
    }

    @NotNull
    public final ConsumedData getConsumed() {
        return this.consumed;
    }

    @ExperimentalComposeUiApi
    @NotNull
    public final List<HistoricalChange> getHistorical() {
        List<HistoricalChange> list = this._historical;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    /* JADX INFO: renamed from: getId-J3iCeTQ, reason: not valid java name and from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: getPosition-F1C5BW0, reason: not valid java name and from getter */
    public final long getPosition() {
        return this.position;
    }

    public final boolean getPressed() {
        return this.pressed;
    }

    @ExperimentalComposeUiApi
    public final float getPressure() {
        Float f10 = this._pressure;
        if (f10 != null) {
            return f10.floatValue();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: getPreviousPosition-F1C5BW0, reason: not valid java name and from getter */
    public final long getPreviousPosition() {
        return this.previousPosition;
    }

    public final boolean getPreviousPressed() {
        return this.previousPressed;
    }

    public final long getPreviousUptimeMillis() {
        return this.previousUptimeMillis;
    }

    /* JADX INFO: renamed from: getScrollDelta-F1C5BW0, reason: not valid java name and from getter */
    public final long getScrollDelta() {
        return this.scrollDelta;
    }

    /* JADX INFO: renamed from: getType-T8wyACA, reason: not valid java name and from getter */
    public final int getType() {
        return this.type;
    }

    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    public final boolean isConsumed() {
        return this.consumed.getDownChange() || this.consumed.getPositionChange();
    }

    @NotNull
    public String toString() {
        return "PointerInputChange(id=" + ((Object) PointerId.m2893toStringimpl(this.id)) + ", uptimeMillis=" + this.uptimeMillis + ", position=" + ((Object) Offset.m1379toStringimpl(this.position)) + ", pressed=" + this.pressed + ", pressure=" + getPressure() + ", previousUptimeMillis=" + this.previousUptimeMillis + ", previousPosition=" + ((Object) Offset.m1379toStringimpl(this.previousPosition)) + ", previousPressed=" + this.previousPressed + ", isConsumed=" + isConsumed() + ", type=" + ((Object) PointerType.m2966toStringimpl(this.type)) + ", historical=" + getHistorical() + ",scrollDelta=" + ((Object) Offset.m1379toStringimpl(this.scrollDelta)) + ')';
    }

    @ExperimentalComposeUiApi
    public /* synthetic */ PointerInputChange(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, List list, long j15, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, z10, f10, j13, j14, z11, z12, i10, (List<HistoricalChange>) list, j15);
    }

    public /* synthetic */ PointerInputChange(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, ConsumedData consumedData, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, z10, j13, j14, z11, consumedData, i10);
    }

    public /* synthetic */ PointerInputChange(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, boolean z12, int i10, long j15, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, z10, j13, j14, z11, z12, i10, j15);
    }

    public /* synthetic */ PointerInputChange(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, boolean z12, int i10, List list, long j15, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, z10, j13, j14, z11, z12, i10, (List<HistoricalChange>) list, j15);
    }

    private PointerInputChange(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, boolean z12, int i10, long j15) {
        this.id = j10;
        this.uptimeMillis = j11;
        this.position = j12;
        this.pressed = z10;
        this.previousUptimeMillis = j13;
        this.previousPosition = j14;
        this.previousPressed = z11;
        this.type = i10;
        this.scrollDelta = j15;
        this.consumed = new ConsumedData(z12, z12);
    }

    public /* synthetic */ PointerInputChange(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, boolean z12, int i10, long j15, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, z10, j13, j14, z11, z12, (i11 & 256) != 0 ? PointerType.INSTANCE.m2971getTouchT8wyACA() : i10, (i11 & 512) != 0 ? Offset.INSTANCE.m1387getZeroF1C5BW0() : j15, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ PointerInputChange(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, ConsumedData consumedData, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, z10, j13, j14, z11, consumedData, (i11 & 256) != 0 ? PointerType.INSTANCE.m2971getTouchT8wyACA() : i10, (DefaultConstructorMarker) null);
    }

    private PointerInputChange(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, ConsumedData consumedData, int i10) {
        this(j10, j11, j12, z10, 1.0f, j13, j14, z11, consumedData.getDownChange() || consumedData.getPositionChange(), i10, Offset.INSTANCE.m1387getZeroF1C5BW0(), (DefaultConstructorMarker) null);
    }

    private PointerInputChange(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, boolean z12, int i10, List<HistoricalChange> list, long j15) {
        this(j10, j11, j12, z10, 1.0f, j13, j14, z11, z12, i10, list, j15, (DefaultConstructorMarker) null);
        this._historical = list;
    }

    private PointerInputChange(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, List<HistoricalChange> list, long j15) {
        this(j10, j11, j12, z10, f10, j13, j14, z11, z12, i10, j15, (DefaultConstructorMarker) null);
        this._historical = list;
    }

    public /* synthetic */ PointerInputChange(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, long j15, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, z10, f10, j13, j14, z11, z12, (i11 & 512) != 0 ? PointerType.INSTANCE.m2971getTouchT8wyACA() : i10, (i11 & 1024) != 0 ? Offset.INSTANCE.m1387getZeroF1C5BW0() : j15, (DefaultConstructorMarker) null);
    }

    private PointerInputChange(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, long j15) {
        this(j10, j11, j12, z10, j13, j14, z11, z12, i10, j15, (DefaultConstructorMarker) null);
        this._pressure = Float.valueOf(f10);
    }
}
