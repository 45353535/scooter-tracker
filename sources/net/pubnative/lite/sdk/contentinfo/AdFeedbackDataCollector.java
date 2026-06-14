package net.pubnative.lite.sdk.contentinfo;

import android.text.TextUtils;
import java.util.Locale;
import net.pubnative.lite.sdk.DeviceInfo;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.contentinfo.AdFeedbackData;
import net.pubnative.lite.sdk.models.APIAsset;
import net.pubnative.lite.sdk.models.Ad;
import net.pubnative.lite.sdk.models.IntegrationType;

/* JADX INFO: loaded from: classes3.dex */
public class AdFeedbackDataCollector {
    private static final String TAG = "AdFeedbackDataCollector";
    private final DeviceInfo mDeviceInfo;
    private final IntegrationType mIntegrationType;

    public AdFeedbackDataCollector(IntegrationType integrationType) {
        this(HyBid.getDeviceInfo(), integrationType);
    }

    public AdFeedbackData collectData(Ad ad2, String str, IntegrationType integrationType) {
        AdFeedbackData.Builder builder = new AdFeedbackData.Builder();
        if (HyBid.isInitialized() && !TextUtils.isEmpty(HyBid.getAppToken())) {
            builder.setAppToken(HyBid.getAppToken());
        }
        if (!TextUtils.isEmpty(HyBid.getSDKVersionInfo(this.mIntegrationType))) {
            builder.setSdkVersion(HyBid.getSDKVersionInfo(this.mIntegrationType));
        }
        if (!TextUtils.isEmpty(HyBid.getAppVersion())) {
            builder.setAppVersion(HyBid.getAppVersion());
        }
        if (!TextUtils.isEmpty(str)) {
            builder.setAdFormat(str);
        }
        if (integrationType != null) {
            builder.setIntegrationType(integrationType.getCode());
        }
        String audioState = ad2.getAudioState();
        if (audioState == null) {
            audioState = HyBid.getVideoAudioStatus().getStateName();
        }
        builder.setAudioState(audioState);
        DeviceInfo deviceInfo = this.mDeviceInfo;
        if (deviceInfo != null && !TextUtils.isEmpty(deviceInfo.getModel()) && !TextUtils.isEmpty(this.mDeviceInfo.getOSVersion())) {
            builder.setDeviceInfo(String.format(Locale.ENGLISH, "%s Android %s", this.mDeviceInfo.getModel(), this.mDeviceInfo.getOSVersion()));
        }
        if (!TextUtils.isEmpty(ad2.getZoneId())) {
            builder.setZoneId(ad2.getZoneId());
        }
        if (!TextUtils.isEmpty(ad2.getCreativeId())) {
            builder.setCreativeId(ad2.getCreativeId());
        }
        if (!TextUtils.isEmpty(ad2.getImpressionId())) {
            builder.setImpressionBeacon(ad2.getImpressionId());
        }
        builder.setHasEndCard(ad2.hasEndCard() ? "true" : "false");
        if (!TextUtils.isEmpty(ad2.getVast())) {
            builder.setCreative(ad2.getVast());
        } else if (!TextUtils.isEmpty(ad2.getAssetUrl(APIAsset.HTML_BANNER))) {
            builder.setCreative(ad2.getAssetUrl(APIAsset.HTML_BANNER));
        } else if (!TextUtils.isEmpty(ad2.getAssetHtml(APIAsset.HTML_BANNER))) {
            builder.setCreative(ad2.getAssetHtml(APIAsset.HTML_BANNER));
        }
        return builder.build();
    }

    public AdFeedbackDataCollector(DeviceInfo deviceInfo, IntegrationType integrationType) {
        this.mDeviceInfo = deviceInfo;
        this.mIntegrationType = integrationType;
    }
}
