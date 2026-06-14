package com.appodeal.ads.adapters.bigo_ads.unified;

import com.appodeal.ads.modules.common.internal.adunit.ImpressionLevelData;
import com.appodeal.ads.utils.Log;
import sg.bigo.ads.api.AdBid;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a {
    public static final ImpressionLevelData a(AdBid adBid) {
        if (adBid == null) {
            return null;
        }
        try {
            return new ImpressionLevelData(null, Double.valueOf(adBid.getPrice()), Double.valueOf(adBid.getPrice() / 1000.0d), null, null, null, null, false, 249, null);
        } catch (Exception e10) {
            Log.log(e10);
            return null;
        }
    }
}
