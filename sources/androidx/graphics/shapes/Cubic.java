package androidx.graphics.shapes;

import androidx.collection.FloatFloatPair;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.taurusx.tax.f.y;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.models.APIMeta;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 ?2\u00020\u0001:\u0001?B7\b\u0010\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\n\u0010\u0006\u001a\u00060\u0003j\u0002`\u0004\u0012\n\u0010\u0007\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0002\u0010\bB\u0011\b\u0000\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ!\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\n2\b\b\u0002\u0010#\u001a\u00020$H\u0000¢\u0006\u0002\b%J\u0011\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\rH\u0086\u0002J\u0011\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020(H\u0086\u0002J\u0013\u0010)\u001a\u00020$2\b\u0010*\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010+\u001a\u00020(H\u0016J\u0011\u0010,\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u0000H\u0086\u0002J!\u0010.\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010/\u001a\u00020\rH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00101J\u0006\u00102\u001a\u00020\u0000J\u001a\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000042\u0006\u0010/\u001a\u00020\rJ\u0011\u00105\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\rH\u0086\u0002J\u0011\u00105\u001a\u00020\u00002\u0006\u0010'\u001a\u00020(H\u0086\u0002J\b\u00106\u001a\u000207H\u0016J\u000e\u00108\u001a\u00020\u00002\u0006\u00109\u001a\u00020:J\u0010\u0010;\u001a\u00020$2\u0006\u0010<\u001a\u00020\rH\u0002J\r\u0010=\u001a\u00020$H\u0000¢\u0006\u0002\b>R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0014\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\u0016\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000fR\u0011\u0010\u0018\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u000fR\u0011\u0010\u001a\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u000fR\u0011\u0010\u001c\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u000fR\u0014\u0010\t\u001a\u00020\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006@"}, d2 = {"Landroidx/graphics/shapes/Cubic;", "", "anchor0", "Landroidx/collection/FloatFloatPair;", "Landroidx/graphics/shapes/Point;", "control0", "control1", "anchor1", "(JJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", APIMeta.POINTS, "", "([F)V", "anchor0X", "", "getAnchor0X", "()F", "anchor0Y", "getAnchor0Y", "anchor1X", "getAnchor1X", "anchor1Y", "getAnchor1Y", "control0X", "getControl0X", "control0Y", "getControl0Y", "control1X", "getControl1X", "control1Y", "getControl1Y", "getPoints$graphics_shapes_release", "()[F", "calculateBounds", "", "bounds", "approximate", "", "calculateBounds$graphics_shapes_release", "div", "x", "", "equals", "other", "hashCode", "plus", "o", "pointOnCurve", ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP, "pointOnCurve-OOQOV4g$graphics_shapes_release", "(F)J", "reverse", "split", "Lkotlin/Pair;", "times", "toString", "", "transformed", InneractiveMediationDefs.GENDER_FEMALE, "Landroidx/graphics/shapes/PointTransformer;", "zeroIsh", "value", "zeroLength", "zeroLength$graphics_shapes_release", y.f66058y, "graphics-shapes_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class Cubic {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final float[] points;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J8\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0007J(\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0007¨\u0006\r"}, d2 = {"Landroidx/graphics/shapes/Cubic$Companion;", "", "()V", "circularArc", "Landroidx/graphics/shapes/Cubic;", "centerX", "", "centerY", "x0", "y0", "x1", "y1", "straightLine", "graphics-shapes_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Cubic circularArc(float centerX, float centerY, float x02, float y02, float x12, float y12) {
            float f10 = x02 - centerX;
            float f11 = y02 - centerY;
            long jDirectionVector = Utils.directionVector(f10, f11);
            float f12 = x12 - centerX;
            float f13 = y12 - centerY;
            long jDirectionVector2 = Utils.directionVector(f12, f13);
            long jM4242rotate90DnnuFBc = Utils.m4242rotate90DnnuFBc(jDirectionVector);
            long jM4242rotate90DnnuFBc2 = Utils.m4242rotate90DnnuFBc(jDirectionVector2);
            boolean z10 = PointKt.m4216dotProduct5P9i7ZU(jM4242rotate90DnnuFBc, f12, f13) >= 0.0f;
            float fM4217dotProductybeJwSQ = PointKt.m4217dotProductybeJwSQ(jDirectionVector, jDirectionVector2);
            if (fM4217dotProductybeJwSQ > 0.999f) {
                return straightLine(x02, y02, x12, y12);
            }
            float fDistance = ((((Utils.distance(f10, f11) * 4.0f) / 3.0f) * (((float) Math.sqrt(2 * r9)) - ((float) Math.sqrt(r5 - (fM4217dotProductybeJwSQ * fM4217dotProductybeJwSQ))))) / (1 - fM4217dotProductybeJwSQ)) * (z10 ? 1.0f : -1.0f);
            return CubicKt.Cubic(x02, y02, x02 + (PointKt.m4221getXDnnuFBc(jM4242rotate90DnnuFBc) * fDistance), y02 + (PointKt.m4222getYDnnuFBc(jM4242rotate90DnnuFBc) * fDistance), x12 - (PointKt.m4221getXDnnuFBc(jM4242rotate90DnnuFBc2) * fDistance), y12 - (PointKt.m4222getYDnnuFBc(jM4242rotate90DnnuFBc2) * fDistance), x12, y12);
        }

        @NotNull
        public final Cubic straightLine(float x02, float y02, float x12, float y12) {
            return CubicKt.Cubic(x02, y02, Utils.interpolate(x02, x12, 0.33333334f), Utils.interpolate(y02, y12, 0.33333334f), Utils.interpolate(x02, x12, 0.6666667f), Utils.interpolate(y02, y12, 0.6666667f), x12, y12);
        }

        private Companion() {
        }
    }

    public Cubic() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ void calculateBounds$graphics_shapes_release$default(Cubic cubic, float[] fArr, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: calculateBounds");
        }
        if ((i10 & 1) != 0) {
            fArr = new float[4];
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        cubic.calculateBounds$graphics_shapes_release(fArr, z10);
    }

    @NotNull
    public static final Cubic circularArc(float f10, float f11, float f12, float f13, float f14, float f15) {
        return INSTANCE.circularArc(f10, f11, f12, f13, f14, f15);
    }

    @NotNull
    public static final Cubic straightLine(float f10, float f11, float f12, float f13) {
        return INSTANCE.straightLine(f10, f11, f12, f13);
    }

    private final boolean zeroIsh(float value) {
        return Math.abs(value) < 1.0E-4f;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c9 A[PHI: r3 r7
  0x01c9: PHI (r3v15 float) = (r3v12 float), (r3v21 float) binds: [B:85:0x0218, B:62:0x01c7] A[DONT_GENERATE, DONT_INLINE]
  0x01c9: PHI (r7v14 float) = (r7v10 float), (r7v16 float) binds: [B:85:0x0218, B:62:0x01c7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x021b A[PHI: r9 r15
  0x021b: PHI (r9v5 float) = (r9v2 float), (r9v3 float), (r9v3 float), (r9v2 float), (r9v2 float), (r9v2 float) binds: [B:65:0x01d2, B:77:0x0201, B:79:0x0205, B:51:0x01a6, B:54:0x01b0, B:56:0x01b4] A[DONT_GENERATE, DONT_INLINE]
  0x021b: PHI (r15v13 float) = (r15v9 float), (r15v10 float), (r15v10 float), (r15v9 float), (r15v9 float), (r15v9 float) binds: [B:65:0x01d2, B:77:0x0201, B:79:0x0205, B:51:0x01a6, B:54:0x01b0, B:56:0x01b4] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void calculateBounds$graphics_shapes_release(@org.jetbrains.annotations.NotNull float[] r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 549
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.graphics.shapes.Cubic.calculateBounds$graphics_shapes_release(float[], boolean):void");
    }

    @NotNull
    public final Cubic div(float x10) {
        return times(1.0f / x10);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof Cubic) {
            return Arrays.equals(this.points, ((Cubic) other).points);
        }
        return false;
    }

    public final float getAnchor0X() {
        return this.points[0];
    }

    public final float getAnchor0Y() {
        return this.points[1];
    }

    public final float getAnchor1X() {
        return this.points[6];
    }

    public final float getAnchor1Y() {
        return this.points[7];
    }

    public final float getControl0X() {
        return this.points[2];
    }

    public final float getControl0Y() {
        return this.points[3];
    }

    public final float getControl1X() {
        return this.points[4];
    }

    public final float getControl1Y() {
        return this.points[5];
    }

    @NotNull
    /* JADX INFO: renamed from: getPoints$graphics_shapes_release, reason: from getter */
    public final float[] getPoints() {
        return this.points;
    }

    public int hashCode() {
        return Arrays.hashCode(this.points);
    }

    @NotNull
    public final Cubic plus(@NotNull Cubic o10) {
        Intrinsics.checkNotNullParameter(o10, "o");
        float[] fArr = new float[8];
        for (int i10 = 0; i10 < 8; i10++) {
            fArr[i10] = this.points[i10] + o10.points[i10];
        }
        return new Cubic(fArr);
    }

    /* JADX INFO: renamed from: pointOnCurve-OOQOV4g$graphics_shapes_release, reason: not valid java name */
    public final long m4209pointOnCurveOOQOV4g$graphics_shapes_release(float t10) {
        float f10 = 1 - t10;
        float f11 = f10 * f10 * f10;
        float f12 = 3 * t10;
        float f13 = f12 * f10 * f10;
        float f14 = f12 * t10 * f10;
        float f15 = t10 * t10 * t10;
        return FloatFloatPair.m4constructorimpl((getAnchor0X() * f11) + (getControl0X() * f13) + (getControl1X() * f14) + (getAnchor1X() * f15), (getAnchor0Y() * f11) + (getControl0Y() * f13) + (getControl1Y() * f14) + (getAnchor1Y() * f15));
    }

    @NotNull
    public final Cubic reverse() {
        return CubicKt.Cubic(getAnchor1X(), getAnchor1Y(), getControl1X(), getControl1Y(), getControl0X(), getControl0Y(), getAnchor0X(), getAnchor0Y());
    }

    @NotNull
    public final Pair<Cubic, Cubic> split(float t10) {
        float f10 = 1 - t10;
        long jM4209pointOnCurveOOQOV4g$graphics_shapes_release = m4209pointOnCurveOOQOV4g$graphics_shapes_release(t10);
        float f11 = f10 * f10;
        float f12 = 2 * f10 * t10;
        float f13 = t10 * t10;
        return TuplesKt.to(CubicKt.Cubic(getAnchor0X(), getAnchor0Y(), (getAnchor0X() * f10) + (getControl0X() * t10), (getAnchor0Y() * f10) + (getControl0Y() * t10), (getAnchor0X() * f11) + (getControl0X() * f12) + (getControl1X() * f13), (getAnchor0Y() * f11) + (getControl0Y() * f12) + (getControl1Y() * f13), PointKt.m4221getXDnnuFBc(jM4209pointOnCurveOOQOV4g$graphics_shapes_release), PointKt.m4222getYDnnuFBc(jM4209pointOnCurveOOQOV4g$graphics_shapes_release)), CubicKt.Cubic(PointKt.m4221getXDnnuFBc(jM4209pointOnCurveOOQOV4g$graphics_shapes_release), PointKt.m4222getYDnnuFBc(jM4209pointOnCurveOOQOV4g$graphics_shapes_release), (getControl0X() * f11) + (getControl1X() * f12) + (getAnchor1X() * f13), (getControl0Y() * f11) + (getControl1Y() * f12) + (getAnchor1Y() * f13), (getControl1X() * f10) + (getAnchor1X() * t10), (getControl1Y() * f10) + (getAnchor1Y() * t10), getAnchor1X(), getAnchor1Y()));
    }

    @NotNull
    public final Cubic times(float x10) {
        float[] fArr = new float[8];
        for (int i10 = 0; i10 < 8; i10++) {
            fArr[i10] = this.points[i10] * x10;
        }
        return new Cubic(fArr);
    }

    @NotNull
    public String toString() {
        return "anchor0: (" + getAnchor0X() + ", " + getAnchor0Y() + ") control0: (" + getControl0X() + ", " + getControl0Y() + "), control1: (" + getControl1X() + ", " + getControl1Y() + "), anchor1: (" + getAnchor1X() + ", " + getAnchor1Y() + ')';
    }

    @NotNull
    public final Cubic transformed(@NotNull PointTransformer f10) {
        Intrinsics.checkNotNullParameter(f10, "f");
        MutableCubic mutableCubic = new MutableCubic();
        ArraysKt.copyInto$default(this.points, mutableCubic.getPoints(), 0, 0, 0, 14, (Object) null);
        mutableCubic.transform(f10);
        return mutableCubic;
    }

    public final boolean zeroLength$graphics_shapes_release() {
        return Math.abs(getAnchor0X() - getAnchor1X()) < 1.0E-4f && Math.abs(getAnchor0Y() - getAnchor1Y()) < 1.0E-4f;
    }

    public /* synthetic */ Cubic(long j10, long j11, long j12, long j13, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13);
    }

    @NotNull
    public final Cubic div(int x10) {
        return div(x10);
    }

    @NotNull
    public final Cubic times(int x10) {
        return times(x10);
    }

    public Cubic(@NotNull float[] points) {
        Intrinsics.checkNotNullParameter(points, "points");
        this.points = points;
        if (points.length != 8) {
            throw new IllegalArgumentException("Points array size should be 8");
        }
    }

    public /* synthetic */ Cubic(float[] fArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new float[8] : fArr);
    }

    private Cubic(long j10, long j11, long j12, long j13) {
        this(new float[]{PointKt.m4221getXDnnuFBc(j10), PointKt.m4222getYDnnuFBc(j10), PointKt.m4221getXDnnuFBc(j11), PointKt.m4222getYDnnuFBc(j11), PointKt.m4221getXDnnuFBc(j12), PointKt.m4222getYDnnuFBc(j12), PointKt.m4221getXDnnuFBc(j13), PointKt.m4222getYDnnuFBc(j13)});
    }
}
