package net.pubnative.lite.sdk.utils;

import android.content.Context;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.models.Ad;
import net.pubnative.lite.sdk.prefs.HyBidPreferences;

/* JADX INFO: loaded from: classes3.dex */
public class AdTopicsAPIManager {
    public static Boolean isTopicsAPIEnabled(Context context) {
        if (context == null) {
            return null;
        }
        return new HyBidPreferences(context).isTopicsAPIEnabled();
    }

    public static void setTopicsAPIEnabled(Context context, Ad ad2) {
        if (context == null || ad2 == null) {
            return;
        }
        Boolean boolIsTopicsAPIEnabled = ad2.isTopicsAPIEnabled();
        boolean zBooleanValue = HyBid.isTopicsApiEnabled().booleanValue();
        if (boolIsTopicsAPIEnabled == null || boolIsTopicsAPIEnabled.booleanValue() == zBooleanValue) {
            return;
        }
        new HyBidPreferences(context).setTopicsAPIEnabled(boolIsTopicsAPIEnabled);
        HyBid.setTopicsApiEnabled(boolIsTopicsAPIEnabled);
    }
}
