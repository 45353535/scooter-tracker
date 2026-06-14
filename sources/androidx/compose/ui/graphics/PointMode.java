package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import com.google.maps.android.data.kml.KmlPolygon;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0014\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/graphics/PointMode;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", com.taurusx.tax.f.y.f66058y, "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PointMode {
    private final int value;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int Points = m1873constructorimpl(0);
    private static final int Lines = m1873constructorimpl(1);
    private static final int Polygon = m1873constructorimpl(2);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, d2 = {"Landroidx/compose/ui/graphics/PointMode$Companion;", "", "()V", "Lines", "Landroidx/compose/ui/graphics/PointMode;", "getLines-r_lszbg", "()I", "I", "Points", "getPoints-r_lszbg", KmlPolygon.GEOMETRY_TYPE, "getPolygon-r_lszbg", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getLines-r_lszbg, reason: not valid java name */
        public final int m1879getLinesr_lszbg() {
            return PointMode.Lines;
        }

        /* JADX INFO: renamed from: getPoints-r_lszbg, reason: not valid java name */
        public final int m1880getPointsr_lszbg() {
            return PointMode.Points;
        }

        /* JADX INFO: renamed from: getPolygon-r_lszbg, reason: not valid java name */
        public final int m1881getPolygonr_lszbg() {
            return PointMode.Polygon;
        }

        private Companion() {
        }
    }

    private /* synthetic */ PointMode(int i10) {
        this.value = i10;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PointMode m1872boximpl(int i10) {
        return new PointMode(i10);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m1873constructorimpl(int i10) {
        return i10;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m1874equalsimpl(int i10, Object obj) {
        return (obj instanceof PointMode) && i10 == ((PointMode) obj).getValue();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1875equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m1876hashCodeimpl(int i10) {
        return i10;
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m1877toStringimpl(int i10) {
        return m1875equalsimpl0(i10, Points) ? "Points" : m1875equalsimpl0(i10, Lines) ? "Lines" : m1875equalsimpl0(i10, Polygon) ? KmlPolygon.GEOMETRY_TYPE : "Unknown";
    }

    public boolean equals(Object obj) {
        return m1874equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m1876hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m1877toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }
}
