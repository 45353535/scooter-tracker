package com.amazon.aps.shared.analytics;

import android.content.Context;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.amazon.device.ads.DtbDeviceData;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class APSEvent implements Serializable {
    public static final int EXCEPTION_LOG_SIZE = 2048;
    String deviceManufacturer;
    String deviceModel;
    String eventType;
    String osName;
    int osVersion;
    String pkgName;
    String sdkVersion;
    APSEventSeverity severity;
    long timestamp;
    String configVersion = "";
    String errorDetails = "";
    String exceptionLog = "";

    public APSEvent(Context context, APSEventSeverity aPSEventSeverity, String str) {
        this.sdkVersion = null;
        this.pkgName = "";
        this.osName = "";
        this.deviceManufacturer = "";
        this.deviceModel = "";
        try {
            this.sdkVersion = APSAnalytics.getVersion();
            String adapterVersion = APSAnalytics.getAdapterVersion();
            if (adapterVersion != null) {
                this.sdkVersion += "_" + adapterVersion;
            }
            this.osName = "Android";
            this.osVersion = Build.VERSION.SDK_INT;
            this.deviceManufacturer = Build.MANUFACTURER;
            this.deviceModel = Build.MODEL;
            this.timestamp = System.currentTimeMillis();
            this.pkgName = context == null ? "unknown" : context.getPackageName();
            setEventSeverity(aPSEventSeverity);
            setEventType(str);
        } catch (RuntimeException e10) {
            Log.e("APSEvent", "Error constructing the APSEvent:", e10);
        }
    }

    public APSEvent build() {
        return this;
    }

    public APSEventSeverity getEventSeverity() {
        return this.severity;
    }

    public String getEventType() {
        return this.eventType;
    }

    public String getExceptionDetails() {
        return this.exceptionLog;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public boolean isValidEvent() {
        return this.eventType != null;
    }

    public APSEvent setConfigVersion(String str) {
        this.configVersion = str;
        return this;
    }

    public APSEvent setErrorDetails(String str) {
        if (str != null) {
            int length = str.length();
            if (length > 2048) {
                length = 2048;
            }
            this.errorDetails = str.substring(0, length);
        }
        return this;
    }

    public APSEvent setEventSeverity(APSEventSeverity aPSEventSeverity) {
        this.severity = aPSEventSeverity;
        return this;
    }

    public APSEvent setEventType(String str) {
        this.eventType = str;
        return this;
    }

    public APSEvent setExceptionDetails(Exception exc) {
        if (exc != null) {
            try {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                String string = stringWriter.toString();
                if (string.length() <= 2048) {
                    this.exceptionLog = exc.getMessage() + IOUtils.LINE_SEPARATOR_UNIX + string;
                    return this;
                }
                int length = (2042 - exc.getMessage().length()) / 2;
                this.exceptionLog = exc.getMessage() + APSSharedUtil.TRUNCATE_SEPARATOR + string.substring(0, length) + APSSharedUtil.TRUNCATE_SEPARATOR + string.substring(string.length() - length);
                return this;
            } catch (RuntimeException e10) {
                Log.e("APSEvent", "Error in parsing the exception detail; ", e10);
            }
        }
        return this;
    }

    public APSEvent setTimestamp(long j10) {
        this.timestamp = j10;
        return this;
    }

    public String toJsonPayload() {
        String strReplace = "";
        String strConcat = String.format("msg = %s;", this.errorDetails);
        String additionalDetails = APSAnalytics.getAdditionalDetails();
        if (!APSSharedUtil.isNullOrEmpty(additionalDetails)) {
            strConcat = strConcat.concat(additionalDetails);
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", this.sdkVersion);
            jSONObject.put("eventType", this.eventType);
            jSONObject.put("eventTimestamp", this.timestamp);
            jSONObject.put("severity", this.severity.name());
            jSONObject.put(RemoteConfigConstants.RequestFieldKey.APP_ID, this.pkgName);
            jSONObject.put("osName", this.osName);
            jSONObject.put(DtbDeviceData.DEVICE_DATA_OS_VERSION_KEY, this.osVersion);
            jSONObject.put("deviceManufacturer", this.deviceManufacturer);
            jSONObject.put("deviceModel", this.deviceModel);
            jSONObject.put("configVersion", this.configVersion);
            jSONObject.put("otherDetails", strConcat);
            jSONObject.put("exceptionDetails", this.exceptionLog);
            strReplace = Base64.encodeToString(jSONObject.toString().getBytes(), 0).replace(IOUtils.LINE_SEPARATOR_UNIX, "");
        } catch (RuntimeException | JSONException e10) {
            Log.e("APSEvent", "Error in parsing the json .. ignoring : ", e10);
        }
        return "{\"Data\": \"" + strReplace + "\",\"PartitionKey\": \"" + this.timestamp + "\"}";
    }

    public APSEvent setExceptionDetails(String str) {
        this.exceptionLog = str.substring(0, 2048 > str.length() ? str.length() : 2048);
        return this;
    }
}
