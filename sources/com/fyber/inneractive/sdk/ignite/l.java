package com.fyber.inneractive.sdk.ignite;

import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public final class l extends l1.a {
    public l(Context context, k kVar, com.fyber.inneractive.sdk.ignite.events.wrappers.a aVar, boolean z10, boolean z11, boolean z12, h hVar) {
        l lVar;
        n1.f gVar;
        super(kVar, aVar);
        n1.e eVar = new n1.e(context);
        if (z10 && z11) {
            gVar = new n1.h(new n1.g(eVar, hVar), true, z12, hVar, this);
            lVar = this;
        } else if (z10) {
            lVar = this;
            gVar = new n1.h(eVar, false, z12, hVar, lVar);
        } else {
            lVar = this;
            gVar = z11 ? new n1.g(eVar, hVar) : new n1.i(eVar, hVar);
        }
        lVar.f93862a = gVar;
    }
}
