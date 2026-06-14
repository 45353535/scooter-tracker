package net.pubnative.lite.sdk.vpaid.macros;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import net.pubnative.lite.sdk.DeviceInfo;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.UserDataManager;

/* JADX INFO: loaded from: classes3.dex */
public class RegulationMacros {
    private static final String MACRO_GDPR_CONSENT = "[GDPRCONSENT]";
    private static final String MACRO_LIMIT_AD_TRACKING = "[LIMITADTRACKING]";
    private static final String MACRO_REGULATIONS = "[REGULATIONS]";
    private final DeviceInfo mDeviceInfo;
    private final UserDataManager mUserDataManager;

    public RegulationMacros() {
        this(HyBid.getDeviceInfo(), HyBid.getUserDataManager());
    }

    private String getGdprConsent() {
        UserDataManager userDataManager = this.mUserDataManager;
        return (userDataManager == null || TextUtils.isEmpty(userDataManager.getIABGDPRConsentString())) ? String.valueOf(-1) : this.mUserDataManager.getIABGDPRConsentString();
    }

    private String getLimitAdTracking() {
        DeviceInfo deviceInfo = this.mDeviceInfo;
        return deviceInfo != null ? deviceInfo.limitTracking() ? "1" : "0" : String.valueOf(-1);
    }

    private String getRegulations() {
        StringBuilder sb2 = new StringBuilder();
        UserDataManager userDataManager = this.mUserDataManager;
        if (userDataManager != null) {
            if (userDataManager.gdprApplies() || !TextUtils.isEmpty(this.mUserDataManager.getIABGDPRConsentString())) {
                sb2.append("gdpr");
            }
            if (HyBid.isCoppaEnabled()) {
                if (sb2.length() > 0) {
                    sb2.append(StringUtils.COMMA);
                }
                sb2.append("coppa");
            }
        }
        String string = sb2.toString();
        return TextUtils.isEmpty(string) ? String.valueOf(-1) : string;
    }

    public String processUrl(String str) {
        return str.replace(MACRO_LIMIT_AD_TRACKING, getLimitAdTracking()).replace(MACRO_REGULATIONS, getRegulations()).replace(MACRO_GDPR_CONSENT, getGdprConsent());
    }

    RegulationMacros(DeviceInfo deviceInfo, UserDataManager userDataManager) {
        this.mDeviceInfo = deviceInfo;
        this.mUserDataManager = userDataManager;
    }
}
