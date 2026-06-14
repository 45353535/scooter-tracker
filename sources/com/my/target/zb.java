package com.my.target;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public final class zb extends n1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f61194f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f61195g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Context f61196h;

    public zb(w2 w2Var, ab abVar, long j10) {
        super(w2Var, abVar, j10);
        this.f61194f = false;
        this.f61195g = 0.0f;
    }

    public static zb a(w2 w2Var, ab abVar, long j10) {
        return new zb(w2Var, abVar, j10);
    }

    public final void b(float f10, long j10) {
        String strValueOf = String.valueOf((int) f10);
        String str = String.format(Locale.getDefault(), "%.1f", Float.valueOf(Math.min(j10, 60000L) / 1000.0f));
        HashMap map = new HashMap();
        map.put("viewability_percent", strValueOf);
        map.put("viewability_duration", str);
        gb.b("ViewabilityTracker: ViewabilityDurationStatTracker", "Sending ViewabilityDuration stat (max visible percent = " + strValueOf + ", duration = " + str + " sec)");
        bb.a(this.f59393a, map, 1, this.f61196h);
    }

    @Override // com.my.target.cb
    public void c() {
        if (this.f61194f) {
            a(this.f61195g, d());
        } else {
            this.f60172e = 0L;
        }
        this.f61196h = null;
    }

    public final long d() {
        return System.currentTimeMillis() - this.f60172e;
    }

    @Override // com.my.target.cb
    public void a(View view) {
        this.f61196h = view.getContext().getApplicationContext();
    }

    @Override // com.my.target.cb
    public void a(boolean z10, float f10, View view) {
        if (this.f61194f) {
            a(z10, f10);
        } else if (a(z10)) {
            this.f61194f = true;
            this.f61195g = f10;
            gb.b("ViewabilityTracker: ViewabilityDurationStatTracker", "Start tracking viewability");
        }
    }

    public final void a(boolean z10, float f10) {
        this.f61195g = Math.max(this.f61195g, f10);
        long jD = d();
        if (z10 && jD < 60000) {
            gb.b("ViewabilityTracker: ViewabilityDurationStatTracker", "No need to send ViewabilityDurationStat (isVisible = true, currentDurationMillis = " + jD + ")");
            return;
        }
        a(this.f61195g, jD);
    }

    public final void a(float f10, long j10) {
        b(f10, j10);
        gb.b("ViewabilityTracker: ViewabilityDurationStatTracker", "ViewabilityDuration tracked, kill self");
        b();
    }
}
