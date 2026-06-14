package com.pubmatic.sdk.rewardedad;

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
import com.pubmatic.sdk.common.cache.POBCacheService;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.models.POBAdResponse;
import com.pubmatic.sdk.common.models.POBProfileInfo;
import com.pubmatic.sdk.common.ui.POBCoreReward;
import com.pubmatic.sdk.common.ui.POBRewardedAdRendererListener;
import com.pubmatic.sdk.common.ui.POBRewardedAdRendering;
import com.pubmatic.sdk.common.utility.POBTimeoutHandler;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.openwrap.core.POBAdsHelper;
import com.pubmatic.sdk.openwrap.core.POBBid;
import com.pubmatic.sdk.openwrap.core.POBBidEvent;
import com.pubmatic.sdk.openwrap.core.POBBidEventListener;
import com.pubmatic.sdk.openwrap.core.POBBiddingManager;
import com.pubmatic.sdk.openwrap.core.POBExtBidHandler;
import com.pubmatic.sdk.openwrap.core.POBImpression;
import com.pubmatic.sdk.openwrap.core.POBOWPartnerHelper;
import com.pubmatic.sdk.openwrap.core.POBRequest;
import com.pubmatic.sdk.openwrap.core.POBReward;
import com.pubmatic.sdk.openwrap.core.POBRewardedAdInteractionListener;
import com.pubmatic.sdk.openwrap.core.POBVideo;
import com.pubmatic.sdk.openwrap.core.rewarded.POBSkipConfirmationInfo;
import com.pubmatic.sdk.openwrap.core.signal.POBBiddingHost;
import com.pubmatic.sdk.openwrap.core.signal.POBBiddingHostKt;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
@MainThread
public class POBRewardedAd implements POBBidEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private POBBaseBidder f62949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final POBRewardedAdEvent f62950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private POBRewardedAdInteractionListener f62951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private POBRewardedAdListener f62952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private POBRewardedAdRendering f62953e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private POBDataType$POBAdState f62954f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final POBRewardedAdEventListener f62955g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Context f62956h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private POBBidEventListener f62957i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private POBRequest f62958j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private POBTimeoutHandler f62959k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f62960l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private POBAdResponse f62961m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private POBSkipConfirmationInfo f62962n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Map f62963o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ConcurrentHashMap f62964p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private POBCacheManager f62965q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private POBBiddingHost f62966r;

    @MainThread
    public static class POBRewardedAdListener {
        public void onAdClicked(@NonNull POBRewardedAd pOBRewardedAd) {
        }

        public void onAdClosed(@NonNull POBRewardedAd pOBRewardedAd) {
        }

        public void onAdExpired(@NonNull POBRewardedAd pOBRewardedAd) {
        }

        public void onAdFailedToLoad(@NonNull POBRewardedAd pOBRewardedAd, @NonNull POBError pOBError) {
        }

        public void onAdFailedToShow(@NonNull POBRewardedAd pOBRewardedAd, @NonNull POBError pOBError) {
        }

        public void onAdImpression(@NonNull POBRewardedAd pOBRewardedAd) {
        }

        public void onAdOpened(@NonNull POBRewardedAd pOBRewardedAd) {
        }

        public void onAdReceived(@NonNull POBRewardedAd pOBRewardedAd) {
        }

        public void onAppLeaving(@NonNull POBRewardedAd pOBRewardedAd) {
        }

        public void onReceiveReward(@NonNull POBRewardedAd pOBRewardedAd, @NonNull POBReward pOBReward) {
        }
    }

    class a implements OpenWrapSDKInitializer.Listener {
        a() {
        }

        @Override // com.pubmatic.sdk.common.OpenWrapSDKInitializer.Listener
        public void onFailure(POBError pOBError) {
            POBRewardedAd.this.f62960l = true;
            POBLog.error("POBRewardedAd", "OpenWrap SDK initialization failed with error : " + pOBError, new Object[0]);
            if (POBRewardedAd.this.f62954f == POBDataType$POBAdState.LOAD_DEFERRED) {
                POBRewardedAd.this.a(pOBError);
            }
        }

        @Override // com.pubmatic.sdk.common.OpenWrapSDKInitializer.Listener
        public void onSuccess() {
            POBRewardedAd.this.f62960l = true;
            POBLog.verbose("POBRewardedAd", "OpenWrap SDK initialization successful", new Object[0]);
            if (POBRewardedAd.this.f62954f == POBDataType$POBAdState.LOAD_DEFERRED) {
                POBRewardedAd.this.k();
                POBRewardedAd.this.d();
            }
        }
    }

    class b implements POBTimeoutHandler.POBTimeoutHandlerListener {
        b() {
        }

        @Override // com.pubmatic.sdk.common.utility.POBTimeoutHandler.POBTimeoutHandlerListener
        public void onTimeout() {
            if (POBRewardedAd.this.f62954f == POBDataType$POBAdState.LOAD_DEFERRED) {
                POBRewardedAd.this.d();
            }
        }
    }

    static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f62969a;

        static {
            int[] iArr = new int[POBDataType$POBAdState.values().length];
            f62969a = iArr;
            try {
                iArr[POBDataType$POBAdState.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f62969a[POBDataType$POBAdState.SHOWING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f62969a[POBDataType$POBAdState.READY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f62969a[POBDataType$POBAdState.AD_SERVER_READY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f62969a[POBDataType$POBAdState.BID_RECEIVED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f62969a[POBDataType$POBAdState.BID_FAILED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f62969a[POBDataType$POBAdState.EXPIRED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f62969a[POBDataType$POBAdState.SHOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private class d implements POBBidderListener {
        private d() {
        }

        @Override // com.pubmatic.sdk.common.base.POBBidderListener
        public void onBidsFailed(POBBidding pOBBidding, POBError pOBError) {
            POBLog.debug("POBRewardedAd", "onBidsFailed : errorMessage= %s", pOBError.toString());
            POBRewardedAd.k(POBRewardedAd.this);
            if (POBRewardedAd.this.f62950b instanceof POBDefaultRewardedAdEventHandler) {
                POBRewardedAd.this.a(pOBError);
            } else {
                POBRewardedAd.this.b((POBBid) null);
            }
        }

        @Override // com.pubmatic.sdk.common.base.POBBidderListener
        public void onBidsFetched(POBBidding pOBBidding, POBAdResponse pOBAdResponse) {
            POBRewardedAd.this.f62961m = POBAdsHelper.updateResponseUsingPlacementType(pOBAdResponse, "interstitial");
            POBBid pOBBid = (POBBid) POBRewardedAd.this.f62961m.getWinningBid();
            if (pOBBid != null) {
                POBLog.debug("POBRewardedAd", "onBidsFetched : ImpressionId=%s, BidPrice=%s", pOBBid.getImpressionId(), Double.valueOf(pOBBid.getPrice()));
                if (pOBBid.getRawBid() != null) {
                    POBInstanceProvider.getCacheManager(POBRewardedAd.this.f62956h).saveReceivedBid(pOBBid.getRawBid());
                }
            }
            POBRewardedAd.k(POBRewardedAd.this);
            POBRewardedAd.this.b(pOBBid);
        }

        /* synthetic */ d(POBRewardedAd pOBRewardedAd, a aVar) {
            this();
        }
    }

    private class e implements POBRewardedAdEventListener {
        private e() {
        }

        private void a() {
            POBLog.debug("POBRewardedAd", "PartnerBidWin", new Object[0]);
            POBBid winningBid = POBBiddingManager.getWinningBid(POBRewardedAd.this.f62961m);
            if (winningBid == null || POBRewardedAd.this.f62950b == null) {
                return;
            }
            winningBid.setHasWon(true);
            POBUtils.logBidWinningStatus(winningBid.hasWon(), winningBid.getPartnerName());
            String partnerName = winningBid.getPartnerName();
            if (partnerName != null) {
                POBRewardedAd pOBRewardedAd = POBRewardedAd.this;
                pOBRewardedAd.f62953e = pOBRewardedAd.f62950b.getRenderer(partnerName);
            }
            if (POBRewardedAd.this.f62953e == null) {
                POBRewardedAd pOBRewardedAd2 = POBRewardedAd.this;
                pOBRewardedAd2.f62953e = pOBRewardedAd2.a(winningBid);
            }
            POBRewardedAd.this.f62953e.setAdRendererListener(new f(POBRewardedAd.this, null));
            if (POBBiddingHostKt.isAdMob(POBRewardedAd.this.f62966r)) {
                Object valueFromMap = POBUtils.getValueFromMap(POBRewardedAd.this.f62964p, "admob_watermark");
                if (valueFromMap instanceof String) {
                    POBRewardedAd.this.f62953e.setWatermark((String) valueFromMap);
                } else {
                    POBLog.warn("POBRewardedAd", "Passed watermark image is not of type string.", new Object[0]);
                }
            }
            if (winningBid.getRawBid() != null) {
                POBInstanceProvider.getCacheManager(POBRewardedAd.this.f62956h).saveRenderedBid(winningBid.getRawBid());
            }
            POBRewardedAd.this.f62953e.renderAd(winningBid);
        }

        @Override // com.pubmatic.sdk.rewardedad.POBRewardedAdEventListener, com.pubmatic.sdk.openwrap.core.POBAdEventListener
        public POBBidsProvider getBidsProvider() {
            return POBRewardedAd.this.f62961m;
        }

        @Override // com.pubmatic.sdk.rewardedad.POBRewardedAdEventListener, com.pubmatic.sdk.openwrap.core.POBAdEventListener
        public void onAdClick() {
            POBRewardedAd.this.e();
        }

        @Override // com.pubmatic.sdk.rewardedad.POBRewardedAdEventListener, com.pubmatic.sdk.openwrap.core.POBAdEventListener
        public void onAdClosed() {
            POBRewardedAd.this.f();
        }

        @Override // com.pubmatic.sdk.rewardedad.POBRewardedAdEventListener
        public void onAdExpired() {
            POBRewardedAd.this.a();
        }

        @Override // com.pubmatic.sdk.rewardedad.POBRewardedAdEventListener, com.pubmatic.sdk.openwrap.core.POBAdEventListener
        public void onAdImpression() {
            POBRewardedAd.this.g();
        }

        @Override // com.pubmatic.sdk.rewardedad.POBRewardedAdEventListener, com.pubmatic.sdk.openwrap.core.POBAdEventListener
        public void onAdLeftApplication() {
            POBRewardedAd.this.j();
        }

        @Override // com.pubmatic.sdk.rewardedad.POBRewardedAdEventListener, com.pubmatic.sdk.openwrap.core.POBAdEventListener
        public void onAdOpened() {
            POBRewardedAd.this.h();
        }

        @Override // com.pubmatic.sdk.rewardedad.POBRewardedAdEventListener
        public void onAdServerWin() {
            POBLog.debug("POBRewardedAd", "AdServerWin", new Object[0]);
            Trace.endSection();
            POBBid winningBid = POBBiddingManager.getWinningBid(POBRewardedAd.this.f62961m);
            if (winningBid != null) {
                POBUtils.logBidWinningStatus(winningBid.hasWon(), winningBid.getPartnerName());
            } else {
                POBLog.debug("POBRewardedAd", "AdServerWin", new Object[0]);
            }
            POBRewardedAd.this.f62954f = POBDataType$POBAdState.AD_SERVER_READY;
            POBRewardedAd.this.b();
        }

        @Override // com.pubmatic.sdk.rewardedad.POBRewardedAdEventListener
        public void onFailedToLoad(POBError pOBError) {
            POBRewardedAd.this.a(pOBError);
        }

        @Override // com.pubmatic.sdk.rewardedad.POBRewardedAdEventListener
        public void onFailedToShow(POBError pOBError) {
            POBRewardedAd.this.c(pOBError);
        }

        @Override // com.pubmatic.sdk.rewardedad.POBRewardedAdEventListener
        public void onOpenWrapPartnerWin(String str) {
            if (POBRewardedAd.this.f62961m != null) {
                POBBid pOBBid = (POBBid) POBRewardedAd.this.f62961m.getBid(str);
                if (pOBBid != null) {
                    POBAdResponse.Builder builder = new POBAdResponse.Builder(POBRewardedAd.this.f62961m);
                    builder.updateWinningBid(pOBBid);
                    POBRewardedAd.this.f62961m = builder.build();
                } else {
                    POBLog.debug("POBRewardedAd", "bidId is invalid in onOpenWrapPartnerWin(), rendering the client-side winning bid", new Object[0]);
                }
            }
            a();
        }

        @Override // com.pubmatic.sdk.rewardedad.POBRewardedAdEventListener
        public void onReceiveReward(POBReward pOBReward) {
            POBRewardedAd.this.a(pOBReward);
        }

        /* synthetic */ e(POBRewardedAd pOBRewardedAd, a aVar) {
            this();
        }
    }

    private class f implements POBRewardedAdRendererListener {
        private f() {
        }

        @Override // com.pubmatic.sdk.common.ui.POBRewardedAdRendererListener
        public void onAdClicked() {
            POBRewardedAd.this.e();
            POBRewardedAd.r(POBRewardedAd.this);
        }

        @Override // com.pubmatic.sdk.common.ui.POBRewardedAdRendererListener
        public void onAdEventOccurred(POBDataType$POBVideoAdEventType pOBDataType$POBVideoAdEventType) {
        }

        @Override // com.pubmatic.sdk.common.ui.POBRewardedAdRendererListener
        public void onAdExpired() {
            POBRewardedAd.this.a(new POBError(1011, "Ad has expired."), true);
            POBRewardedAd.this.a();
        }

        @Override // com.pubmatic.sdk.common.ui.POBRewardedAdRendererListener
        public void onAdImpression() {
            POBAdsHelper.recordImpressionDepth(POBRewardedAd.this.f62956h, POBAdFormat.REWARDEDAD);
            POBRewardedAd.this.g();
        }

        @Override // com.pubmatic.sdk.common.ui.POBRewardedAdRendererListener
        public void onAdInteractionStarted() {
            POBRewardedAd.this.h();
            POBBiddingManager.getWinningBid(POBRewardedAd.this.f62961m);
            POBRewardedAd.r(POBRewardedAd.this);
        }

        @Override // com.pubmatic.sdk.common.ui.POBRewardedAdRendererListener
        public void onAdInteractionStopped() {
            POBRewardedAd.this.f();
            POBRewardedAd.r(POBRewardedAd.this);
        }

        @Override // com.pubmatic.sdk.common.ui.POBRewardedAdRendererListener
        public void onAdRender(POBAdDescriptor pOBAdDescriptor) {
            POBLog.info("POBRewardedAd", hashCode() + " : ******** onAdRender() ********", new Object[0]);
            POBRewardedAd.this.b();
        }

        @Override // com.pubmatic.sdk.common.ui.POBRewardedAdRendererListener
        public void onAdRenderingFailed(POBError pOBError) {
            boolean z10 = (POBRewardedAd.this.f62954f == POBDataType$POBAdState.SHOWING || POBRewardedAd.this.f62954f == POBDataType$POBAdState.SHOWN) ? false : true;
            POBRewardedAd.this.a(pOBError, z10);
            if (z10) {
                POBRewardedAd.this.a(pOBError);
            } else {
                POBRewardedAd.this.c(pOBError);
            }
        }

        @Override // com.pubmatic.sdk.common.ui.POBRewardedAdRendererListener
        public void onLeavingApplication() {
            POBRewardedAd.this.j();
        }

        @Override // com.pubmatic.sdk.common.ui.POBRewardedAdRendererListener
        public void onReceiveReward(POBCoreReward pOBCoreReward) {
            POBReward pOBReward = pOBCoreReward != null ? new POBReward(pOBCoreReward.getCurrencyType(), pOBCoreReward.getAmount()) : null;
            if ((pOBReward == null || !(POBRewardedAd.this.f62950b instanceof POBDefaultRewardedAdEventHandler)) && POBRewardedAd.this.f62950b != null) {
                pOBReward = POBRewardedAd.this.f62950b.getSelectedReward();
            }
            POBRewardedAd.r(POBRewardedAd.this);
            if (pOBReward == null) {
                POBLog.warn("POBRewardedAd", "No reward received. Hence, creating new reward object with default values.", new Object[0]);
                pOBReward = new POBReward("", 0);
            }
            POBRewardedAd.this.a(pOBReward);
            POBLog.debug("POBRewardedAd", "Unable to notify completion event as interaction listener is null.", new Object[0]);
        }

        /* synthetic */ f(POBRewardedAd pOBRewardedAd, a aVar) {
            this();
        }
    }

    private POBRewardedAd(Context context, String str, int i10, String str2, POBRewardedAdEvent pOBRewardedAdEvent) {
        this(context, pOBRewardedAdEvent);
        if (!this.f62960l) {
            OpenWrapSDK.initialize(context, new OpenWrapSDKConfig.Builder(str, new ArrayList(Collections.singletonList(Integer.valueOf(i10)))).build(), new a());
        }
        POBAdFormat pOBAdFormat = POBAdFormat.REWARDEDAD;
        this.f62958j = POBRequest.createInstance(str, i10, pOBAdFormat, POBAdsHelper.createFullScreenImpression(context, str2, pOBAdFormat));
        this.f62965q = POBInstanceProvider.getCacheManager(context.getApplicationContext());
    }

    @Nullable
    public static POBRewardedAd getRewardedAd(@NonNull Context context, @NonNull String str, int i10, @NonNull String str2) {
        return getRewardedAd(context, str, i10, str2, new POBDefaultRewardedAdEventHandler());
    }

    static /* synthetic */ POBBidEventListener k(POBRewardedAd pOBRewardedAd) {
        pOBRewardedAd.getClass();
        return null;
    }

    static /* synthetic */ POBRewardedAdInteractionListener r(POBRewardedAd pOBRewardedAd) {
        pOBRewardedAd.getClass();
        return null;
    }

    public void addExtraInfo(@NonNull String str, @NonNull Object obj) {
        if (this.f62964p == null) {
            this.f62964p = new ConcurrentHashMap();
        }
        if (str == null || obj == null) {
            return;
        }
        this.f62964p.put(str, obj);
    }

    public void destroy() {
        Map<String, String> adServerConfig;
        String str;
        boolean z10;
        POBRewardedAdEvent pOBRewardedAdEvent = this.f62950b;
        if (pOBRewardedAdEvent == null || (adServerConfig = pOBRewardedAdEvent.getAdServerConfig()) == null || (str = adServerConfig.get(POBRewardedAdEvent.KEY_ALLOW_MULTIPLE_INSTANCES_FOR_ADUNIT_ID)) == null) {
            return;
        }
        try {
            z10 = Boolean.parseBoolean(str);
        } catch (ClassCastException unused) {
            POBLog.debug("POBRewardedAd", "Unable to parse %s key", POBRewardedAdEvent.KEY_ALLOW_MULTIPLE_INSTANCES_FOR_ADUNIT_ID);
            z10 = false;
        }
        if (z10) {
            POBLog.debug("POBRewardedAd", "Clean up initiated.", new Object[0]);
            POBBaseBidder pOBBaseBidder = this.f62949a;
            if (pOBBaseBidder != null) {
                pOBBaseBidder.destroy();
                this.f62949a = null;
            }
            POBRewardedAdRendering pOBRewardedAdRendering = this.f62953e;
            if (pOBRewardedAdRendering != null) {
                pOBRewardedAdRendering.destroy();
                this.f62953e = null;
            }
            k();
            this.f62954f = POBDataType$POBAdState.DEFAULT;
            this.f62952d = null;
            this.f62961m = null;
            this.f62950b.destroy();
            this.f62962n = null;
        }
    }

    @Nullable
    public POBRequest getAdRequest() {
        if (this.f62958j == null) {
            POBLog.warn("POBRewardedAd", "Please check if you have provided valid details while constructing an Ad object", new Object[0]);
        }
        return this.f62958j;
    }

    @Nullable
    public List<POBReward> getAvailableRewards() {
        POBRewardedAdEvent pOBRewardedAdEvent = this.f62950b;
        if (pOBRewardedAdEvent != null) {
            return pOBRewardedAdEvent.getAdServerRewards();
        }
        return null;
    }

    @Override // com.pubmatic.sdk.openwrap.core.POBBidEvent
    @Nullable
    public POBBid getBid() {
        return POBBiddingManager.getWinningBid(this.f62961m);
    }

    @Nullable
    public POBImpression getImpression() {
        return POBAdsHelper.getImpression(this.f62958j);
    }

    public boolean isReady() {
        return this.f62954f.equals(POBDataType$POBAdState.READY) || this.f62954f.equals(POBDataType$POBAdState.AD_SERVER_READY);
    }

    @RequiresPermission("android.permission.INTERNET")
    public void loadAd() {
        Trace.beginSection("POB Rewarded Load Ad");
        Trace.beginSection("POB Request Building");
        if (this.f62958j == null) {
            b(new POBError(1001, "Missing ad request parameters. Please check input parameters."));
            POBLog.error("POBRewardedAd", "Missing ad request parameters. Please check input parameters.", new Object[0]);
            return;
        }
        int i10 = c.f62969a[this.f62954f.ordinal()];
        if (i10 == 1) {
            POBLog.debug("POBRewardedAd", "Can't make new request. Ad is loading.", new Object[0]);
            return;
        }
        if (i10 == 2) {
            POBLog.debug("POBRewardedAd", "Can't make new request while Ad is showing", new Object[0]);
            return;
        }
        if (i10 == 3 || i10 == 4) {
            b();
            return;
        }
        if (i10 == 5) {
            POBLog.debug("POBRewardedAd", "Sharing bids through bid event delegate.", new Object[0]);
            getBid();
            POBLog.info("POBRewardedAd", "Ad has expired.", new Object[0]);
        }
        if (this.f62960l) {
            d();
        } else {
            this.f62954f = POBDataType$POBAdState.LOAD_DEFERRED;
            l();
        }
    }

    @Override // com.pubmatic.sdk.openwrap.core.POBBidEvent
    public void proceedOnError(@NonNull POBBidEvent.BidEventError bidEventError, @NonNull String str) {
        POBLog.warn("POBRewardedAd", "'POBBidEventListener' not implemented", new Object[0]);
    }

    @Override // com.pubmatic.sdk.openwrap.core.POBBidEvent
    public boolean proceedToLoadAd() {
        POBLog.warn("POBRewardedAd", "'POBBidEventListener' not implemented", new Object[0]);
        return false;
    }

    @Override // com.pubmatic.sdk.openwrap.core.POBBidEvent
    public void setBidEventListener(@Nullable POBBidEventListener pOBBidEventListener) {
    }

    public void setListener(@Nullable POBRewardedAdListener pOBRewardedAdListener) {
        this.f62952d = pOBRewardedAdListener;
    }

    public void setSkipAlertDialogInfo(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4) {
        if (POBUtils.isNullOrEmpty(str) || POBUtils.isNullOrEmpty(str2) || POBUtils.isNullOrEmpty(str3) || POBUtils.isNullOrEmpty(str4)) {
            return;
        }
        this.f62962n = new POBSkipConfirmationInfo(str, str2, str3, str4);
    }

    public void show() {
        show(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(POBError pOBError) {
        POBLog.error("POBRewardedAd", "Failed to show ad with error - " + pOBError, new Object[0]);
        POBRewardedAdListener pOBRewardedAdListener = this.f62952d;
        if (pOBRewardedAdListener != null) {
            pOBRewardedAdListener.onAdFailedToShow(this, pOBError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.f62961m = null;
        if (this.f62958j != null) {
            POBAdSize interstitialAdSize = POBUtils.getInterstitialAdSize(this.f62956h.getApplicationContext());
            POBImpression impression = getImpression();
            if (impression != null) {
                impression.setVideo(new POBVideo(POBVideo.Placement.INTERSTITIAL, POBVideo.Plcmt.INTERSTITIAL, POBVideo.Linearity.LINEAR, interstitialAdSize));
                this.f62954f = POBDataType$POBAdState.LOADING;
                a(this.f62958j).requestBid();
                return;
            }
        }
        a(new POBError(1001, "Missing ad request parameters. Please check input parameters."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        POBRewardedAdListener pOBRewardedAdListener = this.f62952d;
        if (pOBRewardedAdListener != null) {
            pOBRewardedAdListener.onAdClicked(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.f62954f = POBDataType$POBAdState.SHOWN;
        POBRewardedAdListener pOBRewardedAdListener = this.f62952d;
        if (pOBRewardedAdListener != null) {
            pOBRewardedAdListener.onAdClosed(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        POBRewardedAdListener pOBRewardedAdListener = this.f62952d;
        if (pOBRewardedAdListener != null) {
            pOBRewardedAdListener.onAdImpression(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        POBRewardedAdListener pOBRewardedAdListener = this.f62952d;
        if (pOBRewardedAdListener != null) {
            pOBRewardedAdListener.onAdOpened(this);
        }
    }

    private void i() {
        Trace.endSection();
        POBRewardedAdListener pOBRewardedAdListener = this.f62952d;
        if (pOBRewardedAdListener != null) {
            pOBRewardedAdListener.onAdReceived(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        POBRewardedAdListener pOBRewardedAdListener = this.f62952d;
        if (pOBRewardedAdListener != null) {
            pOBRewardedAdListener.onAppLeaving(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        POBTimeoutHandler pOBTimeoutHandler = this.f62959k;
        if (pOBTimeoutHandler != null) {
            pOBTimeoutHandler.cancel();
        }
        this.f62959k = null;
    }

    private void l() {
        POBLog.debug("POBRewardedAd", "scheduleDelay until init completed.", new Object[0]);
        POBTimeoutHandler pOBTimeoutHandler = new POBTimeoutHandler(new b());
        this.f62959k = pOBTimeoutHandler;
        pOBTimeoutHandler.start(500L);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void show(@androidx.annotation.Nullable java.util.Map<java.lang.String, java.lang.Object> r4) {
        /*
            r3 = this;
            boolean r0 = r3.isReady()
            if (r0 == 0) goto L35
            if (r4 == 0) goto L35
            java.util.List r0 = r3.getAvailableRewards()
            java.lang.String r1 = "selected_reward"
            java.lang.Object r1 = r4.get(r1)
            boolean r2 = r1 instanceof com.pubmatic.sdk.openwrap.core.POBReward
            if (r2 == 0) goto L33
            com.pubmatic.sdk.openwrap.core.POBReward r1 = (com.pubmatic.sdk.openwrap.core.POBReward) r1
            if (r0 == 0) goto L33
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L33
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L33
            com.pubmatic.sdk.common.POBError r4 = new com.pubmatic.sdk.common.POBError
            r0 = 5001(0x1389, float:7.008E-42)
            java.lang.String r1 = "Can't show ad, selected reward is invalid."
            r4.<init>(r0, r1)
            r3.c(r4)
            return
        L33:
            r3.f62963o = r4
        L35:
            com.pubmatic.sdk.rewardedad.POBRewardedAdEvent r0 = r3.f62950b
            if (r0 == 0) goto L3c
            r0.setCustomData(r4)
        L3c:
            com.pubmatic.sdk.common.POBDataType$POBAdState r4 = r3.f62954f
            com.pubmatic.sdk.common.POBDataType$POBAdState r0 = com.pubmatic.sdk.common.POBDataType$POBAdState.AD_SERVER_READY
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L52
            com.pubmatic.sdk.rewardedad.POBRewardedAdEvent r4 = r3.f62950b
            if (r4 == 0) goto L52
            com.pubmatic.sdk.common.POBDataType$POBAdState r0 = com.pubmatic.sdk.common.POBDataType$POBAdState.SHOWING
            r3.f62954f = r0
            r4.show()
            return
        L52:
            boolean r4 = r3.isReady()
            if (r4 == 0) goto L64
            com.pubmatic.sdk.common.ui.POBRewardedAdRendering r4 = r3.f62953e
            if (r4 == 0) goto L64
            com.pubmatic.sdk.common.POBDataType$POBAdState r0 = com.pubmatic.sdk.common.POBDataType$POBAdState.SHOWING
            r3.f62954f = r0
            r4.show()
            return
        L64:
            int[] r4 = com.pubmatic.sdk.rewardedad.POBRewardedAd.c.f62969a
            com.pubmatic.sdk.common.POBDataType$POBAdState r0 = r3.f62954f
            int r0 = r0.ordinal()
            r4 = r4[r0]
            r0 = 2
            if (r4 == r0) goto L8c
            r0 = 7
            if (r4 == r0) goto L82
            r0 = 8
            if (r4 == r0) goto L8c
            com.pubmatic.sdk.common.POBError r4 = new com.pubmatic.sdk.common.POBError
            r0 = 2002(0x7d2, float:2.805E-42)
            java.lang.String r1 = "Can't show ad. Ad is not ready."
            r4.<init>(r0, r1)
            goto L95
        L82:
            com.pubmatic.sdk.common.POBError r4 = new com.pubmatic.sdk.common.POBError
            r0 = 1011(0x3f3, float:1.417E-42)
            java.lang.String r1 = "Ad has expired."
            r4.<init>(r0, r1)
            goto L95
        L8c:
            com.pubmatic.sdk.common.POBError r4 = new com.pubmatic.sdk.common.POBError
            r0 = 2001(0x7d1, float:2.804E-42)
            java.lang.String r1 = "Ad is already shown."
            r4.<init>(r0, r1)
        L95:
            r3.c(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pubmatic.sdk.rewardedad.POBRewardedAd.show(java.util.Map):void");
    }

    @NonNull
    public static POBRewardedAd getRewardedAd(@NonNull Context context) {
        return new POBRewardedAd(context, new POBDefaultRewardedAdEventHandler());
    }

    private void b(POBError pOBError) {
        Trace.endSection();
        POBLog.error("POBRewardedAd", "Failed to receive ad with error - " + pOBError, new Object[0]);
        POBRewardedAdListener pOBRewardedAdListener = this.f62952d;
        if (pOBRewardedAdListener != null) {
            pOBRewardedAdListener.onAdFailedToLoad(this, pOBError);
        }
    }

    private void c() {
        String simpleName;
        this.f62954f = POBDataType$POBAdState.LOADING;
        POBAdResponse pOBAdResponse = this.f62961m;
        if (pOBAdResponse != null) {
            this.f62961m = new POBAdResponse.Builder(pOBAdResponse).setWinningBid(null).build();
        }
        POBRewardedAdEvent pOBRewardedAdEvent = this.f62950b;
        if (pOBRewardedAdEvent != null) {
            simpleName = pOBRewardedAdEvent.getClass().getSimpleName();
        } else {
            simpleName = "";
        }
        POBLog.info("POBRewardedAd", "Proceeding with bid. Ad server integration is " + simpleName, new Object[0]);
        b((POBBid) null);
    }

    @Nullable
    public static synchronized POBRewardedAd getRewardedAd(@NonNull Context context, @NonNull String str, int i10, @NonNull String str2, @NonNull POBRewardedAdEvent pOBRewardedAdEvent) {
        Exception exc;
        POBRewardedAd pOBRewardedAd = null;
        if (!POBAdsHelper.validate(context, str, str2, pOBRewardedAdEvent)) {
            POBLog.error("POBRewardedAd", "One or more invalid mandatory parameters found. Please verify Publisher id = %s, Profile id = %d, ad unit id = %s, Event handler = %s", str, Integer.valueOf(i10), str2, pOBRewardedAdEvent == null ? null : pOBRewardedAdEvent.getClass().getName());
            return null;
        }
        Map<String, String> adServerConfig = pOBRewardedAdEvent.getAdServerConfig();
        if (adServerConfig != null) {
            try {
                String str3 = adServerConfig.get(POBRewardedAdEvent.KEY_ALLOW_MULTIPLE_INSTANCES_FOR_ADUNIT_ID);
                if (str3 != null ? Boolean.parseBoolean(str3) : false) {
                    pOBRewardedAd = new POBRewardedAd(context, str, i10, str2, pOBRewardedAdEvent);
                } else {
                    String str4 = adServerConfig.get(POBRewardedAdEvent.KEY_IDENTIFER);
                    if (!POBUtils.isNullOrEmpty(str4)) {
                        Map service = POBCacheService.getInstance().getService("RewardedAdCache");
                        POBRewardedAd pOBRewardedAd2 = (POBRewardedAd) service.get(str4);
                        try {
                            if (pOBRewardedAd2 == null) {
                                POBRewardedAd pOBRewardedAd3 = new POBRewardedAd(context, str, i10, str2, pOBRewardedAdEvent);
                                try {
                                    service.put(str4, pOBRewardedAd3);
                                    POBLog.info("POBRewardedAd", "Creating new rewarded ad - %s", Integer.valueOf(pOBRewardedAd3.hashCode()));
                                    pOBRewardedAd = pOBRewardedAd3;
                                } catch (Exception e10) {
                                    exc = e10;
                                    pOBRewardedAd = pOBRewardedAd3;
                                    POBLog.error("POBRewardedAd", "Unable to get rewarded ad instance - " + exc.getMessage(), new Object[0]);
                                }
                            } else {
                                POBLog.info("POBRewardedAd", "Returning existing rewarded ad - %s", Integer.valueOf(pOBRewardedAd2.hashCode()));
                                pOBRewardedAd = pOBRewardedAd2;
                            }
                        } catch (Exception e11) {
                            exc = e11;
                            pOBRewardedAd = pOBRewardedAd2;
                        }
                    } else {
                        POBLog.error("POBRewardedAd", "Invalid handler identifier", new Object[0]);
                    }
                }
            } catch (Exception e12) {
                exc = e12;
            }
        } else {
            POBLog.error("POBRewardedAd", "Missing ad server specific config properties in handler.", new Object[0]);
        }
        return pOBRewardedAd;
    }

    private POBRewardedAd(Context context, POBRewardedAdEvent pOBRewardedAdEvent) {
        this.f62960l = false;
        this.f62966r = POBBiddingHost.UNKNOWN;
        this.f62956h = context;
        this.f62954f = POBDataType$POBAdState.DEFAULT;
        this.f62950b = pOBRewardedAdEvent;
        e eVar = new e(this, null);
        this.f62955g = eVar;
        pOBRewardedAdEvent.setEventListener(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(POBBid pOBBid) {
        if (this.f62950b != null) {
            Trace.endSection();
            this.f62950b.requestAd(pOBBid);
            this.f62950b.getAdInteractionListener();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(POBError pOBError) {
        this.f62954f = POBDataType$POBAdState.DEFAULT;
        b(pOBError);
    }

    private POBBidding a(POBRequest pOBRequest) {
        POBProfileInfo profileInfo;
        if (this.f62949a == null) {
            a aVar = null;
            if (this.f62965q != null) {
                profileInfo = this.f62965q.getProfileInfo(String.valueOf(pOBRequest.getProfileId()));
            } else {
                profileInfo = null;
            }
            this.f62949a = new POBBiddingManager(POBOWPartnerHelper.createPOBManager(this.f62956h.getApplicationContext(), pOBRequest, profileInfo));
            this.f62949a.setBidderListener(new d(this, aVar));
        }
        return this.f62949a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.f62954f != POBDataType$POBAdState.AD_SERVER_READY) {
            this.f62954f = POBDataType$POBAdState.READY;
        }
        i();
    }

    @RequiresPermission("android.permission.INTERNET")
    public void loadAd(@NonNull String str, @NonNull POBBiddingHost pOBBiddingHost) {
        if (pOBBiddingHost == null) {
            a(new POBError(1001, "Bidding host cannot be null"));
        } else {
            this.f62966r = pOBBiddingHost;
            loadAd(str);
        }
    }

    @RequiresPermission("android.permission.INTERNET")
    @Deprecated
    public void loadAd(@NonNull String str) {
        if (!POBUtils.isNullOrEmpty(str)) {
            Trace.beginSection("POB Rewarded Load Ad");
            Trace.beginSection("POB Response Parsing");
            int i10 = c.f62969a[this.f62954f.ordinal()];
            if (i10 == 1) {
                POBLog.debug("POBRewardedAd", "Can't make new request. Ad is loading.", new Object[0]);
                return;
            }
            if (i10 == 2) {
                POBLog.debug("POBRewardedAd", "Can't make new request while Ad is showing", new Object[0]);
                return;
            }
            if (i10 != 3) {
                this.f62954f = POBDataType$POBAdState.LOADING;
                POBBaseBidder pOBBaseBidderA = a(str);
                this.f62949a = pOBBaseBidderA;
                pOBBaseBidderA.requestBid();
                return;
            }
            POBLog.error("POBRewardedAd", "Can't make new request. Please show already loaded ad before requesting a new one.", new Object[0]);
            b();
            return;
        }
        a(new POBError(1007, "Invalid Bid Response."));
    }

    private POBBaseBidder a(String str) {
        POBExtBidHandler pOBExtBidHandler = new POBExtBidHandler(str);
        this.f62949a = pOBExtBidHandler;
        pOBExtBidHandler.setBidderListener(new d(this, null));
        return this.f62949a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.f62954f = POBDataType$POBAdState.EXPIRED;
        POBRewardedAdRendering pOBRewardedAdRendering = this.f62953e;
        if (pOBRewardedAdRendering != null) {
            pOBRewardedAdRendering.destroy();
            this.f62953e = null;
        }
        POBRewardedAdListener pOBRewardedAdListener = this.f62952d;
        if (pOBRewardedAdListener != null) {
            pOBRewardedAdListener.onAdExpired(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(POBReward pOBReward) {
        POBRewardedAdListener pOBRewardedAdListener = this.f62952d;
        if (pOBRewardedAdListener != null) {
            pOBRewardedAdListener.onReceiveReward(this, pOBReward);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public POBRewardedAdRendering a(POBBid pOBBid) {
        if (this.f62962n == null) {
            POBLog.info("POBRewardedAd", "Invalid value for skip alert. SDK will use default skip alert.", new Object[0]);
            this.f62962n = new POBSkipConfirmationInfo(this.f62956h.getString(R$string.openwrap_skip_dialog_title), this.f62956h.getString(R$string.openwrap_skip_dialog_message), this.f62956h.getString(R$string.openwrap_skip_dialog_resume_btn), this.f62956h.getString(R$string.openwrap_skip_dialog_close_btn));
        }
        return POBRewardedUtil.getRewardedRenderer(this.f62956h.getApplicationContext(), pOBBid.getRemainingExpirationTime(), this.f62962n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(POBError pOBError, boolean z10) {
        POBRewardedAdEvent pOBRewardedAdEvent = this.f62950b;
        if (pOBRewardedAdEvent != null && z10) {
            pOBRewardedAdEvent.setCustomData(this.f62963o);
        }
        POBBiddingManager.getWinningBid(this.f62961m);
    }
}
