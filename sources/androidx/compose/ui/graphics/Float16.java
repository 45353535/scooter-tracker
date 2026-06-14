package androidx.compose.ui.graphics;

import androidx.exifinterface.media.ExifInterface;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0010\u0005\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000f\b\u0081@\u0018\u0000 R2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001RB\u0014\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005B\u0014\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0007B\u0012\u0012\u0006\u0010\b\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\nJ\u0016\u0010\u0015\u001a\u00020\u0000ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\nJ\u0016\u0010\u0017\u001a\u00020\u0000ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\nJ\u001e\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0000H\u0096\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b \u0010!J\u0016\u0010\"\u001a\u00020\u0000ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010\nJ\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010\u000eJ\r\u0010&\u001a\u00020\u001e¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u001e¢\u0006\u0004\b*\u0010(J\r\u0010+\u001a\u00020\u001e¢\u0006\u0004\b,\u0010(J\r\u0010-\u001a\u00020\u001e¢\u0006\u0004\b.\u0010(J\u0016\u0010/\u001a\u00020\u0000ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b0\u0010\nJ\r\u00101\u001a\u00020\f¢\u0006\u0004\b2\u0010\u000eJ\r\u00103\u001a\u000204¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\u0006¢\u0006\u0004\b8\u00109J\r\u0010:\u001a\u00020\u0003¢\u0006\u0004\b;\u0010<J\r\u0010=\u001a\u00020>¢\u0006\u0004\b?\u0010@J\r\u0010A\u001a\u00020\f¢\u0006\u0004\bB\u0010\u000eJ\r\u0010C\u001a\u00020D¢\u0006\u0004\bE\u0010FJ\r\u0010G\u001a\u00020\f¢\u0006\u0004\bH\u0010\u000eJ\r\u0010I\u001a\u00020\t¢\u0006\u0004\bJ\u0010\nJ\u000f\u0010K\u001a\u00020>H\u0016¢\u0006\u0004\bL\u0010@J\u0016\u0010M\u001a\u00020\u0000ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bN\u0010\nJ\u001b\u0010O\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bP\u0010QR\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00008Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0012\u0010\nR\u0011\u0010\u0013\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000e\u0088\u0001\bø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006S"}, d2 = {"Landroidx/compose/ui/graphics/Float16;", "", "value", "", "constructor-impl", "(F)S", "", "(D)S", "halfValue", "", "(S)S", "exponent", "", "getExponent-impl", "(S)I", "getHalfValue", "()S", "sign", "getSign-slo4al4", "significand", "getSignificand-impl", "absoluteValue", "absoluteValue-slo4al4", "ceil", "ceil-slo4al4", "compareTo", "other", "compareTo-41bOqos", "(SS)I", "equals", "", "", "equals-impl", "(SLjava/lang/Object;)Z", "floor", "floor-slo4al4", "hashCode", "hashCode-impl", "isFinite", "isFinite-impl", "(S)Z", "isInfinite", "isInfinite-impl", "isNaN", "isNaN-impl", "isNormalized", "isNormalized-impl", "round", "round-slo4al4", "toBits", "toBits-impl", "toByte", "", "toByte-impl", "(S)B", "toDouble", "toDouble-impl", "(S)D", "toFloat", "toFloat-impl", "(S)F", "toHexString", "", "toHexString-impl", "(S)Ljava/lang/String;", "toInt", "toInt-impl", "toLong", "", "toLong-impl", "(S)J", "toRawBits", "toRawBits-impl", "toShort", "toShort-impl", "toString", "toString-impl", "trunc", "trunc-slo4al4", "withSign", "withSign-qCeQghg", "(SS)S", com.taurusx.tax.f.y.f66058y, "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Float16 implements Comparable<Float16> {
    private static final int FP16_COMBINED = 32767;
    private static final int FP16_EXPONENT_BIAS = 15;
    private static final int FP16_EXPONENT_MASK = 31;
    private static final int FP16_EXPONENT_MAX = 31744;
    private static final int FP16_EXPONENT_SHIFT = 10;
    private static final int FP16_SIGNIFICAND_MASK = 1023;
    private static final int FP16_SIGN_MASK = 32768;
    private static final int FP16_SIGN_SHIFT = 15;
    private static final float FP32_DENORMAL_FLOAT;
    private static final int FP32_DENORMAL_MAGIC = 1056964608;
    private static final int FP32_EXPONENT_BIAS = 127;
    private static final int FP32_EXPONENT_MASK = 255;
    private static final int FP32_EXPONENT_SHIFT = 23;
    private static final int FP32_QNAN_MASK = 4194304;
    private static final int FP32_SIGNIFICAND_MASK = 8388607;
    private static final int FP32_SIGN_SHIFT = 31;
    public static final int MaxExponent = 15;
    public static final int MinExponent = -14;
    public static final int Size = 16;
    private final short halfValue;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final short Epsilon = m1708constructorimpl((short) 5120);
    private static final short LowestValue = m1708constructorimpl((short) -1025);
    private static final short MaxValue = m1708constructorimpl((short) 31743);
    private static final short MinNormal = m1708constructorimpl((short) 1024);
    private static final short MinValue = m1708constructorimpl((short) 1);
    private static final short NaN = m1708constructorimpl((short) 32256);
    private static final short NegativeInfinity = m1708constructorimpl((short) -1024);
    private static final short NegativeZero = m1708constructorimpl(Short.MIN_VALUE);
    private static final short PositiveInfinity = m1708constructorimpl((short) 31744);
    private static final short PositiveZero = m1708constructorimpl((short) 0);
    private static final short One = m1707constructorimpl(1.0f);
    private static final short NegativeOne = m1707constructorimpl(-1.0f);

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u001f\n\u0002\u0010\n\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u0012H\u0002J\u0010\u00104\u001a\u00020\t2\u0006\u00105\u001a\u000202H\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u001c\u0010\u001a\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001b\u0010\u0006R\u000e\u0010\u001c\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010\u001d\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001e\u0010\u0006R\u000e\u0010\u001f\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010 \u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b!\u0010\u0006R\u001c\u0010\"\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b#\u0010\u0006R\u001c\u0010$\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b%\u0010\u0006R\u001c\u0010&\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b'\u0010\u0006R\u0019\u0010(\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0007R\u001c\u0010)\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b*\u0010\u0006R\u0019\u0010+\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0007R\u001c\u0010,\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b-\u0010\u0006R\u001c\u0010.\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b/\u0010\u0006R\u000e\u00100\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00066"}, d2 = {"Landroidx/compose/ui/graphics/Float16$Companion;", "", "()V", "Epsilon", "Landroidx/compose/ui/graphics/Float16;", "getEpsilon-slo4al4", "()S", ExifInterface.LATITUDE_SOUTH, "FP16_COMBINED", "", "FP16_EXPONENT_BIAS", "FP16_EXPONENT_MASK", "FP16_EXPONENT_MAX", "FP16_EXPONENT_SHIFT", "FP16_SIGNIFICAND_MASK", "FP16_SIGN_MASK", "FP16_SIGN_SHIFT", "FP32_DENORMAL_FLOAT", "", "FP32_DENORMAL_MAGIC", "FP32_EXPONENT_BIAS", "FP32_EXPONENT_MASK", "FP32_EXPONENT_SHIFT", "FP32_QNAN_MASK", "FP32_SIGNIFICAND_MASK", "FP32_SIGN_SHIFT", "LowestValue", "getLowestValue-slo4al4", "MaxExponent", "MaxValue", "getMaxValue-slo4al4", "MinExponent", "MinNormal", "getMinNormal-slo4al4", "MinValue", "getMinValue-slo4al4", "NaN", "getNaN-slo4al4", "NegativeInfinity", "getNegativeInfinity-slo4al4", "NegativeOne", "NegativeZero", "getNegativeZero-slo4al4", "One", "PositiveInfinity", "getPositiveInfinity-slo4al4", "PositiveZero", "getPositiveZero-slo4al4", "Size", "floatToHalf", "", InneractiveMediationDefs.GENDER_FEMALE, "toCompareValue", "value", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final short floatToHalf(float f10) {
            int i10;
            int iFloatToRawIntBits = Float.floatToRawIntBits(f10);
            int i11 = iFloatToRawIntBits >>> 31;
            int i12 = (iFloatToRawIntBits >>> 23) & 255;
            int i13 = Float16.FP32_SIGNIFICAND_MASK & iFloatToRawIntBits;
            int i14 = 31;
            int i15 = 0;
            if (i12 != 255) {
                int i16 = i12 - 112;
                if (i16 >= 31) {
                    i14 = 49;
                } else if (i16 > 0) {
                    i15 = i13 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i10 = (((i16 << 10) | i15) + 1) | (i11 << 15);
                        return (short) i10;
                    }
                    i14 = i16;
                } else if (i16 >= -10) {
                    int i17 = (8388608 | i13) >> (1 - i16);
                    if ((i17 & 4096) != 0) {
                        i17 += 8192;
                    }
                    i14 = 0;
                    i15 = i17 >> 13;
                } else {
                    i14 = 0;
                }
            } else if (i13 != 0) {
                i15 = 512;
            }
            i10 = (i11 << 15) | (i14 << 10) | i15;
            return (short) i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int toCompareValue(short value) {
            return (value & Short.MIN_VALUE) != 0 ? 32768 - (value & 65535) : value & 65535;
        }

        /* JADX INFO: renamed from: getEpsilon-slo4al4, reason: not valid java name */
        public final short m1735getEpsilonslo4al4() {
            return Float16.Epsilon;
        }

        /* JADX INFO: renamed from: getLowestValue-slo4al4, reason: not valid java name */
        public final short m1736getLowestValueslo4al4() {
            return Float16.LowestValue;
        }

        /* JADX INFO: renamed from: getMaxValue-slo4al4, reason: not valid java name */
        public final short m1737getMaxValueslo4al4() {
            return Float16.MaxValue;
        }

        /* JADX INFO: renamed from: getMinNormal-slo4al4, reason: not valid java name */
        public final short m1738getMinNormalslo4al4() {
            return Float16.MinNormal;
        }

        /* JADX INFO: renamed from: getMinValue-slo4al4, reason: not valid java name */
        public final short m1739getMinValueslo4al4() {
            return Float16.MinValue;
        }

        /* JADX INFO: renamed from: getNaN-slo4al4, reason: not valid java name */
        public final short m1740getNaNslo4al4() {
            return Float16.NaN;
        }

        /* JADX INFO: renamed from: getNegativeInfinity-slo4al4, reason: not valid java name */
        public final short m1741getNegativeInfinityslo4al4() {
            return Float16.NegativeInfinity;
        }

        /* JADX INFO: renamed from: getNegativeZero-slo4al4, reason: not valid java name */
        public final short m1742getNegativeZeroslo4al4() {
            return Float16.NegativeZero;
        }

        /* JADX INFO: renamed from: getPositiveInfinity-slo4al4, reason: not valid java name */
        public final short m1743getPositiveInfinityslo4al4() {
            return Float16.PositiveInfinity;
        }

        /* JADX INFO: renamed from: getPositiveZero-slo4al4, reason: not valid java name */
        public final short m1744getPositiveZeroslo4al4() {
            return Float16.PositiveZero;
        }

        private Companion() {
        }
    }

    static {
        kotlin.jvm.internal.u uVar = kotlin.jvm.internal.u.f93332a;
        FP32_DENORMAL_FLOAT = Float.intBitsToFloat(FP32_DENORMAL_MAGIC);
    }

    private /* synthetic */ Float16(short s10) {
        this.halfValue = s10;
    }

    /* JADX INFO: renamed from: absoluteValue-slo4al4, reason: not valid java name */
    public static final short m1702absoluteValueslo4al4(short s10) {
        return m1708constructorimpl((short) (s10 & Short.MAX_VALUE));
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Float16 m1703boximpl(short s10) {
        return new Float16(s10);
    }

    /* JADX INFO: renamed from: ceil-slo4al4, reason: not valid java name */
    public static final short m1704ceilslo4al4(short s10) {
        int i10 = 65535 & s10;
        int i11 = s10 & Short.MAX_VALUE;
        if (i11 < 15360) {
            i10 = ((-((~(i10 >> 15)) & (i11 == 0 ? 0 : 1))) & 15360) | (s10 & Short.MIN_VALUE);
        } else if (i11 < 25600) {
            int i12 = (1 << (25 - (i11 >> 10))) - 1;
            i10 = (i10 + (((i10 >> 15) - 1) & i12)) & (~i12);
        }
        return m1708constructorimpl((short) i10);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static short m1708constructorimpl(short s10) {
        return s10;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m1709equalsimpl(short s10, Object obj) {
        return (obj instanceof Float16) && s10 == ((Float16) obj).m1734unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1710equalsimpl0(short s10, short s11) {
        return s10 == s11;
    }

    /* JADX INFO: renamed from: floor-slo4al4, reason: not valid java name */
    public static final short m1711floorslo4al4(short s10) {
        int i10 = s10 & 65535;
        int i11 = s10 & Short.MAX_VALUE;
        if (i11 < 15360) {
            i10 = (s10 & Short.MIN_VALUE) | ((i10 <= 32768 ? 0 : 65535) & 15360);
        } else if (i11 < 25600) {
            int i12 = (1 << (25 - (i11 >> 10))) - 1;
            i10 = (i10 + ((-(i10 >> 15)) & i12)) & (~i12);
        }
        return m1708constructorimpl((short) i10);
    }

    /* JADX INFO: renamed from: getExponent-impl, reason: not valid java name */
    public static final int m1712getExponentimpl(short s10) {
        return ((s10 >>> 10) & 31) - 15;
    }

    /* JADX INFO: renamed from: getSign-slo4al4, reason: not valid java name */
    public static final short m1713getSignslo4al4(short s10) {
        return m1718isNaNimpl(s10) ? NaN : m1705compareTo41bOqos(s10, NegativeZero) < 0 ? NegativeOne : m1705compareTo41bOqos(s10, PositiveZero) > 0 ? One : s10;
    }

    /* JADX INFO: renamed from: getSignificand-impl, reason: not valid java name */
    public static final int m1714getSignificandimpl(short s10) {
        return s10 & 1023;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m1715hashCodeimpl(short s10) {
        return s10;
    }

    /* JADX INFO: renamed from: isFinite-impl, reason: not valid java name */
    public static final boolean m1716isFiniteimpl(short s10) {
        return (s10 & Short.MAX_VALUE) != FP16_EXPONENT_MAX;
    }

    /* JADX INFO: renamed from: isInfinite-impl, reason: not valid java name */
    public static final boolean m1717isInfiniteimpl(short s10) {
        return (s10 & Short.MAX_VALUE) == FP16_EXPONENT_MAX;
    }

    /* JADX INFO: renamed from: isNaN-impl, reason: not valid java name */
    public static final boolean m1718isNaNimpl(short s10) {
        return (s10 & Short.MAX_VALUE) > FP16_EXPONENT_MAX;
    }

    /* JADX INFO: renamed from: isNormalized-impl, reason: not valid java name */
    public static final boolean m1719isNormalizedimpl(short s10) {
        int i10 = s10 & FP16_EXPONENT_MAX;
        return (i10 == 0 || i10 == FP16_EXPONENT_MAX) ? false : true;
    }

    /* JADX INFO: renamed from: round-slo4al4, reason: not valid java name */
    public static final short m1720roundslo4al4(short s10) {
        int i10 = s10 & 65535;
        int i11 = s10 & Short.MAX_VALUE;
        if (i11 < 15360) {
            i10 = (s10 & Short.MIN_VALUE) | ((i11 < 14336 ? 0 : 65535) & 15360);
        } else if (i11 < 25600) {
            int i12 = i11 >> 10;
            i10 = (i10 + (1 << (24 - i12))) & (~((1 << (25 - i12)) - 1));
        }
        return m1708constructorimpl((short) i10);
    }

    /* JADX INFO: renamed from: toBits-impl, reason: not valid java name */
    public static final int m1721toBitsimpl(short s10) {
        return m1718isNaNimpl(s10) ? NaN : s10 & 65535;
    }

    /* JADX INFO: renamed from: toByte-impl, reason: not valid java name */
    public static final byte m1722toByteimpl(short s10) {
        return (byte) m1724toFloatimpl(s10);
    }

    /* JADX INFO: renamed from: toDouble-impl, reason: not valid java name */
    public static final double m1723toDoubleimpl(short s10) {
        return m1724toFloatimpl(s10);
    }

    /* JADX INFO: renamed from: toFloat-impl, reason: not valid java name */
    public static final float m1724toFloatimpl(short s10) {
        int i10;
        int i11;
        int i12;
        int i13 = Short.MIN_VALUE & s10;
        int i14 = ((65535 & s10) >>> 10) & 31;
        int i15 = s10 & 1023;
        if (i14 != 0) {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + 112;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        } else {
            if (i15 != 0) {
                kotlin.jvm.internal.u uVar = kotlin.jvm.internal.u.f93332a;
                float fIntBitsToFloat = Float.intBitsToFloat(i15 + FP32_DENORMAL_MAGIC) - FP32_DENORMAL_FLOAT;
                return i13 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        int i18 = (i12 << 23) | (i13 << 16) | i11;
        kotlin.jvm.internal.u uVar2 = kotlin.jvm.internal.u.f93332a;
        return Float.intBitsToFloat(i18);
    }

    @NotNull
    /* JADX INFO: renamed from: toHexString-impl, reason: not valid java name */
    public static final String m1725toHexStringimpl(short s10) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 65535 & s10;
        int i11 = i10 >>> 15;
        int i12 = (i10 >>> 10) & 31;
        int i13 = s10 & 1023;
        if (i12 != 31) {
            if (i11 == 1) {
                sb2.append('-');
            }
            if (i12 != 0) {
                sb2.append("0x1.");
                String string = Integer.toString(i13, CharsKt.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(string, "toString(this, checkRadix(radix))");
                sb2.append(new Regex("0{2,}$").i(string, ""));
                sb2.append('p');
                sb2.append(String.valueOf(i12 - 15));
            } else if (i13 == 0) {
                sb2.append("0x0.0p0");
            } else {
                sb2.append("0x0.");
                String string2 = Integer.toString(i13, CharsKt.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(string2, "toString(this, checkRadix(radix))");
                sb2.append(new Regex("0{2,}$").i(string2, ""));
                sb2.append("p-14");
            }
        } else if (i13 == 0) {
            if (i11 != 0) {
                sb2.append('-');
            }
            sb2.append("Infinity");
        } else {
            sb2.append("NaN");
        }
        String string3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string3, "o.toString()");
        return string3;
    }

    /* JADX INFO: renamed from: toInt-impl, reason: not valid java name */
    public static final int m1726toIntimpl(short s10) {
        return (int) m1724toFloatimpl(s10);
    }

    /* JADX INFO: renamed from: toLong-impl, reason: not valid java name */
    public static final long m1727toLongimpl(short s10) {
        return (long) m1724toFloatimpl(s10);
    }

    /* JADX INFO: renamed from: toRawBits-impl, reason: not valid java name */
    public static final int m1728toRawBitsimpl(short s10) {
        return s10 & 65535;
    }

    /* JADX INFO: renamed from: toShort-impl, reason: not valid java name */
    public static final short m1729toShortimpl(short s10) {
        return (short) m1724toFloatimpl(s10);
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m1730toStringimpl(short s10) {
        return String.valueOf(m1724toFloatimpl(s10));
    }

    /* JADX INFO: renamed from: trunc-slo4al4, reason: not valid java name */
    public static final short m1731truncslo4al4(short s10) {
        int i10 = 65535 & s10;
        int i11 = s10 & Short.MAX_VALUE;
        if (i11 < 15360) {
            i10 = Short.MIN_VALUE & s10;
        } else if (i11 < 25600) {
            i10 &= ~((1 << (25 - (i11 >> 10))) - 1);
        }
        return m1708constructorimpl((short) i10);
    }

    /* JADX INFO: renamed from: withSign-qCeQghg, reason: not valid java name */
    public static final short m1732withSignqCeQghg(short s10, short s11) {
        return m1708constructorimpl((short) ((s10 & Short.MAX_VALUE) | (s11 & Short.MIN_VALUE)));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Float16 float16) {
        return m1733compareTo41bOqos(float16.m1734unboximpl());
    }

    /* JADX INFO: renamed from: compareTo-41bOqos, reason: not valid java name */
    public int m1733compareTo41bOqos(short s10) {
        return m1705compareTo41bOqos(this.halfValue, s10);
    }

    public boolean equals(Object obj) {
        return m1709equalsimpl(this.halfValue, obj);
    }

    public final short getHalfValue() {
        return this.halfValue;
    }

    public int hashCode() {
        return m1715hashCodeimpl(this.halfValue);
    }

    @NotNull
    public String toString() {
        return m1730toStringimpl(this.halfValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ short m1734unboximpl() {
        return this.halfValue;
    }

    /* JADX INFO: renamed from: compareTo-41bOqos, reason: not valid java name */
    public static int m1705compareTo41bOqos(short s10, short s11) {
        if (m1718isNaNimpl(s10)) {
            return !m1718isNaNimpl(s11) ? 1 : 0;
        }
        if (m1718isNaNimpl(s11)) {
            return -1;
        }
        Companion companion = INSTANCE;
        return Intrinsics.compare(companion.toCompareValue(s10), companion.toCompareValue(s11));
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static short m1707constructorimpl(float f10) {
        return m1708constructorimpl(INSTANCE.floatToHalf(f10));
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static short m1706constructorimpl(double d10) {
        return m1707constructorimpl((float) d10);
    }
}
