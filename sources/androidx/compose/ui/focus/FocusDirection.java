package androidx.compose.ui.focus;

import androidx.compose.ui.ExperimentalComposeUiApi;
import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0014\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/focus/FocusDirection;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", y.f66058y, "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FocusDirection {
    private static final int Enter;
    private static final int Exit;
    private static final int In;
    private static final int Out;
    private final int value;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int Next = m1293constructorimpl(1);
    private static final int Previous = m1293constructorimpl(2);
    private static final int Left = m1293constructorimpl(3);
    private static final int Right = m1293constructorimpl(4);
    private static final int Up = m1293constructorimpl(5);
    private static final int Down = m1293constructorimpl(6);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R'\u0010\b\u001a\u00020\u00048GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u0007\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0006R'\u0010\u000b\u001a\u00020\u00048GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u0007\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u0006R'\u0010\u000e\u001a\u00020\u00048GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u0007\u0012\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0006R\u001c\u0010\u0011\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0012\u0010\u0006R\u001c\u0010\u0013\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0014\u0010\u0006R'\u0010\u0015\u001a\u00020\u00048GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u0007\u0012\u0004\b\u0016\u0010\u0002\u001a\u0004\b\u0017\u0010\u0006R\u001c\u0010\u0018\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0019\u0010\u0006R\u001c\u0010\u001a\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001b\u0010\u0006R\u001c\u0010\u001c\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001d\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/focus/FocusDirection$Companion;", "", "()V", "Down", "Landroidx/compose/ui/focus/FocusDirection;", "getDown-dhqQ-8s", "()I", "I", "Enter", "getEnter-dhqQ-8s$annotations", "getEnter-dhqQ-8s", "Exit", "getExit-dhqQ-8s$annotations", "getExit-dhqQ-8s", "In", "getIn-dhqQ-8s$annotations", "getIn-dhqQ-8s", "Left", "getLeft-dhqQ-8s", "Next", "getNext-dhqQ-8s", "Out", "getOut-dhqQ-8s$annotations", "getOut-dhqQ-8s", "Previous", "getPrevious-dhqQ-8s", "Right", "getRight-dhqQ-8s", "Up", "getUp-dhqQ-8s", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @ExperimentalComposeUiApi
        /* JADX INFO: renamed from: getEnter-dhqQ-8s$annotations, reason: not valid java name */
        public static /* synthetic */ void m1299getEnterdhqQ8s$annotations() {
        }

        @ExperimentalComposeUiApi
        /* JADX INFO: renamed from: getExit-dhqQ-8s$annotations, reason: not valid java name */
        public static /* synthetic */ void m1300getExitdhqQ8s$annotations() {
        }

        @ExperimentalComposeUiApi
        /* JADX INFO: renamed from: getIn-dhqQ-8s$annotations, reason: not valid java name */
        public static /* synthetic */ void m1301getIndhqQ8s$annotations() {
        }

        @ExperimentalComposeUiApi
        /* JADX INFO: renamed from: getOut-dhqQ-8s$annotations, reason: not valid java name */
        public static /* synthetic */ void m1302getOutdhqQ8s$annotations() {
        }

        /* JADX INFO: renamed from: getDown-dhqQ-8s, reason: not valid java name */
        public final int m1303getDowndhqQ8s() {
            return FocusDirection.Down;
        }

        @ExperimentalComposeUiApi
        /* JADX INFO: renamed from: getEnter-dhqQ-8s, reason: not valid java name */
        public final int m1304getEnterdhqQ8s() {
            return FocusDirection.Enter;
        }

        @ExperimentalComposeUiApi
        /* JADX INFO: renamed from: getExit-dhqQ-8s, reason: not valid java name */
        public final int m1305getExitdhqQ8s() {
            return FocusDirection.Exit;
        }

        @ExperimentalComposeUiApi
        /* JADX INFO: renamed from: getIn-dhqQ-8s, reason: not valid java name */
        public final int m1306getIndhqQ8s() {
            return FocusDirection.In;
        }

        /* JADX INFO: renamed from: getLeft-dhqQ-8s, reason: not valid java name */
        public final int m1307getLeftdhqQ8s() {
            return FocusDirection.Left;
        }

        /* JADX INFO: renamed from: getNext-dhqQ-8s, reason: not valid java name */
        public final int m1308getNextdhqQ8s() {
            return FocusDirection.Next;
        }

        @ExperimentalComposeUiApi
        /* JADX INFO: renamed from: getOut-dhqQ-8s, reason: not valid java name */
        public final int m1309getOutdhqQ8s() {
            return FocusDirection.Out;
        }

        /* JADX INFO: renamed from: getPrevious-dhqQ-8s, reason: not valid java name */
        public final int m1310getPreviousdhqQ8s() {
            return FocusDirection.Previous;
        }

        /* JADX INFO: renamed from: getRight-dhqQ-8s, reason: not valid java name */
        public final int m1311getRightdhqQ8s() {
            return FocusDirection.Right;
        }

        /* JADX INFO: renamed from: getUp-dhqQ-8s, reason: not valid java name */
        public final int m1312getUpdhqQ8s() {
            return FocusDirection.Up;
        }

        private Companion() {
        }
    }

    static {
        int iM1293constructorimpl = m1293constructorimpl(7);
        Enter = iM1293constructorimpl;
        int iM1293constructorimpl2 = m1293constructorimpl(8);
        Exit = iM1293constructorimpl2;
        In = iM1293constructorimpl;
        Out = iM1293constructorimpl2;
    }

    private /* synthetic */ FocusDirection(int i10) {
        this.value = i10;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FocusDirection m1292boximpl(int i10) {
        return new FocusDirection(i10);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m1293constructorimpl(int i10) {
        return i10;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m1294equalsimpl(int i10, Object obj) {
        return (obj instanceof FocusDirection) && i10 == ((FocusDirection) obj).getValue();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1295equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m1296hashCodeimpl(int i10) {
        return i10;
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m1297toStringimpl(int i10) {
        return m1295equalsimpl0(i10, Next) ? "Next" : m1295equalsimpl0(i10, Previous) ? "Previous" : m1295equalsimpl0(i10, Left) ? "Left" : m1295equalsimpl0(i10, Right) ? "Right" : m1295equalsimpl0(i10, Up) ? "Up" : m1295equalsimpl0(i10, Down) ? "Down" : m1295equalsimpl0(i10, Enter) ? "Enter" : m1295equalsimpl0(i10, Exit) ? "Exit" : "Invalid FocusDirection";
    }

    public boolean equals(Object obj) {
        return m1294equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m1296hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m1297toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }
}
