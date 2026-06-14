package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0014\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u000e\u001a\u00020\tH\u0087\n¢\u0006\u0004\b\u000f\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\tH\u0087\n¢\u0006\u0004\b\u0011\u0010\u000bJ*\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\tø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!R\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"Landroidx/compose/ui/graphics/TransformOrigin;", "", "packedValue", "", "constructor-impl", "(J)J", "getPackedValue$annotations", "()V", "pivotFractionX", "", "getPivotFractionX-impl", "(J)F", "pivotFractionY", "getPivotFractionY-impl", "component1", "component1-impl", "component2", "component2-impl", MenuActionType.COPY, "copy-zey9I6w", "(JFF)J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "toString", "", "toString-impl", "(J)Ljava/lang/String;", com.taurusx.tax.f.y.f66058y, "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TransformOrigin {
    private final long packedValue;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final long Center = TransformOriginKt.TransformOrigin(0.5f, 0.5f);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\b"}, d2 = {"Landroidx/compose/ui/graphics/TransformOrigin$Companion;", "", "()V", "Center", "Landroidx/compose/ui/graphics/TransformOrigin;", "getCenter-SzJe1aQ", "()J", "J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getCenter-SzJe1aQ, reason: not valid java name */
        public final long m1965getCenterSzJe1aQ() {
            return TransformOrigin.Center;
        }

        private Companion() {
        }
    }

    private /* synthetic */ TransformOrigin(long j10) {
        this.packedValue = j10;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TransformOrigin m1952boximpl(long j10) {
        return new TransformOrigin(j10);
    }

    @Stable
    /* JADX INFO: renamed from: component1-impl, reason: not valid java name */
    public static final float m1953component1impl(long j10) {
        return m1960getPivotFractionXimpl(j10);
    }

    @Stable
    /* JADX INFO: renamed from: component2-impl, reason: not valid java name */
    public static final float m1954component2impl(long j10) {
        return m1961getPivotFractionYimpl(j10);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m1955constructorimpl(long j10) {
        return j10;
    }

    /* JADX INFO: renamed from: copy-zey9I6w, reason: not valid java name */
    public static final long m1956copyzey9I6w(long j10, float f10, float f11) {
        return TransformOriginKt.TransformOrigin(f10, f11);
    }

    /* JADX INFO: renamed from: copy-zey9I6w$default, reason: not valid java name */
    public static /* synthetic */ long m1957copyzey9I6w$default(long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = m1960getPivotFractionXimpl(j10);
        }
        if ((i10 & 2) != 0) {
            f11 = m1961getPivotFractionYimpl(j10);
        }
        return m1956copyzey9I6w(j10, f10, f11);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m1958equalsimpl(long j10, Object obj) {
        return (obj instanceof TransformOrigin) && j10 == ((TransformOrigin) obj).getPackedValue();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1959equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    /* JADX INFO: renamed from: getPivotFractionX-impl, reason: not valid java name */
    public static final float m1960getPivotFractionXimpl(long j10) {
        kotlin.jvm.internal.u uVar = kotlin.jvm.internal.u.f93332a;
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    /* JADX INFO: renamed from: getPivotFractionY-impl, reason: not valid java name */
    public static final float m1961getPivotFractionYimpl(long j10) {
        kotlin.jvm.internal.u uVar = kotlin.jvm.internal.u.f93332a;
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m1962hashCodeimpl(long j10) {
        return androidx.collection.b.a(j10);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m1963toStringimpl(long j10) {
        return "TransformOrigin(packedValue=" + j10 + ')';
    }

    public boolean equals(Object obj) {
        return m1958equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m1962hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m1963toStringimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }
}
