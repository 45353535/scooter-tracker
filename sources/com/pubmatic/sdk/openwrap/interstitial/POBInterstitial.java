package com.pubmatic.sdk.openwrap.interstitial;

import android.content.Context;
import android.os.Trace;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import com.pubmatic.sdk.common.OpenWrapSDK;
import com.pubmatic.sdk.common.OpenWrapSDKConfig;
import com.pubmatic.sdk.common.OpenWrapSDKInitializer;
import com.pubmatic.sdk.common.POBAdFormat;
import com.pubmatic.sdk.common.POBAdSize;
import com.pubmatic.sdk.common.POBDataType$POBAdState;
import com.pubmatic.sdk.common.POBDataType$POBVideoAdEventType;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.POBInstanceProvider;
import com.pubmatic.sdk.common.base.POBAdDescriptor;
import com.pubmatic.sdk.common.base.POBBaseBidder;
import com.pubmatic.sdk.common.base.POBBidderListener;
import com.pubmatic.sdk.common.base.POBBidding;
import com.pubmatic.sdk.common.base.POBBidsProvider;
import com.pubmatic.sdk.common.cache.POBCacheManager;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.models.POBAdResponse;
import com.pubmatic.sdk.common.models.POBProfileInfo;
import com.pubmatic.sdk.common.ui.POBInterstitialRendererListener;
import com.pubmatic.sdk.common.ui.POBInterstitialRendering;
import com.pubmatic.sdk.common.ui.POBVideoAdEventListener;
import com.pubmatic.sdk.common.utility.POBTimeoutHandler;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.openwrap.core.POBAdsHelper;
import com.pubmatic.sdk.openwrap.core.POBBanner;
import com.pubmatic.sdk.openwrap.core.POBBid;
import com.pubmatic.sdk.openwrap.core.POBBidEvent;
import com.pubmatic.sdk.openwrap.core.POBBidEventListener;
import com.pubmatic.sdk.openwrap.core.POBBiddingManager;
import com.pubmatic.sdk.openwrap.core.POBExtBidHandler;
import com.pubmatic.sdk.openwrap.core.POBFullScreenAdInteractionListener;
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

