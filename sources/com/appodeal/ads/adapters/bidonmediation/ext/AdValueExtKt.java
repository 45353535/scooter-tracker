package com.appodeal.ads.adapters.bidonmediation.ext;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.logs.analytic.AdValue;
import org.bidon.sdk.logs.analytic.Precision;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0002\u001a\u00020\u0003*\u00060\u0001j\u0002`\u0004H\u0000*\n\u0010\u0000\"\u00020\u00012\u00020\u0001¨\u0006\u0005"}, d2 = {"GoogleAdValue", "Lcom/google/android/gms/ads/AdValue;", "asBidonAdValue", "Lorg/bidon/sdk/logs/analytic/AdValue;", "Lcom/appodeal/ads/adapters/bidonmediation/ext/GoogleAdValue;", "admob_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class AdValueExtKt {
    @NotNull
    public static final AdValue asBidonAdValue(@NotNull com.google.android.gms.ads.AdValue adValue) {
        Intrinsics.checkNotNullParameter(adValue, "<this>");
        double valueMicros = adValue.getValueMicros() / 1000000.0d;
        int precisionType = adValue.getPrecisionType();
        Precision precision = precisionType != 0 ? precisionType != 1 ? (precisionType == 2 || precisionType != 3) ? Precision.Estimated : Precision.Precise : Precision.Precise : Precision.Estimated;
        return new AdValue(valueMicros, "USD", precision);
    }
}
