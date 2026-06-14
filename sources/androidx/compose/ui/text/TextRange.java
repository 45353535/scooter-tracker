package androidx.compose.ui.text;

import androidx.compose.runtime.Immutable;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 *2\u00020\u0001:\u0001*B\u0014\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u000bH\u0086\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\u001f\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010\rJ\u001b\u0010$\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b%\u0010\u001bJ\u000f\u0010&\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\u0012\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0014\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\tR\u0011\u0010\u0016\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\r\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006+"}, d2 = {"Landroidx/compose/ui/text/TextRange;", "", "packedValue", "", "constructor-impl", "(J)J", "collapsed", "", "getCollapsed-impl", "(J)Z", "end", "", "getEnd-impl", "(J)I", SessionDescription.ATTR_LENGTH, "getLength-impl", "max", "getMax-impl", "min", "getMin-impl", "reversed", "getReversed-impl", "start", "getStart-impl", "contains", "other", "contains-5zc-tL8", "(JJ)Z", "offset", "contains-impl", "(JI)Z", "equals", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "intersects", "intersects-5zc-tL8", "toString", "", "toString-impl", "(J)Ljava/lang/String;", y.f66058y, "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TextRange {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final long Zero = TextRangeKt.TextRange(0);
    private final long packedValue;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\b"}, d2 = {"Landroidx/compose/ui/text/TextRange$Companion;", "", "()V", "Zero", "Landroidx/compose/ui/text/TextRange;", "getZero-d9O1mEE", "()J", "J", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getZero-d9O1mEE, reason: not valid java name */
        public final long m3508getZerod9O1mEE() {
            return TextRange.Zero;
        }

        private Companion() {
        }
    }

    private /* synthetic */ TextRange(long j10) {
        this.packedValue = j10;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextRange m3491boximpl(long j10) {
        return new TextRange(j10);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m3492constructorimpl(long j10) {
        return j10;
    }

    /* JADX INFO: renamed from: contains-5zc-tL8, reason: not valid java name */
    public static final boolean m3493contains5zctL8(long j10, long j11) {
        return m3501getMinimpl(j10) <= m3501getMinimpl(j11) && m3500getMaximpl(j11) <= m3500getMaximpl(j10);
    }

    /* JADX INFO: renamed from: contains-impl, reason: not valid java name */
    public static final boolean m3494containsimpl(long j10, int i10) {
        return i10 < m3500getMaximpl(j10) && m3501getMinimpl(j10) <= i10;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3495equalsimpl(long j10, Object obj) {
        return (obj instanceof TextRange) && j10 == ((TextRange) obj).getPackedValue();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3496equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* JADX INFO: renamed from: getCollapsed-impl, reason: not valid java name */
    public static final boolean m3497getCollapsedimpl(long j10) {
        return m3503getStartimpl(j10) == m3498getEndimpl(j10);
    }

    /* JADX INFO: renamed from: getEnd-impl, reason: not valid java name */
    public static final int m3498getEndimpl(long j10) {
        return (int) (j10 & 4294967295L);
    }

    /* JADX INFO: renamed from: getLength-impl, reason: not valid java name */
    public static final int m3499getLengthimpl(long j10) {
        return m3500getMaximpl(j10) - m3501getMinimpl(j10);
    }

    /* JADX INFO: renamed from: getMax-impl, reason: not valid java name */
    public static final int m3500getMaximpl(long j10) {
        return m3503getStartimpl(j10) > m3498getEndimpl(j10) ? m3503getStartimpl(j10) : m3498getEndimpl(j10);
    }

    /* JADX INFO: renamed from: getMin-impl, reason: not valid java name */
    public static final int m3501getMinimpl(long j10) {
        return m3503getStartimpl(j10) > m3498getEndimpl(j10) ? m3498getEndimpl(j10) : m3503getStartimpl(j10);
    }

    /* JADX INFO: renamed from: getReversed-impl, reason: not valid java name */
    public static final boolean m3502getReversedimpl(long j10) {
        return m3503getStartimpl(j10) > m3498getEndimpl(j10);
    }

    /* JADX INFO: renamed from: getStart-impl, reason: not valid java name */
    public static final int m3503getStartimpl(long j10) {
        return (int) (j10 >> 32);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3504hashCodeimpl(long j10) {
        return androidx.collection.b.a(j10);
    }

    /* JADX INFO: renamed from: intersects-5zc-tL8, reason: not valid java name */
    public static final boolean m3505intersects5zctL8(long j10, long j11) {
        return m3501getMinimpl(j10) < m3500getMaximpl(j11) && m3501getMinimpl(j11) < m3500getMaximpl(j10);
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3506toStringimpl(long j10) {
        return "TextRange(" + m3503getStartimpl(j10) + ", " + m3498getEndimpl(j10) + ')';
    }

    public boolean equals(Object obj) {
        return m3495equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m3504hashCodeimpl(this.packedValue);
    }

    @NotNull
    public String toString() {
        return m3506toStringimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }
}
