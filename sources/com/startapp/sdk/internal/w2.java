package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class w2 implements AdEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f65423a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f65424b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x2 f65425c;

    public w2(x2 x2Var) {
        this.f65425c = x2Var;
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onFailedToReceiveAd(Ad ad2) {
        ConcurrentHashMap concurrentHashMap;
        List<StartAppAd> list;
        if (this.f65424b) {
            concurrentHashMap = null;
        } else {
            synchronized (this.f65425c.f65521v) {
                concurrentHashMap = new ConcurrentHashMap(this.f65425c.f65521v);
                x2 x2Var = this.f65425c;
                x2Var.f65514o = null;
                x2Var.f65521v.clear();
            }
        }
        this.f65424b = true;
        this.f65425c.f65520u.d();
        this.f65425c.f65519t.e();
        this.f65425c.f65515p.set(false);
        if (concurrentHashMap != null) {
            for (AdEventListener adEventListener : concurrentHashMap.keySet()) {
                if (adEventListener != null) {
                    this.f65425c.getClass();
                    try {
                        list = (List) concurrentHashMap.get(adEventListener);
                    } catch (Throwable th2) {
                        g9.a(th2);
                        list = null;
                    }
                    if (list != null) {
                        for (StartAppAd startAppAd : list) {
                            if (ad2 != null) {
                                startAppAd.setErrorMessage(ad2.getErrorMessage());
                            }
                            adEventListener.onFailedToReceiveAd(startAppAd);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f] */
    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onReceiveAd(Ad ad2) {
        List list;
        ?? r02 = this.f65425c.f65514o;
        boolean z10 = r02 != 0 && r02.getVideoCancelCallBack();
        this.f65425c.f65519t.d();
        o2 o2Var = this.f65425c.f65520u;
        o2Var.e();
        o2Var.f64988f = 0;
        o2Var.f64989g = false;
        this.f65425c.f65515p.set(false);
        if (this.f65423a || z10) {
            return;
        }
        this.f65423a = true;
        synchronized (this.f65425c.f65521v) {
            try {
                for (AdEventListener adEventListener : this.f65425c.f65521v.keySet()) {
                    if (adEventListener != null) {
                        try {
                            list = (List) this.f65425c.f65521v.get(adEventListener);
                        } catch (Throwable th2) {
                            g9.a(th2);
                            list = null;
                        }
                        if (list != null) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                ((StartAppAd) it.next()).setErrorMessage(ad2.getErrorMessage());
                                adEventListener.onReceiveAd(ad2);
                            }
                        }
                    }
                }
                this.f65425c.f65521v.clear();
            } finally {
            }
        }
    }
}
