package com.startapp.sdk.internal;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.AutoInterstitialPreferences;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.cache.CacheMetaData;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes11.dex */
public final class gh extends l6 {
    @Override // com.startapp.sdk.internal.l6, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean zStartsWith;
        jh jhVar = ih.f64695a;
        jhVar.getClass();
        boolean z10 = true;
        if (activity.getClass().getName().equals(vi.a(activity))) {
            jhVar.f64790r = true;
        }
        jhVar.f64788p = bundle;
        if ((jhVar.f64790r || activity.getClass().getName().equals(vi.a(activity))) && jhVar.f64788p == null && jhVar.f64780h.isEmpty() && ((h6) com.startapp.sdk.components.a.a(activity).f64183j.a()).a(false, null, null, null, null, null)) {
            jhVar.f64790r = false;
        }
        com.startapp.sdk.adsbase.e eVar = ma.f64919a;
        boolean zEquals = activity.getClass().getName().equals(vi.a(activity));
        if (bundle == null) {
            String[] strArrSplit = com.startapp.sdk.adsbase.e.class.getName().split("\\.");
            if (strArrSplit.length < 3) {
                zStartsWith = false;
            } else {
                zStartsWith = activity.getClass().getName().startsWith(strArrSplit[0] + "." + strArrSplit[1] + "." + strArrSplit[2]);
            }
            if (zStartsWith || zEquals) {
                return;
            }
            eVar.f64049d++;
            if (eVar.f64046a && AdsCommonMetaData.k().H()) {
                if (eVar.f64047b == null) {
                    eVar.f64047b = new AutoInterstitialPreferences();
                }
                boolean z11 = eVar.f64048c <= 0 || System.currentTimeMillis() >= eVar.f64048c + ((long) (eVar.f64047b.getSecondsBetweenAds() * 1000));
                int i10 = eVar.f64049d;
                if (i10 > 0 && i10 < eVar.f64047b.getActivitiesBetweenAds()) {
                    z10 = false;
                }
                if (z11 && z10) {
                    if (eVar.f64050e == null) {
                        eVar.f64050e = new StartAppAd(activity);
                    }
                    eVar.f64050e.loadAd(StartAppAd.AdMode.AUTOMATIC, new AdPreferences().setAi(Boolean.TRUE), new la());
                }
            }
        }
    }

    @Override // com.startapp.sdk.internal.l6, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        jh jhVar = ih.f64695a;
        jhVar.getClass();
        if (activity.getClass().getName().equals(vi.a(activity))) {
            jhVar.f64790r = false;
        }
        if (jhVar.f64780h.size() == 0) {
            jhVar.f64775c = false;
        }
    }

    @Override // com.startapp.sdk.internal.l6, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        jh jhVar = ih.f64695a;
        jhVar.getClass();
        jhVar.f64778f = System.currentTimeMillis();
        jhVar.f64783k = null;
    }

    @Override // com.startapp.sdk.internal.l6, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        jh jhVar = ih.f64695a;
        if (jhVar.f64774b && jhVar.f64776d) {
            jhVar.f64776d = false;
            p pVar = (p) com.startapp.sdk.components.a.a(activity).M.a();
            if (!pVar.f65060d) {
                synchronized (pVar.f65057a) {
                    try {
                        Iterator it = pVar.f65057a.values().iterator();
                        while (it.hasNext()) {
                            ((x2) it.next()).a();
                        }
                    } finally {
                    }
                }
            }
        }
        if (jhVar.f64784l) {
            jhVar.f64784l = false;
            com.startapp.sdk.adsbase.g.f(activity);
        }
        jhVar.f64783k = activity;
    }

    @Override // com.startapp.sdk.internal.l6, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        jh jhVar = ih.f64695a;
        if (jhVar.f64775c && System.currentTimeMillis() - jhVar.f64778f > MetaData.E().V()) {
            pg.f65112d.a(activity, MetaDataRequest$RequestReason.APP_IDLE);
        }
        jhVar.f64777e = false;
        jhVar.f64775c = false;
        Integer num = (Integer) jhVar.f64780h.get(Integer.valueOf(activity.hashCode()));
        if (num == null) {
            num = 0;
        }
        jhVar.f64780h.put(Integer.valueOf(activity.hashCode()), Integer.valueOf(num.intValue() + 1));
    }

    @Override // com.startapp.sdk.internal.l6, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        jh jhVar = ih.f64695a;
        Integer num = (Integer) jhVar.f64780h.get(Integer.valueOf(activity.hashCode()));
        if (num != null) {
            int iIntValue = num.intValue() - 1;
            Integer numValueOf = Integer.valueOf(iIntValue);
            if (iIntValue == 0) {
                jhVar.f64780h.remove(Integer.valueOf(activity.hashCode()));
            } else {
                jhVar.f64780h.put(Integer.valueOf(activity.hashCode()), numValueOf);
            }
            if (jhVar.f64780h.size() == 0) {
                if (!jhVar.f64777e) {
                    jhVar.f64775c = true;
                }
                if (jhVar.f64774b) {
                    p pVar = (p) com.startapp.sdk.components.a.a(activity).M.a();
                    try {
                        if (!pVar.f65059c && CacheMetaData.b().a().g() && MetaData.E().f0()) {
                            ((Executor) pVar.f65064h.a()).execute(new l(pVar));
                        }
                        for (x2 x2Var : pVar.f65057a.values()) {
                            r2 r2Var = x2Var.f65519t;
                            Handler handler = r2Var.f65131b;
                            if (handler != null) {
                                handler.removeCallbacksAndMessages(null);
                            }
                            r2Var.f65133d = false;
                            o2 o2Var = x2Var.f65520u;
                            Handler handler2 = o2Var.f65131b;
                            if (handler2 != null) {
                                handler2.removeCallbacksAndMessages(null);
                            }
                            o2Var.f65133d = false;
                        }
                    } catch (Throwable th2) {
                        g9.a(th2);
                    }
                    jhVar.f64776d = true;
                }
            }
        }
    }
}
