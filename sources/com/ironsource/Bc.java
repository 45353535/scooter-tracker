package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class Bc extends ng {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final V0 f40448e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final AbstractC4576v0 f40449f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bc(@NotNull V0 tools, @NotNull AbstractC4576v0 adUnitData) {
        super(tools, adUnitData);
        Intrinsics.checkNotNullParameter(tools, "tools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        this.f40448e = tools;
        this.f40449f = adUnitData;
    }

    private final C4373j2 b() {
        return new C4373j2("", new JSONObject(), null, 0, "");
    }

    private final Map<String, G> c() {
        C4642yf c4642yfG = this.f40449f.b().g();
        List<NetworkSettings> listM = this.f40449f.m();
        ArrayList<NetworkSettings> arrayList = new ArrayList();
        for (Object obj : listM) {
            NetworkSettings networkSettings = (NetworkSettings) obj;
            if (c4642yfG == null || c4642yfG.a(networkSettings, this.f40449f.b().a())) {
                if (!networkSettings.isBidder(this.f40449f.b().a())) {
                    arrayList.add(obj);
                }
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.g.e(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList, 10)), 16));
        for (NetworkSettings networkSettings2 : arrayList) {
            Pair pair = TuplesKt.to(networkSettings2.getProviderInstanceName(), new G(this.f40448e, this.f40449f, networkSettings2));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    private final List<C4424m2> d() {
        C4642yf c4642yfG = this.f40449f.b().g();
        List<NetworkSettings> listM = this.f40449f.m();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM) {
            NetworkSettings networkSettings = (NetworkSettings) obj;
            if (c4642yfG == null || c4642yfG.a(networkSettings, this.f40449f.b().a())) {
                if (!networkSettings.isBidder(this.f40449f.b().a())) {
                    arrayList.add(obj);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C4424m2(((NetworkSettings) it.next()).getProviderInstanceName()));
        }
        return arrayList2;
    }

    @Override // com.ironsource.ng
    public void a(@NotNull C adInstanceFactory, @NotNull og waterfallFetcherListener) {
        Intrinsics.checkNotNullParameter(adInstanceFactory, "adInstanceFactory");
        Intrinsics.checkNotNullParameter(waterfallFetcherListener, "waterfallFetcherListener");
        IronLog.INTERNAL.verbose(C4441n0.a(this.f40448e, "auction disabled", (String) null, 2, (Object) null));
        a(waterfallFetcherListener, b(), adInstanceFactory);
    }

    public final void a(@NotNull og waterfallFetcherListener, int i10, @NotNull String auctionFallback, @NotNull String auctionId, @NotNull C adInstanceFactory) {
        Intrinsics.checkNotNullParameter(waterfallFetcherListener, "waterfallFetcherListener");
        Intrinsics.checkNotNullParameter(auctionFallback, "auctionFallback");
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(adInstanceFactory, "adInstanceFactory");
        a(waterfallFetcherListener, new C4373j2(auctionId, new JSONObject(), null, i10, auctionFallback), adInstanceFactory);
    }

    private final void a(og ogVar, C4373j2 c4373j2, C c10) {
        IronLog.INTERNAL.verbose(C4441n0.a(this.f40448e, (String) null, (String) null, 3, (Object) null));
        ogVar.a(a(d(), c(), c4373j2, c10));
    }
}
