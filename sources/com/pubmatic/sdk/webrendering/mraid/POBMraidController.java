package com.pubmatic.sdk.webrendering.mraid;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.Keep;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C4240b4;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.POBInstanceProvider;
import com.pubmatic.sdk.common.R$drawable;
import com.pubmatic.sdk.common.cache.POBAdViewCacheService;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.models.POBLocation;
import com.pubmatic.sdk.common.network.POBImageRequest;
import com.pubmatic.sdk.common.network.POBNetworkHandler;
import com.pubmatic.sdk.common.taskhandler.POBTaskHandler;
import com.pubmatic.sdk.common.ui.POBFullScreenActivityListener;
import com.pubmatic.sdk.common.utility.POBLocationDetector;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.common.view.POBWebView;
import com.pubmatic.sdk.common.viewability.POBObstructionUpdateListener;
import com.pubmatic.sdk.webrendering.mraid.POBAudioVolumeObserver;
import com.pubmatic.sdk.webrendering.mraid.POBVideoPlayerActivity;
import com.pubmatic.sdk.webrendering.mraid.q;
import com.pubmatic.sdk.webrendering.ui.POBAdViewContainer;
import com.pubmatic.sdk.webrendering.ui.POBAdVisibilityListener;
import com.pubmatic.sdk.webrendering.ui.POBFullScreenActivity;
import com.pubmatic.sdk.webrendering.ui.POBHTMLViewClient;
import com.pubmatic.sdk.webrendering.ui.POBMraidViewContainer;
import com.pubmatic.sdk.webrendering.ui.POBMraidViewContainerListener;
import com.taurusx.tax.o.i0;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import net.pubnative.lite.sdk.mraid.MRAIDNativeFeature;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Keep
@MainThread
public class POBMraidController implements n, POBAdVisibilityListener {
    private static final int APP_INSTALL_STATUS_INSTALLED = 1;
    private static final int APP_INSTALL_STATUS_NOT_INSTALLED = 0;
    private static final int APP_INSTALL_STATUS_UNKNOWN = -1;
    private static final String TAG = "POBMraidController";

    @NonNull
    private final Context appContext;

    @Nullable
    private POBAudioVolumeObserver.a audioVolumeChangeListener;

    @NonNull
    private POBMraidBridge currentBridge;

    @Nullable
    private POBNetworkHandler.POBImageNetworkListener<String> imageNetworkListener;
    private int initialHeight;
    private int initialWidth;
    private boolean isAdVisible;
    private boolean isExposureChangeEnabled;
    private boolean isViewableChangeTracking;

    @Nullable
    private POBLocationDetector locationDetector;

    @NonNull
    private final POBMraidBridge mraidBridge;

    @Nullable
    private o mraidControllerListener;
    private boolean mraidInitState;

    @Nullable
    private Map<String, String> orientationProperties;

    @NonNull
    private final String placementType;

    @Nullable
    private POBNetworkHandler pobNetworkHandler;
    private final int rendererId;

    @Nullable
    private q resizeView;

    @Nullable
    private ViewTreeObserver.OnScrollChangedListener scrollChangeListener;

    @Nullable
    private POBWebView twoPartWebView;

    @Nullable
    private l twoPartWebViewTouchListener;
    private float visiblePercentage;

    @Nullable
    private ViewGroup webViewParent;

    class a implements POBNetworkHandler.POBImageNetworkListener {

        /* JADX INFO: renamed from: com.pubmatic.sdk.webrendering.mraid.POBMraidController$a$a, reason: collision with other inner class name */
        class RunnableC0789a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Bitmap f63314a;

            RunnableC0789a(Bitmap bitmap) {
                this.f63314a = bitmap;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (POBMRAIDUtil.a(POBMraidController.this.appContext, this.f63314a, Calendar.getInstance().getTimeInMillis() + ".jpeg")) {
                    POBLog.info(POBMraidController.TAG, "image successfully saved to device!", new Object[0]);
                } else {
                    POBLog.error(POBMraidController.TAG, "Error saving picture to device through MRAID ad.", new Object[0]);
                }
            }
        }

        a() {
        }

        @Override // com.pubmatic.sdk.common.network.POBNetworkHandler.POBImageNetworkListener
        public void onFailure(POBError pOBError) {
            POBLog.error(POBMraidController.TAG, "Network error connecting to url.", new Object[0]);
            POBMraidController.this.destroyImageResource();
        }

