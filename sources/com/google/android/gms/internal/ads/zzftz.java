package com.google.android.gms.internal.ads;

import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzftz extends WebViewClient {
    final /* synthetic */ zzfub zza;

    zzftz(zzfub zzfubVar) {
        Objects.requireNonNull(zzfubVar);
        this.zza = zzfubVar;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        String string = renderProcessGoneDetail.toString();
        String strValueOf = String.valueOf(webView);
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 36 + strValueOf.length());
        sb2.append("WebView renderer gone: ");
        sb2.append(string);
        sb2.append("for WebView: ");
        sb2.append(strValueOf);
        Log.w("NativeBridge", sb2.toString());
        zzfub zzfubVar = this.zza;
        if (zzfubVar.zzd() == webView) {
            Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
            zzfubVar.zzc(null);
        }
        webView.destroy();
        return true;
    }
}
