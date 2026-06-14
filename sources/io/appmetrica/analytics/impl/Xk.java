package io.appmetrica.analytics.impl;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class Xk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f76676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f76677d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f76678e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f76679f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f76680g;

    public Xk(JSONObject jSONObject) {
        this.f76674a = jSONObject.optString("analyticsSdkVersionName", "");
        this.f76675b = jSONObject.optString("kitBuildNumber", "");
        this.f76676c = jSONObject.optString("appVer", "");
        this.f76677d = jSONObject.optString(RemoteConfigConstants.RequestFieldKey.APP_BUILD, "");
        this.f76678e = jSONObject.optString("osVer", "");
        this.f76679f = jSONObject.optInt("osApiLev", -1);
        this.f76680g = jSONObject.optInt("attribution_id", 0);
    }

    public final String toString() {
        return "SessionRequestParams(kitVersionName='" + this.f76674a + "', kitBuildNumber='" + this.f76675b + "', appVersion='" + this.f76676c + "', appBuild='" + this.f76677d + "', osVersion='" + this.f76678e + "', apiLevel=" + this.f76679f + ", attributionId=" + this.f76680g + ')';
    }
}
