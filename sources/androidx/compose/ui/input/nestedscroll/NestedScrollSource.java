package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.ExperimentalComposeUiApi;
import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0014\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", y.f66058y, "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class NestedScrollSource {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int Drag = m2811constructorimpl(1);
    private static final int Fling = m2811constructorimpl(2);
    private static final int Relocate = m2811constructorimpl(3);
    private final int value;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R'\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u0007\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollSource$Companion;", "", "()V", "Drag", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "getDrag-WNlRxjI", "()I", "I", "Fling", "getFling-WNlRxjI", "Relocate", "getRelocate-WNlRxjI$annotations", "getRelocate-WNlRxjI", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @ExperimentalComposeUiApi
        /* JADX INFO: renamed from: getRelocate-WNlRxjI$annotations, reason: not valid java name */
        public static /* synthetic */ void m2817getRelocateWNlRxjI$annotations() {
        }

        /* JADX INFO: renamed from: getDrag-WNlRxjI, reason: not valid java name */
        public final int m2818getDragWNlRxjI() {
            return NestedScrollSource.Drag;
        }

        /* JADX INFO: renamed from: getFling-WNlRxjI, reason: not valid java name */
        public final int m2819getFlingWNlRxjI() {
            return NestedScrollSource.Fling;
        }

        /* JADX INFO: renamed from: getRelocate-WNlRxjI, reason: not valid java name */
        public final int m2820getRelocateWNlRxjI() {
            return NestedScrollSource.Relocate;
        }

        private Companion() {
        }
    }

    private /* synthetic */ NestedScrollSource(int i10) {
        this.value = i10;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ NestedScrollSource m2810boximpl(int i10) {
        return new NestedScrollSource(i10);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m2811constructorimpl(int i10) {
        return i10;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m2812equalsimpl(int i10, Object obj) {
        return (obj instanceof NestedScrollSource) && i10 == ((NestedScrollSource) obj).getValue();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2813equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m2814hashCodeimpl(int i10) {
        return i10;
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m2815toStringimpl(int i10) {
        return m2813equalsimpl0(i10, Drag) ? "Drag" : m2813equalsimpl0(i10, Fling) ? "Fling" : m2813equalsimpl0(i10, Relocate) ? "Relocate" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m2812equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m2814hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m2815toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }
}
