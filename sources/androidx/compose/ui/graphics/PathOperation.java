package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0014\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/graphics/PathOperation;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", com.taurusx.tax.f.y.f66058y, "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PathOperation {
    private final int value;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int Difference = m1860constructorimpl(0);
    private static final int Intersect = m1860constructorimpl(1);
    private static final int Union = m1860constructorimpl(2);
    private static final int Xor = m1860constructorimpl(3);
    private static final int ReverseDifference = m1860constructorimpl(4);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u001c\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u001c\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/graphics/PathOperation$Companion;", "", "()V", "Difference", "Landroidx/compose/ui/graphics/PathOperation;", "getDifference-b3I0S0c", "()I", "I", "Intersect", "getIntersect-b3I0S0c", "ReverseDifference", "getReverseDifference-b3I0S0c", "Union", "getUnion-b3I0S0c", "Xor", "getXor-b3I0S0c", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getDifference-b3I0S0c, reason: not valid java name */
        public final int m1866getDifferenceb3I0S0c() {
            return PathOperation.Difference;
        }

        /* JADX INFO: renamed from: getIntersect-b3I0S0c, reason: not valid java name */
        public final int m1867getIntersectb3I0S0c() {
            return PathOperation.Intersect;
        }

        /* JADX INFO: renamed from: getReverseDifference-b3I0S0c, reason: not valid java name */
        public final int m1868getReverseDifferenceb3I0S0c() {
            return PathOperation.ReverseDifference;
        }

        /* JADX INFO: renamed from: getUnion-b3I0S0c, reason: not valid java name */
        public final int m1869getUnionb3I0S0c() {
            return PathOperation.Union;
        }

        /* JADX INFO: renamed from: getXor-b3I0S0c, reason: not valid java name */
        public final int m1870getXorb3I0S0c() {
            return PathOperation.Xor;
        }

        private Companion() {
        }
    }

    private /* synthetic */ PathOperation(int i10) {
        this.value = i10;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PathOperation m1859boximpl(int i10) {
        return new PathOperation(i10);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m1860constructorimpl(int i10) {
        return i10;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m1861equalsimpl(int i10, Object obj) {
        return (obj instanceof PathOperation) && i10 == ((PathOperation) obj).getValue();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1862equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m1863hashCodeimpl(int i10) {
        return i10;
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m1864toStringimpl(int i10) {
        return m1862equalsimpl0(i10, Difference) ? "Difference" : m1862equalsimpl0(i10, Intersect) ? "Intersect" : m1862equalsimpl0(i10, Union) ? "Union" : m1862equalsimpl0(i10, Xor) ? "Xor" : m1862equalsimpl0(i10, ReverseDifference) ? "ReverseDifference" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m1861equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m1863hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m1864toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }
}
