package com.amazon.device.ads;

import com.applovin.sdk.AppLovinMediationProvider;
import com.ironsource.X3;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Date;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
class DTBMetricReport {
    private static final String ADAPTER_VERSION = "adapter_version";
    private static final String ADSERVER = "mediation";
    private static final String APP_NAME = "app_id";
    private static final String CONNECTION = "connection";
    private static final String LATENCY = "latency";
    private static final String LOG_TAG = "DTBMetricReport";
    private static final String PROJECT = "project";
    private static final String PROJECT_NAME = "aps_mobile";
    private static final String SDK = "sdk";
    private static final String TIME = "time";
    private static final String TYPE = "type";
    private BidWrapper bidWrapper;
    private int latency;
    private JSONObject propertiesMap;
    private String type;

    protected static class BidWrapper {
        String bidId;
        String hostname;

        BidWrapper(String str, String str2) {
            this.bidId = str;
            this.hostname = str2;
        }
    }

    private DTBMetricReport(String str, BidWrapper bidWrapper, int i10) {
        this.bidWrapper = bidWrapper;
        this.latency = i10;
        setStandardProperties(str);
    }

    static BidWrapper addBid(String str, String str2) {
        return new BidWrapper(str, str2);
    }

    private void addExtraProperties(Map<String, Object> map) {
        try {
            for (String str : map.keySet()) {
                Object obj = map.get(str);
                if (obj instanceof String) {
                    this.propertiesMap.put(str, obj);
                } else if (obj instanceof Integer) {
                    this.propertiesMap.put(str, obj);
                } else if (obj instanceof Long) {
                    this.propertiesMap.put(str, obj);
                } else if (obj instanceof Boolean) {
                    this.propertiesMap.put(str, obj);
                }
            }
        } catch (JSONException e10) {
            DtbLog.error(LOG_TAG, "Invalid JSON conversion:" + e10.getMessage());
        }
    }

    static DTBMetricReport reportWithBidIdAndType(BidWrapper bidWrapper, String str) {
        return new DTBMetricReport(str, bidWrapper);
    }

    static DTBMetricReport reportWithBidTypeLatency(BidWrapper bidWrapper, String str, int i10) {
        return new DTBMetricReport(str, bidWrapper, i10);
    }

    static DTBMetricReport reportWithTypeAndExtraProperties(String str, Map<String, Object> map) {
        return new DTBMetricReport(str, map);
    }

    private void setStandardProperties(String str) {
        String str2;
        this.type = str;
        JSONObject jSONObject = new JSONObject();
        this.propertiesMap = jSONObject;
        try {
            jSONObject.put("type", str);
            this.propertiesMap.put("sdk", DtbConstants.SDK_VERSION);
            this.propertiesMap.put("app_id", AdRegistration.getAppKey());
            this.propertiesMap.put(PROJECT, PROJECT_NAME);
            int i10 = this.latency;
            if (i10 > 0) {
                this.propertiesMap.put(LATENCY, i10);
            }
            String str3 = null;
            try {
                str2 = "admob";
            } catch (Exception unused) {
                str2 = null;
            }
            try {
                Object objInvoke = Class.forName("com.amazon.admob_adapter.APSAdMobAdapter").getMethod("getVersion", null).invoke(null, null);
                if (objInvoke instanceof String) {
                    str3 = (String) objInvoke;
                }
            } catch (Exception unused2) {
                try {
                    Class<?> cls = Class.forName("com.amazon.mopub_adapter.APSMopubAdapter");
                    str2 = AppLovinMediationProvider.MOPUB;
                    Object objInvoke2 = cls.getMethod("getVersion", null).invoke(null, null);
                    if (objInvoke2 instanceof String) {
                        str3 = (String) objInvoke2;
                    }
                } catch (Exception unused3) {
                }
            }
            if (str2 != null) {
                this.propertiesMap.put(ADSERVER, str2);
            }
            DtbDeviceData.getDeviceDataInstance();
            String connectionType = DtbDeviceData.getConnectionType();
            this.propertiesMap.put(CONNECTION, connectionType.equals("Wifi") ? X3.f42018b : connectionType.equals("0") ? "unknown" : X3.f42023g);
            if (str3 != null) {
                this.propertiesMap.put(ADAPTER_VERSION, str3);
            }
            this.propertiesMap.put("time", new Date().getTime() / 1000);
        } catch (JSONException e10) {
            DtbLog.warn(LOG_TAG, "JSON conversion error:" + e10.getMessage());
        }
    }

    String getBidId() {
        BidWrapper bidWrapper = this.bidWrapper;
        if (bidWrapper == null) {
            return null;
        }
        return bidWrapper.bidId;
    }

    String getHostname() {
        BidWrapper bidWrapper = this.bidWrapper;
        if (bidWrapper == null) {
            return null;
        }
        return bidWrapper.hostname;
    }

    String getType() {
        return this.type;
    }

    String toEncodedString() throws UnsupportedEncodingException {
        return URLEncoder.encode(this.propertiesMap.toString(), "UTF-8");
    }

    public String toString() {
        return this.propertiesMap.toString();
    }

    static DTBMetricReport reportWithTypeAndExtraProperties(String str, Map<String, Object> map, BidWrapper bidWrapper) {
        return new DTBMetricReport(str, map, bidWrapper);
    }

    private DTBMetricReport(String str, BidWrapper bidWrapper) {
        this.latency = -1;
        this.bidWrapper = bidWrapper;
        setStandardProperties(str);
    }

    private DTBMetricReport(String str, Map<String, Object> map) {
        this.latency = -1;
        setStandardProperties(str);
        addExtraProperties(map);
    }

    private DTBMetricReport(String str, Map<String, Object> map, BidWrapper bidWrapper) {
        this(str, map);
        this.bidWrapper = bidWrapper;
    }
}
