package net.pubnative.lite.sdk.vpaid.vast;

import android.text.TextUtils;
import java.util.Locale;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.models.VASTtag;
import net.pubnative.lite.sdk.vpaid.vast.VastUrlParameters;

/* JADX INFO: loaded from: classes3.dex */
public class VastUrlUtils {
    public static VastUrlParameters buildParameters() {
        boolean zIsCCPAOptOut;
        boolean zIsConsentDenied;
        String str;
        String str2;
        String str3 = "1";
        if (HyBid.getUserDataManager() != null) {
            str = HyBid.getUserDataManager().gdprApplies() ? "1" : "0";
            zIsCCPAOptOut = HyBid.getUserDataManager().isCCPAOptOut();
            zIsConsentDenied = HyBid.getUserDataManager().isConsentDenied();
        } else {
            zIsCCPAOptOut = false;
            zIsConsentDenied = false;
            str = "0";
        }
        if (!HyBid.isCoppaEnabled() && !zIsCCPAOptOut && !zIsConsentDenied && !HyBid.getDeviceInfo().limitTracking() && !TextUtils.isEmpty(HyBid.getDeviceInfo().getAdvertisingId())) {
            str3 = "0";
        }
        if (HyBid.getLocationManager() == null || HyBid.getLocationManager().getUserLocation() == null) {
            str2 = null;
        } else {
            String str4 = HyBid.getLocationManager().getUserLocation().getLatitude() != 0.0d ? String.format(Locale.ENGLISH, "%.2f", Double.valueOf(HyBid.getLocationManager().getUserLocation().getLatitude())) : null;
            str2 = HyBid.getLocationManager().getUserLocation().getLongitude() != 0.0d ? String.format(Locale.ENGLISH, "%.2f", Double.valueOf(HyBid.getLocationManager().getUserLocation().getLongitude())) : null;
            str = str4;
        }
        return new VastUrlParameters.Builder().advertisingId(HyBid.getDeviceInfo().getAdvertisingId()).bundleId(HyBid.getBundleId()).dnt(str3).latitude(str).longitude(str2).userAgent(HyBid.getDeviceInfo().getUserAgent()).deviceWidth(HyBid.getDeviceInfo().getDeviceWidth()).deviceHeight(HyBid.getDeviceInfo().getDeviceHeight()).gdpr(str).gdprConsent(HyBid.getUserDataManager().getIABGDPRConsentString()).usPrivacy(HyBid.getUserDataManager().getIABUSPrivacyString()).build();
    }

    public static String formatURL(String str, VastUrlParameters vastUrlParameters) {
        if (vastUrlParameters == null) {
            vastUrlParameters = new VastUrlParameters.Builder().build();
        }
        return new VASTtag.VASTtagBuilder(str).adId(vastUrlParameters.advertisingId).bundle(vastUrlParameters.bundleId).dnt(vastUrlParameters.dnt).lat(vastUrlParameters.latitude).lon(vastUrlParameters.longitude).userAgent(vastUrlParameters.userAgent).width(vastUrlParameters.deviceWidth).height(vastUrlParameters.deviceHeight).gdpr(vastUrlParameters.gdpr).gdprConsent(vastUrlParameters.gdprConsent).usPrivacy(vastUrlParameters.usPrivacy).build().getFormattedURL();
    }
}
