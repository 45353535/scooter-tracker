package net.pubnative.lite.sdk.vpaid;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.adjust.sdk.Constants;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.models.EndCardData;
import net.pubnative.lite.sdk.utils.Logger;
import net.pubnative.lite.sdk.utils.UrlHandler;
import net.pubnative.lite.sdk.viewability.HyBidViewabilityFriendlyObstruction;
import net.pubnative.lite.sdk.viewability.HyBidViewabilityNativeVideoAdSession;
import net.pubnative.lite.sdk.viewability.baseom.BaseFriendlyObstructionPurpose;
import net.pubnative.lite.sdk.vpaid.VideoAdController;
import net.pubnative.lite.sdk.vpaid.enums.VastError;
import net.pubnative.lite.sdk.vpaid.helpers.ErrorLog;
import net.pubnative.lite.sdk.vpaid.helpers.EventTracker;
import net.pubnative.lite.sdk.vpaid.macros.MacroHelper;
import net.pubnative.lite.sdk.vpaid.models.vast.Tracking;
import net.pubnative.lite.sdk.vpaid.models.vpaid.AdSpotDimensions;
import net.pubnative.lite.sdk.vpaid.models.vpaid.CreativeParams;
import net.pubnative.lite.sdk.vpaid.models.vpaid.TrackingEvent;
import net.pubnative.lite.sdk.vpaid.protocol.BridgeEventHandler;
import net.pubnative.lite.sdk.vpaid.protocol.ViewControllerVpaid;
import net.pubnative.lite.sdk.vpaid.protocol.VpaidBridge;
import net.pubnative.lite.sdk.vpaid.protocol.VpaidBridgeImpl;
import net.pubnative.lite.sdk.vpaid.response.AdParams;
import net.pubnative.lite.sdk.vpaid.utils.UrlClickSource;
import net.pubnative.lite.sdk.vpaid.utils.Utils;

/* JADX INFO: loaded from: classes3.dex */
class VideoAdControllerVpaid implements VideoAdController, BridgeEventHandler {
    private static final String BASE_URL = "http://pubnative.net";
    private static final String ENVIRONMENT_VARS = "{ slot: document.getElementById('slot'), videoSlot: document.getElementById('video-slot'), videoSlotCanAutoPlay: true }";
    private static final String HTML_SOURCE_FILE = "ad.html";
    private static final String LOG_TAG = "VideoAdControllerVpaid";
    private static final String MIME_TYPE = "text/html";
    private static final String VPAID_CREATIVE_URL_STRING = "[VPAID_CREATIVE_URL]";
    private final AdParams mAdParams;
    private final AdSpotDimensions mAdSpotDimensions;
    private final BaseVideoAdInternal mBaseAdInternal;
    private boolean mIsStarted;
    private boolean mIsWaitingForSkippableState;
    private boolean mIsWaitingForWebView;
    private VideoAdController.OnPreparedListener mOnPreparedListener;
    private final HyBidViewabilityNativeVideoAdSession mViewabilityAdSession;
    private WebView mWebView;
    private boolean mIsVisible = false;
    private boolean mFinishedPlaying = false;
    private final List<HyBidViewabilityFriendlyObstruction> mViewabilityFriendlyObstructions = new ArrayList();
    private final VpaidBridge mVpaidBridge = new VpaidBridgeImpl(this, createCreativeParams());
    private final ViewControllerVpaid mViewControllerVpaid = new ViewControllerVpaid(this);
    private final MacroHelper mMacroHelper = new MacroHelper();

    VideoAdControllerVpaid(BaseVideoAdInternal baseVideoAdInternal, AdParams adParams, AdSpotDimensions adSpotDimensions, String str, HyBidViewabilityNativeVideoAdSession hyBidViewabilityNativeVideoAdSession) {
        this.mBaseAdInternal = baseVideoAdInternal;
        this.mAdParams = adParams;
        this.mAdSpotDimensions = adSpotDimensions;
        this.mViewabilityAdSession = hyBidViewabilityNativeVideoAdSession;
    }

    public static /* synthetic */ void a(VideoAdControllerVpaid videoAdControllerVpaid, String str) {
        WebView webView = videoAdControllerVpaid.mWebView;
        if (webView != null) {
            webView.loadUrl("javascript:" + str);
        }
    }

    public static /* synthetic */ void b(VideoAdControllerVpaid videoAdControllerVpaid) {
        if (videoAdControllerVpaid.mWebView.getParent() != null) {
            ((ViewGroup) videoAdControllerVpaid.mWebView.getParent()).removeAllViews();
        }
        videoAdControllerVpaid.mWebView.clearHistory();
        videoAdControllerVpaid.mWebView.clearCache(true);
        videoAdControllerVpaid.mWebView.loadUrl(AndroidWebViewClient.BLANK_PAGE);
        videoAdControllerVpaid.mWebView.pauseTimers();
        videoAdControllerVpaid.mWebView = null;
    }

