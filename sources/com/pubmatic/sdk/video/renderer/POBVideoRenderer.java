package com.pubmatic.sdk.video.renderer;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBDataType$POBVideoAdEventType;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.base.POBAdDescriptor;
import com.pubmatic.sdk.common.base.POBAdRendererListener;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.network.POBTrackerHandler;
import com.pubmatic.sdk.common.utility.POBTimeoutHandler;
import com.pubmatic.sdk.common.utility.POBUrlHandler;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.common.viewability.POBVideoMeasurementProvider;
import com.pubmatic.sdk.video.player.POBVastPlayer;
import com.pubmatic.sdk.video.player.POBVastPlayerListener;
import com.pubmatic.sdk.video.vastmodels.POBVastAd;
import com.pubmatic.sdk.video.vastmodels.POBVastCreative;
import com.pubmatic.sdk.webrendering.dsa.POBDsaHtmlContent;
import com.pubmatic.sdk.webrendering.dsa.POBDsaInfoPresenterHelper;
import com.pubmatic.sdk.webrendering.ui.POBOnSkipOptionUpdateListener;
import com.pubmatic.sdk.webrendering.ui.POBViewabilityTracker;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class POBVideoRenderer implements POBVideoRendering, POBVastPlayerListener, POBViewabilityTracker.OnViewabilityChangedListener, POBOnSkipOptionUpdateListener {
    public static final float VIEWABILITY_THRESHOLD_PERCENT_FOR_BANNER = 50.0f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f63149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private POBAdRendererListener f63150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private POBVideoRenderingListener f63151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private POBVideoSkipEventListener f63152d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f63153e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private POBTimeoutHandler f63154f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final POBVastPlayer f63155g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private POBVideoMeasurementProvider f63156h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final POBViewabilityTracker f63157i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final POBTrackerHandler f63158j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private POBAdDescriptor f63159k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private POBUrlHandler f63160l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private POBUrlHandler f63161m;

    class a implements POBTimeoutHandler.POBTimeoutHandlerListener {
        a() {
        }

        @Override // com.pubmatic.sdk.common.utility.POBTimeoutHandler.POBTimeoutHandlerListener
        public void onTimeout() {
            POBVideoRenderer.this.a();
        }
    }

    class b implements POBUrlHandler.UrlHandlerListener {
        b() {
        }

        @Override // com.pubmatic.sdk.common.utility.POBUrlHandler.UrlHandlerListener
        public void onErrorOpenUrl(String str) {
            POBLog.warn("POBVideoRenderer", "Unable to open icon click url :" + str, new Object[0]);
        }

        @Override // com.pubmatic.sdk.common.utility.POBUrlHandler.UrlHandlerListener
        public void onHandleTrackers(String str, List list) {
            POBVideoRenderer.this.f63158j.sendTrackers(list);
        }

        @Override // com.pubmatic.sdk.common.utility.POBUrlHandler.UrlHandlerListener
        public void onInternalBrowserClose(String str) {
            POBVideoRenderer.this.c();
        }

        @Override // com.pubmatic.sdk.common.utility.POBUrlHandler.UrlHandlerListener
        public void onInternalBrowserOpen(String str) {
            POBVideoRenderer.this.b();
        }

        @Override // com.pubmatic.sdk.common.utility.POBUrlHandler.UrlHandlerListener
        public void onLeaveApp(String str) {
            POBVideoRenderer.this.d();
        }
    }

    class c implements POBDsaHtmlContent.OnContentListener {
        c() {
        }

        @Override // com.pubmatic.sdk.webrendering.dsa.POBDsaHtmlContent.OnContentListener
        public void onPageContentReceived(String str) {
            POBDsaInfoPresenterHelper.show(POBVideoRenderer.this.f63155g.getContext(), POBVideoRenderer.this.f63159k, str);
        }
    }

    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f63165a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f63166b;

        d(float f10, float f11) {
            this.f63165a = f10;
            this.f63166b = f11;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (POBVideoRenderer.this.f63156h != null) {
                POBVideoRenderer.this.f63156h.setTrackView(POBVideoRenderer.this.f63155g);
                POBVideoRenderer.this.f63156h.impressionOccurred();
                POBVideoRenderer.this.f63156h.start(this.f63165a, this.f63166b);
                POBVideoRenderer.this.f63156h.signalPlayerStateChange("inline".equals(POBVideoRenderer.this.f63149a) ? POBVideoMeasurementProvider.POBVideoPlayerState.NORMAL : POBVideoMeasurementProvider.POBVideoPlayerState.FULLSCREEN);
            }
        }
    }

    class e implements POBUrlHandler.UrlHandlerListener {
        e() {
        }

        @Override // com.pubmatic.sdk.common.utility.POBUrlHandler.UrlHandlerListener
        public void onErrorOpenUrl(String str) {
            POBLog.warn("POBVideoRenderer", "Unable to open " + str, new Object[0]);
        }

        @Override // com.pubmatic.sdk.common.utility.POBUrlHandler.UrlHandlerListener
        public void onHandleTrackers(String str, List list) {
            POBVideoRenderer.this.f63158j.sendTrackers(list);
        }

        @Override // com.pubmatic.sdk.common.utility.POBUrlHandler.UrlHandlerListener
        public void onInternalBrowserClose(String str) {
            POBVideoRenderer.this.c();
        }

        @Override // com.pubmatic.sdk.common.utility.POBUrlHandler.UrlHandlerListener
        public void onInternalBrowserOpen(String str) {
            POBVideoRenderer.this.b();
        }

        @Override // com.pubmatic.sdk.common.utility.POBUrlHandler.UrlHandlerListener
        public void onLeaveApp(String str) {
            POBVideoRenderer.this.d();
        }
    }

    class f implements POBVideoMeasurementProvider.POBOmidSessionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f63169a;

        f(float f10) {
            this.f63169a = f10;
        }

        @Override // com.pubmatic.sdk.common.viewability.POBVideoMeasurementProvider.POBOmidSessionListener
        public void onOmidSessionInitialized() {
            if (POBVideoRenderer.this.f63156h != null) {
                POBVideoRenderer.this.f63156h.loaded(POBVideoRenderer.this.f63155g.getVastPlayerConfig().getSkip() == 1 && POBVideoRenderer.this.f63155g.getSkipabilityEnabled(), this.f63169a);
            }
        }
    }

    static /* synthetic */ class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f63171a;

        static {
            int[] iArr = new int[POBVastCreative.POBEventTypes.values().length];
            f63171a = iArr;
            try {
                iArr[POBVastCreative.POBEventTypes.FIRST_QUARTILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f63171a[POBVastCreative.POBEventTypes.MID_POINT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f63171a[POBVastCreative.POBEventTypes.THIRD_QUARTILE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f63171a[POBVastCreative.POBEventTypes.COMPLETE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f63171a[POBVastCreative.POBEventTypes.UNMUTE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f63171a[POBVastCreative.POBEventTypes.MUTE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f63171a[POBVastCreative.POBEventTypes.SKIP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f63171a[POBVastCreative.POBEventTypes.RESUME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f63171a[POBVastCreative.POBEventTypes.PAUSE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public POBVideoRenderer(@NonNull POBVastPlayer pOBVastPlayer, @NonNull POBViewabilityTracker pOBViewabilityTracker, @NonNull String str, @NonNull POBTrackerHandler pOBTrackerHandler) {
        this.f63155g = pOBVastPlayer;
        this.f63149a = str;
        this.f63158j = pOBTrackerHandler;
        pOBVastPlayer.setVastPlayerListener(this);
        pOBVastPlayer.setOnSkipOptionUpdateListener(this);
        this.f63157i = pOBViewabilityTracker;
        pOBViewabilityTracker.setOnExposureChangeWithThresholdListener(this);
    }

    private int a(int i10, int i11) {
        int i12 = i11 - i10;
        if (i12 <= 0) {
            return 0;
        }
        return i12;
    }

    private void j() {
        POBTimeoutHandler pOBTimeoutHandler = this.f63154f;
        if (pOBTimeoutHandler != null) {
            pOBTimeoutHandler.cancel();
            this.f63154f = null;
        }
    }

    @Override // com.pubmatic.sdk.video.renderer.POBVideoRendering, com.pubmatic.sdk.common.ui.POBBannerRendering
    public void destroy() {
        j();
        this.f63155g.destroy();
        this.f63157i.setOnExposureChangeWithThresholdListener(null);
        this.f63157i.destroy();
        POBVideoMeasurementProvider pOBVideoMeasurementProvider = this.f63156h;
        if (pOBVideoMeasurementProvider != null) {
            pOBVideoMeasurementProvider.finishAdSession();
            this.f63156h = null;
        }
        this.f63161m = null;
    }

    @Override // com.pubmatic.sdk.video.renderer.POBVideoRendering, com.pubmatic.sdk.common.ui.POBBannerRendering
    public void invalidateExpiration() {
        j();
    }

    @Override // com.pubmatic.sdk.video.player.POBVastPlayerListener
    public void onClose() {
        POBAdRendererListener pOBAdRendererListener;
        if (this.f63151c == null || (pOBAdRendererListener = this.f63150b) == null) {
            return;
        }
        pOBAdRendererListener.onAdInteractionStopped();
    }

    @Override // com.pubmatic.sdk.video.player.POBVastPlayerListener
    public void onDsaInfoIconClick() {
        POBDsaHtmlContent.getHtmlContent(this.f63155g.getContext(), new c());
    }

    @Override // com.pubmatic.sdk.video.player.POBVastPlayerListener
    public void onEndCardWillLeaveApp() {
        d();
    }

    @Override // com.pubmatic.sdk.video.player.POBVastPlayerListener
    public void onFailedToPlay(@NonNull POBError pOBError) {
        j();
        POBAdRendererListener pOBAdRendererListener = this.f63150b;
        if (pOBAdRendererListener != null) {
            pOBAdRendererListener.onAdRenderingFailed(pOBError);
        }
        if (this.f63156h == null || pOBError.getErrorMessage() == null) {
            return;
        }
        this.f63156h.signalError(POBVideoMeasurementProvider.POBVideoAdErrorType.VIDEO, pOBError.getErrorMessage());
    }

    @Override // com.pubmatic.sdk.video.player.POBVastPlayerListener
    public void onIndustryIconClick(@Nullable String str) {
        if (POBUtils.isNullOrEmpty(str)) {
            POBLog.warn("POBVideoRenderer", "Icon clickThrough url is missing.", new Object[0]);
        } else {
            if (this.f63161m == null) {
                this.f63161m = new POBUrlHandler(this.f63155g.getContext().getApplicationContext(), new b());
            }
            this.f63161m.open(str);
        }
        POBVideoMeasurementProvider pOBVideoMeasurementProvider = this.f63156h;
        if (pOBVideoMeasurementProvider != null) {
            pOBVideoMeasurementProvider.signalAdEvent(POBDataType$POBVideoAdEventType.ICON_CLICKED);
        }
    }

    @Override // com.pubmatic.sdk.video.player.POBVastPlayerListener
    public void onOpenLandingPage(@Nullable String str) {
        a(str);
        h();
    }

    @Override // com.pubmatic.sdk.video.player.POBVastPlayerListener
    public void onPlaybackCompleted(float f10) {
        POBAdDescriptor pOBAdDescriptor;
        if (this.f63150b != null && (pOBAdDescriptor = this.f63159k) != null) {
            this.f63150b.onAdReadyToRefresh(a((int) f10, pOBAdDescriptor.getRefreshInterval()));
        }
        POBVideoRenderingListener pOBVideoRenderingListener = this.f63151c;
        if (pOBVideoRenderingListener != null) {
            pOBVideoRenderingListener.notifyAdEvent(POBDataType$POBVideoAdEventType.COMPLETE);
        }
    }

    @Override // com.pubmatic.sdk.video.player.POBVastPlayerListener
    public void onReadyToPlay(@Nullable POBVastAd pOBVastAd, float f10) {
        Context context = this.f63155g.getContext();
        if (context != null) {
            a(context);
        }
        a(pOBVastAd, f10);
        POBAdRendererListener pOBAdRendererListener = this.f63150b;
        if (pOBAdRendererListener != null) {
            pOBAdRendererListener.onAdRender(this.f63155g, null);
        }
    }

    @Override // com.pubmatic.sdk.video.player.POBVastPlayerListener
    public void onSkip() {
        POBVideoSkipEventListener pOBVideoSkipEventListener;
        if (this.f63151c == null || (pOBVideoSkipEventListener = this.f63152d) == null) {
            return;
        }
        pOBVideoSkipEventListener.onAdAboutToSkip();
    }

    @Override // com.pubmatic.sdk.webrendering.ui.POBOnSkipOptionUpdateListener
    public void onSkipOptionUpdate(boolean z10) {
        if (this.f63151c == null || !this.f63155g.getVastPlayerConfig().isBackButtonEnabled()) {
            return;
        }
        this.f63151c.onSkipOptionUpdate(z10);
    }

    @Override // com.pubmatic.sdk.video.player.POBVastPlayerListener
    public void onVideoEventOccurred(@NonNull POBVastCreative.POBEventTypes pOBEventTypes) {
        if (this.f63156h != null) {
            switch (g.f63171a[pOBEventTypes.ordinal()]) {
                case 1:
                    this.f63156h.signalAdEvent(POBDataType$POBVideoAdEventType.FIRST_QUARTILE);
                    break;
                case 2:
                    this.f63156h.signalAdEvent(POBDataType$POBVideoAdEventType.MID_POINT);
                    break;
                case 3:
                    this.f63156h.signalAdEvent(POBDataType$POBVideoAdEventType.THIRD_QUARTILE);
                    break;
                case 4:
                    this.f63156h.signalAdEvent(POBDataType$POBVideoAdEventType.COMPLETE);
                    break;
                case 5:
                    this.f63156h.signalAdEvent(POBDataType$POBVideoAdEventType.UNMUTE);
                    break;
                case 6:
                    this.f63156h.signalAdEvent(POBDataType$POBVideoAdEventType.MUTE);
                    break;
                case 7:
                    this.f63156h.signalAdEvent(POBDataType$POBVideoAdEventType.SKIPPED);
                    break;
                case 8:
                    this.f63156h.signalAdEvent(POBDataType$POBVideoAdEventType.RESUME);
                    break;
                case 9:
                    this.f63156h.signalAdEvent(POBDataType$POBVideoAdEventType.PAUSE);
                    break;
            }
        }
    }

    @Override // com.pubmatic.sdk.video.player.POBVastPlayerListener
    public void onVideoStarted(float f10, float f11) {
        if (this.f63156h != null) {
            this.f63155g.postDelayed(new d(f10, f11), 1000L);
        }
        POBAdRendererListener pOBAdRendererListener = this.f63150b;
        if (pOBAdRendererListener != null) {
            pOBAdRendererListener.onAdImpression();
        }
    }

    @Override // com.pubmatic.sdk.webrendering.ui.POBViewabilityTracker.OnViewabilityChangedListener
    public void onViewabilityChanged(boolean z10) {
        if (z10) {
            g();
        } else {
            f();
        }
    }

    @Override // com.pubmatic.sdk.video.renderer.POBVideoRendering
    public void proceedAdSkip(boolean z10) {
        POBAdRendererListener pOBAdRendererListener = this.f63150b;
        if (pOBAdRendererListener != null) {
            if (z10) {
                pOBAdRendererListener.onAdInteractionStopped();
            } else {
                this.f63155g.play();
            }
        }
    }

    @Override // com.pubmatic.sdk.video.renderer.POBVideoRendering, com.pubmatic.sdk.common.ui.POBBannerRendering
    public void renderAd(@NonNull POBAdDescriptor pOBAdDescriptor) {
        i();
        this.f63159k = pOBAdDescriptor;
        String renderableContent = pOBAdDescriptor.getRenderableContent();
        if (renderableContent != null) {
            this.f63155g.load(renderableContent);
            return;
        }
        POBAdRendererListener pOBAdRendererListener = this.f63150b;
        if (pOBAdRendererListener != null) {
            pOBAdRendererListener.onAdRenderingFailed(new POBError(1009, "Rendering failed for descriptor: " + pOBAdDescriptor));
        }
    }

    @Override // com.pubmatic.sdk.video.renderer.POBVideoRendering, com.pubmatic.sdk.common.ui.POBBannerRendering
    public void setAdRendererListener(@Nullable POBAdRendererListener pOBAdRendererListener) {
        this.f63150b = pOBAdRendererListener;
        if (pOBAdRendererListener instanceof POBVideoRenderingListener) {
            setVideoRenderingListener((POBVideoRenderingListener) pOBAdRendererListener);
        }
    }

    public void setExpirationTimeout(long j10) {
        this.f63153e = j10;
    }

    public void setMeasurementProvider(@Nullable POBVideoMeasurementProvider pOBVideoMeasurementProvider) {
        this.f63156h = pOBVideoMeasurementProvider;
    }

    @Override // com.pubmatic.sdk.video.renderer.POBVideoRendering
    public void setVideoRenderingListener(@Nullable POBVideoRenderingListener pOBVideoRenderingListener) {
        this.f63151c = pOBVideoRenderingListener;
    }

    @Override // com.pubmatic.sdk.video.renderer.POBVideoRendering
    public void setVideoSkipEventListener(@Nullable POBVideoSkipEventListener pOBVideoSkipEventListener) {
        this.f63152d = pOBVideoSkipEventListener;
    }

    @Override // com.pubmatic.sdk.video.renderer.POBVideoRendering, com.pubmatic.sdk.common.ui.POBBannerRendering
    public void setWatermark(@Nullable String str) {
        this.f63155g.setWatermark(str);
    }

    @Override // com.pubmatic.sdk.video.player.POBVastPlayerListener
    public void shouldForwardClickEvent() {
        h();
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        POBAdRendererListener pOBAdRendererListener = this.f63150b;
        if (pOBAdRendererListener != null) {
            pOBAdRendererListener.onAdInteractionStarted();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        POBAdRendererListener pOBAdRendererListener = this.f63150b;
        if (pOBAdRendererListener != null) {
            pOBAdRendererListener.onAdInteractionStopped();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        POBAdRendererListener pOBAdRendererListener = this.f63150b;
        if (pOBAdRendererListener != null) {
            pOBAdRendererListener.onLeavingApplication();
        }
    }

    private void e() {
        POBAdRendererListener pOBAdRendererListener = this.f63150b;
        if (pOBAdRendererListener != null) {
            pOBAdRendererListener.onRenderAdClick();
        }
    }

    private void f() {
        this.f63155g.setAutoPlayOnForeground(false);
        this.f63155g.pause();
    }

    private void g() {
        this.f63155g.setAutoPlayOnForeground(true);
        this.f63155g.play();
    }

    private void h() {
        POBVideoMeasurementProvider pOBVideoMeasurementProvider = this.f63156h;
        if (pOBVideoMeasurementProvider != null) {
            pOBVideoMeasurementProvider.signalAdEvent(POBDataType$POBVideoAdEventType.CLICKED);
        }
    }

    private void i() {
        if (this.f63153e > 0) {
            POBTimeoutHandler pOBTimeoutHandler = new POBTimeoutHandler(new a());
            this.f63154f = pOBTimeoutHandler;
            pOBTimeoutHandler.start(this.f63153e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        POBAdRendererListener pOBAdRendererListener = this.f63150b;
        if (pOBAdRendererListener != null) {
            pOBAdRendererListener.onAdExpired();
        }
    }

    private void a(String str) {
        if (POBUtils.isNullOrEmpty(str)) {
            POBLog.warn("POBVideoRenderer", "Video clickThrough url is missing.", new Object[0]);
        } else {
            POBLog.debug("POBVideoRenderer", "Opening landing page with url: %s", str);
            POBUrlHandler pOBUrlHandler = this.f63160l;
            if (pOBUrlHandler != null) {
                pOBUrlHandler.open(str);
            }
        }
        e();
    }

    private void a(Context context) {
        this.f63160l = new POBUrlHandler(context, new e());
    }

    private void a(POBVastAd pOBVastAd, float f10) {
        if (this.f63156h == null || pOBVastAd == null) {
            return;
        }
        a(pOBVastAd.getCombinedVerificationList(), f10);
    }

    private void a(List list, float f10) {
        POBVideoMeasurementProvider pOBVideoMeasurementProvider = this.f63156h;
        if (pOBVideoMeasurementProvider != null) {
            pOBVideoMeasurementProvider.startAdSession(this.f63155g, list, new f(f10));
            POBLog.debug("POBVideoRenderer", "Video viewability measurement provider initialised", new Object[0]);
        } else {
            POBLog.debug("POBVideoRenderer", "Video viewability measurement provider not initialised", new Object[0]);
        }
    }
}
