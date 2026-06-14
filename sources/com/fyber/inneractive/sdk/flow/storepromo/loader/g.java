package com.fyber.inneractive.sdk.flow.storepromo.loader;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.model.vast.v;
import com.fyber.inneractive.sdk.network.l0;
import com.fyber.inneractive.sdk.network.t0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f20915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CountDownLatch f20916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.flow.storepromo.b f20917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.flow.storepromo.model.c f20918d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f20920f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f20919e = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f20921g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f20922h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f20923i = false;

    public g(v vVar, com.fyber.inneractive.sdk.flow.storepromo.b bVar) {
        this.f20915a = vVar;
        this.f20920f = vVar.f21240f.size();
        this.f20917c = bVar;
        this.f20918d = new com.fyber.inneractive.sdk.flow.storepromo.model.c(vVar);
    }

    public final void a(com.fyber.inneractive.sdk.flow.storepromo.events.a aVar, boolean z10, String str, String str2) {
        f fVar;
        this.f20916b.countDown();
        if (this.f20923i) {
            return;
        }
        if (z10) {
            this.f20923i = true;
            this.f20922h = true;
            a();
            if (TextUtils.isEmpty(str)) {
                str = "Something went wrong during promo's resources download";
            }
            com.fyber.inneractive.sdk.flow.storepromo.b bVar = this.f20917c;
            if (bVar != null) {
                if (aVar == null) {
                    aVar = com.fyber.inneractive.sdk.flow.storepromo.events.a.DOWNLOAD_RESOURCE_ERROR;
                }
                bVar.a(aVar.name(), str, str2);
                return;
            }
            return;
        }
        if (this.f20916b.getCount() != 0 || this.f20922h) {
            return;
        }
        this.f20923i = true;
        Collections.sort(this.f20918d.f20957a);
        this.f20919e.clear();
        com.fyber.inneractive.sdk.flow.storepromo.b bVar2 = this.f20917c;
        if (bVar2 != null) {
            com.fyber.inneractive.sdk.flow.storepromo.model.c cVar = this.f20918d;
            IAlog.a("StorePromoManager : onPromoLoadSucceed", new Object[0]);
            com.fyber.inneractive.sdk.flow.storepromo.controller.b bVar3 = new com.fyber.inneractive.sdk.flow.storepromo.controller.b(cVar, bVar2, bVar2, bVar2, bVar2.f20874b, bVar2.f20875c);
            bVar2.f20876d = bVar3;
            bVar2.f20879g = cVar.f20965i;
            com.fyber.inneractive.sdk.flow.storepromo.controller.c cVar2 = bVar3.f20885c;
            if (cVar2 == null || (fVar = cVar2.f20895d) == null) {
                return;
            }
            r.f23895a.execute(new e(fVar, new d(fVar)));
        }
    }

    public final void a() {
        for (t0 t0Var : this.f20919e) {
            l0 l0Var = IAConfigManager.O.f20313s;
            String str = t0Var.f21380g;
            l0Var.getClass();
            t0Var.c();
        }
        this.f20919e.clear();
    }
}