        @Override // com.pubmatic.sdk.common.network.POBNetworkHandler.POBImageNetworkListener
        public void onSuccess(Bitmap bitmap) {
            POBTaskHandler.getInstance().runOnBackgroundThread(new RunnableC0789a(bitmap));
            POBMraidController.this.destroyImageResource();
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f63316a;

        static {
            int[] iArr = new int[com.pubmatic.sdk.webrendering.mraid.b.values().length];
            f63316a = iArr;
            try {
                iArr[com.pubmatic.sdk.webrendering.mraid.b.EXPANDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f63316a[com.pubmatic.sdk.webrendering.mraid.b.RESIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    class c implements POBVideoPlayerActivity.POBVideoPlayerActivityListener {
        c() {
        }

        @Override // com.pubmatic.sdk.webrendering.mraid.POBVideoPlayerActivity.POBVideoPlayerActivityListener
        public void onDismiss() {
            POBMraidController.this.notifyAdCloseState();
        }

        @Override // com.pubmatic.sdk.webrendering.mraid.POBVideoPlayerActivity.POBVideoPlayerActivityListener
        public void onStart() {
            POBMraidController.this.notifyAdOpenState();
        }
    }

    class d implements POBAudioVolumeObserver.a {
        d() {
        }

        @Override // com.pubmatic.sdk.webrendering.mraid.POBAudioVolumeObserver.a
        public void a(Double d10) {
            if (POBMraidController.this.adHasAudioFocus()) {
                POBMraidController.this.notifyAudioChangeToAd(d10);
            } else {
                POBMraidController.this.notifyAudioChangeToAd(null);
            }
        }
    }

    class e implements ViewTreeObserver.OnScrollChangedListener {
        e() {
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            POBMraidController.this.updateExposureProperty(true);
        }
    }

    class f implements q.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ImageView f63320a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ImageView f63321b;

        f(ImageView imageView, ImageView imageView2) {
            this.f63320a = imageView;
            this.f63321b = imageView2;
        }

        @Override // com.pubmatic.sdk.webrendering.mraid.q.d
        public void a(POBAdViewContainer pOBAdViewContainer) {
            RelativeLayout relativeLayoutD = POBMraidController.this.resizeView.d();
            if (this.f63320a != null) {
                if (POBMraidController.this.mraidControllerListener != null) {
                    POBMraidController.this.mraidControllerListener.removeFriendlyObstructions(this.f63320a);
                }
                relativeLayoutD.removeView(this.f63320a);
                POBMraidController.this.mraidBridge.adViewContainer.addView(this.f63320a);
                this.f63320a.bringToFront();
                if (POBMraidController.this.mraidControllerListener != null) {
                    POBMraidController.this.mraidControllerListener.addFriendlyObstructions(this.f63320a, POBObstructionUpdateListener.POBFriendlyObstructionPurpose.NOT_VISIBLE);
                }
            }
            if (POBMraidController.this.mraidControllerListener != null && this.f63321b != null) {
                POBMraidController.this.mraidControllerListener.removeFriendlyObstructions(this.f63321b);
            }
            POBMraidController.this.handleResizeViewCloseEvent();
        }
    }

    class g implements POBMraidViewContainerListener {
        g() {
        }

        @Override // com.pubmatic.sdk.webrendering.ui.POBMraidViewContainerListener
        public void onClose() {
            POBFullScreenActivity.closeActivity(POBMraidController.this.appContext, POBMraidController.this.rendererId);
        }

        @Override // com.pubmatic.sdk.webrendering.ui.POBMraidViewContainerListener
        public void onForward() {
        }
    }

    class h implements POBFullScreenActivityListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ POBAdViewContainer f63324a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ImageView f63325b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ POBMraidViewContainer f63326c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ViewGroup f63327d;

        h(POBAdViewContainer pOBAdViewContainer, ImageView imageView, POBMraidViewContainer pOBMraidViewContainer, ViewGroup viewGroup) {
            this.f63324a = pOBAdViewContainer;
            this.f63325b = imageView;
            this.f63326c = pOBMraidViewContainer;
            this.f63327d = viewGroup;
        }

        @Override // com.pubmatic.sdk.common.ui.POBFullScreenActivityListener
        public void onCreate(Activity activity) {
            this.f63324a.getAdView().setBaseContext(activity);
        }

        @Override // com.pubmatic.sdk.common.ui.POBFullScreenActivityListener
        public void onDestroy() {
            POBLog.debug(POBMraidController.TAG, "expand close", new Object[0]);
            POBWebView adView = this.f63324a.getAdView();
            adView.setBaseContext(POBMraidController.this.appContext);
            if (POBMraidController.this.mraidControllerListener != null && this.f63325b != null) {
                POBMraidController.this.mraidControllerListener.removeFriendlyObstructions(this.f63325b);
            }
            POBMraidViewContainer pOBMraidViewContainer = this.f63326c;
            if (pOBMraidViewContainer != null) {
                ImageView skipBtn = pOBMraidViewContainer.getSkipBtn();
                if (POBMraidController.this.mraidControllerListener != null && skipBtn != null) {
                    POBMraidController.this.mraidControllerListener.removeFriendlyObstructions(skipBtn);
                }
                this.f63326c.removeView(this.f63325b);
            }
            if (POBMraidController.this.mraidControllerListener != null) {
                POBMraidController.this.mraidControllerListener.onAdViewChanged(adView);
            }
            ImageView imageView = this.f63325b;
            if (imageView != null) {
                this.f63324a.addView(imageView);
                this.f63325b.bringToFront();
                if (POBMraidController.this.mraidControllerListener != null) {
                    POBMraidController.this.mraidControllerListener.addFriendlyObstructions(this.f63325b, POBObstructionUpdateListener.POBFriendlyObstructionPurpose.NOT_VISIBLE);
                }
            }
            if (this.f63327d != null) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(POBMraidController.this.initialWidth, POBMraidController.this.initialHeight);
                ViewGroup viewGroup = (ViewGroup) this.f63324a.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(this.f63324a);
                }
                this.f63327d.addView(this.f63324a, layoutParams);
                this.f63324a.requestFocus();
            }
            POBMraidController.this.manageClose();
        }
    }

    class i implements POBHTMLViewClient.OnRenderProcessGoneListener {
        i() {
        }

        @Override // com.pubmatic.sdk.webrendering.ui.POBHTMLViewClient.OnRenderProcessGoneListener
        public void onRenderProcessGone() {
            if (POBMraidController.this.twoPartWebView != null) {
                POBMraidController.this.twoPartWebView.destroy();
                POBMraidController.this.twoPartWebView = null;
            }
        }
    }

    class j extends POBMraidWebClient {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ POBMraidBridge f63330e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ POBAdViewContainer f63331f;

        class a implements View.OnLayoutChangeListener {
            a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                j jVar = j.this;
                POBMraidController pOBMraidController = POBMraidController.this;
                pOBMraidController.initProperties(jVar.f63330e, pOBMraidController.mraidInitState);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(POBHTMLViewClient.OnRenderProcessGoneListener onRenderProcessGoneListener, POBMraidBridge pOBMraidBridge, POBAdViewContainer pOBAdViewContainer) {
            super(onRenderProcessGoneListener);
            this.f63330e = pOBMraidBridge;
            this.f63331f = pOBAdViewContainer;
        }

        @Override // com.pubmatic.sdk.webrendering.ui.POBHTMLViewClient, android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            POBMraidController pOBMraidController = POBMraidController.this;
            pOBMraidController.initProperties(this.f63330e, pOBMraidController.mraidInitState);
            POBMraidController.this.mraidInitState = false;
            POBAdViewContainer pOBAdViewContainer = this.f63331f;
            if (pOBAdViewContainer != null) {
                pOBAdViewContainer.addOnLayoutChangeListener(new a());
                POBMraidController.this.mraidBridge.setMraidState(com.pubmatic.sdk.webrendering.mraid.b.EXPANDED);
                POBMraidController.this.currentBridge = this.f63330e;
            }
        }
    }

    private static class k extends WebChromeClient {
        private k() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            POBLog.debug(POBMraidController.TAG, String.format(Locale.getDefault(), "%s @ %d: %s", consoleMessage.message(), Integer.valueOf(consoleMessage.lineNumber()), consoleMessage.sourceId()), new Object[0]);
            return super.onConsoleMessage(consoleMessage);
        }

        /* synthetic */ k(a aVar) {
            this();
        }
    }

