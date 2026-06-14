package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.model.NetworkSettings;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f44028c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f44029d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap<String, ArrayList<a>> f44030a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f44031b;

    public enum a {
        ISAuctionPerformanceDidntAttemptToLoad,
        ISAuctionPerformanceFailedToLoad,
        ISAuctionPerformanceLoadedSuccessfully,
        ISAuctionPerformanceFailedToShow,
        ISAuctionPerformanceShowedSuccessfully,
        ISAuctionPerformanceNotPartOfWaterfall
    }

    public h(List<NetworkSettings> list, int i10) {
        this.f44031b = i10;
        for (NetworkSettings networkSettings : list) {
            this.f44030a.put(networkSettings.getProviderName(), new ArrayList<>());
        }
    }

    public void a(ConcurrentHashMap<String, a> concurrentHashMap) {
        if (this.f44031b == 0) {
            return;
        }
        for (String str : this.f44030a.keySet()) {
            a aVar = a.ISAuctionPerformanceNotPartOfWaterfall;
            if (concurrentHashMap.containsKey(str)) {
                aVar = concurrentHashMap.get(str);
            }
            ArrayList<a> arrayList = this.f44030a.get(str);
            if (this.f44031b != -1 && arrayList.size() == this.f44031b) {
                arrayList.remove(0);
            }
            arrayList.add(aVar);
        }
    }

    public String a(String str) {
        ArrayList<a> arrayList = this.f44030a.get(str);
        String str2 = "";
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<a> it = arrayList.iterator();
            str2 = "" + it.next().ordinal();
            while (it.hasNext()) {
                str2 = (str2 + StringUtils.COMMA) + it.next().ordinal();
            }
        }
        return str2;
    }
}
