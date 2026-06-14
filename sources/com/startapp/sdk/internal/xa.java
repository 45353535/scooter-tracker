package com.startapp.sdk.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MraidMetadata;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes11.dex */
public class xa extends sk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ za f65539a;

    public xa(za zaVar) {
        this.f65539a = zaVar;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        if (webView == null || str == null) {
            return;
        }
        webView.getContext();
        WeakHashMap weakHashMap = vi.f65408a;
        Log.println(2, "StartAppSDK", "Interstitial received callback onPageFinished()");
        if (this.f65539a.f65685z == null) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            za zaVar = this.f65539a;
            long jMax = Math.max(0L, zaVar.m() - (jUptimeMillis - zaVar.f65684y));
            MraidMetadata mraidMetadataK = MetaData.E().K();
            y0 y0Var = this.f65539a.G;
            y0Var.getClass();
            boolean z10 = (y0Var instanceof xc) && mraidMetadataK != null && vi.a(mraidMetadataK.a());
            za zaVar2 = this.f65539a;
            za zaVar3 = this.f65539a;
            zaVar2.f65685z = new ag(zaVar3.f65429a, zaVar3.f65441m, zaVar3.f65436h, zaVar3.n(), jMax, z10, this.f65539a.M);
            this.f65539a.p();
        }
        this.f65539a.G.a(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (!cd.a(str)) {
            return super.shouldInterceptRequest(webView, str);
        }
        za zaVar = this.f65539a;
        y0 y0Var = zaVar.G;
        y0Var.getClass();
        if (!(y0Var instanceof xc)) {
            xc xcVar = new xc(zaVar);
            zaVar.G = xcVar;
            if (zaVar.H) {
                xcVar.g();
            }
            if (zaVar.I) {
                zaVar.G.f();
            }
        }
        za zaVar2 = this.f65539a;
        zaVar2.getClass();
        new Handler(Looper.getMainLooper()).post(new ua(zaVar2));
        return ((cd) com.startapp.sdk.components.a.a(webView.getContext()).T.a()).b();
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (webView == null || str == null) {
            return true;
        }
        return this.f65539a.G.b(webView, str);
    }
}
