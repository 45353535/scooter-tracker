package io.bidmachine;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.bidmachine.ads.networks.adaptiverendering.AdaptiveRenderingConfig;
import io.bidmachine.ads.networks.mraid.MraidConfig;
import io.bidmachine.ads.networks.nast.NastConfig;
import io.bidmachine.ads.networks.vast.VastConfig;
import io.bidmachine.protobuf.AdNetwork;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes12.dex */
public class NetworkRegistry {

    @NonNull
    @VisibleForTesting
    static final Map<String, NetworkAdapter> NETWORK_ADAPTER_MAP = new ConcurrentHashMap();

    @NonNull
    @VisibleForTesting
    static final Map<String, NetworkConfig> CORE_NETWORK_CONFIG_MAP = new ConcurrentHashMap();

    @NonNull
    @VisibleForTesting
    static final Map<String, NetworkConfig> FROM_INIT_NETWORK_CONFIG_MAP = new ConcurrentHashMap();

    @NonNull
    @VisibleForTesting
    static final Map<String, NetworkConfig> PENDING_NETWORK_CONFIG_MAP = new ConcurrentHashMap();

    @NonNull
    @VisibleForTesting
    static final Map<String, NetworkConfig> INITIALIZING_NETWORK_CONFIG_MAP = new ConcurrentHashMap();

    @NonNull
    @VisibleForTesting
    static final Map<String, NetworkConfig> INITIALIZED_NETWORK_CONFIG_MAP = new ConcurrentHashMap();

    @NonNull
    @VisibleForTesting
    static final Map<AdsType, Map<String, NetworkConfig>> INITIALIZED_CORE_NETWORK_CONFIG_TYPED_MAP = new ConcurrentHashMap(AdsType.values().length);

    @NonNull
    @VisibleForTesting
    static final Map<AdsType, Map<String, NetworkConfig>> INITIALIZED_NETWORK_CONFIG_TYPED_MAP = new ConcurrentHashMap(AdsType.values().length);

    @NonNull
    private static final AtomicBoolean IS_NETWORKS_INITIALIZING_EXECUTED = new AtomicBoolean(false);

    @NonNull
    private static final AtomicBoolean IS_CORE_NETWORKS_INITIALIZING = new AtomicBoolean(false);

    @NonNull
    private static final AtomicBoolean IS_CORE_NETWORKS_INITIALIZED = new AtomicBoolean(false);

    @NonNull
    private static final Object CORE_INITIALIZING_LOCK = new Object();

    @NonNull
    private static final Object INITIALIZING_LOCK = new Object();

    class a extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f79153b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f79154c;

