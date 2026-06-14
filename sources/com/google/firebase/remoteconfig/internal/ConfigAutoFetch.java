package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.ConfigUpdate;
import com.google.firebase.remoteconfig.ConfigUpdateListener;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

/* JADX INFO: loaded from: classes9.dex */
public class ConfigAutoFetch {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f33003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HttpURLConnection f33004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ConfigFetchHandler f33005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ConfigCacheClient f33006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ConfigUpdateListener f33007e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ScheduledExecutorService f33008f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ConfigSharedPrefsClient f33011i;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Random f33009g = new Random();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f33012j = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Clock f33010h = DefaultClock.getInstance();

    public ConfigAutoFetch(HttpURLConnection httpURLConnection, ConfigFetchHandler configFetchHandler, ConfigCacheClient configCacheClient, Set<ConfigUpdateListener> set, ConfigUpdateListener configUpdateListener, ScheduledExecutorService scheduledExecutorService, ConfigSharedPrefsClient configSharedPrefsClient) {
        this.f33004b = httpURLConnection;
        this.f33005c = configFetchHandler;
        this.f33006d = configCacheClient;
        this.f33003a = set;
        this.f33007e = configUpdateListener;
        this.f33008f = scheduledExecutorService;
        this.f33011i = configSharedPrefsClient;
    }

    public static /* synthetic */ Task a(ConfigAutoFetch configAutoFetch, Task task, Task task2, long j10, int i10, Task task3) throws JSONException {
        configAutoFetch.getClass();
        if (!task.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Failed to auto-fetch config update.", task.getException()));
        }
        if (!task2.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Failed to get activated config for auto-fetch", task2.getException()));
        }
        ConfigFetchHandler.FetchResponse fetchResponse = (ConfigFetchHandler.FetchResponse) task.getResult();
        ConfigContainer configContainerBuild = (ConfigContainer) task2.getResult();
        if (!d(fetchResponse, j10).booleanValue()) {
            Log.d(FirebaseRemoteConfig.TAG, "Fetched template version is the same as SDK's current version. Retrying fetch.");
            configAutoFetch.b(i10, j10);
            return Tasks.forResult(null);
        }
        if (fetchResponse.getFetchedConfigs() == null) {
            Log.d(FirebaseRemoteConfig.TAG, "The fetch succeeded, but the backend had no updates.");
            return Tasks.forResult(null);
        }
        if (configContainerBuild == null) {
            configContainerBuild = ConfigContainer.newBuilder().build();
        }
        Set<String> changedParams = configContainerBuild.getChangedParams(fetchResponse.getFetchedConfigs());
        if (changedParams.isEmpty()) {
            Log.d(FirebaseRemoteConfig.TAG, "Config was fetched, but no params changed.");
            return Tasks.forResult(null);
        }
        configAutoFetch.c(ConfigUpdate.create(changedParams));
        return Tasks.forResult(null);
    }

    private void b(final int i10, final long j10) {
        if (i10 == 0) {
            h(new FirebaseRemoteConfigServerException("Unable to fetch the latest version of the template.", FirebaseRemoteConfigException.Code.CONFIG_UPDATE_NOT_FETCHED));
        } else {
            this.f33008f.schedule(new Runnable() { // from class: com.google.firebase.remoteconfig.internal.ConfigAutoFetch.1
                @Override // java.lang.Runnable
                public void run() throws Throwable {
                    ConfigAutoFetch.this.fetchLatestConfig(i10, j10);
                }
            }, this.f33009g.nextInt(4), TimeUnit.SECONDS);
        }
    }

    private synchronized void c(ConfigUpdate configUpdate) {
        Iterator it = this.f33003a.iterator();
        while (it.hasNext()) {
            ((ConfigUpdateListener) it.next()).onUpdate(configUpdate);
        }
    }

