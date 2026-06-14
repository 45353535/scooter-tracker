package com.pubmatic.sdk.openwrap.core.signal;

import android.content.Context;
import com.pubmatic.sdk.common.POBAdFormat;
import com.pubmatic.sdk.openwrap.core.POBCommonOrtbJsonHelper;
import com.pubmatic.sdk.openwrap.core.POBImpression;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeRequestDataAsset;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeRequestImageAsset;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeRequestTitleAsset;
import com.pubmatic.sdk.openwrap.core.nativead.POBNativeDataAssetType;
import com.pubmatic.sdk.openwrap.core.nativead.POBNativeImageAssetType;
import com.taurusx.tax.f.y;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/pubmatic/sdk/openwrap/core/signal/POBALMAXSignalBuilder;", "Lcom/pubmatic/sdk/openwrap/core/signal/POBBaseSignalBuilder;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Lcom/pubmatic/sdk/openwrap/core/signal/POBSignalConfig;", "signalConfig", "<init>", "(Landroid/content/Context;Lcom/pubmatic/sdk/openwrap/core/signal/POBSignalConfig;)V", "", "Lcom/pubmatic/sdk/openwrap/core/nativead/POBCoreNativeRequestAsset;", "a", "()Ljava/util/List;", "Lcom/pubmatic/sdk/openwrap/core/POBImpression;", "createImpression", "()Lcom/pubmatic/sdk/openwrap/core/POBImpression;", "Lorg/json/JSONObject;", "getUserInfo", "()Lorg/json/JSONObject;", y.f66058y, "openwrapcore_release"}, k = 1, mv = {1, 7, 1})
public final class POBALMAXSignalBuilder extends POBBaseSignalBuilder {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public POBALMAXSignalBuilder(@NotNull Context context, @NotNull POBSignalConfig signalConfig) {
        super(context, signalConfig);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(signalConfig, "signalConfig");
    }

    private final List a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new POBCoreNativeRequestTitleAsset(1, true, 25));
        POBCoreNativeRequestDataAsset pOBCoreNativeRequestDataAsset = new POBCoreNativeRequestDataAsset(3, true, POBNativeDataAssetType.DESCRIPTION);
        pOBCoreNativeRequestDataAsset.setLength(100);
        arrayList.add(pOBCoreNativeRequestDataAsset);
        POBCoreNativeRequestDataAsset pOBCoreNativeRequestDataAsset2 = new POBCoreNativeRequestDataAsset(4, true, POBNativeDataAssetType.CTA_TEXT);
        pOBCoreNativeRequestDataAsset2.setLength(15);
        arrayList.add(pOBCoreNativeRequestDataAsset2);
        POBCoreNativeRequestDataAsset pOBCoreNativeRequestDataAsset3 = new POBCoreNativeRequestDataAsset(6, false, POBNativeDataAssetType.RATING);
        pOBCoreNativeRequestDataAsset3.setLength(20);
        arrayList.add(pOBCoreNativeRequestDataAsset3);
        POBCoreNativeRequestDataAsset pOBCoreNativeRequestDataAsset4 = new POBCoreNativeRequestDataAsset(8, false, POBNativeDataAssetType.SPONSORED);
        pOBCoreNativeRequestDataAsset4.setLength(25);
        arrayList.add(pOBCoreNativeRequestDataAsset4);
        arrayList.add(new POBCoreNativeRequestImageAsset(2, true, POBNativeImageAssetType.ICON, 50, 50));
        arrayList.add(new POBCoreNativeRequestImageAsset(5, true, POBNativeImageAssetType.MAIN, POBCoreNativeConstants.POB_NATIVE_MAIN_IMG_W, POBCoreNativeConstants.POB_NATIVE_MAIN_IMG_H));
        return arrayList;
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
        if (getSignalConfig().getAdFormat() == POBAdFormat.NATIVE) {
            pOBBidderImpression.setNative(new POBBidderNative(a()));
        }
        return pOBBidderImpression;
    }

    @Override // com.pubmatic.sdk.openwrap.core.signal.POBBaseSignalBuilder
    @NotNull
    protected JSONObject getUserInfo() throws JSONException {
        JSONObject userInfo = super.getUserInfo();
        JSONObject userExtJson = POBCommonOrtbJsonHelper.INSTANCE.getUserExtJson(getContext(), getSignalConfig().getAdFormat());
        if (userExtJson.length() > 0) {
            userInfo.put("ext", userExtJson);
        }
        return userInfo;
    }
}
