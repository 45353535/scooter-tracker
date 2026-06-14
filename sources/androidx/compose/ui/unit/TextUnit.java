package androidx.compose.ui.unit;

import androidx.collection.b;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.TextUnitType;
import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087@\u0018\u0000 02\u00020\u0001:\u00010B\u0014\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0000H\u0086\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001dH\u0086\nø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0014H\u0086\nø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010 J!\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018H\u0086\nø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010!J\u001a\u0010\"\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b&\u0010'J!\u0010(\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001dH\u0086\nø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010\u001fJ!\u0010(\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0014H\u0086\nø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010 J!\u0010(\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018H\u0086\nø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010!J\u000f\u0010*\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u0019\u0010.\u001a\u00020\u0000H\u0086\nø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b/\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\u00038@X\u0081\u0004¢\u0006\f\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0005R\u001a\u0010\u0010\u001a\u00020\u00118Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0005R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00061"}, d2 = {"Landroidx/compose/ui/unit/TextUnit;", "", "packedValue", "", "constructor-impl", "(J)J", "isEm", "", "isEm-impl", "(J)Z", "isSp", "isSp-impl", "rawType", "getRawType$annotations", "()V", "getRawType-impl", "type", "Landroidx/compose/ui/unit/TextUnitType;", "getType-UIouoOA", "value", "", "getValue-impl", "(J)F", "compareTo", "", "other", "compareTo--R2X_6o", "(JJ)I", "div", "", "div-kPz2Gy4", "(JD)J", "(JF)J", "(JI)J", "equals", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "(J)I", "times", "times-kPz2Gy4", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "unaryMinus", "unaryMinus-XSAIIZE", y.f66058y, "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TextUnit {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final TextUnitType[] TextUnitTypes;
    private static final long Unspecified;
    private final long packedValue;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R'\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u000e\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\r\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/unit/TextUnit$Companion;", "", "()V", "TextUnitTypes", "", "Landroidx/compose/ui/unit/TextUnitType;", "getTextUnitTypes$ui_unit_release", "()[Landroidx/compose/ui/unit/TextUnitType;", "[Landroidx/compose/ui/unit/TextUnitType;", "Unspecified", "Landroidx/compose/ui/unit/TextUnit;", "getUnspecified-XSAIIZE$annotations", "getUnspecified-XSAIIZE", "()J", "J", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Stable
        /* JADX INFO: renamed from: getUnspecified-XSAIIZE$annotations, reason: not valid java name */
        public static /* synthetic */ void m4142getUnspecifiedXSAIIZE$annotations() {
        }

        @NotNull
        public final TextUnitType[] getTextUnitTypes$ui_unit_release() {
            return TextUnit.TextUnitTypes;
        }

        /* JADX INFO: renamed from: getUnspecified-XSAIIZE, reason: not valid java name */
        public final long m4143getUnspecifiedXSAIIZE() {
            return TextUnit.Unspecified;
        }

        private Companion() {
        }
    }

    static {
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        TextUnitTypes = new TextUnitType[]{TextUnitType.m4157boximpl(companion.m4166getUnspecifiedUIouoOA()), TextUnitType.m4157boximpl(companion.m4165getSpUIouoOA()), TextUnitType.m4157boximpl(companion.m4164getEmUIouoOA())};
        Unspecified = TextUnitKt.pack(0L, Float.NaN);
    }

    private /* synthetic */ TextUnit(long j10) {
        this.packedValue = j10;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextUnit m4122boximpl(long j10) {
        return new TextUnit(j10);
    }

    /* JADX INFO: renamed from: compareTo--R2X_6o, reason: not valid java name */
    public static final int m4123compareToR2X_6o(long j10, long j11) {
        TextUnitKt.m4146checkArithmeticNB67dxo(j10, j11);
        return Float.compare(m4132getValueimpl(j10), m4132getValueimpl(j11));
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m4124constructorimpl(long j10) {
        return j10;
    }

    /* JADX INFO: renamed from: div-kPz2Gy4, reason: not valid java name */
    public static final long m4126divkPz2Gy4(long j10, float f10) {
        TextUnitKt.m4145checkArithmeticR2X_6o(j10);
        return TextUnitKt.pack(m4130getRawTypeimpl(j10), m4132getValueimpl(j10) / f10);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m4128equalsimpl(long j10, Object obj) {
        return (obj instanceof TextUnit) && j10 == ((TextUnit) obj).getPackedValue();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4129equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    public static /* synthetic */ void getRawType$annotations() {
    }

    /* JADX INFO: renamed from: getRawType-impl, reason: not valid java name */
    public static final long m4130getRawTypeimpl(long j10) {
        return j10 & 1095216660480L;
    }

    /* JADX INFO: renamed from: getType-UIouoOA, reason: not valid java name */
    public static final long m4131getTypeUIouoOA(long j10) {
        return TextUnitTypes[(int) (m4130getRawTypeimpl(j10) >>> 32)].getType();
    }

    /* JADX INFO: renamed from: getValue-impl, reason: not valid java name */
    public static final float m4132getValueimpl(long j10) {
        u uVar = u.f93332a;
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m4133hashCodeimpl(long j10) {
        return b.a(j10);
    }

    /* JADX INFO: renamed from: isEm-impl, reason: not valid java name */
    public static final boolean m4134isEmimpl(long j10) {
        return m4130getRawTypeimpl(j10) == 8589934592L;
    }

    /* JADX INFO: renamed from: isSp-impl, reason: not valid java name */
    public static final boolean m4135isSpimpl(long j10) {
        return m4130getRawTypeimpl(j10) == 4294967296L;
    }

    /* JADX INFO: renamed from: times-kPz2Gy4, reason: not valid java name */
    public static final long m4137timeskPz2Gy4(long j10, float f10) {
        TextUnitKt.m4145checkArithmeticR2X_6o(j10);
        return TextUnitKt.pack(m4130getRawTypeimpl(j10), m4132getValueimpl(j10) * f10);
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m4139toStringimpl(long j10) {
        long jM4131getTypeUIouoOA = m4131getTypeUIouoOA(j10);
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        if (TextUnitType.m4160equalsimpl0(jM4131getTypeUIouoOA, companion.m4166getUnspecifiedUIouoOA())) {
            return "Unspecified";
        }
        if (TextUnitType.m4160equalsimpl0(jM4131getTypeUIouoOA, companion.m4165getSpUIouoOA())) {
            return m4132getValueimpl(j10) + ".sp";
        }
        if (!TextUnitType.m4160equalsimpl0(jM4131getTypeUIouoOA, companion.m4164getEmUIouoOA())) {
            return "Invalid";
        }
        return m4132getValueimpl(j10) + ".em";
    }

    /* JADX INFO: renamed from: unaryMinus-XSAIIZE, reason: not valid java name */
    public static final long m4140unaryMinusXSAIIZE(long j10) {
        TextUnitKt.m4145checkArithmeticR2X_6o(j10);
        return TextUnitKt.pack(m4130getRawTypeimpl(j10), -m4132getValueimpl(j10));
    }

    public boolean equals(Object obj) {
        return m4128equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m4133hashCodeimpl(this.packedValue);
    }

    @NotNull
    public String toString() {
        return m4139toStringimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    /* JADX INFO: renamed from: div-kPz2Gy4, reason: not valid java name */
    public static final long m4125divkPz2Gy4(long j10, double d10) {
        TextUnitKt.m4145checkArithmeticR2X_6o(j10);
        return TextUnitKt.pack(m4130getRawTypeimpl(j10), (float) (((double) m4132getValueimpl(j10)) / d10));
    }

    /* JADX INFO: renamed from: times-kPz2Gy4, reason: not valid java name */
    public static final long m4136timeskPz2Gy4(long j10, double d10) {
        TextUnitKt.m4145checkArithmeticR2X_6o(j10);
        return TextUnitKt.pack(m4130getRawTypeimpl(j10), (float) (((double) m4132getValueimpl(j10)) * d10));
    }

    /* JADX INFO: renamed from: div-kPz2Gy4, reason: not valid java name */
    public static final long m4127divkPz2Gy4(long j10, int i10) {
        TextUnitKt.m4145checkArithmeticR2X_6o(j10);
        return TextUnitKt.pack(m4130getRawTypeimpl(j10), m4132getValueimpl(j10) / i10);
    }

    /* JADX INFO: renamed from: times-kPz2Gy4, reason: not valid java name */
    public static final long m4138timeskPz2Gy4(long j10, int i10) {
        TextUnitKt.m4145checkArithmeticR2X_6o(j10);
        return TextUnitKt.pack(m4130getRawTypeimpl(j10), m4132getValueimpl(j10) * i10);
    }
}
