package com.amazon.device.ads;

import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import com.amazon.device.ads.DtbGooglePlayServices;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
class DtbGooglePlayServicesAdapter {
    DtbGooglePlayServicesAdapter() {
    }

    public static DtbGooglePlayServicesAdapter newAdapter() {
        return new DtbGooglePlayServicesAdapter();
    }

    public DtbGooglePlayServices.AdvertisingInfo getAdvertisingIdentifierInfo() throws Throwable {
        AdvertisingIdClient.Info advertisingIdInfo;
        try {
            advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(AdRegistration.getContext());
        } catch (GooglePlayServicesNotAvailableException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Retrieving the Google Play Services Advertising Identifier caused a GooglePlayServicesNotAvailableException.", e10);
            return DtbGooglePlayServices.AdvertisingInfo.createNotAvailable();
        } catch (GooglePlayServicesRepairableException e11) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Retrieving the Google Play Services Advertising Identifier caused a GooglePlayServicesRepairableException.", e11);
            advertisingIdInfo = null;
        } catch (IOException e12) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Retrieving the Google Play Services Advertising Identifier caused an IOException.", e12);
            advertisingIdInfo = null;
        } catch (IllegalArgumentException e13) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Illegal Argument passed to getAdvertisingIdInfo", e13);
            advertisingIdInfo = null;
        } catch (IllegalStateException e14) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Retrieving the Google Play Services  caused Illegal State Exception ( be sure the call was made from a non-background thread).", e14);
            advertisingIdInfo = null;
        } catch (Exception e15) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Exception Occurred while retrieve Google Play Services Advertising Identifier", e15);
            advertisingIdInfo = null;
        }
        if (advertisingIdInfo == null) {
            DtbLog.debug("The Google Play Services Advertising Identifier could not be retrieved.");
            return new DtbGooglePlayServices.AdvertisingInfo();
        }
        DtbLog.debug("The Google Play Services Advertising Identifier was successfully retrieved.");
        String id2 = advertisingIdInfo.getId();
        boolean zIsLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled();
        DtbLog.debug(" Retrieved google ad id " + advertisingIdInfo.getId() + " and tracking enabled : " + advertisingIdInfo.isLimitAdTrackingEnabled());
        return new DtbGooglePlayServices.AdvertisingInfo().setAdvertisingIdentifier(id2).setLimitAdTrackingEnabled(Boolean.valueOf(zIsLimitAdTrackingEnabled));
    }
}
