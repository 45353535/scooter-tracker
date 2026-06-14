package com.fyber.inneractive.sdk.flow.storepromo.controller.webview;

import com.fyber.inneractive.sdk.web.m;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f20899h;

    public a(b bVar) {
        this.f20899h = bVar;
        setWebViewClient(bVar);
        getSettings().setJavaScriptEnabled(true);
        setHorizontalScrollBarEnabled(false);
        setHorizontalScrollbarOverlay(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollbarOverlay(false);
        getSettings().setSupportZoom(false);
        setOverScrollMode(2);
    }

    @Override // com.fyber.inneractive.sdk.web.m, android.webkit.WebView
    public final void destroy() {
        b bVar = this.f20899h;
        bVar.f20901a = null;
        bVar.f20902b = null;
        super.destroy();
    }
}
