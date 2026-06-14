package androidx.graphics.shapes;

import androidx.collection.FloatFloatPair;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.utils.AtomManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a6\u0010\b\u001a\u00060\u0002j\u0002`\u00032\n\u0010\t\u001a\u00060\u0002j\u0002`\u00032\n\u0010\n\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u000b\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a&\u0010\u000e\u001a\u00020\u000f*\u00060\u0002j\u0002`\u00032\n\u0010\u0010\u001a\u00060\u0002j\u0002`\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a2\u0010\u0013\u001a\u00060\u0002j\u0002`\u0003*\u00060\u0002j\u0002`\u00032\b\b\u0002\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a'\u0010\u0016\u001a\u00060\u0002j\u0002`\u0003*\u00060\u0002j\u0002`\u00032\u0006\u0010\u0017\u001a\u00020\u0001H\u0080\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a&\u0010\u001a\u001a\u00020\u0001*\u00060\u0002j\u0002`\u00032\n\u0010\u0010\u001a\u00060\u0002j\u0002`\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a*\u0010\u001a\u001a\u00020\u0001*\u00060\u0002j\u0002`\u00032\u0006\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\u001e\u0010!\u001a\u00060\u0002j\u0002`\u0003*\u00060\u0002j\u0002`\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a\u001a\u0010$\u001a\u00020\u0001*\u00060\u0002j\u0002`\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b%\u0010\u0005\u001a\u001a\u0010&\u001a\u00020\u0001*\u00060\u0002j\u0002`\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b'\u0010\u0005\u001a+\u0010(\u001a\u00060\u0002j\u0002`\u0003*\u00060\u0002j\u0002`\u00032\n\u0010\u0010\u001a\u00060\u0002j\u0002`\u0003H\u0080\u0002ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a+\u0010+\u001a\u00060\u0002j\u0002`\u0003*\u00060\u0002j\u0002`\u00032\n\u0010\u0010\u001a\u00060\u0002j\u0002`\u0003H\u0080\u0002ø\u0001\u0000¢\u0006\u0004\b,\u0010*\u001a'\u0010-\u001a\u00060\u0002j\u0002`\u0003*\u00060\u0002j\u0002`\u00032\u0006\u0010\u0017\u001a\u00020\u0001H\u0080\u0002ø\u0001\u0000¢\u0006\u0004\b.\u0010\u0019\u001a'\u0010/\u001a\u00060\u0002j\u0002`\u0003*\u00060\u0002j\u0002`\u00032\u0006\u0010\u0017\u001a\u00020\u0001H\u0080\u0002ø\u0001\u0000¢\u0006\u0004\b0\u0010\u0019\u001a&\u00101\u001a\u00060\u0002j\u0002`\u0003*\u00060\u0002j\u0002`\u00032\u0006\u00102\u001a\u000203H\u0000ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001a\u001f\u00106\u001a\u00060\u0002j\u0002`\u0003*\u00060\u0002j\u0002`\u0003H\u0080\u0002ø\u0001\u0000¢\u0006\u0004\b7\u0010#\"\u001c\u0010\u0000\u001a\u00020\u0001*\u00060\u0002j\u0002`\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u001c\u0010\u0006\u001a\u00020\u0001*\u00060\u0002j\u0002`\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005*\f\b\u0000\u00108\"\u00020\u00022\u00020\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00069"}, d2 = {"x", "", "Landroidx/collection/FloatFloatPair;", "Landroidx/graphics/shapes/Point;", "getX-DnnuFBc", "(J)F", "y", "getY-DnnuFBc", "interpolate", "start", AtomManager.ATOM_STOP_METHOD_NAME, "fraction", "interpolate-dLqxh1s", "(JJF)J", "clockwise", "", "other", "clockwise-ybeJwSQ", "(JJ)Z", MenuActionType.COPY, "copy-5P9i7ZU", "(JFF)J", "div", "operand", "div-so9K2fw", "(JF)J", "dotProduct", "dotProduct-ybeJwSQ", "(JJ)F", "otherX", "otherY", "dotProduct-5P9i7ZU", "(JFF)F", "getDirection", "getDirection-DnnuFBc", "(J)J", "getDistance", "getDistance-DnnuFBc", "getDistanceSquared", "getDistanceSquared-DnnuFBc", "minus", "minus-ybeJwSQ", "(JJ)J", "plus", "plus-ybeJwSQ", "rem", "rem-so9K2fw", "times", "times-so9K2fw", "transformed", InneractiveMediationDefs.GENDER_FEMALE, "Landroidx/graphics/shapes/PointTransformer;", "transformed-so9K2fw", "(JLandroidx/graphics/shapes/PointTransformer;)J", "unaryMinus", "unaryMinus-DnnuFBc", "Point", "graphics-shapes_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PointKt {
    /* JADX INFO: renamed from: clockwise-ybeJwSQ, reason: not valid java name */
    public static final boolean m4212clockwiseybeJwSQ(long j10, long j11) {
        return (m4221getXDnnuFBc(j10) * m4222getYDnnuFBc(j11)) - (m4222getYDnnuFBc(j10) * m4221getXDnnuFBc(j11)) > 0.0f;
    }

    /* JADX INFO: renamed from: copy-5P9i7ZU, reason: not valid java name */
    public static final long m4213copy5P9i7ZU(long j10, float f10, float f11) {
        return FloatFloatPair.m4constructorimpl(f10, f11);
    }

    /* JADX INFO: renamed from: copy-5P9i7ZU$default, reason: not valid java name */
    public static /* synthetic */ long m4214copy5P9i7ZU$default(long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = Float.intBitsToFloat((int) (j10 >> 32));
        }
        if ((i10 & 2) != 0) {
            f11 = Float.intBitsToFloat((int) (4294967295L & j10));
        }
        return m4213copy5P9i7ZU(j10, f10, f11);
    }

    /* JADX INFO: renamed from: div-so9K2fw, reason: not valid java name */
    public static final long m4215divso9K2fw(long j10, float f10) {
        return FloatFloatPair.m4constructorimpl(m4221getXDnnuFBc(j10) / f10, m4222getYDnnuFBc(j10) / f10);
    }

    /* JADX INFO: renamed from: dotProduct-5P9i7ZU, reason: not valid java name */
    public static final float m4216dotProduct5P9i7ZU(long j10, float f10, float f11) {
        return (m4221getXDnnuFBc(j10) * f10) + (m4222getYDnnuFBc(j10) * f11);
    }

    /* JADX INFO: renamed from: dotProduct-ybeJwSQ, reason: not valid java name */
    public static final float m4217dotProductybeJwSQ(long j10, long j11) {
        return (m4221getXDnnuFBc(j10) * m4221getXDnnuFBc(j11)) + (m4222getYDnnuFBc(j10) * m4222getYDnnuFBc(j11));
    }

    /* JADX INFO: renamed from: getDirection-DnnuFBc, reason: not valid java name */
    public static final long m4218getDirectionDnnuFBc(long j10) {
        float fM4219getDistanceDnnuFBc = m4219getDistanceDnnuFBc(j10);
        if (fM4219getDistanceDnnuFBc > 0.0f) {
            return m4215divso9K2fw(j10, fM4219getDistanceDnnuFBc);
        }
        throw new IllegalArgumentException("Can't get the direction of a 0-length vector");
    }

    /* JADX INFO: renamed from: getDistance-DnnuFBc, reason: not valid java name */
    public static final float m4219getDistanceDnnuFBc(long j10) {
        return (float) Math.sqrt((m4221getXDnnuFBc(j10) * m4221getXDnnuFBc(j10)) + (m4222getYDnnuFBc(j10) * m4222getYDnnuFBc(j10)));
    }

    /* JADX INFO: renamed from: getDistanceSquared-DnnuFBc, reason: not valid java name */
    public static final float m4220getDistanceSquaredDnnuFBc(long j10) {
        return (m4221getXDnnuFBc(j10) * m4221getXDnnuFBc(j10)) + (m4222getYDnnuFBc(j10) * m4222getYDnnuFBc(j10));
    }

    /* JADX INFO: renamed from: getX-DnnuFBc, reason: not valid java name */
    public static final float m4221getXDnnuFBc(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    /* JADX INFO: renamed from: getY-DnnuFBc, reason: not valid java name */
    public static final float m4222getYDnnuFBc(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    /* JADX INFO: renamed from: interpolate-dLqxh1s, reason: not valid java name */
    public static final long m4223interpolatedLqxh1s(long j10, long j11, float f10) {
        return FloatFloatPair.m4constructorimpl(Utils.interpolate(m4221getXDnnuFBc(j10), m4221getXDnnuFBc(j11), f10), Utils.interpolate(m4222getYDnnuFBc(j10), m4222getYDnnuFBc(j11), f10));
    }

    /* JADX INFO: renamed from: minus-ybeJwSQ, reason: not valid java name */
    public static final long m4224minusybeJwSQ(long j10, long j11) {
        return FloatFloatPair.m4constructorimpl(m4221getXDnnuFBc(j10) - m4221getXDnnuFBc(j11), m4222getYDnnuFBc(j10) - m4222getYDnnuFBc(j11));
    }

    /* JADX INFO: renamed from: plus-ybeJwSQ, reason: not valid java name */
    public static final long m4225plusybeJwSQ(long j10, long j11) {
        return FloatFloatPair.m4constructorimpl(m4221getXDnnuFBc(j10) + m4221getXDnnuFBc(j11), m4222getYDnnuFBc(j10) + m4222getYDnnuFBc(j11));
    }

    /* JADX INFO: renamed from: rem-so9K2fw, reason: not valid java name */
    public static final long m4226remso9K2fw(long j10, float f10) {
        return FloatFloatPair.m4constructorimpl(m4221getXDnnuFBc(j10) % f10, m4222getYDnnuFBc(j10) % f10);
    }

    /* JADX INFO: renamed from: times-so9K2fw, reason: not valid java name */
    public static final long m4227timesso9K2fw(long j10, float f10) {
        return FloatFloatPair.m4constructorimpl(m4221getXDnnuFBc(j10) * f10, m4222getYDnnuFBc(j10) * f10);
    }

    /* JADX INFO: renamed from: transformed-so9K2fw, reason: not valid java name */
    public static final long m4228transformedso9K2fw(long j10, @NotNull PointTransformer f10) {
        Intrinsics.checkNotNullParameter(f10, "f");
        long jMo4230transformXgqJiTY = f10.mo4230transformXgqJiTY(m4221getXDnnuFBc(j10), m4222getYDnnuFBc(j10));
        return FloatFloatPair.m4constructorimpl(Float.intBitsToFloat((int) (jMo4230transformXgqJiTY >> 32)), Float.intBitsToFloat((int) (jMo4230transformXgqJiTY & 4294967295L)));
    }

    /* JADX INFO: renamed from: unaryMinus-DnnuFBc, reason: not valid java name */
    public static final long m4229unaryMinusDnnuFBc(long j10) {
        return FloatFloatPair.m4constructorimpl(-m4221getXDnnuFBc(j10), -m4222getYDnnuFBc(j10));
    }
}
