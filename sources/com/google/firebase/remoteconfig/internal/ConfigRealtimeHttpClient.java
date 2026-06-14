package com.google.firebase.remoteconfig.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.InstallationTokenResult;
import com.google.firebase.remoteconfig.BuildConfig;
import com.google.firebase.remoteconfig.ConfigUpdate;
import com.google.firebase.remoteconfig.ConfigUpdateListener;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.ironsource.D5;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class ConfigRealtimeHttpClient {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final int[] f33078t = {2, 4, 8, 16, 32, 64, 128, 256};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final Pattern f33079u = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f33080a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f33082c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private HttpURLConnection f33085f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ConfigAutoFetch f33086g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ScheduledExecutorService f33088i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ConfigFetchHandler f33089j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final FirebaseApp f33090k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final FirebaseInstallationsApi f33091l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    ConfigCacheClient f33092m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f33093n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f33094o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final ConfigSharedPrefsClient f33097r;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f33087h = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f33081b = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Random f33095p = new Random();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Clock f33096q = DefaultClock.getInstance();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f33083d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f33084e = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Object f33098s = new Object();

    public ConfigRealtimeHttpClient(FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, ConfigFetchHandler configFetchHandler, ConfigCacheClient configCacheClient, Context context, String str, Set<ConfigUpdateListener> set, ConfigSharedPrefsClient configSharedPrefsClient, ScheduledExecutorService scheduledExecutorService) {
        this.f33080a = set;
        this.f33088i = scheduledExecutorService;
        this.f33082c = Math.max(8 - configSharedPrefsClient.getRealtimeBackoffMetadata().b(), 1);
        this.f33090k = firebaseApp;
        this.f33089j = configFetchHandler;
        this.f33091l = firebaseInstallationsApi;
        this.f33092m = configCacheClient;
        this.f33093n = context;
        this.f33094o = str;
        this.f33097r = configSharedPrefsClient;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c2 A[Catch: all -> 0x0044, TryCatch #1 {all -> 0x0044, blocks: (B:9:0x0030, B:47:0x00be, B:49:0x00c2, B:50:0x00c6), top: B:88:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c6 A[Catch: all -> 0x0044, TRY_LEAVE, TryCatch #1 {all -> 0x0044, blocks: (B:9:0x0030, B:47:0x00be, B:49:0x00c2, B:50:0x00c6), top: B:88:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ com.google.android.gms.tasks.Task a(com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient r10, com.google.android.gms.tasks.Task r11, com.google.android.gms.tasks.Task r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 393
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient.a(com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient, com.google.android.gms.tasks.Task, com.google.android.gms.tasks.Task):com.google.android.gms.tasks.Task");
    }

    public static /* synthetic */ Task b(ConfigRealtimeHttpClient configRealtimeHttpClient, Task task, Task task2, Task task3) {
        configRealtimeHttpClient.getClass();
        if (!task.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for config update listener connection.", task.getException()));
        }
        if (!task2.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for config update listener connection.", task2.getException()));
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) configRealtimeHttpClient.n().openConnection();
            configRealtimeHttpClient.setRequestParams(httpURLConnection, (String) task2.getResult(), ((InstallationTokenResult) task.getResult()).getToken());
            return Tasks.forResult(httpURLConnection);
        } catch (IOException e10) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Failed to open HTTP stream connection", e10));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized boolean e() {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.Set r0 = r1.f33080a     // Catch: java.lang.Throwable -> L17
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            boolean r0 = r1.f33081b     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            boolean r0 = r1.f33083d     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            boolean r0 = r1.f33084e     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            r0 = 1
            goto L1a
        L17:
            r0 = move-exception
            goto L1c
        L19:
            r0 = 0
        L1a:
            monitor-exit(r1)
            return r0
        L1c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient.e():boolean");
    }

    private synchronized boolean f() {
        boolean zE;
        zE = e();
        if (zE) {
            u(true);
        }
        return zE;
    }

    private void g(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e10) {
                Log.d(FirebaseRemoteConfig.TAG, "Error closing connection stream.", e10);
            }
        }
    }

    private JSONObject h(String str) {
        HashMap map = new HashMap();
        map.put("project", j(this.f33090k.getOptions().getApplicationId()));
        map.put("namespace", this.f33094o);
        map.put("lastKnownVersionNumber", Long.toString(this.f33089j.getTemplateVersionNumber()));
        map.put(RemoteConfigConstants.RequestFieldKey.APP_ID, this.f33090k.getOptions().getApplicationId());
        map.put("sdkVersion", BuildConfig.VERSION_NAME);
        map.put(RemoteConfigConstants.RequestFieldKey.INSTANCE_ID, str);
        return new JSONObject(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void i() {
        this.f33083d = true;
    }

    private static String j(String str) {
        Matcher matcher = f33079u.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    private String k() {
        try {
            Context context = this.f33093n;
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
            if (packageCertificateHashBytes != null) {
                return Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
            }
            Log.e(FirebaseRemoteConfig.TAG, "Could not get fingerprint hash for package: " + this.f33093n.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.i(FirebaseRemoteConfig.TAG, "No such package: " + this.f33093n.getPackageName());
            return null;
        }
    }

    private long l(int i10) {
        int length = f33078t.length;
        if (i10 >= length) {
            i10 = length;
        }
        long millis = TimeUnit.MINUTES.toMillis(r0[i10 - 1]);
        return (millis / 2) + ((long) this.f33095p.nextInt((int) millis));
    }

    private String m(String str) {
        return String.format(RemoteConfigConstants.REALTIME_REGEX_URL, j(this.f33090k.getOptions().getApplicationId()), str);
    }

    private URL n() {
        try {
            return new URL(m(this.f33094o));
        } catch (MalformedURLException unused) {
            Log.e(FirebaseRemoteConfig.TAG, "URL is malformed");
            return null;
        }
    }

    private boolean o(int i10) {
        return i10 == 408 || i10 == 429 || i10 == 502 || i10 == 503 || i10 == 504;
    }

    private synchronized void p(long j10) {
        try {
            if (e()) {
                int i10 = this.f33082c;
                if (i10 > 0) {
                    this.f33082c = i10 - 1;
                    this.f33088i.schedule(new Runnable() { // from class: com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient.1
                        @Override // java.lang.Runnable
                        public void run() {
                            ConfigRealtimeHttpClient.this.beginRealtimeHttpStream();
                        }
                    }, j10, TimeUnit.MILLISECONDS);
                } else if (!this.f33084e) {
                    r(new FirebaseRemoteConfigClientException("Unable to connect to the server. Check your connection and try again.", FirebaseRemoteConfigException.Code.CONFIG_UPDATE_STREAM_ERROR));
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private String q(InputStream inputStream) {
        StringBuilder sb2 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb2.append(line);
            }
        } catch (IOException unused) {
            if (sb2.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void r(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        Iterator it = this.f33080a.iterator();
        while (it.hasNext()) {
            ((ConfigUpdateListener) it.next()).onError(firebaseRemoteConfigException);
        }
    }

    private synchronized void s() {
        this.f33082c = 8;
    }

    private void t(HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str);
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.f33090k.getOptions().getApiKey());
        httpURLConnection.setRequestProperty("X-Android-Package", this.f33093n.getPackageName());
        httpURLConnection.setRequestProperty("X-Android-Cert", k());
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Accept-Response-Streaming", "true");
        httpURLConnection.setRequestProperty("Content-Type", D5.L);
        httpURLConnection.setRequestProperty("Accept", D5.L);
    }

    private synchronized void u(boolean z10) {
        this.f33081b = z10;
    }

    private void v(Date date) {
        int iB = this.f33097r.getRealtimeBackoffMetadata().b() + 1;
        this.f33097r.j(iB, new Date(date.getTime() + l(iB)));
    }

    @SuppressLint({"VisibleForTests", "DefaultLocale"})
    public void beginRealtimeHttpStream() {
        if (f()) {
            if (new Date(this.f33096q.currentTimeMillis()).before(this.f33097r.getRealtimeBackoffMetadata().a())) {
                retryHttpConnectionWhenBackoffEnds();
            } else {
                final Task<HttpURLConnection> taskCreateRealtimeConnection = createRealtimeConnection();
                Tasks.whenAllComplete((Task<?>[]) new Task[]{taskCreateRealtimeConnection}).continueWith(this.f33088i, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.l
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task) {
                        return ConfigRealtimeHttpClient.a(this.f33155a, taskCreateRealtimeConnection, task);
                    }
                });
            }
        }
    }

    @VisibleForTesting
    public void closeRealtimeHttpConnection(InputStream inputStream, InputStream inputStream2) {
        HttpURLConnection httpURLConnection = this.f33085f;
        if (httpURLConnection != null && !this.f33084e) {
            httpURLConnection.disconnect();
        }
        g(inputStream);
        g(inputStream2);
    }

    @SuppressLint({"VisibleForTests"})
    public Task<HttpURLConnection> createRealtimeConnection() {
        final Task<InstallationTokenResult> token = this.f33091l.getToken(false);
        final Task<String> id2 = this.f33091l.getId();
        return Tasks.whenAllComplete((Task<?>[]) new Task[]{token, id2}).continueWithTask(this.f33088i, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.k
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return ConfigRealtimeHttpClient.b(this.f33152a, token, id2, task);
            }
        });
    }

    @SuppressLint({"VisibleForTests"})
    public Date getBackoffEndTime() {
        return this.f33097r.getRealtimeBackoffMetadata().a();
    }

    @SuppressLint({"VisibleForTests"})
    public int getNumberOfFailedStreams() {
        return this.f33097r.getRealtimeBackoffMetadata().b();
    }

    @SuppressLint({"VisibleForTests"})
    public synchronized void retryHttpConnectionWhenBackoffEnds() {
        p(Math.max(0L, this.f33097r.getRealtimeBackoffMetadata().a().getTime() - new Date(this.f33096q.currentTimeMillis()).getTime()));
    }

    public void setIsInBackground(boolean z10) {
        HttpURLConnection httpURLConnection;
        synchronized (this.f33098s) {
            try {
                this.f33084e = z10;
                ConfigAutoFetch configAutoFetch = this.f33086g;
                if (configAutoFetch != null) {
                    configAutoFetch.setIsInBackground(z10);
                }
                if (Build.VERSION.SDK_INT >= 26 && z10 && (httpURLConnection = this.f33085f) != null) {
                    httpURLConnection.disconnect();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @SuppressLint({"VisibleForTests"})
    public void setRequestParams(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        httpURLConnection.setRequestMethod("POST");
        t(httpURLConnection, str2);
        byte[] bytes = h(str).toString().getBytes(D5.N);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    @SuppressLint({"VisibleForTests"})
    public synchronized ConfigAutoFetch startAutoFetch(HttpURLConnection httpURLConnection) {
        return new ConfigAutoFetch(httpURLConnection, this.f33089j, this.f33092m, this.f33080a, new ConfigUpdateListener() { // from class: com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient.2
            @Override // com.google.firebase.remoteconfig.ConfigUpdateListener
            public void onError(@NonNull FirebaseRemoteConfigException firebaseRemoteConfigException) {
                ConfigRealtimeHttpClient.this.i();
                ConfigRealtimeHttpClient.this.r(firebaseRemoteConfigException);
            }

            @Override // com.google.firebase.remoteconfig.ConfigUpdateListener
            public void onUpdate(@NonNull ConfigUpdate configUpdate) {
            }
        }, this.f33088i, this.f33097r);
    }

    public void startHttpConnection() {
        p(0L);
    }
}
