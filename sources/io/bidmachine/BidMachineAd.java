package io.bidmachine;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.bidmachine.AdListener;
import io.bidmachine.AdRequest;
import io.bidmachine.BidMachineAd;
import io.bidmachine.IAd;
import java.util.concurrent.atomic.AtomicBoolean;
import od.d;
import zb.a;
import zb.b;

/* JADX INFO: loaded from: classes12.dex */
public abstract class BidMachineAd<SelfType extends IAd, AdRequestType extends AdRequest<AdRequestType, ?, UnifiedAdRequestParamsType>, AdObjectType extends zb.a, AdObjectParamsType extends zb.b, UnifiedAdRequestParamsType extends od.d, AdListenerType extends AdListener<SelfType>> implements IAd<SelfType, AdRequestType> {

    @Nullable
    @VisibleForTesting
    AdRequestType adRequest;

    @NonNull
    private final AdsType adsType;

    @NonNull
    private final ContextProvider contextProvider;

    @Nullable
    private AdListenerType listener;

    @Nullable
    protected RendererConfiguration rendererConfiguration;
    private final ae.k tag = new ae.k("BidMachineAd");

    @NonNull
    private d currentState = d.Idle;
    private final AdRequest.AdRequestListener<AdRequestType> adRequestListener = new a();
    private final AdRequest.e internalAdRequestListener = new b();

    @VisibleForTesting
    final AdProcessCallback adProcessCallback = new c();

    @NonNull
    @VisibleForTesting
    final BidMachineTrackingObject trackingObject = new BidMachineTrackingObject();

    @NonNull
    protected final AtomicBoolean isFinishTracked = new AtomicBoolean(false);

    @NonNull
    protected final AtomicBoolean isCloseTracked = new AtomicBoolean(false);

    class a implements AdRequest.AdRequestListener {
        a() {
        }

        @Override // io.bidmachine.AdRequest.AdRequestListener
        public void onRequestExpired(AdRequest adRequest) {
            BidMachineAd bidMachineAd = BidMachineAd.this;
            if (adRequest == bidMachineAd.adRequest) {
                bidMachineAd.adProcessCallback.processExpired();
            }
        }

        @Override // io.bidmachine.AdRequest.AdRequestListener
        public void onRequestFailed(AdRequest adRequest, ae.a aVar) {
            BidMachineAd bidMachineAd = BidMachineAd.this;
            if (adRequest == bidMachineAd.adRequest) {
                bidMachineAd.processRequestFail(aVar);
            }
        }

        @Override // io.bidmachine.AdRequest.AdRequestListener
        public void onRequestSuccess(AdRequest adRequest, zb.c cVar) {
            BidMachineAd bidMachineAd = BidMachineAd.this;
            if (adRequest == bidMachineAd.adRequest) {
                bidMachineAd.processRequestSuccess(adRequest);
            }
        }
    }

    class b implements AdRequest.e {
        b() {
        }

        @Override // io.bidmachine.AdRequest.e
        public void a(AdRequest adRequest) {
            BidMachineAd bidMachineAd = BidMachineAd.this;
            if (adRequest == bidMachineAd.adRequest) {
                bidMachineAd.destroy();
            }
        }
    }

