package com.pubmatic.sdk.openwrap.banner;

import android.content.Context;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import com.pubmatic.sdk.common.OpenWrapSDK;
import com.pubmatic.sdk.common.OpenWrapSDKConfig;
import com.pubmatic.sdk.common.OpenWrapSDKInitializer;
import com.pubmatic.sdk.common.POBAdFormat;
import com.pubmatic.sdk.common.POBAdSize;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.POBInstanceProvider;
import com.pubmatic.sdk.common.base.POBAdDescriptor;
import com.pubmatic.sdk.common.base.POBAdRendererListener;
import com.pubmatic.sdk.common.base.POBBaseBidder;
import com.pubmatic.sdk.common.base.POBBidderListener;
import com.pubmatic.sdk.common.base.POBBidding;
import com.pubmatic.sdk.common.base.POBBidsProvider;
import com.pubmatic.sdk.common.cache.POBCacheManager;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.models.POBAdResponse;
import com.pubmatic.sdk.common.models.POBProfileInfo;
import com.pubmatic.sdk.common.taskhandler.POBTaskHandler;
import com.pubmatic.sdk.common.ui.POBBannerRendering;
import com.pubmatic.sdk.common.utility.POBLooper;
import com.pubmatic.sdk.common.utility.POBTimeoutHandler;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.openwrap.core.POBAdsHelper;
import com.pubmatic.sdk.openwrap.core.POBBanner;
import com.pubmatic.sdk.openwrap.core.POBBaseAdInteractionListener;
import com.pubmatic.sdk.openwrap.core.POBBid;
import com.pubmatic.sdk.openwrap.core.POBBidEvent;
import com.pubmatic.sdk.openwrap.core.POBBidEventListener;
import com.pubmatic.sdk.openwrap.core.POBBiddingManager;
import com.pubmatic.sdk.openwrap.core.POBExtBidHandler;
import com.pubmatic.sdk.openwrap.core.POBImpression;
import com.pubmatic.sdk.openwrap.core.POBOWPartnerHelper;
import com.pubmatic.sdk.openwrap.core.POBRenderer;
import com.pubmatic.sdk.openwrap.core.POBRequest;
import com.pubmatic.sdk.openwrap.core.POBVideo;
import com.pubmatic.sdk.openwrap.core.signal.POBBiddingHost;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes11.dex */
@MainThread
public class POBBannerView extends FrameLayout implements POBBidEvent {
    private static final POBAdSize D = POBAdSize.BANNER_SIZE_300x250;
    private static boolean E;
    private static final FrameLayout.LayoutParams F;
    private POBCacheManager A;
    private POBBiddingHost B;
    private Map C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f62696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f62697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f62698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f62699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f62700e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private POBBaseBidder f62701f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private POBRequest f62702g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private POBTimeoutHandler f62703h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private POBBannerEvent f62704i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private POBBaseAdInteractionListener f62705j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private POBBannerViewListener f62706k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private View f62707l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f62708m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private POBAdState f62709n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private POBLooper f62710o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private POBBannerEventListener f62711p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private POBAdRendererListener f62712q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private POBLooper.LooperListener f62713r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private POBBannerRendering f62714s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f62715t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private POBBannerRendering f62716u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private POBBidEventListener f62717v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private POBAdResponse f62718w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private POBAdFormat f62719x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private View f62720y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f62721z;

    protected enum POBAdState {
        DEFAULT,
        LOAD_DEFERRED,
        LOADING,
        WAITING,
        WAITING_FOR_REFRESH,
        CREATIVE_LOADING,
        RENDERED,
        WAITING_FOR_AS_RESPONSE
    }

    @MainThread
    public static class POBBannerViewListener {
        public void onAdClicked(@NonNull POBBannerView pOBBannerView) {
        }

        public void onAdClosed(@NonNull POBBannerView pOBBannerView) {
        }

        public void onAdFailed(@NonNull POBBannerView pOBBannerView, @NonNull POBError pOBError) {
        }

        public void onAdImpression(@NonNull POBBannerView pOBBannerView) {
        }

        public void onAdOpened(@NonNull POBBannerView pOBBannerView) {
        }

        public void onAdReceived(@NonNull POBBannerView pOBBannerView) {
        }

        public void onAppLeaving(@NonNull POBBannerView pOBBannerView) {
        }
    }

    class a implements OpenWrapSDKInitializer.Listener {
        a() {
        }

        @Override // com.pubmatic.sdk.common.OpenWrapSDKInitializer.Listener
        public void onFailure(POBError pOBError) {
            POBBannerView.this.f62700e = true;
            POBLog.error("POBBannerView", "OpenWrap SDK initialization failed with error : " + pOBError, new Object[0]);
            if (POBBannerView.this.f62709n == POBAdState.LOAD_DEFERRED) {
                POBBannerView.this.a(pOBError);
            }
        }

        @Override // com.pubmatic.sdk.common.OpenWrapSDKInitializer.Listener
        public void onSuccess() {
            POBBannerView.this.f62700e = true;
            POBLog.verbose("POBBannerView", "OpenWrap SDK initialization successful", new Object[0]);
            if (POBBannerView.this.f62709n == POBAdState.LOAD_DEFERRED) {
                POBBannerView.this.s();
                POBBannerView.this.j();
            }
        }
    }

