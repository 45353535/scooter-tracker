package net.pubnative.lite.sdk.mraid;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.location.Location;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.ClientCertRequest;
import android.webkit.ConsoleMessage;
import android.webkit.HttpAuthHandler;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.amazon.device.ads.DtbConstants;
import com.ironsource.C4240b4;
import com.ironsource.N6;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import net.pubnative.lite.sdk.CountdownStyle;
import net.pubnative.lite.sdk.DeviceInfo;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.R;
import net.pubnative.lite.sdk.location.HyBidLocationManager;
import net.pubnative.lite.sdk.models.CustomCTAData;
import net.pubnative.lite.sdk.models.SkipOffset;
import net.pubnative.lite.sdk.mraid.MRAIDView;
import net.pubnative.lite.sdk.mraid.internal.MRAIDHtmlProcessor;
import net.pubnative.lite.sdk.mraid.internal.MRAIDLog;
import net.pubnative.lite.sdk.mraid.internal.MRAIDNativeFeatureManager;
import net.pubnative.lite.sdk.mraid.model.HTMLAd;
import net.pubnative.lite.sdk.mraid.model.LandingPageHandler;
import net.pubnative.lite.sdk.mraid.properties.MRAIDOrientationProperties;
import net.pubnative.lite.sdk.mraid.properties.MRAIDResizeProperties;
import net.pubnative.lite.sdk.utils.ClickThroughTimerManager;
import net.pubnative.lite.sdk.utils.Logger;
import net.pubnative.lite.sdk.utils.ScreenDimensionsUtils;
import net.pubnative.lite.sdk.utils.ViewUtils;
import net.pubnative.lite.sdk.viewability.HyBidViewabilityFriendlyObstruction;
import net.pubnative.lite.sdk.viewability.HyBidViewabilityWebAdSession;
import net.pubnative.lite.sdk.viewability.baseom.BaseFriendlyObstructionPurpose;
import net.pubnative.lite.sdk.views.PNWebView;
import net.pubnative.lite.sdk.views.cta.HyBidCTAView;
import net.pubnative.lite.sdk.views.endcard.HyBidEndCardView;
import net.pubnative.lite.sdk.vpaid.CloseButtonListener;
import net.pubnative.lite.sdk.vpaid.ReplayListener;
import net.pubnative.lite.sdk.vpaid.helpers.BitmapHelper;
import net.pubnative.lite.sdk.vpaid.helpers.SimpleTimer;
import net.pubnative.lite.sdk.vpaid.widget.CountDownView;
import net.pubnative.lite.sdk.vpaid.widget.CountDownViewFactory;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ViewConstructor"})
public class MRAIDView extends FrameLayout implements LandingPageHandler.LandingPageCallback {
    private static final int CLOSE_REGION_SIZE = 50;
    private static final String MRAID_LOG_TAG = "MRAIDView";
    private static final String MRAID_VERSION = "3.0";
    public static final int STATE_DEFAULT = 1;
    public static final int STATE_EXPANDED = 2;
    public static final int STATE_HIDDEN = 4;
    public static final int STATE_LOADING = 0;
    public static final int STATE_RESIZED = 3;
    private int activityInitialOrientation;
    private final String baseUrl;
    private ClickThroughTimerManager.ClickThroughTimerListener clickThroughListener;
    private MRAIDViewCloseLayoutListener closeLayoutListener;
    private ImageButton closeRegion;
    private final ViewGroup contentInfo;
    private boolean contentInfoAdded;
    private int contentViewTop;
    private final Context context;
    private HyBidCTAView ctaView;
    private Rect currentPosition;
    private WebView currentWebView;
    private Rect defaultPosition;
    private final DisplayMetrics displayMetrics;
    private RelativeLayout expandedView;
    private final GestureDetector gestureDetector;
    protected final Handler handler;
    private HTMLAd htmlAd;
    private final int injections;
    private boolean isActionBarShowing;
    private Boolean isBackClickable;
    private boolean isClosing;
    private final boolean isExpandEnabled;
    private boolean isExpanded;
    private boolean isExpandingFromDefault;
    private boolean isExpandingPart2;
    private boolean isForceNotFullScreen;
    private boolean isForcingFullScreen;
    private boolean isFullScreen;
    private final boolean isInterstitial;
    protected boolean isLaidOut;
    protected boolean isPageFinished;
    protected boolean isViewabilityConfirmed;
    protected boolean isViewable;
    protected final MRAIDViewListener listener;
    private SimpleTimer mAntilockTimer;
    private SimpleTimer mClickThroughTimer;
    private HyBidEndCardView mEndCardView;
    private SimpleTimer mExpirationTimer;
    private boolean mIsExpanding;
    private MraidDisplayMode mMraidDisplayMode;
    private Integer mNativeCloseButtonDelay;
    private SimpleTimer mNativeCloseButtonTimer;
    private CountDownView mSkipCountdownView;
    private Integer mSkipTimeMillis;
    private HyBidViewabilityWebAdSession mViewabilityAdSession;
    private final List<HyBidViewabilityFriendlyObstruction> mViewabilityFriendlyObstructions;
    private final Size maxSize;
    private String mraidJs;
    private final MRAIDWebChromeClient mraidWebChromeClient;
    private final MRAIDWebViewClient mraidWebViewClient;
    private final MRAIDNativeFeatureListener nativeFeatureListener;
    private final MRAIDNativeFeatureManager nativeFeatureManager;
    private final MRAIDOrientationProperties orientationProperties;
    private int origTitleBarVisibility;
    private final int originalRequestedOrientation;
    private final MRAIDResizeProperties resizeProperties;
    private RelativeLayout resizedView;
    private final Size screenSize;
    private Activity showActivity;
    private final Boolean showTimerBeforeEndCard;
    protected int state;
    private View titleBar;
    private boolean useCustomClose;
    private boolean wasOpened;
    private boolean wasTouched;
    protected final WebView webView;
    private boolean webViewLoaded;
    private WebView webViewPart2;
    private static final CountdownStyle COUNTDOWN_STYLE_DEFAULT = CountdownStyle.PIE_CHART;
    private static final String[] COMMANDS_WITH_NO_PARAM = {"close", "resize"};
    private static final String[] COMMANDS_WITH_STRING = {"createCalendarEvent", "expand", "open", "playVideo", MRAIDNativeFeature.STORE_PICTURE, "useCustomClose"};
    private static final String[] COMMANDS_WITH_MAP = {MRAIDPresenter.SET_ORIENTATION_PROPERTIES, "setResizeProperties"};

    @Retention(RetentionPolicy.SOURCE)
    public @interface MRAIDState {
    }

