package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import j$.util.Objects;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class ConfigSharedPrefsClient {

    @VisibleForTesting
    public static final long LAST_FETCH_TIME_IN_MILLIS_NO_FETCH_YET = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final Date f33101f = new Date(-1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final Date f33102g = new Date(-1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f33103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f33104b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f33105c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f33106d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f33107e = new Object();

    static class BackoffMetadata {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f33108a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Date f33109b;

        BackoffMetadata(int i10, Date date) {
            this.f33108a = i10;
            this.f33109b = date;
        }

        Date a() {
            return this.f33109b;
        }

        int b() {
            return this.f33108a;
        }
    }

    public static class RealtimeBackoffMetadata {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f33110a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Date f33111b;

        @VisibleForTesting
        public RealtimeBackoffMetadata(int i10, Date date) {
            this.f33110a = i10;
            this.f33111b = date;
        }

        Date a() {
            return this.f33111b;
        }

        int b() {
            return this.f33110a;
        }
    }

    public ConfigSharedPrefsClient(SharedPreferences sharedPreferences) {
        this.f33103a = sharedPreferences;
    }

    BackoffMetadata a() {
        BackoffMetadata backoffMetadata;
        synchronized (this.f33105c) {
            backoffMetadata = new BackoffMetadata(this.f33103a.getInt("num_failed_fetches", 0), new Date(this.f33103a.getLong("backoff_end_time_in_millis", -1L)));
        }
        return backoffMetadata;
    }

    String b() {
        return this.f33103a.getString("last_fetch_etag", null);
    }

    Date c() {
        return new Date(this.f33103a.getLong("last_fetch_time_in_millis", -1L));
    }

    @WorkerThread
    public void clear() {
        synchronized (this.f33104b) {
            this.f33103a.edit().clear().commit();
        }
    }

    long d() {
        return this.f33103a.getLong("last_template_version", 0L);
    }

    void e() {
        g(0, f33102g);
    }

    void f() {
        j(0, f33102g);
    }

    void g(int i10, Date date) {
        synchronized (this.f33105c) {
            this.f33103a.edit().putInt("num_failed_fetches", i10).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public Map<String, String> getCustomSignals() {
        try {
            JSONObject jSONObject = new JSONObject(this.f33103a.getString(RemoteConfigConstants.RequestFieldKey.CUSTOM_SIGNALS, JsonUtils.EMPTY_JSON));
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.optString(next));
            }
            return map;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    public long getFetchTimeoutInSeconds() {
        return this.f33103a.getLong("fetch_timeout_in_seconds", 60L);
    }

    public FirebaseRemoteConfigInfo getInfo() {
        FirebaseRemoteConfigInfoImpl firebaseRemoteConfigInfoImplBuild;
        synchronized (this.f33104b) {
            long j10 = this.f33103a.getLong("last_fetch_time_in_millis", -1L);
            int i10 = this.f33103a.getInt("last_fetch_status", 0);
            firebaseRemoteConfigInfoImplBuild = FirebaseRemoteConfigInfoImpl.a().b(i10).withLastSuccessfulFetchTimeInMillis(j10).a(new FirebaseRemoteConfigSettings.Builder().setFetchTimeoutInSeconds(this.f33103a.getLong("fetch_timeout_in_seconds", 60L)).setMinimumFetchIntervalInSeconds(this.f33103a.getLong("minimum_fetch_interval_in_seconds", ConfigFetchHandler.DEFAULT_MINIMUM_FETCH_INTERVAL_IN_SECONDS)).build()).build();
        }
        return firebaseRemoteConfigInfoImplBuild;
    }

    public long getMinimumFetchIntervalInSeconds() {
        return this.f33103a.getLong("minimum_fetch_interval_in_seconds", ConfigFetchHandler.DEFAULT_MINIMUM_FETCH_INTERVAL_IN_SECONDS);
    }

    public RealtimeBackoffMetadata getRealtimeBackoffMetadata() {
        RealtimeBackoffMetadata realtimeBackoffMetadata;
        synchronized (this.f33106d) {
            realtimeBackoffMetadata = new RealtimeBackoffMetadata(this.f33103a.getInt("num_failed_realtime_streams", 0), new Date(this.f33103a.getLong("realtime_backoff_end_time_in_millis", -1L)));
        }
        return realtimeBackoffMetadata;
    }

    void h(String str) {
        synchronized (this.f33104b) {
            this.f33103a.edit().putString("last_fetch_etag", str).apply();
        }
    }

    void i(long j10) {
        synchronized (this.f33104b) {
            this.f33103a.edit().putLong("last_template_version", j10).apply();
        }
    }

    void j(int i10, Date date) {
        synchronized (this.f33106d) {
            this.f33103a.edit().putInt("num_failed_realtime_streams", i10).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    void k() {
        synchronized (this.f33104b) {
            this.f33103a.edit().putInt("last_fetch_status", 1).apply();
        }
    }

    void l(Date date) {
        synchronized (this.f33104b) {
            this.f33103a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
        }
    }

    void m() {
        synchronized (this.f33104b) {
            this.f33103a.edit().putInt("last_fetch_status", 2).apply();
        }
    }

    @WorkerThread
    public void setConfigSettings(FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        synchronized (this.f33104b) {
            this.f33103a.edit().putLong("fetch_timeout_in_seconds", firebaseRemoteConfigSettings.getFetchTimeoutInSeconds()).putLong("minimum_fetch_interval_in_seconds", firebaseRemoteConfigSettings.getMinimumFetchIntervalInSeconds()).commit();
        }
    }

    public void setConfigSettingsWithoutWaitingOnDiskWrite(FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        synchronized (this.f33104b) {
            this.f33103a.edit().putLong("fetch_timeout_in_seconds", firebaseRemoteConfigSettings.getFetchTimeoutInSeconds()).putLong("minimum_fetch_interval_in_seconds", firebaseRemoteConfigSettings.getMinimumFetchIntervalInSeconds()).apply();
        }
    }

    public void setCustomSignals(Map<String, String> map) {
        boolean z10;
        synchronized (this.f33107e) {
            try {
                Map<String, String> customSignals = getCustomSignals();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    z10 = (key.length() <= 250 && (value == null || value.length() <= 500)) ? z10 | (value != null ? !Objects.equals(customSignals.put(key, value), value) : customSignals.remove(key) != null) : false;
                    Log.w(FirebaseRemoteConfig.TAG, String.format("Invalid custom signal: Custom signal keys must be %d characters or less, and values must be %d characters or less.", 250, 500));
                    return;
                }
                if (z10) {
                    if (customSignals.size() > 100) {
                        Log.w(FirebaseRemoteConfig.TAG, String.format("Invalid custom signal: Too many custom signals provided. The maximum allowed is %d.", 100));
                        return;
                    }
                    this.f33103a.edit().putString(RemoteConfigConstants.RequestFieldKey.CUSTOM_SIGNALS, new JSONObject(customSignals).toString()).commit();
                    Log.d(FirebaseRemoteConfig.TAG, "Keys of updated custom signals: " + getCustomSignals().keySet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void setRealtimeBackoffEndTime(Date date) {
        synchronized (this.f33106d) {
            this.f33103a.edit().putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }
}
