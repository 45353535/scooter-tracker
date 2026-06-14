package com.amazon.aps.ads.util.adview;

import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.RequiresApi;
import androidx.media3.common.MimeTypes;
import com.amazon.aps.ads.util.ApsAdExtensionsKt;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import com.amazon.device.ads.DTBAdView;
import com.mbridge.msdk.MBridgeConstans;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.taurusx.tax.f.y;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a1;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0016J\u001c\u0010\u0010\u001a\u00020\u00112\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010\u0012\u001a\u00020\u00132\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0007H\u0016J\u001a\u0010\u0014\u001a\u00020\u00112\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0015\u001a\u00020\u0016H\u0017J&\u0010\u0017\u001a\u00020\u00132\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u0007H\u0002J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001e\u001a\u00020\u0007H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u0007X\u0082D¢\u0006\u0004\n\u0002\b\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/amazon/aps/ads/util/adview/ApsAdWebViewSupportClient;", "Lcom/amazon/aps/ads/util/adview/ApsAdWebViewSupportClientBase;", "webviewClientListener", "Lcom/amazon/aps/ads/util/adview/ApsAdWebViewClientListener;", "<init>", "(Lcom/amazon/aps/ads/util/adview/ApsAdWebViewClientListener;)V", "AMAZON_APP_STORE_LINK", "", "AMAZON_APP_STORE_LINK$1", "schemeHandler", "Lcom/amazon/aps/ads/util/adview/ApsAdWebViewSchemeHandler;", "shouldInterceptRequest", "Landroid/webkit/WebResourceResponse;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/webkit/WebView;", "url", "shouldOverrideUrlLoading", "", "onPageFinished", "", "onRenderProcessGone", "detail", "Landroid/webkit/RenderProcessGoneDetail;", "onReceivedError", "request", "Landroid/webkit/WebResourceRequest;", "error", "Landroid/webkit/WebResourceError;", "matchesLocalInjectionUrl", "createImageInjectionResponse", "jsScript", y.f66058y, "aps-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ApsAdWebViewSupportClient extends ApsAdWebViewSupportClientBase {

    @NotNull
    public static final String AMAZON_APP_STORE_LINK = "https://www.amazon.com/gp/mas/dl/android?";

    @NotNull
    public static final String AMAZON_SCHEME = "amzn";

    @NotNull
    public static final String GOOGLE_PLAY_STORE_LINK = "https://play.google.com/store/apps/";

    @NotNull
    public static final String MARKET_SCHEME = "market";

    @NotNull
    public static final String MOBILE_SHOPPING_SCHEME = "com.amazon.mobile.shopping";

    @NotNull
    public static final String MOBILE_SHOPPING_WEB_SCHEME = "com.amazon.mobile.shopping.web";

    /* JADX INFO: renamed from: AMAZON_APP_STORE_LINK$1, reason: from kotlin metadata */
    @NotNull
    private final String AMAZON_APP_STORE_LINK;

    @NotNull
    private final ApsAdWebViewSchemeHandler schemeHandler;

    @NotNull
    private final ApsAdWebViewClientListener webviewClientListener;

    public ApsAdWebViewSupportClient(@NotNull ApsAdWebViewClientListener webviewClientListener) {
        Intrinsics.checkNotNullParameter(webviewClientListener, "webviewClientListener");
        this.webviewClientListener = webviewClientListener;
        this.AMAZON_APP_STORE_LINK = AMAZON_APP_STORE_LINK;
        this.schemeHandler = new ApsAdWebViewSchemeHandler(webviewClientListener);
    }

    private final WebResourceResponse createImageInjectionResponse(String jsScript) {
        try {
            InputStream inputStreamOpen = this.webviewClientListener.getAdViewContext().getAssets().open(jsScript);
            Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "open(...)");
            return new WebResourceResponse(MimeTypes.IMAGE_PNG, "UTF-8", inputStreamOpen);
        } catch (Exception e10) {
            ApsAdExtensionsKt.logEvent(this, APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Failed to get injection response: " + jsScript, e10);
            return null;
        }
    }

    private final boolean matchesLocalInjectionUrl(String url) {
        try {
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = url.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            Uri uri = Uri.parse(lowerCase);
            if (uri != null) {
                return Intrinsics.areEqual("local", uri.getScheme());
            }
            return false;
        } catch (RuntimeException unused) {
            return false;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(@Nullable WebView view, @NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        ApsAdExtensionsKt.d(this, "Page load completed: " + url);
        this.webviewClientListener.onPageFinished(url, view);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(@Nullable WebView view, @Nullable WebResourceRequest request, @Nullable WebResourceError error) {
        super.onReceivedError(view, request, error);
        ApsAdExtensionsKt.e(this, "WebView client received OnReceivedError");
        try {
            this.webviewClientListener.onLoadError();
        } catch (RuntimeException e10) {
            ApsAdExtensionsKt.logEvent(this, APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute onReceivedError method", e10);
        }
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 26)
    public boolean onRenderProcessGone(@Nullable WebView view, @NotNull RenderProcessGoneDetail detail) {
        String str;
        Intrinsics.checkNotNullParameter(detail, "detail");
        super.onRenderProcessGone(view, detail);
        setCrashed(true);
        ApsAdExtensionsKt.e(this, "WebView client crashed");
        StringBuilder sb2 = new StringBuilder("Fail to render ad due to webView crash.");
        if (view != null) {
            if (view instanceof DTBAdView) {
                a1 a1Var = a1.f93282a;
                str = String.format("Webview didCrash :%s , Webview rendererPriorityAtExit : %d", Arrays.copyOf(new Object[]{Boolean.valueOf(detail.didCrash()), Integer.valueOf(detail.rendererPriorityAtExit())}, 2));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            } else {
                str = "";
            }
            this.webviewClientListener.onCrash(view, sb2, str);
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    public WebResourceResponse shouldInterceptRequest(@Nullable WebView view, @Nullable String url) {
        try {
            ApsAdExtensionsKt.d(this, "Should intercept Resource url: " + url);
            if (url == null || !matchesLocalInjectionUrl(url)) {
                return super.shouldInterceptRequest(view, url);
            }
            String strSubstring = url.substring(StringsKt.B0(url, IOUtils.DIR_SEPARATOR_UNIX, 0, false, 6, null) + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return createImageInjectionResponse(strSubstring);
        } catch (RuntimeException e10) {
            ApsAdExtensionsKt.logEvent(this, APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute shouldInterceptRequest method", e10);
            return null;
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(@Nullable WebView view, @Nullable String url) {
        if (url != null) {
            try {
                if (this.webviewClientListener.isTwoPartExpand()) {
                    return false;
                }
                return this.schemeHandler.openUrl(url);
            } catch (RuntimeException e10) {
                ApsAdExtensionsKt.logEvent(this, APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute shouldOverrideUrlLoading method", e10);
            }
        }
        return false;
    }
}
