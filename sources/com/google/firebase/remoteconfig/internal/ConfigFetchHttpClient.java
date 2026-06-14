package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.pm.PackageInfoCompat;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.common.net.HttpHeaders;
import com.google.firebase.remoteconfig.BuildConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.ironsource.D5;
import j$.util.DesugarTimeZone;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class ConfigFetchHttpClient {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Pattern f33052h = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f33053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f33054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f33055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f33056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f33057e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f33058f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f33059g;

    public ConfigFetchHttpClient(Context context, String str, String str2, String str3, long j10, long j11) {
        this.f33053a = context;
        this.f33054b = str;
        this.f33055c = str2;
        this.f33056d = f(str);
        this.f33057e = str3;
        this.f33058f = j10;
        this.f33059g = j11;
    }

    private boolean a(JSONObject jSONObject) {
        try {
            return !jSONObject.get("state").equals("NO_CHANGE");
        } catch (JSONException unused) {
            return true;
        }
    }

    private String b(long j10) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(Long.valueOf(j10));
    }

    private JSONObject c(String str, String str2, Map map, Long l10, Map map2) throws FirebaseRemoteConfigClientException {
        HashMap map3 = new HashMap();
        if (str == null) {
            throw new FirebaseRemoteConfigClientException("Fetch failed: Firebase installation id is null.");
        }
        map3.put(RemoteConfigConstants.RequestFieldKey.INSTANCE_ID, str);
        map3.put(RemoteConfigConstants.RequestFieldKey.INSTANCE_ID_TOKEN, str2);
        map3.put(RemoteConfigConstants.RequestFieldKey.APP_ID, this.f33054b);
        Locale locale = this.f33053a.getResources().getConfiguration().locale;
        map3.put(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, locale.getCountry());
        int i10 = Build.VERSION.SDK_INT;
        map3.put(RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, locale.toLanguageTag());
        map3.put(RemoteConfigConstants.RequestFieldKey.PLATFORM_VERSION, Integer.toString(i10));
        map3.put(RemoteConfigConstants.RequestFieldKey.TIME_ZONE, TimeZone.getDefault().getID());
        try {
            PackageInfo packageInfo = this.f33053a.getPackageManager().getPackageInfo(this.f33053a.getPackageName(), 0);
            if (packageInfo != null) {
                map3.put("appVersion", packageInfo.versionName);
                map3.put(RemoteConfigConstants.RequestFieldKey.APP_BUILD, Long.toString(PackageInfoCompat.getLongVersionCode(packageInfo)));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        map3.put("packageName", this.f33053a.getPackageName());
        map3.put("sdkVersion", BuildConfig.VERSION_NAME);
        map3.put(RemoteConfigConstants.RequestFieldKey.ANALYTICS_USER_PROPERTIES, new JSONObject(map));
        if (!map2.isEmpty()) {
            map3.put(RemoteConfigConstants.RequestFieldKey.CUSTOM_SIGNALS, new JSONObject(map2));
            Log.d(FirebaseRemoteConfig.TAG, "Keys of custom signals during fetch: " + map2.keySet());
        }
        if (l10 != null) {
            map3.put(RemoteConfigConstants.RequestFieldKey.FIRST_OPEN_TIME, b(l10.longValue()));
        }
        return new JSONObject(map3);
    }

    private static ConfigContainer e(JSONObject jSONObject, Date date) throws FirebaseRemoteConfigClientException {
        JSONObject jSONObject2;
        JSONArray jSONArray;
        JSONObject jSONObject3;
        try {
            ConfigContainer.Builder builderWithFetchTime = ConfigContainer.newBuilder().withFetchTime(date);
            JSONArray jSONArray2 = null;
            try {
                jSONObject2 = jSONObject.getJSONObject(RemoteConfigConstants.ResponseFieldKey.ENTRIES);
            } catch (JSONException unused) {
                jSONObject2 = null;
            }
            if (jSONObject2 != null) {
                builderWithFetchTime = builderWithFetchTime.replaceConfigsWith(jSONObject2);
            }
            try {
                jSONArray = jSONObject.getJSONArray(RemoteConfigConstants.ResponseFieldKey.EXPERIMENT_DESCRIPTIONS);
            } catch (JSONException unused2) {
                jSONArray = null;
            }
            if (jSONArray != null) {
                builderWithFetchTime = builderWithFetchTime.withAbtExperiments(jSONArray);
            }
            try {
                jSONObject3 = jSONObject.getJSONObject(RemoteConfigConstants.ResponseFieldKey.PERSONALIZATION_METADATA);
            } catch (JSONException unused3) {
                jSONObject3 = null;
            }
            if (jSONObject3 != null) {
                builderWithFetchTime = builderWithFetchTime.withPersonalizationMetadata(jSONObject3);
            }
            String string = jSONObject.has(RemoteConfigConstants.ResponseFieldKey.TEMPLATE_VERSION_NUMBER) ? jSONObject.getString(RemoteConfigConstants.ResponseFieldKey.TEMPLATE_VERSION_NUMBER) : null;
            if (string != null) {
                builderWithFetchTime.withTemplateVersionNumber(Long.parseLong(string));
            }
            try {
                jSONArray2 = jSONObject.getJSONArray(RemoteConfigConstants.ResponseFieldKey.ROLLOUT_METADATA);
            } catch (JSONException unused4) {
            }
            if (jSONArray2 != null) {
                builderWithFetchTime = builderWithFetchTime.withRolloutMetadata(jSONArray2);
            }
            return builderWithFetchTime.build();
        } catch (JSONException e10) {
            throw new FirebaseRemoteConfigClientException("Fetch failed: fetch response could not be parsed.", e10);
        }
    }

    private static String f(String str) {
        Matcher matcher = f33052h.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    private JSONObject g(URLConnection uRLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRLConnection.getInputStream(), D5.N));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int i10 = bufferedReader.read();
            if (i10 == -1) {
                return new JSONObject(sb2.toString());
            }
            sb2.append((char) i10);
        }
    }

    private String h(String str, String str2) {
        return String.format(RemoteConfigConstants.FETCH_REGEX_URL, str, str2);
    }

    private String i() {
        try {
            Context context = this.f33053a;
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
            if (packageCertificateHashBytes != null) {
                return Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
            }
            Log.e(FirebaseRemoteConfig.TAG, "Could not get fingerprint hash for package: " + this.f33053a.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e(FirebaseRemoteConfig.TAG, "No such package: " + this.f33053a.getPackageName(), e10);
            return null;
        }
    }

    private void j(HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.f33055c);
        httpURLConnection.setRequestProperty("X-Android-Package", this.f33053a.getPackageName());
        httpURLConnection.setRequestProperty("X-Android-Cert", i());
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str);
        httpURLConnection.setRequestProperty("Content-Type", D5.L);
        httpURLConnection.setRequestProperty("Accept", D5.L);
    }

    private void k(HttpURLConnection httpURLConnection, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
    }

    private void l(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    private void m(HttpURLConnection httpURLConnection, String str, String str2, Map map) {
        httpURLConnection.setDoOutput(true);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        httpURLConnection.setConnectTimeout((int) timeUnit.toMillis(this.f33058f));
        httpURLConnection.setReadTimeout((int) timeUnit.toMillis(this.f33059g));
        httpURLConnection.setRequestProperty(HttpHeaders.IF_NONE_MATCH, str);
        j(httpURLConnection, str2);
        k(httpURLConnection, map);
    }

    HttpURLConnection d() {
        try {
            return (HttpURLConnection) new URL(h(this.f33056d, this.f33057e)).openConnection();
        } catch (IOException e10) {
            throw new FirebaseRemoteConfigException(e10.getMessage());
        }
    }

    @Keep
    ConfigFetchHandler.FetchResponse fetch(HttpURLConnection httpURLConnection, String str, String str2, Map<String, String> map, String str3, Map<String, String> map2, Long l10, Date date, Map<String, String> map3) throws FirebaseRemoteConfigException {
        m(httpURLConnection, str3, str2, map2);
        try {
            try {
                l(httpURLConnection, c(str, str2, map, l10, map3).toString().getBytes(D5.N));
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 200) {
                    throw new FirebaseRemoteConfigServerException(responseCode, httpURLConnection.getResponseMessage());
                }
                String headerField = httpURLConnection.getHeaderField("ETag");
                JSONObject jSONObjectG = g(httpURLConnection);
                httpURLConnection.disconnect();
                try {
                    httpURLConnection.getInputStream().close();
                } catch (IOException unused) {
                }
                ConfigContainer configContainerE = e(jSONObjectG, date);
                return !a(jSONObjectG) ? ConfigFetchHandler.FetchResponse.forBackendHasNoUpdates(date, configContainerE) : ConfigFetchHandler.FetchResponse.forBackendUpdatesFetched(configContainerE, headerField);
            } catch (IOException | JSONException e10) {
                throw new FirebaseRemoteConfigClientException("The client had an error while calling the backend!", e10);
            }
        } finally {
        }
    }

    @VisibleForTesting
    public long getConnectTimeoutInSeconds() {
        return this.f33058f;
    }

    @VisibleForTesting
    public long getReadTimeoutInSeconds() {
        return this.f33059g;
    }
}
