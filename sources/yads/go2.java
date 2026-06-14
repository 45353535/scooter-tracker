package yads;

import java.io.IOException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class go2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DecimalFormat f111294a;

    public go2() {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setGroupingSeparator(' ');
        this.f111294a = new DecimalFormat("#,###,###", decimalFormatSymbols);
    }

    public final String a(String str) throws mz1, IOException {
        try {
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < str.length(); i10++) {
                char cCharAt = str.charAt(i10);
                if (!CharsKt.b(cCharAt)) {
                    sb2.append(cCharAt);
                }
            }
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return this.f111294a.format(Long.parseLong(string));
        } catch (NumberFormatException unused) {
            kotlin.jvm.internal.a1 a1Var = kotlin.jvm.internal.a1.f93282a;
            Intrinsics.checkNotNullExpressionValue(String.format("Could not parse review count value. Review Count value is %s", Arrays.copyOf(new Object[]{str}, 1)), "format(...)");
            boolean z10 = lb1.f113032a;
            throw new mz1("Native Ad json has not required attributes");
        }
    }
}
