package com.pubmatic.sdk.openwrap.core.signal;

import android.content.Context;
import com.ironsource.C4240b4;
import com.pubmatic.sdk.common.POBAdFormat;
import com.pubmatic.sdk.common.POBAdSize;
import com.pubmatic.sdk.common.POBInstanceProvider;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.models.POBApplicationInfo;
import com.pubmatic.sdk.common.models.POBUserInfo;
import com.pubmatic.sdk.common.utility.POBExtensionsKt;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.openwrap.core.POBBanner;
import com.pubmatic.sdk.openwrap.core.POBCommonOrtbJsonHelper;
import com.pubmatic.sdk.openwrap.core.POBImpression;
import com.pubmatic.sdk.openwrap.core.POBRequest;
import com.pubmatic.sdk.openwrap.core.POBVideo;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.y;
import java.net.URL;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\f\b&\u0018\u0000 !2\u00020\u0001:\u0001!B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0014¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0014¢\u0006\u0004\b\r\u0010\nJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0012\u0010\nJ\u000f\u0010\u0013\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0013\u0010\nJ\u000f\u0010\u0014\u001a\u00020\u000eH$¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/pubmatic/sdk/openwrap/core/signal/POBBaseSignalBuilder;", "Lcom/pubmatic/sdk/openwrap/core/signal/POBSignalBuilding;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Lcom/pubmatic/sdk/openwrap/core/signal/POBSignalConfig;", "signalConfig", "<init>", "(Landroid/content/Context;Lcom/pubmatic/sdk/openwrap/core/signal/POBSignalConfig;)V", "Lorg/json/JSONObject;", "getAppInfo", "()Lorg/json/JSONObject;", "getDeviceInfo", "getUserInfo", "getRegsInfo", "Lcom/pubmatic/sdk/openwrap/core/POBImpression;", "impression", "getImpressionInfo", "(Lcom/pubmatic/sdk/openwrap/core/POBImpression;)Lorg/json/JSONObject;", "getExtensionInfo", "getOMSDKInfo", "createImpression", "()Lcom/pubmatic/sdk/openwrap/core/POBImpression;", "", "build", "()Ljava/lang/String;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b", "Lcom/pubmatic/sdk/openwrap/core/signal/POBSignalConfig;", "getSignalConfig", "()Lcom/pubmatic/sdk/openwrap/core/signal/POBSignalConfig;", y.f66058y, "openwrapcore_release"}, k = 1, mv = {1, 7, 1})
public abstract class POBBaseSignalBuilder implements POBSignalBuilding {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final POBSignalConfig signalConfig;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[POBUserInfo.Gender.values().length];
            iArr[POBUserInfo.Gender.MALE.ordinal()] = 1;
            iArr[POBUserInfo.Gender.FEMALE.ordinal()] = 2;
            iArr[POBUserInfo.Gender.OTHER.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[POBAdFormat.values().length];
            iArr2[POBAdFormat.BANNER.ordinal()] = 1;
            iArr2[POBAdFormat.MREC.ordinal()] = 2;
            iArr2[POBAdFormat.INTERSTITIAL.ordinal()] = 3;
            iArr2[POBAdFormat.REWARDEDAD.ordinal()] = 4;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public POBBaseSignalBuilder(@NotNull Context context, @NotNull POBSignalConfig signalConfig) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(signalConfig, "signalConfig");
        this.context = context;
        this.signalConfig = signalConfig;
    }

