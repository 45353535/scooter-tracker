package com.google.android.gms.internal.consent_sdk;

import android.util.Log;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.RequiresApi;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzbv extends WebViewClient {
    final /* synthetic */ zzbx zza;

    /* synthetic */ zzbv(zzbx zzbxVar, zzbw zzbwVar) {
        Objects.requireNonNull(zzbxVar);
        this.zza = zzbxVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        zzbx zzbxVar = this.zza;
        if (zzbx.zzf(zzbxVar, str)) {
            zzbxVar.zzb.zze(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        zzbx zzbxVar = this.zza;
        if (zzbxVar.zzc) {
            return;
        }
        Log.d("UserMessagingPlatform", "Wall html loaded.");
        zzbxVar.zzc = true;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        this.zza.zzb.zzf(i10, str, str2);
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (webView == null) {
            return true;
        }
        String str = true != renderProcessGoneDetail.didCrash() ? "was stopped by system" : "crashed";
        Log.w("UserMessagingPlatform", "WebView render process " + str + ". Renderer priority at exit: " + renderProcessGoneDetail.rendererPriorityAtExit());
        ViewGroup viewGroup = (ViewGroup) webView.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(webView);
        }
        webView.destroy();
        return true;
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(24)
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        String string = webResourceRequest.getUrl().toString();
        zzbx zzbxVar = this.zza;
        if (!zzbx.zzf(zzbxVar, string)) {
            return false;
        }
        zzbxVar.zzb.zze(string);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        zzbx zzbxVar = this.zza;
        if (!zzbx.zzf(zzbxVar, str)) {
            return false;
        }
        zzbxVar.zzb.zze(str);
        return true;
    }
}
