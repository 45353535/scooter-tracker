package com.appsflyer.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class AFi1zSDK {

    @Nullable
    public final AFi1xSDK AFAdRevenueData;

    @Nullable
    public final AFh1aSDK getCurrencyIso4217Code;

    @Nullable
    public AFi1ySDK getMediationNetwork;

    public AFi1zSDK(@NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        this.getMediationNetwork = getCurrencyIso4217Code(jSONObject);
        this.getCurrencyIso4217Code = getRevenue(jSONObject);
        this.AFAdRevenueData = getMediationNetwork(jSONObject);
    }

    private static JSONObject AFAdRevenueData(JSONObject jSONObject, String str) throws JSONException, NullPointerException {
        JSONObject jSONObjectOptJSONObject;
        if (!jSONObject.has(str) || (jSONObjectOptJSONObject = jSONObject.getJSONArray(str).optJSONObject(0).optJSONObject("data")) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optJSONObject("v1");
    }

    private static AFi1ySDK getCurrencyIso4217Code(JSONObject jSONObject) {
        Object objB;
        AFi1ySDK aFi1ySDK;
        List listEmptyList;
        try {
            Result.Companion companion = Result.f93230c;
            JSONObject jSONObjectAFAdRevenueData = AFAdRevenueData(jSONObject, "r_debugger");
            if (jSONObjectAFAdRevenueData != null) {
                long j10 = jSONObjectAFAdRevenueData.getLong("ttl");
                int i10 = jSONObjectAFAdRevenueData.getInt("counter");
                String strOptString = jSONObjectAFAdRevenueData.optString("app_ver", "");
                String strOptString2 = jSONObjectAFAdRevenueData.optString("sdk_ver", "");
                float fOptDouble = (float) jSONObjectAFAdRevenueData.optDouble("ratio", 1.0d);
                JSONArray jSONArrayOptJSONArray = jSONObjectAFAdRevenueData.optJSONArray("tags");
                if (jSONArrayOptJSONArray != null) {
                    Intrinsics.checkNotNullExpressionValue(jSONArrayOptJSONArray, "");
                    listEmptyList = new ArrayList();
                    int length = jSONArrayOptJSONArray.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        String string = jSONArrayOptJSONArray.getString(i11);
                        Intrinsics.checkNotNullExpressionValue(string, "");
                        listEmptyList.add(string);
                    }
                } else {
                    listEmptyList = CollectionsKt.emptyList();
                }
                List list = listEmptyList;
                Intrinsics.checkNotNullExpressionValue(strOptString, "");
                Intrinsics.checkNotNullExpressionValue(strOptString2, "");
                aFi1ySDK = new AFi1ySDK(j10, fOptDouble, list, i10, strOptString, strOptString2);
            } else {
                aFi1ySDK = null;
            }
            objB = Result.b(aFi1ySDK);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        return (AFi1ySDK) (Result.i(objB) ? null : objB);
    }

    private static AFi1xSDK getMediationNetwork(JSONObject jSONObject) {
        Object objB;
        try {
            Result.Companion companion = Result.f93230c;
            JSONObject jSONObjectAFAdRevenueData = AFAdRevenueData(jSONObject, "meta_data");
            objB = Result.b(jSONObjectAFAdRevenueData != null ? new AFi1xSDK(jSONObjectAFAdRevenueData.optDouble("send_rate", 1.0d)) : null);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        return (AFi1xSDK) (Result.i(objB) ? null : objB);
    }

    private static AFh1aSDK getRevenue(JSONObject jSONObject) {
        Object objB;
        try {
            Result.Companion companion = Result.f93230c;
            JSONObject jSONObjectAFAdRevenueData = AFAdRevenueData(jSONObject, "exc_mngr");
            objB = Result.b(jSONObjectAFAdRevenueData != null ? new AFh1aSDK(jSONObjectAFAdRevenueData.getString("sdk_ver"), jSONObjectAFAdRevenueData.optInt("min", -1), jSONObjectAFAdRevenueData.optInt("expire", -1), jSONObjectAFAdRevenueData.optLong("ttl", -1L)) : null);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        return (AFh1aSDK) (Result.i(objB) ? null : objB);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(AFi1zSDK.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "");
        AFi1zSDK aFi1zSDK = (AFi1zSDK) obj;
        return Intrinsics.areEqual(this.getCurrencyIso4217Code, aFi1zSDK.getCurrencyIso4217Code) && Intrinsics.areEqual(this.AFAdRevenueData, aFi1zSDK.AFAdRevenueData) && Intrinsics.areEqual(this.getMediationNetwork, aFi1zSDK.getMediationNetwork);
    }

    public final int hashCode() {
        AFh1aSDK aFh1aSDK = this.getCurrencyIso4217Code;
        int iHashCode = (aFh1aSDK != null ? aFh1aSDK.hashCode() : 0) * 31;
        AFi1xSDK aFi1xSDK = this.AFAdRevenueData;
        int iHashCode2 = (iHashCode + (aFi1xSDK != null ? aFi1xSDK.hashCode() : 0)) * 31;
        AFi1ySDK aFi1ySDK = this.getMediationNetwork;
        return iHashCode2 + (aFi1ySDK != null ? aFi1ySDK.hashCode() : 0);
    }
}
