package net.pubnative.lite.sdk.vpaid.macros;

import android.location.Location;
import android.text.TextUtils;
import java.util.Locale;
import net.pubnative.lite.sdk.BuildConfig;
import net.pubnative.lite.sdk.DeviceInfo;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.location.HyBidLocationManager;
import net.pubnative.lite.sdk.utils.EncodingUtils;

/* JADX INFO: loaded from: classes3.dex */
public class ClientMacros {
    private static final String MACRO_CLIENT_UA = "[CLIENTUA]";
    private static final String MACRO_DEVICE_IP = "[DEVICEIP]";
    private static final String MACRO_DEVICE_UA = "[DEVICEUA]";
    private static final String MACRO_IFA = "[IFA]";
    private static final String MACRO_IFA_TYPE = "[IFATYPE]";
    private static final String MACRO_LAT_LONG = "[LATLONG]";
    private static final String MACRO_SERVER_SIDE = "[SERVERSIDE]";
    private static final String MACRO_SERVER_UA = "[SERVERUA]";
    private final String mClientUserAgent;
    private final DeviceInfo mDeviceInfo;
    private final String mDeviceUserAgent;
    private final HyBidLocationManager mLocationManager;

    public ClientMacros() {
        this(HyBid.getDeviceInfo(), HyBid.getLocationManager());
    }

    private String getClientUA() {
        return this.mClientUserAgent;
    }

    private String getDeviceIp() {
        return String.valueOf(-1);
    }

    private String getDeviceUA() {
        return this.mDeviceUserAgent;
    }

    private String getIfa() {
        DeviceInfo deviceInfo = this.mDeviceInfo;
        return deviceInfo != null ? deviceInfo.limitTracking() ? String.valueOf(-2) : TextUtils.isEmpty(this.mDeviceInfo.getAdvertisingId()) ? String.valueOf(-1) : this.mDeviceInfo.getAdvertisingId() : String.valueOf(-1);
    }

    private String getIfaType() {
        DeviceInfo deviceInfo = this.mDeviceInfo;
        return deviceInfo != null ? deviceInfo.limitTracking() ? String.valueOf(-2) : "aaid" : String.valueOf(-1);
    }

    private String getLocation() {
        HyBidLocationManager hyBidLocationManager = this.mLocationManager;
        if (hyBidLocationManager == null) {
            return String.valueOf(-1);
        }
        Location userLocation = hyBidLocationManager.getUserLocation();
        return userLocation != null ? String.format(Locale.ENGLISH, "%.2f,%.2f", Double.valueOf(userLocation.getLatitude()), Double.valueOf(userLocation.getLongitude())) : String.valueOf(-1);
    }

    private String getServerSide() {
        return "0";
    }

    private String getServerUA() {
        return String.valueOf(-1);
    }

    public String processUrl(String str) {
        return str.replace(MACRO_IFA, getIfa()).replace(MACRO_IFA_TYPE, getIfaType()).replace(MACRO_CLIENT_UA, getClientUA()).replace(MACRO_DEVICE_UA, getDeviceUA()).replace(MACRO_SERVER_SIDE, getServerSide()).replace(MACRO_LAT_LONG, getLocation());
    }

    ClientMacros(DeviceInfo deviceInfo, HyBidLocationManager hyBidLocationManager) {
        this.mDeviceInfo = deviceInfo;
        this.mLocationManager = hyBidLocationManager;
        this.mClientUserAgent = EncodingUtils.urlEncode(String.format(Locale.ENGLISH, "%s/%s %s/%s", BuildConfig.DISPLAY_MANAGER_NAME, "3.7.1", "HyBid VAST Player", "3.7.1"));
        if (deviceInfo == null || deviceInfo.getUserAgent() == null || TextUtils.isEmpty(deviceInfo.getUserAgent())) {
            this.mDeviceUserAgent = String.valueOf(-1);
        } else {
            this.mDeviceUserAgent = EncodingUtils.urlEncode(deviceInfo.getUserAgent());
        }
    }
}
