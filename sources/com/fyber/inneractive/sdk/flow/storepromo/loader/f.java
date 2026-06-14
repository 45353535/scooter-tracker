package com.fyber.inneractive.sdk.flow.storepromo.loader;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler.a, com.fyber.inneractive.sdk.flow.storepromo.controller.webview.bridge.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.storepromo.controller.webview.a f20909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.storepromo.model.c f20910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.storepromo.controller.webview.b f20911c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f20913e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler.b f20912d = new com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler.b(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i f20914f = new i();

    public f(com.fyber.inneractive.sdk.flow.storepromo.model.c cVar, a aVar) {
        this.f20913e = aVar;
        this.f20911c = new com.fyber.inneractive.sdk.flow.storepromo.controller.webview.b(this, this.f20913e);
        try {
            this.f20909a = new com.fyber.inneractive.sdk.flow.storepromo.controller.webview.a(this.f20911c);
        } catch (Throwable th2) {
            IAlog.a("failed to create a promo webview", new Object[0]);
            this.f20913e.a(com.fyber.inneractive.sdk.network.events.b.NO_WEBVIEW_INSTALLED, th2.getLocalizedMessage(), null);
        }
        this.f20910b = cVar;
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.controller.webview.bridge.a
    public final void a(int i10, g1 g1Var) {
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.controller.webview.bridge.a
    public final void b() {
        com.fyber.inneractive.sdk.flow.storepromo.controller.webview.a aVar = this.f20909a;
        if (aVar != null) {
            aVar.a("DTStorePromoBridge.nativeCallComplete()");
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.controller.webview.bridge.a
    public final void a() {
        com.fyber.inneractive.sdk.flow.storepromo.model.c cVar;
        a aVar;
        com.fyber.inneractive.sdk.flow.storepromo.controller.webview.a aVar2 = this.f20909a;
        if (aVar2 == null || (cVar = this.f20910b) == null || (aVar = this.f20913e) == null) {
            return;
        }
        aVar.a(aVar2, cVar);
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.controller.webview.bridge.a
    public final void a(HashMap map) {
        String str = (String) map.get("error");
        if (TextUtils.isEmpty(str)) {
            str = "Unknown error occurred on Store Promo side";
        }
        a aVar = this.f20913e;
        if (aVar != null) {
            aVar.a(com.fyber.inneractive.sdk.network.events.b.TEMPLATE_ERROR, str, null);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler.a
    public final void a(String str, HashMap map) {
        com.fyber.inneractive.sdk.flow.storepromo.controller.webview.a aVar = this.f20909a;
        if (aVar == null) {
            IAlog.b("StorePromoContentLoader: onCommandReceived: command: %s the webview is null", str);
            return;
        }
        com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler.b bVar = this.f20912d;
        if (bVar != null) {
            bVar.a(str, map, aVar.getLastClickedLocation());
        }
    }
}
