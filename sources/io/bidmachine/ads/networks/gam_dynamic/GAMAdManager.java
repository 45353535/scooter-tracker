package io.bidmachine.ads.networks.gam_dynamic;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.explorestack.protobuf.StringValue;
import io.bidmachine.AdsFormat;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.protobuf.Waterfall;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes12.dex */
class GAMAdManager {

    @NonNull
    @VisibleForTesting
    final List<InternalAd> internalAdList = new ArrayList();

    @NonNull
    private final Object internalAdListLock = new Object();

    @NonNull
    @VisibleForTesting
    final Map<NetworkAdUnit, InternalAd> reservedInternalAdMap = new WeakHashMap();

    @NonNull
    private final Object reservedInternalAdMapLock = new Object();

    @NonNull
    private final ae.k tag;

    public GAMAdManager(@NonNull String str) {
        this.tag = new ae.k(str + "AdManager");
    }

    public static /* synthetic */ String a(GAMAdManager gAMAdManager, InternalAd internalAd) {
        gAMAdManager.getClass();
        return String.format("Store ad (%s, size - %s)", internalAd, Integer.valueOf(gAMAdManager.getLoadedAdCount(internalAd.getAdsFormat())));
    }

    public static /* synthetic */ String c(GAMAdManager gAMAdManager, InternalAd internalAd) {
        gAMAdManager.getClass();
        return String.format("Remove ad from caches (%s, size - %s)", internalAd, Integer.valueOf(gAMAdManager.getLoadedAdCount(internalAd.getAdsFormat())));
    }

    public static /* synthetic */ String d(GAMAdManager gAMAdManager, NetworkAdUnit networkAdUnit, InternalAd internalAd) {
        gAMAdManager.getClass();
        return String.format("Reserve ad (networkAdUnitId - %s, %s, %s / %s)", networkAdUnit.getId(), internalAd, Integer.valueOf(gAMAdManager.getReservedAdCount(internalAd.getAdsFormat())), Integer.valueOf(gAMAdManager.getLoadedAdCount(internalAd.getAdsFormat())));
    }

    public static /* synthetic */ int e(InternalAd internalAd, InternalAd internalAd2) {
        return -Double.compare(internalAd.getPrice(), internalAd2.getPrice());
    }

    public static /* synthetic */ String f(GAMAdManager gAMAdManager, NetworkAdUnit networkAdUnit, InternalAd internalAd) {
        gAMAdManager.getClass();
        return String.format("UnReserve ad (networkAdUnitId - %s, %s, %s / %s)", networkAdUnit.getId(), internalAd, Integer.valueOf(gAMAdManager.getReservedAdCount(internalAd.getAdsFormat())), Integer.valueOf(gAMAdManager.getLoadedAdCount(internalAd.getAdsFormat())));
    }

