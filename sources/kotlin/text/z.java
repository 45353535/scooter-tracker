package kotlin.text;

import java.util.Collection;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public class z extends y {
    public static String A1(String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i10 >= 0) {
            String strSubstring = str.substring(kotlin.ranges.g.j(i10, str.length()));
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    public static String B1(String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i10 >= 0) {
            return J1(str, kotlin.ranges.g.e(str.length() - i10, 0));
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    public static char C1(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(0);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static Character D1(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(0));
    }

    public static char E1(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(StringsKt__StringsKt.p0(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static Character F1(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(charSequence.length() - 1));
    }

    public static char G1(CharSequence charSequence, kotlin.random.d random) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (charSequence.length() != 0) {
            return charSequence.charAt(random.j(charSequence.length()));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static CharSequence H1(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return new StringBuilder(charSequence).reverse();
    }

    public static char I1(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length();
        if (length == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (length == 1) {
            return charSequence.charAt(0);
        }
        throw new IllegalArgumentException("Char sequence has more than one element.");
    }

    public static String J1(String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i10 >= 0) {
            String strSubstring = str.substring(0, kotlin.ranges.g.j(i10, str.length()));
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    public static String K1(String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i10 >= 0) {
            int length = str.length();
            String strSubstring = str.substring(length - kotlin.ranges.g.j(i10, length));
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    public static Collection L1(CharSequence charSequence, Collection destination) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            destination.add(Character.valueOf(charSequence.charAt(i10)));
        }
        return destination;
    }
}
