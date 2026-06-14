package androidx.graphics.shapes;

import androidx.collection.FloatFloatPair;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B5\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\n\u0010\u0006\u001a\u00060\u0003j\u0002`\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0010\u0010'\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\u0011H\u0002Jf\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u00112\n\u0010-\u001a\u00060\u0003j\u0002`\u00042\n\u0010.\u001a\u00060\u0003j\u0002`\u00042\n\u0010/\u001a\u00060\u0003j\u0002`\u00042\n\u00100\u001a\u00060\u0003j\u0002`\u00042\n\u00101\u001a\u00060\u0003j\u0002`\u00042\u0006\u00102\u001a\u00020\u0011H\u0002ø\u0001\u0000¢\u0006\u0004\b3\u00104J \u00105\u001a\b\u0012\u0004\u0012\u00020*062\u0006\u00107\u001a\u00020\u00112\b\b\u0002\u00108\u001a\u00020\u0011H\u0007JJ\u00109\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\n\u0010:\u001a\u00060\u0003j\u0002`\u00042\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u00042\n\u0010\u0016\u001a\u00060\u0003j\u0002`\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b;\u0010<R&\u0010\n\u001a\u00060\u0003j\u0002`\u0004X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u001d\u0010\u0016\u001a\u00060\u0003j\u0002`\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0017\u0010\fR\u001d\u0010\u0018\u001a\u00060\u0003j\u0002`\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0019\u0010\fR\u0011\u0010\u001a\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0013R\u0011\u0010\u001c\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u001d\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u001e\u0010\fR\u001d\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u001f\u0010\fR\u001d\u0010\u0006\u001a\u00060\u0003j\u0002`\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b \u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010#\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0013R\u0011\u0010%\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006="}, d2 = {"Landroidx/graphics/shapes/RoundedCorner;", "", "p0", "Landroidx/collection/FloatFloatPair;", "Landroidx/graphics/shapes/Point;", "p1", "p2", "rounding", "Landroidx/graphics/shapes/CornerRounding;", "(JJJLandroidx/graphics/shapes/CornerRounding;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "center", "getCenter-1ufDz9w", "()J", "setCenter-DnnuFBc", "(J)V", "J", "cornerRadius", "", "getCornerRadius", "()F", "cosAngle", "getCosAngle", "d1", "getD1-1ufDz9w", "d2", "getD2-1ufDz9w", "expectedCut", "getExpectedCut", "expectedRoundCut", "getExpectedRoundCut", "getP0-1ufDz9w", "getP1-1ufDz9w", "getP2-1ufDz9w", "getRounding", "()Landroidx/graphics/shapes/CornerRounding;", "sinAngle", "getSinAngle", "smoothing", "getSmoothing", "calculateActualSmoothingValue", "allowedCut", "computeFlankingCurve", "Landroidx/graphics/shapes/Cubic;", "actualRoundCut", "actualSmoothingValues", "corner", "sideStart", "circleSegmentIntersection", "otherCircleSegmentIntersection", "circleCenter", "actualR", "computeFlankingCurve-oAJzIJU", "(FFJJJJJF)Landroidx/graphics/shapes/Cubic;", "getCubics", "", "allowedCut0", "allowedCut1", "lineIntersection", "d0", "lineIntersection-CBFvKDc", "(JJJJ)Landroidx/collection/FloatFloatPair;", "graphics-shapes_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class RoundedCorner {
    private long center;
    private final float cornerRadius;
    private final float cosAngle;
    private final long d1;
    private final long d2;
    private final float expectedRoundCut;
    private final long p0;
    private final long p1;
    private final long p2;

    @Nullable
    private final CornerRounding rounding;
    private final float sinAngle;
    private final float smoothing;

    public /* synthetic */ RoundedCorner(long j10, long j11, long j12, CornerRounding cornerRounding, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, cornerRounding);
    }

    private final float calculateActualSmoothingValue(float allowedCut) {
        if (allowedCut > getExpectedCut()) {
            return this.smoothing;
        }
        float f10 = this.expectedRoundCut;
        if (allowedCut > f10) {
            return (this.smoothing * (allowedCut - f10)) / (getExpectedCut() - this.expectedRoundCut);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: computeFlankingCurve-oAJzIJU, reason: not valid java name */
    private final Cubic m4231computeFlankingCurveoAJzIJU(float actualRoundCut, float actualSmoothingValues, long corner, long sideStart, long circleSegmentIntersection, long otherCircleSegmentIntersection, long circleCenter, float actualR) {
        long jM4218getDirectionDnnuFBc = PointKt.m4218getDirectionDnnuFBc(PointKt.m4224minusybeJwSQ(sideStart, corner));
        long jM4225plusybeJwSQ = PointKt.m4225plusybeJwSQ(corner, PointKt.m4227timesso9K2fw(PointKt.m4227timesso9K2fw(jM4218getDirectionDnnuFBc, actualRoundCut), 1 + actualSmoothingValues));
        long packedValue = circleSegmentIntersection;
        long jM4223interpolatedLqxh1s = PointKt.m4223interpolatedLqxh1s(packedValue, PointKt.m4215divso9K2fw(PointKt.m4225plusybeJwSQ(circleSegmentIntersection, otherCircleSegmentIntersection), 2.0f), actualSmoothingValues);
        long jM4225plusybeJwSQ2 = PointKt.m4225plusybeJwSQ(circleCenter, PointKt.m4227timesso9K2fw(Utils.directionVector(PointKt.m4221getXDnnuFBc(jM4223interpolatedLqxh1s) - PointKt.m4221getXDnnuFBc(circleCenter), PointKt.m4222getYDnnuFBc(jM4223interpolatedLqxh1s) - PointKt.m4222getYDnnuFBc(circleCenter)), actualR));
        FloatFloatPair floatFloatPairM4232lineIntersectionCBFvKDc = m4232lineIntersectionCBFvKDc(sideStart, jM4218getDirectionDnnuFBc, jM4225plusybeJwSQ2, Utils.m4242rotate90DnnuFBc(PointKt.m4224minusybeJwSQ(jM4225plusybeJwSQ2, circleCenter)));
        if (floatFloatPairM4232lineIntersectionCBFvKDc != null) {
            packedValue = floatFloatPairM4232lineIntersectionCBFvKDc.getPackedValue();
        }
        return new Cubic(jM4225plusybeJwSQ, PointKt.m4215divso9K2fw(PointKt.m4225plusybeJwSQ(jM4225plusybeJwSQ, PointKt.m4227timesso9K2fw(packedValue, 2.0f)), 3.0f), packedValue, jM4225plusybeJwSQ2, null);
    }

    public static /* synthetic */ List getCubics$default(RoundedCorner roundedCorner, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = f10;
        }
        return roundedCorner.getCubics(f10, f11);
    }

    /* JADX INFO: renamed from: lineIntersection-CBFvKDc, reason: not valid java name */
    private final FloatFloatPair m4232lineIntersectionCBFvKDc(long p02, long d02, long p12, long d12) {
        long jM4242rotate90DnnuFBc = Utils.m4242rotate90DnnuFBc(d12);
        float fM4217dotProductybeJwSQ = PointKt.m4217dotProductybeJwSQ(d02, jM4242rotate90DnnuFBc);
        if (Math.abs(fM4217dotProductybeJwSQ) < 1.0E-4f) {
            return null;
        }
        float fM4217dotProductybeJwSQ2 = PointKt.m4217dotProductybeJwSQ(PointKt.m4224minusybeJwSQ(p12, p02), jM4242rotate90DnnuFBc);
        if (Math.abs(fM4217dotProductybeJwSQ) < Math.abs(fM4217dotProductybeJwSQ2) * 1.0E-4f) {
            return null;
        }
        return FloatFloatPair.m1boximpl(PointKt.m4225plusybeJwSQ(p02, PointKt.m4227timesso9K2fw(d02, fM4217dotProductybeJwSQ2 / fM4217dotProductybeJwSQ)));
    }

    /* JADX INFO: renamed from: getCenter-1ufDz9w, reason: not valid java name and from getter */
    public final long getCenter() {
        return this.center;
    }

    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    public final float getCosAngle() {
        return this.cosAngle;
    }

    @NotNull
    public final List<Cubic> getCubics(float f10) {
        return getCubics$default(this, f10, 0.0f, 2, null);
    }

    /* JADX INFO: renamed from: getD1-1ufDz9w, reason: not valid java name and from getter */
    public final long getD1() {
        return this.d1;
    }

    /* JADX INFO: renamed from: getD2-1ufDz9w, reason: not valid java name and from getter */
    public final long getD2() {
        return this.d2;
    }

    public final float getExpectedCut() {
        return (1 + this.smoothing) * this.expectedRoundCut;
    }

    public final float getExpectedRoundCut() {
        return this.expectedRoundCut;
    }

    /* JADX INFO: renamed from: getP0-1ufDz9w, reason: not valid java name and from getter */
    public final long getP0() {
        return this.p0;
    }

    /* JADX INFO: renamed from: getP1-1ufDz9w, reason: not valid java name and from getter */
    public final long getP1() {
        return this.p1;
    }

    /* JADX INFO: renamed from: getP2-1ufDz9w, reason: not valid java name and from getter */
    public final long getP2() {
        return this.p2;
    }

    @Nullable
    public final CornerRounding getRounding() {
        return this.rounding;
    }

    public final float getSinAngle() {
        return this.sinAngle;
    }

    public final float getSmoothing() {
        return this.smoothing;
    }

    /* JADX INFO: renamed from: setCenter-DnnuFBc, reason: not valid java name */
    public final void m4239setCenterDnnuFBc(long j10) {
        this.center = j10;
    }

    private RoundedCorner(long j10, long j11, long j12, CornerRounding cornerRounding) {
        this.p0 = j10;
        this.p1 = j11;
        this.p2 = j12;
        this.rounding = cornerRounding;
        long jM4218getDirectionDnnuFBc = PointKt.m4218getDirectionDnnuFBc(PointKt.m4224minusybeJwSQ(j10, j11));
        this.d1 = jM4218getDirectionDnnuFBc;
        long jM4218getDirectionDnnuFBc2 = PointKt.m4218getDirectionDnnuFBc(PointKt.m4224minusybeJwSQ(j12, j11));
        this.d2 = jM4218getDirectionDnnuFBc2;
        float radius = cornerRounding != null ? cornerRounding.getRadius() : 0.0f;
        this.cornerRadius = radius;
        this.smoothing = cornerRounding != null ? cornerRounding.getSmoothing() : 0.0f;
        float fM4217dotProductybeJwSQ = PointKt.m4217dotProductybeJwSQ(jM4218getDirectionDnnuFBc, jM4218getDirectionDnnuFBc2);
        this.cosAngle = fM4217dotProductybeJwSQ;
        float f10 = 1;
        float fSqrt = (float) Math.sqrt(f10 - Utils.square(fM4217dotProductybeJwSQ));
        this.sinAngle = fSqrt;
        this.expectedRoundCut = ((double) fSqrt) > 0.001d ? (radius * (fM4217dotProductybeJwSQ + f10)) / fSqrt : 0.0f;
        this.center = FloatFloatPair.m4constructorimpl(0.0f, 0.0f);
    }

    @NotNull
    public final List<Cubic> getCubics(float allowedCut0, float allowedCut1) {
        float fMin = Math.min(allowedCut0, allowedCut1);
        float f10 = this.expectedRoundCut;
        if (f10 < 1.0E-4f || fMin < 1.0E-4f || this.cornerRadius < 1.0E-4f) {
            long j10 = this.p1;
            this.center = j10;
            return CollectionsKt.listOf(Cubic.INSTANCE.straightLine(PointKt.m4221getXDnnuFBc(j10), PointKt.m4222getYDnnuFBc(this.p1), PointKt.m4221getXDnnuFBc(this.p1), PointKt.m4222getYDnnuFBc(this.p1)));
        }
        float fMin2 = Math.min(fMin, f10);
        float fCalculateActualSmoothingValue = calculateActualSmoothingValue(allowedCut0);
        float fCalculateActualSmoothingValue2 = calculateActualSmoothingValue(allowedCut1);
        float f11 = (this.cornerRadius * fMin2) / this.expectedRoundCut;
        this.center = PointKt.m4225plusybeJwSQ(this.p1, PointKt.m4227timesso9K2fw(PointKt.m4218getDirectionDnnuFBc(PointKt.m4215divso9K2fw(PointKt.m4225plusybeJwSQ(this.d1, this.d2), 2.0f)), (float) Math.sqrt(Utils.square(f11) + Utils.square(fMin2))));
        long jM4225plusybeJwSQ = PointKt.m4225plusybeJwSQ(this.p1, PointKt.m4227timesso9K2fw(this.d1, fMin2));
        long jM4225plusybeJwSQ2 = PointKt.m4225plusybeJwSQ(this.p1, PointKt.m4227timesso9K2fw(this.d2, fMin2));
        Cubic cubicM4231computeFlankingCurveoAJzIJU = m4231computeFlankingCurveoAJzIJU(fMin2, fCalculateActualSmoothingValue, this.p1, this.p0, jM4225plusybeJwSQ, jM4225plusybeJwSQ2, this.center, f11);
        Cubic cubicReverse = m4231computeFlankingCurveoAJzIJU(fMin2, fCalculateActualSmoothingValue2, this.p1, this.p2, jM4225plusybeJwSQ2, jM4225plusybeJwSQ, this.center, f11).reverse();
        return CollectionsKt.listOf((Object[]) new Cubic[]{cubicM4231computeFlankingCurveoAJzIJU, Cubic.INSTANCE.circularArc(PointKt.m4221getXDnnuFBc(this.center), PointKt.m4222getYDnnuFBc(this.center), cubicM4231computeFlankingCurveoAJzIJU.getAnchor1X(), cubicM4231computeFlankingCurveoAJzIJU.getAnchor1Y(), cubicReverse.getAnchor0X(), cubicReverse.getAnchor0Y()), cubicReverse});
    }

    public /* synthetic */ RoundedCorner(long j10, long j11, long j12, CornerRounding cornerRounding, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, (i10 & 8) != 0 ? null : cornerRounding, null);
    }
}
