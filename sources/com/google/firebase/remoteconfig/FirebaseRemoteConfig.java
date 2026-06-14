package com.google.firebase.remoteconfig;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.XmlRes;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.abt.AbtException;
import com.google.firebase.abt.FirebaseABTesting;
import com.google.firebase.concurrent.FirebaseExecutors;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler;
import com.google.firebase.remoteconfig.internal.ConfigRealtimeHandler;
import com.google.firebase.remoteconfig.internal.ConfigSharedPrefsClient;
import com.google.firebase.remoteconfig.internal.DefaultsXmlParser;
import com.google.firebase.remoteconfig.internal.rollouts.RolloutsStateSubscriptionsHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class FirebaseRemoteConfig {
    public static final boolean DEFAULT_VALUE_FOR_BOOLEAN = false;
    public static final byte[] DEFAULT_VALUE_FOR_BYTE_ARRAY = new byte[0];
    public static final double DEFAULT_VALUE_FOR_DOUBLE = 0.0d;
    public static final long DEFAULT_VALUE_FOR_LONG = 0;
    public static final String DEFAULT_VALUE_FOR_STRING = "";
    public static final int LAST_FETCH_STATUS_FAILURE = 1;
    public static final int LAST_FETCH_STATUS_NO_FETCH_YET = 0;
    public static final int LAST_FETCH_STATUS_SUCCESS = -1;
    public static final int LAST_FETCH_STATUS_THROTTLED = 2;
    public static final String TAG = "FirebaseRemoteConfig";
    public static final int VALUE_SOURCE_DEFAULT = 1;
    public static final int VALUE_SOURCE_REMOTE = 2;
    public static final int VALUE_SOURCE_STATIC = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f32952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FirebaseApp f32953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FirebaseABTesting f32954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Executor f32955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ConfigCacheClient f32956e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ConfigCacheClient f32957f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ConfigCacheClient f32958g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ConfigFetchHandler f32959h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ConfigGetParameterHandler f32960i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ConfigSharedPrefsClient f32961j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final FirebaseInstallationsApi f32962k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ConfigRealtimeHandler f32963l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final RolloutsStateSubscriptionsHandler f32964m;

    FirebaseRemoteConfig(Context context, FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, FirebaseABTesting firebaseABTesting, Executor executor, ConfigCacheClient configCacheClient, ConfigCacheClient configCacheClient2, ConfigCacheClient configCacheClient3, ConfigFetchHandler configFetchHandler, ConfigGetParameterHandler configGetParameterHandler, ConfigSharedPrefsClient configSharedPrefsClient, ConfigRealtimeHandler configRealtimeHandler, RolloutsStateSubscriptionsHandler rolloutsStateSubscriptionsHandler) {
        this.f32952a = context;
        this.f32953b = firebaseApp;
        this.f32962k = firebaseInstallationsApi;
        this.f32954c = firebaseABTesting;
        this.f32955d = executor;
        this.f32956e = configCacheClient;
        this.f32957f = configCacheClient2;
        this.f32958g = configCacheClient3;
        this.f32959h = configFetchHandler;
        this.f32960i = configGetParameterHandler;
        this.f32961j = configSharedPrefsClient;
        this.f32963l = configRealtimeHandler;
        this.f32964m = rolloutsStateSubscriptionsHandler;
    }

    public static /* synthetic */ Void a(FirebaseRemoteConfig firebaseRemoteConfig, FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        firebaseRemoteConfig.f32961j.setConfigSettings(firebaseRemoteConfigSettings);
        return null;
    }

    public static /* synthetic */ Void c(FirebaseRemoteConfig firebaseRemoteConfig, CustomSignals customSignals) {
        firebaseRemoteConfig.f32961j.setCustomSignals(customSignals.f32950a);
        return null;
    }

    public static /* synthetic */ FirebaseRemoteConfigInfo e(Task task, Task task2) {
        return (FirebaseRemoteConfigInfo) task.getResult();
    }

    @NonNull
    public static FirebaseRemoteConfig getInstance() {
        return getInstance(FirebaseApp.getInstance());
    }

    public static /* synthetic */ Task i(final FirebaseRemoteConfig firebaseRemoteConfig, Task task, Task task2, Task task3) {
        firebaseRemoteConfig.getClass();
        if (!task.isSuccessful() || task.getResult() == null) {
            return Tasks.forResult(Boolean.FALSE);
        }
        ConfigContainer configContainer = (ConfigContainer) task.getResult();
        return (!task2.isSuccessful() || l(configContainer, (ConfigContainer) task2.getResult())) ? firebaseRemoteConfig.f32957f.put(configContainer).continueWith(firebaseRemoteConfig.f32955d, new Continuation() { // from class: com.google.firebase.remoteconfig.b
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task4) {
                return Boolean.valueOf(this.f32995a.m(task4));
            }
        }) : Tasks.forResult(Boolean.FALSE);
    }

    public static /* synthetic */ Void j(FirebaseRemoteConfig firebaseRemoteConfig) {
        firebaseRemoteConfig.f32957f.clear();
        firebaseRemoteConfig.f32956e.clear();
        firebaseRemoteConfig.f32958g.clear();
        firebaseRemoteConfig.f32961j.clear();
        return null;
    }

    private static boolean l(ConfigContainer configContainer, ConfigContainer configContainer2) {
        return configContainer2 == null || !configContainer.getFetchTime().equals(configContainer2.getFetchTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean m(Task task) {
        if (!task.isSuccessful()) {
            return false;
        }
        this.f32956e.clear();
        ConfigContainer configContainer = (ConfigContainer) task.getResult();
        if (configContainer == null) {
            Log.e(TAG, "Activated configs written to disk are null.");
            return true;
        }
        r(configContainer.getAbtExperiments());
        this.f32964m.publishActiveRolloutsState(configContainer);
        return true;
    }

    private Task o(Map map) {
        try {
            return this.f32958g.put(ConfigContainer.newBuilder().replaceConfigsWith((Map<String, String>) map).build()).onSuccessTask(FirebaseExecutors.directExecutor(), new SuccessContinuation() { // from class: com.google.firebase.remoteconfig.c
                @Override // com.google.android.gms.tasks.SuccessContinuation
                public final Task then(Object obj) {
                    return Tasks.forResult(null);
                }
            });
        } catch (JSONException e10) {
            Log.e(TAG, "The provided defaults map could not be processed.", e10);
            return Tasks.forResult(null);
        }
    }

    static List q(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            HashMap map = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
            arrayList.add(map);
        }
        return arrayList;
    }

    @NonNull
    public Task<Boolean> activate() {
        final Task<ConfigContainer> task = this.f32956e.get();
        final Task<ConfigContainer> task2 = this.f32957f.get();
        return Tasks.whenAllComplete((Task<?>[]) new Task[]{task, task2}).continueWithTask(this.f32955d, new Continuation() { // from class: com.google.firebase.remoteconfig.a
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task3) {
                return FirebaseRemoteConfig.i(this.f32992a, task, task2, task3);
            }
        });
    }

    @NonNull
    public ConfigUpdateListenerRegistration addOnConfigUpdateListener(@NonNull ConfigUpdateListener configUpdateListener) {
        return this.f32963l.addRealtimeConfigUpdateListener(configUpdateListener);
    }

    @NonNull
    public Task<FirebaseRemoteConfigInfo> ensureInitialized() {
        Task<ConfigContainer> task = this.f32957f.get();
        Task<ConfigContainer> task2 = this.f32958g.get();
        Task<ConfigContainer> task3 = this.f32956e.get();
        final Task taskCall = Tasks.call(this.f32955d, new Callable() { // from class: com.google.firebase.remoteconfig.h
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f33001b.getInfo();
            }
        });
        return Tasks.whenAllComplete((Task<?>[]) new Task[]{task, task2, task3, taskCall, this.f32962k.getId(), this.f32962k.getToken(false)}).continueWith(this.f32955d, new Continuation() { // from class: com.google.firebase.remoteconfig.i
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task4) {
                return FirebaseRemoteConfig.e(taskCall, task4);
            }
        });
    }

    @NonNull
    public Task<Void> fetch() {
        return this.f32959h.fetch().onSuccessTask(FirebaseExecutors.directExecutor(), new SuccessContinuation() { // from class: com.google.firebase.remoteconfig.k
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return Tasks.forResult(null);
            }
        });
    }

    @NonNull
    public Task<Boolean> fetchAndActivate() {
        return fetch().onSuccessTask(this.f32955d, new SuccessContinuation() { // from class: com.google.firebase.remoteconfig.j
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return this.f33181a.activate();
            }
        });
    }

    @NonNull
    public Map<String, FirebaseRemoteConfigValue> getAll() {
        return this.f32960i.getAll();
    }

    public boolean getBoolean(@NonNull String str) {
        return this.f32960i.getBoolean(str);
    }

    public double getDouble(@NonNull String str) {
        return this.f32960i.getDouble(str);
    }

    @NonNull
    public FirebaseRemoteConfigInfo getInfo() {
        return this.f32961j.getInfo();
    }

    @NonNull
    public Set<String> getKeysByPrefix(@NonNull String str) {
        return this.f32960i.getKeysByPrefix(str);
    }

    public long getLong(@NonNull String str) {
        return this.f32960i.getLong(str);
    }

    @NonNull
    public String getString(@NonNull String str) {
        return this.f32960i.getString(str);
    }

    @NonNull
    public FirebaseRemoteConfigValue getValue(@NonNull String str) {
        return this.f32960i.getValue(str);
    }

    RolloutsStateSubscriptionsHandler k() {
        return this.f32964m;
    }

    void n(boolean z10) {
        this.f32963l.setBackgroundState(z10);
    }

    void p() {
        this.f32957f.get();
        this.f32958g.get();
        this.f32956e.get();
    }

    void r(JSONArray jSONArray) {
        if (this.f32954c == null) {
            return;
        }
        try {
            this.f32954c.replaceAllExperiments(q(jSONArray));
        } catch (AbtException e10) {
            Log.w(TAG, "Could not update ABT experiments.", e10);
        } catch (JSONException e11) {
            Log.e(TAG, "Could not parse ABT experiments from the JSON response.", e11);
        }
    }

    @NonNull
    public Task<Void> reset() {
        return Tasks.call(this.f32955d, new Callable() { // from class: com.google.firebase.remoteconfig.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return FirebaseRemoteConfig.j(this.f32998b);
            }
        });
    }

    public void schedule(Runnable runnable) {
        this.f32955d.execute(runnable);
    }

    @NonNull
    public Task<Void> setConfigSettingsAsync(@NonNull final FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        return Tasks.call(this.f32955d, new Callable() { // from class: com.google.firebase.remoteconfig.g
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return FirebaseRemoteConfig.a(this.f32999b, firebaseRemoteConfigSettings);
            }
        });
    }

    @NonNull
    public Task<Void> setCustomSignals(@NonNull final CustomSignals customSignals) {
        return Tasks.call(this.f32955d, new Callable() { // from class: com.google.firebase.remoteconfig.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return FirebaseRemoteConfig.c(this.f32996b, customSignals);
            }
        });
    }

    @NonNull
    public Task<Void> setDefaultsAsync(@NonNull Map<String, Object> map) {
        HashMap map2 = new HashMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                map2.put(entry.getKey(), new String((byte[]) value));
            } else {
                map2.put(entry.getKey(), value.toString());
            }
        }
        return o(map2);
    }

    @NonNull
    public static FirebaseRemoteConfig getInstance(@NonNull FirebaseApp firebaseApp) {
        return ((RemoteConfigComponent) firebaseApp.get(RemoteConfigComponent.class)).e();
    }

    @NonNull
    public Task<Void> fetch(long j10) {
        return this.f32959h.fetch(j10).onSuccessTask(FirebaseExecutors.directExecutor(), new SuccessContinuation() { // from class: com.google.firebase.remoteconfig.d
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return Tasks.forResult(null);
            }
        });
    }

    @NonNull
    public Task<Void> setDefaultsAsync(@XmlRes int i10) {
        return o(DefaultsXmlParser.getDefaultsFromXml(this.f32952a, i10));
    }
}
