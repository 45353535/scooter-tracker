package org.bidon.sdk.auction.models;

import com.taurusx.tax.g.e0;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.d;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.stats.models.BidType;
import org.bidon.sdk.utils.json.JsonParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lorg/bidon/sdk/auction/models/AdUnitParser;", "Lorg/bidon/sdk/utils/json/JsonParser;", "Lorg/bidon/sdk/auction/models/AdUnit;", "<init>", "()V", "parseOrNull", "jsonString", "", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AdUnitParser implements JsonParser<AdUnit> {
    @Override // org.bidon.sdk.utils.json.JsonParser
    @Nullable
    public AdUnit parseOrNull(@NotNull String jsonString) {
        Object objB;
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        try {
            Result.Companion companion = Result.f93230c;
            JSONObject jSONObject = new JSONObject(jsonString);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ext");
            String strOptString = jSONObject.optString(e0.f66120c, "");
            Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
            String strOptString2 = jSONObject.optString("demand_id");
            Intrinsics.checkNotNullExpressionValue(strOptString2, "optString(...)");
            double dOptDouble = jSONObject.optDouble("pricefloor", 0.0d);
            String strOptString3 = jSONObject.optString("label");
            Intrinsics.checkNotNullExpressionValue(strOptString3, "optString(...)");
            String strOptString4 = jSONObject.optString("bid_type");
            Intrinsics.checkNotNullExpressionValue(strOptString4, "optString(...)");
            objB = Result.b(new AdUnit(strOptString2, strOptString3, dOptDouble, strOptString, BidType.valueOf(strOptString4), jSONObject.optLong("timeout", 5000L), jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.toString() : null));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(d.a(th2));
        }
        return (AdUnit) (Result.i(objB) ? null : objB);
    }
}
