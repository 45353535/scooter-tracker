package com.pubmatic.sdk.openwrap.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBAdSize;
import com.pubmatic.sdk.common.POBInstanceProvider;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.openwrap.core.POBRequest;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class POBBanner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private POBAdSize[] f62732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private POBRequest.AdPosition f62733b;

    public POBBanner(@Nullable POBAdSize... pOBAdSizeArr) {
        this.f62732a = pOBAdSizeArr;
    }

    @NonNull
    public JSONObject getRTBJson(@NonNull Set<Integer> set, boolean z10) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        POBRequest.AdPosition adPosition = this.f62733b;
        if (adPosition != null) {
            jSONObject.put(POBCTAOverlayData.KEY_CTA_POS, adPosition.getValue());
        }
        POBAdSize[] pOBAdSizeArr = this.f62732a;
        if (pOBAdSizeArr != null) {
            jSONObject.put("format", getSizeArray(pOBAdSizeArr));
        }
        if (!set.isEmpty()) {
            jSONObject.put("api", new JSONArray((Collection) set));
        }
        if (z10) {
            jSONObject.put("vcm", 1);
            if (POBRequest.AdPosition.FULL_SCREEN.equals(this.f62733b)) {
                jSONObject.put("api", new JSONArray((Collection) getSupportedAPIs(true)));
            }
        }
        return jSONObject;
    }

    public JSONArray getSizeArray(@NonNull POBAdSize... pOBAdSizeArr) {
        JSONArray jSONArray = new JSONArray();
        for (POBAdSize pOBAdSize : pOBAdSizeArr) {
            if (pOBAdSize != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(POBCoreNativeConstants.NATIVE_IMAGE_WIDTH, pOBAdSize.getAdWidth());
                    jSONObject.put("h", pOBAdSize.getAdHeight());
                    jSONArray.put(jSONObject);
                } catch (JSONException unused) {
                    POBLog.error("POBBanner", "Error on formatting width/height in ad request.", new Object[0]);
                }
            }
        }
        return jSONArray;
    }

    @NonNull
    public Set<Integer> getSupportedAPIs(boolean z10) {
        HashSet hashSet = new HashSet();
        hashSet.add(Integer.valueOf(POBRequest.API.MRAID2.getValue()));
        hashSet.add(Integer.valueOf(POBRequest.API.MRAID3.getValue()));
        if (!z10 && POBInstanceProvider.getSdkConfig().getMeasurementProvider("com.pubmatic.sdk.omsdk.POBHTMLMeasurement") != null) {
            hashSet.add(Integer.valueOf(POBRequest.API.OMSDK.getValue()));
        }
        return hashSet;
    }

    public void setAdPosition(@Nullable POBRequest.AdPosition adPosition) {
        this.f62733b = adPosition;
    }

    public void setAdSizes(@Nullable POBAdSize... pOBAdSizeArr) {
        this.f62732a = pOBAdSizeArr;
    }

    public POBBanner() {
    }
}
