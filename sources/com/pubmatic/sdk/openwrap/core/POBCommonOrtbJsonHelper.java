package com.pubmatic.sdk.openwrap.core;

import android.app.Application;
import android.content.Context;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.amazon.device.ads.DtbConstants;
import com.ironsource.A1;
import com.ironsource.C4240b4;
import com.ironsource.D5;
import com.ironsource.N6;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.mobilefuse.sdk.privacy.IabString;
import com.pubmatic.sdk.common.POBAdFormat;
import com.pubmatic.sdk.common.POBInstanceProvider;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.models.POBDSAComplianceStatus;
import com.pubmatic.sdk.common.models.POBDataProvider;
import com.pubmatic.sdk.common.models.POBDeviceInfo;
import com.pubmatic.sdk.common.models.POBExternalUserId;
import com.pubmatic.sdk.common.models.POBLocation;
import com.pubmatic.sdk.common.models.POBSegment;
import com.pubmatic.sdk.common.models.POBUserInfo;
import com.pubmatic.sdk.common.network.POBNetworkMonitor;
import com.pubmatic.sdk.common.utility.POBExtensionsKt;
import com.pubmatic.sdk.common.utility.POBLocationDetector;
import com.pubmatic.sdk.common.utility.POBSharedPreferenceUtil;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.g.q;
import io.bidmachine.ProtoExtConstants;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u0010\u001a\u00020\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001f\u0010\u0017J\u001f\u0010 \u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b \u0010!J\u001f\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001f\u0010!J+\u0010&\u001a\u00020\u00152\b\u0010\"\u001a\u0004\u0018\u00010\u000f2\u0006\u0010$\u001a\u00020#2\b\u0010%\u001a\u0004\u0018\u00010#H\u0007¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00062\u0006\u0010)\u001a\u00020(H\u0007¢\u0006\u0004\b*\u0010+J\u001f\u0010\u001f\u001a\u00020\u00152\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001f\u0010/J\u001f\u00100\u001a\u00020\u00152\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\u000fH\u0002¢\u0006\u0004\b0\u0010/J\u001f\u0010 \u001a\u00020\u00152\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\u000fH\u0002¢\u0006\u0004\b \u0010/J!\u00101\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b1\u00102J\u001d\u00103\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b3\u0010!J\u001d\u00104\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b4\u0010!J\u001f\u00105\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b5\u0010\u001bJ'\u00107\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u00106\u001a\u00020\u000f¢\u0006\u0004\b7\u00108J\u001d\u0010:\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00109\u001a\u00020\u000f¢\u0006\u0004\b:\u0010!J\u0015\u0010;\u001a\u00020\u00152\u0006\u00109\u001a\u00020\u000f¢\u0006\u0004\b;\u0010\u0017J\u001d\u0010<\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00109\u001a\u00020\u000f¢\u0006\u0004\b<\u0010!J\u001b\u0010@\u001a\u00020\u00062\f\u0010?\u001a\b\u0012\u0004\u0012\u00020>0=¢\u0006\u0004\b@\u0010AR\u0014\u0010B\u001a\u00020#8\u0006X\u0086T¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006D"}, d2 = {"Lcom/pubmatic/sdk/openwrap/core/POBCommonOrtbJsonHelper;", "", "<init>", "()V", "Lcom/pubmatic/sdk/openwrap/core/POBRequest;", "request", "Lorg/json/JSONArray;", "getImpressionJsonArray", "(Lcom/pubmatic/sdk/openwrap/core/POBRequest;)Lorg/json/JSONArray;", "Lcom/pubmatic/sdk/common/models/POBDeviceInfo;", "deviceInfo", "Lcom/pubmatic/sdk/common/utility/POBLocationDetector;", "locationDetector", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Lorg/json/JSONObject;", "getDeviceObject", "(Lcom/pubmatic/sdk/common/models/POBDeviceInfo;Lcom/pubmatic/sdk/common/utility/POBLocationDetector;Landroid/content/Context;)Lorg/json/JSONObject;", "getMeasurementJson", "()Lorg/json/JSONObject;", "regsExt", "", "addDsaData", "(Lorg/json/JSONObject;)V", "Lcom/pubmatic/sdk/common/POBAdFormat;", "placementType", "getUserJson", "(Landroid/content/Context;Lcom/pubmatic/sdk/common/POBAdFormat;)Lorg/json/JSONObject;", "getRegsJson", "(Landroid/content/Context;)Lorg/json/JSONObject;", "regsJsonObject", "a", "b", "(Landroid/content/Context;Lorg/json/JSONObject;)V", "json", "", C4240b4.i.W, "param", "addParamToJson", "(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/pubmatic/sdk/common/models/POBUserInfo;", "userInfo", "getUserDataJson", "(Lcom/pubmatic/sdk/common/models/POBUserInfo;)Lorg/json/JSONArray;", "Lcom/pubmatic/sdk/common/models/POBDataProvider;", "dataProvider", "dataJson", "(Lcom/pubmatic/sdk/common/models/POBDataProvider;Lorg/json/JSONObject;)V", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "getGeoObject", "(Lcom/pubmatic/sdk/common/utility/POBLocationDetector;Lcom/pubmatic/sdk/common/models/POBDeviceInfo;)Lorg/json/JSONObject;", "addGpp", "addGppSid", "getUserExtJson", "userExtJsonObject", "addImpDepth", "(Landroid/content/Context;Lcom/pubmatic/sdk/common/POBAdFormat;Lorg/json/JSONObject;)V", "userExt", "addGdprConsent", "addUserIds", "addSessionDuration", "", "Lcom/pubmatic/sdk/common/models/POBExternalUserId;", "userIds", "buildUidJsonArray", "(Ljava/util/List;)Lorg/json/JSONArray;", "TAG", "Ljava/lang/String;", "openwrapcore_release"}, k = 1, mv = {1, 7, 1})
public final class POBCommonOrtbJsonHelper {

    @NotNull
    public static final POBCommonOrtbJsonHelper INSTANCE = new POBCommonOrtbJsonHelper();

    @NotNull
    public static final String TAG = "POBCommonOrtbJsonHelper";

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[POBUserInfo.Gender.values().length];
            iArr[POBUserInfo.Gender.MALE.ordinal()] = 1;
            iArr[POBUserInfo.Gender.FEMALE.ordinal()] = 2;
            iArr[POBUserInfo.Gender.OTHER.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private POBCommonOrtbJsonHelper() {
    }

    private final void a(JSONObject regsJsonObject) throws JSONException {
        Boolean boolIsCoppa = POBInstanceProvider.getSdkConfig().isCoppa();
        if (boolIsCoppa != null) {
            regsJsonObject.put("coppa", boolIsCoppa.booleanValue() ? 1 : 0);
        }
    }

    public static final void addDsaData(@NotNull JSONObject regsExt) throws JSONException {
        Intrinsics.checkNotNullParameter(regsExt, "regsExt");
        POBDSAComplianceStatus dsaComplianceStatus = POBInstanceProvider.getSdkConfig().getDsaComplianceStatus();
        Intrinsics.checkNotNullExpressionValue(dsaComplianceStatus, "getSdkConfig().dsaComplianceStatus");
        if (dsaComplianceStatus != POBDSAComplianceStatus.NOT_REQUIRED) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("dsarequired", dsaComplianceStatus.getValue());
            jSONObject.put("pubrender", 2);
            jSONObject.put("datatopub", 1);
            regsExt.put("dsa", jSONObject);
        }
    }

    public static final void addParamToJson(@Nullable JSONObject json, @NotNull String key, @Nullable String param) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (json == null || POBUtils.isNullOrEmpty(param)) {
            return;
        }
        try {
            json.put(key, param);
        } catch (JSONException unused) {
            POBLog.warn(TAG, "Unable to add " + key + " and " + param, new Object[0]);
        }
    }

    private final void b(Context context, JSONObject regsExt) throws JSONException {
        Integer integerFromSharedPreference = POBSharedPreferenceUtil.getIntegerFromSharedPreference(context, "IABTCF_gdprApplies");
        if (integerFromSharedPreference != null) {
            regsExt.put("gdpr", integerFromSharedPreference.intValue());
        }
    }

    private final void c(POBDataProvider dataProvider, JSONObject dataJson) throws JSONException {
        Map<String, POBSegment> segments = dataProvider.getSegments();
        Intrinsics.checkNotNullExpressionValue(segments, "dataProvider.segments");
        if (segments.isEmpty()) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        for (POBSegment pOBSegment : segments.values()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", pOBSegment.getSegId());
            String it = pOBSegment.getName();
            if (it != null) {
                Intrinsics.checkNotNullExpressionValue(it, "it");
                if (it.length() <= 0) {
                    it = null;
                }
                if (it != null) {
                    jSONObject.put("name", it);
                }
            }
            String it2 = pOBSegment.getValue();
            if (it2 != null) {
                Intrinsics.checkNotNullExpressionValue(it2, "it");
                String str = it2.length() > 0 ? it2 : null;
                if (str != null) {
                    jSONObject.put("value", str);
                }
            }
            jSONArray.put(jSONObject);
        }
        if (jSONArray.length() > 0) {
            dataJson.put(A1.f40174i, jSONArray);
        }
    }

    @NotNull
    public static final JSONObject getDeviceObject(@Nullable POBDeviceInfo deviceInfo, @Nullable POBLocationDetector locationDetector, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        JSONObject jSONObject = new JSONObject();
        if (deviceInfo != null) {
            try {
                jSONObject.put("geo", getGeoObject(locationDetector, deviceInfo));
                jSONObject.put("pxratio", deviceInfo.getPxratio());
                jSONObject.put("mccmnc", deviceInfo.getMccmnc());
                Boolean lmtEnabled = deviceInfo.getLmtEnabled();
                if (lmtEnabled != null) {
                    Intrinsics.checkNotNullExpressionValue(lmtEnabled, "lmtEnabled");
                    jSONObject.put(EidRequestBuilder.REQUEST_FIELD_LMT, lmtEnabled.booleanValue() ? 1 : 0);
                }
                String advertisingID = deviceInfo.getAdvertisingID();
                if (advertisingID != null && POBInstanceProvider.getSdkConfig().isAllowAdvertisingId()) {
                    jSONObject.put(EidRequestBuilder.REQUEST_FIELD_IFA, advertisingID);
                }
                POBNetworkMonitor.ConnectionType connectionType = POBInstanceProvider.getNetworkMonitor(context).getConnectionType();
                Intrinsics.checkNotNullExpressionValue(connectionType, "getNetworkMonitor(context).connectionType");
                jSONObject.put(D5.f40558e, connectionType.getValue());
                addParamToJson(jSONObject, N6.Q0, deviceInfo.getCarrierName());
                jSONObject.put("js", 1);
                jSONObject.put(N6.f41375d0, POBInstanceProvider.getCacheManager(context).fetchUserAgent());
                jSONObject.put(N6.f41422t, deviceInfo.getMake());
                jSONObject.put("model", deviceInfo.getModel());
                jSONObject.put("hwv", deviceInfo.getHardwareVersion());
                jSONObject.put("os", deviceInfo.getOsName());
                jSONObject.put(N6.G, deviceInfo.getOsVersion());
                jSONObject.put("h", deviceInfo.getScreenHeight());
                jSONObject.put(POBCoreNativeConstants.NATIVE_IMAGE_WIDTH, deviceInfo.getScreenWidth());
                jSONObject.put("language", deviceInfo.getAcceptLanguage());
                jSONObject.put("devicetype", POBUtils.isTablet(context) ? 5 : 4);
                POBExtensionsKt.putIfNotNullOrEmpty(jSONObject, "ip", deviceInfo.getDeviceIp());
                return jSONObject;
            } catch (Exception e10) {
                POBLog.error(TAG, "Exception occurred in getDeviceObject() : " + e10.getMessage(), new Object[0]);
                Unit unit = Unit.f93236a;
            }
        }
        return jSONObject;
    }

    @NotNull
    public static final JSONObject getGeoObject(@Nullable POBLocationDetector locationDetector, @NotNull POBDeviceInfo deviceInfo) {
        int accuracy;
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        JSONObject jSONObject = new JSONObject();
        try {
            POBUserInfo userInfo = POBInstanceProvider.getSdkConfig().getUserInfo();
            if (userInfo != null) {
                addParamToJson(jSONObject, "region", userInfo.getRegion());
                addParamToJson(jSONObject, "city", userInfo.getCity());
                addParamToJson(jSONObject, "metro", userInfo.getMetro());
                addParamToJson(jSONObject, "zip", userInfo.getZip());
            }
            addParamToJson(jSONObject, "country", deviceInfo.getISOAlpha3CountryCode());
            jSONObject.put("utcoffset", deviceInfo.getTimeZoneOffsetInMinutes());
            POBLocation location = POBUtils.getLocation(locationDetector);
            if (location != null) {
                POBLocation.Source source = location.getSource();
                if (source != null) {
                    jSONObject.put("type", source.getValue());
                }
                jSONObject.put(N6.f41419s, location.getLatitude());
                jSONObject.put("lon", location.getLongitude());
                if (location.getSource() == POBLocation.Source.GPS && (accuracy = (int) location.getAccuracy()) > 0) {
                    jSONObject.put("accuracy", accuracy);
                }
                long lastFixInMillis = location.getLastFixInMillis();
                if (lastFixInMillis > 0) {
                    jSONObject.put("lastfix", lastFixInMillis / ((long) 1000));
                    return jSONObject;
                }
            }
        } catch (Exception e10) {
            POBLog.error(TAG, "Exception occurred in getGeoObject() : " + e10.getMessage(), new Object[0]);
        }
        return jSONObject;
    }

    @NotNull
    public static final JSONArray getImpressionJsonArray(@NotNull POBRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        JSONArray jSONArray = new JSONArray();
        POBImpression[] impressions = request.getImpressions();
        if (impressions != null) {
            for (POBImpression pOBImpression : impressions) {
                try {
                    jSONArray.put(pOBImpression.getImpressionJson());
                } catch (JSONException e10) {
                    POBLog.error(TAG, "Exception occurred in getImpressionJson(): " + e10.getMessage(), new Object[0]);
                }
            }
        }
        return jSONArray;
    }

    @Nullable
    public static final JSONObject getMeasurementJson() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt(ProtoExtConstants.Source.OMID_PN, "Pubmatic");
            jSONObject.putOpt(ProtoExtConstants.Source.OMID_PV, "4.10.0");
            return new JSONObject().putOpt("ext", jSONObject);
        } catch (JSONException e10) {
            POBLog.error(TAG, "Exception occurred in getMeasurementParam() : " + e10.getMessage(), new Object[0]);
            return null;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Nullable
    public static final JSONObject getRegsJson(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            JSONObject jSONObject = new JSONObject();
            POBCommonOrtbJsonHelper pOBCommonOrtbJsonHelper = INSTANCE;
            pOBCommonOrtbJsonHelper.a(jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            pOBCommonOrtbJsonHelper.b(context, jSONObject2);
            pOBCommonOrtbJsonHelper.a(context, jSONObject2);
            pOBCommonOrtbJsonHelper.addGpp(context, jSONObject2);
            pOBCommonOrtbJsonHelper.addGppSid(context, jSONObject2);
            addDsaData(jSONObject2);
            if (jSONObject2.length() != 0) {
                jSONObject.put("ext", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException e10) {
            POBLog.error(TAG, "Exception occurred in getRegsJson() : " + e10.getMessage(), new Object[0]);
            return null;
        }
    }

    @NotNull
    public static final JSONArray getUserDataJson(@NotNull POBUserInfo userInfo) {
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        JSONArray jSONArray = new JSONArray();
        try {
            List<POBDataProvider> dataProviders = userInfo.getDataProviders();
            Intrinsics.checkNotNullExpressionValue(dataProviders, "userInfo.getDataProviders()");
            for (POBDataProvider dataProvider : dataProviders) {
                JSONObject jSONObject = new JSONObject();
                POBCommonOrtbJsonHelper pOBCommonOrtbJsonHelper = INSTANCE;
                Intrinsics.checkNotNullExpressionValue(dataProvider, "dataProvider");
                pOBCommonOrtbJsonHelper.a(dataProvider, jSONObject);
                pOBCommonOrtbJsonHelper.c(dataProvider, jSONObject);
                pOBCommonOrtbJsonHelper.b(dataProvider, jSONObject);
                jSONArray.put(jSONObject);
            }
        } catch (JSONException e10) {
            POBLog.error(TAG, "Exception occurred in getUserDataJson() : " + e10.getMessage(), new Object[0]);
        }
        return jSONArray;
    }

    @NotNull
    public static final JSONObject getUserJson(@NotNull Context context, @Nullable POBAdFormat placementType) {
        Intrinsics.checkNotNullParameter(context, "context");
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
                JSONArray userDataJson = getUserDataJson(it);
                if (userDataJson.length() > 0) {
                    jSONObject.put("data", userDataJson);
                }
            }
            JSONObject userExtJson = INSTANCE.getUserExtJson(context, placementType);
            if (userExtJson.length() > 0) {
                jSONObject.put("ext", userExtJson);
            }
            return jSONObject;
        } catch (JSONException e10) {
            POBLog.error(TAG, "Exception occurred in getUserJson() : " + e10.getMessage(), new Object[0]);
            return jSONObject;
        }
    }

    public final void addGdprConsent(@NotNull Context context, @NotNull JSONObject userExt) throws JSONException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(userExt, "userExt");
        String stringFromSharedPreference = POBSharedPreferenceUtil.getStringFromSharedPreference(context, "IABTCF_TCString", null);
        if (POBUtils.isNullOrEmpty(stringFromSharedPreference)) {
            return;
        }
        userExt.put(C4240b4.j.f42669b0, stringFromSharedPreference);
    }

    public final void addGpp(@NotNull Context context, @NotNull JSONObject regsExt) throws JSONException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(regsExt, "regsExt");
        String stringFromSharedPreference = POBSharedPreferenceUtil.getStringFromSharedPreference(context, "IABGPP_HDR_GppString", null);
        if (POBUtils.isNullOrEmpty(stringFromSharedPreference)) {
            return;
        }
        regsExt.put(EidRequestBuilder.REQUEST_FIELD_GPP, stringFromSharedPreference);
    }

    public final void addGppSid(@NotNull Context context, @NotNull JSONObject regsExt) throws JSONException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(regsExt, "regsExt");
        String stringFromSharedPreference = POBSharedPreferenceUtil.getStringFromSharedPreference(context, q.f66282l, null);
        if (stringFromSharedPreference != null) {
            JSONArray jSONArray = new JSONArray();
            for (String str : StringsKt.split$default(stringFromSharedPreference, new String[]{"_"}, false, 0, 6, null)) {
                try {
                    jSONArray.put(Integer.parseInt(str));
                } catch (NumberFormatException unused) {
                    POBLog.warn(TAG, "Invalid GPP_SID value is passed: %s", str);
                }
            }
            if (jSONArray.length() > 0) {
                regsExt.put("gpp_sid", jSONArray);
            }
        }
    }

    public final void addImpDepth(@NotNull Context context, @Nullable POBAdFormat placementType, @NotNull JSONObject userExtJsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(userExtJsonObject, "userExtJsonObject");
        if (placementType != null) {
            Context applicationContext = context.getApplicationContext();
            Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
            if (application != null) {
                userExtJsonObject.put("impdepth", POBInstanceProvider.getImpDepthHandler(POBInstanceProvider.getApplicationSessionHandler(application)).getImpressions(placementType));
            } else {
                POBLog.error(TAG, "Failed to get application instance", new Object[0]);
            }
        }
    }

    public final void addSessionDuration(@NotNull Context context, @NotNull JSONObject userExt) throws JSONException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(userExt, "userExt");
        Context applicationContext = context.getApplicationContext();
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        if (application != null) {
            userExt.put("sessionduration", POBInstanceProvider.getApplicationSessionHandler(application).getSessionDuration());
        } else {
            POBLog.error(TAG, "Failed to get application instance", new Object[0]);
        }
    }

    public final void addUserIds(@NotNull JSONObject userExt) throws JSONException {
        Intrinsics.checkNotNullParameter(userExt, "userExt");
        Map<String, List<POBExternalUserId>> externalUserIds = POBInstanceProvider.getSdkConfig().getExternalUserIds();
        Intrinsics.checkNotNullExpressionValue(externalUserIds, "getSdkConfig().externalUserIds");
        JSONArray jSONArray = new JSONArray();
        if (externalUserIds.isEmpty()) {
            externalUserIds = null;
        }
        if (externalUserIds != null) {
            for (Map.Entry<String, List<POBExternalUserId>> entry : externalUserIds.entrySet()) {
                String key = entry.getKey();
                List<POBExternalUserId> value = entry.getValue();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("source", key);
                POBCommonOrtbJsonHelper pOBCommonOrtbJsonHelper = INSTANCE;
                Intrinsics.checkNotNullExpressionValue(value, "value");
                jSONObject.put("uids", pOBCommonOrtbJsonHelper.buildUidJsonArray(value));
                jSONArray.put(jSONObject);
            }
        }
        if (jSONArray.length() > 0) {
            userExt.put("eids", jSONArray);
        }
    }

    @NotNull
    public final JSONArray buildUidJsonArray(@NotNull List<? extends POBExternalUserId> userIds) throws JSONException {
        Intrinsics.checkNotNullParameter(userIds, "userIds");
        JSONArray jSONArray = new JSONArray();
        for (POBExternalUserId pOBExternalUserId : userIds) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", pOBExternalUserId.getId());
            if (pOBExternalUserId.getAtype() > 0) {
                jSONObject.put("atype", pOBExternalUserId.getAtype());
            }
            JSONObject extension = pOBExternalUserId.getExtension();
            if (extension != null) {
                if (extension.length() == 0) {
                    extension = null;
                }
                if (extension != null) {
                    jSONObject.put("ext", extension);
                }
            }
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    @NotNull
    public final JSONObject getUserExtJson(@NotNull Context context, @Nullable POBAdFormat placementType) {
        Intrinsics.checkNotNullParameter(context, "context");
        JSONObject jSONObject = new JSONObject();
        try {
            addGdprConsent(context, jSONObject);
            addUserIds(jSONObject);
            addSessionDuration(context, jSONObject);
            addImpDepth(context, placementType, jSONObject);
            POBLog.debug(TAG, jSONObject.toString(), new Object[0]);
            return jSONObject;
        } catch (JSONException e10) {
            POBLog.error(TAG, "Exception occurred in getUserExtJson() : " + e10.getMessage(), new Object[0]);
            return jSONObject;
        }
    }

    private final void a(Context context, JSONObject regsExt) throws JSONException {
        String stringFromSharedPreference = POBSharedPreferenceUtil.getStringFromSharedPreference(context, IabString.IAB_US_PRIVACY_STRING, null);
        if (POBUtils.isNullOrEmpty(stringFromSharedPreference)) {
            return;
        }
        regsExt.put(DtbConstants.APS_ADMOB_CONST_CCPA_US_PRIVACY, stringFromSharedPreference);
    }

    private final void b(POBDataProvider dataProvider, JSONObject dataJson) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject ext = dataProvider.getExt();
        if (ext != null) {
            jSONObject = ext;
        }
        if (dataProvider.getSegTax() > 0) {
            jSONObject.put("segtax", dataProvider.getSegTax());
        }
        if (jSONObject.length() > 0) {
            dataJson.put("ext", jSONObject);
        }
    }

    private final void a(POBDataProvider dataProvider, JSONObject dataJson) throws JSONException {
        String id2 = dataProvider.getId();
        if (id2 != null) {
            if (id2.length() <= 0) {
                id2 = null;
            }
            if (id2 != null) {
                dataJson.put("id", id2);
            }
        }
        dataJson.put("name", dataProvider.getName());
    }
}
