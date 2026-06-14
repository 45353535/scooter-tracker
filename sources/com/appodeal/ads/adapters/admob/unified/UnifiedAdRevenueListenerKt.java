package com.appodeal.ads.adapters.admob.unified;

import com.appodeal.ads.ext.LogExtKt;
import com.appodeal.ads.modules.common.internal.adunit.ImpressionLevelData;
import com.appodeal.ads.revenue.RevenuePrecision;
import com.appodeal.ads.utils.Log;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.AdapterResponseInfo;
import com.google.android.gms.ads.ResponseInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u001a\u0018\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0002\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0007H\u0002¨\u0006\b"}, d2 = {"toImpressionLevelData", "Lcom/appodeal/ads/modules/common/internal/adunit/ImpressionLevelData;", "Lcom/google/android/gms/ads/AdValue;", "responseInfo", "Lcom/google/android/gms/ads/ResponseInfo;", "toAppodealPrecision", "Lcom/appodeal/ads/revenue/RevenuePrecision;", "", "admob_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class UnifiedAdRevenueListenerKt {
    private static final RevenuePrecision toAppodealPrecision(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? RevenuePrecision.Undefined : RevenuePrecision.Exact : RevenuePrecision.PublisherDefined : RevenuePrecision.Estimated;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImpressionLevelData toImpressionLevelData(AdValue adValue, ResponseInfo responseInfo) {
        AdapterResponseInfo loadedAdapterResponseInfo;
        try {
            double valueMicros = adValue.getValueMicros() / 1000000.0d;
            double d10 = ((double) 1000.0f) * valueMicros;
            String currencyCode = adValue.getCurrencyCode();
            Intrinsics.checkNotNullExpressionValue(currencyCode, "getCurrencyCode(...)");
            ImpressionLevelData impressionLevelData = new ImpressionLevelData(null, Double.valueOf(d10), Double.valueOf(valueMicros), currencyCode, toAppodealPrecision(adValue.getPrecisionType()), (responseInfo == null || (loadedAdapterResponseInfo = responseInfo.getLoadedAdapterResponseInfo()) == null) ? null : loadedAdapterResponseInfo.getAdSourceName(), null, true, 65, null);
            LogExtKt.logInternal$default("CustomEventLoader", "OnPaidEventListener: " + impressionLevelData, null, 4, null);
            return impressionLevelData;
        } catch (Exception e10) {
            Log.log(e10);
            return null;
        }
    }
}
