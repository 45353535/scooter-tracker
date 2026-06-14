package io.bidmachine;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes12.dex */
public class NetworkAdUnitManager {

    @NonNull
    private final AtomicBoolean isNetworkAuctionNotified;

    @NonNull
    private final List<NetworkAdUnit> networkAdUnitList;

    @NonNull
    private final ae.k tag;

    public NetworkAdUnitManager() {
        this(null);
    }

    @NonNull
    NetworkAdUnit findOrAddWinnerNetworkAdUnit(@NonNull NetworkAdapter networkAdapter, @NonNull AdsFormat adsFormat, @NonNull Map<String, String> map) {
        String str = map.get(ProtoExtConstants.AD_UNIT_ID);
        NetworkAdUnit networkAdUnit = null;
        if (!TextUtils.isEmpty(str)) {
            for (NetworkAdUnit networkAdUnit2 : this.networkAdUnitList) {
                if (networkAdUnit2.getId().equals(str)) {
                    networkAdUnit = networkAdUnit2;
                }
            }
        }
        if (networkAdUnit != null) {
            return networkAdUnit;
        }
        NetworkAdUnit networkAdUnit3 = new NetworkAdUnit(networkAdapter, adsFormat, map);
        this.networkAdUnitList.add(networkAdUnit3);
        return networkAdUnit3;
    }

    @NonNull
    @VisibleForTesting
    List<NetworkAdUnit> getNetworkAdUnitList() {
        return this.networkAdUnitList;
    }

    void notifyNetworkAuctionResult(@Nullable NetworkAdUnit networkAdUnit) {
        if (this.isNetworkAuctionNotified.compareAndSet(false, true)) {
            io.bidmachine.core.a.c(this.tag, "notifyNetworkAuctionResult");
            for (NetworkAdUnit networkAdUnit2 : this.networkAdUnitList) {
                if (networkAdUnit2 == networkAdUnit) {
                    try {
                        networkAdUnit2.onWinAuction();
                    } catch (Throwable unused) {
                    }
                } else {
                    networkAdUnit2.onLossAuction();
                }
            }
        }
    }

    void notifyNetworkClearAuction() {
        if (this.networkAdUnitList.isEmpty()) {
            return;
        }
        io.bidmachine.core.a.c(this.tag, "notifyNetworkClearAuction");
        Iterator<NetworkAdUnit> it = this.networkAdUnitList.iterator();
        while (it.hasNext()) {
            try {
                it.next().clearAuction();
            } catch (Throwable unused) {
            }
        }
        this.networkAdUnitList.clear();
    }

    void setNetworkAdUnitList(@Nullable List<NetworkAdUnit> list) {
        this.networkAdUnitList.clear();
        if (io.bidmachine.core.h.G(list)) {
            return;
        }
        this.networkAdUnitList.addAll(list);
    }

    public NetworkAdUnitManager(@Nullable List<NetworkAdUnit> list) {
        this.tag = new ae.k("NetworkAdUnitManager");
        this.isNetworkAuctionNotified = new AtomicBoolean(false);
        this.networkAdUnitList = new CopyOnWriteArrayList();
        setNetworkAdUnitList(list);
    }
}
