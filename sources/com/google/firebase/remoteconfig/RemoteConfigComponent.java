package com.google.firebase.remoteconfig;

import android.app.Application;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.abt.FirebaseABTesting;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler;
import com.google.firebase.remoteconfig.internal.ConfigRealtimeHandler;
import com.google.firebase.remoteconfig.internal.ConfigSharedPrefsClient;
import com.google.firebase.remoteconfig.internal.ConfigStorageClient;
import com.google.firebase.remoteconfig.internal.Personalization;
import com.google.firebase.remoteconfig.internal.rollouts.RolloutsStateFactory;
import com.google.firebase.remoteconfig.internal.rollouts.RolloutsStateSubscriptionsHandler;
import com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
@KeepForSdk
public class RemoteConfigComponent implements FirebaseRemoteConfigInterop {
    public static final String ACTIVATE_FILE_NAME = "activate";
    public static final long CONNECTION_TIMEOUT_IN_SECONDS = 60;
    public static final String DEFAULTS_FILE_NAME = "defaults";

    @VisibleForTesting
    public static final String DEFAULT_NAMESPACE = "firebase";
    public static final String FETCH_FILE_NAME = "fetch";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Clock f32974j = DefaultClock.getInstance();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Random f32975k = new Random();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Map f32976l = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f32977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f32978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f32979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final FirebaseApp f32980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final FirebaseInstallationsApi f32981e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final FirebaseABTesting f32982f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Provider f32983g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f32984h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map f32985i;

    private static class GlobalBackgroundListener implements BackgroundDetector.BackgroundStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final AtomicReference f32986a = new AtomicReference();