/* JADX INFO: loaded from: classes11.dex */
@MainThread
public class POBInterstitial implements POBBidEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f62918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final POBInterstitialRendererListener f62919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f62920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private POBBaseBidder f62921d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private POBInterstitialEvent f62922e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private POBFullScreenAdInteractionListener f62923f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private POBInterstitialListener f62924g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private POBVideoListener f62925h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private POBInterstitialRendering f62926i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private POBDataType$POBAdState f62927j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f62928k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private POBVideoAdEventListener f62929l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private POBRequest f62930m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private POBTimeoutHandler f62931n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private POBBidEventListener f62932o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f62933p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private POBAdResponse f62934q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private POBCacheManager f62935r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Map f62936s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f62937t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private POBBiddingHost f62938u;

    @MainThread
    public static class POBInterstitialListener {
        public void onAdClicked(@NonNull POBInterstitial pOBInterstitial) {
        }

        public void onAdClosed(@NonNull POBInterstitial pOBInterstitial) {
        }

        public void onAdExpired(@NonNull POBInterstitial pOBInterstitial) {
        }

        public void onAdFailedToLoad(@NonNull POBInterstitial pOBInterstitial, @NonNull POBError pOBError) {
        }

        public void onAdFailedToShow(@NonNull POBInterstitial pOBInterstitial, @NonNull POBError pOBError) {
        }

        public void onAdImpression(@NonNull POBInterstitial pOBInterstitial) {
        }

        public void onAdOpened(@NonNull POBInterstitial pOBInterstitial) {
        }

        public void onAdReceived(@NonNull POBInterstitial pOBInterstitial) {
        }

        public void onAppLeaving(@NonNull POBInterstitial pOBInterstitial) {
        }
    }

    public static class POBVideoListener {
        public void onVideoPlaybackCompleted(@NonNull POBInterstitial pOBInterstitial) {
        }
    }

    class a implements OpenWrapSDKInitializer.Listener {
        a() {
        }

        @Override // com.pubmatic.sdk.common.OpenWrapSDKInitializer.Listener
        public void onFailure(POBError pOBError) {
            POBInterstitial.this.f62933p = true;
            POBLog.error("POBInterstitial", "OpenWrap SDK initialization failed with error : " + pOBError, new Object[0]);
            if (POBInterstitial.this.f62927j == POBDataType$POBAdState.LOAD_DEFERRED) {
                POBInterstitial.this.a(pOBError, true);
            }
        }

        @Override // com.pubmatic.sdk.common.OpenWrapSDKInitializer.Listener
        public void onSuccess() {
            POBInterstitial.this.f62933p = true;
            POBLog.verbose("POBInterstitial", "OpenWrap SDK initialization successful", new Object[0]);
            if (POBInterstitial.this.f62927j == POBDataType$POBAdState.LOAD_DEFERRED) {
                POBInterstitial.this.k();
                POBInterstitial.this.d();
            }
        }
    }

    class b implements POBTimeoutHandler.POBTimeoutHandlerListener {
        b() {
        }

        @Override // com.pubmatic.sdk.common.utility.POBTimeoutHandler.POBTimeoutHandlerListener
        public void onTimeout() {
            if (POBInterstitial.this.f62927j == POBDataType$POBAdState.LOAD_DEFERRED) {
                POBInterstitial.this.d();
            }
        }
    }

    static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f62941a;

        static {
            int[] iArr = new int[POBDataType$POBAdState.values().length];
            f62941a = iArr;
            try {
                iArr[POBDataType$POBAdState.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f62941a[POBDataType$POBAdState.LOAD_DEFERRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f62941a[POBDataType$POBAdState.SHOWING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f62941a[POBDataType$POBAdState.READY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f62941a[POBDataType$POBAdState.AD_SERVER_READY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f62941a[POBDataType$POBAdState.BID_RECEIVED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f62941a[POBDataType$POBAdState.BID_FAILED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private class d implements POBBidderListener {
        private d() {
        }

        @Override // com.pubmatic.sdk.common.base.POBBidderListener
        public void onBidsFailed(POBBidding pOBBidding, POBError pOBError) {
            POBLog.debug("POBInterstitial", "onBidsFailed : errorMessage= %s", pOBError.toString());
            POBInterstitial.l(POBInterstitial.this);
            if (POBInterstitial.this.f62922e instanceof POBDefaultInterstitialEventHandler) {
                POBInterstitial.this.a(pOBError, true);
            } else {
                POBInterstitial.this.b((POBBid) null);
            }
        }

        @Override // com.pubmatic.sdk.common.base.POBBidderListener
        public void onBidsFetched(POBBidding pOBBidding, POBAdResponse pOBAdResponse) {
            POBInterstitial.this.f62934q = POBAdsHelper.updateResponseUsingPlacementType(pOBAdResponse, "interstitial");
            POBBid pOBBid = (POBBid) POBInterstitial.this.f62934q.getWinningBid();
            if (pOBBid != null) {
                POBLog.debug("POBInterstitial", "onBidsFetched : ImpressionId=%s, BidPrice=%s", pOBBid.getImpressionId(), Double.valueOf(pOBBid.getPrice()));
                if (pOBBid.getRawBid() != null) {
                    POBInstanceProvider.getCacheManager(POBInterstitial.this.f62918a).saveReceivedBid(pOBBid.getRawBid());
                }
            }
            POBInterstitial.l(POBInterstitial.this);
            POBInterstitial.this.b(pOBBid);
        }

        /* synthetic */ d(POBInterstitial pOBInterstitial, a aVar) {
            this();
        }
    }

    private class e implements POBInterstitialEventListener {
        private e() {
        }

        private void a() {
            POBLog.debug("POBInterstitial", "PartnerBidWin", new Object[0]);
            POBBid winningBid = POBBiddingManager.getWinningBid(POBInterstitial.this.f62934q);
            if (winningBid != null) {
                winningBid.setHasWon(true);
                POBUtils.logBidWinningStatus(winningBid.hasWon(), winningBid.getPartnerName());
                String partnerName = winningBid.getPartnerName();
                if (POBInterstitial.this.f62922e != null && partnerName != null) {
                    POBInterstitial pOBInterstitial = POBInterstitial.this;
                    pOBInterstitial.f62926i = pOBInterstitial.f62922e.getRenderer(partnerName);
                }
                if (POBInterstitial.this.f62926i == null) {
                    POBInterstitial pOBInterstitial2 = POBInterstitial.this;
                    pOBInterstitial2.f62926i = pOBInterstitial2.a(winningBid);
                }
                if (POBInterstitial.this.f62938u == POBBiddingHost.ADMOB && (POBInterstitial.this.f62936s.get("admob_watermark") instanceof String)) {
                    POBInterstitial.this.f62926i.setWatermark(POBInterstitial.this.f62936s.get("admob_watermark").toString());
                }
                POBInterstitial.this.f62926i.setAdRendererListener(POBInterstitial.this.f62919b);
                POBInterstitial.this.f62926i.setVideoAdEventListener(POBInterstitial.this.f62929l);
                if (winningBid.getRawBid() != null) {
                    POBInstanceProvider.getCacheManager(POBInterstitial.this.f62918a).saveRenderedBid(winningBid.getRawBid());
                }
                POBInterstitial.this.f62926i.renderAd(winningBid);
            }
        }

        @Override // com.pubmatic.sdk.openwrap.interstitial.POBInterstitialEventListener, com.pubmatic.sdk.openwrap.core.POBAdEventListener
        public POBBidsProvider getBidsProvider() {
            return POBInterstitial.this.f62934q;
        }

        @Override // com.pubmatic.sdk.openwrap.interstitial.POBInterstitialEventListener
        public Map getCustomData() {
            return POBInterstitial.this.f62920c;
        }

        @Override // com.pubmatic.sdk.openwrap.interstitial.POBInterstitialEventListener, com.pubmatic.sdk.openwrap.core.POBAdEventListener
        public void onAdClick() {
            POBInterstitial.this.e();
        }

        @Override // com.pubmatic.sdk.openwrap.interstitial.POBInterstitialEventListener, com.pubmatic.sdk.openwrap.core.POBAdEventListener
        public void onAdClosed() {
            POBInterstitial.this.f();
        }

        @Override // com.pubmatic.sdk.openwrap.interstitial.POBInterstitialEventListener
        public void onAdExpired() {
            POBInterstitial.this.a();
        }

        @Override // com.pubmatic.sdk.openwrap.interstitial.POBInterstitialEventListener, com.pubmatic.sdk.openwrap.core.POBAdEventListener
        public void onAdImpression() {
            POBInterstitial.this.g();
        }

        @Override // com.pubmatic.sdk.openwrap.interstitial.POBInterstitialEventListener, com.pubmatic.sdk.openwrap.core.POBAdEventListener
        public void onAdLeftApplication() {
            POBInterstitial.this.j();
        }

        @Override // com.pubmatic.sdk.openwrap.interstitial.POBInterstitialEventListener, com.pubmatic.sdk.openwrap.core.POBAdEventListener
        public void onAdOpened() {
            POBInterstitial.this.h();
        }

        @Override // com.pubmatic.sdk.openwrap.interstitial.POBInterstitialEventListener
        public void onAdServerWin() {
            Trace.endSection();
            POBBid winningBid = POBBiddingManager.getWinningBid(POBInterstitial.this.f62934q);
            if (winningBid != null) {
                POBUtils.logBidWinningStatus(winningBid.hasWon(), winningBid.getPartnerName());
            } else {
                POBLog.debug("POBInterstitial", "AdServerWin", new Object[0]);
            }
            POBInterstitial.this.f62927j = POBDataType$POBAdState.AD_SERVER_READY;
            POBInterstitial.this.b();
        }

        @Override // com.pubmatic.sdk.openwrap.interstitial.POBInterstitialEventListener
        public void onFailedToLoad(POBError pOBError) {
            POBInterstitial.this.a(pOBError, true);
        }

        @Override // com.pubmatic.sdk.openwrap.interstitial.POBInterstitialEventListener
        public void onFailedToShow(POBError pOBError) {
            POBInterstitial.this.f62927j = POBDataType$POBAdState.DEFAULT;
            POBInterstitial.this.b(pOBError);
        }

        @Override // com.pubmatic.sdk.openwrap.interstitial.POBInterstitialEventListener
        public void onOpenWrapPartnerWin(String str) {
            if (POBInterstitial.this.f62934q != null) {
                POBBid pOBBid = (POBBid) POBInterstitial.this.f62934q.getBid(str);
                if (pOBBid != null) {
                    POBAdResponse.Builder builderUpdateWinningBid = new POBAdResponse.Builder(POBInterstitial.this.f62934q).updateWinningBid(pOBBid);
                    POBInterstitial.this.f62934q = builderUpdateWinningBid.build();
                } else {
                    POBLog.debug("POBInterstitial", "bidId is invalid in onOpenWrapPartnerWin(), rendering the client-side winning bid", new Object[0]);
                }
            }
            a();
        }

        /* synthetic */ e(POBInterstitial pOBInterstitial, a aVar) {
            this();
        }
    }

    private class f implements POBInterstitialRendererListener {
        private f() {
        }

        private void a(POBError pOBError) {
            POBInterstitial.c(POBInterstitial.this);
        }

        @Override // com.pubmatic.sdk.common.ui.POBInterstitialRendererListener
        public void onAdClicked() {
            POBInterstitial.this.e();
            POBInterstitial.c(POBInterstitial.this);
        }

        @Override // com.pubmatic.sdk.common.ui.POBInterstitialRendererListener
        public void onAdExpired() {
            a(new POBError(1011, "Ad Expired"));
            POBInterstitial.this.a();
        }

        @Override // com.pubmatic.sdk.common.ui.POBInterstitialRendererListener
        public void onAdImpression() {
            if (POBInterstitial.this.f62937t) {
                return;
            }
            POBAdsHelper.recordImpressionDepth(POBInterstitial.this.f62918a, POBAdFormat.INTERSTITIAL);
            POBInterstitial.this.g();
        }

        @Override // com.pubmatic.sdk.common.ui.POBInterstitialRendererListener
        public void onAdInteractionStarted() {
            POBInterstitial.this.h();
            if (POBInterstitial.this.f62937t) {
                POBAdsHelper.recordImpressionDepth(POBInterstitial.this.f62918a, POBAdFormat.INTERSTITIAL);
                POBInterstitial.this.g();
            }
            POBBiddingManager.getWinningBid(POBInterstitial.this.f62934q);
            POBInterstitial.c(POBInterstitial.this);
        }

        @Override // com.pubmatic.sdk.common.ui.POBInterstitialRendererListener
        public void onAdInteractionStopped() {
            POBInterstitial.this.f();
            POBInterstitial.c(POBInterstitial.this);
        }

        @Override // com.pubmatic.sdk.common.ui.POBInterstitialRendererListener
        public void onAdRender(POBAdDescriptor pOBAdDescriptor) {
            POBLog.info("POBInterstitial", hashCode() + " : ******** onAdRender() ********", new Object[0]);
            POBInterstitial.this.b();
            POBBiddingManager.getWinningBid(POBInterstitial.this.f62934q);
            POBInterstitial.c(POBInterstitial.this);
        }

        @Override // com.pubmatic.sdk.common.ui.POBInterstitialRendererListener
        public void onAdRenderingFailed(POBError pOBError) {
            boolean z10 = (POBInterstitial.this.f62927j == POBDataType$POBAdState.SHOWING || POBInterstitial.this.f62927j == POBDataType$POBAdState.SHOWN) ? false : true;
            a(pOBError);
            POBInterstitial.this.a(pOBError, z10);
        }

        @Override // com.pubmatic.sdk.common.ui.POBInterstitialRendererListener
        public void onAdUnload() {
        }

        @Override // com.pubmatic.sdk.common.ui.POBInterstitialRendererListener
        public void onLeavingApplication() {
            POBInterstitial.this.j();
        }

        @Override // com.pubmatic.sdk.common.ui.POBInterstitialRendererListener
        public void onRenderProcessGone() {
            POBInterstitial.this.f62927j = POBDataType$POBAdState.DEFAULT;
        }

        /* synthetic */ f(POBInterstitial pOBInterstitial, a aVar) {
            this();
        }
    }

    private class g implements POBVideoAdEventListener {
        private g() {
        }

        @Override // com.pubmatic.sdk.common.ui.POBVideoAdEventListener
        public void onVideoAdEvent(POBDataType$POBVideoAdEventType pOBDataType$POBVideoAdEventType) {
            POBLog.debug("POBInterstitial", "Interstitial Video Ad event: " + pOBDataType$POBVideoAdEventType, new Object[0]);
            if (POBInterstitial.this.f62925h == null || POBDataType$POBVideoAdEventType.COMPLETE != pOBDataType$POBVideoAdEventType) {
                return;
            }
            POBInterstitial.this.f62925h.onVideoPlaybackCompleted(POBInterstitial.this);
        }

        /* synthetic */ g(POBInterstitial pOBInterstitial, a aVar) {
            this();
        }
    }

    public POBInterstitial(@NonNull Context context, @NonNull String str, int i10, @NonNull String str2) {
        this(context, str, i10, str2, new POBDefaultInterstitialEventHandler());
    }

    static /* synthetic */ POBFullScreenAdInteractionListener c(POBInterstitial pOBInterstitial) {
        pOBInterstitial.getClass();
        return null;
    }

    static /* synthetic */ POBBidEventListener l(POBInterstitial pOBInterstitial) {
        pOBInterstitial.getClass();
        return null;
    }

    public void addExtraInfo(@NonNull String str, @NonNull Object obj) {
        if (str == "admob_watermark" && (obj instanceof String)) {
            this.f62936s.put(str, obj);
        } else {
            POBLog.warn("POBInterstitial", "Received invalid key %s for extra info", str);
        }
    }

    public void destroy() {
        POBBaseBidder pOBBaseBidder = this.f62921d;
        if (pOBBaseBidder != null) {
            pOBBaseBidder.destroy();
            this.f62921d = null;
        }
        k();
        this.f62927j = POBDataType$POBAdState.DEFAULT;
        POBInterstitialRendering pOBInterstitialRendering = this.f62926i;
        if (pOBInterstitialRendering != null) {
            pOBInterstitialRendering.destroy();
        }
        POBInterstitialEvent pOBInterstitialEvent = this.f62922e;
        if (pOBInterstitialEvent != null) {
            pOBInterstitialEvent.destroy();
        }
        this.f62925h = null;
        this.f62924g = null;
        this.f62929l = null;
    }

    @Nullable
    public POBRequest getAdRequest() {
        POBRequest pOBRequest = this.f62930m;
        if (pOBRequest != null) {
            return pOBRequest;
        }
        POBLog.warn("POBInterstitial", "Please check if you have provided valid details while constructing an Ad object", new Object[0]);
        return null;
    }

    @Override // com.pubmatic.sdk.openwrap.core.POBBidEvent
    @Nullable
    public POBBid getBid() {
        return POBBiddingManager.getWinningBid(this.f62934q);
    }

    @Nullable
    public POBImpression getImpression() {
        return POBAdsHelper.getImpression(this.f62930m);
    }

    public boolean isReady() {
        return this.f62927j.equals(POBDataType$POBAdState.READY) || this.f62927j.equals(POBDataType$POBAdState.AD_SERVER_READY);
    }

    @RequiresPermission("android.permission.INTERNET")
    public void loadAd() {
        Trace.beginSection("POB Interstitial Load Ad");
        Trace.beginSection("POB Request Building");
        POBImpression impression = getImpression();
        if (this.f62930m == null || impression == null) {
            a(new POBError(1001, "Missing ad request parameters. Please check input parameters."));
            POBLog.error("POBInterstitial", "Missing ad request parameters. Please check input parameters.", new Object[0]);
            return;
        }
        switch (c.f62941a[this.f62927j.ordinal()]) {
            case 1:
            case 2:
                POBLog.debug("POBInterstitial", "Can't make new request. Ad is loading.", new Object[0]);
                return;
            case 3:
                POBLog.debug("POBInterstitial", "Can't make new request while Ad is showing", new Object[0]);
                return;
            case 4:
            case 5:
                POBLog.error("POBInterstitial", "Can't make new request. Please show already loaded ad before requesting a new one.", new Object[0]);
                b();
                return;
            case 6:
                POBLog.debug("POBInterstitial", "Sharing bids through bid event delegate.", new Object[0]);
                getBid();
                POBLog.info("POBInterstitial", "Ad has expired.", new Object[0]);
                break;
        }
        if (this.f62933p) {
            d();
        } else {
            this.f62927j = POBDataType$POBAdState.LOAD_DEFERRED;
            l();
        }
    }

    @Override // com.pubmatic.sdk.openwrap.core.POBBidEvent
    public void proceedOnError(@NonNull POBBidEvent.BidEventError bidEventError, @NonNull String str) {
        POBLog.warn("POBInterstitial", "'POBBidEventListener' not implemented", new Object[0]);
    }

    @Override // com.pubmatic.sdk.openwrap.core.POBBidEvent
    public boolean proceedToLoadAd() {
        POBLog.warn("POBInterstitial", "'POBBidEventListener' not implemented", new Object[0]);
        return false;
    }

    @Override // com.pubmatic.sdk.openwrap.core.POBBidEvent
    public void setBidEventListener(@Nullable POBBidEventListener pOBBidEventListener) {
    }

    public void setListener(@Nullable POBInterstitialListener pOBInterstitialListener) {
        this.f62924g = pOBInterstitialListener;
    }

    public void setVideoListener(@Nullable POBVideoListener pOBVideoListener) {
        this.f62925h = pOBVideoListener;
    }

    public void show() {
        POBInterstitialRendering pOBInterstitialRendering;
        if (this.f62922e != null && this.f62927j.equals(POBDataType$POBAdState.AD_SERVER_READY)) {
            this.f62927j = POBDataType$POBAdState.SHOWING;
            this.f62922e.show();
        } else if (!isReady() || (pOBInterstitialRendering = this.f62926i) == null) {
            b(this.f62927j.equals(POBDataType$POBAdState.EXPIRED) ? new POBError(1011, "Ad has expired.") : this.f62927j.equals(POBDataType$POBAdState.SHOWN) ? new POBError(2001, "Ad is already shown.") : new POBError(2002, "Can't show ad. Ad is not ready."));
        } else {
            this.f62927j = POBDataType$POBAdState.SHOWING;
            pOBInterstitialRendering.show(this.f62928k);
        }
    }

    public POBInterstitial(@NonNull Context context) {
        this(context, new POBDefaultInterstitialEventHandler());
    }

    private void c() {
        this.f62927j = POBDataType$POBAdState.LOADING;
        POBAdResponse pOBAdResponse = this.f62934q;
        if (pOBAdResponse != null) {
            this.f62934q = new POBAdResponse.Builder(pOBAdResponse).setWinningBid(null).build();
        }
        if (this.f62922e != null) {
            POBLog.info("POBInterstitial", "Proceeding with bid. Ad server integration is " + this.f62922e.getClass().getSimpleName(), new Object[0]);
        }
        b((POBBid) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        POBLog.info("POBInterstitial", "Requesting new bid from state - %s.", this.f62927j);
        this.f62934q = null;
        if (this.f62930m != null) {
            POBAdSize interstitialAdSize = POBUtils.getInterstitialAdSize(this.f62918a.getApplicationContext());
            POBImpression impression = getImpression();
            if (impression != null) {
                this.f62927j = POBDataType$POBAdState.LOADING;
                impression.setVideo(new POBVideo(POBVideo.Placement.INTERSTITIAL, POBVideo.Plcmt.INTERSTITIAL, POBVideo.Linearity.LINEAR, interstitialAdSize));
                impression.setBanner(new POBBanner(interstitialAdSize));
                int deviceOrientation = POBUtils.getDeviceOrientation(this.f62918a.getApplicationContext());
                this.f62928k = deviceOrientation;
                this.f62920c.put("orientation", Integer.valueOf(deviceOrientation));
                a(this.f62930m).requestBid();
                return;
            }
        }
        a(new POBError(1001, "Missing ad request parameters. Please check input parameters."), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        POBInterstitialListener pOBInterstitialListener = this.f62924g;
        if (pOBInterstitialListener != null) {
            pOBInterstitialListener.onAdClicked(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.f62927j = POBDataType$POBAdState.SHOWN;
        POBInterstitialListener pOBInterstitialListener = this.f62924g;
        if (pOBInterstitialListener != null) {
            pOBInterstitialListener.onAdClosed(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        POBInterstitialListener pOBInterstitialListener = this.f62924g;
        if (pOBInterstitialListener != null) {
            pOBInterstitialListener.onAdImpression(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        POBInterstitialListener pOBInterstitialListener = this.f62924g;
        if (pOBInterstitialListener != null) {
            pOBInterstitialListener.onAdOpened(this);
        }
    }

    private void i() {
        Trace.endSection();
        POBInterstitialListener pOBInterstitialListener = this.f62924g;
        if (pOBInterstitialListener != null) {
            pOBInterstitialListener.onAdReceived(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        POBInterstitialListener pOBInterstitialListener = this.f62924g;
        if (pOBInterstitialListener != null) {
            pOBInterstitialListener.onAppLeaving(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        POBTimeoutHandler pOBTimeoutHandler = this.f62931n;
        if (pOBTimeoutHandler != null) {
            pOBTimeoutHandler.cancel();
        }
        this.f62931n = null;
    }

    private void l() {
        POBLog.debug("POBInterstitial", "scheduleDelay until init completed.", new Object[0]);
        POBTimeoutHandler pOBTimeoutHandler = new POBTimeoutHandler(new b());
        this.f62931n = pOBTimeoutHandler;
        pOBTimeoutHandler.start(500L);
    }

    public POBInterstitial(@NonNull Context context, @NonNull String str, int i10, @NonNull String str2, @NonNull POBInterstitialEvent pOBInterstitialEvent) {
        this(context, pOBInterstitialEvent);
        a(context, str, i10, str2, pOBInterstitialEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(POBError pOBError) {
        POBLog.error("POBInterstitial", "Failed to show ad with error - " + pOBError, new Object[0]);
        POBInterstitialListener pOBInterstitialListener = this.f62924g;
        if (pOBInterstitialListener != null) {
            pOBInterstitialListener.onAdFailedToShow(this, pOBError);
        }
    }

    private POBInterstitial(Context context, POBInterstitialEvent pOBInterstitialEvent) {
        this.f62933p = false;
        this.f62936s = DesugarCollections.synchronizedMap(new HashMap());
        this.f62938u = POBBiddingHost.UNKNOWN;
        this.f62918a = context;
        this.f62927j = POBDataType$POBAdState.DEFAULT;
        this.f62920c = new HashMap();
        a aVar = null;
        this.f62919b = new f(this, aVar);
        this.f62929l = new g(this, aVar);
        if (pOBInterstitialEvent != null) {
            this.f62922e = pOBInterstitialEvent;
            pOBInterstitialEvent.setEventListener(new e(this, aVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(POBBid pOBBid) {
        if (this.f62922e != null) {
            Trace.endSection();
            this.f62922e.requestAd(pOBBid);
            this.f62922e.getAdInteractionListener();
            return;
        }
        POBLog.warn("POBInterstitial", "Unable to proceed with request bid as event is null.", new Object[0]);
    }

    private void a(Context context, String str, int i10, String str2, POBInterstitialEvent pOBInterstitialEvent) {
        if (POBAdsHelper.validate(context, str, str2, pOBInterstitialEvent)) {
            if (!this.f62933p) {
                OpenWrapSDK.initialize(context, new OpenWrapSDKConfig.Builder(str, new ArrayList(Collections.singletonList(Integer.valueOf(i10)))).build(), new a());
            }
            POBAdFormat pOBAdFormat = POBAdFormat.INTERSTITIAL;
            this.f62930m = POBRequest.createInstance(str, i10, pOBAdFormat, POBAdsHelper.createFullScreenImpression(context, str2, pOBAdFormat));
            this.f62935r = POBInstanceProvider.getCacheManager(context.getApplicationContext());
            return;
        }
        POBLog.error("POBInterstitial", new POBError(1001, "Missing ad request parameters. Please check input parameters.").toString(), new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.f62927j != POBDataType$POBAdState.AD_SERVER_READY) {
            this.f62927j = POBDataType$POBAdState.READY;
        }
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(POBError pOBError, boolean z10) {
        this.f62927j = POBDataType$POBAdState.DEFAULT;
        if (z10) {
            a(pOBError);
        } else {
            b(pOBError);
        }
    }

    private void a(POBError pOBError) {
        Trace.endSection();
        POBLog.error("POBInterstitial", "Failed to receive ad with error - " + pOBError, new Object[0]);
        POBInterstitialListener pOBInterstitialListener = this.f62924g;
        if (pOBInterstitialListener != null) {
            pOBInterstitialListener.onAdFailedToLoad(this, pOBError);
        }
    }

    @RequiresPermission("android.permission.INTERNET")
    public void loadAd(@NonNull String str, @NonNull POBBiddingHost pOBBiddingHost) {
        if (pOBBiddingHost == null) {
            a(new POBError(1001, "Bidding host cannot be null"));
        } else {
            this.f62938u = pOBBiddingHost;
            loadAd(str);
        }
    }

    @RequiresPermission("android.permission.INTERNET")
    @Deprecated
    public void loadAd(@NonNull String str) {
        this.f62937t = true;
        if (!POBUtils.isNullOrEmpty(str)) {
            Trace.beginSection("POB Interstitial Load Ad");
            Trace.beginSection("POB Response Parsing");
            int i10 = c.f62941a[this.f62927j.ordinal()];
            if (i10 == 1) {
                POBLog.debug("POBInterstitial", "Can't make new request. Ad is loading.", new Object[0]);
                return;
            }
            if (i10 == 3) {
                POBLog.debug("POBInterstitial", "Can't make new request while Ad is showing", new Object[0]);
                return;
            }
            if (i10 != 4) {
                this.f62927j = POBDataType$POBAdState.LOADING;
                POBBaseBidder pOBBaseBidderA = a(str);
                this.f62921d = pOBBaseBidderA;
                pOBBaseBidderA.requestBid();
                return;
            }
            POBLog.error("POBInterstitial", "Can't make new request. Please show already loaded ad before requesting a new one.", new Object[0]);
            b();
            return;
        }
        a(new POBError(1007, "Invalid Bid Response."));
        POBLog.error("POBInterstitial", "Invalid Bid Response.", new Object[0]);
    }

    private POBBidding a(POBRequest pOBRequest) {
        POBProfileInfo profileInfo;
        if (this.f62921d == null) {
            a aVar = null;
            if (this.f62935r != null) {
                profileInfo = this.f62935r.getProfileInfo(String.valueOf(pOBRequest.getProfileId()));
            } else {
                profileInfo = null;
            }
            this.f62921d = new POBBiddingManager(POBOWPartnerHelper.createPOBManager(this.f62918a, pOBRequest, profileInfo));
            this.f62921d.setBidderListener(new d(this, aVar));
        }
        return this.f62921d;
    }

    private POBBaseBidder a(String str) {
        POBExtBidHandler pOBExtBidHandler = new POBExtBidHandler(str);
        this.f62921d = pOBExtBidHandler;
        pOBExtBidHandler.setBidderListener(new d(this, null));
        return this.f62921d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.f62927j = POBDataType$POBAdState.EXPIRED;
        POBInterstitialRendering pOBInterstitialRendering = this.f62926i;
        if (pOBInterstitialRendering != null) {
            pOBInterstitialRendering.destroy();
            this.f62926i = null;
        }
        POBInterstitialListener pOBInterstitialListener = this.f62924g;
        if (pOBInterstitialListener != null) {
            pOBInterstitialListener.onAdExpired(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public POBInterstitialRendering a(POBBid pOBBid) {
        return POBRenderer.getInterstitialRenderer(this.f62918a.getApplicationContext(), pOBBid);
    }
}
