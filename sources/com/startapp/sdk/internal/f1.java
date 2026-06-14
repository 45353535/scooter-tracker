package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* JADX INFO: loaded from: classes11.dex */
public final class f1 extends com.startapp.sdk.adsbase.model.a {
    public boolean V0;
    public int W0;

    @Override // com.startapp.sdk.adsbase.model.a, com.startapp.sdk.internal.z1
    public final void a(ve veVar) {
        super.a(veVar);
        veVar.a("fixedSize", Boolean.valueOf(this.V0), false, true);
        veVar.a("bnrt", Integer.valueOf(this.W0), false, true);
    }

    @Override // com.startapp.sdk.adsbase.model.a
    public final void f(Context context) {
        sg sgVar = (sg) com.startapp.sdk.components.a.a(context).f64185l.a();
        AdPreferences.Placement placement = this.f64087j0;
        this.f64103z0 = placement == null ? null : (String) sgVar.f65269a.get(new rg(placement, this.W0));
    }
}
