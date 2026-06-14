package com.unity3d.ads.adplayer;

import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.RequiresApi;
import androidx.media3.common.MimeTypes;
import androidx.webkit.WebResourceErrorCompat;
import androidx.webkit.WebViewClientCompat;
import androidx.webkit.WebViewFeature;
import com.mbridge.msdk.MBridgeConstans;
import com.taurusx.tax.f.y;
import com.unity3d.ads.adplayer.model.ErrorReason;
import com.unity3d.ads.adplayer.model.WebViewClientError;
import com.unity3d.ads.core.domain.GetCachedAsset;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.IntExtensionKt;
import com.unity3d.ads.core.extensions.ViewExtensionsKt;
import eg.p;
import eg.r;
import hg.i;
import hg.l0;
import java.util.Collection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 52\u00020\u0001:\u00015B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0013\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0017\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0019\u001a\u0004\u0018\u00010\u00152\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R \u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R \u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R#\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#0*8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001d0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010&R\u001d\u00101\u001a\b\u0012\u0004\u0012\u00020\u001d008\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b1\u00103R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\n0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010&¨\u00066"}, d2 = {"Lcom/unity3d/ads/adplayer/AndroidWebViewClient;", "Landroidx/webkit/WebViewClientCompat;", "Lcom/unity3d/ads/core/domain/GetCachedAsset;", "getCachedAsset", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "<init>", "(Lcom/unity3d/ads/core/domain/GetCachedAsset;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "Landroid/webkit/WebView;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "", "url", "", "onPageFinished", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "Landroid/webkit/WebResourceRequest;", "request", "Landroidx/webkit/WebResourceErrorCompat;", "error", "onReceivedError", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroidx/webkit/WebResourceErrorCompat;)V", "Landroid/webkit/WebResourceResponse;", "errorResponse", "onReceivedHttpError", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceResponse;)V", "shouldInterceptRequest", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;", "Landroid/webkit/RenderProcessGoneDetail;", "detail", "", "onRenderProcessGone", "(Landroid/webkit/WebView;Landroid/webkit/RenderProcessGoneDetail;)Z", "Lcom/unity3d/ads/core/domain/GetCachedAsset;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/unity3d/ads/adplayer/model/WebViewClientError;", "loadErrors", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Leg/p;", "_onLoadFinished", "Leg/p;", "Lkotlinx/coroutines/Deferred;", "onLoadFinished", "Lkotlinx/coroutines/Deferred;", "getOnLoadFinished", "()Lkotlinx/coroutines/Deferred;", "_isRenderProcessGone", "Lkotlinx/coroutines/flow/StateFlow;", "isRenderProcessGone", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "webviewType", y.f66058y, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidWebViewClient extends WebViewClientCompat {

    @NotNull
    public static final String BLANK_PAGE = "about:blank";

    @NotNull
    private final MutableStateFlow _isRenderProcessGone;

    @NotNull
    private final p _onLoadFinished;

    @NotNull
    private final GetCachedAsset getCachedAsset;

    @NotNull
    private final StateFlow isRenderProcessGone;

    @NotNull
    private final MutableStateFlow loadErrors;

    @NotNull
    private final Deferred onLoadFinished;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    @NotNull
    private final MutableStateFlow webviewType;

    public AndroidWebViewClient(@NotNull GetCachedAsset getCachedAsset, @NotNull SendDiagnosticEvent sendDiagnosticEvent) {
        Intrinsics.checkNotNullParameter(getCachedAsset, "getCachedAsset");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.getCachedAsset = getCachedAsset;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.loadErrors = l0.a(CollectionsKt.emptyList());
        p pVarC = r.c(null, 1, null);
        this._onLoadFinished = pVarC;
        this.onLoadFinished = pVarC;
        MutableStateFlow mutableStateFlowA = l0.a(Boolean.FALSE);
        this._isRenderProcessGone = mutableStateFlowA;
        this.isRenderProcessGone = i.c(mutableStateFlowA);
        this.webviewType = l0.a("");
    }

    @NotNull
    public final Deferred getOnLoadFinished() {
        return this.onLoadFinished;
    }

    @NotNull
    /* JADX INFO: renamed from: isRenderProcessGone, reason: from getter */
    public final StateFlow getIsRenderProcessGone() {
        return this.isRenderProcessGone;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(@NotNull WebView view, @NotNull String url) {
        String str;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        if (Intrinsics.areEqual(url, BLANK_PAGE)) {
            MutableStateFlow mutableStateFlow = this.loadErrors;
            while (true) {
                Object value = mutableStateFlow.getValue();
                str = url;
                if (mutableStateFlow.b(value, CollectionsKt.plus((Collection<? extends WebViewClientError>) value, new WebViewClientError(str, ErrorReason.REASON_WEB_BLANK, null, 4, null)))) {
                    break;
                } else {
                    url = str;
                }
            }
        } else {
            str = url;
        }
        super.onPageFinished(view, str);
        this._onLoadFinished.s(this.loadErrors.getValue());
    }

    @Override // androidx.webkit.WebViewClientCompat
    @RequiresApi(21)
    public void onReceivedError(@NotNull WebView view, @NotNull WebResourceRequest request, @NotNull WebResourceErrorCompat error) {
        Object value;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(error, "error");
        super.onReceivedError(view, request, error);
        ErrorReason errorReasonWebResourceToErrorReason = WebViewFeature.isFeatureSupported(WebViewFeature.WEB_RESOURCE_ERROR_GET_CODE) ? IntExtensionKt.webResourceToErrorReason(error.getErrorCode()) : ErrorReason.REASON_UNKNOWN;
        MutableStateFlow mutableStateFlow = this.loadErrors;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.b(value, CollectionsKt.plus((Collection<? extends WebViewClientError>) value, new WebViewClientError(request.getUrl().toString(), errorReasonWebResourceToErrorReason, null, 4, null))));
    }

    @Override // androidx.webkit.WebViewClientCompat, android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public void onReceivedHttpError(@NotNull WebView view, @NotNull WebResourceRequest request, @NotNull WebResourceResponse errorResponse) {
        Object value;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(errorResponse, "errorResponse");
        super.onReceivedHttpError(view, request, errorResponse);
        WebViewClientError webViewClientError = new WebViewClientError(request.getUrl().toString(), ErrorReason.REASON_WEB_ERROR_RECEIVED_HTTP, Integer.valueOf(errorResponse.getStatusCode()));
        MutableStateFlow mutableStateFlow = this.loadErrors;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.b(value, CollectionsKt.plus((Collection<? extends WebViewClientError>) value, webViewClientError)));
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(@NotNull WebView view, @NotNull RenderProcessGoneDetail detail) {
        Object value;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(detail, "detail");
        ViewExtensionsKt.removeViewFromParent(view);
        view.destroy();
        if (this._onLoadFinished.n()) {
            this._isRenderProcessGone.setValue(Boolean.TRUE);
            return true;
        }
        MutableStateFlow mutableStateFlow = this.loadErrors;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.b(value, CollectionsKt.plus((Collection<? extends WebViewClientError>) value, new WebViewClientError(String.valueOf(view.getUrl()), ErrorReason.REASON_WEBVIEW_RENDER_PROCESS_GONE, null, 4, null))));
        this._onLoadFinished.s(this.loadErrors.getValue());
        return true;
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    public WebResourceResponse shouldInterceptRequest(@NotNull WebView view, @NotNull WebResourceRequest request) {
        Map mapEmptyMap;
        Object objB;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        Uri url = request.getUrl();
        if (url == null) {
            return super.shouldInterceptRequest(view, request);
        }
        try {
            try {
                Result.Companion companion = Result.f93230c;
                objB = Result.b(url.getQueryParameter("webviewType"));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.f93230c;
                objB = Result.b(d.a(th2));
            }
            if (Result.i(objB)) {
                objB = null;
            }
            String str = (String) objB;
            if (str != null && !StringsKt.y0(str)) {
                this.webviewType.setValue(str);
            }
            if (Intrinsics.areEqual(url.getLastPathSegment(), "favicon.ico")) {
                return new WebResourceResponse(MimeTypes.IMAGE_PNG, null, null);
            }
            GetCachedAsset getCachedAsset = this.getCachedAsset;
            Uri url2 = request.getUrl();
            Intrinsics.checkNotNullExpressionValue(url2, "request.url");
            return getCachedAsset.invoke(url2, (String) this.webviewType.getValue());
        } catch (Throwable th3) {
            String message = th3.getMessage();
            if (message == null || (mapEmptyMap = MapsKt.mapOf(TuplesKt.to("reason", message))) == null) {
                mapEmptyMap = MapsKt.emptyMap();
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "webview_could_not_handle_intercepted_url", null, mapEmptyMap, null, null, null, 58, null);
            return super.shouldInterceptRequest(view, request);
        }
    }
}