    private class MRAIDWebChromeClient extends WebChromeClient {
        private boolean handlePopups(JsResult jsResult) {
            jsResult.cancel();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onCloseWindow(WebView webView) {
            MRAIDLog.d("hz-m MRAIDView ChromeClient - onCloseWindow");
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            String str;
            if (consoleMessage == null || consoleMessage.message() == null) {
                return false;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(consoleMessage.message());
            if (consoleMessage.sourceId() == null) {
                str = "";
            } else {
                str = " at " + consoleMessage.sourceId();
            }
            sb2.append(str);
            sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            sb2.append(consoleMessage.lineNumber());
            MRAIDLog.i("JS console", sb2.toString());
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onExceededDatabaseQuota(String str, String str2, long j10, long j11, long j12, WebStorage.QuotaUpdater quotaUpdater) {
            MRAIDLog.d("hz-m MRAIDView WebViewClient - onExceededDatabaseQuota");
            quotaUpdater.updateQuota(j10);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            MRAIDLog.d("JS alert", str2);
            return handlePopups(jsResult);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
            MRAIDLog.d("hz-m MRAIDView ChromeClient - onJsBeforeUnload");
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
            MRAIDLog.d("JS confirm", str2);
            return handlePopups(jsResult);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            MRAIDLog.d("JS prompt", str2);
            return handlePopups(jsPromptResult);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsTimeout() {
            MRAIDLog.d("hz-m MRAIDView WebViewClient - onJsTimeout");
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onPermissionRequest(PermissionRequest permissionRequest) {
            MRAIDLog.d("hz-m MRAIDView WebViewClient - onPermissionRequest");
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i10) {
            MRAIDLog.d("hz-m MRAIDView ChromeClient - onProgressChanged " + i10 + " wv: " + MRAIDView.this.webView + " view: " + MRAIDView.this);
        }

        public void onReachedMaxAppCacheSize(long j10, long j11, WebStorage.QuotaUpdater quotaUpdater) {
            MRAIDLog.d("hz-m MRAIDView WebViewClient - onReachedMaxAppCacheSize");
            quotaUpdater.updateQuota(j11);
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            MRAIDLog.d("hz-m MRAIDView ChromeClient - showCustomView");
        }

        private MRAIDWebChromeClient() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class MRAIDWebViewClient extends WebViewClient {
        public static /* synthetic */ void c(MRAIDWebViewClient mRAIDWebViewClient) {
            MRAIDView mRAIDView = MRAIDView.this;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("mraid.setPlacementType('");
            sb2.append(MRAIDView.this.isInterstitial ? "interstitial" : "inline");
            sb2.append("');");
            mRAIDView.injectJavaScript(sb2.toString());
            MRAIDView.this.setSupportedServices();
            MRAIDView.this.setEnvironmentVariables();
            MRAIDView.this.setLocation();
            MRAIDView.this.setScreenSize();
            MRAIDView.this.setDefaultPosition();
            MRAIDLog.d(MRAIDView.MRAID_LOG_TAG, "calling fireStateChangeEvent 2");
            MRAIDView.this.fireStateChangeEvent();
            MRAIDView.this.fireReadyEvent();
            MRAIDView mRAIDView2 = MRAIDView.this;
            mRAIDView2.setViewable(mRAIDView2.isViewable ? 0 : 8);
        }

        @Override // android.webkit.WebViewClient
        public void onPageCommitVisible(WebView webView, String str) {
            MRAIDLog.d("hz-m MRAIDView WebViewClient - onPageCommitVisibile");
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (MRAIDView.this.hasLandingPage()) {
                MRAIDView.this.handleSetCustomisationInjection();
            }
            MRAIDView.this.cancelAntilockTimer();
            MRAIDLog.d(MRAIDView.MRAID_LOG_TAG, "onPageFinished: " + str);
            MRAIDView mRAIDView = MRAIDView.this;
            if (mRAIDView.state == 0) {
                mRAIDView.isPageFinished = true;
                if (mRAIDView.isExpandEnabled) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("mraid.setPlacementType('");
                    sb2.append(MRAIDView.this.isInterstitial ? "interstitial" : "inline");
                    sb2.append("');");
                    mRAIDView.injectJavaScript(sb2.toString());
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("mraid.setPlacementType('");
                    sb3.append(MRAIDView.this.isInterstitial ? "interstitial" : "");
                    sb3.append("');");
                    mRAIDView.injectJavaScript(sb3.toString());
                }
                MRAIDView.this.setEnvironmentVariables();
                MRAIDView.this.setSupportedServices();
                MRAIDView.this.setLocation();
                MRAIDView mRAIDView2 = MRAIDView.this;
                if (mRAIDView2.isLaidOut) {
                    mRAIDView2.setScreenSize();
                    MRAIDView.this.setMaxSize();
                    MRAIDView.this.setCurrentPosition();
                    MRAIDView.this.setDefaultPosition();
                    MRAIDView mRAIDView3 = MRAIDView.this;
                    if (mRAIDView3.isInterstitial) {
                        mRAIDView3.showAsInterstitial(mRAIDView3.showActivity, Boolean.FALSE, null);
                    } else {
                        mRAIDView3.state = 1;
                        mRAIDView3.fireStateChangeEvent();
                        MRAIDView.this.fireReadyEvent();
                        MRAIDView mRAIDView4 = MRAIDView.this;
                        mRAIDView4.setViewable(mRAIDView4.isViewable ? 0 : 8);
                    }
                }
                MRAIDView mRAIDView5 = MRAIDView.this;
                if (!mRAIDView5.isInterstitial) {
                    mRAIDView5.addContentInfo(mRAIDView5);
                }
                MRAIDView mRAIDView6 = MRAIDView.this;
                if (mRAIDView6.listener != null && !mRAIDView6.webViewLoaded) {
                    HyBidViewabilityWebAdSession hyBidViewabilityWebAdSession = mRAIDView6.mViewabilityAdSession;
                    if (hyBidViewabilityWebAdSession != null) {
                        hyBidViewabilityWebAdSession.initAdSession(webView, false);
                        MRAIDView mRAIDView7 = MRAIDView.this;
                        ViewGroup viewGroup = mRAIDView7.contentInfo;
                        if (viewGroup != null && mRAIDView7.contentInfoAdded) {
                            mRAIDView7.addViewabilityFriendlyObstruction(viewGroup, BaseFriendlyObstructionPurpose.OTHER, "Content info description for the ad");
                            List<HyBidViewabilityFriendlyObstruction> list = MRAIDView.this.mViewabilityFriendlyObstructions;
                            if (list != null) {
                                for (HyBidViewabilityFriendlyObstruction hyBidViewabilityFriendlyObstruction : list) {
                                    HyBidViewabilityWebAdSession hyBidViewabilityWebAdSession2 = MRAIDView.this.mViewabilityAdSession;
                                    if (hyBidViewabilityWebAdSession2 != null) {
                                        hyBidViewabilityWebAdSession2.addFriendlyObstruction(hyBidViewabilityFriendlyObstruction.getView(), hyBidViewabilityFriendlyObstruction.getPurpose(), hyBidViewabilityFriendlyObstruction.getReason());
                                    }
                                }
                            }
                        }
                        MRAIDView mRAIDView8 = MRAIDView.this;
                        mRAIDView8.webViewLoaded = true;
                        HyBidViewabilityWebAdSession hyBidViewabilityWebAdSession3 = mRAIDView8.mViewabilityAdSession;
                        if (hyBidViewabilityWebAdSession3 != null) {
                            hyBidViewabilityWebAdSession3.fireLoaded();
                            MRAIDView.this.mViewabilityAdSession.fireImpression();
                        }
                    }
                    MRAIDView mRAIDView9 = MRAIDView.this;
                    mRAIDView9.listener.mraidViewLoaded(mRAIDView9);
                    MRAIDView mRAIDView10 = MRAIDView.this;
                    CountDownViewFactory countDownViewFactory = new CountDownViewFactory();
                    MRAIDView mRAIDView11 = MRAIDView.this;
                    mRAIDView10.mSkipCountdownView = countDownViewFactory.createCountdownView(mRAIDView11.context, MRAIDView.COUNTDOWN_STYLE_DEFAULT, mRAIDView11);
                    MRAIDView mRAIDView12 = MRAIDView.this;
                    mRAIDView12.addView(mRAIDView12.mSkipCountdownView);
                    MRAIDView.this.mSkipCountdownView.setVisibility(8);
                    final MRAIDView mRAIDView13 = MRAIDView.this;
                    mRAIDView13.postDelayed(new Runnable() { // from class: net.pubnative.lite.sdk.mraid.t
                        @Override // java.lang.Runnable
                        public final void run() {
                            mRAIDView13.startSkipTimer();
                        }
                    }, 500L);
                    MRAIDView.this.handleShowingCTA();
                }
            }
            MRAIDView mRAIDView14 = MRAIDView.this;
            if (mRAIDView14.isExpandingPart2) {
                mRAIDView14.isExpandingPart2 = false;
                mRAIDView14.handler.post(new Runnable() { // from class: net.pubnative.lite.sdk.mraid.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        MRAIDView.MRAIDWebViewClient.c(this.f95943b);
                    }
                });
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            MRAIDLog.d("hz-m MRAIDView WebViewClient - onPageStarted");
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
            MRAIDLog.d("hz-m MRAIDView WebViewClient - onReceivedClientCertRequest");
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            MRAIDLog.d("hz-m MRAIDView WebViewClient - onReceivedError code: " + webResourceError.getErrorCode());
            MRAIDLog.d("hz-m MRAIDView WebViewClient - onReceivedError: " + ((Object) webResourceError.getDescription()));
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
            MRAIDLog.d("hz-m MRAIDView WebViewClient - onReceivedHttpAuthRequest");
            httpAuthHandler.cancel();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            MRAIDLog.d("hz-m MRAIDView WebViewClient - onReceivedHttpError");
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
            MRAIDLog.d("hz-m MRAIDView WebViewClient - onReceivedLoginRequest");
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            MRAIDLog.d("hz-m MRAIDView WebViewClient - onReceivedSslError");
            if (sslErrorHandler != null) {
                sslErrorHandler.cancel();
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            MRAIDLog.d("hz-m MRAIDView WebViewClient - onRenderProcessGone");
            MRAIDView mRAIDView = MRAIDView.this;
            MRAIDViewListener mRAIDViewListener = mRAIDView.listener;
            if (mRAIDViewListener == null) {
                return true;
            }
            mRAIDViewListener.mraidViewError(mRAIDView);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public void onScaleChanged(WebView webView, float f10, float f11) {
            MRAIDLog.d("hz-m MRAIDView WebViewClient - onScaleChanged");
        }

        @Override // android.webkit.WebViewClient
        public void onTooManyRedirects(WebView webView, Message message, Message message2) {
            message.sendToTarget();
            MRAIDLog.d("hz-m MRAIDView WebViewClient - onTooManyRedirects");
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            if (webResourceRequest != null && webResourceRequest.getUrl() != null) {
                String string = webResourceRequest.getUrl().toString();
                MRAIDLog.d("hz-m shouldInterceptRequest - " + string);
                if (string.contains("mraid.js")) {
                    MRAIDLog.d("hz-m shouldInterceptRequest - intercepting mraid - " + string);
                    MRAIDView.this.handler.post(new Runnable() { // from class: net.pubnative.lite.sdk.mraid.v
                        @Override // java.lang.Runnable
                        public final void run() {
                            MRAIDView.injectJavaScript(MRAIDView.this.webView, "mraid.logLevel = mraid.LogLevelEnum.DEBUG;");
                        }
                    });
                    return new WebResourceResponse("application/javascript", "UTF-8", MRAIDView.this.getMraidJsStream());
                }
            }
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
            MRAIDLog.d("hz-m MRAIDView WebViewClient - shouldOverrideKeyEvent");
            return false;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            MRAIDLog.d(MRAIDView.MRAID_LOG_TAG, "shouldOverrideUrlLoading: " + str);
            HTMLAd hTMLAd = MRAIDView.this.htmlAd;
            if (hTMLAd != null && hTMLAd.getLandingPage() != null && MRAIDView.this.htmlAd.getLandingPage().isFinalPage()) {
                MRAIDView.this.cancelLandingPageBehaviour();
            }
            Uri uri = Uri.parse(str);
            if ("https".equalsIgnoreCase(uri.getScheme()) && "customendcard.verve.com".equalsIgnoreCase(uri.getHost()) && "/replay".equals(uri.getPath())) {
                MRAIDViewListener mRAIDViewListener = MRAIDView.this.listener;
                if (mRAIDViewListener != null) {
                    mRAIDViewListener.onReplayClicked();
                }
                return true;
            }
            if (str.startsWith("mraid://")) {
                MRAIDView.this.parseCommandUrl(str);
            } else if (str.startsWith("verveadexperience://")) {
                if (str.contains("setRedirectionUrl")) {
                    MRAIDView.this.parseRedirectionUrl(str);
                } else {
                    HTMLAd hTMLAd2 = MRAIDView.this.htmlAd;
                    if (hTMLAd2 != null && hTMLAd2.getLandingPage() != null && MRAIDView.this.htmlAd.getLandingPage().isLandingPageEnabled().booleanValue()) {
                        MRAIDView.this.htmlAd.getLandingPage().parseAdExperienceUrl(str);
                    }
                }
            } else {
                if (MRAIDView.this.hasLandingPage() && !MRAIDView.this.htmlAd.getLandingPage().isFinalPage()) {
                    return false;
                }
                if (MRAIDView.this.isVerveCustomExpand(str)) {
                    MRAIDView.this.expandCreative(str, true, Boolean.FALSE, null);
                } else if (MRAIDView.this.isCloseSignal(str)) {
                    MRAIDView.this.closeOnMainThread();
                } else {
                    MRAIDView mRAIDView = MRAIDView.this;
                    if (mRAIDView.mIsExpanding) {
                        mRAIDView.mIsExpanding = false;
                        return false;
                    }
                    try {
                        mRAIDView.open(URLEncoder.encode(str, "UTF-8"));
                    } catch (UnsupportedEncodingException e10) {
                        Logger.e(MRAIDView.MRAID_LOG_TAG, e10.getMessage());
                    }
                }
            }
            return true;
        }

        private MRAIDWebViewClient() {
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            MRAIDLog.d(MRAIDView.MRAID_LOG_TAG, "onReceivedError: " + str);
            super.onReceivedError(webView, i10, str, str2);
        }
    }

    enum MraidDisplayMode {
        AD,
        END_CARD
    }

    public interface OnExpandCreativeFailListener {
        void onExpandFailed();
    }

    private static class Size {
        public int height;
        public int width;

        private Size() {
        }
    }

    public MRAIDView(Context context, String str, String str2, Boolean bool, String[] strArr, MRAIDViewListener mRAIDViewListener, MRAIDNativeFeatureListener mRAIDNativeFeatureListener, ViewGroup viewGroup, boolean z10, boolean z11) {
        super(context);
        this.mSkipTimeMillis = -1;
        this.mNativeCloseButtonDelay = -1;
        this.isBackClickable = Boolean.FALSE;
        this.mMraidDisplayMode = MraidDisplayMode.AD;
        this.activityInitialOrientation = -1;
        this.wasTouched = false;
        this.wasOpened = false;
        this.contentInfoAdded = false;
        this.webViewLoaded = false;
        this.isViewabilityConfirmed = false;
        this.mIsExpanding = false;
        this.injections = 0;
        this.context = context;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            this.showActivity = activity;
            this.activityInitialOrientation = activity.getRequestedOrientation();
        }
        String str3 = (str == null || str.isEmpty()) ? "https://example.com" : str;
        this.baseUrl = str3;
        this.isInterstitial = z10;
        this.isExpandEnabled = z11;
        this.contentInfo = viewGroup;
        this.state = 0;
        this.isViewable = false;
        this.useCustomClose = false;
        this.orientationProperties = new MRAIDOrientationProperties();
        this.resizeProperties = new MRAIDResizeProperties();
        this.nativeFeatureManager = new MRAIDNativeFeatureManager(context, new ArrayList(Arrays.asList(strArr)));
        this.listener = mRAIDViewListener;
        this.nativeFeatureListener = mRAIDNativeFeatureListener;
        this.showTimerBeforeEndCard = bool;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            this.displayMetrics = displayMetrics;
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        } else {
            this.displayMetrics = null;
        }
        this.currentPosition = new Rect();
        this.defaultPosition = new Rect();
        this.maxSize = new Size();
        this.screenSize = new Size();
        if (context instanceof Activity) {
            this.originalRequestedOrientation = ((Activity) context).getRequestedOrientation();
        } else {
            this.originalRequestedOrientation = -1;
        }
        MRAIDLog.d(MRAID_LOG_TAG, "originalRequestedOrientation " + getOrientationString(this.originalRequestedOrientation));
        this.gestureDetector = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: net.pubnative.lite.sdk.mraid.MRAIDView.2
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
                return true;
            }
        });
        this.handler = new Handler(Looper.getMainLooper());
        this.mViewabilityAdSession = new HyBidViewabilityWebAdSession(HyBid.getViewabilityManager());
        this.mViewabilityFriendlyObstructions = new ArrayList();
        this.mraidWebChromeClient = new MRAIDWebChromeClient();
        this.mraidWebViewClient = new MRAIDWebViewClient();
        WebView webViewCreateWebView = createWebView();
        this.webView = webViewCreateWebView;
        if (webViewCreateWebView == null) {
            if (mRAIDViewListener != null) {
                mRAIDViewListener.mraidViewError(this);
                return;
            }
            return;
        }
        webViewCreateWebView.setId(R.id.mraid_ad_view);
        this.currentWebView = webViewCreateWebView;
        if (TextUtils.isEmpty(str2)) {
            if (str != null) {
                MRAIDLog.d("hz-m loading mraid from url: " + str);
                webViewCreateWebView.loadUrl(str);
                return;
            }
            return;
        }
        try {
            String strProcessRawHtml = MRAIDHtmlProcessor.processRawHtml(str2);
            MRAIDLog.d("hz-m loading mraid " + strProcessRawHtml);
            webViewCreateWebView.loadDataWithBaseURL(str3, strProcessRawHtml, "text/html", "UTF-8", null);
            handleAntilockDelay();
        } catch (Throwable th2) {
            HyBid.reportException(th2);
            this.listener.mraidViewError(this);
        }
    }

    public static /* synthetic */ void a(MRAIDView mRAIDView, String str) {
        if (mRAIDView.state == 3) {
            mRAIDView.removeResizeView();
            mRAIDView.addView(mRAIDView.webView);
        }
        mRAIDView.webView.setWebChromeClient(null);
        mRAIDView.webView.setWebViewClient(null);
        WebView webViewCreateWebView = mRAIDView.createWebView();
        mRAIDView.webViewPart2 = webViewCreateWebView;
        mRAIDView.mIsExpanding = true;
        webViewCreateWebView.loadUrl(str);
        MRAIDLog.d("hz-m MRAIDView - expand - switching out currentwebview for " + mRAIDView.webViewPart2);
        WebView webView = mRAIDView.webViewPart2;
        mRAIDView.currentWebView = webView;
        mRAIDView.isExpandingPart2 = true;
        mRAIDView.expandHelper(webView);
    }

    private void addCloseRegion(View view) {
        ImageButton imageButton = new ImageButton(this.context);
        this.closeRegion = imageButton;
        imageButton.setId(R.id.close_view);
        this.closeRegion.setBackgroundColor(0);
        this.closeRegion.setOnClickListener(new View.OnClickListener() { // from class: net.pubnative.lite.sdk.mraid.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f95930b.close();
            }
        });
        if (view == this.expandedView && !this.useCustomClose) {
            showDefaultCloseButton();
        }
        ((ViewGroup) view).addView(this.closeRegion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addContentInfo(View view) {
        ViewGroup viewGroup = this.contentInfo;
        if (viewGroup == null || this.contentInfoAdded) {
            return;
        }
        ((ViewGroup) view).addView(viewGroup);
        this.contentInfoAdded = true;
    }

    public static /* synthetic */ void b(MRAIDView mRAIDView) {
        mRAIDView.fireStateChangeEvent();
        MRAIDViewListener mRAIDViewListener = mRAIDView.listener;
        if (mRAIDViewListener != null) {
            mRAIDViewListener.mraidViewClose(mRAIDView);
        }
    }

    private void calculateMaxSize() {
        if (this.context instanceof Activity) {
            Rect rect = new Rect();
            Window window = ((Activity) this.context).getWindow();
            window.getDecorView().getWindowVisibleDisplayFrame(rect);
            String str = MRAID_LOG_TAG;
            MRAIDLog.d(str, "calculateMaxSize frame [" + rect.left + StringUtils.COMMA + rect.top + "][" + rect.right + StringUtils.COMMA + rect.bottom + "] (" + rect.width() + "x" + rect.height() + ")");
            if (window.findViewById(android.R.id.content) != null) {
                this.contentViewTop = window.findViewById(android.R.id.content).getTop();
            } else {
                this.contentViewTop = rect.top;
            }
            int i10 = rect.top;
            int i11 = this.contentViewTop - i10;
            MRAIDLog.d(str, "calculateMaxSize statusHeight " + i10);
            MRAIDLog.d(str, "calculateMaxSize titleHeight " + i11);
            MRAIDLog.d(str, "calculateMaxSize contentViewTop " + this.contentViewTop);
            int iWidth = rect.width();
            int i12 = this.screenSize.height - this.contentViewTop;
            MRAIDLog.d(str, "calculateMaxSize max size " + iWidth + "x" + i12);
            Size size = this.maxSize;
            if (iWidth == size.width && i12 == size.height) {
                return;
            }
            size.width = iWidth;
            size.height = i12;
            if (this.isPageFinished) {
                setMaxSize();
            }
        }
    }

    private void calculatePosition(boolean z10) {
        View view = z10 ? this.currentWebView : this;
        String str = z10 ? "current" : "default";
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        String str2 = MRAID_LOG_TAG;
        MRAIDLog.d(str2, "calculatePosition " + str + " locationOnScreen [" + i10 + StringUtils.COMMA + i11 + C4240b4.j.f42674e);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("calculatePosition ");
        sb2.append(str);
        sb2.append(" contentViewTop ");
        sb2.append(this.contentViewTop);
        MRAIDLog.d(str2, sb2.toString());
        int i12 = i11 - this.contentViewTop;
        int width = view.getWidth();
        int height = view.getHeight();
        MRAIDLog.d(str2, "calculatePosition " + str + " position [" + i10 + StringUtils.COMMA + i12 + "] (" + width + "x" + height + ")");
        Rect rect = z10 ? this.currentPosition : this.defaultPosition;
        if (i10 == rect.left && i12 == rect.top && width == rect.width() && height == rect.height()) {
            return;
        }
        if (z10) {
            this.currentPosition = new Rect(i10, i12, width + i10, height + i12);
        } else {
            this.defaultPosition = new Rect(i10, i12, width + i10, height + i12);
        }
        if (this.isPageFinished) {
            if (z10) {
                setCurrentPosition();
            } else {
                setDefaultPosition();
            }
        }
    }

    private void calculateScreenSize() {
        boolean z10 = getResources().getConfiguration().orientation == 1;
        String str = MRAID_LOG_TAG;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("calculateScreenSize orientation ");
        sb2.append(z10 ? "portrait" : "landscape");
        MRAIDLog.d(str, sb2.toString());
        DisplayMetrics displayMetrics = this.displayMetrics;
        if (displayMetrics != null) {
            int i10 = displayMetrics.widthPixels;
            int i11 = displayMetrics.heightPixels;
            MRAIDLog.d(str, "calculateScreenSize screen size " + i10 + "x" + i11);
            Size size = this.screenSize;
            if (i10 == size.width && i11 == size.height) {
                return;
            }
            size.width = i10;
            size.height = i11;
            if (this.isPageFinished) {
                setScreenSize();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelAntilockTimer() {
        SimpleTimer simpleTimer = this.mAntilockTimer;
        if (simpleTimer != null) {
            simpleTimer.pause();
            this.mAntilockTimer.cancel();
            this.mAntilockTimer = null;
        }
    }

    private void cancelClickThroughTimer() {
        SimpleTimer simpleTimer = this.mClickThroughTimer;
        if (simpleTimer != null) {
            simpleTimer.pause();
            this.mClickThroughTimer.cancel();
            this.mClickThroughTimer = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void closeOnMainThread() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: net.pubnative.lite.sdk.mraid.n
            @Override // java.lang.Runnable
            public final void run() {
                this.f95935b.close();
            }
        });
    }

    @JavascriptMRAIDCallback
    private void createCalendarEvent(String str) {
        MRAIDLog.d(MRAID_LOG_TAG + "-JS callback", "createCalendarEvent " + str);
        MRAIDNativeFeatureListener mRAIDNativeFeatureListener = this.nativeFeatureListener;
        if (mRAIDNativeFeatureListener != null) {
            mRAIDNativeFeatureListener.mraidNativeFeatureCreateCalendarEvent(str);
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private WebView createWebView() {
        try {
            PNWebView pNWebView = new PNWebView(this.context) { // from class: net.pubnative.lite.sdk.mraid.MRAIDView.4
                private static final String TAG = "MRAIDView-WebView";

                @Override // android.webkit.WebView, android.view.View
                public void onConfigurationChanged(Configuration configuration) {
                    super.onConfigurationChanged(configuration);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("onConfigurationChanged ");
                    sb2.append(configuration.orientation == 1 ? "portrait" : "landscape");
                    MRAIDLog.d(TAG, sb2.toString());
                    MRAIDView mRAIDView = MRAIDView.this;
                    if (mRAIDView.isInterstitial) {
                        if (Build.VERSION.SDK_INT >= 30) {
                            if (mRAIDView.context.getDisplay() != null) {
                                MRAIDView.this.context.getDisplay().getMetrics(MRAIDView.this.displayMetrics);
                            }
                        } else {
                            WindowManager windowManager = (WindowManager) mRAIDView.context.getSystemService("window");
                            if (windowManager != null) {
                                windowManager.getDefaultDisplay().getMetrics(MRAIDView.this.displayMetrics);
                            }
                        }
                    }
                }

                @Override // android.widget.AbsoluteLayout, android.view.ViewGroup, android.view.View
                protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
                    super.onLayout(z10, i10, i11, i12, i13);
                    MRAIDView.this.onLayoutWebView(this, z10, i10, i11, i12, i13);
                }

                @Override // android.webkit.WebView, android.view.View
                protected void onVisibilityChanged(View view, int i10) {
                    super.onVisibilityChanged(view, i10);
                    MRAIDLog.d(TAG, "onVisibilityChanged " + MRAIDView.getVisibilityString(i10));
                    MRAIDView mRAIDView = MRAIDView.this;
                    if (mRAIDView.isInterstitial) {
                        mRAIDView.setViewable(i10);
                    }
                }

                @Override // android.webkit.WebView, android.view.View
                protected void onWindowVisibilityChanged(int i10) {
                    super.onWindowVisibilityChanged(i10);
                    int visibility = getVisibility();
                    MRAIDLog.d(TAG, "onWindowVisibilityChanged " + MRAIDView.getVisibilityString(i10) + " (actual " + MRAIDView.getVisibilityString(visibility) + ')');
                    MRAIDView mRAIDView = MRAIDView.this;
                    if (mRAIDView.isInterstitial) {
                        mRAIDView.setViewable(visibility);
                    }
                }

                @Override // android.view.View
                public boolean performClick() {
                    return super.performClick();
                }
            };
            pNWebView.setScrollContainer(false);
            pNWebView.setVerticalScrollBarEnabled(false);
            pNWebView.setHorizontalScrollBarEnabled(false);
            pNWebView.setScrollBarStyle(33554432);
            pNWebView.setOnTouchListener(new View.OnTouchListener() { // from class: net.pubnative.lite.sdk.mraid.MRAIDView.5
                @Override // android.view.View.OnTouchListener
                @SuppressLint({"ClickableViewAccessibility"})
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    MRAIDView.this.wasTouched = true;
                    int action = motionEvent.getAction();
                    if ((action != 0 && action != 1) || view.hasFocus()) {
                        return false;
                    }
                    view.requestFocus();
                    return false;
                }
            });
            pNWebView.getSettings().setJavaScriptEnabled(true);
            pNWebView.getSettings().setDomStorageEnabled(true);
            pNWebView.getSettings().setAllowContentAccess(false);
            pNWebView.enablePlugins(true);
            pNWebView.getSettings().setSupportZoom(false);
            pNWebView.setWebChromeClient(this.mraidWebChromeClient);
            pNWebView.setWebViewClient(this.mraidWebViewClient);
            pNWebView.setLayerType(2, null);
            pNWebView.getSettings().setMediaPlaybackRequiresUserGesture(false);
            return pNWebView;
        } catch (RuntimeException e10) {
            HyBid.reportException((Exception) e10);
            return null;
        }
    }

    private void decodeURL(String str, final boolean z10) {
        try {
            final String strDecode = URLDecoder.decode(str, "UTF-8");
            if (!strDecode.startsWith("http://") && !strDecode.startsWith(DtbConstants.HTTPS)) {
                strDecode = this.baseUrl + strDecode;
            }
            new Thread(new Runnable() { // from class: net.pubnative.lite.sdk.mraid.e
                @Override // java.lang.Runnable
                public final void run() {
                    MRAIDView.m(this.f95922b, z10, strDecode);
                }
            }, "2-part-content").start();
        } catch (UnsupportedEncodingException e10) {
            HyBid.reportException((Exception) e10);
            MRAIDLog.d("hz-m MRAIDView - expand - UnsupportedEncodingException " + e10);
        }
    }

    private void expandCreative(String str, boolean z10, Boolean bool) {
        expandCreative(str, z10, bool, null);
    }

    public static /* synthetic */ void f(MRAIDView mRAIDView, String str) {
        if (mRAIDView.state == 3) {
            mRAIDView.removeResizeView();
            mRAIDView.addView(mRAIDView.webView);
        }
        mRAIDView.webView.setWebChromeClient(null);
        mRAIDView.webView.setWebViewClient(null);
        WebView webViewCreateWebView = mRAIDView.createWebView();
        mRAIDView.webViewPart2 = webViewCreateWebView;
        webViewCreateWebView.loadUrl(str);
        MRAIDLog.d("hz-m MRAIDView - expand - switching out currentwebview for " + mRAIDView.webViewPart2);
        WebView webView = mRAIDView.webViewPart2;
        mRAIDView.currentWebView = webView;
        mRAIDView.isExpandingPart2 = true;
        mRAIDView.expandHelper(webView);
    }

    private void forceFullScreen() {
        if (this.context instanceof Activity) {
            MRAIDLog.d(MRAID_LOG_TAG, "forceFullScreen");
            Activity activity = (Activity) this.context;
            int i10 = activity.getWindow().getAttributes().flags;
            this.isFullScreen = (i10 & 1024) != 0;
            this.isForceNotFullScreen = (i10 & 2048) != 0;
            this.origTitleBarVisibility = -9;
            ActionBar actionBar = activity.getActionBar();
            if (actionBar != null) {
                this.isActionBarShowing = actionBar.isShowing();
                actionBar.hide();
            } else {
                this.titleBar = null;
                try {
                    if (activity.findViewById(android.R.id.title) != null) {
                        this.titleBar = (View) activity.findViewById(android.R.id.title).getParent();
                    }
                } catch (NullPointerException e10) {
                    HyBid.reportException((Exception) e10);
                }
                View view = this.titleBar;
                if (view != null) {
                    this.origTitleBarVisibility = view.getVisibility();
                    this.titleBar.setVisibility(8);
                }
            }
            String str = MRAID_LOG_TAG;
            MRAIDLog.d(str, "isFullScreen " + this.isFullScreen);
            MRAIDLog.d(str, "isForceNotFullScreen " + this.isForceNotFullScreen);
            MRAIDLog.d(str, "isActionBarShowing " + this.isActionBarShowing);
            MRAIDLog.d(str, "origTitleBarVisibility " + getVisibilityString(this.origTitleBarVisibility));
            ((Activity) this.context).getWindow().addFlags(1024);
            ((Activity) this.context).getWindow().clearFlags(2048);
            this.isForcingFullScreen = this.isFullScreen ^ true;
        }
    }

    public static /* synthetic */ void g(MRAIDView mRAIDView) {
        mRAIDView.fireStateChangeEvent();
        MRAIDViewListener mRAIDViewListener = mRAIDView.listener;
        if (mRAIDViewListener != null) {
            mRAIDViewListener.mraidViewClose(mRAIDView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InputStream getMraidJsStream() {
        if (TextUtils.isEmpty(this.mraidJs)) {
            if (TextUtils.isEmpty(Assets.mraidJS)) {
                Logger.e(MRAID_LOG_TAG, "The MRAID JavaScript asset (Assets.mraidJS) is null or empty. Cannot create MRAID JS Stream.");
                return null;
            }
            try {
                this.mraidJs = new String(Base64.decode(Assets.mraidJS, 0), StandardCharsets.UTF_8);
            } catch (IllegalArgumentException e10) {
                Logger.e("MRAIDView", "Failed to decode the MRAID JavaScript asset.", e10);
                return null;
            }
        }
        if (TextUtils.isEmpty(this.mraidJs)) {
            return null;
        }
        return new ByteArrayInputStream(this.mraidJs.getBytes(StandardCharsets.UTF_8));
    }

    private static String getOrientationString(int i10) {
        return i10 != -1 ? i10 != 0 ? i10 != 1 ? "UNKNOWN" : "PORTRAIT" : "LANDSCAPE" : "UNSPECIFIED";
    }

    private String getStringFromFileUrl(String str) {
        StringBuilder sb2 = new StringBuilder();
        String[] strArrSplit = str.split("/");
        if (!strArrSplit[3].equals("android_asset")) {
            MRAIDLog.e("Unknown location to fetch file content");
            return "";
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.context.getAssets().open(strArrSplit[4])));
            try {
                String line = bufferedReader.readLine();
                sb2.append(line);
                while (line != null) {
                    line = bufferedReader.readLine();
                    sb2.append(line);
                }
                bufferedReader.close();
            } finally {
            }
        } catch (IOException e10) {
            MRAIDLog.e("Error fetching file: " + e10.getMessage());
            HyBid.reportException((Exception) e10);
        }
        return sb2.toString();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:6|(2:44|7)|(7:9|10|53|11|(5:12|(1:14)(1:55)|31|(2:46|33)|37)|19|20)(1:25)|50|26|(1:29)|46|33|37) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a4, code lost:
    
        r9 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c8, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c9, code lost:
    
        net.pubnative.lite.sdk.HyBid.reportException((java.lang.Exception) r9);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String getStringFromUrl(java.lang.String r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: net.pubnative.lite.sdk.mraid.MRAIDView.getStringFromUrl(java.lang.String):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getVisibilityString(int i10) {
        return i10 != 0 ? i10 != 4 ? i10 != 8 ? "UNKNOWN" : "GONE" : "INVISIBLE" : "VISIBLE";
    }

    public static /* synthetic */ void h(MRAIDView mRAIDView, int i10) {
        mRAIDView.getClass();
        boolean z10 = i10 == 0;
        if (z10 == mRAIDView.isViewable && mRAIDView.isViewabilityConfirmed) {
            return;
        }
        mRAIDView.isViewable = z10;
        if (mRAIDView.isPageFinished && mRAIDView.isLaidOut) {
            mRAIDView.fireViewableChangeEvent();
            mRAIDView.fireExposureChangeEvent();
            mRAIDView.isViewabilityConfirmed = true;
        }
    }

    private void handleAntilockDelay() {
        SimpleTimer simpleTimer = new SimpleTimer(5000, new SimpleTimer.Listener() { // from class: net.pubnative.lite.sdk.mraid.MRAIDView.7
            @Override // net.pubnative.lite.sdk.vpaid.helpers.SimpleTimer.Listener
            public void onFinish() {
                MRAIDViewListener mRAIDViewListener = MRAIDView.this.listener;
                if (mRAIDViewListener != null) {
                    mRAIDViewListener.mraidShowCloseButton();
                }
                MRAIDView.this.showDefaultCloseButton();
                MRAIDView.this.isBackClickable = Boolean.TRUE;
            }

            @Override // net.pubnative.lite.sdk.vpaid.helpers.SimpleTimer.Listener
            public void onTick(long j10) {
            }
        }, 1000L);
        this.mAntilockTimer = simpleTimer;
        simpleTimer.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleSetCustomisationInjection() {
        HTMLAd hTMLAd = this.htmlAd;
        if (hTMLAd == null || hTMLAd.getLandingPage() == null || TextUtils.isEmpty(this.htmlAd.getLandingPage().getCustomisationString())) {
            return;
        }
        this.webView.evaluateJavascript(this.htmlAd.getLandingPage().getCustomisationString(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleShowingCTA() {
        if (this.ctaView == null || !this.htmlAd.isCustomCTAEnabled().booleanValue() || this.htmlAd.getCustomCTAData() == null) {
            return;
        }
        CustomCTAData customCTAData = this.htmlAd.getCustomCTAData();
        Integer customCTADelay = this.htmlAd.getCustomCTADelay();
        int iIntValue = customCTADelay != null ? customCTADelay.intValue() : 0;
        if (customCTAData.getBitmap() != null) {
            this.ctaView.show(customCTAData.getBitmap(), customCTAData.getLabel(), Integer.valueOf(iIntValue));
        } else if (customCTAData.getIconURL() != null) {
            this.ctaView.show(customCTAData.getIconURL(), customCTAData.getLabel(), Integer.valueOf(iIntValue));
        } else {
            this.ctaView.showWithoutIcon(customCTAData.getLabel(), Integer.valueOf(iIntValue));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hasLandingPage() {
        HTMLAd hTMLAd = this.htmlAd;
        return hTMLAd != null && hTMLAd.hasLandingPage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideContentInfo(View view) {
        ViewGroup viewGroup = this.contentInfo;
        if (viewGroup == null || !this.contentInfoAdded) {
            return;
        }
        ((ViewGroup) view).removeView(viewGroup);
        this.contentInfoAdded = false;
    }

    public static /* synthetic */ void i(MRAIDView mRAIDView) {
        mRAIDView.restoreOriginalOrientation();
        mRAIDView.restoreOriginalScreenState();
    }

    private void initCustomCta() {
        this.ctaView = new HyBidCTAView(this.context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int iAsIntPixels = ViewUtils.asIntPixels(6.0f, this.context);
        int i10 = (new ScreenDimensionsUtils().getScreenDimensionsToPoint(this.context).y * 10) / 100;
        layoutParams.setMargins(iAsIntPixels, i10, iAsIntPixels, i10);
        layoutParams.gravity = 8388693;
        this.ctaView.setLayoutParams(layoutParams);
        this.ctaView.setContentDescription("ctaView");
        this.ctaView.setVisibility(8);
        addView(this.ctaView);
        this.ctaView.setListener(new HyBidCTAView.CTAViewListener() { // from class: net.pubnative.lite.sdk.mraid.MRAIDView.3
            @Override // net.pubnative.lite.sdk.views.cta.HyBidCTAView.CTAViewListener
            public void onClick() {
                MRAIDView mRAIDView = MRAIDView.this;
                mRAIDView.wasTouched = true;
                HTMLAd hTMLAd = mRAIDView.htmlAd;
                if (hTMLAd != null && !TextUtils.isEmpty(hTMLAd.getLink())) {
                    MRAIDView mRAIDView2 = MRAIDView.this;
                    mRAIDView2.open(mRAIDView2.htmlAd.getLink());
                }
                MRAIDViewListener mRAIDViewListener = MRAIDView.this.listener;
                if (mRAIDViewListener != null) {
                    mRAIDViewListener.onCustomCTAClick();
                }
            }

            @Override // net.pubnative.lite.sdk.views.cta.HyBidCTAView.CTAViewListener
            public void onFail() {
                MRAIDViewListener mRAIDViewListener = MRAIDView.this.listener;
                if (mRAIDViewListener != null) {
                    mRAIDViewListener.onCustomCTALoadFail();
                }
            }

            @Override // net.pubnative.lite.sdk.views.cta.HyBidCTAView.CTAViewListener
            public void onInvalidCTAIconUrl() {
            }

            @Override // net.pubnative.lite.sdk.views.cta.HyBidCTAView.CTAViewListener
            public void onShow() {
                MRAIDViewListener mRAIDViewListener = MRAIDView.this.listener;
                if (mRAIDViewListener != null) {
                    mRAIDViewListener.onCustomCTAShow();
                }
            }
        });
    }

    private void initEndCardView(boolean z10) {
        HyBidEndCardView hyBidEndCardView = new HyBidEndCardView(this.context, z10, (ReplayListener) null);
        this.mEndCardView = hyBidEndCardView;
        hyBidEndCardView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.mEndCardView.setVisibility(8);
        addView(this.mEndCardView);
    }

    private void injectMraidJs(WebView webView) {
        if (TextUtils.isEmpty(this.mraidJs)) {
            this.mraidJs = new String(Base64.decode(Assets.mraidJS, 0));
        }
        injectJavaScript(this.mraidJs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isCloseSignal(String str) {
        Uri uri;
        List<String> pathSegments;
        if (!str.contains("https://feedback.verve.com") || (uri = Uri.parse(str)) == null || (pathSegments = uri.getPathSegments()) == null || pathSegments.isEmpty()) {
            return false;
        }
        return uri.getPathSegments().contains("close");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isVerveCustomExpand(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return (str.contains("tags-prod.vrvm.com") || str.contains("ad.vrvm.com")) && str.contains("type=expandable");
    }

    public static /* synthetic */ void j(MRAIDView mRAIDView) {
        int i10 = mRAIDView.state;
        if (i10 != 1 && i10 != 2) {
            if (i10 == 3) {
                mRAIDView.closeFromResized();
            }
        } else {
            MRAIDViewCloseLayoutListener mRAIDViewCloseLayoutListener = mRAIDView.closeLayoutListener;
            if (mRAIDViewCloseLayoutListener != null) {
                mRAIDViewCloseLayoutListener.onClose();
            } else {
                mRAIDView.closeFromExpanded();
            }
        }
    }

    public static /* synthetic */ void m(final MRAIDView mRAIDView, boolean z10, final String str) {
        mRAIDView.getClass();
        MRAIDLog.d("hz-m MRAIDView - expand - url loading thread");
        if (z10) {
            Context context = mRAIDView.context;
            if (context instanceof Activity) {
                ((Activity) context).runOnUiThread(new Runnable() { // from class: net.pubnative.lite.sdk.mraid.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        MRAIDView.f(this.f95925b, str);
                    }
                });
                return;
            }
            MRAIDLog.e("Could not load part 2 expanded content for URL: " + str);
            return;
        }
        Context context2 = mRAIDView.context;
        if (context2 instanceof Activity) {
            ((Activity) context2).runOnUiThread(new Runnable() { // from class: net.pubnative.lite.sdk.mraid.g
                @Override // java.lang.Runnable
                public final void run() {
                    MRAIDView.a(this.f95927b, str);
                }
            });
            return;
        }
        MRAIDLog.e("Could not load part 2 expanded content for URL: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onLayoutWebView(WebView webView, boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11 = webView == this.currentWebView;
        String str = MRAID_LOG_TAG;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onLayoutWebView ");
        sb2.append(webView == this.webView ? "1 " : "2 ");
        sb2.append(z11);
        sb2.append(" (");
        sb2.append(this.state);
        sb2.append(") ");
        sb2.append(z10);
        sb2.append(" ");
        sb2.append(i10);
        sb2.append(" ");
        sb2.append(i11);
        sb2.append(" ");
        sb2.append(i12);
        sb2.append(" ");
        sb2.append(i13);
        MRAIDLog.w(str, sb2.toString());
        if (!z11) {
            MRAIDLog.d(str, "onLayoutWebView ignored, not current");
            return;
        }
        int i14 = this.state;
        if (i14 == 0 || i14 == 1) {
            calculateScreenSize();
            calculateMaxSize();
        }
        if (!this.isClosing) {
            calculatePosition(true);
            if (this.isInterstitial && !this.defaultPosition.equals(this.currentPosition)) {
                this.defaultPosition = new Rect(this.currentPosition);
                setDefaultPosition();
            }
        }
        if (this.isExpandingFromDefault) {
            this.isExpandingFromDefault = false;
            if (this.isInterstitial) {
                this.state = 1;
                this.isLaidOut = true;
            }
            if (!this.isExpandingPart2) {
                MRAIDLog.d(str, "calling fireStateChangeEvent 1");
                fireStateChangeEvent();
            }
            if (this.isInterstitial) {
                fireReadyEvent();
                setViewable(this.isViewable ? 0 : 8);
            }
            MRAIDViewListener mRAIDViewListener = this.listener;
            if (mRAIDViewListener != null) {
                mRAIDViewListener.mraidViewExpand(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @JavascriptMRAIDCallback
    public void open(String str) {
        try {
            String strDecode = URLDecoder.decode(str, "UTF-8");
            StringBuilder sb2 = new StringBuilder();
            String str2 = MRAID_LOG_TAG;
            sb2.append(str2);
            sb2.append("-JS callback");
            MRAIDLog.d(sb2.toString(), "open " + strDecode + " touched: " + this.wasTouched);
            if (!this.wasTouched) {
                MRAIDLog.d(str2 + "- JS callback", "open called, but no touch recorded, aborting");
                return;
            }
            if (this.nativeFeatureListener != null) {
                if (strDecode.startsWith(MRAIDNativeFeature.SMS)) {
                    this.nativeFeatureListener.mraidNativeFeatureSendSms(strDecode);
                } else if (strDecode.startsWith(MRAIDNativeFeature.TEL)) {
                    this.nativeFeatureListener.mraidNativeFeatureCallTel(strDecode);
                } else {
                    this.nativeFeatureListener.mraidNativeFeatureOpenBrowser(strDecode);
                }
            }
            this.wasOpened = true;
        } catch (UnsupportedEncodingException e10) {
            HyBid.reportException((Exception) e10);
            Logger.e(MRAID_LOG_TAG, e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void parseCommandUrl(java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: net.pubnative.lite.sdk.mraid.MRAIDView.parseCommandUrl(java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void parseRedirectionUrl(String str) {
        HTMLAd hTMLAd = this.htmlAd;
        if (hTMLAd == null || TextUtils.isEmpty(hTMLAd.getLink())) {
            try {
                if (str.matches("verveadexperience://setRedirectionUrl\\?text=(.+)")) {
                    this.htmlAd.setLink(new String(Base64.decode(str.replaceFirst("verveadexperience://setRedirectionUrl\\?text=(.+)", "$1"), 0)));
                }
            } catch (RuntimeException e10) {
                Logger.d(MRAID_LOG_TAG, "Error parsing redirection url: " + e10);
                this.htmlAd.setLink(null);
            }
        }
    }

    @JavascriptMRAIDCallback
    private void playVideo(String str) {
        try {
            String strDecode = URLDecoder.decode(str, "UTF-8");
            MRAIDLog.d(MRAID_LOG_TAG + "-JS callback", "playVideo " + strDecode);
            MRAIDNativeFeatureListener mRAIDNativeFeatureListener = this.nativeFeatureListener;
            if (mRAIDNativeFeatureListener != null) {
                mRAIDNativeFeatureListener.mraidNativeFeaturePlayVideo(strDecode);
            }
        } catch (UnsupportedEncodingException e10) {
            HyBid.reportException((Exception) e10);
            Logger.e(MRAID_LOG_TAG, e10.getMessage());
        }
    }

    private int px2dip(int i10) {
        DisplayMetrics displayMetrics = this.displayMetrics;
        return displayMetrics != null ? (i10 * 160) / displayMetrics.densityDpi : i10;
    }

    private void removeDefaultCloseButton() {
        ImageButton imageButton = this.closeRegion;
        if (imageButton != null) {
            imageButton.setImageResource(android.R.color.transparent);
        }
    }

    private void removeResizeView() {
        RelativeLayout relativeLayout = this.resizedView;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
            Context context = this.context;
            if (context instanceof Activity) {
                ((FrameLayout) ((Activity) context).findViewById(android.R.id.content)).removeView(this.resizedView);
                this.resizedView = null;
                this.closeRegion = null;
            }
        }
    }

    @JavascriptMRAIDCallback
    private void resize() {
        MRAIDLog.d(MRAID_LOG_TAG + "-JS callback", "resize");
        MRAIDViewListener mRAIDViewListener = this.listener;
        if (mRAIDViewListener == null) {
            return;
        }
        MRAIDResizeProperties mRAIDResizeProperties = this.resizeProperties;
        if (mRAIDViewListener.mraidViewResize(this, mRAIDResizeProperties.width, mRAIDResizeProperties.height, mRAIDResizeProperties.offsetX, mRAIDResizeProperties.offsetY)) {
            this.state = 3;
            if (this.resizedView == null) {
                this.resizedView = new RelativeLayout(this.context);
                removeView(this.webView);
                this.resizedView.addView(this.webView);
                addCloseRegion(this.resizedView);
                ((FrameLayout) getRootView().findViewById(android.R.id.content)).addView(this.resizedView);
            }
            setCloseRegionPosition(this.resizedView);
            setResizedViewSize();
            setResizedViewPosition();
            this.handler.post(new Runnable() { // from class: net.pubnative.lite.sdk.mraid.p
                @Override // java.lang.Runnable
                public final void run() {
                    this.f95938b.fireStateChangeEvent();
                }
            });
        }
    }

    private void restoreOriginalOrientation() {
        if (this.context instanceof Activity) {
            MRAIDLog.d(MRAID_LOG_TAG, "restoreOriginalOrientation");
            Activity activity = (Activity) this.context;
            int requestedOrientation = activity.getRequestedOrientation();
            int i10 = this.originalRequestedOrientation;
            if (requestedOrientation != i10) {
                activity.setRequestedOrientation(i10);
            }
        }
    }

    private void restoreOriginalScreenState() {
        Context context = this.context;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (!this.isFullScreen) {
                activity.getWindow().clearFlags(1024);
            }
            if (this.isForceNotFullScreen) {
                activity.getWindow().addFlags(2048);
            }
            if (this.isActionBarShowing) {
                ActionBar actionBar = activity.getActionBar();
                if (actionBar != null) {
                    actionBar.show();
                    return;
                }
                return;
            }
            View view = this.titleBar;
            if (view != null) {
                view.setVisibility(this.origTitleBarVisibility);
            }
        }
    }

    private void setCloseRegionPosition(View view) {
        DisplayMetrics displayMetrics = this.displayMetrics;
        if (displayMetrics != null) {
            int iApplyDimension = (int) TypedValue.applyDimension(1, 50.0f, displayMetrics);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iApplyDimension, iApplyDimension);
            if (view != this.expandedView) {
                if (view == this.resizedView) {
                    switch (this.resizeProperties.customClosePosition) {
                        case 0:
                        case 4:
                            layoutParams.addRule(9);
                            break;
                        case 1:
                        case 3:
                        case 5:
                            layoutParams.addRule(14);
                            break;
                        case 2:
                        case 6:
                            layoutParams.addRule(11);
                            break;
                    }
                    switch (this.resizeProperties.customClosePosition) {
                        case 0:
                        case 1:
                        case 2:
                            layoutParams.addRule(10);
                            break;
                        case 3:
                            layoutParams.addRule(15);
                            break;
                        case 4:
                        case 5:
                        case 6:
                            layoutParams.addRule(12);
                            break;
                    }
                }
            } else {
                layoutParams.addRule(10);
                layoutParams.addRule(20);
            }
            this.closeRegion.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentPosition() {
        Rect rect = this.currentPosition;
        int i10 = rect.left;
        int i11 = rect.top;
        int iWidth = rect.width();
        int iHeight = this.currentPosition.height();
        MRAIDLog.d(MRAID_LOG_TAG, "setCurrentPosition [" + i10 + StringUtils.COMMA + i11 + "] (" + iWidth + "x" + iHeight + ")");
        injectJavaScript("mraid.setCurrentPosition(" + px2dip(i10) + StringUtils.COMMA + px2dip(i11) + StringUtils.COMMA + px2dip(iWidth) + StringUtils.COMMA + px2dip(iHeight) + ");");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultPosition() {
        Rect rect = this.defaultPosition;
        int i10 = rect.left;
        int i11 = rect.top;
        int iWidth = rect.width();
        int iHeight = this.defaultPosition.height();
        MRAIDLog.d(MRAID_LOG_TAG, "setDefaultPosition [" + i10 + StringUtils.COMMA + i11 + "] (" + iWidth + "x" + iHeight + ")");
        injectJavaScript("mraid.setDefaultPosition(" + px2dip(i10) + StringUtils.COMMA + px2dip(i11) + StringUtils.COMMA + px2dip(iWidth) + StringUtils.COMMA + px2dip(iHeight) + ");");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnvironmentVariables() {
        DeviceInfo deviceInfo = HyBid.getDeviceInfo();
        if (getContext() != null && getContext().getApplicationContext() != null && !TextUtils.isEmpty(getContext().getApplicationContext().getPackageName())) {
            injectJavaScript("mraid.setAppId(\"" + getContext().getApplicationContext().getPackageName() + "\");");
        }
        injectJavaScript("mraid.setSdkVersion(\"3.7.1\");");
        injectJavaScript("mraid.setCoppa(" + HyBid.isCoppaEnabled() + ");");
        if (deviceInfo != null) {
            if (!deviceInfo.limitTracking() && !TextUtils.isEmpty(deviceInfo.getAdvertisingId())) {
                injectJavaScript("mraid.setIfa(\"" + deviceInfo.getAdvertisingId() + "\");");
            }
            injectJavaScript("mraid.setLimitAdTracking(" + deviceInfo.limitTracking() + ");");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocation() {
        if (!this.nativeFeatureManager.isLocationSupported()) {
            injectJavaScript("mraid.setLocation(-1);");
            return;
        }
        HyBidLocationManager locationManager = HyBid.getLocationManager();
        if (locationManager == null || locationManager.getUserLocation() == null) {
            injectJavaScript("mraid.setLocation(-1);");
            return;
        }
        Location userLocation = locationManager.getUserLocation();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(N6.f41419s, Math.round(userLocation.getLatitude() * 100.0d) / 100.0d);
            jSONObject.put("lon", Math.round(userLocation.getLongitude() * 100.0d) / 100.0d);
            jSONObject.put("type", 1);
            jSONObject.put("accuracy", userLocation.getAccuracy());
            jSONObject.put("lastfix", (SystemClock.elapsedRealtimeNanos() - userLocation.getElapsedRealtimeNanos()) / 1000000000);
            injectJavaScript("mraid.setLocation(" + jSONObject + ");");
        } catch (JSONException e10) {
            HyBid.reportException((Exception) e10);
            Logger.e(MRAID_LOG_TAG, "Error passing location to MRAID interface");
            injectJavaScript("mraid.setLocation(-1);");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxSize() {
        String str = MRAID_LOG_TAG;
        MRAIDLog.d(str, "setMaxSize");
        Size size = this.maxSize;
        int i10 = size.width;
        int i11 = size.height;
        MRAIDLog.d(str, "setMaxSize " + i10 + "x" + i11);
        injectJavaScript("mraid.setMaxSize(" + px2dip(i10) + StringUtils.COMMA + px2dip(i11) + ");");
    }

    private void setOrientationInitialState() {
        Context context = this.context;
        if (context == null || !(context instanceof Activity)) {
            return;
        }
        ((Activity) context).setRequestedOrientation(this.activityInitialOrientation);
    }

    @JavascriptMRAIDCallback
    private void setResizeProperties(Map<String, String> map) {
        int i10 = Integer.parseInt(map.get("width"));
        int i11 = Integer.parseInt(map.get("height"));
        int i12 = Integer.parseInt(map.get("offsetX"));
        int i13 = Integer.parseInt(map.get("offsetY"));
        String str = map.get("customClosePosition");
        boolean z10 = Boolean.parseBoolean(map.get("allowOffscreen"));
        MRAIDLog.d(MRAID_LOG_TAG + "-JS callback", "setResizeProperties " + i10 + " " + i11 + " " + i12 + " " + i13 + " " + str + " " + z10);
        MRAIDResizeProperties mRAIDResizeProperties = this.resizeProperties;
        mRAIDResizeProperties.width = i10;
        mRAIDResizeProperties.height = i11;
        mRAIDResizeProperties.offsetX = i12;
        mRAIDResizeProperties.offsetY = i13;
        mRAIDResizeProperties.customClosePosition = MRAIDResizeProperties.customClosePositionFromString(str);
        this.resizeProperties.allowOffscreen = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResizedViewPosition() {
        if (this.displayMetrics != null) {
            MRAIDLog.d(MRAID_LOG_TAG, "setResizedViewPosition");
            if (this.resizedView == null) {
                return;
            }
            MRAIDResizeProperties mRAIDResizeProperties = this.resizeProperties;
            int i10 = mRAIDResizeProperties.width;
            int i11 = mRAIDResizeProperties.height;
            int i12 = mRAIDResizeProperties.offsetX;
            int i13 = mRAIDResizeProperties.offsetY;
            int iApplyDimension = (int) TypedValue.applyDimension(1, i10, this.displayMetrics);
            int iApplyDimension2 = (int) TypedValue.applyDimension(1, i11, this.displayMetrics);
            int iApplyDimension3 = (int) TypedValue.applyDimension(1, i12, this.displayMetrics);
            int iApplyDimension4 = (int) TypedValue.applyDimension(1, i13, this.displayMetrics);
            Rect rect = this.defaultPosition;
            int i14 = rect.left + iApplyDimension3;
            int i15 = rect.top + iApplyDimension4;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.resizedView.getLayoutParams();
            layoutParams.leftMargin = i14;
            layoutParams.topMargin = i15;
            this.resizedView.setLayoutParams(layoutParams);
            Rect rect2 = this.currentPosition;
            if (i14 == rect2.left && i15 == rect2.top && iApplyDimension == rect2.width() && iApplyDimension2 == this.currentPosition.height()) {
                return;
            }
            Rect rect3 = this.currentPosition;
            rect3.left = i14;
            rect3.top = i15;
            rect3.right = i14 + iApplyDimension;
            rect3.bottom = i15 + iApplyDimension2;
            setCurrentPosition();
        }
    }

    private void setResizedViewSize() {
        if (this.displayMetrics != null) {
            String str = MRAID_LOG_TAG;
            MRAIDLog.d(str, "setResizedViewSize");
            MRAIDResizeProperties mRAIDResizeProperties = this.resizeProperties;
            int i10 = mRAIDResizeProperties.width;
            int i11 = mRAIDResizeProperties.height;
            MRAIDLog.d(str, "setResizedViewSize " + i10 + "x" + i11);
            this.resizedView.setLayoutParams(new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, (float) i10, this.displayMetrics), (int) TypedValue.applyDimension(1, (float) i11, this.displayMetrics)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScreenSize() {
        String str = MRAID_LOG_TAG;
        MRAIDLog.d(str, "setScreenSize");
        Size size = this.screenSize;
        int i10 = size.width;
        int i11 = size.height;
        MRAIDLog.d(str, "setScreenSize " + i10 + "x" + i11);
        injectJavaScript("mraid.setScreenSize(" + px2dip(i10) + StringUtils.COMMA + px2dip(i11) + ");");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSupportedServices() {
        MRAIDLog.d(MRAID_LOG_TAG, "setSupportedServices");
        injectJavaScript("mraid.setSupports(mraid.SUPPORTED_FEATURES.CALENDAR, " + this.nativeFeatureManager.isCalendarSupported() + ");");
        injectJavaScript("mraid.setSupports(mraid.SUPPORTED_FEATURES.INLINEVIDEO, " + this.nativeFeatureManager.isInlineVideoSupported() + ");");
        injectJavaScript("mraid.setSupports(mraid.SUPPORTED_FEATURES.SMS, " + this.nativeFeatureManager.isSmsSupported() + ");");
        injectJavaScript("mraid.setSupports(mraid.SUPPORTED_FEATURES.STOREPICTURE, " + this.nativeFeatureManager.isStorePictureSupported() + ");");
        injectJavaScript("mraid.setSupports(mraid.SUPPORTED_FEATURES.TEL, " + this.nativeFeatureManager.isTelSupported() + ");");
        injectJavaScript("mraid.setSupports(mraid.SUPPORTED_FEATURES.LOCATION, " + this.nativeFeatureManager.isLocationSupported() + ");");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean shouldTriggerClickThrough() {
        return this.wasTouched && !this.wasOpened;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showClose() {
        SimpleTimer simpleTimer = this.mNativeCloseButtonTimer;
        if (simpleTimer != null) {
            simpleTimer.onFinish();
            this.mNativeCloseButtonTimer = null;
        }
        MRAIDViewListener mRAIDViewListener = this.listener;
        if (mRAIDViewListener != null) {
            mRAIDViewListener.mraidShowCloseButton();
        }
        showDefaultCloseButton();
        this.isBackClickable = Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showDefaultCloseButton() {
        ImageButton imageButton = this.closeRegion;
        if (imageButton != null) {
            Context context = imageButton.getContext();
            Integer normalCloseXmlResource = HyBid.getNormalCloseXmlResource();
            int i10 = R.mipmap.close;
            Bitmap bitmap = BitmapHelper.toBitmap(context, normalCloseXmlResource, Integer.valueOf(i10));
            if (bitmap != null) {
                this.closeRegion.setImageBitmap(bitmap);
            } else {
                ImageButton imageButton2 = this.closeRegion;
                imageButton2.setImageBitmap(BitmapHelper.decodeResource(imageButton2.getContext(), Integer.valueOf(i10)));
            }
            this.closeRegion.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
    }

    private void showEndCard() {
        HyBidEndCardView hyBidEndCardView = this.mEndCardView;
        if (hyBidEndCardView != null) {
            MraidDisplayMode mraidDisplayMode = this.mMraidDisplayMode;
            MraidDisplayMode mraidDisplayMode2 = MraidDisplayMode.END_CARD;
            if (mraidDisplayMode != mraidDisplayMode2) {
                this.mMraidDisplayMode = mraidDisplayMode2;
                hyBidEndCardView.setEndCardViewListener(new HyBidEndCardView.EndCardViewListener() { // from class: net.pubnative.lite.sdk.mraid.MRAIDView.8
                    @Override // net.pubnative.lite.sdk.views.endcard.HyBidEndCardView.EndCardViewListener
                    public void onClick(String str, Boolean bool, String str2) {
                        MRAIDView mRAIDView = MRAIDView.this;
                        mRAIDView.wasTouched = true;
                        HTMLAd hTMLAd = mRAIDView.htmlAd;
                        if (hTMLAd != null && !TextUtils.isEmpty(hTMLAd.getLink())) {
                            MRAIDView mRAIDView2 = MRAIDView.this;
                            mRAIDView2.open(mRAIDView2.htmlAd.getLink());
                        }
                        MRAIDViewListener mRAIDViewListener = MRAIDView.this.listener;
                        if (mRAIDViewListener != null) {
                            mRAIDViewListener.onCustomEndCardClicked();
                        }
                    }

                    @Override // net.pubnative.lite.sdk.views.endcard.HyBidEndCardView.EndCardViewListener
                    public void onClose(Boolean bool) {
                        MRAIDViewListener mRAIDViewListener = MRAIDView.this.listener;
                        if (mRAIDViewListener != null) {
                            mRAIDViewListener.onCustomEndCardClosed();
                        }
                        MRAIDView.this.close();
                    }

                    @Override // net.pubnative.lite.sdk.views.endcard.HyBidEndCardView.EndCardViewListener
                    public void onLoadFail(Boolean bool) {
                        MRAIDViewListener mRAIDViewListener = MRAIDView.this.listener;
                        if (mRAIDViewListener != null) {
                            mRAIDViewListener.onCustomEndCardLoadFail();
                        }
                    }

                    @Override // net.pubnative.lite.sdk.views.endcard.HyBidEndCardView.EndCardViewListener
                    public void onLoadSuccess(Boolean bool) {
                        MRAIDView mRAIDView = MRAIDView.this;
                        if (mRAIDView.listener != null) {
                            mRAIDView.hideContentInfo(mRAIDView);
                            MRAIDView.this.listener.onCustomEndCardLoadSuccess();
                        }
                    }

                    @Override // net.pubnative.lite.sdk.views.endcard.HyBidEndCardView.EndCardViewListener
                    public void onShow(Boolean bool, String str) {
                        HyBidCTAView hyBidCTAView = MRAIDView.this.ctaView;
                        if (hyBidCTAView != null) {
                            hyBidCTAView.setVisibility(8);
                            MRAIDView.this.ctaView.killTimer();
                        }
                        HyBidEndCardView hyBidEndCardView2 = MRAIDView.this.mEndCardView;
                        if (hyBidEndCardView2 != null) {
                            hyBidEndCardView2.bringToFront();
                        }
                        MRAIDViewListener mRAIDViewListener = MRAIDView.this.listener;
                        if (mRAIDViewListener != null) {
                            mRAIDViewListener.onCustomEndCardShow(str);
                        }
                    }

                    @Override // net.pubnative.lite.sdk.views.endcard.HyBidEndCardView.EndCardViewListener
                    public void onSkip() {
                    }
                });
                this.mEndCardView.setSkipOffset(new SkipOffset(this.htmlAd.getEndCardCloseDelay().intValue(), true));
                this.mEndCardView.show(this.htmlAd.getEndCardData(), null);
                this.mEndCardView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: net.pubnative.lite.sdk.mraid.k
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                        MRAIDView mRAIDView = this.f95931b;
                        mRAIDView.mEndCardView.post(new Runnable() { // from class: net.pubnative.lite.sdk.mraid.b
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f95919b.mEndCardView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                            }
                        });
                    }
                });
                this.mEndCardView.showCloseButton(new CloseButtonListener() { // from class: net.pubnative.lite.sdk.mraid.l
                    @Override // net.pubnative.lite.sdk.vpaid.CloseButtonListener
                    public final void onCloseButtonVisible() {
                        this.f95932a.isBackClickable = Boolean.TRUE;
                    }
                });
                return;
            }
        }
        if (this.mMraidDisplayMode != MraidDisplayMode.END_CARD || hyBidEndCardView == null) {
            return;
        }
        hyBidEndCardView.resume();
    }

    private void startClickThroughTimer() {
        if (this.htmlAd != null) {
            SimpleTimer simpleTimer = new SimpleTimer(r0.getClickThroughTimer(), new SimpleTimer.Listener() { // from class: net.pubnative.lite.sdk.mraid.MRAIDView.9
                @Override // net.pubnative.lite.sdk.vpaid.helpers.SimpleTimer.Listener
                public void onFinish() {
                    if (MRAIDView.this.shouldTriggerClickThrough()) {
                        ClickThroughTimerManager.ClickThroughTimerListener clickThroughTimerListener = MRAIDView.this.clickThroughListener;
                        if (clickThroughTimerListener != null) {
                            clickThroughTimerListener.onClickThroughTriggered();
                        }
                        HTMLAd hTMLAd = MRAIDView.this.htmlAd;
                        if (hTMLAd != null && !TextUtils.isEmpty(hTMLAd.getLink())) {
                            MRAIDView mRAIDView = MRAIDView.this;
                            mRAIDView.open(mRAIDView.htmlAd.getLink());
                        }
                        MRAIDView.this.mClickThroughTimer.pause();
                        MRAIDView.this.mClickThroughTimer.cancel();
                        MRAIDView.this.mClickThroughTimer = null;
                    }
                }

                @Override // net.pubnative.lite.sdk.vpaid.helpers.SimpleTimer.Listener
                public void onTick(long j10) {
                }
            }, 10L);
            this.mClickThroughTimer = simpleTimer;
            simpleTimer.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void startSkipTimer() {
        Integer closeDelay;
        Integer numValueOf;
        try {
            MRAIDViewListener mRAIDViewListener = this.listener;
            if (mRAIDViewListener != null) {
                mRAIDViewListener.mraidHideSkipButton();
                this.listener.mraidHideCloseButton();
            }
            HTMLAd hTMLAd = this.htmlAd;
            if (hTMLAd != null) {
                if (hTMLAd.getLandingPage() == null || !this.htmlAd.getLandingPage().isLandingPageEnabled().booleanValue()) {
                    if (this.mEndCardView != null) {
                        this.useCustomClose = false;
                        closeDelay = this.htmlAd.getSkipDelay();
                        CountDownView countDownView = this.mSkipCountdownView;
                        if (countDownView != null) {
                            countDownView.setVisibility(0);
                        }
                        startClickThroughTimer();
                    } else if (this.useCustomClose) {
                        closeDelay = this.htmlAd.getNativeButtonCloseDelay();
                        this.mNativeCloseButtonDelay = closeDelay;
                        handleNativeCloseButtonDelay();
                        CountDownView countDownView2 = this.mSkipCountdownView;
                        if (countDownView2 != null) {
                            countDownView2.setVisibility(0);
                        }
                    } else {
                        closeDelay = this.htmlAd.getCloseDelay();
                        CountDownView countDownView3 = this.mSkipCountdownView;
                        if (countDownView3 != null) {
                            countDownView3.setVisibility(0);
                        }
                    }
                    numValueOf = closeDelay;
                } else {
                    this.useCustomClose = false;
                    this.mEndCardView = null;
                    int updatedDelay = this.htmlAd.getLandingPage().getUpdatedDelay();
                    numValueOf = Integer.valueOf(updatedDelay);
                    this.mNativeCloseButtonDelay = numValueOf;
                    handleNativeCloseButtonDelay();
                    this.mSkipTimeMillis = Integer.valueOf(updatedDelay);
                    CountDownView countDownView4 = this.mSkipCountdownView;
                    if (countDownView4 != null) {
                        countDownView4.setVisibility(4);
                    }
                }
                this.mSkipTimeMillis = numValueOf;
                if (numValueOf.intValue() > 0) {
                    if (this.showTimerBeforeEndCard.booleanValue()) {
                        SimpleTimer simpleTimer = new SimpleTimer(numValueOf.intValue(), new SimpleTimer.Listener() { // from class: net.pubnative.lite.sdk.mraid.MRAIDView.6
                            @Override // net.pubnative.lite.sdk.vpaid.helpers.SimpleTimer.Listener
                            public void onFinish() {
                                HTMLAd hTMLAd2;
                                MRAIDView mRAIDView = MRAIDView.this;
                                if (mRAIDView.mEndCardView == null || (hTMLAd2 = mRAIDView.htmlAd) == null || TextUtils.isEmpty(hTMLAd2.getLink())) {
                                    MRAIDViewListener mRAIDViewListener2 = MRAIDView.this.listener;
                                    if (mRAIDViewListener2 != null) {
                                        mRAIDViewListener2.mraidShowCloseButton();
                                    }
                                    MRAIDView.this.isBackClickable = Boolean.TRUE;
                                } else {
                                    MRAIDViewListener mRAIDViewListener3 = MRAIDView.this.listener;
                                    if (mRAIDViewListener3 != null) {
                                        mRAIDViewListener3.mraidShowSkipButton();
                                    }
                                    MRAIDView.this.isBackClickable = Boolean.FALSE;
                                }
                                HTMLAd hTMLAd3 = MRAIDView.this.htmlAd;
                                if (hTMLAd3 != null && hTMLAd3.getLandingPage() != null && MRAIDView.this.htmlAd.getLandingPage().isLandingPageEnabled().booleanValue()) {
                                    MRAIDView.this.htmlAd.getLandingPage().setIsTimerFinished(true);
                                }
                                CountDownView countDownView5 = MRAIDView.this.mSkipCountdownView;
                                if (countDownView5 != null) {
                                    countDownView5.setVisibility(8);
                                }
                            }

                            @Override // net.pubnative.lite.sdk.vpaid.helpers.SimpleTimer.Listener
                            public void onTick(long j10) {
                                MRAIDView mRAIDView = MRAIDView.this;
                                CountDownView countDownView5 = mRAIDView.mSkipCountdownView;
                                if (countDownView5 != null) {
                                    countDownView5.setProgress((int) (((long) mRAIDView.mSkipTimeMillis.intValue()) - j10), MRAIDView.this.mSkipTimeMillis.intValue());
                                }
                            }
                        }, 10L);
                        this.mExpirationTimer = simpleTimer;
                        simpleTimer.start();
                    }
                } else if (numValueOf.intValue() == 0) {
                    if (this.mEndCardView != null) {
                        MRAIDViewListener mRAIDViewListener2 = this.listener;
                        if (mRAIDViewListener2 != null) {
                            mRAIDViewListener2.mraidShowSkipButton();
                        }
                        this.isBackClickable = Boolean.FALSE;
                        return;
                    }
                    MRAIDViewListener mRAIDViewListener3 = this.listener;
                    if (mRAIDViewListener3 != null) {
                        mRAIDViewListener3.mraidShowCloseButton();
                    }
                    this.isBackClickable = Boolean.TRUE;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @JavascriptMRAIDCallback
    private void storePicture(String str) {
        try {
            String strDecode = URLDecoder.decode(str, "UTF-8");
            MRAIDLog.d(MRAID_LOG_TAG + "-JS callback", "storePicture " + strDecode);
            MRAIDNativeFeatureListener mRAIDNativeFeatureListener = this.nativeFeatureListener;
            if (mRAIDNativeFeatureListener != null) {
                mRAIDNativeFeatureListener.mraidNativeFeatureStorePicture(strDecode);
            }
        } catch (UnsupportedEncodingException e10) {
            HyBid.reportException((Exception) e10);
            Logger.e(MRAID_LOG_TAG, e10.getMessage());
        }
    }

    @JavascriptMRAIDCallback
    @Deprecated
    private void useCustomClose(String str) {
        MRAIDLog.d(MRAID_LOG_TAG + "-JS callback", "useCustomClose " + str);
        boolean z10 = Boolean.parseBoolean(str);
        if (this.useCustomClose != z10) {
            this.useCustomClose = z10;
        }
    }

    public void addViewabilityFriendlyObstruction(View view, BaseFriendlyObstructionPurpose baseFriendlyObstructionPurpose, String str) {
        if (this.mViewabilityFriendlyObstructions == null || view == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.mViewabilityFriendlyObstructions.add(new HyBidViewabilityFriendlyObstruction(view, baseFriendlyObstructionPurpose, str));
    }

    protected void applyOrientationProperties() {
        if (this.context instanceof Activity) {
            String str = MRAID_LOG_TAG;
            MRAIDLog.d(str, "applyOrientationProperties " + this.orientationProperties.allowOrientationChange + " " + this.orientationProperties.forceOrientationString());
            Activity activity = (Activity) this.context;
            int i10 = 0;
            int i11 = getResources().getConfiguration().orientation == 1 ? 1 : 0;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("currentOrientation ");
            sb2.append(i11 != 0 ? "portrait" : "landscape");
            MRAIDLog.d(str, sb2.toString());
            MRAIDOrientationProperties mRAIDOrientationProperties = this.orientationProperties;
            int i12 = mRAIDOrientationProperties.forceOrientation;
            if (i12 == 0) {
                i10 = 1;
            } else if (i12 != 1) {
                i10 = mRAIDOrientationProperties.allowOrientationChange ? -1 : i11;
            }
            activity.setRequestedOrientation(i10);
        }
    }

    @Override // net.pubnative.lite.sdk.mraid.model.LandingPageHandler.LandingPageCallback
    public void cancelLandingPageBehaviour() {
        CountDownView countDownView = this.mSkipCountdownView;
        if (countDownView != null) {
            countDownView.setVisibility(8);
            this.mSkipCountdownView = null;
        }
        postDelayed(new Runnable() { // from class: net.pubnative.lite.sdk.mraid.m
            @Override // java.lang.Runnable
            public final void run() {
                this.f95933b.showClose();
            }
        }, 600L);
    }

    public void clearView() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.setWebChromeClient(null);
            this.webView.setWebViewClient(null);
            this.webView.loadUrl(AndroidWebViewClient.BLANK_PAGE);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @JavascriptMRAIDCallback
    public void close() {
        MRAIDLog.d(MRAID_LOG_TAG + "-JS callback", "close");
        MRAIDLog.d("hz-m closing wv: " + this.webView);
        this.handler.post(new Runnable() { // from class: net.pubnative.lite.sdk.mraid.d
            @Override // java.lang.Runnable
            public final void run() {
                MRAIDView.j(this.f95921b);
            }
        });
    }

    protected void closeFromExpanded() {
        FrameLayout frameLayout;
        int i10 = this.state;
        if (i10 == 2 || i10 == 3) {
            this.state = 1;
        }
        MRAIDOrientationProperties mRAIDOrientationProperties = this.orientationProperties;
        if (mRAIDOrientationProperties != null) {
            mRAIDOrientationProperties.allowOrientationChange = true;
        }
        setOrientationInitialState();
        this.isClosing = true;
        this.isExpanded = false;
        RelativeLayout relativeLayout = this.expandedView;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
        }
        Context context = this.context;
        if (!(context instanceof Activity) || (frameLayout = (FrameLayout) ((Activity) context).findViewById(android.R.id.content)) == null) {
            return;
        }
        frameLayout.removeView(this.expandedView);
        this.expandedView = null;
        this.closeRegion = null;
        this.handler.post(new Runnable() { // from class: net.pubnative.lite.sdk.mraid.s
            @Override // java.lang.Runnable
            public final void run() {
                MRAIDView.i(this.f95941b);
            }
        });
        WebView webView = this.webViewPart2;
        if (webView == null) {
            if (findViewById(R.id.mraid_ad_view) != null) {
                removeView(this.webView);
            }
            addView(this.webView, 0, new FrameLayout.LayoutParams(-1, -2));
        } else {
            webView.destroy();
            this.webView.setWebChromeClient(this.mraidWebChromeClient);
            this.webView.setWebViewClient(this.mraidWebViewClient);
            MRAIDLog.d("hz-m MRAIDView - closeFromExpanded - setting currentwebview to " + this.webView);
            WebView webView2 = this.webView;
            this.currentWebView = webView2;
            webView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        }
        this.handler.post(new Runnable() { // from class: net.pubnative.lite.sdk.mraid.c
            @Override // java.lang.Runnable
            public final void run() {
                MRAIDView.g(this.f95920b);
            }
        });
    }

    protected void closeFromResized() {
        this.state = 1;
        this.isClosing = true;
        removeResizeView();
        addView(this.webView, 0);
        this.handler.post(new Runnable() { // from class: net.pubnative.lite.sdk.mraid.r
            @Override // java.lang.Runnable
            public final void run() {
                MRAIDView.b(this.f95940b);
            }
        });
    }

    public void destroy() {
        if (this.webView != null) {
            MRAIDLog.i("Destroying Main WebView");
            this.webView.destroy();
        }
        if (this.webViewPart2 != null) {
            MRAIDLog.i("Destroying Secondary WebView");
            this.webViewPart2.destroy();
        }
        RelativeLayout relativeLayout = this.expandedView;
        if (relativeLayout != null) {
            ViewGroup viewGroup = (ViewGroup) relativeLayout.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.expandedView);
            }
            this.expandedView = null;
        }
        this.currentWebView = null;
        this.contentInfoAdded = false;
        SimpleTimer simpleTimer = this.mExpirationTimer;
        if (simpleTimer != null) {
            simpleTimer.onFinish();
            this.mExpirationTimer = null;
        }
        SimpleTimer simpleTimer2 = this.mNativeCloseButtonTimer;
        if (simpleTimer2 != null) {
            simpleTimer2.onFinish();
            this.mNativeCloseButtonTimer = null;
        }
    }

    @JavascriptMRAIDCallback
    @Deprecated
    protected void expand(String str) {
        if (this.isExpandEnabled && this.wasTouched) {
            expandCreative(str, false, Boolean.FALSE);
        }
    }

    public void expandContentInfo(String str) {
        decodeURL(str, false);
    }

    protected void expandHelper(WebView webView) {
        applyOrientationProperties();
        forceFullScreen();
        RelativeLayout relativeLayout = new RelativeLayout(this.context);
        this.expandedView = relativeLayout;
        relativeLayout.addView(webView, new RelativeLayout.LayoutParams(-1, -1));
        if (this.isInterstitial) {
            addContentInfo(this.expandedView);
        }
        addCloseRegion(this.expandedView);
        setCloseRegionPosition(this.expandedView);
        MRAIDLog.d("hz-m MRAIDView - expandHelper - adding contentview to activity " + this.context);
        this.showActivity.addContentView(this.expandedView, new RelativeLayout.LayoutParams(-1, -1));
        this.isExpandingFromDefault = true;
        this.isExpanded = true;
    }

    protected void fireExposureChangeEvent() {
        double d10 = this.isViewable ? 100.0d : 0.0d;
        MRAIDLog.d(MRAID_LOG_TAG, "fireExposureChangeEvent");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", getX());
            jSONObject.put("y", getY());
            jSONObject.put("width", (((double) getWidth()) * d10) / 100.0d);
            jSONObject.put("height", (((double) getHeight()) * d10) / 100.0d);
        } catch (JSONException e10) {
            HyBid.reportException((Exception) e10);
            Logger.e(MRAID_LOG_TAG, e10.getMessage());
        }
        injectJavaScript("mraid.fireExposureChangeEvent(" + d10 + StringUtils.COMMA + jSONObject + ",null);");
    }

    protected void fireReadyEvent() {
        MRAIDLog.d(MRAID_LOG_TAG, "fireReadyEvent");
        injectJavaScript("mraid.fireReadyEvent();");
    }

    @SuppressLint({"DefaultLocale"})
    protected void fireStateChangeEvent() {
        MRAIDLog.d(MRAID_LOG_TAG, "fireStateChangeEvent");
        injectJavaScript("mraid.fireStateChangeEvent('" + new String[]{"loading", "default", "expanded", "resized", "hidden"}[this.state] + "');");
    }

    protected void fireViewableChangeEvent() {
        MRAIDLog.d(MRAID_LOG_TAG, "fireViewableChangeEvent");
        injectJavaScript("mraid.fireViewableChangeEvent(" + this.isViewable + ");");
    }

    public int getState() {
        return this.state;
    }

    public void handleNativeCloseButtonDelay() {
        SimpleTimer simpleTimer = new SimpleTimer(this.mNativeCloseButtonDelay.intValue(), new SimpleTimer.Listener() { // from class: net.pubnative.lite.sdk.mraid.MRAIDView.1
            @Override // net.pubnative.lite.sdk.vpaid.helpers.SimpleTimer.Listener
            public void onFinish() {
                MRAIDViewListener mRAIDViewListener = MRAIDView.this.listener;
                if (mRAIDViewListener != null) {
                    mRAIDViewListener.mraidShowCloseButton();
                }
                MRAIDView.this.showDefaultCloseButton();
                MRAIDView.this.isBackClickable = Boolean.TRUE;
            }

            @Override // net.pubnative.lite.sdk.vpaid.helpers.SimpleTimer.Listener
            public void onTick(long j10) {
            }
        }, 1000L);
        this.mNativeCloseButtonTimer = simpleTimer;
        simpleTimer.start();
    }

    @Override // net.pubnative.lite.sdk.mraid.model.LandingPageHandler.LandingPageCallback
    public void hideCountDownTimer() {
        CountDownView countDownView = this.mSkipCountdownView;
        if (countDownView != null) {
            countDownView.setVisibility(8);
        }
    }

    public void injectJavaScript(String str) {
        injectJavaScript(this.currentWebView, str);
    }

    public boolean isExpanded() {
        return this.isExpanded;
    }

    public boolean isLoaded() {
        return this.isPageFinished;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        MRAIDLog.d(MRAID_LOG_TAG, "onAttachedToWindow");
        super.onAttachedToWindow();
    }

    public boolean onBackPressed() {
        MRAIDLog.d("hz-m MRAIDView - onBackPressed");
        int i10 = this.state;
        if (i10 == 0 || i10 == 4) {
            MRAIDLog.d("hz-m MRAIDView - onBackPressed - loading or hidden");
            return false;
        }
        if (!this.isBackClickable.booleanValue()) {
            return true;
        }
        close();
        return true;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        String str = MRAID_LOG_TAG;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onConfigurationChanged ");
        sb2.append(configuration.orientation == 1 ? "portrait" : "landscape");
        MRAIDLog.d(str, sb2.toString());
        WindowManager windowManager = (WindowManager) this.context.getSystemService("window");
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getMetrics(this.displayMetrics);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        MRAIDLog.d(MRAID_LOG_TAG, "onDetachedFromWindow");
        stopAdSession();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    @SuppressLint({"DrawAllocation"})
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        String str = MRAID_LOG_TAG;
        MRAIDLog.w(str, "onLayout (" + this.state + ") " + z10 + " " + i10 + " " + i11 + " " + i12 + " " + i13);
        if (this.isForcingFullScreen) {
            MRAIDLog.d(str, "onLayout ignored");
            return;
        }
        int i14 = this.state;
        if (i14 == 2 || i14 == 3) {
            calculateScreenSize();
            calculateMaxSize();
        }
        if (this.isClosing) {
            this.isClosing = false;
            this.currentPosition = new Rect(this.defaultPosition);
            setCurrentPosition();
        } else {
            calculatePosition(false);
        }
        if (this.state == 3 && z10) {
            this.handler.post(new Runnable() { // from class: net.pubnative.lite.sdk.mraid.h
                @Override // java.lang.Runnable
                public final void run() {
                    this.f95929b.setResizedViewPosition();
                }
            });
        }
        this.isLaidOut = true;
        onLayoutCompleted();
    }

    protected void onLayoutCompleted() {
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.gestureDetector.onTouchEvent(motionEvent)) {
            motionEvent.setAction(3);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        MRAIDLog.d(MRAID_LOG_TAG, "onVisibilityChanged " + getVisibilityString(i10));
        setViewable(i10);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        int visibility = getVisibility();
        MRAIDLog.d(MRAID_LOG_TAG, "onWindowVisibilityChanged " + getVisibilityString(i10) + " (actual " + getVisibilityString(visibility) + ")");
        setViewable(visibility);
    }

    public void pause() {
        SimpleTimer simpleTimer = this.mExpirationTimer;
        if (simpleTimer != null) {
            simpleTimer.pause();
        }
        SimpleTimer simpleTimer2 = this.mNativeCloseButtonTimer;
        if (simpleTimer2 != null) {
            simpleTimer2.pause();
        }
        SimpleTimer simpleTimer3 = this.mAntilockTimer;
        if (simpleTimer3 != null) {
            simpleTimer3.pause();
        }
        HyBidEndCardView hyBidEndCardView = this.mEndCardView;
        if (hyBidEndCardView != null) {
            hyBidEndCardView.pause();
        }
        SimpleTimer simpleTimer4 = this.mClickThroughTimer;
        if (simpleTimer4 != null) {
            simpleTimer4.pause();
        }
        HyBidCTAView hyBidCTAView = this.ctaView;
        if (hyBidCTAView != null) {
            hyBidCTAView.pause();
        }
    }

    public void resume() {
        if (this.mMraidDisplayMode == MraidDisplayMode.END_CARD) {
            showEndCard();
            return;
        }
        SimpleTimer simpleTimer = this.mExpirationTimer;
        if (simpleTimer != null) {
            simpleTimer.resume();
        }
        SimpleTimer simpleTimer2 = this.mNativeCloseButtonTimer;
        if (simpleTimer2 != null) {
            simpleTimer2.resume();
        }
        SimpleTimer simpleTimer3 = this.mAntilockTimer;
        if (simpleTimer3 != null) {
            simpleTimer3.resume();
        }
        HyBidEndCardView hyBidEndCardView = this.mEndCardView;
        if (hyBidEndCardView != null) {
            hyBidEndCardView.resume();
        }
        SimpleTimer simpleTimer4 = this.mClickThroughTimer;
        if (simpleTimer4 != null) {
            simpleTimer4.resume();
        }
        HyBidCTAView hyBidCTAView = this.ctaView;
        if (hyBidCTAView != null) {
            hyBidCTAView.resume();
        }
        this.mMraidDisplayMode = MraidDisplayMode.AD;
    }

    public void setCloseLayoutListener(MRAIDViewCloseLayoutListener mRAIDViewCloseLayoutListener) {
        this.closeLayoutListener = mRAIDViewCloseLayoutListener;
    }

    public void setHtmlAd(HTMLAd hTMLAd) {
        this.htmlAd = hTMLAd;
        if (hTMLAd == null) {
            return;
        }
        LandingPageHandler landingPage = hTMLAd.getLandingPage();
        if (landingPage != null && landingPage.isLandingPageEnabled().booleanValue()) {
            landingPage.setCallback(this);
            return;
        }
        if (hTMLAd.getClickThroughTimerListener() != null) {
            this.clickThroughListener = hTMLAd.getClickThroughTimerListener();
        }
        if (hTMLAd.shouldInitEndCardView()) {
            initEndCardView(hTMLAd.hasReducedCloseSize());
        }
        if (hTMLAd.isCustomCTAEnabled().booleanValue()) {
            initCustomCta();
        }
    }

    @Override // net.pubnative.lite.sdk.mraid.model.LandingPageHandler.LandingPageCallback
    public void setLandingPageSkipTimer() {
        SimpleTimer simpleTimer = this.mNativeCloseButtonTimer;
        if (simpleTimer != null) {
            simpleTimer.cancel();
            this.mNativeCloseButtonTimer = null;
            postDelayed(new Runnable() { // from class: net.pubnative.lite.sdk.mraid.q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f95939b.startSkipTimer();
                }
            }, 500L);
        }
    }

    @Override // net.pubnative.lite.sdk.mraid.model.LandingPageHandler.LandingPageCallback
    public void setLandingPageUseCustomClose(boolean z10) {
        this.useCustomClose = z10;
    }

    @JavascriptMRAIDCallback
    protected void setOrientationProperties(Map<String, String> map) {
        boolean z10 = Boolean.parseBoolean(map.get("allowOrientationChange"));
        String str = map.get("forceOrientation");
        MRAIDLog.d(MRAID_LOG_TAG + "-JS callback", "setOrientationProperties " + z10 + " " + str);
        MRAIDOrientationProperties mRAIDOrientationProperties = this.orientationProperties;
        mRAIDOrientationProperties.allowOrientationChange = z10;
        mRAIDOrientationProperties.forceOrientation = MRAIDOrientationProperties.forceOrientationFromString(str);
        if ((this instanceof MRAIDInterstitial) || this.state == 2) {
            applyOrientationProperties();
        }
    }

    public void setSkipOffset(Integer num) {
        this.mSkipTimeMillis = Integer.valueOf(num.intValue() * 1000);
    }

    public void setUseCustomClose(Boolean bool) {
        if (this.useCustomClose != bool.booleanValue()) {
            this.useCustomClose = bool.booleanValue();
        }
    }

    protected void setViewable(final int i10) {
        post(new Runnable() { // from class: net.pubnative.lite.sdk.mraid.o
            @Override // java.lang.Runnable
            public final void run() {
                MRAIDView.h(this.f95936b, i10);
            }
        });
    }

    protected void showAsInterstitial(Activity activity, Boolean bool, OnExpandCreativeFailListener onExpandCreativeFailListener) {
        MRAIDLog.d("hz-m MRAIDVIEW - showAsInterstitial");
        this.showActivity = activity;
        expand(null, bool, onExpandCreativeFailListener);
    }

    @Override // net.pubnative.lite.sdk.mraid.model.LandingPageHandler.LandingPageCallback
    public void showCountDownTimer() {
        HTMLAd hTMLAd;
        if (this.mSkipCountdownView == null || (hTMLAd = this.htmlAd) == null || hTMLAd.getLandingPage() == null || this.htmlAd.getLandingPage().isTimerFinished()) {
            return;
        }
        this.mSkipCountdownView.setVisibility(0);
    }

    public void skipButtonClicked() {
        this.wasTouched = true;
        MRAIDViewListener mRAIDViewListener = this.listener;
        if (mRAIDViewListener != null) {
            mRAIDViewListener.mraidHideSkipButton();
        }
        cancelClickThroughTimer();
        showEndCard();
    }

    public void stopAdSession() {
        HyBidViewabilityWebAdSession hyBidViewabilityWebAdSession = this.mViewabilityAdSession;
        if (hyBidViewabilityWebAdSession != null) {
            hyBidViewabilityWebAdSession.stopAdSession();
            this.mViewabilityAdSession = null;
        }
    }

    @JavascriptMRAIDCallback
    protected void unload() {
        MRAIDLog.d(MRAID_LOG_TAG + "-JS callback", "unload");
        MRAIDLog.d("hz-m unload wv: " + this.webView);
        MRAIDViewListener mRAIDViewListener = this.listener;
        if (mRAIDViewListener != null) {
            mRAIDViewListener.mraidViewError(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void expandCreative(String str, boolean z10, Boolean bool, OnExpandCreativeFailListener onExpandCreativeFailListener) {
        MRAIDLog.d("hz-m MRAIDView - expand " + str);
        StringBuilder sb2 = new StringBuilder();
        String str2 = MRAID_LOG_TAG;
        sb2.append(str2);
        sb2.append("-JS callback");
        String string = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("expand ");
        sb3.append(str != null ? str : "(1-part)");
        MRAIDLog.d(string, sb3.toString());
        MRAIDOrientationProperties mRAIDOrientationProperties = this.orientationProperties;
        if (mRAIDOrientationProperties != null) {
            mRAIDOrientationProperties.allowOrientationChange = false;
            applyOrientationProperties();
        }
        if (!this.isExpandEnabled && !bool.booleanValue()) {
            MRAIDLog.d(str2 + "-JS callback", "expand disabled by the developer");
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            decodeURL(str, z10);
            return;
        }
        int i10 = this.state;
        if (i10 == 0 || i10 == 1) {
            if (this.webView.getParent() != null) {
                ((ViewGroup) this.webView.getParent()).removeView(this.webView);
            } else {
                removeView(this.webView);
            }
        } else if (i10 == 3) {
            removeResizeView();
        }
        expandHelper(this.webView);
        MRAIDLog.d("hz-m MRAIDView - expand - empty url");
        if (onExpandCreativeFailListener != null) {
            onExpandCreativeFailListener.onExpandFailed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void injectJavaScript(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return;
        }
        MRAIDLog.d(MRAID_LOG_TAG, "evaluating js: " + str);
        webView.evaluateJavascript(str, new ValueCallback() { // from class: net.pubnative.lite.sdk.mraid.j
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                MRAIDLog.d("Evaluated JS: " + ((String) obj));
            }
        });
    }

    protected void expand(String str, Boolean bool, OnExpandCreativeFailListener onExpandCreativeFailListener) {
        expandCreative(str, false, bool, onExpandCreativeFailListener);
    }

    protected void showAsInterstitial(Activity activity, Boolean bool, OnExpandCreativeFailListener onExpandCreativeFailListener, String str) {
        MRAIDLog.d("hz-m MRAIDVIEW - showAsInterstitial");
        this.showActivity = activity;
        expand(str, bool, onExpandCreativeFailListener);
    }
}