    class b implements POBTimeoutHandler.POBTimeoutHandlerListener {
        b() {
        }

        @Override // com.pubmatic.sdk.common.utility.POBTimeoutHandler.POBTimeoutHandlerListener
        public void onTimeout() {
            if (POBBannerView.this.f62709n == POBAdState.LOAD_DEFERRED) {
                POBBannerView.this.j();
            }
        }
    }

    private class c implements POBAdRendererListener {
        private c() {
        }

        private POBAdResponse a(POBAdResponse pOBAdResponse, POBAdDescriptor pOBAdDescriptor) {
            if (!(pOBAdDescriptor instanceof POBBid)) {
                return pOBAdResponse;
            }
            POBBid pOBBid = (POBBid) pOBAdDescriptor;
            if (!pOBBid.isStaticBid()) {
                return pOBAdResponse;
            }
            POBAdResponse.Builder builder = new POBAdResponse.Builder(pOBAdResponse);
            builder.updateWinningBid(pOBBid);
            return builder.build();
        }

        @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
        public void onAdExpired() {
        }

        @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
        public void onAdImpression() {
            POBAdsHelper.recordImpressionDepth(POBBannerView.this.getAppContext(), POBBannerView.this.f62719x);
            POBBannerView.this.n();
        }

        @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
        public void onAdInteractionStarted() {
            POBBannerView.this.d();
            POBBannerView.e(POBBannerView.this);
        }

        @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
        public void onAdInteractionStopped() {
            POBBannerView.this.c();
        }

        @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
        public void onAdReadyToRefresh(int i10) {
            if (POBBannerView.this.f62696a) {
                return;
            }
            POBBannerView.this.a(i10);
        }

        @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
        public void onAdRender(View view, POBAdDescriptor pOBAdDescriptor) {
            POBLog.debug("POBBannerView", "onAdRender()", new Object[0]);
            if (POBBannerView.this.f62718w != null && pOBAdDescriptor != null) {
                POBBannerView pOBBannerView = POBBannerView.this;
                pOBBannerView.f62718w = a(pOBBannerView.f62718w, pOBAdDescriptor);
            }
            POBBannerView.this.f62715t = true;
            if (!POBBannerView.this.f62696a) {
                POBBannerView.this.e(view);
                return;
            }
            Trace.endSection();
            POBBannerView.this.f62697b = view;
            POBLog.debug("POBBannerView", "Defer UI attachment for %s ad", "OW");
        }

        @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
        public void onAdRenderingFailed(POBError pOBError) {
            POBBid winningBid = POBBiddingManager.getWinningBid(POBBannerView.this.f62718w);
            if (winningBid != null && POBBannerView.this.f62718w != null) {
                POBLog.info("POBBannerView", "On rendering failed for Partner %s, with Error : %s", winningBid.getPartnerName(), pOBError.toString());
            }
            POBBannerView.this.a(pOBError);
        }

        @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
        public void onAdUnload() {
        }

        @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
        public void onLeavingApplication() {
            POBBannerView.this.p();
            POBBannerView.e(POBBannerView.this);
        }

        @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
        public void onRenderAdClick() {
            if (POBBannerView.this.f62706k != null) {
                POBBannerView.this.f62706k.onAdClicked(POBBannerView.this);
            }
        }

        @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
        public void onRenderProcessGone() {
            POBBannerView.this.r();
            POBBannerView.this.f62707l = null;
            POBBannerView pOBBannerView = POBBannerView.this;
            pOBBannerView.a(pOBBannerView.f62698c);
        }

        /* synthetic */ c(POBBannerView pOBBannerView, a aVar) {
            this();
        }
    }

    private class d implements POBBannerEventListener {
        private d() {
        }

        private void a() {
            POBBannerView.this.f62708m = true;
            POBLog.debug("POBBannerView", "PartnerBidWin", new Object[0]);
            POBBid winningBid = POBBiddingManager.getWinningBid(POBBannerView.this.f62718w);
            if (winningBid != null) {
                winningBid.setHasWon(true);
                POBUtils.logBidWinningStatus(winningBid.hasWon(), winningBid.getPartnerName());
                String partnerName = winningBid.getPartnerName();
                if (POBBannerView.this.f62704i != null && partnerName != null) {
                    POBBannerView pOBBannerView = POBBannerView.this;
                    pOBBannerView.f62716u = pOBBannerView.f62704i.getRenderer(partnerName);
                }
                if (winningBid.getRawBid() != null) {
                    POBInstanceProvider.getCacheManager(POBBannerView.this.getAppContext()).saveRenderedBid(winningBid.getRawBid());
                }
                POBBannerView.this.b(winningBid);
            }
        }

        @Override // com.pubmatic.sdk.openwrap.banner.POBBannerEventListener, com.pubmatic.sdk.openwrap.core.POBAdEventListener
        public POBBidsProvider getBidsProvider() {
            return POBBannerView.this.f62718w;
        }

        @Override // com.pubmatic.sdk.openwrap.banner.POBBannerEventListener, com.pubmatic.sdk.openwrap.core.POBAdEventListener
        public void onAdClick() {
            POBBannerView.this.m();
        }

