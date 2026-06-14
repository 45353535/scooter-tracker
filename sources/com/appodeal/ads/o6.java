package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.utils.Log;
import com.appodeal.ads.utils.exception_handler.AppodealException;
import com.ironsource.N6;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class o6 implements UserData {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static volatile o6 f14244j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f14245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f14246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f14247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f14248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f14249e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Float f14250f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Float f14251g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f14252h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f14253i;

    public static o6 a() {
        if (f14244j == null) {
            synchronized (o6.class) {
                try {
                    if (f14244j == null) {
                        f14244j = new o6();
                    }
                } finally {
                }
            }
        }
        return f14244j;
    }

    public static void b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        o6 o6VarA = a();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("user_settings");
        if (jSONObjectOptJSONObject != null) {
            if (jSONObjectOptJSONObject.has(N6.f41419s)) {
                float fOptDouble = (float) jSONObjectOptJSONObject.optDouble(N6.f41419s, -1.0d);
                if (fOptDouble > -1.0f) {
                    o6VarA.f14250f = Float.valueOf(fOptDouble);
                }
            }
            if (jSONObjectOptJSONObject.has("lon")) {
                float fOptDouble2 = (float) jSONObjectOptJSONObject.optDouble("lon", -1.0d);
                if (fOptDouble2 > -1.0f) {
                    o6VarA.f14251g = Float.valueOf(fOptDouble2);
                }
            }
            o6VarA.f14252h = z6.e(jSONObjectOptJSONObject, "city", o6VarA.f14252h);
            o6VarA.f14253i = z6.e(jSONObjectOptJSONObject, "zip", o6VarA.f14253i);
        }
        o6VarA.f14246b = z6.e(jSONObject, "ip", o6VarA.f14246b);
        o6VarA.f14247c = z6.e(jSONObject, "ipv6", o6VarA.f14247c);
        o6VarA.f14248d = z6.e(jSONObject, "country_id", o6VarA.f14248d);
        o6VarA.f14249e = z6.e(jSONObject, "address", o6VarA.f14249e);
    }

    @Override // com.appodeal.ads.UserData
    public final String getAddress() {
        return this.f14249e;
    }

    @Override // com.appodeal.ads.UserData
    public final String getCity() {
        return this.f14252h;
    }

    @Override // com.appodeal.ads.UserData
    public final String getCountryId() {
        return this.f14248d;
    }

    @Override // com.appodeal.ads.UserData
    public final String getIp() {
        return this.f14246b;
    }

    @Override // com.appodeal.ads.UserData
    public final String getIpv6() {
        return this.f14247c;
    }

    @Override // com.appodeal.ads.UserData
    public final Float getLat() {
        return this.f14250f;
    }

    @Override // com.appodeal.ads.UserData
    public final Float getLon() {
        return this.f14251g;
    }

    @Override // com.appodeal.ads.UserSettings
    public final String getUserId() {
        return this.f14245a;
    }

    @Override // com.appodeal.ads.UserData
    public final String getZip() {
        return this.f14253i;
    }

    @Override // com.appodeal.ads.UserSettings
    public final UserSettings setUserId(String str) {
        if (str == null) {
            Log.log(new AppodealException("Unable to set user id to null"));
            return this;
        }
        Log.log("UserSettings", LogConstants.EVENT_SET, "userId: ".concat(str), Log.LogLevel.verbose);
        this.f14245a = str;
        return this;
    }
}
