package com.fyber.inneractive.sdk.player.ui.remote;

import com.fyber.inneractive.sdk.player.controller.z;
import com.fyber.inneractive.sdk.player.ui.n;
import com.fyber.inneractive.sdk.util.g1;
import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f23393a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f23395c = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f23394b = new ConcurrentHashMap();

    public e(d dVar) {
        this.f23393a = dVar;
    }

    public final void a(String str, String str2, boolean z10) {
        if (!z10) {
            this.f23394b.put(str, str2);
            return;
        }
        d dVar = this.f23393a;
        if (dVar != null) {
            dVar.f23380b.a(str2);
        }
    }

    public final void a(int i10, g1 g1Var) {
        n nVar;
        d dVar = this.f23393a;
        if (dVar == null || (nVar = dVar.f23383e) == null) {
            return;
        }
        ((z) nVar).a(i10, g1Var);
    }
}
