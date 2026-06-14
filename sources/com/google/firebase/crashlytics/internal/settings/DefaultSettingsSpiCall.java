package com.google.firebase.crashlytics.internal.settings;

import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.crashlytics.internal.network.HttpGetRequest;
import com.google.firebase.crashlytics.internal.network.HttpRequestFactory;
import com.google.firebase.crashlytics.internal.network.HttpResponse;
import com.ironsource.C4424m2;
import com.ironsource.D5;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
class DefaultSettingsSpiCall implements SettingsSpiCall {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HttpRequestFactory f32699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Logger f32700c;

    public DefaultSettingsSpiCall(String str, HttpRequestFactory httpRequestFactory) {
        this(str, httpRequestFactory, Logger.getLogger());
    }

    private HttpGetRequest a(HttpGetRequest httpGetRequest, SettingsRequest settingsRequest) {
        b(httpGetRequest, "X-CRASHLYTICS-GOOGLE-APP-ID", settingsRequest.googleAppId);
        b(httpGetRequest, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        b(httpGetRequest, "X-CRASHLYTICS-API-CLIENT-VERSION", CrashlyticsCore.getVersion());
        b(httpGetRequest, "Accept", D5.L);
        b(httpGetRequest, "X-CRASHLYTICS-DEVICE-MODEL", settingsRequest.deviceModel);
        b(httpGetRequest, "X-CRASHLYTICS-OS-BUILD-VERSION", settingsRequest.osBuildVersion);
        b(httpGetRequest, "X-CRASHLYTICS-OS-DISPLAY-VERSION", settingsRequest.osDisplayVersion);
        b(httpGetRequest, "X-CRASHLYTICS-INSTALLATION-ID", settingsRequest.installIdProvider.getInstallIds().getCrashlyticsInstallId());
        return httpGetRequest;
    }

    private void b(HttpGetRequest httpGetRequest, String str, String str2) {
        if (str2 != null) {
            httpGetRequest.header(str, str2);
        }
    }

    private JSONObject d(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e10) {
            this.f32700c.w("Failed to parse settings JSON from " + this.f32698a, e10);
            this.f32700c.w("Settings response " + str);
            return null;
        }
    }

    private Map e(SettingsRequest settingsRequest) {
        HashMap map = new HashMap();
        map.put("build_version", settingsRequest.buildVersion);
        map.put("display_version", settingsRequest.displayVersion);
        map.put("source", Integer.toString(settingsRequest.source));
        String str = settingsRequest.instanceId;
        if (!TextUtils.isEmpty(str)) {
            map.put(C4424m2.f43617p, str);
        }
        return map;
    }

    protected HttpGetRequest c(Map map) {
        return this.f32699b.buildHttpGetRequest(this.f32698a, map).header("User-Agent", "Crashlytics Android SDK/" + CrashlyticsCore.getVersion()).header("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    JSONObject f(HttpResponse httpResponse) {
        int iCode = httpResponse.code();
        this.f32700c.v("Settings response code was: " + iCode);
        if (g(iCode)) {
            return d(httpResponse.body());
        }
        this.f32700c.e("Settings request failed; (status: " + iCode + ") from " + this.f32698a);
        return null;
    }

    boolean g(int i10) {
        return i10 == 200 || i10 == 201 || i10 == 202 || i10 == 203;
    }

    @Override // com.google.firebase.crashlytics.internal.settings.SettingsSpiCall
    public JSONObject invoke(SettingsRequest settingsRequest, boolean z10) {
        CrashlyticsWorkers.checkBlockingThread();
        if (!z10) {
            throw new RuntimeException("An invalid data collection token was used.");
        }
        try {
            Map mapE = e(settingsRequest);
            HttpGetRequest httpGetRequestA = a(c(mapE), settingsRequest);
            this.f32700c.d("Requesting settings from " + this.f32698a);
            this.f32700c.v("Settings query params were: " + mapE);
            return f(httpGetRequestA.execute());
        } catch (IOException e10) {
            this.f32700c.e("Settings request failed.", e10);
            return null;
        }
    }

    DefaultSettingsSpiCall(String str, HttpRequestFactory httpRequestFactory, Logger logger) {
        if (str == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        this.f32700c = logger;
        this.f32699b = httpRequestFactory;
        this.f32698a = str;
    }
}
