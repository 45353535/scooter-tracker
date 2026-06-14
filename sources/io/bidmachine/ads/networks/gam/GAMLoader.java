package io.bidmachine.ads.networks.gam;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.bidmachine.AdsFormat;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.ads.networks.gam.GAMLoader;
import io.bidmachine.ads.networks.gam.versions.VersionWrapper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes12.dex */
public class GAMLoader {
    static final int DEFAULT_BOTTOM_BORDER_LOADED_AD = 2;
    private static final int DEFAULT_REST_AD_LOAD_MS = 500;

    @NonNull
    private final Context applicationContext;
    private final long expirationTimeMs;

    @NonNull
    private final String networkName;

    @Nullable
    private final String requestAgent;

    @NonNull
    private final ae.k tag;

    @NonNull
    private final VersionWrapper versionWrapper;

    @NonNull
    private final Map<AdsFormat, GAMTypeConfig> gamTypeConfigMap = new HashMap();

    @NonNull
    private final GAMTaskLoader gamTaskLoader = new GAMTaskLoader();

    @NonNull
    @VisibleForTesting
    final List<InternalGAMAd> gamAdList = new ArrayList();

    @NonNull
    @VisibleForTesting
    final Map<NetworkAdUnit, InternalGAMAd> reservedGamAdMap = new WeakHashMap();

    @NonNull
    private final Object gamAdListLock = new Object();

