package com.fyber.inneractive.sdk.flow.storepromo.controller;

import com.fyber.inneractive.sdk.flow.storepromo.loader.f;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements com.fyber.inneractive.sdk.flow.storepromo.loader.a, com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler.a, com.fyber.inneractive.sdk.flow.storepromo.controller.webview.bridge.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.flow.storepromo.controller.webview.b f20892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.storepromo.controller.webview.a f20893b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f f20895d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.storepromo.loader.a f20897f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f20898g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f20896e = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler.b f20894c = new com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler.b(this);

    public c(com.fyber.inneractive.sdk.flow.storepromo.model.c cVar, com.fyber.inneractive.sdk.flow.storepromo.loader.a aVar, b bVar) {
        this.f20897f = aVar;
        this.f20898g = bVar;
        this.f20892a = new com.fyber.inneractive.sdk.flow.storepromo.controller.webview.b(this, aVar);
        this.f20895d = new f(cVar, this);
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.controller.webview.bridge.a
    public final void a() {
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.controller.webview.bridge.a
    public final void b() {
        com.fyber.inneractive.sdk.flow.storepromo.controller.webview.a aVar = this.f20893b;
        if (aVar != null) {
            aVar.a("DTStorePromoBridge.nativeCallComplete()");
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.controller.webview.bridge.a
    public final void a(HashMap map) {
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler.a
    public final void a(String str, HashMap map) {
        com.fyber.inneractive.sdk.flow.storepromo.controller.webview.a aVar = this.f20893b;
        if (aVar == null) {
            IAlog.b("StorePromoWebViewController: onCommandReceived: command: %s the webview is null", str);
            return;
        }
        g1 lastClickedLocation = aVar.getLastClickedLocation();
        com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler.b bVar = this.f20894c;
        if (bVar != null) {
            bVar.a(str, map, lastClickedLocation);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.controller.webview.bridge.a
    public final void a(int i10, g1 g1Var) {
        if (i10 != 0) {
            b bVar = this.f20898g;
            if (bVar != null) {
                a aVar = a.INSTALL;
                IAlog.a("StorePromoView: onClick: type: " + aVar, new Object[0]);
                if (aVar == a.CLOSE) {
                    bVar.a();
                    return;
                }
                com.fyber.inneractive.sdk.flow.storepromo.loader.b bVar2 = bVar.f20887e;
                if (bVar2 != null) {
                    bVar2.a(g1Var);
                    return;
                }
                return;
            }
            return;
        }
        b bVar3 = this.f20898g;
        if (bVar3 != null) {
            IAlog.a("StorePromoView: onClick: type: " + a.CLOSE, new Object[0]);
            bVar3.a();
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.loader.a
    public final void a(com.fyber.inneractive.sdk.flow.storepromo.controller.webview.a aVar, com.fyber.inneractive.sdk.flow.storepromo.model.c cVar) {
        IAlog.a("StorePromoWebViewController: onContentLoadedSuccess: content is loaded successfully", new Object[0]);
        this.f20896e = true;
        this.f20893b = aVar;
        aVar.setWebViewClient(this.f20892a);
        com.fyber.inneractive.sdk.flow.storepromo.loader.a aVar2 = this.f20897f;
        if (aVar2 != null) {
            aVar2.a(this.f20893b, cVar);
            this.f20897f = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a
    public final void a(com.fyber.inneractive.sdk.network.events.b bVar, String str, String str2) {
        this.f20896e = false;
        com.fyber.inneractive.sdk.flow.storepromo.loader.a aVar = this.f20897f;
        if (aVar != null) {
            aVar.a(bVar, str, str2);
            this.f20897f = null;
        }
    }
}
