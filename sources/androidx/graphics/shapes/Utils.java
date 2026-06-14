package androidx.graphics.shapes;

import androidx.collection.FloatFloatPair;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.taurusx.tax.y.z.w.s;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.utils.AtomManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0011\u001a\u0018\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001H\u0000\u001a\"\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0018H\u0080\bø\u0001\u0000\u001a\u0019\u0010\u0019\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\u001a\u001a\u00020\u0001H\u0000¢\u0006\u0002\u0010\u001b\u001a!\u0010\u0019\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001H\u0000¢\u0006\u0002\u0010\u001c\u001a\u0018\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001H\u0000\u001a\u0018\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001H\u0000\u001a*\u0010\u001f\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u00012\b\b\u0002\u0010\"\u001a\u00020\u00012\u0006\u0010#\u001a\u00020$H\u0000\u001a \u0010%\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\u00012\u0006\u0010'\u001a\u00020\u00012\u0006\u0010(\u001a\u00020\u0001H\u0000\u001a\u0018\u0010)\u001a\u00020\u00012\u0006\u0010*\u001a\u00020\u00012\u0006\u0010+\u001a\u00020\u0001H\u0000\u001a4\u0010,\u001a\u00060\u000bj\u0002`\f2\u0006\u0010-\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00012\f\b\u0002\u0010.\u001a\u00060\u000bj\u0002`\fH\u0000ø\u0001\u0001¢\u0006\u0004\b/\u00100\u001a\u0010\u00101\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0000\u001a\u001e\u00102\u001a\u00060\u000bj\u0002`\f*\u00060\u000bj\u0002`\fH\u0000ø\u0001\u0001¢\u0006\u0004\b3\u00104\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0014\u0010\u0005\u001a\u00020\u0001X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0014\u0010\b\u001a\u00020\u0001X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007\"\u001a\u0010\n\u001a\u00060\u000bj\u0002`\fX\u0080\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u000e\n\u0005\b\u009920\u0001\n\u0005\b¡\u001e0\u0001¨\u00065"}, d2 = {"AngleEpsilon", "", "DEBUG", "", "DistanceEpsilon", "FloatPi", "getFloatPi", "()F", "TwoPi", "getTwoPi", "Zero", "Landroidx/collection/FloatFloatPair;", "Landroidx/graphics/shapes/Point;", "getZero", "()J", "J", "angle", "x", "y", "debugLog", "", s.z.f67720z, "", "messageFactory", "Lkotlin/Function0;", "directionVector", "angleRadians", "(F)J", "(FF)J", "distance", "distanceSquared", "findMinimum", "v0", "v1", "tolerance", InneractiveMediationDefs.GENDER_FEMALE, "Landroidx/graphics/shapes/FindMinimumFunction;", "interpolate", "start", AtomManager.ATOM_STOP_METHOD_NAME, "fraction", "positiveModulo", "num", "mod", "radialToCartesian", "radius", "center", "radialToCartesian-L6JJ3z0", "(FFJ)J", "square", "rotate90", "rotate90-DnnuFBc", "(J)J", "graphics-shapes_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class Utils {
    public static final float AngleEpsilon = 1.0E-6f;
    public static final boolean DEBUG = false;
    public static final float DistanceEpsilon = 1.0E-4f;
    private static final long Zero = FloatFloatPair.m4constructorimpl(0.0f, 0.0f);
    private static final float FloatPi = 3.1415927f;
    private static final float TwoPi = 6.2831855f;

    public static final float angle(float f10, float f11) {
        float fAtan2 = (float) Math.atan2(f11, f10);
        float f12 = TwoPi;
        return (fAtan2 + f12) % f12;
    }

    public static final void debugLog(@NotNull String tag, @NotNull Function0<String> messageFactory) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(messageFactory, "messageFactory");
    }

    public static final long directionVector(float f10, float f11) {
        float fDistance = distance(f10, f11);
        if (fDistance > 0.0f) {
            return FloatFloatPair.m4constructorimpl(f10 / fDistance, f11 / fDistance);
        }
        throw new IllegalArgumentException("Required distance greater than zero");
    }

    public static final float distance(float f10, float f11) {
        return (float) Math.sqrt((f10 * f10) + (f11 * f11));
    }

    public static final float distanceSquared(float f10, float f11) {
        return (f10 * f10) + (f11 * f11);
    }

    public static final float findMinimum(float f10, float f11, float f12, @NotNull FindMinimumFunction f13) {
        Intrinsics.checkNotNullParameter(f13, "f");
        while (f11 - f10 > f12) {
            float f14 = 2;
            float f15 = 3;
            float f16 = ((f14 * f10) + f11) / f15;
            float f17 = ((f14 * f11) + f10) / f15;
            if (f13.invoke(f16) < f13.invoke(f17)) {
                f11 = f17;
            } else {
                f10 = f16;
            }
        }
        return (f10 + f11) / 2;
    }

    public static /* synthetic */ float findMinimum$default(float f10, float f11, float f12, FindMinimumFunction findMinimumFunction, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f12 = 0.001f;
        }
        return findMinimum(f10, f11, f12, findMinimumFunction);
    }

    public static final float getFloatPi() {
        return FloatPi;
    }

    public static final float getTwoPi() {
        return TwoPi;
    }

    public static final long getZero() {
        return Zero;
    }

    public static final float interpolate(float f10, float f11, float f12) {
        return ((1 - f12) * f10) + (f12 * f11);
    }

    public static final float positiveModulo(float f10, float f11) {
        return ((f10 % f11) + f11) % f11;
    }

    /* JADX INFO: renamed from: radialToCartesian-L6JJ3z0, reason: not valid java name */
    public static final long m4240radialToCartesianL6JJ3z0(float f10, float f11, long j10) {
        return PointKt.m4225plusybeJwSQ(PointKt.m4227timesso9K2fw(directionVector(f11), f10), j10);
    }

    /* JADX INFO: renamed from: radialToCartesian-L6JJ3z0$default, reason: not valid java name */
    public static /* synthetic */ long m4241radialToCartesianL6JJ3z0$default(float f10, float f11, long j10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j10 = Zero;
        }
        return m4240radialToCartesianL6JJ3z0(f10, f11, j10);
    }

    /* JADX INFO: renamed from: rotate90-DnnuFBc, reason: not valid java name */
    public static final long m4242rotate90DnnuFBc(long j10) {
        return FloatFloatPair.m4constructorimpl(-PointKt.m4222getYDnnuFBc(j10), PointKt.m4221getXDnnuFBc(j10));
    }

    public static final float square(float f10) {
        return f10 * f10;
    }

    public static final long directionVector(float f10) {
        double d10 = f10;
        return FloatFloatPair.m4constructorimpl((float) Math.cos(d10), (float) Math.sin(d10));
    }
}
