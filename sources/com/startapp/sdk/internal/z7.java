package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.ads.banner.BannerMetaData;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* JADX INFO: loaded from: classes11.dex */
public final class z7 extends t1 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f65677q;

    public z7(Context context, r1 r1Var, AdPreferences adPreferences, AdEventListener adEventListener, lb lbVar, lb lbVar2, lb lbVar3, lb lbVar4, lb lbVar5, int i10) {
        super(context, r1Var, adPreferences, adEventListener, AdPreferences.Placement.INAPP_BANNER, lbVar, lbVar2, lbVar3, lbVar4, lbVar5, false);
        this.f65677q = i10;
    }

    @Override // com.startapp.sdk.adsbase.c
    public final com.startapp.sdk.adsbase.model.a c() {
        r1 r1Var = (r1) this.f64015b;
        f1 f1Var = new f1();
        a((com.startapp.sdk.adsbase.model.a) f1Var);
        f1Var.L = r1Var.f64998c;
        f1Var.M = r1Var.f64999d;
        f1Var.E0 = this.f65677q;
        f1Var.f64097t0 = BannerMetaData.c().a().f();
        f1Var.V0 = r1Var.f65181s;
        f1Var.W0 = r1Var.f65182t;
        f1Var.f(this.f64014a);
        return f1Var;
    }

    @Override // com.startapp.sdk.adsbase.c
    /* JADX INFO: renamed from: c */
    public final void b(boolean z10) {
        super.b(z10);
        e(z10);
    }
}