    @Nullable
    InternalAd findCheapestIdleAd(@NonNull AdsFormat adsFormat) {
        synchronized (this.internalAdListLock) {
            try {
                for (int size = this.internalAdList.size() - 1; size >= 0; size--) {
                    InternalAd internalAd = this.internalAdList.get(size);
                    if (internalAd.getAdsFormat() == adsFormat && !isAdReserved(internalAd)) {
                        return internalAd;
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Nullable
    InternalAd findMostExpensiveIdleAd(@NonNull AdsFormat adsFormat) {
        synchronized (this.internalAdListLock) {
            try {
                for (InternalAd internalAd : this.internalAdList) {
                    if (internalAd.getAdsFormat() == adsFormat && !isAdReserved(internalAd)) {
                        return internalAd;
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Nullable
    List<Waterfall.Result.CachedAdUnit> getCachedAdUnitList(@NonNull AdsFormat adsFormat) {
        synchronized (this.internalAdListLock) {
            try {
                if (this.internalAdList.isEmpty()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                for (InternalAd internalAd : this.internalAdList) {
                    if (internalAd.getAdsFormat() == adsFormat) {
                        Waterfall.Configuration.AdUnit adUnit = internalAd.getAdUnit();
                        Waterfall.Result.CachedAdUnit.Builder frozen = Waterfall.Result.CachedAdUnit.newBuilder().setPrice(adUnit.getPrice()).setFrozen(isAdReserved(internalAd));
                        if (adUnit.getAdUnitId() != null) {
                            frozen.setAdUnitId(adUnit.getAdUnitId());
                        }
                        StringValue serverParams = adUnit.getServerParams();
                        if (serverParams != null) {
                            frozen.setServerParams(serverParams);
                        }
                        InternalAdLoadData internalAdLoadData = internalAd.getInternalAdLoadData();
                        if (internalAdLoadData != null) {
                            Waterfall.Result.EstimatedPrice price = internalAdLoadData.getPrice();
                            if (price != null) {
                                frozen.setEstimatedPrice(price);
                            }
                            String adResponse = internalAdLoadData.getAdResponse();
                            if (!TextUtils.isEmpty(adResponse)) {
                                frozen.setAdResponse(StringValue.newBuilder().setValue(adResponse).build());
                            }
                        }
                        arrayList.add(frozen.build());
                    }
                }
                return arrayList;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    int getLoadedAdCount(@NonNull AdsFormat adsFormat) {
        int i10;
        synchronized (this.internalAdListLock) {
            try {
                Iterator<InternalAd> it = this.internalAdList.iterator();
                i10 = 0;
                while (it.hasNext()) {
                    if (it.next().getAdsFormat() == adsFormat) {
                        i10++;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i10;
    }

    @Nullable
    InternalAd getReservedAd(@NonNull NetworkAdUnit networkAdUnit) {
        InternalAd internalAd;
        synchronized (this.reservedInternalAdMapLock) {
            internalAd = this.reservedInternalAdMap.get(networkAdUnit);
        }
        return internalAd;
    }

    int getReservedAdCount(@NonNull AdsFormat adsFormat) {
        int i10;
        synchronized (this.reservedInternalAdMapLock) {
            try {
                Iterator<InternalAd> it = this.reservedInternalAdMap.values().iterator();
                i10 = 0;
                while (it.hasNext()) {
                    if (it.next().getAdsFormat() == adsFormat) {
                        i10++;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i10;
    }

    boolean isAdReserved(@NonNull InternalAd internalAd) {
        boolean zContainsValue;
        synchronized (this.reservedInternalAdMapLock) {
            zContainsValue = this.reservedInternalAdMap.containsValue(internalAd);
        }
        return zContainsValue;
    }

    boolean removeAdFromCaches(@NonNull final InternalAd internalAd) {
        boolean zRemove;
        synchronized (this.internalAdListLock) {
            try {
                zRemove = this.internalAdList.remove(internalAd);
                if (zRemove) {
                    io.bidmachine.core.a.b(this.tag, new ce.b() { // from class: io.bidmachine.ads.networks.gam_dynamic.e
                        @Override // ce.b
                        public final Object get() {
                            return GAMAdManager.c(this.f79287a, internalAd);
                        }
                    });
                }
                unReserveAd(internalAd);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zRemove;
    }

    void reserveAd(@NonNull final NetworkAdUnit networkAdUnit, @NonNull final InternalAd internalAd) {
        synchronized (this.reservedInternalAdMapLock) {
            io.bidmachine.core.a.b(this.tag, new ce.b() { // from class: io.bidmachine.ads.networks.gam_dynamic.d
                @Override // ce.b
                public final Object get() {
                    return GAMAdManager.d(this.f79283a, networkAdUnit, internalAd);
                }
            });
            this.reservedInternalAdMap.put(networkAdUnit, internalAd);
        }
    }

    @Nullable
    InternalAdData reserveMostExpensiveAd(@NonNull NetworkAdUnit networkAdUnit, @NonNull AdsFormat adsFormat) {
        synchronized (this.internalAdListLock) {
            try {
                InternalAd internalAdFindMostExpensiveIdleAd = findMostExpensiveIdleAd(adsFormat);
                if (internalAdFindMostExpensiveIdleAd == null) {
                    return null;
                }
                reserveAd(networkAdUnit, internalAdFindMostExpensiveIdleAd);
                return internalAdFindMostExpensiveIdleAd;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @VisibleForTesting
    void sortDescByPrice(@NonNull List<InternalAd> list) {
        Collections.sort(list, new Comparator() { // from class: io.bidmachine.ads.networks.gam_dynamic.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return GAMAdManager.e((InternalAd) obj, (InternalAd) obj2);
            }
        });
    }

    void storeAd(@NonNull final InternalAd internalAd) {
        synchronized (this.internalAdListLock) {
            try {
                if (this.internalAdList.contains(internalAd)) {
                    return;
                }
                this.internalAdList.add(internalAd);
                sortDescByPrice(this.internalAdList);
                io.bidmachine.core.a.b(this.tag, new ce.b() { // from class: io.bidmachine.ads.networks.gam_dynamic.b
                    @Override // ce.b
                    public final Object get() {
                        return GAMAdManager.a(this.f79276a, internalAd);
                    }
                });
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Nullable
    InternalAd storeOrSwapCheapestIdleAd(@NonNull InternalAd internalAd, int i10) {
        synchronized (this.internalAdListLock) {
            try {
                AdsFormat adsFormat = internalAd.getAdsFormat();
                InternalAd internalAd2 = null;
                if (getLoadedAdCount(adsFormat) >= i10) {
                    final InternalAd internalAdFindCheapestIdleAd = findCheapestIdleAd(adsFormat);
                    if (internalAdFindCheapestIdleAd != null && internalAdFindCheapestIdleAd.getPrice() <= internalAd.getPrice()) {
                        io.bidmachine.core.a.b(this.tag, new ce.b() { // from class: io.bidmachine.ads.networks.gam_dynamic.c
                            @Override // ce.b
                            public final Object get() {
                                return String.format("Remove cheapest ad (%s)", internalAdFindCheapestIdleAd);
                            }
                        });
                        removeAdFromCaches(internalAdFindCheapestIdleAd);
                        internalAd2 = internalAdFindCheapestIdleAd;
                    }
                    return null;
                }
                storeAd(internalAd);
                return internalAd2;
            } finally {
            }
        }
    }

    void unReserveAd(@NonNull InternalAd internalAd) {
        synchronized (this.reservedInternalAdMapLock) {
            try {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<NetworkAdUnit, InternalAd> entry : this.reservedInternalAdMap.entrySet()) {
                    if (entry.getValue().equals(internalAd)) {
                        arrayList.add(entry.getKey());
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    unReserveAd((NetworkAdUnit) it.next());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void unReserveAd(@NonNull final NetworkAdUnit networkAdUnit) {
        synchronized (this.reservedInternalAdMapLock) {
            try {
                final InternalAd internalAdRemove = this.reservedInternalAdMap.remove(networkAdUnit);
                if (internalAdRemove != null) {
                    io.bidmachine.core.a.b(this.tag, new ce.b() { // from class: io.bidmachine.ads.networks.gam_dynamic.f
                        @Override // ce.b
                        public final Object get() {
                            return GAMAdManager.f(this.f79290a, networkAdUnit, internalAdRemove);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
