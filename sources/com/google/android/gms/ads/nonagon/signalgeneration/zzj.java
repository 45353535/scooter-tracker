package com.google.android.gms.ads.nonagon.signalgeneration;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.UiThread;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbjj;
import com.google.android.gms.internal.ads.zzbpd;
import com.google.android.gms.internal.ads.zzgzy;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes7.dex */
public final class zzj extends zzbpd {
    private final WebView zza;
    private final zzf zzb;
    private final Executor zzc;

    @Nullable
    private WebViewClient zzd;

    public zzj(WebView webView, zzf zzfVar, @UiThread zzgzy zzgzyVar) {
        this.zza = webView;
        this.zzb = zzfVar;
        this.zzc = zzgzyVar;
    }

    private final void zzc() {
        this.zza.evaluateJavascript(String.format(Locale.getDefault(), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlk), this.zzb.zzb()), null);
    }

    private final boolean zzd() {
        if (!((Boolean) zzbjj.zza.zze()).booleanValue()) {
            return false;
        }
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        if (allStackTraces == null || !allStackTraces.containsKey(Thread.currentThread())) {
            return true;
        }
        boolean z10 = false;
        boolean z11 = false;
        for (StackTraceElement stackTraceElement : allStackTraces.get(Thread.currentThread())) {
            if (stackTraceElement.getClassName().contains(zzj.class.getName())) {
                if (z10 && z11) {
                    return true;
                }
                z10 = true;
            } else if (z10) {
                z11 = true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd, android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z10) {
        if (zzd()) {
            return;
        }
        super.doUpdateVisitedHistory(webView, str, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    @Nullable
    protected final WebViewClient getDelegate() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd, android.webkit.WebViewClient
    public final void onFormResubmission(WebView webView, Message message, Message message2) {
        if (zzd()) {
            return;
        }
        super.onFormResubmission(webView, message, message2);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd, android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        if (zzd()) {
            return;
        }
        super.onLoadResource(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd, android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        if (zzd()) {
            return;
        }
        super.onPageCommitVisible(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        if (zzd()) {
            return;
        }
        zzc();
        super.onPageFinished(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd, android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (zzd()) {
            return;
        }
        zzc();
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd, android.webkit.WebViewClient
    public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        if (zzd()) {
            return;
        }
        super.onReceivedClientCertRequest(webView, clientCertRequest);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd, android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        if (zzd()) {
            return;
        }
        super.onReceivedError(webView, i10, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd, android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        if (zzd()) {
            return;
        }
        super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd, android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (zzd()) {
            return;
        }
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd, android.webkit.WebViewClient
    public final void onReceivedLoginRequest(WebView webView, String str, @Nullable String str2, String str3) {
        if (zzd()) {
            return;
        }
        super.onReceivedLoginRequest(webView, str, str2, str3);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd, android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (zzd()) {
            return;
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd, android.webkit.WebViewClient
    @RequiresApi(api = 26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (zzd()) {
            return false;
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd, android.webkit.WebViewClient
    @RequiresApi(api = 27)
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i10, SafeBrowsingResponse safeBrowsingResponse) {
        if (zzd()) {
            return;
        }
        super.onSafeBrowsingHit(webView, webResourceRequest, i10, safeBrowsingResponse);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd, android.webkit.WebViewClient
    public final void onScaleChanged(WebView webView, float f10, float f11) {
        if (zzd()) {
            return;
        }
        super.onScaleChanged(webView, f10, f11);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd, android.webkit.WebViewClient
    public final void onTooManyRedirects(WebView webView, Message message, Message message2) {
        if (zzd()) {
            return;
        }
        super.onTooManyRedirects(webView, message, message2);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd, android.webkit.WebViewClient
    public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        if (zzd()) {
            return;
        }
        super.onUnhandledKeyEvent(webView, keyEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd, android.webkit.WebViewClient
    @Nullable
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (zzd()) {
            return null;
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd, android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        if (zzd()) {
            return false;
        }
        return super.shouldOverrideKeyEvent(webView, keyEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd, android.webkit.WebViewClient
    @RequiresApi(api = 24)
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (zzd()) {
            return false;
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    public final void zza() {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzh
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzb();
            }
        });
    }

    final /* synthetic */ void zzb() {
        WebViewClient webViewClient;
        try {
            com.google.android.gms.ads.internal.zzt.zzc();
            WebView webView = this.zza;
            if (Build.VERSION.SDK_INT < 26) {
                if (WebViewFeature.isFeatureSupported(WebViewFeature.GET_WEB_VIEW_CLIENT)) {
                    try {
                        webViewClient = WebViewCompat.getWebViewClient(webView);
                    } catch (RuntimeException e10) {
                        com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "AdUtil.getWebViewClient");
                    }
                }
                throw new IllegalStateException("getWebViewClient not supported");
            }
            webViewClient = webView.getWebViewClient();
            if (webViewClient == this) {
                return;
            }
            if (webViewClient != null) {
                this.zzd = webViewClient;
            }
            this.zza.setWebViewClient(this);
            zzc();
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpd, android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (zzd()) {
            return;
        }
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd, android.webkit.WebViewClient
    @Nullable
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (zzd()) {
            return null;
        }
        return super.shouldInterceptRequest(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (zzd()) {
            return false;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
