package w8;

import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.adcom.Ad;
import io.bidmachine.AdContentType;
import io.bidmachine.AdsType;
import io.bidmachine.BidMachineTrackingObject;
import io.bidmachine.ContextProvider;
import io.bidmachine.HeaderBiddingAdRequestParams;
import io.bidmachine.HeaderBiddingAdapter;
import io.bidmachine.HeaderBiddingCollectParamsCallback;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.NetworkAdapter;
import io.bidmachine.NetworkConfig;
import io.bidmachine.NetworkRegistry;
import io.bidmachine.ProtoExtConstants;
import io.bidmachine.TrackEventType;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingAd;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import w8.g;

/* JADX INFO: loaded from: classes12.dex */
class g {

    /* JADX INFO: Access modifiers changed from: private */
    static final class a implements Runnable, HeaderBiddingAdRequestParams, HeaderBiddingCollectParamsCallback {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final Executor f107529l = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors() * 2);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ContextProvider f107530b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final HeaderBiddingAdapter f107531c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final AdsType f107532d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final AdContentType f107533e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final od.d f107534f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final NetworkAdUnit f107535g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private CountDownLatch f107537i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private HeaderBiddingPlacement.AdUnit f107538j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f107539k = false;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final nd.l f107536h = new BidMachineTrackingObject();

        a(ContextProvider contextProvider, HeaderBiddingAdapter headerBiddingAdapter, AdsType adsType, AdContentType adContentType, od.d dVar, NetworkAdUnit networkAdUnit) {
            this.f107530b = contextProvider;
            this.f107531c = headerBiddingAdapter;
            this.f107532d = adsType;
            this.f107533e = adContentType;
            this.f107534f = dVar;
            this.f107535g = networkAdUnit;
        }

        private void g() {
            this.f107539k = true;
            this.f107537i.countDown();
        }

        void e() {
            if (this.f107539k) {
                return;
            }
            io.bidmachine.core.a.b(this.f107531c.getKey(), new ce.b() { // from class: w8.d
                @Override // ce.b
                public final Object get() {
                    g.a aVar = this.f107525a;
                    return String.format("%s (%s) - Header bidding collect fail: timeout", aVar.f107532d, aVar.f107533e);
                }
            });
            g();
        }

        void f(CountDownLatch countDownLatch) {
            this.f107536h.eventStart(TrackEventType.HeaderBiddingNetworkPrepare, new nd.j().e("HB_NETWORK", this.f107531c.getKey()).e("BM_AD_TYPE", this.f107532d.getName()));
            this.f107537i = countDownLatch;
            f107529l.execute(this);
        }

        @Override // io.bidmachine.HeaderBiddingAdRequestParams
        public AdContentType getAdContentType() {
            return this.f107533e;
        }

        @Override // io.bidmachine.HeaderBiddingAdRequestParams
        public AdsType getAdsType() {
            return this.f107532d;
        }

        HeaderBiddingPlacement.AdUnit h() {
            return this.f107538j;
        }

        boolean i() {
            return this.f107539k;
        }

        @Override // io.bidmachine.HeaderBiddingCollectParamsCallback
        public void onCollectFail(final ae.a aVar) {
            if (this.f107539k) {
                return;
            }
            io.bidmachine.core.a.b(this.f107531c.getKey(), new ce.b() { // from class: w8.f
                @Override // ce.b
                public final Object get() {
                    g.a aVar2 = this.f107527a;
                    return String.format("%s (%s) - Header bidding collect fail - %s", aVar2.f107532d, aVar2.f107533e, aVar);
                }
            });
            g();
            this.f107536h.eventFinish(TrackEventType.HeaderBiddingNetworkPrepare, this.f107532d, new nd.a().h(this.f107531c.getKey()), aVar);
        }