    static class l implements View.OnTouchListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f63334a;

        l() {
        }

        boolean a() {
            boolean z10 = this.f63334a;
            this.f63334a = false;
            return z10;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0 || action == 1) {
                POBLog.debug(POBMraidController.TAG, "WebView onTouch : Focus=" + view.hasFocus(), new Object[0]);
                if (view.hasFocus()) {
                    this.f63334a = true;
                }
            }
            return false;
        }
    }

    POBMraidController(@NonNull Context context, @NonNull POBMraidBridge pOBMraidBridge, @NonNull String str, int i10) {
        this.currentBridge = pOBMraidBridge;
        this.mraidBridge = pOBMraidBridge;
        this.rendererId = i10;
        this.placementType = str;
        pOBMraidBridge.setMraidBridgeListener(this);
        this.isAdVisible = this.currentBridge.webView.getVisibility() == 0;
        Context applicationContext = context.getApplicationContext();
        this.appContext = applicationContext;
        this.locationDetector = POBInstanceProvider.getLocationDetector(applicationContext);
        this.orientationProperties = new HashMap();
        this.isExposureChangeEnabled = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean adHasAudioFocus() {
        return this.isAdVisible;
    }

    private void addAudioVolumeListener() {
        if (this.audioVolumeChangeListener == null) {
            this.audioVolumeChangeListener = new d();
        }
        POBAudioVolumeObserver.a().registerListener(this.appContext, this.audioVolumeChangeListener);
        updateRecentAudioVolumeToAd();
    }

    private void addExposureChangeListener() {
        if (this.scrollChangeListener == null) {
            this.scrollChangeListener = new e();
        }
        this.currentBridge.webView.getViewTreeObserver().addOnScrollChangedListener(this.scrollChangeListener);
        updateExposureProperty(true);
    }

    private void addToParent() {
        if (this.webViewParent != null) {
            this.webViewParent.addView(this.mraidBridge.adViewContainer, new FrameLayout.LayoutParams(this.initialWidth, this.initialHeight));
            this.webViewParent = null;
            this.mraidBridge.adViewContainer.requestFocus();
            this.initialWidth = 0;
            this.initialHeight = 0;
            o oVar = this.mraidControllerListener;
            if (oVar != null) {
                oVar.onAdViewChanged(this.mraidBridge.adViewContainer.getAdView());
            }
        }
    }

    private void allowOrientationChange(@NonNull Activity activity, boolean z10) {
        if (z10) {
            activity.setRequestedOrientation(-1);
        }
    }

    private void closeVideoPlayerActivity() {
        try {
            Intent intent = new Intent();
            intent.setAction(POBVideoPlayerActivity.ACTION_FINISH);
            this.appContext.sendBroadcast(intent);
        } catch (Exception e10) {
            POBLog.warn(TAG, "Error in closing video player activity. Error: %s", e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroyImageResource() {
        POBNetworkHandler pOBNetworkHandler = this.pobNetworkHandler;
        if (pOBNetworkHandler != null) {
            pOBNetworkHandler.cancelRequest(TAG);
            this.pobNetworkHandler = null;
        }
        this.imageNetworkListener = null;
    }

    private int determineAppInstallStatus(@NonNull String str) {
        if (s.a(str)) {
            return -1;
        }
        if (!POBUtils.requiresQueryAllPackagesPermission() || POBUtils.hasQueryAllPackagesPermission(this.appContext)) {
            return isAppInstalled(this.appContext, str) ? 1 : 0;
        }
        return -1;
    }

    private void dismissResize() {
        q qVar = this.resizeView;
        if (qVar != null) {
            qVar.b();
        }
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    private void forceOrientation(@NonNull Activity activity, @Nullable String str) {
        String str2 = str != null ? str : "none";
        if (str2.equals("portrait")) {
            activity.setRequestedOrientation(1);
            return;
        }
        if (str2.equals("landscape")) {
            activity.setRequestedOrientation(0);
            return;
        }
        POBLog.debug(TAG, "default forceOrientation :" + str, new Object[0]);
    }

    @Nullable
    private Double getAudioVolumePercentage(@NonNull Context context) {
        return POBAudioVolumeObserver.getAudioVolumePercentage(context);
    }

    private POBNetworkHandler.POBImageNetworkListener<String> getImageNetworkListener() {
        return new a();
    }

    private String getInterstitialOrientation(@NonNull Context context) {
        return POBUtils.getDeviceOrientation(context) == 2 ? "sensor_landscape" : "portrait";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleResizeViewCloseEvent() {
        addToParent();
        manageClose();
        this.resizeView = null;
    }

    @SuppressLint({"SetJavaScriptEnabled", "ClickableViewAccessibility"})
    private void handleTwoPartExpand(@Nullable String str, boolean z10) {
        this.mraidInitState = true;
        POBWebView pOBWebViewCreateInstance = POBWebView.createInstance(this.appContext);
        this.twoPartWebView = pOBWebViewCreateInstance;
        if (pOBWebViewCreateInstance == null || POBUtils.isNullOrEmpty(str)) {
            POBLog.error(TAG, "Unable to render two-part expand, as webview or URL is not available", new Object[0]);
            this.mraidBridge.notifyError("Unable to render two-part expand.", "expand");
            return;
        }
        POBAdViewContainer pOBAdViewContainer = new POBAdViewContainer(this.appContext, this.twoPartWebView);
        this.twoPartWebView.getSettings().setJavaScriptEnabled(true);
        l lVar = new l();
        this.twoPartWebViewTouchListener = lVar;
        this.twoPartWebView.setOnTouchListener(lVar);
        addInlineVideoSupportToWebView(this.twoPartWebView);
        POBMraidBridge pOBMraidBridge = new POBMraidBridge(pOBAdViewContainer);
        addCommandHandlers(pOBMraidBridge, true, false);
        pOBMraidBridge.setMraidBridgeListener(this);
        j jVar = new j(new i(), pOBMraidBridge, pOBAdViewContainer);
        jVar.disableMultipleOnPageFinished(true);
        this.twoPartWebView.setWebViewClient(jVar);
        manageExpand(pOBAdViewContainer, pOBMraidBridge, z10);
        this.twoPartWebView.loadUrl(str);
    }

    private boolean isAppInstalled(@NonNull Context context, @NonNull String str) {
        try {
            context.getPackageManager().getPackageInfo(str, 0);
            POBLog.debug(TAG, "App is installed: " + str, new Object[0]);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            POBLog.debug(TAG, "App not found: " + str, new Object[0]);
            return false;
        }
    }

    private boolean isTwoPartExpandShowing() {
        return this.currentBridge != this.mraidBridge;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void manageClose() {
        Map<String, String> map = this.orientationProperties;
        if (map != null) {
            map.clear();
        }
        this.mraidBridge.setMraidState(com.pubmatic.sdk.webrendering.mraid.b.DEFAULT);
        if (isTwoPartExpandShowing()) {
            initProperties(this.mraidBridge, false);
            this.mraidBridge.setMraidBridgeListener(this);
            addCommandHandlers(this.mraidBridge, false, false);
        }
        this.currentBridge = this.mraidBridge;
        notifyAdCloseState();
    }

    private void manageExpand(@NonNull POBAdViewContainer pOBAdViewContainer, @NonNull POBMraidBridge pOBMraidBridge, boolean z10) {
        if (this.initialWidth == 0) {
            this.initialWidth = pOBAdViewContainer.getWidth();
        }
        if (this.initialHeight == 0) {
            this.initialHeight = pOBAdViewContainer.getHeight();
        }
        ViewGroup viewGroup = (ViewGroup) pOBAdViewContainer.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(pOBAdViewContainer);
        }
        ImageView watermarkView = pOBAdViewContainer.getWatermarkView();
        POBMraidViewContainer pOBMraidViewContainer = new POBMraidViewContainer(this.appContext, pOBAdViewContainer, false);
        if (watermarkView != null) {
            pOBAdViewContainer.removeView(watermarkView);
            pOBMraidViewContainer.setWatermarkView(watermarkView);
        }
        if (z10) {
            pOBMraidViewContainer.setCustomCloseEnabled(true);
            pOBMraidViewContainer.handleSkipTimer(20000L);
        }
        pOBMraidViewContainer.setMraidViewContainerListener(new g());
        POBInstanceProvider.getAdViewCacheService().storeAdView(Integer.valueOf(this.rendererId), new POBAdViewCacheService.AdViewConfig(pOBMraidViewContainer, new h(pOBAdViewContainer, watermarkView, pOBMraidViewContainer, viewGroup)));
        Intent intent = new Intent();
        intent.putExtra(POBFullScreenActivity.RENDERER_IDENTIFIER, this.rendererId);
        Map<String, String> map = this.orientationProperties;
        if (map != null && !map.isEmpty()) {
            String str = this.orientationProperties.get("forceOrientation");
            if (str != null) {
                intent.putExtra(POBFullScreenActivity.REQUESTED_ORIENTATION, str.equals("landscape") ? 2 : 1);
            }
            String str2 = this.orientationProperties.get("allowOrientationChange");
            if (str2 != null) {
                intent.putExtra(POBFullScreenActivity.ALLOW_ORIENTATION_CHANGE, Boolean.parseBoolean(str2));
            }
        }
        try {
            POBFullScreenActivity.startActivity(this.appContext, intent);
            q qVar = this.resizeView;
            if (qVar != null) {
                qVar.a(false);
                this.resizeView.a();
            }
            if (this.mraidBridge.getMraidState() == com.pubmatic.sdk.webrendering.mraid.b.DEFAULT) {
                notifyAdOpenState();
            }
            pOBMraidBridge.setMraidState(com.pubmatic.sdk.webrendering.mraid.b.EXPANDED);
            o oVar = this.mraidControllerListener;
            if (oVar != null) {
                oVar.onAdViewChanged(pOBAdViewContainer.getAdView());
                this.mraidControllerListener.addFriendlyObstructions(pOBMraidViewContainer.getSkipBtn(), POBObstructionUpdateListener.POBFriendlyObstructionPurpose.CLOSE_AD);
            }
        } catch (Exception e10) {
            POBLog.error(TAG, "Error expanding the banner ad. Error: %s", e10.getMessage());
        }
    }

    private void manageResize(Context context, int i10, int i11, int i12, int i13, boolean z10) {
        q qVar;
        com.pubmatic.sdk.webrendering.mraid.b mraidState = this.mraidBridge.getMraidState();
        com.pubmatic.sdk.webrendering.mraid.b bVar = com.pubmatic.sdk.webrendering.mraid.b.DEFAULT;
        if (mraidState == bVar || this.mraidBridge.getMraidState() == com.pubmatic.sdk.webrendering.mraid.b.RESIZED) {
            int[] viewXYPosition = POBUtils.getViewXYPosition(this.mraidBridge.adViewContainer);
            int i14 = viewXYPosition[0];
            int i15 = viewXYPosition[1];
            if (this.mraidBridge.getMraidState().equals(bVar)) {
                this.initialWidth = this.mraidBridge.adViewContainer.getWidth();
                this.initialHeight = this.mraidBridge.adViewContainer.getHeight();
            }
            POBViewRect pOBViewRect = new POBViewRect(i14, i15, i11, i10, false, null);
            Resources resources = context.getResources();
            int i16 = R$drawable.pob_close_button;
            POBViewRect resizeValues = POBMRAIDUtil.getResizeValues(i12, i13, i10, i11, z10, pOBViewRect, POBUtils.convertPixelToDp(resources.getDrawable(i16).getIntrinsicWidth()), POBUtils.convertPixelToDp(context.getResources().getDrawable(i16).getIntrinsicHeight()));
            if (!resizeValues.isStatus()) {
                this.mraidBridge.notifyError(resizeValues.f63381b, "resize");
                return;
            }
            int i17 = resizeValues.getxPosition();
            int i18 = resizeValues.getyPosition();
            int width = resizeValues.getWidth();
            int height = resizeValues.getHeight();
            q qVar2 = this.resizeView;
            if (qVar2 == null) {
                ViewGroup viewGroup = (ViewGroup) this.mraidBridge.adViewContainer.getParent();
                this.webViewParent = viewGroup;
                if (viewGroup != null) {
                    ImageView watermarkView = this.mraidBridge.adViewContainer.getWatermarkView();
                    if (watermarkView != null) {
                        this.mraidBridge.adViewContainer.removeView(watermarkView);
                    }
                    this.webViewParent.removeView(this.mraidBridge.adViewContainer);
                    q qVar3 = new q(this.appContext);
                    this.resizeView = qVar3;
                    ImageView imageViewC = qVar3.c();
                    this.resizeView.a((ViewGroup) this.webViewParent.getRootView(), this.mraidBridge.adViewContainer, width, height, i17, i18, new f(watermarkView, imageViewC));
                    if (watermarkView != null) {
                        this.resizeView.d().addView(watermarkView);
                    }
                    o oVar = this.mraidControllerListener;
                    if (oVar != null) {
                        oVar.onAdViewChanged(this.mraidBridge.adViewContainer.getAdView());
                        if (watermarkView != null) {
                            this.mraidControllerListener.addFriendlyObstructions(watermarkView, POBObstructionUpdateListener.POBFriendlyObstructionPurpose.NOT_VISIBLE);
                        }
                        if (imageViewC != null) {
                            this.mraidControllerListener.addFriendlyObstructions(imageViewC, POBObstructionUpdateListener.POBFriendlyObstructionPurpose.CLOSE_AD);
                        }
                    }
                    this.resizeView.e();
                } else {
                    POBLog.error(TAG, "Unable to resize as web view parent view is null", new Object[0]);
                }
            } else {
                qVar2.a(width, height, i17, i18);
            }
            if (this.mraidBridge.getMraidState() == bVar) {
                notifyAdOpenState();
            }
            this.mraidBridge.setMraidState(com.pubmatic.sdk.webrendering.mraid.b.RESIZED);
            initProperties(this.mraidBridge, false);
            this.currentBridge = this.mraidBridge;
        } else {
            POBLog.debug(TAG, "Ad is already open in " + this.mraidBridge.getMraidState().b() + " state!", new Object[0]);
            this.mraidBridge.notifyError("Ad is already open in " + this.mraidBridge.getMraidState().b() + " state!", "resize");
        }
        if (this.mraidControllerListener == null || (qVar = this.resizeView) == null || qVar.c() == null) {
            return;
        }
        this.mraidControllerListener.addFriendlyObstructions(this.resizeView.c(), POBObstructionUpdateListener.POBFriendlyObstructionPurpose.CLOSE_AD);
    }

    private void notifyAdClick() {
        o oVar = this.mraidControllerListener;
        if (oVar != null) {
            oVar.onMRAIDAdClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyAdCloseState() {
        o oVar = this.mraidControllerListener;
        if (oVar != null) {
            oVar.onAdInteractionStopped();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyAdOpenState() {
        o oVar = this.mraidControllerListener;
        if (oVar != null) {
            oVar.onAdInteractionStarted();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyAudioChangeToAd(@Nullable Double d10) {
        this.currentBridge.setAudioVolumePercentage(d10);
    }

    private void removeAudioVolumeListener() {
        if (this.audioVolumeChangeListener != null) {
            POBAudioVolumeObserver.a().unregisterListener(this.appContext, this.audioVolumeChangeListener);
        }
        this.audioVolumeChangeListener = null;
    }

    private void removeExposureChangeListener() {
        if (this.scrollChangeListener != null) {
            this.currentBridge.webView.getViewTreeObserver().removeOnScrollChangedListener(this.scrollChangeListener);
            this.scrollChangeListener = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateExposureProperty(boolean z10) {
        float fHeight;
        JSONObject rectJson;
        if (z10) {
            Rect rect = new Rect();
            this.currentBridge.webView.getGlobalVisibleRect(rect);
            fHeight = ((rect.height() * rect.width()) / (this.currentBridge.webView.getHeight() * this.currentBridge.webView.getWidth())) * 100.0f;
            rectJson = POBMRAIDUtil.getRectJson(POBUtils.convertPixelToDp(rect.left), POBUtils.convertPixelToDp(rect.top), POBUtils.convertPixelToDp(rect.width()), POBUtils.convertPixelToDp(rect.height()));
        } else {
            rectJson = POBMRAIDUtil.getRectJson(0, 0, 0, 0);
            fHeight = 0.0f;
        }
        if (Math.abs(this.visiblePercentage - fHeight) > 1.0f) {
            this.visiblePercentage = fHeight;
            POBLog.debug(TAG, "visible percentage :" + fHeight, new Object[0]);
            this.currentBridge.updateExposureChangeData(Float.valueOf(this.visiblePercentage), rectJson);
        }
    }

    private void updateRecentAudioVolumeToAd() {
        if (adHasAudioFocus()) {
            notifyAudioChangeToAd(getAudioVolumePercentage(this.appContext));
        } else {
            notifyAudioChangeToAd(null);
        }
    }

    void addCommandHandlers(@NonNull POBMraidBridge pOBMraidBridge, boolean z10, boolean z11) {
        pOBMraidBridge.addCommandHandler(new com.pubmatic.sdk.webrendering.mraid.j());
        if (!z11) {
            pOBMraidBridge.addCommandHandler(new com.pubmatic.sdk.webrendering.mraid.l());
            pOBMraidBridge.addCommandHandler(new r());
        }
        pOBMraidBridge.addCommandHandler(new com.pubmatic.sdk.webrendering.mraid.f());
        pOBMraidBridge.addCommandHandler(new m());
        pOBMraidBridge.addCommandHandler(new com.pubmatic.sdk.webrendering.mraid.e());
        pOBMraidBridge.addCommandHandler(new p());
        pOBMraidBridge.addCommandHandler(new com.pubmatic.sdk.webrendering.mraid.d());
        if (!z10) {
            pOBMraidBridge.addCommandHandler(new com.pubmatic.sdk.webrendering.mraid.i());
            pOBMraidBridge.addCommandHandler(new com.pubmatic.sdk.webrendering.mraid.k());
        }
        pOBMraidBridge.addCommandHandler(new com.pubmatic.sdk.webrendering.mraid.h());
        pOBMraidBridge.addCommandHandler(new com.pubmatic.sdk.webrendering.mraid.c());
    }

    void addInlineVideoSupportToWebView(@NonNull WebView webView) {
        webView.setWebChromeClient(new k(null));
        try {
            webView.getSettings().setMediaPlaybackRequiresUserGesture(false);
        } catch (NoSuchMethodError e10) {
            POBLog.error(TAG, "Not able to add inline video support to WebView, %s", e10.getLocalizedMessage());
        }
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.n
    public void checkAppInstallStatus(@NonNull String str) {
        this.currentBridge.notifyAppInstallStatus(str, determineAppInstallStatus(str));
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.n
    public void close() {
        POBLog.debug(TAG, "Received MRAID close event", new Object[0]);
        if (!this.placementType.equals("inline")) {
            if (this.placementType.equals("interstitial")) {
                notifyAdCloseState();
                return;
            }
            return;
        }
        int i10 = b.f63316a[this.currentBridge.getMraidState().ordinal()];
        if (i10 == 1) {
            POBFullScreenActivity.closeActivity(this.appContext, this.rendererId);
        } else {
            if (i10 != 2) {
                return;
            }
            dismissResize();
        }
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.n
    public void createCalendarEvent(@NonNull JSONObject jSONObject, boolean z10) {
        if (z10) {
            notifyAdClick();
        }
        try {
            Map mapA = POBMRAIDUtil.a(new JSONObject(jSONObject.optString("event")));
            POBLog.debug(TAG, "calendarParams :%s", mapA.toString());
            Intent type = new Intent("android.intent.action.INSERT").setType(i0.f66467z);
            for (Map.Entry entry : mapA.entrySet()) {
                Object value = entry.getValue();
                String str = (String) entry.getKey();
                if (value instanceof Long) {
                    type.putExtra(str, ((Long) value).longValue());
                } else if (value instanceof Integer) {
                    type.putExtra(str, ((Integer) value).intValue());
                } else {
                    type.putExtra(str, (String) value);
                }
            }
            type.setFlags(268435456);
            POBUtils.startActivity(this.appContext, type);
            o oVar = this.mraidControllerListener;
            if (oVar != null) {
                oVar.onLeavingApplication();
            }
        } catch (ActivityNotFoundException e10) {
            this.currentBridge.notifyError("Device does not have calendar app." + e10.getLocalizedMessage(), "createCalendarEvent");
            POBLog.error(TAG, "Device does not have calendar app.%s", e10.getLocalizedMessage());
        } catch (IllegalArgumentException e11) {
            this.currentBridge.notifyError("Error parsing calendar event data." + e11.getLocalizedMessage(), "createCalendarEvent");
            POBLog.error(TAG, "Error parsing calendar event data.%s", e11.getLocalizedMessage());
        } catch (Exception e12) {
            this.currentBridge.notifyError("Something went wrong." + e12.getLocalizedMessage(), "createCalendarEvent");
            POBLog.error(TAG, "Something went wrong.%s", e12.getLocalizedMessage());
        }
    }

    public void destroy() {
        removeAudioVolumeListener();
        removeExposureChangeListener();
        destroyImageResource();
        dismissResize();
        POBNetworkHandler pOBNetworkHandler = this.pobNetworkHandler;
        if (pOBNetworkHandler != null) {
            pOBNetworkHandler.cancelRequest(TAG);
            this.pobNetworkHandler = null;
        }
        this.imageNetworkListener = null;
        closeVideoPlayerActivity();
        this.isViewableChangeTracking = false;
        if (this.mraidBridge.getMraidState() == com.pubmatic.sdk.webrendering.mraid.b.EXPANDED) {
            POBFullScreenActivity.closeActivity(this.appContext, this.rendererId);
        }
        this.locationDetector = null;
        this.orientationProperties = null;
        this.isExposureChangeEnabled = false;
        POBWebView pOBWebView = this.twoPartWebView;
        if (pOBWebView != null) {
            pOBWebView.destroy();
            this.twoPartWebView = null;
        }
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.n
    public void expand(@Nullable String str, boolean z10, boolean z11) {
        POBLog.debug(TAG, "MRAID expand custom close: %s", Boolean.valueOf(z11));
        if (!this.placementType.equals("inline")) {
            POBLog.error(TAG, "Can't expand interstitial ad.", new Object[0]);
            this.mraidBridge.notifyError("Can't expand interstitial ad.", "expand");
            return;
        }
        if (z10) {
            notifyAdClick();
        }
        if (this.mraidBridge.getMraidState() == com.pubmatic.sdk.webrendering.mraid.b.DEFAULT || this.mraidBridge.getMraidState() == com.pubmatic.sdk.webrendering.mraid.b.RESIZED) {
            if (str != null && !str.isEmpty()) {
                handleTwoPartExpand(str, z11);
            } else {
                POBMraidBridge pOBMraidBridge = this.mraidBridge;
                manageExpand(pOBMraidBridge.adViewContainer, pOBMraidBridge, z11);
            }
        }
    }

    void initProperties(@NonNull POBMraidBridge pOBMraidBridge, boolean z10) {
        POBWebView pOBWebView = pOBMraidBridge.webView;
        int i10 = POBUtils.getViewXYPosition(pOBWebView)[0];
        int i11 = POBUtils.getViewXYPosition(pOBWebView)[1];
        int iConvertPixelToDp = POBUtils.convertPixelToDp(pOBWebView.getWidth());
        int iConvertPixelToDp2 = POBUtils.convertPixelToDp(pOBWebView.getHeight());
        DisplayMetrics displayMetrics = this.appContext.getResources().getDisplayMetrics();
        int iConvertPixelToDp3 = POBUtils.convertPixelToDp(displayMetrics.widthPixels);
        int iConvertPixelToDp4 = POBUtils.convertPixelToDp(displayMetrics.heightPixels);
        if (z10) {
            pOBMraidBridge.setScreenSize(iConvertPixelToDp3, iConvertPixelToDp4);
            pOBMraidBridge.setDefaultPosition(i10, i11, iConvertPixelToDp, iConvertPixelToDp2);
            pOBMraidBridge.setPlacementType(this.placementType);
            boolean zA = POBMRAIDUtil.a(this.appContext);
            pOBMraidBridge.setSupportedFeatures(zA, zA, true, true, true, true, false);
            POBLocation location = POBUtils.getLocation(this.locationDetector);
            if (location != null) {
                pOBMraidBridge.setLocation(location);
            }
            pOBMraidBridge.updateMraidState(pOBMraidBridge.getMraidState());
            pOBMraidBridge.updateEvent(com.pubmatic.sdk.webrendering.mraid.a.READY);
            pOBMraidBridge.updateViewable(true);
            iConvertPixelToDp4 = iConvertPixelToDp4;
        }
        boolean maxSize = pOBMraidBridge.setMaxSize(iConvertPixelToDp3, iConvertPixelToDp4);
        boolean currentPosition = pOBMraidBridge.setCurrentPosition(i10, i11, iConvertPixelToDp, iConvertPixelToDp2);
        if (maxSize || currentPosition) {
            pOBMraidBridge.setSizeChange(iConvertPixelToDp, iConvertPixelToDp2);
            if (this.isExposureChangeEnabled) {
                updateExposureProperty(pOBWebView.isShown());
            }
        }
        pOBMraidBridge.updateMraidState(pOBMraidBridge.getMraidState());
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.n
    public boolean isUserInteracted(boolean z10) {
        l lVar;
        if (isTwoPartExpandShowing() && (lVar = this.twoPartWebViewTouchListener) != null) {
            return lVar.a();
        }
        o oVar = this.mraidControllerListener;
        return oVar != null && oVar.isUserInteracted(z10);
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.n
    public void listenerChanged(@Nullable String str, boolean z10) {
        if ("audioVolumeChange".equalsIgnoreCase(str)) {
            if (z10) {
                addAudioVolumeListener();
                return;
            } else {
                removeAudioVolumeListener();
                return;
            }
        }
        if ("exposureChange".equalsIgnoreCase(str)) {
            if (z10) {
                this.isExposureChangeEnabled = true;
                addExposureChangeListener();
                return;
            } else {
                this.isExposureChangeEnabled = false;
                removeExposureChangeListener();
                return;
            }
        }
        if (C4240b4.h.V.equalsIgnoreCase(str)) {
            this.isViewableChangeTracking = z10;
            return;
        }
        POBLog.error(TAG, "Listener change not found for command " + str, new Object[0]);
    }

    @Override // com.pubmatic.sdk.webrendering.ui.POBAdVisibilityListener
    public void onVisibilityChange(boolean z10) {
        if (this.isAdVisible != z10) {
            this.isAdVisible = z10;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("MRAID Ad Visibility changed ");
            sb2.append(z10 ? "VISIBLE" : "INVISIBLE");
            POBLog.debug(TAG, sb2.toString(), new Object[0]);
            if (this.scrollChangeListener != null) {
                updateExposureProperty(this.isAdVisible);
            }
            if (this.isViewableChangeTracking) {
                this.currentBridge.updateViewable(this.isAdVisible);
            }
            if (this.audioVolumeChangeListener != null) {
                updateRecentAudioVolumeToAd();
            }
        }
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.n
    public void open(@Nullable String str, boolean z10) {
        POBLog.debug(TAG, "Received MRAID event to open url : %s", str);
        o oVar = this.mraidControllerListener;
        if (oVar != null) {
            oVar.onOpen(str);
        }
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.n
    public void playVideo(@NonNull String str, boolean z10) {
        if (z10) {
            notifyAdClick();
        }
        boolean z11 = false;
        if (POBUtils.isNullOrEmpty(str)) {
            POBLog.debug(TAG, "Can't launch video player due to invalid URL", new Object[0]);
            return;
        }
        String interstitialOrientation = this.placementType.equals("interstitial") ? getInterstitialOrientation(this.appContext) : null;
        Map<String, String> map = this.orientationProperties;
        if (map != null) {
            if (map.get("forceOrientation") != null) {
                interstitialOrientation = this.orientationProperties.get("forceOrientation");
            }
            z11 = Boolean.parseBoolean(this.orientationProperties.get("allowOrientationChange"));
        }
        Bundle bundle = new Bundle();
        if (interstitialOrientation != null) {
            bundle.putString(POBVideoPlayerActivity.FORCE_ORIENTATION_KEY, interstitialOrientation);
            bundle.putBoolean(POBVideoPlayerActivity.ALLOW_ORIENTATION_KEY, z11);
        }
        POBVideoPlayerActivity.startNewActivity(this.appContext, str, bundle, new c());
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.n
    public void resize(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        if (!this.placementType.equals("inline")) {
            POBLog.error(TAG, "Can't resize Interstitial ad.", new Object[0]);
            this.mraidBridge.notifyError("Can't perform resize on Interstitial ad.", "resize");
        } else {
            if (z11) {
                notifyAdClick();
            }
            manageResize(this.appContext, i10, i11, i12, i13, z10);
        }
    }

    void setMraidControllerListener(@Nullable o oVar) {
        this.mraidControllerListener = oVar;
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.n
    public void setOrientation(boolean z10, @Nullable String str, boolean z11) {
        if (this.orientationProperties != null) {
            if ("portrait".equalsIgnoreCase(str) || "landscape".equalsIgnoreCase(str)) {
                this.orientationProperties.put("forceOrientation", str);
            } else if (POBUtils.getDeviceOrientation(this.appContext) == 2) {
                this.orientationProperties.put("forceOrientation", "landscape");
            } else {
                this.orientationProperties.put("forceOrientation", "portrait");
            }
            this.orientationProperties.put("allowOrientationChange", String.valueOf(z10));
        }
        com.pubmatic.sdk.webrendering.mraid.b mraidState = this.currentBridge.getMraidState();
        if ((!this.placementType.equals("inline") || !mraidState.equals(com.pubmatic.sdk.webrendering.mraid.b.EXPANDED)) && (!this.placementType.equals("interstitial") || !mraidState.equals(com.pubmatic.sdk.webrendering.mraid.b.DEFAULT))) {
            POBLog.error(TAG, "Can't perform orientation properties. invalid MRAID state: %s", mraidState.b());
            return;
        }
        POBLog.debug(TAG, "setOrientation : allowOrientationChange :" + z10 + ", forceOrientation:" + str, new Object[0]);
        Context baseContext = ((MutableContextWrapper) this.currentBridge.webView.getContext()).getBaseContext();
        if (baseContext instanceof Activity) {
            Activity activity = (Activity) baseContext;
            forceOrientation(activity, str);
            allowOrientationChange(activity, z10);
        }
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.n
    public void storePicture(@Nullable String str, boolean z10) {
        if (z10) {
            notifyAdClick();
        }
        if (str == null || str.isEmpty()) {
            this.currentBridge.notifyError("Missing picture url.", MRAIDNativeFeature.STORE_PICTURE);
            return;
        }
        if (!POBUtils.hasPermission(this.appContext, com.taurusx.tax.g.d.f66106w)) {
            this.currentBridge.notifyError("App does not have WRITE_EXTERNAL_STORAGE permission to store the picture.", MRAIDNativeFeature.STORE_PICTURE);
            return;
        }
        if (this.pobNetworkHandler == null) {
            this.pobNetworkHandler = new POBNetworkHandler(this.appContext);
        }
        if (this.imageNetworkListener == null) {
            this.imageNetworkListener = getImageNetworkListener();
        }
        POBImageRequest pOBImageRequest = new POBImageRequest();
        pOBImageRequest.setUrl(str);
        pOBImageRequest.setTimeout(5000);
        pOBImageRequest.setRequestTag(TAG);
        this.pobNetworkHandler.sendImageRequest(pOBImageRequest, this.imageNetworkListener);
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.n
    public void unload() {
        String str = this.placementType;
        str.getClass();
        if (str.equals("inline")) {
            o oVar = this.mraidControllerListener;
            if (oVar != null) {
                oVar.onAdUnload();
                return;
            }
            return;
        }
        if (str.equals("interstitial")) {
            close();
        } else {
            POBLog.error(TAG, "Can't perform unload as no specific placement type found.", new Object[0]);
        }
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.n
    public void useCustomClose(boolean z10) {
        POBLog.debug(TAG, "Received command to use custom close: " + z10, new Object[0]);
        o oVar = this.mraidControllerListener;
        if (oVar != null) {
            oVar.shouldUseCustomClose(z10);
        }
    }
}
