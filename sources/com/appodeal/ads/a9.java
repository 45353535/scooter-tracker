package com.appodeal.ads;

import android.app.Activity;
import android.view.View;
import com.appodeal.ads.utils.Log;
import com.google.common.net.HttpHeaders;

/* JADX INFO: loaded from: classes6.dex */
public final class a9 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f11883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ac f11884c;

    public a9(ac acVar, l0 l0Var) {
        this.f11884c = acVar;
        this.f11883b = l0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activityA;
        if (!db.f13250l || (activityA = com.appodeal.ads.context.o.f13205b.getResumedActivity()) == null) {
            activityA = com.appodeal.ads.context.m.f13201b.f13202a.a();
        }
        if (activityA == null) {
            Log.debug("ViewAdRenderer", HttpHeaders.REFRESH, "skip: no running activities fund");
            ac acVar = this.f11884c;
            if (this == acVar.f11902i) {
                acVar.f11902i = null;
                return;
            }
            return;
        }
        ja jaVarO = this.f11884c.o(activityA);
        tc tcVar = (tc) this.f11883b.A();
        View view = (View) this.f11884c.f11896c.get();
        if (tcVar == null || view == null || !view.isShown() || jaVarO.f13516b != f3.VISIBLE) {
            Log.debug("ViewAdRenderer", HttpHeaders.REFRESH, String.format("skip: %s / %s / %s", jaVarO.f13516b, tcVar, view));
            ac acVar2 = this.f11884c;
            if (this == acVar2.f11902i) {
                acVar2.f11902i = null;
                return;
            }
            return;
        }
        if (com.appodeal.ads.utils.c.c(com.appodeal.ads.context.o.f13205b.getResumedActivity())) {
            Log.debug("ViewAdRenderer", HttpHeaders.REFRESH, "postponed: ads activity is visible");
            ac.f11893m.postDelayed(this, 1000L);
            return;
        }
        if (!tcVar.i(this.f11883b.y().f14495b) || tcVar.f14913y || tcVar.F) {
            Log.debug("ViewAdRenderer", HttpHeaders.REFRESH, "skip: current ad request is loading or hasn't any loaded ad");
            ac acVar3 = this.f11884c;
            if (this == acVar3.f11902i) {
                acVar3.f11902i = null;
            }
            this.f11884c.s(activityA, this.f11883b, acVar3.p(this.f11883b, null).intValue());
            return;
        }
        Log.debug("ViewAdRenderer", HttpHeaders.REFRESH, "requesting render");
        ac acVar4 = this.f11884c;
        if (this == acVar4.f11902i) {
            acVar4.f11902i = null;
        }
        com.appodeal.ads.segments.o oVarY = this.f11883b.y();
        ac acVar5 = this.f11884c;
        t7 t7Var = acVar5.o(activityA).f13515a;
        if (t7Var == null && (t7Var = acVar5.f11900g) == null) {
            t7Var = acVar5.f11899f;
        }
        this.f11884c.z(activityA, new ic(oVarY, t7Var, false, tcVar.f14895g), this.f11883b);
    }
}
