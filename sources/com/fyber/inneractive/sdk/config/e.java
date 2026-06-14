package com.fyber.inneractive.sdk.config;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import com.fyber.inneractive.sdk.util.t1;
import com.fyber.inneractive.sdk.util.v1;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import net.pubnative.lite.sdk.analytics.Reporting;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v1 f20344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x0 f20345d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f20347f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f20342a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f20343b = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f20346e = new Handler(Looper.getMainLooper(), new b(this));

    public e(x0 x0Var) {
        c cVar = new c(this);
        this.f20347f = new d(this);
        this.f20345d = x0Var;
        Application application = com.fyber.inneractive.sdk.util.o.f23888a;
        if (application != null) {
            application.registerActivityLifecycleCallbacks(cVar);
        }
    }

    public final void a() {
        s sVar = IAConfigManager.O.f20315u;
        if (!sVar.f20486d) {
            sVar.f20485c.add(this);
        }
        v1 v1Var = new v1(TimeUnit.MINUTES, r0.f20315u.f20484b.a(Reporting.Key.SESSION_DURATION, 30, 1));
        this.f20344c = v1Var;
        v1Var.f23920e = this.f20347f;
    }

    @Override // com.fyber.inneractive.sdk.config.r
    public final void onGlobalConfigChanged(s sVar, o oVar) {
        v1 v1Var = this.f20344c;
        if (v1Var != null) {
            v1Var.f23919d = false;
            v1Var.f23921f = 0L;
            t1 t1Var = v1Var.f23918c;
            if (t1Var != null) {
                t1Var.removeMessages(1932593528);
            }
            v1 v1Var2 = new v1(TimeUnit.MINUTES, oVar.a(Reporting.Key.SESSION_DURATION, 30, 1), this.f20344c.f23921f);
            this.f20344c = v1Var2;
            v1Var2.f23920e = this.f20347f;
        }
        sVar.f20485c.remove(this);
    }
}
