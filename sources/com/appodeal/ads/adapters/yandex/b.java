package com.appodeal.ads.adapters.yandex;

import com.appodeal.ads.modules.common.internal.adunit.ImpressionLevelData;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.revenue.RevenueCurrency;
import com.appodeal.ads.revenue.RevenuePrecision;
import com.appodeal.ads.utils.Log;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.common.ImpressionData;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class b {
    public static final ImpressionLevelData a(ImpressionData impressionData) {
        String rawData;
        if (impressionData != null) {
            try {
                rawData = impressionData.getRawData();
            } catch (Exception e10) {
                Log.log(e10);
                return null;
            }
        } else {
            rawData = null;
        }
        if (rawData == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(rawData);
        String strOptString = jSONObject.optString("revenueUSD");
        Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
        Double dT = StringsKt.t(strOptString);
        double dDoubleValue = dT != null ? dT.doubleValue() : 0.0d;
        double d10 = ((double) 1000.0f) * dDoubleValue;
        String stringValue = RevenueCurrency.USD.getStringValue();
        String strOptString2 = jSONObject.optString("precision");
        Intrinsics.checkNotNullExpressionValue(strOptString2, "optString(...)");
        RevenuePrecision revenuePrecision = Intrinsics.areEqual(strOptString2, "publisher_defined") ? RevenuePrecision.PublisherDefined : Intrinsics.areEqual(strOptString2, "estimated") ? RevenuePrecision.Estimated : RevenuePrecision.Undefined;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("network");
        return new ImpressionLevelData(null, Double.valueOf(d10), Double.valueOf(dDoubleValue), stringValue, revenuePrecision, jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("name") : null, null, false, 193, null);
    }

    public static final LoadingError b(AdRequestError adRequestError) {
        Intrinsics.checkNotNullParameter(adRequestError, "<this>");
        int code = adRequestError.getCode();
        return code != 1 ? code != 2 ? code != 3 ? code != 4 ? LoadingError.NoFill : LoadingError.NoFill : LoadingError.ConnectionError : LoadingError.IncorrectAdunit : LoadingError.InternalError;
    }
}