        @Override // io.bidmachine.HeaderBiddingCollectParamsCallback
        public void onCollectFinished(Map map) {
            if (this.f107539k) {
                return;
            }
            this.f107538j = HeaderBiddingPlacement.AdUnit.newBuilder().setBidder(this.f107531c.getKey()).setBidderSdkver(this.f107531c.obtainNetworkSdkVersion()).putClientParams(ProtoExtConstants.AD_UNIT_ID, this.f107535g.getId()).putAllClientParams(this.f107535g.getMediationConfig()).putAllClientParams(map).build();
            io.bidmachine.core.a.b(this.f107531c.getKey(), new ce.b() { // from class: w8.e
                @Override // ce.b
                public final Object get() {
                    g.a aVar = this.f107526a;
                    return String.format("%s (%s) - Header bidding collect finished", aVar.f107532d, aVar.f107533e);
                }
            });
            g();
            this.f107536h.eventFinish(TrackEventType.HeaderBiddingNetworkPrepare, this.f107532d, new nd.a().h(this.f107531c.getKey()), null);
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    this.f107531c.collectHeaderBiddingParams(this.f107530b, this.f107534f, this.f107535g, this, this);
                } catch (Throwable th2) {
                    th = th2;
                    io.bidmachine.core.a.p(th);
                    onCollectFail(ae.a.l("Exception collecting header bidding parameters", th));
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    g() {
    }

    private HeaderBiddingAd d(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Any any = (Any) it.next();
            if (any.is(HeaderBiddingAd.class)) {
                try {
                    return (HeaderBiddingAd) any.unpack(HeaderBiddingAd.class);
                } catch (InvalidProtocolBufferException e10) {
                    io.bidmachine.core.a.p(e10);
                }
            }
        }
        return null;
    }

    zb.b a(Ad ad2) {
        HeaderBiddingAd headerBiddingAdC = c(ad2);
        if (headerBiddingAdC != null) {
            return new c(ad2, headerBiddingAdC);
        }
        return null;
    }

    HeaderBiddingPlacement.Builder b(ContextProvider contextProvider, od.d dVar, AdsType adsType, AdContentType adContentType, Collection collection, List list, int i10) {
        ArrayList<a> arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            NetworkConfig networkConfig = (NetworkConfig) it.next();
            NetworkAdapter adapter = NetworkRegistry.getAdapter(networkConfig.getNetworkKey());
            if ((adapter instanceof HeaderBiddingAdapter) && adapter.isInitialized(contextProvider)) {
                AdContentType adContentType2 = adContentType;
                for (NetworkAdUnit networkAdUnit : networkConfig.createNetworkAdUnitList(adsType, dVar, adContentType2, adapter)) {
                    list.add(networkAdUnit);
                    arrayList.add(new a(contextProvider, (HeaderBiddingAdapter) adapter, adsType, adContentType2, dVar, networkAdUnit));
                    adContentType2 = adContentType;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            BidMachineTrackingObject bidMachineTrackingObject = new BidMachineTrackingObject();
            bidMachineTrackingObject.eventStart(TrackEventType.HeaderBiddingNetworksPrepare);
            try {
                CountDownLatch countDownLatch = new CountDownLatch(arrayList.size());
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((a) it2.next()).f(countDownLatch);
                }
                try {
                    countDownLatch.await(i10 > 0 ? i10 : 10L, TimeUnit.SECONDS);
                } catch (InterruptedException e10) {
                    io.bidmachine.core.a.p(e10);
                }
                ArrayList arrayList2 = null;
                for (a aVar : arrayList) {
                    HeaderBiddingPlacement.AdUnit adUnitH = aVar.h();
                    if (adUnitH != null) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(adUnitH);
                    } else if (!aVar.i()) {
                        aVar.e();
                    }
                }
                if (!io.bidmachine.core.h.G(arrayList2)) {
                    HeaderBiddingPlacement.Builder builderNewBuilder = HeaderBiddingPlacement.newBuilder();
                    builderNewBuilder.addAllAdUnits(arrayList2);
                    return builderNewBuilder;
                }
            } finally {
                bidMachineTrackingObject.eventFinish(TrackEventType.HeaderBiddingNetworksPrepare, adsType, (nd.a) null, (ae.a) null);
            }
        }
        return null;
    }

    HeaderBiddingAd c(Ad ad2) {
        if (ad2.hasDisplay()) {
            Ad.Display display = ad2.getDisplay();
            headerBiddingAdD = display.hasBanner() ? d(display.getBanner().getExtProtoList()) : null;
            if (headerBiddingAdD == null && display.hasNative()) {
                headerBiddingAdD = d(display.getNative().getExtProtoList());
            }
        }
        return (headerBiddingAdD == null && ad2.hasVideo()) ? d(ad2.getVideo().getExtProtoList()) : headerBiddingAdD;
    }
}
