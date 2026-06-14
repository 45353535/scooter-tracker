package net.pubnative.lite.sdk.analytics;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;
import net.pubnative.lite.sdk.analytics.Reporting;
import net.pubnative.lite.sdk.utils.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ReportingEvent {
    private static final String TAG = "ReportingEvent";
    private final JSONObject eventObject = new JSONObject();

    public String getAdFormat() {
        return getCustomString("ad_format");
    }

    public String getAdSize() {
        return getCustomString(Reporting.Key.AD_SIZE);
    }

    public String getAdType() {
        return getCustomString("ad_type");
    }

    public String getAgeOfApp() {
        return getCustomString(Reporting.Key.AGE_OF_APP);
    }

    public String getAppToken() {
        return getCustomString("app_token");
    }

    public String getCampaignId() {
        return getCustomString("campaign_id");
    }

    public String getCategoryId() {
        return getCustomString(Reporting.Key.CATEGORY_ID);
    }

    public String getConfigId() {
        return getCustomString(Reporting.Key.REMOTE_CONFIG_ID);
    }

    public String getCreative() {
        return getCustomString(Reporting.Key.CREATIVE);
    }

    public String getCreativeId() {
        return getCustomString("creative_id");
    }

    public String getCreativeType() {
        return getCustomString("creative_type");
    }

    public Boolean getCustomBoolean(String str) {
        try {
            return Boolean.valueOf(this.eventObject.getBoolean(str));
        } catch (JSONException e10) {
            Logger.e(TAG, e10.getMessage());
            return null;
        }
    }

    public Double getCustomDecimal(String str) {
        try {
            return Double.valueOf(this.eventObject.getDouble(str));
        } catch (JSONException e10) {
            Logger.e(TAG, e10.getMessage());
            return null;
        }
    }

    public Long getCustomInteger(String str) {
        try {
            return Long.valueOf(this.eventObject.getLong(str));
        } catch (JSONException e10) {
            Logger.e(TAG, e10.getMessage());
            return null;
        }
    }

    public JSONArray getCustomJSONArray(String str) {
        try {
            return this.eventObject.getJSONArray(str);
        } catch (JSONException e10) {
            Logger.e(TAG, e10.getMessage());
            return null;
        }
    }

    public JSONObject getCustomJSONObject(String str) {
        try {
            return this.eventObject.getJSONObject(str);
        } catch (JSONException e10) {
            Logger.e(TAG, e10.getMessage());
            return null;
        }
    }

    public String getCustomString(String str) {
        try {
            return this.eventObject.getString(str);
        } catch (JSONException e10) {
            Logger.e(TAG, e10.getMessage());
            return null;
        }
    }

    public long getErrorCode() {
        return getCustomInteger("error_code").longValue();
    }

    public String getErrorMessage() {
        return getCustomString("error_message");
    }

    public Bundle getEventData() {
        Bundle bundle = new Bundle();
        Iterator<String> itKeys = this.eventObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                bundle.putString(next, this.eventObject.getString(next));
            } catch (JSONException unused) {
            }
        }
        return bundle;
    }

    public JSONObject getEventObject() {
        return this.eventObject;
    }

    public String getEventType() {
        return getCustomString(Reporting.Key.EVENT_TYPE);
    }

    public boolean getHasEndCard() {
        return getCustomBoolean(Reporting.Key.HAS_END_CARD).booleanValue();
    }

    public String getImpDepth() {
        return getCustomString(Reporting.Key.IMP_DEPTH);
    }

    public String getImpId() {
        return getCustomString(Reporting.Key.IMP_ID);
    }

    public String getIntegrationType() {
        return getCustomString("integration_type");
    }

    public String getPlacementId() {
        return getCustomString(Reporting.Key.PLACEMENT_ID);
    }

    public String getPlatform() {
        return getCustomString("platform");
    }

    public synchronized String getRequestType() {
        return getCustomString(Reporting.Key.REQUEST_TYPE);
    }

    public String getSdkVersion() {
        return getCustomString(Reporting.Key.HYBID_VERSION);
    }

    public String getSessionDuration() {
        return getCustomString(Reporting.Key.SESSION_DURATION);
    }

    public String getTimestamp() {
        return getCustomString("timestamp");
    }

    public String getVast() {
        return getCustomString("vast");
    }

    public String getZoneId() {
        return getCustomString(Reporting.Key.ZONE_ID);
    }

    public synchronized void mergeJSONObject(JSONObject jSONObject) {
        JSONArray jSONArrayNames;
        if (jSONObject != null) {
            if (jSONObject.length() != 0 && (jSONArrayNames = jSONObject.names()) != null) {
                for (int i10 = 0; i10 < jSONArrayNames.length(); i10++) {
                    try {
                        String string = jSONArrayNames.getString(i10);
                        this.eventObject.put(string, jSONObject.get(string));
                    } catch (JSONException unused) {
                    }
                }
            }
        }
    }

    public synchronized void setAdFormat(String str) {
        setCustomString("ad_format", str);
    }

    public synchronized void setAdSessionData(String str) {
        setCustomString(Reporting.Key.AD_SESSION_DATA, str);
    }

    public synchronized void setAdSize(String str) {
        setCustomString(Reporting.Key.AD_SIZE, str);
    }

    public synchronized void setAdType(String str) {
        setCustomString("ad_type", str);
    }

    public synchronized void setAgeOfApp(String str) {
        setCustomString(Reporting.Key.AGE_OF_APP, str);
    }

    public synchronized void setAppToken(String str) {
        setCustomString("app_token", str);
    }

    public synchronized void setCampaignId(String str) {
        setCustomString("campaign_id", str);
    }

    public synchronized void setCategoryId(String str) {
        setCustomString(Reporting.Key.CATEGORY_ID, str);
    }

    public synchronized void setConfigId(String str) {
        setCustomString(Reporting.Key.REMOTE_CONFIG_ID, str);
    }

    public synchronized void setCreative(String str) {
        setCustomString(Reporting.Key.CREATIVE, str);
    }

    public synchronized void setCreativeId(String str) {
        setCustomString("creative_id", str);
    }

    public synchronized void setCreativeType(String str) {
        setCustomString("creative_type", str);
    }

    public synchronized void setCustomBoolean(String str, boolean z10) {
        try {
            this.eventObject.put(str, z10);
        } catch (JSONException e10) {
            Logger.e(TAG, e10.getMessage());
        }
    }

    public synchronized void setCustomDecimal(String str, double d10) {
        try {
            this.eventObject.put(str, d10);
        } catch (JSONException e10) {
            Logger.e(TAG, e10.getMessage());
        }
    }

    public void setCustomInteger(String str, long j10) {
        try {
            this.eventObject.put(str, j10);
        } catch (JSONException e10) {
            Logger.e(TAG, e10.getMessage());
        }
    }

    public synchronized void setCustomJSONArray(String str, JSONArray jSONArray) {
        try {
            this.eventObject.put(str, jSONArray);
        } catch (JSONException e10) {
            Logger.e(TAG, e10.getMessage());
        }
    }

    public synchronized void setCustomJSONObject(String str, JSONObject jSONObject) {
        try {
            this.eventObject.put(str, jSONObject);
        } catch (JSONException e10) {
            Logger.e(TAG, e10.getMessage());
        }
    }

    public synchronized void setCustomString(String str, String str2) {
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            this.eventObject.put(str, str2);
        } catch (JSONException e10) {
            Logger.e(TAG, e10.getMessage());
        }
    }

    public synchronized void setErrorCode(int i10) {
        setCustomInteger("error_code", i10);
    }

    public synchronized void setErrorMessage(String str) {
        setCustomString("error_message", str);
    }

    public synchronized void setEventType(String str) {
        setCustomString(Reporting.Key.EVENT_TYPE, str);
    }

    public synchronized void setHasEndCard(boolean z10) {
        setCustomBoolean(Reporting.Key.HAS_END_CARD, z10);
    }

    public synchronized void setImpDepth(String str) {
        setCustomString(Reporting.Key.IMP_DEPTH, str);
    }

    public synchronized void setImpId(String str) {
        setCustomString(Reporting.Key.IMP_ID, str);
    }

    public synchronized void setIntegrationType(String str) {
        setCustomString("integration_type", str);
    }

    public synchronized void setPlacementId(String str) {
        setCustomString(Reporting.Key.PLACEMENT_ID, str);
    }

    public synchronized void setPlatform(String str) {
        setCustomString("platform", str);
    }

    public synchronized void setRequestType(String str) {
        setCustomString(Reporting.Key.REQUEST_TYPE, str);
    }

    public synchronized void setSdkVersion(String str) {
        setCustomString(Reporting.Key.HYBID_VERSION, str);
    }

    public synchronized void setSessionDuration(String str) {
        setCustomString(Reporting.Key.SESSION_DURATION, str);
    }

    public synchronized void setTimestamp(long j10) {
        setCustomString("timestamp", String.valueOf(j10));
    }

    public synchronized void setVast(String str) {
        setCustomString("vast", str);
    }

    public synchronized void setZoneId(String str) {
        setCustomString(Reporting.Key.ZONE_ID, str);
    }

    public synchronized void setTimestamp(String str) {
        setCustomString("timestamp", str);
    }
}
