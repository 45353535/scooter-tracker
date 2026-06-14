package com.fyber.inneractive.sdk.flow.storepromo;

import android.text.TextUtils;
import android.view.View;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.storepromo.loader.f;
import com.fyber.inneractive.sdk.flow.storepromo.loader.g;
import com.fyber.inneractive.sdk.flow.storepromo.ui.c;
import com.fyber.inneractive.sdk.model.vast.v;
import com.fyber.inneractive.sdk.network.t;
import com.fyber.inneractive.sdk.response.e;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.util.o;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements com.fyber.inneractive.sdk.flow.storepromo.loader.b, com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f20872k = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f20873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f20874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InneractiveAdRequest f20875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.storepromo.controller.b f20876d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.storepromo.loader.b f20877e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f20878f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f20879g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CopyOnWriteArrayList f20880h = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f20881i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f20882j = new a();

    public b(v vVar, e eVar, InneractiveAdRequest inneractiveAdRequest) {
        this.f20873a = new g(vVar, this);
        this.f20878f = vVar.f21237c;
        this.f20874b = eVar;
        this.f20875c = inneractiveAdRequest;
    }

    public final void a() {
        com.fyber.inneractive.sdk.flow.storepromo.controller.b bVar = this.f20876d;
        if (bVar != null) {
            c cVar = bVar.f20886d;
            if (cVar != null) {
                if (cVar.f20974b != null && cVar.f20973a != null) {
                    cVar.f20976d.setAnimationListener(cVar.f20981i);
                    cVar.f20973a.setAnimation(cVar.f20976d);
                    cVar.f20973a.setVisibility(8);
                }
                if (cVar.f20974b != null) {
                    cVar.f20973a = null;
                    cVar.f20974b = null;
                }
                com.fyber.inneractive.sdk.flow.storepromo.ui.b bVar2 = cVar.f20977e;
                if (bVar2 != null) {
                    try {
                        o.f23888a.unregisterReceiver(bVar2);
                    } catch (Exception unused) {
                    }
                    cVar.f20977e = null;
                }
                cVar.f20978f = null;
                bVar.f20886d = null;
            }
            com.fyber.inneractive.sdk.flow.storepromo.controller.c cVar2 = bVar.f20885c;
            if (cVar2 != null) {
                f fVar = cVar2.f20895d;
                if (fVar != null) {
                    com.fyber.inneractive.sdk.flow.storepromo.controller.webview.a aVar = fVar.f20909a;
                    if (aVar != null) {
                        aVar.destroy();
                        fVar.f20909a = null;
                    }
                    fVar.f20913e = null;
                    fVar.f20912d = null;
                    fVar.f20911c = null;
                    fVar.f20914f = null;
                    fVar.f20910b = null;
                }
                com.fyber.inneractive.sdk.flow.storepromo.controller.webview.a aVar2 = cVar2.f20893b;
                if (aVar2 != null) {
                    aVar2.destroy();
                    cVar2.f20893b = null;
                }
                cVar2.f20897f = null;
                cVar2.f20898g = null;
                cVar2.f20894c = null;
                cVar2.f20895d = null;
                bVar.f20885c = null;
            }
            bVar.f20891i = null;
            bVar.f20887e = null;
            bVar.f20888f = null;
            bVar.f20890h = null;
            this.f20876d = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.loader.b
    public final void a(g1 g1Var) {
        c cVar;
        View view;
        this.f20881i = true;
        com.fyber.inneractive.sdk.flow.storepromo.loader.b bVar = this.f20877e;
        if (bVar != null) {
            bVar.a(g1Var);
        }
        com.fyber.inneractive.sdk.flow.storepromo.controller.b bVar2 = this.f20876d;
        com.fyber.inneractive.sdk.flow.storepromo.observer.b bVar3 = new com.fyber.inneractive.sdk.flow.storepromo.observer.b((bVar2 == null || (cVar = bVar2.f20886d) == null || cVar.f20974b == null || (view = cVar.f20973a) == null || view.getParent() == null || cVar.f20974b.getVisibility() != 0) ? false : true, this.f20881i);
        Iterator it = this.f20880h.iterator();
        while (it.hasNext()) {
            ((com.fyber.inneractive.sdk.flow.storepromo.observer.a) it.next()).a(bVar3);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a
    public final void a(com.fyber.inneractive.sdk.network.events.b bVar, String str, String str2) {
        a(bVar.name(), str, str2);
    }

    public final void a(String str, String str2, String str3) {
        IAlog.b("StorePromoManager: reportStorePromoError: %s, msg: %s", str, str2);
        if (this.f20882j != null) {
            InneractiveAdRequest inneractiveAdRequest = this.f20875c;
            e eVar = this.f20874b;
            HashMap map = new HashMap(1);
            if (!TextUtils.isEmpty(str2)) {
                map.put("error", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                map.put("failedURL", str3);
            }
            com.fyber.inneractive.sdk.network.events.a.a(t.ERROR_STORE_PROMO_FAILURE, str, (String) null, inneractiveAdRequest, eVar, map, (Boolean) null);
            this.f20882j = null;
        }
    }
}
