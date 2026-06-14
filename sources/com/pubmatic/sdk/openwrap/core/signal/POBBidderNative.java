package com.pubmatic.sdk.openwrap.core.signal;

import com.pubmatic.sdk.common.POBInstanceProvider;
import com.pubmatic.sdk.openwrap.core.POBNative;
import com.pubmatic.sdk.openwrap.core.POBRequest;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeRequestAsset;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeRequestEventTracker;
import com.pubmatic.sdk.openwrap.core.nativead.POBNativeEventTrackingMethod;
import com.pubmatic.sdk.openwrap.core.nativead.POBNativeEventType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\n\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002H\u0002¢\u0006\u0004\b\n\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/pubmatic/sdk/openwrap/core/signal/POBBidderNative;", "Lcom/pubmatic/sdk/openwrap/core/POBNative;", "", "Lcom/pubmatic/sdk/openwrap/core/nativead/POBCoreNativeRequestAsset;", "assetList", "<init>", "(Ljava/util/List;)V", "Lcom/pubmatic/sdk/openwrap/core/nativead/POBCoreNativeRequestEventTracker;", "eventTrackers", "", "a", "(Ljava/util/List;Ljava/util/List;)Ljava/lang/String;", "()Ljava/util/List;", "Lorg/json/JSONObject;", "getRTBJson", "()Lorg/json/JSONObject;", "Ljava/util/List;", "openwrapcore_release"}, k = 1, mv = {1, 7, 1})
public final class POBBidderNative implements POBNative {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private List assetList;

    public POBBidderNative(@NotNull List<? extends POBCoreNativeRequestAsset> assetList) {
        Intrinsics.checkNotNullParameter(assetList, "assetList");
        this.assetList = assetList;
    }

    private final String a(List assetList, List eventTrackers) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator it = assetList.iterator();
        while (it.hasNext()) {
            jSONArray.put(((POBCoreNativeRequestAsset) it.next()).getRTBJSON());
        }
        jSONObject.put(POBCoreNativeConstants.NATIVE_ASSETS, jSONArray);
        jSONObject.put(POBCoreNativeConstants.NATIVE_VERSION, POBCoreNativeConstants.NATIVE_DEFAULT_VERSION);
        if (!eventTrackers.isEmpty()) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator it2 = eventTrackers.iterator();
            while (it2.hasNext()) {
                jSONArray2.put(((POBCoreNativeRequestEventTracker) it2.next()).getRTBJSON());
            }
            jSONObject.put(POBCoreNativeConstants.NATIVE_EVENT_TRACKERS, jSONArray2);
        }
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "nativeJson.toString()");
        return string;
    }

    @Override // com.pubmatic.sdk.openwrap.core.POBNative
    @NotNull
    public JSONObject getRTBJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("request", a(this.assetList, a()));
        jSONObject.put(POBCoreNativeConstants.NATIVE_VERSION, POBCoreNativeConstants.NATIVE_DEFAULT_VERSION);
        HashSet hashSet = new HashSet();
        if (POBInstanceProvider.getSdkConfig().getMeasurementProvider("com.pubmatic.sdk.omsdk.POBNativeMeasurement") != null) {
            hashSet.add(Integer.valueOf(POBRequest.API.OMSDK.getValue()));
        }
        jSONObject.put("api", new JSONArray((Collection) hashSet));
        return jSONObject;
    }

    private final List a() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(POBNativeEventTrackingMethod.IMAGE);
        arrayList.add(POBNativeEventTrackingMethod.JAVASCRIPT);
        POBCoreNativeRequestEventTracker pOBCoreNativeRequestEventTracker = new POBCoreNativeRequestEventTracker(POBNativeEventType.IMPRESSION, arrayList);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList2.add(pOBCoreNativeRequestEventTracker);
        return arrayList2;
    }
}
