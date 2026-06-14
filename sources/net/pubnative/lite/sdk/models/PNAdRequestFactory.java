package net.pubnative.lite.sdk.models;

import android.content.Context;
import android.location.Location;
import android.text.TextUtils;
import android.util.Base64;
import com.ironsource.C4240b4;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.RejectedExecutionException;
import net.pubnative.lite.sdk.DeviceInfo;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.TopicManager;
import net.pubnative.lite.sdk.UserDataManager;
import net.pubnative.lite.sdk.location.HyBidLocationManager;
import net.pubnative.lite.sdk.models.AdRequestFactory;
import net.pubnative.lite.sdk.models.bidstream.GeoLocation;
import net.pubnative.lite.sdk.models.bidstream.Impression;
import net.pubnative.lite.sdk.models.bidstream.ImpressionBanner;
import net.pubnative.lite.sdk.models.bidstream.ImpressionVideo;
import net.pubnative.lite.sdk.models.bidstream.Signal;
import net.pubnative.lite.sdk.prefs.HyBidPreferences;
import net.pubnative.lite.sdk.prefs.SessionImpressionPrefs;
import net.pubnative.lite.sdk.utils.AtomManager;
import net.pubnative.lite.sdk.utils.HyBidAdvertisingId;
import net.pubnative.lite.sdk.utils.HyBidTimeUtils;
import net.pubnative.lite.sdk.utils.Logger;
import net.pubnative.lite.sdk.utils.sdkmanager.DisplayManager;
import net.pubnative.lite.sdk.utils.sdkmanager.SdkManager;
import net.pubnative.lite.sdk.viewability.baseom.BaseViewabilityManager;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class PNAdRequestFactory extends BaseRequestFactory implements AdRequestFactory {
    private static final String TAG = "PNAdRequestFactory";
    private DeviceInfo mDeviceInfo;
    private IntegrationType mIntegrationType;
    private boolean mIsRewarded;
    private HyBidLocationManager mLocationManager;
    private String mMediationVendor;
    private final SdkManager mSdkManager;
    private final TopicManager mTopicManager;
    private UserDataManager mUserDataManager;
    private HyBidPreferences prefs;

    public PNAdRequestFactory() {
        this(HyBid.getDeviceInfo(), HyBid.getLocationManager(), HyBid.getUserDataManager(), HyBid.getSdkManager(), HyBid.getTopicManager());
    }

    public static /* synthetic */ void a(PNAdRequestFactory pNAdRequestFactory, String str, String str2, AdSize adSize, int i10, boolean z10, AdRequestFactory.Callback callback, String str3, Boolean bool) {
        pNAdRequestFactory.getClass();
        pNAdRequestFactory.processAdvertisingId(str, str2, adSize, str3, bool.booleanValue(), i10, z10, callback);
    }

    private long calculateSessionDuration() {
        if (this.prefs == null) {
            this.prefs = new HyBidPreferences(this.mDeviceInfo.getContext());
        }
        return System.currentTimeMillis() - this.prefs.getSessionTimeStamp();
    }

    private String getAgeOfApp() {
        if (this.prefs == null) {
            this.prefs = new HyBidPreferences(this.mDeviceInfo.getContext());
        }
        return this.prefs.getAppFirstInstalledTime();
    }

    private String getAtomCohorts() {
        if (AtomManager.isAtomSdkDisabled() || !AtomManager.isAtomSdkConfigurationFetchSuccessful()) {
            return null;
        }
        List<Object> atomCohorts = AtomManager.getAtomCohorts();
        if (atomCohorts.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : atomCohorts) {
            try {
                Object objInvoke = obj.getClass().getDeclaredMethod("id", null).invoke(obj, null);
                if (objInvoke != null) {
                    arrayList.add(String.valueOf(objInvoke));
                }
            } catch (Exception unused) {
                Logger.d(TAG, AtomManager.ATOM_NOT_FOUND_MESSAGE);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return Base64.encodeToString((C4240b4.j.f42672d + TextUtils.join(StringUtils.COMMA, arrayList) + C4240b4.j.f42674e).getBytes(StandardCharsets.UTF_8), 2);
    }

    private String getDefaultMetaFields() {
        return TextUtils.join(StringUtils.COMMA, new String[]{APIMeta.POINTS, APIMeta.REVENUE_MODEL, APIMeta.CONTENT_INFO, APIMeta.CREATIVE_ID, APIMeta.CAMPAIGN_ID, "bundleid", APIMeta.AD_EXPERIENCE});
    }

    private String getDefaultNativeAssetFields() {
        return TextUtils.join(StringUtils.COMMA, new String[]{"icon", "title", "banner", "cta", "rating", "description"});
    }

    private String getSupportedApis() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("3");
        arrayList.add("5");
        arrayList.add("6");
        arrayList.add("7");
        return TextUtils.join(StringUtils.COMMA, arrayList.toArray(new String[0]));
    }

    private String getSupportedProtocols() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add(Protocol.VAST_1_0_WRAPPER);
        arrayList.add("5");
        arrayList.add("6");
        arrayList.add("7");
        arrayList.add("8");
        arrayList.add(Protocol.VAST_4_1);
        arrayList.add(Protocol.VAST_4_1_WRAPPER);
        arrayList.add(Protocol.VAST_4_2);
        arrayList.add(Protocol.VAST_4_2_WRAPPER);
        return TextUtils.join(StringUtils.COMMA, arrayList.toArray(new String[0]));
    }

    private void processAdvertisingId(String str, String str2, AdSize adSize, String str3, boolean z10, int i10, boolean z11, AdRequestFactory.Callback callback) {
        if (callback != null) {
            callback.onRequestCreated(buildRequest(str, str2, adSize, str3, z10, this.mIntegrationType, this.mMediationVendor, Integer.valueOf(i10), z11));
        }
    }

    @Override // net.pubnative.lite.sdk.models.AdRequestFactory
    public AdRequest buildRequest(String str, String str2, AdSize adSize, String str3, boolean z10, IntegrationType integrationType, String str4, Integer num, boolean z11) {
        return buildRequest(null, str, str2, adSize, str3, z10, integrationType, str4, num, z11);
    }

    @Override // net.pubnative.lite.sdk.models.AdRequestFactory
    public void createAdRequest(final String str, final String str2, final AdSize adSize, boolean z10, final boolean z11, final AdRequestFactory.Callback callback) {
        boolean zLimitTracking;
        Context context;
        String str3;
        if (this.mDeviceInfo == null) {
            this.mDeviceInfo = HyBid.getDeviceInfo();
        }
        DeviceInfo deviceInfo = this.mDeviceInfo;
        if (deviceInfo != null) {
            String advertisingId = deviceInfo.getAdvertisingId();
            zLimitTracking = this.mDeviceInfo.limitTracking();
            context = this.mDeviceInfo.getContext();
            str3 = advertisingId;
        } else {
            zLimitTracking = false;
            context = null;
            str3 = null;
        }
        boolean z12 = zLimitTracking;
        this.mIsRewarded = z10;
        if (!TextUtils.isEmpty(str3) || context == null) {
            DeviceInfo deviceInfo2 = this.mDeviceInfo;
            if (deviceInfo2 == null || deviceInfo2.getContext() == null) {
                return;
            }
            processAdvertisingId(str, str2, adSize, str3, z12, new SessionImpressionPrefs(this.mDeviceInfo.getContext()).getImpressionDepth(str2).intValue(), z11, callback);
            return;
        }
        try {
            final int iIntValue = new SessionImpressionPrefs(this.mDeviceInfo.getContext()).getImpressionDepth(str2).intValue();
            new HyBidAdvertisingId(context).execute(new HyBidAdvertisingId.Listener() { // from class: net.pubnative.lite.sdk.models.g
                @Override // net.pubnative.lite.sdk.utils.HyBidAdvertisingId.Listener
                public final void onHyBidAdvertisingIdFinish(String str4, Boolean bool) {
                    PNAdRequestFactory.a(this.f95885a, str, str2, adSize, iIntValue, z11, callback, str4, bool);
                }
            });
        } catch (RejectedExecutionException e10) {
            Logger.e(TAG, "createAdRequest", e10);
        } catch (Exception unused) {
            Logger.e(TAG, "Error executing HyBidAdvertisingId AsyncTask");
        }
    }

    @Override // net.pubnative.lite.sdk.models.AdRequestFactory
    public void setAdFormat(String str) {
    }

    @Override // net.pubnative.lite.sdk.models.AdRequestFactory
    public void setIntegrationType(IntegrationType integrationType) {
        this.mIntegrationType = integrationType;
    }

    @Override // net.pubnative.lite.sdk.models.AdRequestFactory
    public void setMediationVendor(String str) {
        this.mMediationVendor = str;
    }

    PNAdRequestFactory(DeviceInfo deviceInfo, HyBidLocationManager hyBidLocationManager, UserDataManager userDataManager, SdkManager sdkManager, TopicManager topicManager) {
        this.mIntegrationType = IntegrationType.HEADER_BIDDING;
        this.mDeviceInfo = deviceInfo;
        this.mLocationManager = hyBidLocationManager;
        this.mUserDataManager = userDataManager;
        this.mSdkManager = sdkManager;
        this.mTopicManager = topicManager;
    }

    public AdRequest buildRequest(Context context, String str, String str2, AdSize adSize, String str3, boolean z10, IntegrationType integrationType, String str4, Integer num, boolean z11) {
        boolean zIsCCPAOptOut;
        Location userLocation;
        UserDataManager userDataManager;
        UserDataManager userDataManager2;
        UserDataManager userDataManager3;
        int i10;
        if (this.mUserDataManager == null && context != null) {
            this.mUserDataManager = new UserDataManager(context);
        }
        if (this.mDeviceInfo == null && context != null) {
            this.mDeviceInfo = new DeviceInfo(context);
        }
        if (this.mLocationManager == null && context != null) {
            this.mLocationManager = new HyBidLocationManager(context);
        }
        PNAdRequest pNAdRequest = new PNAdRequest();
        UserDataManager userDataManager4 = this.mUserDataManager;
        if (userDataManager4 != null) {
            zIsCCPAOptOut = userDataManager4.isCCPAOptOut();
            String iABUSPrivacyString = this.mUserDataManager.getIABUSPrivacyString();
            if (!TextUtils.isEmpty(iABUSPrivacyString)) {
                pNAdRequest.usprivacy = iABUSPrivacyString;
            }
            String iABGDPRConsentString = this.mUserDataManager.getIABGDPRConsentString();
            if (!TextUtils.isEmpty(iABGDPRConsentString)) {
                pNAdRequest.userconsent = iABGDPRConsentString;
            }
            String gppString = this.mUserDataManager.getGppString();
            if (!TextUtils.isEmpty(gppString)) {
                pNAdRequest.gppstring = gppString;
            }
            String gppSid = this.mUserDataManager.getGppSid();
            if (!TextUtils.isEmpty(gppSid)) {
                pNAdRequest.gppsid = gppSid.replace("_", StringUtils.COMMA);
            }
        } else {
            zIsCCPAOptOut = false;
        }
        pNAdRequest.zoneId = str2;
        pNAdRequest.appToken = TextUtils.isEmpty(str) ? HyBid.getAppToken() : str;
        pNAdRequest.os = "android";
        pNAdRequest.osver = this.mDeviceInfo.getOSVersion();
        pNAdRequest.coppa = HyBid.isCoppaEnabled() ? "1" : "0";
        BaseViewabilityManager visibilityManager = this.mSdkManager.getVisibilityManager();
        if (visibilityManager != null) {
            pNAdRequest.omidpn = visibilityManager.getPartnerName();
            pNAdRequest.omidpv = visibilityManager.getPartnerVersion();
        }
        pNAdRequest.isInterstitial = Boolean.valueOf(adSize == AdSize.SIZE_INTERSTITIAL);
        pNAdRequest.f95868ae = z11 ? "1" : "0";
        pNAdRequest.hver = HyBid.getHyBidVersion();
        String atomCohorts = getAtomCohorts();
        if (!TextUtils.isEmpty(atomCohorts)) {
            pNAdRequest.f95871vg = atomCohorts;
        }
        Integer num2 = null;
        if (adSize != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (pNAdRequest.isInterstitial.booleanValue()) {
                num2 = 5;
                arrayList2.add(1);
                arrayList2.add(2);
                i10 = 3;
            } else {
                arrayList.add(5);
                arrayList.add(6);
                arrayList2.add(5);
                arrayList2.add(6);
                i10 = 4;
            }
            int i11 = pNAdRequest.isInterstitial.booleanValue() ? 7 : 0;
            pNAdRequest.addSignal(new ImpressionBanner(i11, arrayList));
            pNAdRequest.addSignal(new ImpressionVideo(num2, Integer.valueOf(i10), i11, arrayList2));
            pNAdRequest.addSignal(new Impression(Integer.valueOf(pNAdRequest.isInterstitial.booleanValue() ? 1 : 0), 1));
        } else {
            pNAdRequest.addSignal(new Impression(null, 1));
        }
        if (HyBid.isCoppaEnabled() || z10 || TextUtils.isEmpty(str3) || zIsCCPAOptOut || ((userDataManager3 = this.mUserDataManager) != null && userDataManager3.isConsentDenied())) {
            pNAdRequest.dnt = "1";
        } else {
            pNAdRequest.gid = str3;
            DeviceInfo deviceInfo = this.mDeviceInfo;
            if (deviceInfo != null) {
                pNAdRequest.gidmd5 = deviceInfo.getAdvertisingIdMd5();
                pNAdRequest.gidsha1 = this.mDeviceInfo.getAdvertisingIdSha1();
            }
        }
        DeviceInfo deviceInfo2 = this.mDeviceInfo;
        if (deviceInfo2 != null) {
            pNAdRequest.devicemodel = deviceInfo2.getModel();
            pNAdRequest.make = this.mDeviceInfo.getMake();
            pNAdRequest.deviceType = String.valueOf(this.mDeviceInfo.getDeviceType());
            if (this.mDeviceInfo.getLocale() != null && this.mDeviceInfo.getLocale().getLanguage() != null && !this.mDeviceInfo.getLocale().getLanguage().isEmpty()) {
                pNAdRequest.locale = this.mDeviceInfo.getLocale().getLanguage();
                pNAdRequest.language = this.mDeviceInfo.getLocale().getLanguage();
            } else if (this.mDeviceInfo.getLangb() != null && !this.mDeviceInfo.getLangb().isEmpty()) {
                pNAdRequest.langb = this.mDeviceInfo.getLangb();
            }
            pNAdRequest.deviceHeight = this.mDeviceInfo.getDeviceHeight();
            pNAdRequest.deviceWidth = this.mDeviceInfo.getDeviceWidth();
            pNAdRequest.orientation = this.mDeviceInfo.getOrientation().toString();
            pNAdRequest.ppi = this.mDeviceInfo.getPpi();
            pNAdRequest.pxratio = this.mDeviceInfo.getPxratio();
            pNAdRequest.soundSetting = this.mDeviceInfo.getSoundSetting();
            pNAdRequest.js = "1";
            if (this.mDeviceInfo.getCarrier() != null && !this.mDeviceInfo.getCarrier().isEmpty()) {
                pNAdRequest.carrier = this.mDeviceInfo.getCarrier();
            }
            if (this.mDeviceInfo.getConnectionType() != null) {
                pNAdRequest.connectiontype = String.valueOf(this.mDeviceInfo.getConnectionType());
            }
            if (this.mDeviceInfo.getMccmnc() != null && !this.mDeviceInfo.getMccmnc().isEmpty()) {
                pNAdRequest.mccmnc = this.mDeviceInfo.getMccmnc();
            }
            if (this.mDeviceInfo.getMccmncsim() != null && !this.mDeviceInfo.getMccmncsim().isEmpty()) {
                pNAdRequest.mccmncsim = this.mDeviceInfo.getMccmncsim();
            }
            if (this.mDeviceInfo.getStructuredUserAgent() != null) {
                try {
                    JSONObject json = this.mDeviceInfo.getStructuredUserAgent().toJson();
                    if (json != null) {
                        pNAdRequest.sua = Base64.encodeToString(json.toString().getBytes(), 2);
                    }
                } catch (Exception unused) {
                }
            }
            pNAdRequest.geofetch = "1";
        }
        if (!HyBid.isCoppaEnabled() && !z10 && !zIsCCPAOptOut && ((userDataManager2 = this.mUserDataManager) == null || !userDataManager2.isConsentDenied())) {
            pNAdRequest.age = HyBid.getAge();
            pNAdRequest.gender = HyBid.getGender();
            pNAdRequest.keywords = HyBid.getKeywords();
        }
        pNAdRequest.bundleid = HyBid.getBundleId();
        pNAdRequest.testMode = HyBid.isTestMode() ? "1" : "0";
        if (adSize == null) {
            pNAdRequest.f95869af = getDefaultNativeAssetFields();
        } else {
            pNAdRequest.al = adSize.getAdLayoutSize();
            if (adSize.getWidth() != 0) {
                pNAdRequest.width = String.valueOf(adSize.getWidth());
            }
            if (adSize.getHeight() != 0) {
                pNAdRequest.height = String.valueOf(adSize.getHeight());
            }
        }
        pNAdRequest.f95870mf = getDefaultMetaFields();
        String supportedProtocols = getSupportedProtocols();
        if (!TextUtils.isEmpty(supportedProtocols)) {
            pNAdRequest.protocol = supportedProtocols;
        }
        String supportedApis = getSupportedApis();
        if (!TextUtils.isEmpty(supportedApis)) {
            pNAdRequest.api = supportedApis;
        }
        DisplayManager displayManager = this.mSdkManager.getDisplayManager();
        pNAdRequest.displaymanager = displayManager.getDisplayManagerName();
        pNAdRequest.displaymanagerver = displayManager.getDisplayManagerVersion(str4, integrationType);
        HyBidLocationManager hyBidLocationManager = this.mLocationManager;
        if (hyBidLocationManager != null && (userLocation = hyBidLocationManager.getUserLocation()) != null && !HyBid.isCoppaEnabled() && !z10 && (((userDataManager = this.mUserDataManager) == null || !userDataManager.isConsentDenied()) && !zIsCCPAOptOut && HyBid.isLocationTrackingEnabled())) {
            Locale locale = Locale.ENGLISH;
            pNAdRequest.latitude = String.format(locale, "%.2f", Double.valueOf(userLocation.getLatitude()));
            pNAdRequest.longitude = String.format(locale, "%.2f", Double.valueOf(userLocation.getLongitude()));
            if (userLocation.hasAccuracy() && userLocation.getAccuracy() != 0.0f) {
                pNAdRequest.addSignal(new GeoLocation(Integer.valueOf((int) userLocation.getAccuracy()), formatUTCTime()));
            }
        }
        Signal signalFillExtensionsObject = fillExtensionsObject(this.mDeviceInfo);
        if (signalFillExtensionsObject != null) {
            pNAdRequest.addSignal(signalFillExtensionsObject);
        }
        if (this.mIsRewarded) {
            pNAdRequest.rv = "1";
        } else {
            pNAdRequest.rv = "0";
        }
        pNAdRequest.impdepth = String.valueOf(num);
        try {
            pNAdRequest.ageofapp = new HyBidTimeUtils().getDaysSince(Long.parseLong(getAgeOfApp()));
        } catch (NumberFormatException unused2) {
        }
        pNAdRequest.sessionduration = new HyBidTimeUtils().getSeconds(calculateSessionDuration());
        TopicManager topicManager = this.mTopicManager;
        if (topicManager != null) {
            pNAdRequest.topics = topicManager.getTopics();
        }
        return pNAdRequest;
    }
}