        private GlobalBackgroundListener() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference = f32986a;
            if (atomicReference.get() == null) {
                GlobalBackgroundListener globalBackgroundListener = new GlobalBackgroundListener();
                if (androidx.compose.animation.core.c.a(atomicReference, null, globalBackgroundListener)) {
                    BackgroundDetector.initialize(application);
                    BackgroundDetector.getInstance().addListener(globalBackgroundListener);
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public void onBackgroundStateChanged(boolean z10) {
            RemoteConfigComponent.o(z10);
        }
    }

    RemoteConfigComponent(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, FirebaseABTesting firebaseABTesting, Provider provider) {
        this(context, scheduledExecutorService, firebaseApp, firebaseInstallationsApi, firebaseABTesting, provider, true);
    }

    public static /* synthetic */ AnalyticsConnector a() {
        return null;
    }

    private ConfigCacheClient d(String str, String str2) {
        return ConfigCacheClient.getInstance(this.f32979c, ConfigStorageClient.getInstance(this.f32978b, String.format("%s_%s_%s_%s.json", FirebaseABTesting.OriginService.REMOTE_CONFIG, this.f32984h, str, str2)));
    }

    private ConfigGetParameterHandler h(ConfigCacheClient configCacheClient, ConfigCacheClient configCacheClient2) {
        return new ConfigGetParameterHandler(this.f32979c, configCacheClient, configCacheClient2);
    }

    private static Personalization i(FirebaseApp firebaseApp, String str, Provider provider) {
        if (n(firebaseApp) && str.equals(DEFAULT_NAMESPACE)) {
            return new Personalization(provider);
        }
        return null;
    }

    private RolloutsStateSubscriptionsHandler k(ConfigCacheClient configCacheClient, ConfigCacheClient configCacheClient2) {
        return new RolloutsStateSubscriptionsHandler(configCacheClient, RolloutsStateFactory.create(configCacheClient, configCacheClient2), this.f32979c);
    }

    static ConfigSharedPrefsClient l(Context context, String str, String str2) {
        return new ConfigSharedPrefsClient(context.getSharedPreferences(String.format("%s_%s_%s_%s", FirebaseABTesting.OriginService.REMOTE_CONFIG, str, str2, "settings"), 0));
    }

    private static boolean m(FirebaseApp firebaseApp, String str) {
        return str.equals(DEFAULT_NAMESPACE) && n(firebaseApp);
    }

    private static boolean n(FirebaseApp firebaseApp) {
        return firebaseApp.getName().equals(FirebaseApp.DEFAULT_APP_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void o(boolean z10) {
        Iterator it = f32976l.values().iterator();
        while (it.hasNext()) {
            ((FirebaseRemoteConfig) it.next()).n(z10);
        }
    }

    synchronized FirebaseRemoteConfig c(FirebaseApp firebaseApp, String str, FirebaseInstallationsApi firebaseInstallationsApi, FirebaseABTesting firebaseABTesting, Executor executor, ConfigCacheClient configCacheClient, ConfigCacheClient configCacheClient2, ConfigCacheClient configCacheClient3, ConfigFetchHandler configFetchHandler, ConfigGetParameterHandler configGetParameterHandler, ConfigSharedPrefsClient configSharedPrefsClient, RolloutsStateSubscriptionsHandler rolloutsStateSubscriptionsHandler) throws Throwable {
        RemoteConfigComponent remoteConfigComponent;
        String str2;
        try {
            try {
                if (this.f32977a.containsKey(str)) {
                    remoteConfigComponent = this;
                    str2 = str;
                } else {
                    remoteConfigComponent = this;
                    str2 = str;
                    FirebaseRemoteConfig firebaseRemoteConfig = new FirebaseRemoteConfig(this.f32978b, firebaseApp, firebaseInstallationsApi, m(firebaseApp, str) ? firebaseABTesting : null, executor, configCacheClient, configCacheClient2, configCacheClient3, configFetchHandler, configGetParameterHandler, configSharedPrefsClient, j(firebaseApp, firebaseInstallationsApi, configFetchHandler, configCacheClient2, this.f32978b, str, configSharedPrefsClient), rolloutsStateSubscriptionsHandler);
                    firebaseRemoteConfig.p();
                    remoteConfigComponent.f32977a.put(str2, firebaseRemoteConfig);
                    f32976l.put(str2, firebaseRemoteConfig);
                }
                return (FirebaseRemoteConfig) remoteConfigComponent.f32977a.get(str2);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    FirebaseRemoteConfig e() {
        return get(DEFAULT_NAMESPACE);
    }

    synchronized ConfigFetchHandler f(String str, ConfigCacheClient configCacheClient, ConfigSharedPrefsClient configSharedPrefsClient) {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return new ConfigFetchHandler(this.f32981e, n(this.f32980d) ? this.f32983g : new Provider() { // from class: com.google.firebase.remoteconfig.n
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                return RemoteConfigComponent.a();
            }
        }, this.f32979c, f32974j, f32975k, configCacheClient, g(this.f32980d.getOptions().getApiKey(), str, configSharedPrefsClient), configSharedPrefsClient, this.f32985i);
    }

    ConfigFetchHttpClient g(String str, String str2, ConfigSharedPrefsClient configSharedPrefsClient) {
        return new ConfigFetchHttpClient(this.f32978b, this.f32980d.getOptions().getApplicationId(), str, str2, configSharedPrefsClient.getFetchTimeoutInSeconds(), configSharedPrefsClient.getFetchTimeoutInSeconds());
    }

    @KeepForSdk
    @VisibleForTesting
    public synchronized FirebaseRemoteConfig get(String str) throws Throwable {
        Throwable th2;
        try {
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            ConfigCacheClient configCacheClientD = d(str, FETCH_FILE_NAME);
            ConfigCacheClient configCacheClientD2 = d(str, ACTIVATE_FILE_NAME);
            ConfigCacheClient configCacheClientD3 = d(str, DEFAULTS_FILE_NAME);
            ConfigSharedPrefsClient configSharedPrefsClientL = l(this.f32978b, this.f32984h, str);
            ConfigGetParameterHandler configGetParameterHandlerH = h(configCacheClientD2, configCacheClientD3);
            final Personalization personalizationI = i(this.f32980d, str, this.f32983g);
            if (personalizationI != null) {
                try {
                    configGetParameterHandlerH.addListener(new BiConsumer() { // from class: com.google.firebase.remoteconfig.l
                        @Override // com.google.android.gms.common.util.BiConsumer
                        public final void accept(Object obj, Object obj2) {
                            personalizationI.logArmActive((String) obj, (ConfigContainer) obj2);
                        }
                    });
                } catch (Throwable th4) {
                    th2 = th4;
                    throw th2;
                }
            }
            return c(this.f32980d, str, this.f32981e, this.f32982f, this.f32979c, configCacheClientD, configCacheClientD2, configCacheClientD3, f(str, configCacheClientD, configSharedPrefsClientL), configGetParameterHandlerH, configSharedPrefsClientL, k(configCacheClientD2, configCacheClientD3));
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
    }

    synchronized ConfigRealtimeHandler j(FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, ConfigFetchHandler configFetchHandler, ConfigCacheClient configCacheClient, Context context, String str, ConfigSharedPrefsClient configSharedPrefsClient) {
        return new ConfigRealtimeHandler(firebaseApp, firebaseInstallationsApi, configFetchHandler, configCacheClient, context, str, configSharedPrefsClient, this.f32979c);
    }

    @Override // com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop
    public void registerRolloutsStateSubscriber(@NonNull String str, @NonNull RolloutsStateSubscriber rolloutsStateSubscriber) {
        get(str).k().registerRolloutsStateSubscriber(rolloutsStateSubscriber);
    }

    @VisibleForTesting
    public synchronized void setCustomHeaders(Map<String, String> map) {
        this.f32985i = map;
    }

    protected RemoteConfigComponent(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, FirebaseABTesting firebaseABTesting, Provider provider, boolean z10) {
        this.f32977a = new HashMap();
        this.f32985i = new HashMap();
        this.f32978b = context;
        this.f32979c = scheduledExecutorService;
        this.f32980d = firebaseApp;
        this.f32981e = firebaseInstallationsApi;
        this.f32982f = firebaseABTesting;
        this.f32983g = provider;
        this.f32984h = firebaseApp.getOptions().getApplicationId();
        GlobalBackgroundListener.b(context);
        if (z10) {
            Tasks.call(scheduledExecutorService, new Callable() { // from class: com.google.firebase.remoteconfig.m
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f33183b.e();
                }
            });
        }
    }
}
