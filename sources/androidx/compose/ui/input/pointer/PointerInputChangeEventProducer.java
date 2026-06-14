package androidx.compose.ui.input.pointer;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputChangeEventProducer;", "", "()V", "previousPointerInputData", "", "Landroidx/compose/ui/input/pointer/PointerId;", "Landroidx/compose/ui/input/pointer/PointerInputChangeEventProducer$PointerInputData;", "clear", "", "produce", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "pointerInputEvent", "Landroidx/compose/ui/input/pointer/PointerInputEvent;", "positionCalculator", "Landroidx/compose/ui/input/pointer/PositionCalculator;", "PointerInputData", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class PointerInputChangeEventProducer {

    @NotNull
    private final Map<PointerId, PointerInputData> previousPointerInputData = new LinkedHashMap();

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B(\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\tø\u0001\u0000¢\u0006\u0002\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\b\u001a\u00020\tø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputChangeEventProducer$PointerInputData;", "", "uptime", "", "positionOnScreen", "Landroidx/compose/ui/geometry/Offset;", "down", "", "type", "Landroidx/compose/ui/input/pointer/PointerType;", "(JJZILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getDown", "()Z", "getPositionOnScreen-F1C5BW0", "()J", "J", "getType-T8wyACA", "()I", "I", "getUptime", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class PointerInputData {
        private final boolean down;
        private final long positionOnScreen;
        private final int type;
        private final long uptime;

        public /* synthetic */ PointerInputData(long j10, long j11, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(j10, j11, z10, i10);
        }

        public final boolean getDown() {
            return this.down;
        }

        /* JADX INFO: renamed from: getPositionOnScreen-F1C5BW0, reason: not valid java name and from getter */
        public final long getPositionOnScreen() {
            return this.positionOnScreen;
        }

        /* JADX INFO: renamed from: getType-T8wyACA, reason: not valid java name and from getter */
        public final int getType() {
            return this.type;
        }

        public final long getUptime() {
            return this.uptime;
        }

        private PointerInputData(long j10, long j11, boolean z10, int i10) {
            this.uptime = j10;
            this.positionOnScreen = j11;
            this.down = z10;
            this.type = i10;
        }
    }

    public final void clear() {
        this.previousPointerInputData.clear();
    }

    @NotNull
    public final InternalPointerEvent produce(@NotNull PointerInputEvent pointerInputEvent, @NotNull PositionCalculator positionCalculator) {
        long uptime;
        boolean down;
        long jMo2974screenToLocalMKHz9U;
        Intrinsics.checkNotNullParameter(pointerInputEvent, "pointerInputEvent");
        Intrinsics.checkNotNullParameter(positionCalculator, "positionCalculator");
        LinkedHashMap linkedHashMap = new LinkedHashMap(pointerInputEvent.getPointers().size());
        List<PointerInputEventData> pointers = pointerInputEvent.getPointers();
        int size = pointers.size();
        for (int i10 = 0; i10 < size; i10++) {
            PointerInputEventData pointerInputEventData = pointers.get(i10);
            PointerInputData pointerInputData = this.previousPointerInputData.get(PointerId.m2888boximpl(pointerInputEventData.m2919getIdJ3iCeTQ()));
            if (pointerInputData == null) {
                down = false;
                uptime = pointerInputEventData.getUptime();
                jMo2974screenToLocalMKHz9U = pointerInputEventData.m2920getPositionF1C5BW0();
            } else {
                uptime = pointerInputData.getUptime();
                down = pointerInputData.getDown();
                jMo2974screenToLocalMKHz9U = positionCalculator.mo2974screenToLocalMKHz9U(pointerInputData.getPositionOnScreen());
            }
            linkedHashMap.put(PointerId.m2888boximpl(pointerInputEventData.m2919getIdJ3iCeTQ()), new PointerInputChange(pointerInputEventData.m2919getIdJ3iCeTQ(), pointerInputEventData.getUptime(), pointerInputEventData.m2920getPositionF1C5BW0(), pointerInputEventData.getDown(), pointerInputEventData.getPressure(), uptime, jMo2974screenToLocalMKHz9U, down, false, pointerInputEventData.m2923getTypeT8wyACA(), (List) pointerInputEventData.getHistorical(), pointerInputEventData.m2922getScrollDeltaF1C5BW0(), (DefaultConstructorMarker) null));
            if (pointerInputEventData.getDown()) {
                this.previousPointerInputData.put(PointerId.m2888boximpl(pointerInputEventData.m2919getIdJ3iCeTQ()), new PointerInputData(pointerInputEventData.getUptime(), pointerInputEventData.m2921getPositionOnScreenF1C5BW0(), pointerInputEventData.getDown(), pointerInputEventData.m2923getTypeT8wyACA(), null));
            } else {
                this.previousPointerInputData.remove(PointerId.m2888boximpl(pointerInputEventData.m2919getIdJ3iCeTQ()));
            }
        }
        return new InternalPointerEvent(linkedHashMap, pointerInputEvent);
    }
}
