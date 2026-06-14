package kotlin.text;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\t\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\b\u001a\u001b\u0010\n\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\b\u001a\u001f\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"", "", "b", "(C)Z", "Ljava/util/Locale;", CommonUrlParts.LOCALE, "", EidRequestBuilder.REQUEST_FIELD_EMAIL, "(CLjava/util/Locale;)Ljava/lang/String;", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "d", "char", "", "radix", "a", "(CI)I", "checkRadix", "(I)I", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/text/CharsKt")
public class CharsKt__CharJVMKt {
    public static final int a(char c10, int i10) {
        return Character.digit((int) c10, i10);
    }

    public static boolean b(char c10) {
        return Character.isWhitespace(c10) || Character.isSpaceChar(c10);
    }

    public static String c(char c10, Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        String strValueOf = String.valueOf(c10);
        Intrinsics.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strValueOf.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public static int checkRadix(int i10) {
        if (2 <= i10 && i10 < 37) {
            return i10;
        }
        throw new IllegalArgumentException("radix " + i10 + " was not in valid range " + new IntRange(2, 36));
    }

    public static String d(char c10, Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        String strE = e(c10, locale);
        if (strE.length() <= 1) {
            String strValueOf = String.valueOf(c10);
            Intrinsics.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = strValueOf.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            if (Intrinsics.areEqual(strE, upperCase)) {
                return String.valueOf(Character.toTitleCase(c10));
            }
        } else if (c10 != 329) {
            char cCharAt = strE.charAt(0);
            Intrinsics.checkNotNull(strE, "null cannot be cast to non-null type java.lang.String");
            String strSubstring = strE.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = strSubstring.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            return cCharAt + lowerCase;
        }
        return strE;
    }

    public static final String e(char c10, Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        String strValueOf = String.valueOf(c10);
        Intrinsics.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = strValueOf.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }
}
