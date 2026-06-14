package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.ironsource.U2;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes11.dex */
public final class rk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lb f65227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedList f65228b = new LinkedList();

    public rk(Context context, lb lbVar) {
        this.f65227a = lbVar;
    }

    public final void a(WebView webView) {
        webView.stopLoading();
        webView.loadUrl(AndroidWebViewClient.BLANK_PAGE);
        if (this.f65228b.size() < 3) {
            this.f65228b.add(new WeakReference(webView));
        } else {
            webView.destroy();
        }
    }

    public final void a(String str, ti tiVar) {
        Throwable th2;
        ti tiVar2;
        AtomicBoolean atomicBoolean;
        Handler handler;
        AtomicLong atomicLong;
        int i10;
        if ("true".equals(vi.a(str, "@doNotRender@", "@doNotRender@"))) {
            tiVar.a();
            return;
        }
        WebView webViewC = null;
        while (webViewC == null) {
            try {
                if (this.f65228b.size() <= 0) {
                    break;
                }
                WeakReference weakReference = (WeakReference) this.f65228b.poll();
                if (weakReference != null) {
                    webViewC = (WebView) weakReference.get();
                }
            } catch (Throwable th3) {
                th2 = th3;
                tiVar2 = tiVar;
                g9.a(th2);
                tiVar2.a("WebView instantiation Error");
            }
        }
        if (webViewC == null) {
            webViewC = ((tk) this.f65227a.a()).c();
        }
        WebView webView = webViewC;
        try {
            atomicBoolean = new AtomicBoolean();
            handler = new Handler(Looper.getMainLooper());
            atomicLong = new AtomicLong();
            int i11 = 0;
            if (i0.f64666f.booleanValue()) {
                webView.getSettings().setBlockNetworkImage(false);
                webView.getSettings().setLoadsImagesAutomatically(true);
                webView.getSettings().setJavaScriptEnabled(true);
                i11 = 25000;
            }
            i10 = i11;
            webView.setWebChromeClient(new WebChromeClient());
            try {
                tiVar2 = tiVar;
            } catch (Throwable th4) {
                th = th4;
                tiVar2 = tiVar;
            }
        } catch (Throwable th5) {
            th = th5;
            tiVar2 = tiVar;
        }
        try {
            webView.setWebViewClient(new ok(this, handler, atomicBoolean, webView, tiVar, atomicLong, i10));
            atomicLong.set(vi.b());
            if (!vi.a(webView, str)) {
                handler.removeCallbacksAndMessages(null);
                handler.post(new pk(this, atomicBoolean, webView, tiVar2));
            } else {
                handler.postDelayed(new qk(this, atomicBoolean, webView, tiVar2, atomicLong), U2.f41836h);
            }
        } catch (Throwable th6) {
            th = th6;
            th2 = th;
            g9.a(th2);
            tiVar2.a("WebView instantiation Error");
        }
    }
}