        @Override // com.pubmatic.sdk.openwrap.banner.POBBannerEventListener, com.pubmatic.sdk.openwrap.core.POBAdEventListener
        public void onAdClosed() {
            POBBannerView.this.k();
        }

        @Override // com.pubmatic.sdk.openwrap.banner.POBBannerEventListener
        public void onAdExecutionComplete() {
            POBBannerView.this.setState(POBAdState.DEFAULT);
        }

        @Override // com.pubmatic.sdk.openwrap.banner.POBBannerEventListener, com.pubmatic.sdk.openwrap.core.POBAdEventListener
        public void onAdImpression() {
            POBBannerView.this.setAdServerViewVisibility(false);
            if (POBBannerView.this.f62708m) {
                return;
            }
            POBBannerView.this.n();
        }

        @Override // com.pubmatic.sdk.openwrap.banner.POBBannerEventListener, com.pubmatic.sdk.openwrap.core.POBAdEventListener
        public void onAdLeftApplication() {
            POBBannerView.this.p();
        }

        @Override // com.pubmatic.sdk.openwrap.banner.POBBannerEventListener, com.pubmatic.sdk.openwrap.core.POBAdEventListener
        public void onAdOpened() {
            POBBannerView.this.o();
        }

        @Override // com.pubmatic.sdk.openwrap.banner.POBBannerEventListener
        public void onAdServerWin(View view) {
            POBBannerView.this.f62708m = false;
            POBBannerView.this.f62715t = true;
            Trace.endSection();
            if (!POBBannerView.this.f62696a) {
                POBBannerView.this.d(view);
                return;
            }
            Trace.endSection();
            POBBannerView.this.f62697b = view;
            POBLog.debug("POBBannerView", "Defer UI attachment for %s ad", "Ad Server");
        }

        @Override // com.pubmatic.sdk.openwrap.banner.POBBannerEventListener
        public void onFailed(POBError pOBError) {
            POBBannerView.this.a(pOBError);
        }

        @Override // com.pubmatic.sdk.openwrap.banner.POBBannerEventListener
        public void onOpenWrapPartnerWin(String str) {
            if (POBBannerView.this.f62718w != null) {
                POBBid pOBBid = (POBBid) POBBannerView.this.f62718w.getBid(str);
                if (pOBBid != null) {
                    POBAdResponse.Builder builderUpdateWinningBid = new POBAdResponse.Builder(POBBannerView.this.f62718w).updateWinningBid(pOBBid);
                    POBBannerView.this.f62718w = builderUpdateWinningBid.build();
                } else {
                    POBLog.debug("POBBannerView", "bidId is invalid in onOpenWrapPartnerWin(), rendering the client-side winning bid", new Object[0]);
                }
            }
            a();
        }

        /* synthetic */ d(POBBannerView pOBBannerView, a aVar) {
            this();
        }
    }

