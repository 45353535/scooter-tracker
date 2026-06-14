package com.inmobi.media;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Oc {
    public static final String a(String str, Mc nativeBeaconModel, Map extraMacros) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(nativeBeaconModel, "nativeBeaconModel");
        Intrinsics.checkNotNullParameter(extraMacros, "extraMacros");
        String strW = StringsKt.W(StringsKt.W(StringsKt.W(str, "$TS", String.valueOf(System.currentTimeMillis()), false, 4, null), "$LTS", String.valueOf(nativeBeaconModel.f37361a.f38314g), false, 4, null), "$STS", String.valueOf(nativeBeaconModel.f37361a.f38311d), false, 4, null);
        SecureRandom secureRandom = new SecureRandom();
        StringBuilder sb2 = new StringBuilder();
        int iNextInt = 0;
        while (iNextInt == 0) {
            iNextInt = (secureRandom.nextInt() & Integer.MAX_VALUE) % 10;
        }
        sb2.append(iNextInt);
        for (int i10 = 1; i10 < 8; i10++) {
            sb2.append((secureRandom.nextInt() & Integer.MAX_VALUE) % 10);
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        String strW2 = StringsKt.W(strW, com.taurusx.tax.n.z.f66396c, string, false, 4, null);
        String str2 = nativeBeaconModel.f37362b;
        if (str2 != null) {
            strW2 = StringsKt.W(strW2, "[UNIVERSALADID]", str2, false, 4, null);
        }
        String strW3 = strW2;
        String str3 = nativeBeaconModel.f37363c;
        if (str3 != null) {
            strW3 = StringsKt.W(strW3, "[ADSERVINGID]", str3, false, 4, null);
        }
        String strW4 = strW3;
        String str4 = nativeBeaconModel.f37364d;
        if (str4 != null) {
            strW4 = StringsKt.W(strW4, com.taurusx.tax.n.z.f66397o, str4, false, 4, null);
        }
        int i11 = nativeBeaconModel.f37365e;
        kotlin.jvm.internal.a1 a1Var = kotlin.jvm.internal.a1.f93282a;
        Locale locale = Locale.US;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long j10 = i11;
        String str5 = String.format(locale, "%02d:%02d:%02d.%03d", Arrays.copyOf(new Object[]{Long.valueOf(timeUnit.toHours(j10)), Long.valueOf(timeUnit.toMinutes(j10) - TimeUnit.HOURS.toMinutes(timeUnit.toHours(j10))), Long.valueOf(timeUnit.toSeconds(j10) - TimeUnit.MINUTES.toSeconds(timeUnit.toMinutes(j10))), Long.valueOf(j10 - (timeUnit.toSeconds(j10) * ((long) 1000)))}, 4));
        Intrinsics.checkNotNullExpressionValue(str5, "format(...)");
        String strW5 = StringsKt.W(strW4, com.taurusx.tax.n.z.f66399y, str5, false, 4, null);
        String strW6 = strW5;
        for (Map.Entry entry : extraMacros.entrySet()) {
            strW6 = StringsKt.W(strW6, (String) entry.getKey(), (String) entry.getValue(), false, 4, null);
        }
        return strW6;
    }
}
