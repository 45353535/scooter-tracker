package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.c3;
import com.applovin.impl.n7;

/* JADX INFO: loaded from: classes6.dex */
public class a extends com.applovin.impl.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.c f9409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f9410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f9411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC0174a f9412d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c3 f9413e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f9414f;

    /* JADX INFO: renamed from: com.applovin.impl.mediation.a$a, reason: collision with other inner class name */
    public interface InterfaceC0174a {
        void b(c3 c3Var);
    }

    a(com.applovin.impl.sdk.k kVar) {
        this.f9410b = kVar.O();
        this.f9409a = kVar.e();
        this.f9411c = n7.a(com.applovin.impl.sdk.k.o(), "AdActivityObserver", kVar);
    }

    public void a(c3 c3Var, InterfaceC0174a interfaceC0174a) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f9410b.a("AdActivityObserver", "Starting for ad " + c3Var.getAdUnitId() + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        a();
        this.f9412d = interfaceC0174a;
        this.f9413e = c3Var;
        this.f9409a.a(this);
    }

    @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (activity.getClass().getName().equals(this.f9411c) && this.f9413e.y0()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f9410b.a("AdActivityObserver", "App relaunched via launcher without an ad hidden callback, manually invoking ad hidden");
            }
            if (this.f9412d != null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f9410b.a("AdActivityObserver", "Invoking callback...");
                }
                this.f9412d.b(this.f9413e);
            }
            a();
            return;
        }
        if (this.f9414f == null) {
            this.f9414f = activity.getClass().getName();
            if (com.applovin.impl.sdk.o.a()) {
                this.f9410b.a("AdActivityObserver", "Started tracking ad Activity: " + this.f9414f);
            }
        }
    }

    @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (activity.getClass().getName().equals(this.f9414f)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f9410b.a("AdActivityObserver", "Ad Activity destroyed: " + this.f9414f);
            }
            if (this.f9412d != null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f9410b.a("AdActivityObserver", "Invoking callback...");
                }
                this.f9412d.b(this.f9413e);
            }
            a();
        }
    }

    public void a() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f9410b.a("AdActivityObserver", "Cancelling...");
        }
        this.f9409a.b(this);
        this.f9412d = null;
        this.f9413e = null;
        this.f9414f = null;
    }
}
