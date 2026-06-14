package com.mobilefuse.sdk.mraid;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.webkit.internal.AssetHelper;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.ironsource.C4240b4;
import com.ironsource.D5;
import com.mobilefuse.sdk.AdLifecycleEvent;
import com.mobilefuse.sdk.AdLifecycleEventListener;
import com.mobilefuse.sdk.AdRendererConfig;
import com.mobilefuse.sdk.AdRendererContainer;
import com.mobilefuse.sdk.AdRendererListener;
import com.mobilefuse.sdk.BaseAdRenderer;
import com.mobilefuse.sdk.CloseConfigResponse;
import com.mobilefuse.sdk.ExtendedAdType;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.Utils;
import com.mobilefuse.sdk.ad.rendering.ExtendedController;
import com.mobilefuse.sdk.ad.rendering.splashad.SplashAdController;
import com.mobilefuse.sdk.ad.view.CloseButton;
import com.mobilefuse.sdk.assetsmanager.MobileFuseAssetManager;
import com.mobilefuse.sdk.assetsmanager.ResultCallback;
import com.mobilefuse.sdk.config.ObservableConfig;
import com.mobilefuse.sdk.config.ObservableConfigKey;
import com.mobilefuse.sdk.device.GetLastKnownLocationDataKt;
import com.mobilefuse.sdk.device.LocationData;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.mobilefuse.sdk.internal.RtbLossReason;
import com.mobilefuse.sdk.logging.HttpRequestTracker;
import com.mobilefuse.sdk.mraid.MraidAdRenderer;
import com.mobilefuse.sdk.mraid.MraidAdRendererContainer;
import com.mobilefuse.sdk.omid.MraidOmidBridge;
import com.mobilefuse.sdk.omid.OmidFriendlyObstructionPurpose;
import com.mobilefuse.sdk.omid.OmidWebViewReleaser;
import com.mobilefuse.sdk.omid.viewtree.ViewTreeInspector;
import com.mobilefuse.sdk.rtb.ApiFramework;
import com.mobilefuse.sdk.telemetry.Telemetry;
import com.mobilefuse.sdk.utils.PositionUtils;
import com.mobilefuse.sdk.utils.WebViewUtils;
import com.mobilefuse.sdk.video.AdmClickInfo;
import com.mobilefuse.sdk.video.AdmClickInfoProvider;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import net.pubnative.lite.sdk.mraid.MRAIDNativeFeature;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class MraidAdRenderer extends BaseAdRenderer<MraidOmidBridge> {
    private static final boolean ALLOW_CLICKTHROUGH_WITHOUT_TAP_DEFAULT = false;
    private static String CLICKTHROUGH_CONSTANT = "${CLICKTHROUGH}";
    private static final long PROGRESS_BAR_SHOW_DELAY = 3000;
    private static String WEB_VIEW_BASE_URL = "https://sdk-webview.mobilefuse.com";
    public static boolean webViewCrashTestAllowed;
    private boolean activityOrientationChanged;
    private PopupWindow bannerExpandedWindow;
    private RelativeLayout.LayoutParams bannerInlineLayoutParams;
    private CloseButton closeBtn;
    private boolean closingAd;
    private boolean expanded;
    private final Handler handler;
    private Boolean isMraidBridgeLoaded;

    @Nullable
    private JsBridgeCallListener jsBridgeCallListener;
    private double lastExposurePrcnt;
    private int notModifiedActivityOrientation;
    private int screenHeight;
    private int screenWidth;
    private boolean showingAd;

    @Nullable
    private ViewTreeInspector viewTreeInspector;
    private WebView webView;
    private RelativeLayout webViewContainer;

    @NonNull
    private WebViewLoadContentType webViewLoadContentType;

    /* JADX INFO: renamed from: com.mobilefuse.sdk.mraid.MraidAdRenderer$5, reason: invalid class name */
    class AnonymousClass5 implements ResultCallback {
        final /* synthetic */ String val$admTag;
        final /* synthetic */ String val$environmentSetup;
        final /* synthetic */ String val$webViewInitCall;

        AnonymousClass5(String str, String str2, String str3) {
            this.val$admTag = str;
            this.val$webViewInitCall = str2;
            this.val$environmentSetup = str3;
        }

        public static /* synthetic */ void a(AnonymousClass5 anonymousClass5, String str) {
            anonymousClass5.getClass();
            try {
                if (MraidAdRenderer.this.webView == null) {
                    return;
                }
                MraidAdRenderer.this.webView.loadDataWithBaseURL(MraidAdRenderer.WEB_VIEW_BASE_URL, str, "text/html", "UTF-8", null);
            } catch (Throwable th2) {
                StabilityHelper.logException(anonymousClass5, th2);
            }
        }

        @Override // com.mobilefuse.sdk.assetsmanager.ResultCallback
        public void onResult(@Nullable Object obj) {
            try {
                final String strInjectOmidScriptContentIntoAdm = this.val$admTag + this.val$webViewInitCall;
                if (obj != null) {
                    strInjectOmidScriptContentIntoAdm = obj.toString().replace("{ADM_CONTENT}", strInjectOmidScriptContentIntoAdm).replace("{MRAID_ENV_CONFIG}", this.val$environmentSetup).replace("{MRAID_BRIDGE_INIT}", "<script>mraid.bridge.init(MRAID_ENV);</script>");
                }
                if (MraidAdRenderer.this.hasOmidBridge()) {
                    strInjectOmidScriptContentIntoAdm = ((MraidOmidBridge) ((BaseAdRenderer) MraidAdRenderer.this).omidBridge).injectOmidScriptContentIntoAdm(strInjectOmidScriptContentIntoAdm);
                }
                MraidAdRenderer.this.handler.post(new Runnable() { // from class: com.mobilefuse.sdk.mraid.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        MraidAdRenderer.AnonymousClass5.a(this.f53407b, strInjectOmidScriptContentIntoAdm);
                    }
                });
            } catch (Throwable th2) {
                StabilityHelper.logException(this, th2);
            }
        }
    }

    public interface JsBridgeCallListener {
        Map<String, Boolean> getMraidSupportsList();

        boolean onBridgeCall(Uri uri);
    }

    public enum MraidAdLifecycleEvent implements AdLifecycleEvent {
        MRAID_CREATE_CALENDAR_EVENT
    }

    public enum MraidExtendedAdType implements ExtendedAdType {
        INTERSTITIAL_TRANSPARENT,
        SPLASH
    }

    enum WebViewLoadContentType {
        URL,
        ADM
    }

    public MraidAdRenderer(Context context, AdRendererConfig adRendererConfig, AdRendererListener adRendererListener) throws Throwable {
        super(context, adRendererConfig, adRendererListener);
        this.webViewLoadContentType = WebViewLoadContentType.ADM;
        this.handler = new Handler(Looper.getMainLooper());
        this.notModifiedActivityOrientation = -1;
        this.lastExposurePrcnt = -1.0d;
        this.isMraidBridgeLoaded = Boolean.FALSE;
        this.screenWidth = 0;
        this.screenHeight = 0;
        this.jsBridgeCallListener = null;
        MraidFeatureDetection.initialize(context);
        createContainer();
        startActivityLifecycleChecking();
    }

    public static /* synthetic */ void a(MraidAdRenderer mraidAdRenderer, List list) throws Throwable {
        T t10 = mraidAdRenderer.omidBridge;
        if (t10 == 0) {
            return;
        }
        ((MraidOmidBridge) t10).removeAllFriendlyObstructions();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            if (view != mraidAdRenderer.closeBtn && !mraidAdRenderer.externalFriendlyObstructions.contains(view)) {
                ((MraidOmidBridge) mraidAdRenderer.omidBridge).addFriendlyObstruction(view, OmidFriendlyObstructionPurpose.NOT_VISIBLE, null);
            }
        }
        mraidAdRenderer.updateCloseBtnAsOmidFriendlyObstruction();
        mraidAdRenderer.addRegisteredExternalFriendlyObstructions();
    }

    private void addCloseButton(boolean z10) throws Throwable {
        RelativeLayout.LayoutParams layoutParams;
        CloseConfigResponse closeConfigResponse = this.config.getCloseConfigResponse();
        String uiAdm = this.config.getUiAdm();
        if (this.closeBtn == null) {
            CloseButton closeButton = new CloseButton(this.context, 60, R.id.closeBtn, new Function0() { // from class: com.mobilefuse.sdk.mraid.k
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MraidAdRenderer.k(this.f53405b);
                }
            }, new Function0() { // from class: com.mobilefuse.sdk.mraid.l
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MraidAdRenderer.i(this.f53406b);
                }
            }, this.config.getCloseConfigResponse(), uiAdm);
            this.closeBtn = closeButton;
            closeButton.setOnVisibilityChange(new Function1() { // from class: com.mobilefuse.sdk.mraid.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MraidAdRenderer.l(this.f53396b, (Boolean) obj);
                }
            });
            if (closeConfigResponse == null || this.closeBtn.getCloseConfigPx() == null) {
                layoutParams = new RelativeLayout.LayoutParams(this.closeBtn.getInteractionSizePx(), this.closeBtn.getInteractionSizePx());
                layoutParams.addRule(11);
                layoutParams.addRule(10);
                layoutParams.alignWithParent = true;
            } else {
                layoutParams = PositionUtils.addPositionRules(new RelativeLayout.LayoutParams((int) this.closeBtn.getCloseConfigPx().getWidth(), (int) this.closeBtn.getCloseConfigPx().getHeight()), closeConfigResponse);
                layoutParams.alignWithParent = true;
            }
            this.webViewContainer.addView(this.closeBtn, layoutParams);
        }
        this.closeBtn.setTransparent(z10);
        ExtendedController extendedController = this.extendedController;
        if (!(extendedController instanceof SplashAdController)) {
            this.closeBtn.setThumbnailMode(this.config.isThumbnailSize());
        } else {
            ((SplashAdController) extendedController).setExpandedCloseBtnTransparent(z10);
            this.closeBtn.setThumbnailMode(true);
        }
    }

    public static /* synthetic */ void b(MraidAdRenderer mraidAdRenderer) {
        mraidAdRenderer.getClass();
        try {
            if (mraidAdRenderer.hasOmidBridge()) {
                ((MraidOmidBridge) mraidAdRenderer.omidBridge).signalAdImpressionEvent();
            }
        } catch (Throwable th2) {
            StabilityHelper.logException(mraidAdRenderer, th2);
        }
    }

    private void bridge_NotifyReadyEvents() throws Throwable {
        WebView webView = this.webView;
        if (webView == null) {
            return;
        }
        webView.evaluateJavascript("mraid.bridge.notifyReadyEvent();", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bridge_NotifySizeChangeEvent(int i10, int i11) throws Throwable {
        WebView webView = this.webView;
        if (webView == null) {
            return;
        }
        webView.evaluateJavascript("mraid.bridge.notifySizeChangeEvent(" + i10 + ", " + i11 + ");", null);
    }

    private void bridge_SetState(String str) throws Throwable {
        WebView webView = this.webView;
        if (webView == null) {
            return;
        }
        webView.evaluateJavascript("mraid.bridge.setState(Mraid.State." + str + ");", null);
    }

    public static /* synthetic */ Unit c(MraidAdRenderer mraidAdRenderer) {
        mraidAdRenderer.getClass();
        try {
            mraidAdRenderer.requestAdClose();
        } catch (Throwable th2) {
            StabilityHelper.logException(mraidAdRenderer, th2);
        }
        return Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void closeAd(boolean z10) throws Throwable {
        WebView webView;
        Activity activity;
        if (this.showingAd) {
            if (this.config.isFullscreenAd() || z10) {
                this.showingAd = false;
            }
            dismissBannerExpandedWindow();
            if (this.activityOrientationChanged) {
                if (!this.config.isFullscreenAd() && (activity = this.renderingActivity) != null) {
                    activity.setRequestedOrientation(this.notModifiedActivityOrientation);
                    Utils.unlockOrientation(this.renderingActivity);
                }
                this.notModifiedActivityOrientation = -1;
                this.activityOrientationChanged = false;
            }
            if (this.expanded) {
                this.expanded = false;
                this.closingAd = false;
                if (!z10) {
                    removeCloseButton();
                    bridge_SetState("DEFAULT");
                    this.webView.setLayoutParams(this.bannerInlineLayoutParams);
                    this.contentContainer.addView(this.webViewContainer, this.bannerInlineLayoutParams);
                    this.listener.onFullscreenChanged(false);
                }
            } else {
                this.webView.stopLoading();
                onAdClosed();
            }
            if (z10 && (webView = this.webView) != null) {
                if (webView.getParent() != null) {
                    ((ViewGroup) this.webView.getParent()).removeView(this.webView);
                }
                this.webView.loadUrl(AndroidWebViewClient.BLANK_PAGE);
            }
            ExtendedController extendedController = this.extendedController;
            if (extendedController != null) {
                extendedController.unbindContent();
                this.extendedController = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int convertPxToDp(int i10) {
        try {
            return Utils.convertPxToDp(this.context, i10);
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
            return 0;
        }
    }

    private void createContainer() throws Throwable {
        this.webViewContainer = new RelativeLayout(this.context);
        this.webViewContainer.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.webViewContainer.setGravity(8388659);
        MraidAdRendererContainer mraidAdRendererContainer = new MraidAdRendererContainer(this.context);
        this.contentContainer = mraidAdRendererContainer;
        mraidAdRendererContainer.setViewableChangeListener(new MraidAdRendererContainer.ViewableChangeListener() { // from class: com.mobilefuse.sdk.mraid.MraidAdRenderer.1
            @Override // com.mobilefuse.sdk.mraid.MraidAdRendererContainer.ViewableChangeListener
            public void onViewableChange(int i10, int i11, int i12, int i13, double d10, Rect rect) throws Throwable {
                if (MraidAdRenderer.this.expanded) {
                    d10 = 100.0d;
                }
                if (MraidAdRenderer.this.lastExposurePrcnt != d10 && d10 > 0.0d) {
                    MraidAdRenderer mraidAdRenderer = MraidAdRenderer.this;
                    mraidAdRenderer.setCurrentPosition(mraidAdRenderer.convertPxToDp(i12), MraidAdRenderer.this.convertPxToDp(i13), MraidAdRenderer.this.convertPxToDp(i10), MraidAdRenderer.this.convertPxToDp(i11));
                }
                MraidAdRenderer.this.lastExposurePrcnt = d10;
                MraidAdRenderer mraidAdRenderer2 = MraidAdRenderer.this;
                mraidAdRenderer2.dispatchAdmExposureChangeEvent(mraidAdRenderer2.lastExposurePrcnt, i10, i11, rect);
            }
        });
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        this.contentContainer.addView(this.webViewContainer);
        this.contentContainer.setLayoutParams(layoutParams);
        this.contentContainer.setAttachedToWindowCallback(new Runnable() { // from class: com.mobilefuse.sdk.mraid.d
            @Override // java.lang.Runnable
            public final void run() {
                MraidAdRenderer.h(this.f53398b);
            }
        });
        this.contentContainer.setDetachedFromWindowCallback(new Runnable() { // from class: com.mobilefuse.sdk.mraid.e
            @Override // java.lang.Runnable
            public final void run() {
                MraidAdRenderer.j(this.f53399b);
            }
        });
        if (this.config.isFullscreenAd() || this.config.isCloseButtonEnabled()) {
            addCloseButton(false);
        }
    }

    private void createExternalController() throws Throwable {
        ExtendedAdType extendedAdType = this.extendedAdType;
        MraidExtendedAdType mraidExtendedAdType = MraidExtendedAdType.SPLASH;
        if (extendedAdType != mraidExtendedAdType || this.renderingActivity == null) {
            return;
        }
        this.extendedController = new SplashAdController(this.renderingActivity, this.contentContainer, this.webView, this.omidBridge, new Function0() { // from class: com.mobilefuse.sdk.mraid.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MraidAdRenderer.c(this.f53402b);
            }
        }, new Function1() { // from class: com.mobilefuse.sdk.mraid.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MraidAdRenderer.g(this.f53403b, (Throwable) obj);
            }
        }, new Function1() { // from class: com.mobilefuse.sdk.mraid.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MraidAdRenderer.e(this.f53404b, (Boolean) obj);
            }
        });
        ObservableConfig observableConfig = this.observableConfig;
        if (observableConfig != null) {
            ObservableConfigKey observableConfigKey = ObservableConfigKey.POSITION;
            if (observableConfig.hasValue(observableConfigKey) && this.extendedAdType == mraidExtendedAdType) {
                ((SplashAdController) this.extendedController).setAnchor(this.observableConfig.getIntValue(observableConfigKey, 3));
            }
        }
        CloseButton closeButton = this.closeBtn;
        if (closeButton != null) {
            closeButton.setThumbnailMode(true);
        }
    }

    private void createWebView() throws Throwable {
        if (this.webView != null) {
            return;
        }
        WebView webView = new WebView(this.context);
        this.webView = webView;
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowContentAccess(true);
        settings.setUseWideViewPort(false);
        settings.setMixedContentMode(0);
        settings.setMediaPlaybackRequiresUserGesture(false);
        this.webView.setHorizontalScrollbarOverlay(false);
        this.webView.setHorizontalScrollBarEnabled(false);
        this.webView.setVerticalScrollbarOverlay(false);
        this.webView.setVerticalScrollBarEnabled(false);
        this.webView.setOverScrollMode(2);
        this.webView.setLayerType(2, null);
        if (isTransparentBackground()) {
            this.webView.setBackgroundColor(0);
        } else {
            updateWebViewBackgroundColor();
        }
        this.webView.setWebViewClient(new WebViewClient() { // from class: com.mobilefuse.sdk.mraid.MraidAdRenderer.2
            @Override // android.webkit.WebViewClient
            public void onLoadResource(WebView webView2, String str) {
                try {
                    HttpRequestTracker.logHttpRequest(str);
                } catch (Throwable th2) {
                    StabilityHelper.logException(this, th2);
                }
                super.onLoadResource(webView2, str);
            }

            @Override // android.webkit.WebViewClient
            @RequiresApi(api = 19)
            public void onPageFinished(WebView webView2, String str) {
                if (str != null) {
                    try {
                        if (str.equals(AndroidWebViewClient.BLANK_PAGE)) {
                            return;
                        }
                    } catch (Throwable th2) {
                        StabilityHelper.logException(this, th2);
                    }
                }
                MraidAdRenderer.this.onAdmLoaded();
                Log.d("MRAID", "onPageFinished | init mraid.js");
                if (((BaseAdRenderer) MraidAdRenderer.this).extendedController instanceof SplashAdController) {
                    ((SplashAdController) ((BaseAdRenderer) MraidAdRenderer.this).extendedController).onWebViewPageFinished();
                }
                super.onPageFinished(webView2, str);
            }

            @Override // android.webkit.WebViewClient
            public boolean onRenderProcessGone(WebView webView2, RenderProcessGoneDetail renderProcessGoneDetail) {
                try {
                    if (webView2 != MraidAdRenderer.this.webView) {
                        return true;
                    }
                    Log.w("Mraid Ad Renderer", "WebView Render Process has gone.");
                    MraidAdRenderer.this.onAdRuntimeError(RtbLossReason.INTERNAL_ERROR);
                } catch (Throwable th2) {
                    StabilityHelper.logException(this, th2);
                }
                return true;
            }

            @Override // android.webkit.WebViewClient
            @Nullable
            public WebResourceResponse shouldInterceptRequest(WebView webView2, String str) {
                try {
                    Uri uri = Uri.parse(str);
                    WebResourceResponse webResourceResponseHandleBridgeCallFromFetch = MraidAdRenderer.this.handleBridgeCallFromFetch(uri);
                    return webResourceResponseHandleBridgeCallFromFetch != null ? webResourceResponseHandleBridgeCallFromFetch : WebViewUtils.shouldInterceptRequest(((BaseAdRenderer) MraidAdRenderer.this).context, uri);
                } catch (Throwable th2) {
                    StabilityHelper.logException(this, th2);
                    return super.shouldInterceptRequest(webView2, str);
                }
            }

            @Override // android.webkit.WebViewClient
            @RequiresApi(api = 19)
            public boolean shouldOverrideUrlLoading(WebView webView2, String str) {
                try {
                    return MraidAdRenderer.this.shouldOverrideUrl(str);
                } catch (Throwable th2) {
                    StabilityHelper.logException(this, th2);
                    return true;
                }
            }

            @Override // android.webkit.WebViewClient
            @TargetApi(24)
            public boolean shouldOverrideUrlLoading(WebView webView2, WebResourceRequest webResourceRequest) {
                try {
                    boolean z10 = webResourceRequest.hasGesture() && !webResourceRequest.isRedirect();
                    boolean booleanValue = ((BaseAdRenderer) MraidAdRenderer.this).observableConfig.getBooleanValue(ObservableConfigKey.ALLOW_CLICKTHROUGH_WITHOUT_TAP, false);
                    if (z10 || booleanValue) {
                        return MraidAdRenderer.this.shouldOverrideUrl(webResourceRequest.getUrl().toString());
                    }
                    return true;
                } catch (Throwable th2) {
                    StabilityHelper.logException(this, th2);
                    return true;
                }
            }

            @Override // android.webkit.WebViewClient
            @RequiresApi(api = 21)
            public WebResourceResponse shouldInterceptRequest(WebView webView2, WebResourceRequest webResourceRequest) {
                if (webResourceRequest == null) {
                    return null;
                }
                try {
                    WebResourceResponse webResourceResponseHandleBridgeCallFromFetch = MraidAdRenderer.this.handleBridgeCallFromFetch(webResourceRequest.getUrl());
                    return webResourceResponseHandleBridgeCallFromFetch != null ? webResourceResponseHandleBridgeCallFromFetch : WebViewUtils.shouldInterceptRequest(((BaseAdRenderer) MraidAdRenderer.this).context, webResourceRequest.getUrl());
                } catch (Throwable th2) {
                    StabilityHelper.logException(this, th2);
                    return super.shouldInterceptRequest(webView2, webResourceRequest);
                }
            }
        });
        this.webView.setWebChromeClient(new WebChromeClient() { // from class: com.mobilefuse.sdk.mraid.MraidAdRenderer.3
            @Override // android.webkit.WebChromeClient
            @Nullable
            public Bitmap getDefaultVideoPoster() {
                try {
                    Bitmap defaultVideoPoster = super.getDefaultVideoPoster();
                    if (defaultVideoPoster != null) {
                        return defaultVideoPoster;
                    }
                } catch (Throwable unused) {
                }
                try {
                    return Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                } catch (Throwable th2) {
                    StabilityHelper.logException(this, th2);
                    return null;
                }
            }
        });
    }

    private void dismissBannerExpandedWindow() {
        try {
            PopupWindow popupWindow = this.bannerExpandedWindow;
            this.bannerExpandedWindow = null;
            if (popupWindow == null) {
                return;
            }
            popupWindow.dismiss();
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchAdmExposureChangeEvent(double d10, double d11, double d12, Rect rect) throws Throwable {
        String str;
        if (this.webView == null) {
            return;
        }
        String str2 = String.format(Locale.US, "%.2f", Double.valueOf(d10));
        if (rect == null) {
            str = "null";
        } else {
            str = "{  \"x\": " + convertPxToDp((int) d11) + ",  \"y\": " + convertPxToDp((int) d12) + ",  \"width\": " + convertPxToDp(rect.width()) + ",  \"height\": " + convertPxToDp(rect.height()) + "}";
        }
        this.webView.evaluateJavascript("mraid.bridge.setExposureChange(" + str2 + StringUtils.COMMA + str + StringUtils.COMMA + "null);", null);
        boolean z10 = d10 > 50.0d;
        this.webView.evaluateJavascript("mraid.bridge.setIsViewable(" + z10 + ");", null);
    }

    public static /* synthetic */ Unit e(MraidAdRenderer mraidAdRenderer, Boolean bool) {
        if (mraidAdRenderer.closeBtn != null) {
            if (bool.booleanValue()) {
                mraidAdRenderer.closeBtn.show();
            } else {
                mraidAdRenderer.closeBtn.hide();
            }
        }
        return Unit.f93236a;
    }

    public static /* synthetic */ void f(MraidAdRenderer mraidAdRenderer) {
        mraidAdRenderer.getClass();
        try {
            mraidAdRenderer.onAdPreloaded();
        } catch (Throwable th2) {
            StabilityHelper.logException(mraidAdRenderer, th2);
        }
    }

    public static /* synthetic */ Unit g(MraidAdRenderer mraidAdRenderer, Throwable th2) {
        mraidAdRenderer.getClass();
        try {
            mraidAdRenderer.closeAd(true);
        } catch (Throwable unused) {
            StabilityHelper.logException(mraidAdRenderer, th2);
        }
        return Unit.f93236a;
    }

    private long getCloseButtonShowDelay() {
        try {
            String str = "MraidRenderer skipOffset:\n";
            ObservableConfig observableConfig = this.observableConfig;
            ObservableConfigKey observableConfigKey = ObservableConfigKey.FORCE_SKIP_SECONDS;
            float floatValue = -1.0f;
            if (observableConfig.hasValue(observableConfigKey)) {
                floatValue = this.observableConfig.getFloatValue(observableConfigKey, -1.0f);
                str = "MraidRenderer skipOffset:\n* use value from MFX bid response \"skipAdSeconds\"=" + floatValue + IOUtils.LINE_SEPARATOR_UNIX;
            } else {
                ObservableConfig observableConfig2 = this.observableConfig;
                ObservableConfigKey observableConfigKey2 = ObservableConfigKey.MRAID_AD_SKIPOFFSET_SECONDS;
                if (observableConfig2.hasValue(observableConfigKey2)) {
                    floatValue = this.observableConfig.getFloatValue(observableConfigKey2, -1.0f);
                    str = "MraidRenderer skipOffset:\n* use SDK hardcoded \"skipAdSeconds\"=" + floatValue + IOUtils.LINE_SEPARATOR_UNIX;
                }
            }
            if (floatValue < 0.0f) {
                str = str + "* \"skipAdSeconds\" is less than 0, set it to 0";
                floatValue = 0.0f;
            }
            Log.d("MRAID", str);
            return ((long) floatValue) * 1000;
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
            return 0L;
        }
    }

    public static List<ApiFramework> getSupportedApiFrameworks() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ApiFramework.MRAID1);
        arrayList.add(ApiFramework.MRAID2);
        arrayList.add(ApiFramework.MRAID3);
        arrayList.add(ApiFramework.OMID1);
        return arrayList;
    }

    public static /* synthetic */ void h(MraidAdRenderer mraidAdRenderer) {
        mraidAdRenderer.getClass();
        try {
            ViewTreeInspector viewTreeInspector = mraidAdRenderer.viewTreeInspector;
            if (viewTreeInspector != null) {
                viewTreeInspector.startObstructionsChecking();
            }
        } catch (Throwable th2) {
            StabilityHelper.logException(mraidAdRenderer, th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(api = 19)
    public void handleBridgeCall(Uri uri) throws Throwable {
        String host = uri.getHost();
        Log.d("MRAID", "Call: " + host);
        if (this.closingAd) {
            return;
        }
        try {
            switch (host) {
                case "open":
                    onClickThrough(this.context, uri.getQueryParameter("url"));
                    break;
                case "expand":
                    if (!this.config.isFullscreenAd() && !this.expanded) {
                        this.bannerInlineLayoutParams = (RelativeLayout.LayoutParams) this.webView.getLayoutParams();
                        this.contentContainer.removeView(this.webViewContainer);
                        this.webView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                        boolean z10 = Boolean.parseBoolean(uri.getQueryParameter("allowOrientationChange"));
                        String queryParameter = uri.getQueryParameter("forceOrientation");
                        if (this.renderingActivity != null && queryParameter != null) {
                            this.notModifiedActivityOrientation = this.context.getResources().getConfiguration().orientation;
                            this.activityOrientationChanged = true;
                            Utils.lockOrientationFromExpand(this.renderingActivity, z10, queryParameter);
                        }
                        View rootView = this.contentContainer.getRootView();
                        this.webView.setScaleX(1.0f);
                        this.webView.setScaleY(1.0f);
                        PopupWindow popupWindow = new PopupWindow((View) this.webViewContainer, -1, -1, true);
                        this.bannerExpandedWindow = popupWindow;
                        popupWindow.showAtLocation(rootView, 48, 0, 0);
                        bridge_SetState("EXPANDED");
                        this.expanded = true;
                        addCloseButton(uri.getBooleanQueryParameter("useCustomClose", false));
                        this.closeBtn.show();
                        this.listener.onFullscreenChanged(true);
                        bridge_NotifySizeChangeEvent(this.screenWidth, this.screenHeight);
                        setCurrentPosition(this.screenWidth, this.screenHeight, 0, 0);
                        break;
                    }
                    return;
                case "close":
                    requestAdClose();
                    break;
                case "initBridge":
                    Boolean bool = Boolean.TRUE;
                    this.isMraidBridgeLoaded = bool;
                    startListeningLayoutChange();
                    String str = this.config.isFullscreenAd() ? "Mraid.PlacementType.INTERSTITIAL" : "Mraid.PlacementType.INLINE";
                    this.webView.evaluateJavascript("mraid.bridge.setPlacementType(" + str + ");", null);
                    setSupports();
                    setAdProperties(bool);
                    bridge_SetState("DEFAULT");
                    bridge_NotifyReadyEvents();
                    onAdImpression();
                    break;
                case "useCustomClose":
                    addCloseButton(uri.getBooleanQueryParameter("shouldUseCustomClose", false));
                    break;
                case "setOrientationProperties":
                    setOrientationProperties(uri);
                    break;
                case "unload":
                    if (!this.showingAd) {
                        onAdRuntimeError(RtbLossReason.INTERNAL_ERROR);
                        break;
                    } else {
                        requestAdClose();
                        break;
                    }
                    break;
                case "splashAdTransition":
                    ExtendedController extendedController = this.extendedController;
                    if (extendedController instanceof SplashAdController) {
                        ((SplashAdController) extendedController).requestTransition();
                        break;
                    }
                    break;
                case "splashAdExpand":
                    if (this.extendedController instanceof SplashAdController) {
                        removeCloseBtnOmidFriendlyObstruction();
                        ((SplashAdController) this.extendedController).requestExpand();
                        break;
                    }
                    break;
                case "eventListenerWasAdded":
                    verifyEventAdded(uri);
                    break;
                default:
                    JsBridgeCallListener jsBridgeCallListener = this.jsBridgeCallListener;
                    if (jsBridgeCallListener == null || !jsBridgeCallListener.onBridgeCall(uri)) {
                        Log.w("Mraid", "Unimplemented command called: " + host);
                        break;
                    }
                    break;
            }
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
            AdRendererListener adRendererListener = this.listener;
            if (adRendererListener != null) {
                adRendererListener.onAdRuntimeError(RtbLossReason.INTERNAL_ERROR);
            }
        }
        WebView webView = this.webView;
        if (webView != null) {
            webView.evaluateJavascript("mraid.bridge.nativeCallComplete();", null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WebResourceResponse handleBridgeCallFromFetch(Uri uri) {
        if (uri == null) {
            return null;
        }
        try {
            String string = uri.toString();
            if (string == null) {
                return null;
            }
            String str = WEB_VIEW_BASE_URL + "/mraid/";
            if (!string.startsWith(str)) {
                return null;
            }
            final Uri uri2 = Uri.parse(string.replace(str, "mraid://"));
            this.handler.post(new Runnable() { // from class: com.mobilefuse.sdk.mraid.MraidAdRenderer.4
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        MraidAdRenderer.this.handleBridgeCall(uri2);
                    } catch (Throwable th2) {
                        StabilityHelper.logException(this, th2);
                    }
                }
            });
            return new WebResourceResponse(AssetHelper.DEFAULT_MIME_TYPE, D5.N, new ByteArrayInputStream("".getBytes()));
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
            return null;
        }
    }

    public static /* synthetic */ Unit i(MraidAdRenderer mraidAdRenderer) {
        mraidAdRenderer.getClass();
        try {
            Log.d("MRAID", "Close button clicked");
            mraidAdRenderer.requestAdClose();
        } catch (Throwable th2) {
            StabilityHelper.logException(mraidAdRenderer, th2);
        }
        return Unit.f93236a;
    }

    public static /* synthetic */ void j(MraidAdRenderer mraidAdRenderer) {
        mraidAdRenderer.getClass();
        try {
            ViewTreeInspector viewTreeInspector = mraidAdRenderer.viewTreeInspector;
            if (viewTreeInspector != null) {
                viewTreeInspector.stopObstructionsChecking();
            }
        } catch (Throwable th2) {
            StabilityHelper.logException(mraidAdRenderer, th2);
        }
    }

    public static /* synthetic */ Unit k(MraidAdRenderer mraidAdRenderer) {
        mraidAdRenderer.dispatchSkipAdAvailability();
        return Unit.f93236a;
    }

    public static /* synthetic */ Unit l(MraidAdRenderer mraidAdRenderer, Boolean bool) {
        mraidAdRenderer.updateCloseBtnAsOmidFriendlyObstruction();
        return Unit.f93236a;
    }

    private void loadAdmInWebView(String str) throws Throwable {
        String string;
        try {
            string = new JSONObject().put("version", "3.0").put("sdk", "mfx").put("sdkVersion", this.config.getSdkVersion()).put(RemoteConfigConstants.RequestFieldKey.APP_ID, this.context.getPackageName()).put(EidRequestBuilder.REQUEST_FIELD_IFA, this.config.getAdvertisingId()).put("limitAdTracking", this.config.isLimitTrackingEnabled()).put("coppa", this.config.isSubjectToCoppa()).put("debug", this.config.isTestMode()).toString();
        } catch (JSONException e10) {
            StabilityHelper.logException(this, e10);
            string = JsonUtils.EMPTY_JSON;
        }
        MobileFuseAssetManager.INSTANCE.getSpecificAssetContent("ad_template.html", this.context, new AnonymousClass5(str, "", "<script>window.MRAID_ENV = " + string + ";</script>"));
    }

    private void onAdImpression() {
        try {
            WebView webView = this.webView;
            if (webView == null) {
                return;
            }
            if (hasOmidBridge()) {
                ((MraidOmidBridge) this.omidBridge).initAdSession(this.context, webView);
                updateCloseBtnAsOmidFriendlyObstruction();
                addRegisteredExternalFriendlyObstructions();
                ((MraidOmidBridge) this.omidBridge).startAdSession();
                ((MraidOmidBridge) this.omidBridge).signalAdLoadedEvent();
                ViewTreeInspector viewTreeInspector = new ViewTreeInspector(webView, new ViewTreeInspector.ObstructionsChangeListener() { // from class: com.mobilefuse.sdk.mraid.f
                    @Override // com.mobilefuse.sdk.omid.viewtree.ViewTreeInspector.ObstructionsChangeListener
                    public final void onChanged(List list) throws Throwable {
                        MraidAdRenderer.a(this.f53400a, list);
                    }
                });
                this.viewTreeInspector = viewTreeInspector;
                viewTreeInspector.startObstructionsChecking();
                signalOmidAdImpression();
            }
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
        try {
            reportAdImpression();
        } catch (Throwable th3) {
            StabilityHelper.logException(this, th3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAdmLoaded() {
        try {
            if (this.webView == null) {
                return;
            }
            ExtendedController extendedController = this.extendedController;
            if (extendedController != null) {
                extendedController.onAdmLoaded();
            }
            this.contentContainer.hideProgressBar();
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    private void onClickThrough(Context context, String str) {
        String strProcessClickMacro;
        if (str != null) {
            try {
                if (!str.isEmpty() && context != null) {
                    if (str.contains(CLICKTHROUGH_CONSTANT) && (strProcessClickMacro = processClickMacro()) != null) {
                        str = str.replace(CLICKTHROUGH_CONSTANT, strProcessClickMacro);
                    }
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                    intent.addFlags(268435456);
                    if (intent.resolveActivity(context.getPackageManager()) != null) {
                        context.startActivity(intent);
                        this.listener.onAdClicked(str);
                        return;
                    }
                    return;
                }
            } catch (Throwable th2) {
                StabilityHelper.logException(this, th2);
                return;
            }
        }
        String str2 = "onClickThrough called but URL or context are null" + str;
        Log.e("Mraid", str2);
        Telemetry.logException(this, new Throwable(str2));
    }

    @Nullable
    private String processClickMacro() {
        AdmClickInfo admClickInfo;
        try {
            AdmClickInfoProvider admClickInfoProvider = this.admClickInfoProvider;
            if (admClickInfoProvider != null && (admClickInfo = admClickInfoProvider.getAdmClickInfo()) != null) {
                sendEvents(admClickInfo.getClickTracking());
                return admClickInfo.getClickThroughUrl();
            }
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
        return null;
    }

    private void removeCloseBtnOmidFriendlyObstruction() {
        CloseButton closeButton;
        try {
            if (hasOmidBridge() && (closeButton = this.closeBtn) != null) {
                ((MraidOmidBridge) this.omidBridge).removeFriendlyObstruction(closeButton);
            }
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    private void removeCloseButton() throws Throwable {
        CloseButton closeButton = this.closeBtn;
        if (closeButton == null) {
            return;
        }
        try {
            ((ViewGroup) closeButton.getParent()).removeView(this.closeBtn);
        } catch (Throwable unused) {
        }
        this.closeBtn.destroy();
        this.closeBtn = null;
    }

    private void requestAdClose() throws Throwable {
        this.closingAd = true;
        if (this.expanded) {
            bridge_SetState("DEFAULT");
        } else if (this.config.isFullscreenAd()) {
            bridge_SetState("HIDDEN");
        }
        ExtendedController extendedController = this.extendedController;
        if (extendedController != null) {
            extendedController.requestAdClose(new ExtendedController.AdCloseListener() { // from class: com.mobilefuse.sdk.mraid.a
                @Override // com.mobilefuse.sdk.ad.rendering.ExtendedController.AdCloseListener
                public final void onAdClosed() throws Throwable {
                    this.f53395a.closeAd(false);
                }
            });
        } else {
            closeAd(false);
        }
    }

    private void requestAdPositionUpdate() throws Throwable {
        ((MraidAdRendererContainer) this.contentContainer).checkPosition();
    }

    private void sendEvents(List<String> list) {
        AdClickTracker.sendEvents(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdProperties(Boolean bool) {
        try {
            if (this.isMraidBridgeLoaded.booleanValue()) {
                setCurrentAppOrientation();
                setScreenDimensions();
                setMaxSizeAndPosition(bool);
            }
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    @RequiresApi(api = 19)
    private void setCurrentAppOrientation() throws Throwable {
        if (this.webView == null) {
            return;
        }
        try {
            Activity activity = this.renderingActivity;
            String str = activity != null ? activity.getResources().getConfiguration().orientation == 1 ? "portrait" : "landscape" : "none";
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("orientation", str);
            jSONObject.put("locked", false);
            String string = jSONObject.toString();
            this.webView.evaluateJavascript("mraid.bridge.setCurrentAppOrientation(" + string + ");", null);
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentPosition(int i10, int i11, int i12, int i13) {
        this.webView.evaluateJavascript("mraid.bridge.setCurrentPosition({\"x\": " + i12 + ", \"y\": " + i13 + ", \"width\": " + i10 + ", \"height\": " + i11 + "});", null);
    }

    private void setLocation() {
        LocationData lastKnownLocationData;
        try {
            if (this.config.isLimitTrackingEnabled() || (lastKnownLocationData = GetLastKnownLocationDataKt.getLastKnownLocationData()) == null) {
                return;
            }
            this.webView.evaluateJavascript("mraid.bridge.setLocation({\"lat\": " + lastKnownLocationData.getLatitude() + ", \"lon\": " + lastKnownLocationData.getLongitude() + ", \"type\": 1, \"accuracy\": " + lastKnownLocationData.getAccuracy() + ", \"lastfix\": " + lastKnownLocationData.getLastFixSeconds() + "});", null);
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    private void setOrientationProperties(Uri uri) throws Throwable {
        int i10;
        int i11 = 2;
        if (this.renderingActivity == null) {
            return;
        }
        boolean z10 = Boolean.parseBoolean(uri.getQueryParameter("allowOrientationChange"));
        String queryParameter = uri.getQueryParameter("forceOrientation");
        if (this.expanded || this.config.isFullscreenAd()) {
            if (z10) {
                this.renderingActivity.setRequestedOrientation(-1);
                return;
            }
            i10 = this.context.getResources().getConfiguration().orientation;
            queryParameter.getClass();
            switch (queryParameter) {
                case "none":
                    i11 = i10;
                    break;
                case "portrait":
                    i11 = 1;
                    break;
                case "landscape":
                    break;
                default:
                    i11 = 0;
                    break;
            }
            Utils.setActivityOrientation(this.renderingActivity, i11);
        }
    }

    private void setScreenDimensions() {
        try {
            if (this.webView == null) {
                return;
            }
            int[] screenSizeAsPixels = Utils.getScreenSizeAsPixels(this.context);
            this.screenWidth = convertPxToDp(screenSizeAsPixels[0]);
            this.screenHeight = convertPxToDp(screenSizeAsPixels[1]);
            this.webView.evaluateJavascript("mraid.bridge.setScreenSize({\"width\": " + this.screenWidth + ", \"height\": " + this.screenHeight + "});", null);
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    @RequiresApi(api = 19)
    private void setSupports() throws Throwable {
        Map<String, Boolean> mraidSupportsList;
        if (this.webView == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(MRAIDNativeFeature.SMS, MraidFeatureDetection.getSmsSupport());
            jSONObject.put(MRAIDNativeFeature.TEL, MraidFeatureDetection.getTelSupport());
            jSONObject.put(MRAIDNativeFeature.CALENDAR, false);
            jSONObject.put(MRAIDNativeFeature.STORE_PICTURE, false);
            jSONObject.put(MRAIDNativeFeature.INLINE_VIDEO, true);
            jSONObject.put("ar", true);
            jSONObject.put("barometricPressure", true);
            jSONObject.put(MRAIDNativeFeature.VPAID, MraidFeatureDetection.getVpaidSupported());
            jSONObject.put("location", MraidFeatureDetection.getLocationSupport());
            JsBridgeCallListener jsBridgeCallListener = this.jsBridgeCallListener;
            if (jsBridgeCallListener != null && (mraidSupportsList = jsBridgeCallListener.getMraidSupportsList()) != null) {
                for (Map.Entry<String, Boolean> entry : mraidSupportsList.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            }
            if (this.extendedAdType == MraidExtendedAdType.SPLASH) {
                jSONObject.put("splashAd", true);
            }
            if (this.config.isFullscreenAd()) {
                jSONObject.put("transparentBackground", true);
            }
            String string = jSONObject.toString();
            this.webView.evaluateJavascript("mraid.bridge.setSupports(" + string + ");", null);
            if (MraidFeatureDetection.getLocationSupport()) {
                setLocation();
            }
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean shouldOverrideUrl(String str) {
        if (str == null) {
            return true;
        }
        try {
            Uri uri = Uri.parse(str);
            String scheme = uri.getScheme();
            if (scheme == null) {
                return true;
            }
            if (scheme.equals("mraid")) {
                handleBridgeCall(uri);
                return true;
            }
            onClickThrough(this.context, str);
            return true;
        } catch (Throwable th2) {
            throw new RuntimeException(th2);
        }
    }

    private void signalOmidAdImpression() {
        this.handler.postDelayed(new Runnable() { // from class: com.mobilefuse.sdk.mraid.c
            @Override // java.lang.Runnable
            public final void run() {
                MraidAdRenderer.b(this.f53397b);
            }
        }, 200L);
    }

    private void updateCloseBtnAsOmidFriendlyObstruction() {
        CloseButton closeButton;
        try {
            if (hasOmidBridge() && (closeButton = this.closeBtn) != null) {
                removeCloseBtnOmidFriendlyObstruction();
                if (closeButton.isVisible()) {
                    ((MraidOmidBridge) this.omidBridge).addFriendlyObstruction(closeButton, OmidFriendlyObstructionPurpose.CLOSE_AD, null);
                }
            }
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    private void updateWebViewBackgroundColor() throws Throwable {
        WebView webView;
        if (isTransparentBackground() || (webView = this.webView) == null) {
            return;
        }
        webView.setBackgroundColor(this.adBackgroundColor);
        this.webViewContainer.setBackgroundColor(this.adBackgroundColor);
        this.contentContainer.setBackgroundColor(this.adBackgroundColor);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void verifyEventAdded(android.net.Uri r4) {
        /*
            r3 = this;
            java.lang.String r0 = "event"
            java.lang.String r4 = r4.getQueryParameter(r0)     // Catch: java.lang.Throwable -> L23
            if (r4 != 0) goto L9
            goto L54
        L9:
            int r0 = r4.hashCode()     // Catch: java.lang.Throwable -> L23
            r1 = -261530729(0xfffffffff0695b97, float:-2.8888293E29)
            r2 = 1
            if (r0 == r1) goto L25
            r1 = 1701845777(0x65701b11, float:7.0866703E22)
            if (r0 == r1) goto L19
            goto L2f
        L19:
            java.lang.String r0 = "sizeChange"
            boolean r4 = r4.equals(r0)     // Catch: java.lang.Throwable -> L23
            if (r4 == 0) goto L2f
            r4 = r2
            goto L30
        L23:
            r4 = move-exception
            goto L51
        L25:
            java.lang.String r0 = "exposureChange"
            boolean r4 = r4.equals(r0)     // Catch: java.lang.Throwable -> L23
            if (r4 == 0) goto L2f
            r4 = 0
            goto L30
        L2f:
            r4 = -1
        L30:
            if (r4 == 0) goto L4d
            if (r4 == r2) goto L35
            goto L54
        L35:
            android.webkit.WebView r4 = r3.webView     // Catch: java.lang.Throwable -> L23
            int r4 = r4.getWidth()     // Catch: java.lang.Throwable -> L23
            int r4 = r3.convertPxToDp(r4)     // Catch: java.lang.Throwable -> L23
            android.webkit.WebView r0 = r3.webView     // Catch: java.lang.Throwable -> L23
            int r0 = r0.getHeight()     // Catch: java.lang.Throwable -> L23
            int r0 = r3.convertPxToDp(r0)     // Catch: java.lang.Throwable -> L23
            r3.bridge_NotifySizeChangeEvent(r4, r0)     // Catch: java.lang.Throwable -> L23
            return
        L4d:
            r3.requestAdPositionUpdate()     // Catch: java.lang.Throwable -> L23
            return
        L51:
            com.mobilefuse.sdk.StabilityHelper.logException(r3, r4)
        L54:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mobilefuse.sdk.mraid.MraidAdRenderer.verifyEventAdded(android.net.Uri):void");
    }

    @Override // com.mobilefuse.sdk.BaseAdRenderer
    protected void applyCurrentBackgroundColor() throws Throwable {
        updateWebViewBackgroundColor();
    }

    @Override // com.mobilefuse.sdk.BaseAdRenderer
    public void destroy() throws Throwable {
        try {
            super.destroy();
            ViewTreeInspector viewTreeInspector = this.viewTreeInspector;
            if (viewTreeInspector != null) {
                viewTreeInspector.stopObstructionsChecking();
                this.viewTreeInspector = null;
            }
            WebView webView = this.webView;
            if (webView != null) {
                if (webView.getParent() != null) {
                    ((ViewGroup) this.webView.getParent()).removeView(this.webView);
                }
                OmidWebViewReleaser.scheduleWebViewRelease(this.webView);
                this.webView = null;
            }
            removeCloseButton();
            Handler handler = this.handler;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            dismissBannerExpandedWindow();
            AdRendererContainer adRendererContainer = this.contentContainer;
            if (adRendererContainer != null) {
                ((MraidAdRendererContainer) adRendererContainer).setViewableChangeListener(null);
                if (this.contentContainer.getParent() != null) {
                    ((ViewGroup) this.contentContainer.getParent()).removeView(this.contentContainer);
                }
                this.contentContainer = null;
            }
            ExtendedController extendedController = this.extendedController;
            if (extendedController != null) {
                extendedController.unbindContent();
                this.extendedController = null;
            }
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    @Override // com.mobilefuse.sdk.BaseAdRenderer
    public View getAdView() throws Throwable {
        return this.contentContainer;
    }

    @Override // com.mobilefuse.sdk.BaseAdRenderer
    protected View.OnLayoutChangeListener getOnLayoutChangeListener(Context context) throws Throwable {
        return new View.OnLayoutChangeListener() { // from class: com.mobilefuse.sdk.mraid.MraidAdRenderer.6
            @Override // android.view.View.OnLayoutChangeListener
            @RequiresApi(api = 19)
            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                if (i12 == i16 && i13 == i17) {
                    return;
                }
                try {
                    MraidAdRenderer.this.setAdProperties(Boolean.FALSE);
                    Log.d("MF", "onLayoutChange [left: " + i10 + ", top: " + i11 + ", right: " + i12 + ", bottom: " + i13 + C4240b4.j.f42674e);
                    if (((BaseAdRenderer) MraidAdRenderer.this).extendedController != null) {
                        ((BaseAdRenderer) MraidAdRenderer.this).extendedController.invalidateLayout();
                    }
                } catch (Throwable th2) {
                    StabilityHelper.logException(this, th2);
                }
            }
        };
    }

    @Override // com.mobilefuse.sdk.BaseAdRenderer
    protected void onActivityPauseImpl() throws Throwable {
        dispatchAdmExposureChangeEvent(0.0d, 0.0d, 0.0d, null);
        ViewTreeInspector viewTreeInspector = this.viewTreeInspector;
        if (viewTreeInspector != null) {
            viewTreeInspector.stopObstructionsChecking();
        }
    }

    @Override // com.mobilefuse.sdk.BaseAdRenderer
    protected void onActivityResumeImpl() throws Throwable {
        requestAdPositionUpdate();
        ViewTreeInspector viewTreeInspector = this.viewTreeInspector;
        if (viewTreeInspector != null) {
            viewTreeInspector.startObstructionsChecking();
        }
    }

    @Override // com.mobilefuse.sdk.BaseAdRenderer
    protected boolean onAdCloseRequested() {
        try {
            if (!(this.extendedController instanceof SplashAdController)) {
                return true;
            }
            requestAdClose();
            return false;
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
            return true;
        }
    }

    @Override // com.mobilefuse.sdk.BaseAdRenderer
    protected void preloadAdmImpl(String str) throws Throwable {
        this.handler.postDelayed(new Runnable() { // from class: com.mobilefuse.sdk.mraid.g
            @Override // java.lang.Runnable
            public final void run() {
                MraidAdRenderer.f(this.f53401b);
            }
        }, 200L);
    }

    @Override // com.mobilefuse.sdk.BaseAdRenderer
    public void renderAdmImpl() throws Throwable {
        CloseButton closeButton;
        if (this.extendedAdType == MraidExtendedAdType.INTERSTITIAL_TRANSPARENT) {
            this.contentContainer.showProgressBarWithDelay(3000L);
        }
        if ((this.config.isFullscreenAd() || this.config.isCloseButtonEnabled()) && (closeButton = this.closeBtn) != null) {
            closeButton.showWithDelay(getCloseButtonShowDelay());
        }
        createWebView();
        createExternalController();
        if (this.adm.indexOf("http") == 0) {
            this.webViewLoadContentType = WebViewLoadContentType.URL;
            this.webView.loadUrl(this.adm);
        } else if (this.adm.indexOf("chrome://crash") == 0 && webViewCrashTestAllowed) {
            this.webViewLoadContentType = WebViewLoadContentType.URL;
            this.webView.loadUrl(this.adm);
        } else {
            this.webViewLoadContentType = WebViewLoadContentType.ADM;
            loadAdmInWebView(this.adm);
        }
        ExtendedController extendedController = this.extendedController;
        if (extendedController != null) {
            extendedController.bindContent(this.contentContainer, this.renderingActivity);
        }
        this.webViewContainer.addView(this.webView, 0, new RelativeLayout.LayoutParams(-1, -1));
        this.showingAd = true;
    }

    @Override // com.mobilefuse.sdk.BaseAdRenderer
    public void setAdLifecycleEventListener(AdLifecycleEventListener adLifecycleEventListener) throws Throwable {
        super.setAdLifecycleEventListener(adLifecycleEventListener);
    }

    public void setJsBridgeCallListener(@Nullable JsBridgeCallListener jsBridgeCallListener) {
        this.jsBridgeCallListener = jsBridgeCallListener;
    }

    public void setMaxSizeAndPosition(final Boolean bool) {
        try {
            this.webViewContainer.post(new Runnable() { // from class: com.mobilefuse.sdk.mraid.MraidAdRenderer.7
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (MraidAdRenderer.this.webView == null) {
                            return;
                        }
                        MraidAdRenderer mraidAdRenderer = MraidAdRenderer.this;
                        int iConvertPxToDp = mraidAdRenderer.convertPxToDp(mraidAdRenderer.webView.getWidth());
                        MraidAdRenderer mraidAdRenderer2 = MraidAdRenderer.this;
                        int iConvertPxToDp2 = mraidAdRenderer2.convertPxToDp(mraidAdRenderer2.webView.getHeight());
                        int[] iArr = new int[2];
                        MraidAdRenderer.this.webView.getLocationOnScreen(iArr);
                        int iConvertPxToDp3 = MraidAdRenderer.this.convertPxToDp(iArr[0]);
                        int iConvertPxToDp4 = MraidAdRenderer.this.convertPxToDp(iArr[1]);
                        MraidAdRenderer.this.setCurrentPosition(iConvertPxToDp, iConvertPxToDp2, iConvertPxToDp3, iConvertPxToDp4);
                        if (bool.booleanValue()) {
                            MraidAdRenderer.this.webView.evaluateJavascript("mraid.bridge.setDefaultPosition({\"x\": " + iConvertPxToDp3 + ", \"y\": " + iConvertPxToDp4 + ", \"width\": " + iConvertPxToDp + ", \"height\": " + iConvertPxToDp2 + "});", null);
                        } else {
                            MraidAdRenderer.this.bridge_NotifySizeChangeEvent(iConvertPxToDp, iConvertPxToDp2);
                        }
                        int i10 = MraidAdRenderer.this.screenWidth;
                        int iConvertPxToDp5 = MraidAdRenderer.this.screenHeight;
                        if (((BaseAdRenderer) MraidAdRenderer.this).renderingActivity != null) {
                            Rect rect = new Rect();
                            ((BaseAdRenderer) MraidAdRenderer.this).renderingActivity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                            int iConvertPxToDp6 = MraidAdRenderer.this.convertPxToDp(rect.width());
                            iConvertPxToDp5 = MraidAdRenderer.this.convertPxToDp(rect.height());
                            i10 = iConvertPxToDp6;
                        }
                        MraidAdRenderer.this.webView.evaluateJavascript("mraid.bridge.setMaxSize({\"width\": " + i10 + ", \"height\": " + iConvertPxToDp5 + "});", null);
                    } catch (Throwable th2) {
                        StabilityHelper.logException(this, th2);
                    }
                }
            });
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }
}
