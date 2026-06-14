package org.bidon.bidmachine.impl;

import android.content.Context;
import io.bidmachine.CustomParams;
import io.bidmachine.TargetingParams;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.adapter.AdAuctionParamSource;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class g {
    private final CustomParams c(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        CustomParams customParams = new CustomParams();
        customParams.m7753addParam("mediation_mode", "bidon");
        if (jSONObject != null && (jSONObjectOptJSONObject = jSONObject.optJSONObject("custom_parameters")) != null) {
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                String strOptString = jSONObjectOptJSONObject.optString(next);
                Intrinsics.checkNotNull(strOptString);
                if (strOptString.length() <= 0) {
                    strOptString = null;
                }
                if (strOptString != null) {
                    Intrinsics.checkNotNull(next);
                    customParams.m7753addParam(next, strOptString);
                }
            }
        }
        return customParams;
    }

    private final TargetingParams d(JSONObject jSONObject) {
        List listI;
        List listI2;
        List listI3;
        TargetingParams targetingParams = new TargetingParams();
        if (jSONObject != null && (listI3 = i(jSONObject, "bcat")) != null) {
            Iterator it = listI3.iterator();
            while (it.hasNext()) {
                targetingParams.m7764addBlockedAdvertiserIABCategory((String) it.next());
            }
        }
        if (jSONObject != null && (listI2 = i(jSONObject, "badv")) != null) {
            Iterator it2 = listI2.iterator();
            while (it2.hasNext()) {
                targetingParams.m7763addBlockedAdvertiserDomain((String) it2.next());
            }
        }
        if (jSONObject != null && (listI = i(jSONObject, "bapps")) != null) {
            Iterator it3 = listI.iterator();
            while (it3.hasNext()) {
                targetingParams.m7765addBlockedApplication((String) it3.next());
            }
        }
        return targetingParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final org.bidon.bidmachine.a f(g gVar, AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "$this$auctionParamsScope");
        JSONObject extra = auctionParamsScope.getAdUnit().getExtra();
        double pricefloor = auctionParamsScope.getAdUnit().getPricefloor();
        long timeout = auctionParamsScope.getAdUnit().getTimeout();
        return new org.bidon.bidmachine.a(pricefloor, auctionParamsScope.getAdUnit(), auctionParamsScope.getActivity(), auctionParamsScope.getBannerFormat(), timeout, gVar.c(extra), gVar.d(extra), extra != null ? extra.optString("payload") : null, extra != null ? extra.optString("placement") : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final org.bidon.bidmachine.b h(g gVar, AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "$this$auctionParamsScope");
        JSONObject extra = auctionParamsScope.getAdUnit().getExtra();
        double pricefloor = auctionParamsScope.getAdUnit().getPricefloor();
        long timeout = auctionParamsScope.getAdUnit().getTimeout();
        Context applicationContext = auctionParamsScope.getActivity().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        return new org.bidon.bidmachine.b(pricefloor, auctionParamsScope.getAdUnit(), applicationContext, timeout, gVar.c(extra), gVar.d(extra), extra != null ? extra.optString("payload") : null, extra != null ? extra.optString("placement") : null);
    }

    private final List i(JSONObject jSONObject, String str) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray != null) {
            List listCreateListBuilder = CollectionsKt.createListBuilder();
            int length = jSONArrayOptJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                String strOptString = jSONArrayOptJSONArray.optString(i10);
                Intrinsics.checkNotNull(strOptString);
                if (strOptString.length() <= 0) {
                    strOptString = null;
                }
                if (strOptString != null) {
                    listCreateListBuilder.add(strOptString);
                }
            }
            List listBuild = CollectionsKt.build(listCreateListBuilder);
            if (!listBuild.isEmpty()) {
                return listBuild;
            }
        }
        return null;
    }

    public final Object e(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "auctionParamsScope");
        return auctionParamsScope.m8670invokeIoAF18A(new Function1() { // from class: org.bidon.bidmachine.impl.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g.f(this.f97171b, (AdAuctionParamSource) obj);
            }
        });
    }

    public final Object g(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "auctionParamsScope");
        return auctionParamsScope.m8670invokeIoAF18A(new Function1() { // from class: org.bidon.bidmachine.impl.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g.h(this.f97170b, (AdAuctionParamSource) obj);
            }
        });
    }
}
