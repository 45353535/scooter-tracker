package kotlin.text;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Comparator;
import java.util.Locale;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a1;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public class v extends StringsKt__StringNumberConversionsKt {
    public static final String A(String str, Locale locale) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        if (str.length() <= 0) {
            return str;
        }
        char cCharAt = str.charAt(0);
        if (!Character.isLowerCase(cCharAt)) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        char titleCase = Character.toTitleCase(cCharAt);
        if (titleCase != Character.toUpperCase(cCharAt)) {
            sb2.append(titleCase);
        } else {
            String strSubstring = str.substring(0, 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
            String upperCase = strSubstring.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            sb2.append(upperCase);
        }
        String strSubstring2 = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        sb2.append(strSubstring2);
        return sb2.toString();
    }

    public static String B(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return new String(cArr);
    }

    public static String C(char[] cArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(i10, i11, cArr.length);
        return new String(cArr, i10, i11 - i10);
    }

    public static final boolean D(CharSequence charSequence, CharSequence charSequence2) {
        return (!(charSequence instanceof String) || charSequence2 == null) ? StringsKt__StringsKt.i0(charSequence, charSequence2) : ((String) charSequence).contentEquals(charSequence2);
    }

    public static boolean E(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        return z10 ? StringsKt__StringsKt.h0(charSequence, charSequence2) : D(charSequence, charSequence2);
    }

    public static String F(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return new String(bArr, Charsets.UTF_8);
    }

    public static final String G(byte[] bArr, int i10, int i11, boolean z10) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(i10, i11, bArr.length);
        if (!z10) {
            return new String(bArr, i10, i11 - i10, Charsets.UTF_8);
        }
        CharsetDecoder charsetDecoderNewDecoder = Charsets.UTF_8.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        String string = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(ByteBuffer.wrap(bArr, i10, i11 - i10)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String H(byte[] bArr, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = bArr.length;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return G(bArr, i10, i11, z10);
    }

    public static byte[] I(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return bytes;
    }

    public static final byte[] J(String str, int i10, int i11, boolean z10) throws CharacterCodingException {
        Intrinsics.checkNotNullParameter(str, "<this>");
        AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(i10, i11, str.length());
        if (!z10) {
            String strSubstring = str.substring(i10, i11);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            Charset charset = Charsets.UTF_8;
            Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
            byte[] bytes = strSubstring.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            return bytes;
        }
        CharsetEncoder charsetEncoderNewEncoder = Charsets.UTF_8.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        ByteBuffer byteBufferEncode = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).encode(CharBuffer.wrap(str, i10, i11));
        if (byteBufferEncode.hasArray() && byteBufferEncode.arrayOffset() == 0) {
            int iRemaining = byteBufferEncode.remaining();
            byte[] bArrArray = byteBufferEncode.array();
            Intrinsics.checkNotNull(bArrArray);
            if (iRemaining == bArrArray.length) {
                byte[] bArrArray2 = byteBufferEncode.array();
                Intrinsics.checkNotNull(bArrArray2);
                return bArrArray2;
            }
        }
        byte[] bArr = new byte[byteBufferEncode.remaining()];
        byteBufferEncode.get(bArr);
        return bArr;
    }

    public static /* synthetic */ byte[] K(String str, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return J(str, i10, i11, z10);
    }

    public static boolean L(String str, String suffix, boolean z10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return !z10 ? str.endsWith(suffix) : Q(str, str.length() - suffix.length(), suffix, 0, suffix.length(), true);
    }

    public static /* synthetic */ boolean M(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return L(str, str2, z10);
    }

    public static boolean N(String str, String str2, boolean z10) {
        return str == null ? str2 == null : !z10 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static /* synthetic */ boolean O(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return N(str, str2, z10);
    }

    public static Comparator P(a1 a1Var) {
        Intrinsics.checkNotNullParameter(a1Var, "<this>");
        Comparator CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        Intrinsics.checkNotNullExpressionValue(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        return CASE_INSENSITIVE_ORDER;
    }

    public static boolean Q(String str, int i10, String other, int i11, int i12, boolean z10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return !z10 ? str.regionMatches(i10, other, i11, i12) : str.regionMatches(z10, i10, other, i11, i12);
    }

    public static /* synthetic */ boolean R(String str, int i10, String str2, int i11, int i12, boolean z10, int i13, Object obj) {
        if ((i13 & 16) != 0) {
            z10 = false;
        }
        return Q(str, i10, str2, i11, i12, z10);
    }

    public static String S(CharSequence charSequence, int i10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i10 + '.').toString());
        }
        if (i10 == 0) {
            return "";
        }
        int i11 = 1;
        if (i10 == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = charSequence.charAt(0);
            char[] cArr = new char[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                cArr[i12] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb2 = new StringBuilder(charSequence.length() * i10);
        if (1 <= i10) {
            while (true) {
                sb2.append(charSequence);
                if (i11 == i10) {
                    break;
                }
                i11++;
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNull(string);
        return string;
    }

    public static final String T(String str, char c10, char c11, boolean z10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (!z10) {
            String strReplace = str.replace(c10, c11);
            Intrinsics.checkNotNullExpressionValue(strReplace, "replace(...)");
            return strReplace;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (a.g(cCharAt, c10, z10)) {
                cCharAt = c11;
            }
            sb2.append(cCharAt);
        }
        return sb2.toString();
    }

    public static String U(String str, String oldValue, String newValue, boolean z10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        int i10 = 0;
        int iR0 = StringsKt__StringsKt.r0(str, oldValue, 0, z10);
        if (iR0 < 0) {
            return str;
        }
        int length = oldValue.length();
        int iE = kotlin.ranges.g.e(length, 1);
        int length2 = (str.length() - length) + newValue.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb2 = new StringBuilder(length2);
        do {
            sb2.append((CharSequence) str, i10, iR0);
            sb2.append(newValue);
            i10 = iR0 + length;
            if (iR0 >= str.length()) {
                break;
            }
            iR0 = StringsKt__StringsKt.r0(str, oldValue, iR0 + iE, z10);
        } while (iR0 > 0);
        sb2.append((CharSequence) str, i10, str.length());
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String V(String str, char c10, char c11, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return T(str, c10, c11, z10);
    }

    public static /* synthetic */ String W(String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return U(str, str2, str3, z10);
    }

    public static boolean X(String str, String prefix, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return !z10 ? str.startsWith(prefix, i10) : Q(str, i10, prefix, 0, prefix.length(), z10);
    }

    public static boolean Y(String str, String prefix, boolean z10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return !z10 ? str.startsWith(prefix) : Q(str, 0, prefix, 0, prefix.length(), z10);
    }

    public static /* synthetic */ boolean Z(String str, String str2, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return X(str, str2, i10, z10);
    }

    public static /* synthetic */ boolean a0(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return Y(str, str2, z10);
    }

    public static String z(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        return A(str, locale);
    }
}
