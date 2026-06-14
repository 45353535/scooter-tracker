package com.pubmatic.sdk.openwrap.core.signal.ulevelplay;

import android.content.Context;
import com.pubmatic.sdk.common.POBAdFormat;
import com.pubmatic.sdk.common.POBInstanceProvider;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.models.POBAppInfo;
import com.pubmatic.sdk.common.models.POBApplicationInfo;
import com.pubmatic.sdk.common.utility.POBExtensionsKt;
import com.pubmatic.sdk.openwrap.core.POBCommonOrtbJsonHelper;
import com.pubmatic.sdk.openwrap.core.POBImpression;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.pubmatic.sdk.openwrap.core.signal.POBBaseSignalBuilder;
import com.pubmatic.sdk.openwrap.core.signal.POBBidderImpression;
import com.pubmatic.sdk.openwrap.core.signal.POBSignalConfig;
import com.taurusx.tax.f.y;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0012\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/pubmatic/sdk/openwrap/core/signal/ulevelplay/POBULevelPlaySignalBuilder;", "Lcom/pubmatic/sdk/openwrap/core/signal/POBBaseSignalBuilder;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Lcom/pubmatic/sdk/openwrap/core/signal/POBSignalConfig;", "signalConfig", "<init>", "(Landroid/content/Context;Lcom/pubmatic/sdk/openwrap/core/signal/POBSignalConfig;)V", "Lcom/pubmatic/sdk/common/POBAdFormat;", "placementType", "Lorg/json/JSONObject;", "a", "(Landroid/content/Context;Lcom/pubmatic/sdk/common/POBAdFormat;)Lorg/json/JSONObject;", "Lcom/pubmatic/sdk/openwrap/core/POBImpression;", "createImpression", "()Lcom/pubmatic/sdk/openwrap/core/POBImpression;", "getAppInfo", "()Lorg/json/JSONObject;", "getUserInfo", y.f66058y, "openwrapcore_release"}, k = 1, mv = {1, 7, 1})
public final class POBULevelPlaySignalBuilder extends POBBaseSignalBuilder {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public POBULevelPlaySignalBuilder(@NotNull Context context, @NotNull POBSignalConfig signalConfig) {
        super(context, signalConfig);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(signalConfig, "signalConfig");
    }

    private final JSONObject a(Context context, POBAdFormat placementType) {
        JSONObject jSONObject = new JSONObject();
        try {
            POBCommonOrtbJsonHelper pOBCommonOrtbJsonHelper = POBCommonOrtbJsonHelper.INSTANCE;
            pOBCommonOrtbJsonHelper.addUserIds(jSONObject);
            pOBCommonOrtbJsonHelper.addSessionDuration(context, jSONObject);
            pOBCommonOrtbJsonHelper.addImpDepth(context, placementType, jSONObject);
            pOBCommonOrtbJsonHelper.addGdprConsent(context, jSONObject);
            POBLog.debug("POBULevelPlaySignalBuilder", jSONObject.toString(), new Object[0]);
            return jSONObject;
        } catch (JSONException e10) {
            POBLog.error("POBULevelPlaySignalBuilder", "Exception occurred in getUserExtJson() : " + e10.getMessage(), new Object[0]);
            return jSONObject;
        }
    }

    @Override // com.pubmatic.sdk.openwrap.core.signal.POBBaseSignalBuilder
    @NotNull
    protected POBImpression createImpression() {
        POBAdFormat adFormat = getSignalConfig().getAdFormat();
        POBAdFormat pOBAdFormat = POBAdFormat.REWARDEDAD;
        POBBidderImpression pOBBidderImpression = new POBBidderImpression(adFormat == pOBAdFormat, getSignalConfig().getAdFormat() == POBAdFormat.INTERSTITIAL || getSignalConfig().getAdFormat() == pOBAdFormat);
        String gpid = getSignalConfig().getGpid();
        if (gpid != null) {
            pOBBidderImpression.setGpid(gpid);
        }
        return pOBBidderImpression;
    }

    @Override // com.pubmatic.sdk.openwrap.core.signal.POBBaseSignalBuilder
    @NotNull
    protected JSONObject getAppInfo() {
        String categories;
        JSONObject appInfo = super.getAppInfo();
        POBAppInfo appInfo2 = POBInstanceProvider.getAppInfo(getCom.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants.NATIVE_CONTEXT java.lang.String());
        Intrinsics.checkNotNullExpressionValue(appInfo2, "getAppInfo(context)");
        try {
            POBExtensionsKt.putIfNotNullOrEmpty(appInfo, "name", appInfo2.getAppName());
            POBExtensionsKt.putIfNotNullOrEmpty(appInfo, POBCoreNativeConstants.NATIVE_VERSION, appInfo2.getAppVersion());
            POBApplicationInfo applicationInfo = POBInstanceProvider.getSdkConfig().getApplicationInfo();
            if (applicationInfo != null && (categories = applicationInfo.getCategories()) != null) {
                appInfo.put("cat", new JSONArray((Collection) StringsKt.split$default(categories, new String[]{StringUtils.COMMA}, false, 0, 6, null)));
                return appInfo;
            }
        } catch (JSONException e10) {
            POBLog.error("POBULevelPlaySignalBuilder", "Exception occurred in getAppInfo() : " + e10.getMessage(), new Object[0]);
        }
        return appInfo;
    }

    @Override // com.pubmatic.sdk.openwrap.core.signal.POBBaseSignalBuilder
    @NotNull
    protected JSONObject getUserInfo() {
        JSONObject userInfo = super.getUserInfo();
        try {
            userInfo.put("ext", a(getCom.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants.NATIVE_CONTEXT java.lang.String(), getSignalConfig().getAdFormat()));
            return userInfo;
        } catch (JSONException e10) {
            POBLog.error("POBULevelPlaySignalBuilder", "Exception occurred in getOrtbUserJson() : " + e10.getMessage(), new Object[0]);
            return userInfo;
        }
    }
}
