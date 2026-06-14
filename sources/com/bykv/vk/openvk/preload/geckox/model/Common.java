package com.bykv.vk.openvk.preload.geckox.model;

import android.os.Build;
import com.adjust.sdk.purchase.ADJPConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.taurusx.tax.g.e0;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class Common {

    /* JADX INFO: renamed from: ac, reason: collision with root package name */
    public String f15851ac;
    public long aid;
    public String appName;
    public String appVersion;
    public String deviceId;
    public String deviceModel;
    public String devicePlatform;
    public int os = 0;
    public String osVersion;
    public String region;
    public String sdkVersion;
    public String uid;

    public Common() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Build.VERSION.SDK_INT);
        this.osVersion = sb2.toString();
        this.deviceModel = Build.MODEL;
        this.devicePlatform = "android";
        this.sdkVersion = "2.0.3-rc.9-pangle";
    }

    public JSONObject toJson() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("aid", this.aid);
            jSONObject.put("app_version", this.appVersion);
            jSONObject.put("os", this.os);
            jSONObject.put("device_id", this.deviceId);
            jSONObject.put("app_name", this.appName);
            jSONObject.put(CampaignEx.KEY_ACTIVITY_PATH_AND_NAME, this.f15851ac);
            jSONObject.put(CommonUrlParts.OS_VERSION, this.osVersion);
            jSONObject.put("device_model", this.deviceModel);
            jSONObject.put("device_platform", this.devicePlatform);
            jSONObject.put(ADJPConstants.KEY_SDK_VERSION, this.sdkVersion);
            jSONObject.put("region", this.region);
            jSONObject.put(e0.f66120c, this.uid);
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public Common(long j10, String str, String str2, String str3, String str4) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Build.VERSION.SDK_INT);
        this.osVersion = sb2.toString();
        this.deviceModel = Build.MODEL;
        this.devicePlatform = "android";
        this.sdkVersion = "2.0.3-rc.9-pangle";
        this.aid = j10;
        this.appVersion = str;
        this.deviceId = str2;
        this.appName = str3;
        this.f15851ac = str4;
    }

    public Common(long j10, String str, String str2, String str3, String str4, String str5, String str6) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Build.VERSION.SDK_INT);
        this.osVersion = sb2.toString();
        this.deviceModel = Build.MODEL;
        this.devicePlatform = "android";
        this.sdkVersion = "2.0.3-rc.9-pangle";
        this.aid = j10;
        this.appVersion = str;
        this.deviceId = str2;
        this.appName = str3;
        this.f15851ac = str4;
        this.uid = str5;
        this.region = str6;
    }
}
