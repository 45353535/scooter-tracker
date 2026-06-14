package net.pubnative.lite.sdk.utils;

import android.content.Context;
import android.os.BatteryManager;

/* JADX INFO: loaded from: classes3.dex */
public class BatteryUtils {
    private static final String TAG = "BatteryUtils";
    static Boolean isBatteryPercentageValueFetched = Boolean.FALSE;

    public static synchronized int getBatteryPercentageSync(Context context) {
        isBatteryPercentageValueFetched = Boolean.FALSE;
        if (context == null) {
            return 0;
        }
        try {
            BatteryManager batteryManager = (BatteryManager) context.getSystemService("batterymanager");
            if (batteryManager != null) {
                int intProperty = batteryManager.getIntProperty(4);
                isBatteryPercentageValueFetched = Boolean.TRUE;
                if (intProperty != Integer.MIN_VALUE) {
                    return intProperty;
                }
                return 0;
            }
        } catch (RuntimeException e10) {
            Logger.e(TAG, "Could not retrieve battery status. The system may be unstable.", e10);
        }
        return 0;
    }

    public static synchronized Boolean isBatteryPercentageValueFetched() {
        return isBatteryPercentageValueFetched;
    }
}
