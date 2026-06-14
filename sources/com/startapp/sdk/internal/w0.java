package com.startapp.sdk.internal;

import android.app.Activity;
import android.app.Application;
import android.hardware.SensorManager;
import android.os.SystemClock;
import com.startapp.sdk.adsbase.remoteconfig.AppSessionConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* JADX INFO: loaded from: classes11.dex */
public final class w0 extends l6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jh f65419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f65420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f65421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f65422d;

    public w0(jh jhVar) {
        this.f65419a = jhVar;
    }

    @Override // com.startapp.sdk.internal.l6, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (activity == null) {
            return;
        }
        int i10 = this.f65420b + 1;
        this.f65420b = i10;
        if (i10 != 1 || this.f65421c) {
            return;
        }
        if (!this.f65422d) {
            this.f65422d = true;
            if (this.f65419a.f64779g != null) {
                g9 g9Var = new g9(h9.f64614i);
                g9Var.f64559j = false;
                try {
                    com.startapp.sdk.components.a aVar = com.startapp.sdk.components.a.U.f65426a;
                    if (aVar != null) {
                        ((w9) aVar.f64190q.a()).a(g9Var);
                    }
                } catch (Throwable unused) {
                }
            }
        }
        jh jhVar = this.f65419a;
        Application application = jhVar.f64779g;
        if (application != null) {
            yh yhVar = (yh) com.startapp.sdk.components.a.a(application).f64180g.a();
            ((m8) yhVar.f65611b.a()).f64912a.post(new qh(yhVar));
            v0 v0Var = (v0) com.startapp.sdk.components.a.a(jhVar.f64779g).Q.a();
            v0Var.f65363a.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = v0Var.f65367e;
            v0Var.f65364b.getClass();
            AppSessionConfig appSessionConfigJ = MetaData.E().j();
            if (jElapsedRealtime > Math.max(0L, appSessionConfigJ != null ? appSessionConfigJ.a() : 600000L) + j10 || v0Var.f65366d <= 0) {
                v0Var.f65366d = jElapsedRealtime;
                v0Var.f65365c.clear();
            }
        }
        if (jhVar.f64779g != null) {
            g9 g9Var2 = new g9(h9.f64614i);
            g9Var2.f64559j = false;
            try {
                com.startapp.sdk.components.a aVar2 = com.startapp.sdk.components.a.U.f65426a;
                if (aVar2 != null) {
                    ((w9) aVar2.f64190q.a()).a(g9Var2);
                }
            } catch (Throwable unused2) {
            }
        }
    }

    @Override // com.startapp.sdk.internal.l6, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (activity == null) {
            return;
        }
        this.f65420b--;
        boolean zIsChangingConfigurations = activity.isChangingConfigurations();
        this.f65421c = zIsChangingConfigurations;
        if (this.f65420b != 0 || zIsChangingConfigurations) {
            return;
        }
        jh jhVar = this.f65419a;
        Application application = jhVar.f64779g;
        if (application != null) {
            yh yhVar = (yh) com.startapp.sdk.components.a.a(application).f64180g.a();
            ((m8) yhVar.f65611b.a()).f64912a.post(new rh(yhVar));
            v0 v0Var = (v0) com.startapp.sdk.components.a.a(jhVar.f64779g).Q.a();
            v0Var.f65363a.getClass();
            v0Var.f65367e = SystemClock.elapsedRealtime();
        }
        if (jhVar.f64779g != null) {
            g9 g9Var = new g9(h9.f64614i);
            g9Var.f64559j = false;
            try {
                com.startapp.sdk.components.a aVar = com.startapp.sdk.components.a.U.f65426a;
                if (aVar != null) {
                    ((w9) aVar.f64190q.a()).a(g9Var);
                }
            } catch (Throwable unused) {
            }
        }
        Application application2 = jhVar.f64779g;
        if (application2 != null) {
            try {
                ((pc) com.startapp.sdk.components.a.a(application2).f64196w.a()).b();
            } catch (Throwable th2) {
                g9.a(th2);
            }
            if (MetaData.E().U() == null || !MetaData.E().U().h()) {
                return;
            }
            lg lgVar = (lg) com.startapp.sdk.components.a.a(application2).f64197x.a();
            try {
                SensorManager sensorManager = lgVar.f64878f;
                if (sensorManager != null) {
                    sensorManager.unregisterListener(lgVar.f64886n);
                }
            } catch (Throwable th3) {
                if (lgVar.a(2)) {
                    g9.a(th3);
                }
            }
        }
    }
}
