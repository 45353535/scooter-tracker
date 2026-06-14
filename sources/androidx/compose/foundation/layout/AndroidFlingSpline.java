package androidx.compose.foundation.layout;

import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bJ\u001e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Landroidx/compose/foundation/layout/AndroidFlingSpline;", "", "()V", "NbSamples", "", "SplinePositions", "", "SplineTimes", "deceleration", "", "velocity", "", "friction", "flingPosition", "Landroidx/compose/foundation/layout/AndroidFlingSpline$FlingResult;", "time", "flingPosition-LfoxSSI", "(F)J", "FlingResult", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class AndroidFlingSpline {
    private static final int NbSamples = 100;

    @NotNull
    public static final AndroidFlingSpline INSTANCE = new AndroidFlingSpline();

    @NotNull
    private static final float[] SplinePositions = new float[101];

    @NotNull
    private static final float[] SplineTimes = new float[101];

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/layout/AndroidFlingSpline$FlingResult;", "", "packedValue", "", "constructor-impl", "(J)J", "distanceCoefficient", "", "getDistanceCoefficient-impl", "(J)F", "velocityCoefficient", "getVelocityCoefficient-impl", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class FlingResult {
        private final long packedValue;

        private /* synthetic */ FlingResult(long j10) {
            this.packedValue = j10;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ FlingResult m356boximpl(long j10) {
            return new FlingResult(j10);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static long m357constructorimpl(long j10) {
            return j10;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m358equalsimpl(long j10, Object obj) {
            return (obj instanceof FlingResult) && j10 == ((FlingResult) obj).getPackedValue();
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m359equalsimpl0(long j10, long j11) {
            return j10 == j11;
        }

        /* JADX INFO: renamed from: getDistanceCoefficient-impl, reason: not valid java name */
        public static final float m360getDistanceCoefficientimpl(long j10) {
            u uVar = u.f93332a;
            return Float.intBitsToFloat((int) (j10 >> 32));
        }

        /* JADX INFO: renamed from: getVelocityCoefficient-impl, reason: not valid java name */
        public static final float m361getVelocityCoefficientimpl(long j10) {
            u uVar = u.f93332a;
            return Float.intBitsToFloat((int) (j10 & 4294967295L));
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m362hashCodeimpl(long j10) {
            return androidx.collection.b.a(j10);
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m363toStringimpl(long j10) {
            return "FlingResult(packedValue=" + j10 + ')';
        }

        public boolean equals(Object obj) {
            return m358equalsimpl(this.packedValue, obj);
        }

        public int hashCode() {
            return m362hashCodeimpl(this.packedValue);
        }

        public String toString() {
            return m363toStringimpl(this.packedValue);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ long getPackedValue() {
            return this.packedValue;
        }
    }

    static {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20 = 0.0f;
        int i10 = 0;
        float f21 = 0.0f;
        while (true) {
            float f22 = 1.0f;
            if (i10 >= 100) {
                SplineTimes[100] = 1.0f;
                SplinePositions[100] = 1.0f;
                return;
            }
            float f23 = i10 / 100;
            float f24 = 1.0f;
            while (true) {
                f10 = ((f24 - f20) / 2.0f) + f20;
                f11 = f22 - f10;
                f12 = f10 * 3.0f * f11;
                f13 = f10 * f10 * f10;
                float f25 = (((f11 * 0.175f) + (f10 * 0.35000002f)) * f12) + f13;
                f14 = f22;
                f15 = f23;
                if (Math.abs(f25 - f23) < 1.0E-5d) {
                    break;
                }
                if (f25 > f15) {
                    f24 = f10;
                } else {
                    f20 = f10;
                }
                f22 = f14;
                f23 = f15;
            }
            SplinePositions[i10] = (f12 * ((f11 * 0.5f) + f10)) + f13;
            float f26 = f14;
            while (true) {
                f16 = ((f26 - f21) / 2.0f) + f21;
                f17 = f14 - f16;
                f18 = f16 * 3.0f * f17;
                f19 = f16 * f16 * f16;
                float f27 = (((f17 * 0.5f) + f16) * f18) + f19;
                if (Math.abs(f27 - f15) >= 1.0E-5d) {
                    if (f27 > f15) {
                        f26 = f16;
                    } else {
                        f21 = f16;
                    }
                }
            }
            SplineTimes[i10] = (f18 * ((f17 * 0.175f) + (f16 * 0.35000002f))) + f19;
            i10++;
        }
    }

    private AndroidFlingSpline() {
    }

    public final double deceleration(float velocity, float friction) {
        return Math.log(((double) (Math.abs(velocity) * 0.35f)) / ((double) friction));
    }

    /* JADX INFO: renamed from: flingPosition-LfoxSSI, reason: not valid java name */
    public final long m355flingPositionLfoxSSI(float time) {
        float f10;
        float f11;
        float f12 = 100;
        int i10 = (int) (f12 * time);
        if (i10 < 100) {
            float f13 = i10 / f12;
            int i11 = i10 + 1;
            float f14 = i11 / f12;
            float[] fArr = SplinePositions;
            float f15 = fArr[i10];
            f11 = (fArr[i11] - f15) / (f14 - f13);
            f10 = f15 + ((time - f13) * f11);
        } else {
            f10 = 1.0f;
            f11 = 0.0f;
        }
        return FlingResult.m357constructorimpl((((long) Float.floatToIntBits(f11)) & 4294967295L) | (Float.floatToIntBits(f10) << 32));
    }
}
