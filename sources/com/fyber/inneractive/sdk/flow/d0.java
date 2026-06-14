package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class d0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h0 f20640a;

    public d0(h0 h0Var) {
        this.f20640a = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h0 h0Var = this.f20640a;
        h0Var.f20749m.set(true);
        Iterator it = h0Var.f20743g.iterator();
        while (it.hasNext()) {
            ((InneractiveUnitController) it.next()).destroy();
        }
        h0Var.f20743g.clear();
        h0Var.a((x) null);
        h0Var.f20738b = null;
        h0Var.a();
        InneractiveAdSpotManager.get().removeSpot(h0Var);
    }
}
