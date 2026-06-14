package androidx.compose.ui.geometry;

import androidx.collection.b;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import com.my.target.common.menu.MenuActionType;
import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087@\u0018\u0000 92\u00020\u0001:\u00019B\u0014\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u000f\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0004\b\u0010\u0010\u000bJ\u0010\u0010\u0011\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0004\b\u0012\u0010\u000bJ*\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u0007ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0007H\u0087\u0002ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0007¢\u0006\u0004\b \u0010\u000bJ\u000f\u0010!\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\"\u0010\u000bJ\u0010\u0010#\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001bH\u0007¢\u0006\u0004\b(\u0010)J\u001e\u0010*\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u001e\u0010-\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b.\u0010,J!\u0010/\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0007H\u0087\u0002ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b0\u0010\u0019J!\u00101\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0007H\u0087\u0002ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b2\u0010\u0019J\u000f\u00103\u001a\u000204H\u0016¢\u0006\u0004\b5\u00106J\u0019\u00107\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b8\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000b\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006:"}, d2 = {"Landroidx/compose/ui/geometry/Offset;", "", "packedValue", "", "constructor-impl", "(J)J", "x", "", "getX$annotations", "()V", "getX-impl", "(J)F", "y", "getY$annotations", "getY-impl", "component1", "component1-impl", "component2", "component2-impl", MenuActionType.COPY, "copy-dBAh8RU", "(JFF)J", "div", "operand", "div-tuRUvjQ", "(JF)J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "getDistance", "getDistance-impl", "getDistanceSquared", "getDistanceSquared-impl", "hashCode", "", "hashCode-impl", "(J)I", "isValid", "isValid-impl", "(J)Z", "minus", "minus-MK-Hz9U", "(JJ)J", "plus", "plus-MK-Hz9U", "rem", "rem-tuRUvjQ", "times", "times-tuRUvjQ", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "unaryMinus", "unaryMinus-F1C5BW0", y.f66058y, "ui-geometry_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Offset {
    private final long packedValue;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final long Zero = OffsetKt.Offset(0.0f, 0.0f);
    private static final long Infinite = OffsetKt.Offset(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    private static final long Unspecified = OffsetKt.Offset(Float.NaN, Float.NaN);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R'\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R'\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\u0007R'\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u0007\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/geometry/Offset$Companion;", "", "()V", "Infinite", "Landroidx/compose/ui/geometry/Offset;", "getInfinite-F1C5BW0$annotations", "getInfinite-F1C5BW0", "()J", "J", "Unspecified", "getUnspecified-F1C5BW0$annotations", "getUnspecified-F1C5BW0", "Zero", "getZero-F1C5BW0$annotations", "getZero-F1C5BW0", "ui-geometry_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Stable
        /* JADX INFO: renamed from: getInfinite-F1C5BW0$annotations, reason: not valid java name */
        public static /* synthetic */ void m1382getInfiniteF1C5BW0$annotations() {
        }

        @Stable
        /* JADX INFO: renamed from: getUnspecified-F1C5BW0$annotations, reason: not valid java name */
        public static /* synthetic */ void m1383getUnspecifiedF1C5BW0$annotations() {
        }

        @Stable
        /* JADX INFO: renamed from: getZero-F1C5BW0$annotations, reason: not valid java name */
        public static /* synthetic */ void m1384getZeroF1C5BW0$annotations() {
        }

        /* JADX INFO: renamed from: getInfinite-F1C5BW0, reason: not valid java name */
        public final long m1385getInfiniteF1C5BW0() {
            return Offset.Infinite;
        }

        /* JADX INFO: renamed from: getUnspecified-F1C5BW0, reason: not valid java name */
        public final long m1386getUnspecifiedF1C5BW0() {
            return Offset.Unspecified;
        }

        /* JADX INFO: renamed from: getZero-F1C5BW0, reason: not valid java name */
        public final long m1387getZeroF1C5BW0() {
            return Offset.Zero;
        }

        private Companion() {
        }
    }

    private /* synthetic */ Offset(long j10) {
        this.packedValue = j10;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Offset m1360boximpl(long j10) {
        return new Offset(j10);
    }

    @Stable
    /* JADX INFO: renamed from: component1-impl, reason: not valid java name */
    public static final float m1361component1impl(long j10) {
        return m1371getXimpl(j10);
    }

    @Stable
    /* JADX INFO: renamed from: component2-impl, reason: not valid java name */
    public static final float m1362component2impl(long j10) {
        return m1372getYimpl(j10);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m1363constructorimpl(long j10) {
        return j10;
    }

    /* JADX INFO: renamed from: copy-dBAh8RU, reason: not valid java name */
    public static final long m1364copydBAh8RU(long j10, float f10, float f11) {
        return OffsetKt.Offset(f10, f11);
    }

    /* JADX INFO: renamed from: copy-dBAh8RU$default, reason: not valid java name */
    public static /* synthetic */ long m1365copydBAh8RU$default(long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = m1371getXimpl(j10);
        }
        if ((i10 & 2) != 0) {
            f11 = m1372getYimpl(j10);
        }
        return m1364copydBAh8RU(j10, f10, f11);
    }

    @Stable
    /* JADX INFO: renamed from: div-tuRUvjQ, reason: not valid java name */
    public static final long m1366divtuRUvjQ(long j10, float f10) {
        return OffsetKt.Offset(m1371getXimpl(j10) / f10, m1372getYimpl(j10) / f10);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m1367equalsimpl(long j10, Object obj) {
        return (obj instanceof Offset) && j10 == ((Offset) obj).getPackedValue();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1368equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    @Stable
    /* JADX INFO: renamed from: getDistance-impl, reason: not valid java name */
    public static final float m1369getDistanceimpl(long j10) {
        return (float) Math.sqrt((m1371getXimpl(j10) * m1371getXimpl(j10)) + (m1372getYimpl(j10) * m1372getYimpl(j10)));
    }

    @Stable
    /* JADX INFO: renamed from: getDistanceSquared-impl, reason: not valid java name */
    public static final float m1370getDistanceSquaredimpl(long j10) {
        return (m1371getXimpl(j10) * m1371getXimpl(j10)) + (m1372getYimpl(j10) * m1372getYimpl(j10));
    }

    @Stable
    public static /* synthetic */ void getX$annotations() {
    }

    /* JADX INFO: renamed from: getX-impl, reason: not valid java name */
    public static final float m1371getXimpl(long j10) {
        if (j10 == Unspecified) {
            throw new IllegalStateException("Offset is unspecified");
        }
        u uVar = u.f93332a;
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    @Stable
    public static /* synthetic */ void getY$annotations() {
    }

    /* JADX INFO: renamed from: getY-impl, reason: not valid java name */
    public static final float m1372getYimpl(long j10) {
        if (j10 == Unspecified) {
            throw new IllegalStateException("Offset is unspecified");
        }
        u uVar = u.f93332a;
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m1373hashCodeimpl(long j10) {
        return b.a(j10);
    }

    @Stable
    /* JADX INFO: renamed from: isValid-impl, reason: not valid java name */
    public static final boolean m1374isValidimpl(long j10) {
        if (Float.isNaN(m1371getXimpl(j10)) || Float.isNaN(m1372getYimpl(j10))) {
            throw new IllegalStateException("Offset argument contained a NaN value.");
        }
        return true;
    }

    @Stable
    /* JADX INFO: renamed from: minus-MK-Hz9U, reason: not valid java name */
    public static final long m1375minusMKHz9U(long j10, long j11) {
        return OffsetKt.Offset(m1371getXimpl(j10) - m1371getXimpl(j11), m1372getYimpl(j10) - m1372getYimpl(j11));
    }

    @Stable
    /* JADX INFO: renamed from: plus-MK-Hz9U, reason: not valid java name */
    public static final long m1376plusMKHz9U(long j10, long j11) {
        return OffsetKt.Offset(m1371getXimpl(j10) + m1371getXimpl(j11), m1372getYimpl(j10) + m1372getYimpl(j11));
    }

    @Stable
    /* JADX INFO: renamed from: rem-tuRUvjQ, reason: not valid java name */
    public static final long m1377remtuRUvjQ(long j10, float f10) {
        return OffsetKt.Offset(m1371getXimpl(j10) % f10, m1372getYimpl(j10) % f10);
    }

    @Stable
    /* JADX INFO: renamed from: times-tuRUvjQ, reason: not valid java name */
    public static final long m1378timestuRUvjQ(long j10, float f10) {
        return OffsetKt.Offset(m1371getXimpl(j10) * f10, m1372getYimpl(j10) * f10);
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m1379toStringimpl(long j10) {
        if (!OffsetKt.m1390isSpecifiedk4lQ0M(j10)) {
            return "Offset.Unspecified";
        }
        return "Offset(" + GeometryUtilsKt.toStringAsFixed(m1371getXimpl(j10), 1) + ", " + GeometryUtilsKt.toStringAsFixed(m1372getYimpl(j10), 1) + ')';
    }

    @Stable
    /* JADX INFO: renamed from: unaryMinus-F1C5BW0, reason: not valid java name */
    public static final long m1380unaryMinusF1C5BW0(long j10) {
        return OffsetKt.Offset(-m1371getXimpl(j10), -m1372getYimpl(j10));
    }

    public boolean equals(Object obj) {
        return m1367equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m1373hashCodeimpl(this.packedValue);
    }

    @NotNull
    public String toString() {
        return m1379toStringimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }
}
