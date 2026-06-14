package ze;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c0 {
    public static final k a(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new k(str);
    }

    private static final char b(char c10) {
        return ('A' > c10 || c10 >= '[') ? (c10 < 0 || c10 >= 128) ? Character.toLowerCase(c10) : c10 : (char) (c10 + ' ');
    }

    public static final String c(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            char cCharAt = str.charAt(i10);
            if (b(cCharAt) != cCharAt) {
                break;
            }
            i10++;
        }
        if (i10 == -1) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        sb2.append((CharSequence) str, 0, i10);
        int iP0 = StringsKt.p0(str);
        if (i10 <= iP0) {
            while (true) {
                sb2.append(b(str.charAt(i10)));
                if (i10 == iP0) {
                    break;
                }
                i10++;
            }
        }
        return sb2.toString();
    }
}
