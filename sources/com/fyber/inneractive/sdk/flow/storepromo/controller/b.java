package com.fyber.inneractive.sdk.flow.storepromo.controller;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.endcard.k;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.response.e;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements com.fyber.inneractive.sdk.flow.storepromo.loader.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InneractiveAdRequest f20883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f20884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f20885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.storepromo.ui.c f20886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.storepromo.loader.b f20887e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.storepromo.b f20888f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f20889g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a f20890h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public k f20891i;

    public b(com.fyber.inneractive.sdk.flow.storepromo.model.c cVar, com.fyber.inneractive.sdk.flow.storepromo.b bVar, com.fyber.inneractive.sdk.flow.storepromo.loader.b bVar2, com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a aVar, e eVar, InneractiveAdRequest inneractiveAdRequest) {
        this.f20890h = aVar;
        this.f20885c = new c(cVar, this, this);
        this.f20888f = bVar;
        this.f20883a = inneractiveAdRequest;
        this.f20884b = eVar;
        this.f20887e = bVar2;
    }

    public final void a() {
        com.fyber.inneractive.sdk.flow.storepromo.ui.c cVar = this.f20886d;
        if (cVar != null) {
            if (cVar.f20974b != null && cVar.f20973a != null) {
                cVar.f20976d.setAnimationListener(cVar.f20981i);
                cVar.f20973a.setAnimation(cVar.f20976d);
                cVar.f20973a.setVisibility(8);
            }
            k kVar = this.f20891i;
            if (kVar == null || kVar.f20665b.a() == null || kVar.f20665b.a().f().b() == null) {
                return;
            }
            IAlog.a("%sonStorePromoDismissed restoring endcard focus", IAlog.a(kVar));
            kVar.f20665b.a().f().b().requestFocus();
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.loader.a
    public final void a(com.fyber.inneractive.sdk.flow.storepromo.controller.webview.a aVar, com.fyber.inneractive.sdk.flow.storepromo.model.c cVar) {
        this.f20886d = new com.fyber.inneractive.sdk.flow.storepromo.ui.c(IAConfigManager.O.f20316v.a(), aVar, this.f20888f);
        u uVar = u.VAST_EVENT_SP_LOADED;
        InneractiveAdRequest inneractiveAdRequest = this.f20883a;
        e eVar = this.f20884b;
        String str = cVar.f20964h;
        w wVar = new w(uVar, inneractiveAdRequest, eVar);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("templateURL", str);
        } catch (Exception unused) {
            IAlog.f("Got exception adding param to json object: %s, %s", "templateURL", str);
        }
        wVar.f21421f.put(jSONObject);
        wVar.a((String) null);
        IAlog.a("StorePromoController: onContentLoadedSuccess", new Object[0]);
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a
    public final void a(com.fyber.inneractive.sdk.network.events.b bVar, String str, String str2) {
        this.f20889g = true;
        a();
        com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a aVar = this.f20890h;
        if (aVar != null) {
            aVar.a(bVar, str, str2);
        }
    }
}
