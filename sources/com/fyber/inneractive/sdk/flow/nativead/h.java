package com.fyber.inneractive.sdk.flow.nativead;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.network.u0;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements c, s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CountDownLatch f20791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f20792b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f20794d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f20793c = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f20795e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f20796f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f20797g = b.UNINITIALIZED;

    public h(ArrayList arrayList, e eVar) {
        this.f20794d = arrayList;
        this.f20792b = eVar;
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.c
    public final boolean a() {
        return this.f20797g == b.LOADING;
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.c
    public final void b() {
        com.fyber.inneractive.sdk.response.nativead.c cVar;
        String str;
        if (this.f20794d.isEmpty()) {
            this.f20797g = b.FAILED;
            c();
            return;
        }
        Iterator it = this.f20794d.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.fyber.inneractive.sdk.response.nativead.f fVar = (com.fyber.inneractive.sdk.response.nativead.f) it.next();
            if (fVar == null || (cVar = fVar.f23758d) == null || (str = cVar.f23752a) == null || str.trim().isEmpty()) {
                IAlog.f("%sImage asset not downloadable. imageAssetId: %s, imageObject: %s", IAlog.a(this), Integer.valueOf(fVar.f23755a), fVar.f23758d);
                this.f20795e.add(fVar);
            } else {
                ArrayList arrayList = this.f20793c;
                if (arrayList != null) {
                    arrayList.add(new u0(new t(fVar, this), IAConfigManager.O.f20316v.f20407a, new com.fyber.inneractive.sdk.cache.d(fVar.f23758d.f23752a)));
                }
            }
        }
        ArrayList arrayList2 = this.f20793c;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            this.f20797g = b.FAILED;
            c();
            return;
        }
        this.f20797g = b.LOADING;
        this.f20791a = new CountDownLatch(this.f20793c.size());
        Iterator it2 = this.f20793c.iterator();
        while (it2.hasNext()) {
            IAConfigManager.O.f20313s.a((u0) it2.next());
        }
    }

    public final void c() {
        e eVar = this.f20792b;
        if (eVar != null) {
            ArrayList arrayList = this.f20796f;
            ArrayList<com.fyber.inneractive.sdk.response.nativead.f> arrayList2 = this.f20795e;
            if (!arrayList.isEmpty()) {
                eVar.f20774a.f20780d.addAll(arrayList);
            }
            if (!arrayList2.isEmpty()) {
                for (com.fyber.inneractive.sdk.response.nativead.f fVar : arrayList2) {
                    IAlog.f("%sFailed to load image asset. id: %s, imageObj: %s", f.f20775m, Integer.valueOf(fVar.f23755a), fVar.f23758d);
                }
            }
            eVar.f20774a.a();
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.c
    public final void destroy() {
        ArrayList arrayList = this.f20793c;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = this.f20793c.iterator();
            while (it.hasNext()) {
                ((u0) it.next()).f21374a = true;
            }
            this.f20793c.clear();
        }
        this.f20793c = null;
        this.f20797g = b.DESTROYED;
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.s
    public final void a(g gVar, Exception exc, com.fyber.inneractive.sdk.response.nativead.f fVar) {
        if (gVar != null) {
            this.f20796f.add(gVar);
        } else {
            this.f20795e.add(fVar);
        }
        CountDownLatch countDownLatch = this.f20791a;
        if (countDownLatch == null) {
            return;
        }
        countDownLatch.countDown();
        if (this.f20791a.getCount() == 0) {
            this.f20797g = b.LOADED;
            c();
        }
    }
}
