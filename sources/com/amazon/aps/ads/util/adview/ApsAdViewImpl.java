package com.amazon.aps.ads.util.adview;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.amazon.aps.ads.ApsAd;
import com.amazon.aps.ads.ApsAdUtils;
import com.amazon.aps.ads.ApsLog;
import com.amazon.aps.ads.listeners.ApsAdListener;
import com.amazon.aps.ads.metrics.ApsMetricsAdListenerAdapterBase;
import com.amazon.aps.ads.util.ApsAdExtensionsKt;
import com.amazon.aps.ads.util.ApsUtils;
import com.amazon.aps.ads.util.adview.ApsAdViewFetchUtils;
import com.amazon.aps.bidder.adapter.ApsBidder;
import com.amazon.aps.bidder.adapter.ApsBidderAdViewAdapter;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.ApsMetrics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import com.amazon.aps.shared.metrics.ApsMetricsPerfEventModelBuilder;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.DTBAdListener;
import com.amazon.device.ads.DTBAdMRAIDBannerController;
import com.amazon.device.ads.DTBAdMRAIDController;
import com.amazon.device.ads.DTBAdView;
import com.amazon.device.ads.DtbOmSdkSessionManager;
import com.amazon.device.ads.WebResourceOptions;
import com.amazon.device.ads.WebResourceService;
import com.ironsource.Df;
import com.mbridge.msdk.MBridgeConstans;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a1;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0015\u001a\u00020\u0016H\u0014J\u0016\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ(\u0010\u001c\u001a\u00020\u00162\b\u0010\u001d\u001a\u0004\u0018\u00010\u00192\u0014\u0010\u001e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0004\u0012\u00020 0\u001fH\u0016J\u0010\u0010!\u001a\u00020\u00162\b\u0010\"\u001a\u0004\u0018\u00010\u0019J\b\u0010#\u001a\u00020\u0016H\u0016J\u0006\u0010$\u001a\u00020\u0016J\"\u0010\u001c\u001a\u00020\u00162\u0018\u0010%\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0006\u0012\u0004\u0018\u00010 \u0018\u00010\u001fH\u0016J\u0012\u0010\u001c\u001a\u00020\u00162\b\u0010\u001d\u001a\u0004\u0018\u00010\u0019H\u0016J\u0012\u0010\u001c\u001a\u00020\u00162\b\u0010&\u001a\u0004\u0018\u00010\u001bH\u0016J\u001a\u0010\u001c\u001a\u00020\u00162\b\u0010'\u001a\u0004\u0018\u00010\u00192\b\u0010(\u001a\u0004\u0018\u00010\u001bJ\u0012\u0010)\u001a\u00020\u00162\b\u0010\u001d\u001a\u0004\u0018\u00010\u0019H\u0002J\u0012\u0010.\u001a\u00020\u000b2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u0018\u00101\u001a\u0002022\u0006\u0010/\u001a\u0002002\u0006\u00103\u001a\u000202H\u0002J\u0006\u00104\u001a\u00020\u0016J\u0018\u00105\u001a\u00020\u00162\u0006\u00106\u001a\u00020\u00192\u0006\u00107\u001a\u000208H\u0004J\u0010\u00109\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u0019H\u0016J\n\u0010:\u001a\u0004\u0018\u00010;H\u0016J$\u0010<\u001a\u00020\u00162\b\u0010=\u001a\u0004\u0018\u00010\u00192\u0010\u0010>\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010?H\u0016J\u0010\u0010@\u001a\u00020\u00162\u0006\u0010A\u001a\u00020BH\u0014J\b\u0010C\u001a\u00020\u0016H\u0014J\b\u0010D\u001a\u00020\u0016H\u0014J\u0010\u0010E\u001a\u00020\u00162\u0006\u0010F\u001a\u00020\u000bH\u0014J\u0018\u0010G\u001a\u00020\u00162\u0006\u0010H\u001a\u00020I2\u0006\u0010A\u001a\u00020BH\u0014J\b\u0010J\u001a\u00020\u0016H\u0016J\b\u0010K\u001a\u00020\u0016H\u0016J\b\u0010L\u001a\u00020\u0016H\u0016J$\u0010M\u001a\u00020\u00162\u0006\u0010N\u001a\u00020O2\n\u0010P\u001a\u000608j\u0002`Q2\u0006\u0010R\u001a\u00020\u0019H\u0016J\u001a\u0010V\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u00192\b\u0010W\u001a\u0004\u0018\u00010OH\u0016J\b\u0010X\u001a\u00020\u000bH\u0016R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR(\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f@DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010*\u001a\u00020+¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0014\u0010S\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bT\u0010U¨\u0006Y"}, d2 = {"Lcom/amazon/aps/ads/util/adview/ApsAdViewImpl;", "Lcom/amazon/aps/ads/util/adview/ApsAdViewBase;", "Lcom/amazon/aps/ads/util/adview/ApsWebBridgeListener;", "Lcom/amazon/aps/ads/util/adview/ApsAdWebViewClientListener;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "webBridge", "Lcom/amazon/aps/ads/util/adview/ApsAdViewWebBridge;", "localOnly", "", "getLocalOnly", "()Z", "value", "Lcom/amazon/aps/ads/util/adview/ApsAdWebViewSupportClientBase;", "webClient", "getWebClient", "()Lcom/amazon/aps/ads/util/adview/ApsAdWebViewSupportClientBase;", "setWebClient", "(Lcom/amazon/aps/ads/util/adview/ApsAdWebViewSupportClientBase;)V", "initWebView", "", "getAdInfo", "adhtml", "", "adInfoBundle", "Landroid/os/Bundle;", "fetchAd", "adHtml", "extra", "", "", "fetchAdWithLocation", "url", "cleanup", "onAdRemoved", "extraMap", HandleInvocationsFromAdViewer.KEY_EXTRAS, "adHtmlArg", "extraData", "passRenderingControlToBidderSDK", "apsAdListener", "Lcom/amazon/aps/ads/listeners/ApsAdListener;", "getApsAdListener", "()Lcom/amazon/aps/ads/listeners/ApsAdListener;", "detectAdClick", "event", "Landroid/view/MotionEvent;", "handleClick", "", "time", "setIgnoreDetachment", "loadLocalFile", "filename", "sb", "Ljava/lang/StringBuilder;", "loadUrl", "getApsMraidHandler", "Lcom/amazon/device/ads/DTBAdMRAIDController;", "evaluateApsJavascript", "script", "resultCallback", "Landroid/webkit/ValueCallback;", "onPositionChanged", "adViewRect", "Landroid/graphics/Rect;", "setCurrentPositionProperty", Df.f40642c, "onViewabilityChanged", "isChanged", "onExposureChange", "exposurePercentage", "", "onPageLoaded", Df.f40650k, "onLoadError", "onCrash", "webView", "Landroid/webkit/WebView;", "errorInfo", "Lkotlin/text/StringBuilder;", "errorDetail", "adViewContext", "getAdViewContext", "()Landroid/content/Context;", "onPageFinished", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "isTwoPartExpand", "aps-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ApsAdViewImpl extends ApsAdViewBase implements ApsWebBridgeListener, ApsAdWebViewClientListener {

    @NotNull
    private final Context adViewContext;

    @NotNull
    private final ApsAdListener apsAdListener;
    private final boolean localOnly;

    @Nullable
    protected ApsAdViewWebBridge webBridge;

    @Nullable
    private ApsAdWebViewSupportClientBase webClient;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApsAdViewImpl(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.localOnly = WebResourceOptions.isLocalSourcesOnly();
        this.apsAdListener = new ApsAdListener() { // from class: com.amazon.aps.ads.util.adview.ApsAdViewImpl$apsAdListener$1
            @Override // com.amazon.aps.ads.listeners.ApsAdListener
            public void onAdClicked(ApsAd apsAd) {
                ApsMetricsAdListenerAdapterBase mraidListenerAdapter;
                DTBAdListener listener;
                WeakReference<View> viewWeakReference;
                Intrinsics.checkNotNullParameter(apsAd, "apsAd");
                ApsAdViewImpl adView = apsAd.getAdView();
                View view = (adView == null || (viewWeakReference = adView.getViewWeakReference()) == null) ? null : viewWeakReference.get();
                ApsAdViewImpl adView2 = apsAd.getAdView();
                if (adView2 == null || (mraidListenerAdapter = adView2.getMraidListenerAdapter()) == null || (listener = mraidListenerAdapter.getListener()) == null) {
                    return;
                }
                listener.onAdClicked(view);
            }

            @Override // com.amazon.aps.ads.listeners.ApsAdListener
            public void onAdClosed(ApsAd apsAd) {
                ApsMetricsAdListenerAdapterBase mraidListenerAdapter;
                DTBAdListener listener;
                WeakReference<View> viewWeakReference;
                Intrinsics.checkNotNullParameter(apsAd, "apsAd");
                ApsAdViewImpl adView = apsAd.getAdView();
                View view = (adView == null || (viewWeakReference = adView.getViewWeakReference()) == null) ? null : viewWeakReference.get();
                ApsAdViewImpl adView2 = apsAd.getAdView();
                if (adView2 == null || (mraidListenerAdapter = adView2.getMraidListenerAdapter()) == null || (listener = mraidListenerAdapter.getListener()) == null) {
                    return;
                }
                listener.onAdClosed(view);
            }

            @Override // com.amazon.aps.ads.listeners.ApsAdListener
            public void onAdError(ApsAd apsAd) {
                Intrinsics.checkNotNullParameter(apsAd, "apsAd");
            }

            @Override // com.amazon.aps.ads.listeners.ApsAdListener
            public void onAdFailedToLoad(ApsAd apsAd) {
                ApsMetricsAdListenerAdapterBase mraidListenerAdapter;
                DTBAdListener listener;
                WeakReference<View> viewWeakReference;
                Intrinsics.checkNotNullParameter(apsAd, "apsAd");
                ApsAdViewImpl adView = apsAd.getAdView();
                View view = (adView == null || (viewWeakReference = adView.getViewWeakReference()) == null) ? null : viewWeakReference.get();
                ApsAdViewImpl adView2 = apsAd.getAdView();
                if (adView2 == null || (mraidListenerAdapter = adView2.getMraidListenerAdapter()) == null || (listener = mraidListenerAdapter.getListener()) == null) {
                    return;
                }
                listener.onAdFailed(view);
            }

            @Override // com.amazon.aps.ads.listeners.ApsAdListener
            public void onAdLoaded(ApsAd apsAd) {
                ApsMetricsAdListenerAdapterBase mraidListenerAdapter;
                DTBAdListener listener;
                WeakReference<View> viewWeakReference;
                Intrinsics.checkNotNullParameter(apsAd, "apsAd");
                ApsAdViewImpl adView = apsAd.getAdView();
                View view = (adView == null || (viewWeakReference = adView.getViewWeakReference()) == null) ? null : viewWeakReference.get();
                ApsAdViewImpl adView2 = apsAd.getAdView();
                if (adView2 == null || (mraidListenerAdapter = adView2.getMraidListenerAdapter()) == null || (listener = mraidListenerAdapter.getListener()) == null) {
                    return;
                }
                listener.onAdLoaded(view);
            }

            @Override // com.amazon.aps.ads.listeners.ApsAdListener
            public void onAdOpen(ApsAd apsAd) {
                ApsMetricsAdListenerAdapterBase mraidListenerAdapter;
                DTBAdListener listener;
                WeakReference<View> viewWeakReference;
                Intrinsics.checkNotNullParameter(apsAd, "apsAd");
                ApsAdViewImpl adView = apsAd.getAdView();
                View view = (adView == null || (viewWeakReference = adView.getViewWeakReference()) == null) ? null : viewWeakReference.get();
                ApsAdViewImpl adView2 = apsAd.getAdView();
                if (adView2 == null || (mraidListenerAdapter = adView2.getMraidListenerAdapter()) == null || (listener = mraidListenerAdapter.getListener()) == null) {
                    return;
                }
                listener.onAdOpen(view);
            }

            @Override // com.amazon.aps.ads.listeners.ApsAdListener
            public void onImpressionFired(ApsAd apsAd) {
                ApsMetricsAdListenerAdapterBase mraidListenerAdapter;
                DTBAdListener listener;
                WeakReference<View> viewWeakReference;
                Intrinsics.checkNotNullParameter(apsAd, "apsAd");
                ApsUtils.INSTANCE.fireAAXImpressionPixel(apsAd);
                ApsAdViewImpl adView = apsAd.getAdView();
                View view = (adView == null || (viewWeakReference = adView.getViewWeakReference()) == null) ? null : viewWeakReference.get();
                ApsAdViewImpl adView2 = apsAd.getAdView();
                if (adView2 == null || (mraidListenerAdapter = adView2.getMraidListenerAdapter()) == null || (listener = mraidListenerAdapter.getListener()) == null) {
                    return;
                }
                listener.onImpressionFired(view);
            }

            @Override // com.amazon.aps.ads.listeners.ApsAdListener
            public /* synthetic */ void onVideoCompleted(ApsAd apsAd) {
                t0.a.d(this, apsAd);
            }
        };
        this.adViewContext = context;
    }

    private final long handleClick(MotionEvent event, long time) {
        if (time - this.timeClicked < 1000) {
            return this.timePressed;
        }
        if (time - this.timePressed >= 500) {
            return 0L;
        }
        this.timeClicked = time;
        if (getMraidHandler() == null) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.LOG, "Null controller instance onAdClick callback");
            return 0L;
        }
        DTBAdMRAIDController mraidHandler = getMraidHandler();
        Intrinsics.checkNotNull(mraidHandler);
        mraidHandler.onAdClicked();
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initWebView$lambda$3(ApsAdViewImpl apsAdViewImpl, View view, MotionEvent motionEvent) {
        return apsAdViewImpl.detectAdClick(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadUrl$lambda$10$lambda$9(ApsAdViewImpl apsAdViewImpl, String str) {
        try {
            super.loadUrl(str);
        } catch (Exception e10) {
            ApsAdExtensionsKt.logEvent(apsAdViewImpl, APSEventSeverity.FATAL, APSEventType.EXCEPTION, "WebView crash noticed during super.loadUrl method. URL:" + str, e10);
        }
    }

    private final void passRenderingControlToBidderSDK(String adHtml) {
        JSONObject jSONObject;
        if (adHtml != null) {
            try {
                jSONObject = new JSONObject(adHtml);
            } catch (Exception e10) {
                APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "SDKB : Failed to pass rendering control to bidder SDK", e10);
                return;
            }
        } else {
            jSONObject = null;
        }
        ApsAd apsAdForBidderRendering = ApsAdUtils.getApsAdForBidderRendering(jSONObject, this);
        if (apsAdForBidderRendering == null) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "SDKB : Failed to create ApsAd for bidder Adapater");
            return;
        }
        Object adapterInstance = ApsBidder.getApsBidderInstance().getAdapterInstance(apsAdForBidderRendering.getBidder());
        if (adapterInstance != null) {
            ((ApsBidderAdViewAdapter) adapterInstance).loadAdView(AdRegistration.getContext(), apsAdForBidderRendering, this.apsAdListener);
        }
    }

    @Override // com.amazon.aps.ads.util.adview.ApsAdViewBase
    public void cleanup() {
        try {
            super.cleanup();
            removeJavascriptInterface("amzn_bridge");
            DtbOmSdkSessionManager omSdkManager = getOmSdkManager();
            if (omSdkManager != null) {
                omSdkManager.stopOmAdSession();
            }
            DTBAdMRAIDController mraidHandler = getMraidHandler();
            if (mraidHandler != null) {
                mraidHandler.cleanup();
            }
            setMraidHandler(null);
        } catch (RuntimeException e10) {
            ApsAdExtensionsKt.logEvent(this, APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Error in ApsAdView cleanup", e10);
        }
    }

    public boolean detectAdClick(@Nullable MotionEvent event) {
        if (getIsVideo() || event == null) {
            return false;
        }
        int action = event.getAction();
        long time = new Date().getTime();
        if (action != 0) {
            time = action != 1 ? this.timePressed : handleClick(event, time);
        }
        this.timePressed = time;
        return false;
    }

    @Override // com.amazon.aps.ads.util.adview.ApsWebBridgeListener
    public void evaluateApsJavascript(@Nullable final String script, @Nullable final ValueCallback<String> resultCallback) {
        if (script != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.amazon.aps.ads.util.adview.e
                @Override // java.lang.Runnable
                public final void run() {
                    super/*android.webkit.WebView*/.evaluateJavascript(script, resultCallback);
                }
            });
        }
    }

    public void fetchAd(@Nullable String adHtml, @NotNull Map<String, ? extends Object> extra) {
        Intrinsics.checkNotNullParameter(extra, "extra");
        ApsAdViewFetchUtils.INSTANCE.fetchAd(this, adHtml, extra);
    }

    public final void fetchAdWithLocation(@Nullable String url) {
        Context context = getContext();
        if (context != null) {
            ApsAdViewFetchUtils.INSTANCE.fetchAdWithLocation(context, this, this.localOnly, url);
        }
    }

    public final void getAdInfo(@NotNull String adhtml, @NotNull Bundle adInfoBundle) {
        Intrinsics.checkNotNullParameter(adhtml, "adhtml");
        Intrinsics.checkNotNullParameter(adInfoBundle, "adInfoBundle");
        ApsAdViewFetchUtils.INSTANCE.getAdInfo(adhtml, adInfoBundle);
    }

    @Override // com.amazon.aps.ads.util.adview.ApsAdWebViewClientListener
    @NotNull
    public Context getAdViewContext() {
        return this.adViewContext;
    }

    @NotNull
    public final ApsAdListener getApsAdListener() {
        return this.apsAdListener;
    }

    @Override // com.amazon.aps.ads.util.adview.ApsWebBridgeListener
    @Nullable
    public DTBAdMRAIDController getApsMraidHandler() {
        return getMraidHandler();
    }

    public final boolean getLocalOnly() {
        return this.localOnly;
    }

    @Nullable
    public final ApsAdWebViewSupportClientBase getWebClient() {
        return this.webClient;
    }

    @Override // com.amazon.aps.ads.util.adview.ApsAdViewBase
    protected void initWebView() {
        super.initWebView();
        ApsAdWebViewSupportClientBase apsAdWebViewSupportClient = new ApsAdWebViewSupportClient(this);
        setWebViewClient(apsAdWebViewSupportClient);
        setWebClient(apsAdWebViewSupportClient);
        setAdViewScrollEnabled(false);
        ApsAdViewWebBridge apsAdViewWebBridge = new ApsAdViewWebBridge(this);
        this.webBridge = apsAdViewWebBridge;
        addJavascriptInterface(apsAdViewWebBridge, "amzn_bridge");
        WebResourceService.init();
        initLayoutListeners();
        setOnTouchListener(new View.OnTouchListener() { // from class: com.amazon.aps.ads.util.adview.f
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return ApsAdViewImpl.initWebView$lambda$3(this.f7386b, view, motionEvent);
            }
        });
    }

    @Override // com.amazon.aps.ads.util.adview.ApsAdWebViewClientListener
    public boolean isTwoPartExpand() {
        if (getMraidHandler() == null) {
            return false;
        }
        DTBAdMRAIDController mraidHandler = getMraidHandler();
        Intrinsics.checkNotNull(mraidHandler, "null cannot be cast to non-null type com.amazon.device.ads.DTBAdMRAIDController");
        return mraidHandler.isTwoPartExpand();
    }

    protected final void loadLocalFile(@NotNull String filename, @NotNull StringBuilder sb2) {
        Intrinsics.checkNotNullParameter(filename, "filename");
        Intrinsics.checkNotNullParameter(sb2, "sb");
        ApsAdViewFetchUtils.Companion companion = ApsAdViewFetchUtils.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        companion.loadLocalFile(context, this.localOnly, filename, sb2);
    }

    @Override // android.webkit.WebView
    public void loadUrl(@NotNull final String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            ApsAdWebViewSupportClientBase apsAdWebViewSupportClientBase = this.webClient;
            if (apsAdWebViewSupportClientBase != null) {
                if (!apsAdWebViewSupportClientBase.getIsCrashed()) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.amazon.aps.ads.util.adview.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            ApsAdViewImpl.loadUrl$lambda$10$lambda$9(this.f7381b, url);
                        }
                    });
                    return;
                }
                ApsAdExtensionsKt.logEvent(this, APSEventSeverity.FATAL, APSEventType.LOG, "WebView is corrupted. loadUrl method will not be executed. URL:" + url);
            }
        } catch (RuntimeException e10) {
            ApsAdExtensionsKt.logEvent(this, APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Failed to execute loadUrl method", e10);
        }
    }

    @Override // com.amazon.aps.ads.util.adview.ApsAdWebViewClientListener
    public void onAdLeftApplication() {
        DTBAdMRAIDController mraidHandler = getMraidHandler();
        if (mraidHandler != null) {
            mraidHandler.onAdLeftApplication();
        }
    }

    @Override // com.amazon.aps.ads.util.adview.ApsAdViewBase
    protected void onAdOpened() {
        DTBAdMRAIDController mraidHandler = getMraidHandler();
        if (mraidHandler != null) {
            mraidHandler.onAdOpened();
        }
    }

    public final void onAdRemoved() {
        if (getMraidHandler() == null) {
            ApsAdExtensionsKt.logEvent(this, APSEventSeverity.FATAL, APSEventType.LOG, "Null controller instance onAdRemoved");
            return;
        }
        DTBAdMRAIDController mraidHandler = getMraidHandler();
        Intrinsics.checkNotNull(mraidHandler);
        mraidHandler.onAdRemoved();
    }

    @Override // com.amazon.aps.ads.util.adview.ApsAdWebViewClientListener
    public void onCrash(@NotNull WebView webView, @NotNull StringBuilder errorInfo, @NotNull String errorDetail) {
        DtbOmSdkSessionManager omSdkManager;
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
        Intrinsics.checkNotNullParameter(errorDetail, "errorDetail");
        try {
            if (webView instanceof DTBAdView) {
                String userAgentString = ((DTBAdView) webView).getSettings().getUserAgentString();
                if (userAgentString != null) {
                    a1 a1Var = a1.f93282a;
                    String str = String.format("webViewUserAgentInfo = %s;", Arrays.copyOf(new Object[]{userAgentString}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                    errorInfo.append(str);
                }
                if (getBidId() != null) {
                    a1 a1Var2 = a1.f93282a;
                    String str2 = String.format("webViewBidId = %s;", Arrays.copyOf(new Object[]{getBidId()}, 1));
                    Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                    errorInfo.append(str2);
                }
                onAdRemoved();
                if (getMraidHandler() != null && (omSdkManager = getOmSdkManager()) != null) {
                    omSdkManager.stopOmAdSession();
                }
                ViewParent parent = ((DTBAdView) webView).getParent();
                if (parent != null && (parent instanceof ViewGroup)) {
                    ((ViewGroup) parent).removeView(this);
                }
                DTBAdMRAIDController mraidHandler = getMraidHandler();
                if (mraidHandler != null) {
                    mraidHandler.onLoadError();
                    cleanup();
                }
                webView.removeAllViews();
            }
            String strSubstring = errorDetail.substring(0, Math.min(100, errorDetail.length()));
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            a1 a1Var3 = a1.f93282a;
            String str3 = String.format("webViewErrorDetail = %s", Arrays.copyOf(new Object[]{strSubstring}, 1));
            Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
            errorInfo.append(str3);
            ApsAdExtensionsKt.logEvent(this, APSEventSeverity.FATAL, APSEventType.EXCEPTION, errorInfo.toString());
        } catch (RuntimeException e10) {
            ApsAdExtensionsKt.logEvent(this, APSEventSeverity.FATAL, APSEventType.EXCEPTION, errorInfo.toString(), e10);
        }
    }

    @Override // com.amazon.aps.ads.util.adview.ApsAdViewBase
    protected void onExposureChange(int exposurePercentage, @NotNull Rect adViewRect) {
        Intrinsics.checkNotNullParameter(adViewRect, "adViewRect");
        DTBAdMRAIDController mraidHandler = getMraidHandler();
        if (mraidHandler != null) {
            mraidHandler.fireExposureChange(exposurePercentage, adViewRect);
        }
    }

    @Override // com.amazon.aps.ads.util.adview.ApsAdWebViewClientListener
    public void onLoadError() {
        DTBAdMRAIDController mraidHandler = getMraidHandler();
        if (mraidHandler != null) {
            mraidHandler.onLoadError();
        }
    }

    @Override // com.amazon.aps.ads.util.adview.ApsAdWebViewClientListener
    public void onPageFinished(@NotNull String url, @Nullable WebView view) {
        DtbOmSdkSessionManager omSdkManager;
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            ApsAdExtensionsKt.d(this, "Page finished:" + url);
            if (view instanceof DTBAdView) {
                if (StringsKt.g0(url, "MRAID_ENV", false, 2, null)) {
                    onPageLoaded();
                    return;
                }
                if (url.equals("https://c.amazon-adsystem.com/")) {
                    if ((getMraidHandler() instanceof DTBAdMRAIDBannerController) && (omSdkManager = getOmSdkManager()) != null) {
                        omSdkManager.stopOmAdSession();
                        if (getIsVideo()) {
                            omSdkManager.initJavaScriptOmAdSession(this, url);
                        } else {
                            omSdkManager.initHtmlDisplayOmAdSession(this, url);
                        }
                        omSdkManager.registerAdView(this);
                        omSdkManager.startAdSession();
                        if (!getIsVideo()) {
                            omSdkManager.displayAdEventLoaded();
                        }
                    }
                    onPageLoaded();
                }
            }
        } catch (RuntimeException e10) {
            ApsAdExtensionsKt.logEvent(this, APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute onPageFinished method", e10);
        }
    }

    @Override // com.amazon.aps.ads.util.adview.ApsAdWebViewClientListener
    public void onPageLoaded() {
        DTBAdMRAIDController mraidHandler = getMraidHandler();
        if (mraidHandler != null) {
            mraidHandler.onPageLoad();
        }
    }

    @Override // com.amazon.aps.ads.util.adview.ApsAdViewBase
    protected void onPositionChanged(@NotNull Rect adViewRect) {
        Intrinsics.checkNotNullParameter(adViewRect, "adViewRect");
        DTBAdMRAIDController mraidHandler = getMraidHandler();
        if (mraidHandler != null) {
            mraidHandler.onPositionChanged(adViewRect);
        }
    }

    @Override // com.amazon.aps.ads.util.adview.ApsAdViewBase
    protected void onViewabilityChanged(boolean isChanged) {
        DTBAdMRAIDController mraidHandler = getMraidHandler();
        if (mraidHandler != null) {
            mraidHandler.onViewabilityChanged(isChanged);
        }
    }

    @Override // com.amazon.aps.ads.util.adview.ApsAdViewBase
    protected void setCurrentPositionProperty() {
        DTBAdMRAIDController mraidHandler = getMraidHandler();
        if (mraidHandler != null) {
            mraidHandler.setCurrentPositionProperty();
        }
    }

    public final void setIgnoreDetachment() {
        this.ignoreDetachment = true;
    }

    protected final void setWebClient(@Nullable ApsAdWebViewSupportClientBase apsAdWebViewSupportClientBase) {
        if (apsAdWebViewSupportClientBase != null) {
            this.webClient = apsAdWebViewSupportClientBase;
            setWebViewClient(apsAdWebViewSupportClientBase);
        }
    }

    public void fetchAd(@Nullable Map<String, ? extends Object> extraMap) {
        Intrinsics.checkNotNull(extraMap, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String?, kotlin.Any>");
        fetchAd((String) null, extraMap);
    }

    public void fetchAd(@Nullable String adHtml) {
        fetchAd(adHtml, (Bundle) null);
    }

    public void fetchAd(@Nullable Bundle extras) {
        fetchAd((String) null, extras);
    }

    public final void fetchAd(@Nullable String adHtmlArg, @Nullable Bundle extraData) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (ApsUtils.INSTANCE.isNullOrEmpty(adHtmlArg)) {
            adHtmlArg = null;
            if (extraData != null) {
                adHtmlArg = extraData.getString("bid_html_template", null);
            }
        }
        if (ApsAdUtils.sdkRenderingBridgeEnabled(adHtmlArg)) {
            passRenderingControlToBidderSDK(adHtmlArg);
            ApsLog.d("Ad Rendered by Bidder SDK");
            return;
        }
        DTBAdMRAIDController mraidHandler = getMraidHandler();
        if (mraidHandler != null) {
            ApsAdViewFetchUtils.Companion companion = ApsAdViewFetchUtils.INSTANCE;
            Bundle bundleForFetchAd = companion.getBundleForFetchAd(mraidHandler, adHtmlArg, extraData);
            if (bundleForFetchAd != null) {
                setBidId(bundleForFetchAd.getString("bid_identifier"));
                setHostname(bundleForFetchAd.getString("hostname_identifier"));
                setVideo(bundleForFetchAd.getBoolean("video_flag"));
            }
            setStartTime(new Date().getTime());
            companion.fetchAd(this, mraidHandler, adHtmlArg, extraData);
        }
        ApsMetrics.INSTANCE.adEvent(getBidId(), new ApsMetricsPerfEventModelBuilder().withBidId(getBidId()).withAdFetchStartTime(jCurrentTimeMillis));
    }
}
