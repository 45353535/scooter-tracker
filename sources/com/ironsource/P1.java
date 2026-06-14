package com.ironsource;

import com.ironsource.C4647z3;
import com.ironsource.P1;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class P1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final V0 f41533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final AbstractC4576v0 f41534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Map<String, G> f41535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final C4289e2 f41536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final List<CallableC4596w3> f41537e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f41538f;

    public static final class a extends AbstractRunnableC4232ae {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C4647z3 f41539b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ P1 f41540c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ C4647z3.b f41541d;

        a(C4647z3 c4647z3, P1 p12, C4647z3.b bVar) {
            this.f41539b = c4647z3;
            this.f41540c = p12;
            this.f41541d = bVar;
        }

        @Override // com.ironsource.AbstractRunnableC4232ae
        public void a() {
            this.f41539b.a(this.f41540c.e(), this.f41541d, this.f41540c.f41534b.f(), TimeUnit.MILLISECONDS);
        }
    }

    public static final class c implements C4647z3.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f41544b;

        c(d dVar) {
            this.f41544b = dVar;
        }

        @Override // com.ironsource.C4647z3.b
        public void a(@NotNull final List<? extends A3> biddingDataList, final long j10, @NotNull final List<String> reachedTimeout) {
            Intrinsics.checkNotNullParameter(biddingDataList, "biddingDataList");
            Intrinsics.checkNotNullParameter(reachedTimeout, "reachedTimeout");
            V0 v02 = P1.this.f41533a;
            final P1 p12 = P1.this;
            final d dVar = this.f41544b;
            v02.a(new Runnable() { // from class: com.ironsource.ui
                @Override // java.lang.Runnable
                public final void run() {
                    P1.c.a(p12, j10, biddingDataList, reachedTimeout, dVar);
                }
            });
        }

        @Override // com.ironsource.C4647z3.b
        public void onFailure(@NotNull final String error) {
            Intrinsics.checkNotNullParameter(error, "error");
            V0 v02 = P1.this.f41533a;
            final P1 p12 = P1.this;
            final d dVar = this.f41544b;
            v02.a(new Runnable() { // from class: com.ironsource.vi
                @Override // java.lang.Runnable
                public final void run() {
                    P1.c.a(p12, error, dVar);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(P1 this$0, long j10, List biddingDataList, List reachedTimeout, d biddingDataListener) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(biddingDataList, "$biddingDataList");
            Intrinsics.checkNotNullParameter(reachedTimeout, "$reachedTimeout");
            Intrinsics.checkNotNullParameter(biddingDataListener, "$biddingDataListener");
            this$0.a(j10, biddingDataList, reachedTimeout, biddingDataListener);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(P1 this$0, String error, d biddingDataListener) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(error, "$error");
            Intrinsics.checkNotNullParameter(biddingDataListener, "$biddingDataListener");
            this$0.f41533a.e().g().a(error);
            biddingDataListener.a(this$0, error);
        }
    }

    public interface d {
        void a(@NotNull P1 p12);

        void a(@NotNull P1 p12, @NotNull String str);
    }

    public P1(@NotNull V0 adTools, @NotNull AbstractC4576v0 adUnitData) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        this.f41533a = adTools;
        this.f41534b = adUnitData;
        this.f41535c = a();
        this.f41536d = new C4289e2(adUnitData);
        this.f41537e = new ArrayList();
        this.f41538f = adUnitData.e().q();
        b bVarB = b();
        C4642yf c4642yfG = adUnitData.b().g();
        for (NetworkSettings networkSettings : adUnitData.m()) {
            if (c4642yfG == null || c4642yfG.a(networkSettings, this.f41534b.b().a())) {
                AdData adDataA = this.f41534b.a(networkSettings);
                if (networkSettings.isBidder(this.f41534b.b().a())) {
                    Object objB = this.f41538f ? b(networkSettings.getProviderName()) : a(networkSettings);
                    if (objB instanceof InterfaceC4630y3) {
                        this.f41537e.add(new CallableC4596w3(networkSettings.getInstanceType(this.f41534b.b().a()), networkSettings.getProviderInstanceName(), adDataA, (InterfaceC4630y3) objB, bVarB, networkSettings));
                    } else {
                        this.f41533a.e().h().g(objB == null ? "prepareAuctionCandidates - could not load network adapter " + networkSettings.getProviderName() : "network adapter " + networkSettings.getProviderName() + " does not implementing BiddingDataInterface");
                    }
                } else {
                    this.f41536d.a(networkSettings);
                }
            }
        }
    }

    @NotNull
    public final Map<String, G> c() {
        return this.f41535c;
    }

    @NotNull
    public final C4289e2 d() {
        return this.f41536d;
    }

    @NotNull
    public final List<CallableC4596w3> e() {
        return this.f41537e;
    }

    public final boolean f() {
        return !this.f41537e.isEmpty();
    }

    public final boolean g() {
        return this.f41536d.d();
    }

    public final boolean h() {
        return this.f41538f;
    }

    private final b b() {
        return new b();
    }

    private final C4647z3.b b(d dVar) {
        return new c(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseAdAdapter<?, ?> b(String str) {
        G g10 = this.f41535c.get(str);
        if (g10 != null) {
            return g10.b();
        }
        return null;
    }

    public static final class b implements InterfaceC4613x3 {
        b() {
        }

        @Override // com.ironsource.InterfaceC4613x3
        public void a(@Nullable NetworkSettings networkSettings) {
            AdapterBaseInterface adapterBaseInterfaceA;
            if (P1.this.h()) {
                adapterBaseInterfaceA = null;
                BaseAdAdapter baseAdAdapterB = P1.this.b(networkSettings != null ? networkSettings.getProviderName() : null);
                if (baseAdAdapterB != null) {
                    adapterBaseInterfaceA = baseAdAdapterB.getNetworkAdapter();
                }
            } else {
                adapterBaseInterfaceA = P1.this.a(networkSettings);
            }
            if (adapterBaseInterfaceA != null) {
                P1.this.f41533a.e().g().a(P1.this.a(networkSettings, adapterBaseInterfaceA));
            }
        }

        @Override // com.ironsource.InterfaceC4613x3
        public void a(@Nullable String str) {
            P1.this.f41533a.e().h().g(str);
        }
    }

    private final Map<String, G> a() {
        List<NetworkSettings> listM = this.f41534b.m();
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.g.e(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(listM, 10)), 16));
        Iterator<T> it = listM.iterator();
        while (it.hasNext()) {
            G g10 = new G(this.f41533a, this.f41534b, (NetworkSettings) it.next());
            Pair pair = TuplesKt.to(g10.c(), g10);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    public final void a(@NotNull d biddingDataListener) {
        Intrinsics.checkNotNullParameter(biddingDataListener, "biddingDataListener");
        C4647z3 c4647z3 = new C4647z3();
        C4647z3.b bVarB = b(biddingDataListener);
        this.f41533a.e().g().a();
        this.f41533a.c((AbstractRunnableC4232ae) new a(c4647z3, this, bVarB));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(long j10, List<? extends A3> list, List<String> list2, d dVar) {
        this.f41533a.e().g().a(j10);
        for (A3 a32 : list) {
            String strC = a32.c();
            Intrinsics.checkNotNullExpressionValue(strC, "biddingResponse.instanceName");
            Map<String, Object> mapA = a(strC);
            if (a32.a() != null) {
                this.f41536d.a(a32);
                this.f41533a.e().g().a(mapA, a32.e());
            } else {
                this.f41533a.e().g().a(mapA, a32.e(), a32.b());
            }
        }
        Iterator<String> it = list2.iterator();
        while (it.hasNext()) {
            this.f41533a.e().g().b(a(it.next()), j10);
        }
        dVar.a(this);
    }

    private final Map<String, Object> a(String str) {
        AdapterBaseInterface adapterBaseInterfaceA;
        NetworkSettings networkSettingsA = this.f41534b.a(str);
        if (this.f41538f) {
            BaseAdAdapter<?, ?> baseAdAdapterB = b(str);
            adapterBaseInterfaceA = baseAdAdapterB != null ? baseAdAdapterB.getNetworkAdapter() : null;
        } else {
            adapterBaseInterfaceA = a(networkSettingsA);
        }
        return a(networkSettingsA, adapterBaseInterfaceA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, Object> a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        String providerDefaultInstance;
        HashMap map = new HashMap();
        if (networkSettings != null) {
            try {
                providerDefaultInstance = networkSettings.getProviderDefaultInstance();
            } catch (Exception e10) {
                C4462o4.d().a(e10);
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "getProviderEventData " + (networkSettings != null ? networkSettings.getProviderDefaultInstance() : null), e10);
                return map;
            }
        } else {
            providerDefaultInstance = null;
        }
        map.put(IronSourceConstants.EVENTS_PROVIDER, providerDefaultInstance);
        map.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, adapterBaseInterface != null ? adapterBaseInterface.getAdapterVersion() : null);
        map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, adapterBaseInterface != null ? adapterBaseInterface.getNetworkSDKVersion() : null);
        map.put("spId", networkSettings != null ? networkSettings.getSubProviderId() : null);
        map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        map.put("instanceType", networkSettings != null ? Integer.valueOf(networkSettings.getInstanceType(this.f41534b.b().a())) : null);
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdapterBaseInterface a(NetworkSettings networkSettings) {
        return com.ironsource.mediationsdk.c.b().b(networkSettings, this.f41534b.b().a(), this.f41534b.b().b());
    }
}
