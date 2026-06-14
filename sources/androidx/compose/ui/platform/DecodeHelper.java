package androidx.compose.ui.platform;

import android.os.Parcel;
import android.util.Base64;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001c\u001a\u00020\u0019H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\bJ\u0011\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0016H\u0002¢\u0006\u0004\b!\u0010\u0018J\r\u0010#\u001a\u00020\"¢\u0006\u0004\b#\u0010$J\u0016\u0010'\u001a\u00020%ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b&\u0010\u001bJ\u0016\u0010*\u001a\u00020(ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b)\u0010\u001bJ\r\u0010,\u001a\u00020+¢\u0006\u0004\b,\u0010-J\u0016\u00100\u001a\u00020.ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b/\u0010\u0018J\u0016\u00103\u001a\u000201ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b2\u0010\u0018R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00067"}, d2 = {"Landroidx/compose/ui/platform/DecodeHelper;", "", "", TypedValues.Custom.S_STRING, "<init>", "(Ljava/lang/String;)V", "Landroidx/compose/ui/text/style/BaselineShift;", "decodeBaselineShift-y9eOQZs", "()F", "decodeBaselineShift", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "decodeTextGeometricTransform", "()Landroidx/compose/ui/text/style/TextGeometricTransform;", "Landroidx/compose/ui/text/style/TextDecoration;", "decodeTextDecoration", "()Landroidx/compose/ui/text/style/TextDecoration;", "Landroidx/compose/ui/graphics/Shadow;", "decodeShadow", "()Landroidx/compose/ui/graphics/Shadow;", "", "decodeByte", "()B", "", "decodeInt", "()I", "Llf/v;", "decodeULong-s-VKNKU", "()J", "decodeULong", "", "decodeFloat", "decodeString", "()Ljava/lang/String;", "dataAvailable", "Landroidx/compose/ui/text/SpanStyle;", "decodeSpanStyle", "()Landroidx/compose/ui/text/SpanStyle;", "Landroidx/compose/ui/graphics/Color;", "decodeColor-0d7_KjU", "decodeColor", "Landroidx/compose/ui/unit/TextUnit;", "decodeTextUnit-XSAIIZE", "decodeTextUnit", "Landroidx/compose/ui/text/font/FontWeight;", "decodeFontWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "decodeFontStyle-_-LCdwA", "decodeFontStyle", "Landroidx/compose/ui/text/font/FontSynthesis;", "decodeFontSynthesis-GVVA2EU", "decodeFontSynthesis", "Landroid/os/Parcel;", "parcel", "Landroid/os/Parcel;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DecodeHelper {

    @NotNull
    private final Parcel parcel;

    public DecodeHelper(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        Parcel parcelObtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain()");
        this.parcel = parcelObtain;
        byte[] bArrDecode = Base64.decode(string, 0);
        parcelObtain.unmarshall(bArrDecode, 0, bArrDecode.length);
        parcelObtain.setDataPosition(0);
    }

    private final int dataAvailable() {
        return this.parcel.dataAvail();
    }

    /* JADX INFO: renamed from: decodeBaselineShift-y9eOQZs, reason: not valid java name */
    private final float m3282decodeBaselineShifty9eOQZs() {
        return BaselineShift.m3747constructorimpl(decodeFloat());
    }

    private final byte decodeByte() {
        return this.parcel.readByte();
    }

    private final float decodeFloat() {
        return this.parcel.readFloat();
    }

    private final int decodeInt() {
        return this.parcel.readInt();
    }

    private final Shadow decodeShadow() {
        return new Shadow(m3284decodeColor0d7_KjU(), OffsetKt.Offset(decodeFloat(), decodeFloat()), decodeFloat(), null);
    }

    private final String decodeString() {
        return this.parcel.readString();
    }

    private final TextDecoration decodeTextDecoration() {
        int iDecodeInt = decodeInt();
        TextDecoration.Companion companion = TextDecoration.INSTANCE;
        boolean z10 = (companion.getLineThrough().getMask() & iDecodeInt) != 0;
        boolean z11 = (iDecodeInt & companion.getUnderline().getMask()) != 0;
        return (z10 && z11) ? companion.combine(CollectionsKt.listOf((Object[]) new TextDecoration[]{companion.getLineThrough(), companion.getUnderline()})) : z10 ? companion.getLineThrough() : z11 ? companion.getUnderline() : companion.getNone();
    }

    private final TextGeometricTransform decodeTextGeometricTransform() {
        return new TextGeometricTransform(decodeFloat(), decodeFloat());
    }

    /* JADX INFO: renamed from: decodeULong-s-VKNKU, reason: not valid java name */
    private final long m3283decodeULongsVKNKU() {
        return lf.v.c(this.parcel.readLong());
    }

    /* JADX INFO: renamed from: decodeColor-0d7_KjU, reason: not valid java name */
    public final long m3284decodeColor0d7_KjU() {
        return Color.m1600constructorimpl(m3283decodeULongsVKNKU());
    }

    /* JADX INFO: renamed from: decodeFontStyle-_-LCdwA, reason: not valid java name */
    public final int m3285decodeFontStyle_LCdwA() {
        byte bDecodeByte = decodeByte();
        return bDecodeByte == 0 ? FontStyle.INSTANCE.m3593getNormal_LCdwA() : bDecodeByte == 1 ? FontStyle.INSTANCE.m3592getItalic_LCdwA() : FontStyle.INSTANCE.m3593getNormal_LCdwA();
    }

    /* JADX INFO: renamed from: decodeFontSynthesis-GVVA2EU, reason: not valid java name */
    public final int m3286decodeFontSynthesisGVVA2EU() {
        byte bDecodeByte = decodeByte();
        return bDecodeByte == 0 ? FontSynthesis.INSTANCE.m3604getNoneGVVA2EU() : bDecodeByte == 1 ? FontSynthesis.INSTANCE.m3603getAllGVVA2EU() : bDecodeByte == 3 ? FontSynthesis.INSTANCE.m3605getStyleGVVA2EU() : bDecodeByte == 2 ? FontSynthesis.INSTANCE.m3606getWeightGVVA2EU() : FontSynthesis.INSTANCE.m3604getNoneGVVA2EU();
    }

    @NotNull
    public final FontWeight decodeFontWeight() {
        return new FontWeight(decodeInt());
    }

    @NotNull
    public final SpanStyle decodeSpanStyle() {
        MutableSpanStyle mutableSpanStyle = new MutableSpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 16383, null);
        while (this.parcel.dataAvail() > 1) {
            byte bDecodeByte = decodeByte();
            if (bDecodeByte != 1) {
                if (bDecodeByte != 2) {
                    if (bDecodeByte != 3) {
                        if (bDecodeByte != 4) {
                            if (bDecodeByte != 5) {
                                if (bDecodeByte != 6) {
                                    if (bDecodeByte != 7) {
                                        if (bDecodeByte != 8) {
                                            if (bDecodeByte != 9) {
                                                if (bDecodeByte != 10) {
                                                    if (bDecodeByte != 11) {
                                                        if (bDecodeByte == 12) {
                                                            if (dataAvailable() < 20) {
                                                                break;
                                                            }
                                                            mutableSpanStyle.setShadow(decodeShadow());
                                                        } else {
                                                            continue;
                                                        }
                                                    } else {
                                                        if (dataAvailable() < 4) {
                                                            break;
                                                        }
                                                        mutableSpanStyle.setTextDecoration(decodeTextDecoration());
                                                    }
                                                } else {
                                                    if (dataAvailable() < 8) {
                                                        break;
                                                    }
                                                    mutableSpanStyle.m3312setBackground8_81llA(m3284decodeColor0d7_KjU());
                                                }
                                            } else {
                                                if (dataAvailable() < 8) {
                                                    break;
                                                }
                                                mutableSpanStyle.setTextGeometricTransform(decodeTextGeometricTransform());
                                            }
                                        } else {
                                            if (dataAvailable() < 4) {
                                                break;
                                            }
                                            mutableSpanStyle.m3313setBaselineShift_isdbwI(BaselineShift.m3746boximpl(m3282decodeBaselineShifty9eOQZs()));
                                        }
                                    } else {
                                        if (dataAvailable() < 5) {
                                            break;
                                        }
                                        mutableSpanStyle.m3318setLetterSpacingR2X_6o(m3287decodeTextUnitXSAIIZE());
                                    }
                                } else {
                                    mutableSpanStyle.setFontFeatureSettings(decodeString());
                                }
                            } else {
                                if (dataAvailable() < 1) {
                                    break;
                                }
                                mutableSpanStyle.m3317setFontSynthesistDdu0R4(FontSynthesis.m3594boximpl(m3286decodeFontSynthesisGVVA2EU()));
                            }
                        } else {
                            if (dataAvailable() < 1) {
                                break;
                            }
                            mutableSpanStyle.m3316setFontStylemLjRB2g(FontStyle.m3585boximpl(m3285decodeFontStyle_LCdwA()));
                        }
                    } else {
                        if (dataAvailable() < 4) {
                            break;
                        }
                        mutableSpanStyle.setFontWeight(decodeFontWeight());
                    }
                } else {
                    if (dataAvailable() < 5) {
                        break;
                    }
                    mutableSpanStyle.m3315setFontSizeR2X_6o(m3287decodeTextUnitXSAIIZE());
                }
            } else {
                if (dataAvailable() < 8) {
                    break;
                }
                mutableSpanStyle.m3314setColor8_81llA(m3284decodeColor0d7_KjU());
            }
        }
        return mutableSpanStyle.toSpanStyle();
    }

    /* JADX INFO: renamed from: decodeTextUnit-XSAIIZE, reason: not valid java name */
    public final long m3287decodeTextUnitXSAIIZE() {
        byte bDecodeByte = decodeByte();
        long jM4165getSpUIouoOA = bDecodeByte == 1 ? TextUnitType.INSTANCE.m4165getSpUIouoOA() : bDecodeByte == 2 ? TextUnitType.INSTANCE.m4164getEmUIouoOA() : TextUnitType.INSTANCE.m4166getUnspecifiedUIouoOA();
        return TextUnitType.m4160equalsimpl0(jM4165getSpUIouoOA, TextUnitType.INSTANCE.m4166getUnspecifiedUIouoOA()) ? TextUnit.INSTANCE.m4143getUnspecifiedXSAIIZE() : TextUnitKt.m4144TextUnitanM5pPY(decodeFloat(), jM4165getSpUIouoOA);
    }
}
