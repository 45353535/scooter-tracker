package androidx.compose.animation.core;

import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\tø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b\u0088\u0001\u0002ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Landroidx/compose/animation/core/Motion;", "", "packedValue", "", "constructor-impl", "(J)J", "getPackedValue", "()J", "value", "", "getValue-impl", "(J)F", "velocity", "getVelocity-impl", MenuActionType.COPY, "copy-XB9eQnU", "(JFF)J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Motion {
    private final long packedValue;

    private /* synthetic */ Motion(long j10) {
        this.packedValue = j10;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Motion m114boximpl(long j10) {
        return new Motion(j10);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m115constructorimpl(long j10) {
        return j10;
    }

    /* JADX INFO: renamed from: copy-XB9eQnU, reason: not valid java name */
    public static final long m116copyXB9eQnU(long j10, float f10, float f11) {
        return SpringSimulationKt.Motion(f10, f11);
    }

    /* JADX INFO: renamed from: copy-XB9eQnU$default, reason: not valid java name */
    public static /* synthetic */ long m117copyXB9eQnU$default(long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = m120getValueimpl(j10);
        }
        if ((i10 & 2) != 0) {
            f11 = m121getVelocityimpl(j10);
        }
        return m116copyXB9eQnU(j10, f10, f11);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m118equalsimpl(long j10, Object obj) {
        return (obj instanceof Motion) && j10 == ((Motion) obj).m124unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m119equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* JADX INFO: renamed from: getValue-impl, reason: not valid java name */
    public static final float m120getValueimpl(long j10) {
        u uVar = u.f93332a;
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    /* JADX INFO: renamed from: getVelocity-impl, reason: not valid java name */
    public static final float m121getVelocityimpl(long j10) {
        u uVar = u.f93332a;
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m122hashCodeimpl(long j10) {
        return androidx.collection.b.a(j10);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m123toStringimpl(long j10) {
        return "Motion(packedValue=" + j10 + ')';
    }

    public boolean equals(Object obj) {
        return m118equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m122hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m123toStringimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m124unboximpl() {
        return this.packedValue;
    }
}
