package uf;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
class j {
    private static final int a(String str) {
        int iU0;
        char c10 = File.separatorChar;
        int iU02 = StringsKt.u0(str, c10, 0, false, 4, null);
        if (iU02 == 0) {
            if (str.length() <= 1 || str.charAt(1) != c10 || (iU0 = StringsKt.u0(str, c10, 2, false, 4, null)) < 0) {
                return 1;
            }
            int iU03 = StringsKt.u0(str, c10, iU0 + 1, false, 4, null);
            return iU03 >= 0 ? iU03 + 1 : str.length();
        }
        if (iU02 > 0 && str.charAt(iU02 - 1) == ':') {
            return iU02 + 1;
        }
        if (iU02 == -1 && StringsKt.l0(str, ':', false, 2, null)) {
            return str.length();
        }
        return 0;
    }

    public static final boolean b(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        String path = file.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        return a(path) > 0;
    }
}
