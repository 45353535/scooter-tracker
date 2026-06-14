package com.pubmatic.sdk.openwrap.core.interstitial;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBDataType$POBVideoAdEventType;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.POBInstanceProvider;
import com.pubmatic.sdk.common.base.POBAdDescriptor;
import com.pubmatic.sdk.common.base.POBAdRendererListener;
import com.pubmatic.sdk.common.cache.POBAdViewCacheService;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayHandler;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.network.POBTrackerHandler;
import com.pubmatic.sdk.common.ui.POBBannerRendering;
import com.pubmatic.sdk.common.ui.POBFullScreenActivityListener;
import com.pubmatic.sdk.common.ui.POBInterstitialRendererListener;
import com.pubmatic.sdk.common.ui.POBInterstitialRendering;
import com.pubmatic.sdk.common.ui.POBVideoAdEventListener;
import com.pubmatic.sdk.common.utility.POBDeepLinkUtil;
import com.pubmatic.sdk.common.utility.POBTimeoutHandler;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.common.viewability.POBObstructionUpdateListener;
import com.pubmatic.sdk.video.player.POBVastPlayer;
import com.pubmatic.sdk.video.renderer.POBVideoRenderingListener;
import com.pubmatic.sdk.webrendering.POBUIUtil;
import com.pubmatic.sdk.webrendering.dsa.POBDsaHtmlContent;
import com.pubmatic.sdk.webrendering.dsa.POBDsaInfoPresenterHelper;
import com.pubmatic.sdk.webrendering.mraid.POBMraidRenderer;
import com.pubmatic.sdk.webrendering.mraid.POBUseCustomCloseListener;
import com.pubmatic.sdk.webrendering.ui.POBAdViewContainer;
import com.pubmatic.sdk.webrendering.ui.POBBannerConfig;
import com.pubmatic.sdk.webrendering.ui.POBCustomProductPageView;
import com.pubmatic.sdk.webrendering.ui.POBFullScreenActivity;
import com.pubmatic.sdk.webrendering.ui.POBMraidViewContainer;
import com.pubmatic.sdk.webrendering.ui.POBMraidViewContainerListener;
import com.pubmatic.sdk.webrendering.ui.POBOnSkipOptionUpdateListener;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public class POBInterstitialRenderer implements POBInterstitialRendering, POBVideoRenderingListener, POBAdRendererListener, POBUseCustomCloseListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private POBBannerRendering f62841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private POBInterstitialRendererListener f62842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private POBVideoAdEventListener f62843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f62844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private POBAdDescriptor f62845e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Context f62846f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private View f62847g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final RendererBuilder f62848h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private POBFullScreenActivityListener f62849i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private POBBannerConfig f62850j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private POBMraidViewContainer f62851k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private POBTimeoutHandler f62852l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f62853m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f62854n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private POBTrackerHandler f62855o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private POBMraidRenderer f62856p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Boolean f62857q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f62858r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private POBCTAOverlayHandler f62859s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f62860t;

    public interface RendererBuilder {
        @Nullable
        POBBannerRendering build(@NonNull POBAdDescriptor pOBAdDescriptor, int i10);
    }

    class a implements POBOnSkipOptionUpdateListener {
        a() {
        }

        @Override // com.pubmatic.sdk.webrendering.ui.POBOnSkipOptionUpdateListener
        public void onSkipOptionUpdate(boolean z10) {
            if (POBInterstitialRenderer.this.f62850j == null || !POBInterstitialRenderer.this.f62850j.isBackButtonEnabled()) {
                return;
            }
            POBInterstitialRenderer.this.a(z10);
        }
    }

    class b implements POBFullScreenActivityListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f62862a;

        b(View view) {
            this.f62862a = view;
        }

        @Override // com.pubmatic.sdk.common.ui.POBFullScreenActivityListener
        public void onCreate(Activity activity) {
            View view = this.f62862a;
            if (!(view instanceof POBAdViewContainer)) {
                if (view instanceof POBVastPlayer) {
                    ((POBVastPlayer) view).setBaseContext(activity);
                    return;
                }
                return;
            }
            ((POBAdViewContainer) view).getAdView().setBaseContext(activity);
            if (POBInterstitialRenderer.this.f62851k != null) {
                POBInterstitialRenderer.this.f62853m = System.currentTimeMillis();
                POBInterstitialRenderer pOBInterstitialRenderer = POBInterstitialRenderer.this;
                pOBInterstitialRenderer.a(pOBInterstitialRenderer.f62851k);
                POBInterstitialRenderer.this.c();
            }
        }

        @Override // com.pubmatic.sdk.common.ui.POBFullScreenActivityListener
        public void onDestroy() {
            View view = this.f62862a;
            if (view instanceof POBAdViewContainer) {
                ((POBAdViewContainer) view).getAdView().setBaseContext(POBInterstitialRenderer.this.f62846f.getApplicationContext());
            } else if (view instanceof POBVastPlayer) {
                ((POBVastPlayer) view).setBaseContext(POBInterstitialRenderer.this.f62846f.getApplicationContext());
            }
            POBInterstitialRenderer.this.l();
            POBInterstitialRenderer.this.onAdInteractionStopped();
        }
    }

    class c implements POBMraidViewContainerListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ POBMraidViewContainer f62864a;

        c(POBMraidViewContainer pOBMraidViewContainer) {
            this.f62864a = pOBMraidViewContainer;
        }

        @Override // com.pubmatic.sdk.webrendering.ui.POBMraidViewContainerListener
        public void onClose() {
            POBInterstitialRenderer.this.b();
        }

        @Override // com.pubmatic.sdk.webrendering.ui.POBMraidViewContainerListener
        public void onForward() {
            POBInterstitialRenderer.this.g();
            POBInterstitialRenderer.this.n();
            this.f62864a.bringWatermarkToFront();
        }
    }

    class d implements POBTimeoutHandler.POBTimeoutHandlerListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ POBMraidViewContainer f62866a;

        d(POBMraidViewContainer pOBMraidViewContainer) {
            this.f62866a = pOBMraidViewContainer;
        }

        @Override // com.pubmatic.sdk.common.utility.POBTimeoutHandler.POBTimeoutHandlerListener
        public void onTimeout() {
            POBLog.debug("POBInterstitialRenderer", "Custom close delay timer exhausted", new Object[0]);
            POBInterstitialRenderer.this.b(this.f62866a, 2000L);
        }
    }

    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (POBInterstitialRenderer.this.f62845e != null) {
                POBDeepLinkUtil.triggerDeepLink(POBInterstitialRenderer.this.f62846f, String.format("https://play.google.com/store/apps/details?id=%s", POBInterstitialRenderer.this.f62845e.getBundle()), true);
                POBInterstitialRenderer.this.d();
                POBInterstitialRenderer.this.onRenderAdClick();
            }
        }
    }

    class f implements View.OnClickListener {

        class a implements POBDsaHtmlContent.OnContentListener {
            a() {
            }

            @Override // com.pubmatic.sdk.webrendering.dsa.POBDsaHtmlContent.OnContentListener
            public void onPageContentReceived(String str) {
                POBDsaInfoPresenterHelper.show(POBInterstitialRenderer.this.f62846f, POBInterstitialRenderer.this.f62845e, str);
            }
        }

        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            POBDsaHtmlContent.getHtmlContent(POBInterstitialRenderer.this.f62846f, new a());
        }
    }

    class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            POBInterstitialRenderer.this.b();
        }
    }

    class h implements POBCTAOverlayHandler.POBCTAOverlayListener {
        h() {
        }

        @Override // com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayHandler.POBCTAOverlayListener
        public void onClick() {
            POBLog.debug("POBInterstitialRenderer", "CTAOverlay clicked.", new Object[0]);
            POBInterstitialRenderer.this.e();
        }

        @Override // com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayHandler.POBCTAOverlayListener
        public void onDismiss() {
            POBLog.debug("POBInterstitialRenderer", "CTAOverlay dismissed.", new Object[0]);
            POBInterstitialRenderer.this.k();
            POBInterstitialRenderer.this.f();
        }

        @Override // com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayHandler.POBCTAOverlayListener
        public void onShow() {
            POBLog.debug("POBInterstitialRenderer", "CTAOverlay presented successfully.", new Object[0]);
            if (POBInterstitialRenderer.this.f62851k != null) {
                POBInterstitialRenderer.this.f62851k.bringWatermarkToFront();
            }
            if (POBInterstitialRenderer.this.f62856p == null || POBInterstitialRenderer.this.f62859s == null) {
                return;
            }
            POBInterstitialRenderer.this.f62856p.addFriendlyObstructions(POBInterstitialRenderer.this.f62859s.getCtaOverlayView(), POBObstructionUpdateListener.POBFriendlyObstructionPurpose.OTHER);
        }
    }

    public POBInterstitialRenderer(@NonNull Context context, @NonNull RendererBuilder rendererBuilder) {
        this.f62846f = context;
        this.f62848h = rendererBuilder;
    }

    @Override // com.pubmatic.sdk.common.ui.POBInterstitialRendering
    public void destroy() {
        l();
        h();
    }

    @Override // com.pubmatic.sdk.video.renderer.POBVideoRenderingListener
    public void notifyAdEvent(@NonNull POBDataType$POBVideoAdEventType pOBDataType$POBVideoAdEventType) {
        POBVideoAdEventListener pOBVideoAdEventListener = this.f62843c;
        if (pOBVideoAdEventListener != null) {
            pOBVideoAdEventListener.onVideoAdEvent(pOBDataType$POBVideoAdEventType);
        }
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdExpired() {
        POBInterstitialRendererListener pOBInterstitialRendererListener = this.f62842b;
        if (pOBInterstitialRendererListener != null) {
            pOBInterstitialRendererListener.onAdExpired();
        }
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdImpression() {
        POBInterstitialRendererListener pOBInterstitialRendererListener = this.f62842b;
        if (pOBInterstitialRendererListener != null) {
            pOBInterstitialRendererListener.onAdImpression();
        }
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdInteractionStarted() {
        if (this.f62842b != null && this.f62844d == 0) {
            j();
            this.f62842b.onAdInteractionStarted();
        }
        this.f62844d++;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdInteractionStopped() {
        POBMraidViewContainer pOBMraidViewContainer;
        int i10 = this.f62844d - 1;
        this.f62844d = i10;
        if (i10 == 0) {
            if (!(this.f62841a instanceof POBMraidRenderer) || !a() || (pOBMraidViewContainer = this.f62851k) == null) {
                if (this.f62842b != null) {
                    destroy();
                    this.f62842b.onAdInteractionStopped();
                    return;
                }
                return;
            }
            pOBMraidViewContainer.hideSkipBtn();
            g();
            n();
            this.f62851k.bringWatermarkToFront();
            this.f62844d++;
        }
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdReadyToRefresh(int i10) {
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdRender(@NonNull View view, @Nullable POBAdDescriptor pOBAdDescriptor) {
        this.f62847g = view;
        POBInterstitialRendererListener pOBInterstitialRendererListener = this.f62842b;
        if (pOBInterstitialRendererListener != null) {
            pOBInterstitialRendererListener.onAdRender(pOBAdDescriptor);
        }
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdRenderingFailed(@NonNull POBError pOBError) {
        POBInterstitialRendererListener pOBInterstitialRendererListener = this.f62842b;
        if (pOBInterstitialRendererListener != null) {
            pOBInterstitialRendererListener.onAdRenderingFailed(pOBError);
        }
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdUnload() {
        POBInterstitialRendererListener pOBInterstitialRendererListener = this.f62842b;
        if (pOBInterstitialRendererListener != null) {
            pOBInterstitialRendererListener.onAdUnload();
        }
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onLeavingApplication() {
        POBInterstitialRendererListener pOBInterstitialRendererListener = this.f62842b;
        if (pOBInterstitialRendererListener != null) {
            pOBInterstitialRendererListener.onLeavingApplication();
        }
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onRenderAdClick() {
        Boolean bool;
        POBInterstitialRendererListener pOBInterstitialRendererListener = this.f62842b;
        if (pOBInterstitialRendererListener != null) {
            pOBInterstitialRendererListener.onAdClicked();
        }
        if (this.f62851k == null || (bool = this.f62857q) == null || bool.booleanValue()) {
            return;
        }
        this.f62851k.onAdViewClicked();
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onRenderProcessGone() {
        POBInterstitialRendererListener pOBInterstitialRendererListener = this.f62842b;
        if (pOBInterstitialRendererListener != null) {
            pOBInterstitialRendererListener.onRenderProcessGone();
        }
        h();
    }

    @Override // com.pubmatic.sdk.video.renderer.POBVideoRenderingListener
    public void onSkipOptionUpdate(boolean z10) {
        a(z10);
    }

    @Override // com.pubmatic.sdk.common.ui.POBInterstitialRendering
    public void renderAd(@NonNull POBAdDescriptor pOBAdDescriptor) {
        String str;
        this.f62845e = pOBAdDescriptor;
        POBLog.debug("POBInterstitialRenderer", "Rendering onStart", new Object[0]);
        if (pOBAdDescriptor.getRenderableContent() != null) {
            POBBannerRendering pOBBannerRenderingBuild = this.f62848h.build(pOBAdDescriptor, hashCode());
            this.f62841a = pOBBannerRenderingBuild;
            if (pOBBannerRenderingBuild != null) {
                pOBBannerRenderingBuild.setAdRendererListener(this);
                if (pOBAdDescriptor.isVideo() && (str = this.f62854n) != null) {
                    this.f62841a.setWatermark(str);
                }
                this.f62841a.renderAd(pOBAdDescriptor);
                POBBannerRendering pOBBannerRendering = this.f62841a;
                if (pOBBannerRendering instanceof POBMraidRenderer) {
                    ((POBMraidRenderer) pOBBannerRendering).setCustomCloseListener(this);
                    return;
                }
                return;
            }
        }
        POBInterstitialRendererListener pOBInterstitialRendererListener = this.f62842b;
        if (pOBInterstitialRendererListener != null) {
            pOBInterstitialRendererListener.onAdRenderingFailed(new POBError(1009, "Rendering failed for descriptor: " + pOBAdDescriptor));
        }
    }

    @Override // com.pubmatic.sdk.common.ui.POBInterstitialRendering
    public void setAdRendererListener(@Nullable POBInterstitialRendererListener pOBInterstitialRendererListener) {
        this.f62842b = pOBInterstitialRendererListener;
    }

    public void setTrackerHandler(@NonNull POBTrackerHandler pOBTrackerHandler) {
        this.f62855o = pOBTrackerHandler;
    }

    @Override // com.pubmatic.sdk.common.ui.POBInterstitialRendering
    public void setVideoAdEventListener(@Nullable POBVideoAdEventListener pOBVideoAdEventListener) {
        this.f62843c = pOBVideoAdEventListener;
    }

    @Override // com.pubmatic.sdk.common.ui.POBInterstitialRendering
    public void setWatermark(@NonNull String str) {
        this.f62854n = str;
    }

    @Override // com.pubmatic.sdk.common.ui.POBInterstitialRendering
    public void show(int i10) {
        a(i10);
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.POBUseCustomCloseListener
    public void useCustomClose(boolean z10) {
        m();
        this.f62857q = Boolean.valueOf(z10);
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f62853m;
        this.f62853m = jCurrentTimeMillis;
        POBMraidViewContainer pOBMraidViewContainer = this.f62851k;
        if (pOBMraidViewContainer != null) {
            b(pOBMraidViewContainer, Math.max(0L, jCurrentTimeMillis));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(POBMraidViewContainer pOBMraidViewContainer, long j10) {
        if (this.f62858r) {
            return;
        }
        this.f62858r = true;
        Boolean bool = this.f62857q;
        boolean z10 = bool != null && bool.booleanValue();
        this.f62857q = Boolean.valueOf(z10);
        pOBMraidViewContainer.setCustomCloseEnabled(z10);
        if (this.f62857q.booleanValue()) {
            a(pOBMraidViewContainer, j10);
        } else {
            pOBMraidViewContainer.handleSkipTimer(j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (this.f62851k == null) {
            return;
        }
        POBAdDescriptor pOBAdDescriptor = this.f62845e;
        POBCTAOverlayData cTAOverlayData = pOBAdDescriptor != null ? pOBAdDescriptor.getCTAOverlayData() : null;
        if (!POBCTAOverlayHandler.isCTAOverlayValid(cTAOverlayData)) {
            POBLog.debug("POBInterstitialRenderer", "CTAOverlay failed to present with error: %s", "CTA overlay data invalid");
            return;
        }
        POBCTAOverlayHandler pOBCTAOverlayHandler = new POBCTAOverlayHandler(this.f62851k, cTAOverlayData, false);
        this.f62859s = pOBCTAOverlayHandler;
        pOBCTAOverlayHandler.setCTAOverlayListener(new h());
        this.f62859s.showWithDelay(cTAOverlayData.getDelay());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        POBTrackerHandler pOBTrackerHandler;
        POBAdDescriptor pOBAdDescriptor = this.f62845e;
        if (pOBAdDescriptor == null || (pOBTrackerHandler = this.f62855o) == null) {
            return;
        }
        pOBTrackerHandler.sendTrackers(pOBAdDescriptor.getClickTrackers());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        POBAdDescriptor pOBAdDescriptor = this.f62845e;
        POBCTAOverlayData cTAOverlayData = pOBAdDescriptor != null ? pOBAdDescriptor.getCTAOverlayData() : null;
        if (cTAOverlayData == null || cTAOverlayData.getClickUrl() == null) {
            return;
        }
        POBBannerRendering pOBBannerRendering = this.f62841a;
        if (pOBBannerRendering instanceof POBMraidRenderer) {
            ((POBMraidRenderer) pOBBannerRendering).handleClickThrough(cTAOverlayData.getClickUrl(), cTAOverlayData.getClickTrackers());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (this.f62859s != null) {
            if (!a() || this.f62860t) {
                i();
            } else {
                this.f62859s.hide();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        POBCTAOverlayHandler pOBCTAOverlayHandler = this.f62859s;
        if (pOBCTAOverlayHandler != null) {
            pOBCTAOverlayHandler.hide();
            this.f62859s.invalidateTimer();
        }
    }

    private void h() {
        POBInstanceProvider.getAdViewCacheService().popStoredAdView(Integer.valueOf(hashCode()));
        this.f62849i = null;
        this.f62858r = false;
        this.f62857q = Boolean.FALSE;
        this.f62860t = false;
        m();
        i();
        b();
    }

    private void i() {
        if (this.f62859s != null) {
            k();
            this.f62859s.cleanUp();
            this.f62859s = null;
        }
    }

    private void j() {
        POBBannerRendering pOBBannerRendering = this.f62841a;
        if (pOBBannerRendering != null) {
            pOBBannerRendering.invalidateExpiration();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        POBCTAOverlayHandler pOBCTAOverlayHandler;
        POBMraidRenderer pOBMraidRenderer = this.f62856p;
        if (pOBMraidRenderer == null || (pOBCTAOverlayHandler = this.f62859s) == null) {
            return;
        }
        pOBMraidRenderer.removeFriendlyObstructions(pOBCTAOverlayHandler.getCtaOverlayView());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        POBBannerRendering pOBBannerRendering = this.f62841a;
        if (pOBBannerRendering != null) {
            pOBBannerRendering.destroy();
            this.f62841a = null;
        }
    }

    private void m() {
        POBTimeoutHandler pOBTimeoutHandler = this.f62852l;
        if (pOBTimeoutHandler != null) {
            pOBTimeoutHandler.cancel();
            this.f62852l = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        POBCustomProductPageView pOBCustomProductPageView = new POBCustomProductPageView(this.f62846f);
        pOBCustomProductPageView.setInstallButtonClickListener(new e());
        pOBCustomProductPageView.enableAdInfoBtn(new f());
        pOBCustomProductPageView.setCloseBtnClickListener(new g());
        POBMraidViewContainer pOBMraidViewContainer = this.f62851k;
        if (pOBMraidViewContainer != null) {
            this.f62860t = true;
            pOBMraidViewContainer.addView(pOBCustomProductPageView);
            POBMraidRenderer pOBMraidRenderer = this.f62856p;
            if (pOBMraidRenderer != null) {
                pOBMraidRenderer.addFriendlyObstructions(pOBCustomProductPageView, POBObstructionUpdateListener.POBFriendlyObstructionPurpose.OTHER);
            }
            POBAdDescriptor pOBAdDescriptor = this.f62845e;
            POBCTAOverlayData cTAOverlayData = pOBAdDescriptor != null ? pOBAdDescriptor.getCTAOverlayData() : null;
            POBCTAOverlayHandler pOBCTAOverlayHandler = this.f62859s;
            if (pOBCTAOverlayHandler == null || cTAOverlayData == null) {
                return;
            }
            pOBCTAOverlayHandler.showWithDelay(cTAOverlayData.getEndcardDelay());
        }
    }

    private void a(int i10) {
        View view;
        POBLog.info("POBInterstitialRenderer", "showInterstitialAd", new Object[0]);
        POBAdDescriptor pOBAdDescriptor = this.f62845e;
        if (pOBAdDescriptor != null && (view = this.f62847g) != null) {
            a(pOBAdDescriptor, view);
            POBAdViewCacheService.AdViewConfig storedAdView = POBInstanceProvider.getAdViewCacheService().getStoredAdView(Integer.valueOf(hashCode()));
            if (storedAdView != null) {
                POBBannerRendering pOBBannerRendering = this.f62841a;
                if (pOBBannerRendering instanceof POBMraidRenderer) {
                    this.f62856p = (POBMraidRenderer) pOBBannerRendering;
                    POBMraidViewContainer pOBMraidViewContainer = (POBMraidViewContainer) storedAdView.getAdView();
                    this.f62851k = pOBMraidViewContainer;
                    pOBMraidViewContainer.setEnableSkipTimer(true);
                    this.f62851k.setObstructionUpdateListener(this.f62856p);
                    POBBannerConfig pOBBannerConfigCreateBannerConfig = POBBannerConfig.ConfigBuilder.createBannerConfig(this.f62845e.getRawBid(), "interstitial");
                    this.f62850j = pOBBannerConfigCreateBannerConfig;
                    int skipAfter = pOBBannerConfigCreateBannerConfig.getSkipAfter();
                    if (skipAfter > 0) {
                        this.f62851k.configureSkippability(skipAfter);
                    }
                    this.f62851k.setSkipOptionUpdateListener(new a());
                    this.f62856p.signalImpressionEvent();
                }
                try {
                    POBFullScreenActivity.startFullScreenActivity(this.f62846f, i10, this.f62845e, hashCode());
                    onAdInteractionStarted();
                    return;
                } catch (Exception e10) {
                    POBLog.error("POBInterstitialRenderer", "Unable to start full screen activity. Error: %s", e10.getMessage());
                    POBInterstitialRendererListener pOBInterstitialRendererListener = this.f62842b;
                    if (pOBInterstitialRendererListener != null) {
                        pOBInterstitialRendererListener.onAdRenderingFailed(new POBError(1009, "Failed to show interstitial ad with error: " + e10.getMessage()));
                        return;
                    }
                    return;
                }
            }
            return;
        }
        String str = "Can not show interstitial for descriptor: " + this.f62845e;
        POBLog.error("POBInterstitialRenderer", str, new Object[0]);
        POBInterstitialRendererListener pOBInterstitialRendererListener2 = this.f62842b;
        if (pOBInterstitialRendererListener2 != null) {
            pOBInterstitialRendererListener2.onAdRenderingFailed(new POBError(1009, str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        POBFullScreenActivity.closeActivity(this.f62846f, hashCode());
    }

    private void a(POBAdDescriptor pOBAdDescriptor, View view) {
        ViewGroup viewGroup;
        this.f62849i = new b(view);
        if (pOBAdDescriptor.isVideo()) {
            viewGroup = (ViewGroup) view;
        } else {
            POBMraidViewContainer pOBMraidViewContainer = new POBMraidViewContainer(this.f62846f.getApplicationContext(), (ViewGroup) view, !POBUtils.isNullOrEmpty(pOBAdDescriptor.getBundle()));
            String str = this.f62854n;
            if (str != null) {
                pOBMraidViewContainer.setWatermarkView(POBUIUtil.createWatermarkView(this.f62846f, str));
            }
            pOBMraidViewContainer.setMraidViewContainerListener(new c(pOBMraidViewContainer));
            viewGroup = pOBMraidViewContainer;
        }
        POBInstanceProvider.getAdViewCacheService().storeAdView(Integer.valueOf(hashCode()), new POBAdViewCacheService.AdViewConfig(viewGroup, this.f62849i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(POBMraidViewContainer pOBMraidViewContainer) {
        if (this.f62858r) {
            return;
        }
        Boolean bool = this.f62857q;
        if (bool != null && bool.booleanValue()) {
            this.f62858r = true;
            pOBMraidViewContainer.setCustomCloseEnabled(true);
            a(pOBMraidViewContainer, 0L);
        } else {
            m();
            POBTimeoutHandler pOBTimeoutHandler = new POBTimeoutHandler(new d(pOBMraidViewContainer));
            this.f62852l = pOBTimeoutHandler;
            pOBTimeoutHandler.start(2000L);
            POBLog.debug("POBInterstitialRenderer", "Custom close delay timer started with 2 sec delay", new Object[0]);
        }
    }

    private void a(POBMraidViewContainer pOBMraidViewContainer, long j10) {
        pOBMraidViewContainer.handleSkipTimer(Math.max(TimeUnit.SECONDS.toMillis(this.f62850j != null ? r1.getSkipAfter() : 0L), 20000L) - j10);
    }

    private boolean a() {
        POBAdDescriptor pOBAdDescriptor = this.f62845e;
        return (pOBAdDescriptor == null || POBUtils.isNullOrEmpty(pOBAdDescriptor.getBundle())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z10) {
        POBFullScreenActivity.updateBackButtonState(this.f62846f, hashCode(), z10);
    }
}