    @Override // com.pubmatic.sdk.openwrap.core.signal.POBSignalBuilding
    @NotNull
    public String build() {
        JSONObject jSONObject = new JSONObject();
        try {
            POBInstanceProvider.getDeviceInfo(this.context).refreshAdvertisingIdInfo();
            jSONObject.putOpt(C4240b4.i.G, getDeviceInfo());
            POBExtensionsKt.putIfNotEmpty(jSONObject, "app", getAppInfo());
            POBExtensionsKt.putIfNotEmpty(jSONObject, "user", getUserInfo());
            POBExtensionsKt.putIfNotEmpty(jSONObject, "regs", getRegsInfo());
            jSONObject.putOpt("imp", new JSONArray().put(getImpressionInfo(createImpression())));
            jSONObject.putOpt("ext", getExtensionInfo());
            POBExtensionsKt.putIfNotEmpty(jSONObject, "source", getOMSDKInfo());
        } catch (JSONException e10) {
            POBLog.error("POBBaseSignalBuilder", "Exception occurred while building signal, reason : " + e10.getMessage(), new Object[0]);
        }
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "ortbJson.toString()");
        return string;
    }

    @NotNull
    protected abstract POBImpression createImpression();

    @NotNull
    protected JSONObject getAppInfo() {
        POBApplicationInfo applicationInfo = POBInstanceProvider.getSdkConfig().getApplicationInfo();
        JSONObject jSONObject = new JSONObject();
        if (applicationInfo != null) {
            try {
                POBExtensionsKt.putIfNotNullOrEmpty(jSONObject, C4240b4.j.D, applicationInfo.getDomain());
                Boolean it = applicationInfo.isPaid();
                if (it != null) {
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    jSONObject.put("paid", it.booleanValue() ? 1 : 0);
                }
                POBExtensionsKt.putIfNotNullOrEmpty(jSONObject, "keywords", applicationInfo.getKeywords());
                URL storeURL = applicationInfo.getStoreURL();
                POBExtensionsKt.putIfNotNullOrEmpty(jSONObject, "storeurl", storeURL != null ? storeURL.toString() : null);
                return jSONObject;
            } catch (JSONException e10) {
                POBLog.error("POBBaseSignalBuilder", "Exception occurred in getAppInfo() : " + e10.getMessage(), new Object[0]);
                Unit unit = Unit.f93236a;
            }
        }
        return jSONObject;
    }

    @NotNull
    protected final Context getContext() {
        return this.context;
    }

    @NotNull
    protected JSONObject getDeviceInfo() {
        return POBCommonOrtbJsonHelper.getDeviceObject(POBInstanceProvider.getDeviceInfo(this.context), POBInstanceProvider.getLocationDetector(this.context), this.context);
    }

    @NotNull
    protected JSONObject getExtensionInfo() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("clientconfig", 1);
            jSONObject.put("wrapper", jSONObject2);
            return jSONObject;
        } catch (JSONException e10) {
            POBLog.error("POBBaseSignalBuilder", "Exception occurred in getExtObject() : " + e10.getMessage(), new Object[0]);
            return jSONObject;
        }
    }

    @NotNull
    protected JSONObject getImpressionInfo(@NotNull POBImpression impression) throws JSONException {
        Intrinsics.checkNotNullParameter(impression, "impression");
        int i10 = WhenMappings.$EnumSwitchMapping$1[this.signalConfig.getAdFormat().ordinal()];
        if (i10 == 1) {
            impression.setBanner(new POBBanner());
            impression.setMRAIDAppStatusEnabled(POBImpression.canEnableMRAIDAppStatus(this.context));
        } else if (i10 == 2) {
            impression.setBanner(new POBBanner());
            impression.setVideo(new POBVideo(POBVideo.Placement.IN_BANNER, POBVideo.Plcmt.STANDALONE, POBVideo.Linearity.LINEAR, POBAdSize.BANNER_SIZE_300x250));
            impression.setCtaOverlayEnabled(true);
            impression.setMRAIDAppStatusEnabled(POBImpression.canEnableMRAIDAppStatus(this.context));
        } else if (i10 == 3) {
            POBAdSize interstitialAdSize = POBUtils.getInterstitialAdSize(this.context.getApplicationContext());
            impression.setAdPosition(POBRequest.AdPosition.FULL_SCREEN);
            impression.setBanner(new POBBanner());
            impression.setVideo(new POBVideo(POBVideo.Placement.INTERSTITIAL, POBVideo.Plcmt.INTERSTITIAL, POBVideo.Linearity.LINEAR, interstitialAdSize));
            impression.setCtaOverlayEnabled(true);
            impression.setMRAIDAppStatusEnabled(POBImpression.canEnableMRAIDAppStatus(this.context));
        } else if (i10 == 4) {
            POBAdSize interstitialAdSize2 = POBUtils.getInterstitialAdSize(this.context.getApplicationContext());
            impression.setAdPosition(POBRequest.AdPosition.FULL_SCREEN);
            impression.setVideo(new POBVideo(POBVideo.Placement.INTERSTITIAL, POBVideo.Plcmt.INTERSTITIAL, POBVideo.Linearity.LINEAR, interstitialAdSize2));
            impression.setCtaOverlayEnabled(true);
            impression.setMRAIDAppStatusEnabled(POBImpression.canEnableMRAIDAppStatus(this.context));
        }
        JSONObject impressionJson = impression.getImpressionJson();
        Intrinsics.checkNotNullExpressionValue(impressionJson, "impression.getImpressionJson()");
        return impressionJson;
    }

    @NotNull
    protected JSONObject getOMSDKInfo() {
        if (POBInstanceProvider.getSdkConfig().getMeasurementProvider("com.pubmatic.sdk.omsdk.POBHTMLMeasurement") == null) {
            return new JSONObject();
        }
        JSONObject measurementJson = POBCommonOrtbJsonHelper.getMeasurementJson();
        return measurementJson == null ? new JSONObject() : measurementJson;
    }

    @NotNull
    protected JSONObject getRegsInfo() {
        JSONObject regsJson = POBCommonOrtbJsonHelper.getRegsJson(this.context);
        return regsJson == null ? new JSONObject() : regsJson;
    }

    @NotNull
    protected final POBSignalConfig getSignalConfig() {
        return this.signalConfig;
    }

    @NotNull
    protected JSONObject getUserInfo() {
        JSONObject jSONObject = new JSONObject();
        try {
            POBUserInfo it = POBInstanceProvider.getSdkConfig().getUserInfo();
            if (it != null) {
                POBUserInfo.Gender gender = it.getGender();
                int i10 = gender == null ? -1 : WhenMappings.$EnumSwitchMapping$0[gender.ordinal()];
                if (i10 == 1) {
                    jSONObject.put("gender", "M");
                } else if (i10 == 2) {
                    jSONObject.put("gender", "F");
                } else if (i10 == 3) {
                    jSONObject.put("gender", "O");
                }
                if (it.getBirthYear() > 0) {
                    jSONObject.put("yob", it.getBirthYear());
                }
                if (!POBUtils.isNullOrEmpty(it.getKeywords())) {
                    jSONObject.put("keywords", it.getKeywords());
                }
                Intrinsics.checkNotNullExpressionValue(it, "it");
                JSONArray userDataJson = POBCommonOrtbJsonHelper.getUserDataJson(it);
                if (userDataJson.length() > 0) {
                    jSONObject.put("data", userDataJson);
                }
            }
            return jSONObject;
        } catch (JSONException e10) {
            POBLog.error("POBBaseSignalBuilder", "Exception occurred in getUserInfo() : " + e10.getMessage(), new Object[0]);
            return jSONObject;
        }
    }
}
