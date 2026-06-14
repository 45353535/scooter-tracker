package kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize;

import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class CapitalizeDecapitalizeKt {
    @NotNull
    public static final String capitalizeAsciiOnly(@NotNull String str) {
        char cCharAt;
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() == 0 || 'a' > (cCharAt = str.charAt(0)) || cCharAt >= '{') {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        sb2.append(Character.toUpperCase(cCharAt));
        sb2.append((CharSequence) str, 1, str.length());
        return sb2.toString();
    }

    @NotNull
    public static final String decapitalizeAsciiOnly(@NotNull String str) {
        char cCharAt;
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() == 0 || 'A' > (cCharAt = str.charAt(0)) || cCharAt >= '[') {
            return str;
        }
        char lowerCase = Character.toLowerCase(cCharAt);
        String strSubstring = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return lowerCase + strSubstring;
    }

    @NotNull
    public static final String decapitalizeSmartForCompiler(@NotNull String str, boolean z10) {
        Object next;
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() == 0 || !isUpperCaseCharAt(str, 0, z10)) {
            return str;
        }
        if (str.length() == 1 || !isUpperCaseCharAt(str, 1, z10)) {
            if (z10) {
                return decapitalizeAsciiOnly(str);
            }
            if (str.length() <= 0) {
                return str;
            }
            char lowerCase = Character.toLowerCase(str.charAt(0));
            String strSubstring = str.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return lowerCase + strSubstring;
        }
        Iterator it = StringsKt.o0(str).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!isUpperCaseCharAt(str, ((Number) next).intValue(), z10)) {
                break;
            }
        }
        Integer num = (Integer) next;
        if (num == null) {
            return toLowerCase(str, z10);
        }
        int iIntValue = num.intValue() - 1;
        StringBuilder sb2 = new StringBuilder();
        String strSubstring2 = str.substring(0, iIntValue);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        sb2.append(toLowerCase(strSubstring2, z10));
        String strSubstring3 = str.substring(iIntValue);
        Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
        sb2.append(strSubstring3);
        return sb2.toString();
    }

    private static final boolean isUpperCaseCharAt(String str, int i10, boolean z10) {
        char cCharAt = str.charAt(i10);
        return z10 ? 'A' <= cCharAt && cCharAt < '[' : Character.isUpperCase(cCharAt);
    }

    private static final String toLowerCase(String str, boolean z10) {
        if (z10) {
            return toLowerCaseAsciiOnly(str);
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @NotNull
    public static final String toLowerCaseAsciiOnly(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        StringBuilder sb2 = new StringBuilder(str.length());
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if ('A' <= cCharAt && cCharAt < '[') {
                cCharAt = Character.toLowerCase(cCharAt);
            }
            sb2.append(cCharAt);
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
