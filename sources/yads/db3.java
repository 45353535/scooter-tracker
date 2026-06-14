package yads;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class db3 {
    public static cb3 a(String str) {
        Integer intOrNull;
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 < length) {
                if (str.charAt(i10) == '-') {
                    str = str.substring(0, i10);
                    Intrinsics.checkNotNullExpressionValue(str, "substring(...)");
                    break;
                }
                i10++;
            } else {
                break;
            }
        }
        List listX0 = StringsKt.X0(str, new char[]{'.'}, false, 0, 6, null);
        String str2 = (String) CollectionsKt.getOrNull(listX0, 0);
        if (str2 == null || (intOrNull = StringsKt.toIntOrNull(str2)) == null) {
            return null;
        }
        int iIntValue = intOrNull.intValue();
        Integer intOrNull2 = StringsKt.toIntOrNull((String) (1 <= CollectionsKt.getLastIndex(listX0) ? listX0.get(1) : "0"));
        if (intOrNull2 == null) {
            return null;
        }
        int iIntValue2 = intOrNull2.intValue();
        Integer intOrNull3 = StringsKt.toIntOrNull((String) (2 <= CollectionsKt.getLastIndex(listX0) ? listX0.get(2) : "0"));
        if (intOrNull3 != null) {
            return new cb3(iIntValue, iIntValue2, intOrNull3.intValue());
        }
        return null;
    }
}