    public static /* synthetic */ void c(VideoAdControllerVpaid videoAdControllerVpaid) {
        videoAdControllerVpaid.mIsWaitingForWebView = false;
        videoAdControllerVpaid.mVpaidBridge.stopAd();
        videoAdControllerVpaid.mBaseAdInternal.dismiss();
    }

    private CreativeParams createCreativeParams() {
        CreativeParams creativeParams = new CreativeParams(this.mAdSpotDimensions.getWidth(), this.mAdSpotDimensions.getHeight(), Constants.NORMAL, 720);
        creativeParams.setAdParameters("{'AdParameters':'" + this.mAdParams.getAdParams() + "'}");
        creativeParams.setEnvironmentVars(ENVIRONMENT_VARS);
        return creativeParams;
    }

    @SuppressLint({"SetJavaScriptEnabled", "JavascriptInterface"})
    private void initWebView() {
        WebView webView = new WebView(this.mBaseAdInternal.getContext());
        this.mWebView = webView;
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        if (Utils.isDebug()) {
            settings.setCacheMode(2);
            this.mWebView.clearCache(true);
        }
        this.mWebView.setWebChromeClient(new WebChromeClient());
        this.mIsWaitingForWebView = true;
        this.mWebView.setWebViewClient(new WebViewClient() { // from class: net.pubnative.lite.sdk.vpaid.VideoAdControllerVpaid.1
            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView2, String str) {
                VideoAdControllerVpaid videoAdControllerVpaid = VideoAdControllerVpaid.this;
                if (videoAdControllerVpaid.mIsWaitingForWebView) {
                    videoAdControllerVpaid.mVpaidBridge.prepare();
                    Logger.d(VideoAdControllerVpaid.LOG_TAG, "Init webView done");
                    VideoAdControllerVpaid.this.mIsWaitingForWebView = false;
                }
            }

            @Override // android.webkit.WebViewClient
            public boolean onRenderProcessGone(WebView webView2, RenderProcessGoneDetail renderProcessGoneDetail) {
                Logger.d(VideoAdControllerVpaid.LOG_TAG, "WebViewClient - onRenderProcessGone");
                return true;
            }
        });
        CookieManager.getInstance().setAcceptCookie(true);
        this.mWebView.addJavascriptInterface(this.mVpaidBridge, "android");
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public boolean adFinishedPlaying() {
        return this.mFinishedPlaying;
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public void addEndCardData(EndCardData endCardData) {
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public void addViewabilityFriendlyObstruction(View view, BaseFriendlyObstructionPurpose baseFriendlyObstructionPurpose, String str) {
        if (view == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.mViewabilityFriendlyObstructions.add(new HyBidViewabilityFriendlyObstruction(view, baseFriendlyObstructionPurpose, str));
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public void buildVideoAdView(VideoAdView videoAdView) {
        this.mViewControllerVpaid.buildVideoAdView(videoAdView, this.mWebView);
    }

    @Override // net.pubnative.lite.sdk.vpaid.protocol.BridgeEventHandler
    public void callJsMethod(final String str) {
        runOnUiThread(new Runnable() { // from class: net.pubnative.lite.sdk.vpaid.q
            @Override // java.lang.Runnable
            public final void run() {
                VideoAdControllerVpaid.a(this.f96091b, str);
            }
        });
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public void closeEndCard() {
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public void closeSelf() {
        runOnUiThread(new Runnable() { // from class: net.pubnative.lite.sdk.vpaid.n
            @Override // java.lang.Runnable
            public final void run() {
                VideoAdControllerVpaid.c(this.f96088b);
            }
        });
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public void destroy() {
        if (this.mWebView != null) {
            runOnUiThread(new Runnable() { // from class: net.pubnative.lite.sdk.vpaid.p
                @Override // java.lang.Runnable
                public final void run() {
                    VideoAdControllerVpaid.b(this.f96090b);
                }
            });
        }
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public void dismiss() {
        this.mVpaidBridge.pauseAd();
        this.mVpaidBridge.stopAd();
        WebView webView = this.mWebView;
        if (webView != null) {
            webView.clearCache(true);
            this.mWebView.clearFormData();
            this.mWebView.loadUrl(AndroidWebViewClient.BLANK_PAGE);
        }
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public AdParams getAdParams() {
        return this.mAdParams;
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public int getProgress() {
        return -1;
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public HyBidViewabilityNativeVideoAdSession getViewabilityAdSession() {
        return this.mViewabilityAdSession;
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public List<HyBidViewabilityFriendlyObstruction> getViewabilityFriendlyObstructions() {
        return this.mViewabilityFriendlyObstructions;
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public boolean isRewarded() {
        return this.mBaseAdInternal.isRewarded();
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public boolean isVideoVisible() {
        return this.mIsVisible;
    }

    @Override // net.pubnative.lite.sdk.vpaid.protocol.BridgeEventHandler
    public void onAdImpression() {
        for (String str : this.mAdParams.getImpressions()) {
            EventTracker.post(this.mBaseAdInternal.getContext(), str, this.mMacroHelper, true);
            Logger.d(LOG_TAG, "mAdParams.getImpressions() " + str);
        }
    }

    @Override // net.pubnative.lite.sdk.vpaid.protocol.BridgeEventHandler
    public void onAdLinearChange() {
    }

    @Override // net.pubnative.lite.sdk.vpaid.protocol.BridgeEventHandler
    public void onAdSkipped() {
        if (this.mIsStarted) {
            this.mIsWaitingForSkippableState = true;
            this.mVpaidBridge.getAdSkippableState();
            this.mFinishedPlaying = true;
        }
    }

    @Override // net.pubnative.lite.sdk.vpaid.protocol.BridgeEventHandler
    public void onAdStopped() {
        if (this.mIsStarted) {
            postEvent("closeLinear", true);
            postEvent("close", true);
            skipVideo();
        }
    }

    @Override // net.pubnative.lite.sdk.vpaid.protocol.BridgeEventHandler
    public void onAdVolumeChange() {
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public void onCustomCTAClick(boolean z10) {
        BaseVideoAdInternal baseVideoAdInternal = this.mBaseAdInternal;
        if (baseVideoAdInternal != null) {
            baseVideoAdInternal.onCustomCTAClick(z10);
        }
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public void onCustomCTALoadFail() {
        BaseVideoAdInternal baseVideoAdInternal = this.mBaseAdInternal;
        if (baseVideoAdInternal != null) {
            baseVideoAdInternal.onCustomCTALoadFail();
        }
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public void onCustomCTAShow() {
        BaseVideoAdInternal baseVideoAdInternal = this.mBaseAdInternal;
        if (baseVideoAdInternal != null) {
            baseVideoAdInternal.onCustomCTAShow();
        }
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public void onCustomEndCardClick(String str) {
        BaseVideoAdInternal baseVideoAdInternal = this.mBaseAdInternal;
        if (baseVideoAdInternal != null) {
            baseVideoAdInternal.onCustomEndCardClick(str);
        }
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public void onCustomEndCardShow(String str) {
        BaseVideoAdInternal baseVideoAdInternal = this.mBaseAdInternal;
        if (baseVideoAdInternal != null) {
            baseVideoAdInternal.onCustomEndCardShow(str);
        }
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public void onDefaultEndCardClick(String str) {
        BaseVideoAdInternal baseVideoAdInternal = this.mBaseAdInternal;
        if (baseVideoAdInternal != null) {
            baseVideoAdInternal.onDefaultEndCardClick(str);
        }
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public void onDefaultEndCardShow(String str) {
        BaseVideoAdInternal baseVideoAdInternal = this.mBaseAdInternal;
        if (baseVideoAdInternal != null) {
            baseVideoAdInternal.onDefaultEndCardShow(str);
        }
    }

    @Override // net.pubnative.lite.sdk.vpaid.protocol.BridgeEventHandler
    public void onDurationChanged() {
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public void onEndCardClosed(Boolean bool) {
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public void onEndCardLoadFail(Boolean bool) {
        BaseVideoAdInternal baseVideoAdInternal = this.mBaseAdInternal;
        if (baseVideoAdInternal != null) {
            baseVideoAdInternal.onEndCardLoadFail(bool);
        }
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public void onEndCardLoadSuccess(Boolean bool) {
        BaseVideoAdInternal baseVideoAdInternal = this.mBaseAdInternal;
        if (baseVideoAdInternal != null) {
            baseVideoAdInternal.onEndCardLoadSuccess(bool);
        }
    }

    @Override // net.pubnative.lite.sdk.vpaid.protocol.BridgeEventHandler
    public void onPrepared() {
        this.mOnPreparedListener.onPrepared();
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public void onVolumeChanged() {
    }

    void openClickUrl(String str, UrlClickSource urlClickSource) {
        Iterator<String> it = this.mAdParams.getVideoClicks().iterator();
        while (it.hasNext()) {
            EventTracker.post(this.mBaseAdInternal.getContext(), it.next(), this.mMacroHelper, true);
        }
        if (TextUtils.isEmpty(str)) {
            str = this.mAdParams.getVideoRedirectUrl();
        }
        this.mViewabilityAdSession.fireClick();
        String str2 = LOG_TAG;
        Logger.d(str2, "Handle external url");
        if (Utils.isOnline(this.mBaseAdInternal.getContext())) {
            new UrlHandler(this.mBaseAdInternal.getContext()).handleUrl(str, null, null);
        } else {
            Logger.e(str2, "No internet connection");
        }
        if (urlClickSource != UrlClickSource.CUSTOM_END_CARD) {
            this.mBaseAdInternal.onAdClicked();
        }
    }

    @Override // net.pubnative.lite.sdk.vpaid.protocol.BridgeEventHandler
    public void openUrl(String str) {
        openClickUrl(str, null);
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public void pause() {
        if (this.mIsStarted) {
            this.mVpaidBridge.pauseAd();
        }
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public void pauseEndCardCloseButtonTimer() {
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public void playAd() {
        this.mIsStarted = true;
        this.mVpaidBridge.startAd();
    }

    @Override // net.pubnative.lite.sdk.vpaid.protocol.BridgeEventHandler
    public void postEvent(String str, int i10, boolean z10) {
        for (Tracking tracking : this.mAdParams.getEvents()) {
            TrackingEvent trackingEvent = new TrackingEvent(tracking.getText());
            if (tracking.getEvent().equalsIgnoreCase("progress") && tracking.getOffset() != null) {
                int duration = this.mAdParams.getDuration() - i10;
                Integer duration2 = Utils.parseDuration(tracking.getOffset());
                if (duration2 != null && duration2.intValue() == duration) {
                    EventTracker.post(this.mBaseAdInternal.getContext(), trackingEvent.url, this.mMacroHelper, z10);
                }
            }
        }
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public void prepare(VideoAdController.OnPreparedListener onPreparedListener) {
        this.mOnPreparedListener = onPreparedListener;
        try {
            initWebView();
            this.mWebView.loadDataWithBaseURL(BASE_URL, Utils.readAssets(this.mBaseAdInternal.getContext().getAssets(), HTML_SOURCE_FILE).replace(VPAID_CREATIVE_URL_STRING, this.mAdParams.getVpaidJsUrl()), MIME_TYPE, "UTF-8", null);
        } catch (Exception e10) {
            HyBid.reportException(e10);
            Logger.e(LOG_TAG, "Can't read assets: " + e10.getMessage());
        }
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public void resume() {
        this.mVpaidBridge.resumeAd();
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public void resumeEndCardCloseButtonTimer() {
    }

    @Override // net.pubnative.lite.sdk.vpaid.protocol.BridgeEventHandler
    public void runOnUiThread(Runnable runnable) {
        BaseVideoAdInternal baseVideoAdInternal = this.mBaseAdInternal;
        if (baseVideoAdInternal != null) {
            baseVideoAdInternal.runOnUiThread(runnable);
        }
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public void setEndCardFilePath(String str) {
    }

    @Override // net.pubnative.lite.sdk.vpaid.protocol.BridgeEventHandler
    public void setSkippableState(boolean z10) {
        if (this.mIsStarted && this.mIsWaitingForSkippableState && z10) {
            this.mIsWaitingForSkippableState = false;
            postEvent("skip", true);
            skipVideo();
        }
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public void setVideoFilePath(String str) {
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public void setVideoVisible(boolean z10) {
        this.mIsVisible = z10;
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public void setVolume(boolean z10) {
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public void skipEndCard() {
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public void skipVideo() {
        this.mIsStarted = false;
        final BaseVideoAdInternal baseVideoAdInternal = this.mBaseAdInternal;
        Objects.requireNonNull(baseVideoAdInternal);
        runOnUiThread(new Runnable() { // from class: net.pubnative.lite.sdk.vpaid.o
            @Override // java.lang.Runnable
            public final void run() {
                baseVideoAdInternal.dismiss();
            }
        });
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public void toggleMute() {
    }

    @Override // net.pubnative.lite.sdk.vpaid.protocol.BridgeEventHandler
    public void trackError(String str) {
        ErrorLog.postError(this.mBaseAdInternal.getContext(), VastError.VPAID);
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public void openUrl(String str, UrlClickSource urlClickSource) {
        if (urlClickSource == null) {
            return;
        }
        openClickUrl(str, urlClickSource);
    }

    @Override // net.pubnative.lite.sdk.vpaid.protocol.BridgeEventHandler
    public void postEvent(String str, boolean z10) {
        EventTracker.postEventByType(this.mBaseAdInternal.getContext(), this.mAdParams.getEvents(), str, this.mMacroHelper, z10);
    }
}