    @NonNull
    private final Object reservedGamAdMapLock = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    static class GAMTaskLoader {
        private static final int CORE_POOL_SIZE;
        private static final int CPU_COUNT;

        @NonNull
        private final ScheduledExecutorService executorService = Executors.newScheduledThreadPool(CORE_POOL_SIZE);

        @NonNull
        private final Map<AdsFormat, Map<String, Future<?>>> submittedFutureMap = new EnumMap(AdsFormat.class);

        @NonNull
        private final Object submittedFutureMapLocker = new Object();

        static {
            int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
            CPU_COUNT = iAvailableProcessors;
            CORE_POOL_SIZE = Math.max(2, Math.min(iAvailableProcessors - 1, 4));
        }

        public static /* synthetic */ void a(GAMTaskLoader gAMTaskLoader, LoadAdUnitListTask loadAdUnitListTask, AdsFormat adsFormat) {
            gAMTaskLoader.getClass();
            loadAdUnitListTask.run();
            gAMTaskLoader.removeTask(adsFormat, loadAdUnitListTask.f79215id);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void loadTask(@NonNull final AdsFormat adsFormat, @NonNull final LoadAdUnitListTask loadAdUnitListTask) {
            try {
                synchronized (this.submittedFutureMapLocker) {
                    try {
                        Map<String, Future<?>> map = this.submittedFutureMap.get(adsFormat);
                        if (map == null || map.isEmpty()) {
                            Future<?> futureSubmit = this.executorService.submit(new Runnable() { // from class: io.bidmachine.ads.networks.gam.f
                                @Override // java.lang.Runnable
                                public final void run() {
                                    GAMLoader.GAMTaskLoader.a(this.f79220b, loadAdUnitListTask, adsFormat);
                                }
                            });
                            if (map == null) {
                                map = new HashMap<>();
                                this.submittedFutureMap.put(adsFormat, map);
                            }
                            map.put(loadAdUnitListTask.f79215id, futureSubmit);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable unused) {
            }
        }

        private void removeTask(@NonNull AdsFormat adsFormat, @NonNull String str) {
            synchronized (this.submittedFutureMapLocker) {
                try {
                    Map<String, Future<?>> map = this.submittedFutureMap.get(adsFormat);
                    if (map != null) {
                        map.remove(str);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class LoadAdUnitListTask implements Runnable {

        @NonNull
        private final GAMLoader gamLoader;

        @NonNull
        private final GAMTypeConfig gamTypeConfig;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @NonNull
        private final String f79215id;
        private final int restAdLoadMs;

        private static class AwaitLoadListener implements InternalLoadListener {

            @NonNull
            private final CountDownLatch countDownLatch;

            @Override // io.bidmachine.ads.networks.gam.InternalLoadListener
            public void onAdLoadFailed(@NonNull InternalGAMAd internalGAMAd, @NonNull ae.a aVar) {
                this.countDownLatch.countDown();
            }

            @Override // io.bidmachine.ads.networks.gam.InternalLoadListener
            public void onAdLoaded(@NonNull InternalGAMAd internalGAMAd) {
                this.countDownLatch.countDown();
            }

            private AwaitLoadListener(@NonNull CountDownLatch countDownLatch) {
                this.countDownLatch = countDownLatch;
            }
        }

        private boolean loadGAMAdSync(@NonNull InternalGAMAd internalGAMAd) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            try {
                internalGAMAd.load(this.gamLoader.applicationContext, new AwaitLoadListener(countDownLatch));
                countDownLatch.await();
            } catch (Throwable unused) {
                countDownLatch.countDown();
            }
            if (internalGAMAd.isLoaded()) {
                this.gamLoader.storeGAMAd(internalGAMAd);
                return true;
            }
            this.gamLoader.destroyGAMAd(internalGAMAd);
            return false;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Iterator it = new ArrayList(this.gamTypeConfig.getGAMUnitDataList()).iterator();
                while (it.hasNext()) {
                    InternalGAMAd internalGAMAdCreateAd = this.gamLoader.versionWrapper.createAd(this.gamLoader, this.gamTypeConfig.getAdsFormat(), (GAMUnitData) it.next());
                    if (internalGAMAdCreateAd != null) {
                        if (loadGAMAdSync(internalGAMAdCreateAd)) {
                            return;
                        } else {
                            Thread.sleep(this.restAdLoadMs);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }

        private LoadAdUnitListTask(@NonNull GAMLoader gAMLoader, @NonNull GAMTypeConfig gAMTypeConfig, int i10) {
            this.f79215id = UUID.randomUUID().toString();
            this.gamLoader = gAMLoader;
            this.gamTypeConfig = gAMTypeConfig;
            this.restAdLoadMs = i10;
        }
    }

    GAMLoader(@NonNull Context context, @NonNull VersionWrapper versionWrapper, @NonNull String str, @NonNull Map<AdsFormat, GAMTypeConfig> map, @Nullable String str2, long j10) {
        this.tag = new ae.k(str + "Loader");
        this.applicationContext = context;
        this.versionWrapper = versionWrapper;
        this.networkName = str;
        this.requestAgent = str2;
        this.expirationTimeMs = j10;
        for (AdsFormat adsFormat : AdsFormat.values()) {
            GAMTypeConfig gAMTypeConfig = map.get(adsFormat);
            if (gAMTypeConfig != null && !gAMTypeConfig.getGAMUnitDataList().isEmpty()) {
                sortDescByScore(gAMTypeConfig.getGAMUnitDataList());
                this.gamTypeConfigMap.put(gAMTypeConfig.getAdsFormat(), gAMTypeConfig);
            }
        }
    }

    public static /* synthetic */ int b(GAMUnitData gAMUnitData, GAMUnitData gAMUnitData2) {
        return -Float.compare(gAMUnitData.getScore(), gAMUnitData2.getScore());
    }

    public static /* synthetic */ int d(InternalGAMAd internalGAMAd, InternalGAMAd internalGAMAd2) {
        return -Float.compare(internalGAMAd.getScope(), internalGAMAd2.getScope());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroyGAMAd(@NonNull InternalGAMAd internalGAMAd) {
        try {
            internalGAMAd.destroy();
        } catch (Throwable unused) {
        }
        removeFromCaches(internalGAMAd);
    }

    private int loadedGAMAdCount(@NonNull GAMTypeConfig gAMTypeConfig) {
        int i10;
        synchronized (this.gamAdListLock) {
            try {
                Iterator<InternalGAMAd> it = this.gamAdList.iterator();
                i10 = 0;
                while (it.hasNext()) {
                    if (it.next().getAdsFormat() == gAMTypeConfig.getAdsFormat()) {
                        i10++;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i10;
    }

    private void removeFromCaches(@NonNull final InternalGAMAd internalGAMAd) {
        synchronized (this.gamAdListLock) {
            try {
                if (this.gamAdList.remove(internalGAMAd)) {
                    io.bidmachine.core.a.b(this.tag, new ce.b() { // from class: io.bidmachine.ads.networks.gam.d
                        @Override // ce.b
                        public final Object get() {
                            return String.format("removeFromCaches (%s)", internalGAMAd);
                        }
                    });
                }
                unReserveGAMAd(internalGAMAd);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void sortDescByScore(@NonNull List<GAMUnitData> list) {
        Collections.sort(list, new Comparator() { // from class: io.bidmachine.ads.networks.gam.c
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return GAMLoader.b((GAMUnitData) obj, (GAMUnitData) obj2);
            }
        });
    }

    @VisibleForTesting
    void clear() {
        this.gamTypeConfigMap.clear();
        this.gamAdList.clear();
        this.reservedGamAdMap.clear();
    }

    @Nullable
    @VisibleForTesting
    InternalGAMAd findMostExpensiveIdleGAMAd(@NonNull String str) {
        synchronized (this.gamAdListLock) {
            try {
                for (InternalGAMAd internalGAMAd : this.gamAdList) {
                    if (internalGAMAd.getAdUnitId().equals(str) && !isReserved(internalGAMAd)) {
                        return internalGAMAd;
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public long getExpirationTimeMs() {
        return this.expirationTimeMs;
    }

    @NonNull
    public String getNetworkName() {
        return this.networkName;
    }

    @Nullable
    public String getRequestAgent() {
        return this.requestAgent;
    }

    @Nullable
    InternalGAMAd getReservedGAMAd(@NonNull NetworkAdUnit networkAdUnit) {
        InternalGAMAd internalGAMAd;
        synchronized (this.reservedGamAdMapLock) {
            internalGAMAd = this.reservedGamAdMap.get(networkAdUnit);
        }
        return internalGAMAd;
    }

    @NonNull
    public VersionWrapper getVersionWrapper() {
        return this.versionWrapper;
    }

    @VisibleForTesting
    boolean isReserved(@NonNull InternalGAMAd internalGAMAd) {
        boolean zContainsValue;
        synchronized (this.reservedGamAdMapLock) {
            zContainsValue = this.reservedGamAdMap.containsValue(internalGAMAd);
        }
        return zContainsValue;
    }

    void load() {
        for (AdsFormat adsFormat : AdsFormat.values()) {
            load(adsFormat);
        }
    }

    void onGAMAdDestroy(@NonNull InternalGAMAd internalGAMAd, boolean z10) {
        if (!z10) {
            unReserveGAMAd(internalGAMAd);
        } else {
            internalGAMAd.release();
            removeFromCaches(internalGAMAd);
        }
    }

    void onGAMAdShown(@NonNull InternalGAMAd internalGAMAd) {
        removeFromCaches(internalGAMAd);
    }

    void reserveGAMAd(@NonNull final NetworkAdUnit networkAdUnit, @NonNull final InternalGAMAd internalGAMAd) {
        synchronized (this.reservedGamAdMapLock) {
            io.bidmachine.core.a.b(this.tag, new ce.b() { // from class: io.bidmachine.ads.networks.gam.e
                @Override // ce.b
                public final Object get() {
                    return String.format("reserveGAMAd (networkAdUnitId - %s, %s)", networkAdUnit.getId(), internalGAMAd);
                }
            });
            this.reservedGamAdMap.put(networkAdUnit, internalGAMAd);
        }
    }

    @Nullable
    GAMUnitData reserveMostExpensiveGAMAd(@NonNull NetworkAdUnit networkAdUnit, @NonNull String str) {
        synchronized (this.gamAdListLock) {
            try {
                InternalGAMAd internalGAMAdFindMostExpensiveIdleGAMAd = findMostExpensiveIdleGAMAd(str);
                if (internalGAMAdFindMostExpensiveIdleGAMAd == null) {
                    return null;
                }
                reserveGAMAd(networkAdUnit, internalGAMAdFindMostExpensiveIdleGAMAd);
                return internalGAMAdFindMostExpensiveIdleGAMAd.getGamUnitData();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @VisibleForTesting
    void storeGAMAd(@NonNull InternalGAMAd internalGAMAd) {
        synchronized (this.gamAdListLock) {
            try {
                if (this.gamAdList.contains(internalGAMAd)) {
                    return;
                }
                this.gamAdList.add(internalGAMAd);
                Collections.sort(this.gamAdList, new Comparator() { // from class: io.bidmachine.ads.networks.gam.a
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return GAMLoader.d((InternalGAMAd) obj, (InternalGAMAd) obj2);
                    }
                });
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void unReserveGAMAd(@NonNull final NetworkAdUnit networkAdUnit) {
        synchronized (this.reservedGamAdMapLock) {
            io.bidmachine.core.a.b(this.tag, new ce.b() { // from class: io.bidmachine.ads.networks.gam.b
                @Override // ce.b
                public final Object get() {
                    return String.format("unReserveGAMAd (networkAdUnitId - %s)", networkAdUnit.getId());
                }
            });
            this.reservedGamAdMap.remove(networkAdUnit);
        }
    }

    boolean load(@NonNull AdsFormat adsFormat) {
        GAMTypeConfig gAMTypeConfig = this.gamTypeConfigMap.get(adsFormat);
        if (gAMTypeConfig == null || loadedGAMAdCount(gAMTypeConfig) >= gAMTypeConfig.getCacheSize()) {
            return false;
        }
        this.gamTaskLoader.loadTask(adsFormat, new LoadAdUnitListTask(gAMTypeConfig, 500));
        return true;
    }

    @VisibleForTesting
    void unReserveGAMAd(@NonNull InternalGAMAd internalGAMAd) {
        synchronized (this.reservedGamAdMapLock) {
            try {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<NetworkAdUnit, InternalGAMAd> entry : this.reservedGamAdMap.entrySet()) {
                    if (entry.getValue().equals(internalGAMAd)) {
                        arrayList.add(entry.getKey());
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    unReserveGAMAd((NetworkAdUnit) it.next());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
