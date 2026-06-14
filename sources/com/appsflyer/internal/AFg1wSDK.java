package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFg1sSDK;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import net.pubnative.lite.sdk.utils.svgparser.utils.SVGParserImpl;

/* JADX INFO: loaded from: classes6.dex */
public final class AFg1wSDK implements AFg1sSDK {

    @VisibleForTesting
    private static IntentFilter getMediationNetwork = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    @Override // com.appsflyer.internal.AFg1sSDK
    @NonNull
    public final AFg1sSDK.AFa1uSDK AFAdRevenueData(@NonNull Context context) {
        String str = null;
        float f10 = 0.0f;
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, getMediationNetwork);
            if (intentRegisterReceiver != null) {
                if (2 == intentRegisterReceiver.getIntExtra("status", -1)) {
                    int intExtra = intentRegisterReceiver.getIntExtra("plugged", -1);
                    str = intExtra != 1 ? intExtra != 2 ? intExtra != 4 ? "other" : "wireless" : "usb" : CampaignEx.KEY_ACTIVITY_PATH_AND_NAME;
                } else {
                    str = SVGParserImpl.XML_STYLESHEET_ATTR_ALTERNATE_NO;
                }
                int intExtra2 = intentRegisterReceiver.getIntExtra("level", -1);
                int intExtra3 = intentRegisterReceiver.getIntExtra("scale", -1);
                if (-1 != intExtra2 && -1 != intExtra3) {
                    f10 = (intExtra2 * 100.0f) / intExtra3;
                }
            }
        } catch (Throwable th2) {
            AFLogger.afErrorLogForExcManagerOnly("Device that failed to register receiver", th2);
        }
        return new AFg1sSDK.AFa1uSDK(f10, str);
    }
}