    class c extends x5 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private AdCridThreadHandler f79119a;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (BidMachineAd.this.listener != null) {
                    BidMachineAd.this.log("notify AdLoaded");
                    BidMachineAd.this.listener.onAdLoaded(BidMachineAd.this);
                }
            }
        }

        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (BidMachineAd.this.listener != null) {
                    BidMachineAd.this.log("notify AdImpression");
                    BidMachineAd.this.listener.onAdImpression(BidMachineAd.this);
                }
            }
        }

        /* JADX INFO: renamed from: io.bidmachine.BidMachineAd$c$c, reason: collision with other inner class name */
        class RunnableC0932c implements Runnable {
            RunnableC0932c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (BidMachineAd.this.listener != null) {
                    BidMachineAd.this.log("notify AdClicked");
                    BidMachineAd.this.listener.onAdClicked(BidMachineAd.this);
                }
            }
        }

        class d implements Runnable {
            d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (BidMachineAd.this.listener instanceof AdRewardedListener) {
                    BidMachineAd.this.log("notify AdRewarded");
                    ((AdRewardedListener) BidMachineAd.this.listener).onAdRewarded(BidMachineAd.this);
                }
            }
        }

        class e implements Runnable {
            e() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (BidMachineAd.this.listener != null) {
                    BidMachineAd.this.log("notify AdExpired");
                    BidMachineAd.this.listener.onAdExpired(BidMachineAd.this);
                }
            }
        }

        c() {
        }

        public static /* synthetic */ void a(c cVar) {
            if (BidMachineAd.this.listener instanceof AdFullScreenListener) {
                BidMachineAd.this.log("notify AdClosed");
                AdFullScreenListener adFullScreenListener = (AdFullScreenListener) BidMachineAd.this.listener;
                BidMachineAd bidMachineAd = BidMachineAd.this;
                adFullScreenListener.onAdClosed(bidMachineAd, bidMachineAd.isFinishTracked.get());
            }
            if (BidMachineAd.this.isDuplicateShowDisabled()) {
                BidMachineAd.this.log("duplicate showing is disabled, starting destroy internally");
                BidMachineAd.this.destroy();
            }
        }

        public static /* synthetic */ void b(c cVar, ae.a aVar) {
            if (BidMachineAd.this.listener != null) {
                BidMachineAd.this.log("notify AdShowFailed");
                BidMachineAd.this.listener.onAdShowFailed(BidMachineAd.this, aVar);
            }
        }

        public static /* synthetic */ void c(c cVar, u uVar) {
            io.bidmachine.core.h.F(cVar.f79119a, new s1());
            if (uVar.f81966w) {
                cVar.f79119a = new AdCridThreadHandler(uVar.D().getCreativeId());
            }
        }

        public static /* synthetic */ void d(c cVar, ae.a aVar) {
            if (BidMachineAd.this.listener != null) {
                BidMachineAd.this.log("notify AdLoadFailed");
                BidMachineAd.this.listener.onAdLoadFailed(BidMachineAd.this, aVar);
            }
        }

        @Override // io.bidmachine.AdProcessCallback
        public void processClicked() {
            if (BidMachineAd.this.currentState.ordinal() > d.Success.ordinal()) {
                return;
            }
            BidMachineAd.this.log("processClicked");
            io.bidmachine.core.h.U(new RunnableC0932c());
        }

        @Override // io.bidmachine.AdProcessCallback
        public void processClosed() {
            if (BidMachineAd.this.currentState.ordinal() <= d.Success.ordinal() && BidMachineAd.this.isCloseTracked.compareAndSet(false, true)) {
                BidMachineAd.this.log("processClosed (" + BidMachineAd.this.isFinishTracked.get() + ")");
                io.bidmachine.core.h.U(new Runnable() { // from class: io.bidmachine.r1
                    @Override // java.lang.Runnable
                    public final void run() {
                        BidMachineAd.c.a(this.f81901b);
                    }
                });
            }
        }

        @Override // io.bidmachine.AdProcessCallback
        public void processDestroy() {
            BidMachineAd.this.log("destroy requested");
            BidMachineAd.this.currentState = d.Destroyed;
            u adResponse = BidMachineAd.this.getAdResponse();
            if (adResponse != null) {
                adResponse.R(this);
            }
            BidMachineAd.this.destroyAdRequest();
            io.bidmachine.core.h.F(this.f79119a, new s1());
            this.f79119a = null;
        }

        @Override // io.bidmachine.AdProcessCallback
        public void processExpired() {
            if (BidMachineAd.this.currentState.ordinal() > d.Success.ordinal()) {
                return;
            }
            BidMachineAd.this.log("processExpired");
            BidMachineAd.this.currentState = d.Expired;
            io.bidmachine.core.h.U(new e());
            io.bidmachine.core.h.F(this.f79119a, new s1());
            this.f79119a = null;
        }

        @Override // io.bidmachine.AdProcessCallback
        public void processFillAd() {
            if (BidMachineAd.this.currentState.ordinal() > d.Success.ordinal()) {
                return;
            }
            BidMachineAd.this.log("processFillAd");
        }

        @Override // io.bidmachine.AdProcessCallback
        public void processFinished() {
            if (BidMachineAd.this.currentState.ordinal() <= d.Success.ordinal() && BidMachineAd.this.isFinishTracked.compareAndSet(false, true)) {
                BidMachineAd.this.log("processFinished");
                io.bidmachine.core.h.U(new d());
            }
        }

        @Override // io.bidmachine.AdProcessCallback
        public void processLoadFail(final ae.a aVar) {
            BidMachineAd.this.log("processLoadFail - " + aVar);
            BidMachineAd.this.currentState = d.Failed;
            io.bidmachine.core.h.U(new Runnable() { // from class: io.bidmachine.t1
                @Override // java.lang.Runnable
                public final void run() {
                    BidMachineAd.c.d(this.f81937b, aVar);
                }
            });
        }

        @Override // io.bidmachine.AdProcessCallback
        public void processLoadSuccess() {
            if (BidMachineAd.this.currentState.ordinal() > d.Loading.ordinal()) {
                return;
            }
            BidMachineAd.this.log("processLoadSuccess");
            BidMachineAd.this.currentState = d.Success;
            io.bidmachine.core.h.U(new a());
            io.bidmachine.core.h.F(BidMachineAd.this.getAdResponse(), new Executable() { // from class: io.bidmachine.u1
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    BidMachineAd.c.c(this.f81985a, (u) obj);
                }
            });
        }

        @Override // io.bidmachine.AdProcessCallback
        public void processShowFail(final ae.a aVar) {
            BidMachineAd.this.log("processShowFail - " + aVar);
            io.bidmachine.core.h.U(new Runnable() { // from class: io.bidmachine.v1
                @Override // java.lang.Runnable
                public final void run() {
                    BidMachineAd.c.b(this.f81994b, aVar);
                }
            });
        }

        @Override // io.bidmachine.AdProcessCallback
        public void processShown() {
            if (BidMachineAd.this.currentState.ordinal() > d.Success.ordinal()) {
                return;
            }
            BidMachineAd.this.log("processShown");
            io.bidmachine.core.h.U(new b());
        }

        @Override // io.bidmachine.AdProcessCallback
        public void processVisibilityTrackerImpression() {
            if (BidMachineAd.this.currentState.ordinal() > d.Success.ordinal()) {
                return;
            }
            BidMachineAd.this.log("processImpression");
        }
    }

    enum d {
        Idle,
        Requesting,
        Loading,
        Success,
        Failed,
        Destroyed,
        Expired
    }

    public BidMachineAd(@NonNull Context context, @NonNull AdsType adsType) {
        this.contextProvider = new SimpleContextProvider(context);
        this.adsType = adsType;
    }

    public static /* synthetic */ String a(BidMachineAd bidMachineAd, String str) {
        StringBuilder sb2 = new StringBuilder(bidMachineAd.adsType.name());
        zb.c auctionResult = bidMachineAd.getAuctionResult();
        if (auctionResult != null) {
            sb2.append(" (");
            sb2.append(auctionResult.getNetworkKey());
            sb2.append(")");
        }
        return String.format("%s - %s", sb2, str);
    }

    private void attachRequest(@Nullable AdRequestType adrequesttype) {
        if (adrequesttype != null) {
            adrequesttype.addListener(this.adRequestListener);
            adrequesttype.addInternalListener(this.internalAdRequestListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroyAdRequest() {
        AdRequestType adrequesttype = this.adRequest;
        this.adRequest = null;
        if (adrequesttype != null) {
            detachRequest(adrequesttype);
            adrequesttype.destroy();
        }
    }

    private void detachRequest(@Nullable AdRequestType adrequesttype) {
        if (adrequesttype != null) {
            adrequesttype.removeListener(this.adRequestListener);
            adrequesttype.removeInternalListener(this.internalAdRequestListener);
        }
    }

    private boolean isNetworkAvailableDuringShow() {
        return l2.a() || io.bidmachine.core.h.J(getContext());
    }

    private void processRequest(@NonNull AdRequestType adrequesttype) {
        log("process request start");
        if (getAuctionResult() != null) {
            processRequestSuccess(adrequesttype);
        } else {
            this.currentState = d.Requesting;
            adrequesttype.request(getContext());
        }
    }

    private void trackEvent(@NonNull TrackEventType trackEventType, @Nullable ae.a aVar) {
        this.trackingObject.eventFinish(trackEventType, getAdsType(), getAdResponse(), aVar);
    }

    @Override // io.bidmachine.IAd
    public boolean canShow() {
        return isLoaded() && isCanShowAd() && isNetworkAvailableDuringShow();
    }

    protected abstract AdObjectType createAdObject(@NonNull ContextProvider contextProvider, @NonNull AdRequestType adrequesttype, @NonNull NetworkAdapter networkAdapter, @NonNull zb.b bVar, @NonNull AdProcessCallback adProcessCallback);

    @Override // io.bidmachine.IAd
    public void destroy() {
        this.adProcessCallback.processDestroy();
        this.trackingObject.clear();
    }

    @Nullable
    protected final u getAdResponse() {
        AdRequestType adrequesttype = this.adRequest;
        if (adrequesttype != null) {
            return adrequesttype.getAdResponse();
        }
        return null;
    }

    @NonNull
    AdsType getAdsType() {
        return this.adsType;
    }

    @Override // io.bidmachine.IAd
    @Nullable
    public zb.c getAuctionResult() {
        AdRequestType adrequesttype = this.adRequest;
        if (adrequesttype != null) {
            return adrequesttype.getAuctionResult();
        }
        return null;
    }

    @NonNull
    Context getContext() {
        return this.contextProvider.getApplicationContext();
    }

    @NonNull
    ContextProvider getContextProvider() {
        return this.contextProvider;
    }

    @Nullable
    protected final AdObjectType getLoadedAdObject() {
        u adResponse = getAdResponse();
        if (adResponse == null) {
            return null;
        }
        try {
            return (AdObjectType) adResponse.A();
        } catch (Throwable unused) {
            return null;
        }
    }

    boolean isCanShowAd() {
        u adResponse = getAdResponse();
        return (adResponse == null || adResponse.X()) ? false : true;
    }

    @Override // io.bidmachine.IAd
    public boolean isDestroyed() {
        return this.currentState == d.Destroyed;
    }

    public abstract boolean isDuplicateShowDisabled();

    @Override // io.bidmachine.IAd
    public boolean isExpired() {
        return this.currentState == d.Expired;
    }

    @Override // io.bidmachine.IAd
    public boolean isLoaded() {
        return getLoadedAdObject() != null && this.currentState == d.Success;
    }

    @Override // io.bidmachine.IAd
    public boolean isLoading() {
        d dVar = this.currentState;
        return dVar == d.Requesting || dVar == d.Loading;
    }

    @Override // io.bidmachine.IAd
    @NonNull
    public SelfType load(AdRequestType adrequesttype) {
        log("load requested");
        this.trackingObject.eventStart(TrackEventType.Load);
        if (!j2.e().C()) {
            processRequestFail(ae.a.i("BidMachine not initialized"));
            return this;
        }
        if (this.currentState != d.Idle) {
            log("request process abort because it's already processing");
            return this;
        }
        if (adrequesttype == null) {
            processRequestFail(ae.a.k("AdRequest"));
            return this;
        }
        detachRequest(this.adRequest);
        this.adRequest = adrequesttype;
        attachRequest(adrequesttype);
        processRequest(adrequesttype);
        return this;
    }

    protected final void log(@NonNull final String str) {
        io.bidmachine.core.a.b(this.tag, new ce.b() { // from class: io.bidmachine.q1
            @Override // ce.b
            public final Object get() {
                return BidMachineAd.a(this.f81894a, str);
            }
        });
    }

    @Nullable
    protected AdObjectType prepareShow() {
        return (AdObjectType) prepareShow(isDuplicateShowDisabled());
    }

    void processPrepareShow() {
        trackEvent(TrackEventType.ImpressionOpportunity, null);
    }

    @VisibleForTesting
    void processRequestFail(@NonNull ae.a aVar) {
        if (this.currentState.ordinal() > d.Loading.ordinal()) {
            return;
        }
        trackEvent(TrackEventType.Load, aVar);
        this.adProcessCallback.processLoadFail(aVar);
    }

    @VisibleForTesting
    void processRequestSuccess(@NonNull AdRequestType adrequesttype) {
        int iOrdinal = this.currentState.ordinal();
        d dVar = d.Loading;
        if (iOrdinal > dVar.ordinal()) {
            return;
        }
        this.currentState = dVar;
        u adResponse = adrequesttype.getAdResponse();
        this.trackingObject.setAdResponse(adResponse);
        if (adResponse == null) {
            processRequestFail(ae.a.h("AdResponse is null"));
        } else {
            log("start loading");
            adResponse.M(this.contextProvider, adrequesttype, this, this.adProcessCallback);
        }
    }

    void processShowFail(@NonNull ae.a aVar) {
        trackEvent(TrackEventType.Show, aVar);
        this.adProcessCallback.processShowFail(aVar);
    }

    @NonNull
    public SelfType setListener(@Nullable AdListenerType adlistenertype) {
        this.listener = adlistenertype;
        return this;
    }

    @Override // io.bidmachine.IAd
    @NonNull
    public SelfType setRendererConfiguration(@Nullable RendererConfiguration rendererConfiguration) {
        this.rendererConfiguration = rendererConfiguration;
        return this;
    }

    @NonNull
    public String toString() {
        return this.tag + ", state - " + this.currentState + ", auctionResult - " + getAuctionResult();
    }

    @Nullable
    private AdObjectType prepareShow(boolean z10) {
        processPrepareShow();
        if (!isNetworkAvailableDuringShow()) {
            processShowFail(ae.a.f4235e);
            return null;
        }
        if (isDestroyed()) {
            processShowFail(ae.a.f4245o);
            return null;
        }
        if (isExpired()) {
            processShowFail(ae.a.f4244n);
            return null;
        }
        if (!isLoaded()) {
            processShowFail(ae.a.i("Ad not loaded"));
            return null;
        }
        if (!z10 || isCanShowAd()) {
            return (AdObjectType) getLoadedAdObject();
        }
        processShowFail(ae.a.f4242l);
        return null;
    }
}