    private class e implements POBLooper.LooperListener {

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                POBBannerView.this.e();
            }
        }

        private e() {
        }

        @Override // com.pubmatic.sdk.common.utility.POBLooper.LooperListener
        public void invoke() {
            if (!POBBannerView.this.f62715t || POBBannerView.this.b()) {
                POBTaskHandler.getInstance().runOnMainThread(new a());
                return;
            }
            POBLog.debug("POBBannerView", "Banner is not visibile.", new Object[0]);
            POBBannerView pOBBannerView = POBBannerView.this;
            pOBBannerView.a(pOBBannerView.f62698c);
        }

        /* synthetic */ e(POBBannerView pOBBannerView, a aVar) {
            this();
        }
    }

    private class f implements POBBidderListener {
        private f() {
        }

        @Override // com.pubmatic.sdk.common.base.POBBidderListener
        public void onBidsFailed(POBBidding pOBBidding, POBError pOBError) {
            POBLog.debug("POBBannerView", "onBidsFailed : errorMessage= " + pOBError, new Object[0]);
            POBBannerView.q(POBBannerView.this);
            if (POBBannerView.this.f62704i instanceof POBDefaultBannerEventHandler) {
                POBBannerView.this.a(pOBError);
            } else {
                POBBannerView.this.a((POBBid) null);
            }
        }

        @Override // com.pubmatic.sdk.common.base.POBBidderListener
        public void onBidsFetched(POBBidding pOBBidding, POBAdResponse pOBAdResponse) {
            POBBannerView.this.f62718w = POBAdsHelper.updateResponseUsingPlacementType(pOBAdResponse, "inline");
            POBBid pOBBid = (POBBid) POBBannerView.this.f62718w.getWinningBid();
            if (pOBBid != null) {
                if (POBBannerView.this.f62721z) {
                    POBBannerView.this.f62719x = new POBAdSize(pOBBid.getWidth(), pOBBid.getHeight()).isMREC() ? POBAdFormat.MREC : POBAdFormat.BANNER;
                }
                POBLog.debug("POBBannerView", "onBidsFetched : ImpressionId=%s, BidPrice=%s", pOBBid.getImpressionId(), String.valueOf(pOBBid.getPrice()));
                if (pOBBid.getRawBid() != null) {
                    POBInstanceProvider.getCacheManager(POBBannerView.this.getAppContext()).saveReceivedBid(pOBBid.getRawBid());
                }
            }
            POBBannerView.this.setRefreshInterval(pOBBid);
            POBBannerView.q(POBBannerView.this);
            POBBannerView.this.a(pOBBid);
        }

        /* synthetic */ f(POBBannerView pOBBannerView, a aVar) {
            this();
        }
    }

    static {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        F = layoutParams;
        layoutParams.gravity = 17;
    }

    public POBBannerView(@NonNull Context context) {
        this(context, null);
        a(new POBDefaultBannerEventHandler());
    }

    static /* synthetic */ POBBaseAdInteractionListener e(POBBannerView pOBBannerView) {
        pOBBannerView.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Context getAppContext() {
        return getContext().getApplicationContext();
    }

    @NonNull
    private String getImpressionId() {
        return UUID.randomUUID().toString();
    }

    static /* synthetic */ POBBidEventListener q(POBBannerView pOBBannerView) {
        pOBBannerView.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdServerViewVisibility(boolean z10) {
        POBLog.info("POBBannerView", "is adserverview available %s", this.f62720y);
        View view = this.f62720y;
        if (view != null) {
            view.setVisibility(z10 ? 0 : 8);
        }
    }

    private void setRefreshInterval(int i10) {
        this.f62698c = POBUtils.getValidRefreshInterval(i10, 5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setState(@NonNull POBAdState pOBAdState) {
        this.f62709n = pOBAdState;
    }

    public void addExtraInfo(@NonNull String str, @NonNull Object obj) {
        if (str == "admob_watermark" && (obj instanceof String)) {
            this.C.put(str, obj);
        } else {
            POBLog.warn("POBBannerView", "Received invalid key %s for extra info", str);
        }
    }

    public void destroy() {
        POBLog.debug("POBBannerView", "destroy invoked.", new Object[0]);
        s();
        f();
        this.f62710o = null;
        this.f62697b = null;
        g();
        POBBannerEvent pOBBannerEvent = this.f62704i;
        if (pOBBannerEvent != null) {
            pOBBannerEvent.destroy();
        }
        this.f62706k = null;
        this.f62712q = null;
        this.f62713r = null;
        this.f62711p = null;
        this.f62720y = null;
    }

    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
    public boolean forceRefresh() {
        if (!a()) {
            return false;
        }
        f();
        loadAd();
        return true;
    }

    @Nullable
    public POBRequest getAdRequest() {
        POBRequest pOBRequest = this.f62702g;
        if (pOBRequest != null) {
            return pOBRequest;
        }
        POBLog.warn("POBBannerView", "Please call POBBannerView.init() before calling getAdRequest()", new Object[0]);
        return null;
    }

    @Override // com.pubmatic.sdk.openwrap.core.POBBidEvent
    @Nullable
    public POBBid getBid() {
        return POBBiddingManager.getWinningBid(this.f62718w);
    }

    @Nullable
    public POBAdSize getCreativeSize() {
        if (!this.f62708m) {
            POBBannerEvent pOBBannerEvent = this.f62704i;
            if (pOBBannerEvent != null) {
                return pOBBannerEvent.getAdSize();
            }
            return null;
        }
        POBBid winningBid = POBBiddingManager.getWinningBid(this.f62718w);
        if (winningBid != null) {
            return (winningBid.isVideo() && winningBid.getWidth() == 0 && winningBid.getHeight() == 0) ? D : new POBAdSize(winningBid.getWidth(), winningBid.getHeight());
        }
        POBLog.warn("POBBannerView", "getCreativeSize() called for null bid", new Object[0]);
        return null;
    }

    @Nullable
    public POBImpression getImpression() {
        return POBAdsHelper.getImpression(this.f62702g);
    }

    public void init(@NonNull String str, int i10, @NonNull String str2, @NonNull POBBannerEvent pOBBannerEvent) {
        a aVar = null;
        POBAdSize[] pOBAdSizeArrRequestedAdSizes = pOBBannerEvent == null ? null : pOBBannerEvent.requestedAdSizes();
        POBError pOBErrorA = a(str, str2, pOBBannerEvent, pOBAdSizeArrRequestedAdSizes);
        if (pOBErrorA != null) {
            POBLog.error("POBBannerView", pOBErrorA.toString(), new Object[0]);
            return;
        }
        destroy();
        if (!this.f62700e) {
            OpenWrapSDK.initialize(getContext(), new OpenWrapSDKConfig.Builder(str, new ArrayList(Collections.singletonList(Integer.valueOf(i10)))).build(), new a());
        }
        this.f62713r = new e(this, aVar);
        a(pOBBannerEvent);
        POBLooper pOBLooper = new POBLooper();
        this.f62710o = pOBLooper;
        pOBLooper.setListener(this.f62713r);
        this.f62710o.setNetworkMonitor(POBInstanceProvider.getNetworkMonitor(getAppContext()));
        POBImpression pOBImpression = new POBImpression(getImpressionId(), str2);
        if (pOBAdSizeArrRequestedAdSizes != null) {
            pOBImpression.setBanner(new POBBanner(pOBAdSizeArrRequestedAdSizes));
            if (b(pOBAdSizeArrRequestedAdSizes)) {
                pOBImpression.setVideo(new POBVideo(POBVideo.Placement.IN_BANNER, POBVideo.Plcmt.STANDALONE, POBVideo.Linearity.LINEAR, D));
                pOBImpression.setCtaOverlayEnabled(true);
            }
            pOBImpression.setMRAIDAppStatusEnabled(POBImpression.canEnableMRAIDAppStatus(getAppContext()));
            this.f62719x = a(pOBAdSizeArrRequestedAdSizes);
        }
        this.A = POBInstanceProvider.getCacheManager(getAppContext());
        POBRequest pOBRequestCreateInstance = POBRequest.createInstance(str, i10, this.f62719x, pOBImpression);
        this.f62702g = pOBRequestCreateInstance;
        if (pOBRequestCreateInstance != null) {
            setRefreshInterval(30);
        }
    }

    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
    public void loadAd() {
        POBImpression impression = getImpression();
        POBBannerEvent pOBBannerEvent = this.f62704i;
        POBAdSize[] pOBAdSizeArrRequestedAdSizes = pOBBannerEvent != null ? pOBBannerEvent.requestedAdSizes() : null;
        if (this.f62702g == null || impression == null || pOBAdSizeArrRequestedAdSizes == null) {
            POBLog.error("POBBannerView", "Unable to process loadAd() please ensure banner is initialized with valid ad tag details and ad sizes.", new Object[0]);
            return;
        }
        POBAdState pOBAdState = this.f62709n;
        if (pOBAdState != POBAdState.DEFAULT) {
            POBLog.error("POBBannerView", "Skipping loadAd() as ad is already in %s state", pOBAdState.name());
            return;
        }
        Trace.beginSection("POB Banner Load Ad");
        Trace.beginSection("POB Request Building");
        if (this.f62700e) {
            j();
        } else {
            this.f62709n = POBAdState.LOAD_DEFERRED;
            t();
        }
    }

    public void pauseAutoRefresh() {
        POBLooper pOBLooper = this.f62710o;
        if (pOBLooper == null) {
            POBLog.info("POBBannerView", "Can't pause refresh, banner instance is not valid.", new Object[0]);
        } else if (this.f62698c > 0) {
            pOBLooper.forcePause();
        } else {
            POBLog.info("POBBannerView", "Skipping pause auto-refresh as refresh is disabled.", new Object[0]);
        }
    }

    @Override // com.pubmatic.sdk.openwrap.core.POBBidEvent
    public void proceedOnError(@NonNull POBBidEvent.BidEventError bidEventError, @NonNull String str) {
        POBLog.warn("POBBannerView", "'POBBidEventListener' not implemented", new Object[0]);
    }

    @Override // com.pubmatic.sdk.openwrap.core.POBBidEvent
    public boolean proceedToLoadAd() {
        POBLog.warn("POBBannerView", "'POBBidEventListener' not implemented", new Object[0]);
        return false;
    }

    public void resumeAutoRefresh() {
        POBLooper pOBLooper = this.f62710o;
        if (pOBLooper == null) {
            POBLog.info("POBBannerView", "Can't resume refresh, banner instance is not valid.", new Object[0]);
        } else if (this.f62698c > 0) {
            pOBLooper.forceResume();
        } else {
            POBLog.info("POBBannerView", "Skipping resume auto-refresh as refresh is disabled.", new Object[0]);
        }
    }

    @Override // com.pubmatic.sdk.openwrap.core.POBBidEvent
    public void setBidEventListener(@Nullable POBBidEventListener pOBBidEventListener) {
    }

    public void setListener(@Nullable POBBannerViewListener pOBBannerViewListener) {
        this.f62706k = pOBBannerViewListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        this.f62718w = null;
        this.f62708m = false;
        setAdServerViewVisibility(false);
        if (this.f62702g != null) {
            setState(POBAdState.LOADING);
            a(this.f62702g).requestBid();
        } else {
            b(new POBError(1001, "Missing ad request parameters. Please check."));
            POBLog.error("POBBannerView", "Missing ad request parameters. Please check.", new Object[0]);
        }
    }

    private void f() {
        setState(POBAdState.DEFAULT);
        POBLooper pOBLooper = this.f62710o;
        if (pOBLooper != null) {
            pOBLooper.destroy();
        }
        POBBaseBidder pOBBaseBidder = this.f62701f;
        if (pOBBaseBidder != null) {
            pOBBaseBidder.setBidderListener(null);
            this.f62701f.destroy();
            this.f62701f = null;
        }
    }

    private void g() {
        POBBannerRendering pOBBannerRendering = this.f62714s;
        if (pOBBannerRendering != null) {
            pOBBannerRendering.setAdRendererListener(null);
            this.f62714s.destroy();
            this.f62714s = null;
        }
        POBBannerRendering pOBBannerRendering2 = this.f62716u;
        if (pOBBannerRendering2 != null) {
            pOBBannerRendering2.setAdRendererListener(null);
            this.f62716u.destroy();
            this.f62716u = null;
        }
    }

    private void h() {
        setState(POBAdState.LOADING);
        POBAdResponse pOBAdResponse = this.f62718w;
        if (pOBAdResponse != null) {
            this.f62718w = new POBAdResponse.Builder(pOBAdResponse).setWinningBid(null).build();
        }
        if (this.f62704i != null) {
            POBLog.info("POBBannerView", "Proceeding with bid. Ad server integration is " + this.f62704i.getClass().getSimpleName(), new Object[0]);
        }
        a((POBBid) null);
    }

    private boolean i() {
        return this.f62698c > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        this.f62709n = POBAdState.LOADING;
        this.f62715t = false;
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        POBBannerViewListener pOBBannerViewListener = this.f62706k;
        if (pOBBannerViewListener != null) {
            pOBBannerViewListener.onAdClosed(this);
        }
    }

    private void l() {
        Trace.endSection();
        POBBannerViewListener pOBBannerViewListener = this.f62706k;
        if (pOBBannerViewListener != null) {
            pOBBannerViewListener.onAdReceived(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        POBBannerViewListener pOBBannerViewListener = this.f62706k;
        if (pOBBannerViewListener != null) {
            pOBBannerViewListener.onAdClicked(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        POBBannerViewListener pOBBannerViewListener = this.f62706k;
        if (pOBBannerViewListener != null) {
            pOBBannerViewListener.onAdImpression(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        POBBannerViewListener pOBBannerViewListener = this.f62706k;
        if (pOBBannerViewListener != null) {
            pOBBannerViewListener.onAdOpened(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        POBBannerViewListener pOBBannerViewListener = this.f62706k;
        if (pOBBannerViewListener != null) {
            pOBBannerViewListener.onAppLeaving(this);
        }
    }

    private void q() {
        ViewGroup viewGroup;
        View view = this.f62720y;
        if (view == null || (viewGroup = (ViewGroup) view.getParent()) == null) {
            return;
        }
        viewGroup.removeView(this.f62720y);
        this.f62720y = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        View view = this.f62707l;
        if (view != null) {
            removeView(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        POBTimeoutHandler pOBTimeoutHandler = this.f62703h;
        if (pOBTimeoutHandler != null) {
            pOBTimeoutHandler.cancel();
        }
        this.f62703h = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRefreshInterval(@Nullable POBBid pOBBid) {
        if (pOBBid != null) {
            setRefreshInterval(pOBBid.getRefreshInterval());
        } else {
            setRefreshInterval(this.f62698c);
        }
    }

    private void t() {
        POBLog.debug("POBBannerView", "scheduleDelay until init completed.", new Object[0]);
        POBTimeoutHandler pOBTimeoutHandler = new POBTimeoutHandler(new b());
        this.f62703h = pOBTimeoutHandler;
        pOBTimeoutHandler.start(500L);
    }

    private void u() {
        if (i()) {
            setState(POBAdState.WAITING_FOR_REFRESH);
        } else {
            setState(POBAdState.DEFAULT);
        }
    }

    public POBBannerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public POBBannerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f62700e = false;
        this.f62719x = POBAdFormat.BANNER;
        this.f62721z = false;
        this.B = POBBiddingHost.UNKNOWN;
        this.C = DesugarCollections.synchronizedMap(new HashMap());
        this.f62709n = POBAdState.DEFAULT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(View view) {
        POBLog.debug("POBBannerView", "Show ad for %s", "Ad Server");
        POBBid winningBid = POBBiddingManager.getWinningBid(this.f62718w);
        if (winningBid != null) {
            POBUtils.logBidWinningStatus(winningBid.hasWon(), winningBid.getPartnerName());
        } else {
            POBLog.debug("POBBannerView", "AdServerWin", new Object[0]);
        }
        c(view);
        a(view);
        a(this.f62698c);
        l();
    }

    private boolean b(POBAdSize[] pOBAdSizeArr) {
        for (POBAdSize pOBAdSize : pOBAdSizeArr) {
            if (D.equals(pOBAdSize)) {
                return true;
            }
        }
        return false;
    }

    private void c(View view) {
        if (view == null) {
            POBLog.verbose("POBBannerView", "Passed rendered view is null in prepareForUIAttachment(), hence ignoring the attachment in UI", new Object[0]);
            return;
        }
        POBBannerRendering pOBBannerRendering = this.f62714s;
        if (pOBBannerRendering != null) {
            pOBBannerRendering.destroy();
        }
        this.f62714s = this.f62716u;
        this.f62716u = null;
        r();
        q();
        this.f62707l = view;
    }

    private void b(POBError pOBError) {
        Trace.endSection();
        POBLog.error("POBBannerView", "Failed to receive ad with error - " + pOBError, new Object[0]);
        POBBannerViewListener pOBBannerViewListener = this.f62706k;
        if (pOBBannerViewListener != null) {
            pOBBannerViewListener.onAdFailed(this, pOBError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(View view) {
        POBBid winningBid = POBBiddingManager.getWinningBid(this.f62718w);
        if (winningBid != null) {
            POBLog.debug("POBBannerView", "Show ad for OW partner : %s", winningBid.getPartnerName());
        }
        c(view);
        b(view);
        setState(POBAdState.RENDERED);
        l();
    }

    private void a(POBBannerEvent pOBBannerEvent) {
        a aVar = null;
        this.f62712q = new c(this, aVar);
        d dVar = new d(this, aVar);
        this.f62711p = dVar;
        if (pOBBannerEvent != null) {
            this.f62704i = pOBBannerEvent;
            pOBBannerEvent.setEventListener(dVar);
        }
    }

    private void b(View view) {
        int iConvertDpToPixel;
        int iConvertDpToPixel2;
        POBAdSize creativeSize = getCreativeSize();
        POBLog.debug("POBBannerView", "Creative ad size is %s", creativeSize);
        if (creativeSize == null || creativeSize.getAdWidth() <= 0 || creativeSize.getAdHeight() <= 0) {
            iConvertDpToPixel = -1;
            iConvertDpToPixel2 = -1;
        } else {
            iConvertDpToPixel = POBUtils.convertDpToPixel(creativeSize.getAdWidth());
            iConvertDpToPixel2 = POBUtils.convertDpToPixel(creativeSize.getAdHeight());
        }
        POBBannerEvent pOBBannerEvent = this.f62704i;
        if (pOBBannerEvent != null) {
            this.f62720y = pOBBannerEvent.getAdServerView();
        }
        if (this.f62720y != null) {
            setAdServerViewVisibility(true);
            addView(this.f62720y, 0, F);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iConvertDpToPixel, iConvertDpToPixel2);
        layoutParams.gravity = 17;
        addView(view, layoutParams);
    }

    public POBBannerView(@NonNull Context context, @NonNull String str, int i10, @NonNull String str2, @NonNull POBAdSize... pOBAdSizeArr) {
        this(context, str, i10, str2, new POBDefaultBannerEventHandler(pOBAdSizeArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (this.f62699d == 0) {
            E = true;
            POBLooper pOBLooper = this.f62710o;
            if (pOBLooper != null) {
                pOBLooper.pause();
            }
            this.f62696a = true;
            o();
        }
        this.f62699d++;
    }

    public POBBannerView(@NonNull Context context, @NonNull String str, int i10, @NonNull String str2, @NonNull POBBannerEvent pOBBannerEvent) {
        this(context, null, 0);
        init(str, i10, str2, pOBBannerEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        int i10 = this.f62699d - 1;
        this.f62699d = i10;
        if (i10 == 0) {
            E = false;
            POBLooper pOBLooper = this.f62710o;
            if (pOBLooper != null) {
                pOBLooper.resume();
            }
            this.f62696a = false;
            k();
            View view = this.f62697b;
            if (view != null) {
                if (this.f62708m) {
                    e(view);
                    POBAdResponse pOBAdResponse = this.f62718w;
                    POBBid pOBBid = pOBAdResponse != null ? (POBBid) pOBAdResponse.getWinningBid() : null;
                    if (pOBBid != null && !pOBBid.isVideo()) {
                        a(this.f62698c);
                    }
                } else {
                    d(view);
                }
                this.f62697b = null;
            }
        }
    }

    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
    public void loadAd(@NonNull String str, @NonNull POBBiddingHost pOBBiddingHost) {
        if (pOBBiddingHost == null) {
            b(new POBError(1001, "Bidding host cannot be null"));
        } else {
            this.B = pOBBiddingHost;
            loadAd(str);
        }
    }

    private POBError a(String str, String str2, POBBannerEvent pOBBannerEvent, POBAdSize... pOBAdSizeArr) {
        if (!POBAdsHelper.validate(getContext(), str, str2, pOBBannerEvent) || POBUtils.isNull(pOBAdSizeArr)) {
            return new POBError(1001, "Invalid/Missing ad request parameters like Publisher Id, Profile Id, Banner ad sizes. Please check.");
        }
        return null;
    }

    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
    @Deprecated
    public void loadAd(@NonNull String str) {
        this.f62721z = true;
        if (!POBUtils.isNullOrEmpty(str)) {
            POBAdState pOBAdState = this.f62709n;
            if (pOBAdState != POBAdState.DEFAULT) {
                POBLog.error("POBBannerView", "Skipping loadAd() as ad is already in %s state", pOBAdState.name());
                return;
            }
            Trace.beginSection("POB Banner Load Ad");
            Trace.beginSection("POB Response Parsing");
            this.f62718w = null;
            this.f62709n = POBAdState.LOADING;
            a(str).requestBid();
            return;
        }
        b(new POBError(1007, "Invalid Bid Response."));
        POBLog.error("POBBannerView", "Invalid Bid Response.", new Object[0]);
    }

    private boolean a() {
        POBAdState pOBAdState = this.f62709n;
        if (pOBAdState != POBAdState.WAITING_FOR_AS_RESPONSE && pOBAdState != POBAdState.CREATIVE_LOADING && !this.f62696a) {
            return true;
        }
        POBLog.debug("POBBannerView", "ForceRefresh is not allowed as banner is in %s state or it is clicked.", pOBAdState);
        return false;
    }

    private POBBaseBidder a(POBRequest pOBRequest) {
        POBProfileInfo profileInfo;
        if (this.f62701f == null) {
            a aVar = null;
            if (this.A != null) {
                profileInfo = this.A.getProfileInfo(String.valueOf(pOBRequest.getProfileId()));
            } else {
                profileInfo = null;
            }
            POBBiddingManager pOBBiddingManager = new POBBiddingManager(POBOWPartnerHelper.createPOBManager(getAppContext(), pOBRequest, profileInfo));
            this.f62701f = pOBBiddingManager;
            pOBBiddingManager.setBidderListener(new f(this, aVar));
        }
        return this.f62701f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean b() {
        /*
            r6 = this;
            r0 = 1
            android.content.Context r1 = r6.getAppContext()
            boolean r1 = com.pubmatic.sdk.common.network.POBNetworkMonitor.isNetworkAvailable(r1)
            r2 = 0
            if (r1 != 0) goto L10
            java.lang.String r1 = "Network not available"
        Le:
            r3 = r2
            goto L4d
        L10:
            boolean r1 = r6.isAttachedToWindow()
            if (r1 != 0) goto L19
            java.lang.String r1 = "Banner ad is not attached"
            goto Le
        L19:
            boolean r1 = r6.hasWindowFocus()
            if (r1 != 0) goto L22
            java.lang.String r1 = "Banner ad is not in active screen"
            goto Le
        L22:
            boolean r1 = r6.isShown()
            if (r1 != 0) goto L2b
            java.lang.String r1 = "Banner ad is not shown or visible"
            goto Le
        L2b:
            boolean r1 = com.pubmatic.sdk.common.utility.POBUtils.isViewVisible(r6, r0)
            if (r1 != 0) goto L44
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r4[r2] = r3
            java.lang.String r3 = "Banner ad visibility is less than %s pixel"
            java.lang.String r1 = java.lang.String.format(r1, r3, r4)
            goto Le
        L44:
            boolean r1 = com.pubmatic.sdk.openwrap.banner.POBBannerView.E
            if (r1 == 0) goto L4b
            java.lang.String r1 = "Banner view is in background"
            goto Le
        L4b:
            r1 = 0
            r3 = r0
        L4d:
            java.lang.String r4 = "POBBannerView"
            if (r3 != 0) goto L70
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            java.lang.String r1 = ", refreshing banner ad after %s secs."
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            int r5 = r6.f62698c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r2] = r5
            com.pubmatic.sdk.common.log.POBLog.warn(r4, r1, r0)
            return r3
        L70:
            java.util.Locale r1 = java.util.Locale.getDefault()
            int r5 = com.pubmatic.sdk.common.utility.POBUtils.getViewVisiblePixel(r6)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r2] = r5
            java.lang.String r5 = "%s pixel of Banner ad is visible"
            java.lang.String r0 = java.lang.String.format(r1, r5, r0)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            com.pubmatic.sdk.common.log.POBLog.warn(r4, r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pubmatic.sdk.openwrap.banner.POBBannerView.b():boolean");
    }

    public void init(@NonNull String str, int i10, @NonNull String str2, @NonNull POBAdSize... pOBAdSizeArr) {
        init(str, i10, str2, new POBDefaultBannerEventHandler(pOBAdSizeArr));
    }

    private POBBaseBidder a(String str) {
        POBExtBidHandler pOBExtBidHandler = new POBExtBidHandler(str);
        this.f62701f = pOBExtBidHandler;
        pOBExtBidHandler.setBidderListener(new f(this, null));
        return this.f62701f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(POBError pOBError) {
        a(this.f62698c);
        b(pOBError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(POBBid pOBBid) {
        this.f62709n = POBAdState.WAITING_FOR_AS_RESPONSE;
        if (this.f62704i != null) {
            Trace.endSection();
            this.f62704i.requestAd(pOBBid);
            this.f62704i.getAdInteractionListener();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10) {
        u();
        if (this.f62710o == null || !i()) {
            return;
        }
        this.f62710o.loop(i10);
        POBLog.debug("POBBannerView", "loopNextAd with interval %d", Integer.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(POBBid pOBBid) {
        if (this.f62716u == null) {
            this.f62716u = POBRenderer.getBannerRenderer(getAppContext(), pOBBid.getRemainingExpirationTime());
        }
        this.f62716u.setAdRendererListener(this.f62712q);
        if (this.B == POBBiddingHost.ADMOB && (this.C.get("admob_watermark") instanceof String)) {
            this.f62716u.setWatermark(this.C.get("admob_watermark").toString());
        }
        this.f62709n = POBAdState.CREATIVE_LOADING;
        this.f62716u.renderAd(pOBBid);
    }

    private POBAdFormat a(POBAdSize[] pOBAdSizeArr) {
        boolean z10 = false;
        boolean z11 = false;
        for (POBAdSize pOBAdSize : pOBAdSizeArr) {
            if (pOBAdSize.isMREC()) {
                z10 = true;
            } else {
                z11 = true;
            }
            if (z10 && z11) {
                return POBAdFormat.BANNER_AND_MREC;
            }
        }
        return z10 ? POBAdFormat.MREC : POBAdFormat.BANNER;
    }

    private void a(View view) {
        FrameLayout.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 != null) {
            if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                layoutParams = (FrameLayout.LayoutParams) layoutParams2;
                layoutParams.gravity = 17;
            } else {
                a(new POBError(1009, "Ad Server layout params must be of type FrameLayout."));
                return;
            }
        } else {
            layoutParams = F;
        }
        view.setVisibility(0);
        addView(view, layoutParams);
    }
}
