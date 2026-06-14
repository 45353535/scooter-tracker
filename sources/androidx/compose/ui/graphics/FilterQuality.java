package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0014\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0005J\u000f\u0010\u000f\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/graphics/FilterQuality;", "", "value", "", "constructor-impl", "(I)I", "getValue", "()I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", com.taurusx.tax.f.y.f66058y, "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FilterQuality {
    private final int value;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int None = m1692constructorimpl(0);
    private static final int Low = m1692constructorimpl(1);
    private static final int Medium = m1692constructorimpl(2);
    private static final int High = m1692constructorimpl(3);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u001c\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/graphics/FilterQuality$Companion;", "", "()V", "High", "Landroidx/compose/ui/graphics/FilterQuality;", "getHigh-f-v9h1I", "()I", "I", "Low", "getLow-f-v9h1I", "Medium", "getMedium-f-v9h1I", "None", "getNone-f-v9h1I", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getHigh-f-v9h1I, reason: not valid java name */
        public final int m1698getHighfv9h1I() {
            return FilterQuality.High;
        }

        /* JADX INFO: renamed from: getLow-f-v9h1I, reason: not valid java name */
        public final int m1699getLowfv9h1I() {
            return FilterQuality.Low;
        }

        /* JADX INFO: renamed from: getMedium-f-v9h1I, reason: not valid java name */
        public final int m1700getMediumfv9h1I() {
            return FilterQuality.Medium;
        }

        /* JADX INFO: renamed from: getNone-f-v9h1I, reason: not valid java name */
        public final int m1701getNonefv9h1I() {
            return FilterQuality.None;
        }

        private Companion() {
        }
    }

    private /* synthetic */ FilterQuality(int i10) {
        this.value = i10;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FilterQuality m1691boximpl(int i10) {
        return new FilterQuality(i10);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m1692constructorimpl(int i10) {
        return i10;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m1693equalsimpl(int i10, Object obj) {
        return (obj instanceof FilterQuality) && i10 == ((FilterQuality) obj).m1697unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1694equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m1695hashCodeimpl(int i10) {
        return i10;
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m1696toStringimpl(int i10) {
        return m1694equalsimpl0(i10, None) ? "None" : m1694equalsimpl0(i10, Low) ? "Low" : m1694equalsimpl0(i10, Medium) ? "Medium" : m1694equalsimpl0(i10, High) ? "High" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m1693equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m1695hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m1696toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m1697unboximpl() {
        return this.value;
    }
}
