package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.util.MathHelpersKt;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.utils.AtomManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\b\u001a#\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020!ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a\u001d\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0006H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b'\u0010\u0015\u001a%\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0006H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a-\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u0006H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b,\u0010-\u001a-\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020\fH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b2\u00103\u001a \u00104\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u00012\u0006\u00106\u001a\u00020\fH\u0001ø\u0001\u0000¢\u0006\u0002\u00107\u001a+\u00108\u001a\u00020\u0006*\u00020\u00062\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00060:H\u0086\bø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b;\u0010<\u001a\"\u0010=\u001a\u00020\u0006*\u00020\u00072\u0006\u0010>\u001a\u00020\u0006H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b?\u0010@\u001a\"\u0010=\u001a\u00020\u0006*\u00020\f2\u0006\u0010>\u001a\u00020\u0006H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b?\u0010#\u001a\"\u0010=\u001a\u00020\u0006*\u00020\u000f2\u0006\u0010>\u001a\u00020\u0006H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b?\u0010A\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"!\u0010\u0005\u001a\u00020\u0006*\u00020\u00078FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"!\u0010\u0005\u001a\u00020\u0006*\u00020\f8FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\b\u0010\r\u001a\u0004\b\n\u0010\u000e\"!\u0010\u0005\u001a\u00020\u0006*\u00020\u000f8FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\b\u0010\u0010\u001a\u0004\b\n\u0010\u0011\"\"\u0010\u0012\u001a\u00020\u0013*\u00020\u00068Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"!\u0010\u0018\u001a\u00020\u0013*\u00020\u00068FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017\"!\u0010\u001b\u001a\u00020\u0006*\u00020\u00078FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001c\u0010\t\u001a\u0004\b\u001d\u0010\u000b\"!\u0010\u001b\u001a\u00020\u0006*\u00020\f8FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001c\u0010\r\u001a\u0004\b\u001d\u0010\u000e\"!\u0010\u001b\u001a\u00020\u0006*\u00020\u000f8FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001c\u0010\u0010\u001a\u0004\b\u001d\u0010\u0011\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0005\b\u009920\u0001¨\u0006B"}, d2 = {"UNIT_MASK", "", "UNIT_TYPE_EM", "UNIT_TYPE_SP", "UNIT_TYPE_UNSPECIFIED", "em", "Landroidx/compose/ui/unit/TextUnit;", "", "getEm$annotations", "(D)V", "getEm", "(D)J", "", "(F)V", "(F)J", "", "(I)V", "(I)J", "isSpecified", "", "isSpecified--R2X_6o$annotations", "(J)V", "isSpecified--R2X_6o", "(J)Z", "isUnspecified", "isUnspecified--R2X_6o$annotations", "isUnspecified--R2X_6o", "sp", "getSp$annotations", "getSp", "TextUnit", "value", "type", "Landroidx/compose/ui/unit/TextUnitType;", "TextUnit-anM5pPY", "(FJ)J", "checkArithmetic", "", "a", "checkArithmetic--R2X_6o", "b", "checkArithmetic-NB67dxo", "(JJ)V", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "checkArithmetic-vU-0ePk", "(JJJ)V", "lerp", "start", AtomManager.ATOM_STOP_METHOD_NAME, "fraction", "lerp-C3pnCVY", "(JJF)J", "pack", "unitType", "v", "(JF)J", "takeOrElse", "block", "Lkotlin/Function0;", "takeOrElse-eAf_CNQ", "(JLkotlin/jvm/functions/Function0;)J", "times", "other", "times-mpE4wyQ", "(DJ)J", "(IJ)J", "ui-unit_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TextUnitKt {
    private static final long UNIT_MASK = 1095216660480L;
    private static final long UNIT_TYPE_EM = 8589934592L;
    private static final long UNIT_TYPE_SP = 4294967296L;
    private static final long UNIT_TYPE_UNSPECIFIED = 0;

    /* JADX INFO: renamed from: TextUnit-anM5pPY, reason: not valid java name */
    public static final long m4144TextUnitanM5pPY(float f10, long j10) {
        return pack(j10, f10);
    }

    /* JADX INFO: renamed from: checkArithmetic--R2X_6o, reason: not valid java name */
    public static final void m4145checkArithmeticR2X_6o(long j10) {
        if (m4150isUnspecifiedR2X_6o(j10)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
    }

    /* JADX INFO: renamed from: checkArithmetic-NB67dxo, reason: not valid java name */
    public static final void m4146checkArithmeticNB67dxo(long j10, long j11) {
        if (m4150isUnspecifiedR2X_6o(j10) || m4150isUnspecifiedR2X_6o(j11)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
        if (TextUnitType.m4160equalsimpl0(TextUnit.m4131getTypeUIouoOA(j10), TextUnit.m4131getTypeUIouoOA(j11))) {
            return;
        }
        throw new IllegalArgumentException(("Cannot perform operation for " + ((Object) TextUnitType.m4162toStringimpl(TextUnit.m4131getTypeUIouoOA(j10))) + " and " + ((Object) TextUnitType.m4162toStringimpl(TextUnit.m4131getTypeUIouoOA(j11)))).toString());
    }

    /* JADX INFO: renamed from: checkArithmetic-vU-0ePk, reason: not valid java name */
    public static final void m4147checkArithmeticvU0ePk(long j10, long j11, long j12) {
        if (m4150isUnspecifiedR2X_6o(j10) || m4150isUnspecifiedR2X_6o(j11) || m4150isUnspecifiedR2X_6o(j12)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
        if (TextUnitType.m4160equalsimpl0(TextUnit.m4131getTypeUIouoOA(j10), TextUnit.m4131getTypeUIouoOA(j11)) && TextUnitType.m4160equalsimpl0(TextUnit.m4131getTypeUIouoOA(j11), TextUnit.m4131getTypeUIouoOA(j12))) {
            return;
        }
        throw new IllegalArgumentException(("Cannot perform operation for " + ((Object) TextUnitType.m4162toStringimpl(TextUnit.m4131getTypeUIouoOA(j10))) + " and " + ((Object) TextUnitType.m4162toStringimpl(TextUnit.m4131getTypeUIouoOA(j11)))).toString());
    }

    public static final long getEm(float f10) {
        return pack(UNIT_TYPE_EM, f10);
    }

    @Stable
    public static /* synthetic */ void getEm$annotations(double d10) {
    }

    public static final long getSp(float f10) {
        return pack(UNIT_TYPE_SP, f10);
    }

    @Stable
    public static /* synthetic */ void getSp$annotations(double d10) {
    }

    /* JADX INFO: renamed from: isSpecified--R2X_6o, reason: not valid java name */
    public static final boolean m4148isSpecifiedR2X_6o(long j10) {
        return !m4150isUnspecifiedR2X_6o(j10);
    }

    @Stable
    /* JADX INFO: renamed from: isSpecified--R2X_6o$annotations, reason: not valid java name */
    public static /* synthetic */ void m4149isSpecifiedR2X_6o$annotations(long j10) {
    }

    /* JADX INFO: renamed from: isUnspecified--R2X_6o, reason: not valid java name */
    public static final boolean m4150isUnspecifiedR2X_6o(long j10) {
        return TextUnit.m4130getRawTypeimpl(j10) == 0;
    }

    @Stable
    /* JADX INFO: renamed from: isUnspecified--R2X_6o$annotations, reason: not valid java name */
    public static /* synthetic */ void m4151isUnspecifiedR2X_6o$annotations(long j10) {
    }

    @Stable
    /* JADX INFO: renamed from: lerp-C3pnCVY, reason: not valid java name */
    public static final long m4152lerpC3pnCVY(long j10, long j11, float f10) {
        m4146checkArithmeticNB67dxo(j10, j11);
        return pack(TextUnit.m4130getRawTypeimpl(j10), MathHelpersKt.lerp(TextUnit.m4132getValueimpl(j10), TextUnit.m4132getValueimpl(j11), f10));
    }

    public static final long pack(long j10, float f10) {
        return TextUnit.m4124constructorimpl(j10 | (((long) Float.floatToIntBits(f10)) & 4294967295L));
    }

    /* JADX INFO: renamed from: takeOrElse-eAf_CNQ, reason: not valid java name */
    public static final long m4153takeOrElseeAf_CNQ(long j10, @NotNull Function0<TextUnit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return !m4150isUnspecifiedR2X_6o(j10) ? j10 : block.invoke().getPackedValue();
    }

    @Stable
    /* JADX INFO: renamed from: times-mpE4wyQ, reason: not valid java name */
    public static final long m4155timesmpE4wyQ(float f10, long j10) {
        m4145checkArithmeticR2X_6o(j10);
        return pack(TextUnit.m4130getRawTypeimpl(j10), f10 * TextUnit.m4132getValueimpl(j10));
    }

    public static final long getEm(double d10) {
        return pack(UNIT_TYPE_EM, (float) d10);
    }

    @Stable
    public static /* synthetic */ void getEm$annotations(float f10) {
    }

    public static final long getSp(double d10) {
        return pack(UNIT_TYPE_SP, (float) d10);
    }

    @Stable
    public static /* synthetic */ void getSp$annotations(float f10) {
    }

    public static final long getEm(int i10) {
        return pack(UNIT_TYPE_EM, i10);
    }

    @Stable
    public static /* synthetic */ void getEm$annotations(int i10) {
    }

    public static final long getSp(int i10) {
        return pack(UNIT_TYPE_SP, i10);
    }

    @Stable
    public static /* synthetic */ void getSp$annotations(int i10) {
    }

    @Stable
    /* JADX INFO: renamed from: times-mpE4wyQ, reason: not valid java name */
    public static final long m4154timesmpE4wyQ(double d10, long j10) {
        m4145checkArithmeticR2X_6o(j10);
        return pack(TextUnit.m4130getRawTypeimpl(j10), ((float) d10) * TextUnit.m4132getValueimpl(j10));
    }

    @Stable
    /* JADX INFO: renamed from: times-mpE4wyQ, reason: not valid java name */
    public static final long m4156timesmpE4wyQ(int i10, long j10) {
        m4145checkArithmeticR2X_6o(j10);
        return pack(TextUnit.m4130getRawTypeimpl(j10), i10 * TextUnit.m4132getValueimpl(j10));
    }
}
