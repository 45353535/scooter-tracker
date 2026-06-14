package com.applovin.impl.sdk;

import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f10602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f10603b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f10605d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f10606e = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f10604c = new Object();

    e(k kVar) {
        this.f10602a = kVar;
        this.f10603b = kVar.O();
        for (com.applovin.impl.u uVar : com.applovin.impl.u.a()) {
            this.f10605d.put(uVar, new q());
            this.f10606e.put(uVar, new q());
        }
    }

    private q c(com.applovin.impl.u uVar) {
        synchronized (this.f10604c) {
            try {
                q qVarB = b(uVar);
                if (qVarB.b() > 0) {
                    return qVarB;
                }
                return d(uVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private q d(com.applovin.impl.u uVar) {
        q qVar;
        synchronized (this.f10604c) {
            try {
                qVar = (q) this.f10605d.get(uVar);
                if (qVar == null) {
                    qVar = new q();
                    this.f10605d.put(uVar, qVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return qVar;
    }

    void a(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f10604c) {
            try {
                d(appLovinAdImpl.getAdZone()).a(appLovinAdImpl);
                if (o.a()) {
                    this.f10603b.a("AdPreloadManager", "Ad enqueued: " + appLovinAdImpl);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f10604c) {
            c(appLovinAdImpl.getAdZone()).b(appLovinAdImpl);
        }
    }

    public AppLovinAdImpl e(com.applovin.impl.u uVar) {
        com.applovin.impl.sdk.ad.c cVar;
        synchronized (this.f10604c) {
            try {
                q qVarD = d(uVar);
                if (qVarD.b() > 0) {
                    b(uVar).a(qVarD.a());
                    cVar = new com.applovin.impl.sdk.ad.c(uVar, this.f10602a);
                } else {
                    cVar = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (cVar != null) {
            if (o.a()) {
                this.f10603b.a("AdPreloadManager", "Retrieved ad of zone " + uVar + APSSharedUtil.TRUNCATE_SEPARATOR);
                return cVar;
            }
        } else if (o.a()) {
            this.f10603b.a("AdPreloadManager", "Unable to retrieve ad of zone " + uVar + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        return cVar;
    }

    public AppLovinAdBase f(com.applovin.impl.u uVar) {
        AppLovinAdImpl appLovinAdImplD;
        synchronized (this.f10604c) {
            appLovinAdImplD = c(uVar).d();
        }
        return appLovinAdImplD;
    }

    private q b(com.applovin.impl.u uVar) {
        q qVar;
        synchronized (this.f10604c) {
            try {
                qVar = (q) this.f10606e.get(uVar);
                if (qVar == null) {
                    qVar = new q();
                    this.f10606e.put(uVar, qVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return qVar;
    }

    public AppLovinAdImpl a(com.applovin.impl.u uVar) {
        AppLovinAdImpl appLovinAdImplA;
        synchronized (this.f10604c) {
            appLovinAdImplA = c(uVar).a();
        }
        return appLovinAdImplA;
    }
}