        a(Context context, c cVar) {
            this.f79153b = context;
            this.f79154c = cVar;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
            NetworkRegistry.initializeNetworksAwait(this.f79153b);
            c cVar = this.f79154c;
            if (cVar != null) {
                cVar.a();
            }
        }
    }

    static final class b implements Runnable {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final Executor f79155h = Executors.newFixedThreadPool(Math.max(8, Runtime.getRuntime().availableProcessors() * 4));

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final Object f79156i = new Object();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        static final List f79157j = new CopyOnWriteArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ContextProvider f79158b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final InitializationParams f79159c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final NetworkConfig f79160d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final c f79161e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f79162f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final nd.l f79163g;

        private static class a implements InternalNetworkInitializationCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final WeakReference f79164a;

            public a(b bVar) {
                this.f79164a = new WeakReference(bVar);
            }

            @Override // io.bidmachine.InternalNetworkInitializationCallback
            public void onFail(NetworkAdapter networkAdapter, String str) {
                b bVar = (b) this.f79164a.get();
                if (bVar != null) {
                    bVar.f(str);
                }
            }

            @Override // io.bidmachine.InternalNetworkInitializationCallback
            public void onSuccess(NetworkAdapter networkAdapter) {
                b bVar = (b) this.f79164a.get();
                if (bVar != null) {
                    bVar.g(networkAdapter);
                }
            }
        }

        /* synthetic */ b(ContextProvider contextProvider, InitializationParams initializationParams, NetworkConfig networkConfig, c cVar, a aVar) {
            this(contextProvider, initializationParams, networkConfig, cVar);
        }

        private void d(Map map, AdsType adsType, String str, NetworkConfig networkConfig) {
            Map concurrentHashMap = (Map) map.get(adsType);
            if (concurrentHashMap == null) {
                concurrentHashMap = new ConcurrentHashMap();
                map.put(adsType, concurrentHashMap);
            }
            concurrentHashMap.put(str, networkConfig);
        }

        void e() {
            f79157j.add(this);
            try {
                f79155h.execute(this);
            } catch (Throwable th2) {
                io.bidmachine.core.a.p(th2);
                f("Exception creating network initialization task");
            }
        }

        void f(final String str) {
            io.bidmachine.core.a.f(this.f79162f, new ce.b() { // from class: io.bidmachine.z4
                @Override // ce.b
                public final Object get() {
                    return String.format("Initialization error: %s", str);
                }
            });
            this.f79163g.eventFinish(TrackEventType.HeaderBiddingNetworkInitialize, null, new nd.a().h(this.f79162f), ae.a.c(str));
            f79157j.remove(this);
        }

        void g(final NetworkAdapter networkAdapter) {
            io.bidmachine.core.a.b(this.f79162f, new ce.b() { // from class: io.bidmachine.a5
                @Override // ce.b
                public final Object get() {
                    NetworkAdapter networkAdapter2 = networkAdapter;
                    return String.format("Initialization completed: %s, %s", networkAdapter2.obtainNetworkSdkVersion(), networkAdapter2.getAdapterVersion());
                }
            });
            if (networkAdapter instanceof HeaderBiddingAdapter) {
                this.f79163g.eventFinish(TrackEventType.HeaderBiddingNetworkInitialize, null, new nd.a().h(this.f79162f), null);
            } else {
                this.f79163g.clearEvent(TrackEventType.HeaderBiddingNetworkInitialize);
            }
            f79157j.remove(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            io.bidmachine.core.a.c(this.f79162f, "Initialization started");
            try {
                this.f79163g.eventStart(TrackEventType.HeaderBiddingNetworkInitialize, new nd.j().e("HB_NETWORK", this.f79162f));
                NetworkAdapter networkAdapterObtainAdapter = NetworkRegistry.obtainAdapter(this.f79160d);
                networkAdapterObtainAdapter.setLogging(io.bidmachine.core.a.h());
                networkAdapterObtainAdapter.initialize(this.f79158b, this.f79159c, this.f79160d.getNetworkConfigParams(), new a(this));
                Map<String, NetworkConfig> map = NetworkRegistry.INITIALIZED_NETWORK_CONFIG_MAP;
                if (!map.containsKey(this.f79162f)) {
                    map.put(this.f79162f, this.f79160d);
                }
                for (AdsType adsType : this.f79160d.getSupportedAdsTypes(networkAdapterObtainAdapter)) {
                    synchronized (f79156i) {
                        try {
                            if (NetworkRegistry.CORE_NETWORK_CONFIG_MAP.containsKey(this.f79162f)) {
                                d(NetworkRegistry.INITIALIZED_CORE_NETWORK_CONFIG_TYPED_MAP, adsType, this.f79162f, this.f79160d);
                            }
                            d(NetworkRegistry.INITIALIZED_NETWORK_CONFIG_TYPED_MAP, adsType, this.f79162f, this.f79160d);
                        } finally {
                        }
                    }
                }
                NetworkRegistry.PENDING_NETWORK_CONFIG_MAP.remove(this.f79162f);
            } catch (Throwable th2) {
                io.bidmachine.core.a.p(th2);
                f("Network initialization exception");
            }
            c cVar = this.f79161e;
            if (cVar != null) {
                cVar.a();
            }
        }

        private b(ContextProvider contextProvider, InitializationParams initializationParams, NetworkConfig networkConfig, c cVar) {
            this.f79158b = contextProvider;
            this.f79159c = initializationParams;
            this.f79160d = networkConfig;
            this.f79161e = cVar;
            String networkKey = networkConfig.getNetworkKey();
            this.f79162f = networkKey;
            this.f79163g = new BidMachineTrackingObject(networkKey + "_initialize");
        }
    }

    interface c {
        void a();
    }

    public static /* synthetic */ void a(Context context, String str, final NetworkRegistryCallback networkRegistryCallback) {
        registerNetworks(context, str);
        io.bidmachine.core.h.U(new Runnable() { // from class: io.bidmachine.y4
            @Override // java.lang.Runnable
            public final void run() {
                NetworkRegistry.b(networkRegistryCallback);
            }
        });
    }

    public static /* synthetic */ void b(NetworkRegistryCallback networkRegistryCallback) {
        if (networkRegistryCallback != null) {
            networkRegistryCallback.onRegistered();
        }
    }

    @Nullable
    static String checkAndPutNetwork(@NonNull Context context, @NonNull AdsType adsType, @NonNull NetworkConfig networkConfig, @NonNull Map<String, NetworkConfig> map) {
        NetworkAdapter adapter = getAdapter(networkConfig.getNetworkKey());
        if (adapter == null) {
            return "Network not registered";
        }
        if (!adapter.isAdsTypeSupported(adsType)) {
            return "Network does not support this ad type";
        }
        if (!adapter.isInitialized(context)) {
            return "Network not initialized";
        }
        map.put(networkConfig.getNetworkKey(), networkConfig);
        return null;
    }

    @Nullable
    static Map<String, NetworkConfig> copyOrNullInitializedCoreNetworkConfigs(@NonNull AdsType adsType) {
        Map<String, NetworkConfig> map = INITIALIZED_CORE_NETWORK_CONFIG_TYPED_MAP.get(adsType);
        if (map == null) {
            return null;
        }
        return new HashMap(map);
    }

    @Nullable
    static Map<String, NetworkConfig> copyOrNullInitializedNetworkConfigs(@NonNull AdsType adsType) {
        Map<String, NetworkConfig> map = INITIALIZED_NETWORK_CONFIG_TYPED_MAP.get(adsType);
        if (map == null) {
            return null;
        }
        return new HashMap(map);
    }

    @NonNull
    static Map<String, NetworkConfig> createInitNetworkConfigMap() {
        return new HashMap(FROM_INIT_NETWORK_CONFIG_MAP);
    }

    @Nullable
    public static NetworkAdapter getAdapter(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return NETWORK_ADAPTER_MAP.get(str);
    }

    @Nullable
    static NetworkConfig getConfig(@Nullable String str) {
        if (str == null) {
            return null;
        }
        return INITIALIZED_NETWORK_CONFIG_MAP.get(str);
    }

    static Collection<NetworkConfig> getCoreNetworkConfigList() {
        return CORE_NETWORK_CONFIG_MAP.values();
    }

    static Collection<NetworkConfig> getPendingNetworkConfigList() {
        return PENDING_NETWORK_CONFIG_MAP.values();
    }

    private static void initializeNetwork(@NonNull ContextProvider contextProvider, @NonNull InitializationParams initializationParams, @NonNull NetworkConfig networkConfig, @Nullable c cVar) {
        synchronized (INITIALIZING_LOCK) {
            try {
                String networkKey = networkConfig.getNetworkKey();
                Map<String, NetworkConfig> map = INITIALIZING_NETWORK_CONFIG_MAP;
                if (!map.containsKey(networkKey)) {
                    map.put(networkKey, networkConfig);
                    new b(contextProvider, initializationParams, networkConfig, cVar, null).e();
                } else {
                    PENDING_NETWORK_CONFIG_MAP.remove(networkKey);
                    if (cVar != null) {
                        cVar.a();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static void initializeNetworksAsync(@NonNull Context context, @Nullable c cVar) {
        if (IS_NETWORKS_INITIALIZING_EXECUTED.compareAndSet(false, true)) {
            new a(context.getApplicationContext(), cVar).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void initializeNetworksAwait(@NonNull Context context) {
        initializeNetworksAwait(context, getPendingNetworkConfigList());
    }

    static void initializeNetworksSync(@NonNull Context context) {
        if (IS_NETWORKS_INITIALIZING_EXECUTED.compareAndSet(false, true)) {
            initializeNetworksAwait(context.getApplicationContext());
        }
    }

    static boolean isNetworkRegistered(@NonNull String str) {
        return getAdapter(str) != null;
    }

    static boolean isNetworksInitializingExecuted() {
        return IS_NETWORKS_INITIALIZING_EXECUTED.get();
    }

    @NonNull
    static NetworkAdapter obtainAdapter(@NonNull NetworkConfig networkConfig) {
        synchronized (NetworkRegistry.class) {
            try {
                String networkKey = networkConfig.getNetworkKey();
                NetworkAdapter adapter = getAdapter(networkKey);
                if (adapter != null) {
                    return adapter;
                }
                NetworkAdapter networkAdapterCreateNetworkAdapter = networkConfig.createNetworkAdapter();
                NETWORK_ADAPTER_MAP.put(networkKey, networkAdapterCreateNetworkAdapter);
                return networkAdapterCreateNetworkAdapter;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static void registerAndInitializeCoreNetworks(@NonNull Context context) {
        AtomicBoolean atomicBoolean = IS_CORE_NETWORKS_INITIALIZED;
        if (atomicBoolean.get()) {
            return;
        }
        synchronized (CORE_INITIALIZING_LOCK) {
            try {
                if (IS_CORE_NETWORKS_INITIALIZING.compareAndSet(false, true)) {
                    registerCoreNetworks();
                    initializeNetworksAwait(context, getCoreNetworkConfigList());
                    atomicBoolean.set(true);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static void registerCoreNetwork(@NonNull NetworkConfig networkConfig) {
        String networkKey = networkConfig.getNetworkKey();
        Map<String, NetworkConfig> map = CORE_NETWORK_CONFIG_MAP;
        if (map.containsKey(networkKey)) {
            return;
        }
        map.put(networkKey, networkConfig);
        registerNetwork(networkConfig);
    }

    static void registerCoreNetworks() {
        MraidConfig mraidConfig = new MraidConfig();
        AdsFormat adsFormat = AdsFormat.Banner;
        registerCoreNetwork(mraidConfig.withMediationConfig(adsFormat, new HashMap()).withMediationConfig(AdsFormat.InterstitialStatic, new HashMap()).withMediationConfig(AdsFormat.RewardedStatic, new HashMap()));
        registerCoreNetwork(new VastConfig().withMediationConfig(AdsFormat.InterstitialVideo, new HashMap()).withMediationConfig(AdsFormat.RewardedVideo, new HashMap()));
        registerCoreNetwork(new NastConfig().withMediationConfig(AdsFormat.Native, new HashMap()));
        registerCoreNetwork(new AdaptiveRenderingConfig().withMediationConfig(adsFormat, new HashMap()).withMediationConfig(AdsFormat.Interstitial, new HashMap()).withMediationConfig(AdsFormat.Rewarded, new HashMap()));
    }

    static void registerInitNetwork(@NonNull Context context, @NonNull AdNetwork adNetwork) {
        NetworkConfig networkConfigF;
        if (isNetworkRegistered(adNetwork.getName()) || (networkConfigF = v4.f(context, adNetwork)) == null) {
            return;
        }
        FROM_INIT_NETWORK_CONFIG_MAP.put(networkConfigF.getNetworkKey(), networkConfigF);
        registerNetwork(networkConfigF);
    }

    static void registerNetwork(@Nullable NetworkConfig networkConfig) {
        j2 j2VarE;
        Context contextG;
        if (networkConfig == null || isNetworkRegistered(networkConfig.getNetworkKey())) {
            return;
        }
        obtainAdapter(networkConfig);
        PENDING_NETWORK_CONFIG_MAP.put(networkConfig.getNetworkKey(), networkConfig);
        if (!isNetworksInitializingExecuted() || (contextG = (j2VarE = j2.e()).g()) == null) {
            return;
        }
        initializeNetwork(new SimpleContextProvider(contextG), new i4(j2VarE.u(), j2VarE.w()), networkConfig, null);
    }

    static void registerNetworks(@Nullable NetworkConfig... networkConfigArr) {
        if (networkConfigArr == null) {
            return;
        }
        for (NetworkConfig networkConfig : networkConfigArr) {
            registerNetwork(networkConfig);
        }
    }

    @VisibleForTesting
    static void reset() {
        NETWORK_ADAPTER_MAP.clear();
        CORE_NETWORK_CONFIG_MAP.clear();
        FROM_INIT_NETWORK_CONFIG_MAP.clear();
        PENDING_NETWORK_CONFIG_MAP.clear();
        INITIALIZING_NETWORK_CONFIG_MAP.clear();
        INITIALIZED_NETWORK_CONFIG_MAP.clear();
        INITIALIZED_CORE_NETWORK_CONFIG_TYPED_MAP.clear();
        INITIALIZED_NETWORK_CONFIG_TYPED_MAP.clear();
        IS_NETWORKS_INITIALIZING_EXECUTED.set(false);
        IS_CORE_NETWORKS_INITIALIZING.set(false);
        IS_CORE_NETWORKS_INITIALIZED.set(false);
        b.f79157j.clear();
    }

    static void setLoggingEnabled(boolean z10) {
        Iterator<Map.Entry<String, NetworkAdapter>> it = NETWORK_ADAPTER_MAP.entrySet().iterator();
        while (it.hasNext()) {
            try {
                it.next().getValue().setLogging(z10);
            } catch (Throwable th2) {
                io.bidmachine.core.a.p(th2);
            }
        }
    }

    private static void initializeNetworksAwait(@NonNull Context context, @NonNull Collection<NetworkConfig> collection) {
        j2 j2VarE = j2.e();
        initializeNetworksAwait(new SimpleContextProvider(context), new i4(j2VarE.u(), j2VarE.w()), collection);
    }

    static void registerNetworks(@NonNull Context context, @Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                NetworkConfig networkConfigH = v4.h(context, jSONArray.getJSONObject(i10));
                if (networkConfigH != null) {
                    registerNetwork(networkConfigH);
                }
            }
        } catch (JSONException e10) {
            io.bidmachine.core.a.p(e10);
        }
    }

    private static void initializeNetworksAwait(@NonNull ContextProvider contextProvider, @NonNull InitializationParams initializationParams, @NonNull Collection<NetworkConfig> collection) {
        if (collection.isEmpty()) {
            return;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(collection.size());
        Iterator<NetworkConfig> it = collection.iterator();
        while (it.hasNext()) {
            initializeNetwork(contextProvider, initializationParams, it.next(), new c() { // from class: io.bidmachine.x4
                @Override // io.bidmachine.NetworkRegistry.c
                public final void a() {
                    countDownLatch.countDown();
                }
            });
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e10) {
            io.bidmachine.core.a.p(e10);
        }
    }

    static void registerNetworks(@NonNull final Context context, @Nullable final String str, @Nullable final NetworkRegistryCallback networkRegistryCallback) {
        x2.a().execute(new i9.b() { // from class: io.bidmachine.w4
            @Override // ae.j
            public /* synthetic */ void c(Throwable th2) {
                i9.a.a(this, th2);
            }

            @Override // ae.j
            public final void onRun() {
                NetworkRegistry.a(context, str, networkRegistryCallback);
            }

            @Override // java.lang.Runnable
            public /* synthetic */ void run() {
                ae.i.a(this);
            }
        });
    }
}
