package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdDetails;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class f8 extends u1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final lb f64488m;

    public f8(Context context, wd wdVar, AdPreferences adPreferences, AdEventListener adEventListener, lb lbVar, lb lbVar2, lb lbVar3, lb lbVar4, lb lbVar5) {
        super(context, wdVar, adPreferences, adEventListener, AdPreferences.Placement.INAPP_OFFER_WALL, lbVar, lbVar2, lbVar3, lbVar4);
        this.f64488m = lbVar5;
    }

    @Override // com.startapp.sdk.internal.u1
    public final void a(Ad ad2) {
        wd wdVar = (wd) ad2;
        List list = wdVar.f64561a;
        ub ubVarA = ((vb) this.f64488m.a()).a(wdVar.f65472b);
        ubVarA.getClass();
        ubVarA.f65343b = new ArrayList();
        ubVarA.f65344c = "";
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                rb rbVar = new rb((AdDetails) it.next());
                ubVarA.f65343b.add(rbVar);
                ubVarA.f65342a.a(rbVar.f65198a, ubVarA.f65343b.size() - 1, rbVar.f65206i);
            }
        }
    }

    @Override // com.startapp.sdk.adsbase.c
    public final com.startapp.sdk.adsbase.model.a c() {
        com.startapp.sdk.adsbase.model.a aVarC = super.c();
        if (aVarC == null) {
            return null;
        }
        aVarC.f64097t0 = AdsCommonMetaData.k().t();
        return aVarC;
    }
}
