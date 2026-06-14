package f1;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class m1 {
    public final String a(String str, t4 eventData, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        if (str == null) {
            return null;
        }
        String str2 = z11 ? "null" : "";
        String strW = str;
        for (Map.Entry entry : eventData.b().entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            String str5 = "%%" + str3 + "%%";
            if (StringsKt.a0(str3, "CB_ERROR", false, 2, null) && (str4 == null || str4.length() == 0)) {
                strW = StringsKt.W(strW, str5, "", false, 4, null);
            } else if (Intrinsics.areEqual(str3, "CB_BASE64_ADM")) {
                strW = StringsKt.W(strW, str5, str4 == null ? str2 : str4, false, 4, null);
            } else {
                String strB = b(str4, z10);
                strW = StringsKt.W(strW, str5, strB == null ? str2 : strB, false, 4, null);
            }
        }
        return new Regex("%%CB_[A-Z0-9_]+%%").replace(strW, str2);
    }

    public final String b(String str, boolean z10) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (z10) {
            try {
                return URLEncoder.encode(str, StandardCharsets.UTF_8.name());
            } catch (UnsupportedEncodingException e10) {
                eg.i("Failed to URL encode macro value: " + str + ". Error: " + e10.getMessage(), e10);
            }
        }
        return str;
    }
}
