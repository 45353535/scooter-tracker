package com.google.firebase.installations.remote;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.heartbeatinfo.HeartBeatController;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.installations.remote.InstallationResponse;
import com.google.firebase.installations.remote.TokenResult;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.ironsource.D5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class FirebaseInstallationServiceClient {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f32914d = Pattern.compile("[0-9]+s");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Charset f32915e = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f32916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f32917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RequestLimiter f32918c = new RequestLimiter();

    public FirebaseInstallationServiceClient(@NonNull Context context, @NonNull Provider<HeartBeatController> provider) {
        this.f32916a = context;
        this.f32917b = provider;
    }

    private static String a(String str, String str2, String str3) {
        String str4;
        if (TextUtils.isEmpty(str)) {
            str4 = "";
        } else {
            str4 = ", " + str;
        }
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", str2, str3, str4);
    }

    private static JSONObject b(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put(RemoteConfigConstants.RequestFieldKey.APP_ID, str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:19.0.1");
            return jSONObject;
        } catch (JSONException e10) {
            throw new IllegalStateException(e10);
        }
    }

    private static JSONObject c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:19.0.1");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e10) {
            throw new IllegalStateException(e10);
        }
    }

    private String d() {
        try {
            Context context = this.f32916a;
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
            if (packageCertificateHashBytes != null) {
                return Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
            }
            Log.e("ContentValues", "Could not get fingerprint hash for package: " + this.f32916a.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("ContentValues", "No such package: " + this.f32916a.getPackageName(), e10);
            return null;
        }
    }

    private URL e(String str) throws FirebaseInstallationsException {
        try {
            return new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", str));
        } catch (MalformedURLException e10) {
            throw new FirebaseInstallationsException(e10.getMessage(), FirebaseInstallationsException.Status.UNAVAILABLE);
        }
    }

    private static byte[] f(JSONObject jSONObject) {
        return jSONObject.toString().getBytes("UTF-8");
    }

    private static boolean g(int i10) {
        return i10 >= 200 && i10 < 300;
    }

    private static void h() {
        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }

    private static void i(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        String strM = m(httpURLConnection);
        if (TextUtils.isEmpty(strM)) {
            return;
        }
        Log.w("Firebase-Installations", strM);
        Log.w("Firebase-Installations", a(str, str2, str3));
    }

    private HttpURLConnection j(URL url, String str) throws FirebaseInstallationsException {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", D5.L);
            httpURLConnection.addRequestProperty("Accept", D5.L);
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.f32916a.getPackageName());
            HeartBeatController heartBeatController = (HeartBeatController) this.f32917b.get();
            if (heartBeatController != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) Tasks.await(heartBeatController.getHeartBeatsHeader()));
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                    Log.w("ContentValues", "Failed to get heartbeats header", e10);
                } catch (ExecutionException e11) {
                    Log.w("ContentValues", "Failed to get heartbeats header", e11);
                }
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", d());
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
    }

    static long k(String str) {
        Preconditions.checkArgument(f32914d.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    private InstallationResponse l(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f32915e));
        TokenResult.Builder builder = TokenResult.builder();
        InstallationResponse.Builder builder2 = InstallationResponse.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("name")) {
                builder2.setUri(jsonReader.nextString());
            } else if (strNextName.equals("fid")) {
                builder2.setFid(jsonReader.nextString());
            } else if (strNextName.equals("refreshToken")) {
                builder2.setRefreshToken(jsonReader.nextString());
            } else if (strNextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if (strNextName2.equals("token")) {
                        builder.setToken(jsonReader.nextString());
                    } else if (strNextName2.equals("expiresIn")) {
                        builder.setTokenExpirationTimestamp(k(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                builder2.setAuthToken(builder.build());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return builder2.setResponseCode(InstallationResponse.ResponseCode.OK).build();
    }

    private static String m(HttpURLConnection httpURLConnection) {
        StringBuilder sb2;
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f32915e));
        try {
            try {
                sb2 = new StringBuilder();
            } catch (IOException unused) {
                bufferedReader.close();
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                }
                throw th2;
            }
        } catch (IOException unused3) {
        }
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            sb2.append(line);
            sb2.append('\n');
            return null;
        }
        String str = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb2);
        try {
            bufferedReader.close();
        } catch (IOException unused4) {
        }
        return str;
    }

    private TokenResult n(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f32915e));
        TokenResult.Builder builder = TokenResult.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("token")) {
                builder.setToken(jsonReader.nextString());
            } else if (strNextName.equals("expiresIn")) {
                builder.setTokenExpirationTimestamp(k(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return builder.setResponseCode(TokenResult.ResponseCode.OK).build();
    }

    private void o(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        q(httpURLConnection, f(b(str, str2)));
    }

    private void p(HttpURLConnection httpURLConnection) throws IOException {
        q(httpURLConnection, f(c()));
    }

    private static void q(URLConnection uRLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream == null) {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @NonNull
    public InstallationResponse createFirebaseInstallation(@NonNull String str, @Nullable String str2, @NonNull String str3, @NonNull String str4, @Nullable String str5) throws FirebaseInstallationsException {
        int responseCode;
        InstallationResponse installationResponseL;
        if (!this.f32918c.isRequestAllowed()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
        URL urlE = e(String.format("projects/%s/installations", str3));
        for (int i10 = 0; i10 <= 1; i10++) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionJ = j(urlE, str);
            try {
                try {
                    httpURLConnectionJ.setRequestMethod("POST");
                    httpURLConnectionJ.setDoOutput(true);
                    if (str5 != null) {
                        httpURLConnectionJ.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                    }
                    o(httpURLConnectionJ, str2, str4);
                    responseCode = httpURLConnectionJ.getResponseCode();
                    this.f32918c.setNextRequestTime(responseCode);
                } catch (Throwable th2) {
                    httpURLConnectionJ.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th2;
                }
            } catch (IOException | AssertionError unused) {
            }
            if (g(responseCode)) {
                installationResponseL = l(httpURLConnectionJ);
            } else {
                i(httpURLConnectionJ, str4, str, str3);
                if (responseCode == 429) {
                    throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.Status.TOO_MANY_REQUESTS);
                }
                if (responseCode < 500 || responseCode >= 600) {
                    h();
                    installationResponseL = InstallationResponse.builder().setResponseCode(InstallationResponse.ResponseCode.BAD_CONFIG).build();
                }
                httpURLConnectionJ.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
            httpURLConnectionJ.disconnect();
            TrafficStats.clearThreadStatsTag();
            return installationResponseL;
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
    }

    @NonNull
    public void deleteFirebaseInstallation(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4) throws FirebaseInstallationsException {
        int responseCode;
        int i10 = 0;
        URL urlE = e(String.format("projects/%s/installations/%s", str3, str2));
        while (i10 <= 1) {
            TrafficStats.setThreadStatsTag(32770);
            HttpURLConnection httpURLConnectionJ = j(urlE, str);
            try {
                httpURLConnectionJ.setRequestMethod("DELETE");
                httpURLConnectionJ.addRequestProperty("Authorization", "FIS_v2 " + str4);
                responseCode = httpURLConnectionJ.getResponseCode();
            } catch (IOException unused) {
            } catch (Throwable th2) {
                httpURLConnectionJ.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th2;
            }
            if (responseCode != 200 && responseCode != 401 && responseCode != 404) {
                i(httpURLConnectionJ, null, str, str3);
                if (responseCode != 429 && (responseCode < 500 || responseCode >= 600)) {
                    h();
                    throw new FirebaseInstallationsException("Bad config while trying to delete FID", FirebaseInstallationsException.Status.BAD_CONFIG);
                }
                i10++;
                httpURLConnectionJ.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
            httpURLConnectionJ.disconnect();
            TrafficStats.clearThreadStatsTag();
            return;
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
    }

    @NonNull
    public TokenResult generateAuthToken(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4) throws FirebaseInstallationsException {
        int responseCode;
        TokenResult tokenResultN;
        if (!this.f32918c.isRequestAllowed()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
        URL urlE = e(String.format("projects/%s/installations/%s/authTokens:generate", str3, str2));
        for (int i10 = 0; i10 <= 1; i10++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection httpURLConnectionJ = j(urlE, str);
            try {
                try {
                    httpURLConnectionJ.setRequestMethod("POST");
                    httpURLConnectionJ.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    httpURLConnectionJ.setDoOutput(true);
                    p(httpURLConnectionJ);
                    responseCode = httpURLConnectionJ.getResponseCode();
                    this.f32918c.setNextRequestTime(responseCode);
                } catch (IOException | AssertionError unused) {
                }
                if (g(responseCode)) {
                    tokenResultN = n(httpURLConnectionJ);
                } else {
                    i(httpURLConnectionJ, null, str, str3);
                    if (responseCode == 401 || responseCode == 404) {
                        tokenResultN = TokenResult.builder().setResponseCode(TokenResult.ResponseCode.AUTH_ERROR).build();
                    } else {
                        if (responseCode == 429) {
                            throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.Status.TOO_MANY_REQUESTS);
                        }
                        if (responseCode < 500 || responseCode >= 600) {
                            h();
                            tokenResultN = TokenResult.builder().setResponseCode(TokenResult.ResponseCode.BAD_CONFIG).build();
                        }
                    }
                }
                return tokenResultN;
            } finally {
                httpURLConnectionJ.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
    }
}
