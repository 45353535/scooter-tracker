package com.pubmatic.sdk.webrendering.mraid;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Trace;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBAdSize;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.POBInstanceProvider;
import com.pubmatic.sdk.common.base.POBAdDescriptor;
import com.pubmatic.sdk.common.base.POBAdRendererListener;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayHandler;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.models.POBDeviceInfo;
import com.pubmatic.sdk.common.models.POBImpressionCountingMethod;
import com.pubmatic.sdk.common.network.POBTrackerHandler;
import com.pubmatic.sdk.common.ui.POBBannerRendering;
import com.pubmatic.sdk.common.ui.POBHtmlRendererListener;
import com.pubmatic.sdk.common.utility.POBUrlHandler;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.common.view.POBWebView;
import com.pubmatic.sdk.common.viewability.POBHTMLMeasurementProvider;
import com.pubmatic.sdk.common.viewability.POBMeasurementProvider;
import com.pubmatic.sdk.common.viewability.POBObstructionUpdateListener;
import com.pubmatic.sdk.webrendering.dsa.POBDsaHtmlContent;
import com.pubmatic.sdk.webrendering.dsa.POBDsaInfoPresenterHelper;
import com.pubmatic.sdk.webrendering.ui.POBAdViewContainer;
import com.pubmatic.sdk.webrendering.ui.POBAdVisibilityListener;
import com.pubmatic.sdk.webrendering.ui.POBHTMLRenderer;
import com.pubmatic.sdk.webrendering.ui.POBHTMLViewClient;
import com.pubmatic.sdk.webrendering.ui.POBViewabilityTracker;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
@MainThread
public class POBMraidRenderer implements o, POBBannerRendering, POBHtmlRendererListener, POBObstructionUpdateListener, POBHTMLViewClient.OnRenderProcessGoneListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f63335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final POBMraidController f63336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final POBMraidBridge f63337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final POBHTMLRenderer f63338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private POBAdRendererListener f63339e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private POBUseCustomCloseListener f63340f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final POBAdViewContainer f63341g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f63342h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private View.OnLayoutChangeListener f63343i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private POBAdVisibilityListener f63344j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private POBHTMLMeasurementProvider f63345k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f63346l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Context f63347m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private POBWebView f63348n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private POBAdDescriptor f63349o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private POBUrlHandler f63350p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private POBTrackerHandler f63351q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f63352r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f63353s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private POBCTAOverlayHandler f63354t;

    class a implements POBWebView.OnFocusChangedListener {
        a() {
        }

        @Override // com.pubmatic.sdk.common.view.POBWebView.OnFocusChangedListener
        public void onFocusChanged(boolean z10) {
            if (POBMraidRenderer.this.f63344j != null) {
                POBMraidRenderer.this.f63344j.onVisibilityChange(z10);
            }
        }
    }

    class b implements POBMeasurementProvider.POBScriptListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f63356a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f63357b;

        b(String str, boolean z10) {
            this.f63356a = str;
            this.f63357b = z10;
        }

        @Override // com.pubmatic.sdk.common.viewability.POBMeasurementProvider.POBScriptListener
        public void onFailedToReceiveMeasurementScript(int i10) {
            POBLog.error("POBMraidRenderer", "Failed to fetch OMID JS script.", new Object[0]);
            POBMraidRenderer.this.f63338d.loadHTML(this.f63356a, POBMraidRenderer.this.f63346l, this.f63357b);
        }

        @Override // com.pubmatic.sdk.common.viewability.POBMeasurementProvider.POBScriptListener
        public void onMeasurementScriptReceived(String str) {
            POBMraidRenderer.this.f63338d.loadHTML("<script>" + str + "</script>" + this.f63356a, POBMraidRenderer.this.f63346l, this.f63357b);
        }
    }

    class c implements POBViewabilityTracker.OnViewabilityChangedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ POBViewabilityTracker f63359a;

        c(POBViewabilityTracker pOBViewabilityTracker) {
            this.f63359a = pOBViewabilityTracker;
        }

        @Override // com.pubmatic.sdk.webrendering.ui.POBViewabilityTracker.OnViewabilityChangedListener
        public void onViewabilityChanged(boolean z10) {
            if (z10) {
                POBMraidRenderer.this.f();
                this.f63359a.destroy();
            }
        }
    }

    class d implements POBCTAOverlayHandler.POBCTAOverlayListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ POBCTAOverlayData f63361a;

        d(POBCTAOverlayData pOBCTAOverlayData) {
            this.f63361a = pOBCTAOverlayData;
        }

        @Override // com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayHandler.POBCTAOverlayListener
        public void onClick() {
            POBLog.debug("POBMraidRenderer", "CTAOverlay clicked.", new Object[0]);
            POBMraidRenderer.this.handleClickThrough(this.f63361a.getClickUrl(), this.f63361a.getClickTrackers());
        }

        @Override // com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayHandler.POBCTAOverlayListener
        public void onDismiss() {
            POBLog.debug("POBMraidRenderer", "CTAOverlay dismissed.", new Object[0]);
            POBMraidRenderer.this.c();
        }

        @Override // com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayHandler.POBCTAOverlayListener
        public void onShow() {
            if (POBMraidRenderer.this.f63341g.getWatermarkView() != null) {
                POBMraidRenderer.this.f63341g.getWatermarkView().bringToFront();
            }
            POBLog.debug("POBMraidRenderer", "CTAOverlay presented successfully.", new Object[0]);
            POBMraidRenderer pOBMraidRenderer = POBMraidRenderer.this;
            pOBMraidRenderer.addFriendlyObstructions(pOBMraidRenderer.f63354t.getCtaOverlayView(), POBObstructionUpdateListener.POBFriendlyObstructionPurpose.OTHER);
        }
    }

    class e implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ POBAdDescriptor f63363a;

        class a implements POBDsaHtmlContent.OnContentListener {
            a() {
            }

            @Override // com.pubmatic.sdk.webrendering.dsa.POBDsaHtmlContent.OnContentListener
            public void onPageContentReceived(String str) {
                POBDsaInfoPresenterHelper.show(POBMraidRenderer.this.f63347m, e.this.f63363a, str);
            }
        }

        e(POBAdDescriptor pOBAdDescriptor) {
            this.f63363a = pOBAdDescriptor;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            POBDsaHtmlContent.getHtmlContent(POBMraidRenderer.this.f63347m, new a());
        }
    }

    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (POBMraidRenderer.this.f63342h) {
                POBMraidRenderer.this.f63337c.setMraidState(com.pubmatic.sdk.webrendering.mraid.b.DEFAULT);
            }
            POBMraidRenderer.this.f63336b.initProperties(POBMraidRenderer.this.f63337c, POBMraidRenderer.this.f63342h);
            POBMraidRenderer.this.f63342h = false;
        }
    }

    class g implements View.OnLayoutChangeListener {
        g() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            POBMraidRenderer.this.k();
        }
    }

    class h implements POBUrlHandler.UrlHandlerListener {
        h() {
        }

        @Override // com.pubmatic.sdk.common.utility.POBUrlHandler.UrlHandlerListener
        public void onErrorOpenUrl(String str) {
            POBLog.warn("POBMraidRenderer", "Error opening url %s", str);
        }

        @Override // com.pubmatic.sdk.common.utility.POBUrlHandler.UrlHandlerListener
        public void onHandleTrackers(String str, List list) {
            POBMraidRenderer.this.a(list);
        }

        @Override // com.pubmatic.sdk.common.utility.POBUrlHandler.UrlHandlerListener
        public void onInternalBrowserClose(String str) {
            POBMraidRenderer.this.e();
        }

        @Override // com.pubmatic.sdk.common.utility.POBUrlHandler.UrlHandlerListener
        public void onInternalBrowserOpen(String str) {
            POBMraidRenderer.this.d();
        }

        @Override // com.pubmatic.sdk.common.utility.POBUrlHandler.UrlHandlerListener
        public void onLeaveApp(String str) {
            POBMraidRenderer.this.onLeavingApplication();
        }
    }

    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (POBMraidRenderer.this.f63345k != null) {
                POBMraidRenderer.this.f63345k.signalAdEvent(POBHTMLMeasurementProvider.POBHTMLAdEventType.IMPRESSION);
            }
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    protected POBMraidRenderer(@NonNull Context context, @NonNull String str, @NonNull POBAdViewContainer pOBAdViewContainer, int i10) {
        this.f63352r = false;
        this.f63347m = context;
        this.f63335a = str;
        this.f63341g = pOBAdViewContainer;
        this.f63348n = pOBAdViewContainer.getAdView();
        this.f63352r = "interstitial".equals(str);
        this.f63348n.getSettings().setJavaScriptEnabled(true);
        this.f63348n.getSettings().setCacheMode(2);
        this.f63348n.setScrollBarStyle(0);
        POBMraidWebClient pOBMraidWebClient = new POBMraidWebClient(this);
        pOBMraidWebClient.disableMultipleOnPageFinished(true);
        POBHTMLRenderer pOBHTMLRenderer = new POBHTMLRenderer(this.f63348n, pOBMraidWebClient);
        this.f63338d = pOBHTMLRenderer;
        pOBHTMLRenderer.setRendererViewListener(this);
        POBMraidBridge pOBMraidBridge = new POBMraidBridge(pOBAdViewContainer);
        this.f63337c = pOBMraidBridge;
        POBMraidController pOBMraidController = new POBMraidController(context, pOBMraidBridge, str, i10);
        this.f63336b = pOBMraidController;
        pOBMraidController.setMraidControllerListener(this);
        pOBMraidController.addInlineVideoSupportToWebView(this.f63348n);
        j();
        a(pOBMraidController);
    }

    @Nullable
    public static POBMraidRenderer createInstance(@NonNull Context context, @NonNull String str, int i10) {
        POBWebView pOBWebViewCreateInstance = POBWebView.createInstance(context);
        if (pOBWebViewCreateInstance != null) {
            return new POBMraidRenderer(context, str, new POBAdViewContainer(context, pOBWebViewCreateInstance), i10);
        }
        return null;
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.o, com.pubmatic.sdk.common.viewability.POBObstructionUpdateListener
    public void addFriendlyObstructions(@NonNull View view, @NonNull POBObstructionUpdateListener.POBFriendlyObstructionPurpose pOBFriendlyObstructionPurpose) {
        POBHTMLMeasurementProvider pOBHTMLMeasurementProvider = this.f63345k;
        if (pOBHTMLMeasurementProvider != null) {
            pOBHTMLMeasurementProvider.addFriendlyObstructions(view, pOBFriendlyObstructionPurpose);
        }
    }

    @Override // com.pubmatic.sdk.common.ui.POBBannerRendering
    public void destroy() {
        invalidate();
        this.f63338d.destroy();
    }

    public void handleClickThrough(@Nullable String str, @Nullable List<String> list) {
        POBAdDescriptor pOBAdDescriptor = this.f63349o;
        if (pOBAdDescriptor != null) {
            a(pOBAdDescriptor.getClickTrackers());
        }
        if (list != null && !list.isEmpty()) {
            a(list);
        }
        b(str);
        g();
    }

    public void invalidate() {
        this.f63336b.destroy();
        POBWebView pOBWebView = this.f63348n;
        if (pOBWebView != null) {
            pOBWebView.removeOnLayoutChangeListener(this.f63343i);
            this.f63348n.setOnfocusChangedListener(null);
            this.f63348n = null;
        }
        this.f63343i = null;
        c();
        POBHTMLMeasurementProvider pOBHTMLMeasurementProvider = this.f63345k;
        if (pOBHTMLMeasurementProvider != null) {
            pOBHTMLMeasurementProvider.finishAdSession();
            this.f63345k = null;
        }
    }

    @Override // com.pubmatic.sdk.common.ui.POBBannerRendering
    public void invalidateExpiration() {
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.o
    public boolean isUserInteracted(boolean z10) {
        boolean zIsUserInteracted = this.f63338d.isUserInteracted();
        if (z10) {
            this.f63338d.setUserInteracted(false);
        }
        return zIsUserInteracted;
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.o
    public void onAdInteractionStarted() {
        if (!this.f63352r) {
            this.f63341g.resizeAdInfoIcon(true);
        }
        d();
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.o
    public void onAdInteractionStopped() {
        if (!this.f63352r) {
            this.f63341g.resizeAdInfoIcon(false);
        }
        e();
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.o
    public void onAdUnload() {
        POBAdRendererListener pOBAdRendererListener = this.f63339e;
        if (pOBAdRendererListener != null) {
            pOBAdRendererListener.onAdUnload();
        }
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.o
    public void onAdViewChanged(@NonNull View view) {
        POBHTMLMeasurementProvider pOBHTMLMeasurementProvider = this.f63345k;
        if (pOBHTMLMeasurementProvider != null) {
            pOBHTMLMeasurementProvider.setTrackView(view);
        }
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.o
    public void onLeavingApplication() {
        POBAdRendererListener pOBAdRendererListener = this.f63339e;
        if (pOBAdRendererListener != null) {
            pOBAdRendererListener.onLeavingApplication();
        }
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.o
    public void onMRAIDAdClick() {
        POBAdDescriptor pOBAdDescriptor = this.f63349o;
        if (pOBAdDescriptor != null) {
            a(pOBAdDescriptor.getClickTrackers());
        }
        g();
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.o
    public void onOpen(@Nullable String str) {
        handleClickThrough(str, null);
    }

    @Override // com.pubmatic.sdk.common.ui.POBHtmlRendererListener, com.pubmatic.sdk.webrendering.ui.POBHTMLViewClient.OnRenderProcessGoneListener
    public void onRenderProcessGone() {
        POBAdRendererListener pOBAdRendererListener = this.f63339e;
        if (pOBAdRendererListener != null) {
            pOBAdRendererListener.onRenderProcessGone();
        }
        invalidate();
        this.f63338d.invalidateWebView();
    }

    @Override // com.pubmatic.sdk.common.ui.POBHtmlRendererListener
    public void onViewClicked(@Nullable String str) {
        handleClickThrough(str, null);
    }

    @Override // com.pubmatic.sdk.common.ui.POBHtmlRendererListener
    public void onViewRendered(@NonNull View view) {
        Trace.endSection();
        if (!this.f63352r) {
            this.f63336b.close();
        }
        this.f63337c.resetPropertyMap();
        this.f63342h = true;
        if (!this.f63352r) {
            k();
        }
        if ("inline".equals(this.f63335a) && a()) {
            b();
        }
        i();
        l();
        POBAdDescriptor pOBAdDescriptor = this.f63349o;
        if (pOBAdDescriptor != null && !pOBAdDescriptor.isCompanion()) {
            a(this.f63349o);
        }
        if (this.f63339e != null) {
            a(this.f63347m);
            String str = this.f63353s;
            if (str != null) {
                a(str);
            }
            this.f63339e.onAdRender(this.f63341g, this.f63349o);
            POBAdDescriptor pOBAdDescriptor2 = this.f63349o;
            if (pOBAdDescriptor2 != null && pOBAdDescriptor2.getImpressionCountingMethod() == POBImpressionCountingMethod.ON_LOAD) {
                f();
            }
            POBAdDescriptor pOBAdDescriptor3 = this.f63349o;
            this.f63339e.onAdReadyToRefresh(pOBAdDescriptor3 != null ? pOBAdDescriptor3.getRefreshInterval() : 0);
        }
    }

    @Override // com.pubmatic.sdk.common.ui.POBHtmlRendererListener
    public void onViewRenderingFailed(@NonNull POBError pOBError) {
        Trace.endSection();
        POBAdRendererListener pOBAdRendererListener = this.f63339e;
        if (pOBAdRendererListener != null) {
            pOBAdRendererListener.onAdRenderingFailed(pOBError);
        }
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.o, com.pubmatic.sdk.common.viewability.POBObstructionUpdateListener
    public void removeFriendlyObstructions(@Nullable View view) {
        POBHTMLMeasurementProvider pOBHTMLMeasurementProvider = this.f63345k;
        if (pOBHTMLMeasurementProvider != null) {
            pOBHTMLMeasurementProvider.removeFriendlyObstructions(view);
        }
    }

    @Override // com.pubmatic.sdk.common.ui.POBBannerRendering
    public void renderAd(@NonNull POBAdDescriptor pOBAdDescriptor) {
        Trace.beginSection("POB Mraid Parsing");
        this.f63349o = pOBAdDescriptor;
        if (pOBAdDescriptor.getImpressionCountingMethod() == POBImpressionCountingMethod.ONE_PX_VIEWABLE) {
            h();
        }
        this.f63336b.addCommandHandlers(this.f63337c, false, this.f63349o.isCompanion());
        String renderableContent = pOBAdDescriptor.getRenderableContent();
        boolean zIsCompanion = pOBAdDescriptor.isCompanion();
        if (zIsCompanion && !POBUtils.isNullOrEmpty(renderableContent) && renderableContent.toLowerCase().startsWith("http")) {
            this.f63338d.loadHTML(null, renderableContent, zIsCompanion);
            return;
        }
        Context applicationContext = this.f63347m.getApplicationContext();
        POBDeviceInfo deviceInfo = POBInstanceProvider.getDeviceInfo(applicationContext);
        String str = POBMRAIDUtil.getMRAIDEnvironment(POBInstanceProvider.getAppInfo(applicationContext).getPackageName(), deviceInfo.getAdvertisingID(), deviceInfo.getLmtEnabled(), POBInstanceProvider.getSdkConfig().isCoppa()) + pOBAdDescriptor.getRenderableContent();
        POBHTMLMeasurementProvider pOBHTMLMeasurementProvider = this.f63345k;
        if (pOBHTMLMeasurementProvider != null) {
            pOBHTMLMeasurementProvider.omidJsServiceScript(this.f63347m.getApplicationContext(), new b(str, zIsCompanion));
        } else {
            this.f63338d.loadHTML(str, this.f63346l, zIsCompanion);
        }
    }

    @Override // com.pubmatic.sdk.common.ui.POBBannerRendering
    public void setAdRendererListener(@Nullable POBAdRendererListener pOBAdRendererListener) {
        this.f63339e = pOBAdRendererListener;
    }

    public void setBaseURL(@Nullable String str) {
        this.f63346l = str;
    }

    public void setCustomCloseListener(@Nullable POBUseCustomCloseListener pOBUseCustomCloseListener) {
        this.f63340f = pOBUseCustomCloseListener;
    }

    public void setHTMLMeasurementListener(POBHTMLMeasurementProvider pOBHTMLMeasurementProvider) {
        this.f63345k = pOBHTMLMeasurementProvider;
    }

    public void setRenderingTimeout(int i10) {
        this.f63338d.setRenderingTimeout(i10);
    }

    public void setTrackerHandler(@NonNull POBTrackerHandler pOBTrackerHandler) {
        this.f63351q = pOBTrackerHandler;
    }

    @Override // com.pubmatic.sdk.common.ui.POBBannerRendering
    public void setWatermark(@Nullable String str) {
        this.f63353s = str;
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.o
    public void shouldUseCustomClose(boolean z10) {
        POBLog.debug("POBMraidRenderer", "MRAID useCustomClose: %s", Boolean.valueOf(z10));
        POBUseCustomCloseListener pOBUseCustomCloseListener = this.f63340f;
        if (pOBUseCustomCloseListener != null) {
            pOBUseCustomCloseListener.useCustomClose(z10);
        }
    }

    public void signalImpressionEvent() {
        POBWebView pOBWebView;
        if (this.f63345k == null || (pOBWebView = this.f63348n) == null) {
            return;
        }
        pOBWebView.postDelayed(new i(), 1000L);
    }

    private void b(String str) {
        if (this.f63350p == null || POBUtils.isNullOrEmpty(str) || "https://obplaceholder.click.com/".equals(str)) {
            POBLog.warn("POBMraidRenderer", "Click through url is missing.", new Object[0]);
        } else {
            this.f63350p.open(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        POBCTAOverlayHandler pOBCTAOverlayHandler = this.f63354t;
        if (pOBCTAOverlayHandler != null) {
            removeFriendlyObstructions(pOBCTAOverlayHandler.getCtaOverlayView());
            this.f63354t.cleanUp();
            this.f63354t = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        POBAdRendererListener pOBAdRendererListener = this.f63339e;
        if (pOBAdRendererListener != null) {
            pOBAdRendererListener.onAdInteractionStarted();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        POBAdRendererListener pOBAdRendererListener = this.f63339e;
        if (pOBAdRendererListener != null) {
            pOBAdRendererListener.onAdInteractionStopped();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        POBAdRendererListener pOBAdRendererListener = this.f63339e;
        if (pOBAdRendererListener != null) {
            pOBAdRendererListener.onAdImpression();
        }
    }

    private void g() {
        POBAdRendererListener pOBAdRendererListener = this.f63339e;
        if (pOBAdRendererListener != null) {
            pOBAdRendererListener.onRenderAdClick();
        }
    }

    private void h() {
        POBWebView pOBWebView = this.f63348n;
        if (pOBWebView != null) {
            POBViewabilityTracker pOBViewabilityTracker = new POBViewabilityTracker((View) pOBWebView, 1);
            pOBViewabilityTracker.setAllowViewTreeObserverRegistration(true);
            pOBViewabilityTracker.setOnExposureChangeWithThresholdListener(new c(pOBViewabilityTracker));
        }
    }

    private void i() {
        if (this.f63343i != null || this.f63348n == null) {
            POBLog.debug("POBMraidRenderer", "layoutChangeListener null", new Object[0]);
            return;
        }
        g gVar = new g();
        this.f63343i = gVar;
        this.f63348n.addOnLayoutChangeListener(gVar);
    }

    private void j() {
        POBWebView pOBWebView = this.f63348n;
        if (pOBWebView != null) {
            pOBWebView.setOnfocusChangedListener(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        POBWebView pOBWebView = this.f63348n;
        if (pOBWebView != null) {
            pOBWebView.post(new f());
        }
    }

    private void l() {
        POBWebView pOBWebView;
        POBHTMLMeasurementProvider pOBHTMLMeasurementProvider = this.f63345k;
        if (pOBHTMLMeasurementProvider == null || (pOBWebView = this.f63348n) == null) {
            return;
        }
        pOBHTMLMeasurementProvider.startAdSession(pOBWebView);
        this.f63345k.signalAdEvent(POBHTMLMeasurementProvider.POBHTMLAdEventType.LOADED);
        if (this.f63352r) {
            return;
        }
        signalImpressionEvent();
    }

    private void a(POBAdVisibilityListener pOBAdVisibilityListener) {
        this.f63344j = pOBAdVisibilityListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List list) {
        POBTrackerHandler pOBTrackerHandler = this.f63351q;
        if (pOBTrackerHandler != null) {
            pOBTrackerHandler.sendTrackers(list);
        }
    }

    private void b() {
        POBAdDescriptor pOBAdDescriptor = this.f63349o;
        POBCTAOverlayData cTAOverlayData = pOBAdDescriptor != null ? pOBAdDescriptor.getCTAOverlayData() : null;
        if (POBCTAOverlayHandler.isCTAOverlayValid(cTAOverlayData)) {
            POBCTAOverlayHandler pOBCTAOverlayHandler = new POBCTAOverlayHandler(this.f63341g, cTAOverlayData, true);
            this.f63354t = pOBCTAOverlayHandler;
            pOBCTAOverlayHandler.setCTAOverlayListener(new d(cTAOverlayData));
            this.f63354t.showWithDelay(cTAOverlayData.getDelay());
            return;
        }
        POBLog.debug("POBMraidRenderer", "CTAOverlay failed to present with error: %s", "CTA overlay data invalid");
    }

    private void a(POBAdDescriptor pOBAdDescriptor) {
        POBHTMLMeasurementProvider pOBHTMLMeasurementProvider;
        this.f63341g.addAdInfoIcon(this.f63352r, pOBAdDescriptor.isVideo(), new e(pOBAdDescriptor));
        ImageButton adInfoIcon = this.f63341g.getAdInfoIcon();
        if (adInfoIcon == null || (pOBHTMLMeasurementProvider = this.f63345k) == null) {
            return;
        }
        pOBHTMLMeasurementProvider.addFriendlyObstructions(adInfoIcon, POBObstructionUpdateListener.POBFriendlyObstructionPurpose.OTHER);
    }

    private void a(String str) {
        this.f63341g.addWatermark(str);
        ImageView watermarkView = this.f63341g.getWatermarkView();
        if (watermarkView != null) {
            POBHTMLMeasurementProvider pOBHTMLMeasurementProvider = this.f63345k;
            if (pOBHTMLMeasurementProvider != null) {
                pOBHTMLMeasurementProvider.addFriendlyObstructions(watermarkView, POBObstructionUpdateListener.POBFriendlyObstructionPurpose.NOT_VISIBLE);
            }
            watermarkView.bringToFront();
        }
    }

    private void a(Context context) {
        this.f63350p = new POBUrlHandler(context, new h());
    }

    private boolean a() {
        POBAdDescriptor pOBAdDescriptor = this.f63349o;
        if (pOBAdDescriptor == null) {
            return false;
        }
        int contentWidth = pOBAdDescriptor.getContentWidth();
        POBAdSize pOBAdSize = POBAdSize.BANNER_SIZE_300x250;
        return contentWidth == pOBAdSize.getAdWidth() && this.f63349o.getContentHeight() == pOBAdSize.getAdHeight();
    }
}
