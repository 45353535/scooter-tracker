package com.appodeal.ads;

import android.app.Activity;
import android.content.Context;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class n extends l0 {
    public n(u uVar) {
        super(AdType.Native, uVar);
    }

    @Override // com.appodeal.ads.l0
    public final String D() {
        return "native_disabled";
    }

    @Override // com.appodeal.ads.l0
    public final boolean F() {
        return t1.e() > 0;
    }

    @Override // com.appodeal.ads.l0
    public final uc a(te teVar, AdNetwork adNetwork, x2 x2Var) {
        return new d3((r3) teVar, adNetwork, x2Var);
    }

    @Override // com.appodeal.ads.l0
    public final te b(xe xeVar) {
        return new r3((i0) xeVar);
    }

    @Override // com.appodeal.ads.l0
    public final void c() {
        ArrayList arrayList = this.f13568h;
        for (int i10 = 0; i10 < arrayList.size() - 5; i10++) {
            r3 r3Var = (r3) arrayList.get(i10);
            if (r3Var != null && !r3Var.E && r3Var != this.f13581u && r3Var != this.f13582v) {
                r3Var.m();
            }
        }
    }

    @Override // com.appodeal.ads.l0
    public final void d(Activity activity, int i10) {
        if (i10 > 5) {
            i10 = 5;
        }
        if (i10 < 2) {
            i10 = 2;
        }
        int i11 = y3.f15273a;
        if (i11 > 0 && i11 != t1.f14854d) {
            i10 = i11;
        }
        t1.f14854d = i10;
        if (t1.e() == 0) {
            t1.f14855e = false;
            t1.f14856f = false;
        }
        t1.f14855e = false;
        t1.c(activity, true);
    }

    @Override // com.appodeal.ads.l0
    public final void f(Context context) {
        g(context, new i0());
    }

    @Override // com.appodeal.ads.l0
    public final void n(JSONObject jSONObject) {
    }

    @Override // com.appodeal.ads.l0
    public final boolean p(te teVar) {
        return (((r3) teVar).f14890b.isEmpty() || F()) ? false : true;
    }

    @Override // com.appodeal.ads.l0
    public final /* bridge */ /* synthetic */ boolean q(te teVar, uc ucVar) {
        return true;
    }
}
