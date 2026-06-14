package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.ads.banner.BannerMetaData;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* JADX INFO: loaded from: classes11.dex */
public final class x7 extends u1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f65529m;

    public x7(Context context, b1 b1Var, AdPreferences adPreferences, AdEventListener adEventListener, lb lbVar, lb lbVar2, lb lbVar3, lb lbVar4, int i10) {
        super(context, b1Var, adPreferences, adEventListener, AdPreferences.Placement.INAPP_BANNER, lbVar, lbVar2, lbVar3, lbVar4);
        this.f65529m = i10;
    }

    @Override // com.startapp.sdk.internal.u1
    public final void a(Ad ad2) {
    }

    @Override // com.startapp.sdk.adsbase.c
    public final com.startapp.sdk.adsbase.model.a c() {
        b1 b1Var = (b1) this.f64015b;
        f1 f1Var = new f1();
        a((com.startapp.sdk.adsbase.model.a) f1Var);
        f1Var.f64097t0 = BannerMetaData.c().a().a();
        f1Var.E0 = this.f65529m;
        f1Var.V0 = b1Var.f64306c;
        f1Var.f(this.f64014a);
        return f1Var;
    }
}
