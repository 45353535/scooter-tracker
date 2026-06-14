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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 32\u00020\u0001:\u00013B\u0014\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0016\u001a\u00020\u0007H\u0087\n¢\u0006\u0004\b\u0017\u0010\u000bJ\u0010\u0010\u0018\u001a\u00020\u0007H\u0087\n¢\u0006\u0004\b\u0019\u0010\u000bJ*\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u0007ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0007H\u0087\u0002ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\"H\u0007¢\u0006\u0004\b+\u0010,J!\u0010-\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0007H\u0087\u0002ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b.\u0010 J\u000f\u0010/\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102R\u001a\u0010\u0006\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\t\u001a\u0004\b\u0011\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0012\u0010\tR\u001a\u0010\u0013\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\t\u001a\u0004\b\u0015\u0010\u000b\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00064"}, d2 = {"Landroidx/compose/ui/geometry/Size;", "", "packedValue", "", "constructor-impl", "(J)J", "height", "", "getHeight$annotations", "()V", "getHeight-impl", "(J)F", "maxDimension", "getMaxDimension$annotations", "getMaxDimension-impl", "minDimension", "getMinDimension$annotations", "getMinDimension-impl", "getPackedValue$annotations", "width", "getWidth$annotations", "getWidth-impl", "component1", "component1-impl", "component2", "component2-impl", MenuActionType.COPY, "copy-xjbvk4A", "(JFF)J", "div", "operand", "div-7Ah8Wj8", "(JF)J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "isEmpty", "isEmpty-impl", "(J)Z", "times", "times-7Ah8Wj8", "toString", "", "toString-impl", "(J)Ljava/lang/String;", y.f66058y, "ui-geometry_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Size {
    private final long packedValue;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final long Zero = SizeKt.Size(0.0f, 0.0f);
    private static final long Unspecified = SizeKt.Size(Float.NaN, Float.NaN);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R'\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R'\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\u0007\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, d2 = {"Landroidx/compose/ui/geometry/Size$Companion;", "", "()V", "Unspecified", "Landroidx/compose/ui/geometry/Size;", "getUnspecified-NH-jbRc$annotations", "getUnspecified-NH-jbRc", "()J", "J", "Zero", "getZero-NH-jbRc$annotations", "getZero-NH-jbRc", "ui-geometry_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Stable
        /* JADX INFO: renamed from: getUnspecified-NH-jbRc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1446getUnspecifiedNHjbRc$annotations() {
        }

        @Stable
        /* JADX INFO: renamed from: getZero-NH-jbRc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1447getZeroNHjbRc$annotations() {
        }

        /* JADX INFO: renamed from: getUnspecified-NH-jbRc, reason: not valid java name */
        public final long m1448getUnspecifiedNHjbRc() {
            return Size.Unspecified;
        }

        /* JADX INFO: renamed from: getZero-NH-jbRc, reason: not valid java name */
        public final long m1449getZeroNHjbRc() {
            return Size.Zero;
        }

        private Companion() {
        }
    }

    private /* synthetic */ Size(long j10) {
        this.packedValue = j10;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Size m1428boximpl(long j10) {
        return new Size(j10);
    }

    @Stable
    /* JADX INFO: renamed from: component1-impl, reason: not valid java name */
    public static final float m1429component1impl(long j10) {
        return m1440getWidthimpl(j10);
    }

    @Stable
    /* JADX INFO: renamed from: component2-impl, reason: not valid java name */
    public static final float m1430component2impl(long j10) {
        return m1437getHeightimpl(j10);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m1431constructorimpl(long j10) {
        return j10;
    }

    /* JADX INFO: renamed from: copy-xjbvk4A, reason: not valid java name */
    public static final long m1432copyxjbvk4A(long j10, float f10, float f11) {
        return SizeKt.Size(f10, f11);
    }

    /* JADX INFO: renamed from: copy-xjbvk4A$default, reason: not valid java name */
    public static /* synthetic */ long m1433copyxjbvk4A$default(long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = m1440getWidthimpl(j10);
        }
        if ((i10 & 2) != 0) {
            f11 = m1437getHeightimpl(j10);
        }
        return m1432copyxjbvk4A(j10, f10, f11);
    }

    @Stable
    /* JADX INFO: renamed from: div-7Ah8Wj8, reason: not valid java name */
    public static final long m1434div7Ah8Wj8(long j10, float f10) {
        return SizeKt.Size(m1440getWidthimpl(j10) / f10, m1437getHeightimpl(j10) / f10);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m1435equalsimpl(long j10, Object obj) {
        return (obj instanceof Size) && j10 == ((Size) obj).getPackedValue();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1436equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    @Stable
    public static /* synthetic */ void getHeight$annotations() {
    }

    /* JADX INFO: renamed from: getHeight-impl, reason: not valid java name */
    public static final float m1437getHeightimpl(long j10) {
        if (j10 == Unspecified) {
            throw new IllegalStateException("Size is unspecified");
        }
        u uVar = u.f93332a;
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    @Stable
    public static /* synthetic */ void getMaxDimension$annotations() {
    }

    /* JADX INFO: renamed from: getMaxDimension-impl, reason: not valid java name */
    public static final float m1438getMaxDimensionimpl(long j10) {
        return Math.max(Math.abs(m1440getWidthimpl(j10)), Math.abs(m1437getHeightimpl(j10)));
    }

    @Stable
    public static /* synthetic */ void getMinDimension$annotations() {
    }

    /* JADX INFO: renamed from: getMinDimension-impl, reason: not valid java name */
    public static final float m1439getMinDimensionimpl(long j10) {
        return Math.min(Math.abs(m1440getWidthimpl(j10)), Math.abs(m1437getHeightimpl(j10)));
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    @Stable
    public static /* synthetic */ void getWidth$annotations() {
    }

    /* JADX INFO: renamed from: getWidth-impl, reason: not valid java name */
    public static final float m1440getWidthimpl(long j10) {
        if (j10 == Unspecified) {
            throw new IllegalStateException("Size is unspecified");
        }
        u uVar = u.f93332a;
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m1441hashCodeimpl(long j10) {
        return b.a(j10);
    }

    @Stable
    /* JADX INFO: renamed from: isEmpty-impl, reason: not valid java name */
    public static final boolean m1442isEmptyimpl(long j10) {
        return m1440getWidthimpl(j10) <= 0.0f || m1437getHeightimpl(j10) <= 0.0f;
    }

    @Stable
    /* JADX INFO: renamed from: times-7Ah8Wj8, reason: not valid java name */
    public static final long m1443times7Ah8Wj8(long j10, float f10) {
        return SizeKt.Size(m1440getWidthimpl(j10) * f10, m1437getHeightimpl(j10) * f10);
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m1444toStringimpl(long j10) {
        if (j10 == INSTANCE.m1448getUnspecifiedNHjbRc()) {
            return "Size.Unspecified";
        }
        return "Size(" + GeometryUtilsKt.toStringAsFixed(m1440getWidthimpl(j10), 1) + ", " + GeometryUtilsKt.toStringAsFixed(m1437getHeightimpl(j10), 1) + ')';
    }

    public boolean equals(Object obj) {
        return m1435equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m1441hashCodeimpl(this.packedValue);
    }

    @NotNull
    public String toString() {
        return m1444toStringimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }
}
