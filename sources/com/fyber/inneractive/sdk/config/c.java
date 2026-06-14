package com.fyber.inneractive.sdk.config;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.t1;
import com.fyber.inneractive.sdk.util.v1;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f20325a;

    public c(e eVar) {
        this.f20325a = eVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (this.f20325a.f20346e.hasMessages(123) || this.f20325a.f20342a.get()) {
            return;
        }
        this.f20325a.f20346e.sendEmptyMessageDelayed(123, 3000L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        com.fyber.inneractive.sdk.cache.session.g gVar;
        this.f20325a.f20346e.removeMessages(123);
        e eVar = this.f20325a;
        if (eVar.f20342a.compareAndSet(true, false)) {
            if (eVar.f20343b) {
                IAlog.a("onActivityResumed: restartSession", new Object[0]);
                eVar.f20343b = false;
                x0 x0Var = eVar.f20345d;
                if (x0Var != null) {
                    com.fyber.inneractive.sdk.cache.session.e eVar2 = x0Var.f20510a;
                    if (eVar2 != null) {
                        com.fyber.inneractive.sdk.cache.session.i iVar = eVar2.f20237a;
                        for (com.fyber.inneractive.sdk.cache.session.enums.c cVar : com.fyber.inneractive.sdk.cache.session.enums.c.values()) {
                            if (cVar != com.fyber.inneractive.sdk.cache.session.enums.c.NONE && (gVar = (com.fyber.inneractive.sdk.cache.session.g) iVar.f20247a.get(cVar)) != null && gVar.f20243a != 0) {
                                eVar2.a(cVar, gVar);
                            }
                        }
                        com.fyber.inneractive.sdk.util.r.f23895a.execute(new com.fyber.inneractive.sdk.cache.session.d(eVar2, com.fyber.inneractive.sdk.cache.session.enums.a.NEW_SESSION, com.fyber.inneractive.sdk.cache.session.enums.c.NONE));
                    }
                    eVar.f20345d.f20512c.put("SESSION_STAMP", Long.toString(SystemClock.elapsedRealtime()));
                    eVar.f20345d.f20511b.clear();
                }
            }
            v1 v1Var = eVar.f20344c;
            if (v1Var != null) {
                v1Var.f23919d = false;
                v1Var.f23921f = 0L;
                t1 t1Var = v1Var.f23918c;
                if (t1Var != null) {
                    t1Var.removeMessages(1932593528);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
