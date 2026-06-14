package ze;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l {
    public static final boolean a(char c10) {
        return Character.toLowerCase(c10) == c10;
    }

    public static final char[] b(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        char[] cArr = new char[length];
        for (int i10 = 0; i10 < length; i10++) {
            cArr[i10] = str.charAt(i10);
        }
        return cArr;
    }
}
