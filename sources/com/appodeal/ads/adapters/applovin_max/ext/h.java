package com.appodeal.ads.adapters.applovin_max.ext;

import android.os.Bundle;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinSdk;
import com.appodeal.ads.ext.JsonArrayBuilder;
import com.appodeal.ads.ext.JsonObjectBuilder;
import com.appodeal.ads.ext.JsonObjectBuilderKt;
import com.appodeal.ads.ext.LogExtKt;
import com.appodeal.ads.networking.LoadingError;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class h {
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.appodeal.ads.modules.common.internal.adunit.ImpressionLevelData a(final com.applovin.mediation.MaxAd r12, final java.lang.String r13) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "countryCode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            com.appodeal.ads.modules.common.internal.adunit.ImpressionLevelData r1 = new com.appodeal.ads.modules.common.internal.adunit.ImpressionLevelData
            double r2 = r12.getRevenue()
            r0 = 1000(0x3e8, float:1.401E-42)
            double r4 = (double) r0
            double r2 = r2 * r4
            java.lang.Double r3 = java.lang.Double.valueOf(r2)
            double r4 = r12.getRevenue()
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            java.lang.String r0 = r12.getRevenuePrecision()
            java.lang.String r2 = "getRevenuePrecision(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            int r2 = r0.hashCode()
            r5 = -623607748(0xffffffffdad4803c, float:-2.9906845E16)
            if (r2 == r5) goto L55
            r5 = 96946943(0x5c74aff, float:1.8741419E-35)
            if (r2 == r5) goto L49
            r5 = 655944390(0x2718eac6, float:2.1221508E-15)
            if (r2 == r5) goto L3d
            goto L5d
        L3d:
            java.lang.String r2 = "publisher_defined"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L5d
            com.appodeal.ads.revenue.RevenuePrecision r0 = com.appodeal.ads.revenue.RevenuePrecision.PublisherDefined
        L47:
            r6 = r0
            goto L63
        L49:
            java.lang.String r2 = "exact"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L52
            goto L5d
        L52:
            com.appodeal.ads.revenue.RevenuePrecision r0 = com.appodeal.ads.revenue.RevenuePrecision.Exact
            goto L47
        L55:
            java.lang.String r2 = "estimated"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L60
        L5d:
            com.appodeal.ads.revenue.RevenuePrecision r0 = com.appodeal.ads.revenue.RevenuePrecision.Undefined
            goto L47
        L60:
            com.appodeal.ads.revenue.RevenuePrecision r0 = com.appodeal.ads.revenue.RevenuePrecision.Estimated
            goto L47
        L63:
            java.lang.String r0 = r12.getNetworkName()
            if (r0 != 0) goto L6d
            java.lang.String r0 = r12.getDspName()
        L6d:
            r7 = r0
            com.appodeal.ads.adapters.applovin_max.ext.b r0 = new com.appodeal.ads.adapters.applovin_max.ext.b
            r0.<init>()
            org.json.JSONObject r8 = com.appodeal.ads.ext.JsonObjectBuilderKt.jsonObject(r0)
            r10 = 137(0x89, float:1.92E-43)
            r11 = 0
            r2 = 0
            r5 = 0
            r9 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.adapters.applovin_max.ext.h.a(com.applovin.mediation.MaxAd, java.lang.String):com.appodeal.ads.modules.common.internal.adunit.ImpressionLevelData");
    }

    public static final LoadingError b(MaxError maxError) {
        Intrinsics.checkNotNullParameter(maxError, "<this>");
        return Intrinsics.areEqual(maxError, MaxAdapterError.INTERNAL_ERROR) ? LoadingError.InternalError : Intrinsics.areEqual(maxError, MaxAdapterError.TIMEOUT) ? LoadingError.TimeoutError : Intrinsics.areEqual(maxError, MaxAdapterError.NO_CONNECTION) ? LoadingError.ConnectionError : Intrinsics.areEqual(maxError, MaxAdapterError.BAD_REQUEST) ? LoadingError.RequestError : Intrinsics.areEqual(maxError, MaxAdapterError.SERVER_ERROR) ? LoadingError.ServerError : LoadingError.NoFill;
    }

    public static final String c(final MaxAdWaterfallInfo maxAdWaterfallInfo) {
        Object objB;
        try {
            Result.Companion companion = Result.f93230c;
            objB = Result.b(JsonObjectBuilderKt.jsonObject(new Function1() { // from class: com.appodeal.ads.adapters.applovin_max.ext.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return h.g(maxAdWaterfallInfo, (JsonObjectBuilder) obj);
                }
            }).toString());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        Throwable thG = Result.g(objB);
        if (thG != null) {
            LogExtKt.logInternal("MaxAdExt", "Error creating waterfall info JSON", thG);
            objB = new JSONObject().toString();
        }
        Intrinsics.checkNotNullExpressionValue(objB, "getOrElse(...)");
        String str = (String) objB;
        LogExtKt.logInternal$default("MaxAdExt", str, null, 4, null);
        return str;
    }

    public static final String d(AppLovinSdk appLovinSdk) {
        Intrinsics.checkNotNullParameter(appLovinSdk, "<this>");
        return appLovinSdk.getConfiguration().getCountryCode();
    }

    public static final Unit e(MaxAd maxAd, JsonObjectBuilder jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "$this$jsonObject");
        jsonObject.hasValue("max_placement", maxAd.getAdValue("max_placement"));
        jsonObject.hasValue("max_ecpm", maxAd.getAdValue("max_ecpm"));
        jsonObject.hasValue("ad_unit_uid", maxAd.getAdValue("ad_unit_uid"));
        jsonObject.hasValue("demand_id", maxAd.getAdValue("demand_id"));
        jsonObject.hasValue("price", maxAd.getAdValue("price"));
        jsonObject.hasValue("bid_type", maxAd.getAdValue("bid_type"));
        return Unit.f93236a;
    }

    public static final Unit f(MaxAdWaterfallInfo maxAdWaterfallInfo, JsonArrayBuilder jsonArray) {
        Intrinsics.checkNotNullParameter(jsonArray, "$this$jsonArray");
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        List<MaxNetworkResponseInfo> networkResponses = maxAdWaterfallInfo.getNetworkResponses();
        if (networkResponses != null) {
            for (final MaxNetworkResponseInfo maxNetworkResponseInfo : networkResponses) {
                listCreateListBuilder.add(JsonObjectBuilderKt.jsonObject(new Function1() { // from class: com.appodeal.ads.adapters.applovin_max.ext.f
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return h.h(maxNetworkResponseInfo, (JsonObjectBuilder) obj);
                    }
                }));
            }
        }
        jsonArray.putValues(CollectionsKt.build(listCreateListBuilder));
        return Unit.f93236a;
    }

    public static final Unit g(final MaxAdWaterfallInfo maxAdWaterfallInfo, JsonObjectBuilder jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "$this$jsonObject");
        try {
            Result.Companion companion = Result.f93230c;
            jsonObject.hasValue("waterfall_name", maxAdWaterfallInfo.getName());
            jsonObject.hasValue("waterfall_test_name", maxAdWaterfallInfo.getTestName());
            jsonObject.hasValue("waterfall_latency", Long.valueOf(maxAdWaterfallInfo.getLatencyMillis() / ((long) 1000)));
            jsonObject.hasArray("network_responses", JsonObjectBuilderKt.jsonArray(new Function1() { // from class: com.appodeal.ads.adapters.applovin_max.ext.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return h.f(maxAdWaterfallInfo, (JsonArrayBuilder) obj);
                }
            }));
            Result.b(Unit.f93236a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            Result.b(kotlin.d.a(th2));
        }
        return Unit.f93236a;
    }

    public static final Unit h(final MaxNetworkResponseInfo maxNetworkResponseInfo, JsonObjectBuilder jsonObject) throws JSONException {
        final Set<String> setKeySet;
        Intrinsics.checkNotNullParameter(jsonObject, "$this$jsonObject");
        MaxMediatedNetworkInfo mediatedNetwork = maxNetworkResponseInfo.getMediatedNetwork();
        jsonObject.hasValue("network_name", mediatedNetwork != null ? mediatedNetwork.getName() : null);
        MaxMediatedNetworkInfo mediatedNetwork2 = maxNetworkResponseInfo.getMediatedNetwork();
        jsonObject.hasValue("network_sdk_version", mediatedNetwork2 != null ? mediatedNetwork2.getSdkVersion() : null);
        MaxMediatedNetworkInfo mediatedNetwork3 = maxNetworkResponseInfo.getMediatedNetwork();
        jsonObject.hasValue("network_adapter_version", mediatedNetwork3 != null ? mediatedNetwork3.getAdapterVersion() : null);
        MaxNetworkResponseInfo.AdLoadState adLoadState = maxNetworkResponseInfo.getAdLoadState();
        int i10 = adLoadState == null ? -1 : a.f11996a[adLoadState.ordinal()];
        jsonObject.hasValue("ad_load_state", i10 != 1 ? i10 != 2 ? i10 != 3 ? null : "AD_FAILED_TO_LOAD" : "AD_LOADED" : "AD_LOAD_NOT_ATTEMPTED");
        jsonObject.hasValue("bidding", Boolean.valueOf(maxNetworkResponseInfo.isBidding()));
        jsonObject.hasValue("latency", Long.valueOf(maxNetworkResponseInfo.getLatencyMillis() / ((long) 1000)));
        Bundle credentials = maxNetworkResponseInfo.getCredentials();
        jsonObject.hasObject("credentials", (credentials == null || (setKeySet = credentials.keySet()) == null) ? null : JsonObjectBuilderKt.jsonObject(new Function1() { // from class: com.appodeal.ads.adapters.applovin_max.ext.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h.j(setKeySet, maxNetworkResponseInfo, (JsonObjectBuilder) obj);
            }
        }));
        MaxError error = maxNetworkResponseInfo.getError();
        jsonObject.hasValue("error", error != null ? error.getMessage() : null);
        return Unit.f93236a;
    }

    public static final Unit i(String str, final MaxAd maxAd, JsonObjectBuilder jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "$this$jsonObject");
        jsonObject.hasValue("country_code", str);
        jsonObject.hasValue("placement", maxAd.getPlacement());
        jsonObject.hasValue("network_name", maxAd.getNetworkName());
        jsonObject.hasValue("network_placement", maxAd.getNetworkPlacement());
        jsonObject.hasValue("dsp_name", maxAd.getDspName());
        jsonObject.hasValue("ad_unit_id", maxAd.getAdUnitId());
        jsonObject.hasValue("creative_identifier", maxAd.getCreativeId());
        jsonObject.hasValue("ad_review_creative_identifier", maxAd.getAdReviewCreativeId());
        jsonObject.hasValue("dsp_identifier", maxAd.getDspId());
        jsonObject.hasObject("bidon_data", JsonObjectBuilderKt.jsonObject(new Function1() { // from class: com.appodeal.ads.adapters.applovin_max.ext.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h.e(maxAd, (JsonObjectBuilder) obj);
            }
        }));
        return Unit.f93236a;
    }

    public static final Unit j(Set set, MaxNetworkResponseInfo maxNetworkResponseInfo, JsonObjectBuilder jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "$this$jsonObject");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Intrinsics.checkNotNull(str);
            Bundle credentials = maxNetworkResponseInfo.getCredentials();
            jsonObject.hasValue(str, credentials != null ? credentials.get(str) : null);
        }
        return Unit.f93236a;
    }
}
