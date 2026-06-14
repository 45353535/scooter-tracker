package com.applovin.impl;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class c3 extends y2 implements t1 {
    private final AtomicReference A;
    private final AtomicBoolean B;
    private final AtomicBoolean C;
    private final AtomicBoolean D;
    private boolean E;
    private String F;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Bundle f8489z;

    public c3(a3 a3Var, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
        super(a3Var, jSONObject, jSONObject2, null, kVar);
        this.f8489z = new Bundle();
        this.C = new AtomicBoolean();
        this.D = new AtomicBoolean();
        this.A = new AtomicReference();
        this.B = new AtomicBoolean();
    }

    private long k0() {
        long jA = a("ad_expiration_ms", -1L);
        return jA < 0 ? b("ad_expiration_ms", ((Long) this.f9164a.a(r3.R7)).longValue()) : jA;
    }

    @Override // com.applovin.impl.y2
    public y2 a(com.applovin.impl.mediation.h hVar) {
        return new c3(this, hVar);
    }

    @Override // com.applovin.impl.t1
    public long getTimeToLiveMillis() {
        return k0() - (SystemClock.elapsedRealtime() - I());
    }

    public void j(String str) {
        this.F = str;
    }

    public void j0() {
        this.B.set(true);
    }

    public long l0() {
        return a("ahdm", ((Long) this.f9164a.a(r3.L7)).longValue());
    }

    public long m0() {
        long jA = a("ad_hidden_on_ad_dismiss_callback_delay_ms", -1L);
        return jA >= 0 ? jA : b("ad_hidden_on_ad_dismiss_callback_delay_ms", ((Long) this.f9164a.a(r3.Z7)).longValue());
    }

    public long n0() {
        long jA = a("ad_hidden_timeout_ms", -1L);
        return jA >= 0 ? jA : b("ad_hidden_timeout_ms", ((Long) this.f9164a.a(r3.W7)).longValue());
    }

    public o4 o0() {
        return (o4) this.A.getAndSet(null);
    }

    public long p0() {
        if (I() > 0) {
            return SystemClock.elapsedRealtime() - I();
        }
        return -1L;
    }

    public Bundle q0() {
        return this.f8489z;
    }

    public long r0() {
        long jA = a("fullscreen_display_delay_ms", -1L);
        return jA >= 0 ? jA : ((Long) this.f9164a.a(r3.J7)).longValue();
    }

    public String s0() {
        return b("mcode", "");
    }

    @Override // com.applovin.impl.t1
    public void setExpired() {
        this.E = true;
    }

    public AtomicBoolean t0() {
        return this.C;
    }

    public String u0() {
        return this.F;
    }

    public AtomicBoolean v0() {
        return this.D;
    }

    public boolean w0() {
        return this.B.get();
    }

    public boolean x0() {
        if (a("schedule_ad_hidden_on_ad_dismiss", Boolean.FALSE).booleanValue()) {
            return true;
        }
        return b("schedule_ad_hidden_on_ad_dismiss", (Boolean) this.f9164a.a(r3.X7)).booleanValue();
    }

    public boolean y0() {
        if (a("schedule_ad_hidden_on_single_task_app_relaunch", Boolean.FALSE).booleanValue()) {
            return true;
        }
        return b("schedule_ad_hidden_on_single_task_app_relaunch", (Boolean) this.f9164a.a(r3.Y7)).booleanValue();
    }

    public boolean z0() {
        return a("susaode", (Boolean) this.f9164a.a(r3.K7)).booleanValue();
    }

    @Override // com.applovin.impl.y2
    public void a(Bundle bundle) {
        Bundle bundle2;
        super.a(bundle);
        if (bundle == null || (bundle2 = bundle.getBundle("applovin_ad_view_info")) == null) {
            return;
        }
        this.f8489z.putBundle("applovin_ad_view_info", bundle2);
    }

    public void a(o4 o4Var) {
        this.A.set(o4Var);
    }

    private c3(c3 c3Var, com.applovin.impl.mediation.h hVar) {
        super(c3Var.N(), c3Var.a(), c3Var.g(), hVar, c3Var.f9164a);
        this.f8489z = new Bundle();
        this.C = new AtomicBoolean();
        this.D = new AtomicBoolean();
        this.A = c3Var.A;
        this.B = c3Var.B;
    }
}
