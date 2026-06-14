package com.amazon.device.ads;

import android.content.ContentResolver;
import android.provider.Settings;
import com.amazon.device.ads.DtbGooglePlayServices;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* JADX INFO: loaded from: classes5.dex */
public class DtbFireOSServiceAdapter {
    private static final String LOG_TAG = "DtbFireOSServiceAdapter";

    private DtbFireOSServiceAdapter() {
    }

    public static DtbFireOSServiceAdapter newAdapter() {
        return new DtbFireOSServiceAdapter();
    }

    public DtbGooglePlayServices.AdvertisingInfo getAdvertisingIdentifierInfo() {
        boolean z10;
        try {
            ContentResolver contentResolver = AdRegistration.getContext().getContentResolver();
            int i10 = Settings.Secure.getInt(contentResolver, CommonUrlParts.LIMIT_AD_TRACKING);
            String string = Settings.Secure.getString(contentResolver, "advertising_id");
            String str = LOG_TAG;
            DtbLog.debug(str, " FireID retrieved : " + string);
            if (i10 != 0) {
                DtbLog.debug(str, " Fire device does not allow AdTracking,");
                z10 = true;
            } else {
                z10 = false;
            }
            DtbGooglePlayServices.AdvertisingInfo advertisingInfo = new DtbGooglePlayServices.AdvertisingInfo();
            advertisingInfo.setAdvertisingIdentifier(string);
            advertisingInfo.setLimitAdTrackingEnabled(Boolean.valueOf(z10));
            return advertisingInfo;
        } catch (Settings.SettingNotFoundException e10) {
            DtbLog.debug(LOG_TAG, " Advertising setting not found on this device " + e10.getLocalizedMessage());
            return new DtbGooglePlayServices.AdvertisingInfo();
        } catch (Exception e11) {
            DtbLog.debug(LOG_TAG, " Attempt to retrieve fireID failed. Reason : " + e11.getLocalizedMessage());
            return new DtbGooglePlayServices.AdvertisingInfo();
        }
    }
}
