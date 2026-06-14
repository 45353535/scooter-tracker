package com.appodeal.ads.analytics.helper;

import com.appodeal.ads.analytics.models.MediationEvent;
import com.appodeal.ads.analytics.models.WaterfallType;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.te;
import com.appodeal.ads.x2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class c {
    public static MediationEvent.WaterfallRoundStart a(te adRequest, x2 adUnit) {
        WaterfallType postBid;
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        if (adUnit == null || !adUnit.f15228e) {
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
        String str = adRequest.f14898j;
        if (str == null) {
            str = "";
        }
        String strS = adRequest.s();
        Intrinsics.checkNotNullExpressionValue(strS, "getImpressionId(...)");
        return new MediationEvent.WaterfallRoundStart(postBid, adTypeU, strS, str);
    }
}
