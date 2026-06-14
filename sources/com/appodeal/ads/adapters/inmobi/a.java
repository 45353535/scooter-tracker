package com.appodeal.ads.adapters.inmobi;

import com.appodeal.ads.modules.common.internal.adunit.ImpressionLevelData;
import com.appodeal.ads.utils.Log;
import com.inmobi.ads.AdMetaInfo;
import com.ironsource.C4605wc;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a {
    public static final ImpressionLevelData a(AdMetaInfo adMetaInfo) {
        if (adMetaInfo == null) {
            return null;
        }
        try {
            return new ImpressionLevelData(null, Double.valueOf(adMetaInfo.getBid() * 1000.0d), Double.valueOf(adMetaInfo.getBid()), null, null, adMetaInfo.getBidInfo().optString(C4605wc.f45738a), null, false, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, null);
        } catch (Exception e10) {
            Log.log(e10);
            return null;
        }
    }
}
