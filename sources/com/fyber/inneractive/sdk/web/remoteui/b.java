package com.fyber.inneractive.sdk.web.remoteui;

import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.m;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends m implements a, com.fyber.inneractive.sdk.player.ui.remote.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f24038h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.ui.remote.a f24039i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f24040j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c f24041k;

    public b() {
        c cVar = new c(this, this);
        this.f24041k = cVar;
        setWebViewClient(cVar);
        getSettings().setJavaScriptEnabled(true);
        setHorizontalScrollBarEnabled(false);
        setHorizontalScrollbarOverlay(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollbarOverlay(false);
        getSettings().setSupportZoom(false);
        setBackgroundColor(0);
    }

    @Override // com.fyber.inneractive.sdk.web.remoteui.a
    public final void a(com.fyber.inneractive.sdk.network.events.b bVar, String str, boolean z10, HashMap map) {
        this.f24040j = false;
        a aVar = this.f24038h;
        if (aVar != null) {
            aVar.a(bVar, str, z10, map);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.m, android.webkit.WebView
    public final void destroy() {
        this.f24038h = null;
        this.f24039i = null;
        c cVar = this.f24041k;
        cVar.getClass();
        IAlog.a("%s: destroy()", "RemoteUiWebViewClient");
        cVar.f24043b = null;
        cVar.f24042a = null;
        super.destroy();
    }

    public void setCommandHandler(com.fyber.inneractive.sdk.player.ui.remote.a aVar) {
        this.f24039i = aVar;
    }

    public void setResultFailureListener(a aVar) {
        this.f24038h = aVar;
    }

    public void setUiReady(boolean z10) {
        this.f24040j = z10;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.remote.a
    public final void a(String str, HashMap map) {
        com.fyber.inneractive.sdk.player.ui.remote.a aVar = this.f24039i;
        if (aVar != null) {
            aVar.a(str, map);
        }
    }
}
