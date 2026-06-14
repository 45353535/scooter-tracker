package androidx.compose.ui.unit;

import androidx.collection.b;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Dp;
import com.my.target.common.menu.MenuActionType;
import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 %2\u00020\u0001:\u0001%B\u0014\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\tø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0000H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u001e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0000H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010\u001eJ\u000f\u0010!\u001a\u00020\"H\u0017¢\u0006\u0004\b#\u0010$R\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007R#\u0010\b\u001a\u00020\t8FX\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u0012\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\fR#\u0010\r\u001a\u00020\t8FX\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u0012\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\f\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006&"}, d2 = {"Landroidx/compose/ui/unit/DpOffset;", "", "packedValue", "", "constructor-impl", "(J)J", "getPackedValue$annotations", "()V", "x", "Landroidx/compose/ui/unit/Dp;", "getX-D9Ej5fM$annotations", "getX-D9Ej5fM", "(J)F", "y", "getY-D9Ej5fM$annotations", "getY-D9Ej5fM", MenuActionType.COPY, "copy-tPigGR8", "(JFF)J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "minus", "minus-CB-Mgk4", "(JJ)J", "plus", "plus-CB-Mgk4", "toString", "", "toString-impl", "(J)Ljava/lang/String;", y.f66058y, "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DpOffset {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final long Unspecified;
    private static final long Zero;
    private final long packedValue;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Landroidx/compose/ui/unit/DpOffset$Companion;", "", "()V", "Unspecified", "Landroidx/compose/ui/unit/DpOffset;", "getUnspecified-RKDOV3M", "()J", "J", "Zero", "getZero-RKDOV3M", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getUnspecified-RKDOV3M, reason: not valid java name */
        public final long m4021getUnspecifiedRKDOV3M() {
            return DpOffset.Unspecified;
        }

        /* JADX INFO: renamed from: getZero-RKDOV3M, reason: not valid java name */
        public final long m4022getZeroRKDOV3M() {
            return DpOffset.Zero;
        }

        private Companion() {
        }
    }

    static {
        float f10 = 0;
        Zero = DpKt.m3972DpOffsetYgX7TsA(Dp.m3951constructorimpl(f10), Dp.m3951constructorimpl(f10));
        Dp.Companion companion = Dp.INSTANCE;
        Unspecified = DpKt.m3972DpOffsetYgX7TsA(companion.m3971getUnspecifiedD9Ej5fM(), companion.m3971getUnspecifiedD9Ej5fM());
    }

    private /* synthetic */ DpOffset(long j10) {
        this.packedValue = j10;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DpOffset m4006boximpl(long j10) {
        return new DpOffset(j10);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m4007constructorimpl(long j10) {
        return j10;
    }

    /* JADX INFO: renamed from: copy-tPigGR8, reason: not valid java name */
    public static final long m4008copytPigGR8(long j10, float f10, float f11) {
        return DpKt.m3972DpOffsetYgX7TsA(f10, f11);
    }

    /* JADX INFO: renamed from: copy-tPigGR8$default, reason: not valid java name */
    public static /* synthetic */ long m4009copytPigGR8$default(long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = m4012getXD9Ej5fM(j10);
        }
        if ((i10 & 2) != 0) {
            f11 = m4014getYD9Ej5fM(j10);
        }
        return m4008copytPigGR8(j10, f10, f11);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m4010equalsimpl(long j10, Object obj) {
        return (obj instanceof DpOffset) && j10 == ((DpOffset) obj).getPackedValue();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4011equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    /* JADX INFO: renamed from: getX-D9Ej5fM, reason: not valid java name */
    public static final float m4012getXD9Ej5fM(long j10) {
        if (j10 == Unspecified) {
            throw new IllegalStateException("DpOffset is unspecified");
        }
        u uVar = u.f93332a;
        return Dp.m3951constructorimpl(Float.intBitsToFloat((int) (j10 >> 32)));
    }

    @Stable
    /* JADX INFO: renamed from: getX-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m4013getXD9Ej5fM$annotations() {
    }

    /* JADX INFO: renamed from: getY-D9Ej5fM, reason: not valid java name */
    public static final float m4014getYD9Ej5fM(long j10) {
        if (j10 == Unspecified) {
            throw new IllegalStateException("DpOffset is unspecified");
        }
        u uVar = u.f93332a;
        return Dp.m3951constructorimpl(Float.intBitsToFloat((int) (j10 & 4294967295L)));
    }

    @Stable
    /* JADX INFO: renamed from: getY-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m4015getYD9Ej5fM$annotations() {
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m4016hashCodeimpl(long j10) {
        return b.a(j10);
    }

    @Stable
    /* JADX INFO: renamed from: minus-CB-Mgk4, reason: not valid java name */
    public static final long m4017minusCBMgk4(long j10, long j11) {
        return DpKt.m3972DpOffsetYgX7TsA(Dp.m3951constructorimpl(m4012getXD9Ej5fM(j10) - m4012getXD9Ej5fM(j11)), Dp.m3951constructorimpl(m4014getYD9Ej5fM(j10) - m4014getYD9Ej5fM(j11)));
    }

    @Stable
    /* JADX INFO: renamed from: plus-CB-Mgk4, reason: not valid java name */
    public static final long m4018plusCBMgk4(long j10, long j11) {
        return DpKt.m3972DpOffsetYgX7TsA(Dp.m3951constructorimpl(m4012getXD9Ej5fM(j10) + m4012getXD9Ej5fM(j11)), Dp.m3951constructorimpl(m4014getYD9Ej5fM(j10) + m4014getYD9Ej5fM(j11)));
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m4019toStringimpl(long j10) {
        if (j10 == INSTANCE.m4021getUnspecifiedRKDOV3M()) {
            return "DpOffset.Unspecified";
        }
        return '(' + ((Object) Dp.m3962toStringimpl(m4012getXD9Ej5fM(j10))) + ", " + ((Object) Dp.m3962toStringimpl(m4014getYD9Ej5fM(j10))) + ')';
    }

    public boolean equals(Object obj) {
        return m4010equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m4016hashCodeimpl(this.packedValue);
    }

    @Stable
    @NotNull
    public String toString() {
        return m4019toStringimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }
}
