package com.android.volley;

import com.android.volley.b;
import com.android.volley.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes5.dex */
class w implements n.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q f7598b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f7600d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final BlockingQueue f7601e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f7597a = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o f7599c = null;

    w(c cVar, BlockingQueue blockingQueue, q qVar) {
        this.f7598b = qVar;
        this.f7600d = cVar;
        this.f7601e = blockingQueue;
    }

    @Override // com.android.volley.n.b
    public synchronized void a(n nVar) {
        BlockingQueue blockingQueue;
        try {
            String cacheKey = nVar.getCacheKey();
            List list = (List) this.f7597a.remove(cacheKey);
            if (list != null && !list.isEmpty()) {
                if (v.f7589b) {
                    v.e("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), cacheKey);
                }
                n nVar2 = (n) list.remove(0);
                this.f7597a.put(cacheKey, list);
                nVar2.setNetworkRequestCompleteListener(this);
                o oVar = this.f7599c;
                if (oVar != null) {
                    oVar.sendRequestOverNetwork(nVar2);
                } else if (this.f7600d != null && (blockingQueue = this.f7601e) != null) {
                    try {
                        blockingQueue.put(nVar2);
                    } catch (InterruptedException e10) {
                        v.c("Couldn't add request to queue. %s", e10.toString());
                        Thread.currentThread().interrupt();
                        this.f7600d.e();
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.android.volley.n.b
    public void b(n nVar, p pVar) {
        List list;
        b.a aVar = pVar.f7542b;
        if (aVar == null || aVar.a()) {
            a(nVar);
            return;
        }
        String cacheKey = nVar.getCacheKey();
        synchronized (this) {
            list = (List) this.f7597a.remove(cacheKey);
        }
        if (list != null) {
            if (v.f7589b) {
                v.e("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), cacheKey);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f7598b.a((n) it.next(), pVar);
            }
        }
    }

    synchronized boolean c(n nVar) {
        try {
            String cacheKey = nVar.getCacheKey();
            if (!this.f7597a.containsKey(cacheKey)) {
                this.f7597a.put(cacheKey, null);
                nVar.setNetworkRequestCompleteListener(this);
                if (v.f7589b) {
                    v.b("new request, sending to network %s", cacheKey);
                }
                return false;
            }
            List arrayList = (List) this.f7597a.get(cacheKey);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            nVar.addMarker("waiting-for-response");
            arrayList.add(nVar);
            this.f7597a.put(cacheKey, arrayList);
            if (v.f7589b) {
                v.b("Request for cacheKey=%s is in flight, putting on hold.", cacheKey);
            }
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
