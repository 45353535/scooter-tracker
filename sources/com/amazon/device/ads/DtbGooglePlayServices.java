package com.amazon.device.ads;

import com.amazon.aps.ads.privacy.ApsPrivacyManager;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;

/* JADX INFO: loaded from: classes5.dex */
class DtbGooglePlayServices {
    private static final String LOG_TAG = "DtbGooglePlayServices";

    static class AdvertisingInfo {
        private String advertisingIdentifier;
        private boolean gpsAvailable = true;
        private Boolean limitAdTrackingEnabled;

        AdvertisingInfo() {
        }

        static AdvertisingInfo createNotAvailable() {
            return new AdvertisingInfo().setGooglePlayServicesAvailable(false);
        }

        private AdvertisingInfo setGooglePlayServicesAvailable(boolean z10) {
            this.gpsAvailable = z10;
            return this;
        }

        String getAdvertisingIdentifier() {
            if (ApsPrivacyManager.INSTANCE.isSystemResourceAccessAllowed()) {
                return this.advertisingIdentifier;
            }
            return null;
        }

        boolean hasAdvertisingIdentifier() {
            return getAdvertisingIdentifier() != null;
        }

        boolean isGooglePlayServicesAvailable() {
            return this.gpsAvailable;
        }

        Boolean isLimitAdTrackingEnabled() {
            return this.limitAdTrackingEnabled;
        }

        AdvertisingInfo setAdvertisingIdentifier(String str) {
            this.advertisingIdentifier = str;
            return this;
        }

        AdvertisingInfo setLimitAdTrackingEnabled(Boolean bool) {
            this.limitAdTrackingEnabled = bool;
            return this;
        }
    }

    DtbGooglePlayServices() {
    }

    private boolean isAdvertisingClassAvailable() {
        return DtbCommonUtils.isClassAvailable("com.google.android.gms.ads.identifier.AdvertisingIdClient");
    }

    public AdvertisingInfo getAdvertisingIdentifierInfo() throws Throwable {
        if (isAdvertisingClassAvailable()) {
            AdvertisingInfo advertisingIdentifierInfo = DtbGooglePlayServicesAdapter.newAdapter().getAdvertisingIdentifierInfo();
            if (advertisingIdentifierInfo.getAdvertisingIdentifier() != null && !advertisingIdentifierInfo.getAdvertisingIdentifier().isEmpty()) {
                return advertisingIdentifierInfo;
            }
        }
        AdvertisingInfo advertisingIdentifierInfo2 = DtbFireOSServiceAdapter.newAdapter().getAdvertisingIdentifierInfo();
        if (advertisingIdentifierInfo2.getAdvertisingIdentifier() != null && !advertisingIdentifierInfo2.getAdvertisingIdentifier().isEmpty()) {
            return advertisingIdentifierInfo2;
        }
        DtbLog.error(LOG_TAG, "The Google Play Services Advertising Identifier feature is not available. Please include the google dependency / check the proguard rule");
        APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.LOG, "The Google Play Services Advertising Identifier feature is not available");
        return AdvertisingInfo.createNotAvailable();
    }
}
