package f1;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class p7 {
    public final String a(File htmlFile, String params, String adm) {
        Intrinsics.checkNotNullParameter(htmlFile, "htmlFile");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(adm, "adm");
        try {
            return StringsKt.W(StringsKt.W(uf.i.l(htmlFile, Charsets.UTF_8), "\"{% params %}\"", params, false, 4, null), "{% adm %}", adm, false, 4, null);
        } catch (Exception e10) {
            eg.i("Parse sdk bidding template exception", e10);
            return null;
        }
    }
}
