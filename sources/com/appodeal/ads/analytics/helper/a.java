package com.appodeal.ads.analytics.helper;

import com.appodeal.ads.analytics.models.AdUnitsEvent;
import com.appodeal.ads.analytics.models.GeneralAdUnitParams;
import com.appodeal.ads.analytics.models.WaterfallType;
import com.appodeal.ads.b3;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.n2;
import com.appodeal.ads.te;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a {
    public static GeneralAdUnitParams a(te adRequest, n2 n2Var) {
        WaterfallType postBid;
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        if (n2Var == null || !n2Var.isPrecache()) {
            te teVar = adRequest.G;
            if (teVar == null) {
                postBid = WaterfallType.Main.INSTANCE;
            } else {
                int i10 = 0;
                while (teVar != null) {
                    teVar = teVar.G;
                    i10++;
                }
                postBid = new WaterfallType.PostBid(i10);
            }
        } else {
            postBid = WaterfallType.Precache.INSTANCE;
        }
        AdType adTypeU = adRequest.u();
        Intrinsics.checkNotNullExpressionValue(adTypeU, "getType(...)");
        String strS = adRequest.s();
        Intrinsics.checkNotNullExpressionValue(strS, "getImpressionId(...)");
        String status = n2Var.getStatus();
        Intrinsics.checkNotNullExpressionValue(status, "getStatus(...)");
        String adUnitName = n2Var.getAdUnitName();
        if (adUnitName == null) {
            adUnitName = "";
        }
        return new GeneralAdUnitParams(postBid, adTypeU, strS, status, adUnitName, n2Var.getEcpm());
    }

    public static AdUnitsEvent.AdUnitFinish b(te adRequest, n2 adUnit) {
        AdUnitsEvent.AdUnitFinish.Result result;
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        GeneralAdUnitParams generalAdUnitParamsA = a(adRequest, adUnit);
        b3 requestResult = adUnit.getRequestResult();
        switch (requestResult == null ? -1 : b.f12680a[requestResult.ordinal()]) {
            case 1:
                result = AdUnitsEvent.AdUnitFinish.Result.SUCCESSFUL;
                break;
            case 2:
                result = AdUnitsEvent.AdUnitFinish.Result.NOFILL;
                break;
            case 3:
                result = AdUnitsEvent.AdUnitFinish.Result.TIMEOUTREACHED;
                break;
            case 4:
                result = AdUnitsEvent.AdUnitFinish.Result.EXCEPTION;
                break;
            case 5:
                result = AdUnitsEvent.AdUnitFinish.Result.UNDEFINEDADAPTER;
                break;
            case 6:
                result = AdUnitsEvent.AdUnitFinish.Result.INCORRECTADUNIT;
                break;
            case 7:
                result = AdUnitsEvent.AdUnitFinish.Result.INVALIDASSETS;
                break;
            case 8:
                result = AdUnitsEvent.AdUnitFinish.Result.UNRECOGNIZED;
                break;
            case 9:
                result = AdUnitsEvent.AdUnitFinish.Result.CANCELED;
                break;
            case 10:
                result = AdUnitsEvent.AdUnitFinish.Result.INCORRECTCREATIVE;
                break;
            default:
                result = AdUnitsEvent.AdUnitFinish.Result.NOFILL;
                break;
        }
        return new AdUnitsEvent.AdUnitFinish(generalAdUnitParamsA, result);
    }
}