    private static Boolean d(ConfigFetchHandler.FetchResponse fetchResponse, long j10) {
        if (fetchResponse.getFetchedConfigs() != null) {
            return Boolean.valueOf(fetchResponse.getFetchedConfigs().getTemplateVersionNumber() >= j10);
        }
        return Boolean.valueOf(fetchResponse.b() == 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
    
        r5 = new org.json.JSONObject(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:
    
        if (r5.has("featureDisabled") == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        if (r5.getBoolean("featureDisabled") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
    
        r10.f33007e.onError(new com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException("The server is temporarily unavailable. Try again in a few minutes.", com.google.firebase.remoteconfig.FirebaseRemoteConfigException.Code.CONFIG_UPDATE_UNAVAILABLE));
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        if (f() == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        if (r5.has("latestTemplateVersionNumber") == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        r6 = r10.f33005c.getTemplateVersionNumber();
        r8 = r5.getLong("latestTemplateVersionNumber");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
    
        if (r8 <= r6) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007a, code lost:
    
        b(3, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0082, code lost:
    
        if (r5.has("retryIntervalSeconds") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0084, code lost:
    
        i(r5.getInt("retryIntervalSeconds"));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void e(java.io.InputStream r11) throws java.io.IOException {
        /*
            r10 = this;
            java.lang.String r0 = "retryIntervalSeconds"
            java.lang.String r1 = "latestTemplateVersionNumber"
            java.lang.String r2 = "featureDisabled"
            java.io.BufferedReader r3 = new java.io.BufferedReader
            java.io.InputStreamReader r4 = new java.io.InputStreamReader
            java.lang.String r5 = "utf-8"
            r4.<init>(r11, r5)
            r3.<init>(r4)
            java.lang.String r11 = ""
        L14:
            r4 = r11
        L15:
            java.lang.String r5 = r3.readLine()
            if (r5 == 0) goto La5
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            r6.append(r5)
            java.lang.String r4 = r6.toString()
            java.lang.String r6 = "}"
            boolean r5 = r5.contains(r6)
            if (r5 == 0) goto L15
            java.lang.String r4 = r10.g(r4)
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L3d
            goto L15
        L3d:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: org.json.JSONException -> L5d
            r5.<init>(r4)     // Catch: org.json.JSONException -> L5d
            boolean r4 = r5.has(r2)     // Catch: org.json.JSONException -> L5d
            if (r4 == 0) goto L5f
            boolean r4 = r5.getBoolean(r2)     // Catch: org.json.JSONException -> L5d
            if (r4 == 0) goto L5f
            com.google.firebase.remoteconfig.ConfigUpdateListener r4 = r10.f33007e     // Catch: org.json.JSONException -> L5d
            com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException r5 = new com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException     // Catch: org.json.JSONException -> L5d
            java.lang.String r6 = "The server is temporarily unavailable. Try again in a few minutes."
            com.google.firebase.remoteconfig.FirebaseRemoteConfigException$Code r7 = com.google.firebase.remoteconfig.FirebaseRemoteConfigException.Code.CONFIG_UPDATE_UNAVAILABLE     // Catch: org.json.JSONException -> L5d
            r5.<init>(r6, r7)     // Catch: org.json.JSONException -> L5d
            r4.onError(r5)     // Catch: org.json.JSONException -> L5d
            goto La5
        L5d:
            r4 = move-exception
            goto L8c
        L5f:
            boolean r4 = r10.f()     // Catch: org.json.JSONException -> L5d
            if (r4 == 0) goto L66
            goto La5
        L66:
            boolean r4 = r5.has(r1)     // Catch: org.json.JSONException -> L5d
            if (r4 == 0) goto L7e
            com.google.firebase.remoteconfig.internal.ConfigFetchHandler r4 = r10.f33005c     // Catch: org.json.JSONException -> L5d
            long r6 = r4.getTemplateVersionNumber()     // Catch: org.json.JSONException -> L5d
            long r8 = r5.getLong(r1)     // Catch: org.json.JSONException -> L5d
            int r4 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r4 <= 0) goto L7e
            r4 = 3
            r10.b(r4, r8)     // Catch: org.json.JSONException -> L5d
        L7e:
            boolean r4 = r5.has(r0)     // Catch: org.json.JSONException -> L5d
            if (r4 == 0) goto L14
            int r4 = r5.getInt(r0)     // Catch: org.json.JSONException -> L5d
            r10.i(r4)     // Catch: org.json.JSONException -> L5d
            goto L14
        L8c:
            com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException r5 = new com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException
            java.lang.Throwable r6 = r4.getCause()
            com.google.firebase.remoteconfig.FirebaseRemoteConfigException$Code r7 = com.google.firebase.remoteconfig.FirebaseRemoteConfigException.Code.CONFIG_UPDATE_MESSAGE_INVALID
            java.lang.String r8 = "Unable to parse config update message."
            r5.<init>(r8, r6, r7)
            r10.h(r5)
            java.lang.String r5 = "FirebaseRemoteConfig"
            java.lang.String r6 = "Unable to parse latest config update message."
            android.util.Log.e(r5, r6, r4)
            goto L14
        La5:
            r3.close()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.ConfigAutoFetch.e(java.io.InputStream):void");
    }

    private synchronized boolean f() {
        return this.f33003a.isEmpty();
    }

    private String g(String str) {
        int iIndexOf = str.indexOf(123);
        int iLastIndexOf = str.lastIndexOf(125);
        return (iIndexOf < 0 || iLastIndexOf < 0 || iIndexOf >= iLastIndexOf) ? "" : str.substring(iIndexOf, iLastIndexOf + 1);
    }

    private synchronized void h(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        Iterator it = this.f33003a.iterator();
        while (it.hasNext()) {
            ((ConfigUpdateListener) it.next()).onError(firebaseRemoteConfigException);
        }
    }

    private synchronized void i(int i10) {
        this.f33011i.setRealtimeBackoffEndTime(new Date(new Date(this.f33010h.currentTimeMillis()).getTime() + (((long) i10) * 1000)));
    }

    @VisibleForTesting
    public synchronized Task<Void> fetchLatestConfig(int i10, final long j10) throws Throwable {
        final int i11 = i10 - 1;
        try {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            final Task<ConfigFetchHandler.FetchResponse> taskFetchNowWithTypeAndAttemptNumber = this.f33005c.fetchNowWithTypeAndAttemptNumber(ConfigFetchHandler.FetchType.REALTIME, 3 - i11);
            final Task<ConfigContainer> task = this.f33006d.get();
            return Tasks.whenAllComplete((Task<?>[]) new Task[]{taskFetchNowWithTypeAndAttemptNumber, task}).continueWithTask(this.f33008f, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.a
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task2) {
                    return ConfigAutoFetch.a(this.f33125a, taskFetchNowWithTypeAndAttemptNumber, task, j10, i11, task2);
                }
            });
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @VisibleForTesting
    public void listenForNotifications() {
        HttpURLConnection httpURLConnection = this.f33004b;
        if (httpURLConnection == null) {
            return;
        }
        InputStream inputStream = null;
        try {
            try {
                try {
                    inputStream = httpURLConnection.getInputStream();
                    e(inputStream);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (IOException e10) {
                    if (!this.f33012j) {
                        Log.d(FirebaseRemoteConfig.TAG, "Real-time connection was closed due to an exception.", e10);
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                }
            } catch (IOException e11) {
                Log.d(FirebaseRemoteConfig.TAG, "Exception thrown when closing connection stream. Retrying connection...", e11);
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException e12) {
                    Log.d(FirebaseRemoteConfig.TAG, "Exception thrown when closing connection stream. Retrying connection...", e12);
                }
            }
            throw th2;
        }
    }

    public void setIsInBackground(boolean z10) {
        this.f33012j = z10;
    }
}
